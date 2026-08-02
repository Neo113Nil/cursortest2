package com.vk.feed.design.view.newsfeed.ads_mytarget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.feed.tool.view.newsfeed.text.VkFeedTextWrapper;
import com.vkontakte.android.R;

/* compiled from: MyTargetAdDescriptionView.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdDescriptionView extends FrameLayout {
    public final FrameLayout b;
    public final VkFeedTextWrapper c;
    public final SquareExcerptTextView d;

    public MyTargetAdDescriptionView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final SquareExcerptTextView getDescriptionView() {
        return this.d;
    }

    public final ViewGroup getRootContainer() {
        return this.b;
    }

    public final ViewGroup getTextContainer() {
        return this.c;
    }

    public MyTargetAdDescriptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MyTargetAdDescriptionView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MyTargetAdDescriptionView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MyTargetAdDescriptionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.my_target_ad_description_view, (ViewGroup) this, true);
        this.b = (FrameLayout) findViewById(R.id.description_container);
        this.c = (VkFeedTextWrapper) findViewById(R.id.text_wrapper);
        this.d = (SquareExcerptTextView) findViewById(R.id.description_text_view);
    }
}
