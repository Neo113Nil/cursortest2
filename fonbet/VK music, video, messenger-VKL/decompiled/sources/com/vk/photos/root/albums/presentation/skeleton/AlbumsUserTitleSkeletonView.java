package com.vk.photos.root.albums.presentation.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import xsna.cn70;

/* compiled from: AlbumsUserTitleSkeletonView.kt */
/* loaded from: classes4.dex */
public final class AlbumsUserTitleSkeletonView extends FrameLayout {
    public AlbumsUserTitleSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.albums_user_title_skeleton_view, this);
        setPadding(0, cn70.b(15), 0, cn70.b(9));
    }
}
