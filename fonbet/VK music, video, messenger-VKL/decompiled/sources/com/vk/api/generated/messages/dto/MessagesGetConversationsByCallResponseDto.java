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

/* compiled from: MessagesGetConversationsByCallResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetConversationsByCallResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetConversationsByCallResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MessagesConversationDto> items;

    /* compiled from: MessagesGetConversationsByCallResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetConversationsByCallResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationsByCallResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MessagesConversationDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetConversationsByCallResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationsByCallResponseDto[] newArray(int i) {
            return new MessagesGetConversationsByCallResponseDto[i];
        }
    }

    public MessagesGetConversationsByCallResponseDto(int i, List<MessagesConversationDto> list) {
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
        if (!(obj instanceof MessagesGetConversationsByCallResponseDto)) {
            return false;
        }
        MessagesGetConversationsByCallResponseDto messagesGetConversationsByCallResponseDto = (MessagesGetConversationsByCallResponseDto) obj;
        return this.count == messagesGetConversationsByCallResponseDto.count && epx.f(this.items, messagesGetConversationsByCallResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetConversationsByCallResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesConversationDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
