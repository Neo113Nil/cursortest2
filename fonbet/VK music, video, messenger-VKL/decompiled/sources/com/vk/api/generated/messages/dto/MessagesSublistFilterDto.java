package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesSublistFilterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSublistFilterDto implements Parcelable {
    public static final Parcelable.Creator<MessagesSublistFilterDto> CREATOR = new a();

    @pmi0("and")
    private final int and;

    @pmi0("xor")
    private final int xor;

    /* compiled from: MessagesSublistFilterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSublistFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSublistFilterDto createFromParcel(Parcel parcel) {
            return new MessagesSublistFilterDto(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSublistFilterDto[] newArray(int i) {
            return new MessagesSublistFilterDto[i];
        }
    }

    public MessagesSublistFilterDto(int i, int i2) {
        this.and = i;
        this.xor = i2;
    }

    public final int d() {
        return this.and;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.xor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSublistFilterDto)) {
            return false;
        }
        MessagesSublistFilterDto messagesSublistFilterDto = (MessagesSublistFilterDto) obj;
        return this.and == messagesSublistFilterDto.and && this.xor == messagesSublistFilterDto.xor;
    }

    public final int hashCode() {
        return Integer.hashCode(this.xor) + (Integer.hashCode(this.and) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesSublistFilterDto(and=");
        sb.append(this.and);
        sb.append(", xor=");
        return vu5.b(sb, this.xor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.and);
        parcel.writeInt(this.xor);
    }
}
