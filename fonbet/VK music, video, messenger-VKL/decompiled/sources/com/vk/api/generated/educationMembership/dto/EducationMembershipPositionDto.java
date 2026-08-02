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

/* compiled from: EducationMembershipPositionDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipPositionDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipPositionDto> CREATOR = new a();

    @pmi0("attributes")
    private final List<EducationMembershipAttributeDto> attributes;

    @pmi0("code")
    private final String code;

    @pmi0("name")
    private final String name;

    /* compiled from: EducationMembershipPositionDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipPositionDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipPositionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(EducationMembershipAttributeDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new EducationMembershipPositionDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipPositionDto[] newArray(int i) {
            return new EducationMembershipPositionDto[i];
        }
    }

    public EducationMembershipPositionDto(String str, String str2, List<EducationMembershipAttributeDto> list) {
        this.code = str;
        this.name = str2;
        this.attributes = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationMembershipPositionDto)) {
            return false;
        }
        EducationMembershipPositionDto educationMembershipPositionDto = (EducationMembershipPositionDto) obj;
        return epx.f(this.code, educationMembershipPositionDto.code) && epx.f(this.name, educationMembershipPositionDto.name) && epx.f(this.attributes, educationMembershipPositionDto.attributes);
    }

    public final int hashCode() {
        return this.attributes.hashCode() + urd0.a(this.code.hashCode() * 31, 31, this.name);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationMembershipPositionDto(code=");
        sb.append(this.code);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", attributes=");
        return ms9.a(')', sb, this.attributes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.attributes);
        while (a2.hasNext()) {
            ((EducationMembershipAttributeDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
