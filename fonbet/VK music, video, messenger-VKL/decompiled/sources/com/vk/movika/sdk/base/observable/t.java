package com.vk.movika.sdk.base.observable;

/* loaded from: classes3.dex */
public final class t extends com.vk.movika.sdk.common.b<com.vk.movika.sdk.base.listener.i> implements com.vk.movika.sdk.base.listener.i {
    public boolean c;

    @Override // com.vk.movika.sdk.common.b
    public final void B(com.vk.movika.sdk.base.listener.i iVar) {
        com.vk.movika.sdk.base.listener.i iVar2 = iVar;
        if (this.c) {
            iVar2.onStart();
        }
    }

    @Override // com.vk.movika.sdk.base.listener.i
    public final void onStart() {
        this.c = true;
        A(new s(0));
    }

    @Override // com.vk.movika.sdk.common.b
    public final void z() {
        this.c = false;
    }
}
