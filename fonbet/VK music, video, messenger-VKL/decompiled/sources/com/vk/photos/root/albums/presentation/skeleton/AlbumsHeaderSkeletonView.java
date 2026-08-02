package com.vk.photos.root.albums.presentation.skeleton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import xsna.cn70;

/* compiled from: AlbumsHeaderSkeletonView.kt */
/* loaded from: classes4.dex */
public final class AlbumsHeaderSkeletonView extends ConstraintLayout {
    public AlbumsHeaderSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.albums_header_skeleton_view, this);
        setPadding(cn70.b(8), cn70.b(10), cn70.b(8), cn70.b(10));
    }
}
