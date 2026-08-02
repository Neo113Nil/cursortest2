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

/* compiled from: EducationMembershipGetRequestsResponseDto.kt */
/* loaded from: classes14.dex */
public final class EducationMembershipGetRequestsResponseDto implements Parcelable {
    public static final Parcelable.Creator<EducationMembershipGetRequestsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("list")
    private final List<EducationMembershipRequestDto> list;

    /* compiled from: EducationMembershipGetRequestsResponseDto.kt */
    public static final class a implements Parcelable.Creator<EducationMembershipGetRequestsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationMembershipGetRequestsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(EducationMembershipRequestDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new EducationMembershipGetRequestsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationMembershipGetRequestsResponseDto[] newArray(int i) {
            return new EducationMembershipGetRequestsResponseDto[i];
        }
    }

    public EducationMembershipGetRequestsResponseDto(int i, List<EducationMembershipRequestDto> list) {
        this.count = i;
        this.list = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationMembershipGetRequestsResponseDto)) {
            return false;
        }
        EducationMembershipGetRequestsResponseDto educationMembershipGetRequestsResponseDto = (EducationMembershipGetRequestsResponseDto) obj;
        return this.count == educationMembershipGetRequestsResponseDto.count && epx.f(this.list, educationMembershipGetRequestsResponseDto.list);
    }

    public final int hashCode() {
        return this.list.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationMembershipGetRequestsResponseDto(count=");
        sb.append(this.count);
        sb.append(", list=");
        return ms9.a(')', sb, this.list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.list);
        while (a2.hasNext()) {
            ((EducationMembershipRequestDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
