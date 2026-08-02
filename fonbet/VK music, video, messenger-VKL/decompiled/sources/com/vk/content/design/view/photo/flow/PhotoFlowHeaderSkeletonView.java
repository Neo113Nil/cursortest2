package com.vk.content.design.view.photo.flow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import xsna.cn70;

/* compiled from: PhotoFlowHeaderSkeletonView.kt */
/* loaded from: classes17.dex */
public final class PhotoFlowHeaderSkeletonView extends ConstraintLayout {
    public PhotoFlowHeaderSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.photo_flow_header_skeleton_view, this);
        setPadding(cn70.b(8), cn70.b(10), cn70.b(8), cn70.b(10));
    }
}
