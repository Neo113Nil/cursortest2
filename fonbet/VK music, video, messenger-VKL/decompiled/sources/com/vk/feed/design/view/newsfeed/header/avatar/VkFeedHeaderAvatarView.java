package com.vk.feed.design.view.newsfeed.header.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.movika.sdk.base.model.n;
import com.vkontakte.android.R;
import xsna.cq5;
import xsna.dhr0;
import xsna.epx;
import xsna.o9r0;
import xsna.vtu0;

/* compiled from: VkFeedHeaderAvatarView.kt */
/* loaded from: classes18.dex */
public final class VkFeedHeaderAvatarView extends VKAvatarView {
    public VkFeedHeaderAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setAvatarBorderConfigParamsOverride(new o9r0(false, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_image_border_alpha)), null, null, true, null, null, null, n.a(28.0f), 1772));
    }

    private final void setAvatarBorderParams(o9r0 o9r0Var) {
        if (epx.f(o9r0Var, getAvatarBorderConfigParamsOverride())) {
            return;
        }
        setAvatarBorderConfigParamsOverride(o9r0Var);
        invalidate();
    }

    @Override // xsna.zjt
    public final void F0(Drawable drawable, ImageView.ScaleType scaleType) {
        F0(drawable, scaleType);
    }

    public final void e1(vtu0 vtu0Var) {
        setAvatarBorderParams(vtu0Var.d);
        setFixedSize(vtu0Var.e);
        VKAvatarView.c1(this, vtu0Var.b, vtu0Var.f ? cq5.g.a : vtu0Var.c ? cq5.h.a : cq5.b.a, 4);
        load(vtu0Var.a);
    }

    @Override // xsna.zjt
    public void setEmptyImagePlaceholder(int i) {
        setPlaceholderImage(i);
    }

    public final View getView() {
        return this;
    }
}
