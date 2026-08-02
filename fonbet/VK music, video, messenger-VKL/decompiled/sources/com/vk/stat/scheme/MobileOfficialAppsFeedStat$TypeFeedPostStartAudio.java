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
public final class MobileOfficialAppsFeedStat$TypeFeedPostStartAudio implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("audio_item")
    private final MobileOfficialAppsFeedStat$FeedPostAudioItem audioItem;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("subtype")
    private final Subtype subtype;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedPostStartAudio>, a9y<MobileOfficialAppsFeedStat$TypeFeedPostStartAudio> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedPostStartAudio((Subtype) dq.f(x9yVar, "subtype", tru.a(), Subtype.class), (MobileOfficialAppsFeedStat$FeedPostAudioItem) dq.f(x9yVar, "audio_item", tru.a(), MobileOfficialAppsFeedStat$FeedPostAudioItem.class), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedPostStartAudio mobileOfficialAppsFeedStat$TypeFeedPostStartAudio = (MobileOfficialAppsFeedStat$TypeFeedPostStartAudio) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("subtype", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedPostStartAudio.b()));
            x9yVar.o("audio_item", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedPostStartAudio.a()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedPostStartAudio.a);
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

        @pmi0("autoplay")
        public static final Subtype AUTOPLAY;

        @pmi0("manual")
        public static final Subtype MANUAL;

        @pmi0("pause")
        public static final Subtype PAUSE;

        static {
            Subtype subtype = new Subtype("AUTOPLAY", 0);
            AUTOPLAY = subtype;
            Subtype subtype2 = new Subtype("MANUAL", 1);
            MANUAL = subtype2;
            Subtype subtype3 = new Subtype("PAUSE", 2);
            PAUSE = subtype3;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3};
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

    public MobileOfficialAppsFeedStat$TypeFeedPostStartAudio(Subtype subtype, MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem, String str) {
        this.subtype = subtype;
        this.audioItem = mobileOfficialAppsFeedStat$FeedPostAudioItem;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final MobileOfficialAppsFeedStat$FeedPostAudioItem a() {
        return this.audioItem;
    }

    public final Subtype b() {
        return this.subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedPostStartAudio)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedPostStartAudio mobileOfficialAppsFeedStat$TypeFeedPostStartAudio = (MobileOfficialAppsFeedStat$TypeFeedPostStartAudio) obj;
        return this.subtype == mobileOfficialAppsFeedStat$TypeFeedPostStartAudio.subtype && epx.f(this.audioItem, mobileOfficialAppsFeedStat$TypeFeedPostStartAudio.audioItem) && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedPostStartAudio.a);
    }

    public final int hashCode() {
        int hashCode = (this.audioItem.hashCode() + (this.subtype.hashCode() * 31)) * 31;
        String str = this.a;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedPostStartAudio(subtype=");
        sb.append(this.subtype);
        sb.append(", audioItem=");
        sb.append(this.audioItem);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedPostStartAudio(Subtype subtype, MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem, String str, int i, zcl zclVar) {
        this(subtype, mobileOfficialAppsFeedStat$FeedPostAudioItem, (i & 4) != 0 ? null : str);
    }
}
