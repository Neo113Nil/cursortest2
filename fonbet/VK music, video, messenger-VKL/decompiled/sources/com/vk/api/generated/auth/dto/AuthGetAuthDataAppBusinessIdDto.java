package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: AuthGetAuthDataAppBusinessIdDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataAppBusinessIdDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataAppBusinessIdDto> CREATOR = new a();

    @pmi0("can_create_org")
    private final boolean canCreateOrg;

    @pmi0("disable_show_banner")
    private final boolean disableShowBanner;

    @pmi0("disable_show_org_list")
    private final boolean disableShowOrgList;

    @pmi0("enabled")
    private final boolean enabled;

    /* compiled from: AuthGetAuthDataAppBusinessIdDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataAppBusinessIdDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppBusinessIdDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataAppBusinessIdDto(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppBusinessIdDto[] newArray(int i) {
            return new AuthGetAuthDataAppBusinessIdDto[i];
        }
    }

    public AuthGetAuthDataAppBusinessIdDto(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enabled = z;
        this.canCreateOrg = z2;
        this.disableShowOrgList = z3;
        this.disableShowBanner = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataAppBusinessIdDto)) {
            return false;
        }
        AuthGetAuthDataAppBusinessIdDto authGetAuthDataAppBusinessIdDto = (AuthGetAuthDataAppBusinessIdDto) obj;
        return this.enabled == authGetAuthDataAppBusinessIdDto.enabled && this.canCreateOrg == authGetAuthDataAppBusinessIdDto.canCreateOrg && this.disableShowOrgList == authGetAuthDataAppBusinessIdDto.disableShowOrgList && this.disableShowBanner == authGetAuthDataAppBusinessIdDto.disableShowBanner;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.disableShowBanner) + qoy.b(qoy.b(Boolean.hashCode(this.enabled) * 31, 31, this.canCreateOrg), 31, this.disableShowOrgList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataAppBusinessIdDto(enabled=");
        sb.append(this.enabled);
        sb.append(", canCreateOrg=");
        sb.append(this.canCreateOrg);
        sb.append(", disableShowOrgList=");
        sb.append(this.disableShowOrgList);
        sb.append(", disableShowBanner=");
        return q0.a(sb, this.disableShowBanner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeInt(this.canCreateOrg ? 1 : 0);
        parcel.writeInt(this.disableShowOrgList ? 1 : 0);
        parcel.writeInt(this.disableShowBanner ? 1 : 0);
    }
}
