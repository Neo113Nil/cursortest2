package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import one.video.ad.ux.AdRedirectView;
import xsna.bpn0;
import xsna.cqm0;
import xsna.dhr0;
import xsna.egs0;
import xsna.hfz;
import xsna.iah0;
import xsna.jl80;
import xsna.p1u0;
import xsna.qf6;
import xsna.r4;
import xsna.sh0;
import xsna.vfz;
import xsna.xzr0;
import xsna.yg5;

/* compiled from: AboutVideoAdRedirectButtonDelegate.kt */
/* loaded from: classes2.dex */
public final class b extends p1u0<AboutVideoItem.b> {
    public final egs0 a;

    /* compiled from: AboutVideoAdRedirectButtonDelegate.kt */
    public final class a extends qf6 {
        public final com.vk.libvideo.autoplay.b l;
        public final AdRedirectView m;
        public final com.vk.libvideo.bottomsheet.about.delegate.a n;

        public a(ViewGroup viewGroup, egs0 egs0Var) {
            super(viewGroup, R.layout.ad_redirect_view, egs0Var);
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            this.l = b.C1208b.a();
            AdRedirectView adRedirectView = (AdRedirectView) this.itemView.findViewById(R.id.ad_redirect);
            adRedirectView.setImageLoader(new jl80());
            dhr0 dhr0Var = dhr0.a;
            Context context = adRedirectView.getContext();
            dhr0Var.getClass();
            adRedirectView.setTextColor(dhr0.f.a(R.attr.vk_ui_text_contrast, context));
            this.m = adRedirectView;
            this.n = new com.vk.libvideo.bottomsheet.about.delegate.a(this);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            VideoFile videoFile = ((AboutVideoItem.b) hfzVar).b;
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            com.vk.libvideo.autoplay.b bVar = this.l;
            yg5 e = bVar.e(videoFile, null);
            com.vk.libvideo.bottomsheet.about.delegate.a aVar = this.n;
            e.T(aVar);
            bVar.e(videoFile, null).f0(aVar);
        }

        public final void h6(sh0 sh0Var, r4 r4Var) {
            String str;
            String a = (sh0Var == null || (str = sh0Var.d) == null) ? null : cqm0.a(str);
            xzr0 xzr0Var = xzr0.a;
            AdRedirectView adRedirectView = this.m;
            if (a == null) {
                xzr0Var.b(adRedirectView);
                adRedirectView.setBtnClickListener(null);
            } else {
                xzr0Var.c(adRedirectView, iah0.a(48));
                adRedirectView.a(sh0Var, AdRedirectView.Type.DISCOVERY);
                adRedirectView.setBtnClickListener(r4Var);
            }
        }
    }

    public b() {
        this(null);
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.b> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.b;
    }

    public b(egs0 egs0Var) {
        this.a = egs0Var;
    }
}
