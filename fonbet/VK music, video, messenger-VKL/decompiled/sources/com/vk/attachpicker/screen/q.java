package com.vk.attachpicker.screen;

import com.vk.attachpicker.screen.m;
import com.vk.mediastore.system.MediaStoreEntry;
import xsna.k0;
import xsna.pro0;

/* compiled from: ViewerScreen.java */
/* loaded from: classes15.dex */
public final class q implements m.k {
    public final /* synthetic */ MediaStoreEntry a;
    public final /* synthetic */ p b;

    public q(p pVar, MediaStoreEntry mediaStoreEntry) {
        this.b = pVar;
        this.a = mediaStoreEntry;
    }

    @Override // com.vk.attachpicker.screen.m.k
    public final void b() {
        pro0.c(new k0(12, this, this.a));
    }

    @Override // com.vk.attachpicker.screen.m.k
    public final void a(long j) {
    }
}
