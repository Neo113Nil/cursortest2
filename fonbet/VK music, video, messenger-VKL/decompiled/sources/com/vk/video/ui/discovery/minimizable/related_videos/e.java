package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import io.reactivex.rxjava3.core.a0;
import io.reactivex.rxjava3.core.x;
import xsna.fv70;
import xsna.gda0;
import xsna.hg1;
import xsna.hus0;
import xsna.m5t0;
import xsna.q5t0;
import xsna.waf0;
import xsna.whe;
import xsna.xhb0;
import xsna.zco;

/* compiled from: VideoDiscoveryRelatedVideosSeasonsDelegate.kt */
/* loaded from: classes7.dex */
public final class e {
    public final m5t0 a;
    public final d b;
    public final boolean c;
    public final whe d;
    public final hus0 e;
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;

    public e(m5t0 m5t0Var, d dVar, boolean z, whe wheVar, hus0 hus0Var) {
        this.a = m5t0Var;
        this.b = dVar;
        this.c = z;
        this.d = wheVar;
        this.e = hus0Var;
    }

    public final void a(final VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist) {
        Integer num = playlist.g;
        VideoFile videoFile = playlist.b;
        if (num != null) {
            final int intValue = num.intValue();
            this.f = hg1.i(x.A(new io.reactivex.rxjava3.internal.operators.single.b(new a0() { // from class: xsna.ugs0
                @Override // io.reactivex.rxjava3.core.a0
                public final void subscribe(io.reactivex.rxjava3.core.y yVar) {
                    com.vk.video.ui.discovery.minimizable.related_videos.d dVar = com.vk.video.ui.discovery.minimizable.related_videos.e.this.b;
                    e9i0 e9i0Var = new e9i0(yVar, 21);
                    exi0 exi0Var = new exi0(yVar, 22);
                    io.reactivex.rxjava3.disposables.c cVar = dVar.b;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    dVar.b = io.reactivex.rxjava3.kotlin.c.e(dVar.c(playlist, intValue, 0, 50), new efr0(e9i0Var, 3), new qjl0(exi0Var, dVar));
                }
            }), q5t0.a(this.a, num.intValue(), playlist.i, playlist.j, false, videoFile.r(), f.a(playlist)), q5t0.a(this.a, num.intValue(), playlist.i, playlist.j, true, videoFile.r(), f.a(playlist)), new xhb0(new zco(2, playlist, this), 13)).h(new fv70(new waf0(this, 21), 27)), new gda0(this, 28));
        }
    }

    public final void b(h.a aVar, VideoFile videoFile) {
        o oVar = aVar.g;
        this.d.invoke(h.a.h(aVar, videoFile, p.d(oVar, videoFile), p.c(oVar, videoFile), null, null, null, null, null, null, false, false, false, 4088));
    }
}
