package org.chromium.base;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import internal.org.chromium.build.NullUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.base.metrics.RecordHistogram;

/* loaded from: classes10.dex */
public class BundleUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LOADED_SPLITS_KEY = "split_compat_loaded_splits";
    private static final String TAG = "BundleUtils";
    private static Boolean sHasSplits;
    private static SplitCompatClassLoader sSplitCompatClassLoaderInstance;
    private static ArrayList<String> sSplitsToRestore;
    private static final ArrayMap<String, ClassLoader> sCachedClassLoaders = new ArrayMap<>();
    private static final Map<String, ClassLoader> sInflationClassLoaders = Collections.synchronizedMap(new ArrayMap());

    public static void resetForTesting() {
        sCachedClassLoaders.clear();
        sInflationClassLoaders.clear();
        sSplitCompatClassLoaderInstance = null;
        sSplitsToRestore = null;
    }

    public static boolean hasAnyInstalledSplits() {
        String[] strArr;
        if (sHasSplits == null) {
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 26) {
                strArr = ContextUtils.getApplicationContext().getApplicationInfo().splitNames;
                if (strArr != null && strArr.length > 0) {
                    z = true;
                }
                sHasSplits = Boolean.valueOf(z);
            } else {
                sHasSplits = false;
            }
        }
        return sHasSplits.booleanValue();
    }

    public static String getInstalledSplitNamesForLogging() {
        String[] strArr;
        if (!hasAnyInstalledSplits()) {
            return "<none>";
        }
        strArr = ContextUtils.getApplicationContext().getApplicationInfo().splitNames;
        return TextUtils.join(",", strArr);
    }

    public static void setHasSplitsForTesting(boolean newVal) {
        final Boolean bool = sHasSplits;
        sHasSplits = Boolean.valueOf(newVal);
        ResettersForTesting.register(new Runnable() { // from class: org.chromium.base.BundleUtils$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BundleUtils.sHasSplits = bool;
            }
        });
    }

    private static String getSplitApkPath(String splitName) {
        String[] strArr;
        int binarySearch;
        ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
        strArr = applicationInfo.splitNames;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, splitName)) >= 0) {
            return applicationInfo.splitSourceDirs[binarySearch];
        }
        return null;
    }

    public static boolean isIsolatedSplitInstalled(String splitName) {
        return hasAnyInstalledSplits() && getSplitApkPath(splitName) != null;
    }

    public static Context createIsolatedSplitContext(String splitName) {
        Context createContextForSplit;
        if (!isIsolatedSplitInstalled(splitName)) {
            return ContextUtils.getApplicationContext();
        }
        try {
            StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
            try {
                createContextForSplit = ContextUtils.getApplicationContext().createContextForSplit(splitName);
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                cacheAndValidateSplitClassLoader(createContextForSplit, splitName);
                return createContextForSplit;
            } finally {
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    public static void cacheAndValidateSplitClassLoader(Context splitContext, String splitName) {
        ClassLoader parent = splitContext.getClassLoader().getParent();
        Context applicationContext = ContextUtils.getApplicationContext();
        boolean z = true;
        boolean z2 = (parent.equals(BundleUtils.class.getClassLoader()) || applicationContext == null || parent.equals(applicationContext.getClassLoader())) ? false : true;
        ArrayMap<String, ClassLoader> arrayMap = sCachedClassLoaders;
        synchronized (arrayMap) {
            if (z2) {
                if (!arrayMap.containsKey(splitName)) {
                    arrayMap.put(splitName, new PathClassLoader(getSplitApkPath(splitName), applicationContext.getClassLoader()));
                }
            }
            ClassLoader classLoader = arrayMap.get(splitName);
            if (classLoader != null) {
                if (!classLoader.equals(splitContext.getClassLoader())) {
                    replaceClassLoader(splitContext, classLoader);
                }
            } else {
                arrayMap.put(splitName, splitContext.getClassLoader());
            }
            z = z2;
        }
        RecordHistogram.recordBooleanHistogram("Android.IsolatedSplits.ClassLoaderReplaced." + splitName, z);
    }

    public static void replaceClassLoader(Context baseContext, ClassLoader classLoader) {
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        try {
            Field declaredField = baseContext.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(baseContext, classLoader);
        } catch (ReflectiveOperationException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    public static String getNativeLibraryPath(String libraryName, String splitName) {
        StrictModeContext allowDiskReads = StrictModeContext.allowDiskReads();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(libraryName);
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            ClassLoader classLoader = ContextUtils.getApplicationContext().getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(libraryName);
            } else if (classLoader instanceof WrappedClassLoader) {
                findLibrary = ((WrappedClassLoader) classLoader).findLibrary(libraryName);
            }
            if (findLibrary != null) {
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return findLibrary;
            }
            String splitApkLibraryPath = getSplitApkLibraryPath(libraryName, splitName);
            if (allowDiskReads != null) {
                allowDiskReads.close();
            }
            return splitApkLibraryPath;
        } catch (Throwable th) {
            if (allowDiskReads != null) {
                try {
                    allowDiskReads.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void checkContextClassLoader(Context baseContext, Activity activity) {
        Bundle extras;
        ClassLoader classLoader = activity.getClass().getClassLoader();
        if (classLoader != baseContext.getClassLoader()) {
            Log.w(TAG, "Mismatched ClassLoaders between Activity and context (fixing): %s", activity.getClass());
            replaceClassLoader(baseContext, classLoader);
            Intent intent = activity.getIntent();
            if (intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            extras.setClassLoader(classLoader);
        }
    }

    public static Object newInstance(String className, String splitName) {
        try {
            return getOrCreateSplitClassLoader(splitName).loadClass(className).newInstance();
        } catch (ReflectiveOperationException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }

    public static Context createContextForInflation(Context context, String splitName) {
        if (!isIsolatedSplitInstalled(splitName)) {
            return context;
        }
        final ClassLoader registerSplitClassLoaderForInflation = registerSplitClassLoaderForInflation(splitName);
        return new ContextWrapper(context) { // from class: org.chromium.base.BundleUtils.1
            @Override // android.content.ContextWrapper, android.content.Context
            public ClassLoader getClassLoader() {
                return registerSplitClassLoaderForInflation;
            }

            @Override // android.content.ContextWrapper, android.content.Context
            public Object getSystemService(String name) {
                Object systemService = super.getSystemService(name);
                return "layout_inflater".equals(name) ? ((LayoutInflater) systemService).cloneInContext(this) : systemService;
            }
        };
    }

    public static ClassLoader getOrCreateSplitClassLoader(String splitName) {
        ClassLoader classLoader;
        ClassLoader classLoader2;
        if (!isIsolatedSplitInstalled(splitName)) {
            return BundleUtils.class.getClassLoader();
        }
        ArrayMap<String, ClassLoader> arrayMap = sCachedClassLoaders;
        synchronized (arrayMap) {
            classLoader = arrayMap.get(splitName);
        }
        if (classLoader != null) {
            return classLoader;
        }
        createIsolatedSplitContext(splitName);
        synchronized (arrayMap) {
            classLoader2 = arrayMap.get(splitName);
        }
        return classLoader2;
    }

    public static ClassLoader registerSplitClassLoaderForInflation(String splitName) {
        ClassLoader orCreateSplitClassLoader = getOrCreateSplitClassLoader(splitName);
        sInflationClassLoaders.put(splitName, orCreateSplitClassLoader);
        return orCreateSplitClassLoader;
    }

    public static boolean canLoadClass(ClassLoader classLoader, String className) {
        try {
            Class.forName(className, false, classLoader);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static ClassLoader getSplitCompatClassLoader() {
        if (sSplitCompatClassLoaderInstance == null) {
            sSplitCompatClassLoaderInstance = new SplitCompatClassLoader();
        }
        return sSplitCompatClassLoaderInstance;
    }

    public static void saveLoadedSplits(Bundle outState) {
        outState.putStringArrayList(LOADED_SPLITS_KEY, new ArrayList<>(sInflationClassLoaders.keySet()));
    }

    public static void restoreLoadedSplits(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList(LOADED_SPLITS_KEY);
        sSplitsToRestore = stringArrayList;
        if (stringArrayList == null || !stringArrayList.contains("google3")) {
            return;
        }
        sSplitsToRestore.add("on_demand");
        sSplitsToRestore.remove("google3");
    }

    private static class SplitCompatClassLoader extends ClassLoader {
        private static final String TAG = "SplitCompatClassLoader";

        public SplitCompatClassLoader() {
            super(ContextUtils.getApplicationContext().getClassLoader());
            Log.i(TAG, "Splits: %s", BundleUtils.sSplitsToRestore);
        }

        private Class<?> checkSplitsClassLoaders(String className) throws ClassNotFoundException {
            Iterator it = BundleUtils.sInflationClassLoaders.values().iterator();
            while (it.hasNext()) {
                try {
                    return ((ClassLoader) it.next()).loadClass(className);
                } catch (ClassNotFoundException unused) {
                }
            }
            return null;
        }

        @Override // java.lang.ClassLoader
        public Class<?> findClass(String cn2) throws ClassNotFoundException {
            Class<?> checkSplitsClassLoaders = checkSplitsClassLoaders(cn2);
            if (checkSplitsClassLoaders != null) {
                return checkSplitsClassLoaders;
            }
            if (!cn2.startsWith("android.")) {
                if (BundleUtils.sSplitsToRestore != null) {
                    restoreSplitsClassLoaders();
                    Class<?> checkSplitsClassLoaders2 = checkSplitsClassLoaders(cn2);
                    if (checkSplitsClassLoaders2 != null) {
                        return checkSplitsClassLoaders2;
                    }
                }
                Log.w(TAG, "No class %s amongst %s", cn2, TextUtils.join("\n", BundleUtils.sInflationClassLoaders.keySet()));
            }
            throw new ClassNotFoundException(cn2);
        }

        private void restoreSplitsClassLoaders() {
            Iterator it = ((ArrayList) NullUtil.assumeNonNull(BundleUtils.sSplitsToRestore)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!BundleUtils.sInflationClassLoaders.containsKey(str)) {
                    BundleUtils.registerSplitClassLoaderForInflation(str);
                }
            }
            BundleUtils.sSplitsToRestore = null;
        }
    }

    private static String getSplitApkLibraryPath(String libraryName, String splitName) {
        String splitApkPath;
        if (Build.VERSION.SDK_INT < 26 || (splitApkPath = getSplitApkPath(splitName)) == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = ContextUtils.getApplicationContext().getApplicationInfo();
            return splitApkPath + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + System.mapLibraryName(libraryName);
        } catch (ReflectiveOperationException e) {
            throw JavaUtils.throwUnchecked(e);
        }
    }
}
