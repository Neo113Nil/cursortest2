package com.vk.video.ui.discovery.minimizable.dialog.about;

import com.vk.video.ui.discovery.minimizable.dialog.about.c;
import com.vk.video.ui.discovery.minimizable.dialog.about.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.xep0;

/* compiled from: VideoAboutReducer.kt */
/* loaded from: classes7.dex */
public final class e extends dm50<g, c, f> {
    @Override // xsna.dm50
    public final f c(f fVar, c cVar) {
        c cVar2 = cVar;
        if (cVar2 instanceof c.a) {
            return new f.b(((c.a) cVar2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new xep0(3)));
    }

    @Override // xsna.dm50
    public final void h(f fVar, g gVar) {
        f fVar2 = fVar;
        g gVar2 = gVar;
        if (fVar2 instanceof f.b) {
            f(gVar2.a, fVar2);
        }
    }
}
