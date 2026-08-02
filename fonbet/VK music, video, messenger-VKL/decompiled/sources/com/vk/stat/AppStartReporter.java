package com.vk.stat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.bridges.CompanionApp;
import com.vk.core.apps.BuildInfo;
import com.vk.core.performance.device.DevicePerformanceInfo;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.preference.Preference;
import com.vk.metrics.performance.animation.motionlayout.MotionLayoutScreenType;
import com.vk.metrics.performance.exception.EmptyScreenException;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.stat.AppStartReporter;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.vk.oneevent.AppStartsEventDeviceAdsIdType;
import ru.vk.oneevent.AppStartsEventPreferredSystemContentSize;
import ru.vk.oneevent.AppStartsEventStartMethod;
import ru.vk.oneevent.AppStartsEventStartType;
import ru.vk.oneevent.AppStartsEventStoreRegion;
import ru.vk.oneevent.AppStartsEventSystemTheme;
import xsna.asp;
import xsna.asu0;
import xsna.dx90;
import xsna.e93;
import xsna.epx;
import xsna.f93;
import xsna.h93;
import xsna.hwg0;
import xsna.i93;
import xsna.j6i;
import xsna.k93;
import xsna.kwg0;
import xsna.ky6;
import xsna.l93;
import xsna.m93;
import xsna.zrp;

/* compiled from: AppStartReporter.kt */
/* loaded from: classes11.dex */
public final class AppStartReporter {
    public static boolean a;
    public static final m93 b = new m93();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppStartReporter.kt */
    public static final class StartMethod {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StartMethod[] $VALUES;
        public static final StartMethod COMPANION;
        public static final StartMethod DEEPLINK;
        public static final StartMethod PUSH;
        public static final StartMethod SHARING;
        public static final StartMethod SPRINGBOARD;
        private String payload;
        private final SchemeStat$TypeAppStarts.StartMethod value;

        static {
            StartMethod startMethod = new StartMethod("SPRINGBOARD", 0, SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD);
            SPRINGBOARD = startMethod;
            StartMethod startMethod2 = new StartMethod("PUSH", 1, SchemeStat$TypeAppStarts.StartMethod.PUSH);
            PUSH = startMethod2;
            StartMethod startMethod3 = new StartMethod("COMPANION", 2, SchemeStat$TypeAppStarts.StartMethod.COMPANION);
            COMPANION = startMethod3;
            StartMethod startMethod4 = new StartMethod("DEEPLINK", 3, SchemeStat$TypeAppStarts.StartMethod.DEEPLINK);
            DEEPLINK = startMethod4;
            StartMethod startMethod5 = new StartMethod("SHARING", 4, SchemeStat$TypeAppStarts.StartMethod.SHARING);
            SHARING = startMethod5;
            StartMethod[] startMethodArr = {startMethod, startMethod2, startMethod3, startMethod4, startMethod5};
            $VALUES = startMethodArr;
            $ENTRIES = new asp(startMethodArr);
        }

        public StartMethod() {
            throw null;
        }

        public StartMethod(String str, int i, SchemeStat$TypeAppStarts.StartMethod startMethod) {
            this.value = startMethod;
            this.payload = "";
        }

        public static StartMethod valueOf(String str) {
            return (StartMethod) Enum.valueOf(StartMethod.class, str);
        }

        public static StartMethod[] values() {
            return (StartMethod[]) $VALUES.clone();
        }

        public final String h() {
            return this.payload;
        }

        public final SchemeStat$TypeAppStarts.StartMethod i() {
            return this.value;
        }

        public final void j(String str) {
            this.payload = str;
        }
    }

