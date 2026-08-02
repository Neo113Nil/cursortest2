package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: MarketServiceRatingCriteriaItemDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingCriteriaItemDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingCriteriaItemDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("is_achieved")
    private final Boolean isAchieved;

    @pmi0("slug")
    private final String slug;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketServiceRatingCriteriaItemDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingCriteriaItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingCriteriaItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketServiceRatingCriteriaItemDto(readString, readString2, valueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingCriteriaItemDto[] newArray(int i) {
            return new MarketServiceRatingCriteriaItemDto[i];
        }
    }

    public MarketServiceRatingCriteriaItemDto() {
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
        if (!(obj instanceof MarketServiceRatingCriteriaItemDto)) {
            return false;
        }
        MarketServiceRatingCriteriaItemDto marketServiceRatingCriteriaItemDto = (MarketServiceRatingCriteriaItemDto) obj;
        return epx.f(this.title, marketServiceRatingCriteriaItemDto.title) && epx.f(this.description, marketServiceRatingCriteriaItemDto.description) && epx.f(this.isAchieved, marketServiceRatingCriteriaItemDto.isAchieved) && epx.f(this.slug, marketServiceRatingCriteriaItemDto.slug);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAchieved;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.slug;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServiceRatingCriteriaItemDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", isAchieved=");
        sb.append(this.isAchieved);
        sb.append(", slug=");
        return ho8.a(sb, this.slug, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Boolean bool = this.isAchieved;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.slug);
    }

    public MarketServiceRatingCriteriaItemDto(String str, String str2, Boolean bool, String str3) {
        this.title = str;
        this.description = str2;
        this.isAchieved = bool;
        this.slug = str3;
    }

    public /* synthetic */ MarketServiceRatingCriteriaItemDto(String str, String str2, Boolean bool, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3);
    }
}
