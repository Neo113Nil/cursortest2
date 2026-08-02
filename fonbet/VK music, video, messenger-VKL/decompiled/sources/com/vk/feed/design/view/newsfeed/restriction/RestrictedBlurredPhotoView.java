package com.vk.feed.design.view.newsfeed.restriction;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.im.Image;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vk.toggle.d;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.b780;
import xsna.e3m;
import xsna.edg0;
import xsna.kci;
import xsna.kgw;

/* compiled from: RestrictedBlurredPhotoView.kt */
/* loaded from: classes18.dex */
public final class RestrictedBlurredPhotoView extends RestrictedPhotoView implements kgw {
    public boolean v;
    public final VkEnhancedImageView w;
    public final ColorDrawable x;

    public RestrictedBlurredPhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean getUseThumbHash() {
        return this.v;
    }

    public final void h(String str, String str2) {
        boolean z = this.v;
        VkEnhancedImageView vkEnhancedImageView = this.w;
        if (!z || vkEnhancedImageView == null) {
            vkEnhancedImageView.o0(str, null);
            return;
        }
        String b = d.s().b(str2, this.v);
        if (b != null) {
            vkEnhancedImageView.setThumbHash(b);
        }
        vkEnhancedImageView.setRemoteImage(new Image(String.valueOf(str)));
    }

    public final void i() {
        ColorDrawable colorDrawable = this.x;
        VkEnhancedImageView vkEnhancedImageView = this.w;
        vkEnhancedImageView.setOverlayImage(colorDrawable);
        kci.o(vkEnhancedImageView, edg0.a);
    }

    public final void j() {
        if (this.p) {
            this.p = false;
            requestLayout();
            invalidate();
        }
        setText(null);
        setButtonText(null);
        VkEnhancedImageView vkEnhancedImageView = this.w;
        vkEnhancedImageView.setOverlayImage(null);
        vkEnhancedImageView.setVkPostprocessor(null);
    }

    @Override // com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.w.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(getMeasuredWidth(), 1073741823)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min(getMeasuredHeight(), 1073741823)), 1073741824));
    }

    public final void setDontLoadAgainIfSameResource(boolean z) {
        this.w.setDontLoadAgainIfSameResource(z);
    }

    @Override // xsna.kgw
    public void setOnLoadCallback(b780 b780Var) {
        this.w.setOnLoadCallback(b780Var);
    }

    public final void setUseThumbHash(boolean z) {
        this.v = z;
    }

    public RestrictedBlurredPhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(context, null, 6, 0);
        this.w = vkEnhancedImageView;
        this.x = new ColorDrawable(context.getColor(R.color.vk_black_alpha24));
        vkEnhancedImageView.setId(R.id.restricted_blurred_photo);
        vkEnhancedImageView.setPlaceholderColor(e3m.f(R.attr.vk_ui_image_placeholder, context));
        i();
        addView(vkEnhancedImageView, 0, new RestrictedPhotoView.a(-1, -1, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
    }
}
