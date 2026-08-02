package com.vk.content.design.view.photo.selectalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;

/* compiled from: SelectAlbumSkeletonView.kt */
/* loaded from: classes17.dex */
public final class SelectAlbumSkeletonView extends FrameLayout {
    public final ShimmerFrameLayout b;

    public SelectAlbumSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.select_album_skeleton_view, this);
        bwt0.d(this, cn70.a() * 20.0f, (r4 & 2) != 0, (r4 & 4) != 0);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.skeleton_shimmer);
        this.b = shimmerFrameLayout;
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (bwt0.K(this)) {
            this.b.c();
        }
    }

    public final void setIsShow(boolean z) {
        bwt0.p0(this, z);
        ShimmerFrameLayout shimmerFrameLayout = this.b;
        if (z) {
            shimmerFrameLayout.c();
        } else {
            shimmerFrameLayout.a();
        }
    }
}
