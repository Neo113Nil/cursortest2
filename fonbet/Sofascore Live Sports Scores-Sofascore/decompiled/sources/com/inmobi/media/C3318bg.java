package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.bg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3318bg implements Transformation {
    public final Bitmap.Config a;

    public C3318bg(Bitmap.Config config) {
        config.getClass();
        this.a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.a + ")";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap bitmap) {
        bitmap.getClass();
        Bitmap copy = bitmap.copy(this.a, false);
        bitmap.recycle();
        copy.getClass();
        return copy;
    }
}
