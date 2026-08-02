package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesChatSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSettingsDto> CREATOR = new a();

    @pmi0("acl")
    private final MessagesChatSettingsAclDto acl;

    @pmi0("admin_ids")
    private final List<UserId> adminIds;

    @pmi0("description")
    private final String description;

    @pmi0("disable_service_messages")
    private final Boolean disableServiceMessages;

    @pmi0("disappearing_chat_link")
    private final String disappearingChatLink;

    @pmi0("donut_owner_id")
    private final UserId donutOwnerId;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("is_big_chat")
    private final Boolean isBigChat;

    @pmi0("is_deleted_for_all")
    private final Boolean isDeletedForAll;

    @pmi0("is_disappearing")
    private final Boolean isDisappearing;

    @pmi0("is_donut")
    private final Boolean isDonut;

    @pmi0("is_group_channel")
    private final Boolean isGroupChannel;

    @pmi0("is_incognito")
    private final Boolean isIncognito;

    @pmi0("is_public")
    private final Boolean isPublic;

    @pmi0("is_service")
    private final Boolean isService;

    @pmi0("is_stickers_popup_autoplay_disabled")
    private final Boolean isStickersPopupAutoplayDisabled;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final MessagesChatSettingsPermissionsDto permissions;

    @pmi0("photo")
    private final MessagesChatSettingsPhotoDto photo;

    @pmi0("pinned_message")
    private final MessagesPinnedMessageDto pinnedMessage;

    @pmi0("pinned_messages_count")
    private final Integer pinnedMessagesCount;

    @pmi0("short_poll_reactions")
    private final Boolean shortPollReactions;

    @pmi0("state")
    private final MessagesChatSettingsStateDto state;

    @pmi0("theme")
    private final String theme;

    @pmi0("title")
    private final String title;

    @pmi0("type_mask")
    private final Integer typeMask;

    @pmi0("writing_disabled")
    private final MessagesChatSettingsWritingDisabledDto writingDisabled;

    @pmi0("youla_deal")
    private final MessagesChatSettingsYoulaDealDto youlaDeal;

    @pmi0("youla_deal_info")
    private final MessagesChatSettingsYoulaDealInfoDto youlaDealInfo;

    /* compiled from: MessagesChatSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            UserId userId;
            MessagesChatSettingsYoulaDealInfoDto createFromParcel;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            MessagesChatSettingsYoulaDealInfoDto messagesChatSettingsYoulaDealInfoDto;
            MessagesChatSettingsWritingDisabledDto createFromParcel2;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            UserId userId2 = (UserId) parcel.readParcelable(MessagesChatSettingsDto.class.getClassLoader());
            String readString = parcel.readString();
            MessagesChatSettingsStateDto createFromParcel3 = MessagesChatSettingsStateDto.CREATOR.createFromParcel(parcel);
            MessagesChatSettingsAclDto createFromParcel4 = MessagesChatSettingsAclDto.CREATOR.createFromParcel(parcel);
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MessagesPinnedMessageDto createFromParcel5 = parcel.readInt() == 0 ? null : MessagesPinnedMessageDto.CREATOR.createFromParcel(parcel);
            MessagesChatSettingsPhotoDto createFromParcel6 = parcel.readInt() == 0 ? null : MessagesChatSettingsPhotoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MessagesChatSettingsDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesChatSettingsPermissionsDto createFromParcel7 = parcel.readInt() == 0 ? null : MessagesChatSettingsPermissionsDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString3 = parcel.readString();
            Boolean bool = valueOf2;
            String readString4 = parcel.readString();
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
            UserId userId3 = (UserId) parcel.readParcelable(MessagesChatSettingsDto.class.getClassLoader());
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MessagesChatSettingsYoulaDealDto createFromParcel8 = parcel.readInt() == 0 ? null : MessagesChatSettingsYoulaDealDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                userId = userId3;
                createFromParcel = null;
            } else {
                userId = userId3;
                createFromParcel = MessagesChatSettingsYoulaDealInfoDto.CREATOR.createFromParcel(parcel);
            }
            MessagesChatSettingsYoulaDealInfoDto messagesChatSettingsYoulaDealInfoDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                messagesChatSettingsYoulaDealInfoDto = messagesChatSettingsYoulaDealInfoDto2;
                createFromParcel2 = null;
            } else {
                messagesChatSettingsYoulaDealInfoDto = messagesChatSettingsYoulaDealInfoDto2;
                createFromParcel2 = MessagesChatSettingsWritingDisabledDto.CREATOR.createFromParcel(parcel);
            }
            MessagesChatSettingsWritingDisabledDto messagesChatSettingsWritingDisabledDto = createFromParcel2;
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesChatSettingsDto(userId2, readString, createFromParcel3, createFromParcel4, valueOf12, valueOf13, readString2, valueOf14, createFromParcel5, createFromParcel6, arrayList, valueOf, createFromParcel7, bool, readString3, readString4, valueOf3, valueOf4, valueOf5, userId, valueOf15, createFromParcel8, messagesChatSettingsYoulaDealInfoDto, valueOf6, valueOf7, valueOf8, messagesChatSettingsWritingDisabledDto, valueOf9, valueOf10, valueOf11);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsDto[] newArray(int i) {
            return new MessagesChatSettingsDto[i];
        }
    }

    public MessagesChatSettingsDto(UserId userId, String str, MessagesChatSettingsStateDto messagesChatSettingsStateDto, MessagesChatSettingsAclDto messagesChatSettingsAclDto, Integer num, Integer num2, String str2, Integer num3, MessagesPinnedMessageDto messagesPinnedMessageDto, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, List<UserId> list, Boolean bool, MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto, Boolean bool2, String str3, String str4, Boolean bool3, Boolean bool4, Boolean bool5, UserId userId2, Integer num4, MessagesChatSettingsYoulaDealDto messagesChatSettingsYoulaDealDto, MessagesChatSettingsYoulaDealInfoDto messagesChatSettingsYoulaDealInfoDto, Boolean bool6, Boolean bool7, Boolean bool8, MessagesChatSettingsWritingDisabledDto messagesChatSettingsWritingDisabledDto, Boolean bool9, Boolean bool10, Boolean bool11) {
        this.ownerId = userId;
        this.title = str;
        this.state = messagesChatSettingsStateDto;
        this.acl = messagesChatSettingsAclDto;
        this.membersCount = num;
        this.friendsCount = num2;
        this.description = str2;
        this.pinnedMessagesCount = num3;
        this.pinnedMessage = messagesPinnedMessageDto;
        this.photo = messagesChatSettingsPhotoDto;
        this.adminIds = list;
        this.isGroupChannel = bool;
        this.permissions = messagesChatSettingsPermissionsDto;
        this.isDisappearing = bool2;
        this.theme = str3;
        this.disappearingChatLink = str4;
        this.isService = bool3;
        this.disableServiceMessages = bool4;
        this.isDonut = bool5;
        this.donutOwnerId = userId2;
        this.typeMask = num4;
        this.youlaDeal = messagesChatSettingsYoulaDealDto;
        this.youlaDealInfo = messagesChatSettingsYoulaDealInfoDto;
        this.shortPollReactions = bool6;
        this.isBigChat = bool7;
        this.isPublic = bool8;
        this.writingDisabled = messagesChatSettingsWritingDisabledDto;
        this.isDeletedForAll = bool9;
        this.isIncognito = bool10;
        this.isStickersPopupAutoplayDisabled = bool11;
    }

    public final Integer d() {
        return this.friendsCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MessagesChatSettingsPhotoDto e() {
        return this.photo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsDto)) {
            return false;
        }
        MessagesChatSettingsDto messagesChatSettingsDto = (MessagesChatSettingsDto) obj;
        return epx.f(this.ownerId, messagesChatSettingsDto.ownerId) && epx.f(this.title, messagesChatSettingsDto.title) && this.state == messagesChatSettingsDto.state && epx.f(this.acl, messagesChatSettingsDto.acl) && epx.f(this.membersCount, messagesChatSettingsDto.membersCount) && epx.f(this.friendsCount, messagesChatSettingsDto.friendsCount) && epx.f(this.description, messagesChatSettingsDto.description) && epx.f(this.pinnedMessagesCount, messagesChatSettingsDto.pinnedMessagesCount) && epx.f(this.pinnedMessage, messagesChatSettingsDto.pinnedMessage) && epx.f(this.photo, messagesChatSettingsDto.photo) && epx.f(this.adminIds, messagesChatSettingsDto.adminIds) && epx.f(this.isGroupChannel, messagesChatSettingsDto.isGroupChannel) && epx.f(this.permissions, messagesChatSettingsDto.permissions) && epx.f(this.isDisappearing, messagesChatSettingsDto.isDisappearing) && epx.f(this.theme, messagesChatSettingsDto.theme) && epx.f(this.disappearingChatLink, messagesChatSettingsDto.disappearingChatLink) && epx.f(this.isService, messagesChatSettingsDto.isService) && epx.f(this.disableServiceMessages, messagesChatSettingsDto.disableServiceMessages) && epx.f(this.isDonut, messagesChatSettingsDto.isDonut) && epx.f(this.donutOwnerId, messagesChatSettingsDto.donutOwnerId) && epx.f(this.typeMask, messagesChatSettingsDto.typeMask) && epx.f(this.youlaDeal, messagesChatSettingsDto.youlaDeal) && epx.f(this.youlaDealInfo, messagesChatSettingsDto.youlaDealInfo) && epx.f(this.shortPollReactions, messagesChatSettingsDto.shortPollReactions) && epx.f(this.isBigChat, messagesChatSettingsDto.isBigChat) && epx.f(this.isPublic, messagesChatSettingsDto.isPublic) && epx.f(this.writingDisabled, messagesChatSettingsDto.writingDisabled) && epx.f(this.isDeletedForAll, messagesChatSettingsDto.isDeletedForAll) && epx.f(this.isIncognito, messagesChatSettingsDto.isIncognito) && epx.f(this.isStickersPopupAutoplayDisabled, messagesChatSettingsDto.isStickersPopupAutoplayDisabled);
    }

    public final Boolean f() {
        return this.isService;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.acl.hashCode() + ((this.state.hashCode() + urd0.a(Long.hashCode(this.ownerId.b) * 31, 31, this.title)) * 31)) * 31;
        Integer num = this.membersCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.friendsCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.pinnedMessagesCount;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MessagesPinnedMessageDto messagesPinnedMessageDto = this.pinnedMessage;
        int hashCode6 = (hashCode5 + (messagesPinnedMessageDto == null ? 0 : messagesPinnedMessageDto.hashCode())) * 31;
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        int hashCode7 = (hashCode6 + (messagesChatSettingsPhotoDto == null ? 0 : messagesChatSettingsPhotoDto.hashCode())) * 31;
        List<UserId> list = this.adminIds;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isGroupChannel;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto = this.permissions;
        int hashCode10 = (hashCode9 + (messagesChatSettingsPermissionsDto == null ? 0 : messagesChatSettingsPermissionsDto.hashCode())) * 31;
        Boolean bool2 = this.isDisappearing;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.theme;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disappearingChatLink;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.isService;
        int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.disableServiceMessages;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isDonut;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        UserId userId = this.donutOwnerId;
        int hashCode17 = (hashCode16 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num4 = this.typeMask;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MessagesChatSettingsYoulaDealDto messagesChatSettingsYoulaDealDto = this.youlaDeal;
        int hashCode19 = (hashCode18 + (messagesChatSettingsYoulaDealDto == null ? 0 : messagesChatSettingsYoulaDealDto.hashCode())) * 31;
        MessagesChatSettingsYoulaDealInfoDto messagesChatSettingsYoulaDealInfoDto = this.youlaDealInfo;
        int hashCode20 = (hashCode19 + (messagesChatSettingsYoulaDealInfoDto == null ? 0 : messagesChatSettingsYoulaDealInfoDto.hashCode())) * 31;
        Boolean bool6 = this.shortPollReactions;
        int hashCode21 = (hashCode20 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isBigChat;
        int hashCode22 = (hashCode21 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isPublic;
        int hashCode23 = (hashCode22 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        MessagesChatSettingsWritingDisabledDto messagesChatSettingsWritingDisabledDto = this.writingDisabled;
        int hashCode24 = (hashCode23 + (messagesChatSettingsWritingDisabledDto == null ? 0 : messagesChatSettingsWritingDisabledDto.hashCode())) * 31;
        Boolean bool9 = this.isDeletedForAll;
        int hashCode25 = (hashCode24 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.isIncognito;
        int hashCode26 = (hashCode25 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.isStickersPopupAutoplayDisabled;
        return hashCode26 + (bool11 != null ? bool11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatSettingsDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", acl=");
        sb.append(this.acl);
        sb.append(", membersCount=");
        sb.append(this.membersCount);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", pinnedMessagesCount=");
        sb.append(this.pinnedMessagesCount);
        sb.append(", pinnedMessage=");
        sb.append(this.pinnedMessage);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", adminIds=");
        sb.append(this.adminIds);
        sb.append(", isGroupChannel=");
        sb.append(this.isGroupChannel);
        sb.append(", permissions=");
        sb.append(this.permissions);
        sb.append(", isDisappearing=");
        sb.append(this.isDisappearing);
        sb.append(", theme=");
        sb.append(this.theme);
        sb.append(", disappearingChatLink=");
        sb.append(this.disappearingChatLink);
        sb.append(", isService=");
        sb.append(this.isService);
        sb.append(", disableServiceMessages=");
        sb.append(this.disableServiceMessages);
        sb.append(", isDonut=");
        sb.append(this.isDonut);
        sb.append(", donutOwnerId=");
        sb.append(this.donutOwnerId);
        sb.append(", typeMask=");
        sb.append(this.typeMask);
        sb.append(", youlaDeal=");
        sb.append(this.youlaDeal);
        sb.append(", youlaDealInfo=");
        sb.append(this.youlaDealInfo);
        sb.append(", shortPollReactions=");
        sb.append(this.shortPollReactions);
        sb.append(", isBigChat=");
        sb.append(this.isBigChat);
        sb.append(", isPublic=");
        sb.append(this.isPublic);
        sb.append(", writingDisabled=");
        sb.append(this.writingDisabled);
        sb.append(", isDeletedForAll=");
        sb.append(this.isDeletedForAll);
        sb.append(", isIncognito=");
        sb.append(this.isIncognito);
        sb.append(", isStickersPopupAutoplayDisabled=");
        return tn.a(sb, this.isStickersPopupAutoplayDisabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        this.state.writeToParcel(parcel, i);
        this.acl.writeToParcel(parcel, i);
        Integer num = this.membersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.friendsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.description);
        Integer num3 = this.pinnedMessagesCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        MessagesPinnedMessageDto messagesPinnedMessageDto = this.pinnedMessage;
        if (messagesPinnedMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesPinnedMessageDto.writeToParcel(parcel, i);
        }
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        if (messagesChatSettingsPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsPhotoDto.writeToParcel(parcel, i);
        }
        List<UserId> list = this.adminIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.isGroupChannel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto = this.permissions;
        if (messagesChatSettingsPermissionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsPermissionsDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isDisappearing;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.theme);
        parcel.writeString(this.disappearingChatLink);
        Boolean bool3 = this.isService;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.disableServiceMessages;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isDonut;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeParcelable(this.donutOwnerId, i);
        Integer num4 = this.typeMask;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        MessagesChatSettingsYoulaDealDto messagesChatSettingsYoulaDealDto = this.youlaDeal;
        if (messagesChatSettingsYoulaDealDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsYoulaDealDto.writeToParcel(parcel, i);
        }
        MessagesChatSettingsYoulaDealInfoDto messagesChatSettingsYoulaDealInfoDto = this.youlaDealInfo;
        if (messagesChatSettingsYoulaDealInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsYoulaDealInfoDto.writeToParcel(parcel, i);
        }
        Boolean bool6 = this.shortPollReactions;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.isBigChat;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.isPublic;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        MessagesChatSettingsWritingDisabledDto messagesChatSettingsWritingDisabledDto = this.writingDisabled;
        if (messagesChatSettingsWritingDisabledDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsWritingDisabledDto.writeToParcel(parcel, i);
        }
        Boolean bool9 = this.isDeletedForAll;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.isIncognito;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.isStickersPopupAutoplayDisabled;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
    }

    public /* synthetic */ MessagesChatSettingsDto(UserId userId, String str, MessagesChatSettingsStateDto messagesChatSettingsStateDto, MessagesChatSettingsAclDto messagesChatSettingsAclDto, Integer num, Integer num2, String str2, Integer num3, MessagesPinnedMessageDto messagesPinnedMessageDto, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, List list, Boolean bool, MessagesChatSettingsPermissionsDto messagesChatSettingsPermissionsDto, Boolean bool2, String str3, String str4, Boolean bool3, Boolean bool4, Boolean bool5, UserId userId2, Integer num4, MessagesChatSettingsYoulaDealDto messagesChatSettingsYoulaDealDto, MessagesChatSettingsYoulaDealInfoDto messagesChatSettingsYoulaDealInfoDto, Boolean bool6, Boolean bool7, Boolean bool8, MessagesChatSettingsWritingDisabledDto messagesChatSettingsWritingDisabledDto, Boolean bool9, Boolean bool10, Boolean bool11, int i, zcl zclVar) {
        this(userId, str, messagesChatSettingsStateDto, messagesChatSettingsAclDto, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : messagesPinnedMessageDto, (i & 512) != 0 ? null : messagesChatSettingsPhotoDto, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : messagesChatSettingsPermissionsDto, (i & 8192) != 0 ? null : bool2, (i & 16384) != 0 ? null : str3, (32768 & i) != 0 ? null : str4, (65536 & i) != 0 ? null : bool3, (131072 & i) != 0 ? null : bool4, (262144 & i) != 0 ? null : bool5, (524288 & i) != 0 ? null : userId2, (1048576 & i) != 0 ? null : num4, (2097152 & i) != 0 ? null : messagesChatSettingsYoulaDealDto, (4194304 & i) != 0 ? null : messagesChatSettingsYoulaDealInfoDto, (8388608 & i) != 0 ? null : bool6, (16777216 & i) != 0 ? null : bool7, (33554432 & i) != 0 ? null : bool8, (67108864 & i) != 0 ? null : messagesChatSettingsWritingDisabledDto, (134217728 & i) != 0 ? null : bool9, (268435456 & i) != 0 ? null : bool10, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool11);
    }
}
