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

/* compiled from: MessagesEnumerateBackgroundsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEnumerateBackgroundsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEnumerateBackgroundsResponseDto> CREATOR = new a();

    @pmi0("backgrounds")
    private final List<MessagesConversationBackgroundMetaDto> backgrounds;

    /* compiled from: MessagesEnumerateBackgroundsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEnumerateBackgroundsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEnumerateBackgroundsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesConversationBackgroundMetaDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesEnumerateBackgroundsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEnumerateBackgroundsResponseDto[] newArray(int i) {
            return new MessagesEnumerateBackgroundsResponseDto[i];
        }
    }

    public MessagesEnumerateBackgroundsResponseDto(List<MessagesConversationBackgroundMetaDto> list) {
        this.backgrounds = list;
    }

    public final List<MessagesConversationBackgroundMetaDto> d() {
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
        return (obj instanceof MessagesEnumerateBackgroundsResponseDto) && epx.f(this.backgrounds, ((MessagesEnumerateBackgroundsResponseDto) obj).backgrounds);
    }

    public final int hashCode() {
        return this.backgrounds.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesEnumerateBackgroundsResponseDto(backgrounds="), this.backgrounds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.backgrounds);
        while (a2.hasNext()) {
            ((MessagesConversationBackgroundMetaDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
