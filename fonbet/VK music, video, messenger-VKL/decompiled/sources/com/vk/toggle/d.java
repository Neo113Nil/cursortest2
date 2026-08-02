package com.vk.toggle;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.app.NotificationCompat;
import com.ironsource.V2;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.device.Vendor;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.data.AdsBtnAlgorithmStyle;
import com.vk.toggle.data.AdsBtnAnimationStyle;
import com.vk.toggle.data.AdsBtnStyle;
import com.vk.toggle.data.BucketPriorityConfig;
import com.vk.toggle.data.ClipButtonToLongVideoConfig;
import com.vk.toggle.data.ClipsCacheLocationConfig;
import com.vk.toggle.data.InAppUpdatesConfig;
import com.vk.toggle.data.RateMode;
import com.vk.toggle.data.VideoAdFreeSubscriptionFeatureConfig;
import com.vk.toggle.data.VideoPlayDelayConfig;
import com.vk.toggle.data.VideoRustoreIapUpdateFeatureConfig;
import com.vk.toggle.data.a;
import com.vk.toggle.data.b;
import com.vk.toggle.data.c;
import com.vk.toggle.data.firebase.FirebaseInitType;
import com.vk.toggle.data.firebase.FirebaseLocation;
import com.vk.toggle.features.CatalogFeatures;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.NotificationFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import kotlin.time.DurationUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.a2z;
import xsna.aa3;
import xsna.aat0;
import xsna.ait0;
import xsna.aj80;
import xsna.ans0;
import xsna.ar90;
import xsna.arm0;
import xsna.axe0;
import xsna.b4w;
import xsna.b5s0;
import xsna.bdt0;
import xsna.bek0;
import xsna.bns0;
import xsna.bpn0;
import xsna.c260;
import xsna.c4t0;
import xsna.c5g;
import xsna.cns0;
import xsna.cos0;
import xsna.cqm0;
import xsna.d4t0;
import xsna.dhp0;
import xsna.djd;
import xsna.dk0;
import xsna.dli0;
import xsna.dny;
import xsna.drm0;
import xsna.dz5;
import xsna.e43;
import xsna.eoo;
import xsna.epx;
import xsna.eqy;
import xsna.f0w0;
import xsna.f370;
import xsna.f6q0;
import xsna.f8s0;
import xsna.fkq;
import xsna.fw90;
import xsna.fzv0;
import xsna.ggv;
import xsna.gjk0;
import xsna.h960;
import xsna.hfr;
import xsna.hmx0;
import xsna.hn40;
import xsna.ie70;
import xsna.iic;
import xsna.iso0;
import xsna.izs;
import xsna.j560;
import xsna.j5g;
import xsna.j9x;
import xsna.jft0;
import xsna.jgp;
import xsna.jlq;
import xsna.jyq;
import xsna.k4s0;
import xsna.k9x;
import xsna.kek;
import xsna.kos0;
import xsna.krg0;
import xsna.m5m;
import xsna.m5r;
import xsna.mfp0;
import xsna.nto;
import xsna.o0s0;
import xsna.o1s0;
import xsna.oi80;
import xsna.oos0;
import xsna.oto;
import xsna.owq;
import xsna.p1p0;
import xsna.pbj0;
import xsna.pn00;
import xsna.pqo0;
import xsna.qaj0;
import xsna.qng;
import xsna.rli0;
import xsna.rtg0;
import xsna.ru5;
import xsna.s3q0;
import xsna.s75;
import xsna.shx0;
import xsna.swe0;
import xsna.tit0;
import xsna.tkp;
import xsna.tni;
import xsna.tss0;
import xsna.tzv0;
import xsna.ubc;
import xsna.upu;
import xsna.usk0;
import xsna.uu70;
import xsna.whx0;
import xsna.wps0;
import xsna.wq;
import xsna.wqd;
import xsna.wqi;
import xsna.x1s0;
import xsna.xof0;
import xsna.xok;
import xsna.xsn;
import xsna.xwe0;
import xsna.y45;
import xsna.y4j;
import xsna.yoo;
import xsna.yyy;
import xsna.z9t0;
import xsna.zhs;
import xsna.zi80;
import xsna.zkw;
import xsna.zno;
import xsna.zns0;
import xsna.zrk;
import xsna.zwe0;

