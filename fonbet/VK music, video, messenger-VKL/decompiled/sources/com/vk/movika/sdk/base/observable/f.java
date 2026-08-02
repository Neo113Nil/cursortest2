package com.vk.movika.sdk.base.observable;

import com.vk.movika.sdk.base.model.Chapter;

/* loaded from: classes3.dex */
public final class f extends com.vk.movika.sdk.common.b<com.vk.movika.sdk.base.listener.d> implements com.vk.movika.sdk.base.listener.d {
    public Chapter c;

    @Override // com.vk.movika.sdk.common.b
    public final void B(com.vk.movika.sdk.base.listener.d dVar) {
        com.vk.movika.sdk.base.listener.d dVar2 = dVar;
        Chapter chapter = this.c;
        if (chapter != null) {
            dVar2.j(chapter);
        }
    }

    @Override // com.vk.movika.sdk.base.listener.d
    public final void j(Chapter chapter) {
        this.c = chapter;
        A(new e(chapter, 0));
    }

    @Override // com.vk.movika.sdk.common.b
    public final void z() {
        this.c = null;
    }
}
