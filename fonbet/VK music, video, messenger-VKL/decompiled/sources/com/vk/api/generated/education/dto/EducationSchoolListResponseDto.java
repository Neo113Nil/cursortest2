package com.vk.api.generated.education.dto;

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

/* compiled from: EducationSchoolListResponseDto.kt */
/* loaded from: classes14.dex */
public final class EducationSchoolListResponseDto implements Parcelable {
    public static final Parcelable.Creator<EducationSchoolListResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<EducationSchoolEduItemDto> items;

    /* compiled from: EducationSchoolListResponseDto.kt */
    public static final class a implements Parcelable.Creator<EducationSchoolListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationSchoolListResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(EducationSchoolEduItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new EducationSchoolListResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationSchoolListResponseDto[] newArray(int i) {
            return new EducationSchoolListResponseDto[i];
        }
    }

    public EducationSchoolListResponseDto(int i, List<EducationSchoolEduItemDto> list) {
        this.count = i;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationSchoolListResponseDto)) {
            return false;
        }
        EducationSchoolListResponseDto educationSchoolListResponseDto = (EducationSchoolListResponseDto) obj;
        return this.count == educationSchoolListResponseDto.count && epx.f(this.items, educationSchoolListResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationSchoolListResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((EducationSchoolEduItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
