package com.mbridge.msdk.dycreator.utils;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes13.dex */
public class g {
    public static boolean a = false;

    public static void a(String str) {
        if (a) {
            new SecurityManager();
            Log.e(new Throwable().getStackTrace()[1].getFileName(), str);
        }
    }
}
