package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMessagingAudioMessageItem implements SchemeStat$TypeAction.b {

    @pmi0("action_source")
    private final ActionSource actionSource;

    @pmi0("action_type")
    private final ActionType actionType;

    @pmi0("actor")
    private final Actor actor;

    @pmi0("audio_message_id")
    private final String audioMessageId;

    @pmi0("cmid")
    private final int cmid;

    @pmi0("peer_id")
    private final int peerId;

    @pmi0("playback_rate")
    private final Integer playbackRate;

    @pmi0("transcription_score")
    private final Integer transcriptionScore;

    @pmi0("transcription_show")
    private final Integer transcriptionShow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ActionSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionSource[] $VALUES;

        @pmi0("dialogs_list_player")
        public static final ActionSource DIALOGS_LIST_PLAYER;

        @pmi0("msg_list_attach")
        public static final ActionSource MSG_LIST_ATTACH;

        @pmi0("msg_list_player")
        public static final ActionSource MSG_LIST_PLAYER;

        @pmi0("one_by_one")
        public static final ActionSource ONE_BY_ONE;

        @pmi0("raise_to_ear")
        public static final ActionSource RAISE_TO_EAR;

        static {
            ActionSource actionSource = new ActionSource("MSG_LIST_ATTACH", 0);
            MSG_LIST_ATTACH = actionSource;
            ActionSource actionSource2 = new ActionSource("MSG_LIST_PLAYER", 1);
            MSG_LIST_PLAYER = actionSource2;
            ActionSource actionSource3 = new ActionSource("DIALOGS_LIST_PLAYER", 2);
            DIALOGS_LIST_PLAYER = actionSource3;
            ActionSource actionSource4 = new ActionSource("ONE_BY_ONE", 3);
            ONE_BY_ONE = actionSource4;
            ActionSource actionSource5 = new ActionSource("RAISE_TO_EAR", 4);
            RAISE_TO_EAR = actionSource5;
            ActionSource[] actionSourceArr = {actionSource, actionSource2, actionSource3, actionSource4, actionSource5};
            $VALUES = actionSourceArr;
            $ENTRIES = new asp(actionSourceArr);
        }

        private ActionSource(String str, int i) {
        }

        public static ActionSource valueOf(String str) {
            return (ActionSource) Enum.valueOf(ActionSource.class, str);
        }

        public static ActionSource[] values() {
            return (ActionSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ActionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final ActionType CLOSE;

        @pmi0("editing_transcription")
        public static final ActionType EDITING_TRANSCRIPTION;

        @pmi0("evaluation")
        public static final ActionType EVALUATION;

        @pmi0("finish")
        public static final ActionType FINISH;

        @pmi0("go_to_message")
        public static final ActionType GO_TO_MESSAGE;

        @pmi0("pause")
        public static final ActionType PAUSE;

        @pmi0("play")
        public static final ActionType PLAY;

        @pmi0("transcript_loading")
        public static final ActionType TRANSCRIPT_LOADING;

        @pmi0("transcript_toggle")
        public static final ActionType TRANSCRIPT_TOGGLE;

        static {
            ActionType actionType = new ActionType("PLAY", 0);
            PLAY = actionType;
            ActionType actionType2 = new ActionType("PAUSE", 1);
            PAUSE = actionType2;
            ActionType actionType3 = new ActionType("FINISH", 2);
            FINISH = actionType3;
            ActionType actionType4 = new ActionType("CLOSE", 3);
            CLOSE = actionType4;
            ActionType actionType5 = new ActionType("GO_TO_MESSAGE", 4);
            GO_TO_MESSAGE = actionType5;
            ActionType actionType6 = new ActionType("TRANSCRIPT_TOGGLE", 5);
            TRANSCRIPT_TOGGLE = actionType6;
            ActionType actionType7 = new ActionType("TRANSCRIPT_LOADING", 6);
            TRANSCRIPT_LOADING = actionType7;
            ActionType actionType8 = new ActionType("EVALUATION", 7);
            EVALUATION = actionType8;
            ActionType actionType9 = new ActionType("EDITING_TRANSCRIPTION", 8);
            EDITING_TRANSCRIPTION = actionType9;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7, actionType8, actionType9};
            $VALUES = actionTypeArr;
            $ENTRIES = new asp(actionTypeArr);
        }

        private ActionType(String str, int i) {
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Actor {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Actor[] $VALUES;

        @pmi0("auto")
        public static final Actor AUTO;

        @pmi0("user")
        public static final Actor USER;

        static {
            Actor actor = new Actor("USER", 0);
            USER = actor;
            Actor actor2 = new Actor("AUTO", 1);
            AUTO = actor2;
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

    public SchemeStat$TypeMessagingAudioMessageItem(int i, int i2, String str, ActionType actionType, ActionSource actionSource, Integer num, Integer num2, Integer num3, Actor actor) {
        this.peerId = i;
        this.cmid = i2;
        this.audioMessageId = str;
        this.actionType = actionType;
        this.actionSource = actionSource;
        this.playbackRate = num;
        this.transcriptionShow = num2;
        this.transcriptionScore = num3;
        this.actor = actor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMessagingAudioMessageItem)) {
            return false;
        }
        SchemeStat$TypeMessagingAudioMessageItem schemeStat$TypeMessagingAudioMessageItem = (SchemeStat$TypeMessagingAudioMessageItem) obj;
        return this.peerId == schemeStat$TypeMessagingAudioMessageItem.peerId && this.cmid == schemeStat$TypeMessagingAudioMessageItem.cmid && epx.f(this.audioMessageId, schemeStat$TypeMessagingAudioMessageItem.audioMessageId) && this.actionType == schemeStat$TypeMessagingAudioMessageItem.actionType && this.actionSource == schemeStat$TypeMessagingAudioMessageItem.actionSource && epx.f(this.playbackRate, schemeStat$TypeMessagingAudioMessageItem.playbackRate) && epx.f(this.transcriptionShow, schemeStat$TypeMessagingAudioMessageItem.transcriptionShow) && epx.f(this.transcriptionScore, schemeStat$TypeMessagingAudioMessageItem.transcriptionScore) && this.actor == schemeStat$TypeMessagingAudioMessageItem.actor;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.cmid, Integer.hashCode(this.peerId) * 31, 31), 31, this.audioMessageId);
        ActionType actionType = this.actionType;
        int hashCode = (a + (actionType == null ? 0 : actionType.hashCode())) * 31;
        ActionSource actionSource = this.actionSource;
        int hashCode2 = (hashCode + (actionSource == null ? 0 : actionSource.hashCode())) * 31;
        Integer num = this.playbackRate;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.transcriptionShow;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.transcriptionScore;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Actor actor = this.actor;
        return hashCode5 + (actor != null ? actor.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMessagingAudioMessageItem(peerId=" + this.peerId + ", cmid=" + this.cmid + ", audioMessageId=" + this.audioMessageId + ", actionType=" + this.actionType + ", actionSource=" + this.actionSource + ", playbackRate=" + this.playbackRate + ", transcriptionShow=" + this.transcriptionShow + ", transcriptionScore=" + this.transcriptionScore + ", actor=" + this.actor + ')';
    }

    public /* synthetic */ SchemeStat$TypeMessagingAudioMessageItem(int i, int i2, String str, ActionType actionType, ActionSource actionSource, Integer num, Integer num2, Integer num3, Actor actor, int i3, zcl zclVar) {
        this(i, i2, str, (i3 & 8) != 0 ? null : actionType, (i3 & 16) != 0 ? null : actionSource, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : num2, (i3 & 128) != 0 ? null : num3, (i3 & 256) != 0 ? null : actor);
    }
}
