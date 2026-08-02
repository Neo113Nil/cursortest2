package com.fyber.inneractive.sdk.network;

/* loaded from: classes12.dex */
public final class o1 extends l {
    public final okhttp3.u g;

    public o1(l lVar, okhttp3.u uVar) {
        this.g = uVar;
        this.d = lVar.d;
        this.c = lVar.c;
        this.e = lVar.e;
        this.a = lVar.a;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        super.a();
        okhttp3.u uVar = this.g;
        if (uVar != null) {
            uVar.close();
        }
    }
}