    /* compiled from: AppStartReporter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[SchemeStat$TypeAppStarts.StartMethod.values().length];
            try {
                iArr[SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SchemeStat$TypeAppStarts.StartMethod.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SchemeStat$TypeAppStarts.StartMethod.COMPANION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SchemeStat$TypeAppStarts.StartMethod.DEEPLINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SchemeStat$TypeAppStarts.StartMethod.SHARING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SchemeStat$TypeAppStarts.StartType.values().length];
            try {
                iArr2[SchemeStat$TypeAppStarts.StartType.COLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SchemeStat$TypeAppStarts.StartType.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SchemeStat$TypeAppStarts.SystemTheme.values().length];
            try {
                iArr3[SchemeStat$TypeAppStarts.SystemTheme.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SchemeStat$TypeAppStarts.SystemTheme.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[SchemeStat$TypeAppStarts.PreferredSystemContentSize.values().length];
            try {
                iArr4[SchemeStat$TypeAppStarts.PreferredSystemContentSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[SchemeStat$TypeAppStarts.PreferredSystemContentSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[SchemeStat$TypeAppStarts.PreferredSystemContentSize.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[SchemeStat$TypeAppStarts.PreferredSystemContentSize.HUGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[SchemeStat$TypeAppStarts.StoreRegion.values().length];
            try {
                iArr5[SchemeStat$TypeAppStarts.StoreRegion.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[SchemeStat$TypeAppStarts.StoreRegion.RU.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[SchemeStat$TypeAppStarts.StoreRegion.BY.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[SchemeStat$TypeAppStarts.StoreRegion.KZ.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[SchemeStat$TypeAppStarts.DeviceAdsIdType.values().length];
            try {
                iArr6[SchemeStat$TypeAppStarts.DeviceAdsIdType.IDFA.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[SchemeStat$TypeAppStarts.DeviceAdsIdType.GAID.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[SchemeStat$TypeAppStarts.DeviceAdsIdType.OAID.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public static k93 a() {
        ky6 j = Preference.j();
        return new k93(j.getLong("__app_start_internal_storage_size__", 0L), j.getLong("__app_start_external_storage_size__", 0L), j.getLong("__app_start_video_downloads_size__", 0L), j.getLong("__app_start_offline_music_internal_size__", 0L), j.getLong("__app_start_offline_music_external_size__", 0L));
    }

    public static final void b(Intent intent, AppCompatActivity appCompatActivity, l93 l93Var, boolean z) {
        StartMethod startMethod = StartMethod.SPRINGBOARD;
        String stringExtra = intent.getStringExtra("__source_package_name_");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Collection<CompanionApp> values = j6i.a().f().values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CompanionApp companionApp = (CompanionApp) it.next();
                if (!epx.f(companionApp, j6i.a().e()) && epx.f(companionApp.getPackageName(), stringExtra)) {
                    startMethod = StartMethod.COMPANION;
                    startMethod.j(stringExtra);
                    break;
                }
            }
        }
        c(startMethod, false, appCompatActivity, l93Var, z);
    }

    public static final void c(final StartMethod startMethod, boolean z, final AppCompatActivity appCompatActivity, final l93 l93Var, final boolean z2) {
        SchemeStat$TypeAppStarts.StartType startType = z ? SchemeStat$TypeAppStarts.StartType.DAILY : SchemeStat$TypeAppStarts.StartType.COLD;
        TimeUnit timeUnit = z2 ? TimeUnit.SECONDS : TimeUnit.HOURS;
        if (!a || z) {
            a = true;
            l2 r0 = new s0(new Callable() { // from class: xsna.d93
                /* JADX WARN: Code restructure failed: missing block: B:166:0x0740, code lost:
                
                    if (r2.a(r0) != false) goto L226;
                 */
                /* JADX WARN: Removed duplicated region for block: B:102:0x036c  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0385  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x039e  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x03b7  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x03d0  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x03e9  */
                /* JADX WARN: Removed duplicated region for block: B:132:0x0402  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x041b  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x0434  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0461  */
                /* JADX WARN: Removed duplicated region for block: B:150:0x047d  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x058f  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x0715 A[LOOP:0: B:159:0x070f->B:161:0x0715, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0737  */
                /* JADX WARN: Removed duplicated region for block: B:169:0x09c7  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x0cb9 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:175:0x0d62  */
                /* JADX WARN: Removed duplicated region for block: B:178:0x0d73  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x09cb  */
                /* JADX WARN: Removed duplicated region for block: B:277:0x0750  */
                /* JADX WARN: Removed duplicated region for block: B:387:0x05a9  */
                /* JADX WARN: Removed duplicated region for block: B:389:0x0444  */
                /* JADX WARN: Removed duplicated region for block: B:391:0x0427  */
                /* JADX WARN: Removed duplicated region for block: B:393:0x040e  */
                /* JADX WARN: Removed duplicated region for block: B:395:0x03f5  */
                /* JADX WARN: Removed duplicated region for block: B:397:0x03dc  */
                /* JADX WARN: Removed duplicated region for block: B:399:0x03c3  */
                /* JADX WARN: Removed duplicated region for block: B:401:0x03aa  */
                /* JADX WARN: Removed duplicated region for block: B:403:0x0391  */
                /* JADX WARN: Removed duplicated region for block: B:405:0x0378  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    Long l;
                    Long l2;
                    dx90.a aVar;
                    dx90.c cVar;
                    boolean z3;
                    boolean z4;
                    boolean d;
                    String c;
                    String str;
                    String c2;
                    String str2;
                    String c3;
                    String str3;
                    String c4;
                    String str4;
                    String c5;
                    String str5;
                    String c6;
                    String str6;
                    String c7;
                    String str7;
                    String c8;
                    String str8;
                    String c9;
                    String str9;
                    long b2;
                    Long l3;
                    Object obj;
                    Object obj2;
                    int i;
                    AppStartReporter.StartMethod startMethod2;
                    Iterator it;
                    CoreFeatures coreFeatures;
                    com.vk.toggle.b bVar;
                    AppStartsEventStartType appStartsEventStartType;
                    AppStartsEventStartMethod appStartsEventStartMethod;
                    AppStartsEventDeviceAdsIdType appStartsEventDeviceAdsIdType;
                    AppStartsEventSystemTheme appStartsEventSystemTheme;
                    AppStartsEventPreferredSystemContentSize appStartsEventPreferredSystemContentSize;
                    AppStartsEventStoreRegion appStartsEventStoreRegion;
                    AppStartsEventStoreRegion appStartsEventStoreRegion2;
                    AppStartsEventPreferredSystemContentSize appStartsEventPreferredSystemContentSize2;
                    AppStartsEventSystemTheme appStartsEventSystemTheme2;
                    AppStartsEventDeviceAdsIdType appStartsEventDeviceAdsIdType2;
                    AppStartsEventStartMethod appStartsEventStartMethod2;
                    AppStartsEventStartType appStartsEventStartType2;
                    int i2;
                    AggregateEventBuilder aggregateEventBuilder;
                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts;
                    DevicePerformanceInfo.Class r2;
                    Integer num;
                    Integer num2;
                    Boolean t;
                    Boolean bool;
                    String e;
                    AppCompatActivity appCompatActivity2 = AppCompatActivity.this;
                    l93 l93Var2 = l93Var;
                    boolean z5 = AppStartReporter.a;
                    dx90 dx90Var = ow90.e;
                    dx90Var.getClass();
                    long b3 = dx90.b("__app_performance_loading_time__");
                    Long valueOf = b3 > 0 ? Long.valueOf(b3) : null;
                    long b4 = dx90.b("__app_performance_init_time__");
                    Long valueOf2 = b4 > 0 ? Long.valueOf(b4) : null;
                    if (valueOf == null || valueOf2 == null || valueOf2.longValue() - valueOf.longValue() >= 0) {
                        l = valueOf;
                        l2 = valueOf2;
                    } else {
                        if (ow90.d) {
                            throw new IllegalStateException("performance reporter: initTime=null less then loadingTime=null\"");
                        }
                        l = null;
                        l2 = null;
                    }
                    long b5 = dx90.b("__app_performance_content_providers_time__");
                    Long valueOf3 = b5 > 0 ? Long.valueOf(b5) : null;
                    Long d2 = dx90.d("__app_performance_first_screen_time__");
                    Long d3 = dx90.d("__app_performance_first_frame_time__");
                    Long d4 = dx90.d("__app_performance_first_screen_data_loading_start_time__");
                    Long d5 = dx90.d("__app_performance_first_screen_data_loaded_time__");
                    Long d6 = dx90.d("__app_performance_first_screen_data_loaded_from_cache_time__");
                    Long d7 = dx90.d("__app_performance_first_screen_content_appeared_time__");
                    Long d8 = dx90.d("__app_performance_on_menu_loaded_time__");
                    Long d9 = dx90.d("__app_performance_first_screen_content_appeared_from_cache_time__");
                    Long d10 = dx90.d("__app_performance_first_longpoll_end_connection__");
                    Long d11 = dx90.d("__app_performance_first_longpoll_connection__");
                    Long d12 = dx90.d("__app_performance_first_longpoll_open__");
                    Long d13 = dx90.d("__app_performance_toggles_init_time__");
                    Long d14 = dx90.d("__app_performance_main_activity_created_time__");
                    Long d15 = dx90.d("__app_performance_main_activity_on_resume_time__");
                    Long d16 = dx90.d("__app_performance_home_fragment_created_time__");
                    Long d17 = dx90.d("__app_performance_newsfeed_fragment_on_create_time__");
                    long b6 = dx90.b("__system_bind_app_performance_init_time__");
                    Integer valueOf4 = b6 > 0 ? Integer.valueOf((int) b6) : null;
                    long b7 = dx90.b("__system_prefork_performance_init_time__");
                    Integer valueOf5 = b7 > 0 ? Integer.valueOf((int) b7) : null;
                    long b8 = dx90.b("__app_performance_cold_feed_time__");
                    jw90 jw90Var = new jw90(l, l2, valueOf3, d14, d15, d16, d4, d5, d6, d7, d8, d9, d2, d3, d10, d12, d11, d17, d13, valueOf4, valueOf5, b8 > 0 ? Integer.valueOf((int) b8) : null, dx90.d("__app_performance_average_bandwidth_bytes_per_second"), dx90.d("__app_performance_app_complete_data_loading_start_time"), dx90.d("__app_performance_app_complete_data_loading_end_time"));
                    ScrollScreenType scrollScreenType = ScrollScreenType.FEED;
                    Integer m = dx90.m(dx90Var, scrollScreenType);
                    ScrollScreenType scrollScreenType2 = ScrollScreenType.SUPERAPP_FEED;
                    Integer m2 = dx90.m(dx90Var, scrollScreenType2);
                    ScrollScreenType scrollScreenType3 = ScrollScreenType.DISCOVER;
                    Integer m3 = dx90.m(dx90Var, scrollScreenType3);
                    ScrollScreenType scrollScreenType4 = ScrollScreenType.DIALOGS;
                    Integer m4 = dx90.m(dx90Var, scrollScreenType4);
                    ScrollScreenType scrollScreenType5 = ScrollScreenType.DIALOG;
                    Integer m5 = dx90.m(dx90Var, scrollScreenType5);
                    ScrollScreenType scrollScreenType6 = ScrollScreenType.FRIENDS;
                    Integer m6 = dx90.m(dx90Var, scrollScreenType6);
                    ScrollScreenType scrollScreenType7 = ScrollScreenType.FEED_VIDEO;
                    Integer m7 = dx90.m(dx90Var, scrollScreenType7);
                    Integer i3 = dx90.i(scrollScreenType);
                    ScrollScreenType scrollScreenType8 = ScrollScreenType.CLIPS_FEED;
                    Integer i4 = dx90.i(scrollScreenType8);
                    ScrollScreenType scrollScreenType9 = ScrollScreenType.CLIPS_EDITOR;
                    Integer i5 = dx90.i(scrollScreenType9);
                    ScrollScreenType scrollScreenType10 = ScrollScreenType.MARKET_ITEM;
                    Integer m8 = dx90.m(dx90Var, scrollScreenType10);
                    ScrollScreenType scrollScreenType11 = ScrollScreenType.MARKETPLACE_MAIN;
                    Integer m9 = dx90.m(dx90Var, scrollScreenType11);
                    ScrollScreenType scrollScreenType12 = ScrollScreenType.NOTIFICATIONS;
                    Integer i6 = dx90.i(scrollScreenType12);
                    ScrollScreenType scrollScreenType13 = ScrollScreenType.MARKET_STOREFRONT;
                    Integer i7 = dx90.i(scrollScreenType13);
                    ScrollScreenType scrollScreenType14 = ScrollScreenType.MARKET_CART;
                    Integer i8 = dx90.i(scrollScreenType14);
                    MotionLayoutScreenType motionLayoutScreenType = MotionLayoutScreenType.VIDEO_DISCOVERY;
                    Integer g = dx90.g(motionLayoutScreenType);
                    ScrollScreenType scrollScreenType15 = ScrollScreenType.VIDEO_LIBRARY;
                    Integer m10 = dx90.m(dx90Var, scrollScreenType15);
                    ScrollScreenType scrollScreenType16 = ScrollScreenType.VK_VIDEO_CHANNEL;
                    Integer m11 = dx90.m(dx90Var, scrollScreenType16);
                    ScrollScreenType scrollScreenType17 = ScrollScreenType.VK_VIDEO_PLAYLIST;
                    lw90 lw90Var = new lw90(m, m2, m3, m4, m5, m6, m7, i3, i4, i5, m8, m9, i7, i6, i8, g, m10, m11, dx90.m(dx90Var, scrollScreenType17));
                    long b9 = dx90.b("__acs_cold_start_time__");
                    Integer valueOf6 = b9 > 0 ? Integer.valueOf((int) b9) : null;
                    long b10 = dx90.b("__acs_cold_feed_time__");
                    Integer valueOf7 = b10 > 0 ? Integer.valueOf((int) b10) : null;
                    long b11 = dx90.b("__acs_cold_inflate_time__");
                    Integer valueOf8 = b11 > 0 ? Integer.valueOf((int) b11) : null;
                    long b12 = dx90.b("__acs_cold_content_providers_time__");
                    iw90 iw90Var = new iw90(valueOf6, valueOf7, valueOf8, b12 > 0 ? Integer.valueOf((int) b12) : null);
                    if (dx90Var.p()) {
                        Preference.a.getClass();
                        Context context = Preference.b;
                        if (context == null) {
                            context = null;
                        }
                        aVar = (dx90.a) dx90.q(context, "performance_anr_info", new bx90(0));
                    } else {
                        aVar = null;
                    }
                    int i9 = 1;
                    if (dx90Var.p()) {
                        Preference.a.getClass();
                        Context context2 = Preference.b;
                        if (context2 == null) {
                            context2 = null;
                        }
                        cVar = (dx90.c) dx90.q(context2, "performance_crash_info", new epy(i9));
                    } else {
                        cVar = null;
                    }
                    if (cVar != null && (e = cVar.e()) != null && e.length() == 0) {
                        com.vk.metrics.eventtracking.b.a.a(new EmptyScreenException());
                    }
                    long b13 = dx90.b("__app_performance_ram_memory_average__");
                    Integer valueOf9 = b13 > 0 ? Integer.valueOf((int) b13) : null;
                    long b14 = dx90.b("__app_performance_ram_memory_average_background__");
                    Integer valueOf10 = b14 > 0 ? Integer.valueOf((int) b14) : null;
                    long b15 = dx90.b("__app_performance_ram_memory_average_foreground__");
                    Integer valueOf11 = b15 > 0 ? Integer.valueOf((int) b15) : null;
                    long b16 = dx90.b("__app_performance_ram_memory_max__");
                    Integer valueOf12 = b16 > 0 ? Integer.valueOf((int) b16) : null;
                    long m12 = Preference.m(-1L, "performance", "__app_performance_net_usage_start__");
                    Long valueOf13 = m12 != -1 ? Long.valueOf(m12) : null;
                    long m13 = Preference.m(-1L, "performance", "__app_performance_net_usage__");
                    Long valueOf14 = m13 != -1 ? Long.valueOf(m13) : null;
                    long m14 = Preference.m(-1L, "performance", "__app_performance_net_background_traffic__");
                    Long valueOf15 = m14 != -1 ? Long.valueOf(m14) : null;
                    int m15 = (int) Preference.m(-1L, "performance", "__app_performance_net_load_api_count__");
                    Integer valueOf16 = m15 != -1 ? Integer.valueOf(m15) : null;
                    dx90.c cVar2 = cVar;
                    int m16 = (int) Preference.m(-1L, "performance", "__app_performance_net_errors_count__");
                    Integer valueOf17 = m16 != -1 ? Integer.valueOf(m16) : null;
                    int m17 = (int) Preference.m(-1L, "performance", "__app_performance_net_4xx_errors_count__");
                    Integer valueOf18 = m17 != -1 ? Integer.valueOf(m17) : null;
                    if (dx90Var.p()) {
                        z3 = false;
                        z4 = aVar != null;
                    } else {
                        z3 = false;
                        boolean d18 = Preference.d("performance", "__app_performance_has_anr__", false);
                        Preference.C("performance", "__app_performance_has_anr__");
                        z4 = d18;
                    }
                    if (dx90Var.p()) {
                        d = cVar2 != null ? true : z3;
                    } else {
                        d = Preference.d("performance", "__app_performance_was_crashed__", z3);
                        Preference.C("performance", "__app_performance_was_crashed__");
                    }
                    if (!dx90Var.p()) {
                        c = dx90.c("__app_performance_anr_id__");
                    } else {
                        if (aVar == null) {
                            str = null;
                            if (dx90Var.p()) {
                                c2 = dx90.c("__app_performance_anr_screnn__");
                            } else {
                                if (aVar == null) {
                                    str2 = null;
                                    if (!dx90Var.p()) {
                                        c3 = dx90.c("__app_performance_anr_importance__");
                                    } else {
                                        if (aVar == null) {
                                            str3 = null;
                                            if (dx90Var.p()) {
                                                c4 = dx90.c("__app_performance_crash_id__");
                                            } else {
                                                if (cVar2 == null) {
                                                    str4 = null;
                                                    if (!dx90Var.p()) {
                                                        c5 = dx90.c("__app_performance_crash_stacktrace_hash__");
                                                    } else {
                                                        if (cVar2 == null) {
                                                            str5 = null;
                                                            if (dx90Var.p()) {
                                                                c6 = dx90.c("__app_performance_crash_screen__");
                                                            } else {
                                                                if (cVar2 == null) {
                                                                    str6 = null;
                                                                    if (!dx90Var.p()) {
                                                                        c7 = dx90.c("__app_performance_crash_class__");
                                                                    } else {
                                                                        if (cVar2 == null) {
                                                                            str7 = null;
                                                                            if (dx90Var.p()) {
                                                                                c8 = dx90.c("__app_performance_crash_thread__");
                                                                            } else {
                                                                                if (cVar2 == null) {
                                                                                    str8 = null;
                                                                                    if (!dx90Var.p()) {
                                                                                        c9 = dx90.c("__app_performance_crash_codeowner__");
                                                                                    } else {
                                                                                        if (cVar2 == null) {
                                                                                            str9 = null;
                                                                                            if (dx90Var.p()) {
                                                                                                b2 = dx90.b("__app_performance_crash_codeowner_extraction_time__");
                                                                                            } else {
                                                                                                if (cVar2 == null) {
                                                                                                    l3 = null;
                                                                                                    Object obj3 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                                                                                    Preference preference = Preference.a;
                                                                                                    preference.getClass();
                                                                                                    obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                                                                                    if (obj != null) {
                                                                                                        obj3 = obj;
                                                                                                    }
                                                                                                    SchemeStat$TypeAppStarts.StartMethod startMethod3 = (SchemeStat$TypeAppStarts.StartMethod) obj3;
                                                                                                    Preference.C("performance", "__app_performance_start_method__");
                                                                                                    Object obj4 = SchemeStat$TypeAppStarts.StartType.COLD;
                                                                                                    preference.getClass();
                                                                                                    obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                                                                                    if (obj2 != null) {
                                                                                                        obj4 = obj2;
                                                                                                    }
                                                                                                    SchemeStat$TypeAppStarts.StartType startType2 = (SchemeStat$TypeAppStarts.StartType) obj4;
                                                                                                    Preference.C("performance", "__app_performance_start_type__");
                                                                                                    String s = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                                                                                    Preference.C("performance", "__app_performance_start_method_payload__");
                                                                                                    boolean d19 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                                                                                    Preference.C("performance", "__app_performance_early_anr_last_session__");
                                                                                                    kw90 kw90Var = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod3, startType2, s, d19, iw90Var);
                                                                                                    dx90Var.O = true;
                                                                                                    dx90Var.r();
                                                                                                    String a2 = l93Var2.a();
                                                                                                    k93 a3 = AppStartReporter.a();
                                                                                                    dx90.l(scrollScreenType, true);
                                                                                                    dx90.l(scrollScreenType2, true);
                                                                                                    dx90.l(scrollScreenType3, true);
                                                                                                    dx90.l(scrollScreenType4, true);
                                                                                                    dx90.l(scrollScreenType5, true);
                                                                                                    dx90.l(scrollScreenType6, true);
                                                                                                    dx90.l(scrollScreenType7, true);
                                                                                                    dx90.i(scrollScreenType);
                                                                                                    dx90.i(scrollScreenType8);
                                                                                                    dx90.i(scrollScreenType9);
                                                                                                    dx90.l(scrollScreenType10, true);
                                                                                                    dx90.l(scrollScreenType11, true);
                                                                                                    dx90.i(scrollScreenType12);
                                                                                                    dx90.i(scrollScreenType13);
                                                                                                    dx90.i(scrollScreenType14);
                                                                                                    dx90.g(motionLayoutScreenType);
                                                                                                    dx90.l(scrollScreenType15, true);
                                                                                                    dx90.l(scrollScreenType16, true);
                                                                                                    dx90.l(scrollScreenType17, true);
                                                                                                    Pair pair = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                                                                                    long longValue = ((Number) pair.d()).longValue();
                                                                                                    long longValue2 = ((Number) pair.g()).longValue();
                                                                                                    xuo0.a.getClass();
                                                                                                    long a4 = xuo0.a();
                                                                                                    long j = Preference.j().getLong("__app_start_last_time__", 0L);
                                                                                                    ky6.a aVar2 = (ky6.a) Preference.j().edit();
                                                                                                    aVar2.putLong("__app_start_last_time__", a4);
                                                                                                    aVar2.apply();
                                                                                                    Pair pair2 = new Pair(Long.valueOf(a4), Long.valueOf(j));
                                                                                                    long longValue3 = ((Number) pair2.d()).longValue();
                                                                                                    long longValue4 = ((Number) pair2.g()).longValue();
                                                                                                    uj9 uj9Var = new uj9(longValue, longValue2);
                                                                                                    int[] iArr = AppStartReporter.a.$EnumSwitchMapping$0;
                                                                                                    i = iArr[startMethod3.ordinal()];
                                                                                                    if (i == 1) {
                                                                                                        startMethod2 = AppStartReporter.StartMethod.SPRINGBOARD;
                                                                                                    } else if (i == 2) {
                                                                                                        startMethod2 = AppStartReporter.StartMethod.PUSH;
                                                                                                    } else if (i == 3) {
                                                                                                        startMethod2 = AppStartReporter.StartMethod.COMPANION;
                                                                                                    } else if (i == 4) {
                                                                                                        startMethod2 = AppStartReporter.StartMethod.DEEPLINK;
                                                                                                    } else {
                                                                                                        if (i != 5) {
                                                                                                            throw new NoWhenBranchMatchedException();
                                                                                                        }
                                                                                                        startMethod2 = AppStartReporter.StartMethod.SHARING;
                                                                                                    }
                                                                                                    startMethod2.j(s);
                                                                                                    List u0 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var, l93Var2), new ch9(uj9Var), new t220(a3, kw90Var), new hy90(appCompatActivity2), new gmr(kw90Var.e), new tgs(kw90Var.f), new zpn0(), new w33(kw90Var, l93Var2), new upk0(new kqk0(startMethod2, startType2, longValue3, longValue4)), new x83()});
                                                                                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts2 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                                                                                    it = u0.iterator();
                                                                                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts3 = schemeStat$TypeAppStarts2;
                                                                                                    while (it.hasNext()) {
                                                                                                        schemeStat$TypeAppStarts3 = ((dyp) it.next()).a(schemeStat$TypeAppStarts3);
                                                                                                    }
                                                                                                    kx6 kx6Var = new kx6();
                                                                                                    kx6Var.f = schemeStat$TypeAppStarts3;
                                                                                                    kx6Var.q();
                                                                                                    coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                                                                                    coreFeatures.getClass();
                                                                                                    bVar = com.vk.toggle.b.A;
                                                                                                    if (!bVar.a(coreFeatures)) {
                                                                                                        VideoFeatures videoFeatures = VideoFeatures.ONE_EVENT_TEST;
                                                                                                        videoFeatures.getClass();
                                                                                                    }
                                                                                                    if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                                                                                        String m0 = schemeStat$TypeAppStarts3.m0();
                                                                                                        SchemeStat$TypeAppStarts.StartType n0 = schemeStat$TypeAppStarts3.n0();
                                                                                                        if (n0 != null) {
                                                                                                            int i10 = AppStartReporter.a.$EnumSwitchMapping$1[n0.ordinal()];
                                                                                                            if (i10 == 1) {
                                                                                                                appStartsEventStartType2 = AppStartsEventStartType.COLD;
                                                                                                            } else {
                                                                                                                if (i10 != 2) {
                                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                                }
                                                                                                                appStartsEventStartType2 = AppStartsEventStartType.DAILY;
                                                                                                            }
                                                                                                            appStartsEventStartType = appStartsEventStartType2;
                                                                                                        } else {
                                                                                                            appStartsEventStartType = null;
                                                                                                        }
                                                                                                        SchemeStat$TypeAppStarts.StartMethod l0 = schemeStat$TypeAppStarts3.l0();
                                                                                                        if (l0 != null) {
                                                                                                            int i11 = iArr[l0.ordinal()];
                                                                                                            if (i11 == 1) {
                                                                                                                appStartsEventStartMethod2 = AppStartsEventStartMethod.SPRINGBOARD;
                                                                                                            } else if (i11 == 2) {
                                                                                                                appStartsEventStartMethod2 = AppStartsEventStartMethod.PUSH;
                                                                                                            } else if (i11 == 3) {
                                                                                                                appStartsEventStartMethod2 = AppStartsEventStartMethod.COMPANION;
                                                                                                            } else if (i11 == 4) {
                                                                                                                appStartsEventStartMethod2 = AppStartsEventStartMethod.DEEPLINK;
                                                                                                            } else {
                                                                                                                if (i11 != 5) {
                                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                                }
                                                                                                                appStartsEventStartMethod2 = AppStartsEventStartMethod.SHARING;
                                                                                                            }
                                                                                                            appStartsEventStartMethod = appStartsEventStartMethod2;
                                                                                                        } else {
                                                                                                            appStartsEventStartMethod = null;
                                                                                                        }
                                                                                                        String f0 = schemeStat$TypeAppStarts3.f0();
                                                                                                        String A = schemeStat$TypeAppStarts3.A();
                                                                                                        String e0 = schemeStat$TypeAppStarts3.e0();
                                                                                                        String h0 = schemeStat$TypeAppStarts3.h0();
                                                                                                        String E = schemeStat$TypeAppStarts3.E();
                                                                                                        String D = schemeStat$TypeAppStarts3.D();
                                                                                                        String F = schemeStat$TypeAppStarts3.F();
                                                                                                        String B = schemeStat$TypeAppStarts3.B();
                                                                                                        SchemeStat$TypeAppStarts.DeviceAdsIdType C = schemeStat$TypeAppStarts3.C();
                                                                                                        if (C != null) {
                                                                                                            int i12 = AppStartReporter.a.$EnumSwitchMapping$5[C.ordinal()];
                                                                                                            if (i12 == 1) {
                                                                                                                appStartsEventDeviceAdsIdType2 = AppStartsEventDeviceAdsIdType.IDFA;
                                                                                                            } else if (i12 == 2) {
                                                                                                                appStartsEventDeviceAdsIdType2 = AppStartsEventDeviceAdsIdType.GAID;
                                                                                                            } else {
                                                                                                                if (i12 != 3) {
                                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                                }
                                                                                                                appStartsEventDeviceAdsIdType2 = AppStartsEventDeviceAdsIdType.OAID;
                                                                                                            }
                                                                                                            appStartsEventDeviceAdsIdType = appStartsEventDeviceAdsIdType2;
                                                                                                        } else {
                                                                                                            appStartsEventDeviceAdsIdType = null;
                                                                                                        }
                                                                                                        Integer j0 = schemeStat$TypeAppStarts3.j0();
                                                                                                        Integer i0 = schemeStat$TypeAppStarts3.i0();
                                                                                                        String Z = schemeStat$TypeAppStarts3.Z();
                                                                                                        String c0 = schemeStat$TypeAppStarts3.c0();
                                                                                                        String b0 = schemeStat$TypeAppStarts3.b0();
                                                                                                        String a0 = schemeStat$TypeAppStarts3.a0();
                                                                                                        Boolean y0 = schemeStat$TypeAppStarts3.y0();
                                                                                                        Integer x = schemeStat$TypeAppStarts3.x();
                                                                                                        String o = schemeStat$TypeAppStarts3.o();
                                                                                                        Boolean t2 = schemeStat$TypeAppStarts3.t();
                                                                                                        Boolean r = schemeStat$TypeAppStarts3.r();
                                                                                                        Boolean s2 = schemeStat$TypeAppStarts3.s();
                                                                                                        Boolean v0 = schemeStat$TypeAppStarts3.v0();
                                                                                                        String q0 = schemeStat$TypeAppStarts3.q0();
                                                                                                        SchemeStat$TypeAppStarts.SystemTheme p0 = schemeStat$TypeAppStarts3.p0();
                                                                                                        if (p0 != null) {
                                                                                                            int i13 = AppStartReporter.a.$EnumSwitchMapping$2[p0.ordinal()];
                                                                                                            if (i13 == 1) {
                                                                                                                appStartsEventSystemTheme2 = AppStartsEventSystemTheme.DARK;
                                                                                                            } else {
                                                                                                                if (i13 != 2) {
                                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                                }
                                                                                                                appStartsEventSystemTheme2 = AppStartsEventSystemTheme.LIGHT;
                                                                                                            }
                                                                                                            appStartsEventSystemTheme = appStartsEventSystemTheme2;
                                                                                                        } else {
                                                                                                            appStartsEventSystemTheme = null;
                                                                                                        }
                                                                                                        String N = schemeStat$TypeAppStarts3.N();
                                                                                                        Double valueOf19 = schemeStat$TypeAppStarts3.L() != null ? Double.valueOf(r0.floatValue()) : null;
                                                                                                        Double valueOf20 = schemeStat$TypeAppStarts3.M() != null ? Double.valueOf(r0.floatValue()) : null;
                                                                                                        Integer w = schemeStat$TypeAppStarts3.w();
                                                                                                        Boolean G0 = schemeStat$TypeAppStarts3.G0();
                                                                                                        List<String> X = schemeStat$TypeAppStarts3.X();
                                                                                                        Boolean x0 = schemeStat$TypeAppStarts3.x0();
                                                                                                        Boolean C0 = schemeStat$TypeAppStarts3.C0();
                                                                                                        Boolean t0 = schemeStat$TypeAppStarts3.t0();
                                                                                                        String v = schemeStat$TypeAppStarts3.v();
                                                                                                        Integer r02 = schemeStat$TypeAppStarts3.r0();
                                                                                                        Integer u = schemeStat$TypeAppStarts3.u();
                                                                                                        Boolean s0 = schemeStat$TypeAppStarts3.s0();
                                                                                                        Boolean u02 = schemeStat$TypeAppStarts3.u0();
                                                                                                        Boolean D0 = schemeStat$TypeAppStarts3.D0();
                                                                                                        Integer K = schemeStat$TypeAppStarts3.K();
                                                                                                        Integer g0 = schemeStat$TypeAppStarts3.g0();
                                                                                                        Boolean F0 = schemeStat$TypeAppStarts3.F0();
                                                                                                        Boolean w0 = schemeStat$TypeAppStarts3.w0();
                                                                                                        Boolean B0 = schemeStat$TypeAppStarts3.B0();
                                                                                                        Integer J = schemeStat$TypeAppStarts3.J();
                                                                                                        Integer k0 = schemeStat$TypeAppStarts3.k0();
                                                                                                        Integer Q = schemeStat$TypeAppStarts3.Q();
                                                                                                        Integer I = schemeStat$TypeAppStarts3.I();
                                                                                                        Integer H = schemeStat$TypeAppStarts3.H();
                                                                                                        Boolean z0 = schemeStat$TypeAppStarts3.z0();
                                                                                                        String y = schemeStat$TypeAppStarts3.y();
                                                                                                        String z6 = schemeStat$TypeAppStarts3.z();
                                                                                                        String R = schemeStat$TypeAppStarts3.R();
                                                                                                        String q = schemeStat$TypeAppStarts3.q();
                                                                                                        String n = schemeStat$TypeAppStarts3.n();
                                                                                                        String g2 = schemeStat$TypeAppStarts3.g();
                                                                                                        String c10 = schemeStat$TypeAppStarts3.c();
                                                                                                        String b17 = schemeStat$TypeAppStarts3.b();
                                                                                                        String e2 = schemeStat$TypeAppStarts3.e();
                                                                                                        String d20 = schemeStat$TypeAppStarts3.d();
                                                                                                        List<Integer> p = schemeStat$TypeAppStarts3.p();
                                                                                                        Integer i14 = schemeStat$TypeAppStarts3.i();
                                                                                                        Integer h = schemeStat$TypeAppStarts3.h();
                                                                                                        Integer l4 = schemeStat$TypeAppStarts3.l();
                                                                                                        Integer m18 = schemeStat$TypeAppStarts3.m();
                                                                                                        Integer k = schemeStat$TypeAppStarts3.k();
                                                                                                        Integer j2 = schemeStat$TypeAppStarts3.j();
                                                                                                        Integer G = schemeStat$TypeAppStarts3.G();
                                                                                                        String W = schemeStat$TypeAppStarts3.W();
                                                                                                        String V = schemeStat$TypeAppStarts3.V();
                                                                                                        Integer U = schemeStat$TypeAppStarts3.U();
                                                                                                        String S = schemeStat$TypeAppStarts3.S();
                                                                                                        Integer T = schemeStat$TypeAppStarts3.T();
                                                                                                        Boolean O = schemeStat$TypeAppStarts3.O();
                                                                                                        String f = schemeStat$TypeAppStarts3.f();
                                                                                                        SchemeStat$TypeAppStarts.PreferredSystemContentSize d0 = schemeStat$TypeAppStarts3.d0();
                                                                                                        if (d0 != null) {
                                                                                                            int i15 = AppStartReporter.a.$EnumSwitchMapping$3[d0.ordinal()];
                                                                                                            if (i15 == 1) {
                                                                                                                appStartsEventPreferredSystemContentSize2 = AppStartsEventPreferredSystemContentSize.SMALL;
                                                                                                            } else if (i15 == 2) {
                                                                                                                appStartsEventPreferredSystemContentSize2 = AppStartsEventPreferredSystemContentSize.MEDIUM;
                                                                                                            } else if (i15 == 3) {
                                                                                                                appStartsEventPreferredSystemContentSize2 = AppStartsEventPreferredSystemContentSize.LARGE;
                                                                                                            } else {
                                                                                                                if (i15 != 4) {
                                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                                }
                                                                                                                appStartsEventPreferredSystemContentSize2 = AppStartsEventPreferredSystemContentSize.HUGE;
                                                                                                            }
                                                                                                            appStartsEventPreferredSystemContentSize = appStartsEventPreferredSystemContentSize2;
                                                                                                        } else {
                                                                                                            appStartsEventPreferredSystemContentSize = null;
                                                                                                        }
                                                                                                        String P = schemeStat$TypeAppStarts3.P();
                                                                                                        String Y = schemeStat$TypeAppStarts3.Y();
                                                                                                        Boolean E0 = schemeStat$TypeAppStarts3.E0();
                                                                                                        Boolean A0 = schemeStat$TypeAppStarts3.A0();
                                                                                                        SchemeStat$TypeAppStarts.StoreRegion o0 = schemeStat$TypeAppStarts3.o0();
                                                                                                        if (o0 != null) {
                                                                                                            int i16 = AppStartReporter.a.$EnumSwitchMapping$4[o0.ordinal()];
                                                                                                            if (i16 == 1) {
                                                                                                                appStartsEventStoreRegion2 = AppStartsEventStoreRegion.UNKNOWN;
                                                                                                            } else if (i16 == 2) {
                                                                                                                appStartsEventStoreRegion2 = AppStartsEventStoreRegion.RU;
                                                                                                            } else if (i16 == 3) {
                                                                                                                appStartsEventStoreRegion2 = AppStartsEventStoreRegion.BY;
                                                                                                            } else {
                                                                                                                if (i16 != 4) {
                                                                                                                    throw new NoWhenBranchMatchedException();
                                                                                                                }
                                                                                                                appStartsEventStoreRegion2 = AppStartsEventStoreRegion.KZ;
                                                                                                            }
                                                                                                            appStartsEventStoreRegion = appStartsEventStoreRegion2;
                                                                                                        } else {
                                                                                                            appStartsEventStoreRegion = null;
                                                                                                        }
                                                                                                        ulv0.a.a(cdi.q(m0, appStartsEventStartType, appStartsEventStartMethod, f0, A, e0, h0, E, B, appStartsEventDeviceAdsIdType, D, F, j0, i0, Z, c0, b0, a0, y0, x, o, t2, r, s2, v0, q0, appStartsEventSystemTheme, N, valueOf19, valueOf20, w, G0, X, x0, C0, t0, v, r02, u, s0, u02, D0, K, g0, F0, w0, B0, J, k0, Q, I, H, z0, y, z6, R, q, n, g2, c10, b17, e2, d20, p, i14, h, l4, m18, k, j2, G, W, V, U, S, T, O, f, appStartsEventPreferredSystemContentSize, P, Y, E0, A0, appStartsEventStoreRegion));
                                                                                                    }
                                                                                                    if (Preference.j().contains("__app_start_clean_boot__")) {
                                                                                                        int i17 = Preference.j().getInt("__app_start_version_code__", BuildInfo.e);
                                                                                                        ky6.a aVar3 = (ky6.a) Preference.j().edit();
                                                                                                        aVar3.putInt("__app_start_version_code__", BuildInfo.e);
                                                                                                        aVar3.apply();
                                                                                                        boolean z7 = BuildInfo.e > i17;
                                                                                                        k93 a5 = AppStartReporter.a();
                                                                                                        DevicePerformanceInfo a6 = DevicePerformanceInfo.a.a();
                                                                                                        z83 z83Var = new z83(z7);
                                                                                                        long j3 = a5.b;
                                                                                                        z83Var.i = j3 > 0 ? Integer.valueOf((int) j3) : null;
                                                                                                        long j4 = a5.a;
                                                                                                        z83Var.j = j4 > 0 ? Integer.valueOf((int) j4) : null;
                                                                                                        z83Var.k = kw90Var.a;
                                                                                                        z83Var.l = kw90Var.d;
                                                                                                        z83Var.m = kw90Var.m;
                                                                                                        z83Var.o = kw90Var.o;
                                                                                                        z83Var.p = kw90Var.p;
                                                                                                        z83Var.A = kw90Var.q;
                                                                                                        z83Var.n = kw90Var.n;
                                                                                                        z83Var.q = kw90Var.r;
                                                                                                        z83Var.r = kw90Var.s;
                                                                                                        z83Var.s = kw90Var.t;
                                                                                                        z83Var.u = kw90Var.u;
                                                                                                        z83Var.t = kw90Var.v;
                                                                                                        z83Var.w = kw90Var.w;
                                                                                                        z83Var.x = kw90Var.x;
                                                                                                        Context context3 = e43.a;
                                                                                                        if (context3 == null) {
                                                                                                            context3 = null;
                                                                                                        }
                                                                                                        String h2 = dy2.h(context3, "unknown");
                                                                                                        if (!kw90Var.n.booleanValue() && !kw90Var.m.booleanValue()) {
                                                                                                            h2 = null;
                                                                                                        }
                                                                                                        z83Var.v = h2;
                                                                                                        Context context4 = e43.a;
                                                                                                        if (context4 == null) {
                                                                                                            context4 = null;
                                                                                                        }
                                                                                                        String h3 = dy2.h(context4, "unknown");
                                                                                                        SharedPreferences i18 = Preference.i();
                                                                                                        int i19 = 0;
                                                                                                        boolean z8 = i18.getBoolean("__app_start_new_version_package_sent__", false);
                                                                                                        tdj.b(i18, "__app_start_new_version_package_sent__", true);
                                                                                                        if (z8) {
                                                                                                            h3 = null;
                                                                                                        }
                                                                                                        z83Var.y = h3;
                                                                                                        z83Var.z = Integer.valueOf(AppStartReporter.d(kw90Var.y));
                                                                                                        z83Var.B = Build.BRAND;
                                                                                                        z83Var.C = a6 != null ? Integer.valueOf(a6.a.h()) : null;
                                                                                                        z83Var.D = a6 != null ? Integer.valueOf(a6.b.h()) : null;
                                                                                                        z83Var.E = a6 != null ? Integer.valueOf(a6.e.h()) : null;
                                                                                                        z83Var.F = (a6 == null || (r2 = a6.d) == null) ? null : Integer.valueOf(r2.h());
                                                                                                        z83Var.G = kw90Var.B;
                                                                                                        NetworkPerformanceMeasurer.a.getClass();
                                                                                                        if (NetworkPerformanceMeasurer.k == -2) {
                                                                                                            i2 = -1;
                                                                                                            NetworkPerformanceMeasurer.k = hx90.a.getInt("network_quality", -1);
                                                                                                        } else {
                                                                                                            i2 = -1;
                                                                                                        }
                                                                                                        z83Var.H = Integer.valueOf((NetworkPerformanceMeasurer.k == i2 ? i2 : NetworkPerformanceMeasurer.d(NetworkPerformanceMeasurer.k).ordinal()) + 1);
                                                                                                        z83Var.q();
                                                                                                        jw90 jw90Var2 = kw90Var.e;
                                                                                                        c93 c93Var = new c93(z7);
                                                                                                        c93Var.i = jw90Var2.a;
                                                                                                        c93Var.j = jw90Var2.b;
                                                                                                        c93Var.k = jw90Var2.c;
                                                                                                        c93Var.l = jw90Var2.m;
                                                                                                        c93Var.m = jw90Var2.n;
                                                                                                        c93Var.n = jw90Var2.g;
                                                                                                        c93Var.o = jw90Var2.h;
                                                                                                        c93Var.p = jw90Var2.i;
                                                                                                        c93Var.q = jw90Var2.j;
                                                                                                        c93Var.r = jw90Var2.k;
                                                                                                        c93Var.s = jw90Var2.l;
                                                                                                        c93Var.t = jw90Var2.q;
                                                                                                        c93Var.u = jw90Var2.o;
                                                                                                        c93Var.v = jw90Var2.p;
                                                                                                        c93Var.w = jw90Var2.s;
                                                                                                        c93Var.x = jw90Var2.d;
                                                                                                        c93Var.y = jw90Var2.e;
                                                                                                        c93Var.z = jw90Var2.f;
                                                                                                        c93Var.A = jw90Var2.r;
                                                                                                        c93Var.B = Integer.valueOf(AppStartReporter.d(kw90Var.y));
                                                                                                        c93Var.C = jw90Var2.t;
                                                                                                        c93Var.D = jw90Var2.u;
                                                                                                        c93Var.E = jw90Var2.v;
                                                                                                        c93Var.F = jw90Var2.w;
                                                                                                        c93Var.G = jw90Var2.x;
                                                                                                        c93Var.H = jw90Var2.y;
                                                                                                        c93Var.q();
                                                                                                        iw90 iw90Var2 = kw90Var.C;
                                                                                                        Integer num3 = iw90Var2.a;
                                                                                                        Integer num4 = iw90Var2.b;
                                                                                                        Integer num5 = iw90Var2.c;
                                                                                                        Integer num6 = iw90Var2.d;
                                                                                                        if (num3 == null || num4 == null || num5 == null || num6 == null) {
                                                                                                            aggregateEventBuilder = null;
                                                                                                        } else {
                                                                                                            int intValue = num6.intValue();
                                                                                                            int intValue2 = num5.intValue();
                                                                                                            int intValue3 = num4.intValue();
                                                                                                            int intValue4 = num3.intValue();
                                                                                                            if (intValue4 > 0 && intValue3 > 0 && intValue2 > 0 && intValue > 0) {
                                                                                                                i19 = 1;
                                                                                                            }
                                                                                                            aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.APP_COLD_START_PERFORMANCE_TIMES);
                                                                                                            aggregateEventBuilder.v(1, intValue4);
                                                                                                            aggregateEventBuilder.v(2, intValue3);
                                                                                                            aggregateEventBuilder.v(3, intValue2);
                                                                                                            aggregateEventBuilder.v(4, intValue);
                                                                                                            aggregateEventBuilder.v(15, i19);
                                                                                                        }
                                                                                                        if (aggregateEventBuilder != null) {
                                                                                                            aggregateEventBuilder.q();
                                                                                                        }
                                                                                                        lw90 lw90Var2 = kw90Var.f;
                                                                                                        a93 a93Var = new a93(null, null, 3);
                                                                                                        Integer num7 = lw90Var2.a;
                                                                                                        a93Var.h = num7;
                                                                                                        Integer num8 = lw90Var2.b;
                                                                                                        a93Var.j = num8;
                                                                                                        Integer num9 = lw90Var2.c;
                                                                                                        a93Var.k = num9;
                                                                                                        Integer num10 = lw90Var2.e;
                                                                                                        a93Var.l = num10;
                                                                                                        Integer num11 = lw90Var2.d;
                                                                                                        a93Var.m = num11;
                                                                                                        Integer num12 = lw90Var2.f;
                                                                                                        a93Var.n = num12;
                                                                                                        Integer num13 = lw90Var2.g;
                                                                                                        a93Var.o = num13;
                                                                                                        Integer num14 = lw90Var2.i;
                                                                                                        a93Var.p = num14;
                                                                                                        Integer num15 = lw90Var2.j;
                                                                                                        a93Var.q = num15;
                                                                                                        schemeStat$TypeAppStarts = schemeStat$TypeAppStarts3;
                                                                                                        Integer num16 = lw90Var2.h;
                                                                                                        a93Var.i = num16;
                                                                                                        Integer num17 = lw90Var2.n;
                                                                                                        a93Var.r = num17;
                                                                                                        Integer num18 = lw90Var2.p;
                                                                                                        a93Var.s = num18;
                                                                                                        Integer num19 = lw90Var2.q;
                                                                                                        a93Var.t = num19;
                                                                                                        Integer num20 = lw90Var2.r;
                                                                                                        a93Var.u = num20;
                                                                                                        Integer num21 = lw90Var2.s;
                                                                                                        a93Var.v = num21;
                                                                                                        if (num7 != null || num16 != null || num8 != null || num9 != null || num10 != null || num11 != null || num12 != null || num14 != null || num15 != null || num17 != null || num13 != null || num18 != null || num19 != null || num20 != null || num21 != null) {
                                                                                                            a93Var.q();
                                                                                                        }
                                                                                                        dxo dxoVar = new dxo(null, null, 3);
                                                                                                        Integer num22 = lw90Var2.k;
                                                                                                        dxoVar.h = num22;
                                                                                                        Integer num23 = lw90Var2.l;
                                                                                                        dxoVar.i = num23;
                                                                                                        Integer num24 = lw90Var2.m;
                                                                                                        dxoVar.j = num24;
                                                                                                        Integer num25 = lw90Var2.o;
                                                                                                        dxoVar.k = num25;
                                                                                                        if (num22 != null || num23 != null || num24 != null || num25 != null) {
                                                                                                            dxoVar.q();
                                                                                                        }
                                                                                                        b93 b93Var = new b93(z7);
                                                                                                        b93Var.j = kw90Var.g;
                                                                                                        b93Var.i = kw90Var.h;
                                                                                                        b93Var.k = kw90Var.i;
                                                                                                        b93Var.l = kw90Var.k;
                                                                                                        b93Var.m = kw90Var.l;
                                                                                                        b93Var.n = kw90Var.j;
                                                                                                        b93Var.o = Boolean.valueOf(r6m.i());
                                                                                                        b93Var.p = a2;
                                                                                                        b93Var.q();
                                                                                                    } else {
                                                                                                        schemeStat$TypeAppStarts = schemeStat$TypeAppStarts3;
                                                                                                    }
                                                                                                    num = kw90Var.c;
                                                                                                    num2 = kw90Var.b;
                                                                                                    if (num == null || num2 != null) {
                                                                                                        new rlk0(num, num2).q();
                                                                                                    }
                                                                                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a3.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                                                                                    l5m l5mVar = new l5m(null, null, 3);
                                                                                                    l5mVar.g = schemeStat$TypeDevNullItem;
                                                                                                    l5mVar.q();
                                                                                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem2 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a3.a), null, Integer.valueOf((int) a3.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                                                                                    l5m l5mVar2 = new l5m(null, null, 3);
                                                                                                    l5mVar2.g = schemeStat$TypeDevNullItem2;
                                                                                                    l5mVar2.q();
                                                                                                    t = schemeStat$TypeAppStarts.t();
                                                                                                    bool = Boolean.TRUE;
                                                                                                    if (epx.f(t, bool)) {
                                                                                                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
                                                                                                        jt50.a(SingleEvent.PUSHES_ENABLED);
                                                                                                    }
                                                                                                    if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                                                                                        ConcurrentHashMap.KeySetView<Object, Boolean> keySetView2 = jt50.a;
                                                                                                        jt50.a(SingleEvent.CONTACTS_SYNCED);
                                                                                                    }
                                                                                                    return s3q0.a;
                                                                                                }
                                                                                                b2 = cVar2.c();
                                                                                            }
                                                                                            l3 = Long.valueOf(b2);
                                                                                            Object obj32 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                                                                            Preference preference2 = Preference.a;
                                                                                            preference2.getClass();
                                                                                            obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                                                                            if (obj != null) {
                                                                                            }
                                                                                            SchemeStat$TypeAppStarts.StartMethod startMethod32 = (SchemeStat$TypeAppStarts.StartMethod) obj32;
                                                                                            Preference.C("performance", "__app_performance_start_method__");
                                                                                            Object obj42 = SchemeStat$TypeAppStarts.StartType.COLD;
                                                                                            preference2.getClass();
                                                                                            obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                                                                            if (obj2 != null) {
                                                                                            }
                                                                                            SchemeStat$TypeAppStarts.StartType startType22 = (SchemeStat$TypeAppStarts.StartType) obj42;
                                                                                            Preference.C("performance", "__app_performance_start_type__");
                                                                                            String s3 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                                                                            Preference.C("performance", "__app_performance_start_method_payload__");
                                                                                            boolean d192 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                                                                            Preference.C("performance", "__app_performance_early_anr_last_session__");
                                                                                            kw90 kw90Var2 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod32, startType22, s3, d192, iw90Var);
                                                                                            dx90Var.O = true;
                                                                                            dx90Var.r();
                                                                                            String a22 = l93Var2.a();
                                                                                            k93 a32 = AppStartReporter.a();
                                                                                            dx90.l(scrollScreenType, true);
                                                                                            dx90.l(scrollScreenType2, true);
                                                                                            dx90.l(scrollScreenType3, true);
                                                                                            dx90.l(scrollScreenType4, true);
                                                                                            dx90.l(scrollScreenType5, true);
                                                                                            dx90.l(scrollScreenType6, true);
                                                                                            dx90.l(scrollScreenType7, true);
                                                                                            dx90.i(scrollScreenType);
                                                                                            dx90.i(scrollScreenType8);
                                                                                            dx90.i(scrollScreenType9);
                                                                                            dx90.l(scrollScreenType10, true);
                                                                                            dx90.l(scrollScreenType11, true);
                                                                                            dx90.i(scrollScreenType12);
                                                                                            dx90.i(scrollScreenType13);
                                                                                            dx90.i(scrollScreenType14);
                                                                                            dx90.g(motionLayoutScreenType);
                                                                                            dx90.l(scrollScreenType15, true);
                                                                                            dx90.l(scrollScreenType16, true);
                                                                                            dx90.l(scrollScreenType17, true);
                                                                                            Pair pair3 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                                                                            long longValue5 = ((Number) pair3.d()).longValue();
                                                                                            long longValue22 = ((Number) pair3.g()).longValue();
                                                                                            xuo0.a.getClass();
                                                                                            long a42 = xuo0.a();
                                                                                            long j5 = Preference.j().getLong("__app_start_last_time__", 0L);
                                                                                            ky6.a aVar22 = (ky6.a) Preference.j().edit();
                                                                                            aVar22.putLong("__app_start_last_time__", a42);
                                                                                            aVar22.apply();
                                                                                            Pair pair22 = new Pair(Long.valueOf(a42), Long.valueOf(j5));
                                                                                            long longValue32 = ((Number) pair22.d()).longValue();
                                                                                            long longValue42 = ((Number) pair22.g()).longValue();
                                                                                            uj9 uj9Var2 = new uj9(longValue5, longValue22);
                                                                                            int[] iArr2 = AppStartReporter.a.$EnumSwitchMapping$0;
                                                                                            i = iArr2[startMethod32.ordinal()];
                                                                                            if (i == 1) {
                                                                                            }
                                                                                            startMethod2.j(s3);
                                                                                            List u03 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var2, l93Var2), new ch9(uj9Var2), new t220(a32, kw90Var2), new hy90(appCompatActivity2), new gmr(kw90Var2.e), new tgs(kw90Var2.f), new zpn0(), new w33(kw90Var2, l93Var2), new upk0(new kqk0(startMethod2, startType22, longValue32, longValue42)), new x83()});
                                                                                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts22 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                                                                            it = u03.iterator();
                                                                                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts32 = schemeStat$TypeAppStarts22;
                                                                                            while (it.hasNext()) {
                                                                                            }
                                                                                            kx6 kx6Var2 = new kx6();
                                                                                            kx6Var2.f = schemeStat$TypeAppStarts32;
                                                                                            kx6Var2.q();
                                                                                            coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                                                                            coreFeatures.getClass();
                                                                                            bVar = com.vk.toggle.b.A;
                                                                                            if (!bVar.a(coreFeatures)) {
                                                                                            }
                                                                                            if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                                                                            }
                                                                                            if (Preference.j().contains("__app_start_clean_boot__")) {
                                                                                            }
                                                                                            num = kw90Var2.c;
                                                                                            num2 = kw90Var2.b;
                                                                                            if (num == null) {
                                                                                            }
                                                                                            new rlk0(num, num2).q();
                                                                                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem3 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a32.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                                                                            l5m l5mVar3 = new l5m(null, null, 3);
                                                                                            l5mVar3.g = schemeStat$TypeDevNullItem3;
                                                                                            l5mVar3.q();
                                                                                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem22 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a32.a), null, Integer.valueOf((int) a32.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                                                                            l5m l5mVar22 = new l5m(null, null, 3);
                                                                                            l5mVar22.g = schemeStat$TypeDevNullItem22;
                                                                                            l5mVar22.q();
                                                                                            t = schemeStat$TypeAppStarts.t();
                                                                                            bool = Boolean.TRUE;
                                                                                            if (epx.f(t, bool)) {
                                                                                            }
                                                                                            if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                                                                            }
                                                                                            return s3q0.a;
                                                                                        }
                                                                                        c9 = cVar2.b();
                                                                                    }
                                                                                    str9 = c9;
                                                                                    if (dx90Var.p()) {
                                                                                    }
                                                                                    l3 = Long.valueOf(b2);
                                                                                    Object obj322 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                                                                    Preference preference22 = Preference.a;
                                                                                    preference22.getClass();
                                                                                    obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                                                                    if (obj != null) {
                                                                                    }
                                                                                    SchemeStat$TypeAppStarts.StartMethod startMethod322 = (SchemeStat$TypeAppStarts.StartMethod) obj322;
                                                                                    Preference.C("performance", "__app_performance_start_method__");
                                                                                    Object obj422 = SchemeStat$TypeAppStarts.StartType.COLD;
                                                                                    preference22.getClass();
                                                                                    obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                                                                    if (obj2 != null) {
                                                                                    }
                                                                                    SchemeStat$TypeAppStarts.StartType startType222 = (SchemeStat$TypeAppStarts.StartType) obj422;
                                                                                    Preference.C("performance", "__app_performance_start_type__");
                                                                                    String s32 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                                                                    Preference.C("performance", "__app_performance_start_method_payload__");
                                                                                    boolean d1922 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                                                                    Preference.C("performance", "__app_performance_early_anr_last_session__");
                                                                                    kw90 kw90Var22 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod322, startType222, s32, d1922, iw90Var);
                                                                                    dx90Var.O = true;
                                                                                    dx90Var.r();
                                                                                    String a222 = l93Var2.a();
                                                                                    k93 a322 = AppStartReporter.a();
                                                                                    dx90.l(scrollScreenType, true);
                                                                                    dx90.l(scrollScreenType2, true);
                                                                                    dx90.l(scrollScreenType3, true);
                                                                                    dx90.l(scrollScreenType4, true);
                                                                                    dx90.l(scrollScreenType5, true);
                                                                                    dx90.l(scrollScreenType6, true);
                                                                                    dx90.l(scrollScreenType7, true);
                                                                                    dx90.i(scrollScreenType);
                                                                                    dx90.i(scrollScreenType8);
                                                                                    dx90.i(scrollScreenType9);
                                                                                    dx90.l(scrollScreenType10, true);
                                                                                    dx90.l(scrollScreenType11, true);
                                                                                    dx90.i(scrollScreenType12);
                                                                                    dx90.i(scrollScreenType13);
                                                                                    dx90.i(scrollScreenType14);
                                                                                    dx90.g(motionLayoutScreenType);
                                                                                    dx90.l(scrollScreenType15, true);
                                                                                    dx90.l(scrollScreenType16, true);
                                                                                    dx90.l(scrollScreenType17, true);
                                                                                    Pair pair32 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                                                                    long longValue52 = ((Number) pair32.d()).longValue();
                                                                                    long longValue222 = ((Number) pair32.g()).longValue();
                                                                                    xuo0.a.getClass();
                                                                                    long a422 = xuo0.a();
                                                                                    long j52 = Preference.j().getLong("__app_start_last_time__", 0L);
                                                                                    ky6.a aVar222 = (ky6.a) Preference.j().edit();
                                                                                    aVar222.putLong("__app_start_last_time__", a422);
                                                                                    aVar222.apply();
                                                                                    Pair pair222 = new Pair(Long.valueOf(a422), Long.valueOf(j52));
                                                                                    long longValue322 = ((Number) pair222.d()).longValue();
                                                                                    long longValue422 = ((Number) pair222.g()).longValue();
                                                                                    uj9 uj9Var22 = new uj9(longValue52, longValue222);
                                                                                    int[] iArr22 = AppStartReporter.a.$EnumSwitchMapping$0;
                                                                                    i = iArr22[startMethod322.ordinal()];
                                                                                    if (i == 1) {
                                                                                    }
                                                                                    startMethod2.j(s32);
                                                                                    List u032 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var22, l93Var2), new ch9(uj9Var22), new t220(a322, kw90Var22), new hy90(appCompatActivity2), new gmr(kw90Var22.e), new tgs(kw90Var22.f), new zpn0(), new w33(kw90Var22, l93Var2), new upk0(new kqk0(startMethod2, startType222, longValue322, longValue422)), new x83()});
                                                                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                                                                    it = u032.iterator();
                                                                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts322 = schemeStat$TypeAppStarts222;
                                                                                    while (it.hasNext()) {
                                                                                    }
                                                                                    kx6 kx6Var22 = new kx6();
                                                                                    kx6Var22.f = schemeStat$TypeAppStarts322;
                                                                                    kx6Var22.q();
                                                                                    coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                                                                    coreFeatures.getClass();
                                                                                    bVar = com.vk.toggle.b.A;
                                                                                    if (!bVar.a(coreFeatures)) {
                                                                                    }
                                                                                    if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                                                                    }
                                                                                    if (Preference.j().contains("__app_start_clean_boot__")) {
                                                                                    }
                                                                                    num = kw90Var22.c;
                                                                                    num2 = kw90Var22.b;
                                                                                    if (num == null) {
                                                                                    }
                                                                                    new rlk0(num, num2).q();
                                                                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem32 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a322.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                                                                    l5m l5mVar32 = new l5m(null, null, 3);
                                                                                    l5mVar32.g = schemeStat$TypeDevNullItem32;
                                                                                    l5mVar32.q();
                                                                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a322.a), null, Integer.valueOf((int) a322.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                                                                    l5m l5mVar222 = new l5m(null, null, 3);
                                                                                    l5mVar222.g = schemeStat$TypeDevNullItem222;
                                                                                    l5mVar222.q();
                                                                                    t = schemeStat$TypeAppStarts.t();
                                                                                    bool = Boolean.TRUE;
                                                                                    if (epx.f(t, bool)) {
                                                                                    }
                                                                                    if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                                                                    }
                                                                                    return s3q0.a;
                                                                                }
                                                                                c8 = cVar2.g();
                                                                            }
                                                                            str8 = c8;
                                                                            if (!dx90Var.p()) {
                                                                            }
                                                                            str9 = c9;
                                                                            if (dx90Var.p()) {
                                                                            }
                                                                            l3 = Long.valueOf(b2);
                                                                            Object obj3222 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                                                            Preference preference222 = Preference.a;
                                                                            preference222.getClass();
                                                                            obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                                                            if (obj != null) {
                                                                            }
                                                                            SchemeStat$TypeAppStarts.StartMethod startMethod3222 = (SchemeStat$TypeAppStarts.StartMethod) obj3222;
                                                                            Preference.C("performance", "__app_performance_start_method__");
                                                                            Object obj4222 = SchemeStat$TypeAppStarts.StartType.COLD;
                                                                            preference222.getClass();
                                                                            obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                                                            if (obj2 != null) {
                                                                            }
                                                                            SchemeStat$TypeAppStarts.StartType startType2222 = (SchemeStat$TypeAppStarts.StartType) obj4222;
                                                                            Preference.C("performance", "__app_performance_start_type__");
                                                                            String s322 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                                                            Preference.C("performance", "__app_performance_start_method_payload__");
                                                                            boolean d19222 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                                                            Preference.C("performance", "__app_performance_early_anr_last_session__");
                                                                            kw90 kw90Var222 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod3222, startType2222, s322, d19222, iw90Var);
                                                                            dx90Var.O = true;
                                                                            dx90Var.r();
                                                                            String a2222 = l93Var2.a();
                                                                            k93 a3222 = AppStartReporter.a();
                                                                            dx90.l(scrollScreenType, true);
                                                                            dx90.l(scrollScreenType2, true);
                                                                            dx90.l(scrollScreenType3, true);
                                                                            dx90.l(scrollScreenType4, true);
                                                                            dx90.l(scrollScreenType5, true);
                                                                            dx90.l(scrollScreenType6, true);
                                                                            dx90.l(scrollScreenType7, true);
                                                                            dx90.i(scrollScreenType);
                                                                            dx90.i(scrollScreenType8);
                                                                            dx90.i(scrollScreenType9);
                                                                            dx90.l(scrollScreenType10, true);
                                                                            dx90.l(scrollScreenType11, true);
                                                                            dx90.i(scrollScreenType12);
                                                                            dx90.i(scrollScreenType13);
                                                                            dx90.i(scrollScreenType14);
                                                                            dx90.g(motionLayoutScreenType);
                                                                            dx90.l(scrollScreenType15, true);
                                                                            dx90.l(scrollScreenType16, true);
                                                                            dx90.l(scrollScreenType17, true);
                                                                            Pair pair322 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                                                            long longValue522 = ((Number) pair322.d()).longValue();
                                                                            long longValue2222 = ((Number) pair322.g()).longValue();
                                                                            xuo0.a.getClass();
                                                                            long a4222 = xuo0.a();
                                                                            long j522 = Preference.j().getLong("__app_start_last_time__", 0L);
                                                                            ky6.a aVar2222 = (ky6.a) Preference.j().edit();
                                                                            aVar2222.putLong("__app_start_last_time__", a4222);
                                                                            aVar2222.apply();
                                                                            Pair pair2222 = new Pair(Long.valueOf(a4222), Long.valueOf(j522));
                                                                            long longValue3222 = ((Number) pair2222.d()).longValue();
                                                                            long longValue4222 = ((Number) pair2222.g()).longValue();
                                                                            uj9 uj9Var222 = new uj9(longValue522, longValue2222);
                                                                            int[] iArr222 = AppStartReporter.a.$EnumSwitchMapping$0;
                                                                            i = iArr222[startMethod3222.ordinal()];
                                                                            if (i == 1) {
                                                                            }
                                                                            startMethod2.j(s322);
                                                                            List u0322 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var222, l93Var2), new ch9(uj9Var222), new t220(a3222, kw90Var222), new hy90(appCompatActivity2), new gmr(kw90Var222.e), new tgs(kw90Var222.f), new zpn0(), new w33(kw90Var222, l93Var2), new upk0(new kqk0(startMethod2, startType2222, longValue3222, longValue4222)), new x83()});
                                                                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts2222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                                                            it = u0322.iterator();
                                                                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts3222 = schemeStat$TypeAppStarts2222;
                                                                            while (it.hasNext()) {
                                                                            }
                                                                            kx6 kx6Var222 = new kx6();
                                                                            kx6Var222.f = schemeStat$TypeAppStarts3222;
                                                                            kx6Var222.q();
                                                                            coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                                                            coreFeatures.getClass();
                                                                            bVar = com.vk.toggle.b.A;
                                                                            if (!bVar.a(coreFeatures)) {
                                                                            }
                                                                            if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                                                            }
                                                                            if (Preference.j().contains("__app_start_clean_boot__")) {
                                                                            }
                                                                            num = kw90Var222.c;
                                                                            num2 = kw90Var222.b;
                                                                            if (num == null) {
                                                                            }
                                                                            new rlk0(num, num2).q();
                                                                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem322 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a3222.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                                                            l5m l5mVar322 = new l5m(null, null, 3);
                                                                            l5mVar322.g = schemeStat$TypeDevNullItem322;
                                                                            l5mVar322.q();
                                                                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem2222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a3222.a), null, Integer.valueOf((int) a3222.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                                                            l5m l5mVar2222 = new l5m(null, null, 3);
                                                                            l5mVar2222.g = schemeStat$TypeDevNullItem2222;
                                                                            l5mVar2222.q();
                                                                            t = schemeStat$TypeAppStarts.t();
                                                                            bool = Boolean.TRUE;
                                                                            if (epx.f(t, bool)) {
                                                                            }
                                                                            if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                                                            }
                                                                            return s3q0.a;
                                                                        }
                                                                        c7 = cVar2.a();
                                                                    }
                                                                    str7 = c7;
                                                                    if (dx90Var.p()) {
                                                                    }
                                                                    str8 = c8;
                                                                    if (!dx90Var.p()) {
                                                                    }
                                                                    str9 = c9;
                                                                    if (dx90Var.p()) {
                                                                    }
                                                                    l3 = Long.valueOf(b2);
                                                                    Object obj32222 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                                                    Preference preference2222 = Preference.a;
                                                                    preference2222.getClass();
                                                                    obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                                                    if (obj != null) {
                                                                    }
                                                                    SchemeStat$TypeAppStarts.StartMethod startMethod32222 = (SchemeStat$TypeAppStarts.StartMethod) obj32222;
                                                                    Preference.C("performance", "__app_performance_start_method__");
                                                                    Object obj42222 = SchemeStat$TypeAppStarts.StartType.COLD;
                                                                    preference2222.getClass();
                                                                    obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                                                    if (obj2 != null) {
                                                                    }
                                                                    SchemeStat$TypeAppStarts.StartType startType22222 = (SchemeStat$TypeAppStarts.StartType) obj42222;
                                                                    Preference.C("performance", "__app_performance_start_type__");
                                                                    String s3222 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                                                    Preference.C("performance", "__app_performance_start_method_payload__");
                                                                    boolean d192222 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                                                    Preference.C("performance", "__app_performance_early_anr_last_session__");
                                                                    kw90 kw90Var2222 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod32222, startType22222, s3222, d192222, iw90Var);
                                                                    dx90Var.O = true;
                                                                    dx90Var.r();
                                                                    String a22222 = l93Var2.a();
                                                                    k93 a32222 = AppStartReporter.a();
                                                                    dx90.l(scrollScreenType, true);
                                                                    dx90.l(scrollScreenType2, true);
                                                                    dx90.l(scrollScreenType3, true);
                                                                    dx90.l(scrollScreenType4, true);
                                                                    dx90.l(scrollScreenType5, true);
                                                                    dx90.l(scrollScreenType6, true);
                                                                    dx90.l(scrollScreenType7, true);
                                                                    dx90.i(scrollScreenType);
                                                                    dx90.i(scrollScreenType8);
                                                                    dx90.i(scrollScreenType9);
                                                                    dx90.l(scrollScreenType10, true);
                                                                    dx90.l(scrollScreenType11, true);
                                                                    dx90.i(scrollScreenType12);
                                                                    dx90.i(scrollScreenType13);
                                                                    dx90.i(scrollScreenType14);
                                                                    dx90.g(motionLayoutScreenType);
                                                                    dx90.l(scrollScreenType15, true);
                                                                    dx90.l(scrollScreenType16, true);
                                                                    dx90.l(scrollScreenType17, true);
                                                                    Pair pair3222 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                                                    long longValue5222 = ((Number) pair3222.d()).longValue();
                                                                    long longValue22222 = ((Number) pair3222.g()).longValue();
                                                                    xuo0.a.getClass();
                                                                    long a42222 = xuo0.a();
                                                                    long j5222 = Preference.j().getLong("__app_start_last_time__", 0L);
                                                                    ky6.a aVar22222 = (ky6.a) Preference.j().edit();
                                                                    aVar22222.putLong("__app_start_last_time__", a42222);
                                                                    aVar22222.apply();
                                                                    Pair pair22222 = new Pair(Long.valueOf(a42222), Long.valueOf(j5222));
                                                                    long longValue32222 = ((Number) pair22222.d()).longValue();
                                                                    long longValue42222 = ((Number) pair22222.g()).longValue();
                                                                    uj9 uj9Var2222 = new uj9(longValue5222, longValue22222);
                                                                    int[] iArr2222 = AppStartReporter.a.$EnumSwitchMapping$0;
                                                                    i = iArr2222[startMethod32222.ordinal()];
                                                                    if (i == 1) {
                                                                    }
                                                                    startMethod2.j(s3222);
                                                                    List u03222 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var2222, l93Var2), new ch9(uj9Var2222), new t220(a32222, kw90Var2222), new hy90(appCompatActivity2), new gmr(kw90Var2222.e), new tgs(kw90Var2222.f), new zpn0(), new w33(kw90Var2222, l93Var2), new upk0(new kqk0(startMethod2, startType22222, longValue32222, longValue42222)), new x83()});
                                                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts22222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                                                    it = u03222.iterator();
                                                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts32222 = schemeStat$TypeAppStarts22222;
                                                                    while (it.hasNext()) {
                                                                    }
                                                                    kx6 kx6Var2222 = new kx6();
                                                                    kx6Var2222.f = schemeStat$TypeAppStarts32222;
                                                                    kx6Var2222.q();
                                                                    coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                                                    coreFeatures.getClass();
                                                                    bVar = com.vk.toggle.b.A;
                                                                    if (!bVar.a(coreFeatures)) {
                                                                    }
                                                                    if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                                                    }
                                                                    if (Preference.j().contains("__app_start_clean_boot__")) {
                                                                    }
                                                                    num = kw90Var2222.c;
                                                                    num2 = kw90Var2222.b;
                                                                    if (num == null) {
                                                                    }
                                                                    new rlk0(num, num2).q();
                                                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem3222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a32222.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                                                    l5m l5mVar3222 = new l5m(null, null, 3);
                                                                    l5mVar3222.g = schemeStat$TypeDevNullItem3222;
                                                                    l5mVar3222.q();
                                                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem22222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a32222.a), null, Integer.valueOf((int) a32222.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                                                    l5m l5mVar22222 = new l5m(null, null, 3);
                                                                    l5mVar22222.g = schemeStat$TypeDevNullItem22222;
                                                                    l5mVar22222.q();
                                                                    t = schemeStat$TypeAppStarts.t();
                                                                    bool = Boolean.TRUE;
                                                                    if (epx.f(t, bool)) {
                                                                    }
                                                                    if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                                                    }
                                                                    return s3q0.a;
                                                                }
                                                                c6 = cVar2.e();
                                                            }
                                                            str6 = c6;
                                                            if (!dx90Var.p()) {
                                                            }
                                                            str7 = c7;
                                                            if (dx90Var.p()) {
                                                            }
                                                            str8 = c8;
                                                            if (!dx90Var.p()) {
                                                            }
                                                            str9 = c9;
                                                            if (dx90Var.p()) {
                                                            }
                                                            l3 = Long.valueOf(b2);
                                                            Object obj322222 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                                            Preference preference22222 = Preference.a;
                                                            preference22222.getClass();
                                                            obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                                            if (obj != null) {
                                                            }
                                                            SchemeStat$TypeAppStarts.StartMethod startMethod322222 = (SchemeStat$TypeAppStarts.StartMethod) obj322222;
                                                            Preference.C("performance", "__app_performance_start_method__");
                                                            Object obj422222 = SchemeStat$TypeAppStarts.StartType.COLD;
                                                            preference22222.getClass();
                                                            obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                                            if (obj2 != null) {
                                                            }
                                                            SchemeStat$TypeAppStarts.StartType startType222222 = (SchemeStat$TypeAppStarts.StartType) obj422222;
                                                            Preference.C("performance", "__app_performance_start_type__");
                                                            String s32222 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                                            Preference.C("performance", "__app_performance_start_method_payload__");
                                                            boolean d1922222 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                                            Preference.C("performance", "__app_performance_early_anr_last_session__");
                                                            kw90 kw90Var22222 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod322222, startType222222, s32222, d1922222, iw90Var);
                                                            dx90Var.O = true;
                                                            dx90Var.r();
                                                            String a222222 = l93Var2.a();
                                                            k93 a322222 = AppStartReporter.a();
                                                            dx90.l(scrollScreenType, true);
                                                            dx90.l(scrollScreenType2, true);
                                                            dx90.l(scrollScreenType3, true);
                                                            dx90.l(scrollScreenType4, true);
                                                            dx90.l(scrollScreenType5, true);
                                                            dx90.l(scrollScreenType6, true);
                                                            dx90.l(scrollScreenType7, true);
                                                            dx90.i(scrollScreenType);
                                                            dx90.i(scrollScreenType8);
                                                            dx90.i(scrollScreenType9);
                                                            dx90.l(scrollScreenType10, true);
                                                            dx90.l(scrollScreenType11, true);
                                                            dx90.i(scrollScreenType12);
                                                            dx90.i(scrollScreenType13);
                                                            dx90.i(scrollScreenType14);
                                                            dx90.g(motionLayoutScreenType);
                                                            dx90.l(scrollScreenType15, true);
                                                            dx90.l(scrollScreenType16, true);
                                                            dx90.l(scrollScreenType17, true);
                                                            Pair pair32222 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                                            long longValue52222 = ((Number) pair32222.d()).longValue();
                                                            long longValue222222 = ((Number) pair32222.g()).longValue();
                                                            xuo0.a.getClass();
                                                            long a422222 = xuo0.a();
                                                            long j52222 = Preference.j().getLong("__app_start_last_time__", 0L);
                                                            ky6.a aVar222222 = (ky6.a) Preference.j().edit();
                                                            aVar222222.putLong("__app_start_last_time__", a422222);
                                                            aVar222222.apply();
                                                            Pair pair222222 = new Pair(Long.valueOf(a422222), Long.valueOf(j52222));
                                                            long longValue322222 = ((Number) pair222222.d()).longValue();
                                                            long longValue422222 = ((Number) pair222222.g()).longValue();
                                                            uj9 uj9Var22222 = new uj9(longValue52222, longValue222222);
                                                            int[] iArr22222 = AppStartReporter.a.$EnumSwitchMapping$0;
                                                            i = iArr22222[startMethod322222.ordinal()];
                                                            if (i == 1) {
                                                            }
                                                            startMethod2.j(s32222);
                                                            List u032222 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var22222, l93Var2), new ch9(uj9Var22222), new t220(a322222, kw90Var22222), new hy90(appCompatActivity2), new gmr(kw90Var22222.e), new tgs(kw90Var22222.f), new zpn0(), new w33(kw90Var22222, l93Var2), new upk0(new kqk0(startMethod2, startType222222, longValue322222, longValue422222)), new x83()});
                                                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts222222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                                            it = u032222.iterator();
                                                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts322222 = schemeStat$TypeAppStarts222222;
                                                            while (it.hasNext()) {
                                                            }
                                                            kx6 kx6Var22222 = new kx6();
                                                            kx6Var22222.f = schemeStat$TypeAppStarts322222;
                                                            kx6Var22222.q();
                                                            coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                                            coreFeatures.getClass();
                                                            bVar = com.vk.toggle.b.A;
                                                            if (!bVar.a(coreFeatures)) {
                                                            }
                                                            if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                                            }
                                                            if (Preference.j().contains("__app_start_clean_boot__")) {
                                                            }
                                                            num = kw90Var22222.c;
                                                            num2 = kw90Var22222.b;
                                                            if (num == null) {
                                                            }
                                                            new rlk0(num, num2).q();
                                                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem32222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a322222.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                                            l5m l5mVar32222 = new l5m(null, null, 3);
                                                            l5mVar32222.g = schemeStat$TypeDevNullItem32222;
                                                            l5mVar32222.q();
                                                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a322222.a), null, Integer.valueOf((int) a322222.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                                            l5m l5mVar222222 = new l5m(null, null, 3);
                                                            l5mVar222222.g = schemeStat$TypeDevNullItem222222;
                                                            l5mVar222222.q();
                                                            t = schemeStat$TypeAppStarts.t();
                                                            bool = Boolean.TRUE;
                                                            if (epx.f(t, bool)) {
                                                            }
                                                            if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                                            }
                                                            return s3q0.a;
                                                        }
                                                        c5 = cVar2.f();
                                                    }
                                                    str5 = c5;
                                                    if (dx90Var.p()) {
                                                    }
                                                    str6 = c6;
                                                    if (!dx90Var.p()) {
                                                    }
                                                    str7 = c7;
                                                    if (dx90Var.p()) {
                                                    }
                                                    str8 = c8;
                                                    if (!dx90Var.p()) {
                                                    }
                                                    str9 = c9;
                                                    if (dx90Var.p()) {
                                                    }
                                                    l3 = Long.valueOf(b2);
                                                    Object obj3222222 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                                    Preference preference222222 = Preference.a;
                                                    preference222222.getClass();
                                                    obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                                    if (obj != null) {
                                                    }
                                                    SchemeStat$TypeAppStarts.StartMethod startMethod3222222 = (SchemeStat$TypeAppStarts.StartMethod) obj3222222;
                                                    Preference.C("performance", "__app_performance_start_method__");
                                                    Object obj4222222 = SchemeStat$TypeAppStarts.StartType.COLD;
                                                    preference222222.getClass();
                                                    obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                                    if (obj2 != null) {
                                                    }
                                                    SchemeStat$TypeAppStarts.StartType startType2222222 = (SchemeStat$TypeAppStarts.StartType) obj4222222;
                                                    Preference.C("performance", "__app_performance_start_type__");
                                                    String s322222 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                                    Preference.C("performance", "__app_performance_start_method_payload__");
                                                    boolean d19222222 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                                    Preference.C("performance", "__app_performance_early_anr_last_session__");
                                                    kw90 kw90Var222222 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod3222222, startType2222222, s322222, d19222222, iw90Var);
                                                    dx90Var.O = true;
                                                    dx90Var.r();
                                                    String a2222222 = l93Var2.a();
                                                    k93 a3222222 = AppStartReporter.a();
                                                    dx90.l(scrollScreenType, true);
                                                    dx90.l(scrollScreenType2, true);
                                                    dx90.l(scrollScreenType3, true);
                                                    dx90.l(scrollScreenType4, true);
                                                    dx90.l(scrollScreenType5, true);
                                                    dx90.l(scrollScreenType6, true);
                                                    dx90.l(scrollScreenType7, true);
                                                    dx90.i(scrollScreenType);
                                                    dx90.i(scrollScreenType8);
                                                    dx90.i(scrollScreenType9);
                                                    dx90.l(scrollScreenType10, true);
                                                    dx90.l(scrollScreenType11, true);
                                                    dx90.i(scrollScreenType12);
                                                    dx90.i(scrollScreenType13);
                                                    dx90.i(scrollScreenType14);
                                                    dx90.g(motionLayoutScreenType);
                                                    dx90.l(scrollScreenType15, true);
                                                    dx90.l(scrollScreenType16, true);
                                                    dx90.l(scrollScreenType17, true);
                                                    Pair pair322222 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                                    long longValue522222 = ((Number) pair322222.d()).longValue();
                                                    long longValue2222222 = ((Number) pair322222.g()).longValue();
                                                    xuo0.a.getClass();
                                                    long a4222222 = xuo0.a();
                                                    long j522222 = Preference.j().getLong("__app_start_last_time__", 0L);
                                                    ky6.a aVar2222222 = (ky6.a) Preference.j().edit();
                                                    aVar2222222.putLong("__app_start_last_time__", a4222222);
                                                    aVar2222222.apply();
                                                    Pair pair2222222 = new Pair(Long.valueOf(a4222222), Long.valueOf(j522222));
                                                    long longValue3222222 = ((Number) pair2222222.d()).longValue();
                                                    long longValue4222222 = ((Number) pair2222222.g()).longValue();
                                                    uj9 uj9Var222222 = new uj9(longValue522222, longValue2222222);
                                                    int[] iArr222222 = AppStartReporter.a.$EnumSwitchMapping$0;
                                                    i = iArr222222[startMethod3222222.ordinal()];
                                                    if (i == 1) {
                                                    }
                                                    startMethod2.j(s322222);
                                                    List u0322222 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var222222, l93Var2), new ch9(uj9Var222222), new t220(a3222222, kw90Var222222), new hy90(appCompatActivity2), new gmr(kw90Var222222.e), new tgs(kw90Var222222.f), new zpn0(), new w33(kw90Var222222, l93Var2), new upk0(new kqk0(startMethod2, startType2222222, longValue3222222, longValue4222222)), new x83()});
                                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts2222222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                                    it = u0322222.iterator();
                                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts3222222 = schemeStat$TypeAppStarts2222222;
                                                    while (it.hasNext()) {
                                                    }
                                                    kx6 kx6Var222222 = new kx6();
                                                    kx6Var222222.f = schemeStat$TypeAppStarts3222222;
                                                    kx6Var222222.q();
                                                    coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                                    coreFeatures.getClass();
                                                    bVar = com.vk.toggle.b.A;
                                                    if (!bVar.a(coreFeatures)) {
                                                    }
                                                    if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                                    }
                                                    if (Preference.j().contains("__app_start_clean_boot__")) {
                                                    }
                                                    num = kw90Var222222.c;
                                                    num2 = kw90Var222222.b;
                                                    if (num == null) {
                                                    }
                                                    new rlk0(num, num2).q();
                                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem322222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a3222222.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                                    l5m l5mVar322222 = new l5m(null, null, 3);
                                                    l5mVar322222.g = schemeStat$TypeDevNullItem322222;
                                                    l5mVar322222.q();
                                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem2222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a3222222.a), null, Integer.valueOf((int) a3222222.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                                    l5m l5mVar2222222 = new l5m(null, null, 3);
                                                    l5mVar2222222.g = schemeStat$TypeDevNullItem2222222;
                                                    l5mVar2222222.q();
                                                    t = schemeStat$TypeAppStarts.t();
                                                    bool = Boolean.TRUE;
                                                    if (epx.f(t, bool)) {
                                                    }
                                                    if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                                    }
                                                    return s3q0.a;
                                                }
                                                c4 = cVar2.d();
                                            }
                                            str4 = c4;
                                            if (!dx90Var.p()) {
                                            }
                                            str5 = c5;
                                            if (dx90Var.p()) {
                                            }
                                            str6 = c6;
                                            if (!dx90Var.p()) {
                                            }
                                            str7 = c7;
                                            if (dx90Var.p()) {
                                            }
                                            str8 = c8;
                                            if (!dx90Var.p()) {
                                            }
                                            str9 = c9;
                                            if (dx90Var.p()) {
                                            }
                                            l3 = Long.valueOf(b2);
                                            Object obj32222222 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                            Preference preference2222222 = Preference.a;
                                            preference2222222.getClass();
                                            obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                            if (obj != null) {
                                            }
                                            SchemeStat$TypeAppStarts.StartMethod startMethod32222222 = (SchemeStat$TypeAppStarts.StartMethod) obj32222222;
                                            Preference.C("performance", "__app_performance_start_method__");
                                            Object obj42222222 = SchemeStat$TypeAppStarts.StartType.COLD;
                                            preference2222222.getClass();
                                            obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                            if (obj2 != null) {
                                            }
                                            SchemeStat$TypeAppStarts.StartType startType22222222 = (SchemeStat$TypeAppStarts.StartType) obj42222222;
                                            Preference.C("performance", "__app_performance_start_type__");
                                            String s3222222 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                            Preference.C("performance", "__app_performance_start_method_payload__");
                                            boolean d192222222 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                            Preference.C("performance", "__app_performance_early_anr_last_session__");
                                            kw90 kw90Var2222222 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod32222222, startType22222222, s3222222, d192222222, iw90Var);
                                            dx90Var.O = true;
                                            dx90Var.r();
                                            String a22222222 = l93Var2.a();
                                            k93 a32222222 = AppStartReporter.a();
                                            dx90.l(scrollScreenType, true);
                                            dx90.l(scrollScreenType2, true);
                                            dx90.l(scrollScreenType3, true);
                                            dx90.l(scrollScreenType4, true);
                                            dx90.l(scrollScreenType5, true);
                                            dx90.l(scrollScreenType6, true);
                                            dx90.l(scrollScreenType7, true);
                                            dx90.i(scrollScreenType);
                                            dx90.i(scrollScreenType8);
                                            dx90.i(scrollScreenType9);
                                            dx90.l(scrollScreenType10, true);
                                            dx90.l(scrollScreenType11, true);
                                            dx90.i(scrollScreenType12);
                                            dx90.i(scrollScreenType13);
                                            dx90.i(scrollScreenType14);
                                            dx90.g(motionLayoutScreenType);
                                            dx90.l(scrollScreenType15, true);
                                            dx90.l(scrollScreenType16, true);
                                            dx90.l(scrollScreenType17, true);
                                            Pair pair3222222 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                            long longValue5222222 = ((Number) pair3222222.d()).longValue();
                                            long longValue22222222 = ((Number) pair3222222.g()).longValue();
                                            xuo0.a.getClass();
                                            long a42222222 = xuo0.a();
                                            long j5222222 = Preference.j().getLong("__app_start_last_time__", 0L);
                                            ky6.a aVar22222222 = (ky6.a) Preference.j().edit();
                                            aVar22222222.putLong("__app_start_last_time__", a42222222);
                                            aVar22222222.apply();
                                            Pair pair22222222 = new Pair(Long.valueOf(a42222222), Long.valueOf(j5222222));
                                            long longValue32222222 = ((Number) pair22222222.d()).longValue();
                                            long longValue42222222 = ((Number) pair22222222.g()).longValue();
                                            uj9 uj9Var2222222 = new uj9(longValue5222222, longValue22222222);
                                            int[] iArr2222222 = AppStartReporter.a.$EnumSwitchMapping$0;
                                            i = iArr2222222[startMethod32222222.ordinal()];
                                            if (i == 1) {
                                            }
                                            startMethod2.j(s3222222);
                                            List u03222222 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var2222222, l93Var2), new ch9(uj9Var2222222), new t220(a32222222, kw90Var2222222), new hy90(appCompatActivity2), new gmr(kw90Var2222222.e), new tgs(kw90Var2222222.f), new zpn0(), new w33(kw90Var2222222, l93Var2), new upk0(new kqk0(startMethod2, startType22222222, longValue32222222, longValue42222222)), new x83()});
                                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts22222222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                            it = u03222222.iterator();
                                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts32222222 = schemeStat$TypeAppStarts22222222;
                                            while (it.hasNext()) {
                                            }
                                            kx6 kx6Var2222222 = new kx6();
                                            kx6Var2222222.f = schemeStat$TypeAppStarts32222222;
                                            kx6Var2222222.q();
                                            coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                            coreFeatures.getClass();
                                            bVar = com.vk.toggle.b.A;
                                            if (!bVar.a(coreFeatures)) {
                                            }
                                            if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                            }
                                            if (Preference.j().contains("__app_start_clean_boot__")) {
                                            }
                                            num = kw90Var2222222.c;
                                            num2 = kw90Var2222222.b;
                                            if (num == null) {
                                            }
                                            new rlk0(num, num2).q();
                                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem3222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a32222222.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                            l5m l5mVar3222222 = new l5m(null, null, 3);
                                            l5mVar3222222.g = schemeStat$TypeDevNullItem3222222;
                                            l5mVar3222222.q();
                                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem22222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a32222222.a), null, Integer.valueOf((int) a32222222.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                            l5m l5mVar22222222 = new l5m(null, null, 3);
                                            l5mVar22222222.g = schemeStat$TypeDevNullItem22222222;
                                            l5mVar22222222.q();
                                            t = schemeStat$TypeAppStarts.t();
                                            bool = Boolean.TRUE;
                                            if (epx.f(t, bool)) {
                                            }
                                            if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                            }
                                            return s3q0.a;
                                        }
                                        c3 = aVar.b();
                                    }
                                    str3 = c3;
                                    if (dx90Var.p()) {
                                    }
                                    str4 = c4;
                                    if (!dx90Var.p()) {
                                    }
                                    str5 = c5;
                                    if (dx90Var.p()) {
                                    }
                                    str6 = c6;
                                    if (!dx90Var.p()) {
                                    }
                                    str7 = c7;
                                    if (dx90Var.p()) {
                                    }
                                    str8 = c8;
                                    if (!dx90Var.p()) {
                                    }
                                    str9 = c9;
                                    if (dx90Var.p()) {
                                    }
                                    l3 = Long.valueOf(b2);
                                    Object obj322222222 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                                    Preference preference22222222 = Preference.a;
                                    preference22222222.getClass();
                                    obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                                    if (obj != null) {
                                    }
                                    SchemeStat$TypeAppStarts.StartMethod startMethod322222222 = (SchemeStat$TypeAppStarts.StartMethod) obj322222222;
                                    Preference.C("performance", "__app_performance_start_method__");
                                    Object obj422222222 = SchemeStat$TypeAppStarts.StartType.COLD;
                                    preference22222222.getClass();
                                    obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                                    if (obj2 != null) {
                                    }
                                    SchemeStat$TypeAppStarts.StartType startType222222222 = (SchemeStat$TypeAppStarts.StartType) obj422222222;
                                    Preference.C("performance", "__app_performance_start_type__");
                                    String s32222222 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                                    Preference.C("performance", "__app_performance_start_method_payload__");
                                    boolean d1922222222 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                                    Preference.C("performance", "__app_performance_early_anr_last_session__");
                                    kw90 kw90Var22222222 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod322222222, startType222222222, s32222222, d1922222222, iw90Var);
                                    dx90Var.O = true;
                                    dx90Var.r();
                                    String a222222222 = l93Var2.a();
                                    k93 a322222222 = AppStartReporter.a();
                                    dx90.l(scrollScreenType, true);
                                    dx90.l(scrollScreenType2, true);
                                    dx90.l(scrollScreenType3, true);
                                    dx90.l(scrollScreenType4, true);
                                    dx90.l(scrollScreenType5, true);
                                    dx90.l(scrollScreenType6, true);
                                    dx90.l(scrollScreenType7, true);
                                    dx90.i(scrollScreenType);
                                    dx90.i(scrollScreenType8);
                                    dx90.i(scrollScreenType9);
                                    dx90.l(scrollScreenType10, true);
                                    dx90.l(scrollScreenType11, true);
                                    dx90.i(scrollScreenType12);
                                    dx90.i(scrollScreenType13);
                                    dx90.i(scrollScreenType14);
                                    dx90.g(motionLayoutScreenType);
                                    dx90.l(scrollScreenType15, true);
                                    dx90.l(scrollScreenType16, true);
                                    dx90.l(scrollScreenType17, true);
                                    Pair pair32222222 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                                    long longValue52222222 = ((Number) pair32222222.d()).longValue();
                                    long longValue222222222 = ((Number) pair32222222.g()).longValue();
                                    xuo0.a.getClass();
                                    long a422222222 = xuo0.a();
                                    long j52222222 = Preference.j().getLong("__app_start_last_time__", 0L);
                                    ky6.a aVar222222222 = (ky6.a) Preference.j().edit();
                                    aVar222222222.putLong("__app_start_last_time__", a422222222);
                                    aVar222222222.apply();
                                    Pair pair222222222 = new Pair(Long.valueOf(a422222222), Long.valueOf(j52222222));
                                    long longValue322222222 = ((Number) pair222222222.d()).longValue();
                                    long longValue422222222 = ((Number) pair222222222.g()).longValue();
                                    uj9 uj9Var22222222 = new uj9(longValue52222222, longValue222222222);
                                    int[] iArr22222222 = AppStartReporter.a.$EnumSwitchMapping$0;
                                    i = iArr22222222[startMethod322222222.ordinal()];
                                    if (i == 1) {
                                    }
                                    startMethod2.j(s32222222);
                                    List u032222222 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var22222222, l93Var2), new ch9(uj9Var22222222), new t220(a322222222, kw90Var22222222), new hy90(appCompatActivity2), new gmr(kw90Var22222222.e), new tgs(kw90Var22222222.f), new zpn0(), new w33(kw90Var22222222, l93Var2), new upk0(new kqk0(startMethod2, startType222222222, longValue322222222, longValue422222222)), new x83()});
                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts222222222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                                    it = u032222222.iterator();
                                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts322222222 = schemeStat$TypeAppStarts222222222;
                                    while (it.hasNext()) {
                                    }
                                    kx6 kx6Var22222222 = new kx6();
                                    kx6Var22222222.f = schemeStat$TypeAppStarts322222222;
                                    kx6Var22222222.q();
                                    coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                                    coreFeatures.getClass();
                                    bVar = com.vk.toggle.b.A;
                                    if (!bVar.a(coreFeatures)) {
                                    }
                                    if (!com.vk.toggle.d.q().a("type_app_starts")) {
                                    }
                                    if (Preference.j().contains("__app_start_clean_boot__")) {
                                    }
                                    num = kw90Var22222222.c;
                                    num2 = kw90Var22222222.b;
                                    if (num == null) {
                                    }
                                    new rlk0(num, num2).q();
                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem32222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a322222222.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                                    l5m l5mVar32222222 = new l5m(null, null, 3);
                                    l5mVar32222222.g = schemeStat$TypeDevNullItem32222222;
                                    l5mVar32222222.q();
                                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem222222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a322222222.a), null, Integer.valueOf((int) a322222222.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                                    l5m l5mVar222222222 = new l5m(null, null, 3);
                                    l5mVar222222222.g = schemeStat$TypeDevNullItem222222222;
                                    l5mVar222222222.q();
                                    t = schemeStat$TypeAppStarts.t();
                                    bool = Boolean.TRUE;
                                    if (epx.f(t, bool)) {
                                    }
                                    if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                                    }
                                    return s3q0.a;
                                }
                                c2 = aVar.c();
                            }
                            str2 = c2;
                            if (!dx90Var.p()) {
                            }
                            str3 = c3;
                            if (dx90Var.p()) {
                            }
                            str4 = c4;
                            if (!dx90Var.p()) {
                            }
                            str5 = c5;
                            if (dx90Var.p()) {
                            }
                            str6 = c6;
                            if (!dx90Var.p()) {
                            }
                            str7 = c7;
                            if (dx90Var.p()) {
                            }
                            str8 = c8;
                            if (!dx90Var.p()) {
                            }
                            str9 = c9;
                            if (dx90Var.p()) {
                            }
                            l3 = Long.valueOf(b2);
                            Object obj3222222222 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                            Preference preference222222222 = Preference.a;
                            preference222222222.getClass();
                            obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                            if (obj != null) {
                            }
                            SchemeStat$TypeAppStarts.StartMethod startMethod3222222222 = (SchemeStat$TypeAppStarts.StartMethod) obj3222222222;
                            Preference.C("performance", "__app_performance_start_method__");
                            Object obj4222222222 = SchemeStat$TypeAppStarts.StartType.COLD;
                            preference222222222.getClass();
                            obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                            if (obj2 != null) {
                            }
                            SchemeStat$TypeAppStarts.StartType startType2222222222 = (SchemeStat$TypeAppStarts.StartType) obj4222222222;
                            Preference.C("performance", "__app_performance_start_type__");
                            String s322222222 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                            Preference.C("performance", "__app_performance_start_method_payload__");
                            boolean d19222222222 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                            Preference.C("performance", "__app_performance_early_anr_last_session__");
                            kw90 kw90Var222222222 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod3222222222, startType2222222222, s322222222, d19222222222, iw90Var);
                            dx90Var.O = true;
                            dx90Var.r();
                            String a2222222222 = l93Var2.a();
                            k93 a3222222222 = AppStartReporter.a();
                            dx90.l(scrollScreenType, true);
                            dx90.l(scrollScreenType2, true);
                            dx90.l(scrollScreenType3, true);
                            dx90.l(scrollScreenType4, true);
                            dx90.l(scrollScreenType5, true);
                            dx90.l(scrollScreenType6, true);
                            dx90.l(scrollScreenType7, true);
                            dx90.i(scrollScreenType);
                            dx90.i(scrollScreenType8);
                            dx90.i(scrollScreenType9);
                            dx90.l(scrollScreenType10, true);
                            dx90.l(scrollScreenType11, true);
                            dx90.i(scrollScreenType12);
                            dx90.i(scrollScreenType13);
                            dx90.i(scrollScreenType14);
                            dx90.g(motionLayoutScreenType);
                            dx90.l(scrollScreenType15, true);
                            dx90.l(scrollScreenType16, true);
                            dx90.l(scrollScreenType17, true);
                            Pair pair322222222 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                            long longValue522222222 = ((Number) pair322222222.d()).longValue();
                            long longValue2222222222 = ((Number) pair322222222.g()).longValue();
                            xuo0.a.getClass();
                            long a4222222222 = xuo0.a();
                            long j522222222 = Preference.j().getLong("__app_start_last_time__", 0L);
                            ky6.a aVar2222222222 = (ky6.a) Preference.j().edit();
                            aVar2222222222.putLong("__app_start_last_time__", a4222222222);
                            aVar2222222222.apply();
                            Pair pair2222222222 = new Pair(Long.valueOf(a4222222222), Long.valueOf(j522222222));
                            long longValue3222222222 = ((Number) pair2222222222.d()).longValue();
                            long longValue4222222222 = ((Number) pair2222222222.g()).longValue();
                            uj9 uj9Var222222222 = new uj9(longValue522222222, longValue2222222222);
                            int[] iArr222222222 = AppStartReporter.a.$EnumSwitchMapping$0;
                            i = iArr222222222[startMethod3222222222.ordinal()];
                            if (i == 1) {
                            }
                            startMethod2.j(s322222222);
                            List u0322222222 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var222222222, l93Var2), new ch9(uj9Var222222222), new t220(a3222222222, kw90Var222222222), new hy90(appCompatActivity2), new gmr(kw90Var222222222.e), new tgs(kw90Var222222222.f), new zpn0(), new w33(kw90Var222222222, l93Var2), new upk0(new kqk0(startMethod2, startType2222222222, longValue3222222222, longValue4222222222)), new x83()});
                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts2222222222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                            it = u0322222222.iterator();
                            SchemeStat$TypeAppStarts schemeStat$TypeAppStarts3222222222 = schemeStat$TypeAppStarts2222222222;
                            while (it.hasNext()) {
                            }
                            kx6 kx6Var222222222 = new kx6();
                            kx6Var222222222.f = schemeStat$TypeAppStarts3222222222;
                            kx6Var222222222.q();
                            coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                            coreFeatures.getClass();
                            bVar = com.vk.toggle.b.A;
                            if (!bVar.a(coreFeatures)) {
                            }
                            if (!com.vk.toggle.d.q().a("type_app_starts")) {
                            }
                            if (Preference.j().contains("__app_start_clean_boot__")) {
                            }
                            num = kw90Var222222222.c;
                            num2 = kw90Var222222222.b;
                            if (num == null) {
                            }
                            new rlk0(num, num2).q();
                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem322222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a3222222222.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                            l5m l5mVar322222222 = new l5m(null, null, 3);
                            l5mVar322222222.g = schemeStat$TypeDevNullItem322222222;
                            l5mVar322222222.q();
                            SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem2222222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a3222222222.a), null, Integer.valueOf((int) a3222222222.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                            l5m l5mVar2222222222 = new l5m(null, null, 3);
                            l5mVar2222222222.g = schemeStat$TypeDevNullItem2222222222;
                            l5mVar2222222222.q();
                            t = schemeStat$TypeAppStarts.t();
                            bool = Boolean.TRUE;
                            if (epx.f(t, bool)) {
                            }
                            if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                            }
                            return s3q0.a;
                        }
                        c = aVar.a();
                    }
                    str = c;
                    if (dx90Var.p()) {
                    }
                    str2 = c2;
                    if (!dx90Var.p()) {
                    }
                    str3 = c3;
                    if (dx90Var.p()) {
                    }
                    str4 = c4;
                    if (!dx90Var.p()) {
                    }
                    str5 = c5;
                    if (dx90Var.p()) {
                    }
                    str6 = c6;
                    if (!dx90Var.p()) {
                    }
                    str7 = c7;
                    if (dx90Var.p()) {
                    }
                    str8 = c8;
                    if (!dx90Var.p()) {
                    }
                    str9 = c9;
                    if (dx90Var.p()) {
                    }
                    l3 = Long.valueOf(b2);
                    Object obj32222222222 = SchemeStat$TypeAppStarts.StartMethod.SPRINGBOARD;
                    Preference preference2222222222 = Preference.a;
                    preference2222222222.getClass();
                    obj = Preference.y(SchemeStat$TypeAppStarts.StartMethod.class, "performance", "__app_performance_start_method__").get();
                    if (obj != null) {
                    }
                    SchemeStat$TypeAppStarts.StartMethod startMethod32222222222 = (SchemeStat$TypeAppStarts.StartMethod) obj32222222222;
                    Preference.C("performance", "__app_performance_start_method__");
                    Object obj42222222222 = SchemeStat$TypeAppStarts.StartType.COLD;
                    preference2222222222.getClass();
                    obj2 = Preference.y(SchemeStat$TypeAppStarts.StartType.class, "performance", "__app_performance_start_type__").get();
                    if (obj2 != null) {
                    }
                    SchemeStat$TypeAppStarts.StartType startType22222222222 = (SchemeStat$TypeAppStarts.StartType) obj42222222222;
                    Preference.C("performance", "__app_performance_start_type__");
                    String s3222222222 = Preference.s("performance", "__app_performance_start_method_payload__", "");
                    Preference.C("performance", "__app_performance_start_method_payload__");
                    boolean d192222222222 = Preference.d("performance", "__app_performance_early_anr_last_session__", false);
                    Preference.C("performance", "__app_performance_early_anr_last_session__");
                    kw90 kw90Var2222222222 = new kw90(valueOf9, valueOf10, valueOf11, valueOf12, jw90Var, lw90Var, valueOf13, valueOf14, valueOf16, valueOf15, valueOf17, valueOf18, Boolean.valueOf(z4), Boolean.valueOf(d), str, str2, str3, str4, str5, str6, str7, str8, str9, l3, startMethod32222222222, startType22222222222, s3222222222, d192222222222, iw90Var);
                    dx90Var.O = true;
                    dx90Var.r();
                    String a22222222222 = l93Var2.a();
                    k93 a32222222222 = AppStartReporter.a();
                    dx90.l(scrollScreenType, true);
                    dx90.l(scrollScreenType2, true);
                    dx90.l(scrollScreenType3, true);
                    dx90.l(scrollScreenType4, true);
                    dx90.l(scrollScreenType5, true);
                    dx90.l(scrollScreenType6, true);
                    dx90.l(scrollScreenType7, true);
                    dx90.i(scrollScreenType);
                    dx90.i(scrollScreenType8);
                    dx90.i(scrollScreenType9);
                    dx90.l(scrollScreenType10, true);
                    dx90.l(scrollScreenType11, true);
                    dx90.i(scrollScreenType12);
                    dx90.i(scrollScreenType13);
                    dx90.i(scrollScreenType14);
                    dx90.g(motionLayoutScreenType);
                    dx90.l(scrollScreenType15, true);
                    dx90.l(scrollScreenType16, true);
                    dx90.l(scrollScreenType17, true);
                    Pair pair3222222222 = new Pair(Long.valueOf(Preference.j().getLong("__app_start_camera_front_resolution__", 0L)), Long.valueOf(Preference.j().getLong("__app_start_camera_back_resolution__", 0L)));
                    long longValue5222222222 = ((Number) pair3222222222.d()).longValue();
                    long longValue22222222222 = ((Number) pair3222222222.g()).longValue();
                    xuo0.a.getClass();
                    long a42222222222 = xuo0.a();
                    long j5222222222 = Preference.j().getLong("__app_start_last_time__", 0L);
                    ky6.a aVar22222222222 = (ky6.a) Preference.j().edit();
                    aVar22222222222.putLong("__app_start_last_time__", a42222222222);
                    aVar22222222222.apply();
                    Pair pair22222222222 = new Pair(Long.valueOf(a42222222222), Long.valueOf(j5222222222));
                    long longValue32222222222 = ((Number) pair22222222222.d()).longValue();
                    long longValue42222222222 = ((Number) pair22222222222.g()).longValue();
                    uj9 uj9Var2222222222 = new uj9(longValue5222222222, longValue22222222222);
                    int[] iArr2222222222 = AppStartReporter.a.$EnumSwitchMapping$0;
                    i = iArr2222222222[startMethod32222222222.ordinal()];
                    if (i == 1) {
                    }
                    startMethod2.j(s3222222222);
                    List u03222222222 = rl3.u0(new dyp[]{new w5m(), new lv6(), new vah0(), new ekt(appCompatActivity2), new xil0(), new a260(kw90Var2222222222, l93Var2), new ch9(uj9Var2222222222), new t220(a32222222222, kw90Var2222222222), new hy90(appCompatActivity2), new gmr(kw90Var2222222222.e), new tgs(kw90Var2222222222.f), new zpn0(), new w33(kw90Var2222222222, l93Var2), new upk0(new kqk0(startMethod2, startType22222222222, longValue32222222222, longValue42222222222)), new x83()});
                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts22222222222 = new SchemeStat$TypeAppStarts(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
                    it = u03222222222.iterator();
                    SchemeStat$TypeAppStarts schemeStat$TypeAppStarts32222222222 = schemeStat$TypeAppStarts22222222222;
                    while (it.hasNext()) {
                    }
                    kx6 kx6Var2222222222 = new kx6();
                    kx6Var2222222222.f = schemeStat$TypeAppStarts32222222222;
                    kx6Var2222222222.q();
                    coreFeatures = CoreFeatures.ONE_EVENT_TEST;
                    coreFeatures.getClass();
                    bVar = com.vk.toggle.b.A;
                    if (!bVar.a(coreFeatures)) {
                    }
                    if (!com.vk.toggle.d.q().a("type_app_starts")) {
                    }
                    if (Preference.j().contains("__app_start_clean_boot__")) {
                    }
                    num = kw90Var2222222222.c;
                    num2 = kw90Var2222222222.b;
                    if (num == null) {
                    }
                    new rlk0(num, num2).q();
                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem3222222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.VIDEO_DOWNLOADS_SIZE.h(), null, null, Integer.valueOf((int) a32222222222.c), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 3, null);
                    l5m l5mVar3222222222 = new l5m(null, null, 3);
                    l5mVar3222222222.g = schemeStat$TypeDevNullItem3222222222;
                    l5mVar3222222222.q();
                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem22222222222 = new SchemeStat$TypeDevNullItem(DevNullEventKey.OFFLINE_MUSIC_SIZE.h(), null, null, Integer.valueOf((int) a32222222222.a), null, Integer.valueOf((int) a32222222222.b), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                    l5m l5mVar22222222222 = new l5m(null, null, 3);
                    l5mVar22222222222.g = schemeStat$TypeDevNullItem22222222222;
                    l5mVar22222222222.q();
                    t = schemeStat$TypeAppStarts.t();
                    bool = Boolean.TRUE;
                    if (epx.f(t, bool)) {
                    }
                    if (epx.f(schemeStat$TypeAppStarts.s(), bool)) {
                    }
                    return s3q0.a;
                }
            }).r0(asu0.a.c());
            f93 f93Var = new f93(new e93(startType, startMethod, z), 0);
            int i = kwg0.a;
            r0.subscribe(f93Var, new hwg0());
            c subscribe = io.reactivex.rxjava3.core.a.s(24L, timeUnit, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.g93
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    AppStartReporter.c(AppStartReporter.StartMethod.this, true, appCompatActivity, l93Var, z2);
                }
            });
            m93 m93Var = b;
            if (!m93Var.b) {
                appCompatActivity.getApplication().registerActivityLifecycleCallbacks(m93Var);
                m93Var.b = true;
            }
            m93Var.c.b(subscribe);
            ScheduledExecutorService u = asu0.u();
            h93 h93Var = new h93();
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            u.schedule(h93Var, 20L, timeUnit2);
            asu0.u().schedule(new i93(), 25L, timeUnit2);
        }
    }

    public static int d(SchemeStat$TypeAppStarts.StartMethod startMethod) {
        int i = a.$EnumSwitchMapping$0[startMethod.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i2;
    }
}
