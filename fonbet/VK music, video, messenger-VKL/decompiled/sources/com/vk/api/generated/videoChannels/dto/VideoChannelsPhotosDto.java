package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoChannelsPhotosDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsPhotosDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsPhotosDto> CREATOR = new a();

    @pmi0("has_photo")
    private final Boolean hasPhoto;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_avg_color")
    private final Integer photoAvgColor;

    /* compiled from: VideoChannelsPhotosDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsPhotosDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoChannelsPhotosDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Integer num;
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
                num = null;
            }
            String readString = parcel.readString();
            Integer num2 = num;
            String readString2 = parcel.readString();
            Integer num3 = num2;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num3 = Integer.valueOf(parcel.readInt());
            }
            return new VideoChannelsPhotosDto(valueOf, readString, readString2, readString3, num3);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsPhotosDto[] newArray(int i) {
            return new VideoChannelsPhotosDto[i];
        }
    }

    public VideoChannelsPhotosDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsPhotosDto)) {
            return false;
        }
        VideoChannelsPhotosDto videoChannelsPhotosDto = (VideoChannelsPhotosDto) obj;
        return epx.f(this.hasPhoto, videoChannelsPhotosDto.hasPhoto) && epx.f(this.photo50, videoChannelsPhotosDto.photo50) && epx.f(this.photo100, videoChannelsPhotosDto.photo100) && epx.f(this.photo200, videoChannelsPhotosDto.photo200) && epx.f(this.photoAvgColor, videoChannelsPhotosDto.photoAvgColor);
    }

    public final int hashCode() {
        Boolean bool = this.hasPhoto;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.photo50;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo100;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.photoAvgColor;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoChannelsPhotosDto(hasPhoto=");
        sb.append(this.hasPhoto);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoAvgColor=");
        return uqi.b(sb, this.photoAvgColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.hasPhoto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        Integer num = this.photoAvgColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public VideoChannelsPhotosDto(Boolean bool, String str, String str2, String str3, Integer num) {
        this.hasPhoto = bool;
        this.photo50 = str;
        this.photo100 = str2;
        this.photo200 = str3;
        this.photoAvgColor = num;
    }

    public /* synthetic */ VideoChannelsPhotosDto(Boolean bool, String str, String str2, String str3, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num);
    }
}
