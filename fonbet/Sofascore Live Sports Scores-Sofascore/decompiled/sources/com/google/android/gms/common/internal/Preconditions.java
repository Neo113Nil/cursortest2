package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.a70;
import defpackage.bf3;
import defpackage.ilg;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        a70.p(str);
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        ilg.c();
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            bf3.v(sb, "Must be called on ", name2, " thread, but got ", name);
            defpackage.zzl.m(sb, ".");
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        a70.r(str);
    }

    public static void f(String str) {
        if (TextUtils.isEmpty(str)) {
            a70.p("Given String is empty or null");
        }
    }

    public static void g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            a70.p(str2);
        }
    }

    public static void h(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        a70.r(str);
    }

    public static void i(Object obj) {
        if (obj != null) {
            return;
        }
        yhk.s("null reference");
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yhk.s(str);
    }

    public static void k(String str, boolean z) {
        if (z) {
            return;
        }
        a70.r(str);
    }

    public static void l(boolean z) {
        if (z) {
            return;
        }
        defpackage.zzl.s();
    }
}
