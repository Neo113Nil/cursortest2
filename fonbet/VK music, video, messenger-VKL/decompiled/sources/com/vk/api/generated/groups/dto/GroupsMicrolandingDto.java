package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.microlandings.dto.MicrolandingsPageAdminButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: GroupsMicrolandingDto.kt */
/* loaded from: classes14.dex */
public final class GroupsMicrolandingDto implements Parcelable {
    public static final Parcelable.Creator<GroupsMicrolandingDto> CREATOR = new a();

    @pmi0("exists")
    private final boolean exists;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("new_badge_exists")
    private final boolean newBadgeExists;

    @pmi0("profile_page_admin_button")
    private final MicrolandingsPageAdminButtonDto profilePageAdminButton;

    @pmi0("promo_banner_exists")
    private final boolean promoBannerExists;

    /* compiled from: GroupsMicrolandingDto.kt */
    public static final class a implements Parcelable.Creator<GroupsMicrolandingDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsMicrolandingDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z = z2;
            }
            return new GroupsMicrolandingDto(z5, z3, z4, z, parcel.readInt() == 0 ? null : MicrolandingsPageAdminButtonDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsMicrolandingDto[] newArray(int i) {
            return new GroupsMicrolandingDto[i];
        }
    }

    public GroupsMicrolandingDto(boolean z, boolean z2, boolean z3, boolean z4, MicrolandingsPageAdminButtonDto microlandingsPageAdminButtonDto) {
        this.isEnabled = z;
        this.exists = z2;
        this.newBadgeExists = z3;
        this.promoBannerExists = z4;
        this.profilePageAdminButton = microlandingsPageAdminButtonDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsMicrolandingDto)) {
            return false;
        }
        GroupsMicrolandingDto groupsMicrolandingDto = (GroupsMicrolandingDto) obj;
        return this.isEnabled == groupsMicrolandingDto.isEnabled && this.exists == groupsMicrolandingDto.exists && this.newBadgeExists == groupsMicrolandingDto.newBadgeExists && this.promoBannerExists == groupsMicrolandingDto.promoBannerExists && epx.f(this.profilePageAdminButton, groupsMicrolandingDto.profilePageAdminButton);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.isEnabled) * 31, 31, this.exists), 31, this.newBadgeExists), 31, this.promoBannerExists);
        MicrolandingsPageAdminButtonDto microlandingsPageAdminButtonDto = this.profilePageAdminButton;
        return b + (microlandingsPageAdminButtonDto == null ? 0 : microlandingsPageAdminButtonDto.hashCode());
    }

    public final String toString() {
        return "GroupsMicrolandingDto(isEnabled=" + this.isEnabled + ", exists=" + this.exists + ", newBadgeExists=" + this.newBadgeExists + ", promoBannerExists=" + this.promoBannerExists + ", profilePageAdminButton=" + this.profilePageAdminButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.exists ? 1 : 0);
        parcel.writeInt(this.newBadgeExists ? 1 : 0);
        parcel.writeInt(this.promoBannerExists ? 1 : 0);
        MicrolandingsPageAdminButtonDto microlandingsPageAdminButtonDto = this.profilePageAdminButton;
        if (microlandingsPageAdminButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            microlandingsPageAdminButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GroupsMicrolandingDto(boolean z, boolean z2, boolean z3, boolean z4, MicrolandingsPageAdminButtonDto microlandingsPageAdminButtonDto, int i, zcl zclVar) {
        this(z, z2, z3, z4, (i & 16) != 0 ? null : microlandingsPageAdminButtonDto);
    }
}
