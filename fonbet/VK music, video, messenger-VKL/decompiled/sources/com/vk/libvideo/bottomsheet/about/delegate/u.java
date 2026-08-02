package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.hfz;
import xsna.iah0;
import xsna.m33;
import xsna.p1u0;
import xsna.vfz;
import xsna.zn;

/* compiled from: AboutVideoRelatedAudioRowSkeletonDelegate.kt */
/* loaded from: classes2.dex */
public final class u extends p1u0<AboutVideoItem.t> {

    /* compiled from: AboutVideoRelatedAudioRowSkeletonDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.t> {
        @Override // xsna.vfz
        public final void W5(AboutVideoItem.t tVar) {
            View view = this.itemView;
            ShimmerFrameLayout shimmerFrameLayout = view instanceof ShimmerFrameLayout ? (ShimmerFrameLayout) view : null;
            if (shimmerFrameLayout != null) {
                shimmerFrameLayout.d();
            }
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.t> b(ViewGroup viewGroup) {
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(viewGroup.getContext(), null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(36));
        float f = 16;
        layoutParams.leftMargin = iah0.a(f);
        layoutParams.rightMargin = iah0.a(f);
        layoutParams.bottomMargin = iah0.a(10);
        shimmerFrameLayout.setLayoutParams(layoutParams);
        shimmerFrameLayout.setBackground(m33.a(R.drawable.bg_rounded_10_content, shimmerFrameLayout.getContext()));
        a aVar = new a(shimmerFrameLayout);
        View view = aVar.itemView;
        ShimmerFrameLayout shimmerFrameLayout2 = view instanceof ShimmerFrameLayout ? (ShimmerFrameLayout) view : null;
        if (shimmerFrameLayout2 != null) {
            Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(false)).i();
            cVar.k(e3m.f(R.attr.vk_ui_background_content, aVar.itemView.getContext()));
            cVar.a.d = e3m.f(R.attr.vk_ui_track_background, aVar.itemView.getContext());
            shimmerFrameLayout2.b(((Shimmer.c) cVar.d()).f(iah0.a(250)).a());
        }
        return aVar;
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.t;
    }
}
