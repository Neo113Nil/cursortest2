package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import Sh.b;
import android.util.Log;

/* loaded from: classes9.dex */
public final class zbcq {
    public static final zbcq zba = new zbcq("VisionKit", 2);
    private final String zbb = "VisionKit";

    public zbcq(String str, int i11) {
    }

    private final boolean zbd(int i11) {
        return Log.isLoggable(this.zbb, i11);
    }

    private static final String zbe(Object obj, String str, Object... objArr) {
        String str2;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] split = name.split("\\.");
            int length = split.length;
            str2 = length == 0 ? "" : split[length - 1];
        }
        return b.c("[", str2, "] ", str);
    }

    public final void zba(Throwable th2, String str, Object... objArr) {
        if (zbd(6)) {
            Log.e(this.zbb, "Error in result from JNI layer", th2);
        }
    }

    public final void zbb(Object obj, String str, Object... objArr) {
        if (zbd(4)) {
            Log.i(this.zbb, zbe(obj, str, objArr));
        }
    }

    public final void zbc(Object obj, String str, Object... objArr) {
        if (zbd(5)) {
            Log.w(this.zbb, zbe(obj, str, objArr));
        }
    }
}
