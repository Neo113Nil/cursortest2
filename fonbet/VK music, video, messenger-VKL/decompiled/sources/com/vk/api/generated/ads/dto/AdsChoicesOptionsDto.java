package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AdsChoicesOptionsDto.kt */
/* loaded from: classes14.dex */
public final class AdsChoicesOptionsDto implements Parcelable {
    public static final Parcelable.Creator<AdsChoicesOptionsDto> CREATOR = new a();

    @pmi0("alias")
    private final String alias;

    @pmi0("click_link")
    private final String clickLink;

    @pmi0("copy_text")
    private final String copyText;

    @pmi0("id")
    private final Integer id;

    @pmi0("name")
    private final String name;

    @pmi0("should_close_ad")
    private final Boolean shouldCloseAd;

    @pmi0("type")
    private final String type;

    /* compiled from: AdsChoicesOptionsDto.kt */
    public static final class a implements Parcelable.Creator<AdsChoicesOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsChoicesOptionsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Integer num;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
                num = null;
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AdsChoicesOptionsDto(readString, readString2, readString3, readString4, valueOf, readString5, num);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsChoicesOptionsDto[] newArray(int i) {
            return new AdsChoicesOptionsDto[i];
        }
    }

    public AdsChoicesOptionsDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final String d() {
        return this.alias;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.clickLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsChoicesOptionsDto)) {
            return false;
        }
        AdsChoicesOptionsDto adsChoicesOptionsDto = (AdsChoicesOptionsDto) obj;
        return epx.f(this.alias, adsChoicesOptionsDto.alias) && epx.f(this.type, adsChoicesOptionsDto.type) && epx.f(this.name, adsChoicesOptionsDto.name) && epx.f(this.clickLink, adsChoicesOptionsDto.clickLink) && epx.f(this.shouldCloseAd, adsChoicesOptionsDto.shouldCloseAd) && epx.f(this.copyText, adsChoicesOptionsDto.copyText) && epx.f(this.id, adsChoicesOptionsDto.id);
    }

    public final String f() {
        return this.copyText;
    }

    public final Integer g() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.alias;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clickLink;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.shouldCloseAd;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.copyText;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.id;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String i() {
        return this.name;
    }

    public final Boolean j() {
        return this.shouldCloseAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsChoicesOptionsDto(alias=");
        sb.append(this.alias);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", clickLink=");
        sb.append(this.clickLink);
        sb.append(", shouldCloseAd=");
        sb.append(this.shouldCloseAd);
        sb.append(", copyText=");
        sb.append(this.copyText);
        sb.append(", id=");
        return uqi.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.alias);
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeString(this.clickLink);
        Boolean bool = this.shouldCloseAd;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.copyText);
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public AdsChoicesOptionsDto(String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num) {
        this.alias = str;
        this.type = str2;
        this.name = str3;
        this.clickLink = str4;
        this.shouldCloseAd = bool;
        this.copyText = str5;
        this.id = num;
    }

    public /* synthetic */ AdsChoicesOptionsDto(String str, String str2, String str3, String str4, Boolean bool, String str5, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num);
    }
}
