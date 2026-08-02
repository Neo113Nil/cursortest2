package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoRecomAlternativeItemDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoRecomAlternativeItemDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoRecomAlternativeItemDto> CREATOR = new a();

    @pmi0("alternative_short_video_id")
    private final ShortVideoShortVideoIdDto alternativeShortVideoId;

    @pmi0("alternative_track_code")
    private final String alternativeTrackCode;

    @pmi0("short_video_id")
    private final ShortVideoShortVideoIdDto shortVideoId;

    /* compiled from: ShortVideoRecomAlternativeItemDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoRecomAlternativeItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecomAlternativeItemDto createFromParcel(Parcel parcel) {
            return new ShortVideoRecomAlternativeItemDto(parcel.readInt() == 0 ? null : ShortVideoShortVideoIdDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ShortVideoShortVideoIdDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecomAlternativeItemDto[] newArray(int i) {
            return new ShortVideoRecomAlternativeItemDto[i];
        }
    }

    public ShortVideoRecomAlternativeItemDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoRecomAlternativeItemDto)) {
            return false;
        }
        ShortVideoRecomAlternativeItemDto shortVideoRecomAlternativeItemDto = (ShortVideoRecomAlternativeItemDto) obj;
        return epx.f(this.shortVideoId, shortVideoRecomAlternativeItemDto.shortVideoId) && epx.f(this.alternativeShortVideoId, shortVideoRecomAlternativeItemDto.alternativeShortVideoId) && epx.f(this.alternativeTrackCode, shortVideoRecomAlternativeItemDto.alternativeTrackCode);
    }

    public final int hashCode() {
        ShortVideoShortVideoIdDto shortVideoShortVideoIdDto = this.shortVideoId;
        int hashCode = (shortVideoShortVideoIdDto == null ? 0 : shortVideoShortVideoIdDto.hashCode()) * 31;
        ShortVideoShortVideoIdDto shortVideoShortVideoIdDto2 = this.alternativeShortVideoId;
        int hashCode2 = (hashCode + (shortVideoShortVideoIdDto2 == null ? 0 : shortVideoShortVideoIdDto2.hashCode())) * 31;
        String str = this.alternativeTrackCode;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoRecomAlternativeItemDto(shortVideoId=");
        sb.append(this.shortVideoId);
        sb.append(", alternativeShortVideoId=");
        sb.append(this.alternativeShortVideoId);
        sb.append(", alternativeTrackCode=");
        return ho8.a(sb, this.alternativeTrackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ShortVideoShortVideoIdDto shortVideoShortVideoIdDto = this.shortVideoId;
        if (shortVideoShortVideoIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoIdDto.writeToParcel(parcel, i);
        }
        ShortVideoShortVideoIdDto shortVideoShortVideoIdDto2 = this.alternativeShortVideoId;
        if (shortVideoShortVideoIdDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoIdDto2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.alternativeTrackCode);
    }

    public ShortVideoRecomAlternativeItemDto(ShortVideoShortVideoIdDto shortVideoShortVideoIdDto, ShortVideoShortVideoIdDto shortVideoShortVideoIdDto2, String str) {
        this.shortVideoId = shortVideoShortVideoIdDto;
        this.alternativeShortVideoId = shortVideoShortVideoIdDto2;
        this.alternativeTrackCode = str;
    }

    public /* synthetic */ ShortVideoRecomAlternativeItemDto(ShortVideoShortVideoIdDto shortVideoShortVideoIdDto, ShortVideoShortVideoIdDto shortVideoShortVideoIdDto2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : shortVideoShortVideoIdDto, (i & 2) != 0 ? null : shortVideoShortVideoIdDto2, (i & 4) != 0 ? null : str);
    }
}
