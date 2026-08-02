package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetInboundCallsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetInboundCallsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetInboundCallsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MessagesInboundCallDto> items;

    /* compiled from: MessagesGetInboundCallsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetInboundCallsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetInboundCallsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesInboundCallDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesGetInboundCallsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetInboundCallsResponseDto[] newArray(int i) {
            return new MessagesGetInboundCallsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesGetInboundCallsResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetInboundCallsResponseDto) && epx.f(this.items, ((MessagesGetInboundCallsResponseDto) obj).items);
    }

    public final int hashCode() {
        List<MessagesInboundCallDto> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesGetInboundCallsResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MessagesInboundCallDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MessagesInboundCallDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public MessagesGetInboundCallsResponseDto(List<MessagesInboundCallDto> list) {
        this.items = list;
    }

    public /* synthetic */ MessagesGetInboundCallsResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
