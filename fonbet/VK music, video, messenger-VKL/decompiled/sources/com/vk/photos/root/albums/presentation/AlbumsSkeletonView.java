package com.vk.photos.root.albums.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.bwt0;
import xsna.cn70;

/* compiled from: AlbumsSkeletonView.kt */
/* loaded from: classes4.dex */
public final class AlbumsSkeletonView extends FrameLayout {
    public final ShimmerFrameLayout b;
    public final View c;
    public final View d;

    public AlbumsSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.albums_skeleton_view, this);
        bwt0.d(this, cn70.a() * 20.0f, (r4 & 2) != 0, (r4 & 4) != 0);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.skeleton_shimmer);
        this.b = shimmerFrameLayout;
        View findViewById = findViewById(R.id.albums_header_skeleton);
        this.c = findViewById;
        this.d = findViewById(R.id.albums_margin_if_header_is_hidden);
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
        awt0.x(findViewById, 0, 0, 0, cn70.b(0), 7);
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

    public final void setIsShowHeader(boolean z) {
        this.c.setVisibility(!z ? 8 : 0);
        this.d.setVisibility(z ? 8 : 0);
    }
}
