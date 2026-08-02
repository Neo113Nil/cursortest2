package com.vk.stat.scheme;

import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioPodcastListeningItem {

    @pmi0("content_type")
    private final ContentType contentType;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("episode_id")
    private final int episodeId;

    @pmi0("podcast_authors_ids")
    private final List<Integer> podcastAuthorsIds;

    @pmi0("podcast_id")
    private final int podcastId;

    @pmi0("podcast_owner_id")
    private final long podcastOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @pmi0("podcast_episode")
        public static final ContentType PODCAST_EPISODE;

        @pmi0("podcast_trailer")
        public static final ContentType PODCAST_TRAILER;

        static {
            ContentType contentType = new ContentType("PODCAST_EPISODE", 0);
            PODCAST_EPISODE = contentType;
            ContentType contentType2 = new ContentType("PODCAST_TRAILER", 1);
            PODCAST_TRAILER = contentType2;
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

    public CommonAudioStat$TypeAudioPodcastListeningItem(int i, long j, int i2, ContentType contentType, List<Integer> list, Integer num) {
        this.podcastId = i;
        this.podcastOwnerId = j;
        this.episodeId = i2;
        this.contentType = contentType;
        this.podcastAuthorsIds = list;
        this.duration = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioPodcastListeningItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioPodcastListeningItem commonAudioStat$TypeAudioPodcastListeningItem = (CommonAudioStat$TypeAudioPodcastListeningItem) obj;
        return this.podcastId == commonAudioStat$TypeAudioPodcastListeningItem.podcastId && this.podcastOwnerId == commonAudioStat$TypeAudioPodcastListeningItem.podcastOwnerId && this.episodeId == commonAudioStat$TypeAudioPodcastListeningItem.episodeId && this.contentType == commonAudioStat$TypeAudioPodcastListeningItem.contentType && epx.f(this.podcastAuthorsIds, commonAudioStat$TypeAudioPodcastListeningItem.podcastAuthorsIds) && epx.f(this.duration, commonAudioStat$TypeAudioPodcastListeningItem.duration);
    }

    public final int hashCode() {
        int hashCode = (this.contentType.hashCode() + shy.a(this.episodeId, bh10.a(Integer.hashCode(this.podcastId) * 31, 31, this.podcastOwnerId), 31)) * 31;
        List<Integer> list = this.podcastAuthorsIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.duration;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioPodcastListeningItem(podcastId=");
        sb.append(this.podcastId);
        sb.append(", podcastOwnerId=");
        sb.append(this.podcastOwnerId);
        sb.append(", episodeId=");
        sb.append(this.episodeId);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", podcastAuthorsIds=");
        sb.append(this.podcastAuthorsIds);
        sb.append(", duration=");
        return uqi.b(sb, this.duration, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioPodcastListeningItem(int i, long j, int i2, ContentType contentType, List list, Integer num, int i3, zcl zclVar) {
        this(i, j, i2, contentType, (i3 & 16) != 0 ? null : list, (i3 & 32) != 0 ? null : num);
    }
}
