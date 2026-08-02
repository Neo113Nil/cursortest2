package com.vk.movika.sdk.base.observable;

/* loaded from: classes3.dex */
public final class f0 extends com.vk.movika.sdk.common.b<com.vk.movika.sdk.base.listener.m> implements com.vk.movika.sdk.base.listener.m {
    public boolean c;

    @Override // com.vk.movika.sdk.common.b
    public final void B(com.vk.movika.sdk.base.listener.m mVar) {
        com.vk.movika.sdk.base.listener.m mVar2 = mVar;
        if (this.c) {
            mVar2.a();
        }
    }

    @Override // com.vk.movika.sdk.base.listener.m
    public final void a() {
        this.c = true;
        A(new e0(0));
    }
}
