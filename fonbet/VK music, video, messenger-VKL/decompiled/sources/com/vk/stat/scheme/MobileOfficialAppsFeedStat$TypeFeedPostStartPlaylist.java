package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("audio_item")
    private final MobileOfficialAppsFeedStat$FeedPostAudioItem audioItem;

    @pmi0("autoplay_mode")
    private final MobileOfficialAppsFeedStat$FeedPostAudioPlayMode autoplayMode;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist>, a9y<MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist((MobileOfficialAppsFeedStat$FeedPostAudioPlayMode) dq.f(x9yVar, "autoplay_mode", tru.a(), MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.class), (MobileOfficialAppsFeedStat$FeedPostAudioItem) dq.f(x9yVar, "audio_item", tru.a(), MobileOfficialAppsFeedStat$FeedPostAudioItem.class), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist = (MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("autoplay_mode", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist.b()));
            x9yVar.o("audio_item", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist.a()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist(MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem, String str) {
        this.autoplayMode = mobileOfficialAppsFeedStat$FeedPostAudioPlayMode;
        this.audioItem = mobileOfficialAppsFeedStat$FeedPostAudioItem;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final MobileOfficialAppsFeedStat$FeedPostAudioItem a() {
        return this.audioItem;
    }

    public final MobileOfficialAppsFeedStat$FeedPostAudioPlayMode b() {
        return this.autoplayMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist = (MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist) obj;
        return this.autoplayMode == mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist.autoplayMode && epx.f(this.audioItem, mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist.audioItem) && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist.a);
    }

    public final int hashCode() {
        int hashCode = (this.audioItem.hashCode() + (this.autoplayMode.hashCode() * 31)) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedPostStartPlaylist(autoplayMode=");
        sb.append(this.autoplayMode);
        sb.append(", audioItem=");
        sb.append(this.audioItem);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist(MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem, String str, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, mobileOfficialAppsFeedStat$FeedPostAudioItem, (i & 4) != 0 ? null : str);
    }
}
