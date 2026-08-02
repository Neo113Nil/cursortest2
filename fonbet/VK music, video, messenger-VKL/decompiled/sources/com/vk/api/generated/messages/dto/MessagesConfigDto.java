package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConfigDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConfigDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConfigDto> CREATOR = new a();

    @pmi0("config")
    private final MessagesConfigItemDto config;

    @pmi0("version")
    private final int version;

    /* compiled from: MessagesConfigDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConfigDto createFromParcel(Parcel parcel) {
            return new MessagesConfigDto(parcel.readInt(), parcel.readInt() == 0 ? null : MessagesConfigItemDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConfigDto[] newArray(int i) {
            return new MessagesConfigDto[i];
        }
    }

    public MessagesConfigDto(int i, MessagesConfigItemDto messagesConfigItemDto) {
        this.version = i;
        this.config = messagesConfigItemDto;
    }

    public final MessagesConfigItemDto d() {
        return this.config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.version;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConfigDto)) {
            return false;
        }
        MessagesConfigDto messagesConfigDto = (MessagesConfigDto) obj;
        return this.version == messagesConfigDto.version && epx.f(this.config, messagesConfigDto.config);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.version) * 31;
        MessagesConfigItemDto messagesConfigItemDto = this.config;
        return hashCode + (messagesConfigItemDto == null ? 0 : messagesConfigItemDto.hashCode());
    }

    public final String toString() {
        return "MessagesConfigDto(version=" + this.version + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.version);
        MessagesConfigItemDto messagesConfigItemDto = this.config;
        if (messagesConfigItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConfigItemDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesConfigDto(int i, MessagesConfigItemDto messagesConfigItemDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : messagesConfigItemDto);
    }
}
