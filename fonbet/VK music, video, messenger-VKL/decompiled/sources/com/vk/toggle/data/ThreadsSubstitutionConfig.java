package com.vk.toggle.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.asp;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.rl3;
import xsna.zrp;

/* compiled from: ThreadsSubstitutionConfig.kt */
/* loaded from: classes11.dex */
public final class ThreadsSubstitutionConfig {
    public static volatile ThreadsSubstitutionConfig b;
    public final List<Target> a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThreadsSubstitutionConfig.kt */
    /* loaded from: classes6.dex */
    public static final class Substitution {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Substitution[] $VALUES;
        public static final Substitution COMPUTATION;
        public static final Substitution IO;
        public static final Substitution SINGLE_THREAD;

        static {
            Substitution substitution = new Substitution("SINGLE_THREAD", 0);
            SINGLE_THREAD = substitution;
            Substitution substitution2 = new Substitution("IO", 1);
            IO = substitution2;
            Substitution substitution3 = new Substitution("COMPUTATION", 2);
            COMPUTATION = substitution3;
            Substitution[] substitutionArr = {substitution, substitution2, substitution3};
            $VALUES = substitutionArr;
            $ENTRIES = new asp(substitutionArr);
        }

        public Substitution() {
            throw null;
        }

        public static Substitution valueOf(String str) {
            return (Substitution) Enum.valueOf(Substitution.class, str);
        }

        public static Substitution[] values() {
            return (Substitution[]) $VALUES.clone();
        }
    }

