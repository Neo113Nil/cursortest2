package com.vk.camera.editor.stories.impl.bottompanel.me;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: MessengerBottomControlPanelSkeletonView.kt */
/* loaded from: classes16.dex */
public final class MessengerBottomControlPanelSkeletonView extends FrameLayout {
    public MessengerBottomControlPanelSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.layout_story_editor_bottom_panel_skeleton_messenger, this);
        ((ShimmerFrameLayout) findViewById(R.id.skeleton_shimmer)).b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
    }
}
