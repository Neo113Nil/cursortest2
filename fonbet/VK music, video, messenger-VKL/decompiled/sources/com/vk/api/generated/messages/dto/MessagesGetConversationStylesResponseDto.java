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

/* compiled from: MessagesGetConversationStylesResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetConversationStylesResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetConversationStylesResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MessagesConversationStyleDto> items;

    /* compiled from: MessagesGetConversationStylesResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetConversationStylesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationStylesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesConversationStyleDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetConversationStylesResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetConversationStylesResponseDto[] newArray(int i) {
            return new MessagesGetConversationStylesResponseDto[i];
        }
    }

    public MessagesGetConversationStylesResponseDto(List<MessagesConversationStyleDto> list) {
        this.items = list;
    }

    public final List<MessagesConversationStyleDto> d() {
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
        return (obj instanceof MessagesGetConversationStylesResponseDto) && epx.f(this.items, ((MessagesGetConversationStylesResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesGetConversationStylesResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesConversationStyleDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
