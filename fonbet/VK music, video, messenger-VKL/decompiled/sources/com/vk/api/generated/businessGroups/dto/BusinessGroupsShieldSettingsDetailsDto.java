package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: BusinessGroupsShieldSettingsDetailsDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsShieldSettingsDetailsDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsShieldSettingsDetailsDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("reason")
    private final String reason;

    /* compiled from: BusinessGroupsShieldSettingsDetailsDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsShieldSettingsDetailsDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsDetailsDto createFromParcel(Parcel parcel) {
            return new BusinessGroupsShieldSettingsDetailsDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsDetailsDto[] newArray(int i) {
            return new BusinessGroupsShieldSettingsDetailsDto[i];
        }
    }

    public BusinessGroupsShieldSettingsDetailsDto(String str, String str2) {
        this.reason = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGroupsShieldSettingsDetailsDto)) {
            return false;
        }
        BusinessGroupsShieldSettingsDetailsDto businessGroupsShieldSettingsDetailsDto = (BusinessGroupsShieldSettingsDetailsDto) obj;
        return epx.f(this.reason, businessGroupsShieldSettingsDetailsDto.reason) && epx.f(this.description, businessGroupsShieldSettingsDetailsDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.reason.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessGroupsShieldSettingsDetailsDto(reason=");
        sb.append(this.reason);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.reason);
        parcel.writeString(this.description);
    }
}
