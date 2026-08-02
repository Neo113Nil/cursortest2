package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesPostponedSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesPostponedSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesPostponedSettingsDto> CREATOR = new a();

    @pmi0("timestamp")
    private final Integer timestamp;

    @pmi0("type")
    private final int type;

    /* compiled from: MessagesPostponedSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesPostponedSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesPostponedSettingsDto createFromParcel(Parcel parcel) {
            return new MessagesPostponedSettingsDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesPostponedSettingsDto[] newArray(int i) {
            return new MessagesPostponedSettingsDto[i];
        }
    }

    public MessagesPostponedSettingsDto(int i, Integer num) {
        this.type = i;
        this.timestamp = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesPostponedSettingsDto)) {
            return false;
        }
        MessagesPostponedSettingsDto messagesPostponedSettingsDto = (MessagesPostponedSettingsDto) obj;
        return this.type == messagesPostponedSettingsDto.type && epx.f(this.timestamp, messagesPostponedSettingsDto.timestamp);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.type) * 31;
        Integer num = this.timestamp;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesPostponedSettingsDto(type=");
        sb.append(this.type);
        sb.append(", timestamp=");
        return uqi.b(sb, this.timestamp, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        Integer num = this.timestamp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MessagesPostponedSettingsDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
