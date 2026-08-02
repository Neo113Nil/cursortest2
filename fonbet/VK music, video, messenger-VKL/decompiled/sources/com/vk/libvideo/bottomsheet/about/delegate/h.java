package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c4;
import xsna.hfz;
import xsna.p1u0;
import xsna.u6;
import xsna.vfz;

/* compiled from: AboutVideoDisclaimerDelegate.kt */
/* loaded from: classes2.dex */
public final class h extends p1u0<AboutVideoItem.j> {
    public final c4 a;

    /* compiled from: AboutVideoDisclaimerDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.j> {
        public final c4 l;
        public final TextView m;
        public final ViewGroup n;

        public a(ViewGroup viewGroup, c4 c4Var) {
            super(bwt0.I(R.layout.video_about_discialmer, viewGroup, false));
            this.l = c4Var;
            this.m = (TextView) this.itemView.findViewById(R.id.disclaimer_title);
            this.n = (ViewGroup) this.itemView.findViewById(R.id.disclaimer_root);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.j jVar) {
            AboutVideoItem.j jVar2 = jVar;
            this.m.setText(this.itemView.getContext().getString(jVar2.b));
            bwt0.i0(this.n, new u6(0, this, jVar2));
        }
    }

    public h(c4 c4Var) {
        this.a = c4Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.j> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.j;
    }
}
