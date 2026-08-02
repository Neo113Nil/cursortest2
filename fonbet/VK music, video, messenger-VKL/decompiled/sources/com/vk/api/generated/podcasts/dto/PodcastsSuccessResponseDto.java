package com.vk.api.generated.podcasts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: PodcastsSuccessResponseDto.kt */
/* loaded from: classes15.dex */
public final class PodcastsSuccessResponseDto implements Parcelable {
    public static final Parcelable.Creator<PodcastsSuccessResponseDto> CREATOR = new a();

    @pmi0("success")
    private final int success;

    /* compiled from: PodcastsSuccessResponseDto.kt */
    public static final class a implements Parcelable.Creator<PodcastsSuccessResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PodcastsSuccessResponseDto createFromParcel(Parcel parcel) {
            return new PodcastsSuccessResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PodcastsSuccessResponseDto[] newArray(int i) {
            return new PodcastsSuccessResponseDto[i];
        }
    }

    public PodcastsSuccessResponseDto(int i) {
        this.success = i;
    }

    public final int d() {
        return this.success;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PodcastsSuccessResponseDto) && this.success == ((PodcastsSuccessResponseDto) obj).success;
    }

    public final int hashCode() {
        return Integer.hashCode(this.success);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("PodcastsSuccessResponseDto(success="), this.success, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success);
    }
}
