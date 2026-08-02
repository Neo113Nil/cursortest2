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

/* compiled from: MessagesGetBackgroundsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetBackgroundsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetBackgroundsResponseDto> CREATOR = new a();

    @pmi0("backgrounds")
    private final List<MessagesConversationStyleBackgroundDto> backgrounds;

    /* compiled from: MessagesGetBackgroundsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetBackgroundsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetBackgroundsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesConversationStyleBackgroundDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetBackgroundsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetBackgroundsResponseDto[] newArray(int i) {
            return new MessagesGetBackgroundsResponseDto[i];
        }
    }

    public MessagesGetBackgroundsResponseDto(List<MessagesConversationStyleBackgroundDto> list) {
        this.backgrounds = list;
    }

    public final List<MessagesConversationStyleBackgroundDto> d() {
        return this.backgrounds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetBackgroundsResponseDto) && epx.f(this.backgrounds, ((MessagesGetBackgroundsResponseDto) obj).backgrounds);
    }

    public final int hashCode() {
        return this.backgrounds.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesGetBackgroundsResponseDto(backgrounds="), this.backgrounds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.backgrounds);
        while (a2.hasNext()) {
            ((MessagesConversationStyleBackgroundDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
