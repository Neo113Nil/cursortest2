package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.egs0;
import xsna.f4m;
import xsna.hfz;
import xsna.iah0;
import xsna.m33;
import xsna.p1u0;
import xsna.qf6;
import xsna.v6;
import xsna.vfz;

/* compiled from: AboutVideoDividerDelegate.kt */
/* loaded from: classes2.dex */
public final class i extends p1u0<AboutVideoItem.k> {
    public final Integer a;
    public final boolean b;

    /* compiled from: AboutVideoDividerDelegate.kt */
    public final class a extends qf6 {
        public final Integer l;

        public a(i iVar, Integer num, ViewGroup viewGroup) {
            super(viewGroup, R.layout.video_about_divider, (egs0) null);
            Drawable a;
            this.l = num;
            if (num != null) {
                bwt0.g(this.itemView, new v6(this, 0));
            }
            View view = this.itemView;
            if (iVar.b) {
                f4m.q(iah0.a(2.5f), view);
                Context context = this.itemView.getContext();
                e3m.a aVar = e3m.a;
                a = new ColorDrawable(context.getColor(R.color.vk_gray_750));
            } else {
                f4m.q(iah0.a(3.5f), view);
                Context context2 = this.itemView.getContext();
                e3m.a aVar2 = e3m.a;
                a = m33.a(R.drawable.divider, context2);
            }
            view.setBackground(a);
            bwt0.c0(iah0.a(0.5f), this.itemView);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final /* bridge */ /* synthetic */ void i6(hfz hfzVar) {
        }
    }

    public i(boolean z, int i) {
        this.a = (i & 1) != 0 ? null : 0;
        this.b = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.k> b(ViewGroup viewGroup) {
        return new a(this, this.a, viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.k;
    }
}
