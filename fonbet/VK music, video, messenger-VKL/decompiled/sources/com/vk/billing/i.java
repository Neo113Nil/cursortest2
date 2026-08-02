package com.vk.billing;

import com.vk.billing.GoogleStorePurchasesManagerImpl;
import xsna.j27;
import xsna.mge0;
import xsna.o27;
import xsna.x0s;

/* compiled from: PurchasesManagerSessionImpl.kt */
/* loaded from: classes15.dex */
public final class i implements j27 {
    public final /* synthetic */ h<mge0> a;
    public final /* synthetic */ int b;

    public i(h hVar, int i) {
        this.a = hVar;
        this.b = i;
    }

    @Override // xsna.j27
    public final void a() {
        new GoogleStorePurchasesManagerImpl.PayNotAvailableException();
        h.q();
    }

    @Override // xsna.j27
    public final void b() {
        h<mge0> hVar = this.a;
        o27 o27Var = hVar.b;
        x0s x0sVar = new x0s(hVar, this.b, 2);
        try {
            if (!o27Var.e("subs", true)) {
                throw new GoogleStorePurchasesManagerImpl.PayNotAvailableException();
            }
            o27Var.getClass();
            o27.c("subs", x0sVar);
        } catch (Exception unused) {
            h.q();
        }
    }

    @Override // xsna.j27
    public final String getName() {
        return "purchaseSubs";
    }
}
