package com.vk.api.generated.topshelf.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: TopshelfTopshelfTrackCodesDto.kt */
/* loaded from: classes15.dex */
public final class TopshelfTopshelfTrackCodesDto implements Parcelable {
    public static final Parcelable.Creator<TopshelfTopshelfTrackCodesDto> CREATOR = new a();

    @pmi0("topshelf_track_code")
    private final String topshelfTrackCode;

    @pmi0("trailer_track_code")
    private final String trailerTrackCode;

    /* compiled from: TopshelfTopshelfTrackCodesDto.kt */
    public static final class a implements Parcelable.Creator<TopshelfTopshelfTrackCodesDto> {
        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfTrackCodesDto createFromParcel(Parcel parcel) {
            return new TopshelfTopshelfTrackCodesDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfTrackCodesDto[] newArray(int i) {
            return new TopshelfTopshelfTrackCodesDto[i];
        }
    }

    public TopshelfTopshelfTrackCodesDto(String str, String str2) {
        this.topshelfTrackCode = str;
        this.trailerTrackCode = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopshelfTopshelfTrackCodesDto)) {
            return false;
        }
        TopshelfTopshelfTrackCodesDto topshelfTopshelfTrackCodesDto = (TopshelfTopshelfTrackCodesDto) obj;
        return epx.f(this.topshelfTrackCode, topshelfTopshelfTrackCodesDto.topshelfTrackCode) && epx.f(this.trailerTrackCode, topshelfTopshelfTrackCodesDto.trailerTrackCode);
    }

    public final int hashCode() {
        return this.trailerTrackCode.hashCode() + (this.topshelfTrackCode.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfTopshelfTrackCodesDto(topshelfTrackCode=");
        sb.append(this.topshelfTrackCode);
        sb.append(", trailerTrackCode=");
        return ho8.a(sb, this.trailerTrackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.topshelfTrackCode);
        parcel.writeString(this.trailerTrackCode);
    }
}
