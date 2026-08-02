package com.iab.omid.library.adsbynimbus.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public class g {
    private static g b = new g();
    private Context a;

    private g() {
    }

    public static g b() {
        return b;
    }

    public void a(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
    }

    public Context a() {
        return this.a;
    }
}
