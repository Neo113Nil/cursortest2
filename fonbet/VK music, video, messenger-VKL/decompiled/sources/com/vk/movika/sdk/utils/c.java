package com.vk.movika.sdk.utils;

import android.util.Log;
import xsna.erm0;
import xsna.gzs;

/* loaded from: classes3.dex */
public final class c {
    public static final String a(Object obj, String str) {
        boolean z = f.a;
        if (str == null) {
            str = obj.getClass().getSimpleName();
        }
        String concat = "MovikaSDK_".concat(str);
        return concat.length() > 20 ? erm0.D0(20, concat) : concat;
    }

    public static final void b(Object obj, String str, gzs<String> gzsVar) {
        if (f.b.b - 1 <= 0) {
            a(obj, str);
            gzsVar.invoke();
        }
    }

    public static void c(Object obj, String str, Throwable th, gzs gzsVar, int i) {
        String str2;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        if (f.b.b - 3 <= 0) {
            if (gzsVar == null || (str2 = (String) gzsVar.invoke()) == null) {
                str2 = "";
            }
            String a = a(obj, str);
            if (th == null) {
                Log.e(a, str2);
            } else {
                Log.e(a, str2, th);
            }
        }
    }

    public static final void d(Object obj, String str, gzs<String> gzsVar) {
        if (f.b.b - 2 <= 0) {
            a(obj, str);
            gzsVar.invoke();
        }
    }
}
