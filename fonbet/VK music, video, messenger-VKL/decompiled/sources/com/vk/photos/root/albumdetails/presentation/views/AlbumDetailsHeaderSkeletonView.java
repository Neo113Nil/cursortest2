package com.vk.photos.root.albumdetails.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.vkontakte.android.R;
import xsna.cn70;

/* compiled from: AlbumDetailsHeaderSkeletonView.kt */
/* loaded from: classes4.dex */
public final class AlbumDetailsHeaderSkeletonView extends LinearLayout {
    public AlbumDetailsHeaderSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.album_details_header_skeleton_view, this);
        setPadding(cn70.b(8), cn70.b(10), cn70.b(8), cn70.b(10));
        setGravity(16);
    }
}
