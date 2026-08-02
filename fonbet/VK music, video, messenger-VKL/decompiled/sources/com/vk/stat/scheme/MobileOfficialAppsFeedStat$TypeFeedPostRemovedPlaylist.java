package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist implements SchemeStat$TypeClick.b {

    @pmi0("audio_item")
    private final MobileOfficialAppsFeedStat$FeedPostAudioItem audioItem;

    @pmi0("autoplay_mode")
    private final MobileOfficialAppsFeedStat$FeedPostAudioPlayMode autoplayMode;

    public MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist(MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem) {
        this.autoplayMode = mobileOfficialAppsFeedStat$FeedPostAudioPlayMode;
        this.audioItem = mobileOfficialAppsFeedStat$FeedPostAudioItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist = (MobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist) obj;
        return this.autoplayMode == mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist.autoplayMode && epx.f(this.audioItem, mobileOfficialAppsFeedStat$TypeFeedPostRemovedPlaylist.audioItem);
    }

    public final int hashCode() {
        return this.audioItem.hashCode() + (this.autoplayMode.hashCode() * 31);
    }

    public final String toString() {
        return "TypeFeedPostRemovedPlaylist(autoplayMode=" + this.autoplayMode + ", audioItem=" + this.audioItem + ')';
    }
}
