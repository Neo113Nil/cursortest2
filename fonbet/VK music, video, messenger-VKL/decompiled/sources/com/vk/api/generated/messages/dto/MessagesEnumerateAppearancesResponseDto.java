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

/* compiled from: MessagesEnumerateAppearancesResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEnumerateAppearancesResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEnumerateAppearancesResponseDto> CREATOR = new a();

    @pmi0("appearances")
    private final List<MessagesConversationAppearanceMetaDto> appearances;

    /* compiled from: MessagesEnumerateAppearancesResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEnumerateAppearancesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEnumerateAppearancesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesConversationAppearanceMetaDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesEnumerateAppearancesResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEnumerateAppearancesResponseDto[] newArray(int i) {
            return new MessagesEnumerateAppearancesResponseDto[i];
        }
    }

    public MessagesEnumerateAppearancesResponseDto(List<MessagesConversationAppearanceMetaDto> list) {
        this.appearances = list;
    }

    public final List<MessagesConversationAppearanceMetaDto> d() {
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
        return (obj instanceof MessagesEnumerateAppearancesResponseDto) && epx.f(this.appearances, ((MessagesEnumerateAppearancesResponseDto) obj).appearances);
    }

    public final int hashCode() {
        return this.appearances.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesEnumerateAppearancesResponseDto(appearances="), this.appearances);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.appearances);
        while (a2.hasNext()) {
            ((MessagesConversationAppearanceMetaDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
