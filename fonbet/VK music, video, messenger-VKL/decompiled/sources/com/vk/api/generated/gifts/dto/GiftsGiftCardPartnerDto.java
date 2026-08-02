package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GiftsGiftCardPartnerDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftCardPartnerDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftCardPartnerDto> CREATOR = new a();

    @pmi0("apply_url")
    private final String applyUrl;

    @pmi0("image")
    private final GiftsImageDto image;

    @pmi0("info")
    private final String info;

    @pmi0("name")
    private final String name;

    /* compiled from: GiftsGiftCardPartnerDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftCardPartnerDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftCardPartnerDto createFromParcel(Parcel parcel) {
            return new GiftsGiftCardPartnerDto(parcel.readString(), parcel.readString(), GiftsImageDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftCardPartnerDto[] newArray(int i) {
            return new GiftsGiftCardPartnerDto[i];
        }
    }

    public GiftsGiftCardPartnerDto(String str, String str2, GiftsImageDto giftsImageDto, String str3) {
        this.name = str;
        this.info = str2;
        this.image = giftsImageDto;
        this.applyUrl = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftCardPartnerDto)) {
            return false;
        }
        GiftsGiftCardPartnerDto giftsGiftCardPartnerDto = (GiftsGiftCardPartnerDto) obj;
        return epx.f(this.name, giftsGiftCardPartnerDto.name) && epx.f(this.info, giftsGiftCardPartnerDto.info) && epx.f(this.image, giftsGiftCardPartnerDto.image) && epx.f(this.applyUrl, giftsGiftCardPartnerDto.applyUrl);
    }

    public final int hashCode() {
        int hashCode = (this.image.hashCode() + urd0.a(this.name.hashCode() * 31, 31, this.info)) * 31;
        String str = this.applyUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsGiftCardPartnerDto(name=");
        sb.append(this.name);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", applyUrl=");
        return ho8.a(sb, this.applyUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.info);
        this.image.writeToParcel(parcel, i);
        parcel.writeString(this.applyUrl);
    }

    public /* synthetic */ GiftsGiftCardPartnerDto(String str, String str2, GiftsImageDto giftsImageDto, String str3, int i, zcl zclVar) {
        this(str, str2, giftsImageDto, (i & 8) != 0 ? null : str3);
    }
}
