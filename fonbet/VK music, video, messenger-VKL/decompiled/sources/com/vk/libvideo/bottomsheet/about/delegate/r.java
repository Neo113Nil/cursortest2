package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import xsna.c4;
import xsna.egs0;
import xsna.f9;
import xsna.g9;
import xsna.hfz;
import xsna.p1u0;
import xsna.qf6;
import xsna.s5e0;
import xsna.t5e0;
import xsna.vfz;

/* compiled from: AboutVideoPromoBannerDelegate.kt */
/* loaded from: classes2.dex */
public final class r extends p1u0<AboutVideoItem.r> {
    public final c4 a;
    public final t5e0 b;

    public r(c4 c4Var, t5e0 t5e0Var) {
        this.a = c4Var;
        this.b = t5e0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.r> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.r;
    }

    /* compiled from: AboutVideoPromoBannerDelegate.kt */
    public static final class a extends qf6 {
        public final c4 l;
        public final t5e0 m;

        public a(ViewGroup viewGroup, c4 c4Var, t5e0 t5e0Var) {
            super(viewGroup, R.layout.video_banner_we_are_on_vk_video, (egs0) null);
            this.l = c4Var;
            this.m = t5e0Var;
            View findViewById = this.itemView.findViewById(R.id.hide_btn);
            ((ImageView) this.itemView.findViewById(R.id.icon)).setImageResource(R.drawable.vk_icon_logo_vk_video_color_56);
            findViewById.setOnClickListener(new f9(this, 0));
        }

        @Override // xsna.vfz
        public final void W5(hfz hfzVar) {
            this.itemView.postDelayed(new g9(this), 400L);
            if (this.m != null) {
                Integer num = 0;
                new s5e0.b(num.toString());
            }
        }

        @Override // xsna.vfz
        public final void a6() {
        }
    }
}
