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

/* compiled from: MessagesGetAppearancesResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetAppearancesResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetAppearancesResponseDto> CREATOR = new a();

    @pmi0("appearances")
    private final List<MessagesConversationStyleAppearanceDto> appearances;

    /* compiled from: MessagesGetAppearancesResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetAppearancesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetAppearancesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesConversationStyleAppearanceDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetAppearancesResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetAppearancesResponseDto[] newArray(int i) {
            return new MessagesGetAppearancesResponseDto[i];
        }
    }

    public MessagesGetAppearancesResponseDto(List<MessagesConversationStyleAppearanceDto> list) {
        this.appearances = list;
    }

    public final List<MessagesConversationStyleAppearanceDto> d() {
        return this.appearances;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetAppearancesResponseDto) && epx.f(this.appearances, ((MessagesGetAppearancesResponseDto) obj).appearances);
    }

    public final int hashCode() {
        return this.appearances.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesGetAppearancesResponseDto(appearances="), this.appearances);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.appearances);
        while (a2.hasNext()) {
            ((MessagesConversationStyleAppearanceDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
