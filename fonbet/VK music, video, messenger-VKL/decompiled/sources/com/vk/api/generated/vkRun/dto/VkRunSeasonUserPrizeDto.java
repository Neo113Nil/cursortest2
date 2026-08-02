package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VkRunSeasonUserPrizeDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonUserPrizeDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonUserPrizeDto> CREATOR = new a();

    @pmi0("extra_data")
    private final VkRunUserSeasonExtraDataDto extraData;

    @pmi0("image")
    private final VkRunImageUrlsDto image;

    @pmi0("title")
    private final String title;

    /* compiled from: VkRunSeasonUserPrizeDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonUserPrizeDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonUserPrizeDto createFromParcel(Parcel parcel) {
            return new VkRunSeasonUserPrizeDto(parcel.readString(), VkRunImageUrlsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VkRunUserSeasonExtraDataDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonUserPrizeDto[] newArray(int i) {
            return new VkRunSeasonUserPrizeDto[i];
        }
    }

    public VkRunSeasonUserPrizeDto(String str, VkRunImageUrlsDto vkRunImageUrlsDto, VkRunUserSeasonExtraDataDto vkRunUserSeasonExtraDataDto) {
        this.title = str;
        this.image = vkRunImageUrlsDto;
        this.extraData = vkRunUserSeasonExtraDataDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSeasonUserPrizeDto)) {
            return false;
        }
        VkRunSeasonUserPrizeDto vkRunSeasonUserPrizeDto = (VkRunSeasonUserPrizeDto) obj;
        return epx.f(this.title, vkRunSeasonUserPrizeDto.title) && epx.f(this.image, vkRunSeasonUserPrizeDto.image) && epx.f(this.extraData, vkRunSeasonUserPrizeDto.extraData);
    }

    public final int hashCode() {
        int hashCode = (this.image.hashCode() + (this.title.hashCode() * 31)) * 31;
        VkRunUserSeasonExtraDataDto vkRunUserSeasonExtraDataDto = this.extraData;
        return hashCode + (vkRunUserSeasonExtraDataDto == null ? 0 : vkRunUserSeasonExtraDataDto.hashCode());
    }

    public final String toString() {
        return "VkRunSeasonUserPrizeDto(title=" + this.title + ", image=" + this.image + ", extraData=" + this.extraData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.image.writeToParcel(parcel, i);
        VkRunUserSeasonExtraDataDto vkRunUserSeasonExtraDataDto = this.extraData;
        if (vkRunUserSeasonExtraDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkRunUserSeasonExtraDataDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkRunSeasonUserPrizeDto(String str, VkRunImageUrlsDto vkRunImageUrlsDto, VkRunUserSeasonExtraDataDto vkRunUserSeasonExtraDataDto, int i, zcl zclVar) {
        this(str, vkRunImageUrlsDto, (i & 4) != 0 ? null : vkRunUserSeasonExtraDataDto);
    }
}
