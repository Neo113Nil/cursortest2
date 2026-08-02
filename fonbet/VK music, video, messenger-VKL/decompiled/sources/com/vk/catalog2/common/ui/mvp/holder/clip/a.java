package com.vk.catalog2.common.ui.mvp.holder.clip;

import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import xsna.erh0;

/* compiled from: ClipSearchRootVh.kt */
/* loaded from: classes16.dex */
public final class a implements erh0 {
    public final /* synthetic */ ClipSearchRootVh.b b;
    public final /* synthetic */ ClipSearchRootVh c;

    public a(ClipSearchRootVh.b bVar, ClipSearchRootVh clipSearchRootVh) {
        this.b = bVar;
        this.c = clipSearchRootVh;
    }

    @Override // xsna.erh0
    public final void a() {
        ClipSearchRootVh.b bVar = this.b;
        bVar.d = true;
        this.c.b.onBackPressed();
        bVar.d = false;
    }
}
