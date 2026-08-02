package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.at;
import xsna.bwt0;
import xsna.c4;
import xsna.epx;
import xsna.gzs;
import xsna.hfz;
import xsna.p1;
import xsna.p1u0;
import xsna.rcg0;
import xsna.s9;
import xsna.t9;
import xsna.u9;
import xsna.v9;
import xsna.vfz;

/* compiled from: AboutVideoSimilarVideoErrorDelegate.kt */
/* loaded from: classes2.dex */
public final class a0 extends p1u0<AboutVideoItem.w> {
    public final c4 a;
    public final boolean b;
    public final boolean c;
    public final gzs<rcg0> d;

    /* compiled from: AboutVideoSimilarVideoErrorDelegate.kt */
    public final class a extends vfz<AboutVideoItem.w> {
        public final c4 l;
        public final TextView m;
        public final TextView n;
        public final TextView o;
        public final TextView p;

        public a(ViewGroup viewGroup, c4 c4Var) {
            super(bwt0.I(R.layout.video_about_error, viewGroup, false));
            this.l = c4Var;
            this.m = (TextView) this.itemView.findViewById(R.id.tv_retry);
            TextView textView = (TextView) this.itemView.findViewById(R.id.tv_retry_backend);
            this.n = textView;
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.tv_description);
            this.o = textView2;
            this.p = (TextView) this.itemView.findViewById(R.id.tv_offline_feed);
            bwt0.i0(textView, new t9(this, 0));
            textView2.setMinLines(0);
            textView2.setMaxLines(Integer.MAX_VALUE);
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.w wVar) {
            AboutVideoItem.w wVar2 = wVar;
            a0 a0Var = a0.this;
            gzs<rcg0> gzsVar = a0Var.d;
            boolean z = a0Var.b;
            TextView textView = this.p;
            bwt0.p0(textView, false);
            boolean z2 = wVar2 instanceof AboutVideoItem.w.a;
            int i = R.string.common_network_error;
            TextView textView2 = this.o;
            TextView textView3 = this.n;
            TextView textView4 = this.m;
            if (z2) {
                bwt0.p0(textView3, true);
                textView2.setText(z ? this.itemView.getContext().getString(R.string.vkvideo_backend_error) : this.itemView.getContext().getString(R.string.common_network_error));
                textView4.setText(z ? this.itemView.getContext().getString(R.string.video_about_similar_videos_title_redesign, ((AboutVideoItem.w.a) wVar2).b) : this.itemView.getContext().getString(R.string.retry));
                bwt0.i0(textView4, new s9(this, 0));
                return;
            }
            if (!(wVar2 instanceof AboutVideoItem.w.b)) {
                if (!wVar2.equals(AboutVideoItem.w.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bwt0.p0(textView3, false);
                textView2.setText(z ? this.itemView.getContext().getString(R.string.vkvideo_network_error) : this.itemView.getContext().getString(R.string.common_network_error));
                textView4.setText(z ? this.itemView.getContext().getString(R.string.vkvideo_try_again) : this.itemView.getContext().getString(R.string.retry));
                bwt0.i0(textView4, new p1(this, 1));
                return;
            }
            AboutVideoItem.w.b bVar = (AboutVideoItem.w.b) wVar2;
            if (!(bVar instanceof AboutVideoItem.w.b.C1217b)) {
                if (!epx.f(bVar, AboutVideoItem.w.b.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                bwt0.p0(textView3, false);
                com.vk.core.utils.newtork.b.a.getClass();
                if (!com.vk.core.utils.newtork.b.d()) {
                    bwt0.p0(textView4, false);
                    bwt0.p0(textView2, false);
                    bwt0.p0(textView, true);
                    return;
                } else {
                    bwt0.p0(textView2, true);
                    bwt0.p0(textView4, true);
                    textView4.setText(this.itemView.getContext().getString(R.string.go_to_main_page));
                    bwt0.i0(textView4, new v9(this, 0));
                    at.d(this.itemView, R.string.no_downloaded_videos, textView2);
                    return;
                }
            }
            bwt0.p0(textView3, false);
            boolean z3 = a0Var.c;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            if (z) {
                i = z3 ? R.string.vkvideo_empty_recommendations_catalog : R.string.vkvideo_empty_recommendations_error;
            }
            at.d(this.itemView, i, textView2);
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            String string = z ? z3 ? this.itemView.getContext().getString(R.string.vkvideo_try_again) : this.itemView.getContext().getString(R.string.video_about_similar_videos_title_redesign, ((AboutVideoItem.w.b.C1217b) bVar).b) : this.itemView.getContext().getString(R.string.retry);
            if (string == null) {
                bwt0.p0(textView4, false);
                return;
            }
            bwt0.p0(textView4, true);
            textView4.setText(string);
            bwt0.i0(textView4, new u9(0, a0Var, this));
        }
    }

    public a0(c4 c4Var, boolean z, boolean z2, gzs<rcg0> gzsVar) {
        this.a = c4Var;
        this.b = z;
        this.c = z2;
        this.d = gzsVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.w> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.w;
    }
}
