package com.applovin.impl;

/* loaded from: classes3.dex */
public class u6 extends k5 {
    private final Runnable g;

    public u6(com.applovin.impl.sdk.l lVar, String str, Runnable runnable) {
        this(lVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.g.run();
    }

    public u6(com.applovin.impl.sdk.l lVar, boolean z, String str, Runnable runnable) {
        super("TaskRunnable:" + str, lVar, z);
        this.g = runnable;
    }
}
