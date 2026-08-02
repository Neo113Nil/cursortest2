package com.huawei.hms.hwid;

import android.os.Looper;

/* compiled from: HuaweiIdValidator.java */
/* loaded from: classes13.dex */
public class r {
    public static void a() {
        a("Must not be called on the main application thread");
    }

    public static void a(String str) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new IllegalStateException(str);
        }
    }
}
