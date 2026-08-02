package com.vk.api.generated.educationMembership.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: EducationMembershipRoleDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipRoleDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipRoleDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0("name")
    private final String name;

    @pmi0("positions")
    private final List<EducationMembershipPositionDto> positions;

    /* compiled from: EducationMembershipRoleDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipRoleDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(EducationMembershipPositionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new EducationMembershipRoleDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipRoleDto[] newArray(int i) {
            return new EducationMembershipRoleDto[i];
        }
    }

    public EducationMembershipRoleDto(String str, String str2, List<EducationMembershipPositionDto> list) {
        this.code = str;
        this.name = str2;
        this.positions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationMembershipRoleDto)) {
            return false;
        }
        EducationMembershipRoleDto educationMembershipRoleDto = (EducationMembershipRoleDto) obj;
        return epx.f(this.code, educationMembershipRoleDto.code) && epx.f(this.name, educationMembershipRoleDto.name) && epx.f(this.positions, educationMembershipRoleDto.positions);
    }

    public final int hashCode() {
        return this.positions.hashCode() + urd0.a(this.code.hashCode() * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationMembershipRoleDto(code=");
        sb.append(this.code);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", positions=");
        return ms9.a(')', sb, this.positions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.positions);
        while (a2.hasNext()) {
            ((EducationMembershipPositionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
