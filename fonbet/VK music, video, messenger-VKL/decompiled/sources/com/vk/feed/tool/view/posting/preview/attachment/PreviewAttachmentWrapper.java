package com.vk.feed.tool.view.posting.preview.attachment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerSize;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerState;
import com.vk.feed.design.view.posting.preview.spinner.PostingVkSpinnerWrapperView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.gzs;
import xsna.iah0;
import xsna.s3q0;
import xsna.tlo0;

/* compiled from: PreviewAttachmentWrapper.kt */
/* loaded from: classes18.dex */
public final class PreviewAttachmentWrapper extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public final VkImage b;
    public final PostingVkSpinnerWrapperView c;
    public PostingSpinnerSize d;
    public String e;
    public PostingSpinnerState f;

    public PreviewAttachmentWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final void setRemoveIconVisibility(boolean z) {
        VkImage vkImage = this.b;
        bwt0.p0(vkImage, z);
        if (z) {
            vkImage.bringToFront();
        }
    }

    public final PostingSpinnerSize getSpinnerSize() {
        return this.d;
    }

    public final PostingSpinnerState getSpinnerState() {
        return this.f;
    }

    public final String getSpinnerSubtitle() {
        return this.e;
    }

    public final void setIconContentDescription(tlo0 tlo0Var) {
        this.b.setContentDescription(tlo0Var.a(getContext()));
    }

    public final void setOnRemoveIconClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public final void setOnSpinnerCancelClick(gzs<s3q0> gzsVar) {
        this.c.setOnCancelClick(gzsVar);
    }

    public final void setOnSpinnerErrorClick(gzs<s3q0> gzsVar) {
        this.c.setOnErrorClick(gzsVar);
    }

    public final void setRemoveIconVisible(boolean z) {
        setRemoveIconVisibility(z);
    }

    public final void setSpinnerScreen(boolean z) {
        this.c.setSpinnerScreen(z);
    }

    public final void setSpinnerSize(PostingSpinnerSize postingSpinnerSize) {
        this.d = postingSpinnerSize;
        this.c.setSpinnerSize(postingSpinnerSize);
    }

    public final void setSpinnerState(PostingSpinnerState postingSpinnerState) {
        this.f = postingSpinnerState;
        this.c.setSpinnerState(postingSpinnerState);
    }

    public final void setSpinnerSubtitle(String str) {
        this.e = str;
        this.c.setSubtitle(str);
    }

    public PreviewAttachmentWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        VkImage vkImage = new VkImage(context, null, 6, 0);
        vkImage.setId(R.id.posting_attachment_holder_remove);
        bwt0.p0(vkImage, false);
        vkImage.setImageResource(R.drawable.vk_icon_dismiss_dark_24);
        int a = iah0.a(8);
        vkImage.setPadding(a, a, a, a);
        this.b = vkImage;
        PostingVkSpinnerWrapperView postingVkSpinnerWrapperView = new PostingVkSpinnerWrapperView(context, null, 6);
        postingVkSpinnerWrapperView.setId(R.id.posting_attachment_progress);
        bwt0.p0(postingVkSpinnerWrapperView, false);
        postingVkSpinnerWrapperView.setClickable(false);
        postingVkSpinnerWrapperView.setBackgroundColor((Integer) 0);
        e3m.a aVar = e3m.a;
        postingVkSpinnerWrapperView.setBackgroundColor(context.getColor(R.color.vkim_background_dim));
        postingVkSpinnerWrapperView.setColor(Integer.valueOf(context.getColor(R.color.vk_white)));
        postingVkSpinnerWrapperView.setSubtitleColor(Integer.valueOf(context.getColor(R.color.vk_white)));
        postingVkSpinnerWrapperView.setErrorIconResId(Integer.valueOf(R.drawable.vk_icon_refresh_outline_28));
        this.c = postingVkSpinnerWrapperView;
        this.d = PostingSpinnerSize.Large;
        this.f = PostingSpinnerState.Loading;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(vkImage, layoutParams);
        addView(postingVkSpinnerWrapperView, layoutParams2);
    }
}
