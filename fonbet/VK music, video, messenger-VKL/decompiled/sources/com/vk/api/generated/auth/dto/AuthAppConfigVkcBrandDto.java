package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: AuthAppConfigVkcBrandDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigVkcBrandDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigVkcBrandDto> CREATOR = new a();

    @pmi0("mobile_header")
    private final String mobileHeader;

    @pmi0("promo_header")
    private final String promoHeader;

    @pmi0("remove_brand")
    private final Boolean removeBrand;

    @pmi0("site_header_brand")
    private final String siteHeaderBrand;

    @pmi0("title")
    private final String title;

    /* compiled from: AuthAppConfigVkcBrandDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigVkcBrandDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigVkcBrandDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthAppConfigVkcBrandDto(readString, readString2, valueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigVkcBrandDto[] newArray(int i) {
            return new AuthAppConfigVkcBrandDto[i];
        }
    }

    public AuthAppConfigVkcBrandDto() {
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
        if (!(obj instanceof AuthAppConfigVkcBrandDto)) {
            return false;
        }
        AuthAppConfigVkcBrandDto authAppConfigVkcBrandDto = (AuthAppConfigVkcBrandDto) obj;
        return epx.f(this.title, authAppConfigVkcBrandDto.title) && epx.f(this.siteHeaderBrand, authAppConfigVkcBrandDto.siteHeaderBrand) && epx.f(this.removeBrand, authAppConfigVkcBrandDto.removeBrand) && epx.f(this.promoHeader, authAppConfigVkcBrandDto.promoHeader) && epx.f(this.mobileHeader, authAppConfigVkcBrandDto.mobileHeader);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.siteHeaderBrand;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.removeBrand;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.promoHeader;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mobileHeader;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthAppConfigVkcBrandDto(title=");
        sb.append(this.title);
        sb.append(", siteHeaderBrand=");
        sb.append(this.siteHeaderBrand);
        sb.append(", removeBrand=");
        sb.append(this.removeBrand);
        sb.append(", promoHeader=");
        sb.append(this.promoHeader);
        sb.append(", mobileHeader=");
        return ho8.a(sb, this.mobileHeader, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.siteHeaderBrand);
        Boolean bool = this.removeBrand;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.promoHeader);
        parcel.writeString(this.mobileHeader);
    }

    public AuthAppConfigVkcBrandDto(String str, String str2, Boolean bool, String str3, String str4) {
        this.title = str;
        this.siteHeaderBrand = str2;
        this.removeBrand = bool;
        this.promoHeader = str3;
        this.mobileHeader = str4;
    }

    public /* synthetic */ AuthAppConfigVkcBrandDto(String str, String str2, Boolean bool, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
