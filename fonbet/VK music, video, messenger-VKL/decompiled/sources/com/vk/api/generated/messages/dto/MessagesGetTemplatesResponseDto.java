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

/* compiled from: MessagesGetTemplatesResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetTemplatesResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetTemplatesResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MessagesTemplateDto> items;

    /* compiled from: MessagesGetTemplatesResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetTemplatesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetTemplatesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MessagesTemplateDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetTemplatesResponseDto(readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetTemplatesResponseDto[] newArray(int i) {
            return new MessagesGetTemplatesResponseDto[i];
        }
    }

    public MessagesGetTemplatesResponseDto(int i, List<MessagesTemplateDto> list) {
        this.count = i;
        this.items = list;
    }

    public final List<MessagesTemplateDto> d() {
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
        if (!(obj instanceof MessagesGetTemplatesResponseDto)) {
            return false;
        }
        MessagesGetTemplatesResponseDto messagesGetTemplatesResponseDto = (MessagesGetTemplatesResponseDto) obj;
        return this.count == messagesGetTemplatesResponseDto.count && epx.f(this.items, messagesGetTemplatesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetTemplatesResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesTemplateDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
