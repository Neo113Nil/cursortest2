package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.SimpleLikeView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c4;
import xsna.egs0;
import xsna.hfz;
import xsna.iah0;
import xsna.p1u0;
import xsna.qf6;
import xsna.u5;
import xsna.uqm0;
import xsna.v5;
import xsna.vfz;
import xsna.w5;

/* compiled from: AboutVideoControlsDelegate.kt */
/* loaded from: classes2.dex */
public final class d extends p1u0<AboutVideoItem.c0> {
    public final c4 a;
    public final egs0 b;

    /* compiled from: AboutVideoControlsDelegate.kt */
    public static final class a extends qf6 {
        public final c4 l;
        public final SimpleLikeView m;
        public final TextView n;
        public final TextView o;

        public a(ViewGroup viewGroup, c4 c4Var, egs0 egs0Var) {
            super(viewGroup, R.layout.video_about_controls, egs0Var);
            this.l = c4Var;
            SimpleLikeView simpleLikeView = (SimpleLikeView) this.itemView.findViewById(R.id.like_view);
            this.m = simpleLikeView;
            TextView textView = (TextView) this.itemView.findViewById(R.id.comments_tv);
            this.n = textView;
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.reposts_tv);
            this.o = textView2;
            simpleLikeView.setOnLikeClickListener(new u5(this, 0));
            bwt0.i0(textView, new v5(this, 0));
            bwt0.i0(textView2, new w5(this, 0));
        }

        public static void h6(TextView textView, Integer num) {
            bwt0.p0(textView, num != null);
            String f = (num == null || num.intValue() <= 0) ? null : uqm0.f(num.intValue());
            textView.setText(f);
            textView.setCompoundDrawablePadding(f != null ? iah0.a(4) : 0);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            int i;
            int i2;
            AboutVideoItem.c0 c0Var = (AboutVideoItem.c0) hfzVar;
            AboutVideoItem.c0.a aVar = c0Var.b;
            boolean z = aVar.a instanceof AboutVideoItem.c0.b.C1213b;
            SimpleLikeView simpleLikeView = this.m;
            if (z) {
                bwt0.p0(simpleLikeView, true);
                simpleLikeView.setState(new SimpleLikeView.b(((AboutVideoItem.c0.b.C1213b) aVar.a).a, aVar.b));
            } else {
                bwt0.p0(simpleLikeView, false);
            }
            AboutVideoItem.c0.b bVar = c0Var.c;
            Integer num = null;
            AboutVideoItem.c0.b.C1213b c1213b = bVar instanceof AboutVideoItem.c0.b.C1213b ? (AboutVideoItem.c0.b.C1213b) bVar : null;
            Integer valueOf = (c1213b != null && (i2 = c1213b.a) >= 0) ? Integer.valueOf(i2) : null;
            TextView textView = this.n;
            h6(textView, valueOf);
            textView.setContentDescription(valueOf != null ? this.itemView.getResources().getQuantityString(R.plurals.accessibility_comments_count, valueOf.intValue(), valueOf) : this.itemView.getResources().getString(R.string.accessibility_comments));
            AboutVideoItem.c0.b bVar2 = c0Var.d;
            AboutVideoItem.c0.b.C1213b c1213b2 = bVar2 instanceof AboutVideoItem.c0.b.C1213b ? (AboutVideoItem.c0.b.C1213b) bVar2 : null;
            if (c1213b2 != null && (i = c1213b2.a) >= 0) {
                num = Integer.valueOf(i);
            }
            TextView textView2 = this.o;
            h6(textView2, num);
            textView2.setContentDescription(num != null ? this.itemView.getResources().getQuantityString(R.plurals.accessibility_reposts, num.intValue(), num) : this.itemView.getResources().getString(R.string.repost));
        }
    }

    public d(c4 c4Var, egs0 egs0Var) {
        this.a = c4Var;
        this.b = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.c0> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.c0;
    }
}
