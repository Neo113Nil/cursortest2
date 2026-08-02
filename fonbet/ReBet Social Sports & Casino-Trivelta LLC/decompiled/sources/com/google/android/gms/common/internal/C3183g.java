package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3183g {

    /* renamed from: a, reason: collision with root package name */
    public final String f32713a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32714b;

    public C3183g(String str) {
        this(str, null);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f32713a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            f(str2);
        }
    }

    public void c(String str, String str2, Throwable th2) {
        if (a(6)) {
            Log.e(str, f(str2), th2);
        }
    }

    public void d(String str, String str2) {
        if (a(2)) {
            f(str2);
        }
    }

    public void e(String str, String str2) {
        if (a(5)) {
            Log.w(str, f(str2));
        }
    }

    public final String f(String str) {
        String str2 = this.f32714b;
        return str2 == null ? str : str2.concat(str);
    }

    public C3183g(String str, String str2) {
        AbstractC3191o.n(str, "log tag cannot be null");
        AbstractC3191o.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f32713a = str;
        this.f32714b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
