package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesChatSettingsAclDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsAclDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSettingsAclDto> CREATOR = new a();

    @pmi0("can_call")
    private final boolean canCall;

    @pmi0("can_change_info")
    private final boolean canChangeInfo;

    @pmi0("can_change_invite_link")
    private final boolean canChangeInviteLink;

    @pmi0("can_change_owner")
    private final Boolean canChangeOwner;

    @pmi0("can_change_pin")
    private final boolean canChangePin;

    @pmi0("can_change_public")
    private final Boolean canChangePublic;

    @pmi0("can_change_service_type")
    private final Boolean canChangeServiceType;

    @pmi0("can_change_stickers_popup_autoplay")
    private final Boolean canChangeStickersPopupAutoplay;

    @pmi0("can_change_style")
    private final Boolean canChangeStyle;

    @pmi0("can_copy_chat")
    private final boolean canCopyChat;

    @pmi0("can_disable_forward_messages")
    private final Boolean canDisableForwardMessages;

    @pmi0("can_disable_service_messages")
    private final Boolean canDisableServiceMessages;

    @pmi0("can_forward_messages")
    private final Boolean canForwardMessages;

    @pmi0("can_invite")
    private final boolean canInvite;

    @pmi0("can_moderate")
    private final boolean canModerate;

    @pmi0("can_promote_users")
    private final boolean canPromoteUsers;

    @pmi0("can_see_invite_link")
    private final boolean canSeeInviteLink;

    @pmi0("can_send_reactions")
    private final Boolean canSendReactions;

    @pmi0("can_use_mass_mentions")
    private final boolean canUseMassMentions;

    /* compiled from: MessagesChatSettingsAclDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsAclDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsAclDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            boolean z10 = false;
            boolean z11 = true;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z10 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z11 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
                z = z2;
            } else {
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
            } else {
                z4 = z2;
                z2 = z3;
            }
            if (parcel.readInt() != 0) {
                z5 = z3;
                z3 = z4;
            } else {
                z5 = z3;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z5;
            }
            if (parcel.readInt() != 0) {
                z7 = z5;
                z5 = z6;
            } else {
                z7 = z5;
            }
            if (parcel.readInt() != 0) {
                z8 = z6;
            } else {
                z8 = z6;
                z6 = z7;
            }
            if (parcel.readInt() != 0) {
                z9 = z7;
                z7 = z8;
            } else {
                z9 = z7;
            }
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z9);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z9);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z9);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z9);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z9);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z9);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z9);
            }
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0 ? z8 : z9);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z8 = z9;
                }
                bool = Boolean.valueOf(z8);
            }
            return new MessagesChatSettingsAclDto(z12, z10, z11, z, z2, z3, z4, z5, z6, z7, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsAclDto[] newArray(int i) {
            return new MessagesChatSettingsAclDto[i];
        }
    }

    public MessagesChatSettingsAclDto(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9) {
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
        this.canChangeStyle = bool2;
        this.canChangePublic = bool3;
        this.canSendReactions = bool4;
        this.canChangeStickersPopupAutoplay = bool5;
        this.canDisableForwardMessages = bool6;
        this.canForwardMessages = bool7;
        this.canDisableServiceMessages = bool8;
        this.canChangeOwner = bool9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsAclDto)) {
            return false;
        }
        MessagesChatSettingsAclDto messagesChatSettingsAclDto = (MessagesChatSettingsAclDto) obj;
        return this.canChangeInfo == messagesChatSettingsAclDto.canChangeInfo && this.canChangeInviteLink == messagesChatSettingsAclDto.canChangeInviteLink && this.canChangePin == messagesChatSettingsAclDto.canChangePin && this.canInvite == messagesChatSettingsAclDto.canInvite && this.canPromoteUsers == messagesChatSettingsAclDto.canPromoteUsers && this.canSeeInviteLink == messagesChatSettingsAclDto.canSeeInviteLink && this.canModerate == messagesChatSettingsAclDto.canModerate && this.canCopyChat == messagesChatSettingsAclDto.canCopyChat && this.canCall == messagesChatSettingsAclDto.canCall && this.canUseMassMentions == messagesChatSettingsAclDto.canUseMassMentions && epx.f(this.canChangeServiceType, messagesChatSettingsAclDto.canChangeServiceType) && epx.f(this.canChangeStyle, messagesChatSettingsAclDto.canChangeStyle) && epx.f(this.canChangePublic, messagesChatSettingsAclDto.canChangePublic) && epx.f(this.canSendReactions, messagesChatSettingsAclDto.canSendReactions) && epx.f(this.canChangeStickersPopupAutoplay, messagesChatSettingsAclDto.canChangeStickersPopupAutoplay) && epx.f(this.canDisableForwardMessages, messagesChatSettingsAclDto.canDisableForwardMessages) && epx.f(this.canForwardMessages, messagesChatSettingsAclDto.canForwardMessages) && epx.f(this.canDisableServiceMessages, messagesChatSettingsAclDto.canDisableServiceMessages) && epx.f(this.canChangeOwner, messagesChatSettingsAclDto.canChangeOwner);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.canChangeInfo) * 31, 31, this.canChangeInviteLink), 31, this.canChangePin), 31, this.canInvite), 31, this.canPromoteUsers), 31, this.canSeeInviteLink), 31, this.canModerate), 31, this.canCopyChat), 31, this.canCall), 31, this.canUseMassMentions);
        Boolean bool = this.canChangeServiceType;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canChangeStyle;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canChangePublic;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canSendReactions;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canChangeStickersPopupAutoplay;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canDisableForwardMessages;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.canForwardMessages;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.canDisableServiceMessages;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.canChangeOwner;
        return hashCode8 + (bool9 != null ? bool9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatSettingsAclDto(canChangeInfo=");
        sb.append(this.canChangeInfo);
        sb.append(", canChangeInviteLink=");
        sb.append(this.canChangeInviteLink);
        sb.append(", canChangePin=");
        sb.append(this.canChangePin);
        sb.append(", canInvite=");
        sb.append(this.canInvite);
        sb.append(", canPromoteUsers=");
        sb.append(this.canPromoteUsers);
        sb.append(", canSeeInviteLink=");
        sb.append(this.canSeeInviteLink);
        sb.append(", canModerate=");
        sb.append(this.canModerate);
        sb.append(", canCopyChat=");
        sb.append(this.canCopyChat);
        sb.append(", canCall=");
        sb.append(this.canCall);
        sb.append(", canUseMassMentions=");
        sb.append(this.canUseMassMentions);
        sb.append(", canChangeServiceType=");
        sb.append(this.canChangeServiceType);
        sb.append(", canChangeStyle=");
        sb.append(this.canChangeStyle);
        sb.append(", canChangePublic=");
        sb.append(this.canChangePublic);
        sb.append(", canSendReactions=");
        sb.append(this.canSendReactions);
        sb.append(", canChangeStickersPopupAutoplay=");
        sb.append(this.canChangeStickersPopupAutoplay);
        sb.append(", canDisableForwardMessages=");
        sb.append(this.canDisableForwardMessages);
        sb.append(", canForwardMessages=");
        sb.append(this.canForwardMessages);
        sb.append(", canDisableServiceMessages=");
        sb.append(this.canDisableServiceMessages);
        sb.append(", canChangeOwner=");
        return tn.a(sb, this.canChangeOwner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canChangeInfo ? 1 : 0);
        parcel.writeInt(this.canChangeInviteLink ? 1 : 0);
        parcel.writeInt(this.canChangePin ? 1 : 0);
        parcel.writeInt(this.canInvite ? 1 : 0);
        parcel.writeInt(this.canPromoteUsers ? 1 : 0);
        parcel.writeInt(this.canSeeInviteLink ? 1 : 0);
        parcel.writeInt(this.canModerate ? 1 : 0);
        parcel.writeInt(this.canCopyChat ? 1 : 0);
        parcel.writeInt(this.canCall ? 1 : 0);
        parcel.writeInt(this.canUseMassMentions ? 1 : 0);
        Boolean bool = this.canChangeServiceType;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canChangeStyle;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.canChangePublic;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canSendReactions;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.canChangeStickersPopupAutoplay;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.canDisableForwardMessages;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.canForwardMessages;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.canDisableServiceMessages;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.canChangeOwner;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
    }

    public /* synthetic */ MessagesChatSettingsAclDto(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, int i, zcl zclVar) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (32768 & i) != 0 ? null : bool6, (65536 & i) != 0 ? null : bool7, (131072 & i) != 0 ? null : bool8, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool9);
    }
}
