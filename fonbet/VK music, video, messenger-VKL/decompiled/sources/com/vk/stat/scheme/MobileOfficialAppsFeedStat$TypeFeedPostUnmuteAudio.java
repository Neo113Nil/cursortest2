package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio implements SchemeStat$TypeClick.b {

    @pmi0("audio_item")
    private final MobileOfficialAppsFeedStat$FeedPostAudioItem audioItem;

    public MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio(MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem) {
        this.audioItem = mobileOfficialAppsFeedStat$FeedPostAudioItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio) && epx.f(this.audioItem, ((MobileOfficialAppsFeedStat$TypeFeedPostUnmuteAudio) obj).audioItem);
    }

    public final int hashCode() {
        return this.audioItem.hashCode();
    }

    public final String toString() {
        return "TypeFeedPostUnmuteAudio(audioItem=" + this.audioItem + ')';
    }
}
