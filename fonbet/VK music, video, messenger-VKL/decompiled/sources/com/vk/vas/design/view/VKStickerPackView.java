package com.vk.vas.design.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.imageloader.view.DefaultVkImageView;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.krv0;
import xsna.wzs;

/* compiled from: VKStickerPackView.kt */
/* loaded from: classes6.dex */
public final class VKStickerPackView extends FrameLayout {
    public final View b;
    public final VkImage c;
    public final DefaultVkImageView d;
    public boolean e;
    public int f;
    public int g;
    public wzs<? super Integer, ? super Integer, String> h;
    public wzs<? super Integer, ? super Integer, String> i;

    public VKStickerPackView(Context context, AttributeSet attributeSet) {
        super(context, (4 & 2) != 0 ? null : attributeSet, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_sticker_pack_view, (ViewGroup) this, false);
        this.b = inflate;
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.pack_image);
        this.c = vkImage;
        this.d = (DefaultVkImageView) inflate.findViewById(R.id.anim_pack_icon);
        addView(inflate);
        vkImage.setPlaceholderColor(krv0.m(R.attr.vk_ui_image_placeholder, context));
        vkImage.setClipToOutline(true);
    }

    public final void a(wzs<? super Integer, ? super Integer, String> wzsVar, boolean z, boolean z2) {
        int i;
        this.c.clear();
        this.h = wzsVar;
        DefaultVkImageView defaultVkImageView = this.d;
        if (z2) {
            defaultVkImageView.setImageResource(R.drawable.vk_icon_pop_up_sticker_circle_fill_red_16);
        } else {
            if (!z) {
                i = 8;
                defaultVkImageView.setVisibility(i);
                b();
            }
            defaultVkImageView.setImageResource(R.drawable.vk_icon_play_circle_fill_azure_16);
        }
        i = 0;
        defaultVkImageView.setVisibility(i);
        b();
    }

    public final void b() {
        if (this.g < 0 || this.f < 0) {
            if (!this.e) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            this.f = layoutParams != null ? layoutParams.width : 0;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            this.g = layoutParams2 != null ? layoutParams2.height : 0;
        }
        wzs<? super Integer, ? super Integer, String> wzsVar = this.i;
        String str = null;
        if (wzsVar == null) {
            wzs<? super Integer, ? super Integer, String> wzsVar2 = this.h;
            if (wzsVar2 != null) {
                str = wzsVar2.invoke(Integer.valueOf(this.f), Integer.valueOf(this.g));
            }
        } else if (wzsVar != null) {
            str = wzsVar.invoke(Integer.valueOf(this.f), Integer.valueOf(this.g));
        }
        this.c.s0(str);
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
        b();
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

    public final void setPackBackground(int i) {
        this.c.setBackgroundResource(i);
    }

    public final void setPlaceHolder(Drawable drawable) {
        this.c.setPlaceholderImage(drawable);
    }

    public final void setSticker(wzs<? super Integer, ? super Integer, String> wzsVar) {
        this.i = wzsVar;
        int a = iah0.a(11);
        this.c.setPadding(a, a, a, a);
    }
}
