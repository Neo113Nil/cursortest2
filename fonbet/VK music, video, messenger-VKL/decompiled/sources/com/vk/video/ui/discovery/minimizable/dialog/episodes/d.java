package com.vk.video.ui.discovery.minimizable.dialog.episodes;

import com.vk.video.ui.discovery.minimizable.dialog.episodes.c;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.e;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.l5r0;

/* compiled from: VideoEpisodesReducer.kt */
/* loaded from: classes7.dex */
public final class d extends dm50<f, c, e> {
    @Override // xsna.dm50
    public final e c(e eVar, c cVar) {
        c cVar2 = cVar;
        if (cVar2 instanceof c.a) {
            return new e.b(((c.a) cVar2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final f d() {
        return new f(e(new l5r0(4)));
    }

    @Override // xsna.dm50
    public final void h(e eVar, f fVar) {
        e eVar2 = eVar;
        f fVar2 = fVar;
        if (eVar2 instanceof e.b) {
            f(fVar2.a, eVar2);
        }
    }
}
