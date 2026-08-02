package com.vk.api.generated.statEvents.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;

/* compiled from: StatEventsBaseResponseDto.kt */
/* loaded from: classes15.dex */
public final class StatEventsBaseResponseDto implements Parcelable {
    public static final Parcelable.Creator<StatEventsBaseResponseDto> CREATOR = new a();

    @pmi0("failed_ids")
    private final List<Integer> failedIds;

    /* compiled from: StatEventsBaseResponseDto.kt */
    public static final class a implements Parcelable.Creator<StatEventsBaseResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StatEventsBaseResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new StatEventsBaseResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StatEventsBaseResponseDto[] newArray(int i) {
            return new StatEventsBaseResponseDto[i];
        }
    }

    public StatEventsBaseResponseDto(List<Integer> list) {
        this.failedIds = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatEventsBaseResponseDto) && epx.f(this.failedIds, ((StatEventsBaseResponseDto) obj).failedIds);
    }

    public final int hashCode() {
        return this.failedIds.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StatEventsBaseResponseDto(failedIds="), this.failedIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.failedIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
