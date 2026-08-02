package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;

/* compiled from: MessagesExtendedIncognitoMemberDto.kt */
/* loaded from: classes15.dex */
public final class MessagesExtendedIncognitoMemberDto implements Parcelable {
    public static final Parcelable.Creator<MessagesExtendedIncognitoMemberDto> CREATOR = new a();

    @pmi0("can_kick")
    private final Boolean canKick;

    @pmi0("id")
    private final int id;

    @pmi0("invited_by")
    private final UserId invitedBy;

    @pmi0("join_date")
    private final int joinDate;

    @pmi0("member_id")
    private final UserId memberId;

    @pmi0("name")
    private final String name;

    @pmi0("peer_id")
    private final UserId peerId;

    /* compiled from: MessagesExtendedIncognitoMemberDto.kt */
    public static final class a implements Parcelable.Creator<MessagesExtendedIncognitoMemberDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesExtendedIncognitoMemberDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(MessagesExtendedIncognitoMemberDto.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(MessagesExtendedIncognitoMemberDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesExtendedIncognitoMemberDto(userId, readInt, readInt2, userId2, valueOf, (UserId) parcel.readParcelable(MessagesExtendedIncognitoMemberDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesExtendedIncognitoMemberDto[] newArray(int i) {
            return new MessagesExtendedIncognitoMemberDto[i];
        }
    }

    public MessagesExtendedIncognitoMemberDto(UserId userId, int i, int i2, UserId userId2, Boolean bool, UserId userId3, String str) {
        this.invitedBy = userId;
        this.joinDate = i;
        this.id = i2;
        this.memberId = userId2;
        this.canKick = bool;
        this.peerId = userId3;
        this.name = str;
    }

    public final Boolean d() {
        return this.canKick;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.invitedBy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesExtendedIncognitoMemberDto)) {
            return false;
        }
        MessagesExtendedIncognitoMemberDto messagesExtendedIncognitoMemberDto = (MessagesExtendedIncognitoMemberDto) obj;
        return epx.f(this.invitedBy, messagesExtendedIncognitoMemberDto.invitedBy) && this.joinDate == messagesExtendedIncognitoMemberDto.joinDate && this.id == messagesExtendedIncognitoMemberDto.id && epx.f(this.memberId, messagesExtendedIncognitoMemberDto.memberId) && epx.f(this.canKick, messagesExtendedIncognitoMemberDto.canKick) && epx.f(this.peerId, messagesExtendedIncognitoMemberDto.peerId) && epx.f(this.name, messagesExtendedIncognitoMemberDto.name);
    }

    public final int f() {
        return this.joinDate;
    }

    public final UserId g() {
        return this.memberId;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.id, shy.a(this.joinDate, Long.hashCode(this.invitedBy.b) * 31, 31), 31);
        UserId userId = this.memberId;
        int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool = this.canKick;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId2 = this.peerId;
        int hashCode3 = (hashCode2 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str = this.name;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String i() {
        return this.name;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesExtendedIncognitoMemberDto(invitedBy=");
        sb.append(this.invitedBy);
        sb.append(", joinDate=");
        sb.append(this.joinDate);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", memberId=");
        sb.append(this.memberId);
        sb.append(", canKick=");
        sb.append(this.canKick);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.invitedBy, i);
        parcel.writeInt(this.joinDate);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.memberId, i);
        Boolean bool = this.canKick;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.peerId, i);
        parcel.writeString(this.name);
    }

    public /* synthetic */ MessagesExtendedIncognitoMemberDto(UserId userId, int i, int i2, UserId userId2, Boolean bool, UserId userId3, String str, int i3, zcl zclVar) {
        this(userId, i, i2, (i3 & 8) != 0 ? null : userId2, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? null : userId3, (i3 & 64) != 0 ? null : str);
    }
}
