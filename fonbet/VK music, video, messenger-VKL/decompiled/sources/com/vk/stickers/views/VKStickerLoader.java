package com.vk.stickers.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.vkontakte.android.R;

/* compiled from: VKStickerLoader.kt */
/* loaded from: classes6.dex */
public final class VKStickerLoader extends FrameLayout {
    public final ImageView b;
    public final ProgressBar c;

    public VKStickerLoader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.sticker_animation_badge, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.b = imageView;
        this.c = (ProgressBar) findViewById(R.id.progressBar);
        imageView.setImageResource(R.drawable.vk_icon_sticker_smile_outline_20);
    }

    public final ImageView getImage() {
        return this.b;
    }

    public final ProgressBar getProgress() {
        return this.c;
    }
}
