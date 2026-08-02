package com.google.android.gms.ads.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final VideoOptions e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public VideoOptions d;
        public boolean a = false;
        public int b = 0;
        public boolean c = false;
        public int e = 1;
        public boolean f = false;
        public boolean g = false;
        public int h = 0;
        public int i = 1;

        @NonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        @NonNull
        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int i, boolean z) {
            this.g = z;
            this.h = i;
            return this;
        }

        @NonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.e = i;
            return this;
        }

        @NonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i) {
            this.b = i;
            return this;
        }

        @NonNull
        public Builder setRequestCustomMuteThisAd(boolean z) {
            this.f = z;
            return this;
        }

        @NonNull
        public Builder setRequestMultipleImages(boolean z) {
            this.c = z;
            return this;
        }

        @NonNull
        public Builder setReturnUrlsForImageAssets(boolean z) {
            this.a = z;
            return this;
        }

        @NonNull
        public Builder setVideoOptions(@NonNull VideoOptions videoOptions) {
            this.d = videoOptions;
            return this;
        }

        @NonNull
        public final Builder zzi(int i) {
            this.i = i;
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public @interface NativeMediaAspectRatio {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.e;
        this.e = builder.d;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
    }

    public int getAdChoicesPlacement() {
        return this.d;
    }

    public int getMediaAspectRatio() {
        return this.b;
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.a;
    }

    public final boolean zza() {
        return this.f;
    }

    public final int zzb() {
        return this.h;
    }

    public final boolean zzc() {
        return this.g;
    }

    public final int zzd() {
        return this.i;
    }
}
