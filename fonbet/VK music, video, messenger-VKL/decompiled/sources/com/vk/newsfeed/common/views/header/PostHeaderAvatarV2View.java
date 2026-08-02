package com.vk.newsfeed.common.views.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.movika.sdk.base.model.n;
import com.vk.newsfeed.common.views.header.HeaderPhotoView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.dhr0;
import xsna.epx;
import xsna.msy;
import xsna.o9r0;
import xsna.te0;
import xsna.ts5;

/* compiled from: PostHeaderAvatarV2View.kt */
/* loaded from: classes4.dex */
public final class PostHeaderAvatarV2View extends VKAvatarView implements ts5 {
    public static final /* synthetic */ int t = 0;
    public final Object s;

    public PostHeaderAvatarV2View(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o9r0 o9r0Var = new o9r0(false, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_image_border_alpha)), null, null, true, null, null, null, n.a(28.0f), 1772);
        this.s = msy.a(LazyThreadSafetyMode.NONE, new te0(29));
        setAvatarBorderConfigParamsOverride(o9r0Var);
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

    @Override // xsna.zjt
    public void setEmptyImagePlaceholder(int i) {
        setPlaceholderImage(i);
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }

    public void setPhotoClickListener(HeaderPhotoView.c cVar) {
    }
}
