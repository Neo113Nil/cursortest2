package com.vk.libvideo.autoplay;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.AdSection;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.InstreamAd;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrlInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.ad.MyTargetAdLoadingState;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.a;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.autoplay.background.controller.j;
import com.vk.libvideo.autoplay.e;
import com.vk.libvideo.autoplay.j;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.exceptions.BadVideoFileException;
import com.vk.libvideo.exceptions.RestrictedVideoFileException;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.autoplay.ad_pixels.AutoPlayAdPixelsTrackerType;
import com.vk.libvideo.models.history.ForceLogReason;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import com.vk.media.player.PlayerError;
import com.vk.media.player.VideoMode;
import com.vk.media.player.VideoPlayerType;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.movika.sdk.base.ui.s;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticPlayheadReachedUrl;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityMrcUrl;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityOvvUrl;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vk.statistic.TargetPlayheadViewability;
import com.vk.toggle.features.VideoFeatures;
import defpackage.j0;
import defpackage.q0;
import io.appmetrica.analytics.impl.L2;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.flowable.r0;
import io.reactivex.rxjava3.internal.operators.flowable.u0;
import io.reactivex.rxjava3.internal.operators.single.b0;
import io.reactivex.rxjava3.internal.operators.single.e0;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import one.video.ad.model.Advertisement;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.FrameSize;
import one.video.player.model.VideoContentType;
import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import one.video.smartcast.api.ConnectionState;
import one.video.stat.transport.Param;
import one.video.stat2.ContentType;
import one.video.stat2.Event;
import one.video.stat2.Mode;
import one.video.stat2.a;
import one.video.transform.TransformController;
import org.json.JSONObject;
import xsna.a6q;
import xsna.ad0;
import xsna.afl0;
import xsna.ah5;
import xsna.ajt0;
import xsna.asp;
import xsna.asu0;
import xsna.awp;
import xsna.b6z0;
import xsna.b990;
import xsna.bgn;
import xsna.bj80;
import xsna.bjm0;
import xsna.bmp0;
import xsna.bpn0;
import xsna.bps0;
import xsna.brm0;
import xsna.buy0;
import xsna.bwt0;
import xsna.c360;
import xsna.c5g;
import xsna.c63;
import xsna.c8x;
import xsna.cfz0;
import xsna.chs0;
import xsna.cms0;
import xsna.cqm0;
import xsna.cy20;
import xsna.d3b0;
import xsna.d8x;
import xsna.dh1;
import xsna.dh40;
import xsna.dso0;
import xsna.dst0;
import xsna.dx1;
import xsna.dy2;
import xsna.e43;
import xsna.e8x;
import xsna.e9z0;
import xsna.een0;
import xsna.ejf0;
import xsna.els0;
import xsna.emh0;
import xsna.epx;
import xsna.eul0;
import xsna.ezs0;
import xsna.f0s0;
import xsna.f7q0;
import xsna.fd90;
import xsna.fpf0;
import xsna.fuk0;
import xsna.fxc0;
import xsna.g3s0;
import xsna.gpt0;
import xsna.gu8;
import xsna.gzs;
import xsna.h4f0;
import xsna.h6r;
import xsna.h84;
import xsna.h8z0;
import xsna.hd4;
import xsna.hg1;
import xsna.hhj0;
import xsna.hk0;
import xsna.hnt0;
import xsna.hu70;
import xsna.i11;
import xsna.i4f0;
import xsna.id4;
import xsna.ie3;
import xsna.ikk0;
import xsna.irc0;
import xsna.irt0;
import xsna.iw3;
import xsna.izs;
import xsna.j3s0;
import xsna.j5g;
import xsna.j8x;
import xsna.jc0;
import xsna.je0;
import xsna.jgz;
import xsna.ji;
import xsna.jps0;
import xsna.jw5;
import xsna.jw80;
import xsna.k3s0;
import xsna.kcc0;
import xsna.l3s0;
import xsna.lhg;
import xsna.li5;
import xsna.lo70;
import xsna.ltb0;
import xsna.lwp;
import xsna.lzl0;
import xsna.m1n0;
import xsna.m360;
import xsna.m3s0;
import xsna.m63;
import xsna.m7q;
import xsna.m7s0;
import xsna.mcr0;
import xsna.mdk0;
import xsna.mlf0;
import xsna.mm80;
import xsna.msy;
import xsna.mv70;
import xsna.mwp;
import xsna.mx8;
import xsna.mza0;
import xsna.n0z0;
import xsna.n1s0;
import xsna.n240;
import xsna.n3s0;
import xsna.nit;
import xsna.nm60;
import xsna.nza0;
import xsna.o1b0;
import xsna.o25;
import xsna.o3s0;
import xsna.o5h0;
import xsna.od0;
import xsna.oiz0;
import xsna.ojt0;
import xsna.owp;
import xsna.oyk0;
import xsna.oyr;
import xsna.ozl;
import xsna.p1d0;
import xsna.p7z0;
import xsna.p99;
import xsna.pgn;
import xsna.pgz0;
import xsna.pn00;
import xsna.pnf;
import xsna.pod0;
import xsna.pvo0;
import xsna.pxv;
import xsna.q44;
import xsna.q4s0;
import xsna.q7s0;
import xsna.q9k;
import xsna.qcy;
import xsna.qg90;
import xsna.qjo0;
import xsna.qoy;
import xsna.qu5;
import xsna.r2u0;
import xsna.rbx0;
import xsna.rhh0;
import xsna.rl3;
import xsna.rlt0;
import xsna.rm80;
import xsna.rts0;
import xsna.ryk0;
import xsna.rzr0;
import xsna.s3q0;
import xsna.s3z0;
import xsna.sf4;
import xsna.sht0;
import xsna.skj0;
import xsna.sqf0;
import xsna.sr10;
import xsna.t5t0;
import xsna.t810;
import xsna.tbe0;
import xsna.tqf0;
import xsna.tu70;
import xsna.u0m;
import xsna.u6z0;
import xsna.ue0;
import xsna.uht0;
import xsna.ujs0;
import xsna.um80;
import xsna.utg0;
import xsna.uu70;
import xsna.uw3;
import xsna.v3t0;
import xsna.v7s0;
import xsna.vcz0;
import xsna.ve0;
import xsna.vhz0;
import xsna.vm80;
import xsna.vpj0;
import xsna.vrn0;
import xsna.vw3;
import xsna.vw4;
import xsna.vyr0;
import xsna.wgt0;
import xsna.who0;
import xsna.wn;
import xsna.wn80;
import xsna.ww3;
import xsna.wzs;
import xsna.xa30;
import xsna.xds0;
import xsna.xg2;
import xsna.xh5;
import xsna.xk80;
import xsna.xn;
import xsna.xt9;
import xsna.ye0;
import xsna.yft0;
import xsna.yg5;
import xsna.yh0;
import xsna.yh5;
import xsna.yi80;
import xsna.yx30;
import xsna.z2s0;
import xsna.ze0;
import xsna.zh5;
import xsna.zi0;
import xsna.zrp;
import xsna.zva0;

/* compiled from: VideoAutoPlay.kt */
/* loaded from: classes2.dex */
public final class VideoAutoPlay implements yg5, e.a, fuk0, hu70, u0m {
    public static final a q0;
    public static final /* synthetic */ qcy<Object>[] r0;
    public static final vw3 s0;
    public WeakReference<VideoTextureView> A;
    public WeakReference<RecyclerView.e0> B;
    public int C;
    public OneVideoPlaybackException.ErrorCode D;
    public Throwable E;
    public rlt0 F;
    public final boolean G;
    public one.video.stat2.a H;
    public long I;
    public final com.vk.libvideo.autoplay.f J;
    public String K;
    public int L;
    public boolean M;
    public ye0 N;
    public yh0 O;
    public boolean P;
    public final io.reactivex.rxjava3.disposables.b Q;
    public final j.a R;
    public boolean S;
    public final m7s0 T;
    public final ad0 U;
    public final bpn0 V;
    public final jps0 W;
    public final zi0 X;
    public final boolean Y;
    public final boolean Z;
    public final n3s0 a0;
    public final mx8 b;
    public final m3s0 b0;
    public final yh5 c;
    public final o3s0 c0;
    public final rhh0 d;
    public final Object d0;
    public final ezs0 e;
    public final Object e0;
    public final v3t0 f;
    public final Object f0;
    public final od0 g;
    public final ArrayList<um80> g0;
    public final com.vk.libvideo.autoplay.background.controller.j h;
    public final bpn0 h0;
    public final f0s0 i;
    public final Object i0;
    public final vyr0 j;
    public m7q j0;
    public final VideoAdvertisementsRepository k;
    public m7q k0;
    public final ajt0 l;
    public sht0 l0;
    public final com.vk.movika.sdk.base.data.converter.c m;
    public VideoMode m0;
    public final Handler n = new Handler(Looper.getMainLooper());
    public boolean n0;
    public final boolean o;
    public b o0;
    public final yft0 p;
    public d3b0 p0;
    public final Object q;
    public final bpn0 r;
    public final bgn s;
    public final ujs0 t;
    public VideoFile u;
    public String v;
    public String w;
    public AutoPlayState x;
    public final VideoUIEventDispatcher y;
    public final ah5 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAutoPlay.kt */
    public static final class AutoPlayState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AutoPlayState[] $VALUES;
        public static final AutoPlayState CONFIRMED;
        public static final AutoPlayState PAUSED_PREPARE;
        public static final AutoPlayState PAUSED_STRONG;
        public static final AutoPlayState PAUSED_WEAK;
        public static final AutoPlayState PLAY;
        public static final AutoPlayState RESTRICTED_STRONG;
        public static final AutoPlayState STOP;

        static {
            AutoPlayState autoPlayState = new AutoPlayState("PLAY", 0);
            PLAY = autoPlayState;
            AutoPlayState autoPlayState2 = new AutoPlayState("PAUSED_PREPARE", 1);
            PAUSED_PREPARE = autoPlayState2;
            AutoPlayState autoPlayState3 = new AutoPlayState("PAUSED_WEAK", 2);
            PAUSED_WEAK = autoPlayState3;
            AutoPlayState autoPlayState4 = new AutoPlayState("PAUSED_STRONG", 3);
            PAUSED_STRONG = autoPlayState4;
            AutoPlayState autoPlayState5 = new AutoPlayState("CONFIRMED", 4);
            CONFIRMED = autoPlayState5;
            AutoPlayState autoPlayState6 = new AutoPlayState("RESTRICTED_STRONG", 5);
            RESTRICTED_STRONG = autoPlayState6;
            AutoPlayState autoPlayState7 = new AutoPlayState("STOP", 6);
            STOP = autoPlayState7;
            AutoPlayState[] autoPlayStateArr = {autoPlayState, autoPlayState2, autoPlayState3, autoPlayState4, autoPlayState5, autoPlayState6, autoPlayState7};
            $VALUES = autoPlayStateArr;
            $ENTRIES = new asp(autoPlayStateArr);
        }

        public AutoPlayState() {
            throw null;
        }

        public static AutoPlayState valueOf(String str) {
            return (AutoPlayState) Enum.valueOf(AutoPlayState.class, str);
        }

        public static AutoPlayState[] values() {
            return (AutoPlayState[]) $VALUES.clone();
        }

