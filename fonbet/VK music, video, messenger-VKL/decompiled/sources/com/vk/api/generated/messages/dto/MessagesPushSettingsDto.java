package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesPushSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesPushSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesPushSettingsDto> CREATOR = new a();

    @pmi0("disabled_forever")
    private final boolean disabledForever;

    @pmi0("disabled_mass_mentions")
    private final Boolean disabledMassMentions;

    @pmi0("disabled_mentions")
    private final Boolean disabledMentions;

    @pmi0("disabled_until")
    private final Integer disabledUntil;

    @pmi0("no_sound")
    private final boolean noSound;

    /* compiled from: MessagesPushSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesPushSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesPushSettingsDto createFromParcel(Parcel parcel) {
            boolean z;
            Boolean valueOf;
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() == 0 ? z : true);
            }
            return new MessagesPushSettingsDto(z3, z2, valueOf2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesPushSettingsDto[] newArray(int i) {
            return new MessagesPushSettingsDto[i];
        }
    }

    public MessagesPushSettingsDto(boolean z, boolean z2, Integer num, Boolean bool, Boolean bool2) {
        this.disabledForever = z;
        this.noSound = z2;
        this.disabledUntil = num;
        this.disabledMentions = bool;
        this.disabledMassMentions = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesPushSettingsDto)) {
            return false;
        }
        MessagesPushSettingsDto messagesPushSettingsDto = (MessagesPushSettingsDto) obj;
        return this.disabledForever == messagesPushSettingsDto.disabledForever && this.noSound == messagesPushSettingsDto.noSound && epx.f(this.disabledUntil, messagesPushSettingsDto.disabledUntil) && epx.f(this.disabledMentions, messagesPushSettingsDto.disabledMentions) && epx.f(this.disabledMassMentions, messagesPushSettingsDto.disabledMassMentions);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.disabledForever) * 31, 31, this.noSound);
        Integer num = this.disabledUntil;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.disabledMentions;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disabledMassMentions;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesPushSettingsDto(disabledForever=");
        sb.append(this.disabledForever);
        sb.append(", noSound=");
        sb.append(this.noSound);
        sb.append(", disabledUntil=");
        sb.append(this.disabledUntil);
        sb.append(", disabledMentions=");
        sb.append(this.disabledMentions);
        sb.append(", disabledMassMentions=");
        return tn.a(sb, this.disabledMassMentions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.disabledForever ? 1 : 0);
        parcel.writeInt(this.noSound ? 1 : 0);
        Integer num = this.disabledUntil;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.disabledMentions;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.disabledMassMentions;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ MessagesPushSettingsDto(boolean z, boolean z2, Integer num, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(z, z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }
}
