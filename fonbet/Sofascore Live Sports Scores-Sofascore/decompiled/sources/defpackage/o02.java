package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.V2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.local_persistance.Brand;
import com.sofascore.local_persistance.BrandColors;
import com.sofascore.local_persistance.BrandingFantasyCompetition;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.IceHockeyPlayerEventStatistics;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import com.sofascore.model.profile.ContributionStatus;
import com.sofascore.results.service.FavoriteWorker;
import com.sofascore.results.service.WatchService;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class o02 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, a.o};
    public static final tc3 b = new tc3(480559806, new gd3(15), false);
    public static final tc3 c = new tc3(1997053603, new gd3(16), false);
    public static final tc3 d = new tc3(2048763831, new qd3(12), false);
    public static final ug5 e = new ug5();
    public static final ggf f = new ggf(new is8(1));
    public static final int[] g = {R.attr.stateListAnimator};
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    public static final void A(eci eciVar, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        eciVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1841156960);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(eciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            long j2 = eciVar.a;
            SuggestStatus suggestStatus = eciVar.b;
            boolean f2 = av8Var.f(j2);
            Object O = av8Var.O();
            if (f2 || O == nf3.a) {
                LocalTime localTime = Instant.ofEpochSecond(j2).atZone(ZoneId.systemDefault()).toLocalTime();
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                O = new Pair(fc6.i(j2, hk4.a(bi4Var.d())), String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localTime.getHour()), Integer.valueOf(localTime.getMinute())}, 2)));
                av8Var.n0(O);
            }
            Pair pair = (Pair) O;
            String str = (String) pair.a;
            String str2 = (String) pair.b;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.e(bkh.d(utcVar, 1.0f), 56.0f).z(xtcVar), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_calendar_empty, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_time, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            udj.c(str2, null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            nq8.h(av8Var, new goa(1.0f, true));
            kq9.b(s6a.N(j34.b(suggestStatus), 6, av8Var), null, bkh.l(utcVar, 24.0f), j34.f(suggestStatus, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lj(eciVar, xtcVar, i2, 17);
        }
    }

    public static final void B(int i2, of3 of3Var, xtc xtcVar, String str, String str2, Function0 function0, Function0 function02, boolean z) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-208124614);
        int i3 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? 16384 : 8192) | (av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            tz9.l(z, function0, xtcVar, false, null, oea.v(com.sofascore.results.R.string.crowdsourcing_submit_kick_off, av8Var), null, null, yqo.H(769401143, av8Var, new r52(str, str2, function0, function02, 1)), av8Var, (i3 & 14) | 100663344 | ((i3 >> 9) & 896), Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x64(z, str, str2, function0, function02, xtcVar, i2, 0);
        }
    }

    public static final void C(int i2, gv9 gv9Var, of3 of3Var, int i3) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1362768809);
        int i4 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.o(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc f0 = l98.f0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            String v = oea.v(i2, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, f0, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.p(utcVar, 80.0f));
            av8Var.d0(-11444267);
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                xtc d02 = l98.d0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                String v2 = oea.v(intValue, av8Var);
                yf8 yf8Var2 = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(v2, d02, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 130040);
                av8Var = av8Var2;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yk1(i2, i3, gv9Var);
        }
    }

    public static final void D(rl1 rl1Var, boolean z, of3 of3Var, int i2) {
        rl1 rl1Var2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-885537097);
        int i4 = i2 | (av8Var.g(rl1Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            av8Var.d0(-597619271);
            utc utcVar = utc.a;
            xtc o = bkh.o(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            if (z) {
                o = o.z(f5p.s(lz.D(com.sofascore.results.R.color.n_lv_4, av8Var)));
            }
            av8Var.s(false);
            xtc d0 = l98.d0(o, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc f0 = l98.f0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            String v = oea.v(rl1Var.a, av8Var);
            yf8 yf8Var = xth.a;
            float f2 = 0.0f;
            i3 = 2;
            udj.c(v, f0, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            rl1Var2 = rl1Var;
            ok3.f(l98.d0(bkh.m(utcVar, 80.0f, 6.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), rl1Var2.b, lz.D(rl1Var2.c, av8Var), 3.0f, 0L, 4.0f, av8Var, 199686, 16);
            float f3 = 4.0f;
            av8Var.d0(-1449440146);
            for (String str : rl1Var2.d) {
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                xtc d02 = l98.d0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f3, f2, 2);
                yf8 yf8Var2 = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(str, d02, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 130040);
                av8Var = av8Var2;
                f3 = f3;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            rl1Var2 = rl1Var;
            i3 = 2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m81(i2, i3, rl1Var2, z);
        }
    }

    public static final void E(int i2, int i3, Function2 function2, of3 of3Var, int i4) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1851623026);
        int i5 = (av8Var.e(i2) ? 4 : 2) | i4 | (av8Var.e(i3) ? 32 : 16) | (av8Var.i(function2) ? 256 : 128);
        int i6 = 0;
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            xtc r = bkh.r(bkh.d(utc.a, 1.0f), null, 3);
            boolean z = ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new w64(function2, i2, i3, i6);
                av8Var.n0(O);
            }
            td4.a((Function1) O, r, null, av8Var, 48, 4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vo(i2, i3, i4, 2, function2);
        }
    }

    public static final void F(int i2, int i3, of3 of3Var, Function0 function0, boolean z) {
        Function0 function02;
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(171562507);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            if (z) {
                j2 = ljg.f(av8Var, 1662817140, com.sofascore.results.R.color.n_lv_1, av8Var, false);
            } else {
                av8Var.d0(1662817814);
                av8Var.s(false);
                j2 = r13.h;
            }
            cdi a2 = wih.a(j2, null, null, av8Var, 0, 14);
            function02 = function0;
            kq9.b(s6a.N(i2, ((i4 << 3) & 112) | 6, av8Var), null, l98.b0(tol.y(n9e.q(bkh.l(utc.a, 24.0f), ((r13) a2.getValue()).a, o7g.a), false, false, false, 0L, null, function0, av8Var, 29), 4.0f), ((r13) wih.a(z ? ljg.f(av8Var, 1662820056, com.sofascore.results.R.color.surface_1, av8Var, false) : ljg.f(av8Var, 1662820660, com.sofascore.results.R.color.n_lv_1, av8Var, false), null, null, av8Var, 0, 14).getValue()).a, av8Var, 48, 0);
            av8Var = av8Var;
        } else {
            function02 = function0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xx0(i2, z, function02, i3);
        }
    }

    public static final void G(ul1 ul1Var, gv9 gv9Var, kl1 kl1Var, BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective, Function1 function1, Function1 function12, Function1 function13, Function0 function0, of3 of3Var, int i2) {
        int i3;
        BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective2;
        Function1 function14;
        kl1 kl1Var2;
        lv1 lv1Var;
        int i4;
        int i5;
        boolean z;
        gv9 gv9Var2 = gv9Var;
        Function1 function15 = function13;
        lv1 lv1Var2 = uxf.l;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(322160120);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(ul1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(gv9Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.e(kl1Var.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.e(baseballSeasonPitchesPerspective.ordinal()) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.i(function15) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var.i(function0) ? 8388608 : 4194304;
        }
        if (av8Var.T(i3 & 1, (4793491 & i3) != 4793490)) {
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            int i6 = i3;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a3 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(com.sofascore.results.R.string.tap_chart, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            r((i6 >> 21) & 14, av8Var, null, function0);
            av8Var.s(true);
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a4 = k8g.a(new ng0(4.0f, true, new l1(uxf.p, 5)), lv1Var2, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            boolean isEmpty = gv9Var.isEmpty();
            a99 a99Var = nf3.a;
            if (isEmpty) {
                gv9Var2 = gv9Var;
                kl1Var2 = kl1Var;
                baseballSeasonPitchesPerspective2 = baseballSeasonPitchesPerspective;
                lv1Var = lv1Var2;
                i4 = 16384;
                i5 = 57344;
                av8Var.d0(-839900261);
                av8Var.s(false);
            } else {
                av8Var.d0(-840601791);
                xtc e2 = bkh.e(utcVar, 282.0f);
                i5 = 57344;
                lv1Var = lv1Var2;
                u23 a5 = t23.a(new ng0(28.0f, false, new a70(7)), kv1Var, av8Var, 6);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, e2);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a5, f50Var);
                waa.K(av8Var, m4, ff3Var);
                bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                gv9Var2 = gv9Var;
                Iterator p = ljg.p(av8Var, C4, f50Var3, 1390417802, gv9Var2);
                while (p.hasNext()) {
                    kl1 kl1Var3 = (kl1) p.next();
                    av8Var.a0(-1667462554, kl1Var3);
                    int a0 = a0(kl1Var3, baseballSeasonPitchesPerspective);
                    boolean z2 = kl1Var3 == kl1Var;
                    boolean e3 = ((i6 & 57344) == 16384) | av8Var.e(kl1Var3.ordinal());
                    Object O = av8Var.O();
                    if (e3 || O == a99Var) {
                        O = new j4(21, function1, kl1Var3);
                        av8Var.n0(O);
                    }
                    F(a0, 0, av8Var, (Function0) O, z2);
                    av8Var.s(false);
                }
                kl1Var2 = kl1Var;
                baseballSeasonPitchesPerspective2 = baseballSeasonPitchesPerspective;
                i4 = 16384;
                ljg.t(av8Var, false, true, false);
            }
            tee teeVar = ul1Var.a;
            String str = ul1Var.d;
            boolean z3 = ((i6 & 896) == 256) | ((i6 & 112) == 32) | ((i6 & i5) == i4);
            Object O2 = av8Var.O();
            if (z3 || O2 == a99Var) {
                O2 = new mi(6, gv9Var2, function1, kl1Var2);
                av8Var.n0(O2);
            }
            fz8.g(teeVar, null, str, (Function0) O2, av8Var, 0);
            av8Var.s(true);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 8.0f, 2);
            l8g a6 = k8g.a(new ng0(16.0f, true, new a70(6)), lv1Var, av8Var, 6);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C5 = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, hf3.g);
            waa.K(av8Var, m5, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode5), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C5, hf3.d);
            nl1 nl1Var = ul1Var.b;
            boolean z4 = (458752 & i6) == 131072;
            Object O3 = av8Var.O();
            if (z4 || O3 == a99Var) {
                function14 = function12;
                O3 = new vi(10, function14);
                av8Var.n0(O3);
            } else {
                function14 = function12;
            }
            Function1 function16 = (Function1) O3;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            q(nl1Var, function16, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
            nl1 nl1Var2 = ul1Var.c;
            if (nl1Var2 == null) {
                av8Var.d0(-263204672);
                av8Var.s(false);
                function15 = function13;
                z = true;
            } else {
                av8Var.d0(-263204671);
                boolean z5 = (i6 & 3670016) == 1048576;
                Object O4 = av8Var.O();
                if (z5 || O4 == a99Var) {
                    function15 = function13;
                    O4 = new vi(11, function15);
                    av8Var.n0(O4);
                } else {
                    function15 = function13;
                }
                Function1 function17 = (Function1) O4;
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                z = true;
                q(nl1Var2, function17, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), av8Var, 0);
                av8Var.s(false);
            }
            av8Var.s(z);
            av8Var.s(z);
        } else {
            baseballSeasonPitchesPerspective2 = baseballSeasonPitchesPerspective;
            function14 = function12;
            kl1Var2 = kl1Var;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e41(ul1Var, gv9Var2, kl1Var2, baseballSeasonPitchesPerspective2, function1, function14, function15, function0, i2);
        }
    }

    public static final vu8 J(vu8 vu8Var) {
        if (vu8Var == null) {
            vu8Var = null;
        }
        if (vu8Var != null) {
            return vu8Var;
        }
        sf3.b("Inconsistent composition");
        pvd.x();
        return null;
    }

    public static final Integer K(int i2) {
        return new Integer(i2);
    }

    public static final Long L(long j2) {
        return new Long(j2);
    }

    public static final String P(double d2, boolean z) {
        double s = yid.s(d2, 1);
        return s == 0.0d ? "0" : (s == 100.0d && z) ? StatisticData.ERROR_CODE_NOT_FOUND : yid.c("%.1f", Double.valueOf(s));
    }

    public static void Q(int i2, nkk nkkVar) {
        nkkVar.B(7);
        byte[] bArr = nkkVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static Set T() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int U(ll1 ll1Var, boolean z) {
        int i2 = fl1.b[ll1Var.ordinal()];
        if (i2 == 1 && z) {
            return com.sofascore.results.R.string.baseball_pitching_pitch_types_chart_info;
        }
        if (i2 == 1) {
            return com.sofascore.results.R.string.baseball_batting_pitch_types_chart_info;
        }
        if (i2 == 2 && z) {
            return com.sofascore.results.R.string.baseball_pitching_pitch_outcomes_chart_info;
        }
        if (i2 == 2) {
            return com.sofascore.results.R.string.baseball_batting_pitch_outcomes_chart_info;
        }
        if (i2 == 3) {
            return com.sofascore.results.R.string.baseball_hit_spray_chart_info;
        }
        if (i2 == 4 && z) {
            return com.sofascore.results.R.string.baseball_pitching_pitch_zone_chart_info;
        }
        if (i2 == 4) {
            return com.sofascore.results.R.string.baseball_batting_pitch_zone_chart_info;
        }
        if (i2 == 5) {
            return com.sofascore.results.R.string.baseball_batting_average_chart_info;
        }
        if (i2 == 6) {
            return com.sofascore.results.R.string.baseball_batting_average_against_chart_info;
        }
        zzl.b();
        return 0;
    }

    public static final int V(ll1 ll1Var) {
        ll1Var.getClass();
        int ordinal = ll1Var.ordinal();
        if (ordinal == 0) {
            return com.sofascore.results.R.string.baseball_pitch_types;
        }
        if (ordinal == 1) {
            return com.sofascore.results.R.string.baseball_pitch_outcomes;
        }
        if (ordinal == 2) {
            return com.sofascore.results.R.string.baseball_hit_spray;
        }
        if (ordinal == 3) {
            return com.sofascore.results.R.string.baseball_pitch_zone_percentage;
        }
        if (ordinal == 4) {
            return com.sofascore.results.R.string.baseball_batting_average;
        }
        if (ordinal == 5) {
            return com.sofascore.results.R.string.baseball_batting_average_against;
        }
        zzl.b();
        return 0;
    }

    public static void Z(Context context) {
        Pair[] pairArr = {wv8.t(context, "ACTION", "HIDE_FINISHED")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l2 = hpoVar.l();
        vxd.h(context).b("FavoriteWorker-".concat(mha.o(l2)), nf6.a, (ltd) vxd.g(FavoriteWorker.class, l2).a());
    }

    public static final void a(gv9 gv9Var, oxh oxhVar, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        gv9Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1692109174);
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.g(oxhVar) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024) | 24576;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            cdi b2 = a60.b(z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f, null, "row_margin_radius_animation", av8Var, 3072, 22);
            lv1 lv1Var = uxf.m;
            float floatValue = ((Number) b2.getValue()).floatValue() * 8.0f;
            utc utcVar = utc.a;
            xtc q = n9e.q(d2a.E(bkh.d(l98.b0(utcVar, floatValue), 1.0f), 8.0f, o7g.a(((Number) b2.getValue()).floatValue() * 16.0f), false, 0L, 28), lz.D(com.sofascore.results.R.color.surface_1, av8Var), o7g.a(((Number) b2.getValue()).floatValue() * 16.0f));
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            r4a.j(gv9Var, oxhVar, function1, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896), 888);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(gv9Var, oxhVar, function1, z, xtcVar2, i2, 0);
        }
    }

    public static final int a0(kl1 kl1Var, BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective) {
        int i2 = fl1.a[kl1Var.ordinal()];
        if (i2 == 1) {
            return com.sofascore.results.R.drawable.ic_list_table;
        }
        if (i2 == 2) {
            return com.sofascore.results.R.drawable.ic_baseball_shotmap;
        }
        if (i2 == 3) {
            return com.sofascore.results.R.drawable.ic_baseball_field;
        }
        if (i2 == 4) {
            return com.sofascore.results.R.drawable.ic_graph_percent;
        }
        if (i2 == 5 && baseballSeasonPitchesPerspective == BaseballSeasonPitchesPerspective.Pitching) {
            return com.sofascore.results.R.drawable.ic_baseball_pitch;
        }
        if (i2 == 5) {
            return com.sofascore.results.R.drawable.ic_baseball_bat;
        }
        zzl.b();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(vl1 vl1Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, xtc xtcVar, of3 of3Var, int i2) {
        Function1 function16;
        a99 a99Var;
        boolean z;
        function1.getClass();
        function12.getClass();
        function13.getClass();
        function14.getClass();
        function15.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(14827925);
        int i3 = i2 | (av8Var.g(vl1Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function13) ? a.o : 1024) | (av8Var.i(function14) ? 16384 : 8192) | (av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            int i4 = 6;
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = new i91(i4);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 48);
            cdi b2 = a60.b(((Boolean) e1dVar.getValue()).booleanValue() ? -180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s02.h0(250, 0, null, 6), "expand_arrow_rotation_animation", av8Var, 3120, 20);
            av8Var = av8Var;
            if (vl1Var != null) {
                ll1 ll1Var = vl1Var.e;
                av8Var.d0(-642168386);
                xtc x = gz8.x(xtcVar, null, null, 3);
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, x);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, a2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                utc utcVar = utc.a;
                xtc d2 = bkh.d(utcVar, 1.0f);
                long D = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var);
                Object O2 = av8Var.O();
                if (O2 == a99Var2) {
                    O2 = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O2;
                Object[] objArr2 = new Object[0];
                Object O3 = av8Var.O();
                if (O3 == a99Var2) {
                    O3 = fi.k;
                    av8Var.n0(O3);
                }
                xtc c0 = l98.c0(tol.y(d2, true, true, true, D, wzcVar, new dk1((boh) o3a.N(objArr2, (Function0) O3, av8Var, 48), e1dVar, 1), av8Var, 0), 16.0f, 12.0f);
                l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, c0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                kq9.b(s6a.N(vl1Var.b, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 432, 0);
                goa goaVar = new goa(1.0f, true);
                String v = oea.v(vl1Var.c, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v, goaVar, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131064);
                av8Var = av8Var;
                xtc l2 = bkh.l(utcVar, 24.0f);
                boolean g2 = av8Var.g(b2);
                Object O4 = av8Var.O();
                if (g2) {
                    a99Var = a99Var2;
                } else {
                    a99Var = a99Var2;
                    if (O4 != a99Var) {
                        z = false;
                        kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_chevron_down, 6, av8Var), null, s02.M(l2, (Function1) O4), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 48, 0);
                        boolean z2 = true;
                        av8Var.s(true);
                        if (((Boolean) e1dVar.getValue()).booleanValue()) {
                            function16 = function1;
                            av8Var.d0(-1232872706);
                            av8Var.s(z);
                        } else {
                            av8Var.d0(-1235286738);
                            int i5 = i3 << 3;
                            function16 = function1;
                            d(vl1Var.d, ll1Var, function16, av8Var, i5 & 896);
                            int ordinal = vl1Var.g.ordinal();
                            if (ordinal == 3 || ordinal == 4 || vl1Var.f.isEmpty()) {
                                av8Var.d0(-1234682114);
                                av8Var.s(z);
                            } else {
                                av8Var.d0(-1235003088);
                                m(vl1Var.f, vl1Var.g, vl1Var.a, function12, av8Var, i5 & 7168);
                                av8Var = av8Var;
                                av8Var.s(z);
                            }
                            jl1 jl1Var = vl1Var.j;
                            boolean e2 = av8Var.e(ll1Var.ordinal());
                            Object O5 = av8Var.O();
                            if (e2 || O5 == a99Var) {
                                O5 = new u2(ll1Var, 18);
                                av8Var.n0(O5);
                            }
                            av8 av8Var2 = av8Var;
                            z2 = true;
                            l98.b(jl1Var, null, null, null, "chart_content", (Function1) O5, yqo.H(1000282758, av8Var, new dl1(function13, function14, function15, ll1Var, vl1Var, function12)), av8Var2, 1597440, 14);
                            av8Var = av8Var2;
                            av8Var.s(z);
                        }
                        av8Var.s(z2);
                        av8Var.s(z);
                    }
                }
                z = false;
                O4 = new cl1(b2, 0 == true ? 1 : 0);
                av8Var.n0(O4);
                kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_chevron_down, 6, av8Var), null, s02.M(l2, (Function1) O4), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 48, 0);
                boolean z22 = true;
                av8Var.s(true);
                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                }
                av8Var.s(z22);
                av8Var.s(z);
            } else {
                function16 = function1;
                av8Var.d0(-638309971);
                av8Var.s(false);
            }
        } else {
            function16 = function1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new el1((Object) vl1Var, (dt8) function16, (dt8) function12, (dt8) function13, (dt8) function14, (dt8) function15, xtcVar, i2, 0);
        }
    }

    public static final void c(BrandingFantasyCompetition brandingFantasyCompetition, float f2, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(36932290);
        int i3 = 2;
        int i4 = (av8Var.i(brandingFantasyCompetition) ? 4 : 2) | i2 | (av8Var.d(f2) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Brand brand = brandingFantasyCompetition.getBrand();
            String j2 = vxd.j(brand != null ? brand.getId() : 0, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "branding/provider/", "/powered-by-image");
            int b2 = wzb.b((float) Math.ceil(f2 / 88.0f));
            for (int i5 = 0; i5 < b2; i5++) {
                utc utcVar = utc.a;
                td4.h(48, av8Var, bkh.h(utcVar, 24.0f), j2);
                nq8.h(av8Var, bkh.p(utcVar, 24.0f));
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t81(brandingFantasyCompetition, f2, i2, i3);
        }
    }

    public static gv9 c0(Context context, LineupsResponse lineupsResponse, int i2, int i3) {
        int i4;
        Pair pair;
        Integer shotsAgainst;
        context.getClass();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = null;
        List<PlayerData> players = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null).getPlayers();
        ArrayList w0 = CollectionsKt.w0(LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null).getPlayers(), players);
        ArrayList arrayList = new ArrayList();
        Iterator it = w0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            IntRange intRange = new IntRange(1, 3, 1);
            Integer gameStar = ((PlayerData) next).getGameStar();
            if (gameStar != null && intRange.d(gameStar.intValue())) {
                arrayList.add(next);
            }
        }
        List<PlayerData> H0 = CollectionsKt.H0(arrayList, new y73(22));
        if (H0.size() != 3) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
        for (PlayerData playerData : H0) {
            if (!players.isEmpty()) {
                Iterator<T> it2 = players.iterator();
                while (it2.hasNext()) {
                    if (((PlayerData) it2.next()).getPlayer().getId() == playerData.getPlayer().getId()) {
                        i4 = i2;
                        break;
                    }
                }
            }
            i4 = i3;
            PlayerEventStatistics statistics = playerData.getStatistics();
            IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = statistics instanceof IceHockeyPlayerEventStatistics ? (IceHockeyPlayerEventStatistics) statistics : iceHockeyPlayerEventStatistics;
            if (Intrinsics.c(playerData.getPosition(), "G")) {
                String string = context.getString(com.sofascore.results.R.string.hockey_goals_against_average_short);
                string.getClass();
                String str = "-";
                if (iceHockeyPlayerEventStatistics2 != null && (shotsAgainst = iceHockeyPlayerEventStatistics2.getShotsAgainst()) != null) {
                    int intValue = shotsAgainst.intValue();
                    Integer saves = iceHockeyPlayerEventStatistics2.getSaves();
                    if (saves != null) {
                        int intValue2 = saves.intValue();
                        Integer secondsPlayed = iceHockeyPlayerEventStatistics2.getSecondsPlayed();
                        if (secondsPlayed != null) {
                            if (secondsPlayed.intValue() <= 0) {
                                secondsPlayed = iceHockeyPlayerEventStatistics;
                            }
                            if (secondsPlayed != null) {
                                int intValue3 = secondsPlayed.intValue();
                                wd5 wd5Var = xd5.b;
                                str = rei.b(2, Double.valueOf((xd5.k(wkn.R(1, be5.HOURS), be5.SECONDS) * (intValue - intValue2)) / intValue3));
                            }
                        }
                    }
                }
                le9 le9Var = new le9(string, str);
                String string2 = context.getString(com.sofascore.results.R.string.ice_hockey_lineups_save_percentage);
                string2.getClass();
                pair = new Pair(le9Var, new le9(string2, rei.a(iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getSavePercentage() : null, true)));
            } else {
                String string3 = context.getString(com.sofascore.results.R.string.ice_hockey_lineups_goals);
                string3.getClass();
                le9 le9Var2 = new le9(string3, String.valueOf(yid.m(iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getGoals() : null)));
                String string4 = context.getString(com.sofascore.results.R.string.ice_hockey_lineups_assists);
                string4.getClass();
                pair = new Pair(le9Var2, new le9(string4, String.valueOf(yid.m(iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getAssists() : null))));
            }
            le9 le9Var3 = (le9) pair.a;
            le9 le9Var4 = (le9) pair.b;
            String C = tba.C(playerData.getPlayer());
            String str2 = C == null ? "" : C;
            int id = playerData.getPlayer().getId();
            String position = playerData.getPosition();
            arrayList2.add(new ke9(str2, id, i4, position == null ? "" : position, yid.m(playerData.getGameStar()), le9Var3, le9Var4));
            iceHockeyPlayerEventStatistics = null;
        }
        return l6g.W(arrayList2);
    }

    public static final void d(gv9 gv9Var, ll1 ll1Var, Function1 function1, of3 of3Var, int i2) {
        int i3;
        Function1 function12;
        av8 av8Var;
        Object obj;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-395380826);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.e(ll1Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function12 = function1;
            i3 |= av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            function12 = function1;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            Resources resources = (Resources) av8Var2.k(nz.c);
            boolean e2 = av8Var2.e(gv9Var.size());
            Object O = av8Var2.O();
            if (e2 || O == nf3.a) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    ll1 ll1Var2 = (ll1) it.next();
                    String string = resources.getString(V(ll1Var2));
                    string.getClass();
                    arrayList.add(new vt2(ll1Var2, string, false, null, null, null, null, 252));
                }
                O = l6g.W(arrayList);
                av8Var2.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            Iterator<E> it2 = gv9Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((vt2) obj).a == ll1Var) {
                        break;
                    }
                }
            }
            vt2 vt2Var = (vt2) obj;
            av8Var = av8Var2;
            trh.a(gv9Var2, vt2Var != null ? (ll1) vt2Var.a : null, function12, null, null, null, null, false, false, false, null, null, av8Var, i3 & 896, 4088);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(gv9Var, ll1Var, function1, i2, 5);
        }
    }

    public static final void e(ml1 ml1Var, boolean z, final boolean z2, Function1 function1, of3 of3Var, int i2) {
        int i3;
        r13 r13Var;
        long j2;
        long f2;
        long j3;
        boolean z3;
        boolean z4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-863834388);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(ml1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function1) ? 2048 : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Integer num = ml1Var.d;
            if (num == null) {
                av8Var.d0(953964060);
                av8Var.s(false);
                r13Var = null;
            } else {
                r13Var = new r13(wv8.b(av8Var, 953964061, num, av8Var, false));
            }
            if (r13Var == null) {
                j2 = ljg.f(av8Var, -1216152033, com.sofascore.results.R.color.neutral_default, av8Var, false);
            } else {
                av8Var.d0(-1216153707);
                av8Var.s(false);
                j2 = r13Var.a;
            }
            if (z) {
                av8Var.d0(-1216149455);
                av8Var.s(false);
                f2 = j2;
            } else {
                f2 = ljg.f(av8Var, -1216149095, com.sofascore.results.R.color.surface_2, av8Var, false);
            }
            final long j4 = j2;
            cdi a2 = wih.a(f2, null, null, av8Var, 0, 14);
            long D = lz.D(com.sofascore.results.R.color.surface_1, av8Var);
            n7g a3 = o7g.a(12.0f);
            av8Var.d0(-1216139282);
            utc utcVar = utc.a;
            xtc A = wnn.A(n9e.q(gz8.x(utcVar, null, null, 3), ((r13) a2.getValue()).a, a3), a3);
            a99 a99Var = nf3.a;
            if (z2) {
                boolean z5 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
                Object O = av8Var.O();
                if (z5 || O == a99Var) {
                    O = new j4(20, function1, ml1Var);
                    av8Var.n0(O);
                }
                j3 = D;
                xtc y = tol.y(utcVar, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                av8Var = av8Var;
                A = A.z(y);
            } else {
                j3 = D;
            }
            av8Var.s(false);
            xtc c0 = l98.c0(A, 8.0f, 6.0f);
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z) {
                z3 = false;
                z4 = true;
                av8Var.d0(-675386350);
                av8Var.s(false);
            } else {
                av8Var.d0(-675751530);
                xtc l2 = bkh.l(utcVar, 10.0f);
                boolean f3 = ((i3 & 896) == 256) | av8Var.f(j3) | av8Var.f(j4);
                Object O2 = av8Var.O();
                if (f3 || O2 == a99Var) {
                    final long j5 = j3;
                    z3 = false;
                    z4 = true;
                    Function1 function12 = new Function1() { // from class: xk1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ha5 ha5Var = (ha5) obj;
                            ha5Var.getClass();
                            ha5.U(ha5Var, j5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                            ha5.U(ha5Var, j4, ha5Var.H0(4.0f), 0L, z2 ? 1.0f : 0.1f, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                            return Unit.a;
                        }
                    };
                    av8Var.n0(function12);
                    O2 = function12;
                } else {
                    z3 = false;
                    z4 = true;
                }
                lz.d(6, av8Var, l2, (Function1) O2);
                av8Var.s(z3);
            }
            String v = oea.v(z ? ml1Var.b : ml1Var.c, av8Var);
            yf8 yf8Var = xth.a;
            av8 av8Var2 = av8Var;
            udj.c(v, null, z ? ljg.f(av8Var, 532411613, com.sofascore.results.R.color.surface_1, av8Var, z3) : z2 ? ljg.f(av8Var, 532412921, com.sofascore.results.R.color.n_lv_1, av8Var, z3) : ljg.f(av8Var, 532414009, com.sofascore.results.R.color.n_lv_3, av8Var, z3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, z ? xth.k() : xth.b(), av8Var2, 0, 24960, 110586);
            av8Var = av8Var2;
            av8Var.s(z4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bl1(ml1Var, z, z2, function1, i2, 0);
        }
    }

    public static final void f(tbj tbjVar, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        xtc S;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1533506138);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(tbjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(tc3Var) ? 32 : 16;
        }
        int i5 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            av8Var.d0(-885604480);
            if (tbjVar.i()) {
                rq3 rq3Var = null;
                S = u6h.S(fkf.M(new nbj(tbjVar, rq3Var, i5)), tbjVar.x, new r3(tbjVar, rq3Var, 24), new obj(tbjVar, rq3Var, i5), new kt3(tbjVar, i4));
            } else {
                S = utc.a;
            }
            tz9.i(S, tc3Var, av8Var, i3 & 112);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v43(tbjVar, tc3Var, i2, i5);
        }
    }

    public static final void g(lcj lcjVar, boolean z, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1442752422);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(lcjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            av8Var.d0(-1299459355);
            if (z) {
                av8Var.d0(-1299415211);
                boolean i5 = av8Var.i(lcjVar);
                Object O = av8Var.O();
                if (i5 || O == nf3.a) {
                    O = new w43(lcjVar, null, i4);
                    av8Var.n0(O);
                }
                xtcVar = fkf.M((Function2) O);
                av8Var.s(false);
            } else {
                av8Var.d0(-1298836224);
                av8Var.s(false);
                xtcVar = utc.a;
            }
            tz9.i(xtcVar, tc3Var, av8Var, (i3 >> 3) & 112);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u43(lcjVar, z, tc3Var, i2, 0);
        }
    }

    public static final void h(ContributionStatus contributionStatus, xtc xtcVar, of3 of3Var, int i2) {
        Pair pair;
        contributionStatus.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-27978532);
        int i3 = (av8Var.e(contributionStatus.ordinal()) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            int i4 = vr3.a[contributionStatus.ordinal()];
            if (i4 == 1) {
                av8Var.d0(-284585763);
                pair = new Pair(oea.v(com.sofascore.results.R.string.suggestion_approved, av8Var), new r13(lz.D(com.sofascore.results.R.color.success, av8Var)));
                av8Var.s(false);
            } else if (i4 != 2) {
                av8Var.d0(-284320930);
                pair = new Pair(oea.v(com.sofascore.results.R.string.suggestion_unresolved, av8Var), new r13(lz.D(com.sofascore.results.R.color.n_lv_3, av8Var)));
                av8Var.s(false);
            } else {
                av8Var.d0(-284440993);
                pair = new Pair(oea.v(com.sofascore.results.R.string.suggestion_declined, av8Var), new r13(lz.D(com.sofascore.results.R.color.error, av8Var)));
                av8Var.s(false);
            }
            String str = (String) pair.a;
            long j2 = ((r13) pair.b).a;
            xtc d2 = bkh.d(l98.c0(n9e.q(xtcVar, lz.D(com.sofascore.results.R.color.surface_1, av8Var), oyn.e), 16.0f, 4.0f), 1.0f);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_timeline_dot, 6, av8Var), null, bkh.l(utc.a, 16.0f), j2, av8Var, 432, 0);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(contributionStatus, xtcVar, i2, 23);
        }
    }

    public static final xtc h0(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new rqd(function1));
    }

    public static final void i(fci fciVar, Function1 function1, Function1 function12, Function0 function0, of3 of3Var, int i2) {
        fciVar.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1294680021);
        int i3 = i2 | (av8Var.g(fciVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? a.o : 1024);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = new q73(18);
                av8Var.n0(O);
            }
            l98.b(fciVar, null, null, null, "TimeSuggestAnimationContent", (Function1) O, yqo.H(-690849808, av8Var, new c61(i4, function1, function12, function0)), av8Var, (i3 & 14) | 1794048, 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 10, fciVar, function1, function12, function0);
        }
    }

    public static final void j(long j2, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1936335126);
        int i3 = i2 | (av8Var.f(j2) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            Locale locale = ((Configuration) av8Var.k(nz.a)).getLocales().get(0);
            boolean z = (i3 & 14) == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = Long.valueOf(vxd.o(Instant.ofEpochSecond(j2)).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli());
                av8Var.n0(O);
            }
            long longValue = ((Number) O).longValue();
            boolean g2 = av8Var.g(context) | av8Var.g(locale);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                int p = ug5.p(context);
                O2 = new Locale.Builder().setLocale(locale).setRegion(p != 1 ? p != 7 ? "GB" : "DZ" : "US").build();
                av8Var.n0(O2);
            }
            Locale locale2 = (Locale) O2;
            boolean f2 = av8Var.f(longValue) | av8Var.g(locale2);
            Object O3 = av8Var.O();
            if (f2 || O3 == a99Var) {
                locale2.getClass();
                Long valueOf = Long.valueOf(longValue);
                t3e t3eVar = oj4.a;
                IntRange intRange = fi4.a;
                qj4 qj4Var = new qj4(valueOf, intRange, fi4.b, locale2);
                eg2 a2 = qj4Var.c.a(longValue);
                if (!intRange.d(a2.a)) {
                    a2 = null;
                }
                qj4Var.f = e.f(a2);
                qj4Var.g = e.f(new f55(0));
                av8Var.n0(qj4Var);
                O3 = qj4Var;
            }
            qj4 qj4Var2 = (qj4) O3;
            boolean g3 = av8Var.g(qj4Var2) | av8Var.f(longValue) | ((i3 & 112) == 32);
            Object O4 = av8Var.O();
            if (g3 || O4 == a99Var) {
                a74 a74Var = new a74(qj4Var2, longValue, function1, (rq3) null, 0);
                av8Var.n0(a74Var);
                O4 = a74Var;
            }
            hz8.o(av8Var, qj4Var2, (Function2) O4);
            IntRange intRange2 = fi4.a;
            long D = lz.D(com.sofascore.results.R.color.surface_1, av8Var);
            long D2 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            long D3 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            long D4 = lz.D(com.sofascore.results.R.color.n_lv_3, av8Var);
            long D5 = lz.D(com.sofascore.results.R.color.crowdsourcing, av8Var);
            long D6 = lz.D(com.sofascore.results.R.color.surface_1, av8Var);
            long D7 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            long D8 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            long D9 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            long D10 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            long D11 = lz.D(com.sofascore.results.R.color.crowdsourcing, av8Var);
            long D12 = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            long j3 = r13.i;
            g23 g23Var = (g23) av8Var.k(i23.a);
            ci4 ci4Var = g23Var.b0;
            if (ci4Var == null) {
                av8Var.d0(642416503);
                long c2 = i23.c(g23Var, pj4.a);
                long c3 = i23.c(g23Var, pj4.p);
                long c4 = i23.c(g23Var, pj4.n);
                long c5 = i23.c(g23Var, pj4.u);
                long c6 = i23.c(g23Var, pj4.t);
                long j4 = g23Var.s;
                h23 h23Var = pj4.C;
                long c7 = i23.c(g23Var, h23Var);
                long c8 = r13.c(i23.c(g23Var, h23Var), 0.38f);
                h23 h23Var2 = pj4.k;
                long c9 = i23.c(g23Var, h23Var2);
                h23 h23Var3 = pj4.A;
                long c10 = i23.c(g23Var, h23Var3);
                long c11 = r13.c(i23.c(g23Var, h23Var3), 0.38f);
                h23 h23Var4 = pj4.z;
                long c12 = i23.c(g23Var, h23Var4);
                long c13 = r13.c(i23.c(g23Var, h23Var4), 0.38f);
                h23 h23Var5 = pj4.l;
                long c14 = i23.c(g23Var, h23Var5);
                long c15 = r13.c(i23.c(g23Var, h23Var5), 0.38f);
                h23 h23Var6 = pj4.h;
                long c16 = i23.c(g23Var, h23Var6);
                long c17 = r13.c(i23.c(g23Var, h23Var6), 0.38f);
                h23 h23Var7 = pj4.g;
                av8Var = av8Var;
                ci4Var = new ci4(c2, c3, c4, c5, c6, j4, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, i23.c(g23Var, h23Var7), r13.c(i23.c(g23Var, h23Var7), 0.38f), i23.c(g23Var, h23Var2), i23.c(g23Var, pj4.i), i23.c(g23Var, pj4.r), i23.c(g23Var, pj4.s), i23.c(g23Var, n65.a), a99.w(g23Var, av8Var));
                g23Var.b0 = ci4Var;
                av8Var.s(false);
            } else {
                av8Var.d0(642290457);
                av8Var.s(false);
            }
            if (D == 16) {
                D = ci4Var.a;
            }
            long j5 = D;
            long j6 = j3 != 16 ? j3 : ci4Var.b;
            if (D2 == 16) {
                D2 = ci4Var.c;
            }
            long j7 = D2;
            long j8 = D7 != 16 ? D7 : ci4Var.d;
            long j9 = j3 != 16 ? j3 : ci4Var.e;
            long j10 = D8 != 16 ? D8 : ci4Var.f;
            long j11 = D9 != 16 ? D9 : ci4Var.g;
            long j12 = D10 != 16 ? D10 : ci4Var.h;
            long j13 = j3 != 16 ? j3 : ci4Var.i;
            long j14 = D12 != 16 ? D12 : ci4Var.j;
            long j15 = j3 != 16 ? j3 : ci4Var.k;
            long j16 = D11 != 16 ? D11 : ci4Var.l;
            long j17 = j3 != 16 ? j3 : ci4Var.m;
            if (D3 == 16) {
                D3 = ci4Var.n;
            }
            oj4.b(qj4Var2, null, null, new ci4(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, D3, D4 != 16 ? D4 : ci4Var.o, D6 != 16 ? D6 : ci4Var.p, j3 != 16 ? j3 : ci4Var.q, D5 != 16 ? D5 : ci4Var.r, j3 != 16 ? j3 : ci4Var.s, j3 != 16 ? j3 : ci4Var.t, j3 != 16 ? j3 : ci4Var.u, j3 != 16 ? j3 : ci4Var.v, j3 != 16 ? j3 : ci4Var.w, j3 != 16 ? j3 : ci4Var.x, ci4Var.y), null, null, false, null, av8Var, 1794048);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v64(j2, function1, i2, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k9 j0(nm2 nm2Var) {
        int i2;
        int i3;
        int i4 = nm2Var.i(16);
        int i5 = nm2Var.i(16);
        if (i5 == 65535) {
            i5 = nm2Var.i(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i6 = i5 + i2;
        if (i4 == 44097) {
            i6 += 2;
        }
        if (nm2Var.i(2) == 3) {
            do {
                nm2Var.i(2);
            } while (nm2Var.h());
        }
        int i7 = nm2Var.i(10);
        if (nm2Var.h() && nm2Var.i(3) > 0) {
            nm2Var.t(2);
        }
        int i8 = nm2Var.h() ? 48000 : 44100;
        int i9 = nm2Var.i(4);
        int[] iArr = a;
        if (i8 == 44100 && i9 == 13) {
            i3 = iArr[i9];
        } else if (i8 != 48000 || i9 >= 14) {
            i3 = 0;
        } else {
            int i10 = iArr[i9];
            int i11 = i7 % 5;
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i9 != 8) {
                    }
                    i3 = i10 + 1;
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (i9 != 3) {
                            if (i9 != 8) {
                            }
                        }
                        i3 = i10 + 1;
                    }
                    i3 = i10;
                }
            }
            if (i9 != 3) {
            }
            i3 = i10 + 1;
        }
        return new k9(i8, i6, i3);
    }

    public static final void k(long j2, long j3, int i2, Function1 function1, Function0 function0, of3 of3Var, int i3) {
        e1d e1dVar;
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-151773574);
        int i4 = i3 | (av8Var.f(j2) ? 4 : 2) | (av8Var.f(j3) ? 32 : 16) | (av8Var.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192);
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(aij.a);
                av8Var.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = e.f(Boolean.FALSE);
                av8Var.n0(O2);
            }
            e1d e1dVar3 = (e1d) O2;
            boolean z = (i4 & 14) == 4;
            Object O3 = av8Var.O();
            if (z || O3 == a99Var) {
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                Pair pair = new Pair(fc6.i(j2, hk4.a(bi4Var.d())), Instant.ofEpochSecond(j2).atZone(ZoneId.systemDefault()).toLocalTime());
                av8Var.n0(pair);
                O3 = pair;
            }
            Pair pair2 = (Pair) O3;
            String str = (String) pair2.a;
            LocalTime localTime = (LocalTime) pair2.b;
            String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localTime.getHour()), Integer.valueOf(localTime.getMinute())}, 2));
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String g2 = bf3.g(16.0f, com.sofascore.results.R.string.crowdsourcing_suggest_kick_off, av8Var, av8Var, utcVar);
            long D = lz.D(com.sofascore.results.R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(g2, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 130040);
            String g3 = bf3.g(8.0f, com.sofascore.results.R.string.date, av8Var, av8Var, utcVar);
            aij aijVar = (aij) e1dVar2.getValue();
            aij aijVar2 = aij.b;
            boolean z2 = aijVar == aijVar2;
            Object O4 = av8Var.O();
            if (O4 == a99Var) {
                O4 = new v30(11, e1dVar2);
                av8Var.n0(O4);
            }
            v(g3, str, com.sofascore.results.R.drawable.ic_calendar_empty, z2, (Function0) O4, av8Var, 24576);
            nq8.h(av8Var, bkh.e(utcVar, 12.0f));
            boolean z3 = ((aij) e1dVar2.getValue()) == aijVar2;
            tc3 H = yqo.H(-1384647572, av8Var, new y64(j2, function1, e1dVar2));
            x23 x23Var = x23.a;
            fz8.b(x23Var, z3, null, null, null, null, H, av8Var, 1572870, 30);
            String g4 = bf3.g(8.0f, com.sofascore.results.R.string.match_start, av8Var, av8Var, utcVar);
            aij aijVar3 = (aij) e1dVar2.getValue();
            aij aijVar4 = aij.c;
            boolean z4 = aijVar3 == aijVar4;
            Object O5 = av8Var.O();
            if (O5 == a99Var) {
                O5 = new v30(12, e1dVar2);
                av8Var.n0(O5);
            }
            v(g4, format, com.sofascore.results.R.drawable.ic_time, z4, (Function0) O5, av8Var, 24576);
            fz8.b(x23Var, ((aij) e1dVar2.getValue()) == aijVar4, null, null, null, null, yqo.H(558531925, av8Var, new y64(localTime, function1, j2)), av8Var, 1572870, 30);
            String g5 = bf3.g(16.0f, com.sofascore.results.R.string.confirm, av8Var, av8Var, utcVar);
            boolean z5 = j2 != j3;
            xtc d3 = bkh.d(utcVar, 1.0f);
            Object O6 = av8Var.O();
            if (O6 == a99Var) {
                e1dVar = e1dVar3;
                O6 = new v30(13, e1dVar);
                av8Var.n0(O6);
            } else {
                e1dVar = e1dVar3;
            }
            mha.h(g5, (Function0) O6, d3, iqh.a, null, z5, false, false, 0L, 0, 0, av8Var, V2.b.f, 0, 2000);
            av8Var = av8Var;
            av8Var.s(true);
            ff5 ff5Var = qgb.a;
            Object k2 = av8Var.k(ngb.a);
            k2.getClass();
            tol.b(ff5Var.a(new uv((ComponentActivity) k2)), yqo.H(-2128883270, av8Var, new bk1(str, format, function0, i2, e1dVar)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new u64(j2, j3, i2, function1, function0, i3);
        }
    }

    public static void k0(WatchService watchService) {
        Pair[] pairArr = {new Pair("ACTION", "REFRESH_WEAR_FAVORITES")};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l2 = hpoVar.l();
        ktd g2 = vxd.g(FavoriteWorker.class, l2);
        Context applicationContext = watchService.getApplicationContext();
        applicationContext.getClass();
        xbl d2 = xbl.d(applicationContext);
        d2.getClass();
        d2.b("FavoriteWorker-".concat(mha.o(l2)), nf6.a, (ltd) g2.a());
    }

    public static final void l(float f2, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1725655966);
        int i3 = (av8Var.d(f2) ? 4 : 2) | i2;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            int b2 = wzb.b((float) Math.ceil(f2 / 103.0f));
            ImageVector N = s6a.N(com.sofascore.results.R.drawable.ic_sofascore_logo_watermark, 6, av8Var);
            for (int i5 = 0; i5 < b2; i5++) {
                long D = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
                utc utcVar = utc.a;
                kq9.b(N, null, bkh.p(bkh.e(utcVar, 12.0f), 79.0f), D, av8Var, 432, 0);
                nq8.h(av8Var, bkh.p(utcVar, 24.0f));
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ty6(f2, i2, i4);
        }
    }

    public static void l0(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(com.sofascore.results.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.sofascore.results.R.attr.state_liftable, -2130970176}, ObjectAnimator.ofFloat(appBarLayout, "elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static final void m(gv9 gv9Var, kl1 kl1Var, BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective, Function1 function1, of3 of3Var, int i2) {
        int i3;
        Function1 function12;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(441044901);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.e(kl1Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.e(baseballSeasonPitchesPerspective.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function12 = function1;
            i3 |= av8Var.i(function12) ? a.o : 1024;
        } else {
            function12 = function1;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    kl1 kl1Var2 = (kl1) it.next();
                    arrayList.add(new r1h(kl1Var2, new tc3(-130119419, new aj(i4, kl1Var2, baseballSeasonPitchesPerspective), true)));
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            xtc f0 = l98.f0(bkh.d(utc.a, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            goa g2 = ljg.g(av8Var, C, hf3.d, 1.0f, true);
            String v = oea.v(com.sofascore.results.R.string.change_view, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, g2, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            l4a.a(gv9Var2, kl1Var, function12, null, null, true, av8Var, (i3 & 112) | 196608 | ((i3 >> 3) & 896), 24);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(gv9Var, kl1Var, baseballSeasonPitchesPerspective, function1, i2, 2);
        }
    }

    public static final void n(int i2, int i3, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1193104810);
        int i4 = (av8Var.e(i2) ? 4 : 2) | i3 | 48;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
            u23 a2 = t23.a(new ng0(16.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            wkn.l(s6a.N(com.sofascore.results.R.drawable.no_data, 6, av8Var), bkh.l(utcVar, 96.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 432, 120);
            String v = oea.v(i2, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz(i2, xtcVar2, i3, 2);
        }
    }

    public static final void o(ev6 ev6Var, xtc xtcVar, of3 of3Var, int i2) {
        long j2;
        Brand brand;
        BrandColors color;
        String E;
        ev6Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(970023587);
        int i3 = (av8Var.g(ev6Var) ? 4 : 2) | i2 | 48;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            BrandingFantasyCompetition brandingFantasyCompetition = ev6Var.D;
            r13 r13Var = (brandingFantasyCompetition == null || (brand = brandingFantasyCompetition.getBrand()) == null || (color = brand.getColor()) == null || (E = tz9.E(color, context)) == null) ? null : new r13(hkg.b(Color.parseColor(E)));
            if (r13Var == null) {
                j2 = ljg.f(av8Var, 184778038, com.sofascore.results.R.color.primary_default, av8Var, false);
            } else {
                av8Var.d0(184775279);
                av8Var.s(false);
                j2 = r13Var.a;
            }
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 0.95555556f);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new yt6(6);
                av8Var.n0(O);
            }
            xtc M = s02.M(d2, (Function1) O);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new yt6(7);
                av8Var.n0(O2);
            }
            dy0.b(td4.Z(M, (Function1) O2), null, yqo.H(-1634488071, av8Var, new ahf(j2, ev6Var)), av8Var, 3072, 6);
            xtcVar = utcVar;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ho6(ev6Var, xtcVar, i2, i4);
        }
    }

    public static final void p(int i2, of3 of3Var, gv9 gv9Var, xtc xtcVar, String str, Function1 function1) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1021677966);
        Function1 function12 = function1;
        int i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.g(str) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p = ljg.p(av8Var, C, hf3.d, 259334184, gv9Var);
            while (p.hasNext()) {
                ml1 ml1Var = (ml1) p.next();
                e(ml1Var, Intrinsics.c(ml1Var.a, str), ml1Var.e, function12, av8Var, (i3 << 3) & 7168);
                function12 = function1;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new al1(gv9Var, str, function1, xtcVar, i2, 0);
        }
    }

    public static final void q(nl1 nl1Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(693556655);
        int i3 = i2 | (av8Var.g(nl1Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Resources resources = (Resources) av8Var.k(nz.c);
            gv9<ml1> gv9Var = nl1Var.b;
            boolean g2 = av8Var.g(gv9Var);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                for (ml1 ml1Var : gv9Var) {
                    arrayList.add(new oxh(ml1Var, resources.getString(ml1Var.b), null, null, null, false, 252));
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            gv9 gv9Var2 = (gv9) O;
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc d0 = l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String v = oea.v(nl1Var.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, d0, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            Iterator<E> it = gv9Var.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.c(((ml1) obj).a, nl1Var.c)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ml1 ml1Var2 = (ml1) obj;
            av8Var = av8Var;
            r4a.j(gv9Var2, ml1Var2 != null ? new oxh(ml1Var2, resources.getString(ml1Var2.c), null, null, null, false, 252) : null, function1, null, null, false, l98.B(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i3 << 3) & 896) | 12582912, 888);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(nl1Var, function1, xtcVar, i2, 5);
        }
    }

    public static final void r(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        int i3;
        Function0 function02;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1369229850);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.i(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        int i5 = 0;
        if (av8Var2.T(i4 & 1, (i4 & 19) != 18)) {
            xtcVar = utc.a;
            av8Var = av8Var2;
            function02 = function0;
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_info, 6, av8Var), null, tol.y(bkh.l(xtcVar, 24.0f), false, false, false, 0L, null, function0, av8Var, 29), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), av8Var, 48, 0);
        } else {
            function02 = function0;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zk1(function02, xtcVar, i2, i5);
        }
    }

    public static final void s(ev6 ev6Var, float f2, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(339673568);
        int i3 = i2 | (av8Var.g(ev6Var) ? 4 : 2) | (av8Var.d(f2) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            ff5 ff5Var = dh3.h;
            kx4 kx4Var = (kx4) av8Var.k(ff5Var);
            jej Q = h5a.Q(0, 0, 1, av8Var);
            yf8 yf8Var = xth.a;
            dfj a2 = dfj.a(xth.c(), 0L, ((kx4) av8Var.k(ff5Var)).u(10.0f), null, null, 0L, null, 0, 0, ((kx4) av8Var.k(ff5Var)).u(12.0f), null, null, 0, 16646141);
            String str = ev6Var.e;
            String str2 = ev6Var.z;
            if (str2 == null) {
                a70.r("Required value was null.");
                return;
            }
            int i4 = (int) (jej.a(Q, str, a2, 1020).c >> 32);
            int i5 = (int) (jej.a(Q, str2, a2, 1020).c >> 32);
            float C0 = kx4Var.C0(i4);
            float f3 = 4.0f;
            float f4 = 16.0f;
            float f5 = 8.0f;
            int b2 = wzb.b((float) Math.ceil(f2 / (((((((((28.0f + C0) + 4.0f) + 16.0f) + 4.0f) + 36.0f) + 8.0f) + kx4Var.C0(i5)) + 4.0f) + 16.0f)));
            int i6 = 0;
            while (i6 < b2) {
                utc utcVar = utc.a;
                nq8.h(av8Var, bkh.p(utcVar, f3));
                int i7 = b2;
                td4.q(ev6Var.g, ev6Var.a, true, bkh.l(utcVar, f4), av8Var, 3456);
                nq8.h(av8Var, bkh.p(utcVar, f5));
                av8 av8Var2 = av8Var;
                dfj dfjVar = a2;
                String str3 = str;
                String str4 = str2;
                float f6 = f3;
                udj.c(str3, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfjVar, av8Var2, 0, 0, 131066);
                nq8.h(av8Var2, bkh.p(utcVar, f6));
                fz8.j(0, 1, r13.c(lz.D(com.sofascore.results.R.color.on_color_primary, av8Var2), 0.25f), av8Var2, null);
                nq8.h(av8Var2, bkh.p(utcVar, f6));
                td4.t(ev6Var.c, 48, av8Var2, bkh.o(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 36.0f, 36.0f, 3));
                nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
                udj.c(str4, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfjVar, av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                nq8.h(av8Var, bkh.p(utcVar, f6));
                fz8.j(0, 1, r13.c(lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), 0.25f), av8Var, null);
                i6++;
                f3 = f6;
                a2 = dfjVar;
                b2 = i7;
                str = str3;
                f4 = f4;
                str2 = str4;
                f5 = 8.0f;
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t81(ev6Var, f2, i2, 1);
        }
    }

    public static final void t(sl1 sl1Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(953055250);
        int i3 = (i2 & 6) == 0 ? (av8Var.g(sl1Var) ? 4 : 2) | i2 : i2;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            gv9 gv9Var = sl1Var.c;
            if (gv9Var.isEmpty()) {
                av8Var.d0(-1559442041);
                n(sl1Var.d, 0, av8Var, null);
                av8Var.s(false);
            } else {
                av8Var.d0(-1559751049);
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, utc.a);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                C(sl1Var.a, sl1Var.b, av8Var, 0);
                av8Var.d0(-353804054);
                int i5 = 0;
                for (Object obj : gv9Var) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    D((rl1) obj, i5 < gv9Var.size() - 1, av8Var, 0);
                    i5 = i6;
                }
                ljg.t(av8Var, false, true, false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n61(sl1Var, i2, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    public static final void u(pl1 pl1Var, Function1 function1, Function1 function12, Function0 function0, of3 of3Var, int i2) {
        int i3;
        Function1 function13;
        Function1 function14;
        av8 av8Var;
        utc utcVar;
        float f2;
        ?? r3;
        mv1 mv1Var = uxf.g;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(944954342);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(pl1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.i(function0) ? a.o : 1024;
        }
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            gv9 gv9Var = pl1Var.b;
            nl1 nl1Var = pl1Var.c;
            boolean isEmpty = gv9Var.isEmpty();
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar2 = utc.a;
            xtc C = fqj.C(av8Var2, utcVar2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            int i4 = i3;
            xtc c0 = l98.c0(bkh.d(utcVar2, 1.0f), 16.0f, 4.0f);
            l8g a3 = k8g.a(ww9.h, uxf.m, av8Var2, 54);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, c0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            String v = oea.v(isEmpty ? pl1Var.e : nl1Var.a, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131066);
            av8 av8Var3 = av8Var2;
            r((i4 >> 9) & 14, av8Var3, null, function0);
            av8Var3.s(true);
            boolean z = (isEmpty || nl1Var.b.isEmpty()) ? false : true;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            if (z) {
                utcVar = utcVar2;
                f2 = 16.0f;
                d2 = d2.z(l98.f0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            } else {
                utcVar = utcVar2;
                f2 = 16.0f;
            }
            mv1 mv1Var2 = uxf.c;
            k1c c2 = e12.c(mv1Var2, false);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, d2);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, c2, f50Var);
            waa.K(av8Var3, m3, ff3Var);
            bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C3, f50Var3);
            Object obj = nf3.a;
            n12 n12Var = n12.a;
            if (z) {
                av8Var3.d0(-1667510299);
                gv9 gv9Var2 = nl1Var.b;
                String str = nl1Var.c;
                boolean z2 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
                Object O = av8Var3.O();
                if (z2 || O == obj) {
                    function13 = function1;
                    O = new s1(15, function13, pl1Var);
                    av8Var3.n0(O);
                } else {
                    function13 = function1;
                }
                r3 = 0;
                p(0, av8Var3, gv9Var2, l98.d0(n12Var.a(utcVar, mv1Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), str, (Function1) O);
                av8Var3.s(false);
            } else {
                function13 = function1;
                r3 = 0;
                av8Var3.d0(-1666877000);
                av8Var3.s(false);
            }
            if (pl1Var.a == ll1.c) {
                av8Var3.d0(-1666807312);
                o1j.a(gv9Var, n12Var.a(utcVar, z ? uxf.k : mv1Var), av8Var3, r3);
                av8Var3.s(r3);
            } else {
                av8Var3.d0(-1666536651);
                pd0.a(gv9Var, n12Var.a(z ? l98.f0(utcVar, 80.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10) : utcVar, z ? uxf.j : mv1Var), av8Var3, r3);
                av8Var3.s(r3);
            }
            av8Var3.s(true);
            if (isEmpty) {
                function14 = function12;
                av8Var3.d0(1720521874);
                av8Var3.s(r3);
            } else {
                av8Var3.d0(-1607076993);
                nl1 nl1Var2 = pl1Var.d;
                if (nl1Var2 == null) {
                    av8Var3.d0(1720220770);
                    av8Var3.s(r3);
                    function14 = function12;
                } else {
                    av8Var3.d0(1720220771);
                    boolean z3 = (i4 & 896) == 256 ? true : r3;
                    Object O2 = av8Var3.O();
                    if (z3 || O2 == obj) {
                        function14 = function12;
                        O2 = new vi(12, function14);
                        av8Var3.n0(O2);
                    } else {
                        function14 = function12;
                    }
                    q(nl1Var2, (Function1) O2, l98.e0(utcVar, f2, 8.0f, f2, 8.0f), av8Var3, r3);
                    av8Var3.s(r3);
                }
                av8Var3.s(r3);
            }
            av8Var3.s(true);
            av8Var = av8Var3;
        } else {
            function13 = function1;
            function14 = function12;
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(pl1Var, function13, function14, function0, i2, 1);
        }
    }

    public static final void v(String str, String str2, int i2, boolean z, Function0 function0, of3 of3Var, int i3) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1337160947);
        int i4 = i3 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(str2) ? 32 : 16) | (av8Var2.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.h(z) ? a.o : 1024);
        int i5 = 1;
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            av8Var = av8Var2;
            yqo.a(false, null, null, yqo.H(-1540544886, av8Var2, new o81(i2, i5)), str, null, null, null, false, false, z, lz.D(com.sofascore.results.R.color.crowdsourcing, av8Var2), function0, 0L, false, false, 0L, yqo.H(1973522040, av8Var2, new d82(str2, 3)), av8Var, ((i4 << 12) & 57344) | 3078, ((i4 >> 9) & 14) | 12583296, 123878);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(str, str2, i2, z, function0, i3, 4);
        }
    }

    public static final void w(e9i e9iVar, nkh nkhVar, of3 of3Var, int i2) {
        int i3;
        e9i e9iVar2;
        boolean z;
        String v;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2036838105);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(nkhVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            int i4 = nkhVar.a;
            vv3 vv3Var = nkhVar.b;
            float b2 = llf.b((i4 + 50.0f) / 100.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String v2 = oea.v(vv3Var.e, av8Var);
            yf8 yf8Var = xth.a;
            dfj h2 = xth.h();
            long D = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            udj.c(v2, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, h2, av8Var, 48, 0, 130040);
            nq8.h(av8Var, bkh.e(utcVar, 48.0f));
            float a3 = e9iVar.a(1000, 500);
            float f2 = (a3 * 0.1f) + 0.9f;
            float a4 = e9iVar.a(1000, 800);
            float a5 = e9iVar.a(1800, 300);
            boolean d2 = av8Var.d(a3) | av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d2 || O == a99Var) {
                O = new n28(11, a3, f2);
                av8Var.n0(O);
            }
            xtc M = s02.M(utcVar, (Function1) O);
            u23 a6 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, M);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            xtc d3 = bkh.d(utcVar, 1.0f);
            l8g a7 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d3);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a7, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(s6a.N(vv3Var.a, 6, av8Var), null, bkh.l(utcVar, 20.0f), hkg.d0(lz.D(com.sofascore.results.R.color.on_color_secondary, av8Var), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), i4 < 0 ? a5 : 0.0f), av8Var, 432, 0);
            nq8.h(av8Var, new goa(1.0f, true));
            kq9.b(s6a.N(vv3Var.b, 6, av8Var), null, bkh.l(utcVar, 20.0f), hkg.d0(lz.D(com.sofascore.results.R.color.on_color_secondary, av8Var), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), i4 > 0 ? a5 : 0.0f), av8Var, 432, 0);
            bf3.t(av8Var, true, utcVar, 10.0f, av8Var);
            y(b6a.t(0.5f, b2, a4), bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 0L, 0L, av8Var, 48);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a8 = k8g.a(ww9.h, uxf.l, av8Var, 6);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a8, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            x(oea.v(vv3Var.c, av8Var), i4 < 0, a5, av8Var, 0);
            x(oea.v(vv3Var.d, av8Var), i4 > 0, a5, av8Var, 0);
            av8Var.s(true);
            av8Var.s(true);
            nq8.h(av8Var, bkh.e(utcVar, 40.0f));
            e9iVar2 = e9iVar;
            float a9 = e9iVar2.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 500);
            float f3 = (0.1f * a9) + 0.9f;
            if (i4 < 0) {
                av8Var.d0(-625876575);
                v = oea.v(vv3Var.f, av8Var);
                z = false;
            } else {
                z = false;
                av8Var.d0(-625874785);
                v = oea.v(vv3Var.g, av8Var);
            }
            av8Var.s(z);
            dfj f4 = xth.f();
            long D2 = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
            boolean d4 = av8Var.d(a9) | av8Var.d(f3);
            Object O2 = av8Var.O();
            if (d4 || O2 == a99Var) {
                O2 = new n28(12, a9, f3);
                av8Var.n0(O2);
            }
            udj.c(v, s02.M(utcVar, (Function1) O2), D2, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, f4, av8Var, 0, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            e9iVar2 = e9iVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(e9iVar2, nkhVar, i2, 23);
        }
    }

    public static boolean w0(Context context) {
        SharedPreferences d2;
        context.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        if (currentTimeMillis - sharedPreferences.getLong("PREF_FIRST_RUN_TIMESTAMP", 0L) <= 259200000) {
            return false;
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext2);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences2 = d2;
        }
        return sharedPreferences2.getBoolean("PREF_SHOW_LEAGUES_TOOLTIP", true);
    }

    public static final void x(String str, boolean z, float f2, of3 of3Var, int i2) {
        long f3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(765222081);
        int i3 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.h(z) ? 32 : 16) | (av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                av8Var.d0(-955265708);
                f3 = hkg.d0(lz.D(com.sofascore.results.R.color.on_color_secondary, av8Var), lz.D(com.sofascore.results.R.color.graphics_dark, av8Var), f2);
                av8Var.s(false);
            } else {
                f3 = ljg.f(av8Var, -955184767, com.sofascore.results.R.color.on_color_secondary, av8Var, false);
            }
            float f4 = z ? f2 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            boolean z2 = (i3 & 112) == 32;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new z1h(11);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(n9e.q(s02.M(utc.a, (Function1) O), r13.c(lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), f4), o7g.a(8.0f)), 8.0f, 2.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, null, f3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qkh(str, z, f2, i2);
        }
    }

    public static final void y(final float f2, xtc xtcVar, float f3, float f4, float f5, long j2, long j3, long j4, of3 of3Var, final int i2) {
        xtc xtcVar2;
        final float f6;
        final float f7;
        final float f8;
        final long j5;
        final long j6;
        final long j7;
        int i3;
        final float f9;
        float f10;
        final long D;
        final long D2;
        final float f11;
        final float f12;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-353477053);
        int i4 = i2 | (av8Var.d(f2) ? 4 : 2) | 4812160;
        if (av8Var.T(i4 & 1, (4793491 & i4) != 4793490)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                j5 = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
                i3 = i4 & (-33488897);
                f9 = 16.0f;
                f10 = 2.0f;
                D = lz.D(com.sofascore.results.R.color.on_color_secondary, av8Var);
                D2 = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
                f11 = 2.0f;
                f12 = 4.0f;
            } else {
                av8Var.W();
                i3 = i4 & (-33488897);
                f9 = f3;
                f11 = f4;
                f12 = f5;
                j5 = j2;
                D2 = j4;
                f10 = 2.0f;
                D = j3;
            }
            av8Var.t();
            float f13 = (f10 * f12) + f9;
            final boolean z = av8Var.k(dh3.n) == ema.b;
            xtcVar2 = xtcVar;
            xtc e2 = bkh.e(bkh.d(xtcVar2, 1.0f), f13);
            boolean h2 = ((i3 & 14) == 4) | av8Var.h(z) | av8Var.f(D) | av8Var.f(j5) | av8Var.f(D2);
            Object O = av8Var.O();
            if (h2 || O == nf3.a) {
                O = new Function1() { // from class: okh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        final float f14 = f9;
                        final long j8 = D;
                        final float f15 = f2;
                        final long j9 = j5;
                        final float f16 = f12;
                        final long j10 = D2;
                        final float f17 = f11;
                        cga.I(ha5Var, z, new Function1() { // from class: rkh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ha5 ha5Var2 = (ha5) obj2;
                                ha5Var2.getClass();
                                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L));
                                float f18 = f14;
                                float H0 = (intBitsToFloat - ha5Var2.H0(f18)) / 2.0f;
                                float H02 = ha5Var2.H0(f18) + H0;
                                long floatToRawIntBits = (Float.floatToRawIntBits(H0) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                                float H03 = ha5Var2.H0(f18);
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(H03) & 4294967295L);
                                float H04 = ha5Var2.H0(4.0f);
                                ha5.f0(ha5Var2, j8, floatToRawIntBits, floatToRawIntBits2, (Float.floatToRawIntBits(H04) << 32) | (Float.floatToRawIntBits(H04) & 4294967295L), null, 240);
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) / 2.0f;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32));
                                float f19 = f15;
                                float f20 = intBitsToFloat4 * f19;
                                long j11 = j9;
                                if (f19 >= 0.5f) {
                                    float H05 = ha5Var2.H0(f18);
                                    float H06 = ha5Var2.H0(4.0f);
                                    ha5.f0(ha5Var2, j11, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), (Float.floatToRawIntBits(f20 - intBitsToFloat3) << 32) | (Float.floatToRawIntBits(H05) & 4294967295L), (Float.floatToRawIntBits(H06) << 32) | (Float.floatToRawIntBits(H06) & 4294967295L), null, 240);
                                } else {
                                    float H07 = ha5Var2.H0(f18);
                                    float H08 = ha5Var2.H0(4.0f);
                                    ha5.f0(ha5Var2, j11, (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3 - f20) << 32) | (Float.floatToRawIntBits(H07) & 4294967295L), (Float.floatToRawIntBits(H08) << 32) | (Float.floatToRawIntBits(H08) & 4294967295L), null, 240);
                                }
                                float f21 = f16;
                                float H09 = H0 - ha5Var2.H0(f21);
                                float H010 = ha5Var2.H0(f21) + H02;
                                ha5.W0(ha5Var2, j10, (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(H09) & 4294967295L), (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(H010) & 4294967295L), ha5Var2.H0(f17), 0, null, 496);
                                return Unit.a;
                            }
                        });
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            }
            lz.d(0, av8Var, e2, (Function1) O);
            f8 = f12;
            long j8 = D;
            f6 = f9;
            f7 = f11;
            j7 = D2;
            j6 = j8;
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
            f6 = f3;
            f7 = f4;
            f8 = f5;
            j5 = j2;
            j6 = j3;
            j7 = j4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final xtc xtcVar3 = xtcVar2;
            u.d = new Function2(f2, xtcVar3, f6, f7, f8, j5, j6, j7, i2) { // from class: pkh
                public final /* synthetic */ float a;
                public final /* synthetic */ xtc b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(49);
                    o02.y(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final String y0(Integer num) {
        String str;
        String sb;
        if (num != null) {
            if (num.intValue() >= 10000) {
                sb = yid.c("%.1f", Double.valueOf(num.intValue() / 1000.0d));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(num);
                sb = sb2.toString();
            }
            str = sb.concat(num.intValue() >= 10000 ? CampaignEx.JSON_KEY_AD_K : "");
        } else {
            str = null;
        }
        Regex regex = yid.a;
        return str == null ? "-" : str;
    }

    public static final void z(dci dciVar, Function1 function1, Function1 function12, Function0 function0, of3 of3Var, int i2) {
        int i3;
        dci dciVar2;
        Function1 function13;
        a99 a99Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1667480775);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(dciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function0) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc h2 = ljg.h(16.0f, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var), 16.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, h2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String v = oea.v(com.sofascore.results.R.string.crowdsourcing_kick_off_question, av8Var);
            yf8 yf8Var = xth.a;
            int i4 = i3;
            udj.c(v, null, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.e(utcVar, 16.0f));
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc A = wnn.A(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), o7g.a(8.0f));
            Boolean bool = dciVar.a;
            CrowdsourcingContribution crowdsourcingContribution = dciVar.d;
            Boolean bool2 = Boolean.TRUE;
            long f2 = Intrinsics.c(bool, bool2) ? ljg.f(av8Var, 748052011, com.sofascore.results.R.color.success, av8Var, false) : ljg.f(av8Var, 748052588, com.sofascore.results.R.color.surface_2, av8Var, false);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, f2, jf9Var);
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (z || O == a99Var2) {
                a99Var = a99Var2;
                O = new ri(12, function1);
                av8Var.n0(O);
            } else {
                a99Var = a99Var2;
            }
            a99 a99Var3 = a99Var;
            xtc y = tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            mv1 mv1Var = uxf.g;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, y);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_tv_channel_checkmark_16, 6, av8Var), null, bkh.l(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f), Intrinsics.c(bool, bool2) ? ljg.f(av8Var, 420177638, com.sofascore.results.R.color.surface_1, av8Var, false) : ljg.f(av8Var, 420178242, com.sofascore.results.R.color.n_lv_3, av8Var, false), av8Var, 432, 0);
            i.o(av8Var, true, utcVar, 8.0f, av8Var);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc A2 = wnn.A(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), o7g.a(8.0f));
            Boolean bool3 = Boolean.FALSE;
            xtc q2 = n9e.q(A2, Intrinsics.c(bool, bool3) ? ljg.f(av8Var, 748080777, com.sofascore.results.R.color.error, av8Var, false) : ljg.f(av8Var, 748081292, com.sofascore.results.R.color.surface_2, av8Var, false), jf9Var);
            boolean z2 = i5 == 32;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var3) {
                O2 = new ri(13, function1);
                av8Var.n0(O2);
            }
            xtc y2 = tol.y(q2, false, false, false, 0L, null, (Function0) O2, av8Var, 31);
            k1c c3 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, y2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_tv_channel_x_16, 6, av8Var), null, bkh.l(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f), Intrinsics.c(bool, bool3) ? ljg.f(av8Var, -1450398161, com.sofascore.results.R.color.surface_1, av8Var, false) : ljg.f(av8Var, -1450397557, com.sofascore.results.R.color.n_lv_3, av8Var, false), av8Var, 432, 0);
            av8Var.s(true);
            av8Var.s(true);
            dciVar2 = dciVar;
            function13 = function12;
            fz8.b(x23.a, Intrinsics.c(bool, bool3), null, null, null, null, yqo.H(-1048419157, av8Var, new d67(15, (Object) dciVar2, (Object) function0, function13)), av8Var, 1572870, 30);
            av8Var = av8Var;
            if (crowdsourcingContribution != null) {
                bf3.r(8.0f, -1356752969, av8Var, av8Var, utcVar);
                hkg.f(crowdsourcingContribution, null, av8Var, 0, 2);
                av8Var.s(false);
            } else {
                av8Var.d0(-1356622273);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            dciVar2 = dciVar;
            function13 = function12;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(dciVar2, function1, function13, function0, i2, 9);
        }
    }

    public abstract boolean H(int i2, int i3);

    public abstract boolean I(int i2, int i3);

    public boolean M() {
        return false;
    }

    public abstract boolean N();

    public abstract void O(boolean z);

    public abstract Object R(int i2, int i3);

    public abstract int S();

    public abstract int W();

    public abstract int X();

    public abstract Context Y();

    public boolean b0() {
        return false;
    }

    public abstract void d0();

    public abstract boolean f0(int i2, KeyEvent keyEvent);

    public boolean g0(KeyEvent keyEvent) {
        return false;
    }

    public boolean i0() {
        return false;
    }

    public abstract void m0(boolean z);

    public abstract void n0(boolean z);

    public abstract void o0();

    public abstract void p0(int i2);

    public abstract void q0();

    public abstract void r0(Drawable drawable);

    public abstract void s0(boolean z);

    public abstract void t0(String str);

    public abstract void u0(String str);

    public abstract void v0(CharSequence charSequence);

    public hc x0(f4a f4aVar) {
        return null;
    }

    public void e0() {
    }
}
