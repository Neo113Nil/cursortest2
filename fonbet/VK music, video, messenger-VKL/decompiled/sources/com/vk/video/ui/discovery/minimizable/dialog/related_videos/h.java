package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import com.vk.video.ui.discovery.minimizable.dialog.related_videos.g;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.yaq0;

/* compiled from: VideoRelatedVideosReducer.kt */
/* loaded from: classes7.dex */
public final class h extends dm50<k, g, j> {
    @Override // xsna.dm50
    public final j c(j jVar, g gVar) {
        g gVar2 = gVar;
        if (gVar2 instanceof g.a) {
            return ((g.a) gVar2).b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final k d() {
        return new k(e(new yaq0(5)));
    }

    @Override // xsna.dm50
    public final void h(j jVar, k kVar) {
        f(kVar.a, jVar);
    }
}
