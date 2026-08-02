package com.fyber.inneractive.sdk.util;

import com.ironsource.O6;
import com.vk.core.preference.Preference;

/* loaded from: classes12.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ s1 b;

    public q1(s1 s1Var, String str) {
        this.b = s1Var;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Preference.h(this.b.c, 0, "fyber.ua").edit().putString(O6.d0, this.a).apply();
    }
}
