package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: VkRunImageUrlsDto.kt */
/* loaded from: classes15.dex */
public final class VkRunImageUrlsDto implements Parcelable {
    public static final Parcelable.Creator<VkRunImageUrlsDto> CREATOR = new a();

    @pmi0("image_1x")
    private final String image1x;

    @pmi0("image_2x")
    private final String image2x;

    @pmi0("image_3x")
    private final String image3x;

    @pmi0("image_4x")
    private final String image4x;

    /* compiled from: VkRunImageUrlsDto.kt */
    public static final class a implements Parcelable.Creator<VkRunImageUrlsDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunImageUrlsDto createFromParcel(Parcel parcel) {
            return new VkRunImageUrlsDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunImageUrlsDto[] newArray(int i) {
            return new VkRunImageUrlsDto[i];
        }
    }

    public VkRunImageUrlsDto(String str, String str2, String str3, String str4) {
        this.image1x = str;
        this.image2x = str2;
        this.image3x = str3;
        this.image4x = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunImageUrlsDto)) {
            return false;
        }
        VkRunImageUrlsDto vkRunImageUrlsDto = (VkRunImageUrlsDto) obj;
        return epx.f(this.image1x, vkRunImageUrlsDto.image1x) && epx.f(this.image2x, vkRunImageUrlsDto.image2x) && epx.f(this.image3x, vkRunImageUrlsDto.image3x) && epx.f(this.image4x, vkRunImageUrlsDto.image4x);
    }

    public final int hashCode() {
        return this.image4x.hashCode() + urd0.a(urd0.a(this.image1x.hashCode() * 31, 31, this.image2x), 31, this.image3x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunImageUrlsDto(image1x=");
        sb.append(this.image1x);
        sb.append(", image2x=");
        sb.append(this.image2x);
        sb.append(", image3x=");
        sb.append(this.image3x);
        sb.append(", image4x=");
        return ho8.a(sb, this.image4x, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.image1x);
        parcel.writeString(this.image2x);
        parcel.writeString(this.image3x);
        parcel.writeString(this.image4x);
    }
}
