package com.playtika.pras.e;

/* loaded from: classes4.dex */
public final class d implements Runnable {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.onTimeout();
    }
}
