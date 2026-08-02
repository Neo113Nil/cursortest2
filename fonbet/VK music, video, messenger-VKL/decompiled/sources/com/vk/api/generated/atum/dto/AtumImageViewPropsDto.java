package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumImageViewPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumImageViewPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumImageViewPropsDto> CREATOR = new a();

    @pmi0("blend_color")
    private final AtumStyledColorDto blendColor;

    @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
    private final String imageUrl;

    @pmi0("local_image")
    private final String localImage;

    /* compiled from: AtumImageViewPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumImageViewPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumImageViewPropsDto createFromParcel(Parcel parcel) {
            return new AtumImageViewPropsDto(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AtumStyledColorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AtumImageViewPropsDto[] newArray(int i) {
            return new AtumImageViewPropsDto[i];
        }
    }

    public AtumImageViewPropsDto() {
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
        if (!(obj instanceof AtumImageViewPropsDto)) {
            return false;
        }
        AtumImageViewPropsDto atumImageViewPropsDto = (AtumImageViewPropsDto) obj;
        return epx.f(this.imageUrl, atumImageViewPropsDto.imageUrl) && epx.f(this.localImage, atumImageViewPropsDto.localImage) && epx.f(this.blendColor, atumImageViewPropsDto.blendColor);
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.localImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtumStyledColorDto atumStyledColorDto = this.blendColor;
        return hashCode2 + (atumStyledColorDto != null ? atumStyledColorDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumImageViewPropsDto(imageUrl=" + this.imageUrl + ", localImage=" + this.localImage + ", blendColor=" + this.blendColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.localImage);
        AtumStyledColorDto atumStyledColorDto = this.blendColor;
        if (atumStyledColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumStyledColorDto.writeToParcel(parcel, i);
        }
    }

    public AtumImageViewPropsDto(String str, String str2, AtumStyledColorDto atumStyledColorDto) {
        this.imageUrl = str;
        this.localImage = str2;
        this.blendColor = atumStyledColorDto;
    }

    public /* synthetic */ AtumImageViewPropsDto(String str, String str2, AtumStyledColorDto atumStyledColorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : atumStyledColorDto);
    }
}
