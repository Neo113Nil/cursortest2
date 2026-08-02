package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeAudioMessageTranscriptLoadingItem implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("actor")
    private final Actor actor;

    @pmi0("audio_message_id")
    private final String audioMessageId;

    @pmi0("conversation_message_id")
    private final int conversationMessageId;

    @pmi0("duration")
    private final int duration;

    @pmi0("has_stable_connection")
    private final boolean hasStableConnection;

    @pmi0("is_completed")
    private final boolean isCompleted;

    @pmi0("peer_id")
    private final int peerId;

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

    public SchemeStat$TypeAudioMessageTranscriptLoadingItem(int i, boolean z, boolean z2, int i2, int i3, String str, Actor actor) {
        this.duration = i;
        this.isCompleted = z;
        this.hasStableConnection = z2;
        this.peerId = i2;
        this.conversationMessageId = i3;
        this.audioMessageId = str;
        this.actor = actor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAudioMessageTranscriptLoadingItem)) {
            return false;
        }
        SchemeStat$TypeAudioMessageTranscriptLoadingItem schemeStat$TypeAudioMessageTranscriptLoadingItem = (SchemeStat$TypeAudioMessageTranscriptLoadingItem) obj;
        return this.duration == schemeStat$TypeAudioMessageTranscriptLoadingItem.duration && this.isCompleted == schemeStat$TypeAudioMessageTranscriptLoadingItem.isCompleted && this.hasStableConnection == schemeStat$TypeAudioMessageTranscriptLoadingItem.hasStableConnection && this.peerId == schemeStat$TypeAudioMessageTranscriptLoadingItem.peerId && this.conversationMessageId == schemeStat$TypeAudioMessageTranscriptLoadingItem.conversationMessageId && epx.f(this.audioMessageId, schemeStat$TypeAudioMessageTranscriptLoadingItem.audioMessageId) && this.actor == schemeStat$TypeAudioMessageTranscriptLoadingItem.actor;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.conversationMessageId, shy.a(this.peerId, qoy.b(qoy.b(Integer.hashCode(this.duration) * 31, 31, this.isCompleted), 31, this.hasStableConnection), 31), 31), 31, this.audioMessageId);
        Actor actor = this.actor;
        return a + (actor == null ? 0 : actor.hashCode());
    }

    public final String toString() {
        return "TypeAudioMessageTranscriptLoadingItem(duration=" + this.duration + ", isCompleted=" + this.isCompleted + ", hasStableConnection=" + this.hasStableConnection + ", peerId=" + this.peerId + ", conversationMessageId=" + this.conversationMessageId + ", audioMessageId=" + this.audioMessageId + ", actor=" + this.actor + ')';
    }

    public /* synthetic */ SchemeStat$TypeAudioMessageTranscriptLoadingItem(int i, boolean z, boolean z2, int i2, int i3, String str, Actor actor, int i4, zcl zclVar) {
        this(i, z, z2, i2, i3, str, (i4 & 64) != 0 ? null : actor);
    }
}
