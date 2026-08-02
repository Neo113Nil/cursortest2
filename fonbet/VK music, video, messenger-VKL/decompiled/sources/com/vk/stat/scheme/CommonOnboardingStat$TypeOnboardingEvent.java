package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.uqi;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonOnboardingStat.kt */
/* loaded from: classes11.dex */
public final class CommonOnboardingStat$TypeOnboardingEvent implements SchemeStat$TypeView.b, SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("duration")
    private final Integer duration;

    @pmi0("event_subtype")
    private final EventSubtype eventSubtype;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("campaign_name")
    private final FilteredString filteredCampaignName;

    @pmi0("onboarding_type")
    private final OnboardingType onboardingType;

    @pmi0("screen_number")
    private final Integer screenNumber;

    @pmi0("test_group")
    private final int testGroup;

    @pmi0("watch_time_ms")
    private final Long watchTimeMs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonOnboardingStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSubtype[] $VALUES;

        @pmi0("another_fullscreen_shown")
        public static final EventSubtype ANOTHER_FULLSCREEN_SHOWN;

        @pmi0("bad_connection")
        public static final EventSubtype BAD_CONNECTION;

        @pmi0("device_in_roaming")
        public static final EventSubtype DEVICE_IN_ROAMING;

        @pmi0("device_is_foldable")
        public static final EventSubtype DEVICE_IS_FOLDABLE;

        @pmi0("device_is_tablet")
        public static final EventSubtype DEVICE_IS_TABLET;

        @pmi0("doze_mode")
        public static final EventSubtype DOZE_MODE;

        @pmi0("first_time")
        public static final EventSubtype FIRST_TIME;

        @pmi0("incomplete_download")
        public static final EventSubtype INCOMPLETE_DOWNLOAD;

        @pmi0("low_battery")
        public static final EventSubtype LOW_BATTERY;

        @pmi0("no_connection")
        public static final EventSubtype NO_CONNECTION;

        @pmi0("open_with_external_link")
        public static final EventSubtype OPEN_WITH_EXTERNAL_LINK;

        @pmi0("power_saving_mode")
        public static final EventSubtype POWER_SAVING_MODE;

        @pmi0("show_time_not_reached")
        public static final EventSubtype SHOW_TIME_NOT_REACHED;

        @pmi0("traffic_saving_mode")
        public static final EventSubtype TRAFFIC_SAVING_MODE;

        @pmi0("ttl_expired")
        public static final EventSubtype TTL_EXPIRED;

        @pmi0("video_is_playing")
        public static final EventSubtype VIDEO_IS_PLAYING;

        static {
            EventSubtype eventSubtype = new EventSubtype("TTL_EXPIRED", 0);
            TTL_EXPIRED = eventSubtype;
            EventSubtype eventSubtype2 = new EventSubtype("INCOMPLETE_DOWNLOAD", 1);
            INCOMPLETE_DOWNLOAD = eventSubtype2;
            EventSubtype eventSubtype3 = new EventSubtype("SHOW_TIME_NOT_REACHED", 2);
            SHOW_TIME_NOT_REACHED = eventSubtype3;
            EventSubtype eventSubtype4 = new EventSubtype("OPEN_WITH_EXTERNAL_LINK", 3);
            OPEN_WITH_EXTERNAL_LINK = eventSubtype4;
            EventSubtype eventSubtype5 = new EventSubtype("ANOTHER_FULLSCREEN_SHOWN", 4);
            ANOTHER_FULLSCREEN_SHOWN = eventSubtype5;
            EventSubtype eventSubtype6 = new EventSubtype("VIDEO_IS_PLAYING", 5);
            VIDEO_IS_PLAYING = eventSubtype6;
            EventSubtype eventSubtype7 = new EventSubtype("POWER_SAVING_MODE", 6);
            POWER_SAVING_MODE = eventSubtype7;
            EventSubtype eventSubtype8 = new EventSubtype("TRAFFIC_SAVING_MODE", 7);
            TRAFFIC_SAVING_MODE = eventSubtype8;
            EventSubtype eventSubtype9 = new EventSubtype("DEVICE_IN_ROAMING", 8);
            DEVICE_IN_ROAMING = eventSubtype9;
            EventSubtype eventSubtype10 = new EventSubtype("BAD_CONNECTION", 9);
            BAD_CONNECTION = eventSubtype10;
            EventSubtype eventSubtype11 = new EventSubtype("LOW_BATTERY", 10);
            LOW_BATTERY = eventSubtype11;
            EventSubtype eventSubtype12 = new EventSubtype("DOZE_MODE", 11);
            DOZE_MODE = eventSubtype12;
            EventSubtype eventSubtype13 = new EventSubtype("NO_CONNECTION", 12);
            NO_CONNECTION = eventSubtype13;
            EventSubtype eventSubtype14 = new EventSubtype("FIRST_TIME", 13);
            FIRST_TIME = eventSubtype14;
            EventSubtype eventSubtype15 = new EventSubtype("DEVICE_IS_TABLET", 14);
            DEVICE_IS_TABLET = eventSubtype15;
            EventSubtype eventSubtype16 = new EventSubtype("DEVICE_IS_FOLDABLE", 15);
            DEVICE_IS_FOLDABLE = eventSubtype16;
            EventSubtype[] eventSubtypeArr = {eventSubtype, eventSubtype2, eventSubtype3, eventSubtype4, eventSubtype5, eventSubtype6, eventSubtype7, eventSubtype8, eventSubtype9, eventSubtype10, eventSubtype11, eventSubtype12, eventSubtype13, eventSubtype14, eventSubtype15, eventSubtype16};
            $VALUES = eventSubtypeArr;
            $ENTRIES = new asp(eventSubtypeArr);
        }

        private EventSubtype(String str, int i) {
        }

        public static EventSubtype valueOf(String str) {
            return (EventSubtype) Enum.valueOf(EventSubtype.class, str);
        }

        public static EventSubtype[] values() {
            return (EventSubtype[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonOnboardingStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click")
        public static final EventType CLICK;

        @pmi0("click_banner")
        public static final EventType CLICK_BANNER;

        @pmi0("click_cta")
        public static final EventType CLICK_CTA;

        @pmi0("click_cta_n_screen")
        public static final EventType CLICK_CTA_N_SCREEN;

        @pmi0("click_tooltip")
        public static final EventType CLICK_TOOLTIP;

        @pmi0("click_tooltip_anchor")
        public static final EventType CLICK_TOOLTIP_ANCHOR;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final EventType CLOSE;

        @pmi0("close_app")
        public static final EventType CLOSE_APP;

        @pmi0("close_auto")
        public static final EventType CLOSE_AUTO;

        @pmi0("close_click_outside")
        public static final EventType CLOSE_CLICK_OUTSIDE;

        @pmi0("close_click_outside_nonclickable")
        public static final EventType CLOSE_CLICK_OUTSIDE_NONCLICKABLE;

        @pmi0("close_exit")
        public static final EventType CLOSE_EXIT;

        @pmi0("close_n_screen")
        public static final EventType CLOSE_N_SCREEN;

        @pmi0("download_skip")
        public static final EventType DOWNLOAD_SKIP;

        @pmi0("onboarding_downloaded")
        public static final EventType ONBOARDING_DOWNLOADED;

        @pmi0("screen_blur")
        public static final EventType SCREEN_BLUR;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
        public static final EventType VIEW;

        @pmi0("view_100p")
        public static final EventType VIEW_100P;

        @pmi0("view_100p_n_screen")
        public static final EventType VIEW_100P_N_SCREEN;

        @pmi0("view_50p")
        public static final EventType VIEW_50P;

        @pmi0("view_50p_n_screen")
        public static final EventType VIEW_50P_N_SCREEN;

        @pmi0("view_all_screen")
        public static final EventType VIEW_ALL_SCREEN;

        @pmi0("view_error")
        public static final EventType VIEW_ERROR;

        @pmi0("view_n_screen")
        public static final EventType VIEW_N_SCREEN;

        @pmi0("view_skip")
        public static final EventType VIEW_SKIP;

        static {
            EventType eventType = new EventType("VIEW", 0);
            VIEW = eventType;
            EventType eventType2 = new EventType("VIEW_N_SCREEN", 1);
            VIEW_N_SCREEN = eventType2;
            EventType eventType3 = new EventType("VIEW_ALL_SCREEN", 2);
            VIEW_ALL_SCREEN = eventType3;
            EventType eventType4 = new EventType("VIEW_ERROR", 3);
            VIEW_ERROR = eventType4;
            EventType eventType5 = new EventType("VIEW_50P", 4);
            VIEW_50P = eventType5;
            EventType eventType6 = new EventType("VIEW_100P", 5);
            VIEW_100P = eventType6;
            EventType eventType7 = new EventType("VIEW_50P_N_SCREEN", 6);
            VIEW_50P_N_SCREEN = eventType7;
            EventType eventType8 = new EventType("VIEW_100P_N_SCREEN", 7);
            VIEW_100P_N_SCREEN = eventType8;
            EventType eventType9 = new EventType("CLICK", 8);
            CLICK = eventType9;
            EventType eventType10 = new EventType("CLICK_CTA", 9);
            CLICK_CTA = eventType10;
            EventType eventType11 = new EventType("CLICK_BANNER", 10);
            CLICK_BANNER = eventType11;
            EventType eventType12 = new EventType("CLICK_CTA_N_SCREEN", 11);
            CLICK_CTA_N_SCREEN = eventType12;
            EventType eventType13 = new EventType("CLICK_TOOLTIP", 12);
            CLICK_TOOLTIP = eventType13;
            EventType eventType14 = new EventType("CLICK_TOOLTIP_ANCHOR", 13);
            CLICK_TOOLTIP_ANCHOR = eventType14;
            EventType eventType15 = new EventType("CLOSE_CLICK_OUTSIDE_NONCLICKABLE", 14);
            CLOSE_CLICK_OUTSIDE_NONCLICKABLE = eventType15;
            EventType eventType16 = new EventType("CLOSE_CLICK_OUTSIDE", 15);
            CLOSE_CLICK_OUTSIDE = eventType16;
            EventType eventType17 = new EventType("CLOSE", 16);
            CLOSE = eventType17;
            EventType eventType18 = new EventType("CLOSE_EXIT", 17);
            CLOSE_EXIT = eventType18;
            EventType eventType19 = new EventType("CLOSE_AUTO", 18);
            CLOSE_AUTO = eventType19;
            EventType eventType20 = new EventType("CLOSE_N_SCREEN", 19);
            CLOSE_N_SCREEN = eventType20;
            EventType eventType21 = new EventType("VIEW_SKIP", 20);
            VIEW_SKIP = eventType21;
            EventType eventType22 = new EventType("SCREEN_BLUR", 21);
            SCREEN_BLUR = eventType22;
            EventType eventType23 = new EventType("CLOSE_APP", 22);
            CLOSE_APP = eventType23;
            EventType eventType24 = new EventType("ONBOARDING_DOWNLOADED", 23);
            ONBOARDING_DOWNLOADED = eventType24;
            EventType eventType25 = new EventType("DOWNLOAD_SKIP", 24);
            DOWNLOAD_SKIP = eventType25;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonOnboardingStat.kt */
    /* loaded from: classes5.dex */
    public static final class OnboardingType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnboardingType[] $VALUES;

        @pmi0("animation")
        public static final OnboardingType ANIMATION;

        @pmi0("banner")
        public static final OnboardingType BANNER;

        @pmi0("banner_custom")
        public static final OnboardingType BANNER_CUSTOM;

        @pmi0("block")
        public static final OnboardingType BLOCK;

        @pmi0("fullscreen")
        public static final OnboardingType FULLSCREEN;

        @pmi0("highlighter")
        public static final OnboardingType HIGHLIGHTER;

        @pmi0("toast")
        public static final OnboardingType TOAST;

        @pmi0("tooltip")
        public static final OnboardingType TOOLTIP;

        static {
            OnboardingType onboardingType = new OnboardingType("BANNER", 0);
            BANNER = onboardingType;
            OnboardingType onboardingType2 = new OnboardingType("BANNER_CUSTOM", 1);
            BANNER_CUSTOM = onboardingType2;
            OnboardingType onboardingType3 = new OnboardingType("BLOCK", 2);
            BLOCK = onboardingType3;
            OnboardingType onboardingType4 = new OnboardingType("TOOLTIP", 3);
            TOOLTIP = onboardingType4;
            OnboardingType onboardingType5 = new OnboardingType("FULLSCREEN", 4);
            FULLSCREEN = onboardingType5;
            OnboardingType onboardingType6 = new OnboardingType("TOAST", 5);
            TOAST = onboardingType6;
            OnboardingType onboardingType7 = new OnboardingType("ANIMATION", 6);
            ANIMATION = onboardingType7;
            OnboardingType onboardingType8 = new OnboardingType("HIGHLIGHTER", 7);
            HIGHLIGHTER = onboardingType8;
            OnboardingType[] onboardingTypeArr = {onboardingType, onboardingType2, onboardingType3, onboardingType4, onboardingType5, onboardingType6, onboardingType7, onboardingType8};
            $VALUES = onboardingTypeArr;
            $ENTRIES = new asp(onboardingTypeArr);
        }

        private OnboardingType(String str, int i) {
        }

        public static OnboardingType valueOf(String str) {
            return (OnboardingType) Enum.valueOf(OnboardingType.class, str);
        }

        public static OnboardingType[] values() {
            return (OnboardingType[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonOnboardingStat.kt */
    public static final class PersistenceSerializer implements uay<CommonOnboardingStat$TypeOnboardingEvent>, a9y<CommonOnboardingStat$TypeOnboardingEvent> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            OnboardingType onboardingType = (OnboardingType) dq.f(x9yVar, "onboarding_type", tru.a(), OnboardingType.class);
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            String s = fai.s(x9yVar, "campaign_name");
            int p = fai.p(x9yVar, "test_group");
            Gson a = tru.a();
            b9y q = x9yVar.q("event_subtype");
            return new CommonOnboardingStat$TypeOnboardingEvent(onboardingType, eventType, s, p, (EventSubtype) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), EventSubtype.class)), fai.A(x9yVar, "duration"), fai.B(x9yVar, "watch_time_ms"), fai.A(x9yVar, "screen_number"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent = (CommonOnboardingStat$TypeOnboardingEvent) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("onboarding_type", tru.a().toJson(commonOnboardingStat$TypeOnboardingEvent.d()));
            x9yVar.o("event_type", tru.a().toJson(commonOnboardingStat$TypeOnboardingEvent.c()));
            x9yVar.o("campaign_name", commonOnboardingStat$TypeOnboardingEvent.a);
            x9yVar.n("test_group", Integer.valueOf(commonOnboardingStat$TypeOnboardingEvent.f()));
            x9yVar.o("event_subtype", tru.a().toJson(commonOnboardingStat$TypeOnboardingEvent.b()));
            x9yVar.n("duration", commonOnboardingStat$TypeOnboardingEvent.a());
            x9yVar.n("watch_time_ms", commonOnboardingStat$TypeOnboardingEvent.g());
            x9yVar.n("screen_number", commonOnboardingStat$TypeOnboardingEvent.e());
            return x9yVar;
        }
    }

    public CommonOnboardingStat$TypeOnboardingEvent(OnboardingType onboardingType, EventType eventType, String str, int i, EventSubtype eventSubtype, Integer num, Long l, Integer num2) {
        this.onboardingType = onboardingType;
        this.eventType = eventType;
        this.a = str;
        this.testGroup = i;
        this.eventSubtype = eventSubtype;
        this.duration = num;
        this.watchTimeMs = l;
        this.screenNumber = num2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredCampaignName = filteredString;
        filteredString.a(str);
    }

    public final Integer a() {
        return this.duration;
    }

    public final EventSubtype b() {
        return this.eventSubtype;
    }

    public final EventType c() {
        return this.eventType;
    }

    public final OnboardingType d() {
        return this.onboardingType;
    }

    public final Integer e() {
        return this.screenNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonOnboardingStat$TypeOnboardingEvent)) {
            return false;
        }
        CommonOnboardingStat$TypeOnboardingEvent commonOnboardingStat$TypeOnboardingEvent = (CommonOnboardingStat$TypeOnboardingEvent) obj;
        return this.onboardingType == commonOnboardingStat$TypeOnboardingEvent.onboardingType && this.eventType == commonOnboardingStat$TypeOnboardingEvent.eventType && epx.f(this.a, commonOnboardingStat$TypeOnboardingEvent.a) && this.testGroup == commonOnboardingStat$TypeOnboardingEvent.testGroup && this.eventSubtype == commonOnboardingStat$TypeOnboardingEvent.eventSubtype && epx.f(this.duration, commonOnboardingStat$TypeOnboardingEvent.duration) && epx.f(this.watchTimeMs, commonOnboardingStat$TypeOnboardingEvent.watchTimeMs) && epx.f(this.screenNumber, commonOnboardingStat$TypeOnboardingEvent.screenNumber);
    }

    public final int f() {
        return this.testGroup;
    }

    public final Long g() {
        return this.watchTimeMs;
    }

    public final int hashCode() {
        int a = shy.a(this.testGroup, urd0.a((this.eventType.hashCode() + (this.onboardingType.hashCode() * 31)) * 31, 31, this.a), 31);
        EventSubtype eventSubtype = this.eventSubtype;
        int hashCode = (a + (eventSubtype == null ? 0 : eventSubtype.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.watchTimeMs;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.screenNumber;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOnboardingEvent(onboardingType=");
        sb.append(this.onboardingType);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", campaignName=");
        sb.append(this.a);
        sb.append(", testGroup=");
        sb.append(this.testGroup);
        sb.append(", eventSubtype=");
        sb.append(this.eventSubtype);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", watchTimeMs=");
        sb.append(this.watchTimeMs);
        sb.append(", screenNumber=");
        return uqi.b(sb, this.screenNumber, ')');
    }

    public /* synthetic */ CommonOnboardingStat$TypeOnboardingEvent(OnboardingType onboardingType, EventType eventType, String str, int i, EventSubtype eventSubtype, Integer num, Long l, Integer num2, int i2, zcl zclVar) {
        this(onboardingType, eventType, str, i, (i2 & 16) != 0 ? null : eventSubtype, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : l, (i2 & 128) != 0 ? null : num2);
    }
}
