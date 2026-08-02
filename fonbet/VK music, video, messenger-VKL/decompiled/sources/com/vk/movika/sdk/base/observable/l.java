package com.vk.movika.sdk.base.observable;

import java.util.List;
import xsna.epx;

/* loaded from: classes3.dex */
public final class l extends com.vk.movika.sdk.common.b<com.vk.movika.sdk.base.listener.g> implements com.vk.movika.sdk.base.listener.g {
    public List<com.vk.movika.sdk.base.model.i> c;

    @Override // com.vk.movika.sdk.common.b
    public final void B(com.vk.movika.sdk.base.listener.g gVar) {
        com.vk.movika.sdk.base.listener.g gVar2 = gVar;
        List<com.vk.movika.sdk.base.model.i> list = this.c;
        if (list != null) {
            gVar2.f(list);
        }
    }

    @Override // com.vk.movika.sdk.common.b
    public final void C() {
        this.c = null;
    }

    @Override // com.vk.movika.sdk.base.listener.g
    public final void f(List<com.vk.movika.sdk.base.model.i> list) {
        if (epx.f(this.c, list)) {
            return;
        }
        this.c = list;
        A(new k(list, 0));
    }

    @Override // com.vk.movika.sdk.common.b
    public final void z() {
        this.c = null;
    }
}
