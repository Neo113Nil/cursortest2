package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes12.dex */
public final class c implements Runnable {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b = com.fyber.inneractive.sdk.util.o.h();
    }
}
