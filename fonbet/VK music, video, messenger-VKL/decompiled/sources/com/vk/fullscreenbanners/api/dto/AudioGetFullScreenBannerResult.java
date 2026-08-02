package com.vk.fullscreenbanners.api.dto;

import com.vk.core.serialize.Serializer;

/* compiled from: AudioGetFullScreenBannerResult.kt */
/* loaded from: classes16.dex */
public final class AudioGetFullScreenBannerResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<FullScreenBanner> CREATOR = new a();
    public final FullScreenBanner b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<FullScreenBanner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final FullScreenBanner a(Serializer serializer) {
            return new FullScreenBanner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FullScreenBanner[i];
        }
    }

    public AudioGetFullScreenBannerResult(FullScreenBanner fullScreenBanner) {
        this.b = fullScreenBanner;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }
}
