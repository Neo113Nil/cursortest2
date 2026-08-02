package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface NativeAdDataInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Image {

        @Nullable
        private final Drawable a;

        @Nullable
        private final Uri b;

        public Image(@Nullable Drawable drawable, @Nullable Uri uri) {
            this.a = drawable;
            this.b = uri;
        }

        @Nullable
        public final Drawable getDrawable() {
            return this.a;
        }

        @Nullable
        public final Uri getUri() {
            return this.b;
        }
    }

    @Nullable
    String getAdvertiser();

    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    Image getIcon();

    @Nullable
    String getTitle();
}
