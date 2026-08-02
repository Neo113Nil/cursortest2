package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseGeoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.wp;
import xsna.zcl;

/* compiled from: MessagesMessageDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageDto> CREATOR = new a();

    @pmi0("action")
    private final MessagesActionOneOfDto action;

    @pmi0("admin_author_id")
    private final UserId adminAuthorId;

    @pmi0("attachments")
    private final List<MessagesMessageAttachmentDto> attachments;

    @pmi0("conversation_message_id")
    private final int conversationMessageId;

    @pmi0("date")
    private final int date;

    @pmi0("deleted")
    private final BaseBoolIntDto deleted;

    @pmi0("expire_ttl")
    private final Integer expireTtl;

    @pmi0("force_autoplay_media")
    private final Boolean forceAutoplayMedia;

    @pmi0("format_data")
    private final MessagesMessageFormatDataDto formatData;

    @pmi0("from_app_id")
    private final Integer fromAppId;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("fwd_messages")
    private final List<MessagesForeignMessageDto> fwdMessages;

    @pmi0("geo")
    private final BaseGeoDto geo;

    @pmi0("id")
    private final int id;

    @pmi0("important")
    private final Boolean important;

    @pmi0("is_cropped")
    private final Boolean isCropped;

    @pmi0("is_expired")
    private final Boolean isExpired;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("is_mentioned_user")
    private final boolean isMentionedUser;

    @pmi0("is_pinned")
    private final Boolean isPinned;

    @pmi0("is_silent")
    private final Boolean isSilent;

    @pmi0("is_unavailable")
    private final Boolean isUnavailable;

    @pmi0("keyboard")
    private final MessagesKeyboardDto keyboard;

    @pmi0("last_reaction_id")
    private final Integer lastReactionId;

    @pmi0("linked_cmid")
    private final Integer linkedCmid;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("message_tag")
    private final String messageTag;

    @pmi0("nested_msgs_count")
    private final Integer nestedMsgsCount;

    @pmi0("nested_msgs_has_more")
    private final Boolean nestedMsgsHasMore;

    @pmi0("out")
    private final BaseBoolIntDto out;

    @pmi0("payload")
    private final String payload;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("pinned_at")
    private final Integer pinnedAt;

    @pmi0("postponed_info")
    private final MessagesPostponedInfoDto postponedInfo;

    @pmi0("random_id")
    private final Integer randomId;

    @pmi0("reaction_id")
    private final Integer reactionId;

    @pmi0("reactions")
    private final List<MessagesReactionCounterResponseItemDto> reactions;

    @pmi0("ref")
    private final String ref;

    @pmi0("ref_source")
    private final String refSource;

    @pmi0("reply_message")
    private final MessagesForeignMessageDto replyMessage;

    @pmi0("template")
    private final MessagesMessageTemplateDto template;

    @pmi0("text")
    private final String text;

    @pmi0("ttl")
    private final Integer ttl;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("version")
    private final long version;

    @pmi0("was_listened")
    private final Boolean wasListened;

    @pmi0("was_played")
    private final Boolean wasPlayed;

    /* compiled from: MessagesMessageDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageDto createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList;
            int i;
            int i2;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Integer num;
            MessagesPostponedInfoDto createFromParcel;
            MessagesPostponedInfoDto messagesPostponedInfoDto;
            MessagesActionOneOfDto createFromParcel2;
            UserId userId;
            Boolean bool;
            ArrayList arrayList2;
            Integer num2;
            MessagesMessageTemplateDto messagesMessageTemplateDto;
            ArrayList arrayList3;
            ArrayList arrayList4;
            BaseBoolIntDto baseBoolIntDto;
            Boolean valueOf9;
            ArrayList arrayList5;
            MessagesMessageFormatDataDto createFromParcel3;
            Boolean valueOf10;
            Boolean valueOf11;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(MessagesMessageDto.class.getClassLoader());
            int readInt3 = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                cls = MessagesMessageDto.class;
                z = true;
            } else {
                cls = MessagesMessageDto.class;
                z = false;
            }
            long readLong = parcel.readLong();
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(cls.getClassLoader());
            UserId userId3 = (UserId) parcel.readParcelable(cls.getClassLoader());
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
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Class cls2 = cls;
            Boolean bool2 = valueOf;
            String readString2 = parcel.readString();
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesForeignMessageDto createFromParcel4 = parcel.readInt() == 0 ? null : MessagesForeignMessageDto.CREATOR.createFromParcel(parcel);
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                i = readInt;
                int i3 = 0;
                while (true) {
                    i2 = readInt2;
                    if (i3 == readInt4) {
                        break;
                    }
                    i3 = en.a(MessagesReactionCounterResponseItemDto.CREATOR, parcel, arrayList, i3, 1);
                    readInt2 = i2;
                    userId2 = userId2;
                }
            } else {
                i = readInt;
                arrayList = null;
                i2 = readInt2;
            }
            UserId userId4 = userId2;
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                num = valueOf16;
                createFromParcel = null;
            } else {
                num = valueOf16;
                createFromParcel = MessagesPostponedInfoDto.CREATOR.createFromParcel(parcel);
            }
            MessagesPostponedInfoDto messagesPostponedInfoDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                messagesPostponedInfoDto = messagesPostponedInfoDto2;
                createFromParcel2 = null;
            } else {
                messagesPostponedInfoDto = messagesPostponedInfoDto2;
                createFromParcel2 = MessagesActionOneOfDto.CREATOR.createFromParcel(parcel);
            }
            MessagesActionOneOfDto messagesActionOneOfDto = createFromParcel2;
            UserId userId5 = (UserId) parcel.readParcelable(cls2.getClassLoader());
            if (parcel.readInt() == 0) {
                userId = userId5;
                bool = valueOf4;
                num2 = valueOf17;
                arrayList2 = null;
            } else {
                userId = userId5;
                int readInt5 = parcel.readInt();
                bool = valueOf4;
                arrayList2 = new ArrayList(readInt5);
                num2 = valueOf17;
                int i4 = 0;
                while (i4 != readInt5) {
                    i4 = en.a(MessagesMessageAttachmentDto.CREATOR, parcel, arrayList2, i4, 1);
                    readInt5 = readInt5;
                    readInt3 = readInt3;
                }
            }
            int i5 = readInt3;
            MessagesMessageTemplateDto createFromParcel5 = parcel.readInt() == 0 ? null : MessagesMessageTemplateDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(cls2.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                messagesMessageTemplateDto = createFromParcel5;
                arrayList3 = new ArrayList(readInt6);
                arrayList4 = arrayList2;
                int i6 = 0;
                while (true) {
                    baseBoolIntDto = baseBoolIntDto3;
                    if (i6 == readInt6) {
                        break;
                    }
                    i6 = en.a(MessagesForeignMessageDto.CREATOR, parcel, arrayList3, i6, 1);
                    baseBoolIntDto3 = baseBoolIntDto;
                    readInt6 = readInt6;
                }
            } else {
                messagesMessageTemplateDto = createFromParcel5;
                arrayList4 = arrayList2;
                arrayList3 = null;
                baseBoolIntDto = baseBoolIntDto3;
            }
            BaseGeoDto createFromParcel6 = parcel.readInt() == 0 ? null : BaseGeoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesKeyboardDto createFromParcel7 = parcel.readInt() == 0 ? null : MessagesKeyboardDto.CREATOR.createFromParcel(parcel);
            Boolean bool3 = bool;
            Boolean bool4 = valueOf9;
            Boolean bool5 = valueOf8;
            ArrayList arrayList6 = arrayList4;
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList3;
                createFromParcel3 = null;
            } else {
                arrayList5 = arrayList3;
                createFromParcel3 = MessagesMessageFormatDataDto.CREATOR.createFromParcel(parcel);
            }
            MessagesMessageFormatDataDto messagesMessageFormatDataDto = createFromParcel3;
            Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool6 = valueOf5;
            Integer num3 = valueOf13;
            Integer num4 = valueOf15;
            Integer num5 = num2;
            int i7 = i;
            Boolean bool7 = valueOf7;
            ArrayList arrayList7 = arrayList5;
            Integer num6 = valueOf20;
            String readString4 = parcel.readString();
            Integer num7 = null;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                num7 = Integer.valueOf(parcel.readInt());
            }
            return new MessagesMessageDto(i7, i2, userId4, i5, readString, z, readLong, baseBoolIntDto2, userId3, bool2, valueOf2, valueOf12, readString2, num3, valueOf14, valueOf3, createFromParcel4, num4, arrayList, num, bool3, num5, bool6, valueOf6, bool7, valueOf18, bool5, messagesPostponedInfoDto, messagesActionOneOfDto, userId, arrayList6, messagesMessageTemplateDto, baseBoolIntDto, arrayList7, createFromParcel6, bool4, createFromParcel7, readString3, messagesMessageFormatDataDto, valueOf19, valueOf10, num6, valueOf11, valueOf21, readString4, readString5, num7);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageDto[] newArray(int i) {
            return new MessagesMessageDto[i];
        }
    }

    public MessagesMessageDto(int i, int i2, UserId userId, int i3, String str, boolean z, long j, BaseBoolIntDto baseBoolIntDto, UserId userId2, Boolean bool, Boolean bool2, Integer num, String str2, Integer num2, Integer num3, Boolean bool3, MessagesForeignMessageDto messagesForeignMessageDto, Integer num4, List<MessagesReactionCounterResponseItemDto> list, Integer num5, Boolean bool4, Integer num6, Boolean bool5, Boolean bool6, Boolean bool7, Integer num7, Boolean bool8, MessagesPostponedInfoDto messagesPostponedInfoDto, MessagesActionOneOfDto messagesActionOneOfDto, UserId userId3, List<MessagesMessageAttachmentDto> list2, MessagesMessageTemplateDto messagesMessageTemplateDto, BaseBoolIntDto baseBoolIntDto2, List<MessagesForeignMessageDto> list3, BaseGeoDto baseGeoDto, Boolean bool9, MessagesKeyboardDto messagesKeyboardDto, String str3, MessagesMessageFormatDataDto messagesMessageFormatDataDto, Integer num8, Boolean bool10, Integer num9, Boolean bool11, Integer num10, String str4, String str5, Integer num11) {
        this.conversationMessageId = i;
        this.date = i2;
        this.fromId = userId;
        this.id = i3;
        this.text = str;
        this.isMentionedUser = z;
        this.version = j;
        this.out = baseBoolIntDto;
        this.peerId = userId2;
        this.important = bool;
        this.isHidden = bool2;
        this.membersCount = num;
        this.messageTag = str2;
        this.expireTtl = num2;
        this.ttl = num3;
        this.isExpired = bool3;
        this.replyMessage = messagesForeignMessageDto;
        this.reactionId = num4;
        this.reactions = list;
        this.lastReactionId = num5;
        this.nestedMsgsHasMore = bool4;
        this.nestedMsgsCount = num6;
        this.isPinned = bool5;
        this.wasListened = bool6;
        this.wasPlayed = bool7;
        this.pinnedAt = num7;
        this.forceAutoplayMedia = bool8;
        this.postponedInfo = messagesPostponedInfoDto;
        this.action = messagesActionOneOfDto;
        this.adminAuthorId = userId3;
        this.attachments = list2;
        this.template = messagesMessageTemplateDto;
        this.deleted = baseBoolIntDto2;
        this.fwdMessages = list3;
        this.geo = baseGeoDto;
        this.isCropped = bool9;
        this.keyboard = messagesKeyboardDto;
        this.payload = str3;
        this.formatData = messagesMessageFormatDataDto;
        this.updateTime = num8;
        this.isSilent = bool10;
        this.fromAppId = num9;
        this.isUnavailable = bool11;
        this.randomId = num10;
        this.ref = str4;
        this.refSource = str5;
        this.linkedCmid = num11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageDto)) {
            return false;
        }
        MessagesMessageDto messagesMessageDto = (MessagesMessageDto) obj;
        return this.conversationMessageId == messagesMessageDto.conversationMessageId && this.date == messagesMessageDto.date && epx.f(this.fromId, messagesMessageDto.fromId) && this.id == messagesMessageDto.id && epx.f(this.text, messagesMessageDto.text) && this.isMentionedUser == messagesMessageDto.isMentionedUser && this.version == messagesMessageDto.version && this.out == messagesMessageDto.out && epx.f(this.peerId, messagesMessageDto.peerId) && epx.f(this.important, messagesMessageDto.important) && epx.f(this.isHidden, messagesMessageDto.isHidden) && epx.f(this.membersCount, messagesMessageDto.membersCount) && epx.f(this.messageTag, messagesMessageDto.messageTag) && epx.f(this.expireTtl, messagesMessageDto.expireTtl) && epx.f(this.ttl, messagesMessageDto.ttl) && epx.f(this.isExpired, messagesMessageDto.isExpired) && epx.f(this.replyMessage, messagesMessageDto.replyMessage) && epx.f(this.reactionId, messagesMessageDto.reactionId) && epx.f(this.reactions, messagesMessageDto.reactions) && epx.f(this.lastReactionId, messagesMessageDto.lastReactionId) && epx.f(this.nestedMsgsHasMore, messagesMessageDto.nestedMsgsHasMore) && epx.f(this.nestedMsgsCount, messagesMessageDto.nestedMsgsCount) && epx.f(this.isPinned, messagesMessageDto.isPinned) && epx.f(this.wasListened, messagesMessageDto.wasListened) && epx.f(this.wasPlayed, messagesMessageDto.wasPlayed) && epx.f(this.pinnedAt, messagesMessageDto.pinnedAt) && epx.f(this.forceAutoplayMedia, messagesMessageDto.forceAutoplayMedia) && epx.f(this.postponedInfo, messagesMessageDto.postponedInfo) && epx.f(this.action, messagesMessageDto.action) && epx.f(this.adminAuthorId, messagesMessageDto.adminAuthorId) && epx.f(this.attachments, messagesMessageDto.attachments) && epx.f(this.template, messagesMessageDto.template) && this.deleted == messagesMessageDto.deleted && epx.f(this.fwdMessages, messagesMessageDto.fwdMessages) && epx.f(this.geo, messagesMessageDto.geo) && epx.f(this.isCropped, messagesMessageDto.isCropped) && epx.f(this.keyboard, messagesMessageDto.keyboard) && epx.f(this.payload, messagesMessageDto.payload) && epx.f(this.formatData, messagesMessageDto.formatData) && epx.f(this.updateTime, messagesMessageDto.updateTime) && epx.f(this.isSilent, messagesMessageDto.isSilent) && epx.f(this.fromAppId, messagesMessageDto.fromAppId) && epx.f(this.isUnavailable, messagesMessageDto.isUnavailable) && epx.f(this.randomId, messagesMessageDto.randomId) && epx.f(this.ref, messagesMessageDto.ref) && epx.f(this.refSource, messagesMessageDto.refSource) && epx.f(this.linkedCmid, messagesMessageDto.linkedCmid);
    }

    public final int hashCode() {
        int a2 = bh10.a(wp.b(this.out, bh10.a(qoy.b(urd0.a(shy.a(this.id, bh10.a(shy.a(this.date, Integer.hashCode(this.conversationMessageId) * 31, 31), 31, this.fromId.b), 31), 31, this.text), 31, this.isMentionedUser), 31, this.version), 31), 31, this.peerId.b);
        Boolean bool = this.important;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isHidden;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.membersCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.messageTag;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.expireTtl;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.ttl;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool3 = this.isExpired;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        int hashCode8 = (hashCode7 + (messagesForeignMessageDto == null ? 0 : messagesForeignMessageDto.hashCode())) * 31;
        Integer num4 = this.reactionId;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<MessagesReactionCounterResponseItemDto> list = this.reactions;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num5 = this.lastReactionId;
        int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool4 = this.nestedMsgsHasMore;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num6 = this.nestedMsgsCount;
        int hashCode13 = (hashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool5 = this.isPinned;
        int hashCode14 = (hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.wasListened;
        int hashCode15 = (hashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.wasPlayed;
        int hashCode16 = (hashCode15 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Integer num7 = this.pinnedAt;
        int hashCode17 = (hashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool8 = this.forceAutoplayMedia;
        int hashCode18 = (hashCode17 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        MessagesPostponedInfoDto messagesPostponedInfoDto = this.postponedInfo;
        int hashCode19 = (hashCode18 + (messagesPostponedInfoDto == null ? 0 : messagesPostponedInfoDto.hashCode())) * 31;
        MessagesActionOneOfDto messagesActionOneOfDto = this.action;
        int hashCode20 = (hashCode19 + (messagesActionOneOfDto == null ? 0 : messagesActionOneOfDto.hashCode())) * 31;
        UserId userId = this.adminAuthorId;
        int hashCode21 = (hashCode20 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<MessagesMessageAttachmentDto> list2 = this.attachments;
        int hashCode22 = (hashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MessagesMessageTemplateDto messagesMessageTemplateDto = this.template;
        int hashCode23 = (hashCode22 + (messagesMessageTemplateDto == null ? 0 : messagesMessageTemplateDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.deleted;
        int hashCode24 = (hashCode23 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        List<MessagesForeignMessageDto> list3 = this.fwdMessages;
        int hashCode25 = (hashCode24 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode26 = (hashCode25 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        Boolean bool9 = this.isCropped;
        int hashCode27 = (hashCode26 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        MessagesKeyboardDto messagesKeyboardDto = this.keyboard;
        int hashCode28 = (hashCode27 + (messagesKeyboardDto == null ? 0 : messagesKeyboardDto.hashCode())) * 31;
        String str2 = this.payload;
        int hashCode29 = (hashCode28 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessagesMessageFormatDataDto messagesMessageFormatDataDto = this.formatData;
        int hashCode30 = (hashCode29 + (messagesMessageFormatDataDto == null ? 0 : messagesMessageFormatDataDto.hashCode())) * 31;
        Integer num8 = this.updateTime;
        int hashCode31 = (hashCode30 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool10 = this.isSilent;
        int hashCode32 = (hashCode31 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Integer num9 = this.fromAppId;
        int hashCode33 = (hashCode32 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool11 = this.isUnavailable;
        int hashCode34 = (hashCode33 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Integer num10 = this.randomId;
        int hashCode35 = (hashCode34 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str3 = this.ref;
        int hashCode36 = (hashCode35 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.refSource;
        int hashCode37 = (hashCode36 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num11 = this.linkedCmid;
        return hashCode37 + (num11 != null ? num11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesMessageDto(conversationMessageId=");
        sb.append(this.conversationMessageId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", isMentionedUser=");
        sb.append(this.isMentionedUser);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", out=");
        sb.append(this.out);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", important=");
        sb.append(this.important);
        sb.append(", isHidden=");
        sb.append(this.isHidden);
        sb.append(", membersCount=");
        sb.append(this.membersCount);
        sb.append(", messageTag=");
        sb.append(this.messageTag);
        sb.append(", expireTtl=");
        sb.append(this.expireTtl);
        sb.append(", ttl=");
        sb.append(this.ttl);
        sb.append(", isExpired=");
        sb.append(this.isExpired);
        sb.append(", replyMessage=");
        sb.append(this.replyMessage);
        sb.append(", reactionId=");
        sb.append(this.reactionId);
        sb.append(", reactions=");
        sb.append(this.reactions);
        sb.append(", lastReactionId=");
        sb.append(this.lastReactionId);
        sb.append(", nestedMsgsHasMore=");
        sb.append(this.nestedMsgsHasMore);
        sb.append(", nestedMsgsCount=");
        sb.append(this.nestedMsgsCount);
        sb.append(", isPinned=");
        sb.append(this.isPinned);
        sb.append(", wasListened=");
        sb.append(this.wasListened);
        sb.append(", wasPlayed=");
        sb.append(this.wasPlayed);
        sb.append(", pinnedAt=");
        sb.append(this.pinnedAt);
        sb.append(", forceAutoplayMedia=");
        sb.append(this.forceAutoplayMedia);
        sb.append(", postponedInfo=");
        sb.append(this.postponedInfo);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", adminAuthorId=");
        sb.append(this.adminAuthorId);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", template=");
        sb.append(this.template);
        sb.append(", deleted=");
        sb.append(this.deleted);
        sb.append(", fwdMessages=");
        sb.append(this.fwdMessages);
        sb.append(", geo=");
        sb.append(this.geo);
        sb.append(", isCropped=");
        sb.append(this.isCropped);
        sb.append(", keyboard=");
        sb.append(this.keyboard);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", formatData=");
        sb.append(this.formatData);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", isSilent=");
        sb.append(this.isSilent);
        sb.append(", fromAppId=");
        sb.append(this.fromAppId);
        sb.append(", isUnavailable=");
        sb.append(this.isUnavailable);
        sb.append(", randomId=");
        sb.append(this.randomId);
        sb.append(", ref=");
        sb.append(this.ref);
        sb.append(", refSource=");
        sb.append(this.refSource);
        sb.append(", linkedCmid=");
        return uqi.b(sb, this.linkedCmid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.conversationMessageId);
        parcel.writeInt(this.date);
        parcel.writeParcelable(this.fromId, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.text);
        parcel.writeInt(this.isMentionedUser ? 1 : 0);
        parcel.writeLong(this.version);
        parcel.writeParcelable(this.out, i);
        parcel.writeParcelable(this.peerId, i);
        Boolean bool = this.important;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num = this.membersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.messageTag);
        Integer num2 = this.expireTtl;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.ttl;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool3 = this.isExpired;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        if (messagesForeignMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesForeignMessageDto.writeToParcel(parcel, i);
        }
        Integer num4 = this.reactionId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        List<MessagesReactionCounterResponseItemDto> list = this.reactions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesReactionCounterResponseItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num5 = this.lastReactionId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Boolean bool4 = this.nestedMsgsHasMore;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Integer num6 = this.nestedMsgsCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Boolean bool5 = this.isPinned;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.wasListened;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.wasPlayed;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Integer num7 = this.pinnedAt;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        Boolean bool8 = this.forceAutoplayMedia;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        MessagesPostponedInfoDto messagesPostponedInfoDto = this.postponedInfo;
        if (messagesPostponedInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesPostponedInfoDto.writeToParcel(parcel, i);
        }
        MessagesActionOneOfDto messagesActionOneOfDto = this.action;
        if (messagesActionOneOfDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesActionOneOfDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.adminAuthorId, i);
        List<MessagesMessageAttachmentDto> list2 = this.attachments;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MessagesMessageAttachmentDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        MessagesMessageTemplateDto messagesMessageTemplateDto = this.template;
        if (messagesMessageTemplateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageTemplateDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.deleted, i);
        List<MessagesForeignMessageDto> list3 = this.fwdMessages;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MessagesForeignMessageDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        BaseGeoDto baseGeoDto = this.geo;
        if (baseGeoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseGeoDto.writeToParcel(parcel, i);
        }
        Boolean bool9 = this.isCropped;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        MessagesKeyboardDto messagesKeyboardDto = this.keyboard;
        if (messagesKeyboardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesKeyboardDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.payload);
        MessagesMessageFormatDataDto messagesMessageFormatDataDto = this.formatData;
        if (messagesMessageFormatDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageFormatDataDto.writeToParcel(parcel, i);
        }
        Integer num8 = this.updateTime;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Boolean bool10 = this.isSilent;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Integer num9 = this.fromAppId;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Boolean bool11 = this.isUnavailable;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Integer num10 = this.randomId;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        parcel.writeString(this.ref);
        parcel.writeString(this.refSource);
        Integer num11 = this.linkedCmid;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
    }

    public /* synthetic */ MessagesMessageDto(int i, int i2, UserId userId, int i3, String str, boolean z, long j, BaseBoolIntDto baseBoolIntDto, UserId userId2, Boolean bool, Boolean bool2, Integer num, String str2, Integer num2, Integer num3, Boolean bool3, MessagesForeignMessageDto messagesForeignMessageDto, Integer num4, List list, Integer num5, Boolean bool4, Integer num6, Boolean bool5, Boolean bool6, Boolean bool7, Integer num7, Boolean bool8, MessagesPostponedInfoDto messagesPostponedInfoDto, MessagesActionOneOfDto messagesActionOneOfDto, UserId userId3, List list2, MessagesMessageTemplateDto messagesMessageTemplateDto, BaseBoolIntDto baseBoolIntDto2, List list3, BaseGeoDto baseGeoDto, Boolean bool9, MessagesKeyboardDto messagesKeyboardDto, String str3, MessagesMessageFormatDataDto messagesMessageFormatDataDto, Integer num8, Boolean bool10, Integer num9, Boolean bool11, Integer num10, String str4, String str5, Integer num11, int i4, int i5, zcl zclVar) {
        this(i, i2, userId, i3, str, z, j, baseBoolIntDto, userId2, (i4 & 512) != 0 ? null : bool, (i4 & 1024) != 0 ? null : bool2, (i4 & 2048) != 0 ? null : num, (i4 & 4096) != 0 ? null : str2, (i4 & 8192) != 0 ? null : num2, (i4 & 16384) != 0 ? null : num3, (32768 & i4) != 0 ? null : bool3, (65536 & i4) != 0 ? null : messagesForeignMessageDto, (131072 & i4) != 0 ? null : num4, (262144 & i4) != 0 ? null : list, (524288 & i4) != 0 ? null : num5, (1048576 & i4) != 0 ? null : bool4, (2097152 & i4) != 0 ? null : num6, (4194304 & i4) != 0 ? null : bool5, (8388608 & i4) != 0 ? null : bool6, (16777216 & i4) != 0 ? null : bool7, (33554432 & i4) != 0 ? null : num7, (67108864 & i4) != 0 ? null : bool8, (134217728 & i4) != 0 ? null : messagesPostponedInfoDto, (268435456 & i4) != 0 ? null : messagesActionOneOfDto, (536870912 & i4) != 0 ? null : userId3, (1073741824 & i4) != 0 ? null : list2, (i4 & Integer.MIN_VALUE) != 0 ? null : messagesMessageTemplateDto, (i5 & 1) != 0 ? null : baseBoolIntDto2, (i5 & 2) != 0 ? null : list3, (i5 & 4) != 0 ? null : baseGeoDto, (i5 & 8) != 0 ? null : bool9, (i5 & 16) != 0 ? null : messagesKeyboardDto, (i5 & 32) != 0 ? null : str3, (i5 & 64) != 0 ? null : messagesMessageFormatDataDto, (i5 & 128) != 0 ? null : num8, (i5 & 256) != 0 ? null : bool10, (i5 & 512) != 0 ? null : num9, (i5 & 1024) != 0 ? null : bool11, (i5 & 2048) != 0 ? null : num10, (i5 & 4096) != 0 ? null : str4, (i5 & 8192) != 0 ? null : str5, (i5 & 16384) != 0 ? null : num11);
    }
}
