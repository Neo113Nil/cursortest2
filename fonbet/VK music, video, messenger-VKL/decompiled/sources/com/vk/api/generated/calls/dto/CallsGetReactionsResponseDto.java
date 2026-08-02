package com.vk.api.generated.calls.dto;

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

/* compiled from: CallsGetReactionsResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsGetReactionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsGetReactionsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<CallsReactionDto> items;

    /* compiled from: CallsGetReactionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsGetReactionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGetReactionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CallsReactionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new CallsGetReactionsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGetReactionsResponseDto[] newArray(int i) {
            return new CallsGetReactionsResponseDto[i];
        }
    }

    public CallsGetReactionsResponseDto(List<CallsReactionDto> list) {
        this.items = list;
    }

    public final List<CallsReactionDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallsGetReactionsResponseDto) && epx.f(this.items, ((CallsGetReactionsResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CallsGetReactionsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((CallsReactionDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
