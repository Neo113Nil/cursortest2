package com.vk.api.generated.marketCarousel.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketCarouselGroupInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketCarouselGroupInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketCarouselGroupInfoDto> CREATOR = new a();

    @pmi0("group_name")
    private final String groupName;

    @pmi0("is_group_verified")
    private final Boolean isGroupVerified;

    /* compiled from: MarketCarouselGroupInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketCarouselGroupInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCarouselGroupInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketCarouselGroupInfoDto(valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCarouselGroupInfoDto[] newArray(int i) {
            return new MarketCarouselGroupInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketCarouselGroupInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCarouselGroupInfoDto)) {
            return false;
        }
        MarketCarouselGroupInfoDto marketCarouselGroupInfoDto = (MarketCarouselGroupInfoDto) obj;
        return epx.f(this.isGroupVerified, marketCarouselGroupInfoDto.isGroupVerified) && epx.f(this.groupName, marketCarouselGroupInfoDto.groupName);
    }

    public final int hashCode() {
        Boolean bool = this.isGroupVerified;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.groupName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCarouselGroupInfoDto(isGroupVerified=");
        sb.append(this.isGroupVerified);
        sb.append(", groupName=");
        return ho8.a(sb, this.groupName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isGroupVerified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.groupName);
    }

    public MarketCarouselGroupInfoDto(Boolean bool, String str) {
        this.isGroupVerified = bool;
        this.groupName = str;
    }

    public /* synthetic */ MarketCarouselGroupInfoDto(Boolean bool, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }
}
