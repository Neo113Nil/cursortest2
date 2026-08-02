package com.iab.omid.library.vungle.internal;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
