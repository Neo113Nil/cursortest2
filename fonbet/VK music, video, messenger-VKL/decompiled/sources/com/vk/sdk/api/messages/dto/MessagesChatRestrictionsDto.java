package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.tq;
import xsna.xq;
import xsna.zcl;

/* compiled from: MessagesChatRestrictionsDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatRestrictionsDto {

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

    public MessagesChatRestrictionsDto() {
        this(null, null, null, null, null, 31, null);
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
        Boolean bool = this.adminsPromoteUsers;
        Boolean bool2 = this.onlyAdminsEditInfo;
        Boolean bool3 = this.onlyAdminsEditPin;
        Boolean bool4 = this.onlyAdminsInvite;
        Boolean bool5 = this.onlyAdminsKick;
        StringBuilder sb = new StringBuilder("MessagesChatRestrictionsDto(adminsPromoteUsers=");
        sb.append(bool);
        sb.append(", onlyAdminsEditInfo=");
        sb.append(bool2);
        sb.append(", onlyAdminsEditPin=");
        tq.i(sb, bool3, ", onlyAdminsInvite=", bool4, ", onlyAdminsKick=");
        return xq.d(sb, bool5, ")");
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
