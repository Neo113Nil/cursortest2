package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesVideoMessagesBlacklistDto.kt */
/* loaded from: classes15.dex */
public final class MessagesVideoMessagesBlacklistDto implements Parcelable {
    public static final Parcelable.Creator<MessagesVideoMessagesBlacklistDto> CREATOR = new a();

    @pmi0("target_size")
    private final String targetSize;

    @pmi0("use_camera2")
    private final Boolean useCamera2;

    /* compiled from: MessagesVideoMessagesBlacklistDto.kt */
    public static final class a implements Parcelable.Creator<MessagesVideoMessagesBlacklistDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesVideoMessagesBlacklistDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesVideoMessagesBlacklistDto(readString, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesVideoMessagesBlacklistDto[] newArray(int i) {
            return new MessagesVideoMessagesBlacklistDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesVideoMessagesBlacklistDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.targetSize;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesVideoMessagesBlacklistDto)) {
            return false;
        }
        MessagesVideoMessagesBlacklistDto messagesVideoMessagesBlacklistDto = (MessagesVideoMessagesBlacklistDto) obj;
        return epx.f(this.targetSize, messagesVideoMessagesBlacklistDto.targetSize) && epx.f(this.useCamera2, messagesVideoMessagesBlacklistDto.useCamera2);
    }

    public final int hashCode() {
        String str = this.targetSize;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.useCamera2;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesVideoMessagesBlacklistDto(targetSize=");
        sb.append(this.targetSize);
        sb.append(", useCamera2=");
        return tn.a(sb, this.useCamera2, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.targetSize);
        Boolean bool = this.useCamera2;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public MessagesVideoMessagesBlacklistDto(String str, Boolean bool) {
        this.targetSize = str;
        this.useCamera2 = bool;
    }

    public /* synthetic */ MessagesVideoMessagesBlacklistDto(String str, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
