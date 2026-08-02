package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: DonutGetGoalsResponseDto.kt */
/* loaded from: classes14.dex */
public final class DonutGetGoalsResponseDto implements Parcelable {
    public static final Parcelable.Creator<DonutGetGoalsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("goals")
    private final List<DonutGoalDto> goals;

    /* compiled from: DonutGetGoalsResponseDto.kt */
    public static final class a implements Parcelable.Creator<DonutGetGoalsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGetGoalsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(DonutGetGoalsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new DonutGetGoalsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGetGoalsResponseDto[] newArray(int i) {
            return new DonutGetGoalsResponseDto[i];
        }
    }

    public DonutGetGoalsResponseDto(int i, List<DonutGoalDto> list) {
        this.count = i;
        this.goals = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGetGoalsResponseDto)) {
            return false;
        }
        DonutGetGoalsResponseDto donutGetGoalsResponseDto = (DonutGetGoalsResponseDto) obj;
        return this.count == donutGetGoalsResponseDto.count && epx.f(this.goals, donutGetGoalsResponseDto.goals);
    }

    public final int hashCode() {
        return this.goals.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGetGoalsResponseDto(count=");
        sb.append(this.count);
        sb.append(", goals=");
        return ms9.a(')', sb, this.goals);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.goals);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
