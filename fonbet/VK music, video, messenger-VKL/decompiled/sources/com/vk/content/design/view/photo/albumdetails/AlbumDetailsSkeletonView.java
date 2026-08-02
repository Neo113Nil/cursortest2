package com.vk.content.design.view.photo.albumdetails;

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
import xsna.f4m;

/* compiled from: AlbumDetailsSkeletonView.kt */
/* loaded from: classes17.dex */
public final class AlbumDetailsSkeletonView extends FrameLayout {
    public final ShimmerFrameLayout b;
    public final View c;
    public final View d;

    public AlbumDetailsSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.album_details_skeleton_view, this);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.skeleton_shimmer);
        this.b = shimmerFrameLayout;
        View findViewById = findViewById(R.id.header_skeleton);
        this.c = findViewById;
        this.d = findViewById(R.id.grid_skeleton);
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(true).g(0.08f).a());
        awt0.x(findViewById, 0, 0, 0, cn70.b(0), 7);
        bwt0.d(shimmerFrameLayout, cn70.a() * 20.0f, (r4 & 2) != 0, (r4 & 4) != 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (bwt0.K(this)) {
            this.b.c();
        }
    }

    public final void setIsShowHeader(boolean z) {
        this.c.setVisibility(!z ? 8 : 0);
        if (z) {
            return;
        }
        f4m.t(0, this.d);
    }
}
