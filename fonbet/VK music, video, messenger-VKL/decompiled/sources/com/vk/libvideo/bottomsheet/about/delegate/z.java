package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.libvideo.models.offline.VideoScreenMode;
import xsna.c4;
import xsna.cqs0;
import xsna.egs0;
import xsna.gzs;
import xsna.hfz;
import xsna.lzn;
import xsna.p1u0;
import xsna.rcg0;
import xsna.vfz;

/* compiled from: AboutVideoSimilarBigVideoRedesignDelegate.kt */
/* loaded from: classes2.dex */
public final class z extends p1u0<AboutVideoItem.SimilarVideoRedesign> {
    public final c4 a;
    public final VideoScreenMode b;
    public final boolean c;
    public final gzs<rcg0> d;
    public final lzn e;
    public final egs0 f;
    public final cqs0 g = new cqs0(null, 3);

    public z(c4 c4Var, VideoScreenMode videoScreenMode, boolean z, gzs gzsVar, lzn lznVar, egs0 egs0Var) {
        this.a = c4Var;
        this.b = videoScreenMode;
        this.c = z;
        this.d = gzsVar;
        this.e = lznVar;
        this.f = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.SimilarVideoRedesign> b(ViewGroup viewGroup) {
        return new x.b(viewGroup, new x.a(true, this.c), this.a, false, this.g, this.b, this.e, this.d, this.f);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.SimilarVideoRedesign) && ((AboutVideoItem.SimilarVideoRedesign) hfzVar).h != AboutVideoItem.SimilarVideoRedesign.Style.NORMAL;
    }
}
