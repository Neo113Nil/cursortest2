package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MessagesEmailDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEmailDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEmailDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("id")
    private final int id;

    /* compiled from: MessagesEmailDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEmailDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEmailDto createFromParcel(Parcel parcel) {
            return new MessagesEmailDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEmailDto[] newArray(int i) {
            return new MessagesEmailDto[i];
        }
    }

    public MessagesEmailDto(String str, int i) {
        this.address = str;
        this.id = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEmailDto)) {
            return false;
        }
        MessagesEmailDto messagesEmailDto = (MessagesEmailDto) obj;
        return epx.f(this.address, messagesEmailDto.address) && this.id == messagesEmailDto.id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.id) + (this.address.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEmailDto(address=");
        sb.append(this.address);
        sb.append(", id=");
        return vu5.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.address);
        parcel.writeInt(this.id);
    }
}
