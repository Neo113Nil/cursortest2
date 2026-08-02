package com.vk.content.design.view.photo.archive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;

/* compiled from: ArchiveSkeletonView.kt */
/* loaded from: classes17.dex */
public final class ArchiveSkeletonView extends FrameLayout {
    public final ShimmerFrameLayout b;

    public ArchiveSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.photo_archive_skeleton_view, this);
        bwt0.d(this, cn70.a() * 20.0f, (r4 & 2) != 0, (r4 & 4) != 0);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.skeleton_shimmer);
        this.b = shimmerFrameLayout;
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
    }
}
