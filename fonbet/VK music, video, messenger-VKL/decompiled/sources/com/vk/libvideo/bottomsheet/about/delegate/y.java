package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.View;
import android.view.ViewGroup;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.egs0;
import xsna.hfz;
import xsna.p1u0;
import xsna.qf6;
import xsna.v4;
import xsna.vfz;

/* compiled from: AboutVideoSimilarBigVideoSkeletonDelegate.kt */
/* loaded from: classes2.dex */
public final class y extends p1u0<AboutVideoItem.x> {
    public final egs0 a;

    /* compiled from: AboutVideoSimilarBigVideoSkeletonDelegate.kt */
    public static final class a extends qf6 {
        public final egs0 l;
        public boolean m;

        public a(ViewGroup viewGroup, egs0 egs0Var) {
            super(viewGroup, R.layout.video_about_similar_videos_skeleton, egs0Var);
            this.l = egs0Var;
            ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.container);
            for (int i = 0; i < 5; i++) {
                if (this.l != null) {
                    viewGroup.getContext();
                }
                viewGroup2.addView(bwt0.I(R.layout.video_about_video_big_skeleton, viewGroup, false));
            }
        }

        @Override // xsna.vfz
        public final void W5(hfz hfzVar) {
            if (this.m) {
                return;
            }
            View view = this.itemView;
            ShimmerFrameLayout shimmerFrameLayout = view instanceof ShimmerFrameLayout ? (ShimmerFrameLayout) view : null;
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.b(v4.a(view.getContext()));
                shimmerFrameLayout.c();
            }
            this.m = true;
        }
    }

    public y() {
        this(null);
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.x> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.x;
    }

    public y(egs0 egs0Var) {
        this.a = egs0Var;
    }
}
