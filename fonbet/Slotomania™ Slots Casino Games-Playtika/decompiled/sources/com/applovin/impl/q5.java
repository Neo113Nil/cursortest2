package com.applovin.impl;

import com.applovin.impl.v;

/* loaded from: classes3.dex */
public class q5 extends k5 {
    private final a g;

    public interface a {
        void a(v.a aVar);
    }

    public q5(com.applovin.impl.sdk.l lVar, a aVar) {
        super("TaskCollectAdvertisingId", lVar, true);
        this.g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.g.a(this.a.B().f());
    }
}
