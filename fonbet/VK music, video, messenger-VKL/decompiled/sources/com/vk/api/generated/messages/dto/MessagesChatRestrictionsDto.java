package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesChatRestrictionsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatRestrictionsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatRestrictionsDto> CREATOR = new a();

    @pmi0("admins_promote_users")
    private final Boolean adminsPromoteUsers;

    @pmi0("only_admins_edit_info")
    private final Boolean onlyAdminsEditInfo;

    @pmi0("only_admins_edit_pin")
    private final Boolean onlyAdminsEditPin;

    @pmi0("only_admins_invite")
    private final Boolean onlyAdminsInvite;

    @pmi0("only_admins_kick")
    private final Boolean onlyAdminsKick;

    /* compiled from: MessagesChatRestrictionsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatRestrictionsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatRestrictionsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesChatRestrictionsDto(valueOf, valueOf2, valueOf3, valueOf4, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatRestrictionsDto[] newArray(int i) {
            return new MessagesChatRestrictionsDto[i];
        }
    }

    public MessagesChatRestrictionsDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatRestrictionsDto)) {
            return false;
        }
        MessagesChatRestrictionsDto messagesChatRestrictionsDto = (MessagesChatRestrictionsDto) obj;
        return epx.f(this.adminsPromoteUsers, messagesChatRestrictionsDto.adminsPromoteUsers) && epx.f(this.onlyAdminsEditInfo, messagesChatRestrictionsDto.onlyAdminsEditInfo) && epx.f(this.onlyAdminsEditPin, messagesChatRestrictionsDto.onlyAdminsEditPin) && epx.f(this.onlyAdminsInvite, messagesChatRestrictionsDto.onlyAdminsInvite) && epx.f(this.onlyAdminsKick, messagesChatRestrictionsDto.onlyAdminsKick);
    }

    public final int hashCode() {
        Boolean bool = this.adminsPromoteUsers;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.onlyAdminsEditInfo;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.onlyAdminsEditPin;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.onlyAdminsInvite;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.onlyAdminsKick;
        return hashCode4 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatRestrictionsDto(adminsPromoteUsers=");
        sb.append(this.adminsPromoteUsers);
        sb.append(", onlyAdminsEditInfo=");
        sb.append(this.onlyAdminsEditInfo);
        sb.append(", onlyAdminsEditPin=");
        sb.append(this.onlyAdminsEditPin);
        sb.append(", onlyAdminsInvite=");
        sb.append(this.onlyAdminsInvite);
        sb.append(", onlyAdminsKick=");
        return tn.a(sb, this.onlyAdminsKick, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.adminsPromoteUsers;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.onlyAdminsEditInfo;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.onlyAdminsEditPin;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.onlyAdminsInvite;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.onlyAdminsKick;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
    }

    public MessagesChatRestrictionsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.adminsPromoteUsers = bool;
        this.onlyAdminsEditInfo = bool2;
        this.onlyAdminsEditPin = bool3;
        this.onlyAdminsInvite = bool4;
        this.onlyAdminsKick = bool5;
    }

    public /* synthetic */ MessagesChatRestrictionsDto(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5);
    }
}
