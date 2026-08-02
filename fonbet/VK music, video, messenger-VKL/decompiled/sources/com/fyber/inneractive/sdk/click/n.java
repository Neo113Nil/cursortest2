package com.fyber.inneractive.sdk.click;

/* loaded from: classes12.dex */
public final class n implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ r b;

    public n(r rVar, b bVar) {
        this.b = rVar;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.b.e;
        if (oVar != null) {
            oVar.a(this.a);
        }
    }
}
