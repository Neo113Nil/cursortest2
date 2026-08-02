package org.chromium.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.util.ArrayMap;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import internal.org.jni_zero.CalledByNative;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class BundleUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayMap<String, ClassLoader> f78461a = new ArrayMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, ClassLoader> f78462b = Collections.synchronizedMap(new ArrayMap());

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f78463c;

    public static Context a(String str) {
        if (!isBundle()) {
            return e.b();
        }
        o d11 = o.d();
        try {
            Context createContextForSplit = e.b().createContextForSplit(str);
            d11.close();
            ClassLoader parent = createContextForSplit.getClassLoader().getParent();
            Context b11 = e.b();
            boolean z11 = true;
            boolean z12 = (parent.equals(BundleUtils.class.getClassLoader()) || b11 == null || parent.equals(b11.getClassLoader())) ? false : true;
            ArrayMap<String, ClassLoader> arrayMap = f78461a;
            synchronized (arrayMap) {
                if (z12) {
                    try {
                        if (!arrayMap.containsKey(str)) {
                            arrayMap.put(str, new PathClassLoader(d(str), b11.getClassLoader()));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ClassLoader classLoader = arrayMap.get(str);
                if (classLoader == null) {
                    arrayMap.put(str, createContextForSplit.getClassLoader());
                } else if (!classLoader.equals(createContextForSplit.getClassLoader())) {
                    Context context = createContextForSplit;
                    while (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Field declaredField = context.getClass().getDeclaredField("mClassLoader");
                    declaredField.setAccessible(true);
                    declaredField.set(context, classLoader);
                }
                z11 = z12;
            }
            vf.b.a("Android.IsolatedSplits.ClassLoaderReplaced." + str, z11);
            return createContextForSplit;
        } catch (Throwable th3) {
            try {
                d11.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static ClassLoader b(String str) {
        ClassLoader classLoader;
        ClassLoader classLoader2;
        if (!isBundle()) {
            return BundleUtils.class.getClassLoader();
        }
        ArrayMap<String, ClassLoader> arrayMap = f78461a;
        synchronized (arrayMap) {
            classLoader = arrayMap.get(str);
        }
        if (classLoader != null) {
            return classLoader;
        }
        a(str);
        synchronized (arrayMap) {
            classLoader2 = arrayMap.get(str);
        }
        return classLoader2;
    }

    private static String c(String str, String str2) {
        String d11 = d(str2);
        if (d11 == null) {
            return null;
        }
        ApplicationInfo applicationInfo = e.b().getApplicationInfo();
        return d11 + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + System.mapLibraryName(str);
    }

    private static String d(String str) {
        int binarySearch;
        ApplicationInfo applicationInfo = e.b().getApplicationInfo();
        String[] strArr = applicationInfo.splitNames;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str)) >= 0) {
            return applicationInfo.splitSourceDirs[binarySearch];
        }
        return null;
    }

    public static boolean e(String str) {
        return isBundle() && d(str) != null;
    }

    @CalledByNative
    public static String getNativeLibraryPath(String str, String str2) {
        o d11 = o.d();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                d11.close();
                return findLibrary;
            }
            ClassLoader classLoader = e.b().getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            } else if (classLoader instanceof s) {
                ((s) classLoader).getClass();
                findLibrary = null;
            }
            if (findLibrary != null) {
                d11.close();
                return findLibrary;
            }
            String c11 = c(str, str2);
            d11.close();
            return c11;
        } catch (Throwable th2) {
            try {
                d11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @CalledByNative
    public static boolean isBundle() {
        if (f78463c == null) {
            String[] strArr = e.b().getApplicationInfo().splitNames;
            f78463c = Boolean.valueOf(strArr != null && strArr.length > 0);
        }
        return f78463c.booleanValue();
    }
}