    /* compiled from: ThreadsSubstitutionConfig.kt */
    public static final class a {
        public static ThreadsSubstitutionConfig a(String str) {
            Object obj;
            List<String> b0 = drm0.b0(str, new char[]{','}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (String str2 : b0) {
                Iterator<E> it = Target.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((Target) obj).i(), str2)) {
                        break;
                    }
                }
                Target target = (Target) obj;
                if (target != null) {
                    arrayList.add(target);
                }
            }
            return new ThreadsSubstitutionConfig(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadsSubstitutionConfig(List<? extends Target> list) {
        this.a = list;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThreadsSubstitutionConfig.kt */
    /* loaded from: classes6.dex */
    public static final class Target {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Target[] $VALUES;
        public static final Target AND_MEDIA_DS;
        public static final Target AND_MEDIA_TRANS;
        public static final Target ANONYMOUS_TOKEN;
        public static final Target CAMERA_UI;
        public static final Target CLIPS_DECODE;
        public static final Target CLIP_UTILS;
        public static final Target EXO_OFFLINE;
        public static final Target FB_PERF;
        public static final Target FIREBASE_CONCURRENCY;
        public static final Target FRESCO_CACHE;
        public static final Target GOOGLE_DT;
        public static final Target GOOGLE_MAPS_CL;
        public static final Target HUAWEI_HEALTH;
        public static final Target MY_TARGET;
        public static final Target MY_TARGET2;
        public static final Target MY_TRACKER;
        public static final Target OK_CALLS;
        public static final Target OK_WEB_RTC;
        public static final Target ONE_LOG;
        public static final Target RECYCLER;
        public static final Target SUPER_APP_STAT;
        public static final Target X_CAMERA;
        public static final Target X_CORE;
        private final Set<String> classes;
        private final String featureName;
        private int invocation;
        private final List<Substitution> substitutions;

        static {
            Substitution substitution = Substitution.SINGLE_THREAD;
            Target target = new Target("MY_TRACKER", 0, "my_tracker", substitution, rl3.y0(new String[]{"com.my.tracker.obfuscated.m", "com.my.tracker.plugins.PluginEventTracker"}));
            MY_TRACKER = target;
            Target target2 = new Target("CAMERA_UI", 1, "camera_ui", substitution, "com.vk.camera.ui.SuperappQrCameraFragment");
            CAMERA_UI = target2;
            Substitution substitution2 = Substitution.IO;
            Target target3 = new Target("ANONYMOUS_TOKEN", 2, "anon_token", substitution2, "com.vk.api.external.anonymous.AnonymousTokenProvider");
            ANONYMOUS_TOKEN = target3;
            Target target4 = new Target("OK_CALLS", 3, "ok_calls", substitution, "ru.ok.android.externcalls.sdk.ConversationFactory");
            OK_CALLS = target4;
            Target target5 = new Target("OK_WEB_RTC", 4, "ok_web_rtc", substitution, rl3.y0(new String[]{"ru.ok.android.webrtc.di.CallModuleImpl", "ru.ok.android.webrtc.utils.PCExecutor"}));
            OK_WEB_RTC = target5;
            Target target6 = new Target("SUPER_APP_STAT", 5, "super_app_stat", substitution2, "com.vk.superapp.statinteractor.impl.di.StatInteractorComponentImpl");
            SUPER_APP_STAT = target6;
            Target target7 = new Target("FB_PERF", 6, "fb_perf", substitution, "com.google.firebase.perf.config.DeviceCacheManager");
            FB_PERF = target7;
            Target target8 = new Target("MY_TARGET", 7, "my_target", substitution, "com.my.target.m0");
            MY_TARGET = target8;
            Target target9 = new Target("AND_MEDIA_TRANS", 8, "and_media_trans", substitution2, "androidx.media3.transformer.DefaultAssetLoaderFactory");
            AND_MEDIA_TRANS = target9;
            Target target10 = new Target("AND_MEDIA_DS", 9, "and_media_ds", substitution2, "androidx.media3.datasource.DataSourceBitmapLoader");
            AND_MEDIA_DS = target10;
            Target target11 = new Target("ONE_LOG", 10, "one_log", substitution2, "one.video.statistics.onelog.OneLogVideo");
            ONE_LOG = target11;
            Target target12 = new Target("GOOGLE_DT", 11, "google_dt", substitution2, "com.google.android.datatransport.runtime.ExecutionModule");
            GOOGLE_DT = target12;
            Substitution substitution3 = Substitution.COMPUTATION;
            Target target13 = new Target("GOOGLE_MAPS_CL", 12, "google_maps_cl", substitution3, "com.google.maps.android.clustering.view.DefaultClusterRenderer");
            GOOGLE_MAPS_CL = target13;
            Target target14 = new Target("HUAWEI_HEALTH", 13, "huawei_health", substitution2, "com.huawei.hms.hihealth.HiHealthKitClient");
            HUAWEI_HEALTH = target14;
            Target target15 = new Target("FRESCO_CACHE", 14, "fresco_cache", substitution2, "com.facebook.imagepipeline.core.DiskStorageCacheFactory");
            FRESCO_CACHE = target15;
            Target target16 = new Target(15, "FIREBASE_CONCURRENCY", "fb_conc", "com.google.firebase.concurrent.ExecutorsRegistrar", e43.l(substitution3, substitution2));
            FIREBASE_CONCURRENCY = target16;
            Target target17 = new Target(16, "MY_TARGET2", "my_target2", "com.my.target.n0", e43.l(substitution3, substitution2));
            MY_TARGET2 = target17;
            Target target18 = new Target("EXO_OFFLINE", 17, "exo_off", substitution2, "one.video.exo.offline.OfflineHelper");
            EXO_OFFLINE = target18;
            Target target19 = new Target("RECYCLER", 18, "recyc", substitution3, "androidx.recyclerview.widget.AsyncDifferConfig$Builder");
            RECYCLER = target19;
            Target target20 = new Target("X_CAMERA", 19, "x_cam", substitution2, "androidx.camera.core.impl.utils.executor.IoExecutor");
            X_CAMERA = target20;
            Target target21 = new Target("X_CORE", 20, "x_core", substitution2, "androidx.arch.core.executor.DefaultTaskExecutor");
            X_CORE = target21;
            Target target22 = new Target("CLIPS_DECODE", 21, "clips_decode", substitution3, "com.vk.media.pipeline.transcoder.decoding.video.ParallelPreparingDecodersController");
            CLIPS_DECODE = target22;
            Target target23 = new Target("CLIP_UTILS", 22, "clips_utils", substitution3, "ru.ok.gl.util.ThreadHelper$BackgroundExecutorHolder");
            CLIP_UTILS = target23;
            Target[] targetArr = {target, target2, target3, target4, target5, target6, target7, target8, target9, target10, target11, target12, target13, target14, target15, target16, target17, target18, target19, target20, target21, target22, target23};
            $VALUES = targetArr;
            $ENTRIES = new asp(targetArr);
        }

        public Target(int i, String str, String str2, String str3, List list) {
            this(str, i, str2, list, Collections.singleton(str3));
        }

        public static zrp<Target> h() {
            return $ENTRIES;
        }

        public static Target valueOf(String str) {
            return (Target) Enum.valueOf(Target.class, str);
        }

        public static Target[] values() {
            return (Target[]) $VALUES.clone();
        }

        public final String i() {
            return this.featureName;
        }

        public final boolean j(String str) {
            return this.classes.contains(str);
        }

        public final Substitution k() {
            List<Substitution> list = this.substitutions;
            int i = this.invocation;
            this.invocation = i + 1;
            Substitution substitution = list.get(i);
            this.invocation %= this.substitutions.size();
            return substitution;
        }

        public Target(String str, int i, String str2, Substitution substitution, String str3) {
            this(str, i, str2, Collections.singletonList(substitution), Collections.singleton(str3));
        }

        public Target(String str, int i, String str2, Substitution substitution, Set set) {
            this(str, i, str2, Collections.singletonList(substitution), set);
        }

        public Target(String str, int i, String str2, List list, Set set) {
            this.featureName = str2;
            this.substitutions = list;
            this.classes = set;
        }
    }
}
