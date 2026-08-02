package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VkRunSeasonPrizeDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonPrizeDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonPrizeDto> CREATOR = new a();

    @pmi0("collected_total")
    private final Integer collectedTotal;

    @pmi0("image")
    private final VkRunImageUrlsDto image;

    @pmi0("title")
    private final String title;

    /* compiled from: VkRunSeasonPrizeDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonPrizeDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonPrizeDto createFromParcel(Parcel parcel) {
            return new VkRunSeasonPrizeDto(parcel.readString(), VkRunImageUrlsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonPrizeDto[] newArray(int i) {
            return new VkRunSeasonPrizeDto[i];
        }
    }

    public VkRunSeasonPrizeDto(String str, VkRunImageUrlsDto vkRunImageUrlsDto, Integer num) {
        this.title = str;
        this.image = vkRunImageUrlsDto;
        this.collectedTotal = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSeasonPrizeDto)) {
            return false;
        }
        VkRunSeasonPrizeDto vkRunSeasonPrizeDto = (VkRunSeasonPrizeDto) obj;
        return epx.f(this.title, vkRunSeasonPrizeDto.title) && epx.f(this.image, vkRunSeasonPrizeDto.image) && epx.f(this.collectedTotal, vkRunSeasonPrizeDto.collectedTotal);
    }

    public final int hashCode() {
        int hashCode = (this.image.hashCode() + (this.title.hashCode() * 31)) * 31;
        Integer num = this.collectedTotal;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSeasonPrizeDto(title=");
        sb.append(this.title);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", collectedTotal=");
        return uqi.b(sb, this.collectedTotal, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.image.writeToParcel(parcel, i);
        Integer num = this.collectedTotal;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VkRunSeasonPrizeDto(String str, VkRunImageUrlsDto vkRunImageUrlsDto, Integer num, int i, zcl zclVar) {
        this(str, vkRunImageUrlsDto, (i & 4) != 0 ? null : num);
    }
}
