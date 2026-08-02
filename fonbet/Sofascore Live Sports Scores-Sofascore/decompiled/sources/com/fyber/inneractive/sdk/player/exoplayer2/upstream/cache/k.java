package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.b = lVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            try {
                l.a(this.b);
            } catch (a e) {
                this.b.f = e;
            }
            this.b.b.getClass();
        }
    }
}
