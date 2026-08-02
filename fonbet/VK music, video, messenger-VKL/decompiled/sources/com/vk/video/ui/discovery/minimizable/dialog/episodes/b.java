package com.vk.video.ui.discovery.minimizable.dialog.episodes;

import com.vk.dto.common.VideoFile;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.a;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.e;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.emh0;
import xsna.g2h0;
import xsna.jw80;
import xsna.oyr;
import xsna.wk50;

/* compiled from: VideoEpisodesFeature.kt */
/* loaded from: classes7.dex */
public final class b extends wk50<f, e, a, c> {
    public final io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> f;

    public b() {
        super(a.C1984a.b, new d(e.a.b));
        this.f = io.reactivex.rxjava3.subjects.d.O0(Optional.empty());
    }

    @Override // xsna.wk50
    public final void N(e eVar, a aVar) {
        a aVar2 = aVar;
        boolean equals = aVar2.equals(a.C1984a.b);
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> dVar = this.f;
        if (equals) {
            this.e.b(dVar.s0(new oyr(new g2h0(8), 29)).subscribe(new jw80(new emh0(this, 17), 22)));
        } else {
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.onNext(Optional.ofNullable(((a.b) aVar2).b));
        }
    }
}
