package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BusinessGroupsShieldSettingsImageDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsShieldSettingsImageDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsShieldSettingsImageDto> CREATOR = new a();

    @pmi0("dark")
    private final String dark;

    @pmi0("light")
    private final String light;

    /* compiled from: BusinessGroupsShieldSettingsImageDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsShieldSettingsImageDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsImageDto createFromParcel(Parcel parcel) {
            return new BusinessGroupsShieldSettingsImageDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsImageDto[] newArray(int i) {
            return new BusinessGroupsShieldSettingsImageDto[i];
        }
    }

    public BusinessGroupsShieldSettingsImageDto(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public final String d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.light;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGroupsShieldSettingsImageDto)) {
            return false;
        }
        BusinessGroupsShieldSettingsImageDto businessGroupsShieldSettingsImageDto = (BusinessGroupsShieldSettingsImageDto) obj;
        return epx.f(this.light, businessGroupsShieldSettingsImageDto.light) && epx.f(this.dark, businessGroupsShieldSettingsImageDto.dark);
    }

    public final int hashCode() {
        return this.dark.hashCode() + (this.light.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessGroupsShieldSettingsImageDto(light=");
        sb.append(this.light);
        sb.append(", dark=");
        return ho8.a(sb, this.dark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
    }
}
