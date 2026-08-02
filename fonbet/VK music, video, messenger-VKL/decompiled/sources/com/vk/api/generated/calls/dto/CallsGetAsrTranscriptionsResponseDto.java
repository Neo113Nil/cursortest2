package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: CallsGetAsrTranscriptionsResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsGetAsrTranscriptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsGetAsrTranscriptionsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<CallsAsrTranscriptionItemDto> items;

    /* compiled from: CallsGetAsrTranscriptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsGetAsrTranscriptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsGetAsrTranscriptionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(CallsAsrTranscriptionItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new CallsGetAsrTranscriptionsResponseDto(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsGetAsrTranscriptionsResponseDto[] newArray(int i) {
            return new CallsGetAsrTranscriptionsResponseDto[i];
        }
    }

    public CallsGetAsrTranscriptionsResponseDto(List<CallsAsrTranscriptionItemDto> list, int i) {
        this.items = list;
        this.count = i;
    }

    public final List<CallsAsrTranscriptionItemDto> d() {
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
        if (!(obj instanceof CallsGetAsrTranscriptionsResponseDto)) {
            return false;
        }
        CallsGetAsrTranscriptionsResponseDto callsGetAsrTranscriptionsResponseDto = (CallsGetAsrTranscriptionsResponseDto) obj;
        return epx.f(this.items, callsGetAsrTranscriptionsResponseDto.items) && this.count == callsGetAsrTranscriptionsResponseDto.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsGetAsrTranscriptionsResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((CallsAsrTranscriptionItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
    }
}
