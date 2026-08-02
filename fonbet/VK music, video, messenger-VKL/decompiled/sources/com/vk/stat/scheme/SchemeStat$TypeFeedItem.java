package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.X3;
import com.vk.stat.scheme.SchemeStat$TypeView;
import ru.ok.android.onelog.NetworkClass;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeFeedItem implements SchemeStat$TypeView.b {
    public final transient String a;
    public final transient String b;

    @pmi0("duration_async")
    private final Long durationAsync;

    @pmi0("event_type")
    private final FilteredString filteredEventType;

    @pmi0("feedback_track_code")
    private final FilteredString filteredFeedbackTrackCode;

    @pmi0("height")
    private final int height;

    @pmi0("network_quality")
    private final NetworkQuality networkQuality;

    @pmi0("state_async")
    private final StateAsync stateAsync;

    @pmi0("width")
    private final int width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class NetworkQuality {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NetworkQuality[] $VALUES;

        @pmi0("bad")
        public static final NetworkQuality BAD;

        @pmi0(NetworkClass.GOOD)
        public static final NetworkQuality GOOD;

        @pmi0("medium")
        public static final NetworkQuality MEDIUM;

        @pmi0("unknown")
        public static final NetworkQuality UNKNOWN;

        static {
            NetworkQuality networkQuality = new NetworkQuality(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = networkQuality;
            NetworkQuality networkQuality2 = new NetworkQuality("BAD", 1);
            BAD = networkQuality2;
            NetworkQuality networkQuality3 = new NetworkQuality("MEDIUM", 2);
            MEDIUM = networkQuality3;
            NetworkQuality networkQuality4 = new NetworkQuality("GOOD", 3);
            GOOD = networkQuality4;
            NetworkQuality[] networkQualityArr = {networkQuality, networkQuality2, networkQuality3, networkQuality4};
            $VALUES = networkQualityArr;
            $ENTRIES = new asp(networkQualityArr);
        }

        private NetworkQuality(String str, int i) {
        }

        public static NetworkQuality valueOf(String str) {
            return (NetworkQuality) Enum.valueOf(NetworkQuality.class, str);
        }

        public static NetworkQuality[] values() {
            return (NetworkQuality[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeFeedItem>, a9y<SchemeStat$TypeFeedItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            int p = fai.p(x9yVar, "width");
            int p2 = fai.p(x9yVar, "height");
            String C = fai.C(x9yVar, "event_type");
            Long B = fai.B(x9yVar, "duration_async");
            Gson a = tru.a();
            b9y q = x9yVar.q("state_async");
            Object obj = null;
            StateAsync stateAsync = (StateAsync) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), StateAsync.class));
            String C2 = fai.C(x9yVar, "feedback_track_code");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("network_quality");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) NetworkQuality.class);
            }
            return new SchemeStat$TypeFeedItem(p, p2, C, B, stateAsync, C2, (NetworkQuality) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeFeedItem schemeStat$TypeFeedItem = (SchemeStat$TypeFeedItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("width", Integer.valueOf(schemeStat$TypeFeedItem.e()));
            x9yVar.n("height", Integer.valueOf(schemeStat$TypeFeedItem.b()));
            x9yVar.o("event_type", schemeStat$TypeFeedItem.a);
            x9yVar.n("duration_async", schemeStat$TypeFeedItem.a());
            x9yVar.o("state_async", tru.a().toJson(schemeStat$TypeFeedItem.d()));
            x9yVar.o("feedback_track_code", schemeStat$TypeFeedItem.b);
            x9yVar.o("network_quality", tru.a().toJson(schemeStat$TypeFeedItem.c()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class StateAsync {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StateAsync[] $VALUES;

        @pmi0("error")
        public static final StateAsync ERROR;

        @pmi0(X3.i.r)
        public static final StateAsync LOADED;

        @pmi0("loading")
        public static final StateAsync LOADING;

        @pmi0("none")
        public static final StateAsync NONE;

        static {
            StateAsync stateAsync = new StateAsync("NONE", 0);
            NONE = stateAsync;
            StateAsync stateAsync2 = new StateAsync("LOADING", 1);
            LOADING = stateAsync2;
            StateAsync stateAsync3 = new StateAsync("LOADED", 2);
            LOADED = stateAsync3;
            StateAsync stateAsync4 = new StateAsync("ERROR", 3);
            ERROR = stateAsync4;
            StateAsync[] stateAsyncArr = {stateAsync, stateAsync2, stateAsync3, stateAsync4};
            $VALUES = stateAsyncArr;
            $ENTRIES = new asp(stateAsyncArr);
        }

        private StateAsync(String str, int i) {
        }

        public static StateAsync valueOf(String str) {
            return (StateAsync) Enum.valueOf(StateAsync.class, str);
        }

        public static StateAsync[] values() {
            return (StateAsync[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeFeedItem(int i, int i2, String str, Long l, StateAsync stateAsync, String str2, NetworkQuality networkQuality) {
        this.width = i;
        this.height = i2;
        this.a = str;
        this.durationAsync = l;
        this.stateAsync = stateAsync;
        this.b = str2;
        this.networkQuality = networkQuality;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredEventType = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredFeedbackTrackCode = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final Long a() {
        return this.durationAsync;
    }

    public final int b() {
        return this.height;
    }

    public final NetworkQuality c() {
        return this.networkQuality;
    }

    public final StateAsync d() {
        return this.stateAsync;
    }

    public final int e() {
        return this.width;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeFeedItem)) {
            return false;
        }
        SchemeStat$TypeFeedItem schemeStat$TypeFeedItem = (SchemeStat$TypeFeedItem) obj;
        return this.width == schemeStat$TypeFeedItem.width && this.height == schemeStat$TypeFeedItem.height && epx.f(this.a, schemeStat$TypeFeedItem.a) && epx.f(this.durationAsync, schemeStat$TypeFeedItem.durationAsync) && this.stateAsync == schemeStat$TypeFeedItem.stateAsync && epx.f(this.b, schemeStat$TypeFeedItem.b) && this.networkQuality == schemeStat$TypeFeedItem.networkQuality;
    }

    public final int hashCode() {
        int a = shy.a(this.height, Integer.hashCode(this.width) * 31, 31);
        String str = this.a;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.durationAsync;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        StateAsync stateAsync = this.stateAsync;
        int hashCode3 = (hashCode2 + (stateAsync == null ? 0 : stateAsync.hashCode())) * 31;
        String str2 = this.b;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NetworkQuality networkQuality = this.networkQuality;
        return hashCode4 + (networkQuality != null ? networkQuality.hashCode() : 0);
    }

    public final String toString() {
        return "TypeFeedItem(width=" + this.width + ", height=" + this.height + ", eventType=" + this.a + ", durationAsync=" + this.durationAsync + ", stateAsync=" + this.stateAsync + ", feedbackTrackCode=" + this.b + ", networkQuality=" + this.networkQuality + ')';
    }

    public /* synthetic */ SchemeStat$TypeFeedItem(int i, int i2, String str, Long l, StateAsync stateAsync, String str2, NetworkQuality networkQuality, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : l, (i3 & 16) != 0 ? null : stateAsync, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : networkQuality);
    }
}
