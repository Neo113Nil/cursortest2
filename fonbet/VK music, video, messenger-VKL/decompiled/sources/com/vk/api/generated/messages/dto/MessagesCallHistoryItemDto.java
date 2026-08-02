package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MessagesCallHistoryItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCallHistoryItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCallHistoryItemDto> CREATOR = new a();

    @pmi0("call_id")
    private final String callId;

    @pmi0("can_download_call_join_history")
    private final Boolean canDownloadCallJoinHistory;

    @pmi0("can_finish_call")
    private final Boolean canFinishCall;

    @pmi0("chat")
    private final MessagesCallChatDto chat;

    @pmi0("finished_at")
    private final Long finishedAt;

    @pmi0("id")
    private final Long id;

    @pmi0("is_inbound")
    private final Boolean isInbound;

    @pmi0("is_missed")
    private final Boolean isMissed;

    @pmi0("items")
    private final List<MessagesCallHistoryItemDto> items;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0("name")
    private final String name;

    @pmi0("participant_ids")
    private final List<String> participantIds;

    @pmi0("pmi_link")
    private final String pmiLink;

    @pmi0("reach_status")
    private final ReachStatusDto reachStatus;

    @pmi0("started_at")
    private final Long startedAt;

    @pmi0("type")
    private final String type;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    @pmi0("users_count")
    private final Integer usersCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessagesCallHistoryItemDto.kt */
    public static final class ReachStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReachStatusDto[] $VALUES;

        @pmi0("CANCELLED_BY_INITIATOR")
        public static final ReachStatusDto CANCELLED_BY_INITIATOR;
        public static final Parcelable.Creator<ReachStatusDto> CREATOR;

        @pmi0("REACHED")
        public static final ReachStatusDto REACHED;

        @pmi0("REJECTED_BY_RECEIVER")
        public static final ReachStatusDto REJECTED_BY_RECEIVER;
        private final String value;

        /* compiled from: MessagesCallHistoryItemDto.kt */
        public static final class a implements Parcelable.Creator<ReachStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final ReachStatusDto createFromParcel(Parcel parcel) {
                return ReachStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ReachStatusDto[] newArray(int i) {
                return new ReachStatusDto[i];
            }
        }

        static {
            ReachStatusDto reachStatusDto = new ReachStatusDto("CANCELLED_BY_INITIATOR", 0, "CANCELLED_BY_INITIATOR");
            CANCELLED_BY_INITIATOR = reachStatusDto;
            ReachStatusDto reachStatusDto2 = new ReachStatusDto("REACHED", 1, "REACHED");
            REACHED = reachStatusDto2;
            ReachStatusDto reachStatusDto3 = new ReachStatusDto("REJECTED_BY_RECEIVER", 2, "REJECTED_BY_RECEIVER");
            REJECTED_BY_RECEIVER = reachStatusDto3;
            ReachStatusDto[] reachStatusDtoArr = {reachStatusDto, reachStatusDto2, reachStatusDto3};
            $VALUES = reachStatusDtoArr;
            $ENTRIES = new asp(reachStatusDtoArr);
            CREATOR = new a();
        }

        private ReachStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ReachStatusDto valueOf(String str) {
            return (ReachStatusDto) Enum.valueOf(ReachStatusDto.class, str);
        }

        public static ReachStatusDto[] values() {
            return (ReachStatusDto[]) $VALUES.clone();
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

    /* compiled from: MessagesCallHistoryItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCallHistoryItemDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final MessagesCallHistoryItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            MessagesCallChatDto messagesCallChatDto;
            Object valueOf3;
            Object valueOf4;
            Long l;
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MessagesCallHistoryItemDto.class, parcel, arrayList3, i, 1);
            }
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf7 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf8 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
                messagesCallChatDto = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                messagesCallChatDto = null;
            }
            Long l2 = valueOf8;
            String readString3 = parcel.readString();
            Integer num = valueOf6;
            Boolean bool = valueOf;
            String readString4 = parcel.readString();
            Long l3 = valueOf7;
            Boolean bool2 = valueOf2;
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = messagesCallChatDto;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = messagesCallChatDto;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                messagesCallChatDto = MessagesCallChatDto.CREATOR.createFromParcel(parcel);
            }
            MessagesCallChatDto messagesCallChatDto2 = messagesCallChatDto;
            ReachStatusDto createFromParcel = parcel.readInt() == 0 ? null : ReachStatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                l = valueOf5;
                arrayList2 = arrayList3;
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                l = valueOf5;
                arrayList = new ArrayList(readInt2);
                arrayList2 = arrayList3;
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(MessagesCallHistoryItemDto.CREATOR, parcel, arrayList, i2, 1);
                    readInt2 = readInt2;
                    readString2 = readString2;
                }
            }
            return new MessagesCallHistoryItemDto(readString, arrayList2, l, readString2, createStringArrayList, num, l3, l2, bool, bool2, readString3, readString4, readString5, valueOf3, valueOf4, messagesCallChatDto2, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCallHistoryItemDto[] newArray(int i) {
            return new MessagesCallHistoryItemDto[i];
        }
    }

    public MessagesCallHistoryItemDto(String str, List<UserId> list, Long l, String str2, List<String> list2, Integer num, Long l2, Long l3, Boolean bool, Boolean bool2, String str3, String str4, String str5, Boolean bool3, Boolean bool4, MessagesCallChatDto messagesCallChatDto, ReachStatusDto reachStatusDto, List<MessagesCallHistoryItemDto> list3) {
        this.type = str;
        this.userIds = list;
        this.id = l;
        this.callId = str2;
        this.participantIds = list2;
        this.usersCount = num;
        this.startedAt = l2;
        this.finishedAt = l3;
        this.isMissed = bool;
        this.isInbound = bool2;
        this.joinLink = str3;
        this.pmiLink = str4;
        this.name = str5;
        this.canFinishCall = bool3;
        this.canDownloadCallJoinHistory = bool4;
        this.chat = messagesCallChatDto;
        this.reachStatus = reachStatusDto;
        this.items = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCallHistoryItemDto)) {
            return false;
        }
        MessagesCallHistoryItemDto messagesCallHistoryItemDto = (MessagesCallHistoryItemDto) obj;
        return epx.f(this.type, messagesCallHistoryItemDto.type) && epx.f(this.userIds, messagesCallHistoryItemDto.userIds) && epx.f(this.id, messagesCallHistoryItemDto.id) && epx.f(this.callId, messagesCallHistoryItemDto.callId) && epx.f(this.participantIds, messagesCallHistoryItemDto.participantIds) && epx.f(this.usersCount, messagesCallHistoryItemDto.usersCount) && epx.f(this.startedAt, messagesCallHistoryItemDto.startedAt) && epx.f(this.finishedAt, messagesCallHistoryItemDto.finishedAt) && epx.f(this.isMissed, messagesCallHistoryItemDto.isMissed) && epx.f(this.isInbound, messagesCallHistoryItemDto.isInbound) && epx.f(this.joinLink, messagesCallHistoryItemDto.joinLink) && epx.f(this.pmiLink, messagesCallHistoryItemDto.pmiLink) && epx.f(this.name, messagesCallHistoryItemDto.name) && epx.f(this.canFinishCall, messagesCallHistoryItemDto.canFinishCall) && epx.f(this.canDownloadCallJoinHistory, messagesCallHistoryItemDto.canDownloadCallJoinHistory) && epx.f(this.chat, messagesCallHistoryItemDto.chat) && this.reachStatus == messagesCallHistoryItemDto.reachStatus && epx.f(this.items, messagesCallHistoryItemDto.items);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.type.hashCode() * 31, 31, this.userIds);
        Long l = this.id;
        int hashCode = (a2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.callId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.participantIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.usersCount;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.startedAt;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.finishedAt;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.isMissed;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isInbound;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.joinLink;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pmiLink;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.canFinishCall;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canDownloadCallJoinHistory;
        int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MessagesCallChatDto messagesCallChatDto = this.chat;
        int hashCode14 = (hashCode13 + (messagesCallChatDto == null ? 0 : messagesCallChatDto.hashCode())) * 31;
        ReachStatusDto reachStatusDto = this.reachStatus;
        int hashCode15 = (hashCode14 + (reachStatusDto == null ? 0 : reachStatusDto.hashCode())) * 31;
        List<MessagesCallHistoryItemDto> list2 = this.items;
        return hashCode15 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesCallHistoryItemDto(type=");
        sb.append(this.type);
        sb.append(", userIds=");
        sb.append(this.userIds);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", callId=");
        sb.append(this.callId);
        sb.append(", participantIds=");
        sb.append(this.participantIds);
        sb.append(", usersCount=");
        sb.append(this.usersCount);
        sb.append(", startedAt=");
        sb.append(this.startedAt);
        sb.append(", finishedAt=");
        sb.append(this.finishedAt);
        sb.append(", isMissed=");
        sb.append(this.isMissed);
        sb.append(", isInbound=");
        sb.append(this.isInbound);
        sb.append(", joinLink=");
        sb.append(this.joinLink);
        sb.append(", pmiLink=");
        sb.append(this.pmiLink);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", canFinishCall=");
        sb.append(this.canFinishCall);
        sb.append(", canDownloadCallJoinHistory=");
        sb.append(this.canDownloadCallJoinHistory);
        sb.append(", chat=");
        sb.append(this.chat);
        sb.append(", reachStatus=");
        sb.append(this.reachStatus);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        Iterator a2 = ao.a(parcel, this.userIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeString(this.callId);
        parcel.writeStringList(this.participantIds);
        Integer num = this.usersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Long l2 = this.startedAt;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l2);
        }
        Long l3 = this.finishedAt;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l3);
        }
        Boolean bool = this.isMissed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isInbound;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.joinLink);
        parcel.writeString(this.pmiLink);
        parcel.writeString(this.name);
        Boolean bool3 = this.canFinishCall;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canDownloadCallJoinHistory;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        MessagesCallChatDto messagesCallChatDto = this.chat;
        if (messagesCallChatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCallChatDto.writeToParcel(parcel, i);
        }
        ReachStatusDto reachStatusDto = this.reachStatus;
        if (reachStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reachStatusDto.writeToParcel(parcel, i);
        }
        List<MessagesCallHistoryItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MessagesCallHistoryItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesCallHistoryItemDto(String str, List list, Long l, String str2, List list2, Integer num, Long l2, Long l3, Boolean bool, Boolean bool2, String str3, String str4, String str5, Boolean bool3, Boolean bool4, MessagesCallChatDto messagesCallChatDto, ReachStatusDto reachStatusDto, List list3, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : l3, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : bool3, (i & 16384) != 0 ? null : bool4, (32768 & i) != 0 ? null : messagesCallChatDto, (65536 & i) != 0 ? null : reachStatusDto, (i & 131072) != 0 ? null : list3);
    }
}
