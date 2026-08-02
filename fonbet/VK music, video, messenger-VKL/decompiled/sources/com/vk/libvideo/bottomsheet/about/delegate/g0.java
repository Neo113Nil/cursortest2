package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import xsna.btp;
import xsna.c4;
import xsna.fyo0;
import xsna.hfz;
import xsna.jai;
import xsna.mut0;
import xsna.p1u0;
import xsna.qq2;
import xsna.qw6;
import xsna.vfz;
import xsna.wh50;
import xsna.yqd0;
import xsna.zak0;

/* compiled from: VideoEpisodesDelegate.kt */
/* loaded from: classes2.dex */
public final class g0 extends p1u0<AboutVideoItem.n> {
    public final c4 a;
    public final boolean b;

    /* compiled from: VideoEpisodesDelegate.kt */
    public final class a extends vfz<AboutVideoItem.n> {
        public final boolean l;
        public final wh50 m;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r4);
            ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
            composeView.setViewCompositionStrategy(mut0.c.a);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.l = !qq2.d(this.itemView.getContext());
            ComposeView composeView2 = (ComposeView) this.itemView;
            this.m = androidx.compose.runtime.k.b(null);
            composeView2.setContent(new jai(1962033255, new qw6(this, 16), true));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.n nVar) {
            ((zak0) this.m).setValue(new btp(nVar.b, new fyo0(5), new yqd0(g0.this, 19), this.l, !r7.b));
        }
    }

    public g0(c4 c4Var, boolean z) {
        this.a = c4Var;
        this.b = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.n> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.n) && this.b;
    }
}
