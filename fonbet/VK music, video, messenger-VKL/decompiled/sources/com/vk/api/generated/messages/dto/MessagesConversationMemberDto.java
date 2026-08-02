package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MessagesConversationMemberDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationMemberDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationMemberDto> CREATOR = new a();

    @pmi0("can_kick")
    private final Boolean canKick;

    @pmi0("incognito_id")
    private final Integer incognitoId;

    @pmi0("invited_by")
    private final UserId invitedBy;

    @pmi0("is_admin")
    private final Boolean isAdmin;

    @pmi0("is_message_request")
    private final Boolean isMessageRequest;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("is_restricted_to_write")
    private final Boolean isRestrictedToWrite;

    @pmi0("join_date")
    private final Integer joinDate;

    @pmi0("member_id")
    private final UserId memberId;

    @pmi0("request_date")
    private final Integer requestDate;

    /* compiled from: MessagesConversationMemberDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationMemberDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationMemberDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            UserId userId = (UserId) parcel.readParcelable(MessagesConversationMemberDto.class.getClassLoader());
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
            UserId userId2 = (UserId) parcel.readParcelable(MessagesConversationMemberDto.class.getClassLoader());
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
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationMemberDto(userId, valueOf, valueOf2, userId2, valueOf3, valueOf4, valueOf5, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationMemberDto[] newArray(int i) {
            return new MessagesConversationMemberDto[i];
        }
    }

    public MessagesConversationMemberDto(UserId userId, Boolean bool, Boolean bool2, UserId userId2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Integer num3) {
        this.memberId = userId;
        this.canKick = bool;
        this.isRestrictedToWrite = bool2;
        this.invitedBy = userId2;
        this.isAdmin = bool3;
        this.isOwner = bool4;
        this.isMessageRequest = bool5;
        this.joinDate = num;
        this.requestDate = num2;
        this.incognitoId = num3;
    }

    public final Boolean d() {
        return this.canKick;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.incognitoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationMemberDto)) {
            return false;
        }
        MessagesConversationMemberDto messagesConversationMemberDto = (MessagesConversationMemberDto) obj;
        return epx.f(this.memberId, messagesConversationMemberDto.memberId) && epx.f(this.canKick, messagesConversationMemberDto.canKick) && epx.f(this.isRestrictedToWrite, messagesConversationMemberDto.isRestrictedToWrite) && epx.f(this.invitedBy, messagesConversationMemberDto.invitedBy) && epx.f(this.isAdmin, messagesConversationMemberDto.isAdmin) && epx.f(this.isOwner, messagesConversationMemberDto.isOwner) && epx.f(this.isMessageRequest, messagesConversationMemberDto.isMessageRequest) && epx.f(this.joinDate, messagesConversationMemberDto.joinDate) && epx.f(this.requestDate, messagesConversationMemberDto.requestDate) && epx.f(this.incognitoId, messagesConversationMemberDto.incognitoId);
    }

    public final UserId f() {
        return this.invitedBy;
    }

    public final Integer g() {
        return this.joinDate;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.memberId.b) * 31;
        Boolean bool = this.canKick;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRestrictedToWrite;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        UserId userId = this.invitedBy;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool3 = this.isAdmin;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isOwner;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isMessageRequest;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num = this.joinDate;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.requestDate;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.incognitoId;
        return hashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    public final UserId i() {
        return this.memberId;
    }

    public final Integer j() {
        return this.requestDate;
    }

    public final Boolean k() {
        return this.isAdmin;
    }

    public final Boolean l() {
        return this.isMessageRequest;
    }

    public final Boolean n() {
        return this.isRestrictedToWrite;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationMemberDto(memberId=");
        sb.append(this.memberId);
        sb.append(", canKick=");
        sb.append(this.canKick);
        sb.append(", isRestrictedToWrite=");
        sb.append(this.isRestrictedToWrite);
        sb.append(", invitedBy=");
        sb.append(this.invitedBy);
        sb.append(", isAdmin=");
        sb.append(this.isAdmin);
        sb.append(", isOwner=");
        sb.append(this.isOwner);
        sb.append(", isMessageRequest=");
        sb.append(this.isMessageRequest);
        sb.append(", joinDate=");
        sb.append(this.joinDate);
        sb.append(", requestDate=");
        sb.append(this.requestDate);
        sb.append(", incognitoId=");
        return uqi.b(sb, this.incognitoId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.memberId, i);
        Boolean bool = this.canKick;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isRestrictedToWrite;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.invitedBy, i);
        Boolean bool3 = this.isAdmin;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isOwner;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isMessageRequest;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Integer num = this.joinDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.requestDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.incognitoId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
    }

    public /* synthetic */ MessagesConversationMemberDto(UserId userId, Boolean bool, Boolean bool2, UserId userId2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : userId2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : num3);
    }
}
