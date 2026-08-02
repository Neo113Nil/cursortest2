package com.vk.api.generated.reports.dto;

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

/* compiled from: ReportsGetReasonsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ReportsGetReasonsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ReportsGetReasonsResponseDto> CREATOR = new a();

    @pmi0("reasons")
    private final List<ReportsReasonDto> reasons;

    /* compiled from: ReportsGetReasonsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ReportsGetReasonsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ReportsGetReasonsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ReportsReasonDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ReportsGetReasonsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ReportsGetReasonsResponseDto[] newArray(int i) {
            return new ReportsGetReasonsResponseDto[i];
        }
    }

    public ReportsGetReasonsResponseDto(List<ReportsReasonDto> list) {
        this.reasons = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReportsGetReasonsResponseDto) && epx.f(this.reasons, ((ReportsGetReasonsResponseDto) obj).reasons);
    }

    public final int hashCode() {
        return this.reasons.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ReportsGetReasonsResponseDto(reasons="), this.reasons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.reasons);
        while (a2.hasNext()) {
            ((ReportsReasonDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
