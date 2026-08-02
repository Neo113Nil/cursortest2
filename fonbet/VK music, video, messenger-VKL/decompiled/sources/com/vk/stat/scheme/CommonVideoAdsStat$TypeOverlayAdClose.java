package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.k73;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoAdsStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoAdsStat$TypeOverlayAdClose implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("close_reason")
    private final CloseReason closeReason;

    @pmi0("close_source")
    private final CloseSource closeSource;

    @pmi0("common_fields")
    private final Object commonFields;

    @pmi0("template_request_id")
    private final FilteredString filteredTemplateRequestId;

    @pmi0("time_since_impression")
    private final Long timeSinceImpression;

    @pmi0("view_time")
    private final Integer viewTime;

    @pmi0("was_clicked")
    private final Boolean wasClicked;

    @pmi0("was_visible")
    private final Boolean wasVisible;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class CloseReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CloseReason[] $VALUES;

        @pmi0("clicked")
        public static final CloseReason CLICKED;

        @pmi0("cross_button")
        public static final CloseReason CROSS_BUTTON;

        @pmi0("midroll_start")
        public static final CloseReason MIDROLL_START;

        @pmi0("navigation_swipe")
        public static final CloseReason NAVIGATION_SWIPE;

        @pmi0("not_interesting")
        public static final CloseReason NOT_INTERESTING;

        @pmi0("other")
        public static final CloseReason OTHER;

        @pmi0("pause_banner_shown")
        public static final CloseReason PAUSE_BANNER_SHOWN;

        @pmi0("player_controls_hide")
        public static final CloseReason PLAYER_CONTROLS_HIDE;

        @pmi0("player_mode_change")
        public static final CloseReason PLAYER_MODE_CHANGE;

        @pmi0("player_too_small")
        public static final CloseReason PLAYER_TOO_SMALL;

        @pmi0("ttl_timeout")
        public static final CloseReason TTL_TIMEOUT;

        static {
            CloseReason closeReason = new CloseReason("CROSS_BUTTON", 0);
            CROSS_BUTTON = closeReason;
            CloseReason closeReason2 = new CloseReason("NOT_INTERESTING", 1);
            NOT_INTERESTING = closeReason2;
            CloseReason closeReason3 = new CloseReason("CLICKED", 2);
            CLICKED = closeReason3;
            CloseReason closeReason4 = new CloseReason("PLAYER_CONTROLS_HIDE", 3);
            PLAYER_CONTROLS_HIDE = closeReason4;
            CloseReason closeReason5 = new CloseReason("PLAYER_MODE_CHANGE", 4);
            PLAYER_MODE_CHANGE = closeReason5;
            CloseReason closeReason6 = new CloseReason("MIDROLL_START", 5);
            MIDROLL_START = closeReason6;
            CloseReason closeReason7 = new CloseReason("PAUSE_BANNER_SHOWN", 6);
            PAUSE_BANNER_SHOWN = closeReason7;
            CloseReason closeReason8 = new CloseReason("TTL_TIMEOUT", 7);
            TTL_TIMEOUT = closeReason8;
            CloseReason closeReason9 = new CloseReason("PLAYER_TOO_SMALL", 8);
            PLAYER_TOO_SMALL = closeReason9;
            CloseReason closeReason10 = new CloseReason("NAVIGATION_SWIPE", 9);
            NAVIGATION_SWIPE = closeReason10;
            CloseReason closeReason11 = new CloseReason(NativeAdContent.ViewTag.OTHER, 10);
            OTHER = closeReason11;
            CloseReason[] closeReasonArr = {closeReason, closeReason2, closeReason3, closeReason4, closeReason5, closeReason6, closeReason7, closeReason8, closeReason9, closeReason10, closeReason11};
            $VALUES = closeReasonArr;
            $ENTRIES = new asp(closeReasonArr);
        }

        private CloseReason(String str, int i) {
        }

        public static CloseReason valueOf(String str) {
            return (CloseReason) Enum.valueOf(CloseReason.class, str);
        }

        public static CloseReason[] values() {
            return (CloseReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class CloseSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CloseSource[] $VALUES;

        @pmi0("other")
        public static final CloseSource OTHER;

        @pmi0("user")
        public static final CloseSource USER;

        static {
            CloseSource closeSource = new CloseSource("USER", 0);
            USER = closeSource;
            CloseSource closeSource2 = new CloseSource(NativeAdContent.ViewTag.OTHER, 1);
            OTHER = closeSource2;
            CloseSource[] closeSourceArr = {closeSource, closeSource2};
            $VALUES = closeSourceArr;
            $ENTRIES = new asp(closeSourceArr);
        }

        private CloseSource(String str, int i) {
        }

        public static CloseSource valueOf(String str) {
            return (CloseSource) Enum.valueOf(CloseSource.class, str);
        }

        public static CloseSource[] values() {
            return (CloseSource[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonVideoAdsStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoAdsStat$TypeOverlayAdClose>, a9y<CommonVideoAdsStat$TypeOverlayAdClose> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String C = fai.C(x9yVar, "template_request_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("close_source");
            Object obj = null;
            CloseSource closeSource = (CloseSource) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CloseSource.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("close_reason");
            CloseReason closeReason = (CloseReason) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), CloseReason.class));
            Long B = fai.B(x9yVar, "time_since_impression");
            Integer A = fai.A(x9yVar, "view_time");
            Boolean y = fai.y(x9yVar, "was_visible");
            Boolean y2 = fai.y(x9yVar, "was_clicked");
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("common_fields");
            if (q3 != null && !(q3 instanceof u9y)) {
                obj = a3.fromJson(q3.k(), (Class<Object>) Object.class);
            }
            return new CommonVideoAdsStat$TypeOverlayAdClose(C, closeSource, closeReason, B, A, y, y2, obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoAdsStat$TypeOverlayAdClose commonVideoAdsStat$TypeOverlayAdClose = (CommonVideoAdsStat$TypeOverlayAdClose) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("template_request_id", commonVideoAdsStat$TypeOverlayAdClose.a);
            x9yVar.o("close_source", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdClose.b()));
            x9yVar.o("close_reason", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdClose.a()));
            x9yVar.n("time_since_impression", commonVideoAdsStat$TypeOverlayAdClose.d());
            x9yVar.n("view_time", commonVideoAdsStat$TypeOverlayAdClose.e());
            x9yVar.m(commonVideoAdsStat$TypeOverlayAdClose.g(), "was_visible");
            x9yVar.m(commonVideoAdsStat$TypeOverlayAdClose.f(), "was_clicked");
            x9yVar.o("common_fields", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdClose.c()));
            return x9yVar;
        }
    }

    public CommonVideoAdsStat$TypeOverlayAdClose() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final CloseReason a() {
        return this.closeReason;
    }

    public final CloseSource b() {
        return this.closeSource;
    }

    public final Object c() {
        return this.commonFields;
    }

    public final Long d() {
        return this.timeSinceImpression;
    }

    public final Integer e() {
        return this.viewTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAdsStat$TypeOverlayAdClose)) {
            return false;
        }
        CommonVideoAdsStat$TypeOverlayAdClose commonVideoAdsStat$TypeOverlayAdClose = (CommonVideoAdsStat$TypeOverlayAdClose) obj;
        return epx.f(this.a, commonVideoAdsStat$TypeOverlayAdClose.a) && this.closeSource == commonVideoAdsStat$TypeOverlayAdClose.closeSource && this.closeReason == commonVideoAdsStat$TypeOverlayAdClose.closeReason && epx.f(this.timeSinceImpression, commonVideoAdsStat$TypeOverlayAdClose.timeSinceImpression) && epx.f(this.viewTime, commonVideoAdsStat$TypeOverlayAdClose.viewTime) && epx.f(this.wasVisible, commonVideoAdsStat$TypeOverlayAdClose.wasVisible) && epx.f(this.wasClicked, commonVideoAdsStat$TypeOverlayAdClose.wasClicked) && epx.f(this.commonFields, commonVideoAdsStat$TypeOverlayAdClose.commonFields);
    }

    public final Boolean f() {
        return this.wasClicked;
    }

    public final Boolean g() {
        return this.wasVisible;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CloseSource closeSource = this.closeSource;
        int hashCode2 = (hashCode + (closeSource == null ? 0 : closeSource.hashCode())) * 31;
        CloseReason closeReason = this.closeReason;
        int hashCode3 = (hashCode2 + (closeReason == null ? 0 : closeReason.hashCode())) * 31;
        Long l = this.timeSinceImpression;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.viewTime;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.wasVisible;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.wasClicked;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Object obj = this.commonFields;
        return hashCode7 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayAdClose(templateRequestId=");
        sb.append(this.a);
        sb.append(", closeSource=");
        sb.append(this.closeSource);
        sb.append(", closeReason=");
        sb.append(this.closeReason);
        sb.append(", timeSinceImpression=");
        sb.append(this.timeSinceImpression);
        sb.append(", viewTime=");
        sb.append(this.viewTime);
        sb.append(", wasVisible=");
        sb.append(this.wasVisible);
        sb.append(", wasClicked=");
        sb.append(this.wasClicked);
        sb.append(", commonFields=");
        return k73.c(sb, this.commonFields, ')');
    }

    public CommonVideoAdsStat$TypeOverlayAdClose(String str, CloseSource closeSource, CloseReason closeReason, Long l, Integer num, Boolean bool, Boolean bool2, Object obj) {
        this.a = str;
        this.closeSource = closeSource;
        this.closeReason = closeReason;
        this.timeSinceImpression = l;
        this.viewTime = num;
        this.wasVisible = bool;
        this.wasClicked = bool2;
        this.commonFields = obj;
        FilteredString filteredString = new FilteredString(lhg.b(63));
        this.filteredTemplateRequestId = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ CommonVideoAdsStat$TypeOverlayAdClose(String str, CloseSource closeSource, CloseReason closeReason, Long l, Integer num, Boolean bool, Boolean bool2, Object obj, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : closeSource, (i & 4) != 0 ? null : closeReason, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : obj);
    }
}
