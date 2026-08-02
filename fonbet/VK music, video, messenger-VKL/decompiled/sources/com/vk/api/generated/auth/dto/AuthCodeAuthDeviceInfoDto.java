package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthCodeAuthDeviceInfoDto.kt */
/* loaded from: classes14.dex */
public final class AuthCodeAuthDeviceInfoDto implements Parcelable {
    public static final Parcelable.Creator<AuthCodeAuthDeviceInfoDto> CREATOR = new a();

    @pmi0("browser_name")
    private final String browserName;

    @pmi0("browser_package")
    private final String browserPackage;

    @pmi0("browser_page_link")
    private final String browserPageLink;

    @pmi0("browser_url_scheme")
    private final String browserUrlScheme;

    @pmi0("ip")
    private final String ip;

    @pmi0("location")
    private final String location;

    @pmi0("location_map")
    private final String locationMap;

    @pmi0("name")
    private final String name;

    /* compiled from: AuthCodeAuthDeviceInfoDto.kt */
    public static final class a implements Parcelable.Creator<AuthCodeAuthDeviceInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCodeAuthDeviceInfoDto createFromParcel(Parcel parcel) {
            return new AuthCodeAuthDeviceInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCodeAuthDeviceInfoDto[] newArray(int i) {
            return new AuthCodeAuthDeviceInfoDto[i];
        }
    }

    public AuthCodeAuthDeviceInfoDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final String d() {
        return this.browserName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.ip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCodeAuthDeviceInfoDto)) {
            return false;
        }
        AuthCodeAuthDeviceInfoDto authCodeAuthDeviceInfoDto = (AuthCodeAuthDeviceInfoDto) obj;
        return epx.f(this.name, authCodeAuthDeviceInfoDto.name) && epx.f(this.ip, authCodeAuthDeviceInfoDto.ip) && epx.f(this.browserName, authCodeAuthDeviceInfoDto.browserName) && epx.f(this.location, authCodeAuthDeviceInfoDto.location) && epx.f(this.locationMap, authCodeAuthDeviceInfoDto.locationMap) && epx.f(this.browserPageLink, authCodeAuthDeviceInfoDto.browserPageLink) && epx.f(this.browserUrlScheme, authCodeAuthDeviceInfoDto.browserUrlScheme) && epx.f(this.browserPackage, authCodeAuthDeviceInfoDto.browserPackage);
    }

    public final String f() {
        return this.location;
    }

    public final String g() {
        return this.locationMap;
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ip;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.browserName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.location;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locationMap;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.browserPageLink;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.browserUrlScheme;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.browserPackage;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String i() {
        return this.name;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeAuthDeviceInfoDto(name=");
        sb.append(this.name);
        sb.append(", ip=");
        sb.append(this.ip);
        sb.append(", browserName=");
        sb.append(this.browserName);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", locationMap=");
        sb.append(this.locationMap);
        sb.append(", browserPageLink=");
        sb.append(this.browserPageLink);
        sb.append(", browserUrlScheme=");
        sb.append(this.browserUrlScheme);
        sb.append(", browserPackage=");
        return ho8.a(sb, this.browserPackage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.ip);
        parcel.writeString(this.browserName);
        parcel.writeString(this.location);
        parcel.writeString(this.locationMap);
        parcel.writeString(this.browserPageLink);
        parcel.writeString(this.browserUrlScheme);
        parcel.writeString(this.browserPackage);
    }

    public AuthCodeAuthDeviceInfoDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.name = str;
        this.ip = str2;
        this.browserName = str3;
        this.location = str4;
        this.locationMap = str5;
        this.browserPageLink = str6;
        this.browserUrlScheme = str7;
        this.browserPackage = str8;
    }

    public /* synthetic */ AuthCodeAuthDeviceInfoDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}
