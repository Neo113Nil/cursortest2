package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesUpdatedCmidDto.kt */
/* loaded from: classes15.dex */
public final class MessagesUpdatedCmidDto implements Parcelable {
    public static final Parcelable.Creator<MessagesUpdatedCmidDto> CREATOR = new a();

    @pmi0("cmid")
    private final long cmid;

    @pmi0("updated_flags")
    private final long updatedFlags;

    /* compiled from: MessagesUpdatedCmidDto.kt */
    public static final class a implements Parcelable.Creator<MessagesUpdatedCmidDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesUpdatedCmidDto createFromParcel(Parcel parcel) {
            return new MessagesUpdatedCmidDto(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesUpdatedCmidDto[] newArray(int i) {
            return new MessagesUpdatedCmidDto[i];
        }
    }

    public MessagesUpdatedCmidDto(long j, long j2) {
        this.cmid = j;
        this.updatedFlags = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesUpdatedCmidDto)) {
            return false;
        }
        MessagesUpdatedCmidDto messagesUpdatedCmidDto = (MessagesUpdatedCmidDto) obj;
        return this.cmid == messagesUpdatedCmidDto.cmid && this.updatedFlags == messagesUpdatedCmidDto.updatedFlags;
    }

    public final int hashCode() {
        return Long.hashCode(this.updatedFlags) + (Long.hashCode(this.cmid) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesUpdatedCmidDto(cmid=");
        sb.append(this.cmid);
        sb.append(", updatedFlags=");
        return vu5.a(')', this.updatedFlags, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.cmid);
        parcel.writeLong(this.updatedFlags);
    }
}
