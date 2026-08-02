package com.vk.stickers.longtap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.vk.stickers.views.VKStickerCachedImageView;
import com.vkontakte.android.R;
import xsna.bwt0;

/* compiled from: LongtapStickerPreview.kt */
/* loaded from: classes6.dex */
public final class LongtapStickerPreview extends FrameLayout {
    public VKStickerCachedImageView b;
    public ImageView c;
    public ProgressBar d;
    public boolean e;

    public LongtapStickerPreview(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final ImageView getPlayPopupBtn() {
        return this.c;
    }

    public final ProgressBar getPopupLoader() {
        return this.d;
    }

    public final VKStickerCachedImageView getStickerImage() {
        return this.b;
    }

    public final void setLoadingState(boolean z) {
        if (this.e) {
            ImageView imageView = this.c;
            if (imageView != null) {
                bwt0.p0(imageView, !z);
            }
            ProgressBar progressBar = this.d;
            if (progressBar != null) {
                bwt0.p0(progressBar, z);
                return;
            }
            return;
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            bwt0.p0(imageView2, false);
        }
        ProgressBar progressBar2 = this.d;
        if (progressBar2 != null) {
            bwt0.p0(progressBar2, false);
        }
    }

    public final void setPlayPopupBtn(ImageView imageView) {
        this.c = imageView;
    }

    public final void setPlayPopupBtnVisible(boolean z) {
        this.e = z;
        ImageView imageView = this.c;
        if (imageView != null) {
            bwt0.p0(imageView, z);
        }
    }

    public final void setPopupLoader(ProgressBar progressBar) {
        this.d = progressBar;
    }

    public final void setStickerImage(VKStickerCachedImageView vKStickerCachedImageView) {
        this.b = vKStickerCachedImageView;
    }

    public LongtapStickerPreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public LongtapStickerPreview(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ LongtapStickerPreview(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public LongtapStickerPreview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = true;
        View.inflate(context, R.layout.popup_sticker_preview, this);
        this.c = (ImageView) findViewById(R.id.popup_sticker_icon);
        this.b = (VKStickerCachedImageView) findViewById(R.id.sticker_preview);
        this.d = (ProgressBar) findViewById(R.id.loader);
    }
}
