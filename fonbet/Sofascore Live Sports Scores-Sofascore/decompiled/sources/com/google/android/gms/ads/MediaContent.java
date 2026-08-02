package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbnm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    @Nullable
    Drawable getMainImage();

    @NonNull
    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(@Nullable Drawable drawable);

    boolean zza();

    @Nullable
    zzbnm zzb();
}
