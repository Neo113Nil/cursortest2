package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.gp;
import xsna.gsi0;
import xsna.pmi0;
import xsna.qoy;
import xsna.xq;
import xsna.zcl;

/* compiled from: MessagesChatSettingsAclDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatSettingsAclDto {

    @pmi0("can_call")
    private final boolean canCall;

    @pmi0("can_change_info")
    private final boolean canChangeInfo;

    @pmi0("can_change_invite_link")
    private final boolean canChangeInviteLink;

    @pmi0("can_change_pin")
    private final boolean canChangePin;

    @pmi0("can_change_service_type")
    private final Boolean canChangeServiceType;

    @pmi0("can_copy_chat")
    private final boolean canCopyChat;

    @pmi0("can_invite")
    private final boolean canInvite;

    @pmi0("can_moderate")
    private final boolean canModerate;

    @pmi0("can_promote_users")
    private final boolean canPromoteUsers;

    @pmi0("can_see_invite_link")
    private final boolean canSeeInviteLink;

    @pmi0("can_use_mass_mentions")
    private final boolean canUseMassMentions;

    public MessagesChatSettingsAclDto(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Boolean bool) {
        this.canChangeInfo = z;
        this.canChangeInviteLink = z2;
        this.canChangePin = z3;
        this.canInvite = z4;
        this.canPromoteUsers = z5;
        this.canSeeInviteLink = z6;
        this.canModerate = z7;
        this.canCopyChat = z8;
        this.canCall = z9;
        this.canUseMassMentions = z10;
        this.canChangeServiceType = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsAclDto)) {
            return false;
        }
        MessagesChatSettingsAclDto messagesChatSettingsAclDto = (MessagesChatSettingsAclDto) obj;
        return this.canChangeInfo == messagesChatSettingsAclDto.canChangeInfo && this.canChangeInviteLink == messagesChatSettingsAclDto.canChangeInviteLink && this.canChangePin == messagesChatSettingsAclDto.canChangePin && this.canInvite == messagesChatSettingsAclDto.canInvite && this.canPromoteUsers == messagesChatSettingsAclDto.canPromoteUsers && this.canSeeInviteLink == messagesChatSettingsAclDto.canSeeInviteLink && this.canModerate == messagesChatSettingsAclDto.canModerate && this.canCopyChat == messagesChatSettingsAclDto.canCopyChat && this.canCall == messagesChatSettingsAclDto.canCall && this.canUseMassMentions == messagesChatSettingsAclDto.canUseMassMentions && epx.f(this.canChangeServiceType, messagesChatSettingsAclDto.canChangeServiceType);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.canChangeInfo) * 31, 31, this.canChangeInviteLink), 31, this.canChangePin), 31, this.canInvite), 31, this.canPromoteUsers), 31, this.canSeeInviteLink), 31, this.canModerate), 31, this.canCopyChat), 31, this.canCall), 31, this.canUseMassMentions);
        Boolean bool = this.canChangeServiceType;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        boolean z = this.canChangeInfo;
        boolean z2 = this.canChangeInviteLink;
        boolean z3 = this.canChangePin;
        boolean z4 = this.canInvite;
        boolean z5 = this.canPromoteUsers;
        boolean z6 = this.canSeeInviteLink;
        boolean z7 = this.canModerate;
        boolean z8 = this.canCopyChat;
        boolean z9 = this.canCall;
        boolean z10 = this.canUseMassMentions;
        Boolean bool = this.canChangeServiceType;
        StringBuilder c = gp.c("MessagesChatSettingsAclDto(canChangeInfo=", ", canChangeInviteLink=", ", canChangePin=", z, z2);
        gsi0.c(c, z3, ", canInvite=", z4, ", canPromoteUsers=");
        gsi0.c(c, z5, ", canSeeInviteLink=", z6, ", canModerate=");
        gsi0.c(c, z7, ", canCopyChat=", z8, ", canCall=");
        gsi0.c(c, z9, ", canUseMassMentions=", z10, ", canChangeServiceType=");
        return xq.d(c, bool, ")");
    }

    public /* synthetic */ MessagesChatSettingsAclDto(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Boolean bool, int i, zcl zclVar) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, (i & 1024) != 0 ? null : bool);
    }
}
