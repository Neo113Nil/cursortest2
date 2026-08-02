package com.vk.movika.sdk.base.observable;

import xsna.izs;
import xsna.s3q0;

/* loaded from: classes3.dex */
public final class d0 extends com.vk.movika.sdk.common.b<com.vk.movika.sdk.base.listener.o> implements com.vk.movika.sdk.base.listener.o {
    public Boolean c;

    @Override // com.vk.movika.sdk.common.b
    public final void B(com.vk.movika.sdk.base.listener.o oVar) {
        com.vk.movika.sdk.base.listener.o oVar2 = oVar;
        Boolean bool = this.c;
        if (bool != null) {
            oVar2.s(bool.booleanValue());
        }
    }

    @Override // com.vk.movika.sdk.base.listener.o
    public final void s(final boolean z) {
        if (Boolean.valueOf(z).equals(this.c)) {
            return;
        }
        this.c = Boolean.valueOf(z);
        A(new izs() { // from class: com.vk.movika.sdk.base.observable.c0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ((com.vk.movika.sdk.base.listener.o) obj).s(z);
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.movika.sdk.common.b
    public final void z() {
        this.c = null;
    }
}
