package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: BusinessGroupsShieldSettingsButtonDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsShieldSettingsButtonDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsShieldSettingsButtonDto> CREATOR = new a();

    @pmi0("is_active")
    private final boolean isActive;

    @pmi0("link")
    private final String link;

    @pmi0("text")
    private final String text;

    /* compiled from: BusinessGroupsShieldSettingsButtonDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsShieldSettingsButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsButtonDto createFromParcel(Parcel parcel) {
            return new BusinessGroupsShieldSettingsButtonDto(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsButtonDto[] newArray(int i) {
            return new BusinessGroupsShieldSettingsButtonDto[i];
        }
    }

    public BusinessGroupsShieldSettingsButtonDto(String str, String str2, boolean z) {
        this.text = str;
        this.link = str2;
        this.isActive = z;
    }

    public final String d() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGroupsShieldSettingsButtonDto)) {
            return false;
        }
        BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto = (BusinessGroupsShieldSettingsButtonDto) obj;
        return epx.f(this.text, businessGroupsShieldSettingsButtonDto.text) && epx.f(this.link, businessGroupsShieldSettingsButtonDto.link) && this.isActive == businessGroupsShieldSettingsButtonDto.isActive;
    }

    public final boolean f() {
        return this.isActive;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isActive) + urd0.a(this.text.hashCode() * 31, 31, this.link);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessGroupsShieldSettingsButtonDto(text=");
        sb.append(this.text);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", isActive=");
        return q0.a(sb, this.isActive, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.link);
        parcel.writeInt(this.isActive ? 1 : 0);
    }
}
