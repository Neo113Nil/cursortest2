package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MessagesCursorDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCursorDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCursorDto> CREATOR = new a();

    @pmi0("value")
    private final String value;

    /* compiled from: MessagesCursorDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCursorDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCursorDto createFromParcel(Parcel parcel) {
            return new MessagesCursorDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCursorDto[] newArray(int i) {
            return new MessagesCursorDto[i];
        }
    }

    public MessagesCursorDto(String str) {
        this.value = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesCursorDto) && epx.f(this.value, ((MessagesCursorDto) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("MessagesCursorDto(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
    }
}
