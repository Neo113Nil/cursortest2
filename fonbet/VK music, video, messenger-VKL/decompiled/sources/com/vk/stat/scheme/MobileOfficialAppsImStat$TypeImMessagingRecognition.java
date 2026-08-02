package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsImStat$TypeImMessagingRecognition implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("actor")
    private final Actor actor;

    @pmi0("cmid")
    private final Integer cmid;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("error_code")
    private final ErrorCode errorCode;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("has_stable_connection")
    private final Integer hasStableConnection;

    @pmi0("message_id")
    private final Integer messageId;

    @pmi0("message_playback_rate")
    private final Integer messagePlaybackRate;

    @pmi0("message_type")
    private final MessageType messageType;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("peer_id")
    private final long peerId;

    @pmi0("record_type")
    private final RecordType recordType;

    @pmi0("result")
    private final Result result;

    @pmi0("score")
    private final Integer score;

    @pmi0("show")
    private final Integer show;

    @pmi0("source")
    private final Source source;

    @pmi0("video_frame")
    private final Integer videoFrame;

    @pmi0("waiting")
    private final Integer waiting;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Actor {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Actor[] $VALUES;

        @pmi0("auto")
        public static final Actor AUTO;

        @pmi0("user")
        public static final Actor USER;

        static {
            Actor actor = new Actor("AUTO", 0);
            AUTO = actor;
            Actor actor2 = new Actor("USER", 1);
            USER = actor2;
            Actor[] actorArr = {actor, actor2};
            $VALUES = actorArr;
            $ENTRIES = new asp(actorArr);
        }

        private Actor(String str, int i) {
        }

        public static Actor valueOf(String str) {
            return (Actor) Enum.valueOf(Actor.class, str);
        }

        public static Actor[] values() {
            return (Actor[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class ErrorCode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorCode[] $VALUES;

        @pmi0("need_prod")
        public static final ErrorCode NEED_PROD;

        @pmi0("need_staging")
        public static final ErrorCode NEED_STAGING;

        @pmi0("none")
        public static final ErrorCode NONE;

        static {
            ErrorCode errorCode = new ErrorCode("NEED_PROD", 0);
            NEED_PROD = errorCode;
            ErrorCode errorCode2 = new ErrorCode("NEED_STAGING", 1);
            NEED_STAGING = errorCode2;
            ErrorCode errorCode3 = new ErrorCode("NONE", 2);
            NONE = errorCode3;
            ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3};
            $VALUES = errorCodeArr;
            $ENTRIES = new asp(errorCodeArr);
        }

        private ErrorCode(String str, int i) {
        }

        public static ErrorCode valueOf(String str) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("change_playspeed")
        public static final Event CHANGE_PLAYSPEED;

        @pmi0("change_position")
        public static final Event CHANGE_POSITION;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Event CLOSE;

        @pmi0("delete")
        public static final Event DELETE;

        @pmi0("editing_transcription")
        public static final Event EDITING_TRANSCRIPTION;

        @pmi0("edit_cut_beginning")
        public static final Event EDIT_CUT_BEGINNING;

        @pmi0("edit_cut_ending")
        public static final Event EDIT_CUT_ENDING;

        @pmi0("edit_sound_off")
        public static final Event EDIT_SOUND_OFF;

        @pmi0("edit_sound_on")
        public static final Event EDIT_SOUND_ON;

        @pmi0("evaluation")
        public static final Event EVALUATION;

        @pmi0("pause")
        public static final Event PAUSE;

        @pmi0("play")
        public static final Event PLAY;

        @pmi0("recognition")
        public static final Event RECOGNITION;

        @pmi0("record_start")
        public static final Event RECORD_START;

        @pmi0("rewind")
        public static final Event REWIND;

        @pmi0("save")
        public static final Event SAVE;

        @pmi0("send")
        public static final Event SEND;

        @pmi0("switch_camera")
        public static final Event SWITCH_CAMERA;

        @pmi0("transcript_loading")
        public static final Event TRANSCRIPT_LOADING;

        @pmi0("transcript_toggle")
        public static final Event TRANSCRIPT_TOGGLE;

        @pmi0("use_zoom")
        public static final Event USE_ZOOM;

        @pmi0("viewed_finish")
        public static final Event VIEWED_FINISH;

        @pmi0("viewed_perc_25")
        public static final Event VIEWED_PERC_25;

        @pmi0("viewed_perc_50")
        public static final Event VIEWED_PERC_50;

        @pmi0("viewed_perc_75")
        public static final Event VIEWED_PERC_75;

        static {
            Event event = new Event("SEND", 0);
            SEND = event;
            Event event2 = new Event("VIEWED_PERC_25", 1);
            VIEWED_PERC_25 = event2;
            Event event3 = new Event("VIEWED_PERC_50", 2);
            VIEWED_PERC_50 = event3;
            Event event4 = new Event("VIEWED_PERC_75", 3);
            VIEWED_PERC_75 = event4;
            Event event5 = new Event("VIEWED_FINISH", 4);
            VIEWED_FINISH = event5;
            Event event6 = new Event("PLAY", 5);
            PLAY = event6;
            Event event7 = new Event("PAUSE", 6);
            PAUSE = event7;
            Event event8 = new Event("CLOSE", 7);
            CLOSE = event8;
            Event event9 = new Event("EDIT_CUT_BEGINNING", 8);
            EDIT_CUT_BEGINNING = event9;
            Event event10 = new Event("EDIT_CUT_ENDING", 9);
            EDIT_CUT_ENDING = event10;
            Event event11 = new Event("EDIT_SOUND_OFF", 10);
            EDIT_SOUND_OFF = event11;
            Event event12 = new Event("EDIT_SOUND_ON", 11);
            EDIT_SOUND_ON = event12;
            Event event13 = new Event("REWIND", 12);
            REWIND = event13;
            Event event14 = new Event("RECORD_START", 13);
            RECORD_START = event14;
            Event event15 = new Event("DELETE", 14);
            DELETE = event15;
            Event event16 = new Event("TRANSCRIPT_TOGGLE", 15);
            TRANSCRIPT_TOGGLE = event16;
            Event event17 = new Event("TRANSCRIPT_LOADING", 16);
            TRANSCRIPT_LOADING = event17;
            Event event18 = new Event("RECOGNITION", 17);
            RECOGNITION = event18;
            Event event19 = new Event("EDITING_TRANSCRIPTION", 18);
            EDITING_TRANSCRIPTION = event19;
            Event event20 = new Event("EVALUATION", 19);
            EVALUATION = event20;
            Event event21 = new Event("CHANGE_PLAYSPEED", 20);
            CHANGE_PLAYSPEED = event21;
            Event event22 = new Event("SAVE", 21);
            SAVE = event22;
            Event event23 = new Event("CHANGE_POSITION", 22);
            CHANGE_POSITION = event23;
            Event event24 = new Event("SWITCH_CAMERA", 23);
            SWITCH_CAMERA = event24;
            Event event25 = new Event("USE_ZOOM", 24);
            USE_ZOOM = event25;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11, event12, event13, event14, event15, event16, event17, event18, event19, event20, event21, event22, event23, event24, event25};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class MessageType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MessageType[] $VALUES;

        @pmi0("audio_message")
        public static final MessageType AUDIO_MESSAGE;

        @pmi0("video_message")
        public static final MessageType VIDEO_MESSAGE;

        static {
            MessageType messageType = new MessageType("AUDIO_MESSAGE", 0);
            AUDIO_MESSAGE = messageType;
            MessageType messageType2 = new MessageType("VIDEO_MESSAGE", 1);
            VIDEO_MESSAGE = messageType2;
            MessageType[] messageTypeArr = {messageType, messageType2};
            $VALUES = messageTypeArr;
            $ENTRIES = new asp(messageTypeArr);
        }

        private MessageType(String str, int i) {
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class RecordType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RecordType[] $VALUES;

        @pmi0("longtap")
        public static final RecordType LONGTAP;

        @pmi0("tap")
        public static final RecordType TAP;

        static {
            RecordType recordType = new RecordType("TAP", 0);
            TAP = recordType;
            RecordType recordType2 = new RecordType("LONGTAP", 1);
            LONGTAP = recordType2;
            RecordType[] recordTypeArr = {recordType, recordType2};
            $VALUES = recordTypeArr;
            $ENTRIES = new asp(recordTypeArr);
        }

        private RecordType(String str, int i) {
        }

        public static RecordType valueOf(String str) {
            return (RecordType) Enum.valueOf(RecordType.class, str);
        }

        public static RecordType[] values() {
            return (RecordType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Result {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;

        @pmi0("completed")
        public static final Result COMPLETED;

        @pmi0("interrupted")
        public static final Result INTERRUPTED;

        static {
            Result result = new Result("COMPLETED", 0);
            COMPLETED = result;
            Result result2 = new Result("INTERRUPTED", 1);
            INTERRUPTED = result2;
            Result[] resultArr = {result, result2};
            $VALUES = resultArr;
            $ENTRIES = new asp(resultArr);
        }

        private Result(String str, int i) {
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("dialogs_list_player")
        public static final Source DIALOGS_LIST_PLAYER;

        @pmi0("msg_list_attach")
        public static final Source MSG_LIST_ATTACH;

        @pmi0("msg_list_player")
        public static final Source MSG_LIST_PLAYER;

        @pmi0("one_by_one")
        public static final Source ONE_BY_ONE;

        @pmi0("raise_to_ear")
        public static final Source RAISE_TO_EAR;

        static {
            Source source = new Source("MSG_LIST_ATTACH", 0);
            MSG_LIST_ATTACH = source;
            Source source2 = new Source("MSG_LIST_PLAYER", 1);
            MSG_LIST_PLAYER = source2;
            Source source3 = new Source("DIALOGS_LIST_PLAYER", 2);
            DIALOGS_LIST_PLAYER = source3;
            Source source4 = new Source("ONE_BY_ONE", 3);
            ONE_BY_ONE = source4;
            Source source5 = new Source("RAISE_TO_EAR", 4);
            RAISE_TO_EAR = source5;
            Source[] sourceArr = {source, source2, source3, source4, source5};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsImStat$TypeImMessagingRecognition(Event event, MessageType messageType, long j, Actor actor, Integer num, Integer num2, Integer num3, Source source, Integer num4, RecordType recordType, Integer num5, Result result, ErrorCode errorCode, Integer num6, Integer num7, Integer num8, Integer num9, Long l) {
        this.event = event;
        this.messageType = messageType;
        this.peerId = j;
        this.actor = actor;
        this.cmid = num;
        this.messageId = num2;
        this.duration = num3;
        this.source = source;
        this.videoFrame = num4;
        this.recordType = recordType;
        this.show = num5;
        this.result = result;
        this.errorCode = errorCode;
        this.waiting = num6;
        this.hasStableConnection = num7;
        this.score = num8;
        this.messagePlaybackRate = num9;
        this.ownerId = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImMessagingRecognition)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = (MobileOfficialAppsImStat$TypeImMessagingRecognition) obj;
        return this.event == mobileOfficialAppsImStat$TypeImMessagingRecognition.event && this.messageType == mobileOfficialAppsImStat$TypeImMessagingRecognition.messageType && this.peerId == mobileOfficialAppsImStat$TypeImMessagingRecognition.peerId && this.actor == mobileOfficialAppsImStat$TypeImMessagingRecognition.actor && epx.f(this.cmid, mobileOfficialAppsImStat$TypeImMessagingRecognition.cmid) && epx.f(this.messageId, mobileOfficialAppsImStat$TypeImMessagingRecognition.messageId) && epx.f(this.duration, mobileOfficialAppsImStat$TypeImMessagingRecognition.duration) && this.source == mobileOfficialAppsImStat$TypeImMessagingRecognition.source && epx.f(this.videoFrame, mobileOfficialAppsImStat$TypeImMessagingRecognition.videoFrame) && this.recordType == mobileOfficialAppsImStat$TypeImMessagingRecognition.recordType && epx.f(this.show, mobileOfficialAppsImStat$TypeImMessagingRecognition.show) && this.result == mobileOfficialAppsImStat$TypeImMessagingRecognition.result && this.errorCode == mobileOfficialAppsImStat$TypeImMessagingRecognition.errorCode && epx.f(this.waiting, mobileOfficialAppsImStat$TypeImMessagingRecognition.waiting) && epx.f(this.hasStableConnection, mobileOfficialAppsImStat$TypeImMessagingRecognition.hasStableConnection) && epx.f(this.score, mobileOfficialAppsImStat$TypeImMessagingRecognition.score) && epx.f(this.messagePlaybackRate, mobileOfficialAppsImStat$TypeImMessagingRecognition.messagePlaybackRate) && epx.f(this.ownerId, mobileOfficialAppsImStat$TypeImMessagingRecognition.ownerId);
    }

    public final int hashCode() {
        int a = bh10.a((this.messageType.hashCode() + (this.event.hashCode() * 31)) * 31, 31, this.peerId);
        Actor actor = this.actor;
        int hashCode = (a + (actor == null ? 0 : actor.hashCode())) * 31;
        Integer num = this.cmid;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.messageId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.duration;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Source source = this.source;
        int hashCode5 = (hashCode4 + (source == null ? 0 : source.hashCode())) * 31;
        Integer num4 = this.videoFrame;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        RecordType recordType = this.recordType;
        int hashCode7 = (hashCode6 + (recordType == null ? 0 : recordType.hashCode())) * 31;
        Integer num5 = this.show;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Result result = this.result;
        int hashCode9 = (hashCode8 + (result == null ? 0 : result.hashCode())) * 31;
        ErrorCode errorCode = this.errorCode;
        int hashCode10 = (hashCode9 + (errorCode == null ? 0 : errorCode.hashCode())) * 31;
        Integer num6 = this.waiting;
        int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.hasStableConnection;
        int hashCode12 = (hashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.score;
        int hashCode13 = (hashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.messagePlaybackRate;
        int hashCode14 = (hashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Long l = this.ownerId;
        return hashCode14 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeImMessagingRecognition(event=");
        sb.append(this.event);
        sb.append(", messageType=");
        sb.append(this.messageType);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", actor=");
        sb.append(this.actor);
        sb.append(", cmid=");
        sb.append(this.cmid);
        sb.append(", messageId=");
        sb.append(this.messageId);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", videoFrame=");
        sb.append(this.videoFrame);
        sb.append(", recordType=");
        sb.append(this.recordType);
        sb.append(", show=");
        sb.append(this.show);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", waiting=");
        sb.append(this.waiting);
        sb.append(", hasStableConnection=");
        sb.append(this.hasStableConnection);
        sb.append(", score=");
        sb.append(this.score);
        sb.append(", messagePlaybackRate=");
        sb.append(this.messagePlaybackRate);
        sb.append(", ownerId=");
        return iq.b(sb, this.ownerId, ')');
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImMessagingRecognition(Event event, MessageType messageType, long j, Actor actor, Integer num, Integer num2, Integer num3, Source source, Integer num4, RecordType recordType, Integer num5, Result result, ErrorCode errorCode, Integer num6, Integer num7, Integer num8, Integer num9, Long l, int i, zcl zclVar) {
        this(event, messageType, j, (i & 8) != 0 ? null : actor, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : source, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : recordType, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : result, (i & 4096) != 0 ? null : errorCode, (i & 8192) != 0 ? null : num6, (i & 16384) != 0 ? null : num7, (32768 & i) != 0 ? null : num8, (65536 & i) != 0 ? null : num9, (i & 131072) != 0 ? null : l);
    }
}
