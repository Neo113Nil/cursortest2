package com.vk.stat.scheme;

import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioAudioListeningItem {

    @pmi0("audio_id")
    private final int audioId;

    @pmi0("audio_owner_id")
    private final long audioOwnerId;

    @pmi0("content_type")
    private final ContentType contentType;

    @pmi0("duration")
    private final Integer duration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @pmi0("music_snippet")
        public static final ContentType MUSIC_SNIPPET;

        @pmi0("music_track")
        public static final ContentType MUSIC_TRACK;

        static {
            ContentType contentType = new ContentType("MUSIC_TRACK", 0);
            MUSIC_TRACK = contentType;
            ContentType contentType2 = new ContentType("MUSIC_SNIPPET", 1);
            MUSIC_SNIPPET = contentType2;
            ContentType[] contentTypeArr = {contentType, contentType2};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        private ContentType(String str, int i) {
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioAudioListeningItem(int i, long j, ContentType contentType, Integer num) {
        this.audioId = i;
        this.audioOwnerId = j;
        this.contentType = contentType;
        this.duration = num;
    }

    public final int a() {
        return this.audioId;
    }

    public final long b() {
        return this.audioOwnerId;
    }

    public final Integer c() {
        return this.duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioAudioListeningItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioAudioListeningItem commonAudioStat$TypeAudioAudioListeningItem = (CommonAudioStat$TypeAudioAudioListeningItem) obj;
        return this.audioId == commonAudioStat$TypeAudioAudioListeningItem.audioId && this.audioOwnerId == commonAudioStat$TypeAudioAudioListeningItem.audioOwnerId && this.contentType == commonAudioStat$TypeAudioAudioListeningItem.contentType && epx.f(this.duration, commonAudioStat$TypeAudioAudioListeningItem.duration);
    }

    public final int hashCode() {
        int hashCode = (this.contentType.hashCode() + bh10.a(Integer.hashCode(this.audioId) * 31, 31, this.audioOwnerId)) * 31;
        Integer num = this.duration;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioAudioListeningItem(audioId=");
        sb.append(this.audioId);
        sb.append(", audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", duration=");
        return uqi.b(sb, this.duration, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioAudioListeningItem(int i, long j, ContentType contentType, Integer num, int i2, zcl zclVar) {
        this(i, j, contentType, (i2 & 8) != 0 ? null : num);
    }
}
