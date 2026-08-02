package com.applovin.impl;

import com.applovin.impl.f6;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class l6 extends k5 {
    private final WeakReference g;
    private final Object h;

    protected l6(u4 u4Var, Object obj, String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
        this.g = new WeakReference(u4Var);
        this.h = obj;
    }

    public static void a(long j, u4 u4Var, Object obj, String str, com.applovin.impl.sdk.l lVar) {
        if (j <= 0) {
            return;
        }
        lVar.s0().a(new l6(u4Var, obj, str, lVar), f6.b.TIMEOUT, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        u4 u4Var = (u4) this.g.get();
        if (u4Var == null || u4Var.d()) {
            return;
        }
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().d(this.b, "Attempting to timeout pending task " + u4Var.c() + " with " + this.h);
        }
        u4Var.c(this.h);
    }
}
