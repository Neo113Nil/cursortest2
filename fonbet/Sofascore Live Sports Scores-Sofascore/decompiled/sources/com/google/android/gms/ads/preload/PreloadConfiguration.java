package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class PreloadConfiguration {
    public final String a;
    public final AdFormat b;
    public final AdRequest c;
    public final int d;

    public /* synthetic */ PreloadConfiguration(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    @NonNull
    @Deprecated
    public AdFormat getAdFormat() {
        AdFormat adFormat = this.b;
        return adFormat == null ? AdFormat.INTERSTITIAL : adFormat;
    }

    @NonNull
    public AdRequest getAdRequest() {
        return this.c;
    }

    @NonNull
    public String getAdUnitId() {
        return this.a;
    }

    public int getBufferSize() {
        return this.d;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public final String a;
        public final AdFormat b;
        public AdRequest c = new AdRequest.Builder().build();
        public int d;

        @Deprecated
        public Builder(@NonNull String str, @NonNull AdFormat adFormat) {
            this.a = str;
            this.b = adFormat;
        }

        @NonNull
        public PreloadConfiguration build() {
            return new PreloadConfiguration(this);
        }

        @NonNull
        public Builder setAdRequest(@NonNull AdRequest adRequest) {
            this.c = adRequest;
            return this;
        }

        @NonNull
        public Builder setBufferSize(int i) {
            this.d = i;
            return this;
        }

        public Builder(@NonNull String str) {
            this.a = str;
        }
    }
}
