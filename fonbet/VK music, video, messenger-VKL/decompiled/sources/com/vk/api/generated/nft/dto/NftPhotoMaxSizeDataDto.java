package com.vk.api.generated.nft.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NftPhotoMaxSizeDataDto.kt */
/* loaded from: classes15.dex */
public final class NftPhotoMaxSizeDataDto implements Parcelable {
    public static final Parcelable.Creator<NftPhotoMaxSizeDataDto> CREATOR = new a();

    @pmi0("height")
    private final Integer height;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    /* compiled from: NftPhotoMaxSizeDataDto.kt */
    public static final class a implements Parcelable.Creator<NftPhotoMaxSizeDataDto> {
        @Override // android.os.Parcelable.Creator
        public final NftPhotoMaxSizeDataDto createFromParcel(Parcel parcel) {
            return new NftPhotoMaxSizeDataDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NftPhotoMaxSizeDataDto[] newArray(int i) {
            return new NftPhotoMaxSizeDataDto[i];
        }
    }

    public NftPhotoMaxSizeDataDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftPhotoMaxSizeDataDto)) {
            return false;
        }
        NftPhotoMaxSizeDataDto nftPhotoMaxSizeDataDto = (NftPhotoMaxSizeDataDto) obj;
        return epx.f(this.width, nftPhotoMaxSizeDataDto.width) && epx.f(this.height, nftPhotoMaxSizeDataDto.height) && epx.f(this.url, nftPhotoMaxSizeDataDto.url) && epx.f(this.type, nftPhotoMaxSizeDataDto.type);
    }

    public final int hashCode() {
        Integer num = this.width;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NftPhotoMaxSizeDataDto(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.type);
    }

    public NftPhotoMaxSizeDataDto(Integer num, Integer num2, String str, String str2) {
        this.width = num;
        this.height = num2;
        this.url = str;
        this.type = str2;
    }

    public /* synthetic */ NftPhotoMaxSizeDataDto(Integer num, Integer num2, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
