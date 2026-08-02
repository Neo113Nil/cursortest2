package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
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
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("audio_item")
    private final MobileOfficialAppsFeedStat$FeedPostAudioItem audioItem;

    @pmi0("autoplay_mode")
    private final MobileOfficialAppsFeedStat$FeedPostAudioPlayMode autoplayMode;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("subtype")
    private final Subtype subtype;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio>, a9y<MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio((MobileOfficialAppsFeedStat$FeedPostAudioPlayMode) dq.f(x9yVar, "autoplay_mode", tru.a(), MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.class), (MobileOfficialAppsFeedStat$FeedPostAudioItem) dq.f(x9yVar, "audio_item", tru.a(), MobileOfficialAppsFeedStat$FeedPostAudioItem.class), (Subtype) dq.f(x9yVar, "subtype", tru.a(), Subtype.class), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio = (MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("autoplay_mode", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.b()));
            x9yVar.o("audio_item", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.a()));
            x9yVar.o("subtype", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.c()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.a);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    /* loaded from: classes5.dex */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("percent_100")
        public static final Subtype PERCENT_100;

        @pmi0("percent_25")
        public static final Subtype PERCENT_25;

        @pmi0("percent_50")
        public static final Subtype PERCENT_50;

        @pmi0("percent_75")
        public static final Subtype PERCENT_75;

        @pmi0("percent_95")
        public static final Subtype PERCENT_95;

        @pmi0("seconds_10")
        public static final Subtype SECONDS_10;

        @pmi0("seconds_3")
        public static final Subtype SECONDS_3;

        static {
            Subtype subtype = new Subtype("SECONDS_3", 0);
            SECONDS_3 = subtype;
            Subtype subtype2 = new Subtype("SECONDS_10", 1);
            SECONDS_10 = subtype2;
            Subtype subtype3 = new Subtype("PERCENT_25", 2);
            PERCENT_25 = subtype3;
            Subtype subtype4 = new Subtype("PERCENT_50", 3);
            PERCENT_50 = subtype4;
            Subtype subtype5 = new Subtype("PERCENT_75", 4);
            PERCENT_75 = subtype5;
            Subtype subtype6 = new Subtype("PERCENT_95", 5);
            PERCENT_95 = subtype6;
            Subtype subtype7 = new Subtype("PERCENT_100", 6);
            PERCENT_100 = subtype7;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio(MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem, Subtype subtype, String str) {
        this.autoplayMode = mobileOfficialAppsFeedStat$FeedPostAudioPlayMode;
        this.audioItem = mobileOfficialAppsFeedStat$FeedPostAudioItem;
        this.subtype = subtype;
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

    public final Subtype c() {
        return this.subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio = (MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio) obj;
        return this.autoplayMode == mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.autoplayMode && epx.f(this.audioItem, mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.audioItem) && this.subtype == mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.subtype && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio.a);
    }

    public final int hashCode() {
        int hashCode = (this.subtype.hashCode() + ((this.audioItem.hashCode() + (this.autoplayMode.hashCode() * 31)) * 31)) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedPostPlayedUnitOfAudio(autoplayMode=");
        sb.append(this.autoplayMode);
        sb.append(", audioItem=");
        sb.append(this.audioItem);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedPostPlayedUnitOfAudio(MobileOfficialAppsFeedStat$FeedPostAudioPlayMode mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem, Subtype subtype, String str, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$FeedPostAudioPlayMode, mobileOfficialAppsFeedStat$FeedPostAudioItem, subtype, (i & 8) != 0 ? null : str);
    }
}
