package com.fyber.inneractive.sdk.util;

import com.ironsource.L6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ s1 b;

    public q1(s1 s1Var, String str) {
        this.b = s1Var;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.getSharedPreferences("fyber.ua", 0).edit().putString(L6.d0, this.a).apply();
    }
}
