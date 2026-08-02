package org.chromium.base;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class JNIUtils {
    private static final String TAG = "JNIUtils";
    private static final JniClassLoader sJniClassLoader = new JniClassLoader();

    private static ClassLoader getSplitClassLoader(String splitName) {
        if (!splitName.isEmpty()) {
            boolean isIsolatedSplitInstalled = BundleUtils.isIsolatedSplitInstalled(splitName);
            Log.i(TAG, "Init JNI Classloader for %s. isInstalled=%b", splitName, Boolean.valueOf(isIsolatedSplitInstalled));
            if (isIsolatedSplitInstalled) {
                return BundleUtils.getOrCreateSplitClassLoader(splitName);
            }
        }
        return sJniClassLoader;
    }

    public static void setDefaultClassLoader(ClassLoader classLoader) {
        sJniClassLoader.mDelegate = classLoader;
    }

    private static class JniClassLoader extends ClassLoader {
        ClassLoader mDelegate;

        JniClassLoader() {
            super(JNIUtils.class.getClassLoader());
        }

        @Override // java.lang.ClassLoader
        public Class<?> findClass(String cn2) throws ClassNotFoundException {
            ClassLoader classLoader = this.mDelegate;
            if (classLoader != null) {
                return classLoader.loadClass(cn2);
            }
            return super.findClass(cn2);
        }
    }
}
