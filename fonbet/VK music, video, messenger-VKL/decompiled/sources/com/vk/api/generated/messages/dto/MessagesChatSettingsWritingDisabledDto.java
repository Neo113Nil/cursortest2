package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesChatSettingsWritingDisabledDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsWritingDisabledDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSettingsWritingDisabledDto> CREATOR = new a();

    @pmi0("until_ts")
    private final Long untilTs;

    @pmi0("value")
    private final boolean value;

    /* compiled from: MessagesChatSettingsWritingDisabledDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsWritingDisabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsWritingDisabledDto createFromParcel(Parcel parcel) {
            return new MessagesChatSettingsWritingDisabledDto(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsWritingDisabledDto[] newArray(int i) {
            return new MessagesChatSettingsWritingDisabledDto[i];
        }
    }

    public MessagesChatSettingsWritingDisabledDto(boolean z, Long l) {
        this.value = z;
        this.untilTs = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsWritingDisabledDto)) {
            return false;
        }
        MessagesChatSettingsWritingDisabledDto messagesChatSettingsWritingDisabledDto = (MessagesChatSettingsWritingDisabledDto) obj;
        return this.value == messagesChatSettingsWritingDisabledDto.value && epx.f(this.untilTs, messagesChatSettingsWritingDisabledDto.untilTs);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.value) * 31;
        Long l = this.untilTs;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatSettingsWritingDisabledDto(value=");
        sb.append(this.value);
        sb.append(", untilTs=");
        return iq.b(sb, this.untilTs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.value ? 1 : 0);
        Long l = this.untilTs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public /* synthetic */ MessagesChatSettingsWritingDisabledDto(boolean z, Long l, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : l);
    }
}
