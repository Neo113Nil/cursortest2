package org.chromium.base;

import android.util.Log;
import internal.org.jni_zero.CalledByNative;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class JNIUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final a f78503a = new a();

    private static class a extends ClassLoader {
        a() {
            super(JNIUtils.class.getClassLoader());
        }

        @Override // java.lang.ClassLoader
        public final Class<?> findClass(String str) throws ClassNotFoundException {
            return super.findClass(str);
        }
    }

    @CalledByNative
    private static ClassLoader getSplitClassLoader(String str) {
        if (!str.isEmpty()) {
            boolean e11 = BundleUtils.e(str);
            String c11 = j.c("JNIUtils");
            Locale locale = Locale.US;
            Log.i(c11, "Init JNI Classloader for " + str + ". isInstalled=" + e11);
            if (e11) {
                return BundleUtils.b(str);
            }
        }
        return f78503a;
    }
}
