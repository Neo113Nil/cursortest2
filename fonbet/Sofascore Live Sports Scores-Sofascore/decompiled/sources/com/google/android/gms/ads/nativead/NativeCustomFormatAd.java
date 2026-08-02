package com.google.android.gms.ads.nativead;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface NativeCustomFormatAd {

    @NonNull
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface DisplayOpenMeasurement {
        void setView(@NonNull View view);

        boolean start();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface OnCustomClickListener {
        void onCustomClick(@NonNull NativeCustomFormatAd nativeCustomFormatAd, @NonNull String str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(@NonNull NativeCustomFormatAd nativeCustomFormatAd);
    }

    void destroy();

    @Nullable
    List<String> getAvailableAssetNames();

    @Nullable
    String getCustomFormatId();

    @Nullable
    DisplayOpenMeasurement getDisplayOpenMeasurement();

    @Nullable
    NativeAd.Image getImage(@NonNull String str);

    @Nullable
    MediaContent getMediaContent();

    @Nullable
    CharSequence getText(@NonNull String str);

    void performClick(@NonNull String str);

    void recordImpression();
}
