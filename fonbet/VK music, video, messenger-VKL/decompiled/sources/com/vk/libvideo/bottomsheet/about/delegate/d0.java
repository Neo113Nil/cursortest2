package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import kotlin.LazyThreadSafetyMode;
import xsna.bwt0;
import xsna.hfz;
import xsna.msy;
import xsna.p1u0;
import xsna.vfz;
import xsna.w9;

/* compiled from: AboutVideoViewsLikesDelegate.kt */
/* loaded from: classes2.dex */
public final class d0 extends p1u0<AboutVideoItem.d0> {
    public final boolean a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new w9(0));

    /* compiled from: AboutVideoViewsLikesDelegate.kt */
    public final class a extends vfz<AboutVideoItem.d0> {
        public final Space l;
        public final LinearLayout m;
        public final TextView n;
        public final TextView o;
        public final TextView p;
        public final TextView q;

        public a(ViewGroup viewGroup) {
            super(bwt0.I(R.layout.video_about_views_likes, viewGroup, false));
            this.l = (Space) this.itemView.findViewById(R.id.space);
            this.m = (LinearLayout) this.itemView.findViewById(R.id.cnt_likes);
            this.n = (TextView) this.itemView.findViewById(R.id.likes);
            this.o = (TextView) this.itemView.findViewById(R.id.likesDescription);
            this.p = (TextView) this.itemView.findViewById(R.id.views);
            this.q = (TextView) this.itemView.findViewById(R.id.viewsDescription);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        public final void W5(AboutVideoItem.d0 d0Var) {
            int i;
            AboutVideoItem.d0 d0Var2 = d0Var;
            ?? r0 = d0.this.b;
            int i2 = d0Var2.b;
            AboutVideoItem.d0.b bVar = d0Var2.c.a;
            Integer num = null;
            AboutVideoItem.d0.b.C1216b c1216b = bVar instanceof AboutVideoItem.d0.b.C1216b ? (AboutVideoItem.d0.b.C1216b) bVar : null;
            if (c1216b != null && (i = c1216b.a) >= 0) {
                num = Integer.valueOf(i);
            }
            bwt0.p0(this.m, num != null);
            bwt0.p0(this.l, num == null);
            boolean z = num != null;
            TextView textView = this.n;
            bwt0.p0(textView, z);
            boolean z2 = num != null;
            TextView textView2 = this.o;
            bwt0.p0(textView2, z2);
            if (num != null) {
                textView.setText(((DecimalFormat) r0.getValue()).format(num));
                textView2.setText(b6().getQuantityString(R.plurals.likes, num.intValue()));
                textView.setContentDescription(this.itemView.getResources().getQuantityString(R.plurals.likes, num.intValue(), num));
            }
            this.p.setText(((DecimalFormat) r0.getValue()).format(Integer.valueOf(i2)));
            String quantityString = b6().getQuantityString(R.plurals.views, i2);
            TextView textView3 = this.q;
            textView3.setText(quantityString);
            textView3.setContentDescription(b6().getQuantityString(R.plurals.views, i2));
        }
    }

    public d0(boolean z) {
        this.a = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.d0> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.d0) && !this.a;
    }
}
