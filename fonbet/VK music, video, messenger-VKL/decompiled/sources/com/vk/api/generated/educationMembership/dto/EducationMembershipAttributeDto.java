package com.vk.api.generated.educationMembership.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: EducationMembershipAttributeDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipAttributeDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipAttributeDto> CREATOR = new a();

    @pmi0("code")
    private final String code;

    @pmi0("grade_ids")
    private final List<Integer> gradeIds;

    @pmi0("name")
    private final String name;

    @pmi0("subjects")
    private final List<String> subjects;

    /* compiled from: EducationMembershipAttributeDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipAttributeDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipAttributeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new EducationMembershipAttributeDto(readString, readString2, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipAttributeDto[] newArray(int i) {
            return new EducationMembershipAttributeDto[i];
        }
    }

    public EducationMembershipAttributeDto(String str, String str2, List<Integer> list, List<String> list2) {
        this.code = str;
        this.name = str2;
        this.gradeIds = list;
        this.subjects = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationMembershipAttributeDto)) {
            return false;
        }
        EducationMembershipAttributeDto educationMembershipAttributeDto = (EducationMembershipAttributeDto) obj;
        return epx.f(this.code, educationMembershipAttributeDto.code) && epx.f(this.name, educationMembershipAttributeDto.name) && epx.f(this.gradeIds, educationMembershipAttributeDto.gradeIds) && epx.f(this.subjects, educationMembershipAttributeDto.subjects);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.code.hashCode() * 31, 31, this.name);
        List<Integer> list = this.gradeIds;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.subjects;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationMembershipAttributeDto(code=");
        sb.append(this.code);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", gradeIds=");
        sb.append(this.gradeIds);
        sb.append(", subjects=");
        return ms9.a(')', sb, this.subjects);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.name);
        List<Integer> list = this.gradeIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeStringList(this.subjects);
    }

    public /* synthetic */ EducationMembershipAttributeDto(String str, String str2, List list, List list2, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
