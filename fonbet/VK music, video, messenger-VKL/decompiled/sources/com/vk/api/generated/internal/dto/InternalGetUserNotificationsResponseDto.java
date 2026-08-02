package com.vk.api.generated.internal.dto;

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

/* compiled from: InternalGetUserNotificationsResponseDto.kt */
/* loaded from: classes14.dex */
public final class InternalGetUserNotificationsResponseDto implements Parcelable {
    public static final Parcelable.Creator<InternalGetUserNotificationsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<Integer> items;

    /* compiled from: InternalGetUserNotificationsResponseDto.kt */
    public static final class a implements Parcelable.Creator<InternalGetUserNotificationsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final InternalGetUserNotificationsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new InternalGetUserNotificationsResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalGetUserNotificationsResponseDto[] newArray(int i) {
            return new InternalGetUserNotificationsResponseDto[i];
        }
    }

    public InternalGetUserNotificationsResponseDto(int i, List<Integer> list) {
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
        if (!(obj instanceof InternalGetUserNotificationsResponseDto)) {
            return false;
        }
        InternalGetUserNotificationsResponseDto internalGetUserNotificationsResponseDto = (InternalGetUserNotificationsResponseDto) obj;
        return this.count == internalGetUserNotificationsResponseDto.count && epx.f(this.items, internalGetUserNotificationsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalGetUserNotificationsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
