package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesEditPostponedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEditPostponedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEditPostponedResponseDto> CREATOR = new a();

    @pmi0("cmid")
    private final int cmid;

    /* compiled from: MessagesEditPostponedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEditPostponedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEditPostponedResponseDto createFromParcel(Parcel parcel) {
            return new MessagesEditPostponedResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEditPostponedResponseDto[] newArray(int i) {
            return new MessagesEditPostponedResponseDto[i];
        }
    }

    public MessagesEditPostponedResponseDto(int i) {
        this.cmid = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesEditPostponedResponseDto) && this.cmid == ((MessagesEditPostponedResponseDto) obj).cmid;
    }

    public final int hashCode() {
        return Integer.hashCode(this.cmid);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("MessagesEditPostponedResponseDto(cmid="), this.cmid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cmid);
    }
}
