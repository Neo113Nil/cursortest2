package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.webkit.WebView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.internal.ads.zzet;
import com.google.android.gms.internal.ads.zzguk;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.fantasy.FantasyPlayer;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.team.TennisSurfaceType;
import com.sofascore.results.R;
import com.sofascore.results.feed.MediaExternalVideoDialog;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.unity3d.services.UnityAdsConstants;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class uaa {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static String c = "api.sofascore.com/";
    public static Thread d;

    public static void A(Object obj, String str, boolean z) {
        if (!z) {
            throw new fb3(ufa.C(str, obj), 14);
        }
    }

    public static void B(zzet zzetVar) {
        int h;
        int h2 = zzetVar.h(2);
        if (h2 == 0) {
            zzetVar.f(6);
            return;
        }
        int D = D(zzetVar, 5, 8, 16) + 1;
        if (h2 == 1) {
            zzetVar.f(D * 7);
            return;
        }
        if (h2 == 2) {
            boolean g = zzetVar.g();
            int i = true != g ? 5 : 1;
            int i2 = true == g ? 7 : 5;
            int i3 = true == g ? 8 : 6;
            int i4 = 0;
            while (i4 < D) {
                if (zzetVar.g()) {
                    zzetVar.f(7);
                    h = 0;
                } else {
                    if (zzetVar.h(2) == 3 && zzetVar.h(i2) * i != 0) {
                        zzetVar.e();
                    }
                    h = zzetVar.h(i3) * i;
                    if (h != 0 && h != 180) {
                        zzetVar.e();
                    }
                    zzetVar.e();
                }
                if (h != 0 && h != 180 && zzetVar.g()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static void C(zzet zzetVar) {
        zzetVar.f(3);
        zzetVar.f(8);
        boolean g = zzetVar.g();
        boolean g2 = zzetVar.g();
        if (g) {
            zzetVar.f(5);
        }
        if (g2) {
            zzetVar.f(6);
        }
    }

    public static int D(zzet zzetVar, int i, int i2, int i3) {
        zzguk.a(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (zzetVar.b() >= i) {
            int h = zzetVar.h(i);
            if (h == i4) {
                if (zzetVar.b() >= i2) {
                    int h2 = zzetVar.h(i2);
                    h += h2;
                    if (h2 == i5) {
                        if (zzetVar.b() >= i3) {
                            return zzetVar.h(i3) + h;
                        }
                    }
                }
            }
            return h;
        }
        return -1;
    }

    public static final void a(ms3 ms3Var, boolean z, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1712481116);
        int i2 = i | (av8Var.g(ms3Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | 384;
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
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
            td4.G(ms3Var.a, bkh.l(utcVar, 16.0f), false, 0L, av8Var, 48, 12);
            String str = ms3Var.b;
            yf8 yf8Var = xth.a;
            xtcVar = utcVar;
            udj.c(str, new goa(1.0f, true), z ? ljg.f(av8Var, -1824532791, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, -1824532311, R.color.n_lv_3, av8Var, false), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110584);
            udj.c(yid.e(3, null, ms3Var.c), null, z ? ljg.f(av8Var, -1824523031, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, -1824522551, R.color.n_lv_3, av8Var, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) ms3Var, z, xtcVar2, i, 20);
        }
    }

    public static final void b(nte nteVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1167259090);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(nteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            String str = nteVar.a;
            String str2 = nteVar.b;
            tc3 H = yqo.H(-1352322187, av8Var2, new t1d(nteVar, 10));
            tc3 H2 = yqo.H(907478221, av8Var2, new pte(nteVar, r10));
            tc3 tc3Var = fz8.b;
            int i3 = ((i2 & 112) == 32 ? 1 : 0) | ((i2 & 14) == 4 ? 1 : 0);
            Object O = av8Var2.O();
            if (i3 != 0 || O == nf3.a) {
                O = new zbe(7, function1, nteVar);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, H, H2, tc3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, str, str2, (Function0) O, av8Var, ((i2 >> 6) & 14) | 200112, 464);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(nteVar, function1, xtcVar, i, 26);
        }
    }

    public static final void c(int i, mi5 mi5Var, xtc xtcVar, of3 of3Var, int i2) {
        mi5 mi5Var2;
        xtc xtcVar2;
        zg3 zg3Var;
        mi5Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-257597163);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.g(mi5Var) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            n9a n9aVar = n9a.a;
            utc utcVar = utc.a;
            xtc q = n9e.q(fz8.Y(utcVar, n9aVar), lz.D(R.color.surface_1, av8Var), oyn.e);
            boolean i4 = ((i3 & 112) == 32) | av8Var.i(context);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new zbe(14, context, mi5Var);
                av8Var.n0(O);
            }
            xtc e0 = l98.e0(bkh.d(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 1.0f), 12.0f, 6.0f, 8.0f, 6.0f);
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
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
            String p = yid.p(i);
            yf8 yf8Var = xth.a;
            xtcVar2 = utcVar;
            udj.c(p, bkh.p(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.g(), av8Var, 48, 24960, 109560);
            td4.N(l98.d0(bkh.c(xtcVar2, 1.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(new ng0(2.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            Integer num = mi5Var.e;
            a(mi5Var.c, (num != null && num.intValue() == 1) || num == null, null, av8Var, 0);
            a(mi5Var.d, (num != null && num.intValue() == 2) || num == null, null, av8Var, 0);
            av8Var.s(true);
            mi5Var2 = mi5Var;
            td4.N(l98.f0(bkh.e(xtcVar2, 36.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
            xtc p2 = bkh.p(xtcVar2, 52.0f);
            u23 a4 = t23.a(new ng0(2.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, p2);
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
            kq9.b(s6a.N(R.drawable.ic_crowdsourcing, 6, av8Var), null, bkh.l(xtcVar2, 16.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 432, 0);
            udj.c(uxf.E(mi5Var2.b, 62, false), null, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 109562);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            mi5Var2 = mi5Var;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(i, mi5Var2, xtcVar2, i2);
        }
    }

    public static final e7g d(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new e7g(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(scj scjVar, String str, xtc xtcVar, boolean z, of3 of3Var, int i, int i2) {
        boolean z2;
        int i3;
        av8 av8Var;
        eqf u;
        scjVar.getClass();
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(90069523);
        int i4 = (av8Var2.g(scjVar) ? 4 : 2) | i | (av8Var2.g(str) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i4 |= av8Var2.h(z2) ? a.o : 1024;
            i3 = i4 | 24576;
            if (av8Var2.T(i3 & 1, (i3 & 9363) == 9362)) {
                av8Var = av8Var2;
                av8Var.W();
            } else {
                if (i5 != 0) {
                    z2 = true;
                }
                Object O = av8Var2.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = e.f(scjVar.c().c.toString());
                    av8Var2.n0(O);
                }
                e1d e1dVar = (e1d) O;
                Object O2 = av8Var2.O();
                if (O2 == a99Var) {
                    O2 = e.f(Boolean.FALSE);
                    av8Var2.n0(O2);
                }
                e1d e1dVar2 = (e1d) O2;
                String str2 = (String) e1dVar.getValue();
                yf8 yf8Var = xth.a;
                dfj a2 = dfj.a(xth.e(), lz.D(R.color.n_lv_1, av8Var2), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                pvh pvhVar = new pvh(lz.D(R.color.n_lv_3, av8Var2));
                Object O3 = av8Var2.O();
                if (O3 == a99Var) {
                    O3 = new fw6(29, e1dVar2);
                    av8Var2.n0(O3);
                }
                xtc c0 = l98.c0(n9e.q(bkh.g(kik.L(xtcVar, (Function1) O3), 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_2, av8Var2), o7g.a(8.0f)), 16.0f, 8.0f);
                boolean z3 = (i3 & 14) == 4;
                Object O4 = av8Var2.O();
                if (z3 || O4 == a99Var) {
                    O4 = new aaf(12, scjVar, e1dVar);
                    av8Var2.n0(O4);
                }
                av8Var = av8Var2;
                yo1.d(str2, (Function1) O4, c0, z2, false, a2, null, null, true, 0, 0, null, null, null, pvhVar, yqo.H(785120656, av8Var2, new zya(e1dVar2, str, e1dVar, scjVar)), av8Var, (i3 & 7168) | 100663296, 196608, 16080);
            }
            boolean z4 = z2;
            u = av8Var.u();
            if (u == null) {
                u.d = new vm7(scjVar, str, xtcVar, z4, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        i3 = i4 | 24576;
        if (av8Var2.T(i3 & 1, (i3 & 9363) == 9362)) {
        }
        boolean z42 = z2;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void f(final String str, final Function1 function1, final String str2, final xtc xtcVar, boolean z, final long j, final Function0 function0, final Function1 function12, of3 of3Var, final int i) {
        int i2;
        String str3;
        av8 av8Var;
        final boolean z2;
        int i3;
        str.getClass();
        function1.getClass();
        str2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1197120171);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= av8Var2.g(str3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= av8Var2.f(j) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i4 |= av8Var2.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= av8Var2.i(function12) ? 8388608 : 4194304;
        }
        if (av8Var2.T(i4 & 1, (4793491 & i4) != 4793490)) {
            av8Var2.Y();
            if ((i & 1) == 0 || av8Var2.B()) {
                z2 = true;
            } else {
                av8Var2.W();
                z2 = z;
            }
            av8Var2.t();
            z69 z69Var = (z69) av8Var2.k(dh3.l);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            yf8 yf8Var = xth.a;
            dfj a2 = dfj.a(xth.e(), lz.D(R.color.n_lv_1, av8Var2), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            int i5 = i4;
            pvh pvhVar = new pvh(lz.D(R.color.n_lv_3, av8Var2));
            boolean z3 = (i5 & 29360128) == 8388608;
            Object O2 = av8Var2.O();
            if (z3 || O2 == a99Var) {
                i3 = 2;
                O2 = new xz4(function12, e1dVar, i3);
                av8Var2.n0(O2);
            } else {
                i3 = 2;
            }
            av8Var = av8Var2;
            yo1.d(str, function1, l98.c0(n9e.q(bkh.g(kik.L(xtcVar, (Function1) O2), 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3), j, o7g.a(8.0f)), 16.0f, 8.0f), z2, false, a2, null, null, true, 0, 0, null, null, null, pvhVar, yqo.H(692192146, av8Var2, new s64(function0, str, e1dVar, z69Var, str3, function1)), av8Var, (i5 & 14) | 100663296 | (i5 & 112) | ((i5 >> 3) & 7168), 196608, 16080);
        } else {
            av8Var = av8Var2;
            av8Var.W();
            z2 = z;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: ewg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uaa.f(str, function1, str2, xtcVar, z2, j, function0, function12, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(int i, int i2, long j, of3 of3Var, xtc xtcVar, String str, boolean z) {
        int i3;
        av8 av8Var;
        xtc xtcVar2;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1633625068);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(xtcVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.f(j) ? 16384 : 8192;
        }
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            av8Var2.Y();
            if ((i2 & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            Context context = (Context) av8Var2.k(nz.b);
            ImageVector N = s6a.N(z ? R.drawable.ic_notification_active : R.drawable.ic_notification_deselected, 6, av8Var2);
            xtc l = bkh.l(xtcVar, 24.0f);
            boolean i4 = ((i3 & 896) == 256) | av8Var2.i(context) | ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object O = av8Var2.O();
            if (i4 || O == nf3.a) {
                xtcVar2 = l;
                q93 q93Var = new q93(z, context, i, str, 1);
                av8Var2.n0(q93Var);
                O = q93Var;
            } else {
                xtcVar2 = l;
            }
            av8Var = av8Var2;
            kq9.b(N, null, tol.n(xtcVar2, 0.75f, (Function0) O, 2), j, av8Var, ((i3 >> 3) & 7168) | 48, 0);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r93(i, str, z, xtcVar, j, i2, 2);
        }
    }

    public static final long h(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = xvj.c;
        return floatToRawIntBits;
    }

    public static final void i(WeeklyChallengeViewModel weeklyChallengeViewModel, of3 of3Var, int i) {
        boolean z;
        jf9 jf9Var = oyn.e;
        weeklyChallengeViewModel.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1166366926);
        int i2 = (av8Var.i(weeklyChallengeViewModel) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            e1d x = rfo.x(weeklyChallengeViewModel.p, av8Var, 0);
            utc utcVar = utc.a;
            xtc x2 = gz8.x(utcVar, null, null, 3);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, x2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            b4l b4lVar = (b4l) x.getValue();
            if (b4lVar instanceof y3l) {
                av8Var.d0(1995730882);
                t6a.b(l98.b0(utcVar, 16.0f), 48.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 438, 8);
                av8Var.s(false);
                z = true;
            } else if (b4lVar instanceof z3l) {
                av8Var.d0(1995976960);
                xtc f0 = l98.f0(bkh.d(n9e.q(utcVar, lz.D(R.color.surface_P, av8Var), jf9Var), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                xtc e0 = l98.e0(utcVar, 16.0f, 4.0f, 16.0f, 24.0f);
                String v = oea.v(R.string.weekly_challenge_every_vote_counts, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v, e0, lz.D(R.color.n_lv_2, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
                udj.c(oea.v(R.string.weekly_challenge_every_vote_counts_description, av8Var), l98.c0(utcVar, 32.0f, 64.0f), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var, 48, 0, 130040);
                av8Var = av8Var;
                z = true;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                z = true;
                if (!(b4lVar instanceof a4l)) {
                    throw dmi.h(av8Var, 618566742, false);
                }
                av8Var.d0(1997074701);
                xtc f02 = l98.f0(bkh.d(n9e.q(utcVar, lz.D(R.color.surface_P, av8Var), jf9Var), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
                boolean g = av8Var.g(b4lVar) | av8Var.i(weeklyChallengeViewModel);
                Object O = av8Var.O();
                if (g || O == nf3.a) {
                    O = new mwj(16, (a4l) b4lVar, weeklyChallengeViewModel);
                    av8Var.n0(O);
                }
                v8a.a(f02, null, null, null, null, null, false, null, (Function1) O, av8Var, 0, 510);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lqj(weeklyChallengeViewModel, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(y7l y7lVar, m5i m5iVar, vy8 vy8Var, of3 of3Var, int i) {
        y7l y7lVar2;
        vy8 vy8Var2;
        List split$default;
        int i2;
        jfj jfjVar;
        Bitmap bitmap;
        int i3;
        jfj jfjVar2;
        boolean z;
        String name;
        UniqueStage uniqueStage;
        Category category;
        Sport sport;
        Integer valueOf = Integer.valueOf(R.color.widget_icons);
        av8 av8Var = (av8) of3Var;
        av8Var.f0(581438409);
        int i4 = i | (av8Var.e(y7lVar.ordinal()) ? 4 : 2) | (av8Var.i(m5iVar) ? 32 : 16) | (av8Var.h(false) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(bh3.b);
            Stage stage = m5iVar.a;
            boolean e = av8Var.e(stage.getId());
            Object O = av8Var.O();
            if (e || O == nf3.a) {
                n7l n7lVar = n7l.a;
                l7l c2 = n7l.c(stage);
                O = c2 != null ? n7l.a(c2.a) : null;
                av8Var.n0(O);
            }
            Bitmap bitmap2 = (Bitmap) O;
            Set set = wyh.a;
            StageSeason stageSeason = stage.getStageSeason();
            int a2 = wyh.a((stageSeason == null || (uniqueStage = stageSeason.getUniqueStage()) == null || (category = uniqueStage.getCategory()) == null || (sport = category.getSport()) == null) ? null : sport.getSlug());
            long startDateTimestamp = stage.getStartDateTimestamp();
            context.getClass();
            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
            bestPattern.getClass();
            String i5 = fc6.i(startDateTimestamp, hk4.a(bestPattern));
            DayOfWeek dayOfWeek = hwc.a;
            String str = m5iVar.e.a;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            split$default = StringsKt__StringsKt.split$default(hwc.d(context, str, false), new String[]{"•"}, false, 0, 6, null);
            String obj = StringsKt.l0((String) CollectionsKt.Y(split$default)).toString();
            y7lVar2 = y7lVar;
            boolean z2 = y7lVar2 == y7l.b;
            String statusType = stage.getStatusType();
            int hashCode = statusType.hashCode();
            int i6 = R.drawable.ic_timeline_dot;
            if (hashCode != -1411655086) {
                if (hashCode != -673660814) {
                    if (hashCode == -500280754 && statusType.equals(StatusKt.STATUS_NOT_STARTED)) {
                        jfj jfjVar3 = new jfj(4, lnb.o(i5, " • ", obj), valueOf);
                        i6 = R.drawable.ic_timeline_dot_upcoming;
                        jfjVar = jfjVar3;
                        bitmap = bitmap2;
                        i3 = i6;
                        jfjVar2 = null;
                    }
                } else if (statusType.equals(StatusKt.STATUS_FINISHED)) {
                    if (!z2) {
                        obj = lnb.o(i5, " • ", obj);
                    }
                    int i7 = 4;
                    jfj jfjVar4 = new jfj(i7, obj, valueOf);
                    StageWinner winner = stage.getWinner();
                    if (winner != null && (name = winner.getName()) != null) {
                        str2 = tv3.c(context, name);
                    }
                    jfj jfjVar5 = new jfj(i7, str2, valueOf);
                    jfjVar = jfjVar4;
                    bitmap = bitmap2;
                    jfjVar2 = jfjVar5;
                    i3 = R.drawable.ic_timeline_dot;
                    z = true;
                    int id = stage.getId();
                    jfj jfjVar6 = m5iVar.d;
                    ty8 ty8Var = ty8.a;
                    hda.j(id, bitmap, jfjVar6, i3, jfjVar, jfjVar2, z, a2, ty8Var, av8Var, 100663296);
                    vy8Var2 = ty8Var;
                }
                i2 = 4;
                if (!z2) {
                    obj = lnb.o(i5, " • ", obj);
                }
                jfjVar = new jfj(i2, obj, valueOf);
                bitmap = bitmap2;
                jfjVar2 = m5iVar.c;
                i3 = R.drawable.ic_timeline_dot;
            } else {
                i2 = 4;
                if (statusType.equals(StatusKt.STATUS_IN_PROGRESS)) {
                    jfjVar = new jfj(i2, wv8.i(context.getString(R.string.now), " • ", obj), Integer.valueOf(R.color.live));
                    bitmap = bitmap2;
                    i3 = i6;
                    jfjVar2 = null;
                }
                if (!z2) {
                }
                jfjVar = new jfj(i2, obj, valueOf);
                bitmap = bitmap2;
                jfjVar2 = m5iVar.c;
                i3 = R.drawable.ic_timeline_dot;
            }
            z = false;
            int id2 = stage.getId();
            jfj jfjVar62 = m5iVar.d;
            ty8 ty8Var2 = ty8.a;
            hda.j(id2, bitmap, jfjVar62, i3, jfjVar, jfjVar2, z, a2, ty8Var2, av8Var, 100663296);
            vy8Var2 = ty8Var2;
        } else {
            y7lVar2 = y7lVar;
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(y7lVar2, m5iVar, vy8Var2, i, 23);
        }
    }

    public static final void k(int i, int i2, of3 of3Var, xtc xtcVar, boolean z, boolean z2) {
        xtc xtcVar2;
        int i3;
        xtc xtcVar3;
        long f;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(526028416);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = (av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | i;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            utc utcVar = utc.a;
            if (i4 != 0) {
                xtcVar2 = utcVar;
            }
            float f2 = z ? 32.0f : 56.0f;
            float f3 = z ? 20.0f : 34.0f;
            float f4 = z ? 1.0f : 4.0f;
            float f5 = z ? 8.0f : 14.0f;
            long f6 = z2 ? ljg.f(av8Var, -1292820370, R.color.on_color_primary, av8Var, false) : ljg.f(av8Var, -1292819735, R.color.n_lv_1, av8Var, false);
            if (z2) {
                av8Var.d0(-1292817979);
                av8Var.s(false);
                f = r13.b;
            } else {
                f = ljg.f(av8Var, -1292817619, R.color.surface_1, av8Var, false);
            }
            long j = f;
            xtc e = bkh.e(xtcVar2, f2);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc xtcVar4 = xtcVar2;
            float f7 = f5;
            kq9.b(s6a.N(R.drawable.ic_fifa_background, 6, av8Var), null, null, f6, av8Var, 48, 4);
            xtc a2 = n12.a.a(utcVar, uxf.g);
            u23 a3 = t23.a(ww9.d, uxf.p, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, a2);
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
            wkn.k(haa.t(2131233095, 0, av8Var), null, bkh.e(utcVar, f3), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, 120);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, f4));
            kq9.b(s6a.N(R.drawable.ic_fifa_name, 6, av8Var), null, bkh.p(utcVar, f7), j, av8Var, 48, 0);
            av8Var.s(true);
            av8Var.s(true);
            xtcVar3 = xtcVar4;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new dv5(z, z2, xtcVar3, i, i2);
        }
    }

    public static final void l(BlazeWidgetLayout blazeWidgetLayout) {
        blazeWidgetLayout.getWidgetItemStyle().getStatusIndicator().setVisible(false);
        blazeWidgetLayout.getWidgetItemStyle().getImage().getBorder().setVisible(false);
    }

    public static final y8g m(ku3 ku3Var, XmlPullParser xmlPullParser) {
        ku3Var.getClass();
        qn2 qn2Var = new qn2(0);
        x8g x8gVar = (x8g) qn2Var.a;
        int eventType = xmlPullParser.getEventType();
        boolean z = false;
        boolean z2 = false;
        while (eventType != 1 && s9a.w(ku3Var)) {
            if (eventType == 2) {
                if (yfa.j(xmlPullParser, vnf.g)) {
                    z = true;
                } else if (yfa.j(xmlPullParser, vnf.j)) {
                    z2 = true;
                } else if (yfa.j(xmlPullParser, vnf.c)) {
                    if (z) {
                        x8gVar.a = yfa.w(xmlPullParser);
                    } else if (z2) {
                        ((b9g) qn2Var.c).b = yfa.w(xmlPullParser);
                    }
                } else if (yfa.j(xmlPullParser, vnf.e)) {
                    if (z) {
                        x8gVar.b = yfa.w(xmlPullParser);
                    } else if (z2) {
                        ((b9g) qn2Var.c).b(yfa.w(xmlPullParser), null);
                    }
                } else if (yfa.j(xmlPullParser, vnf.d)) {
                    if (z) {
                        x8gVar.c = yfa.w(xmlPullParser);
                    } else if (z2) {
                        ((b9g) qn2Var.c).f = yfa.w(xmlPullParser);
                    }
                } else if (yfa.j(xmlPullParser, vnf.f)) {
                    if (z) {
                        x8gVar.e = yfa.w(xmlPullParser);
                    } else if (z2) {
                        ((b9g) qn2Var.c).e = yfa.w(xmlPullParser);
                    }
                } else if (yfa.j(xmlPullParser, vnf.l)) {
                    if (z2) {
                        b9g b9gVar = (b9g) qn2Var.c;
                        String w = yfa.w(xmlPullParser);
                        if (w != null) {
                            b9gVar.m.add(w);
                        }
                    }
                } else if (yfa.j(xmlPullParser, vnf.k)) {
                    if (z2) {
                        ((b9g) qn2Var.c).c = yfa.w(xmlPullParser);
                    }
                } else if (yfa.j(xmlPullParser, vnf.h)) {
                    ((z8g) qn2Var.b).b = xmlPullParser.getAttributeValue(null, "rdf:resource");
                } else if (yfa.j(xmlPullParser, vnf.i) && z) {
                    x8gVar.f = yfa.w(xmlPullParser);
                }
            } else if (eventType == 3 && yfa.j(xmlPullParser, vnf.j)) {
                qn2Var.b();
                z2 = false;
            } else if (eventType == 3 && yfa.j(xmlPullParser, vnf.g)) {
                z = false;
            }
            eventType = xmlPullParser.next();
        }
        return qn2Var.a();
    }

    public static final vkb n(vkb vkbVar) {
        wma wmaVar = vkbVar.o.o;
        while (true) {
            wma v = wmaVar.v();
            wma wmaVar2 = null;
            if ((v != null ? v.h : null) == null) {
                vkb c1 = ((wdd) wmaVar.F.e).c1();
                c1.getClass();
                return c1;
            }
            wma v2 = wmaVar.v();
            if (v2 != null) {
                wmaVar2 = v2.h;
            }
            wmaVar2.getClass();
            wma v3 = wmaVar.v();
            v3.getClass();
            wmaVar = v3.h;
            wmaVar.getClass();
        }
    }

    public static int o(Context context, String str) {
        context.getClass();
        str.getClass();
        return context.getColor(p(str));
    }

    public static int p(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        return hashCode != 65 ? hashCode != 81 ? hashCode != 2432 ? hashCode != 2562 ? hashCode != 2642 ? (hashCode == 2764 && str.equals("WC")) ? R.color.releg : R.color.playoff_for_prom_to_y : !str.equals("SE") ? R.color.playoff_for_prom_to_y : R.color.playoff_for_prom_to_x : !str.equals(PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER) ? R.color.playoff_for_prom_to_y : R.color.playoff_for_prom_to_x : !str.equals("LL") ? R.color.playoff_for_prom_to_y : R.color.releg : !str.equals("Q") ? R.color.playoff_for_prom_to_y : R.color.playoff_for_prom_to_x : !str.equals("A") ? R.color.playoff_for_prom_to_y : R.color.playoff_for_prom_to_x;
    }

    public static String q(Context context, String str) {
        context.getClass();
        Integer r = r(str);
        return r != null ? context.getString(r.intValue()) : str;
    }

    public static Integer r(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == 65) {
            if (str.equals("A")) {
                return Integer.valueOf(R.string.tennis_seeding_after_withdrawal);
            }
            return null;
        }
        if (hashCode == 81) {
            if (str.equals("Q")) {
                return Integer.valueOf(R.string.tennis_seeding_qualifier);
            }
            return null;
        }
        if (hashCode == 2432) {
            if (str.equals("LL")) {
                return Integer.valueOf(R.string.tennis_seeding_lucky_loser);
            }
            return null;
        }
        if (hashCode == 2562) {
            if (str.equals(PlayerKt.AMERICAN_FOOTBALL_PUNT_RETURNER)) {
                return Integer.valueOf(R.string.tennis_seeding_protected_ranking);
            }
            return null;
        }
        if (hashCode == 2642) {
            if (str.equals("SE")) {
                return Integer.valueOf(R.string.tennis_seeding_seeded);
            }
            return null;
        }
        if (hashCode == 2764 && str.equals("WC")) {
            return Integer.valueOf(R.string.tennis_seeding_wild_card);
        }
        return null;
    }

    public static final boolean s(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static final boolean t(e7g e7gVar) {
        long j = e7gVar.e;
        return (j >>> 32) == (4294967295L & j) && j == e7gVar.f && j == e7gVar.g && j == e7gVar.h;
    }

    public static ArrayList u(Context context, List list) {
        String string;
        context.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TennisSurfaceType tennisSurfaceType = (TennisSurfaceType) it.next();
            String name = tennisSurfaceType.name();
            Set set = f5k.a;
            switch (e5k.a[tennisSurfaceType.ordinal()]) {
                case 1:
                    string = context.getString(R.string.tennis_all_surfaces);
                    string.getClass();
                    break;
                case 2:
                    string = context.getString(R.string.tennis_surface_grass);
                    string.getClass();
                    break;
                case 3:
                    string = context.getString(R.string.tennis_surface_clay);
                    string.getClass();
                    break;
                case 4:
                    string = context.getString(R.string.tennis_surface_hard);
                    string.getClass();
                    break;
                case 5:
                    string = context.getString(R.string.tennis_surface_indoor_hardcourt);
                    string.getClass();
                    break;
                case 6:
                    string = context.getString(R.string.tennis_surface_outdoor_hardcourt);
                    string.getClass();
                    break;
                default:
                    zzl.b();
                    return null;
            }
            arrayList.add(new vt2(name, string, false, new tc3(1308717653, new g31(tennisSurfaceType, 8), true), null, null, null, 244));
        }
        return arrayList;
    }

    public static final int v(gpa gpaVar, ewd ewdVar) {
        return (int) (ewdVar == ewd.a ? gpaVar.t & 4294967295L : gpaVar.t >> 32);
    }

    public static final yj0 w(Object obj, of3 of3Var, int i) {
        dt dtVar = yj0.v;
        op3 op3Var = (i & 8) != 0 ? mp3.b : mp3.a;
        av8 av8Var = (av8) of3Var;
        apf a2 = ajh.a((Context) av8Var.k(nz.b));
        hj0 hj0Var = (hj0) av8Var.k(rgb.a);
        av8Var.d0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            nt9 c2 = bjk.c(obj, av8Var);
            bjk.f(c2);
            ij0 ij0Var = new ij0(a2, c2, hj0Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new yj0(ij0Var);
                av8Var.n0(O);
            }
            yj0 yj0Var = (yj0) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = hz8.G(g.a, av8Var);
                av8Var.n0(O2);
            }
            yj0Var.l = (ku3) O2;
            yj0Var.m = dtVar;
            yj0Var.n = null;
            yj0Var.o = op3Var;
            yj0Var.p = 1;
            yj0Var.q = bjk.a(av8Var);
            yj0Var.m(ij0Var);
            av8Var.s(false);
            return yj0Var;
        } finally {
            Trace.endSection();
        }
    }

    public static void x(PAGRequest pAGRequest, String str, MediationAdConfiguration mediationAdConfiguration) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String watermark = mediationAdConfiguration.getWatermark();
        if (TextUtils.isEmpty(watermark)) {
            return;
        }
        Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new HashMap<>();
        }
        extraInfo.put("admob_watermark", watermark);
        pAGRequest.setExtraInfo(extraInfo);
    }

    public static void y(FragmentActivity fragmentActivity, int i, Highlight highlight, String str, boolean z) {
        fragmentActivity.getClass();
        highlight.getClass();
        if (z) {
            boolean z2 = true;
            if (!bea.b) {
                try {
                    if (WebView.getCurrentWebViewPackage() == null) {
                        z2 = false;
                    }
                    bea.b = z2;
                } catch (Exception unused) {
                    z2 = false;
                }
            }
            if (z2) {
                MediaExternalVideoDialog mediaExternalVideoDialog = new MediaExternalVideoDialog();
                Bundle bundle = new Bundle();
                bundle.putInt("POST_ID", i);
                bundle.putSerializable("HIGHLIGHT", highlight);
                mediaExternalVideoDialog.setArguments(bundle);
                mediaExternalVideoDialog.p(fragmentActivity.k(), "");
                return;
            }
        }
        rfo.G(highlight, fragmentActivity, new b1c(2), str);
    }

    public static wci z(FantasyPlayer fantasyPlayer, Context context, String str, String str2) {
        String str3;
        fantasyPlayer.getClass();
        str2.getClass();
        int id = fantasyPlayer.getPlayer().getId();
        String t = tba.t(fantasyPlayer.getPlayer());
        int id2 = fantasyPlayer.getTeam().getId();
        f7a f7aVar = rz6.g;
        String position = fantasyPlayer.getPosition();
        f7aVar.getClass();
        String str4 = f7a.g(position).a;
        Float price = fantasyPlayer.getPrice();
        if (price != null) {
            float floatValue = price.floatValue();
            Locale d2 = dla.d();
            Set set = o84.a;
            str3 = String.format(d2, "%s%.1fM", Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(floatValue)}, 2));
        } else {
            str3 = "-";
        }
        String o = lnb.o(str4, " · ", str3);
        vel velVar = vel.a;
        zdl zdlVar = (zdl) ((Map) vel.i.getValue()).get(Integer.valueOf(fantasyPlayer.getTeam().getId()));
        if (zdlVar == null) {
            zdlVar = vel.b;
        }
        return new wci(id, t, id2, str, o, str2, zdlVar);
    }
}
