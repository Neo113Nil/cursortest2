package com.vk.movika.sdk.base.observable;

/* loaded from: classes3.dex */
public final class x extends com.vk.movika.sdk.common.b<com.vk.movika.sdk.base.listener.k> implements com.vk.movika.sdk.base.listener.k {
    public com.vk.movika.sdk.base.model.o c;

    @Override // com.vk.movika.sdk.common.b
    public final void B(com.vk.movika.sdk.base.listener.k kVar) {
        com.vk.movika.sdk.base.listener.k kVar2 = kVar;
        com.vk.movika.sdk.base.model.o oVar = this.c;
        if (oVar != null) {
            kVar2.u(oVar);
        }
    }

    @Override // com.vk.movika.sdk.base.listener.k
    public final void u(com.vk.movika.sdk.base.model.o oVar) {
        this.c = oVar;
        A(new w(oVar, 0));
    }

    @Override // com.vk.movika.sdk.common.b
    public final void z() {
        this.c = null;
    }
}
