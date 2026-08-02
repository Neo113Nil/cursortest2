package org.chromium.base;

import dalvik.system.BaseDexClassLoader;

/* loaded from: classes10.dex */
public class WrappedClassLoader extends ClassLoader {
    private final ClassLoader mPrimaryClassLoader;
    private final ClassLoader mSecondaryClassLoader;

    public WrappedClassLoader(ClassLoader primary, ClassLoader secondary) {
        this.mPrimaryClassLoader = primary;
        this.mSecondaryClassLoader = secondary;
    }

    @Override // java.lang.ClassLoader
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            return this.mPrimaryClassLoader.loadClass(name);
        } catch (ClassNotFoundException e) {
            try {
                return this.mSecondaryClassLoader.loadClass(name);
            } catch (ClassNotFoundException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    @Override // java.lang.ClassLoader
    public String findLibrary(String name) {
        String str;
        ClassLoader classLoader = this.mPrimaryClassLoader;
        if (classLoader instanceof BaseDexClassLoader) {
            str = ((BaseDexClassLoader) classLoader).findLibrary(name);
            if (str != null) {
                return str;
            }
        } else {
            str = null;
        }
        ClassLoader classLoader2 = this.mSecondaryClassLoader;
        return classLoader2 instanceof BaseDexClassLoader ? ((BaseDexClassLoader) classLoader2).findLibrary(name) : str;
    }
}
