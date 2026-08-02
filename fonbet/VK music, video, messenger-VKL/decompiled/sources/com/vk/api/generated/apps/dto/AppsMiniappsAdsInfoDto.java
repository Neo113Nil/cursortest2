package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMiniappsAdsInfoDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsAdsInfoDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsAdsInfoDto> CREATOR = new a();

    @pmi0("ad_data_view")
    private final String adDataView;

    @pmi0("advertiser_link")
    private final String advertiserLink;

    @pmi0("age_restriction")
    private final Integer ageRestriction;

    @pmi0("age_restriction_text")
    private final String ageRestrictionText;

    @pmi0("erid")
    private final String erid;

    @pmi0("link")
    private final String link;

    @pmi0("photo")
    private final String photo;

    /* compiled from: AppsMiniappsAdsInfoDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsAdsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsAdsInfoDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsAdsInfoDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsAdsInfoDto[] newArray(int i) {
            return new AppsMiniappsAdsInfoDto[i];
        }
    }

    public AppsMiniappsAdsInfoDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsAdsInfoDto)) {
            return false;
        }
        AppsMiniappsAdsInfoDto appsMiniappsAdsInfoDto = (AppsMiniappsAdsInfoDto) obj;
        return epx.f(this.ageRestriction, appsMiniappsAdsInfoDto.ageRestriction) && epx.f(this.ageRestrictionText, appsMiniappsAdsInfoDto.ageRestrictionText) && epx.f(this.link, appsMiniappsAdsInfoDto.link) && epx.f(this.erid, appsMiniappsAdsInfoDto.erid) && epx.f(this.photo, appsMiniappsAdsInfoDto.photo) && epx.f(this.advertiserLink, appsMiniappsAdsInfoDto.advertiserLink) && epx.f(this.adDataView, appsMiniappsAdsInfoDto.adDataView);
    }

    public final int hashCode() {
        Integer num = this.ageRestriction;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.ageRestrictionText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.erid;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.advertiserLink;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.adDataView;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsAdsInfoDto(ageRestriction=");
        sb.append(this.ageRestriction);
        sb.append(", ageRestrictionText=");
        sb.append(this.ageRestrictionText);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", erid=");
        sb.append(this.erid);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", advertiserLink=");
        sb.append(this.advertiserLink);
        sb.append(", adDataView=");
        return ho8.a(sb, this.adDataView, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.ageRestriction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.ageRestrictionText);
        parcel.writeString(this.link);
        parcel.writeString(this.erid);
        parcel.writeString(this.photo);
        parcel.writeString(this.advertiserLink);
        parcel.writeString(this.adDataView);
    }

    public AppsMiniappsAdsInfoDto(Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.ageRestriction = num;
        this.ageRestrictionText = str;
        this.link = str2;
        this.erid = str3;
        this.photo = str4;
        this.advertiserLink = str5;
        this.adDataView = str6;
    }

    public /* synthetic */ AppsMiniappsAdsInfoDto(Integer num, String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
