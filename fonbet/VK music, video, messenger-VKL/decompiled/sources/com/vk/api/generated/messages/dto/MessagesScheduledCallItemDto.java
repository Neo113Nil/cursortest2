package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.calls.dto.CallsShortCredentialsDto;
import com.vk.dto.common.id.UserId;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesScheduledCallItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesScheduledCallItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesScheduledCallItemDto> CREATOR = new a();

    @pmi0("broadcast")
    private final MessagesCallBroadcastDto broadcast;

    @pmi0("call_id")
    private final String callId;

    @pmi0("caller_id")
    private final UserId callerId;

    @pmi0("can_edit")
    private final boolean canEdit;

    @pmi0("chat")
    private final MessagesCallChatDto chat;

    @pmi0("feedback")
    private final Boolean feedback;

    @pmi0(ApiProtocol.KEY_JOIN_LINK)
    private final String joinLink;

    @pmi0("mute_audio")
    private final String muteAudio;

    @pmi0("mute_screen_sharing")
    private final String muteScreenSharing;

    @pmi0("mute_video")
    private final String muteVideo;

    @pmi0("name")
    private final String name;

    @pmi0("no_stickers")
    private final Boolean noStickers;

    @pmi0("only_admin_can_record")
    private final Boolean onlyAdminCanRecord;

    @pmi0("only_admin_can_share_movie")
    private final Boolean onlyAdminCanShareMovie;

    @pmi0("only_admin_can_start_asr")
    private final Boolean onlyAdminCanStartAsr;

    @pmi0("only_auth_users")
    private final Boolean onlyAuthUsers;

    @pmi0("schedule")
    private final MessagesCallScheduleDto schedule;

    @pmi0("short_credentials")
    private final CallsShortCredentialsDto shortCredentials;

    @pmi0(SignalingProtocol.KEY_SHOW_CHAT_HISTORY)
    private final Boolean showChatHistory;

    @pmi0("skip_notification")
    private final boolean skipNotification;

    @pmi0("vk_join_link")
    private final String vkJoinLink;

    @pmi0("waiting_hall")
    private final Boolean waitingHall;

    /* compiled from: MessagesScheduledCallItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesScheduledCallItemDto> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        @Override // android.os.Parcelable.Creator
        public final MessagesScheduledCallItemDto[] newArray(int i) {
            return new MessagesScheduledCallItemDto[i];
        }
    }

    public MessagesScheduledCallItemDto(String str, String str2, String str3, String str4, boolean z, UserId userId, MessagesCallScheduleDto messagesCallScheduleDto, boolean z2, Boolean bool, Boolean bool2, String str5, String str6, String str7, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, MessagesCallChatDto messagesCallChatDto, MessagesCallBroadcastDto messagesCallBroadcastDto, CallsShortCredentialsDto callsShortCredentialsDto) {
        this.callId = str;
        this.joinLink = str2;
        this.vkJoinLink = str3;
        this.name = str4;
        this.canEdit = z;
        this.callerId = userId;
        this.schedule = messagesCallScheduleDto;
        this.skipNotification = z2;
        this.onlyAuthUsers = bool;
        this.waitingHall = bool2;
        this.muteAudio = str5;
        this.muteVideo = str6;
        this.muteScreenSharing = str7;
        this.showChatHistory = bool3;
        this.noStickers = bool4;
        this.onlyAdminCanShareMovie = bool5;
        this.feedback = bool6;
        this.onlyAdminCanRecord = bool7;
        this.onlyAdminCanStartAsr = bool8;
        this.chat = messagesCallChatDto;
        this.broadcast = messagesCallBroadcastDto;
        this.shortCredentials = callsShortCredentialsDto;
    }

    public static MessagesScheduledCallItemDto a(MessagesScheduledCallItemDto messagesScheduledCallItemDto, MessagesCallScheduleDto messagesCallScheduleDto) {
        String str = messagesScheduledCallItemDto.callId;
        String str2 = messagesScheduledCallItemDto.joinLink;
        String str3 = messagesScheduledCallItemDto.vkJoinLink;
        String str4 = messagesScheduledCallItemDto.name;
        boolean z = messagesScheduledCallItemDto.canEdit;
        UserId userId = messagesScheduledCallItemDto.callerId;
        boolean z2 = messagesScheduledCallItemDto.skipNotification;
        Boolean bool = messagesScheduledCallItemDto.onlyAuthUsers;
        Boolean bool2 = messagesScheduledCallItemDto.waitingHall;
        String str5 = messagesScheduledCallItemDto.muteAudio;
        String str6 = messagesScheduledCallItemDto.muteVideo;
        String str7 = messagesScheduledCallItemDto.muteScreenSharing;
        Boolean bool3 = messagesScheduledCallItemDto.showChatHistory;
        Boolean bool4 = messagesScheduledCallItemDto.noStickers;
        Boolean bool5 = messagesScheduledCallItemDto.onlyAdminCanShareMovie;
        Boolean bool6 = messagesScheduledCallItemDto.feedback;
        Boolean bool7 = messagesScheduledCallItemDto.onlyAdminCanRecord;
        Boolean bool8 = messagesScheduledCallItemDto.onlyAdminCanStartAsr;
        MessagesCallChatDto messagesCallChatDto = messagesScheduledCallItemDto.chat;
        MessagesCallBroadcastDto messagesCallBroadcastDto = messagesScheduledCallItemDto.broadcast;
        CallsShortCredentialsDto callsShortCredentialsDto = messagesScheduledCallItemDto.shortCredentials;
        messagesScheduledCallItemDto.getClass();
        return new MessagesScheduledCallItemDto(str, str2, str3, str4, z, userId, messagesCallScheduleDto, z2, bool, bool2, str5, str6, str7, bool3, bool4, bool5, bool6, bool7, bool8, messagesCallChatDto, messagesCallBroadcastDto, callsShortCredentialsDto);
    }

    public final Boolean B() {
        return this.showChatHistory;
    }

    public final boolean C() {
        return this.skipNotification;
    }

    public final String D() {
        return this.vkJoinLink;
    }

    public final Boolean F() {
        return this.waitingHall;
    }

    public final String d() {
        return this.callId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserId e() {
        return this.callerId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesScheduledCallItemDto)) {
            return false;
        }
        MessagesScheduledCallItemDto messagesScheduledCallItemDto = (MessagesScheduledCallItemDto) obj;
        return epx.f(this.callId, messagesScheduledCallItemDto.callId) && epx.f(this.joinLink, messagesScheduledCallItemDto.joinLink) && epx.f(this.vkJoinLink, messagesScheduledCallItemDto.vkJoinLink) && epx.f(this.name, messagesScheduledCallItemDto.name) && this.canEdit == messagesScheduledCallItemDto.canEdit && epx.f(this.callerId, messagesScheduledCallItemDto.callerId) && epx.f(this.schedule, messagesScheduledCallItemDto.schedule) && this.skipNotification == messagesScheduledCallItemDto.skipNotification && epx.f(this.onlyAuthUsers, messagesScheduledCallItemDto.onlyAuthUsers) && epx.f(this.waitingHall, messagesScheduledCallItemDto.waitingHall) && epx.f(this.muteAudio, messagesScheduledCallItemDto.muteAudio) && epx.f(this.muteVideo, messagesScheduledCallItemDto.muteVideo) && epx.f(this.muteScreenSharing, messagesScheduledCallItemDto.muteScreenSharing) && epx.f(this.showChatHistory, messagesScheduledCallItemDto.showChatHistory) && epx.f(this.noStickers, messagesScheduledCallItemDto.noStickers) && epx.f(this.onlyAdminCanShareMovie, messagesScheduledCallItemDto.onlyAdminCanShareMovie) && epx.f(this.feedback, messagesScheduledCallItemDto.feedback) && epx.f(this.onlyAdminCanRecord, messagesScheduledCallItemDto.onlyAdminCanRecord) && epx.f(this.onlyAdminCanStartAsr, messagesScheduledCallItemDto.onlyAdminCanStartAsr) && epx.f(this.chat, messagesScheduledCallItemDto.chat) && epx.f(this.broadcast, messagesScheduledCallItemDto.broadcast) && epx.f(this.shortCredentials, messagesScheduledCallItemDto.shortCredentials);
    }

    public final MessagesCallChatDto f() {
        return this.chat;
    }

    public final Boolean g() {
        return this.feedback;
    }

    public final int hashCode() {
        int b = qoy.b((this.schedule.hashCode() + bh10.a(qoy.b(urd0.a(urd0.a(urd0.a(this.callId.hashCode() * 31, 31, this.joinLink), 31, this.vkJoinLink), 31, this.name), 31, this.canEdit), 31, this.callerId.b)) * 31, 31, this.skipNotification);
        Boolean bool = this.onlyAuthUsers;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.waitingHall;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.muteAudio;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.muteVideo;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.muteScreenSharing;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.showChatHistory;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.noStickers;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.onlyAdminCanShareMovie;
        int hashCode8 = (hashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.feedback;
        int hashCode9 = (hashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.onlyAdminCanRecord;
        int hashCode10 = (hashCode9 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.onlyAdminCanStartAsr;
        int hashCode11 = (hashCode10 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        MessagesCallChatDto messagesCallChatDto = this.chat;
        int hashCode12 = (hashCode11 + (messagesCallChatDto == null ? 0 : messagesCallChatDto.hashCode())) * 31;
        MessagesCallBroadcastDto messagesCallBroadcastDto = this.broadcast;
        int hashCode13 = (hashCode12 + (messagesCallBroadcastDto == null ? 0 : messagesCallBroadcastDto.hashCode())) * 31;
        CallsShortCredentialsDto callsShortCredentialsDto = this.shortCredentials;
        return hashCode13 + (callsShortCredentialsDto != null ? callsShortCredentialsDto.hashCode() : 0);
    }

    public final String i() {
        return this.muteAudio;
    }

    public final String j() {
        return this.muteScreenSharing;
    }

    public final String k() {
        return this.muteVideo;
    }

    public final String l() {
        return this.name;
    }

    public final Boolean n() {
        return this.onlyAdminCanRecord;
    }

    public final Boolean o() {
        return this.onlyAdminCanShareMovie;
    }

    public final Boolean p() {
        return this.onlyAuthUsers;
    }

    public final boolean t0() {
        return this.canEdit;
    }

    public final String toString() {
        return "MessagesScheduledCallItemDto(callId=" + this.callId + ", joinLink=" + this.joinLink + ", vkJoinLink=" + this.vkJoinLink + ", name=" + this.name + ", canEdit=" + this.canEdit + ", callerId=" + this.callerId + ", schedule=" + this.schedule + ", skipNotification=" + this.skipNotification + ", onlyAuthUsers=" + this.onlyAuthUsers + ", waitingHall=" + this.waitingHall + ", muteAudio=" + this.muteAudio + ", muteVideo=" + this.muteVideo + ", muteScreenSharing=" + this.muteScreenSharing + ", showChatHistory=" + this.showChatHistory + ", noStickers=" + this.noStickers + ", onlyAdminCanShareMovie=" + this.onlyAdminCanShareMovie + ", feedback=" + this.feedback + ", onlyAdminCanRecord=" + this.onlyAdminCanRecord + ", onlyAdminCanStartAsr=" + this.onlyAdminCanStartAsr + ", chat=" + this.chat + ", broadcast=" + this.broadcast + ", shortCredentials=" + this.shortCredentials + ')';
    }

    public final MessagesCallScheduleDto u() {
        return this.schedule;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.callId);
        parcel.writeString(this.joinLink);
        parcel.writeString(this.vkJoinLink);
        parcel.writeString(this.name);
        parcel.writeInt(this.canEdit ? 1 : 0);
        parcel.writeParcelable(this.callerId, i);
        this.schedule.writeToParcel(parcel, i);
        parcel.writeInt(this.skipNotification ? 1 : 0);
        Boolean bool = this.onlyAuthUsers;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.waitingHall;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.muteAudio);
        parcel.writeString(this.muteVideo);
        parcel.writeString(this.muteScreenSharing);
        Boolean bool3 = this.showChatHistory;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.noStickers;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.onlyAdminCanShareMovie;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.feedback;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.onlyAdminCanRecord;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.onlyAdminCanStartAsr;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        MessagesCallChatDto messagesCallChatDto = this.chat;
        if (messagesCallChatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCallChatDto.writeToParcel(parcel, i);
        }
        MessagesCallBroadcastDto messagesCallBroadcastDto = this.broadcast;
        if (messagesCallBroadcastDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesCallBroadcastDto.writeToParcel(parcel, i);
        }
        CallsShortCredentialsDto callsShortCredentialsDto = this.shortCredentials;
        if (callsShortCredentialsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callsShortCredentialsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesScheduledCallItemDto(String str, String str2, String str3, String str4, boolean z, UserId userId, MessagesCallScheduleDto messagesCallScheduleDto, boolean z2, Boolean bool, Boolean bool2, String str5, String str6, String str7, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, MessagesCallChatDto messagesCallChatDto, MessagesCallBroadcastDto messagesCallBroadcastDto, CallsShortCredentialsDto callsShortCredentialsDto, int i, zcl zclVar) {
        this(str, str2, str3, str4, z, userId, messagesCallScheduleDto, z2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : bool3, (i & 16384) != 0 ? null : bool4, (32768 & i) != 0 ? null : bool5, (65536 & i) != 0 ? null : bool6, (131072 & i) != 0 ? null : bool7, (262144 & i) != 0 ? null : bool8, (524288 & i) != 0 ? null : messagesCallChatDto, (1048576 & i) != 0 ? null : messagesCallBroadcastDto, (i & 2097152) != 0 ? null : callsShortCredentialsDto);
    }
}
