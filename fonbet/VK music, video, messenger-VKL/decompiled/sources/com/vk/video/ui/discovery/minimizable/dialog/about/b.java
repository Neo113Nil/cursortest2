package com.vk.video.ui.discovery.minimizable.dialog.about;

import com.vk.dto.common.VideoFile;
import com.vk.video.ui.discovery.minimizable.dialog.about.a;
import com.vk.video.ui.discovery.minimizable.dialog.about.f;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.epx;
import xsna.ezs0;
import xsna.fxc0;
import xsna.gyo0;
import xsna.i0b0;
import xsna.je40;
import xsna.jsf0;
import xsna.s3q0;
import xsna.t8;
import xsna.vit0;
import xsna.wk50;
import xsna.xvr0;

/* compiled from: VideoAboutFeature.kt */
/* loaded from: classes7.dex */
public final class b extends wk50<g, f, a, c> {
    public final io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> f;
    public final t8 g;

    public b(vit0 vit0Var, ezs0 ezs0Var, jsf0 jsf0Var) {
        super(a.C1983a.b, new e(f.a.b));
        this.f = io.reactivex.rxjava3.subjects.d.O0(Optional.empty());
        this.g = new t8(vit0Var, ezs0Var, jsf0Var);
    }

    public static final void U(VideoFile videoFile, ListBuilder listBuilder, b bVar) {
        if (!epx.f(videoFile.getType(), "music_video") || fxc0.B().J().M0()) {
            listBuilder.add(bVar.g.d(videoFile));
        }
    }

    @Override // xsna.wk50
    public final void N(f fVar, a aVar) {
        a aVar2 = aVar;
        boolean z = aVar2 instanceof a.C1983a;
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> dVar = this.f;
        if (z) {
            this.e.b(dVar.s0(new je40(new gyo0(this, 3), 17)).subscribe(new xvr0(new i0b0(this, 25), 0)));
        } else if (aVar2.equals(a.b.b)) {
            this.g.c.onNext(s3q0.a);
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.onNext(Optional.ofNullable(((a.c) aVar2).b));
        }
    }
}
