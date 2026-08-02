package com.vk.api.generated.messages.dto;

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

/* compiled from: MessagesReactionCountersResponseItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesReactionCountersResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesReactionCountersResponseItemDto> CREATOR = new a();

    @pmi0("cmid")
    private final int cmid;

    @pmi0("counters")
    private final List<MessagesReactionCounterResponseItemDto> counters;

    /* compiled from: MessagesReactionCountersResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesReactionCountersResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesReactionCountersResponseItemDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MessagesReactionCounterResponseItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesReactionCountersResponseItemDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesReactionCountersResponseItemDto[] newArray(int i) {
            return new MessagesReactionCountersResponseItemDto[i];
        }
    }

    public MessagesReactionCountersResponseItemDto(int i, List<MessagesReactionCounterResponseItemDto> list) {
        this.cmid = i;
        this.counters = list;
    }

    public final int d() {
        return this.cmid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesReactionCounterResponseItemDto> e() {
        return this.counters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionCountersResponseItemDto)) {
            return false;
        }
        MessagesReactionCountersResponseItemDto messagesReactionCountersResponseItemDto = (MessagesReactionCountersResponseItemDto) obj;
        return this.cmid == messagesReactionCountersResponseItemDto.cmid && epx.f(this.counters, messagesReactionCountersResponseItemDto.counters);
    }

    public final int hashCode() {
        return this.counters.hashCode() + (Integer.hashCode(this.cmid) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesReactionCountersResponseItemDto(cmid=");
        sb.append(this.cmid);
        sb.append(", counters=");
        return ms9.a(')', sb, this.counters);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cmid);
        Iterator a2 = ao.a(parcel, this.counters);
        while (a2.hasNext()) {
            ((MessagesReactionCounterResponseItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
