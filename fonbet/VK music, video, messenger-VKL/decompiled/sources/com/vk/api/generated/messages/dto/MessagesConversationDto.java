package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesConversationDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationDto> CREATOR = new a();

    @pmi0("ads_tag")
    private final MessagesConversationAdsTagDto adsTag;

    @pmi0("alive")
    private final Boolean alive;

    @pmi0("business_notify_data")
    private final MessagesConversationBusinessNotifyDataDto businessNotifyData;

    @pmi0("call_in_progress")
    private final MessagesCallInProgressDto callInProgress;

    @pmi0("can_receive_money")
    private final Boolean canReceiveMoney;

    @pmi0("can_send_money")
    private final Boolean canSendMoney;

    @pmi0("can_write")
    private final MessagesConversationCanWriteDto canWrite;

    @pmi0("chat_settings")
    private final MessagesChatSettingsDto chatSettings;

    @pmi0("conversation_bar")
    private final MessagesConversationBarDto conversationBar;

    @pmi0("conversation_card")
    private final MessagesConversationCardDto conversationCard;

    @pmi0("current_keyboard")
    private final MessagesKeyboardDto currentKeyboard;

    @pmi0("expire_cmids")
    private final List<Integer> expireCmids;

    @pmi0("expire_messages")
    private final List<Integer> expireMessages;

    @pmi0("folder_ids")
    private final List<Integer> folderIds;

    @pmi0("has_postponed_errors")
    private final Boolean hasPostponedErrors;

    @pmi0("important")
    private final Boolean important;

    @pmi0("in_read")
    private final int inRead;

    @pmi0("in_read_cmid")
    private final int inReadCmid;

    @pmi0("is_archived")
    private final Boolean isArchived;

    @pmi0("is_gift_suggestion_enabled")
    private final Boolean isGiftSuggestionEnabled;

    @pmi0("is_marked_unread")
    private final Boolean isMarkedUnread;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("is_promo")
    private final Boolean isPromo;

    @pmi0("last_conversation_message_id")
    private final int lastConversationMessageId;

    @pmi0("last_message_id")
    private final int lastMessageId;

    @pmi0("mention_cmids")
    private final List<Integer> mentionCmids;

    @pmi0("mentions")
    private final List<Integer> mentions;

    @pmi0("message_request_data")
    private final MessagesMessageRequestDataDto messageRequestData;

    @pmi0("out_read")
    private final int outRead;

    @pmi0("out_read_by")
    private final MessagesOutReadByDto outReadBy;

    @pmi0("out_read_cmid")
    private final int outReadCmid;

    @pmi0("payload")
    private final MessagesConversationPayloadDto payload;

    @pmi0("peer")
    private final MessagesConversationPeerDto peer;

    @pmi0("peer_flags")
    private final Integer peerFlags;

    @pmi0("postponed_count")
    private final Integer postponedCount;

    @pmi0("push_settings")
    private final MessagesPushSettingsDto pushSettings;

    @pmi0("sort_id")
    private final MessagesConversationSortIdDto sortId;

    @pmi0("space_id")
    private final Long spaceId;

    @pmi0("spam_expiration")
    private final Integer spamExpiration;

    @pmi0("special_service_type")
    private final SpecialServiceTypeDto specialServiceType;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("tags")
    private final List<Integer> tags;

    @pmi0("timestamp")
    private final Integer timestamp;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("transition_data")
    private final MessagesTransitionDataDto transitionData;

    @pmi0("unanswered")
    private final Boolean unanswered;

    @pmi0("unread_count")
    private final Integer unreadCount;

    @pmi0("unread_reactions")
    private final List<Integer> unreadReactions;

    @pmi0("version")
    private final long version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesConversationDto.kt */
    public static final class SpecialServiceTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SpecialServiceTypeDto[] $VALUES;

        @pmi0("business_notify")
        public static final SpecialServiceTypeDto BUSINESS_NOTIFY;
        public static final Parcelable.Creator<SpecialServiceTypeDto> CREATOR;
        private final String value;

        /* compiled from: MessagesConversationDto.kt */
        public static final class a implements Parcelable.Creator<SpecialServiceTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SpecialServiceTypeDto createFromParcel(Parcel parcel) {
                return SpecialServiceTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SpecialServiceTypeDto[] newArray(int i) {
                return new SpecialServiceTypeDto[i];
            }
        }

        static {
            SpecialServiceTypeDto specialServiceTypeDto = new SpecialServiceTypeDto("BUSINESS_NOTIFY", 0, "business_notify");
            BUSINESS_NOTIFY = specialServiceTypeDto;
            SpecialServiceTypeDto[] specialServiceTypeDtoArr = {specialServiceTypeDto};
            $VALUES = specialServiceTypeDtoArr;
            $ENTRIES = new asp(specialServiceTypeDtoArr);
            CREATOR = new a();
        }

        private SpecialServiceTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SpecialServiceTypeDto valueOf(String str) {
            return (SpecialServiceTypeDto) Enum.valueOf(SpecialServiceTypeDto.class, str);
        }

        public static SpecialServiceTypeDto[] values() {
            return (SpecialServiceTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: MessagesConversationDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean bool;
            MessagesConversationBusinessNotifyDataDto createFromParcel;
            MessagesConversationBusinessNotifyDataDto messagesConversationBusinessNotifyDataDto;
            MessagesOutReadByDto messagesOutReadByDto;
            ArrayList arrayList;
            MessagesConversationPeerDto messagesConversationPeerDto;
            ArrayList arrayList2;
            ArrayList arrayList3;
            boolean z;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            MessagesConversationBarDto messagesConversationBarDto;
            MessagesKeyboardDto createFromParcel2;
            MessagesKeyboardDto messagesKeyboardDto;
            MessagesPushSettingsDto createFromParcel3;
            MessagesPushSettingsDto messagesPushSettingsDto;
            MessagesConversationCanWriteDto createFromParcel4;
            Boolean valueOf4;
            Boolean valueOf5;
            MessagesConversationCanWriteDto messagesConversationCanWriteDto;
            MessagesChatSettingsDto createFromParcel5;
            MessagesChatSettingsDto messagesChatSettingsDto;
            MessagesCallInProgressDto createFromParcel6;
            Boolean valueOf6;
            Boolean valueOf7;
            MessagesCallInProgressDto messagesCallInProgressDto;
            MessagesConversationPayloadDto createFromParcel7;
            MessagesConversationPayloadDto messagesConversationPayloadDto;
            ArrayList arrayList8;
            ArrayList arrayList9;
            MessagesConversationCardDto messagesConversationCardDto;
            ArrayList arrayList10;
            ArrayList arrayList11;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            ArrayList arrayList12;
            Integer num;
            ArrayList arrayList13;
            MessagesConversationPeerDto messagesConversationPeerDto2;
            Boolean valueOf11;
            MessagesConversationPeerDto createFromParcel8 = MessagesConversationPeerDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            long readLong = parcel.readLong();
            MessagesConversationSortIdDto createFromParcel9 = parcel.readInt() == 0 ? null : MessagesConversationSortIdDto.CREATOR.createFromParcel(parcel);
            Integer valueOf12 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesOutReadByDto createFromParcel10 = parcel.readInt() == 0 ? null : MessagesOutReadByDto.CREATOR.createFromParcel(parcel);
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
            SpecialServiceTypeDto createFromParcel11 = parcel.readInt() == 0 ? null : SpecialServiceTypeDto.CREATOR.createFromParcel(parcel);
            MessagesMessageRequestDataDto createFromParcel12 = parcel.readInt() == 0 ? null : MessagesMessageRequestDataDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                bool = valueOf;
                createFromParcel = null;
            } else {
                bool = valueOf;
                createFromParcel = MessagesConversationBusinessNotifyDataDto.CREATOR.createFromParcel(parcel);
            }
            MessagesConversationBusinessNotifyDataDto messagesConversationBusinessNotifyDataDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                messagesConversationBusinessNotifyDataDto = messagesConversationBusinessNotifyDataDto2;
                messagesOutReadByDto = createFromParcel10;
                messagesConversationPeerDto = createFromParcel8;
                arrayList = null;
            } else {
                messagesConversationBusinessNotifyDataDto = messagesConversationBusinessNotifyDataDto2;
                int readInt7 = parcel.readInt();
                messagesOutReadByDto = createFromParcel10;
                arrayList = new ArrayList(readInt7);
                messagesConversationPeerDto = createFromParcel8;
                int i = 0;
                while (i != readInt7) {
                    i = pm0.b(parcel, arrayList, i, 1);
                    readInt7 = readInt7;
                }
            }
            if (parcel.readInt() == 0) {
                z = true;
                arrayList3 = arrayList;
                arrayList2 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList2 = new ArrayList(readInt8);
                arrayList3 = arrayList;
                int i2 = 0;
                while (i2 != readInt8) {
                    i2 = pm0.b(parcel, arrayList2, i2, 1);
                    readInt8 = readInt8;
                }
                z = true;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList2;
                arrayList4 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList4 = new ArrayList(readInt9);
                arrayList5 = arrayList2;
                int i3 = 0;
                while (i3 != readInt9) {
                    i3 = pm0.b(parcel, arrayList4, i3, 1);
                    readInt9 = readInt9;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList7 = arrayList4;
                arrayList6 = null;
            } else {
                int readInt10 = parcel.readInt();
                arrayList6 = new ArrayList(readInt10);
                arrayList7 = arrayList4;
                int i4 = 0;
                while (i4 != readInt10) {
                    i4 = pm0.b(parcel, arrayList6, i4, 1);
                    readInt10 = readInt10;
                }
            }
            MessagesConversationBarDto messagesConversationBarDto2 = (MessagesConversationBarDto) parcel.readParcelable(MessagesConversationDto.class.getClassLoader());
            MessagesConversationCardDto createFromParcel13 = parcel.readInt() == 0 ? null : MessagesConversationCardDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                messagesConversationBarDto = messagesConversationBarDto2;
                createFromParcel2 = null;
            } else {
                messagesConversationBarDto = messagesConversationBarDto2;
                createFromParcel2 = MessagesKeyboardDto.CREATOR.createFromParcel(parcel);
            }
            MessagesKeyboardDto messagesKeyboardDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                messagesKeyboardDto = messagesKeyboardDto2;
                createFromParcel3 = null;
            } else {
                messagesKeyboardDto = messagesKeyboardDto2;
                createFromParcel3 = MessagesPushSettingsDto.CREATOR.createFromParcel(parcel);
            }
            MessagesPushSettingsDto messagesPushSettingsDto2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                messagesPushSettingsDto = messagesPushSettingsDto2;
                createFromParcel4 = null;
            } else {
                messagesPushSettingsDto = messagesPushSettingsDto2;
                createFromParcel4 = MessagesConversationCanWriteDto.CREATOR.createFromParcel(parcel);
            }
            MessagesConversationCanWriteDto messagesConversationCanWriteDto2 = createFromParcel4;
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
            if (parcel.readInt() == 0) {
                messagesConversationCanWriteDto = messagesConversationCanWriteDto2;
                createFromParcel5 = null;
            } else {
                messagesConversationCanWriteDto = messagesConversationCanWriteDto2;
                createFromParcel5 = MessagesChatSettingsDto.CREATOR.createFromParcel(parcel);
            }
            MessagesChatSettingsDto messagesChatSettingsDto2 = createFromParcel5;
            if (parcel.readInt() == 0) {
                messagesChatSettingsDto = messagesChatSettingsDto2;
                createFromParcel6 = null;
            } else {
                messagesChatSettingsDto = messagesChatSettingsDto2;
                createFromParcel6 = MessagesCallInProgressDto.CREATOR.createFromParcel(parcel);
            }
            MessagesCallInProgressDto messagesCallInProgressDto2 = createFromParcel6;
            Integer valueOf13 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                messagesCallInProgressDto = messagesCallInProgressDto2;
                createFromParcel7 = null;
            } else {
                messagesCallInProgressDto = messagesCallInProgressDto2;
                createFromParcel7 = MessagesConversationPayloadDto.CREATOR.createFromParcel(parcel);
            }
            MessagesConversationPayloadDto messagesConversationPayloadDto2 = createFromParcel7;
            MessagesOutReadByDto messagesOutReadByDto2 = messagesOutReadByDto;
            ArrayList arrayList14 = arrayList7;
            MessagesKeyboardDto messagesKeyboardDto3 = messagesKeyboardDto;
            MessagesConversationCanWriteDto messagesConversationCanWriteDto3 = messagesConversationCanWriteDto;
            MessagesCallInProgressDto messagesCallInProgressDto3 = messagesCallInProgressDto;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                messagesConversationPayloadDto = messagesConversationPayloadDto2;
                arrayList8 = arrayList6;
                messagesConversationCardDto = createFromParcel13;
                arrayList9 = null;
            } else {
                messagesConversationPayloadDto = messagesConversationPayloadDto2;
                int readInt11 = parcel.readInt();
                arrayList8 = arrayList6;
                arrayList9 = new ArrayList(readInt11);
                messagesConversationCardDto = createFromParcel13;
                int i5 = 0;
                while (i5 != readInt11) {
                    i5 = pm0.b(parcel, arrayList9, i5, 1);
                    readInt11 = readInt11;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList11 = arrayList9;
                arrayList10 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList10 = new ArrayList(readInt12);
                arrayList11 = arrayList9;
                int i6 = 0;
                while (i6 != readInt12) {
                    i6 = pm0.b(parcel, arrayList10, i6, 1);
                    readInt12 = readInt12;
                }
            }
            MessagesConversationPeerDto messagesConversationPeerDto3 = messagesConversationPeerDto;
            ArrayList arrayList15 = arrayList8;
            String readString2 = parcel.readString();
            Integer valueOf14 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long valueOf15 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList12 = arrayList10;
                num = valueOf14;
                messagesConversationPeerDto2 = messagesConversationPeerDto3;
                arrayList13 = null;
            } else {
                arrayList12 = arrayList10;
                int readInt13 = parcel.readInt();
                num = valueOf14;
                arrayList13 = new ArrayList(readInt13);
                messagesConversationPeerDto2 = messagesConversationPeerDto3;
                int i7 = 0;
                while (i7 != readInt13) {
                    i7 = pm0.b(parcel, arrayList13, i7, 1);
                    readInt13 = readInt13;
                }
            }
            MessagesConversationAdsTagDto createFromParcel14 = parcel.readInt() == 0 ? null : MessagesConversationAdsTagDto.CREATOR.createFromParcel(parcel);
            MessagesTransitionDataDto createFromParcel15 = parcel.readInt() == 0 ? null : MessagesTransitionDataDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationDto(messagesConversationPeerDto2, readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readLong, createFromParcel9, valueOf12, bool, messagesOutReadByDto2, valueOf2, valueOf3, createFromParcel11, createFromParcel12, messagesConversationBusinessNotifyDataDto, arrayList3, arrayList5, arrayList14, arrayList15, messagesConversationBarDto, messagesConversationCardDto, messagesKeyboardDto3, messagesPushSettingsDto, messagesConversationCanWriteDto3, valueOf4, valueOf5, messagesChatSettingsDto, messagesCallInProgressDto3, valueOf13, valueOf6, valueOf7, messagesConversationPayloadDto, readString, arrayList11, arrayList12, readString2, num, valueOf8, valueOf15, valueOf9, valueOf16, valueOf10, arrayList13, createFromParcel14, createFromParcel15, valueOf11, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationDto[] newArray(int i) {
            return new MessagesConversationDto[i];
        }
    }

    public MessagesConversationDto(MessagesConversationPeerDto messagesConversationPeerDto, int i, int i2, int i3, int i4, int i5, int i6, long j, MessagesConversationSortIdDto messagesConversationSortIdDto, Integer num, Boolean bool, MessagesOutReadByDto messagesOutReadByDto, Boolean bool2, Boolean bool3, SpecialServiceTypeDto specialServiceTypeDto, MessagesMessageRequestDataDto messagesMessageRequestDataDto, MessagesConversationBusinessNotifyDataDto messagesConversationBusinessNotifyDataDto, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, MessagesConversationBarDto messagesConversationBarDto, MessagesConversationCardDto messagesConversationCardDto, MessagesKeyboardDto messagesKeyboardDto, MessagesPushSettingsDto messagesPushSettingsDto, MessagesConversationCanWriteDto messagesConversationCanWriteDto, Boolean bool4, Boolean bool5, MessagesChatSettingsDto messagesChatSettingsDto, MessagesCallInProgressDto messagesCallInProgressDto, Integer num2, Boolean bool6, Boolean bool7, MessagesConversationPayloadDto messagesConversationPayloadDto, String str, List<Integer> list5, List<Integer> list6, String str2, Integer num3, Boolean bool8, Long l, Boolean bool9, Integer num4, Boolean bool10, List<Integer> list7, MessagesConversationAdsTagDto messagesConversationAdsTagDto, MessagesTransitionDataDto messagesTransitionDataDto, Boolean bool11, Integer num5) {
        this.peer = messagesConversationPeerDto;
        this.lastMessageId = i;
        this.lastConversationMessageId = i2;
        this.inRead = i3;
        this.outRead = i4;
        this.inReadCmid = i5;
        this.outReadCmid = i6;
        this.version = j;
        this.sortId = messagesConversationSortIdDto;
        this.unreadCount = num;
        this.isMarkedUnread = bool;
        this.outReadBy = messagesOutReadByDto;
        this.important = bool2;
        this.unanswered = bool3;
        this.specialServiceType = specialServiceTypeDto;
        this.messageRequestData = messagesMessageRequestDataDto;
        this.businessNotifyData = messagesConversationBusinessNotifyDataDto;
        this.mentions = list;
        this.mentionCmids = list2;
        this.expireMessages = list3;
        this.expireCmids = list4;
        this.conversationBar = messagesConversationBarDto;
        this.conversationCard = messagesConversationCardDto;
        this.currentKeyboard = messagesKeyboardDto;
        this.pushSettings = messagesPushSettingsDto;
        this.canWrite = messagesConversationCanWriteDto;
        this.canSendMoney = bool4;
        this.canReceiveMoney = bool5;
        this.chatSettings = messagesChatSettingsDto;
        this.callInProgress = messagesCallInProgressDto;
        this.spamExpiration = num2;
        this.isNew = bool6;
        this.isArchived = bool7;
        this.payload = messagesConversationPayloadDto;
        this.style = str;
        this.folderIds = list5;
        this.unreadReactions = list6;
        this.trackCode = str2;
        this.peerFlags = num3;
        this.alive = bool8;
        this.spaceId = l;
        this.isPromo = bool9;
        this.postponedCount = num4;
        this.hasPostponedErrors = bool10;
        this.tags = list7;
        this.adsTag = messagesConversationAdsTagDto;
        this.transitionData = messagesTransitionDataDto;
        this.isGiftSuggestionEnabled = bool11;
        this.timestamp = num5;
    }

    public final MessagesCallInProgressDto d() {
        return this.callInProgress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MessagesConversationCanWriteDto e() {
        return this.canWrite;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationDto)) {
            return false;
        }
        MessagesConversationDto messagesConversationDto = (MessagesConversationDto) obj;
        return epx.f(this.peer, messagesConversationDto.peer) && this.lastMessageId == messagesConversationDto.lastMessageId && this.lastConversationMessageId == messagesConversationDto.lastConversationMessageId && this.inRead == messagesConversationDto.inRead && this.outRead == messagesConversationDto.outRead && this.inReadCmid == messagesConversationDto.inReadCmid && this.outReadCmid == messagesConversationDto.outReadCmid && this.version == messagesConversationDto.version && epx.f(this.sortId, messagesConversationDto.sortId) && epx.f(this.unreadCount, messagesConversationDto.unreadCount) && epx.f(this.isMarkedUnread, messagesConversationDto.isMarkedUnread) && epx.f(this.outReadBy, messagesConversationDto.outReadBy) && epx.f(this.important, messagesConversationDto.important) && epx.f(this.unanswered, messagesConversationDto.unanswered) && this.specialServiceType == messagesConversationDto.specialServiceType && epx.f(this.messageRequestData, messagesConversationDto.messageRequestData) && epx.f(this.businessNotifyData, messagesConversationDto.businessNotifyData) && epx.f(this.mentions, messagesConversationDto.mentions) && epx.f(this.mentionCmids, messagesConversationDto.mentionCmids) && epx.f(this.expireMessages, messagesConversationDto.expireMessages) && epx.f(this.expireCmids, messagesConversationDto.expireCmids) && epx.f(this.conversationBar, messagesConversationDto.conversationBar) && epx.f(this.conversationCard, messagesConversationDto.conversationCard) && epx.f(this.currentKeyboard, messagesConversationDto.currentKeyboard) && epx.f(this.pushSettings, messagesConversationDto.pushSettings) && epx.f(this.canWrite, messagesConversationDto.canWrite) && epx.f(this.canSendMoney, messagesConversationDto.canSendMoney) && epx.f(this.canReceiveMoney, messagesConversationDto.canReceiveMoney) && epx.f(this.chatSettings, messagesConversationDto.chatSettings) && epx.f(this.callInProgress, messagesConversationDto.callInProgress) && epx.f(this.spamExpiration, messagesConversationDto.spamExpiration) && epx.f(this.isNew, messagesConversationDto.isNew) && epx.f(this.isArchived, messagesConversationDto.isArchived) && epx.f(this.payload, messagesConversationDto.payload) && epx.f(this.style, messagesConversationDto.style) && epx.f(this.folderIds, messagesConversationDto.folderIds) && epx.f(this.unreadReactions, messagesConversationDto.unreadReactions) && epx.f(this.trackCode, messagesConversationDto.trackCode) && epx.f(this.peerFlags, messagesConversationDto.peerFlags) && epx.f(this.alive, messagesConversationDto.alive) && epx.f(this.spaceId, messagesConversationDto.spaceId) && epx.f(this.isPromo, messagesConversationDto.isPromo) && epx.f(this.postponedCount, messagesConversationDto.postponedCount) && epx.f(this.hasPostponedErrors, messagesConversationDto.hasPostponedErrors) && epx.f(this.tags, messagesConversationDto.tags) && epx.f(this.adsTag, messagesConversationDto.adsTag) && epx.f(this.transitionData, messagesConversationDto.transitionData) && epx.f(this.isGiftSuggestionEnabled, messagesConversationDto.isGiftSuggestionEnabled) && epx.f(this.timestamp, messagesConversationDto.timestamp);
    }

    public final MessagesChatSettingsDto f() {
        return this.chatSettings;
    }

    public final MessagesConversationPeerDto g() {
        return this.peer;
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.outReadCmid, shy.a(this.inReadCmid, shy.a(this.outRead, shy.a(this.inRead, shy.a(this.lastConversationMessageId, shy.a(this.lastMessageId, this.peer.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.version);
        MessagesConversationSortIdDto messagesConversationSortIdDto = this.sortId;
        int hashCode = (a2 + (messagesConversationSortIdDto == null ? 0 : messagesConversationSortIdDto.hashCode())) * 31;
        Integer num = this.unreadCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isMarkedUnread;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        MessagesOutReadByDto messagesOutReadByDto = this.outReadBy;
        int hashCode4 = (hashCode3 + (messagesOutReadByDto == null ? 0 : messagesOutReadByDto.hashCode())) * 31;
        Boolean bool2 = this.important;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.unanswered;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        SpecialServiceTypeDto specialServiceTypeDto = this.specialServiceType;
        int hashCode7 = (hashCode6 + (specialServiceTypeDto == null ? 0 : specialServiceTypeDto.hashCode())) * 31;
        MessagesMessageRequestDataDto messagesMessageRequestDataDto = this.messageRequestData;
        int hashCode8 = (hashCode7 + (messagesMessageRequestDataDto == null ? 0 : messagesMessageRequestDataDto.hashCode())) * 31;
        MessagesConversationBusinessNotifyDataDto messagesConversationBusinessNotifyDataDto = this.businessNotifyData;
        int hashCode9 = (hashCode8 + (messagesConversationBusinessNotifyDataDto == null ? 0 : messagesConversationBusinessNotifyDataDto.hashCode())) * 31;
        List<Integer> list = this.mentions;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.mentionCmids;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.expireMessages;
        int hashCode12 = (hashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.expireCmids;
        int hashCode13 = (hashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        MessagesConversationBarDto messagesConversationBarDto = this.conversationBar;
        int hashCode14 = (hashCode13 + (messagesConversationBarDto == null ? 0 : messagesConversationBarDto.hashCode())) * 31;
        MessagesConversationCardDto messagesConversationCardDto = this.conversationCard;
        int hashCode15 = (hashCode14 + (messagesConversationCardDto == null ? 0 : messagesConversationCardDto.hashCode())) * 31;
        MessagesKeyboardDto messagesKeyboardDto = this.currentKeyboard;
        int hashCode16 = (hashCode15 + (messagesKeyboardDto == null ? 0 : messagesKeyboardDto.hashCode())) * 31;
        MessagesPushSettingsDto messagesPushSettingsDto = this.pushSettings;
        int hashCode17 = (hashCode16 + (messagesPushSettingsDto == null ? 0 : messagesPushSettingsDto.hashCode())) * 31;
        MessagesConversationCanWriteDto messagesConversationCanWriteDto = this.canWrite;
        int hashCode18 = (hashCode17 + (messagesConversationCanWriteDto == null ? 0 : messagesConversationCanWriteDto.hashCode())) * 31;
        Boolean bool4 = this.canSendMoney;
        int hashCode19 = (hashCode18 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canReceiveMoney;
        int hashCode20 = (hashCode19 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        MessagesChatSettingsDto messagesChatSettingsDto = this.chatSettings;
        int hashCode21 = (hashCode20 + (messagesChatSettingsDto == null ? 0 : messagesChatSettingsDto.hashCode())) * 31;
        MessagesCallInProgressDto messagesCallInProgressDto = this.callInProgress;
        int hashCode22 = (hashCode21 + (messagesCallInProgressDto == null ? 0 : messagesCallInProgressDto.hashCode())) * 31;
        Integer num2 = this.spamExpiration;
        int hashCode23 = (hashCode22 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool6 = this.isNew;
        int hashCode24 = (hashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isArchived;
        int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        MessagesConversationPayloadDto messagesConversationPayloadDto = this.payload;
        int hashCode26 = (hashCode25 + (messagesConversationPayloadDto == null ? 0 : messagesConversationPayloadDto.hashCode())) * 31;
        String str = this.style;
        int hashCode27 = (hashCode26 + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list5 = this.folderIds;
        int hashCode28 = (hashCode27 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<Integer> list6 = this.unreadReactions;
        int hashCode29 = (hashCode28 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode30 = (hashCode29 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.peerFlags;
        int hashCode31 = (hashCode30 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool8 = this.alive;
        int hashCode32 = (hashCode31 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Long l = this.spaceId;
        int hashCode33 = (hashCode32 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool9 = this.isPromo;
        int hashCode34 = (hashCode33 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Integer num4 = this.postponedCount;
        int hashCode35 = (hashCode34 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool10 = this.hasPostponedErrors;
        int hashCode36 = (hashCode35 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        List<Integer> list7 = this.tags;
        int hashCode37 = (hashCode36 + (list7 == null ? 0 : list7.hashCode())) * 31;
        MessagesConversationAdsTagDto messagesConversationAdsTagDto = this.adsTag;
        int hashCode38 = (hashCode37 + (messagesConversationAdsTagDto == null ? 0 : messagesConversationAdsTagDto.hashCode())) * 31;
        MessagesTransitionDataDto messagesTransitionDataDto = this.transitionData;
        int hashCode39 = (hashCode38 + (messagesTransitionDataDto == null ? 0 : messagesTransitionDataDto.hashCode())) * 31;
        Boolean bool11 = this.isGiftSuggestionEnabled;
        int hashCode40 = (hashCode39 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Integer num5 = this.timestamp;
        return hashCode40 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationDto(peer=");
        sb.append(this.peer);
        sb.append(", lastMessageId=");
        sb.append(this.lastMessageId);
        sb.append(", lastConversationMessageId=");
        sb.append(this.lastConversationMessageId);
        sb.append(", inRead=");
        sb.append(this.inRead);
        sb.append(", outRead=");
        sb.append(this.outRead);
        sb.append(", inReadCmid=");
        sb.append(this.inReadCmid);
        sb.append(", outReadCmid=");
        sb.append(this.outReadCmid);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", sortId=");
        sb.append(this.sortId);
        sb.append(", unreadCount=");
        sb.append(this.unreadCount);
        sb.append(", isMarkedUnread=");
        sb.append(this.isMarkedUnread);
        sb.append(", outReadBy=");
        sb.append(this.outReadBy);
        sb.append(", important=");
        sb.append(this.important);
        sb.append(", unanswered=");
        sb.append(this.unanswered);
        sb.append(", specialServiceType=");
        sb.append(this.specialServiceType);
        sb.append(", messageRequestData=");
        sb.append(this.messageRequestData);
        sb.append(", businessNotifyData=");
        sb.append(this.businessNotifyData);
        sb.append(", mentions=");
        sb.append(this.mentions);
        sb.append(", mentionCmids=");
        sb.append(this.mentionCmids);
        sb.append(", expireMessages=");
        sb.append(this.expireMessages);
        sb.append(", expireCmids=");
        sb.append(this.expireCmids);
        sb.append(", conversationBar=");
        sb.append(this.conversationBar);
        sb.append(", conversationCard=");
        sb.append(this.conversationCard);
        sb.append(", currentKeyboard=");
        sb.append(this.currentKeyboard);
        sb.append(", pushSettings=");
        sb.append(this.pushSettings);
        sb.append(", canWrite=");
        sb.append(this.canWrite);
        sb.append(", canSendMoney=");
        sb.append(this.canSendMoney);
        sb.append(", canReceiveMoney=");
        sb.append(this.canReceiveMoney);
        sb.append(", chatSettings=");
        sb.append(this.chatSettings);
        sb.append(", callInProgress=");
        sb.append(this.callInProgress);
        sb.append(", spamExpiration=");
        sb.append(this.spamExpiration);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", isArchived=");
        sb.append(this.isArchived);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", folderIds=");
        sb.append(this.folderIds);
        sb.append(", unreadReactions=");
        sb.append(this.unreadReactions);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", peerFlags=");
        sb.append(this.peerFlags);
        sb.append(", alive=");
        sb.append(this.alive);
        sb.append(", spaceId=");
        sb.append(this.spaceId);
        sb.append(", isPromo=");
        sb.append(this.isPromo);
        sb.append(", postponedCount=");
        sb.append(this.postponedCount);
        sb.append(", hasPostponedErrors=");
        sb.append(this.hasPostponedErrors);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", adsTag=");
        sb.append(this.adsTag);
        sb.append(", transitionData=");
        sb.append(this.transitionData);
        sb.append(", isGiftSuggestionEnabled=");
        sb.append(this.isGiftSuggestionEnabled);
        sb.append(", timestamp=");
        return uqi.b(sb, this.timestamp, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.peer.writeToParcel(parcel, i);
        parcel.writeInt(this.lastMessageId);
        parcel.writeInt(this.lastConversationMessageId);
        parcel.writeInt(this.inRead);
        parcel.writeInt(this.outRead);
        parcel.writeInt(this.inReadCmid);
        parcel.writeInt(this.outReadCmid);
        parcel.writeLong(this.version);
        MessagesConversationSortIdDto messagesConversationSortIdDto = this.sortId;
        if (messagesConversationSortIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationSortIdDto.writeToParcel(parcel, i);
        }
        Integer num = this.unreadCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isMarkedUnread;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        MessagesOutReadByDto messagesOutReadByDto = this.outReadBy;
        if (messagesOutReadByDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesOutReadByDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.important;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.unanswered;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        SpecialServiceTypeDto specialServiceTypeDto = this.specialServiceType;
        if (specialServiceTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            specialServiceTypeDto.writeToParcel(parcel, i);
        }
        MessagesMessageRequestDataDto messagesMessageRequestDataDto = this.messageRequestData;
        if (messagesMessageRequestDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageRequestDataDto.writeToParcel(parcel, i);
        }
        MessagesConversationBusinessNotifyDataDto messagesConversationBusinessNotifyDataDto = this.businessNotifyData;
        if (messagesConversationBusinessNotifyDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationBusinessNotifyDataDto.writeToParcel(parcel, i);
        }
        List<Integer> list = this.mentions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        List<Integer> list2 = this.mentionCmids;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeInt(((Number) f2.next()).intValue());
            }
        }
        List<Integer> list3 = this.expireMessages;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeInt(((Number) f3.next()).intValue());
            }
        }
        List<Integer> list4 = this.expireCmids;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeInt(((Number) f4.next()).intValue());
            }
        }
        parcel.writeParcelable(this.conversationBar, i);
        MessagesConversationCardDto messagesConversationCardDto = this.conversationCard;
        if (messagesConversationCardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationCardDto.writeToParcel(parcel, i);
        }
        MessagesKeyboardDto messagesKeyboardDto = this.currentKeyboard;
        if (messagesKeyboardDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesKeyboardDto.writeToParcel(parcel, i);
        }
        MessagesPushSettingsDto messagesPushSettingsDto = this.pushSettings;
        if (messagesPushSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesPushSettingsDto.writeToParcel(parcel, i);
        }
        MessagesConversationCanWriteDto messagesConversationCanWriteDto = this.canWrite;
        if (messagesConversationCanWriteDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationCanWriteDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.canSendMoney;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.canReceiveMoney;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        MessagesChatSettingsDto messagesChatSettingsDto = this.chatSettings;
        if (messagesChatSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsDto.writeToParcel(parcel, i);
        }
        MessagesCallInProgressDto messagesCallInProgressDto = this.callInProgress;
        if (messagesCallInProgressDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCallInProgressDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.spamExpiration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool6 = this.isNew;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.isArchived;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        MessagesConversationPayloadDto messagesConversationPayloadDto = this.payload;
        if (messagesConversationPayloadDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationPayloadDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.style);
        List<Integer> list5 = this.folderIds;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeInt(((Number) f5.next()).intValue());
            }
        }
        List<Integer> list6 = this.unreadReactions;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeInt(((Number) f6.next()).intValue());
            }
        }
        parcel.writeString(this.trackCode);
        Integer num3 = this.peerFlags;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool8 = this.alive;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Long l = this.spaceId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Boolean bool9 = this.isPromo;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Integer num4 = this.postponedCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Boolean bool10 = this.hasPostponedErrors;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        List<Integer> list7 = this.tags;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeInt(((Number) f7.next()).intValue());
            }
        }
        MessagesConversationAdsTagDto messagesConversationAdsTagDto = this.adsTag;
        if (messagesConversationAdsTagDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationAdsTagDto.writeToParcel(parcel, i);
        }
        MessagesTransitionDataDto messagesTransitionDataDto = this.transitionData;
        if (messagesTransitionDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesTransitionDataDto.writeToParcel(parcel, i);
        }
        Boolean bool11 = this.isGiftSuggestionEnabled;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Integer num5 = this.timestamp;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
    }

    public /* synthetic */ MessagesConversationDto(MessagesConversationPeerDto messagesConversationPeerDto, int i, int i2, int i3, int i4, int i5, int i6, long j, MessagesConversationSortIdDto messagesConversationSortIdDto, Integer num, Boolean bool, MessagesOutReadByDto messagesOutReadByDto, Boolean bool2, Boolean bool3, SpecialServiceTypeDto specialServiceTypeDto, MessagesMessageRequestDataDto messagesMessageRequestDataDto, MessagesConversationBusinessNotifyDataDto messagesConversationBusinessNotifyDataDto, List list, List list2, List list3, List list4, MessagesConversationBarDto messagesConversationBarDto, MessagesConversationCardDto messagesConversationCardDto, MessagesKeyboardDto messagesKeyboardDto, MessagesPushSettingsDto messagesPushSettingsDto, MessagesConversationCanWriteDto messagesConversationCanWriteDto, Boolean bool4, Boolean bool5, MessagesChatSettingsDto messagesChatSettingsDto, MessagesCallInProgressDto messagesCallInProgressDto, Integer num2, Boolean bool6, Boolean bool7, MessagesConversationPayloadDto messagesConversationPayloadDto, String str, List list5, List list6, String str2, Integer num3, Boolean bool8, Long l, Boolean bool9, Integer num4, Boolean bool10, List list7, MessagesConversationAdsTagDto messagesConversationAdsTagDto, MessagesTransitionDataDto messagesTransitionDataDto, Boolean bool11, Integer num5, int i7, int i8, zcl zclVar) {
        this(messagesConversationPeerDto, i, i2, i3, i4, i5, i6, j, (i7 & 256) != 0 ? null : messagesConversationSortIdDto, (i7 & 512) != 0 ? null : num, (i7 & 1024) != 0 ? null : bool, (i7 & 2048) != 0 ? null : messagesOutReadByDto, (i7 & 4096) != 0 ? null : bool2, (i7 & 8192) != 0 ? null : bool3, (i7 & 16384) != 0 ? null : specialServiceTypeDto, (i7 & 32768) != 0 ? null : messagesMessageRequestDataDto, (i7 & 65536) != 0 ? null : messagesConversationBusinessNotifyDataDto, (131072 & i7) != 0 ? null : list, (262144 & i7) != 0 ? null : list2, (524288 & i7) != 0 ? null : list3, (1048576 & i7) != 0 ? null : list4, (2097152 & i7) != 0 ? null : messagesConversationBarDto, (4194304 & i7) != 0 ? null : messagesConversationCardDto, (8388608 & i7) != 0 ? null : messagesKeyboardDto, (16777216 & i7) != 0 ? null : messagesPushSettingsDto, (33554432 & i7) != 0 ? null : messagesConversationCanWriteDto, (67108864 & i7) != 0 ? null : bool4, (134217728 & i7) != 0 ? null : bool5, (268435456 & i7) != 0 ? null : messagesChatSettingsDto, (536870912 & i7) != 0 ? null : messagesCallInProgressDto, (1073741824 & i7) != 0 ? null : num2, (i7 & Integer.MIN_VALUE) != 0 ? null : bool6, (i8 & 1) != 0 ? null : bool7, (i8 & 2) != 0 ? null : messagesConversationPayloadDto, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : list5, (i8 & 16) != 0 ? null : list6, (i8 & 32) != 0 ? null : str2, (i8 & 64) != 0 ? null : num3, (i8 & 128) != 0 ? null : bool8, (i8 & 256) != 0 ? null : l, (i8 & 512) != 0 ? null : bool9, (i8 & 1024) != 0 ? null : num4, (i8 & 2048) != 0 ? null : bool10, (i8 & 4096) != 0 ? null : list7, (i8 & 8192) != 0 ? null : messagesConversationAdsTagDto, (i8 & 16384) != 0 ? null : messagesTransitionDataDto, (i8 & 32768) != 0 ? null : bool11, (i8 & 65536) != 0 ? null : num5);
    }
}
