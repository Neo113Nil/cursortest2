package com.vk.vmoji.character.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.vmoji.character.model.BaseUrlImageModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vkontakte.android.R;
import java.util.Map;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.u5d0;

/* compiled from: VmojiStickerPackPreviewView.kt */
/* loaded from: classes7.dex */
public final class VmojiStickerPackPreviewView extends FrameLayout {
    public final View b;
    public final VKImageView c;
    public final View d;
    public boolean e;
    public int f;
    public int g;
    public VmojiStickerPackPreviewModel h;

    public VmojiStickerPackPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View inflate = e3m.b(context).inflate(R.layout.stickerpack_view, (ViewGroup) this, false);
        this.b = inflate;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.pack_image);
        this.c = vKImageView;
        this.d = inflate.findViewById(R.id.anim_pack_icon);
        addView(inflate);
        vKImageView.getHierarchy().d.setVisible(true, true);
        vKImageView.getHierarchy().p(new ColorDrawable(dhr0.Y(R.attr.vk_legacy_placeholder_icon_background, context)), 1);
        vKImageView.getHierarchy().q(100);
        vKImageView.setClipToOutline(true);
    }

    public final void a(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
        int i;
        int i2 = this.g;
        if (i2 < 0 || (i = this.f) < 0) {
            return;
        }
        BaseUrlImageModel baseUrlImageModel = vmojiStickerPackPreviewModel.j;
        this.c.s0(baseUrlImageModel != null ? i > i2 ? baseUrlImageModel.zb(i2, (Map) u5d0.b.getValue(), baseUrlImageModel.d) : baseUrlImageModel.zb(i2, (Map) u5d0.a.getValue(), baseUrlImageModel.c) : null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.e) {
            int size = View.MeasureSpec.getSize(i);
            this.g = size;
            this.f = size;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            return;
        }
        super.onMeasure(i, i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        this.f = layoutParams != null ? layoutParams.width : 0;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        int i3 = layoutParams2 != null ? layoutParams2.height : 0;
        this.g = i3;
        setMeasuredDimension(this.f, i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.e) {
            return;
        }
        this.f = getMeasuredWidth();
        this.g = getMeasuredHeight();
        VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel = this.h;
        if (vmojiStickerPackPreviewModel != null) {
            a(vmojiStickerPackPreviewModel);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.f = -1;
        this.g = -1;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        boolean z = false;
        this.f = layoutParams2 != null ? layoutParams2.width : 0;
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        int i = layoutParams3 != null ? layoutParams3.height : 0;
        this.g = i;
        if (this.f > 0 && i > 0) {
            z = true;
        }
        this.e = z;
    }

    public final void setPack(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
        this.h = vmojiStickerPackPreviewModel;
        a(vmojiStickerPackPreviewModel);
        bwt0.p0(this.d, vmojiStickerPackPreviewModel.f);
    }

    public final void setPackBackground(int i) {
        this.c.setBackgroundResource(i);
    }

    public final void setPlaceHolder(Drawable drawable) {
        this.c.getHierarchy().p(drawable, 1);
    }
}
