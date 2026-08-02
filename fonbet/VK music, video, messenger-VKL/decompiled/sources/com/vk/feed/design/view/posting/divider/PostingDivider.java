package com.vk.feed.design.view.posting.divider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: PostingDivider.kt */
/* loaded from: classes18.dex */
public final class PostingDivider extends FrameLayout {
    public PostingDivider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.posting_divider_view, this);
    }
}
