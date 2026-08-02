package com.vk.camera.editor.stories.impl.bottompanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: BottomControlPanelSkeletonView.kt */
/* loaded from: classes16.dex */
public final class BottomControlPanelSkeletonView extends FrameLayout {
    public final ShimmerFrameLayout b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final View e;

    public BottomControlPanelSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.layout_story_editor_bottom_panel_skeleton, this);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) findViewById(R.id.skeleton_shimmer);
        this.b = shimmerFrameLayout;
        this.c = (LinearLayout) findViewById(R.id.change_privacy);
        this.d = (LinearLayout) findViewById(R.id.share_with_messages);
        this.e = findViewById(R.id.skeleton_large_button);
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
    }

    public final void setupViews(StoryEditorCameraParams storyEditorCameraParams) {
        bwt0.p0(this.c, storyEditorCameraParams.d());
        bwt0.p0(this.d, !storyEditorCameraParams.e());
        bwt0.p0(this.e, storyEditorCameraParams.k.h.m);
    }
}
