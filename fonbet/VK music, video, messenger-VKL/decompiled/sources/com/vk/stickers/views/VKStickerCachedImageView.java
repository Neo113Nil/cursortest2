package com.vk.stickers.views;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.vk.imageloader.view.VKImageView;
import com.vk.metrics.performance.images.ImageCacheSource;

/* loaded from: classes6.dex */
public class VKStickerCachedImageView extends VKImageView {
    public static final /* synthetic */ int m = 0;

    public VKStickerCachedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void T0(String str) {
        s0(Uri.parse(str).buildUpon().appendQueryParameter("client_cache_source", ImageCacheSource.STICKERS.h()).build().toString());
    }
}
