package com.playtika.pras.c;

import android.util.Log;

/* loaded from: classes7.dex */
public final class d {
    public static volatile d b;
    public volatile boolean a;

    public static d a() {
        if (b == null) {
            b = new d();
        }
        return b;
    }

    public static void b(String str) {
        if (a().a) {
            Log.e("PrasSDK", str);
        }
    }

    public static void a(String str) {
        if (a().a) {
            Log.d("PrasSDK", str);
        }
    }

    public static void a(String str, String str2) {
        if (a().a) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, Exception exc) {
        if (a().a) {
            Log.e("PrasSDK", str, exc);
        }
    }
}