/* compiled from: FeaturesHelper.kt */
/* loaded from: classes11.dex */
public final class d {
    public static final eqy<k4s0> A;
    public static final eqy<a2z> A0;
    public static final eqy<tzv0> B;
    public static final eqy<com.vk.toggle.data.b> B0;
    public static final eqy<fzv0> C;
    public static final eqy<fkq> C0;
    public static final eqy<kos0> D;
    public static final eqy<aj80> D0;
    public static final eqy<kos0> E;
    public static final eqy<zi80> E0;
    public static final eqy<kos0> F;
    public static final eqy<fw90> F0;
    public static final eqy<kos0> G;
    public static final eqy<d4t0> G0;
    public static final eqy<cos0> H;
    public static final eqy<f6q0> H0;
    public static final eqy<oos0> I;
    public static final eqy<c4t0> I0;
    public static final eqy<b5s0> J;
    public static final eqy<upu> J0;
    public static final eqy<o0s0> K;
    public static final eqy<tkp> K0;
    public static final eqy<o0s0> L;
    public static final eqy<tit0> L0;
    public static final eqy<o0s0> M;
    public static final eqy<kek> M0;
    public static final eqy<x1s0> N;
    public static final eqy<Map<String, kos0>> N0;
    public static final eqy<com.vk.toggle.data.c> O;
    public static final eqy<oi80> O0;
    public static final eqy<com.vk.toggle.data.c> P;
    public static final eqy<krg0> P0;
    public static final eqy<com.vk.toggle.data.c> Q;
    public static final bpn0 Q0;
    public static final eqy<aat0> R;
    public static final eqy<z9t0> S;
    public static final eqy<VideoAdFreeSubscriptionFeatureConfig> T;
    public static final eqy<f0w0> U;
    public static final eqy<f0w0> V;
    public static final eqy<VideoPlayDelayConfig> W;
    public static final eqy<dk0> X;
    public static final eqy<pbj0> Y;
    public static final eqy<tss0> Z;
    public static final eqy<c260> a0;
    public static final eqy<ans0> b0;
    public static final eqy<cns0> c0;
    public static final eqy<bns0> d0;
    public static final eqy<iic> e;
    public static final eqy<wps0> e0;
    public static final eqy<nto> f;
    public static final eqy<djd> f0;
    public static final eqy<oto> g;
    public static final eqy<wqd> g0;
    public static final eqy<zhs> h;
    public static final eqy<ClipsCacheLocationConfig> h0;
    public static final eqy<owq> i;
    public static final eqy<ClipButtonToLongVideoConfig> i0;
    public static final eqy<f8s0> j;
    public static final eqy<ie70> j0;
    public static final eqy<jft0> k;
    public static final eqy<qng> k0;
    public static final eqy<jyq> l;
    public static final eqy<shx0> l0;
    public static final eqy<com.vk.toggle.data.a> m;
    public static final eqy<whx0> m0;
    public static final eqy<ubc> n;
    public static final eqy<pqo0> n0;
    public static final eqy<xsn> o;
    public static final eqy<b4w> o0;
    public static final eqy<wqi> p;
    public static final eqy<zrk> p0;
    public static final eqy<zkw> q;
    public static final eqy<BucketPriorityConfig> q0;
    public static final eqy<gjk0> r;
    public static final eqy<ggv> r0;
    public static final eqy<dhp0> s;
    public static final eqy<hmx0> s0;
    public static final eqy<h960> t;
    public static final eqy<usk0> t0;
    public static final eqy<ru5> u;
    public static final eqy<mfp0> u0;
    public static final eqy<xok> v;
    public static final eqy<m5m> v0;
    public static final eqy<jlq> w;
    public static final eqy<j560> w0;
    public static final eqy<uu70> x;
    public static final eqy<iso0> x0;
    public static final eqy<bdt0> y;
    public static final eqy<m5r> y0;
    public static final eqy<o1s0> z;
    public static final eqy<ar90> z0;
    public static final eqy<bek0> a = new eqy<>(Features.Type.FEATURE_CORE_SOCIAL_NET, new y0(1, bek0.b, bek0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/SocialNetConfig;", 0));
    public static final eqy<InAppUpdatesConfig> b = new eqy<>(Features.Type.FEATURE_CORE_IN_APP_UPDATES, new g0(1, InAppUpdatesConfig.k, InAppUpdatesConfig.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/InAppUpdatesConfig;", 0));
    public static final eqy<dny> c = new eqy<>(Features.Type.FEATURE_CORE_CHANGEABLE_ICONS, new h0(1, dny.d, dny.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/LauncherIconsConfig;", 0));
    public static final eqy<xof0> d = new eqy<>(Features.Type.FEATURE_REEF_WATCHER, new v0(1, xof0.c, xof0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/ReefWatcherConfig;", 0));

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FirebaseLocation.values().length];
            try {
                iArr[FirebaseLocation.CONTENT_PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FirebaseLocation.AFTER_COLD_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FirebaseInitType.values().length];
            try {
                iArr2[FirebaseInitType.SYNC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FirebaseInitType.SAFE_ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FirebaseInitType.ASYNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class a0 extends FunctionReferenceImpl implements izs<String, m5r> {
        @Override // xsna.izs
        public final m5r invoke(String str) {
            Object failure;
            String str2 = str;
            ((m5r.a) this.receiver).getClass();
            try {
                failure = new m5r(new JSONObject(str2).optInt("preload_count", 1));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = m5r.c;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (m5r) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class a1 extends FunctionReferenceImpl implements izs<String, usk0> {
        @Override // xsna.izs
        public final usk0 invoke(String str) {
            Object failure;
            String str2 = str;
            ((usk0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                failure = new usk0(swe0.i(jSONObject.optLong("max_batch_size", 33000L), 33000L, 128000L), swe0.i(jSONObject.optLong("time_interval_ms", 45000L), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, 210000L), true, swe0.i(jSONObject.optLong("time_interval_benchmark_ms", 45000L), 45000L, 210000L), swe0.e(jSONObject.optDouble("batch_size_ratio", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = usk0.g;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (usk0) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class a2 extends FunctionReferenceImpl implements izs<String, wps0> {
        @Override // xsna.izs
        public final wps0 invoke(String str) {
            String str2 = str;
            ((wps0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new wps0(arm0.m(10, jSONObject.optString("video_image_min_width")), arm0.m(10, jSONObject.optString("video_image_max_width")), arm0.l(jSONObject.optString("video_image_scale")));
            } catch (JSONException e) {
                L.i(e);
                return wps0.e;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<String, dk0> {
        @Override // xsna.izs
        public final dk0 invoke(String str) {
            String str2 = str;
            ((dk0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int optInt = jSONObject.optInt("window", -1);
                int optInt2 = jSONObject.optInt(X3.a.t, -1);
                if (optInt < 0 || optInt2 < 0 || optInt2 >= 4) {
                    return null;
                }
                return new dk0(optInt, optInt2);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class b0 extends FunctionReferenceImpl implements izs<String, zhs> {
        @Override // xsna.izs
        public final zhs invoke(String str) {
            ((zhs.a) this.receiver).getClass();
            return new zhs(cqm0.j(str).optLong("delay", 600000L));
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class b1 extends FunctionReferenceImpl implements izs<String, pqo0> {
        @Override // xsna.izs
        public final pqo0 invoke(String str) {
            String str2 = str;
            ((pqo0.a) this.receiver).getClass();
            try {
                JSONArray optJSONArray = new JSONObject(str2).optJSONArray("interesting_thread_pools");
                return new pqo0((List<String>) (optJSONArray != null ? f370.O(optJSONArray) : pqo0.c));
            } catch (Exception e) {
                L.i(e);
                return pqo0.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class b2 extends FunctionReferenceImpl implements izs<String, com.vk.toggle.data.c> {
        @Override // xsna.izs
        public final com.vk.toggle.data.c invoke(String str) {
            ((c.a) this.receiver).getClass();
            return c.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<String, com.vk.toggle.data.a> {
        @Override // xsna.izs
        public final com.vk.toggle.data.a invoke(String str) {
            yoo yooVar;
            AdsBtnAnimationStyle adsBtnAnimationStyle;
            String str2 = str;
            ((a.C1928a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String string = jSONObject.getString("button_type");
                String string2 = jSONObject.has("animation") ? jSONObject.getString("animation") : null;
                if (jSONObject.has("dynamic_button")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("dynamic_button");
                    String upperCase = jSONObject2.getString(JwsHeader.ALGORITHM).toUpperCase(Locale.ROOT);
                    JSONArray jSONArray = jSONObject2.getJSONArray("animations");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            arrayList.add(AdsBtnAnimationStyle.valueOf(jSONArray.getString(i).toUpperCase(Locale.ROOT)));
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("palette");
                    if (jSONArray2 != null) {
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            arrayList2.add(jSONArray2.getString(i2));
                        }
                    }
                    yooVar = new yoo(AdsBtnAlgorithmStyle.valueOf(upperCase), arrayList, arrayList2);
                } else {
                    yooVar = null;
                }
                AdsBtnStyle.Companion.getClass();
                AdsBtnStyle a = AdsBtnStyle.a.a(string);
                if (string2 != null) {
                    AdsBtnAnimationStyle.Companion.getClass();
                    adsBtnAnimationStyle = AdsBtnAnimationStyle.a.a(string2);
                } else {
                    adsBtnAnimationStyle = null;
                }
                return new com.vk.toggle.data.a(a, adsBtnAnimationStyle, yooVar);
            } catch (Exception e) {
                if ((e instanceof JSONException) || (e instanceof IllegalArgumentException)) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class c0 extends FunctionReferenceImpl implements izs<String, b4w> {
        @Override // xsna.izs
        public final b4w invoke(String str) {
            Object failure;
            String str2 = str;
            ((b4w.a) this.receiver).getClass();
            try {
                failure = new b4w(true, new JSONObject(str2).getBoolean("is_send_help_tooltip_enabled"));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = b4w.d;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (b4w) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class c1 extends FunctionReferenceImpl implements izs<String, iso0> {
        @Override // xsna.izs
        public final iso0 invoke(String str) {
            String str2 = str;
            ((iso0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                boolean optBoolean = jSONObject.optBoolean("is_enabled_in_newsfeed", false);
                boolean optBoolean2 = jSONObject.optBoolean("is_enabled_in_discover", false);
                boolean optBoolean3 = jSONObject.optBoolean("is_enabled_in_stories", false);
                boolean optBoolean4 = jSONObject.optBoolean("is_enabled_in_profile", false);
                boolean optBoolean5 = jSONObject.optBoolean("is_enabled_in_messenger", false);
                boolean optBoolean6 = jSONObject.optBoolean("is_enabled_in_market", false);
                boolean optBoolean7 = jSONObject.optBoolean("is_enabled_in_other_places", false);
                String optString = jSONObject.optString("test_thumb_hash", "");
                if (drm0.N(optString)) {
                    optString = null;
                }
                return new iso0(optString, optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean6, optBoolean7);
            } catch (Exception e) {
                L.j(e, "ThumbHashConfig");
                return iso0.j;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class c2 extends FunctionReferenceImpl implements izs<String, tss0> {
        @Override // xsna.izs
        public final tss0 invoke(String str) {
            String str2 = str;
            ((tss0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new tss0(jSONObject.optString("video_install_url", ""), jSONObject.optString("clip_install_url", ""), jSONObject.optString("playlist_install_url", ""));
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    /* renamed from: com.vk.toggle.d$d, reason: collision with other inner class name */
    public static final /* synthetic */ class C1927d extends FunctionReferenceImpl implements izs<String, ru5> {
        @Override // xsna.izs
        public final ru5 invoke(String str) {
            String str2 = str;
            ((ru5.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new ru5(jSONObject.getLong("reservoir_ms"), jSONObject.getLong("cushion_ms"), jSONObject.getLong("min_buffered_duration_ms_for_using"), jSONObject.getBoolean("disable_segments_control"));
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class d0 extends FunctionReferenceImpl implements izs<String, upu> {
        @Override // xsna.izs
        public final upu invoke(String str) {
            String str2 = str;
            ((upu.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new upu(jSONObject.optBoolean("changeTabPrefetchCount", false), jSONObject.optBoolean("changeComChatsFullscreenMethod", false));
            } catch (Exception e) {
                L.i(e);
                return upu.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class d1 extends FunctionReferenceImpl implements izs<String, mfp0> {
        @Override // xsna.izs
        public final mfp0 invoke(String str) {
            Object failure;
            String str2 = str;
            ((mfp0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int optInt = jSONObject.optInt("batch_size_count", 32);
                int i = optInt < 32 ? 32 : optInt;
                long j = 60000;
                long optLong = jSONObject.optLong("time_interval_ms", 60000L);
                if (optLong >= 60000) {
                    j = optLong;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("blocklist");
                Iterable H = optJSONArray != null ? dz5.H(optJSONArray) : null;
                if (H == null) {
                    H = EmptyList.b;
                }
                failure = new mfp0(true, i, j, j5g.S0(H));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = mfp0.f;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (mfp0) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class d2 extends FunctionReferenceImpl implements izs<String, com.vk.toggle.data.c> {
        @Override // xsna.izs
        public final com.vk.toggle.data.c invoke(String str) {
            ((c.a) this.receiver).getClass();
            return c.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<String, BucketPriorityConfig> {
        /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BucketPriorityConfig invoke(String str) {
            Object failure;
            int optInt;
            boolean optBoolean;
            String optString;
            int hashCode;
            BucketPriorityConfig.BucketStrategy bucketStrategy;
            String str2 = str;
            ((BucketPriorityConfig.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                optInt = jSONObject.optInt("slot_size", 4);
                optBoolean = jSONObject.optBoolean("disable_TMRI", false);
                BucketPriorityConfig.BucketStrategy.a aVar = BucketPriorityConfig.BucketStrategy.Companion;
                optString = jSONObject.optString(X3.f.e);
                if (optString == null) {
                    optString = "";
                }
                aVar.getClass();
                hashCode = optString.hashCode();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (hashCode == -1328807287) {
                if (optString.equals("steal_less")) {
                    bucketStrategy = BucketPriorityConfig.BucketStrategy.STEAL_LESS;
                    failure = new BucketPriorityConfig(true, optInt, optBoolean, bucketStrategy);
                    Object obj = BucketPriorityConfig.f;
                    if (failure instanceof Result.Failure) {
                    }
                    return (BucketPriorityConfig) failure;
                }
                bucketStrategy = BucketPriorityConfig.BucketStrategy.FAIR;
                failure = new BucketPriorityConfig(true, optInt, optBoolean, bucketStrategy);
                Object obj2 = BucketPriorityConfig.f;
                if (failure instanceof Result.Failure) {
                }
                return (BucketPriorityConfig) failure;
            }
            if (hashCode == 3135268) {
                if (optString.equals("fair")) {
                    bucketStrategy = BucketPriorityConfig.BucketStrategy.FAIR;
                    failure = new BucketPriorityConfig(true, optInt, optBoolean, bucketStrategy);
                    Object obj22 = BucketPriorityConfig.f;
                    if (failure instanceof Result.Failure) {
                    }
                    return (BucketPriorityConfig) failure;
                }
                bucketStrategy = BucketPriorityConfig.BucketStrategy.FAIR;
                failure = new BucketPriorityConfig(true, optInt, optBoolean, bucketStrategy);
                Object obj222 = BucketPriorityConfig.f;
                if (failure instanceof Result.Failure) {
                }
                return (BucketPriorityConfig) failure;
            }
            if (hashCode == 109760847 && optString.equals("steal")) {
                bucketStrategy = BucketPriorityConfig.BucketStrategy.STEAL;
                failure = new BucketPriorityConfig(true, optInt, optBoolean, bucketStrategy);
                Object obj2222 = BucketPriorityConfig.f;
                if (failure instanceof Result.Failure) {
                    failure = obj2222;
                }
                return (BucketPriorityConfig) failure;
            }
            bucketStrategy = BucketPriorityConfig.BucketStrategy.FAIR;
            failure = new BucketPriorityConfig(true, optInt, optBoolean, bucketStrategy);
            Object obj22222 = BucketPriorityConfig.f;
            if (failure instanceof Result.Failure) {
            }
            return (BucketPriorityConfig) failure;
            failure = new Result.Failure(th);
            Object obj222222 = BucketPriorityConfig.f;
            if (failure instanceof Result.Failure) {
            }
            return (BucketPriorityConfig) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class e0 extends FunctionReferenceImpl implements izs<String, ggv> {
        @Override // xsna.izs
        public final ggv invoke(String str) {
            Object failure;
            String str2 = str;
            ((ggv.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                failure = new ggv(jSONObject.optInt("max_size", 64), jSONObject.optInt("per_host_size", 5), true, jSONObject.optBoolean("disable_TMRI", false));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = ggv.f;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (ggv) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class e1 extends FunctionReferenceImpl implements izs<String, dhp0> {
        @Override // xsna.izs
        public final dhp0 invoke(String str) {
            String str2 = str;
            ((dhp0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                long optLong = jSONObject.optLong("min_duration_for_quality_increase_ms", 10000L);
                long optLong2 = jSONObject.optLong("max_duration_for_quality_decrease_ms", 250000L);
                long optLong3 = jSONObject.optLong("min_duration_to_retain_after_discard_ms", V2.h);
                return new dhp0((float) jSONObject.optDouble("buffered_fraction_to_live_edge_for_quality_increase", 0.75d), jSONObject.optInt("max_width_to_discard", 1279), jSONObject.optInt("max_height_to_discard", 719), optLong, optLong2, optLong3);
            } catch (JSONException e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class e2 extends FunctionReferenceImpl implements izs<String, kos0> {
        @Override // xsna.izs
        public final kos0 invoke(String str) {
            ((kos0.a) this.receiver).getClass();
            return kos0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<String, ubc> {
        @Override // xsna.izs
        public final ubc invoke(String str) {
            String str2 = str;
            ((ubc.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new ubc(jSONObject.optBoolean("is_garland_enabled", false), jSONObject.optBoolean("is_story_shadow_enabled", false));
            } catch (Exception e) {
                L.i(e);
                return ubc.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class f0 extends FunctionReferenceImpl implements izs<String, zkw> {
        @Override // xsna.izs
        public final zkw invoke(String str) {
            String str2 = str;
            ((zkw.a) this.receiver).getClass();
            try {
                return new zkw(f370.p(new JSONObject(str2), "allow_requeue", true), true);
            } catch (JSONException e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                return zkw.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class f1 extends FunctionReferenceImpl implements izs<String, f6q0> {
        @Override // xsna.izs
        public final f6q0 invoke(String str) {
            Object failure;
            List list;
            List list2;
            List list3;
            List list4;
            f6q0.b bVar;
            String str2 = str;
            ((f6q0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONObject optJSONObject = jSONObject.optJSONObject("modal_window");
                String optString = optJSONObject != null ? optJSONObject.optString("icon") : null;
                String optString2 = optJSONObject != null ? optJSONObject.optString("title") : null;
                String optString3 = optJSONObject != null ? optJSONObject.optString("subtitle") : null;
                JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("button_1") : null;
                String optString4 = optJSONObject2 != null ? optJSONObject2.optString("title") : null;
                String optString5 = optJSONObject2 != null ? optJSONObject2.optString("deeplink") : null;
                JSONObject optJSONObject3 = optJSONObject != null ? optJSONObject.optJSONObject("button_2") : null;
                String optString6 = optJSONObject3 != null ? optJSONObject3.optString("title") : null;
                String optString7 = optJSONObject3 != null ? optJSONObject3.optString("deeplink") : null;
                JSONArray optJSONArray = jSONObject.optJSONArray("whitelist");
                if (optJSONArray == null || (list = dz5.H(optJSONArray)) == null) {
                    list = EmptyList.b;
                }
                List list5 = list;
                JSONArray optJSONArray2 = jSONObject.optJSONArray("blacklist");
                if (optJSONArray2 == null || (list2 = dz5.H(optJSONArray2)) == null) {
                    list2 = EmptyList.b;
                }
                List list6 = list2;
                JSONArray optJSONArray3 = jSONObject.optJSONArray("miniapp_whitelist");
                if (optJSONArray3 == null || (list3 = dz5.F(optJSONArray3)) == null) {
                    list3 = EmptyList.b;
                }
                List list7 = list3;
                JSONArray optJSONArray4 = jSONObject.optJSONArray("miniapp_blacklist");
                if (optJSONArray4 == null || (list4 = dz5.F(optJSONArray4)) == null) {
                    list4 = EmptyList.b;
                }
                List list8 = list4;
                boolean optBoolean = jSONObject.optBoolean("debug_emulate_vpn");
                boolean optBoolean2 = jSONObject.optBoolean("debug_emulate_unstable");
                boolean optBoolean3 = jSONObject.optBoolean("debug_close_popup");
                boolean optBoolean4 = jSONObject.optBoolean("check_on_app_resumed", true);
                boolean optBoolean5 = jSONObject.optBoolean("dry_run", false);
                boolean optBoolean6 = jSONObject.optBoolean("wifi_check_enabled", false);
                if (optJSONObject == null) {
                    bVar = null;
                } else {
                    bVar = new f6q0.b(optString, optString2, optString3, optJSONObject2 == null ? null : new f6q0.b.a(optString4, optString5), optJSONObject3 != null ? new f6q0.b.a(optString6, optString7) : null);
                }
                failure = new f6q0(bVar, list5, list6, list7, list8, optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean6);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = f6q0.m;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (f6q0) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class f2 extends FunctionReferenceImpl implements izs<String, VideoPlayDelayConfig> {
        @Override // xsna.izs
        public final VideoPlayDelayConfig invoke(String str) {
            ((VideoPlayDelayConfig.a) this.receiver).getClass();
            return VideoPlayDelayConfig.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<String, iic> {
        @Override // xsna.izs
        public final iic invoke(String str) {
            ((iic.a) this.receiver).getClass();
            JSONObject j = cqm0.j(str);
            return new iic(j.optDouble("ratio", 1.0d), j.optInt("period", 600), j.optInt("max_period", 4800));
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class g0 extends FunctionReferenceImpl implements izs<String, InAppUpdatesConfig> {
        @Override // xsna.izs
        public final InAppUpdatesConfig invoke(String str) {
            Object failure;
            String str2 = str;
            ((InAppUpdatesConfig.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                try {
                    failure = InAppUpdatesConfig.InternalOpenStrategy.valueOf(jSONObject.optString("internal_open_strategy", "CUSTOM_TABS"));
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (Result.a(failure) != null) {
                    failure = InAppUpdatesConfig.InternalOpenStrategy.CUSTOM_TABS;
                }
                InAppUpdatesConfig.InternalOpenStrategy internalOpenStrategy = (InAppUpdatesConfig.InternalOpenStrategy) failure;
                boolean optBoolean = jSONObject.optBoolean("gms_enabled", false);
                boolean optBoolean2 = jSONObject.optBoolean("rustore_enabled", false);
                String optString = jSONObject.optString("move_users_from");
                InAppUpdatesConfig.StoreUpdater.Companion.getClass();
                return new InAppUpdatesConfig(optBoolean, optBoolean2, InAppUpdatesConfig.StoreUpdater.a.a(optString), InAppUpdatesConfig.StoreUpdater.a.a(jSONObject.optString("move_users_to")), jSONObject.optBoolean("internal_enabled", false), jSONObject.optLong("update_interval", InAppUpdatesConfig.l), jSONObject.optString("base_url", "https://android-ac.vk-apps.com/latest"), internalOpenStrategy, f370.D(jSONObject, "description_title"), f370.D(jSONObject, "description_subtitle"));
            } catch (Exception e) {
                L.i(e);
                return InAppUpdatesConfig.m;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class g1 extends FunctionReferenceImpl implements izs<String, k4s0> {
        @Override // xsna.izs
        public final k4s0 invoke(String str) {
            ArrayList arrayList;
            String str2 = str;
            ((k4s0.a) this.receiver).getClass();
            try {
                JSONArray optJSONArray = new JSONObject(str2).optJSONArray("socs");
                if (optJSONArray != null) {
                    ArrayList O = f370.O(optJSONArray);
                    arrayList = new ArrayList(c5g.u(O, 10));
                    Iterator it = O.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Regex((String) it.next()));
                    }
                } else {
                    arrayList = null;
                }
                return new k4s0(arrayList);
            } catch (JSONException e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class g2 extends FunctionReferenceImpl implements izs<String, c4t0> {
        @Override // xsna.izs
        public final c4t0 invoke(String str) {
            Object failure;
            String str2 = str;
            ((c4t0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                c4t0 c4t0Var = c4t0.e;
                int optInt = jSONObject.optInt("network_error_retries", c4t0Var.a);
                int optInt2 = jSONObject.optInt("playlist_stuck_retries", c4t0Var.b);
                zno.a aVar = zno.c;
                failure = new c4t0(optInt, optInt2, eoo.f(jSONObject.optLong("playlist_stuck_delay", zno.e(c4t0Var.c)), DurationUnit.MILLISECONDS));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            return (c4t0) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<String, ClipButtonToLongVideoConfig> {
        @Override // xsna.izs
        public final ClipButtonToLongVideoConfig invoke(String str) {
            ClipButtonToLongVideoConfig.Variant variant;
            String str2 = str;
            ((ClipButtonToLongVideoConfig.a) this.receiver).getClass();
            try {
                String optString = new JSONObject(str2).optString("variant");
                if (optString != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -616594173) {
                        if (hashCode != -337170692) {
                            if (hashCode == 580527654 && optString.equals("expanded_carousel")) {
                                variant = ClipButtonToLongVideoConfig.Variant.EXPANDED_CAROUSEL;
                                return new ClipButtonToLongVideoConfig(variant);
                            }
                        } else if (optString.equals("compact_carousel")) {
                            variant = ClipButtonToLongVideoConfig.Variant.COMPACT_CAROUSEL;
                            return new ClipButtonToLongVideoConfig(variant);
                        }
                    } else if (optString.equals("button_recolor")) {
                        variant = ClipButtonToLongVideoConfig.Variant.BUTTON_RECOLOR;
                        return new ClipButtonToLongVideoConfig(variant);
                    }
                }
                variant = ClipButtonToLongVideoConfig.Variant.NONE;
                return new ClipButtonToLongVideoConfig(variant);
            } catch (Exception e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class h0 extends FunctionReferenceImpl implements izs<String, dny> {
        @Override // xsna.izs
        public final dny invoke(String str) {
            String str2 = str;
            ((dny.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int optInt = jSONObject.optInt("min_api", Integer.MAX_VALUE);
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("launchers");
                if (optJSONArray != null) {
                    arrayList.addAll(qaj0.a(optJSONArray));
                }
                return new dny(optInt, arrayList, jSONObject.optInt("store_mask"));
            } catch (Exception e) {
                L.i(e);
                return dny.e;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class h1 extends FunctionReferenceImpl implements izs<String, o0s0> {
        @Override // xsna.izs
        public final o0s0 invoke(String str) {
            ((o0s0.a) this.receiver).getClass();
            return o0s0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class h2 extends FunctionReferenceImpl implements izs<String, d4t0> {
        @Override // xsna.izs
        public final d4t0 invoke(String str) {
            boolean z;
            Integer x;
            String str2 = str;
            ((d4t0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Integer x2 = f370.x(jSONObject, "isAvailableForSubscription");
                boolean z2 = false;
                if (x2 != null && x2.intValue() == 1) {
                    z = true;
                    x = f370.x(jSONObject, "extendedMigrationLogs");
                    if (x != null && x.intValue() == 1) {
                        z2 = true;
                    }
                    return new d4t0(z, z2);
                }
                z = false;
                x = f370.x(jSONObject, "extendedMigrationLogs");
                if (x != null) {
                    z2 = true;
                }
                return new d4t0(z, z2);
            } catch (JSONException e) {
                L.i(e);
                return d4t0.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<String, djd> {
        @Override // xsna.izs
        public final djd invoke(String str) {
            String str2 = str;
            ((djd.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new djd(jSONObject.getBoolean("should_play_full"), Long.valueOf(jSONObject.getLong("autoplay_duration_seconds")));
            } catch (JSONException e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class i0 extends FunctionReferenceImpl implements izs<String, yyy> {
        @Override // xsna.izs
        public final yyy invoke(String str) {
            ((yyy.a) this.receiver).getClass();
            JSONObject jSONObject = new JSONObject(str);
            yyy.a aVar = yyy.a;
            try {
                if (jSONObject.has("period_min")) {
                    TimeUnit.MINUTES.toMillis(Math.max(1L, Math.min(Long.parseLong(jSONObject.getString("period_min")), 1440L)));
                }
            } catch (Throwable th) {
                L.i(th);
            }
            return new yyy();
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class i1 extends FunctionReferenceImpl implements izs<String, o0s0> {
        @Override // xsna.izs
        public final o0s0 invoke(String str) {
            ((o0s0.a) this.receiver).getClass();
            return o0s0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class i2 extends FunctionReferenceImpl implements izs<String, z9t0> {
        @Override // xsna.izs
        public final z9t0 invoke(String str) {
            String str2 = str;
            ((z9t0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                try {
                    return new z9t0(jSONObject.optBoolean("not_interested_in_bg", false), jSONObject.optBoolean("watch_later_in_bg", false));
                } catch (Throwable unused) {
                    return z9t0.d;
                }
            } catch (Exception e) {
                L.i(e);
                return z9t0.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<String, ClipsCacheLocationConfig> {
        @Override // xsna.izs
        public final ClipsCacheLocationConfig invoke(String str) {
            Object failure;
            ClipsCacheLocationConfig.Location location;
            String str2 = str;
            ((ClipsCacheLocationConfig.a) this.receiver).getClass();
            try {
                if (str2 == null) {
                    failure = ClipsCacheLocationConfig.d;
                } else {
                    JSONObject jSONObject = new JSONObject(str2);
                    String optString = jSONObject.optString("location");
                    if (optString != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1315748509) {
                            if (hashCode != -487977120) {
                                if (hashCode == 1075912409 && optString.equals("INTERNAL_STORAGE")) {
                                    location = ClipsCacheLocationConfig.Location.INTERNAL_STORAGE;
                                }
                            } else if (optString.equals("INTERNAL_CACHE")) {
                                location = ClipsCacheLocationConfig.Location.INTERNAL_CACHE;
                            }
                        } else if (optString.equals("SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE")) {
                            location = ClipsCacheLocationConfig.Location.SD_CARD_OR_EXTERNAL_OR_INTERNAL_CACHE;
                        }
                        failure = new ClipsCacheLocationConfig(location, jSONObject.optBoolean("disable_data_sink_factory", false));
                    }
                    location = ClipsCacheLocationConfig.Location.SD_CARD_OR_EXTERNAL_OR_INTERNAL_STORAGE;
                    failure = new ClipsCacheLocationConfig(location, jSONObject.optBoolean("disable_data_sink_factory", false));
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = ClipsCacheLocationConfig.d;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (ClipsCacheLocationConfig) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class j0 extends FunctionReferenceImpl implements izs<String, a2z> {
        @Override // xsna.izs
        public final a2z invoke(String str) {
            String str2 = str;
            ((a2z.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONArray optJSONArray = jSONObject.optJSONArray("redesigned_screens");
                boolean optBoolean = jSONObject.optBoolean("enabled_everywhere", false);
                ListBuilder e = e43.e();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        e.add(optJSONArray.getString(i));
                    }
                }
                return new a2z(e.g(), optBoolean);
            } catch (Exception e2) {
                L.j(e2, "LegoRedesignConfig");
                return a2z.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class j1 extends FunctionReferenceImpl implements izs<String, o0s0> {
        @Override // xsna.izs
        public final o0s0 invoke(String str) {
            ((o0s0.a) this.receiver).getClass();
            return o0s0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class j2 extends FunctionReferenceImpl implements izs<String, aat0> {
        @Override // xsna.izs
        public final aat0 invoke(String str) {
            String str2 = str;
            ((aat0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                try {
                    return new aat0(jSONObject.optBoolean("not_interested", false), jSONObject.optBoolean("watch_later", false), jSONObject.optBoolean("download", false));
                } catch (Throwable unused) {
                    return aat0.e;
                }
            } catch (Exception e) {
                L.i(e);
                return aat0.e;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements izs<String, wqd> {
        @Override // xsna.izs
        public final wqd invoke(String str) {
            Object failure;
            String str2 = str;
            ((wqd.a) this.receiver).getClass();
            try {
                if (str2 == null) {
                    failure = wqd.e;
                } else {
                    JSONObject jSONObject = new JSONObject(str2);
                    long j = 1024;
                    long j2 = jSONObject.getLong("maxCacheSizeMb") * j * j;
                    failure = new wqd(jSONObject.getLong("endPositionMs"), j2, (long) (j2 * swe0.e(jSONObject.getDouble("lruTargetRatio"), 0.1d, 1.0d)));
                }
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            wqd wqdVar = wqd.e;
            if (failure instanceof Result.Failure) {
                failure = wqdVar;
            }
            return (wqd) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class k0 extends FunctionReferenceImpl implements izs<String, c260> {
        @Override // xsna.izs
        public final c260 invoke(String str) {
            String str2 = str;
            ((c260.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new c260(true, f370.y(jSONObject, "time_window", 1000L), f370.w(jSONObject, 8, "ex_count"));
            } catch (JSONException e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                return c260.e;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class k1 extends FunctionReferenceImpl implements izs<String, o1s0> {
        @Override // xsna.izs
        public final o1s0 invoke(String str) {
            String str2 = str;
            ((o1s0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int g = swe0.g(jSONObject.optInt("single_chunk_size", 65536), 8192, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                int optInt = jSONObject.optInt("preallocated_chunks_count", 0);
                if (optInt > 128) {
                    optInt = 128;
                }
                return new o1s0(g, optInt);
            } catch (JSONException e) {
                L.i(e);
                return o1s0.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class k2 extends FunctionReferenceImpl implements izs<String, VideoRustoreIapUpdateFeatureConfig> {
        /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:3:0x000b, B:9:0x002f, B:11:0x0037, B:12:0x0052, B:19:0x0090, B:20:0x0095, B:23:0x0070, B:26:0x0079, B:27:0x007c, B:30:0x0085, B:31:0x0088, B:33:0x0093, B:34:0x00a4, B:35:0x00ba, B:36:0x003d, B:38:0x0045, B:39:0x0048, B:41:0x0050), top: B:2:0x000b }] */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final VideoRustoreIapUpdateFeatureConfig invoke(String str) {
            VideoRustoreIapUpdateFeatureConfig.InAppType inAppType;
            int hashCode;
            VideoRustoreIapUpdateFeatureConfig.SilentUpdateType silentUpdateType;
            String str2 = str;
            ((VideoRustoreIapUpdateFeatureConfig.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String m = cqm0.m(jSONObject.getString("type"));
                int hashCode2 = m.hashCode();
                if (hashCode2 == -902327211) {
                    if (m.equals(NotificationCompat.GROUP_KEY_SILENT)) {
                        inAppType = VideoRustoreIapUpdateFeatureConfig.InAppType.SILENT;
                        String m2 = cqm0.m(jSONObject.getString("silentType"));
                        hashCode = m2.hashCode();
                        if (hashCode == -1332085432) {
                        }
                    }
                    throw new IllegalArgumentException("Type " + m + " is invalid Rustore update type");
                }
                if (hashCode2 == 1124382641) {
                    if (m.equals("immediate")) {
                        inAppType = VideoRustoreIapUpdateFeatureConfig.InAppType.IMMEDIATE;
                        String m22 = cqm0.m(jSONObject.getString("silentType"));
                        hashCode = m22.hashCode();
                        if (hashCode == -1332085432) {
                        }
                    }
                    throw new IllegalArgumentException("Type " + m + " is invalid Rustore update type");
                }
                if (hashCode2 == 1744737227 && m.equals("flexible")) {
                    inAppType = VideoRustoreIapUpdateFeatureConfig.InAppType.FLEXIBLE;
                    String m222 = cqm0.m(jSONObject.getString("silentType"));
                    hashCode = m222.hashCode();
                    if (hashCode == -1332085432) {
                        if (m222.equals("dialog")) {
                            silentUpdateType = VideoRustoreIapUpdateFeatureConfig.SilentUpdateType.DIALOG;
                            return new VideoRustoreIapUpdateFeatureConfig(inAppType, silentUpdateType, Long.valueOf(jSONObject.getLong("updateAvailableTimeAfterInstall")));
                        }
                        silentUpdateType = VideoRustoreIapUpdateFeatureConfig.SilentUpdateType.SNACKBAR;
                        return new VideoRustoreIapUpdateFeatureConfig(inAppType, silentUpdateType, Long.valueOf(jSONObject.getLong("updateAvailableTimeAfterInstall")));
                    }
                    if (hashCode == 3387192) {
                        if (m222.equals("none")) {
                            silentUpdateType = VideoRustoreIapUpdateFeatureConfig.SilentUpdateType.NONE;
                            return new VideoRustoreIapUpdateFeatureConfig(inAppType, silentUpdateType, Long.valueOf(jSONObject.getLong("updateAvailableTimeAfterInstall")));
                        }
                        silentUpdateType = VideoRustoreIapUpdateFeatureConfig.SilentUpdateType.SNACKBAR;
                        return new VideoRustoreIapUpdateFeatureConfig(inAppType, silentUpdateType, Long.valueOf(jSONObject.getLong("updateAvailableTimeAfterInstall")));
                    }
                    if (hashCode == 272623877 && m222.equals("snackbar")) {
                        silentUpdateType = VideoRustoreIapUpdateFeatureConfig.SilentUpdateType.SNACKBAR;
                        return new VideoRustoreIapUpdateFeatureConfig(inAppType, silentUpdateType, Long.valueOf(jSONObject.getLong("updateAvailableTimeAfterInstall")));
                    }
                    silentUpdateType = VideoRustoreIapUpdateFeatureConfig.SilentUpdateType.SNACKBAR;
                    return new VideoRustoreIapUpdateFeatureConfig(inAppType, silentUpdateType, Long.valueOf(jSONObject.getLong("updateAvailableTimeAfterInstall")));
                }
                throw new IllegalArgumentException("Type " + m + " is invalid Rustore update type");
            } catch (Exception e) {
                L.i(e);
                return VideoRustoreIapUpdateFeatureConfig.e;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class l extends FunctionReferenceImpl implements izs<String, qng> {
        @Override // xsna.izs
        public final qng invoke(String str) {
            String str2 = str;
            ((qng.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new qng(jSONObject.optInt("version", 3), cqm0.a(jSONObject.optString(CandidateTypeHintConfig.TYPE_HOST)), jSONObject.optLong("ping_interval", 20000L), jSONObject.optBoolean("inconsistency_detection", false), jSONObject.optLong("api_request_timeout", V2.h), jSONObject.optLong("api_reconnect_timeout", ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS));
            } catch (Exception e) {
                L.i(e);
                return qng.h;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class l0 extends FunctionReferenceImpl implements izs<String, j560> {
        @Override // xsna.izs
        public final j560 invoke(String str) {
            Object failure;
            String str2 = str;
            ((j560.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                failure = new j560(true, jSONObject.optDouble("common_part", 1.0d), jSONObject.optDouble("images_part", 1.0d), jSONObject.optDouble("audio_part", 1.0d), jSONObject.optLong("common_sec_sub", 0L), jSONObject.optLong("images_sec_sub", 0L), jSONObject.optLong("audio_sec_sub", 0L));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = j560.i;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (j560) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class l1 extends FunctionReferenceImpl implements izs<String, x1s0> {
        @Override // xsna.izs
        public final x1s0 invoke(String str) {
            String str2 = str;
            ((x1s0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new x1s0(f370.p(jSONObject, "blockPip", false), f370.p(jSONObject, "blockBackground", false));
            } catch (Exception e) {
                L.i(e);
                return new x1s0(false, false);
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class l2 extends FunctionReferenceImpl implements izs<String, jft0> {
        @Override // xsna.izs
        public final jft0 invoke(String str) {
            String str2 = str;
            ((jft0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String D = f370.D(jSONObject, "soc_event");
                if (D == null) {
                    D = jft0.d.a;
                }
                return new jft0(D, f370.O(jSONObject.getJSONArray("events")));
            } catch (JSONException e) {
                L.i(e);
                return jft0.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements izs<String, wqi> {
        @Override // xsna.izs
        public final wqi invoke(String str) {
            String str2 = str;
            ((wqi.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new wqi(jSONObject.optBoolean("warmupCompose", false), jSONObject.optBoolean("warmupState", false), jSONObject.optBoolean("warmupComposition", false));
            } catch (Exception e) {
                L.i(e);
                return wqi.e;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class m0 extends FunctionReferenceImpl implements izs<String, h960> {
        @Override // xsna.izs
        public final h960 invoke(String str) {
            String str2 = str;
            ((h960.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                ListBuilder e = e43.e();
                JSONArray optJSONArray = jSONObject.optJSONArray("watched_n_time_points");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        e.add(Long.valueOf(optJSONArray.getLong(i)));
                    }
                }
                ListBuilder g = e.g();
                h960 h960Var = h960.f;
                return new h960(g, jSONObject.optLong("telemetry_interval", h960Var.b), jSONObject.optLong("heartbeat_interval", h960Var.c), jSONObject.optInt("max_sessions", h960Var.d));
            } catch (JSONException e2) {
                L.i(e2);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class m1 extends FunctionReferenceImpl implements izs<String, b5s0> {
        @Override // xsna.izs
        public final b5s0 invoke(String str) {
            String str2 = str;
            ((b5s0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                b5s0 b5s0Var = b5s0.d;
                return new b5s0(jSONObject.optString("banner_text", b5s0Var.a), jSONObject.optInt("hide_days", b5s0Var.b));
            } catch (Exception e) {
                L.i(e);
                return b5s0.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class m2 extends FunctionReferenceImpl implements izs<String, ait0> {
        @Override // xsna.izs
        public final ait0 invoke(String str) {
            String str2 = str;
            ((ait0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new ait0(jSONObject.optLong("min_duration", 1000L), jSONObject.optLong("max_duration", 7000L), jSONObject.optLong("maxSystemSplashScreenDuration", 3000L), jSONObject.optBoolean("is_catalog_shimmers_enabled", false));
            } catch (JSONException e) {
                L.i(e);
                return ait0.f;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements izs<String, y4j> {
        @Override // xsna.izs
        public final y4j invoke(String str) {
            Object failure;
            String str2 = str;
            ((y4j.a) this.receiver).getClass();
            try {
                failure = new y4j(true, new JSONObject(str2).optBoolean("after_toggle_sync", true));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = y4j.d;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (y4j) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class n0 extends FunctionReferenceImpl implements izs<String, ie70> {
        @Override // xsna.izs
        public final ie70 invoke(String str) {
            String str2 = str;
            ((ie70.a) this.receiver).getClass();
            try {
                return ie70.a.a(new JSONObject(str2));
            } catch (Exception e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class n1 extends FunctionReferenceImpl implements izs<String, f8s0> {
        @Override // xsna.izs
        public final f8s0 invoke(String str) {
            String str2 = str;
            ((f8s0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Integer x = f370.x(jSONObject, "chunk_duration_threshold_ms");
                int intValue = x != null ? x.intValue() : f8s0.j.a;
                String D = f370.D(jSONObject, "quality_step_type");
                if (D == null) {
                    D = f8s0.j.b;
                }
                String str3 = D;
                Long z = f370.z(jSONObject, "max_buffer_to_cancel");
                long longValue = z != null ? z.longValue() : f8s0.j.c;
                Long z2 = f370.z(jSONObject, "min_buffer_to_cancel");
                long longValue2 = z2 != null ? z2.longValue() : f8s0.j.d;
                Boolean q = f370.q(jSONObject, "restore_if_buffer_restored");
                boolean booleanValue = q != null ? q.booleanValue() : f8s0.j.e;
                Double t = f370.t(jSONObject, "time_diff_threshold");
                double doubleValue = t != null ? t.doubleValue() : f8s0.j.f;
                Float u = f370.u("almost_finished_chunk_percent", jSONObject);
                float floatValue = u != null ? u.floatValue() : f8s0.j.g;
                Long z3 = f370.z(jSONObject, "max_time_from_seek");
                return new f8s0(intValue, str3, longValue, longValue2, booleanValue, doubleValue, floatValue, z3 != null ? z3.longValue() : f8s0.j.h);
            } catch (JSONException e) {
                L.i(e);
                return f8s0.j;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class n2 extends FunctionReferenceImpl implements izs<String, tit0> {
        @Override // xsna.izs
        public final tit0 invoke(String str) {
            String str2 = str;
            ((tit0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new tit0(jSONObject.optInt("buffering_timeout_ms", 600000), jSONObject.optInt("suppressed_timeout_ms", 600000));
            } catch (Exception e) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return null;
                }
                L.u(l, L.LogType.e, new Object[]{e});
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements izs<String, kek> {
        @Override // xsna.izs
        public final kek invoke(String str) {
            Object failure;
            String str2 = str;
            ((kek.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                failure = new kek(jSONObject.optLong("executor_recycler_alive_time_ms", 100L), jSONObject.optLong("executor_alive_time_ms", 1000L));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = kek.d;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (kek) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class o0 extends FunctionReferenceImpl implements izs<String, uu70> {
        @Override // xsna.izs
        public final uu70 invoke(String str) {
            uu70.b bVar;
            String str2 = str;
            ((uu70.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int i = jSONObject.getInt("max_retry_count");
                long j = jSONObject.getLong("skip_duration_ms");
                bVar = (i < 0 || j < 0) ? uu70.b.a.a : new uu70.b.C3834b(i, j);
            } catch (JSONException e) {
                L.i(e);
                bVar = uu70.b.a.a;
            }
            return new uu70(bVar);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class o1 extends FunctionReferenceImpl implements izs<String, com.vk.toggle.data.c> {
        @Override // xsna.izs
        public final com.vk.toggle.data.c invoke(String str) {
            ((c.a) this.receiver).getClass();
            return c.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class o2 extends FunctionReferenceImpl implements izs<String, fzv0> {
        @Override // xsna.izs
        public final fzv0 invoke(String str) {
            String str2 = str;
            ((fzv0.a) this.receiver).getClass();
            try {
                return new fzv0(aa3.a.a(new JSONObject(str2)));
            } catch (JSONException unused) {
                return fzv0.c;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements izs<String, xok> {
        @Override // xsna.izs
        public final xok invoke(String str) {
            String str2 = str;
            ((xok.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new xok(jSONObject.optBoolean("queue_drop_enabled", false), f370.z(jSONObject, "queue_drop_delay_ms"));
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class p0 extends FunctionReferenceImpl implements izs<String, oi80> {
        @Override // xsna.izs
        public final oi80 invoke(String str) {
            String str2 = str;
            ((oi80.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONObject optJSONObject = jSONObject.optJSONObject("event_to_send_prob_map");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        linkedHashMap.put(next, Float.valueOf(swe0.f((float) optJSONObject.optDouble(next, ConnectivityTracker.DEFAULT_UPLINK_BITRATE), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
                    }
                }
                return new oi80(jSONObject.optInt("count_trigger_threshold", 10), jSONObject.optString("url"), linkedHashMap);
            } catch (Exception e) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return null;
                }
                L.u(l, L.LogType.e, new Object[]{e});
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class p1 extends FunctionReferenceImpl implements izs<String, bdt0> {
        @Override // xsna.izs
        public final bdt0 invoke(String str) {
            String str2 = str;
            ((bdt0.a) this.receiver).getClass();
            try {
                return new bdt0(f370.p(new JSONObject(str2), "resetOnNetworkChange", true));
            } catch (JSONException e) {
                L.i(e);
                return bdt0.c;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class p2 extends FunctionReferenceImpl implements izs<String, f0w0> {
        @Override // xsna.izs
        public final f0w0 invoke(String str) {
            ((f0w0.a) this.receiver).getClass();
            return f0w0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class q extends FunctionReferenceImpl implements izs<String, m5m> {
        @Override // xsna.izs
        public final m5m invoke(String str) {
            Object failure;
            Map map;
            String str2 = str;
            ((m5m.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONObject optJSONObject = jSONObject.optJSONObject("samples");
                if (optJSONObject != null) {
                    map = new LinkedHashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        m5m.a aVar = m5m.d;
                        try {
                            map.put(next, Double.valueOf(optJSONObject.optDouble(next, 1.0d)));
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    map = jgp.b;
                }
                failure = new m5m(jSONObject.optDouble(BuildConfig.FLAVOR, 1.0d), map, true);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = m5m.e;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (m5m) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class q0 extends FunctionReferenceImpl implements izs<String, zi80> {
        @Override // xsna.izs
        public final zi80 invoke(String str) {
            String str2 = str;
            ((zi80.a) this.receiver).getClass();
            try {
                return new zi80(new JSONObject(str2).optBoolean("disable_old_stat"));
            } catch (JSONException e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class q1 extends FunctionReferenceImpl implements izs<String, VideoAdFreeSubscriptionFeatureConfig> {
        @Override // xsna.izs
        public final VideoAdFreeSubscriptionFeatureConfig invoke(String str) {
            Set set;
            VideoAdFreeSubscriptionFeatureConfig.ButtonStrategy buttonStrategy;
            VideoAdFreeSubscriptionFeatureConfig.PopupStrategy popupStrategy;
            String str2 = str;
            ((VideoAdFreeSubscriptionFeatureConfig.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                ArrayList a = qaj0.a(jSONObject.getJSONArray("popupStrategies"));
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    switch (str3.hashCode()) {
                        case -405153388:
                            if (!str3.equals("AD_ENDS")) {
                                throw new IllegalArgumentException("Popup strategy " + str3 + " is not defined");
                            }
                            popupStrategy = VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.AD_END;
                            break;
                        case -404739045:
                            if (!str3.equals("AD_SKIP")) {
                                throw new IllegalArgumentException("Popup strategy " + str3 + " is not defined");
                            }
                            popupStrategy = VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.AD_SKIP;
                            break;
                        case -382641965:
                            if (!str3.equals("DISCOVERY_START")) {
                                throw new IllegalArgumentException("Popup strategy " + str3 + " is not defined");
                            }
                            popupStrategy = VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.DISCOVERY_START;
                            break;
                        case -263657452:
                            if (!str3.equals("VIDEO_TAB_START")) {
                                throw new IllegalArgumentException("Popup strategy " + str3 + " is not defined");
                            }
                            popupStrategy = VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.VIDEO_TAB_START;
                            break;
                        case 325934964:
                            if (!str3.equals("AD_FIRST")) {
                                throw new IllegalArgumentException("Popup strategy " + str3 + " is not defined");
                            }
                            popupStrategy = VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.AD_FIRST;
                            break;
                        case 338859017:
                            if (!str3.equals("AD_TIMER")) {
                                throw new IllegalArgumentException("Popup strategy " + str3 + " is not defined");
                            }
                            popupStrategy = VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.AD_TIMER;
                            break;
                        case 1250289796:
                            if (!str3.equals("APP_START")) {
                                throw new IllegalArgumentException("Popup strategy " + str3 + " is not defined");
                            }
                            popupStrategy = VideoAdFreeSubscriptionFeatureConfig.PopupStrategy.APP_START;
                            break;
                        default:
                            throw new IllegalArgumentException("Popup strategy " + str3 + " is not defined");
                    }
                    arrayList.add(popupStrategy);
                }
                Set S0 = j5g.S0(arrayList);
                JSONArray optJSONArray = jSONObject.optJSONArray("buttonStrategies");
                if (optJSONArray != null) {
                    ArrayList a2 = qaj0.a(optJSONArray);
                    ArrayList arrayList2 = new ArrayList(c5g.u(a2, 10));
                    Iterator it2 = a2.iterator();
                    while (it2.hasNext()) {
                        String str4 = (String) it2.next();
                        int hashCode = str4.hashCode();
                        if (hashCode != -842260428) {
                            if (hashCode != -372942893) {
                                if (hashCode == 1387200225 && str4.equals("DURING_AD")) {
                                    buttonStrategy = VideoAdFreeSubscriptionFeatureConfig.ButtonStrategy.DURING_AD;
                                    arrayList2.add(buttonStrategy);
                                }
                                throw new IllegalArgumentException("Button strategy " + str4 + " is not defined");
                            }
                            if (!str4.equals("WITH_POPUP")) {
                                throw new IllegalArgumentException("Button strategy " + str4 + " is not defined");
                            }
                            buttonStrategy = VideoAdFreeSubscriptionFeatureConfig.ButtonStrategy.WITH_POPUP;
                            arrayList2.add(buttonStrategy);
                        } else {
                            if (!str4.equals("MID_ROLL")) {
                                throw new IllegalArgumentException("Button strategy " + str4 + " is not defined");
                            }
                            buttonStrategy = VideoAdFreeSubscriptionFeatureConfig.ButtonStrategy.MID_ROLL;
                            arrayList2.add(buttonStrategy);
                        }
                    }
                    set = j5g.S0(arrayList2);
                    if (set == null) {
                    }
                    return new VideoAdFreeSubscriptionFeatureConfig(jSONObject.getInt("popupIntervalDays"), jSONObject.optInt("greyButtonIntervalDays", 30), jSONObject.optString("popupProceedButtonText", ""), jSONObject.optString("popupTermsOfServiceButtonText", ""), jSONObject.optString("popupTitle", ""), jSONObject.optString("greyButtonText", ""), jSONObject.optBoolean("settingsEntryEnabled", false), S0, set, jSONObject.optInt("queueTimeoutMins", 0));
                }
                set = EmptySet.b;
                return new VideoAdFreeSubscriptionFeatureConfig(jSONObject.getInt("popupIntervalDays"), jSONObject.optInt("greyButtonIntervalDays", 30), jSONObject.optString("popupProceedButtonText", ""), jSONObject.optString("popupTermsOfServiceButtonText", ""), jSONObject.optString("popupTitle", ""), jSONObject.optString("greyButtonText", ""), jSONObject.optBoolean("settingsEntryEnabled", false), S0, set, jSONObject.optInt("queueTimeoutMins", 0));
            } catch (Exception e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class q2 extends FunctionReferenceImpl implements izs<String, tzv0> {
        @Override // xsna.izs
        public final tzv0 invoke(String str) {
            String str2 = str;
            ((tzv0.a) this.receiver).getClass();
            try {
                return new tzv0(aa3.a.a(new JSONObject(str2)));
            } catch (JSONException unused) {
                return tzv0.c;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class r extends FunctionReferenceImpl implements izs<String, xsn> {
        @Override // xsna.izs
        public final xsn invoke(String str) {
            String str2 = str;
            ((xsn.a) this.receiver).getClass();
            try {
                return new xsn(new JSONObject(str2).optBoolean("root_history_allows_duplicates", false));
            } catch (Exception e) {
                L.i(e);
                return xsn.c;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class r0 extends FunctionReferenceImpl implements izs<String, aj80> {
        @Override // xsna.izs
        public final aj80 invoke(String str) {
            String str2 = str;
            ((aj80.a) this.receiver).getClass();
            try {
                return new aj80(new JSONObject(str2).optBoolean("disable_old"));
            } catch (JSONException e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class r1 extends FunctionReferenceImpl implements izs<String, ans0> {
        @Override // xsna.izs
        public final ans0 invoke(String str) {
            String str2 = str;
            ((ans0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new ans0(jSONObject.optBoolean("button_3dot_replace_enabled", false), jSONObject.optInt("controls_bar_redesign", 0), jSONObject.optBoolean("button_gear_replace_enabled", false), jSONObject.optBoolean("counter_share_enabled", false));
            } catch (JSONException e) {
                L.i(e);
                return ans0.g;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class r2 extends FunctionReferenceImpl implements izs<String, f0w0> {
        @Override // xsna.izs
        public final f0w0 invoke(String str) {
            ((f0w0.a) this.receiver).getClass();
            return f0w0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class s extends FunctionReferenceImpl implements izs<String, zrk> {
        @Override // xsna.izs
        public final zrk invoke(String str) {
            Object failure;
            String str2 = str;
            ((zrk.a) this.receiver).getClass();
            try {
                failure = new zrk(new JSONObject(str2).optLong("connection_timeout", 10000L));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = zrk.c;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (zrk) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class s0 extends FunctionReferenceImpl implements izs<String, ar90> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
        @Override // xsna.izs
        public final ar90 invoke(String str) {
            Object failure;
            ?? r0;
            String str2 = str;
            ((ar90.a) this.receiver).getClass();
            try {
                JSONArray optJSONArray = new JSONObject(str2).optJSONArray("exclude");
                if (optJSONArray != null) {
                    r0 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        r0.add(new Regex(optJSONArray.getString(i)));
                    }
                } else {
                    r0 = 0;
                }
                if (r0 == 0) {
                    r0 = EmptyList.b;
                }
                failure = new ar90((List<Regex>) r0);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = ar90.c;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (ar90) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class s1 extends FunctionReferenceImpl implements izs<String, bns0> {
        @Override // xsna.izs
        public final bns0 invoke(String str) {
            String str2 = str;
            ((bns0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new bns0(jSONObject.optBoolean("button_3dot_replace_enabled", false), jSONObject.optBoolean("button_gear_replace_enabled", false), jSONObject.optBoolean("counter_like_com_enabled", false), jSONObject.optBoolean("subscribe_button_enabled", false));
            } catch (JSONException e) {
                L.i(e);
                return bns0.f;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class s2 extends FunctionReferenceImpl implements izs<String, shx0> {
        @Override // xsna.izs
        public final shx0 invoke(String str) {
            String str2 = str;
            ((shx0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new shx0((Pair<Boolean, Long>) new Pair(Boolean.valueOf(jSONObject.optBoolean("enabled", false)), Long.valueOf(jSONObject.optLong("min_size_compress", PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID))));
            } catch (Exception e) {
                L.i(e);
                return shx0.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class t extends FunctionReferenceImpl implements izs<String, nto> {
        @Override // xsna.izs
        public final nto invoke(String str) {
            ((nto.a) this.receiver).getClass();
            return new nto(cqm0.j(str).optBoolean("dzen_backend", false));
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class t0 extends FunctionReferenceImpl implements izs<String, fw90> {
        @Override // xsna.izs
        public final fw90 invoke(String str) {
            String str2 = str;
            ((fw90.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new fw90(jSONObject.getInt("cpu_low"), jSONObject.getInt("cpu_high"), jSONObject.getInt("disk_low"), jSONObject.getInt("disk_high"), jSONObject.getInt("ram_low"), jSONObject.getInt("ram_high"));
            } catch (Throwable th) {
                L.i(th);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class t1 extends FunctionReferenceImpl implements izs<String, cns0> {
        @Override // xsna.izs
        public final cns0 invoke(String str) {
            String str2 = str;
            ((cns0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new cns0(jSONObject.optBoolean("button_3dot_replace_enabled", false), jSONObject.optBoolean("button_gear_replace_enabled", false), jSONObject.optBoolean("counter_like_com_enabled", false), jSONObject.optBoolean("subscribe_button_enabled", false));
            } catch (JSONException e) {
                L.i(e);
                return cns0.f;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class t2 extends FunctionReferenceImpl implements izs<String, whx0> {
        @Override // xsna.izs
        public final whx0 invoke(String str) {
            String str2 = str;
            ((whx0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new whx0(jSONObject.optInt("max_requests", 30), jSONObject.optLong("window_ms", 3000L), jSONObject.optBoolean("enabled", false));
            } catch (Exception e) {
                L.i(e);
                return whx0.e;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class u extends FunctionReferenceImpl implements izs<String, oto> {
        @Override // xsna.izs
        public final oto invoke(String str) {
            ((oto.a) this.receiver).getClass();
            return new oto(cqm0.j(str).optBoolean("vk_backend_disabled", false));
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class u0 extends FunctionReferenceImpl implements izs<String, com.vk.toggle.data.b> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
        @Override // xsna.izs
        public final com.vk.toggle.data.b invoke(String str) {
            ?? r14;
            axe0 a;
            String str2 = str;
            ((b.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                boolean optBoolean = jSONObject.optBoolean("enabled", true);
                boolean optBoolean2 = jSONObject.optBoolean("verbose", false);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject optJSONObject = jSONObject.optJSONObject("rules");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                        if (optJSONObject2 != null) {
                            RateMode.a aVar = RateMode.Companion;
                            String optString = optJSONObject2.optString(X3.a.t, "");
                            aVar.getClass();
                            RateMode a2 = RateMode.a.a(optString);
                            if (a2 != null) {
                                com.vk.toggle.data.b.e.getClass();
                                int optInt = optJSONObject2.optInt("max_requests", 0);
                                if (optInt < 0) {
                                    optInt = 0;
                                }
                                long optLong = optJSONObject2.optLong("window_ms", 0L);
                                linkedHashMap.put(next, new zwe0(optInt, optLong >= 0 ? optLong : 0L, a2));
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("funnels");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                        if (optJSONObject3 != null) {
                            com.vk.toggle.data.b.e.getClass();
                            JSONArray optJSONArray2 = optJSONObject3.optJSONArray("rules");
                            xwe0 xwe0Var = null;
                            if (optJSONArray2 != null) {
                                k9x q = swe0.q(0, optJSONArray2.length());
                                r14 = new ArrayList();
                                j9x it = q.iterator();
                                while (it.hasNext()) {
                                    String obj = drm0.p0(optJSONArray2.optString(it.nextInt())).toString();
                                    if (obj.length() <= 0) {
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        r14.add(obj);
                                    }
                                }
                            } else {
                                r14 = EmptyList.b;
                            }
                            if (!r14.isEmpty()) {
                                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("entry");
                                if (optJSONObject4 != null) {
                                    com.vk.toggle.data.b.e.getClass();
                                    a = b.a.a(optJSONObject4);
                                } else {
                                    a = b.a.a(optJSONObject3);
                                }
                                xwe0Var = new xwe0(a, r14);
                            }
                            if (xwe0Var != null) {
                                arrayList.add(xwe0Var);
                            }
                        }
                    }
                }
                return new com.vk.toggle.data.b(optBoolean, optBoolean2, pn00.t(linkedHashMap), arrayList);
            } catch (Exception e) {
                L.i(e);
                return com.vk.toggle.data.b.f;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class u1 extends FunctionReferenceImpl implements izs<String, cos0> {
        @Override // xsna.izs
        public final cos0 invoke(String str) {
            zns0 zns0Var;
            String str2 = str;
            ((cos0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                ArrayList arrayList = new ArrayList();
                String optString = jSONObject.optString("url");
                JSONArray jSONArray = jSONObject.getJSONArray("traps");
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (optString != null && optString.length() != 0) {
                            zns0Var = new zns0(jSONObject2.getString("id"), tni.b(jSONObject2.getString("link"), optString), tni.b(jSONObject2.optString("huawei_link"), optString), tni.b(jSONObject2.optString("rustore_link"), optString), tni.b(jSONObject2.optString("samsung_link"), optString), tni.b(jSONObject2.optString("xiaomi_link"), optString));
                            arrayList.add(zns0Var);
                        }
                        zns0Var = new zns0(jSONObject2.getString("id"), jSONObject2.getString("link"), jSONObject2.optString("huawei_link"), jSONObject2.optString("rustore_link"), jSONObject2.optString("samsung_link"), jSONObject2.optString("xiaomi_link"));
                        arrayList.add(zns0Var);
                    }
                }
                return new cos0(jSONObject.getInt("timePeriodHours"), jSONObject.getInt("resetTrapsPeriodDays"), Boolean.valueOf(jSONObject.optBoolean("testingMode")), arrayList);
            } catch (Exception e) {
                L.i(e);
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class u2 extends FunctionReferenceImpl implements izs<String, hmx0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
        @Override // xsna.izs
        public final hmx0 invoke(String str) {
            Object failure;
            ?? r4;
            Object failure2;
            String str2 = str;
            ((hmx0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONArray optJSONArray = jSONObject.optJSONArray("endpoints");
                if (optJSONArray != null) {
                    k9x q = swe0.q(0, optJSONArray.length());
                    r4 = new ArrayList();
                    j9x it = q.iterator();
                    while (it.hasNext()) {
                        int nextInt = it.nextInt();
                        hmx0.a aVar = hmx0.i;
                        try {
                            failure2 = optJSONArray.getString(nextInt);
                        } catch (Throwable th) {
                            failure2 = new Result.Failure(th);
                        }
                        if (failure2 instanceof Result.Failure) {
                            failure2 = null;
                        }
                        String str3 = (String) failure2;
                        if (str3 != null) {
                            r4.add(str3);
                        }
                    }
                } else {
                    r4 = EmptyList.b;
                }
                List list = r4;
                int optInt = jSONObject.optInt("failed_endpoints_threshold", list.size());
                failure = new hmx0(true, list, jSONObject.optLong("connection_timeout_ms", 10000L), jSONObject.optLong("ping_interval_ms", 300000L), jSONObject.optLong("cache_ttl_ms", 600000L), optInt < 1 ? 1 : optInt, jSONObject.optInt("client_host_error_count_in_window", 10), jSONObject.optLong("client_host_check_time_window_ms", 60000L));
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            Object obj = hmx0.j;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return (hmx0) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class v extends FunctionReferenceImpl implements izs<String, tkp> {
        @Override // xsna.izs
        public final tkp invoke(String str) {
            Object failure;
            String str2 = str;
            ((tkp.a) this.receiver).getClass();
            try {
                failure = new tkp(Long.parseLong(str2));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            return (tkp) failure;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class v0 extends FunctionReferenceImpl implements izs<String, xof0> {
        @Override // xsna.izs
        public final xof0 invoke(String str) {
            long j;
            ((xof0.a) this.receiver).getClass();
            JSONObject jSONObject = new JSONObject(str);
            ArrayList arrayList = new ArrayList();
            try {
                if (jSONObject.has("http_good_codes")) {
                    List c0 = drm0.c0(jSONObject.getString("http_good_codes"), new String[]{StringUtils.COMMA}, 0, 6);
                    ArrayList arrayList2 = new ArrayList(c5g.u(c0, 10));
                    Iterator it = c0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                    }
                    arrayList.addAll(arrayList2);
                }
            } catch (Throwable th) {
                L.i(th);
            }
            if (jSONObject.has("debounce_sec")) {
                j = Math.max(1L, jSONObject.getLong("debounce_sec"));
                return new xof0(j, arrayList);
            }
            j = 30;
            return new xof0(j, arrayList);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class v1 extends FunctionReferenceImpl implements izs<String, kos0> {
        @Override // xsna.izs
        public final kos0 invoke(String str) {
            ((kos0.a) this.receiver).getClass();
            return kos0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class w extends FunctionReferenceImpl implements izs<String, fkq> {
        @Override // xsna.izs
        public final fkq invoke(String str) {
            String str2 = str;
            ((fkq.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                int optInt = jSONObject.optInt("probability", -1);
                if (optInt <= 0) {
                    return fkq.j;
                }
                String optString = jSONObject.optString("start_showing_from_date_time", null);
                String optString2 = jSONObject.optString("stop_showing_from_date_time", null);
                return new fkq(100 < optInt ? 100 : optInt, optString, jSONObject.optBoolean("show_only_on_specified_dates", true), jSONObject.optBoolean("without_animation", true), jSONObject.optBoolean("without_animation_behind_status_bar", true), jSONObject.optBoolean("without_custom_ptr", true), optString2);
            } catch (Exception e) {
                L.j(e, "FamilyDay2026PtrConfig");
                return fkq.i;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class w0 extends FunctionReferenceImpl implements izs<String, krg0> {
        public w0(Object obj) {
            super(1, obj, krg0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/RuStorePushOverrideConfig;", 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final krg0 invoke(String str) {
            Object failure;
            Object obj;
            Set singleton;
            String str2 = str;
            ((krg0.a) this.receiver).getClass();
            try {
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (drm0.N(str2)) {
                obj = new krg0(krg0.d, true);
                Object obj2 = krg0.e;
                if (obj instanceof Result.Failure) {
                    obj = obj2;
                }
                return (krg0) obj;
            }
            JSONArray optJSONArray = new JSONObject(str2).optJSONArray("override_engine");
            if (optJSONArray == null || (singleton = j5g.S0(f370.O(optJSONArray))) == null) {
                singleton = Collections.singleton("any");
            }
            failure = new krg0(singleton, true);
            obj = failure;
            Object obj22 = krg0.e;
            if (obj instanceof Result.Failure) {
            }
            return (krg0) obj;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class w1 extends FunctionReferenceImpl implements izs<String, kos0> {
        @Override // xsna.izs
        public final kos0 invoke(String str) {
            ((kos0.a) this.receiver).getClass();
            return kos0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class x extends FunctionReferenceImpl implements izs<String, jlq> {
        @Override // xsna.izs
        public final jlq invoke(String str) {
            String str2 = str;
            ((jlq.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONObject jSONObject2 = jSONObject.getJSONObject("increase");
                long j = jSONObject2.getLong("less4");
                long j2 = jSONObject2.getLong("from4to7");
                long j3 = jSONObject2.getLong("from7to10");
                long j4 = jSONObject2.getLong("more10");
                JSONObject jSONObject3 = jSONObject.getJSONObject("retain");
                long j5 = 1000;
                return new jlq(new jlq.b(j * j5, j2 * j5, j3 * j5, j4 * j5), new jlq.b(jSONObject3.getLong("less4") * j5, jSONObject3.getLong("from4to7") * j5, jSONObject3.getLong("from7to10") * j5, jSONObject3.getLong("more10") * j5));
            } catch (JSONException unused) {
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class x0 extends FunctionReferenceImpl implements izs<String, pbj0> {
        @Override // xsna.izs
        public final pbj0 invoke(String str) {
            String str2 = str;
            ((pbj0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new pbj0(jSONObject.optBoolean("post", false), jSONObject.optBoolean("clip", false), jSONObject.optBoolean("channel", false), jSONObject.optBoolean("stories", false), new pbj0.b(jSONObject.optString("post_install_url"), jSONObject.optString("clip_install_url"), jSONObject.optString("channel_install_url"), jSONObject.optString("stories_install_url")));
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class x1 extends FunctionReferenceImpl implements izs<String, Map<String, ? extends kos0>> {
        @Override // xsna.izs
        public final Map<String, ? extends kos0> invoke(String str) {
            String str2 = str;
            ((kos0.a) this.receiver).getClass();
            jgp jgpVar = jgp.b;
            if (str2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    try {
                        hfr t = rli0.t(dli0.c(jSONObject.keys()), new rtg0(jSONObject, 20));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        pn00.q(linkedHashMap, t);
                        int size = linkedHashMap.size();
                        if (size == 0) {
                            return jgpVar;
                        }
                        if (size != 1) {
                            return linkedHashMap;
                        }
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        return Collections.singletonMap(entry.getKey(), entry.getValue());
                    } catch (Exception e) {
                        L.i(e);
                    }
                } catch (Exception e2) {
                    L.i(e2);
                }
            }
            return jgpVar;
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class y extends FunctionReferenceImpl implements izs<String, owq> {
        @Override // xsna.izs
        public final owq invoke(String str) {
            String str2 = str;
            ((owq.a) this.receiver).getClass();
            try {
                return new owq(new JSONObject(str2).optInt("count", 0));
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
                return owq.c;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class y0 extends FunctionReferenceImpl implements izs<String, bek0> {
        @Override // xsna.izs
        public final bek0 invoke(String str) {
            String str2 = str;
            ((bek0.a) this.receiver).getClass();
            try {
                JSONArray jSONArray = new JSONArray(str2);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i = wq.b(jSONArray, i, arrayList, i, 1)) {
                }
                return new bek0(j5g.S0(arrayList));
            } catch (Exception e) {
                L.i(e);
                return bek0.c;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class y1 extends FunctionReferenceImpl implements izs<String, kos0> {
        @Override // xsna.izs
        public final kos0 invoke(String str) {
            ((kos0.a) this.receiver).getClass();
            return kos0.a.a(str);
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class z extends FunctionReferenceImpl implements izs<String, jyq> {
        @Override // xsna.izs
        public final jyq invoke(String str) {
            String str2 = str;
            ((jyq.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new jyq(jSONObject.optBoolean("photo", true), jSONObject.optBoolean(SharedKt.PARAM_ATTACHMENT, true));
            } catch (JSONException unused) {
                return jyq.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class z0 extends FunctionReferenceImpl implements izs<String, gjk0> {
        @Override // xsna.izs
        public final gjk0 invoke(String str) {
            String str2 = str;
            ((gjk0.a) this.receiver).getClass();
            try {
                return new gjk0(true, f370.C(X3.i.j0, "", new JSONObject(str2)));
            } catch (JSONException e) {
                com.vk.metrics.eventtracking.b.a.a(e);
                return gjk0.d;
            }
        }
    }

    /* compiled from: FeaturesHelper.kt */
    public static final /* synthetic */ class z1 extends FunctionReferenceImpl implements izs<String, oos0> {
        @Override // xsna.izs
        public final oos0 invoke(String str) {
            String str2 = str;
            ((oos0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new oos0(jSONObject.getString("text_title"), f370.p(jSONObject, "open_discovery_scenario", true), f370.p(jSONObject, "hard_variant", false), f370.p(jSONObject, "show_open_saa_popup", false), jSONObject.getString("link"), jSONObject.optString("huawei_link"), jSONObject.optString("rustore_link"), jSONObject.optString("samsung_link"), jSONObject.optString("xiaomi_link"), jSONObject.optBoolean("test_mode", false));
            } catch (Exception e) {
                L.i(e);
                return null;
            }
        }
    }

    static {
        new i0(1, yyy.a, yyy.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/LeakCanaryConfig;", 0);
        e = new eqy<>(FeedFeatures.CLEAR_STACK_INACTIVE, new g(1, iic.d, iic.a.class, "fromString", "fromString(Ljava/lang/String;)Lcom/vk/toggle/data/ClearStackInactiveConfig;", 0));
        f = new eqy<>(FeedFeatures.DZEN_CAROUSEL, new t(1, nto.b, nto.a.class, "fromString", "fromString(Ljava/lang/String;)Lcom/vk/toggle/data/DzenCarouselConfig;", 0));
        g = new eqy<>(FeedFeatures.DZEN_CAROUSEL_MEDIASCOPE, new u(1, oto.b, oto.a.class, "fromString", "fromString(Ljava/lang/String;)Lcom/vk/toggle/data/DzenMediascopeConfig;", 0));
        h = new eqy<>(FeedFeatures.FRESH_TIMER, new b0(1, zhs.b, zhs.a.class, "fromString", "fromString(Ljava/lang/String;)Lcom/vk/toggle/data/FreshTimerConfig;", 0));
        i = new eqy<>(FeedFeatures.FEED_APPLOVIN_PRELOAD_CONFIG, new y(1, owq.b, owq.a.class, "fromString", "fromString(Ljava/lang/String;)Lcom/vk/toggle/data/FeedApplovinPreloadConfig;", 0));
        j = new eqy<>(VideoFeatures.VIDEO_CANCEL_LONG_REQUESTS, new n1(1, f8s0.i, f8s0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoCancelLongRequestsConfig;", 0));
        k = new eqy<>(VideoFeatures.VIDEO_SEND_EXTENDED_INFO_IN_STATS, new l2(1, jft0.c, jft0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoSendExtendedInfoInStatsConfig;", 0));
        l = new eqy<>(FeedFeatures.DISABLE_PLAYLIST_ANIM, new z(1, jyq.c, jyq.a.class, "fromJsonString", "fromJsonString(Ljava/lang/String;)Lcom/vk/toggle/data/FeedDisablePlaylistAnimConfig;", 0));
        m = new eqy<>(SmbAdFeatures.FEATURE_SMB_ADS_DYNAMIC_BUTTON, new c(1, com.vk.toggle.data.a.d, a.C1928a.class, "fromJsonString", "fromJsonString(Ljava/lang/String;)Lcom/vk/toggle/data/AdsButtonConfig;", 0));
        n = new eqy<>(CoreFeatures.CORE_CHRISTMAS_GARLAND, new f(1, ubc.c, ubc.a.class, "parseFromJsonString", "parseFromJsonString(Ljava/lang/String;)Lcom/vk/toggle/data/ChristmasGarlandConfig;", 0));
        o = new eqy<>(CoreFeatures.DO_NOT_KILL_ROOT_FRAGMENTS, new r(1, xsn.b, xsn.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/DoNotKillRootFragmentsConfig;", 0));
        p = new eqy<>(CoreFeatures.COMPOSE_START_STAT, new m(1, wqi.d, wqi.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/ComposeStartStatConfig;", 0));
        q = new eqy<>(CoreFeatures.IMAGE_PRIORITY_LOADING, new f0(1, zkw.c, zkw.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/ImagePriorityFetcherConfig;", 0));
        r = new eqy<>(CoreFeatures.SPECIAL_EVENT_ICON, new z0(1, gjk0.c, gjk0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/SpecialEventIconConfig;", 0));
        s = new eqy<>(VideoFeatures.SELECTION_CONFIG, new e1(1, dhp0.g, dhp0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/TrackSelectorParamsConfig;", 0));
        t = new eqy<>(VideoFeatures.VIDEO_NEW_STAT, new m0(1, h960.e, h960.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/NewVideoStatConfig;", 0));
        u = new eqy<>(VideoFeatures.BBA0_RULE, new C1927d(1, ru5.e, ru5.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/BBA0Config;", 0));
        v = new eqy<>(VideoFeatures.CUSTOM_TRACK_SELECTION, new p(1, xok.c, xok.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/CustomTrackSelectionConfig;", 0));
        w = new eqy<>(VideoFeatures.FAST_QUALITY_INCREASE, new x(1, jlq.c, jlq.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/FastQualityIncreaseConfig;", 0));
        x = new eqy<>(VideoFeatures.VIDEO_OFFLINE_PLAYBACK_ERRORS_EVASION, new o0(1, uu70.b, uu70.a.class, "fromJsonString", "fromJsonString(Ljava/lang/String;)Lcom/vk/toggle/data/OfflinePlaybackErrorsEvasionConfig;", 0));
        y = new eqy<>(VideoFeatures.DEFAULT_ESTIMATOR_RESET_ON_NETWORK_CHANGE, new p1(1, bdt0.b, bdt0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoResetOnNetworkChangeConfig;", 0));
        z = new eqy<>(VideoFeatures.VIDEO_ALLOCATOR_PARAMS, new k1(1, o1s0.c, o1s0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoAllocatorConfig;", 0));
        A = new eqy<>(VideoFeatures.VIDEO_AV1_CHIPSETS_LIST, new g1(1, k4s0.b, k4s0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoAv1SoCsListConfig;", 0));
        B = new eqy<>(VideoFeatures.VK_VIDEO_RESTRICTION_DOWNLOAD_IN_VK_APP, new q2(1, tzv0.b, tzv0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/vkvideopromo/VkVideoDownloadingRestrictionConfig;", 0));
        C = new eqy<>(VideoFeatures.VIDEO_OPEN_STANDALONE_BOTTOMSHEET_BGR_VIEW, new o2(1, fzv0.b, fzv0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/vkvideopromo/VkVideoBackgroundViewConfig;", 0));
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_OPEN_STANDALONE_BOTTOMSHEET;
        kos0.a aVar = kos0.r;
        D = new eqy<>(videoFeatures, new v1(1, aVar, kos0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoGrowthFeatureConfig;", 0));
        new k2(1, VideoRustoreIapUpdateFeatureConfig.d, VideoRustoreIapUpdateFeatureConfig.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoRustoreIapUpdateFeatureConfig;", 0);
        E = new eqy<>(VideoFeatures.VIDEO_OPEN_STANDALONE_CTA, new y1(1, aVar, kos0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoGrowthFeatureConfig;", 0));
        F = new eqy<>(VideoFeatures.VIDEO_OPEN_STANDALONE_BTN, new w1(1, aVar, kos0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoGrowthFeatureConfig;", 0));
        G = new eqy<>(VideoFeatures.VIDEO_OPEN_VK_VIDEO_POPUP, new e2(1, aVar, kos0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoGrowthFeatureConfig;", 0));
        H = new eqy<>(VideoFeatures.VIDEO_SUPERAPP_BOMBING_TRAPS, new u1(1, cos0.e, cos0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoGrowthBombingFeatureConfig;", 0));
        I = new eqy<>(VideoFeatures.VIDEO_MOVIES_SERIES_LISTING, new z1(1, oos0.k, oos0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoGrowthListingFeatureConfig;", 0));
        J = new eqy<>(VideoFeatures.VIDEO_BANNER_TRAP, new m1(1, b5s0.c, b5s0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoBannerTrapFeatureConfig;", 0));
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_ADS_TRIAL_SUSPEND;
        o0s0.a aVar2 = o0s0.c;
        K = new eqy<>(videoFeatures2, new i1(1, aVar2, o0s0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoAdsTrialSuspendConfig;", 0));
        L = new eqy<>(VideoFeatures.VIDEO_ADS_SUSPEND_COLD, new h1(1, aVar2, o0s0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoAdsTrialSuspendConfig;", 0));
        M = new eqy<>(VideoFeatures.VIDEO_ADS_SUSPEND_SAA_UNUSED, new j1(1, aVar2, o0s0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoAdsTrialSuspendConfig;", 0));
        N = new eqy<>(VideoFeatures.VIDEO_APP_STABILITY, new l1(1, x1s0.c, x1s0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoAppStabilityConfig;", 0));
        VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_NOTIFICATION_NEW_VIDEO;
        c.a aVar3 = com.vk.toggle.data.c.b;
        O = new eqy<>(videoFeatures3, new d2(1, aVar3, c.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoNotificationRedesignConfig;", 0));
        P = new eqy<>(VideoFeatures.VIDEO_NOTIFICATION_LIVE, new b2(1, aVar3, c.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoNotificationRedesignConfig;", 0));
        Q = new eqy<>(VideoFeatures.VIDEO_NOTIFICATION_CONTINUE, new o1(1, aVar3, c.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoNotificationRedesignConfig;", 0));
        R = new eqy<>(VideoFeatures.VIDEO_PUSH_NEW_VIDEO, new j2(1, aat0.d, aat0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoPushNewVideoConfig;", 0));
        S = new eqy<>(VideoFeatures.VIDEO_PUSH_NEW_LIVE, new i2(1, z9t0.c, z9t0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoPushNewLiveConfig;", 0));
        T = new eqy<>(VideoFeatures.VIDEO_AD_FREE_SUBSCRIPTION, new q1(1, VideoAdFreeSubscriptionFeatureConfig.k, VideoAdFreeSubscriptionFeatureConfig.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoAdFreeSubscriptionFeatureConfig;", 0));
        VideoFeatures videoFeatures4 = VideoFeatures.VK_VIDEO_BOTTOM_PROMO_FULLSCREEN;
        f0w0.a aVar4 = f0w0.l;
        U = new eqy<>(videoFeatures4, new p2(1, aVar4, f0w0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/vkvideopromo/VkVideoPromoFullscreenConfig;", 0));
        V = new eqy<>(VideoFeatures.VK_VIDEO_RIGHT_PROMO_FULLSCREEN, new r2(1, aVar4, f0w0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/vkvideopromo/VkVideoPromoFullscreenConfig;", 0));
        W = new eqy<>(VideoFeatures.VIDEO_PLAY_DELAY, new f2(1, VideoPlayDelayConfig.c, VideoPlayDelayConfig.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoPlayDelayConfig;", 0));
        X = new eqy<>(CoreFeatures.ADAPTIVE_FEED_MEDIA, new b(1, dk0.c, dk0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/AdaptiveFeedMediaConfig;", 0));
        Y = new eqy<>(CoreFeatures.SHARING_EXTERNAL_APP_MAX, new x0(1, pbj0.f, pbj0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/SharingExternalMsgConfig;", 0));
        Z = new eqy<>(VideoFeatures.VIDEO_MAX_INSTALL, new c2(1, tss0.d, tss0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoMaxInstallConfig;", 0));
        a0 = new eqy<>(CoreFeatures.NET_FALLBACK_IN_WINDOW, new k0(1, c260.d, c260.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/NetFallbackWindowConfig;", 0));
        b0 = new eqy<>(VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY, new r1(1, ans0.f, ans0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoFullscreenRedesignDiscoveryConfig;", 0));
        c0 = new eqy<>(VideoFeatures.NEW_FULLSCREEN_REDESIGN_VERTICAL, new t1(1, cns0.e, cns0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoFullscreenRedesignVerticalConfig;", 0));
        d0 = new eqy<>(VideoFeatures.NEW_FULLSCREEN_REDESIGN_HORIZONTAL, new s1(1, bns0.e, bns0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoFullscreenRedesignHorizontalConfig;", 0));
        new m2(1, ait0.e, ait0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoSplashScreenRedesignConfig;", 0);
        e0 = new eqy<>(VideoFeatures.VIDEO_IMAGE_SCALE_CONFIG, new a2(1, wps0.d, wps0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoImageScaleConfig;", 0));
        f0 = new eqy<>(VideoFeatures.CLIPS_AUTOPLAY_IN_CATALOG, new i(1, djd.c, djd.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/ClipsAutoplayConfig;", 0));
        g0 = new eqy<>(VideoFeatures.VIDEO_CLIPS_NEW_DISK_CACHE, new k(1, wqd.d, wqd.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/ClipsDiskCacheLoadConfig;", 0));
        h0 = new eqy<>(ClipsFeatures.CLIPS_CACHE_LOCATION_CONFIG, new j(1, ClipsCacheLocationConfig.c, ClipsCacheLocationConfig.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/ClipsCacheLocationConfig;", 0));
        i0 = new eqy<>(VideoFeatures.CLIPS_BUTTON_TO_LONG_VIDEO, new h(1, ClipButtonToLongVideoConfig.b, ClipButtonToLongVideoConfig.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/ClipButtonToLongVideoConfig;", 0));
        j0 = new eqy<>(NotificationFeatures.NOTIFICATION_DYNAMIC_PUSH_BANNER, new n0(1, ie70.b, ie70.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/NotificationResubscribeBannerScheduleConfig;", 0));
        k0 = new eqy<>(CoreFeatures.COMMON_WEBSOCKET, new l(1, qng.g, qng.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/CommonWebsocketConfig;", 0));
        l0 = new eqy<>(CoreFeatures.COMMON_WEBSOCKET_COMPRESSION, new s2(1, shx0.b, shx0.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/WebSocketCompressionConfig;", 0));
        m0 = new eqy<>(CoreFeatures.COMMON_WEBSOCKET_RATE_LIMIT, new t2(1, whx0.d, whx0.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/WebSocketRateLimitConfig;", 0));
        n0 = new eqy<>(CoreFeatures.THREAD_COUNT_REPORTER_CONFIG, new b1(1, pqo0.b, pqo0.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/ThreadCountReporterConfig;", 0));
        o0 = new eqy<>(ImFeatures.GRID_SHARING_ENABLED, new c0(1, b4w.c, b4w.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/ImGridSharingConfig;", 0));
        p0 = new eqy<>(CoreFeatures.DNS_OVER_HTTPS, new s(1, zrk.b, zrk.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/DOHConfig;", 0));
        new n(1, y4j.c, y4j.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/ConscryptThreadDedupConfig;", 0);
        q0 = new eqy<>(CoreFeatures.NET_BUCKET_PRIORITY, new e(1, BucketPriorityConfig.e, BucketPriorityConfig.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/BucketPriorityConfig;", 0));
        r0 = new eqy<>(CoreFeatures.QUEUE_BY_HOST, new e0(1, ggv.e, ggv.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/HostQueueConfig;", 0));
        s0 = new eqy<>(CoreFeatures.WHITELIST_TRACKER, new u2(1, hmx0.i, hmx0.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/WhitelistTrackerConfig;", 0));
        t0 = new eqy<>(CoreFeatures.STAT_TRIGGERS, new a1(1, usk0.f, usk0.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/StatTriggersConfig;", 0));
        u0 = new eqy<>(CoreFeatures.TRACK_EVENTS_BLOCKLIST, new d1(1, mfp0.e, mfp0.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/TrackEventsBlockListConfig;", 0));
        v0 = new eqy<>(CoreFeatures.DEV_NULL_SAMPLER, new q(1, m5m.d, m5m.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/DevNullSamplerConfig;", 0));
        w0 = new eqy<>(CoreFeatures.NET_STAT_CONFIG, new l0(1, j560.h, j560.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/NetworkStatConfigConfig;", 0));
        x0 = new eqy<>(CoreFeatures.THUMB_HASH, new c1(1, iso0.i, iso0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/ThumbHashConfig;", 0));
        y0 = new eqy<>(FeedFeatures.FEED_YANDEX_AD, new a0(1, m5r.b, m5r.a.class, "map", "map(Ljava/lang/String;)Lcom/vk/toggle/data/FeedYandexAdConfig;", 0));
        z0 = new eqy<>(CoreFeatures.NEW_DEEPLINK_ROUTER, new s0(1, ar90.b, ar90.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/PathfinderConfig;", 0));
        A0 = new eqy<>(CoreFeatures.LEGO_REDESIGN, new j0(1, a2z.c, a2z.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/LegoRedesignConfig;", 0));
        B0 = new eqy<>(CoreFeatures.CORE_NET_RATE_LIMITER, new u0(1, com.vk.toggle.data.b.e, b.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/RateLimiterConfig;", 0));
        C0 = new eqy<>(CoreFeatures.FAMILY_DAY_2026_PTR, new w(1, fkq.h, fkq.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/FamilyDay2026PtrConfig;", 0));
        D0 = new eqy<>(ClipsFeatures.VP_UV_OLD_STAT, new r0(1, aj80.b, aj80.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/OneLogNewDomainOldStatConfig;", 0));
        E0 = new eqy<>(ClipsFeatures.VP_UV_NEW_STAT, new q0(1, zi80.b, zi80.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/OneLogNewDomainNewStatConfig;", 0));
        F0 = new eqy<>(CoreFeatures.PERFORMANCE_CLASSES, new t0(1, fw90.g, fw90.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/PerformanceClassesThresholdsConfig;", 0));
        G0 = new eqy<>(VideoFeatures.VIDEO_MUSIC_PLAYER, new h2(1, d4t0.c, d4t0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoPlayerForMusicConfig;", 0));
        H0 = new eqy<>(BuildInfo.q() ? VideoFeatures.VIDEO_KBH_DETECT : CoreFeatures.KBH_DETECT, new f1(1, f6q0.l, f6q0.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/UnstableNetworkDetectorConfig;", 0));
        I0 = new eqy<>(VideoFeatures.VIDEO_ERROR_RESOLVER, new g2(1, c4t0.d, c4t0.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/VideoPlayerErrorProcessorConfig;", 0));
        J0 = new eqy<>(ComFeatures.COM_CONTENT_FOR_TAB_OPTIMIZE, new d0(1, upu.c, upu.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/GroupsGetContentForTabsConfig;", 0));
        K0 = new eqy<>(FeedFeatures.FEED_CLIP_BANNER_AD_PRELOAD, new v(1, tkp.b, tkp.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/EndOverlayBannerAdConfig;", 0));
        L0 = new eqy<>(VideoFeatures.VIDEO_STUCK_CONFIG, new n2(1, tit0.c, tit0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/VideoStuckConfig;", 0));
        M0 = new eqy<>(CoreFeatures.CRONET_EXECUTOR_CONFIG, new o(1, kek.c, kek.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/toggle/data/CronetExecutorConfig;", 0));
        N0 = new eqy<>(VideoFeatures.VIDEO_COMMUNITY_GROWTH_USERS, new x1(1, aVar, kos0.a.class, "fromMap", "fromMap(Ljava/lang/String;)Ljava/util/Map;", 0));
        O0 = new eqy<>(CoreFeatures.ONE_EVENT_TEST, new p0(1, oi80.d, oi80.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/OneEventConfig;", 0));
        P0 = new eqy<>(Features.Type.FEATURE_CORE_RUSTORE_PUSHES, new w0(krg0.c));
        Q0 = new bpn0(new y45(2));
    }

    public static d4t0 A() {
        d4t0 b3 = G0.b();
        if (b3 != null) {
            return b3;
        }
        d4t0.c.getClass();
        return d4t0.d;
    }

    public static z9t0 B() {
        z9t0 b3 = S.b();
        if (b3 != null) {
            return b3;
        }
        z9t0.c.getClass();
        return z9t0.d;
    }

    public static aat0 C() {
        aat0 b3 = R.b();
        if (b3 != null) {
            return b3;
        }
        aat0.d.getClass();
        return aat0.e;
    }

    public static final boolean D() {
        CoreFeatures coreFeatures = CoreFeatures.ADAPTIVE_FEED_MEDIA;
        coreFeatures.getClass();
        return com.vk.toggle.b.A.a(coreFeatures) && !Vendor.HUAWEI.a(false);
    }

    public static boolean E(String str) {
        b.d j3;
        JSONObject g3;
        JSONArray optJSONArray;
        SaFeatures saFeatures = SaFeatures.SA_APP_VIEW_PART_RECS;
        saFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        return bVar.a(saFeatures) && ((j3 = bVar.j(saFeatures.getKey(), false)) == null || (g3 = j3.g()) == null || (optJSONArray = g3.optJSONArray("entrypoints_exclude")) == null || !f370.O(optJSONArray).contains(str));
    }

    public static boolean F() {
        ComFeatures comFeatures = ComFeatures.COM_SECTIONS_REDESIGN;
        comFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(comFeatures)) {
            b.d j3 = bVar.j(comFeatures.getKey(), false);
            String d3 = j3 != null ? j3.d() : null;
            if (epx.f(d3, "B") || epx.f(d3, "C")) {
                return true;
            }
        }
        return false;
    }

    public static boolean G() {
        FeedFeatures feedFeatures = FeedFeatures.DZEN_CAROUSEL_MEDIASCOPE;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
            oto b3 = g.b();
            if (b3 == null) {
                b3 = new oto(false);
            }
            if (!b3.a) {
                return true;
            }
        }
        return false;
    }

    public static final boolean H() {
        return com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_FCM_ERROR_HANDLER);
    }

    public static boolean I() {
        return com.vk.toggle.b.A.a(MusicFeatures.AUDIO_TRACKS_FILTERS);
    }

    public static boolean J() {
        return ((Boolean) Q0.getValue()).booleanValue();
    }

    public static boolean K() {
        CatalogFeatures catalogFeatures = CatalogFeatures.AUDIO_OBJECT_SEARCH_HISTORY;
        catalogFeatures.getClass();
        return com.vk.toggle.b.A.a(catalogFeatures);
    }

    public static boolean L() {
        return !BuildInfo.h() && com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_TECH_TRACE_OTEL);
    }

    public static boolean M() {
        FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_PHOTO;
        feedFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(feedFeatures)) {
            return true;
        }
        FeedFeatures feedFeatures2 = FeedFeatures.FRIEND_LIKES_INLINE;
        feedFeatures2.getClass();
        if (bVar.a(feedFeatures2)) {
            return true;
        }
        FeedFeatures feedFeatures3 = FeedFeatures.FRIEND_COMMENTS_INLINE;
        feedFeatures3.getClass();
        if (bVar.a(feedFeatures3)) {
            return true;
        }
        FeedFeatures feedFeatures4 = FeedFeatures.FRIEND_COMMENTS_PHOTO;
        feedFeatures4.getClass();
        return bVar.a(feedFeatures4);
    }

    public static boolean N() {
        return p1p0.a(com.vk.toggle.b.A.i(SaFeatures.SHOW_HEADER_ON_RESUME));
    }

    public static boolean O() {
        CoreFeatures coreFeatures = CoreFeatures.SINGLE_PREF_FILE_SHUTDOWN;
        coreFeatures.getClass();
        return com.vk.toggle.b.A.a(coreFeatures);
    }

    public static boolean P() {
        JSONObject g3;
        b.d i3 = com.vk.toggle.b.A.i(StoriesFeatures.ST_STORY_FEED_NEW_DESIGN);
        if (i3 == null || (g3 = i3.g()) == null) {
            return false;
        }
        return g3.optBoolean("is_square");
    }

    public static boolean Q() {
        if (!M()) {
            return true;
        }
        FeedFeatures feedFeatures = FeedFeatures.FILTER_ACTIVITIES;
        feedFeatures.getClass();
        return com.vk.toggle.b.A.a(feedFeatures);
    }

    public static boolean R() {
        CoreFeatures coreFeatures = CoreFeatures.VK_BASE_ALERT_TO_VK_ALERT;
        coreFeatures.getClass();
        boolean a3 = com.vk.toggle.b.A.a(coreFeatures);
        L l3 = L.a;
        l3.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l3, L.LogType.d, new Object[]{"core_base_alert_to_alert", "Opening alert of type ".concat(a3 ? "VkAlertDialog" : "VkBaseAlertDialog")});
        }
        return a3;
    }

    public static boolean S() {
        CoreFeatures coreFeatures = CoreFeatures.LOCAL_CONTEXT_THEME_BIND;
        coreFeatures.getClass();
        return com.vk.toggle.b.A.a(coreFeatures);
    }

    public static boolean T(boolean z2) {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_MUSIC_PLAYER;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            return A().a || !z2;
        }
        return false;
    }

    public static boolean a(boolean z2) {
        return MusicFeatures.AUDIO_AUTO_DOWNLOAD.h() && MusicFeatures.AUDIO_PLAYER_VIDEO_BUFFERING.h() && T(z2) && z2;
    }

    public static int b() {
        JSONObject g3;
        b.d i3 = com.vk.toggle.b.A.i(SaFeatures.SA_APP_VIEW_PART_RECS);
        if (i3 == null || (g3 = i3.g()) == null) {
            return 50;
        }
        return g3.optInt("view_percentage", 50);
    }

    public static s75 c() {
        b.d i3 = com.vk.toggle.b.A.i(VideoFeatures.VIDEO_AUTHOR_CABINET);
        if (BuildInfo.q() && i3 != null && i3.a) {
            return s75.a.a(i3.c.toString());
        }
        return null;
    }

    public static BucketPriorityConfig d() {
        BucketPriorityConfig b3 = q0.b();
        if (b3 != null) {
            return b3;
        }
        BucketPriorityConfig.e.getClass();
        return BucketPriorityConfig.f;
    }

    public static final ubc e() {
        ubc b3 = n.b();
        if (b3 != null) {
            return b3;
        }
        ubc.c.getClass();
        return ubc.d;
    }

    public static iic f() {
        iic b3 = e.b();
        if (b3 != null) {
            return b3;
        }
        iic.d.getClass();
        return iic.e;
    }

    public static ClipsCacheLocationConfig g() {
        ClipsCacheLocationConfig b3 = h0.b();
        if (b3 != null) {
            return b3;
        }
        ClipsCacheLocationConfig.c.getClass();
        return ClipsCacheLocationConfig.d;
    }

    public static qng h() {
        qng b3 = k0.b();
        if (b3 != null) {
            return b3;
        }
        qng.g.getClass();
        return qng.h;
    }

    public static boolean i() {
        Features.Type type = Features.Type.FEATURE_SMB_AD_DISCLAIMER_REDESIGN;
        type.getClass();
        return com.vk.toggle.b.A.a(type);
    }

    public static jyq j() {
        jyq b3 = l.b();
        if (b3 != null) {
            return b3;
        }
        jyq.c.getClass();
        return jyq.d;
    }

    public static ggv k() {
        ggv b3 = r0.b();
        if (b3 != null) {
            return b3;
        }
        ggv.e.getClass();
        return ggv.f;
    }

    public static InAppUpdatesConfig l() {
        InAppUpdatesConfig b3 = b.b();
        if (b3 != null) {
            return b3;
        }
        InAppUpdatesConfig.k.getClass();
        return InAppUpdatesConfig.m;
    }

    public static dny m() {
        dny b3 = c.b();
        if (b3 != null) {
            return b3;
        }
        dny.d.getClass();
        return dny.e;
    }

    public static a2z n() {
        a2z b3 = A0.b();
        if (b3 != null) {
            return b3;
        }
        a2z.c.getClass();
        return a2z.d;
    }

    public static hn40 o() {
        MusicFeatures musicFeatures = MusicFeatures.AUDIO_LOUDNESS_NORMALIZATION;
        if (!musicFeatures.h()) {
            return hn40.a.a;
        }
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        bVar.getClass();
        b.d j3 = bVar.j(musicFeatures.getKey(), false);
        JSONObject g3 = j3 != null ? j3.g() : null;
        return new hn40.b((float) (g3 != null ? g3.optDouble("targetLufs", -14.0d) : -14.0d), g3 != null ? g3.optBoolean("isOnByDefault", true) : true, g3 != null ? g3.optBoolean("isAvailableForFreeUsers", true) : true);
    }

    public static c260 p() {
        c260 b3 = a0.b();
        if (b3 != null) {
            return b3;
        }
        c260.d.getClass();
        return c260.e;
    }

    public static oi80 q() {
        oi80 b3 = O0.b();
        if (b3 != null) {
            return b3;
        }
        oi80.d.getClass();
        return oi80.e;
    }

    public static pbj0 r() {
        pbj0 b3 = Y.b();
        return b3 == null ? new pbj0(0) : b3;
    }

    public static iso0 s() {
        iso0 b3 = x0.b();
        if (b3 != null) {
            return b3;
        }
        iso0.i.getClass();
        return iso0.j;
    }

    public static VideoAdFreeSubscriptionFeatureConfig t() {
        VideoAdFreeSubscriptionFeatureConfig b3 = T.b();
        if (b3 != null) {
            return b3;
        }
        VideoAdFreeSubscriptionFeatureConfig.k.getClass();
        return VideoAdFreeSubscriptionFeatureConfig.l;
    }

    public static ans0 u() {
        ans0 b3 = b0.b();
        if (b3 != null) {
            return b3;
        }
        ans0.f.getClass();
        return ans0.g;
    }

    public static bns0 v() {
        bns0 b3 = d0.b();
        if (b3 != null) {
            return b3;
        }
        bns0.e.getClass();
        return bns0.f;
    }

    public static cns0 w() {
        cns0 b3 = c0.b();
        if (b3 != null) {
            return b3;
        }
        cns0.e.getClass();
        return cns0.f;
    }

    public static oos0 x() {
        return I.b();
    }

    public static tss0 y() {
        tss0 b3 = Z.b();
        return b3 == null ? new tss0(0) : b3;
    }

    public static VideoPlayDelayConfig z() {
        VideoPlayDelayConfig b3 = W.b();
        if (b3 != null) {
            return b3;
        }
        VideoPlayDelayConfig.c.getClass();
        return BuildInfo.s() ? VideoPlayDelayConfig.e : BuildInfo.q() ? VideoPlayDelayConfig.f : VideoPlayDelayConfig.d;
    }
}
