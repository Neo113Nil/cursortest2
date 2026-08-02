package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: VideoDiscoverAdsDto.kt */
/* loaded from: classes15.dex */
public final class VideoDiscoverAdsDto implements Parcelable {
    public static final Parcelable.Creator<VideoDiscoverAdsDto> CREATOR = new a();

    @pmi0("can_show_ad_banner")
    private final Boolean canShowAdBanner;

    /* compiled from: VideoDiscoverAdsDto.kt */
    public static final class a implements Parcelable.Creator<VideoDiscoverAdsDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoDiscoverAdsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VideoDiscoverAdsDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoDiscoverAdsDto[] newArray(int i) {
            return new VideoDiscoverAdsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoDiscoverAdsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean d() {
        return this.canShowAdBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoDiscoverAdsDto) && epx.f(this.canShowAdBanner, ((VideoDiscoverAdsDto) obj).canShowAdBanner);
    }

    public final int hashCode() {
        Boolean bool = this.canShowAdBanner;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("VideoDiscoverAdsDto(canShowAdBanner="), this.canShowAdBanner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.canShowAdBanner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public VideoDiscoverAdsDto(Boolean bool) {
        this.canShowAdBanner = bool;
    }

    public /* synthetic */ VideoDiscoverAdsDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