        public final boolean h() {
            return this == PAUSED_PREPARE || this == PAUSED_WEAK || this == PAUSED_STRONG;
        }
    }

    /* compiled from: VideoAutoPlay.kt */
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoAutoPlay.kt */
        /* renamed from: com.vk.libvideo.autoplay.VideoAutoPlay$a$a, reason: collision with other inner class name */
        public static final class EnumC1205a {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ EnumC1205a[] $VALUES;
            public static final EnumC1205a STAT_SESSION_INIT_OVID_IS_NAN;
            public static final EnumC1205a STAT_SESSION_INIT_OVID_IS_NULL;
            public static final EnumC1205a STAT_SESSION_INIT_SOURCE_HOST_IS_NULL;
            public static final EnumC1205a STAT_SESSION_INIT_SOURCE_IS_NULL;
            private final String value;

            static {
                EnumC1205a enumC1205a = new EnumC1205a("STAT_SESSION_INIT_SOURCE_IS_NULL", 0, "stat_si_src_null");
                STAT_SESSION_INIT_SOURCE_IS_NULL = enumC1205a;
                EnumC1205a enumC1205a2 = new EnumC1205a("STAT_SESSION_INIT_SOURCE_HOST_IS_NULL", 1, "stat_si_src_host_null");
                STAT_SESSION_INIT_SOURCE_HOST_IS_NULL = enumC1205a2;
                EnumC1205a enumC1205a3 = new EnumC1205a("STAT_SESSION_INIT_OVID_IS_NULL", 2, "stat_si_ovid_null");
                STAT_SESSION_INIT_OVID_IS_NULL = enumC1205a3;
                EnumC1205a enumC1205a4 = new EnumC1205a("STAT_SESSION_INIT_OVID_IS_NAN", 3, "stat_si_ovid_nan");
                STAT_SESSION_INIT_OVID_IS_NAN = enumC1205a4;
                EnumC1205a[] enumC1205aArr = {enumC1205a, enumC1205a2, enumC1205a3, enumC1205a4};
                $VALUES = enumC1205aArr;
                $ENTRIES = new asp(enumC1205aArr);
            }

            public EnumC1205a(String str, int i, String str2) {
                this.value = str2;
            }

            public static EnumC1205a valueOf(String str) {
                return (EnumC1205a) Enum.valueOf(EnumC1205a.class, str);
            }

            public static EnumC1205a[] values() {
                return (EnumC1205a[]) $VALUES.clone();
            }
        }

        /* compiled from: VideoAutoPlay.kt */
        public static final /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoMode.values().length];
                try {
                    iArr[VideoMode.PREFETCH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoMode.FULLSCREEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VideoMode.PIP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VideoMode.CHROMECAST.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[VideoMode.DLNA.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[VideoMode.SCREENCAST.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[VideoMode.INVISIBLE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[VideoMode.MINIMIZED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[VideoMode.EMPTY.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static final d a(a aVar, VideoMode videoMode) {
            Mode mode;
            aVar.getClass();
            switch (b.$EnumSwitchMapping$0[videoMode.ordinal()]) {
                case 1:
                    mode = Mode.INVALID;
                    break;
                case 2:
                    mode = Mode.FULLSCREEN;
                    break;
                case 3:
                    mode = Mode.PIP_EXTERNAL;
                    break;
                case 4:
                    mode = Mode.CHROMECAST;
                    break;
                case 5:
                    mode = Mode.EXTERNAL;
                    break;
                case 6:
                    mode = Mode.INVALID;
                    break;
                case 7:
                    mode = Mode.INVALID;
                    break;
                case 8:
                    mode = Mode.PIP_IN_APP;
                    break;
                case 9:
                    mode = Mode.INLINE;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new d(mode, videoMode != VideoMode.INVISIBLE, videoMode == VideoMode.PREFETCH);
        }
    }

    /* compiled from: VideoAutoPlay.kt */
    public static final class b {
        public final long a;
        public final boolean b;

        public b(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LogInfo(startTime=");
            sb.append(this.a);
            sb.append(", firstFrameRenderedOnce=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoAutoPlay.kt */
    public static abstract class c {

        /* compiled from: VideoAutoPlay.kt */
        public static final class a extends c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1623122207;
            }

            public final String toString() {
                return "PlayVideo";
            }
        }

        /* compiled from: VideoAutoPlay.kt */
        public static final class b extends c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 365446326;
            }

            public final String toString() {
                return "ResumeAd";
            }
        }

        /* compiled from: VideoAutoPlay.kt */
        /* renamed from: com.vk.libvideo.autoplay.VideoAutoPlay$c$c, reason: collision with other inner class name */
        public static final class C1206c extends c {
            public static final C1206c a = new C1206c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1206c);
            }

            public final int hashCode() {
                return -554388803;
            }

            public final String toString() {
                return "ShowPreRoll";
            }
        }

        /* compiled from: VideoAutoPlay.kt */
        public static final class d extends c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1720493906;
            }

            public final String toString() {
                return "UpcomingLive";
            }
        }
    }

    /* compiled from: VideoAutoPlay.kt */
    public static final class d {
        public final Mode a;
        public final boolean b;
        public final boolean c;

        public d(Mode mode, boolean z, boolean z2) {
            this.a = mode;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatModeInfo(newStatMode=");
            sb.append(this.a);
            sb.append(", visible=");
            sb.append(this.b);
            sb.append(", prefetch=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoAutoPlay.kt */
    public static final class e {
        public final VideoFile a;
        public final m7q b;

        public e(VideoFile videoFile, m7q m7qVar) {
            this.a = videoFile;
            this.b = m7qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "VideoFileWithSource(videoFile=" + this.a + ", exoVideoSource=" + this.b + ')';
        }
    }

    /* compiled from: VideoAutoPlay.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[AutoPlayAdPixelsTrackerType.values().length];
            try {
                iArr[AutoPlayAdPixelsTrackerType.NEWSFEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoPlayAdPixelsTrackerType.CLIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AutoPlayAdPixelsTrackerType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RepeatMode.values().length];
            try {
                iArr2[RepeatMode.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RepeatMode.BY_VIDEO_PARAMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RepeatMode.ALWAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PlayerType.values().length];
            try {
                iArr3[PlayerType.CAROUSEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PlayerType.INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PlayerType.FULLSCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AdSection.values().length];
            try {
                iArr4[AdSection.PREROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[AdSection.MIDROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[AdSection.POSTROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class g<T> implements Comparator {
        public final /* synthetic */ String b;

        public g(String str) {
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str = ((who0) ((one.video.player.tracks.b) t2).c).c;
            String str2 = this.b;
            return jw5.b(Boolean.valueOf(epx.f(str, str2)), Boolean.valueOf(epx.f(((who0) ((one.video.player.tracks.b) t).c).c, str2)));
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class h<T> implements Comparator {
        public final /* synthetic */ i b;

        public h(i iVar) {
            this.b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.b.compare(t, t2);
            return compare != 0 ? compare : jw5.b(Boolean.valueOf(((one.video.player.tracks.b) t).d), Boolean.valueOf(((one.video.player.tracks.b) t2).d));
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class i<T> implements Comparator {
        public final /* synthetic */ g b;
        public final /* synthetic */ String c;

        public i(g gVar, String str) {
            this.b = gVar;
            this.c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.b.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            String str = ((who0) ((one.video.player.tracks.b) t2).c).c;
            String str2 = this.c;
            return jw5.b(Boolean.valueOf(epx.f(str, str2)), Boolean.valueOf(epx.f(((who0) ((one.video.player.tracks.b) t).c).c, str2)));
        }
    }

    /* compiled from: VideoAutoPlay.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<d3b0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(d3b0 d3b0Var) {
            d3b0 d3b0Var2 = d3b0Var;
            VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.receiver;
            o3s0 o3s0Var = videoAutoPlay.c0;
            if (videoAutoPlay.g1()) {
                d3b0 d3b0Var3 = videoAutoPlay.p0;
                if (d3b0Var3 != null) {
                    d3b0Var3.a();
                }
                Objects.toString(d3b0Var2);
                new Exception();
            }
            if (videoAutoPlay.G) {
                videoAutoPlay.J1();
            }
            videoAutoPlay.O1(false);
            a aVar = VideoAutoPlay.q0;
            long position = videoAutoPlay.getPosition();
            aVar.getClass();
            videoAutoPlay.M = !(position <= 1000);
            OneVideoPlayer a = d3b0Var2.a();
            if (a != null) {
                a.d0(o3s0Var);
            }
            OneVideoPlayer a2 = d3b0Var2.a();
            if (a2 != null) {
                a2.a0(o3s0Var);
            }
            nza0 h = d3b0Var2.h();
            if (h != null) {
                h.i = new rbx0(new yx30(videoAutoPlay));
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(VideoAutoPlay.class, "autoPlayConfig", "getAutoPlayConfig()Lcom/vk/libvideo/autoplay/AutoPlayConfig;", 0);
        fpf0.a.getClass();
        r0 = new qcy[]{mutablePropertyReference1Impl};
        q0 = new a();
        s0 = ww3.a("VideoAutoPlay");
    }

    public VideoAutoPlay(VideoFile videoFile, v7s0 v7s0Var, mx8 mx8Var, zh5 zh5Var, rhh0 rhh0Var, ezs0 ezs0Var, v3t0 v3t0Var, od0 od0Var, com.vk.libvideo.autoplay.background.controller.j jVar, f0s0 f0s0Var, vyr0 vyr0Var, VideoAdvertisementsRepository videoAdvertisementsRepository, ajt0 ajt0Var, com.vk.movika.sdk.base.data.converter.c cVar, AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType, mwp mwpVar) {
        boolean z;
        this.b = mx8Var;
        this.c = zh5Var;
        this.d = rhh0Var;
        this.e = ezs0Var;
        this.f = v3t0Var;
        this.g = od0Var;
        this.h = jVar;
        this.i = f0s0Var;
        this.j = vyr0Var;
        this.k = videoAdvertisementsRepository;
        this.l = ajt0Var;
        this.m = cVar;
        boolean z2 = mwpVar != null;
        this.o = z2;
        yft0 yft0Var = new yft0(z2, mwpVar == null ? mwp.g : mwpVar, new com.vk.libvideo.autoplay.h(this));
        this.p = yft0Var;
        this.q = msy.a(LazyThreadSafetyMode.PUBLICATION, new ltb0(11));
        bpn0 bpn0Var = new bpn0(new eul0(3));
        int i2 = 9;
        this.r = new bpn0(new kcc0(i2));
        this.s = new bgn(this);
        boolean z3 = !z2;
        c360.a aVar = fxc0.B().i().e() ? c360.a.d : c360.a.c;
        boolean booleanValue = ((Boolean) bpn0Var.getValue()).booleanValue();
        int i3 = 6;
        tu70.a aVar2 = tu70.a.C3775a.b;
        if (booleanValue) {
            uu70 b2 = com.vk.toggle.d.x.b();
            uu70.b bVar = (b2 == null ? new uu70(uu70.b.a.a) : b2).a;
            if (bVar instanceof uu70.b.C3834b) {
                uu70.b.C3834b c3834b = (uu70.b.C3834b) bVar;
                z = z3;
                aVar2 = new tu70.a.b(c3834b.a, c3834b.b, new een0(i3, this, bVar));
            } else {
                z = z3;
                if (!epx.f(bVar, uu70.b.a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            z = z3;
        }
        mm80 f2 = ezs0Var.f();
        VideoFeatures videoFeatures = VideoFeatures.USE_EXTENDED_BROKEN_SOURCE_MARKER;
        videoFeatures.getClass();
        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
        ujs0 ujs0Var = new ujs0(z, aVar, aVar2, f2, bVar2.a(videoFeatures));
        this.t = ujs0Var;
        this.u = videoFile;
        this.x = AutoPlayState.STOP;
        VideoUIEventDispatcher videoUIEventDispatcher = new VideoUIEventDispatcher();
        this.y = videoUIEventDispatcher;
        this.z = new ah5(new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, null, null, autoPlayAdPixelsTrackerType, null, null, false, null, 507903), new vw4(1, this, VideoAutoPlay.class, "onConfigInit", "onConfigInit(Lcom/vk/libvideo/autoplay/AutoPlayConfig;)V", 0, 15), new j3s0(2, this, VideoAutoPlay.class, "onConfigChanged", "onConfigChanged(Lcom/vk/libvideo/autoplay/AutoPlayConfig;Lcom/vk/libvideo/autoplay/AutoPlayConfig;)V", 0));
        this.C = -1;
        this.D = OneVideoPlaybackException.ErrorCode.NO_ERROR;
        this.G = (com.vk.toggle.d.t.b() == null && com.vk.toggle.d.E0.b() == null) ? false : true;
        this.J = new com.vk.libvideo.autoplay.f(this, videoFile);
        gpt0 gpt0Var = gpt0.a;
        Random.b.getClass();
        this.K = new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36);
        io.reactivex.rxjava3.disposables.b bVar3 = new io.reactivex.rxjava3.disposables.b();
        this.Q = bVar3;
        this.R = new j.a();
        this.T = new m7s0(new k3s0(0, this, VideoAutoPlay.class, "createVideoSource", "createVideoSource-0E7RQCE(Lcom/vk/dto/common/VideoFile;ZI)Ljava/lang/Object;", 0), v7s0Var, videoUIEventDispatcher);
        this.U = ad0.b;
        this.V = new bpn0(new cy20(20));
        this.W = new jps0(videoFile);
        this.X = new zi0(0);
        VideoFeatures videoFeatures2 = VideoFeatures.STOP_VIDEO_IF_BACKGROUND;
        videoFeatures2.getClass();
        this.Y = bVar2.a(videoFeatures2);
        VideoFeatures videoFeatures3 = VideoFeatures.REMOVE_IS_PREPARED;
        videoFeatures3.getClass();
        this.Z = bVar2.a(videoFeatures3);
        this.a0 = new n3s0(this);
        this.b0 = new m3s0(this);
        this.c0 = new o3s0(this);
        vpj0 vpj0Var = new vpj0(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d0 = msy.a(lazyThreadSafetyMode, vpj0Var);
        this.e0 = msy.a(lazyThreadSafetyMode, new mlf0(this, 14));
        this.f0 = msy.a(lazyThreadSafetyMode, new fd90(16));
        this.g0 = new ArrayList<>();
        this.h0 = new bpn0(new tqf0(7));
        this.i0 = msy.a(lazyThreadSafetyMode, new f7q0(4));
        Object W0 = W0(this, videoFile, 6);
        m7q m7qVar = (m7q) (W0 instanceof Result.Failure ? null : W0);
        this.k0 = m7qVar;
        this.l0 = m7qVar != null ? jgz.e(m7qVar) : null;
        this.m0 = VideoMode.EMPTY;
        this.o0 = new b(0L, false);
        R();
        bpn0 bpn0Var2 = t5t0.e;
        bVar3.b(hg1.i(t5t0.a.a().d.K(), new skj0(this, i2)));
        ezs0Var.t(this);
        yg5.o0(this, this.v, null, null, false, 14);
        xds0 c2 = els0.c(videoFile, qu5.c().getCodecInfo());
        if (!epx.f(yft0Var.i, c2)) {
            yft0Var.i = c2;
            lwp lwpVar = yft0Var.e;
            lwpVar.c = c2;
            lwpVar.d = new o5h0(c2, lwpVar.b);
        }
        ujs0Var.a.b = new uht0(videoFile, qu5.c().getCodecInfo());
        mm80 f3 = ezs0Var.f();
        if (epx.f(yft0Var.c, f3)) {
            return;
        }
        yft0Var.c = f3;
    }

    public static String T0(com.vk.libvideo.api.ad.a aVar) {
        if (aVar instanceof a.AbstractC1195a) {
            return ((a.AbstractC1195a) aVar).a().getId();
        }
        if (aVar instanceof a.b) {
            return ((a.b) aVar).a.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static Object W0(VideoAutoPlay videoAutoPlay, VideoFile videoFile, int i2) {
        if ((i2 & 1) != 0) {
            videoFile = videoAutoPlay.u;
        }
        return videoAutoPlay.V0(videoFile, false, -1);
    }

    public static boolean j1(VideoFile videoFile) {
        Object obj;
        Map<String, VideoUrlInfo> map = videoFile.w9().b;
        if (map.isEmpty()) {
            return false;
        }
        Iterator<T> it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((VideoUrlInfo) obj).f) {
                break;
            }
        }
        return obj == null;
    }

    public static boolean o1() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            return false;
        }
        qu5.c().getClass();
        if (ConnectionState.SELECTED == null) {
            return true;
        }
        qu5.c().getClass();
        if (ConnectionState.CONNECTING == null) {
            return true;
        }
        qu5.c().getClass();
        return ConnectionState.CONNECTED == null;
    }

    public static b0 r1(VideoAutoPlay videoAutoPlay, VideoFile videoFile, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = videoAutoPlay.g0();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int i4 = 8;
        boolean z2 = (i3 & 8) != 0;
        bpn0 bpn0Var = t5t0.e;
        return new u0(new r0(new e0(new r(new r(t5t0.a.a().d.K(), new hhj0(new g3s0(videoAutoPlay, videoFile, z, i2), 7)), new utg0(new pod0(videoAutoPlay, 23), i4)), new nit(new m360(videoFile, 26), 24)).u(), new oyr(new xa30(z2, videoAutoPlay, videoFile), 28))).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.yg5
    public final VideoFile A() {
        return this.u;
    }

    @Override // xsna.yg5
    public final void A0(boolean z) {
        if (this.n0) {
            return;
        }
        d3b0 d3b0Var = this.p0;
        OneVideoPlayer a2 = d3b0Var != null ? d3b0Var.a() : null;
        if (a2 != null) {
            a2.seekTo(z ? Math.min(getPosition() + 10000, a2.getDuration()) : Math.max(getPosition() - 10000, 0L));
        }
        x0(ForceLogReason.FASTSEEK);
    }

    public final void A1() {
        float[] fArr;
        ArrayList<um80> arrayList = this.g0;
        Iterator<um80> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        arrayList.clear();
        ye0 ye0Var = this.N;
        if (ye0Var != null) {
            c8x c8xVar = ye0Var.i;
            if (c8xVar != null) {
                float[] fArr2 = c8xVar.n;
                float[] fArr3 = fArr2 == null ? new float[0] : (float[]) fArr2.clone();
                ArrayList arrayList2 = new ArrayList();
                for (float f2 : fArr3) {
                    if (!ye0Var.u.contains(Float.valueOf(f2))) {
                        arrayList2.add(Float.valueOf(f2));
                    }
                }
                fArr = j5g.L0(arrayList2);
            } else {
                fArr = new float[0];
            }
            for (final float f3 : fArr) {
                z1((long) (f3 * 1000), new Runnable() { // from class: xsna.h3s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoAutoPlay videoAutoPlay = VideoAutoPlay.this;
                        float f4 = f3;
                        ye0 ye0Var2 = videoAutoPlay.N;
                        if (ye0Var2 != null) {
                            AdSection adSection = AdSection.MIDROLL;
                            if (ye0Var2.b(adSection, null) && videoAutoPlay.m1()) {
                                videoAutoPlay.U.getClass();
                                if (!ad0.w()) {
                                    d3b0 d3b0Var = videoAutoPlay.p0;
                                    if (d3b0Var != null) {
                                        d3b0Var.C(false);
                                        d3b0Var.j(null);
                                    }
                                    videoAutoPlay.D1(VideoAutoPlay.AutoPlayState.PLAY);
                                }
                                ye0 ye0Var3 = videoAutoPlay.N;
                                if (ye0Var3 == null || !ye0Var3.b(adSection, Float.valueOf(f4))) {
                                    return;
                                }
                                ye0Var3.u.add(Float.valueOf(f4));
                                ye0Var3.y = true;
                                ye0Var3.r = adSection;
                                ye0Var3.g("request_midroll");
                                c8x c8xVar2 = ye0Var3.i;
                                if (c8xVar2 != null) {
                                    c8xVar2.l = ye0Var3.j;
                                }
                                Pair<d8x, e8x> c2 = ye0Var3.c();
                                d8x d2 = c2.d();
                                e8x g2 = c2.g();
                                c8x c8xVar3 = ye0Var3.i;
                                if (c8xVar3 != null) {
                                    c8xVar3.f(d2);
                                }
                                c8x c8xVar4 = ye0Var3.i;
                                if (c8xVar4 != null && g2 != null) {
                                    c8xVar4.k = g2;
                                    p7z0 p7z0Var = c8xVar4.i;
                                    if (p7z0Var != null) {
                                        n0z0 n0z0Var = p7z0Var.e;
                                        n0z0Var.b = g2;
                                        g2.f(n0z0Var);
                                    }
                                }
                                c8x c8xVar5 = ye0Var3.i;
                                if (c8xVar5 != null) {
                                    p7z0 p7z0Var2 = c8xVar5.i;
                                    if (p7z0Var2 == null) {
                                        gu8.c(null, "InstreamAd: Unable to start ad: not loaded yet");
                                        return;
                                    }
                                    if (p7z0Var2.d.g == null) {
                                        gu8.c(null, "InstreamAd: Unable to start ad: player has not set");
                                        return;
                                    }
                                    p7z0Var2.d(p7z0Var2.j);
                                    for (float f5 : p7z0Var2.s) {
                                        if (Float.compare(f5, f4) == 0) {
                                            pjz0 b2 = p7z0Var2.b.b("midroll");
                                            if (b2 != null) {
                                                p7z0Var2.v.b(b2, f4, p7z0Var2.c.j, p7z0Var2.w, new tje(p7z0Var2, b2));
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    gu8.c(null, "InstreamAdEngine: Attempt to start wrong midpoint, use one of InstreamAd.getMidPoints()");
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // xsna.yg5
    public final boolean B() {
        return this.x == AutoPlayState.RESTRICTED_STRONG;
    }

    @Override // xsna.yg5
    public final q7s0 B0() {
        return this.T;
    }

    public final void B1(int i2) {
        VideoTextureView videoTextureView;
        TransformController transformController;
        if (this.F == null || !isReady()) {
            return;
        }
        int c1 = c1();
        Pair<Float, String> h1 = h1();
        float floatValue = h1.d().floatValue();
        String g2 = h1.g();
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            float volume = getVolume();
            WeakReference<VideoTextureView> weakReference = this.A;
            rlt0Var.j(i2, floatValue, volume, ((weakReference == null || (videoTextureView = weakReference.get()) == null || (transformController = videoTextureView.getTransformController()) == null) ? null : transformController.e) == TransformController.ScaleType.CROP, g2, g0(), c1);
        }
    }

    @Override // xsna.yg5
    public final void C(boolean z) {
        if (this.x.h()) {
            return;
        }
        if (z || this.c.a(this)) {
            D1(AutoPlayState.PAUSED_WEAK);
            ye0 ye0Var = this.N;
            if (ye0Var != null) {
                ye0Var.e();
            }
            d3b0 d3b0Var = this.p0;
            if (d3b0Var != null) {
                d3b0Var.C(false);
            }
            this.Q.e();
            i1();
            this.W.b();
            rzr0 d1 = d1();
            if (d1 != null) {
                d1.J();
            }
        }
    }

    @Override // xsna.yg5
    public final boolean C0() {
        return this.G && this.H != null && this.p0 == null && this.x != AutoPlayState.PLAY;
    }

    public final void C1(m7q m7qVar) {
        this.k0 = m7qVar;
        this.l0 = m7qVar != null ? jgz.e(m7qVar) : null;
        if (this.G) {
            K1(this.p0);
        }
    }

    @Override // xsna.yg5
    public final void D() {
        if (this.x == AutoPlayState.PAUSED_STRONG) {
            D1(AutoPlayState.PAUSED_WEAK);
        }
    }

    @Override // xsna.yg5
    public final boolean D0() {
        return this.x == AutoPlayState.PAUSED_PREPARE || isPrepared();
    }

    public final void D1(AutoPlayState autoPlayState) {
        AutoPlayState autoPlayState2 = this.x;
        if (autoPlayState2 != autoPlayState) {
            if (autoPlayState2 != AutoPlayState.RESTRICTED_STRONG) {
                this.x = autoPlayState;
            } else if (autoPlayState == AutoPlayState.CONFIRMED) {
                this.x = autoPlayState;
            }
            if (g1()) {
                d3b0 d3b0Var = this.p0;
                if (d3b0Var != null) {
                    d3b0Var.a();
                }
                Objects.toString(autoPlayState2);
                Objects.toString(autoPlayState);
                Objects.toString(this.x);
                new Exception();
            }
            if (!this.G || autoPlayState2 == this.x) {
                return;
            }
            this.I = SystemClock.elapsedRealtime();
            AutoPlayState autoPlayState3 = AutoPlayState.STOP;
            if (autoPlayState2 == autoPlayState3 || (this.H == null && this.x != autoPlayState3)) {
                G1();
            }
        }
    }

    @Override // xsna.yg5
    public final void E() {
        D1(AutoPlayState.CONFIRMED);
        this.y.E();
    }

    @Override // xsna.fuk0
    public final void E0(Long l) {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var != null && (a2 = d3b0Var.a()) != null) {
            this.J.x(a2);
        }
        if (l != null) {
            long longValue = l.longValue();
            rlt0 rlt0Var = this.F;
            if (rlt0Var != null) {
                Bundle a3 = q9k.a(NotificationCompat.CATEGORY_EVENT, "first_frame");
                a3.putString("value", String.valueOf(longValue));
                rlt0Var.h(a3);
            }
        }
    }

    public final void E1(OneVideoPlayer oneVideoPlayer, SubtitlesConfigurationMode subtitlesConfigurationMode) {
        m1n0 m1n0Var;
        ajt0 ajt0Var = this.l;
        ajt0Var.getClass();
        bpn0 bpn0Var = ajt0Var.a;
        int i2 = ajt0.a.$EnumSwitchMapping$0[subtitlesConfigurationMode.ordinal()];
        if (i2 == 1) {
            m1n0Var = new m1n0(((SharedPreferences) bpn0Var.getValue()).getBoolean("subtitles-on", false), ((SharedPreferences) bpn0Var.getValue()).getString("subtitles-lang", null));
        } else if (i2 == 2) {
            m1n0Var = ajt0.c;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m1n0Var = ajt0.b;
        }
        if (!m1n0Var.a || subtitlesConfigurationMode == SubtitlesConfigurationMode.ALWAYS_DISABLED) {
            oneVideoPlayer.t();
            return;
        }
        one.video.player.tracks.b bVar = (one.video.player.tracks.b) j5g.a0(b1(m1n0Var.b));
        if (bVar != null) {
            oneVideoPlayer.z(bVar);
        }
    }

    @Override // xsna.yg5
    public final void F() {
        nza0 h2;
        mza0 mza0Var;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var != null && (h2 = d3b0Var.h()) != null && (mza0Var = h2.p) != null) {
            mza0Var.a = true;
            if (bps0.a != null) {
                qg90<Long, Integer> qg90Var = mza0Var.b;
                r2u0 r2u0Var = dst0.b;
                qg90<UserId, Integer> qg90Var2 = new qg90<>(new UserId(qg90Var.a.longValue()), qg90Var.b);
                r2u0Var.getClass();
                bpn0 bpn0Var = irt0.d;
                CachedVideoViewedSegments a2 = irt0.b.a().a(qg90Var2);
                if (a2 != null) {
                    a2.Eb().d();
                    irt0.b.a().e(a2);
                    r2u0Var.c = 0L;
                }
            }
        }
        x0(ForceLogReason.SEEK);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yg5
    public final void F0() {
        rzr0 rzr0Var = (rzr0) this.d0.getValue();
        if (rzr0Var != null) {
            rzr0Var.d.clear();
            rzr0Var.c.clear();
            rzr0Var.f.clear();
            rzr0Var.e.clear();
        }
    }

    public final void F1(d3b0 d3b0Var) {
        WeakReference<VideoTextureView> weakReference = this.A;
        VideoTextureView videoTextureView = weakReference != null ? weakReference.get() : null;
        if (videoTextureView == null || d3b0Var.k(videoTextureView)) {
            return;
        }
        qu5.c().c(videoTextureView, d3b0Var);
        d3b0Var.j(videoTextureView);
    }

    @Override // xsna.yg5
    public final boolean G() {
        return this.n0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (com.vk.mediastore.storage.ClipsVideoStorage.d() == false) goto L50;
     */
    @Override // xsna.yg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(boolean z) {
        VideoRestriction O;
        d3b0 d3b0Var;
        boolean z2 = z && !this.n0;
        if (P0() || this.x == AutoPlayState.PLAY || (!((O = this.u.O()) == null || O.f) || this.u.z0() || D0())) {
            g1();
            return;
        }
        ((n1s0) this.m.b).getClass();
        if (g1() && (d3b0Var = this.p0) != null) {
            d3b0Var.a();
        }
        D1(AutoPlayState.PAUSED_PREPARE);
        if (Z0().f) {
            pxv pxvVar = m63.e;
            if (pxvVar == null) {
                pxvVar = null;
            }
            if (((pnf) pxvVar.invoke()).a) {
                ClipsVideoStorage.a.getClass();
            }
            if (!this.u.isEmpty()) {
                Object W0 = W0(this, this.u, 6);
                if (W0 instanceof Result.Failure) {
                    W0 = null;
                }
                m7q m7qVar = (m7q) W0;
                if (m7qVar != null) {
                    C1(m7q.a(m7qVar, null, null, null, 0, false, z2, null, 0L, null, null, false, 134152191));
                    m7q m7qVar2 = this.k0;
                    sr10 sr10Var = dy2.a;
                    w1(m7qVar2, true, epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE), false);
                    l0();
                    return;
                }
            }
        }
        io.reactivex.rxjava3.disposables.b bVar = this.Q;
        bVar.e();
        bVar.b(hg1.i(r1(this, this.u, 0, false, 14), new lo70(this, z2, new qjo0(this, 3))));
    }

    public final void G1() {
        d3b0 d3b0Var;
        d3b0 d3b0Var2;
        Map map;
        ContentType contentType;
        OneVideoPlayer a2;
        m7q c2;
        nza0 h2;
        sht0 sht0Var;
        Uri uri;
        if (!this.G) {
            if (g1()) {
                d3b0 d3b0Var3 = this.p0;
                if (d3b0Var3 != null) {
                    d3b0Var3.a();
                }
                new Exception();
                return;
            }
            return;
        }
        one.video.stat2.a aVar = this.H;
        String str = aVar != null ? aVar.a : null;
        m7q m7qVar = this.k0;
        if (epx.f(str, m7qVar != null ? m7qVar.z : null)) {
            if (g1()) {
                d3b0 d3b0Var4 = this.p0;
                if (d3b0Var4 != null) {
                    d3b0Var4.a();
                }
                new Exception();
                return;
            }
            return;
        }
        I1();
        if (g1()) {
            d3b0 d3b0Var5 = this.p0;
            if (d3b0Var5 != null) {
                d3b0Var5.a();
            }
            new Exception();
        }
        m7q m7qVar2 = this.k0;
        String host = (m7qVar2 == null || (sht0Var = m7qVar2.e) == null || (uri = sht0Var.b) == null) ? null : uri.getHost();
        String Y6 = this.u.Y6();
        vw3 vw3Var = s0;
        if (m7qVar2 != null) {
            String str2 = m7qVar2.j;
            if (host != null && Y6 != null) {
                try {
                    long parseLong = Long.parseLong(Y6);
                    d a3 = a.a(q0, this.m0);
                    String M4 = this.u.M4();
                    JSONObject jSONObject = M4 != null ? new JSONObject(M4) : null;
                    vw3 vw3Var2 = ryk0.a;
                    String str3 = this.K;
                    long j2 = m7qVar2.s;
                    boolean z = m7qVar2.D;
                    Mode mode = a3.a;
                    boolean z2 = a3.b;
                    boolean z3 = a3.c;
                    String str4 = this.v;
                    boolean f2 = epx.f(str4 != null ? str4.toLowerCase(Locale.ROOT) : null, "offline");
                    if (str2.length() == 0 && (this.l0 instanceof mv70)) {
                        contentType = ContentType.FILE;
                    } else {
                        ContentType.a aVar2 = ContentType.Companion;
                        String upperCase = str2.toUpperCase(Locale.ROOT);
                        aVar2.getClass();
                        map = ContentType.types;
                        contentType = (ContentType) map.get(upperCase);
                        if (contentType == null) {
                            contentType = ContentType.UNKNOWN;
                        }
                    }
                    one.video.stat2.a aVar3 = new one.video.stat2.a(str3, null, parseLong, jSONObject, j2, host, z, mode, z2, z3, f2, contentType);
                    this.H = aVar3;
                    this.p.j = aVar3;
                    if (g1()) {
                        d3b0 d3b0Var6 = this.p0;
                        if (d3b0Var6 != null) {
                            d3b0Var6.a();
                        }
                        Objects.toString(m7qVar2.e.b);
                    }
                    d3b0 d3b0Var7 = this.p0;
                    if (d3b0Var7 != null && (a2 = d3b0Var7.a()) != null && (c2 = d3b0Var7.c()) != null && (h2 = d3b0Var7.h()) != null) {
                        h2.a(a2, dx1.a(c2));
                    }
                    K1(this.p0);
                    return;
                } catch (NumberFormatException unused) {
                    if (g1()) {
                        d3b0 d3b0Var8 = this.p0;
                        if (d3b0Var8 != null) {
                            d3b0Var8.a();
                        }
                        Objects.toString(this.u);
                    }
                    vw3Var.b(false, a.EnumC1205a.STAT_SESSION_INIT_OVID_IS_NAN, new xg2(15, Y6, this));
                    return;
                }
            }
        }
        if (m7qVar2 == null) {
            if (g1() && (d3b0Var2 = this.p0) != null) {
                d3b0Var2.a();
            }
            vw3Var.b(false, a.EnumC1205a.STAT_SESSION_INIT_SOURCE_IS_NULL, new ejf0(this, 13));
            return;
        }
        if (host == null) {
            if (g1() && (d3b0Var = this.p0) != null) {
                d3b0Var.a();
            }
            vw3Var.b(j1(this.u), a.EnumC1205a.STAT_SESSION_INIT_SOURCE_HOST_IS_NULL, new s(21, m7qVar2, this));
            return;
        }
        if (g1()) {
            d3b0 d3b0Var9 = this.p0;
            if (d3b0Var9 != null) {
                d3b0Var9.a();
            }
            Objects.toString(this.u);
        }
        vw3Var.b(this.u.x5() || this.u.Sa() || j1(this.u), a.EnumC1205a.STAT_SESSION_INIT_OVID_IS_NULL, new ie3(27, host, this));
    }

    @Override // xsna.yg5
    public final void H() {
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        if (com.vk.libvideo.autoplay.e.b()) {
            setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            rlt0 rlt0Var = this.F;
            if (rlt0Var != null) {
                rlt0Var.i("volume", "off");
                return;
            }
            return;
        }
        setVolume(1.0f);
        rlt0 rlt0Var2 = this.F;
        if (rlt0Var2 != null) {
            rlt0Var2.i("volume", "on");
        }
    }

    @Override // xsna.fuk0
    public final void H0(int i2) {
        this.L = i2;
        this.y.z0(this, i2);
    }

    public final void H1() {
        I1();
        gpt0 gpt0Var = gpt0.a;
        Random.b.getClass();
        String bigInteger = new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36);
        this.K = bigInteger;
        m7q m7qVar = this.k0;
        if (m7qVar != null) {
            C1(m7q.a(m7qVar, null, null, null, 0, false, false, null, 0L, null, bigInteger, false, 100663295));
        }
        g1();
    }

    @Override // xsna.yg5
    public final void I() {
        this.D = OneVideoPlaybackException.ErrorCode.NO_ERROR;
        this.E = null;
    }

    @Override // xsna.yg5
    public final boolean I0() {
        int i2 = f.$EnumSwitchMapping$1[Z0().b.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return this.u.M5();
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!this.u.M5() || !this.u.x5()) {
            return false;
        }
        return true;
    }

    public final void I1() {
        one.video.stat2.a aVar;
        sht0 j2;
        Uri uri;
        if (this.G && (aVar = this.H) != null) {
            if (g1()) {
                d3b0 d3b0Var = this.p0;
                if (d3b0Var != null) {
                    d3b0Var.a();
                }
                new Exception();
            }
            int i2 = wn80.a;
            OneVideoPlayer oneVideoPlayer = aVar.r;
            long e2 = oneVideoPlayer != null ? aVar.e(oneVideoPlayer) : -1L;
            OneVideoPlayer oneVideoPlayer2 = aVar.r;
            aVar.f(e2, (oneVideoPlayer2 == null || (j2 = oneVideoPlayer2.j()) == null || (uri = j2.b) == null) ? null : uri.getHost());
            this.H = null;
        }
    }

    @Override // xsna.yg5
    public final boolean J() {
        return this.D != OneVideoPlaybackException.ErrorCode.NO_ERROR;
    }

    @Override // xsna.yg5
    public final boolean J0() {
        return this.x == AutoPlayState.PLAY;
    }

    public final void J1() {
        if (this.G) {
            m7q m7qVar = this.k0;
            one.video.stat2.a aVar = this.H;
            if (m7qVar != null && aVar != null && (m7qVar.D != aVar.c || p1())) {
                gpt0 gpt0Var = gpt0.a;
                Random.b.getClass();
                this.K = new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36);
                X0(new xt9(aVar, m7qVar, this, 6));
                m7q m7qVar2 = this.k0;
                C1(m7qVar2 != null ? m7q.a(m7qVar2, null, null, null, 0, false, false, null, 0L, null, this.K, false, 100663295) : null);
            }
            G1();
        }
    }

    @Override // xsna.yg5
    public final void K() {
        nza0 h2;
        mza0 mza0Var;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (h2 = d3b0Var.h()) == null || (mza0Var = h2.p) == null) {
            return;
        }
        mza0Var.a = false;
    }

    @Override // xsna.yg5
    public final void K0(boolean z) {
        OneVideoPlayer a2;
        if (z) {
            O();
            D();
            I();
            VideoFile videoFile = this.u;
            bpn0 bpn0Var = t5t0.e;
            t5t0 a3 = t5t0.a.a();
            a3.c.remove(videoFile.r1());
            ScheduledFuture<?> scheduledFuture = a3.a;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            asu0.a.getClass();
            a3.a = asu0.o().schedule(a3.b, 1000L, TimeUnit.MILLISECONDS);
            d3b0 d3b0Var = this.p0;
            Float f1 = f1();
            float floatValue = f1 != null ? f1.floatValue() : 1.0f;
            if (d3b0Var != null && (a2 = d3b0Var.a()) != null) {
                a2.setPlaybackSpeed(floatValue);
            }
            seek(0L);
        }
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            rlt0Var.d();
        }
    }

    public final void K1(d3b0 d3b0Var) {
        one.video.stat2.a aVar;
        Mode mode;
        if (this.G && (aVar = this.H) != null) {
            OneVideoPlayer a2 = d3b0Var != null ? d3b0Var.a() : null;
            aVar.l(a2, a2 != null ? Long.valueOf(aVar.e(a2)) : null);
            d a3 = a.a(q0, this.m0);
            Mode mode2 = a3.a;
            if (aVar.f) {
                aVar.g.b(false, a.EnumC2182a.USE_AFTER_RELEASE_SET_VIDEO_MODE, new uw3(0));
            } else if (mode2 != aVar.d && mode2 != (mode = Mode.INVALID)) {
                aVar.d = mode2;
                OneVideoPlayer oneVideoPlayer = aVar.r;
                if (oneVideoPlayer != null && mode2 != mode) {
                    long e2 = aVar.e(oneVideoPlayer);
                    Event event = Event.MODE_CHANGED;
                    String str = aVar.i;
                    vrn0 vrn0Var = aVar.j;
                    vrn0Var.b(e2);
                    yi80.a d2 = aVar.d(event, e2, str, vrn0Var.e);
                    d2.i.put(Param.MODE, aVar.d.h());
                    one.video.stat2.a.g(aVar, d2, null, 6);
                }
            }
            boolean z = a3.b;
            if (aVar.f) {
                aVar.g.b(false, a.EnumC2182a.USE_AFTER_RELEASE_VISIBLE, new uw3(0));
            } else if (aVar.y != z) {
                aVar.y = z;
                aVar.g.b(aVar.r != null, a.EnumC2182a.PLAYER_IS_NULL_ON_SET_IS_VISIBLE, new sqf0(2));
                OneVideoPlayer oneVideoPlayer2 = aVar.r;
                if (oneVideoPlayer2 != null) {
                    long e3 = aVar.e(oneVideoPlayer2);
                    Event event2 = Event.VISIBILITY_CHANGED;
                    String str2 = aVar.i;
                    vrn0 vrn0Var2 = aVar.j;
                    vrn0Var2.b(e3);
                    yi80.a d3 = aVar.d(event2, e3, str2, vrn0Var2.e);
                    d3.i.put(Param.VISIBILITY, z ? "foreground" : L2.g);
                    one.video.stat2.a.g(aVar, d3, null, 6);
                }
            }
            boolean z2 = a3.c;
            if (aVar.f) {
                aVar.g.b(false, a.EnumC2182a.USE_AFTER_RELEASE_PREFETCH, new uw3(0));
            } else if (aVar.x != z2) {
                aVar.x = z2;
                aVar.n.b = z2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, com.vk.media.player.VideoMode] */
    @Override // xsna.yg5
    public final void L(VideoMode videoMode) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = videoMode;
        if (o1()) {
            qu5.c().getClass();
            ref$ObjectRef.element = VideoMode.EMPTY;
        }
        if (g1()) {
            d3b0 d3b0Var = this.p0;
            if (d3b0Var != null) {
                d3b0Var.a();
            }
            Objects.toString(this.m0);
            Objects.toString(ref$ObjectRef.element);
            new Exception();
        }
        VideoMode videoMode2 = (VideoMode) ref$ObjectRef.element;
        this.m0 = videoMode2;
        d3b0 d3b0Var2 = this.p0;
        if (d3b0Var2 != null) {
            d3b0Var2.L(videoMode2);
        }
        if (this.G) {
            K1(this.p0);
        }
    }

    @Override // xsna.fuk0
    public final void L0() {
        if (!P0()) {
            if (!fxc0.B().J().k0()) {
                VideoFile videoFile = this.u;
                bpn0 bpn0Var = t5t0.e;
                t5t0 a2 = t5t0.a.a();
                a2.c.remove(videoFile.r1());
                ScheduledFuture<?> scheduledFuture = a2.a;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                asu0.a.getClass();
                a2.a = asu0.o().schedule(a2.b, 1000L, TimeUnit.MILLISECONDS);
            }
            O1(true);
            rlt0 rlt0Var = this.F;
            if (rlt0Var != null) {
                rlt0Var.d();
            }
        }
        rzr0 d1 = d1();
        if (d1 != null) {
            long duration = getDuration();
            d1.P(duration);
            d1.N(duration, duration);
            d1.M(duration);
        }
        ye0 ye0Var = this.N;
        if (ye0Var != null) {
            AdSection adSection = AdSection.POSTROLL;
            if (ye0Var.b(adSection, null) && m1()) {
                ye0 ye0Var2 = this.N;
                if (ye0Var2 == null || !ye0Var2.b(adSection, null)) {
                    return;
                }
                ye0Var2.t = false;
                ye0Var2.y = true;
                ye0Var2.r = adSection;
                ye0Var2.g("request_postroll");
                c8x c8xVar = ye0Var2.i;
                if (c8xVar != null) {
                    c8xVar.l = ye0Var2.j;
                }
                Pair<d8x, e8x> c2 = ye0Var2.c();
                d8x d2 = c2.d();
                e8x g2 = c2.g();
                c8x c8xVar2 = ye0Var2.i;
                if (c8xVar2 != null) {
                    c8xVar2.f(d2);
                }
                c8x c8xVar3 = ye0Var2.i;
                if (c8xVar3 != null && g2 != null) {
                    c8xVar3.k = g2;
                    p7z0 p7z0Var = c8xVar3.i;
                    if (p7z0Var != null) {
                        n0z0 n0z0Var = p7z0Var.e;
                        n0z0Var.b = g2;
                        g2.f(n0z0Var);
                    }
                }
                c8x c8xVar4 = ye0Var2.i;
                if (c8xVar4 != null) {
                    c8xVar4.d("postroll");
                    return;
                }
                return;
            }
        }
        if (P0()) {
            return;
        }
        if (this.u.T1() && ((Boolean) this.h0.getValue()).booleanValue()) {
            x1(new hd4(this, 10));
        }
        this.y.m4(this);
    }

    public final void L1(m7q m7qVar) {
        m7q c2;
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (c2 = d3b0Var.c()) == null) {
            return;
        }
        qu5.c().h(c2.e, m7qVar.e);
        d3b0 d3b0Var2 = this.p0;
        if (d3b0Var2 != null) {
            d3b0Var2.f(m7qVar);
        }
        d3b0 d3b0Var3 = this.p0;
        if (d3b0Var3 == null || (a2 = d3b0Var3.a()) == null) {
            return;
        }
        sht0 e2 = jgz.e(m7qVar);
        long currentPosition = a2.getCurrentPosition();
        if (a2.f0()) {
            a2.n0(e2, currentPosition);
        } else {
            a2.C(e2, currentPosition);
        }
    }

    @Override // xsna.yg5
    public final boolean M() {
        return this.x == AutoPlayState.PAUSED_STRONG;
    }

    @Override // xsna.yg5
    public final boolean M0() {
        return epx.f(q4s0.a.a(), this);
    }

    public final void M1(PlayerError playerError, Throwable th, boolean z) {
        Throwable th2;
        boolean z2;
        d3b0 d3b0Var;
        nza0 h2;
        int i2;
        PlayerError playerError2;
        OneVideoPlayer a2;
        one.video.player.tracks.c E;
        cms0 cms0Var;
        FrameSize b2;
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            m7q m7qVar = this.k0;
            int g0 = g0();
            d3b0 d3b0Var2 = this.p0;
            if (d3b0Var2 == null || (a2 = d3b0Var2.a()) == null || (E = a2.E()) == null || (cms0Var = (cms0) E.c) == null || (b2 = cms0Var.b()) == null) {
                i2 = 0;
                playerError2 = playerError;
                th2 = th;
                z2 = z;
            } else {
                i2 = b2.getHeight();
                th2 = th;
                z2 = z;
                playerError2 = playerError;
            }
            rlt0Var.k(playerError2, m7qVar, g0, i2, th2, z2);
        } else {
            th2 = th;
            z2 = z;
        }
        if (this.o || (d3b0Var = this.p0) == null || d3b0Var.a() == null || (h2 = d3b0Var.h()) == null) {
            return;
        }
        OneVideoPlayer a3 = d3b0Var.a();
        bj80 bj80Var = h2.g;
        if (a3 == null || !(th2 instanceof OneVideoPlaybackException)) {
            return;
        }
        if (z2) {
            oyk0.a aVar = bj80Var.g;
            if (aVar != null) {
                aVar.a((OneVideoPlaybackException) th2, a3, new awp(true));
                return;
            }
            return;
        }
        oyk0.a aVar2 = bj80Var.g;
        if (aVar2 != null) {
            aVar2.a((OneVideoPlaybackException) th2, a3, new awp(false));
        }
    }

    @Override // xsna.yg5
    public final void N(VideoFile videoFile) {
        this.u = videoFile;
        xds0 c2 = els0.c(videoFile, qu5.c().getCodecInfo());
        yft0 yft0Var = this.p;
        if (!epx.f(yft0Var.i, c2)) {
            yft0Var.i = c2;
            lwp lwpVar = yft0Var.e;
            lwpVar.c = c2;
            lwpVar.d = new o5h0(c2, lwpVar.b);
        }
        this.t.a.b = new uht0(videoFile, qu5.c().getCodecInfo());
        bpn0 bpn0Var = t5t0.e;
        this.Q.b(hg1.i(t5t0.a.a().d.K(), new skj0(this, 9)));
        this.W.b = videoFile;
    }

    @Override // xsna.yg5
    public final je0 N0() {
        ye0 ye0Var = this.N;
        if (ye0Var != null) {
            return ye0Var.z;
        }
        return null;
    }

    public final void N1(OneVideoPlayer oneVideoPlayer) {
        m7q m7qVar = this.k0;
        if (!this.Y || oneVideoPlayer == null || m7qVar == null) {
            return;
        }
        boolean k = this.h.k(new j.a(this.l0 instanceof mv70, Z0().c, this.u.x5(), this.u.W9(), this.u.I6(), Z0().p, R0(), J0(), P0(), oneVideoPlayer.getState()));
        FrameSize frameSize = oneVideoPlayer.P().b;
        FrameSize frameSize2 = FrameSize._144p;
        boolean z = true;
        if ((frameSize == frameSize2) == k) {
            return;
        }
        FrameSize frameSize3 = null;
        AdaptiveTrackSelectionInterval h2 = fxc0.B().J().l0() ? fxc0.B().w0().h() : null;
        fxc0.B().J().getClass();
        FrameSize i2 = h2 != null ? h2.i() : null;
        FrameSize h3 = h2 != null ? h2.h() : null;
        if (k) {
            i2 = frameSize2;
        } else {
            sr10 sr10Var = dy2.a;
            if (epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE)) {
                VideoContentType videoContentType = m7qVar.e.a;
                if (videoContentType != VideoContentType.DASH && videoContentType != VideoContentType.HLS) {
                    z = false;
                }
                if (!m7qVar.D && !m7qVar.B && z) {
                    o1b0.a.getClass();
                    frameSize3 = o1b0.a.b;
                }
            }
            frameSize2 = (FrameSize) j5g.o0(rl3.I(new FrameSize[]{h3, frameSize3}));
        }
        hk0 P = oneVideoPlayer.P();
        if (frameSize2 == null) {
            frameSize2 = oneVideoPlayer.P().b;
        }
        if (i2 == null) {
            i2 = oneVideoPlayer.P().a;
        }
        oneVideoPlayer.b0(hk0.a(P, i2, frameSize2, false, 12));
    }

    @Override // xsna.yg5
    public final void O() {
        d3b0 d3b0Var;
        OneVideoPlayer a2;
        if (!a() || (d3b0Var = this.p0) == null || (a2 = d3b0Var.a()) == null) {
            return;
        }
        a2.seekTo(0L);
    }

    @Override // xsna.yg5
    public final List<one.video.player.tracks.b> O0() {
        OneVideoPlayer a2;
        who0 who0Var;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null) {
            return EmptyList.b;
        }
        one.video.player.tracks.b Q = a2.Q();
        return b1((Q == null || (who0Var = (who0) Q.c) == null) ? null : who0Var.c);
    }

    public final void O1(boolean z) {
        nza0 h2;
        VideoPlayerType videoPlayerType = Z0().a ? VideoPlayerType.FULLSCREEN : VideoPlayerType.INLINE_PLAYER;
        String str = z ? "session_end" : "unknown";
        d3b0 d3b0Var = this.p0;
        if (d3b0Var != null && (h2 = d3b0Var.h()) != null) {
            h2.c(n1());
            String str2 = this.v;
            String str3 = this.w;
            String r = this.u.r();
            boolean a1 = a1();
            boolean q1 = q1();
            mza0 mza0Var = h2.p;
            if (mza0Var != null && mza0Var.d != null && mza0Var.e != null && z) {
                mza0Var.b(str2, str3, r, a1 ? 1 : 0, videoPlayerType.h(), str, q1);
                mza0 mza0Var2 = h2.p;
                if (mza0Var2 != null) {
                    mza0Var2.a();
                }
                mza0 mza0Var3 = h2.p;
                if (mza0Var3 != null) {
                    String h3 = videoPlayerType.h();
                    int a2 = pvo0.a();
                    mza0Var3.d = h3;
                    mza0Var3.e = Integer.valueOf(a2);
                }
                mza0 mza0Var4 = h2.p;
                if (mza0Var4 != null) {
                    mza0Var4.b(str2, str3, r, a1 ? 1 : 0, videoPlayerType.h(), str, q1);
                }
            } else if ((mza0Var != null && (mza0Var.d == null || mza0Var.e == null)) || z) {
                if (mza0Var != null) {
                    String h4 = videoPlayerType.h();
                    int a3 = pvo0.a();
                    mza0Var.d = h4;
                    mza0Var.e = Integer.valueOf(a3);
                }
                mza0 mza0Var5 = h2.p;
                if (mza0Var5 != null) {
                    mza0Var5.b(str2, str3, r, a1 ? 1 : 0, videoPlayerType.h(), str, q1);
                }
            } else if (mza0Var != null) {
                mza0Var.b(str2, str3, r, a1 ? 1 : 0, videoPlayerType.h(), str, q1);
            }
            h2.m.getClass();
            h2.n.b(videoPlayerType);
        }
        a.InterfaceC1207a interfaceC1207a = Z0().l;
        if (interfaceC1207a != null) {
            rlt0 rlt0Var = this.F;
            if (rlt0Var != null) {
                rlt0Var.i = interfaceC1207a.a();
            }
            rlt0 rlt0Var2 = this.F;
            if (rlt0Var2 != null) {
                rlt0Var2.j = interfaceC1207a.getSessionId();
            }
        } else {
            rlt0 rlt0Var3 = this.F;
            if (rlt0Var3 != null) {
                rlt0Var3.i = -1;
            }
            if (rlt0Var3 != null) {
                rlt0Var3.j = 0;
            }
        }
        if (this.u.v()) {
            B1(0);
        }
        U0(this.p0);
    }

    @Override // xsna.yg5
    public final long P() {
        return this.I;
    }

    @Override // xsna.yg5
    public final boolean P0() {
        ye0 ye0Var = this.N;
        return ye0Var != null && ye0Var.y;
    }

    @Override // xsna.yg5
    public final void Q(boolean z) {
        this.P = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u0m
    public final void Q0(List<? extends DeprecatedStatisticUrl> list) {
        i11 hVar;
        rzr0 rzr0Var = (rzr0) this.d0.getValue();
        if (rzr0Var != null) {
            ArrayList arrayList = new ArrayList();
            for (DeprecatedStatisticUrl deprecatedStatisticUrl : list) {
                String str = deprecatedStatisticUrl.b;
                if (epx.f(str, "playback_started")) {
                    hVar = new i11.d.a(0, true, deprecatedStatisticUrl);
                } else if (epx.f(str, "playback_completed")) {
                    hVar = new i11.d.a(100, true, deprecatedStatisticUrl);
                } else if (epx.f(str, "playhead_reached_value") && (deprecatedStatisticUrl instanceof DeprecatedStatisticPlayheadReachedUrl)) {
                    DeprecatedStatisticPlayheadReachedUrl deprecatedStatisticPlayheadReachedUrl = (DeprecatedStatisticPlayheadReachedUrl) deprecatedStatisticUrl;
                    hVar = new i11.d.a(deprecatedStatisticPlayheadReachedUrl.l, deprecatedStatisticPlayheadReachedUrl.m, deprecatedStatisticUrl);
                } else if (epx.f(str, "playhead_viewability_value") && (deprecatedStatisticUrl instanceof DeprecatedStatisticPlayheadViewabilityOvvUrl)) {
                    DeprecatedStatisticPlayheadViewabilityOvvUrl deprecatedStatisticPlayheadViewabilityOvvUrl = (DeprecatedStatisticPlayheadViewabilityOvvUrl) deprecatedStatisticUrl;
                    hVar = new i11.d.c(deprecatedStatisticPlayheadViewabilityOvvUrl.n, deprecatedStatisticPlayheadViewabilityOvvUrl.o, deprecatedStatisticPlayheadViewabilityOvvUrl.m, deprecatedStatisticPlayheadViewabilityOvvUrl.l, deprecatedStatisticUrl);
                } else {
                    if (epx.f(str, "playhead_viewability_value") && (deprecatedStatisticUrl instanceof DeprecatedStatisticPlayheadViewabilityMrcUrl)) {
                        DeprecatedStatisticPlayheadViewabilityMrcUrl deprecatedStatisticPlayheadViewabilityMrcUrl = (DeprecatedStatisticPlayheadViewabilityMrcUrl) deprecatedStatisticUrl;
                        if (deprecatedStatisticPlayheadViewabilityMrcUrl.l == TargetPlayheadViewability.VIDEO) {
                            hVar = new i11.d.b(deprecatedStatisticPlayheadViewabilityMrcUrl.n, deprecatedStatisticPlayheadViewabilityMrcUrl.m, deprecatedStatisticUrl, null);
                        }
                    }
                    hVar = epx.f(str, "volume_on") ? new i11.h(deprecatedStatisticUrl) : epx.f(str, "volume_off") ? new i11.g(deprecatedStatisticUrl) : epx.f(str, "video_fullscreen_on") ? new i11.c(deprecatedStatisticUrl) : epx.f(str, "video_fullscreen_off") ? new i11.b(deprecatedStatisticUrl) : epx.f(str, "playback_paused") ? new i11.e(deprecatedStatisticUrl) : epx.f(str, "playback_resumed") ? new i11.f(deprecatedStatisticUrl) : epx.f(str, "error") ? new i11.a(deprecatedStatisticUrl) : null;
                }
                if (hVar != null) {
                    arrayList.add(hVar);
                }
            }
            rzr0Var.E(arrayList);
        }
    }

    @Override // xsna.yg5
    public final void R() {
        AutoPlayState autoPlayState;
        if (fxc0.B().c(this.u)) {
            autoPlayState = AutoPlayState.RESTRICTED_STRONG;
        } else {
            autoPlayState = this.x;
            if (autoPlayState == AutoPlayState.RESTRICTED_STRONG) {
                Iterator it = this.u.e1().c.iterator();
                while (it.hasNext()) {
                    mcr0.t(Uri.parse(((ImageSize) it.next()).d.d));
                }
                Iterator it2 = this.u.getImage().c.iterator();
                while (it2.hasNext()) {
                    mcr0.t(Uri.parse(((ImageSize) it2.next()).d.d));
                }
                autoPlayState = AutoPlayState.CONFIRMED;
            }
        }
        D1(autoPlayState);
    }

    @Override // xsna.yg5
    public final AutoPlayMinifiedState R0() {
        AutoPlayMinifiedState.Companion.getClass();
        VideoPipStateHolder.a.getClass();
        if (epx.f(VideoPipStateHolder.c(), this)) {
            return AutoPlayMinifiedState.PIP;
        }
        return epx.f(rts0.b.a().P0() instanceof VideoMinimizableState.Collapsed ? rts0.c : null, this) ? AutoPlayMinifiedState.MINIPLAYER : AutoPlayMinifiedState.NONE;
    }

    @Override // xsna.yg5
    public final void S(boolean z) {
        if (this.n0) {
            return;
        }
        K0(true);
        v1(z);
    }

    @Override // xsna.fuk0
    public final void S0(a6q a6qVar) {
        Integer W;
        OneVideoPlayer oneVideoPlayer = a6qVar.b;
        if (this.x == AutoPlayState.PLAY) {
            l0();
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_OTHER_QUALITY_STICKING_FIX;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures) && fxc0.B().J().l0() && (W = fxc0.B().W()) != null) {
            int intValue = W.intValue();
            if (oneVideoPlayer != null) {
                vm80.c(oneVideoPlayer, intValue);
            }
        }
        if (!fxc0.B().J().l0() && oneVideoPlayer != null) {
            vm80.c(oneVideoPlayer, g0());
        }
        N1(oneVideoPlayer);
        Iterator<T> it = this.t.b.iterator();
        while (it.hasNext()) {
            ((owp) it.next()).reset();
        }
        I();
        if (!this.o) {
            ((LinkedHashSet) this.p.f.b).clear();
        }
        VideoUIEventDispatcher videoUIEventDispatcher = this.y;
        videoUIEventDispatcher.p2(this);
        s1(videoUIEventDispatcher);
    }

    @Override // xsna.yg5
    public final void T(hnt0 hnt0Var) {
        OneVideoPlayer a2;
        OneVideoPlayer.State state;
        rlt0 rlt0Var;
        m7q m7qVar;
        VideoUIEventDispatcher videoUIEventDispatcher = this.y;
        boolean z = false;
        boolean z2 = videoUIEventDispatcher.remove(hnt0Var) && videoUIEventDispatcher.isEmpty();
        if (z2 && isPlaying() && (rlt0Var = this.F) != null && (m7qVar = this.k0) != null) {
            PlayerType playerType = rlt0Var.D;
            if (playerType == null) {
                playerType = PlayerType.INLINE;
            }
            new ojt0(m7qVar, playerType, rlt0Var.d).q();
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        yg5 yg5Var = xh5Var != null ? xh5Var.a : null;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var != null && (a2 = d3b0Var.a()) != null && (state = a2.getState()) != null) {
            z = state == OneVideoPlayer.State.PLAYING;
        }
        if (z2 && epx.f(yg5Var, this)) {
            if (this.Y && z) {
                return;
            }
            b.C1208b.a().l(null);
        }
    }

    @Override // xsna.yg5
    public final void U() {
        this.S = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(d3b0 d3b0Var) {
        VideoMode videoMode;
        if (o1()) {
            qu5.c().getClass();
            videoMode = VideoMode.EMPTY;
        } else {
            VideoPipStateHolder.a.getClass();
            if (VideoPipStateHolder.d()) {
                videoMode = VideoMode.PIP;
            } else {
                rts0 rts0Var = rts0.b;
                if ((rts0Var.a().P0() instanceof VideoMinimizableState.Collapsed ? rts0.c : null) != null) {
                    videoMode = VideoMode.MINIMIZED;
                } else if (Z0().p == PlayerType.FULLSCREEN && !equals(VideoPipStateHolder.c())) {
                    videoMode = VideoMode.FULLSCREEN;
                } else if (this.S) {
                    videoMode = VideoMode.PREFETCH;
                } else {
                    VideoMinimizableState P0 = rts0Var.a().P0();
                    if (P0 != null) {
                        if (com.vk.libvideo.api.minimizable.a.g(P0)) {
                            videoMode = VideoMode.FULLSCREEN;
                        } else if (P0 instanceof VideoMinimizableState.Expanded) {
                            videoMode = VideoMode.EMPTY;
                        } else if (P0 instanceof VideoMinimizableState.Collapsed) {
                            videoMode = VideoMode.MINIMIZED;
                        }
                        if (videoMode == null) {
                            videoMode = VideoMode.EMPTY;
                        }
                    }
                    videoMode = null;
                    if (videoMode == null) {
                    }
                }
            }
        }
        this.m0 = videoMode;
        if (d3b0Var != null) {
            d3b0Var.L(videoMode);
        }
        if (this.G) {
            K1(d3b0Var);
        }
        if ((d3b0Var != null ? d3b0Var.h() : null) != null) {
            this.S = false;
        }
    }

    @Override // xsna.yg5
    public final boolean V() {
        return a1();
    }

    public final Object V0(VideoFile videoFile, boolean z, int i2) {
        VideoRestriction O;
        if (videoFile.Z9() || !((O = videoFile.O()) == null || O.f)) {
            return new Result.Failure(new RestrictedVideoFileException(videoFile));
        }
        m7q m7qVar = this.k0;
        m7q e2 = gpt0.e(gpt0.a, videoFile, i2, this.v, a1(), false, this.K, videoFile.r(), Z0().r, 128);
        if (e2 != null) {
            return (z || m7qVar == null || m7qVar.n != e2.n) ? e2 : m7q.a(m7qVar, null, e2.g, e2.h, e2.i, e2.p, false, e2.r, e2.s, e2.x, null, e2.A, 58293823);
        }
        return new Result.Failure(new BadVideoFileException("Video url of " + videoFile + "  is NULL. Available urls = " + videoFile.k2() + " isMessage:" + videoFile.Sa() + " QualityWrapper = " + lhg.a(i2, "quality=")));
    }

    @Override // xsna.yg5
    public final OneVideoPlaybackException.ErrorCode W() {
        return this.D;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yg5
    public final void X() {
        rzr0 rzr0Var = (rzr0) this.e0.getValue();
        if (rzr0Var != null) {
            rzr0Var.d.clear();
            rzr0Var.c.clear();
            rzr0Var.f.clear();
            rzr0Var.e.clear();
        }
    }

    public final void X0(gzs<String> gzsVar) {
        if (g1()) {
            d3b0 d3b0Var = this.p0;
            if (d3b0Var != null) {
                d3b0Var.a();
            }
            gzsVar.invoke();
            new Exception();
        }
    }

    @Override // xsna.yg5
    public final void Y(String str) {
        q0(str);
    }

    public final void Y0() {
        if (this.m0 == VideoMode.PREFETCH) {
            L(VideoMode.EMPTY);
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
        com.vk.libvideo.autoplay.a Z0 = Z0();
        WeakReference<VideoTextureView> weakReference = this.A;
        VideoTextureView videoTextureView = weakReference != null ? weakReference.get() : null;
        WeakReference<RecyclerView.e0> weakReference2 = this.B;
        a2.b(new xh5(this, Z0, videoTextureView, weakReference2 != null ? weakReference2.get() : null, null));
    }

    @Override // xsna.yg5
    public final void Z(int i2) {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null) {
            return;
        }
        vm80.c(a2, i2);
    }

    public final com.vk.libvideo.autoplay.a Z0() {
        qcy<Object> qcyVar = r0[0];
        ah5 ah5Var = this.z;
        com.vk.libvideo.autoplay.a aVar = (com.vk.libvideo.autoplay.a) ah5Var.c;
        return aVar == null ? (com.vk.libvideo.autoplay.a) ah5Var.b : aVar;
    }

    @Override // xsna.yg5
    public final boolean a() {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        return ((d3b0Var == null || (a2 = d3b0Var.a()) == null) ? null : a2.getState()) == OneVideoPlayer.State.ENDED;
    }

    @Override // xsna.yg5
    public final void a0(com.vk.libvideo.autoplay.a aVar) {
        qcy<Object> qcyVar = r0[0];
        ah5 ah5Var = this.z;
        com.vk.libvideo.autoplay.a aVar2 = (com.vk.libvideo.autoplay.a) ah5Var.c;
        ah5Var.c = aVar;
        if (aVar2 == null) {
            ((vw4) ah5Var.d).invoke(aVar);
        } else if (!aVar2.equals(aVar)) {
            ((j3s0) ah5Var.e).invoke(aVar2, aVar);
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (epx.f(xh5Var != null ? xh5Var.a : null, this)) {
            Y0();
        }
    }

    public final boolean a1() {
        return p0() && this.u.T3();
    }

    @Override // xsna.yg5
    public final float b() {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null) {
            return 1.0f;
        }
        return a2.b();
    }

    @Override // xsna.yg5
    public final void b0(VideoTextureView videoTextureView) {
        WeakReference<VideoTextureView> weakReference = this.A;
        if (videoTextureView == (weakReference != null ? weakReference.get() : null)) {
            d3b0 d3b0Var = this.p0;
            if (d3b0Var != null) {
                d3b0Var.j(null);
            }
            this.A = null;
            this.B = null;
        }
    }

    public final List<one.video.player.tracks.b> b1(String str) {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null) {
            return EmptyList.b;
        }
        String language = Locale.getDefault().getLanguage();
        boolean z = str == null;
        List<one.video.player.tracks.b> Y = a2.Y();
        ArrayList arrayList = new ArrayList();
        for (Object obj : Y) {
            one.video.player.tracks.b bVar = (one.video.player.tracks.b) obj;
            if (z || epx.f(((who0) bVar.c).c, str) || epx.f(((who0) bVar.c).c, language)) {
                arrayList.add(obj);
            }
        }
        return j5g.D0(new h(new i(new g(str), language)), arrayList);
    }

    @Override // xsna.yg5
    public final void c() {
        AutoPlayState autoPlayState = this.x;
        AutoPlayState autoPlayState2 = AutoPlayState.PAUSED_STRONG;
        if (autoPlayState != autoPlayState2) {
            D1(autoPlayState2);
            ye0 ye0Var = this.N;
            if (ye0Var != null) {
                ye0Var.e();
            }
            O();
            I();
            d3b0 d3b0Var = this.p0;
            if (d3b0Var != null) {
                d3b0Var.C(true);
            }
            this.Q.e();
            i1();
            this.W.b();
            rzr0 d1 = d1();
            if (d1 != null) {
                d1.J();
            }
        }
    }

    @Override // xsna.yg5
    public final void c0() {
        if (C0()) {
            H1();
        } else {
            g1();
        }
    }

    public final int c1() {
        OneVideoPlayer a2;
        one.video.player.tracks.c E;
        cms0 cms0Var;
        FrameSize b2;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null || (E = a2.E()) == null || (cms0Var = (cms0) E.c) == null || (b2 = cms0Var.b()) == null) {
            return 0;
        }
        return Math.min(b2.getHeight(), b2.getWidth());
    }

    @Override // xsna.yg5
    public final boolean d() {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        return (((d3b0Var == null || (a2 = d3b0Var.a()) == null) ? null : a2.getState()) == OneVideoPlayer.State.BUFFERING) || (this.p0 == null && this.x == AutoPlayState.PLAY);
    }

    @Override // xsna.yg5
    public final String d0() {
        return this.v;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    public final rzr0 d1() {
        int i2 = f.$EnumSwitchMapping$0[Z0().o.ordinal()];
        if (i2 == 1) {
            rzr0 rzr0Var = (rzr0) this.d0.getValue();
            if (this.u.p0()) {
                return rzr0Var;
            }
            return null;
        }
        if (i2 == 2) {
            return (rzr0) this.e0.getValue();
        }
        if (i2 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.yg5
    public final void e() {
        OneVideoPlayer a2;
        if (this.n0) {
            return;
        }
        D1(AutoPlayState.PLAY);
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null) {
            return;
        }
        a2.e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yg5
    public final void e0(ArrayList arrayList) {
        i11 aVar;
        Pair pair;
        i11 bVar;
        Pair pair2;
        rzr0 rzr0Var = (rzr0) this.e0.getValue();
        if (rzr0Var != null) {
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (Object obj : arrayList) {
                if (obj instanceof AdStatPixel.VideoStarted) {
                    aVar = new i11.d.a(0, true, (AdStatPixel.VideoStarted) obj);
                } else if (obj instanceof AdStatPixel.VideoCompleted) {
                    aVar = new i11.d.a(100, true, (AdStatPixel.VideoCompleted) obj);
                } else if (obj instanceof AdStatPixel.VideoResumed) {
                    aVar = new i11.f((Serializer.StreamParcelableAdapter) obj);
                } else if (obj instanceof AdStatPixel.VideoPaused) {
                    aVar = new i11.e((Serializer.StreamParcelableAdapter) obj);
                } else {
                    if (obj instanceof AdStatPixel.VideoPositionReached) {
                        AdStatPixel.VideoPositionReached videoPositionReached = (AdStatPixel.VideoPositionReached) obj;
                        AdStatPixel.Position position = videoPositionReached.d;
                        if (position instanceof AdStatPixel.Position.Percent) {
                            pair2 = new Pair(Integer.valueOf(((AdStatPixel.Position.Percent) position).b), Boolean.TRUE);
                        } else {
                            if (!(position instanceof AdStatPixel.Position.Time)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pair2 = new Pair(Integer.valueOf(((AdStatPixel.Position.Time) position).b), Boolean.FALSE);
                        }
                        bVar = new i11.d.a(((Number) pair2.d()).intValue(), ((Boolean) pair2.g()).booleanValue(), videoPositionReached);
                    } else if (obj instanceof AdStatPixel.VideoViewabilityDuration) {
                        AdStatPixel.VideoViewabilityDuration videoViewabilityDuration = (AdStatPixel.VideoViewabilityDuration) obj;
                        bVar = new i11.d.b(videoViewabilityDuration.e, videoViewabilityDuration.d, videoViewabilityDuration, null);
                    } else if (obj instanceof AdStatPixel.VideoViewabilityAtPosition) {
                        AdStatPixel.VideoViewabilityAtPosition videoViewabilityAtPosition = (AdStatPixel.VideoViewabilityAtPosition) obj;
                        AdStatPixel.Position position2 = videoViewabilityAtPosition.f;
                        if (position2 instanceof AdStatPixel.Position.Percent) {
                            pair = new Pair(Integer.valueOf(((AdStatPixel.Position.Percent) position2).b), Boolean.TRUE);
                        } else {
                            if (!(position2 instanceof AdStatPixel.Position.Time)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pair = new Pair(Integer.valueOf(((AdStatPixel.Position.Time) position2).b), Boolean.FALSE);
                        }
                        aVar = new i11.d.c(((Number) pair.d()).intValue(), ((Boolean) pair.g()).booleanValue(), videoViewabilityAtPosition.d, videoViewabilityAtPosition.e, videoViewabilityAtPosition);
                    } else if (obj instanceof AdStatPixel.VideoVolumeOn) {
                        aVar = new i11.h((Serializer.StreamParcelableAdapter) obj);
                    } else if (obj instanceof AdStatPixel.VideoVolumeOff) {
                        aVar = new i11.g((Serializer.StreamParcelableAdapter) obj);
                    } else if (obj instanceof AdStatPixel.VideoFullscreenOn) {
                        aVar = new i11.c((Serializer.StreamParcelableAdapter) obj);
                    } else if (obj instanceof AdStatPixel.VideoFullscreenOff) {
                        aVar = new i11.b((Serializer.StreamParcelableAdapter) obj);
                    } else {
                        if (!(obj instanceof AdStatPixel.VideoError)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = new i11.a((Serializer.StreamParcelableAdapter) obj);
                    }
                    aVar = bVar;
                }
                arrayList2.add(aVar);
            }
            rzr0Var.E(arrayList2);
        }
    }

    public final float e1() {
        if (q1()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (Z0().d != null) {
            Float f2 = Z0().d;
            return f2 != null ? f2.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        z2s0.b.getClass();
        return z2s0.n;
    }

    @Override // xsna.yg5
    public final void f() {
        if (this.n0) {
            return;
        }
        O();
        D();
        I();
        v1(false);
    }

    @Override // xsna.yg5
    public final void f0(hnt0 hnt0Var) {
        if (this.y.add(hnt0Var)) {
            hnt0Var.q(EmptyList.b);
            hnt0Var.z0(this, this.L);
            wgt0 h0 = h0();
            if (h0.a * h0.b != 0 && !P0()) {
                hnt0Var.E3(this, h0().a, h0().b);
            }
            if (this.p0 != null) {
                hnt0Var.p2(this);
            }
            if (p()) {
                hnt0Var.d4(this);
            }
            s1(hnt0Var);
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            MediaRouteConnectStatus mediaRouteConnectStatus = b.C1208b.a().x;
            if (mediaRouteConnectStatus != null) {
                hnt0Var.R3(mediaRouteConnectStatus);
            }
            hnt0Var.U3(this.e.x(this.u));
        }
    }

    public final Float f1() {
        if ((Z0().p != PlayerType.CAROUSEL && Z0().p != PlayerType.FULLSCREEN) || this.u.q0() || this.u.C2()) {
            return null;
        }
        return this.f.b();
    }

    @Override // xsna.fuk0
    public final void g() {
        rlt0 rlt0Var;
        I();
        this.y.T0(this);
        long position = getPosition();
        q0.getClass();
        if (position > 1000 && (rlt0Var = this.F) != null) {
            rlt0Var.k++;
            rlt0Var.m = SystemClock.elapsedRealtime();
        }
    }

    @Override // xsna.yg5
    public final int g0() {
        OneVideoPlayer a2;
        Integer a3;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null || (a3 = vm80.a(a2)) == null) {
            return -1;
        }
        return a3.intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean g1() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    @Override // xsna.yg5
    public final com.vk.libvideo.autoplay.a getConfig() {
        return Z0();
    }

    @Override // xsna.yg5
    public final long getDuration() {
        d3b0 d3b0Var = this.p0;
        OneVideoPlayer a2 = d3b0Var != null ? d3b0Var.a() : null;
        return (a2 == null || a2.getDuration() <= 1) ? this.u.getDuration() * 1000 : a2.getDuration();
    }

    @Override // xsna.yg5
    public final long getPosition() {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null) {
            return -1L;
        }
        return a2.getCurrentPosition();
    }

    @Override // xsna.yg5
    public final float getVolume() {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        return (d3b0Var == null || (a2 = d3b0Var.a()) == null) ? e1() : a2.getVolume();
    }

    @Override // xsna.fuk0
    public final void h() {
        j8x j8xVar;
        I();
        l0();
        D1(AutoPlayState.PLAY);
        i1();
        d3b0 d3b0Var = this.p0;
        N1(d3b0Var != null ? d3b0Var.a() : null);
        this.y.V3(this);
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null && rlt0Var.m > 0) {
            rlt0Var.l = (SystemClock.elapsedRealtime() - rlt0Var.m) + rlt0Var.l;
            rlt0Var.m = 0L;
        }
        yh0 yh0Var = this.O;
        if (yh0Var == null || (j8xVar = yh0Var.d) == null) {
            return;
        }
        int i2 = j8xVar.g;
        if (i2 != 2) {
            gu8.e(null, "InstreamResearch: VideoAdTracker error - unable to track resume, wrong state ".concat(j8x.c(i2)));
        } else {
            j8xVar.d("playbackResumed");
            j8xVar.g = 1;
        }
    }

    @Override // xsna.yg5
    public final wgt0 h0() {
        d3b0 d3b0Var = this.p0;
        if (d3b0Var != null) {
            wgt0 a2 = rm80.a(d3b0Var);
            if (a2.a * a2.b == 0) {
                a2 = null;
            }
            if (a2 != null) {
                return a2;
            }
        }
        return new wgt0(this.u.getWidth(), this.u.getHeight());
    }

    public final Pair<Float, String> h1() {
        who0 who0Var;
        d3b0 d3b0Var = this.p0;
        String str = null;
        OneVideoPlayer a2 = d3b0Var != null ? d3b0Var.a() : null;
        if (a2 == null) {
            return new Pair<>(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), null);
        }
        Float valueOf = Float.valueOf(b());
        one.video.player.tracks.b Q = a2.Q();
        if (Q != null && (who0Var = (who0) Q.c) != null) {
            str = who0Var.c;
        }
        return new Pair<>(valueOf, str);
    }

    @Override // xsna.fuk0
    public final void i(a6q a6qVar, one.video.player.tracks.a aVar) {
        OneVideoPlayer oneVideoPlayer = a6qVar.b;
        if (oneVideoPlayer != null) {
            this.b0.t(oneVideoPlayer, aVar);
        }
    }

    @Override // xsna.yg5
    public final int i0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    public final void i1() {
        AutoPlayState autoPlayState = AutoPlayState.PLAY;
        AutoPlayState autoPlayState2 = this.x;
        bgn bgnVar = this.s;
        if (autoPlayState != autoPlayState2) {
            z2s0.b.getClass();
            z2s0.i(bgnVar);
        } else {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            com.vk.libvideo.autoplay.e.c = new WeakReference<>(this);
            z2s0.b.g(bgnVar, (!this.u.x5() && (Z0().c() || !Z0().f() || (M0() && ((Boolean) this.f0.getValue()).booleanValue())) && Z0().k) ? 2 : 0);
        }
    }

    @Override // xsna.yg5
    public final boolean isPaused() {
        return this.x.h();
    }

    @Override // xsna.yg5
    public final boolean isPlaying() {
        OneVideoPlayer a2;
        if (this.x != AutoPlayState.PLAY) {
            return false;
        }
        d3b0 d3b0Var = this.p0;
        return ((d3b0Var == null || (a2 = d3b0Var.a()) == null) ? null : a2.getState()) == OneVideoPlayer.State.PLAYING;
    }

    @Override // xsna.yg5
    public final boolean isPrepared() {
        OneVideoPlayer a2;
        if (this.Z) {
            d3b0 d3b0Var = this.p0;
            if (d3b0Var == null || (a2 = d3b0Var.a()) == null || this.k0 == null) {
                return false;
            }
            sht0 j2 = a2.j();
            m7q m7qVar = this.k0;
            if (!epx.f(j2, m7qVar != null ? jgz.e(m7qVar) : null)) {
                return false;
            }
        } else {
            d3b0 d3b0Var2 = this.p0;
            if (d3b0Var2 == null || !d3b0Var2.isPrepared()) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.yg5
    public final boolean isReady() {
        return this.x == AutoPlayState.PLAY && isPlaying() && p();
    }

    @Override // xsna.u0m
    @ozl
    public final void j(DeprecatedStatisticInterface deprecatedStatisticInterface) {
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            rlt0Var.b = deprecatedStatisticInterface;
        }
    }

    @Override // xsna.yg5
    public final boolean j0(VideoTextureView videoTextureView) {
        if (videoTextureView == null) {
            return false;
        }
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null) {
            ye0 ye0Var = this.N;
            d3b0Var = ye0Var != null ? ye0Var.d() : null;
        }
        return d3b0Var != null && d3b0Var.k(videoTextureView);
    }

    @Override // xsna.fuk0
    public final void k(PlayerError playerError, OneVideoPlaybackException oneVideoPlaybackException) {
        h84 h84Var = new h84(oneVideoPlaybackException, this, playerError, 5);
        if (!this.G) {
            h84Var.invoke();
        } else {
            this.n.post(new q44(h84Var, 14));
        }
    }

    @Override // xsna.yg5
    public final void k0() {
        d3b0 d3b0Var = this.p0;
        if (d3b0Var != null) {
            d3b0Var.j(null);
        }
        this.A = null;
        this.B = null;
    }

    public final boolean k1() {
        c8x c8xVar;
        p7z0 p7z0Var;
        OneVideoPlayer a2;
        AutoPlayState autoPlayState = this.x;
        AutoPlayState autoPlayState2 = AutoPlayState.STOP;
        if (autoPlayState == autoPlayState2) {
            return false;
        }
        D1(autoPlayState2);
        d3b0 d3b0Var = this.p0;
        if (d3b0Var != null && (a2 = d3b0Var.a()) != null) {
            a2.stop();
        }
        ye0 ye0Var = this.N;
        if (ye0Var != null && (c8xVar = ye0Var.i) != null && (p7z0Var = c8xVar.i) != null) {
            p7z0Var.d(p7z0Var.j);
        }
        this.y.U(this);
        this.Q.e();
        i1();
        this.W.b();
        return true;
    }

    @Override // xsna.hu70
    public final void kg(Map<String, ? extends DownloadInfo> map) {
        DownloadInfo x = this.e.x(this.u);
        boolean z = x != null;
        if (z) {
            this.y.U3(x);
        }
        m7q m7qVar = this.k0;
        if (m7qVar != null && !z && m7qVar.n == 1 && m7qVar.p) {
            x1(new id4(this, 11));
        }
    }

    @Override // xsna.fuk0
    public final void l(boolean z) {
        if (z && this.m0 == VideoMode.PREFETCH) {
            L(VideoMode.EMPTY);
        }
        this.y.P1(this, z);
    }

    @Override // xsna.yg5
    public final void l0() {
        OneVideoPlayer a2;
        List<one.video.player.tracks.a> F;
        one.video.player.tracks.a aVar;
        d3b0 d2;
        if (P0()) {
            d3b0 d3b0Var = this.p0;
            if (d3b0Var != null) {
                d3b0Var.j(null);
            }
            ye0 ye0Var = this.N;
            if (ye0Var == null || (d2 = ye0Var.d()) == null) {
                return;
            }
            if (!Z0().a) {
                ye0 ye0Var2 = this.N;
                if (epx.d(ye0Var2 != null ? ye0Var2.l : null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                    if (!com.vk.libvideo.autoplay.e.c()) {
                        com.vk.libvideo.autoplay.e.f(true);
                    }
                }
                ye0 ye0Var3 = this.N;
                if (ye0Var3 != null) {
                    ye0Var3.l = null;
                }
            }
            F1(d2);
            setVolume(e1());
            return;
        }
        d3b0 d3b0Var2 = this.p0;
        if (d3b0Var2 == null) {
            return;
        }
        OneVideoPlayer a3 = d3b0Var2.a();
        if (a3 != null) {
            E1(a3, Z0().m);
        }
        OneVideoPlayer a4 = d3b0Var2.a();
        if (a4 != null && (F = a4.F()) != null && (aVar = (one.video.player.tracks.a) j5g.b0(this.C, F)) != null) {
            d3b0Var2.q(aVar);
        }
        d3b0Var2.g(Z0().n);
        F1(d3b0Var2);
        setVolume(e1());
        OneVideoPlayer a5 = d3b0Var2.a();
        one.video.player.RepeatMode repeatMode = a5 != null ? a5.getRepeatMode() : null;
        one.video.player.RepeatMode repeatMode2 = one.video.player.RepeatMode.ALL;
        if (I0() == (repeatMode == repeatMode2) || (a2 = d3b0Var2.a()) == null) {
            return;
        }
        if (!I0()) {
            repeatMode2 = one.video.player.RepeatMode.OFF;
        }
        a2.R(repeatMode2);
    }

    public final boolean l1() {
        return this.j.a() || this.i.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x012e, code lost:
    
        if (r4 == r5) goto L124;
     */
    @Override // xsna.fuk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(long j2, long j3) {
        VideoAdvertisementsRepository.a.c f2;
        j8x j8xVar;
        VideoTextureView videoTextureView;
        TransformController transformController;
        ScreenType screenType;
        PlayerType playerType;
        if (this.u.z0() || this.u.x5()) {
            this.y.X1(this, -1L, -1L);
            return;
        }
        long j4 = j2 / 1000;
        int i2 = (int) j4;
        if (this.u.q0()) {
            return;
        }
        if (this.F != null && Z0() != com.vk.libvideo.autoplay.a.t) {
            rlt0 rlt0Var = this.F;
            if (rlt0Var != null && rlt0Var.D != (playerType = Z0().p)) {
                rlt0Var.D = playerType;
            }
            rlt0 rlt0Var2 = this.F;
            if (rlt0Var2 != null && rlt0Var2.E != (screenType = Z0().q)) {
                rlt0Var2.E = screenType;
                rlt0Var2.i("screen", screenType.toString().toLowerCase());
            }
        }
        VideoFile videoFile = this.u;
        if (com.vk.libvideo.autoplay.j.a(videoFile) && j2 > 0) {
            bpn0 bpn0Var = t5t0.e;
            t5t0.a.a().b(j2, videoFile.r1());
        }
        int i3 = 0;
        if (this.M && this.F != null) {
            this.M = false;
            int c1 = c1();
            Pair<Float, String> h1 = h1();
            float floatValue = h1.d().floatValue();
            String g2 = h1.g();
            rlt0 rlt0Var3 = this.F;
            if (rlt0Var3 != null) {
                float volume = getVolume();
                WeakReference<VideoTextureView> weakReference = this.A;
                rlt0Var3.e("continue", i2, floatValue, volume, ((weakReference == null || (videoTextureView = weakReference.get()) == null || (transformController = videoTextureView.getTransformController()) == null) ? null : transformController.e) == TransformController.ScaleType.CROP, g2, g0(), c1);
            }
            i3 = 0;
        }
        int i4 = i3;
        this.y.X1(this, j2, j3);
        rzr0 d1 = d1();
        if (d1 != null && j2 >= 0 && j3 > 0) {
            d1.P(j2);
            d1.N(j2, j3);
            d1.M(j2);
        }
        B1(Math.max(i4, i2));
        yh0 yh0Var = this.O;
        if (yh0Var != null && (j8xVar = yh0Var.d) != null) {
            float f3 = j4;
            if (j8xVar.g < 1) {
                j8xVar.d("playbackStarted");
                j8xVar.g = 1;
            }
            int i5 = j8xVar.g;
            if (i5 > 1) {
                gu8.c(null, "InstreamResearch: Unable to track progress while state is - ".concat(j8x.c(i5)));
            } else {
                int round = Math.round(f3);
                int i6 = j8xVar.h;
                if (round < i6) {
                    j8xVar.d("rewind");
                }
                j8xVar.h = round;
                vhz0 vhz0Var = j8xVar.k;
                if (vhz0Var != null) {
                    b6z0 b6z0Var = vhz0Var.a;
                    float f4 = round;
                    float f5 = vhz0Var.b;
                    if (f4 != f5) {
                        if (f4 < f5 || (vhz0Var.c > 0 && (((long) (f4 - f5)) * 1000) - (System.currentTimeMillis() - vhz0Var.c) > 1000)) {
                            Iterator it = b6z0Var.c.iterator();
                            while (it.hasNext()) {
                                ((pgz0) it.next()).j = -1.0f;
                            }
                        }
                        if (!b6z0Var.c.isEmpty()) {
                            Iterator it2 = b6z0Var.c.iterator();
                            while (it2.hasNext()) {
                                ((oiz0) it2.next()).j = -1.0f;
                            }
                        }
                        vhz0Var.b = f4;
                        vhz0Var.c = System.currentTimeMillis();
                    }
                }
                vcz0 vcz0Var = j8xVar.j;
                if (vcz0Var != null) {
                    int i7 = j8xVar.e;
                    ArrayList arrayList = vcz0Var.a;
                    b6z0 b6z0Var2 = vcz0Var.b;
                    if (i7 >= 0 && round >= 0 && round != vcz0Var.c) {
                        vcz0Var.c = round;
                        if (!arrayList.isEmpty() && round != 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            while (i8 < size) {
                                Object obj = arrayList.get(i8);
                                i8++;
                                cfz0 cfz0Var = (cfz0) obj;
                                cfz0Var.getClass();
                                if (round >= 0 && round % 0 == 0) {
                                    String replace = cfz0Var.b.replace("[CONTENTPLAYHEAD]", String.valueOf(round));
                                    if (!TextUtils.isEmpty(replace)) {
                                        h8z0.b(replace);
                                    }
                                }
                            }
                        }
                        b6z0 a2 = b6z0Var2.a();
                        List list = b6z0Var2.c;
                        while (!list.isEmpty() && ((e9z0) ji.a(1, list)).f <= round) {
                            a2.c.add((e9z0) list.remove(list.size() - 1));
                        }
                        h8z0.h(a2, null);
                    }
                }
            }
        }
        ye0 ye0Var = this.N;
        if (ye0Var == null || (f2 = ye0Var.g.c.f()) == null || j2 < f2.d + f2.c) {
            return;
        }
        f2.e.invoke(f2.b);
        this.k.c(VideoAdvertisementsRepository.AdType.OVERLAY);
    }

    @Override // xsna.yg5
    public final rlt0 m0() {
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1() {
        bpn0 bpn0Var = this.V;
        boolean booleanValue = ((Boolean) bpn0Var.getValue()).booleanValue();
        bpn0 bpn0Var2 = this.r;
        if (!booleanValue || !((Boolean) bpn0Var2.getValue()).booleanValue()) {
            if (((Boolean) bpn0Var.getValue()).booleanValue() || ((Boolean) bpn0Var2.getValue()).booleanValue()) {
                if (((Boolean) bpn0Var.getValue()).booleanValue()) {
                    AutoPlayMinifiedState R0 = R0();
                    R0.getClass();
                    return R0 != AutoPlayMinifiedState.MINIPLAYER;
                }
                if (((Boolean) bpn0Var2.getValue()).booleanValue()) {
                    AutoPlayMinifiedState R02 = R0();
                    R02.getClass();
                    return R02 == AutoPlayMinifiedState.MINIPLAYER;
                }
                if (R0().h()) {
                    return false;
                }
            } else if (!R0().h()) {
            }
        }
        return true;
    }

    @Override // xsna.fuk0
    public final void n(d3b0 d3b0Var, int i2, int i3) {
        one.video.player.tracks.c E;
        cms0 cms0Var;
        if (this.u.getWidth() == 0) {
            this.u.l8(i2);
        }
        if (this.u.getHeight() == 0) {
            this.u.G5(i3);
        }
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            OneVideoPlayer a2 = d3b0Var.a();
            rlt0Var.n = (a2 == null || (E = a2.E()) == null || (cms0Var = (cms0) E.c) == null) ? -1 : cms0Var.d;
        }
        this.y.E3(this, i2, i3);
    }

    @Override // xsna.yg5
    public final void n0(String str, String str2, String str3, boolean z) {
        q0(str);
        s0(str2);
        if (this.u.x5() || this.u.Sa() || this.u.I1()) {
            return;
        }
        rlt0 rlt0Var = this.F;
        if (rlt0Var == null) {
            this.F = new rlt0(this.u, str, str2, z, new ikk0(this, 11), new tbe0(this, 21), new irc0(this, 23), new p1d0(this, 28), new afl0(this, 11));
        } else {
            rlt0Var.e = str2;
            if (!Objects.equals(rlt0Var.d, str)) {
                rlt0Var.d = str;
            }
            rlt0Var.g = z;
        }
        rlt0 rlt0Var2 = this.F;
        if (rlt0Var2 != null && str3 != null) {
            rlt0Var2.f = str3;
        }
        O1(false);
    }

    public final boolean n1() {
        boolean z;
        if (Z0().p == PlayerType.CAROUSEL) {
            rlt0 rlt0Var = this.F;
            if (rlt0Var != null ? rlt0Var.g : false) {
                z = true;
                return !(Z0().p != PlayerType.INLINE && a1()) || z;
            }
        }
        z = false;
        if (Z0().p != PlayerType.INLINE && a1()) {
        }
    }

    @Override // xsna.fuk0
    public final void o(d3b0 d3b0Var) {
        U0(d3b0Var);
        this.o0 = new b(System.nanoTime(), this.o0.b);
    }

    @Override // com.vk.libvideo.autoplay.e.a
    public final void onMuteChange(boolean z) {
        j8x j8xVar;
        setVolume(e1());
        i1();
        yh0 yh0Var = this.O;
        if (yh0Var != null && (j8xVar = yh0Var.d) != null) {
            j8xVar.d(z ? "volumeOff" : "volumeOn");
        }
        if (z) {
            return;
        }
        x0(ForceLogReason.UNMUTE);
    }

    @Override // xsna.yg5
    public final boolean p() {
        d3b0 d3b0Var = this.p0;
        return d3b0Var != null && d3b0Var.e();
    }

    @Override // xsna.yg5
    public final boolean p0() {
        if (!Z0().i) {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            if (!com.vk.libvideo.autoplay.e.g()) {
                return false;
            }
        }
        VideoMinifiedPlayerStateHolder.a.getClass();
        return !VideoMinifiedPlayerStateHolder.a();
    }

    public final boolean p1() {
        String str;
        String str2;
        m7q m7qVar = this.j0;
        String str3 = null;
        String lowerCase = (m7qVar == null || (str2 = m7qVar.r) == null) ? null : str2.toLowerCase(Locale.ROOT);
        m7q m7qVar2 = this.k0;
        if (m7qVar2 != null && (str = m7qVar2.r) != null) {
            str3 = str.toLowerCase(Locale.ROOT);
        }
        if (epx.f(lowerCase, "offline") || !epx.f(str3, "offline")) {
            return epx.f(lowerCase, "offline") && !epx.f(str3, "offline");
        }
        return true;
    }

    @Override // xsna.yg5
    public final void pause() {
        C(false);
    }

    @Override // xsna.yg5
    public final void play() {
        if (this.n0 || this.x == AutoPlayState.PAUSED_STRONG) {
            return;
        }
        v1(false);
    }

    @Override // xsna.yg5
    public final String q() {
        return this.w;
    }

    @Override // xsna.yg5
    public final void q0(String str) {
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null && !Objects.equals(rlt0Var.d, str)) {
            rlt0Var.d = str;
        }
        this.v = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (xsna.epx.d(r3 != null ? r3.l : null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0040, code lost:
    
        if (Z0().f() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (xsna.c63.f != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q1() {
        boolean z;
        if (fxc0.B().J().i0()) {
            if (!Z0().c() && Z0().f()) {
                c63 c63Var = c63.a;
            }
            z = false;
        } else {
            if (!Z0().c()) {
            }
            z = false;
        }
        if (P0() && Z0().a) {
            ye0 ye0Var = this.N;
        }
        return z || !Z0().k || this.u.x5() || this.u.k0();
    }

    @Override // xsna.fuk0
    public final void r(one.video.player.tracks.b bVar, boolean z) {
        who0 who0Var;
        this.y.U0(bVar);
        rlt0 rlt0Var = this.F;
        if (rlt0Var == null || rlt0Var == null) {
            return;
        }
        String str = (bVar == null || (who0Var = (who0) bVar.c) == null) ? null : who0Var.c;
        String str2 = z ? "auto_subtitles" : "subtitles";
        if (str == null) {
            str = "off";
        }
        rlt0Var.i(str2, str);
    }

    @Override // xsna.yg5
    public final void r0(boolean z) {
        this.n0 = z;
    }

    @Override // xsna.yg5
    public final void release() {
        if (this.G) {
            I1();
        }
    }

    @Override // xsna.fuk0
    public final void s(long j2) {
        this.y.N3(this, j2);
    }

    @Override // xsna.yg5
    public final void s0(String str) {
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            rlt0Var.e = str;
        }
        this.w = str;
    }

    public final void s1(hnt0 hnt0Var) {
        ye0.a aVar;
        com.vk.libvideo.api.ad.a j2;
        if (isPlaying()) {
            hnt0Var.V3(this);
            return;
        }
        if (P0()) {
            ye0 ye0Var = this.N;
            if (ye0Var == null || (aVar = ye0Var.z) == null || (j2 = aVar.j()) == null) {
                return;
            }
            this.y.m(aVar, j2);
            return;
        }
        if (J()) {
            zva0 p = gpt0.p(this.D, this.l0 instanceof mv70);
            hnt0Var.J3(this, p.a, p.b, this.D, this.E);
        } else if (d()) {
            hnt0Var.n2(this);
        } else if (this.x.h() || M()) {
            hnt0Var.r1(this);
        }
    }

    @Override // xsna.yg5
    public final void seek(long j2) {
        d3b0 d3b0Var;
        OneVideoPlayer a2;
        if (this.n0 || (d3b0Var = this.p0) == null || (a2 = d3b0Var.a()) == null) {
            return;
        }
        a2.seekTo(j2);
    }

    @Override // xsna.yg5
    public final void setMediaRouteConnectStatus(MediaRouteConnectStatus mediaRouteConnectStatus) {
        this.y.R3(mediaRouteConnectStatus);
    }

    @Override // xsna.yg5
    public final void setPlaybackSpeed(float f2) {
        OneVideoPlayer a2;
        d3b0 d3b0Var = this.p0;
        if (d3b0Var == null || (a2 = d3b0Var.a()) == null) {
            return;
        }
        a2.setPlaybackSpeed(f2);
    }

    @Override // xsna.yg5
    public final void setVolume(float f2) {
        boolean z;
        rzr0 d1;
        OneVideoPlayer a2;
        OneVideoPlayer a3;
        d3b0 d2;
        ye0 ye0Var = this.N;
        OneVideoPlayer a4 = (ye0Var == null || (d2 = ye0Var.d()) == null) ? null : d2.a();
        boolean z2 = true;
        if (a4 == null || a4.getVolume() == f2) {
            z = false;
        } else {
            ye0 ye0Var2 = this.N;
            if (ye0Var2 != null) {
                ye0Var2.h(f2, false);
            }
            z = true;
        }
        d3b0 d3b0Var = this.p0;
        float volume = (d3b0Var == null || (a3 = d3b0Var.a()) == null) ? 1.0f : a3.getVolume();
        if (this.p0 != null) {
            if (!(f2 == volume)) {
                if (f2 == 1.0f && volume < 1.0f && !this.u.k0()) {
                    rzr0 d12 = d1();
                    if (d12 != null) {
                        zi0 zi0Var = d12.b;
                        if (!zi0Var.d) {
                            zi0Var.d = true;
                            Iterator<i11> it = d12.e.iterator();
                            while (it.hasNext()) {
                                i11 next = it.next();
                                if (next instanceof i11.h) {
                                    d12.O(next);
                                }
                            }
                        }
                    }
                } else if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && volume > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !epx.f(bmp0.a, this)) {
                    rzr0 d13 = d1();
                    if (d13 != null) {
                        d13.L();
                    }
                } else if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= volume && volume <= 0.1f && epx.f(bmp0.a, this) && (d1 = d1()) != null) {
                    d1.L();
                }
                d3b0 d3b0Var2 = this.p0;
                if (d3b0Var2 != null && (a2 = d3b0Var2.a()) != null) {
                    if (this.u.k0()) {
                        f2 = 0.0f;
                    }
                    a2.setVolume(f2);
                }
            } else {
                z2 = z;
            }
            z = z2;
        }
        if (z) {
            this.y.j4(this);
        }
    }

    @Override // xsna.yg5
    public final void stop() {
        if (k1() && this.G) {
            H1();
        }
    }

    @Override // xsna.fuk0
    public final void t(long j2) {
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            Bundle a2 = q9k.a(NotificationCompat.CATEGORY_EVENT, "first_bytes");
            a2.putString("value", String.valueOf(j2));
            rlt0Var.h(a2);
        }
    }

    @Override // xsna.yg5
    public final boolean t0() {
        return this.P;
    }

    public final void t1() {
        io.reactivex.rxjava3.disposables.c subscribe;
        ye0 ye0Var = this.N;
        if (ye0Var == null || (subscribe = ye0Var.g.c.a().a0(asu0.a.d()).subscribe(new jw80(new emh0(this, 16), 21), new h4f0(new t810(22), 12))) == null) {
            return;
        }
        this.Q.b(subscribe);
    }

    public final String toString() {
        return "gif=" + this.u.x5() + ", live=" + this.u.q0() + " mobile=" + this.u.A1() + ' ' + this.u.r1() + ' ' + this.u.getTitle();
    }

    @Override // xsna.fuk0
    public final void u(float f2) {
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            Bundle b2 = rlt0Var.b("speed", rlt0.c(f2));
            b2.putString("speed", String.valueOf((int) (f2 * 100.0f)));
            rlt0Var.h(b2);
        }
    }

    @Override // xsna.yg5
    public final boolean u0() {
        return this.l0 instanceof mv70;
    }

    @ozl
    public final void u1(d3b0 d3b0Var) {
        if (g1()) {
            d3b0 d3b0Var2 = this.p0;
            if (d3b0Var2 != null) {
                d3b0Var2.a();
            }
            d3b0Var.toString();
            new Exception();
        }
        OneVideoPlayer a2 = d3b0Var.a();
        if (a2 != null) {
            a2.c0(this.a0);
        }
        OneVideoPlayer a3 = d3b0Var.a();
        o3s0 o3s0Var = this.c0;
        if (a3 != null) {
            a3.c0(o3s0Var);
        }
        OneVideoPlayer a4 = d3b0Var.a();
        if (a4 != null) {
            a4.H(o3s0Var);
        }
        this.y.u();
        if (this.G) {
            J1();
        } else {
            gpt0 gpt0Var = gpt0.a;
            Random.b.getClass();
            String bigInteger = new BigInteger(Long.toUnsignedString(Random.c.m()), 10).toString(36);
            this.K = bigInteger;
            m7q m7qVar = this.k0;
            C1(m7qVar != null ? m7q.a(m7qVar, null, null, null, 0, false, false, null, 0L, null, bigInteger, false, 100663295) : null);
        }
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_EVENT, "player_close");
            rlt0Var.h(bundle);
        }
        ye0 ye0Var = this.N;
        if (ye0Var != null) {
            ye0Var.x.dispose();
        }
        ArrayList<um80> arrayList = this.g0;
        Iterator<um80> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        arrayList.clear();
        nza0 h2 = d3b0Var.h();
        if (h2 != null) {
            h2.i = null;
        }
    }

    @Override // xsna.yg5
    public final boolean v() {
        return this.u.q0();
    }

    @Override // xsna.yg5
    @ozl
    public final d3b0 v0() {
        return this.p0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0225, code lost:
    
        if (r13 != false) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v1(boolean z) {
        InstreamAd instreamAd;
        yh0 yh0Var;
        String r;
        d3b0 d3b0Var;
        u6z0 u6z0Var;
        String x8;
        int i2;
        LinkedHashMap linkedHashMap;
        OneVideoPlayer a2;
        if (this.n0) {
            return;
        }
        int i3 = 1;
        if (B() || (this.u.z0() && !z)) {
            X0(new h6r(this, z, i3));
            return;
        }
        jps0 jps0Var = this.W;
        if (!jps0Var.g && !jps0Var.h && jps0Var.c > 0 && jps0Var.a()) {
            io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.a.r(jps0Var.c, TimeUnit.MILLISECONDS).subscribe(new dh1(jps0Var, 5));
            pgn pgnVar = jps0Var.e;
            qcy<Object> qcyVar = jps0.i[0];
            pgnVar.b(subscribe);
            jps0Var.f = SystemClock.elapsedRealtime();
            jps0Var.g = true;
        }
        ((n1s0) this.m.b).getClass();
        rzr0 d1 = d1();
        if (d1 != null) {
            d1.K();
        }
        AutoPlayState autoPlayState = this.x;
        AutoPlayState autoPlayState2 = AutoPlayState.PLAY;
        if (autoPlayState == autoPlayState2 && !z) {
            if (g1()) {
                d3b0 d3b0Var2 = this.p0;
                if (d3b0Var2 != null) {
                    d3b0Var2.a();
                }
                Objects.toString(this.x);
                new Exception();
            }
            i1();
            l0();
            O1(false);
            d3b0 d3b0Var3 = this.p0;
            Float f1 = f1();
            if (f1 != null) {
                float floatValue = f1.floatValue();
                if (d3b0Var3 == null || (a2 = d3b0Var3.a()) == null) {
                    return;
                }
                a2.setPlaybackSpeed(floatValue);
                return;
            }
            return;
        }
        if (g1()) {
            d3b0 d3b0Var4 = this.p0;
            if (d3b0Var4 != null) {
                d3b0Var4.a();
            }
            Objects.toString(this.x);
            new Exception();
        }
        D1(autoPlayState2);
        boolean P0 = P0();
        VideoUIEventDispatcher videoUIEventDispatcher = this.y;
        if (!P0 && d()) {
            videoUIEventDispatcher.n2(this);
        }
        Y0();
        int g0 = (z && (g0() == -4 || g0() == -2)) ? -1 : g0();
        InstreamAd U7 = this.u.U7();
        int i4 = 3;
        if (U7 != null) {
            boolean a1 = a1();
            boolean z2 = Z0().a;
            String str = this.v;
            if (str == null || (x8 = cqm0.a(str)) == null) {
                x8 = this.u.x8();
            }
            Map<String, String> map = U7.d;
            Pair pair = new Pair("autoplay", String.valueOf(a1 ? 1 : 0));
            Pair pair2 = new Pair(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, String.valueOf(z2 ? 1 : 0));
            PlayerType playerType = Z0().p;
            int[] iArr = f.$EnumSwitchMapping$2;
            int i5 = 6;
            if (iArr[playerType.ordinal()] == 1) {
                i2 = 10;
            } else if (Z0().c) {
                i2 = 19;
            } else {
                gpt0 gpt0Var = gpt0.a;
                if (epx.f(x8, "im")) {
                    i2 = 1;
                } else if (epx.f(x8, "fave")) {
                    i2 = 6;
                } else if (epx.f(x8, "videos_group")) {
                    i2 = 8;
                } else {
                    if (!epx.f(x8, "video")) {
                        if (epx.f(x8, "videos")) {
                            i2 = 14;
                        } else if (epx.f(x8, "videos_user")) {
                            i2 = 17;
                        } else if (epx.f(x8, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM))) {
                            i2 = 23;
                        } else {
                            if (x8 != null) {
                                if (!brm0.B(x8, "video_", false)) {
                                    if (brm0.B(x8, "club", false)) {
                                        i2 = 12;
                                    } else if (brm0.B(x8, "feed_videos", false)) {
                                        i2 = 15;
                                    } else if (brm0.B(x8, "feed", false)) {
                                        i2 = 13;
                                    } else if (brm0.B(x8, "discover", false)) {
                                        i2 = 16;
                                    } else if (brm0.B(x8, "search", false)) {
                                        i2 = 4;
                                    } else if (brm0.B(x8, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, false)) {
                                        i2 = 11;
                                    }
                                }
                            }
                            i2 = 2;
                        }
                    }
                    i2 = 9;
                }
            }
            Pair pair3 = new Pair("_SITEZONE", String.valueOf(i2));
            int i6 = iArr[Z0().p.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    if (a1) {
                        i5 = 7;
                    }
                    i5 = 12;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = 1;
                }
                List l = e43.l(pair, pair2, pair3, new Pair(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, String.valueOf(i5)), new Pair(CommonUrlParts.REQUEST_ID, this.K));
                if (map.isEmpty()) {
                    linkedHashMap = pn00.s(l);
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                    pn00.p(linkedHashMap2, l);
                    linkedHashMap = linkedHashMap2;
                }
                instreamAd = new InstreamAd(U7.b, U7.c, linkedHashMap, U7.e, U7.f, U7.g, U7.h);
            }
        } else {
            instreamAd = null;
        }
        if (l1() || instreamAd == null) {
            yh0Var = null;
        } else {
            yh0Var = this.O;
            if (yh0Var == null) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                yh0Var = new yh0(context, instreamAd, this.u.getDuration());
            }
        }
        this.O = yh0Var;
        if (yh0Var != null) {
            InstreamAd instreamAd2 = yh0Var.b;
            if (!yh0Var.e) {
                j8x j8xVar = new j8x(instreamAd2.f, yh0Var.c, yh0Var.a);
                j8xVar.i = yh0Var;
                Iterator<Map.Entry<String, String>> it = instreamAd2.d.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    u6z0Var = j8xVar.a;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    String key = next.getKey();
                    String value = next.getValue();
                    if (!"_SITEID".equals(key)) {
                        u6z0Var.a.g(key, value);
                    }
                }
                s3z0.a aVar = j8xVar.b;
                s3z0 a3 = aVar.a();
                buy0 buy0Var = new buy0(new buy0.a(j8xVar.e), u6z0Var, aVar);
                buy0Var.d = new iw3(j8xVar, 16);
                buy0Var.e(a3, j8xVar.f);
                yh0Var.e = true;
            }
        }
        int i7 = 28;
        if (l1()) {
            this.N = null;
        } else if (instreamAd != null) {
            if (this.N == null) {
                String str2 = this.v;
                String str3 = this.w;
                UserId c2 = o25.a().c();
                StringBuilder sb = new StringBuilder();
                sb.append(this.u.I0());
                sb.append('_');
                sb.append(this.u.o0());
                String sb2 = sb.toString();
                PlayerType playerType2 = Z0().p;
                rlt0 rlt0Var = this.F;
                if (rlt0Var == null || (r = rlt0Var.f) == null) {
                    r = this.u.r();
                }
                jc0 jc0Var = new jc0(str2, str3, c2, sb2, playerType2, r);
                com.vk.libvideo.autoplay.g gVar = new com.vk.libvideo.autoplay.g(this);
                l3s0 l3s0Var = new l3s0(this);
                li5 li5Var = new li5(this, new nm60(this, i7));
                Context context2 = e43.a;
                Context context3 = context2 != null ? context2 : null;
                this.u.r1();
                String title = this.u.getTitle();
                gpt0 gpt0Var2 = gpt0.a;
                if (title.length() >= 18) {
                    title.substring(0, 18).concat("...");
                }
                this.N = new ye0(context3, jc0Var, gVar, l3s0Var, li5Var, this.U, new ze0(instreamAd, this.g, this.k));
            }
            ye0 ye0Var = this.N;
            if (ye0Var != null) {
                String a12 = this.u.a1();
                String r2 = this.u.r();
                if (r2 == null) {
                    r2 = "";
                }
                String str4 = r2;
                m7q m7qVar = this.k0;
                String str5 = m7qVar != null ? m7qVar.z : null;
                long j2 = this.u.I0().b;
                ze0 ze0Var = ye0Var.g;
                InstreamAd instreamAd3 = ze0Var.a;
                io.reactivex.rxjava3.subjects.d<MyTargetAdLoadingState> dVar = ye0Var.h;
                if (dVar.P0() == MyTargetAdLoadingState.NOT_INITIALIZED) {
                    ye0Var.l = null;
                    dVar.onNext(MyTargetAdLoadingState.INITIALIZING);
                    ye0Var.g("AdmanInit");
                    ze0Var.c.g(a12, instreamAd3, str4, str5, j2);
                    ye0.d dVar2 = ye0Var.j;
                    c8x c8xVar = ye0Var.i;
                    if (c8xVar != null) {
                        c8xVar.l = null;
                    }
                    Integer b2 = fxc0.B().i().b();
                    Advertisement advertisement = new Advertisement(b2 != null ? b2.intValue() : instreamAd3.f, ye0Var.e.a.getDuration(), 0, null, null, null, null);
                    Pair<d8x, e8x> c3 = ye0Var.c();
                    ye0Var.x.b((((Boolean) ye0Var.n.getValue()).booleanValue() ? ze0Var.c.e(VideoAdvertisementsRepository.AdType.INSTREAM, null) : q.T(new VideoAdvertisementsRepository.a.C1194a(false))).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new j0(i4)).subscribe(new wn(new ue0(ye0Var, advertisement, c3.d(), c3.g(), dVar2, 0), i3), new xn(new ve0(0), i3)));
                }
            }
        }
        if (!Z0().f || (d3b0Var = this.p0) == null) {
            io.reactivex.rxjava3.disposables.b bVar = this.Q;
            bVar.e();
            bVar.b(new io.reactivex.rxjava3.internal.operators.mixed.q(r1(this, this.u, g0, z, 8), new i4f0(new dso0(this, 11), 9)).subscribe(new n240(new sf4(i7, this, new b990(this, i7)), i7), new dh40(new p99(1, this, VideoAutoPlay.class, "handlePlayError", "handlePlayError(Ljava/lang/Throwable;)V", 0, 12), 22)));
            return;
        }
        this.T.stop();
        OneVideoPlayer a4 = d3b0Var.a();
        if (a4 != null) {
            a4.resume();
        }
        A1();
        t1();
        if (p()) {
            E0(null);
        } else if (d()) {
            videoUIEventDispatcher.n2(this);
        }
        l0();
        O1(false);
        i1();
        g1();
    }

    @Override // xsna.fuk0
    public final void w() {
        j8x j8xVar;
        if (isPlaying() || w0()) {
            D1(AutoPlayState.PLAY);
            return;
        }
        AutoPlayState autoPlayState = this.x;
        if (autoPlayState == AutoPlayState.PLAY) {
            D1(AutoPlayState.PAUSED_STRONG);
        } else if (autoPlayState == AutoPlayState.PAUSED_PREPARE) {
            D1(AutoPlayState.PAUSED_WEAK);
        }
        yh0 yh0Var = this.O;
        if (yh0Var != null && (j8xVar = yh0Var.d) != null) {
            int i2 = j8xVar.g;
            if (i2 != 1) {
                gu8.e(null, "InstreamResearch: Unable to track pause, wrong state ".concat(j8x.c(i2)));
            } else {
                j8xVar.d("playbackPaused");
                j8xVar.g = 2;
            }
        }
        this.y.r1(this);
    }

    @Override // xsna.yg5
    public final boolean w0() {
        return this.x == AutoPlayState.PLAY && P0();
    }

    public final d3b0 w1(m7q m7qVar, boolean z, boolean z2, boolean z3) {
        OneVideoPlayer a2;
        OneVideoPlayer a3;
        o1b0 c2 = qu5.c();
        lzl0 lzl0Var = new lzl0(this, 5);
        j jVar = new j(1, this, VideoAutoPlay.class, "onSourceAssign", "onSourceAssign(Lcom/vk/media/player/video/PlayerProtocol;)V", 0);
        yft0 yft0Var = this.p;
        List O0 = j5g.O0((LinkedHashSet) yft0Var.f.b);
        chs0 chs0Var = Z0().s;
        d3b0 i2 = c2.i(m7qVar, this, z, z2, lzl0Var, jVar, O0, z3, chs0Var != null ? chs0Var.a : null, this.e.f());
        this.p0 = i2;
        yft0Var.b(i2 != null ? i2.a() : null);
        Float f1 = f1();
        if (f1 != null) {
            float floatValue = f1.floatValue();
            if (i2 != null && (a3 = i2.a()) != null) {
                a3.setPlaybackSpeed(floatValue);
            }
        }
        if (i2 != null) {
            i2.L(this.m0);
        }
        setVolume(e1());
        if (this.G) {
            K1(i2);
        }
        if (i2 != null && (a2 = i2.a()) != null) {
            a2.d0(this.a0);
        }
        return i2;
    }

    @Override // xsna.fuk0
    public final void x(one.video.player.tracks.c cVar) {
        this.y.O(cVar);
    }

    @Override // xsna.yg5
    public final void x0(ForceLogReason forceLogReason) {
        jps0 jps0Var = this.W;
        if (jps0Var.a()) {
            if (forceLogReason == ForceLogReason.FULLSCREEN) {
                jps0Var.h = true;
            }
            jps0Var.b();
            jps0Var.d.a(jps0Var.b);
        }
    }

    public final void x1(wzs<? super VideoFile, ? super m7q, s3q0> wzsVar) {
        io.reactivex.rxjava3.disposables.b bVar = this.Q;
        bVar.e();
        bVar.b(hg1.i(r1(this, this.u, 0, true, 10).m(io.reactivex.rxjava3.android.schedulers.a.b()), new bjm0(wzsVar, 7)));
    }

    @Override // xsna.fuk0
    public final void y(long j2) {
        rlt0 rlt0Var = this.F;
        if (rlt0Var != null) {
            rlt0Var.o = j2;
        }
    }

    @Override // xsna.yg5
    public final void y0(long j2) {
        OneVideoPlayer a2;
        if (this.n0) {
            return;
        }
        d3b0 d3b0Var = this.p0;
        if (d3b0Var != null && (a2 = d3b0Var.a()) != null) {
            a2.seekTo(j2);
        }
        this.y.S2(j2);
    }

    public final void y1() {
        sht0 sht0Var = this.l0;
        if (sht0Var != null) {
            o1b0 c2 = qu5.c();
            o1b0.a aVar = o1b0.a;
            c2.f(sht0Var, true);
        }
        if (fxc0.B().J().S() && this.x.h()) {
            k1();
            G0(false);
        } else {
            k1();
            v1(true);
        }
    }

    @Override // xsna.fuk0
    public final void z(OneVideoPlayer.DiscontinuityReason discontinuityReason) {
        if (discontinuityReason == OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION) {
            rlt0 rlt0Var = this.F;
            if (rlt0Var != null) {
                rlt0Var.d();
            }
            O1(true);
            this.y.K2(this);
            rzr0 d1 = d1();
            if (d1 != null) {
                long duration = getDuration();
                d1.P(duration);
                d1.N(duration, duration);
                d1.M(duration);
            }
        }
    }

    @Override // xsna.yg5
    public final void z0(VideoTextureView videoTextureView, com.vk.libvideo.autoplay.a aVar, RecyclerView.e0 e0Var) {
        d3b0 d3b0Var;
        WeakReference<VideoTextureView> weakReference = this.A;
        if (!epx.f(weakReference != null ? weakReference.get() : null, videoTextureView)) {
            bwt0.j(videoTextureView, new mdk0(this, 10));
        }
        this.B = e0Var != null ? new WeakReference<>(e0Var) : null;
        this.A = new WeakReference<>(videoTextureView);
        qcy<Object> qcyVar = r0[0];
        ah5 ah5Var = this.z;
        com.vk.libvideo.autoplay.a aVar2 = (com.vk.libvideo.autoplay.a) ah5Var.c;
        ah5Var.c = aVar;
        if (aVar2 == null) {
            ((vw4) ah5Var.d).invoke(aVar);
        } else if (!aVar2.equals(aVar)) {
            ((j3s0) ah5Var.e).invoke(aVar2, aVar);
        }
        if (P0() || (d3b0Var = this.p0) == null) {
            return;
        }
        F1(d3b0Var);
    }

    public final void z1(long j2, Runnable runnable) {
        d3b0 d3b0Var = this.p0;
        OneVideoPlayer a2 = d3b0Var != null ? d3b0Var.a() : null;
        xk80 xk80Var = a2 instanceof xk80 ? (xk80) a2 : null;
        if (xk80Var != null) {
            um80 u0 = xk80Var.u0(runnable, this.n.getLooper());
            u0.c(j2);
            this.g0.add(u0);
            u0.a.b();
        }
    }
}
