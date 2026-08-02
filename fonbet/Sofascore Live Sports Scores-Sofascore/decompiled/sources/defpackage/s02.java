package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.EventStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.BaseballSeasonPitchesPerspective;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.view.follownotification.FollowButton;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class s02 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, a.o};
    public static final tc3 b = new tc3(636288403, new ad3(0), false);
    public static final tc3 c = new tc3(-1357803046, new ad3(1), false);
    public static final tc3 d;
    public static final y73 e;
    public static f4g f;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;

    static {
        int i2 = 13;
        d = new tc3(-160478683, new qd3(i2), false);
        e = new y73(i2);
    }

    public static final void A(v23 v23Var, tkh tkhVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-996645579);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(tkhVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(49.0f, utcVar, true));
            String a2 = tkhVar.e.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, v23Var.a(29.0f, utcVar, true));
            B(tkhVar, bkh.c(bkh.d(utcVar, 1.0f), 0.6f), 0L, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, ((i3 >> 3) & 14) | 48);
            nq8.h(av8Var, v23Var.a(24.0f, utcVar, true));
            y(0, 2, av8Var, tkhVar.b, null);
            nq8.h(av8Var, v23Var.a(62.0f, utcVar, true));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(v23Var, tkhVar, i2, 25);
        }
    }

    public static final void B(final tkh tkhVar, final xtc xtcVar, long j, long j2, long j3, long j4, float f2, of3 of3Var, final int i2) {
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final float f3;
        long D;
        long D2;
        int i3;
        final float f4;
        long D3;
        long D4;
        final long j9;
        final long j10;
        final long j11;
        gv9<lmi> gv9Var = tkhVar.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2012878577);
        int i4 = (i2 & 6) == 0 ? (av8Var.g(tkhVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i5 = i4 | 1572864;
        if (av8Var.T(i5 & 1, (599187 & i5) != 599186)) {
            av8Var.Y();
            if ((i2 & 1) == 0 || av8Var.B()) {
                D = lz.D(R.color.darken_overlay_2, av8Var);
                D2 = lz.D(R.color.on_color_highlight_2, av8Var);
                i3 = i5 & (-524161);
                f4 = 14.0f;
                D3 = lz.D(R.color.on_color_primary, av8Var);
                D4 = lz.D(R.color.on_color_primary, av8Var);
            } else {
                av8Var.W();
                D = j;
                D2 = j2;
                D4 = j4;
                f4 = f2;
                i3 = i5 & (-524161);
                D3 = j3;
            }
            av8Var.t();
            av8Var.d0(1641040114);
            final ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            for (lmi lmiVar : gv9Var) {
                int i6 = lmiVar.b;
                vv3 vv3Var = lmiVar.a;
                arrayList.add(haa.t(i6 < 0 ? vv3Var.a : vv3Var.b, 0, av8Var));
            }
            av8Var.s(false);
            final ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                arrayList2.add(Float.valueOf(((Math.abs(((lmi) it.next()).b) / 50.0f) * 0.5f) + 0.5f));
            }
            boolean z = av8Var.k(dh3.n) == ema.b;
            final boolean z2 = z;
            long j12 = D4;
            boolean h2 = av8Var.h(z) | ((i3 & 3670016) == 1048576) | av8Var.i(arrayList2) | av8Var.f(D) | av8Var.f(D2) | av8Var.f(D3) | av8Var.i(arrayList) | av8Var.f(j12);
            Object O = av8Var.O();
            if (h2 || O == nf3.a) {
                j9 = j12;
                j10 = D3;
                j5 = D;
                j11 = D2;
                O = new Function1() { // from class: ukh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        final float f5 = f4;
                        final ArrayList arrayList3 = arrayList2;
                        final long j13 = j5;
                        final long j14 = j11;
                        final long j15 = j10;
                        final ArrayList arrayList4 = arrayList;
                        final long j16 = j9;
                        cga.I(ha5Var, z2, new Function1() { // from class: wkh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long j17 = j16;
                                ha5 ha5Var2 = (ha5) obj2;
                                ha5Var2.getClass();
                                float min = Math.min(Float.intBitsToFloat((int) (ha5Var2.n() >> 32)), Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)));
                                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) / 2.0f;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) / 2.0f;
                                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                                float f6 = min / 2.0f;
                                float f7 = 0.7f * f6;
                                float f8 = f6 * 0.85f;
                                float H0 = ha5Var2.H0(f5);
                                float f9 = H0 / 2.0f;
                                int i7 = 0;
                                IntRange intRange = new IntRange(0, 4, 1);
                                ArrayList arrayList5 = new ArrayList(k13.r(intRange, 10));
                                v6a it2 = intRange.iterator();
                                while (it2.c) {
                                    arrayList5.add(new dnd(s02.L(floatToRawIntBits, it2.nextInt(), f7)));
                                    H0 = H0;
                                }
                                float f10 = H0;
                                IntRange intRange2 = new IntRange(0, 4, 1);
                                ArrayList arrayList6 = new ArrayList(k13.r(intRange2, 10));
                                v6a it3 = intRange2.iterator();
                                while (it3.c) {
                                    arrayList6.add(new dnd(s02.L(floatToRawIntBits, it3.nextInt(), f8)));
                                }
                                ArrayList arrayList7 = arrayList3;
                                ArrayList arrayList8 = new ArrayList(k13.r(arrayList7, 10));
                                Iterator it4 = arrayList7.iterator();
                                int i8 = 0;
                                while (it4.hasNext()) {
                                    Object next = it4.next();
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    arrayList8.add(new dnd(s02.L(floatToRawIntBits, i8, ((Number) next).floatValue() * f7)));
                                    i8 = i9;
                                }
                                b20 a2 = e20.a();
                                a2.g(Float.intBitsToFloat((int) (((dnd) CollectionsKt.Y(arrayList8)).a >> 32)), Float.intBitsToFloat((int) (((dnd) CollectionsKt.Y(arrayList8)).a & 4294967295L)));
                                Iterator it5 = arrayList8.iterator();
                                while (it5.hasNext()) {
                                    long j18 = ((dnd) it5.next()).a;
                                    a2.f(Float.intBitsToFloat((int) (j18 >> 32)), Float.intBitsToFloat((int) (j18 & 4294967295L)));
                                }
                                a2.d();
                                b20 a3 = e20.a();
                                a3.g(Float.intBitsToFloat((int) (((dnd) CollectionsKt.Y(arrayList5)).a >> 32)), Float.intBitsToFloat((int) (((dnd) CollectionsKt.Y(arrayList5)).a & 4294967295L)));
                                Iterator it6 = arrayList5.iterator();
                                while (it6.hasNext()) {
                                    long j19 = ((dnd) it6.next()).a;
                                    a3.f(Float.intBitsToFloat((int) (j19 >> 32)), Float.intBitsToFloat((int) (j19 & 4294967295L)));
                                }
                                a3.d();
                                long j20 = j13;
                                e28 e28Var = e28.a;
                                ha5.X0(ha5Var2, a3, j20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e28Var, 52);
                                ha5.X0(ha5Var2, a2, j14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e28Var, 52);
                                ha5.X0(ha5Var2, a2, j15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(ha5Var2.H0(2.5f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 52);
                                Iterator it7 = arrayList4.iterator();
                                while (it7.hasNext()) {
                                    Object next2 = it7.next();
                                    int i10 = i7 + 1;
                                    if (i7 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    d7e d7eVar = (d7e) next2;
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (((dnd) arrayList6.get(i7)).a >> 32)) - f9;
                                    float intBitsToFloat4 = Float.intBitsToFloat((int) (((dnd) arrayList6.get(i7)).a & 4294967295L)) - f9;
                                    ((hpo) ha5Var2.L0().a).I(intBitsToFloat3, intBitsToFloat4);
                                    try {
                                        ha5 ha5Var3 = ha5Var2;
                                        try {
                                            d7e.h(d7eVar, ha5Var3, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(j17, 5), 2);
                                            ha5Var2 = ha5Var3;
                                            ((hpo) ha5Var2.L0().a).I(-intBitsToFloat3, -intBitsToFloat4);
                                            i7 = i10;
                                        } catch (Throwable th) {
                                            th = th;
                                            ha5Var2 = ha5Var3;
                                            ((hpo) ha5Var2.L0().a).I(-intBitsToFloat3, -intBitsToFloat4);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                return Unit.a;
                            }
                        });
                        return Unit.a;
                    }
                };
                av8Var.n0(O);
            } else {
                j9 = j12;
                j10 = D3;
                j5 = D;
                j11 = D2;
            }
            lz.d((i3 >> 3) & 14, av8Var, xtcVar, (Function1) O);
            f3 = f4;
            j6 = j11;
            j7 = j10;
            j8 = j9;
        } else {
            av8Var.W();
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            f3 = f2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final long j13 = j5;
            u.d = new Function2() { // from class: vkh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s02.B(tkh.this, xtcVar, j13, j6, j7, j8, f3, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void C(sd7 sd7Var, mj7 mj7Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1256708311);
        int i3 = i2 | (av8Var.e(sd7Var == null ? -1 : sd7Var.ordinal()) ? 4 : 2) | (av8Var.g(mj7Var) ? 32 : 16);
        int i4 = 1;
        int i5 = 0;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            long j = mj7Var.d;
            int i6 = mj7Var.c;
            String str = mj7Var.b;
            e1d N = hda.N(j, av8Var, 0);
            boolean f2 = av8Var.f(j);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (f2 || O == a99Var) {
                O = goh.b(new br6(mj7Var, N, i5));
                av8Var.n0(O);
            }
            cdi cdiVar = (cdi) O;
            boolean f3 = av8Var.f(j);
            Object O2 = av8Var.O();
            if (f3 || O2 == a99Var) {
                O2 = goh.b(new br6(mj7Var, N, i4));
                av8Var.n0(O2);
            }
            cdi cdiVar2 = (cdi) O2;
            if (((Boolean) cdiVar.getValue()).booleanValue() || ((Boolean) cdiVar2.getValue()).booleanValue() || sd7Var != null) {
                av8Var.d0(633315921);
                u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtcVar2 = xtcVar;
                xtc C = fqj.C(av8Var, xtcVar2);
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
                if (((Boolean) cdiVar2.getValue()).booleanValue()) {
                    av8Var.d0(1039915394);
                    d2a.i(oea.w(R.string.transfer_deadline_closed_info, new Object[]{f5p.C(context, i6, str)}, av8Var), null, lz.D(R.color.error, av8Var), null, av8Var, 0, 10);
                    av8Var.s(false);
                } else if (((Boolean) cdiVar.getValue()).booleanValue()) {
                    av8Var.d0(1039924003);
                    d2a.i(oea.w(R.string.transfer_deadline_closing_info, new Object[]{f5p.C(context, i6, str)}, av8Var), null, lz.D(R.color.alert, av8Var), null, av8Var, 0, 10);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-2121854550);
                    av8Var.s(false);
                }
                if (sd7Var == null) {
                    av8Var.d0(-2121818653);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-2121818652);
                    d2a.i(oea.w(R.string.fantasy_team_player_status_alert, new Object[]{f5p.C(context, i6, str)}, av8Var), null, lz.D(sd7Var.b, av8Var), null, av8Var, 0, 10);
                    av8Var.s(false);
                }
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var.d0(634307673);
                av8Var.s(false);
                xtcVar2 = xtcVar;
            }
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cyb(sd7Var, mj7Var, xtcVar2, i2, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static boolean D(CupTree cupTree) {
        ?? r0;
        cupTree.getClass();
        List<CupTreeRound> rounds = cupTree.getRounds();
        if (rounds != null) {
            r0 = new ArrayList(k13.r(rounds, 10));
            Iterator it = rounds.iterator();
            while (it.hasNext()) {
                r0.add(Integer.valueOf(((CupTreeRound) it.next()).getOrder()));
            }
        } else {
            r0 = 0;
        }
        if (r0 == 0) {
            r0 = km5.a;
        }
        return CollectionsKt.W0(r0).size() == r0.size();
    }

    public static Object E(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(s02.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        if (r2 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vl1 F(List list, BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective, ll1 ll1Var, kl1 kl1Var, ql1 ql1Var, String str, String str2, Boolean bool, gl1 gl1Var) {
        gv9 W;
        b7 K;
        vl1 vl1Var;
        int i2;
        int i3;
        ql1 a2;
        int i4;
        int i5;
        BaseballSeasonPitchesPerspective baseballSeasonPitchesPerspective2;
        int i6;
        gv9 gv9Var;
        b7 b7Var;
        ql1 ql1Var2;
        ll1 ll1Var2;
        kl1 kl1Var2;
        pl1 z;
        jl1 jl1Var;
        List G0;
        boolean z2;
        m91 m91Var;
        int i7;
        Iterator it;
        ol1 ol1Var;
        Iterator it2;
        Iterator it3;
        dnd dndVar;
        Integer valueOf;
        int i8;
        List G02;
        List G03;
        String name;
        String name2;
        String name3;
        String name4;
        String str3;
        kl1 kl1Var3;
        String e2;
        m91 m91Var2;
        m91 m91Var3;
        Float valueOf2;
        LinkedHashMap linkedHashMap;
        int i9;
        int i10;
        String str4;
        Integer valueOf3;
        int intValue;
        int i11;
        Iterator it4;
        int i12;
        rl1 rl1Var;
        int i13;
        Iterator it5;
        b7 b7Var2;
        ql1 ql1Var3;
        ll1 ll1Var3;
        rl1 rl1Var2;
        gv9 gv9Var2;
        kl1 kl1Var4 = kl1Var;
        Boolean bool2 = bool;
        int[] iArr = hl1.a;
        int i14 = iArr[baseballSeasonPitchesPerspective.ordinal()];
        if (i14 == 1) {
            xbb b2 = kotlin.collections.a.b();
            b2.add(ll1.a);
            b2.add(ll1.b);
            b2.add(ll1.d);
            if (gl1Var == gl1.a) {
                b2.add(ll1.f);
            }
            W = l6g.W(kotlin.collections.a.a(b2));
        } else {
            if (i14 != 2) {
                zzl.b();
                return null;
            }
            xbb b3 = kotlin.collections.a.b();
            b3.add(ll1.c);
            b3.add(ll1.d);
            if (gl1Var == gl1.a) {
                b3.add(ll1.e);
            }
            b3.add(ll1.a);
            b3.add(ll1.b);
            W = l6g.W(kotlin.collections.a.a(b3));
        }
        ll1 ll1Var4 = CollectionsKt.R(W, ll1Var) ? ll1Var : null;
        if (ll1Var4 == null) {
            ll1Var4 = (ll1) CollectionsKt.Y(W);
        }
        int ordinal = ll1Var4.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            K = l6g.K(kl1.b, kl1.a);
        } else if (ordinal == 2) {
            K = l6g.K(kl1.c, kl1.a);
        } else {
            if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                zzl.b();
                return null;
            }
            K = l6g.K(kl1.d, kl1.e);
        }
        int ordinal2 = ll1Var4.ordinal();
        boolean z3 = ordinal2 == 3 || ordinal2 == 4 || ordinal2 == 5;
        ql1 ql1Var4 = ql1Var == null ? new ql1(kl1.b, kl1.d) : ql1Var;
        kl1 kl1Var5 = z3 ? ql1Var4.b : ql1Var4.a;
        if (kl1Var4 != null) {
            if (!K.contains(kl1Var4)) {
                kl1Var4 = null;
            }
        }
        if (!K.contains(kl1Var5)) {
            kl1Var5 = null;
        }
        kl1Var4 = kl1Var5 == null ? (kl1) CollectionsKt.Y(K) : kl1Var5;
        if (z3) {
            vl1Var = null;
            i2 = 1;
            a2 = ql1.a(ql1Var4, null, kl1Var4, 1);
            i3 = 2;
        } else {
            vl1Var = null;
            i2 = 1;
            i3 = 2;
            a2 = ql1.a(ql1Var4, kl1Var4, null, 2);
        }
        vl1 vl1Var2 = vl1Var;
        int i15 = iArr[baseballSeasonPitchesPerspective.ordinal()];
        if (i15 == i2) {
            i4 = R.drawable.ic_baseball_pitch;
        } else {
            if (i15 != i3) {
                zzl.b();
                return vl1Var2;
            }
            i4 = R.drawable.ic_baseball_bat;
        }
        int i16 = iArr[baseballSeasonPitchesPerspective.ordinal()];
        if (i16 == i2) {
            i5 = R.string.baseball_pitching_charts;
        } else {
            if (i16 != i3) {
                zzl.b();
                return vl1Var2;
            }
            i5 = R.string.baseball_batting_charts;
        }
        if (kl1Var4 != kl1.a) {
            baseballSeasonPitchesPerspective2 = baseballSeasonPitchesPerspective;
            i6 = i5;
            gv9Var = W;
            b7Var = K;
            ql1Var2 = a2;
            ll1Var2 = ll1Var4;
            int ordinal3 = ll1Var2.ordinal();
            if (ordinal3 == 0) {
                kl1Var2 = kl1Var4;
                z = zm2.z(list, str, str2, bool2, gl1Var);
            } else {
                if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        String str5 = "0";
                        if (ordinal3 == 3) {
                            Set set = dm1.a;
                            boolean z4 = kl1Var4 == kl1.e;
                            m91 valueOf4 = str != null ? m91.valueOf(str) : null;
                            l91 valueOf5 = str2 != null ? l91.valueOf(str2) : null;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (((wl1) obj).h != null) {
                                    arrayList.add(obj);
                                }
                            }
                            List H = t62.H(arrayList, valueOf4, valueOf5);
                            if (H.isEmpty()) {
                                H = null;
                            }
                            if (H == null) {
                                if (valueOf4 != null && Intrinsics.c(bool2, Boolean.FALSE)) {
                                    m91Var2 = null;
                                    H = t62.I(arrayList, null, valueOf5, 1);
                                } else if (valueOf5 == null || !Intrinsics.c(bool2, Boolean.TRUE)) {
                                    H = arrayList;
                                    valueOf5 = null;
                                    m91Var2 = null;
                                } else {
                                    H = t62.I(arrayList, valueOf4, null, 2);
                                    m91Var2 = valueOf4;
                                    valueOf5 = null;
                                }
                                valueOf4 = m91Var2;
                            }
                            int size = H.size();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj2 : H) {
                                Integer valueOf6 = Integer.valueOf(yid.m(((wl1) obj2).h));
                                Object obj3 = linkedHashMap2.get(valueOf6);
                                if (obj3 == null) {
                                    obj3 = new ArrayList();
                                    linkedHashMap2.put(valueOf6, obj3);
                                }
                                ((List) obj3).add(obj2);
                            }
                            Iterator it6 = linkedHashMap2.entrySet().iterator();
                            if (it6.hasNext()) {
                                valueOf = Integer.valueOf(((List) ((Map.Entry) it6.next()).getValue()).size());
                                while (it6.hasNext()) {
                                    Integer valueOf7 = Integer.valueOf(((List) ((Map.Entry) it6.next()).getValue()).size());
                                    if (valueOf.compareTo(valueOf7) < 0) {
                                        valueOf = valueOf7;
                                    }
                                }
                            } else {
                                valueOf = null;
                            }
                            if (valueOf == null || (i8 = valueOf.intValue()) < 1) {
                                i8 = 1;
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(sub.c(linkedHashMap2.size()));
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                Object key = entry.getKey();
                                int size2 = ((List) entry.getValue()).size();
                                Regex regex = yid.a;
                                boolean z5 = z4;
                                if (z5) {
                                    str3 = str5;
                                    e2 = String.valueOf(size2);
                                    kl1Var3 = kl1Var4;
                                } else {
                                    str3 = str5;
                                    kl1Var3 = kl1Var4;
                                    e2 = rei.e(Double.valueOf((size2 / size) * 100.0d), 0, 6);
                                }
                                linkedHashMap3.put(key, new tl1(e2, size2 / i8));
                                z4 = z5;
                                str5 = str3;
                                kl1Var4 = kl1Var3;
                            }
                            boolean z6 = z4;
                            kl1Var2 = kl1Var4;
                            String str6 = str5;
                            tee X = l6g.X(linkedHashMap3);
                            if (valueOf5 != null) {
                                List<wl1> I = t62.I(arrayList, null, valueOf5, 1);
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                for (wl1 wl1Var : I) {
                                    wl1Var.getClass();
                                    m91 m91Var4 = wl1Var.a;
                                    if (m91Var4 != null) {
                                        linkedHashSet.add(m91Var4);
                                    }
                                }
                                G02 = CollectionsKt.G0(linkedHashSet);
                            } else {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                Iterator it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    wl1 wl1Var2 = (wl1) it7.next();
                                    wl1Var2.getClass();
                                    m91 m91Var5 = wl1Var2.a;
                                    if (m91Var5 != null) {
                                        linkedHashSet2.add(m91Var5);
                                    }
                                }
                                G02 = CollectionsKt.G0(linkedHashSet2);
                            }
                            if (valueOf4 != null) {
                                List<wl1> I2 = t62.I(arrayList, valueOf4, null, 2);
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                for (wl1 wl1Var3 : I2) {
                                    wl1Var3.getClass();
                                    l91 l91Var = wl1Var3.b;
                                    if (l91Var != null) {
                                        linkedHashSet3.add(l91Var);
                                    }
                                }
                                G03 = CollectionsKt.G0(linkedHashSet3);
                            } else {
                                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                Iterator it8 = arrayList.iterator();
                                while (it8.hasNext()) {
                                    wl1 wl1Var4 = (wl1) it8.next();
                                    wl1Var4.getClass();
                                    l91 l91Var2 = wl1Var4.b;
                                    if (l91Var2 != null) {
                                        linkedHashSet4.add(l91Var2);
                                    }
                                }
                                G03 = CollectionsKt.G0(linkedHashSet4);
                            }
                            gv9 W2 = l6g.W(t62.E(G02, false, null));
                            if (valueOf4 == null || (name4 = valueOf4.name()) == null) {
                                m91 m91Var6 = (m91) CollectionsKt.F0(G02);
                                name = m91Var6 != null ? m91Var6.name() : null;
                            } else {
                                name = name4;
                            }
                            nl1 nl1Var = new nl1(R.string.baseball_pitch_type, W2, name);
                            gv9 W3 = l6g.W(t62.D(G03, false, null));
                            if (valueOf5 == null || (name3 = valueOf5.name()) == null) {
                                l91 l91Var3 = (l91) CollectionsKt.F0(G03);
                                name2 = l91Var3 != null ? l91Var3.name() : null;
                            } else {
                                name2 = name3;
                            }
                            bool2 = bool;
                            jl1Var = new ul1(X, nl1Var, new nl1(R.string.baseball_pitch_outcome, W3, name2), z6 ? str6 : "-");
                        } else {
                            if (ordinal3 != 4 && ordinal3 != 5) {
                                zzl.b();
                                return null;
                            }
                            Set set2 = dm1.a;
                            boolean z7 = ll1Var == ll1.f;
                            boolean z8 = kl1Var4 == kl1.e;
                            Set set3 = dm1.a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj4 : list) {
                                l91 l91Var4 = ((wl1) obj4).b;
                                if (Intrinsics.c(l91Var4 != null ? Boolean.valueOf(set3.contains(l91Var4) || dm1.b.contains(l91Var4)) : null, Boolean.TRUE)) {
                                    arrayList2.add(obj4);
                                }
                            }
                            m91 valueOf8 = str != null ? m91.valueOf(str) : null;
                            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                wl1 wl1Var5 = (wl1) it9.next();
                                wl1Var5.getClass();
                                m91 m91Var7 = wl1Var5.a;
                                if (m91Var7 != null) {
                                    linkedHashSet5.add(m91Var7);
                                }
                            }
                            List G04 = CollectionsKt.G0(linkedHashSet5);
                            List I3 = t62.I(arrayList2, valueOf8, null, 2);
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            for (Object obj5 : I3) {
                                Integer valueOf9 = Integer.valueOf(yid.m(((wl1) obj5).h));
                                Object obj6 = linkedHashMap4.get(valueOf9);
                                if (obj6 == null) {
                                    ArrayList arrayList3 = new ArrayList();
                                    linkedHashMap4.put(valueOf9, arrayList3);
                                    obj6 = arrayList3;
                                }
                                ((List) obj6).add(obj5);
                            }
                            if (z8) {
                                LinkedHashMap linkedHashMap5 = new LinkedHashMap(sub.c(linkedHashMap4.size()));
                                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                                    Object key2 = entry2.getKey();
                                    List list2 = (List) entry2.getValue();
                                    if (list2 == null || !list2.isEmpty()) {
                                        Iterator it10 = list2.iterator();
                                        i11 = 0;
                                        while (it10.hasNext()) {
                                            if (CollectionsKt.R(set3, ((wl1) it10.next()).b) && (i11 = i11 + 1) < 0) {
                                                b.p();
                                                throw null;
                                            }
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                    linkedHashMap5.put(key2, Integer.valueOf(i11));
                                }
                                Iterator it11 = linkedHashMap5.entrySet().iterator();
                                if (it11.hasNext()) {
                                    valueOf3 = Integer.valueOf(((Number) ((Map.Entry) it11.next()).getValue()).intValue());
                                    while (it11.hasNext()) {
                                        Integer valueOf10 = Integer.valueOf(((Number) ((Map.Entry) it11.next()).getValue()).intValue());
                                        if (valueOf3.compareTo(valueOf10) < 0) {
                                            valueOf3 = valueOf10;
                                        }
                                    }
                                } else {
                                    valueOf3 = null;
                                }
                                int i17 = (valueOf3 == null || (intValue = valueOf3.intValue()) < 1) ? 1 : intValue;
                                linkedHashMap = new LinkedHashMap(sub.c(linkedHashMap5.size()));
                                for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                                    Object key3 = entry3.getKey();
                                    int intValue2 = ((Number) entry3.getValue()).intValue();
                                    float f2 = intValue2 / i17;
                                    String valueOf11 = String.valueOf(intValue2);
                                    if (z7) {
                                        f2 = 1.0f - f2;
                                    }
                                    linkedHashMap.put(key3, new tl1(valueOf11, f2));
                                }
                                m91Var3 = valueOf8;
                            } else {
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap(sub.c(linkedHashMap4.size()));
                                for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                                    Object key4 = entry4.getKey();
                                    List list3 = (List) entry4.getValue();
                                    if (list3 == null || !list3.isEmpty()) {
                                        Iterator it12 = list3.iterator();
                                        i9 = 0;
                                        while (it12.hasNext()) {
                                            m91 m91Var8 = valueOf8;
                                            boolean z9 = z7;
                                            if (CollectionsKt.R(set3, ((wl1) it12.next()).b) && (i9 = i9 + 1) < 0) {
                                                b.p();
                                                throw null;
                                            }
                                            z7 = z9;
                                            valueOf8 = m91Var8;
                                        }
                                    } else {
                                        i9 = 0;
                                    }
                                    m91 m91Var9 = valueOf8;
                                    boolean z10 = z7;
                                    float f3 = i9;
                                    int size3 = list3.size();
                                    if (size3 < 1) {
                                        size3 = 1;
                                    }
                                    linkedHashMap6.put(key4, Float.valueOf(f3 / size3));
                                    z7 = z10;
                                    valueOf8 = m91Var9;
                                }
                                m91Var3 = valueOf8;
                                boolean z11 = z7;
                                Iterator it13 = linkedHashMap6.entrySet().iterator();
                                if (it13.hasNext()) {
                                    float floatValue = ((Number) ((Map.Entry) it13.next()).getValue()).floatValue();
                                    while (it13.hasNext()) {
                                        floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it13.next()).getValue()).floatValue());
                                    }
                                    valueOf2 = Float.valueOf(floatValue);
                                } else {
                                    valueOf2 = null;
                                }
                                float f4 = 0.001f;
                                if (valueOf2 != null) {
                                    float floatValue2 = valueOf2.floatValue();
                                    if (floatValue2 >= 0.001f) {
                                        f4 = floatValue2;
                                    }
                                }
                                linkedHashMap = new LinkedHashMap(sub.c(linkedHashMap6.size()));
                                for (Map.Entry entry5 : linkedHashMap6.entrySet()) {
                                    Object key5 = entry5.getKey();
                                    float floatValue3 = ((Number) entry5.getValue()).floatValue();
                                    Regex regex2 = yid.a;
                                    linkedHashMap.put(key5, new tl1(StringsKt.V(yid.d("%.3f", Float.valueOf(floatValue3)), "0"), z11 ? 1.0f - (floatValue3 / f4) : floatValue3 / f4));
                                }
                            }
                            tee X2 = l6g.X(linkedHashMap);
                            gv9 W4 = l6g.W(t62.E(G04, false, null));
                            if (m91Var3 == null || (str4 = m91Var3.name()) == null) {
                                m91 m91Var10 = (m91) CollectionsKt.F0(G04);
                                if (m91Var10 != null) {
                                    str4 = m91Var10.name();
                                } else {
                                    i10 = R.string.baseball_pitch_type;
                                    str4 = null;
                                    jl1Var = new ul1(X2, new nl1(i10, W4, str4), null, "-");
                                }
                            }
                            i10 = R.string.baseball_pitch_type;
                            jl1Var = new ul1(X2, new nl1(i10, W4, str4), null, "-");
                        }
                    } else {
                        kl1Var2 = kl1Var4;
                        int G = t62.G(ll1.c, gl1Var);
                        m91 valueOf12 = str2 != null ? m91.valueOf(str2) : null;
                        l91 valueOf13 = str != null ? l91.valueOf(str) : null;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj7 : list) {
                            wl1 wl1Var6 = (wl1) obj7;
                            if (wl1Var6.f != null && wl1Var6.g != null) {
                                arrayList4.add(obj7);
                            }
                        }
                        boolean isEmpty = arrayList4.isEmpty();
                        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                        Iterator it14 = arrayList4.iterator();
                        while (it14.hasNext()) {
                            wl1 wl1Var7 = (wl1) it14.next();
                            wl1Var7.getClass();
                            l91 l91Var5 = wl1Var7.b;
                            if (l91Var5 != null) {
                                linkedHashSet6.add(l91Var5);
                            }
                        }
                        if (valueOf13 != null) {
                            List<wl1> I4 = t62.I(arrayList4, null, valueOf13, 1);
                            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                            for (wl1 wl1Var8 : I4) {
                                wl1Var8.getClass();
                                m91 m91Var11 = wl1Var8.a;
                                if (m91Var11 != null) {
                                    linkedHashSet7.add(m91Var11);
                                }
                            }
                            G0 = CollectionsKt.G0(linkedHashSet7);
                        } else {
                            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                            Iterator it15 = arrayList4.iterator();
                            while (it15.hasNext()) {
                                wl1 wl1Var9 = (wl1) it15.next();
                                wl1Var9.getClass();
                                m91 m91Var12 = wl1Var9.a;
                                if (m91Var12 != null) {
                                    linkedHashSet8.add(m91Var12);
                                }
                            }
                            G0 = CollectionsKt.G0(linkedHashSet8);
                        }
                        if (valueOf12 == null) {
                            bool2 = bool;
                            valueOf12 = !Intrinsics.c(bool2, Boolean.FALSE) ? (m91) CollectionsKt.F0(G0) : null;
                        } else {
                            bool2 = bool;
                        }
                        List I5 = t62.I(arrayList4, valueOf12, null, 2);
                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                        for (Object obj8 : I5) {
                            l91 l91Var6 = ((wl1) obj8).b;
                            Object obj9 = linkedHashMap7.get(l91Var6);
                            if (obj9 == null) {
                                obj9 = new ArrayList();
                                linkedHashMap7.put(l91Var6, obj9);
                            }
                            ((List) obj9).add(obj8);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it16 = linkedHashMap7.entrySet().iterator();
                        while (it16.hasNext()) {
                            Map.Entry entry6 = (Map.Entry) it16.next();
                            l91 l91Var7 = (l91) entry6.getKey();
                            List list4 = (List) entry6.getValue();
                            if (l91Var7 != null) {
                                String name5 = l91Var7.name();
                                z2 = isEmpty;
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it17 = list4.iterator();
                                while (it17.hasNext()) {
                                    m91 m91Var13 = valueOf12;
                                    wl1 wl1Var10 = (wl1) it17.next();
                                    int i18 = G;
                                    Float f5 = wl1Var10.f;
                                    Float f6 = wl1Var10.g;
                                    if (f5 == null || f6 == null) {
                                        it2 = it16;
                                        it3 = it17;
                                        dndVar = null;
                                    } else {
                                        it2 = it16;
                                        it3 = it17;
                                        dndVar = new dnd((Float.floatToRawIntBits(f5.floatValue()) << 32) | (Float.floatToRawIntBits(f6.floatValue()) & 4294967295L));
                                    }
                                    if (dndVar != null) {
                                        arrayList6.add(dndVar);
                                    }
                                    G = i18;
                                    it16 = it2;
                                    it17 = it3;
                                    valueOf12 = m91Var13;
                                }
                                m91Var = valueOf12;
                                i7 = G;
                                it = it16;
                                ol1Var = new ol1(name5, l6g.W(arrayList6), l91Var7.d, valueOf13 == null || valueOf13 == l91Var7);
                            } else {
                                z2 = isEmpty;
                                m91Var = valueOf12;
                                i7 = G;
                                it = it16;
                                ol1Var = null;
                            }
                            if (ol1Var != null) {
                                arrayList5.add(ol1Var);
                            }
                            isEmpty = z2;
                            G = i7;
                            it16 = it;
                            valueOf12 = m91Var;
                        }
                        boolean z12 = isEmpty;
                        m91 m91Var14 = valueOf12;
                        int i19 = G;
                        List F = t62.F(arrayList5);
                        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                        Iterator it18 = F.iterator();
                        while (it18.hasNext()) {
                            linkedHashSet9.add(l91.valueOf(((ol1) it18.next()).a));
                        }
                        boolean z13 = valueOf13 == null || linkedHashSet9.contains(valueOf13);
                        if (!z13) {
                            ArrayList arrayList7 = new ArrayList(k13.r(F, 10));
                            Iterator it19 = F.iterator();
                            while (it19.hasNext()) {
                                arrayList7.add(ol1.a((ol1) it19.next()));
                            }
                            F = arrayList7;
                        }
                        Map a3 = h49.a(new t50(arrayList4, 1));
                        if (m91Var14 == null) {
                            linkedHashSet9 = null;
                        }
                        String str7 = str;
                        ll1 ll1Var5 = ll1.c;
                        gv9 W5 = l6g.W(F);
                        gv9 W6 = l6g.W(t62.D(CollectionsKt.H0(linkedHashSet6, new yl1(a3, 2)), true, linkedHashSet9));
                        if (str7 == null || !z13) {
                            str7 = null;
                        }
                        jl1Var = new pl1(ll1Var5, W5, t62.w(new nl1(R.string.baseball_filter_by_pitch_outcome, W6, str7)), z12 ? null : new nl1(R.string.baseball_pitch_type, l6g.W(t62.E(G0, false, null)), m91Var14 != null ? m91Var14.name() : null), i19);
                    }
                    return new vl1(baseballSeasonPitchesPerspective2, i4, i6, gv9Var, ll1Var2, b7Var, kl1Var2, ql1Var2, bool2, jl1Var);
                }
                kl1Var2 = kl1Var4;
                z = zm2.y(list, str, str2, bool2, gl1Var);
            }
            jl1Var = z;
            return new vl1(baseballSeasonPitchesPerspective2, i4, i6, gv9Var, ll1Var2, b7Var, kl1Var2, ql1Var2, bool2, jl1Var);
        }
        Integer valueOf14 = Integer.valueOf(R.string.baseball_pitch_distribution);
        int G2 = t62.G(ll1Var4, gl1Var);
        int i20 = cm1.a[ll1Var4.ordinal()];
        int i21 = 1;
        if (i20 == 1) {
            baseballSeasonPitchesPerspective2 = baseballSeasonPitchesPerspective;
            if (baseballSeasonPitchesPerspective2 == BaseballSeasonPitchesPerspective.Pitching) {
                b7 K2 = l6g.K(Integer.valueOf(R.string.baseball_pitch_usage), Integer.valueOf(R.string.miles_per_hour_short));
                ArrayList arrayList8 = new ArrayList();
                Iterator it20 = list.iterator();
                while (it20.hasNext()) {
                    Object next = it20.next();
                    Iterator it21 = it20;
                    if (((wl1) next).a != null) {
                        arrayList8.add(next);
                    }
                    it20 = it21;
                }
                int size4 = arrayList8.size();
                if (size4 < 1) {
                    size4 = 1;
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                Iterator it22 = arrayList8.iterator();
                while (it22.hasNext()) {
                    Iterator it23 = it22;
                    Object next2 = it23.next();
                    int i22 = i5;
                    m91 m91Var15 = ((wl1) next2).a;
                    Object obj10 = linkedHashMap8.get(m91Var15);
                    if (obj10 == null) {
                        gv9Var2 = W;
                        ArrayList arrayList9 = new ArrayList();
                        linkedHashMap8.put(m91Var15, arrayList9);
                        obj10 = arrayList9;
                    } else {
                        gv9Var2 = W;
                    }
                    ((List) obj10).add(next2);
                    it22 = it23;
                    i5 = i22;
                    W = gv9Var2;
                }
                i6 = i5;
                gv9Var = W;
                ArrayList arrayList10 = new ArrayList();
                Iterator it24 = linkedHashMap8.entrySet().iterator();
                while (it24.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it24.next();
                    m91 m91Var16 = (m91) entry7.getKey();
                    List list5 = (List) entry7.getValue();
                    if (m91Var16 != null) {
                        it5 = it24;
                        int size5 = list5.size();
                        float f7 = size5 / size4;
                        i13 = size4;
                        int i23 = m91Var16.c;
                        int i24 = m91Var16.d;
                        b7Var2 = K;
                        ql1Var3 = a2;
                        String str8 = size5 + " (" + ao2.A(f7) + ")";
                        double d2 = 0.0d;
                        for (Iterator it25 = list5.iterator(); it25.hasNext(); it25 = it25) {
                            d2 = yid.k(((wl1) it25.next()).c) + d2;
                        }
                        if (size5 < 1) {
                            size5 = 1;
                        }
                        ll1Var3 = ll1Var4;
                        rl1Var2 = new rl1(i23, f7, i24, l6g.K(str8, yid.c("%.1f", Double.valueOf(((d2 / size5) * 1000.0d) / 1609.344d))));
                    } else {
                        i13 = size4;
                        it5 = it24;
                        b7Var2 = K;
                        ql1Var3 = a2;
                        ll1Var3 = ll1Var4;
                        rl1Var2 = null;
                    }
                    if (rl1Var2 != null) {
                        arrayList10.add(rl1Var2);
                    }
                    it24 = it5;
                    size4 = i13;
                    K = b7Var2;
                    a2 = ql1Var3;
                    ll1Var4 = ll1Var3;
                }
                b7Var = K;
                ql1Var2 = a2;
                ll1Var2 = ll1Var4;
                jl1Var = new sl1(R.string.baseball_pitch_type_short, K2, l6g.W(CollectionsKt.H0(arrayList10, new qe8(17))), G2);
            } else {
                i21 = 1;
            }
        } else {
            baseballSeasonPitchesPerspective2 = baseballSeasonPitchesPerspective;
        }
        i6 = i5;
        gv9Var = W;
        b7Var = K;
        ql1Var2 = a2;
        ll1Var2 = ll1Var4;
        if (i20 == i21) {
            b7 K3 = l6g.K(Integer.valueOf(R.string.baseball_pitch_frequency));
            ArrayList arrayList11 = new ArrayList();
            for (Object obj11 : list) {
                if (((wl1) obj11).a != null) {
                    arrayList11.add(obj11);
                }
            }
            int size6 = arrayList11.size();
            int i25 = size6 < 1 ? 1 : size6;
            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
            Iterator it26 = arrayList11.iterator();
            while (it26.hasNext()) {
                Object next3 = it26.next();
                m91 m91Var17 = ((wl1) next3).a;
                Object obj12 = linkedHashMap9.get(m91Var17);
                if (obj12 == null) {
                    obj12 = new ArrayList();
                    linkedHashMap9.put(m91Var17, obj12);
                }
                ((List) obj12).add(next3);
            }
            ArrayList arrayList12 = new ArrayList();
            Iterator it27 = linkedHashMap9.entrySet().iterator();
            while (it27.hasNext()) {
                Map.Entry entry8 = (Map.Entry) it27.next();
                m91 m91Var18 = (m91) entry8.getKey();
                List list6 = (List) entry8.getValue();
                if (m91Var18 != null) {
                    int size7 = list6.size();
                    float f8 = size7 / i25;
                    it4 = it27;
                    i12 = i25;
                    rl1Var = new rl1(m91Var18.c, f8, m91Var18.d, l6g.K(size7 + " (" + ao2.A(f8) + ")"));
                } else {
                    it4 = it27;
                    i12 = i25;
                    rl1Var = null;
                }
                if (rl1Var != null) {
                    arrayList12.add(rl1Var);
                }
                it27 = it4;
                i25 = i12;
            }
            jl1Var = new sl1(R.string.baseball_pitch_type_short, K3, l6g.W(CollectionsKt.H0(arrayList12, new qe8(16))), G2);
        } else if (i20 == 2) {
            b7 K4 = l6g.K(valueOf14);
            ArrayList arrayList13 = new ArrayList();
            for (Object obj13 : list) {
                if (((wl1) obj13).b != null) {
                    arrayList13.add(obj13);
                }
            }
            jl1Var = new sl1(R.string.baseball_outcome, K4, ao2.F(arrayList13), G2);
        } else if (i20 == 3) {
            b7 K5 = l6g.K(valueOf14);
            ArrayList arrayList14 = new ArrayList();
            for (Object obj14 : list) {
                wl1 wl1Var11 = (wl1) obj14;
                if (wl1Var11.f != null && wl1Var11.b != null) {
                    arrayList14.add(obj14);
                }
            }
            jl1Var = new sl1(R.string.baseball_outcome, K5, ao2.F(arrayList14), G2);
        } else {
            jl1Var = null;
        }
        kl1Var2 = kl1Var4;
        return new vl1(baseballSeasonPitchesPerspective2, i4, i6, gv9Var, ll1Var2, b7Var, kl1Var2, ql1Var2, bool2, jl1Var);
    }

    public static Object G(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        a70.p(ljg.j(i2, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static final String H(int i2, Gender gender, Object[] objArr, of3 of3Var, int i3) {
        if ((i3 & 4) != 0) {
            objArr = new Object[0];
        }
        return hkg.Q((Context) ((av8) of3Var).k(nz.b), i2, gender, objArr);
    }

    public static void I(int i2, j9e j9eVar) {
        j9eVar.K(7);
        byte[] bArr = j9eVar.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static String K(int i2) {
        if (i2 == 0) {
            return "Success.";
        }
        if (i2 == 2100) {
            return "The in-progress request failed.";
        }
        if (i2 == 2103) {
            return "The request's progress is no longer being tracked because another request of the same type has been made before the first request completed.";
        }
        if (i2 == 7) {
            return "Network I/O error.";
        }
        if (i2 == 8) {
            return "An internal error has occurred.";
        }
        if (i2 == 2200) {
            return "The Cast Remote Display service could not be created.";
        }
        if (i2 == 2201) {
            return "The Cast Remote Display service was disconnected.";
        }
        switch (i2) {
            case 13:
                return "An unknown, unexpected error has occurred.";
            case 14:
                return "A blocking call was interrupted while waiting and did not run to completion.";
            case 15:
                return "An operation has timed out.";
            default:
                switch (i2) {
                    case 2000:
                        return "Authentication failure.";
                    case 2001:
                        return "An invalid request was made.";
                    case 2002:
                        return "An in-progress request has been canceled, most likely because another action has preempted it.";
                    case 2003:
                        return "The request was disallowed and could not be completed.";
                    case 2004:
                        return "A requested application could not be found.";
                    case 2005:
                        return "A requested application is not currently running.";
                    case 2006:
                        return "A message could not be sent because it is too large.";
                    case 2007:
                        return "A message could not be sent because there is not enough room in the send buffer at this time.";
                    default:
                        if (i2 >= -999 && i2 <= 999) {
                            return i2 != 0 ? i2 != 7 ? i2 != 14 ? i2 != 15 ? CommonStatusCodes.a(i2) : Payload.RESPONSE_TIMEOUT : "INTERRUPTED" : "NETWORK_ERROR" : "SUCCESS";
                        }
                        if (i2 >= 2000 && i2 <= 2049) {
                            if (i2 == 2015) {
                                return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
                            }
                            switch (i2) {
                                case 2000:
                                    return "AUTHENTICATION_FAILED";
                                case 2001:
                                    return "INVALID_REQUEST";
                                case 2002:
                                    return "CANCELED";
                                case 2003:
                                    return "NOT_ALLOWED";
                                case 2004:
                                    return "APPLICATION_NOT_FOUND";
                                case 2005:
                                    return "APPLICATION_NOT_RUNNING";
                                case 2006:
                                    return "MESSAGE_TOO_LARGE";
                                case 2007:
                                    return "MESSAGE_SEND_BUFFER_TOO_FULL";
                                default:
                                    Locale locale = Locale.ROOT;
                                    return ljg.j(i2, "Common cast status code ");
                            }
                        }
                        if (i2 >= 2050 && i2 <= 2059) {
                            Locale locale2 = Locale.ROOT;
                            return ljg.j(i2, "Cast controller status code ");
                        }
                        if (i2 >= 2100 && i2 <= 2109) {
                            Locale locale3 = Locale.ROOT;
                            return ljg.j(i2, "Media control channel status code ");
                        }
                        if (i2 >= 2150 && i2 <= 2169) {
                            Locale locale4 = Locale.ROOT;
                            return ljg.j(i2, "Cast session status code ");
                        }
                        if (i2 >= 2200 && i2 <= 2219) {
                            Locale locale5 = Locale.ROOT;
                            return ljg.j(i2, "Cast remote display status code ");
                        }
                        if (i2 >= 2250 && i2 <= 2299) {
                            Locale locale6 = Locale.ROOT;
                            return ljg.j(i2, "Cast socket status code ");
                        }
                        if (i2 >= 2300 && i2 <= 2309) {
                            Locale locale7 = Locale.ROOT;
                            return ljg.j(i2, "Cast service status code ");
                        }
                        if (i2 >= 2310 && i2 <= 2319) {
                            Locale locale8 = Locale.ROOT;
                            return ljg.j(i2, "Endpoint switch status code ");
                        }
                        if (i2 >= 2350 && i2 <= 2359) {
                            Locale locale9 = Locale.ROOT;
                            return ljg.j(i2, "Cast multizone device status code ");
                        }
                        if (i2 >= 2400 && i2 <= 2419) {
                            Locale locale10 = Locale.ROOT;
                            return ljg.j(i2, "Cast relay casting status code ");
                        }
                        if (i2 >= 2450 && i2 <= 2469) {
                            Locale locale11 = Locale.ROOT;
                            return ljg.j(i2, "Cast nearby casting status code ");
                        }
                        if (i2 >= 2420 && i2 <= 2439) {
                            Locale locale12 = Locale.ROOT;
                            return ljg.j(i2, "Remote connection status code ");
                        }
                        if (i2 >= 2470 && i2 <= 2479) {
                            Locale locale13 = Locale.ROOT;
                            return ljg.j(i2, "Cast application status code ");
                        }
                        if (i2 < 2490 || i2 > 2499) {
                            Locale locale14 = Locale.ROOT;
                            return ljg.j(i2, "Unknown cast status code ");
                        }
                        Locale locale15 = Locale.ROOT;
                        return ljg.j(i2, "Cast media loading status code ");
                }
        }
    }

    public static final long L(long j, int i2, float f2) {
        double radians = (float) Math.toRadians((i2 * 72.0d) - 90.0d);
        float cos = (((float) Math.cos(radians)) * f2) + Float.intBitsToFloat((int) (j >> 32));
        float sin = (f2 * ((float) Math.sin(radians))) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(cos) << 32) | (Float.floatToRawIntBits(sin) & 4294967295L);
    }

    public static final xtc M(xtc xtcVar, Function1 function1) {
        return xtcVar.z(new ey1(function1));
    }

    public static xtc N(xtc xtcVar, float f2, float f3, float f4, float f5, uah uahVar, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f2;
        float f7 = (i2 & 2) != 0 ? 1.0f : f3;
        float f8 = (i2 & 4) != 0 ? 1.0f : f4;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        long j = xvj.b;
        uah uahVar2 = (i2 & a.o) != 0 ? oyn.e : uahVar;
        long j2 = r29.a;
        return xtcVar.z(new o29(f6, f7, f8, f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, uahVar2, false, j2, j2, 0));
    }

    public static xtc O(xtc xtcVar, float f2, float f3, float f4, float f5, uah uahVar, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f2;
        float f7 = (i2 & 2) != 0 ? 1.0f : f3;
        float f8 = (i2 & 4) != 0 ? 1.0f : f4;
        float f9 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0.0f : f5;
        long j = xvj.b;
        uah uahVar2 = (i2 & a.o) != 0 ? oyn.e : uahVar;
        boolean z = (i2 & 4096) == 0;
        long j2 = r29.a;
        return xtcVar.z(new o29(f6, f7, f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9, j, uahVar2, z, j2, j2, (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? 0 : 1));
    }

    public static e2a P(yd5 yd5Var, bzf bzfVar, long j, int i2) {
        if ((i2 & 2) != 0) {
            bzfVar = bzf.a;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        return new e2a(yd5Var, bzfVar, j);
    }

    public static final void R(z82 z82Var, Context context) {
        ((View) z82Var.f).setVisibility(0);
        ((ImageView) z82Var.g).setVisibility(8);
        ((FollowButton) z82Var.c).setVisibility(8);
        TextView textView = (TextView) z82Var.d;
        textView.setText(context.getString(R.string.button_add));
        haa.G(textView);
        ImageView imageView = (ImageView) z82Var.e;
        imageView.setBackground(context.getDrawable(R.drawable.circle_stroke_2dp));
        imageView.setImageResource(R.drawable.ic_plus);
        int s = ao2.s(8, context);
        imageView.setPadding(s, s, s, s);
        imageView.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.primary_default)));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gv9 S(Context context, EventStatisticsResponse eventStatisticsResponse) {
        List<EventStatisticsPeriod> statistics;
        Object obj;
        List<EventStatisticsGroup> groups;
        Object obj2;
        List<EventStatisticsItem> statisticsItems;
        float f2;
        double d2;
        double d3;
        Set a0 = ph0.a0(new String[]{"shots on goal", "penalty minutes", "faceoffs won %"});
        if (eventStatisticsResponse != null && (statistics = eventStatisticsResponse.getStatistics()) != null) {
            Iterator<T> it = statistics.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String lowerCase = ((EventStatisticsPeriod) obj).getPeriod().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.equals(Season.YEAR_ALL_TIME)) {
                    break;
                }
            }
            EventStatisticsPeriod eventStatisticsPeriod = (EventStatisticsPeriod) obj;
            if (eventStatisticsPeriod != null && (groups = eventStatisticsPeriod.getGroups()) != null) {
                Iterator<T> it2 = groups.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    String lowerCase2 = ((EventStatisticsGroup) obj2).getGroupName().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (lowerCase2.equals("match overview")) {
                        break;
                    }
                }
                EventStatisticsGroup eventStatisticsGroup = (EventStatisticsGroup) obj2;
                if (eventStatisticsGroup != null && (statisticsItems = eventStatisticsGroup.getStatisticsItems()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : statisticsItems) {
                        String lowerCase3 = ((EventStatisticsItem) obj3).getName().toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        if (a0.contains(lowerCase3)) {
                            arrayList.add(obj3);
                        }
                    }
                    List<EventStatisticsItem> H0 = CollectionsKt.H0(arrayList, new dy5(0, a0));
                    if (H0 != null && !H0.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(k13.r(H0, 10));
                        for (EventStatisticsItem eventStatisticsItem : H0) {
                            double homeValue$default = EventStatisticsItem.getHomeValue$default(eventStatisticsItem, null, 1, null);
                            double awayValue$default = EventStatisticsItem.getAwayValue$default(eventStatisticsItem, null, 1, null);
                            Double homeTotal$default = EventStatisticsItem.getHomeTotal$default(eventStatisticsItem, null, 1, null);
                            Double awayTotal$default = EventStatisticsItem.getAwayTotal$default(eventStatisticsItem, null, 1, null);
                            double d4 = homeValue$default + awayValue$default;
                            boolean hasTeamValueType = eventStatisticsItem.getHasTeamValueType();
                            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            if (hasTeamValueType && homeTotal$default != null && homeTotal$default.doubleValue() > 0.0d) {
                                d2 = homeValue$default / homeTotal$default.doubleValue();
                            } else if (d4 > 0.0d) {
                                d2 = homeValue$default / d4;
                            } else {
                                f2 = 0.0f;
                                if (eventStatisticsItem.getHasTeamValueType() || awayTotal$default == null || awayTotal$default.doubleValue() <= 0.0d) {
                                    if (d4 > 0.0d) {
                                        d3 = awayValue$default / d4;
                                    }
                                    arrayList2.add(new cy5(yaa.D(context, eventStatisticsItem.getName(), Sports.ICE_HOCKEY), EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null), EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null), f2, f3, eventStatisticsItem.isNegativeStatistic(), EventStatisticsItem.getCompareCode$default(eventStatisticsItem, null, 1, null)));
                                } else {
                                    d3 = awayValue$default / awayTotal$default.doubleValue();
                                }
                                f3 = (float) d3;
                                arrayList2.add(new cy5(yaa.D(context, eventStatisticsItem.getName(), Sports.ICE_HOCKEY), EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null), EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null), f2, f3, eventStatisticsItem.isNegativeStatistic(), EventStatisticsItem.getCompareCode$default(eventStatisticsItem, null, 1, null)));
                            }
                            f2 = (float) d2;
                            if (eventStatisticsItem.getHasTeamValueType()) {
                            }
                            if (d4 > 0.0d) {
                            }
                            arrayList2.add(new cy5(yaa.D(context, eventStatisticsItem.getName(), Sports.ICE_HOCKEY), EventStatisticsItem.getHome$default(eventStatisticsItem, null, 1, null), EventStatisticsItem.getAway$default(eventStatisticsItem, null, 1, null), f2, f3, eventStatisticsItem.isNegativeStatistic(), EventStatisticsItem.getCompareCode$default(eventStatisticsItem, null, 1, null)));
                        }
                        return l6g.W(arrayList2);
                    }
                }
            }
        }
        return null;
    }

    public static int T(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static final void U(g1c g1cVar, hb8 hb8Var, long j, Function1 function1) {
        if (yaa.E(yaa.B(g1cVar)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            yaa.B(g1cVar);
            qhe J = g1cVar.J(j);
            function1.invoke(J);
            hb8Var.f(J);
            hb8Var.e(J);
            return;
        }
        int B = hb8Var.a ? g1cVar.B(Integer.MAX_VALUE) : g1cVar.s(Integer.MAX_VALUE);
        if (hb8Var.a) {
            g1cVar.s(B);
        } else {
            g1cVar.B(B);
        }
    }

    public static final xtc V(xtc xtcVar, long j, float f2, wla wlaVar, Function1 function1) {
        return xtcVar.z(new yqd(j, f2, wlaVar, function1));
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
    public static k9 W(nm2 nm2Var) {
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

    public static void X(nm2 nm2Var, j9 j9Var) {
        int i2 = nm2Var.i(5);
        nm2Var.t(2);
        if (nm2Var.h()) {
            nm2Var.t(5);
        }
        if (i2 >= 7 && i2 <= 10) {
            nm2Var.s();
        }
        if (nm2Var.h()) {
            int i3 = nm2Var.i(3);
            if (j9Var.b == -1 && i2 >= 0 && i2 <= 15 && (i3 == 0 || i3 == 1)) {
                j9Var.b = i2;
            }
            if (nm2Var.h()) {
                c0(nm2Var);
            }
        }
    }

    public static void Y(nm2 nm2Var, j9 j9Var) {
        nm2Var.t(2);
        boolean h2 = nm2Var.h();
        int i2 = nm2Var.i(8);
        for (int i3 = 0; i3 < i2; i3++) {
            nm2Var.t(2);
            if (nm2Var.h()) {
                nm2Var.t(5);
            }
            if (h2) {
                nm2Var.t(24);
            } else {
                if (nm2Var.h()) {
                    if (!nm2Var.h()) {
                        nm2Var.t(4);
                    }
                    j9Var.c = nm2Var.i(6) + 1;
                }
                nm2Var.t(4);
            }
        }
        if (nm2Var.h()) {
            nm2Var.t(3);
            if (nm2Var.h()) {
                c0(nm2Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        g0(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = T(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int Z(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int B = tol.B(obj);
        int i3 = B & i2;
        int f0 = f0(i3, obj3);
        if (f0 != 0) {
            int i4 = ~i2;
            int i5 = B & i4;
            int i6 = -1;
            while (true) {
                int i7 = f0 - 1;
                int i8 = iArr[i7];
                if ((i8 & i4) != i5 || !sha.r(obj, objArr[i7]) || (objArr2 != null && !sha.r(obj2, objArr2[i7]))) {
                    int i9 = i8 & i2;
                    if (i9 == 0) {
                        break;
                    }
                    i6 = i7;
                    f0 = i9;
                }
            }
        }
        return -1;
    }

    public static final void a(final String str, final ImageVector imageVector, final Function0 function0, final long j, final xtc xtcVar, final boolean z, of3 of3Var, final int i2) {
        str.getClass();
        imageVector.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-323518047);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(imageVector) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j) ? a.o : 1024) | (av8Var.g(xtcVar) ? 16384 : 8192) | (av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(xtcVar, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            gvd.l(imageVector, function0, j, null, z, av8Var, (i3 >> 3) & 58366);
            nq8.h(av8Var, bkh.e(utc.a, 8.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.b(), av8Var, i3 & 14, 24960, 109562);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(str, imageVector, function0, j, xtcVar, z, i2) { // from class: mb
                public final /* synthetic */ String a;
                public final /* synthetic */ ImageVector b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ xtc e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    s02.a(this.a, this.b, this.c, this.d, this.e, this.f, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final r13 r13Var, final Integer num, final String str, final String str2, final BrandLocation brandLocation, final int i2, final wla wlaVar, xtc xtcVar, BrandType brandType, long j, float f2, float f3, boolean z, final tc3 tc3Var, of3 of3Var, final int i3, final int i4, final int i5) {
        int i6;
        xtc xtcVar2;
        int i7;
        int i8;
        long j2;
        int i9;
        int i10;
        int i11;
        int i12;
        av8 av8Var;
        final float f4;
        final float f5;
        final boolean z2;
        final xtc xtcVar3;
        final long j3;
        final BrandType brandType2;
        eqf u;
        BrandType brandType3;
        float f6;
        int i13;
        float f7;
        boolean z3;
        xtc xtcVar4;
        float f8;
        Context context;
        int i14;
        int i15;
        int i16;
        int i17;
        BrandType brandType4;
        int i18;
        jf9 jf9Var = oyn.e;
        brandLocation.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1091774310);
        if ((i3 & 6) == 0) {
            i6 = (av8Var2.g(r13Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= av8Var2.g(num) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= av8Var2.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= av8Var2.g(str2) ? a.o : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= av8Var2.e(brandLocation.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 |= av8Var2.e(i2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= (i3 & 2097152) == 0 ? av8Var2.g(wlaVar) : av8Var2.i(wlaVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i19 = i5 & 128;
        if (i19 != 0) {
            i6 |= 12582912;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            if ((i3 & 12582912) == 0) {
                i6 |= av8Var2.g(xtcVar2) ? 8388608 : 4194304;
            }
        }
        int i20 = i5 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i20 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i6 |= av8Var2.e(brandType == null ? -1 : brandType.ordinal()) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            int i21 = i6;
            if ((i5 & 512) == 0) {
                i8 = i19;
                j2 = j;
                if (av8Var2.f(j2)) {
                    i18 = 536870912;
                    i7 = i21 | i18;
                }
            } else {
                i8 = i19;
                j2 = j;
            }
            i18 = 268435456;
            i7 = i21 | i18;
        } else {
            i7 = i6;
            i8 = i19;
            j2 = j;
        }
        int i22 = i8;
        int i23 = i5 & 1024;
        if (i23 != 0) {
            i11 = i4 | 6;
            i9 = i23;
        } else {
            if ((i4 & 6) != 0) {
                i9 = i23;
                i10 = i4;
                int i24 = i10 | 384;
                if ((i4 & 3072) != 0) {
                    i12 = i24 | (av8Var2.i(tc3Var) ? a.o : 1024);
                } else {
                    i12 = i24;
                }
                if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378 || (i12 & 1155) != 1154)) {
                    av8Var = av8Var2;
                    av8Var.W();
                    f4 = f2;
                    f5 = f3;
                    z2 = z;
                    xtcVar3 = xtcVar2;
                    j3 = j2;
                    brandType2 = brandType;
                } else {
                    av8Var2.Y();
                    int i25 = i3 & 1;
                    utc utcVar = utc.a;
                    if (i25 == 0 || av8Var2.B()) {
                        if (i22 != 0) {
                            xtcVar2 = utcVar;
                        }
                        brandType3 = i20 != 0 ? BrandType.BANNER : brandType;
                        if ((i5 & 512) != 0) {
                            j2 = lz.D(R.color.surface_2, av8Var2);
                            i7 &= -1879048193;
                        }
                        f6 = i9 != 0 ? 8.0f : f2;
                        i13 = i7;
                        f7 = 2.0f;
                        z3 = true;
                    } else {
                        av8Var2.W();
                        if ((i5 & 512) != 0) {
                            i7 &= -1879048193;
                        }
                        brandType3 = brandType;
                        f6 = f2;
                        f7 = f3;
                        i13 = i7;
                        z3 = z;
                    }
                    av8Var2.t();
                    Context context2 = (Context) av8Var2.k(nz.b);
                    boolean z4 = r13Var != null;
                    int i26 = i12;
                    av8Var2.d0(-1223057482);
                    av8Var2.d0(-1223068989);
                    BrandType brandType5 = brandType3;
                    xtc A = wnn.A(bkh.d(xtcVar2, 1.0f), o7g.a(f6));
                    if (r13Var != null) {
                        xtcVar4 = xtcVar2;
                        f8 = f6;
                        A = A.z(yso.o(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var2), jf9Var), 2.0f, r13Var.a, o7g.a(f8)));
                    } else {
                        xtcVar4 = xtcVar2;
                        f8 = f6;
                    }
                    av8Var2.s(false);
                    xtc q = n9e.q(A, j2, jf9Var);
                    wla wlaVar2 = (!z4 || str2 == null || str2.length() == 0) ? null : wlaVar;
                    a99 a99Var = nf3.a;
                    if (wlaVar2 != null) {
                        i15 = i13;
                        i16 = 234881024;
                        i17 = 57344;
                        i14 = 458752;
                        boolean i27 = ((i15 & 458752) == 131072) | av8Var2.i(context2) | ((i15 & 57344) == 16384) | ((i15 & 7168) == 2048) | ((i15 & 234881024) == 67108864);
                        Object O = av8Var2.O();
                        if (i27 || O == a99Var) {
                            O = new x22(context2, i2, brandLocation, str2, brandType5);
                            context = context2;
                            brandType4 = brandType5;
                            av8Var2.n0(O);
                        } else {
                            context = context2;
                            brandType4 = brandType5;
                        }
                        xtc P = bea.P(utcVar, wlaVar2, (Function0) O, av8Var2, 384, 4);
                        av8Var = av8Var2;
                        q = q.z(P);
                    } else {
                        context = context2;
                        av8Var = av8Var2;
                        i14 = 458752;
                        i15 = i13;
                        i16 = 234881024;
                        i17 = 57344;
                        brandType4 = brandType5;
                    }
                    av8Var.s(false);
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
                    if (!z3 || r13Var == null || num == null) {
                        av8Var.d0(133000914);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(132479091);
                        int intValue = num.intValue();
                        long j4 = r13Var.a;
                        int i28 = i15 & 896;
                        boolean i29 = ((i15 & i14) == 131072) | av8Var.i(context) | ((i15 & i17) == 16384) | ((i15 & 7168) == 2048) | ((i15 & i16) == 67108864) | (i28 == 256);
                        Object O2 = av8Var.O();
                        if (i29 || O2 == a99Var) {
                            final BrandType brandType6 = brandType4;
                            final Context context3 = context;
                            O2 = new Function0() { // from class: y22
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Integer valueOf = Integer.valueOf(i2);
                                    String str3 = str2;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    Context context4 = context3;
                                    nv.o(context4, valueOf, brandLocation, str3, brandType6);
                                    bea.G(context4, str);
                                    return Unit.a;
                                }
                            };
                            av8Var.n0(O2);
                        }
                        c(intValue, j4, str, (Function0) O2, av8Var, ((i15 >> 3) & 14) | ((i15 << 3) & 112) | i28);
                        av8Var.s(false);
                    }
                    tc3Var.invoke(x23.a, av8Var, Integer.valueOf(6 | ((i26 >> 6) & 112)));
                    av8Var.s(true);
                    j3 = j2;
                    f5 = f7;
                    z2 = z3;
                    xtcVar3 = xtcVar4;
                    f4 = f8;
                    brandType2 = brandType4;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new Function2() { // from class: z22
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int K = aba.K(i3 | 1);
                            int K2 = aba.K(i4);
                            s02.b(r13.this, num, str, str2, brandLocation, i2, wlaVar, xtcVar3, brandType2, j3, f4, f5, z2, tc3Var, (of3) obj, K, K2, i5);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i9 = i23;
            i11 = i4 | (av8Var2.d(f2) ? 4 : 2);
        }
        i10 = i11;
        int i242 = i10 | 384;
        if ((i4 & 3072) != 0) {
        }
        if (av8Var2.T(i7 & 1, (i7 & 306783379) == 306783378 || (i12 & 1155) != 1154)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void c(int i2, long j, String str, Function0 function0, of3 of3Var, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2057685102);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.f(j) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= av8Var.i(function0) ? a.o : 1024;
        }
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.e(bkh.d(utcVar, 1.0f), 24.0f), j, oyn.e);
            boolean z = !(str == null || str.length() == 0);
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = fi.m;
                av8Var.n0(O2);
            }
            xtc O3 = kda.O(tol.y(q, z, true, true, D, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 3), av8Var, 0), "branded_frame_card_strip", av8Var);
            l8g a2 = k8g.a(ww9.f, uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, O3);
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
            td4.h(48, av8Var, bkh.e(bkh.d(utcVar, 1.0f), 24.0f), vxd.j(i2, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "branding/provider/", "/powered-by-image"));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xj(i2, j, str, function0, i3);
        }
    }

    public static void c0(nm2 nm2Var) {
        int i2 = nm2Var.i(6);
        if (i2 < 2 || i2 > 42) {
            throw s9e.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i2)));
        }
        nm2Var.t(i2 * 8);
    }

    public static final void d(yr3 yr3Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1399141258);
        int i3 = (av8Var.g(yr3Var) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc e2 = bkh.e(bkh.d(xtcVar, 1.0f), 32.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e2);
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
            int i4 = yr3Var.c;
            Integer num = yr3Var.b;
            ImageVector N = s6a.N(i4, 6, av8Var);
            xtc l = bkh.l(utc.a, 24.0f);
            int i5 = R.color.n_lv_3;
            kq9.b(N, null, l, lz.D(num != null ? num.intValue() : R.color.n_lv_3, av8Var), av8Var, 432, 0);
            String v = oea.v(yr3Var.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, l98.d0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            Integer num2 = yr3Var.d;
            if (num2 == null) {
                av8Var.d0(1076678743);
                av8Var.s(false);
            } else {
                av8Var.d0(1076678744);
                String v2 = oea.v(num2.intValue(), av8Var);
                dfj e3 = xth.e();
                if (num != null) {
                    i5 = num.intValue();
                }
                udj.c(v2, null, lz.D(i5, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, e3, av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(yr3Var, xtcVar, i2, 24);
        }
    }

    public static mnh d0() {
        return new mnh(0);
    }

    public static final void e(final do7 do7Var, final ho7 ho7Var, final mj7 mj7Var, final int i2, final sd7 sd7Var, final Function0 function0, final Function0 function02, final Function0 function03, final Function0 function04, xtc xtcVar, of3 of3Var, int i3) {
        xtc xtcVar2;
        ho7Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1047173939);
        int i4 = i3 | (av8Var.g(do7Var) ? 4 : 2) | (av8Var.g(ho7Var) ? 32 : 16) | (av8Var.g(mj7Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i2) ? a.o : 1024) | (av8Var.e(sd7Var == null ? -1 : sd7Var.ordinal()) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function02) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.i(function03) ? 8388608 : 4194304) | (av8Var.i(function04) ? 67108864 : 33554432) | 805306368;
        if (av8Var.T(i4 & 1, (306783379 & i4) != 306783378)) {
            h(do7Var.c.f, yqo.H(-739359600, av8Var, new ct8() { // from class: xq6
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((v23) obj).getClass();
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 17) != 16)) {
                        s02.q(do7.this, function04, null, av8Var2, 0);
                        ho7 ho7Var2 = ho7Var;
                        mj7 mj7Var2 = ho7Var2.a;
                        s02.w(mj7Var2, ho7Var2.h, false, null, av8Var2, 384);
                        s02.s(ho7Var2, i2, mj7Var2.h() ? function0 : null, mj7Var2.k != null ? function02 : null, null, av8Var2, 0);
                        utc utcVar = utc.a;
                        mj7 mj7Var3 = mj7Var;
                        if (mj7Var3 != null) {
                            av8Var2.d0(-1668778740);
                            mha.h(oea.v(R.string.manage_team, av8Var2), function03, bkh.d(bkh.q(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 264.0f, 1), 1.0f), lqh.a, null, false, false, false, 0L, 0, 0, av8Var2, 3456, 0, 2032);
                            s02.w(mj7Var3, false, true, null, av8Var2, 432);
                            s02.C(sd7Var, mj7Var3, l98.c0(utcVar, 16.0f, 8.0f), av8Var2, 384);
                            un0.n(mj7Var3.d, 0L, lz.D(R.color.on_color_primary, av8Var2), l98.d0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var2, 3072);
                            av8Var2.s(false);
                        } else {
                            bf3.r(8.0f, -1667719470, av8Var2, av8Var2, utcVar);
                            av8Var2.s(false);
                        }
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 432);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qc3(do7Var, ho7Var, mj7Var, i2, sd7Var, function0, function02, function03, function04, xtcVar2, i3);
        }
    }

    public static g0i e0(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new g0i(f2, f3, obj);
    }

    public static final void f(do7 do7Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1565959789);
        int i3 = (av8Var.g(do7Var) ? 4 : 2) | i2 | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            h(do7Var.c.f, yqo.H(-1956223824, av8Var, new qm4(7, do7Var, function0)), av8Var, 432);
            xtcVar = utc.a;
        } else {
            av8Var.W();
        }
        xtc xtcVar2 = xtcVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ar6(do7Var, function0, xtcVar2, i2, 0);
        }
    }

    public static int f0(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static final void g(final gv9 gv9Var, final gv9 gv9Var2, final ev6 ev6Var, final il8 il8Var, final boolean z, final Function1 function1, final boolean z2, final boolean z3, final Function0 function0, xtc xtcVar, boolean z4, boolean z5, of3 of3Var, final int i2, final int i3, final int i4) {
        Function1 function12;
        boolean z6;
        xtc xtcVar2;
        int i5;
        boolean z7;
        int i6;
        final boolean z8;
        final boolean z9;
        final xtc xtcVar3;
        gv9Var.getClass();
        gv9Var2.getClass();
        il8Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(328500113);
        int i7 = (av8Var.g(gv9Var) ? 4 : 2) | i2 | (av8Var.g(gv9Var2) ? 32 : 16) | (av8Var.g(ev6Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i2 & 3072) == 0) {
            i7 |= av8Var.e(il8Var.ordinal()) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= av8Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function12 = function1;
            i7 |= av8Var.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            function12 = function1;
        }
        if ((1572864 & i2) == 0) {
            z6 = z2;
            i7 |= av8Var.h(z6) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            z6 = z2;
        }
        int i8 = 4;
        int i9 = i7 | (av8Var.h(z3) ? 8388608 : 4194304);
        if ((100663296 & i2) == 0) {
            i9 |= av8Var.i(function0) ? 67108864 : 33554432;
        }
        int i10 = i4 & 512;
        if (i10 != 0) {
            i5 = i9 | 805306368;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i9 | (av8Var.g(xtcVar2) ? 536870912 : 268435456);
        }
        int i11 = i5;
        int i12 = i4 & 1024;
        if (i12 != 0) {
            i6 = i3 | 6;
            z7 = z4;
        } else {
            z7 = z4;
            if ((i3 & 6) == 0) {
                if (!av8Var.h(z7)) {
                    i8 = 2;
                }
                i6 = i3 | i8;
            } else {
                i6 = i3;
            }
        }
        int i13 = i4 & a.o;
        if (i13 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= av8Var.h(z5) ? 32 : 16;
        }
        int i14 = i6;
        if (av8Var.T(i11 & 1, ((i11 & 306783379) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            xtc xtcVar4 = i10 != 0 ? utc.a : xtcVar2;
            boolean z10 = i12 != 0 ? true : z7;
            boolean z11 = i13 != 0 ? true : z5;
            u23 a2 = t23.a(new ng0((float) (((Number) av8Var.k(thb.a)).doubleValue() * (-32.0d)), true, new a70(6)), uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar4);
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
            int i15 = i11 >> 3;
            int i16 = i11 >> 6;
            xtc xtcVar5 = xtcVar4;
            un0.k(gv9Var, ev6Var, il8Var, z, z6, z3, function12, function0, null, z10, z11, av8Var, (i11 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i16) | (458752 & i16) | ((i11 << 3) & 3670016) | (29360128 & i15) | ((i14 << 27) & 1879048192), (i14 >> 3) & 14, NotificationCompat.FLAG_LOCAL_ONLY);
            boolean z12 = z10;
            av8Var = av8Var;
            if (gv9Var2.isEmpty()) {
                av8Var.d0(-948052377);
                av8Var.s(false);
            } else {
                av8Var.d0(-948388076);
                p(gv9Var2, il8Var, z3, function1, Intrinsics.c(ev6Var != null ? Boolean.valueOf(ev6Var.A) : null, Boolean.TRUE), null, z12, av8Var, (i15 & 14) | (i16 & 112) | ((i11 >> 15) & 896) | (i16 & 7168) | ((i14 << 18) & 3670016));
                av8Var.s(false);
            }
            av8Var.s(true);
            z9 = z12;
            z8 = z11;
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            z8 = z5;
            z9 = z7;
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: uy6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i2 | 1);
                    int K2 = aba.K(i3);
                    s02.g(gv9.this, gv9Var2, ev6Var, il8Var, z, function1, z2, z3, function0, xtcVar3, z9, z8, (of3) obj, K, K2, i4);
                    return Unit.a;
                }
            };
        }
    }

    public static void g0(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static final void h(int i2, tc3 tc3Var, of3 of3Var, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-730105443);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i5 = i3 & 48;
        utc utcVar = utc.a;
        if (i5 == 0) {
            i4 |= av8Var.g(utcVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            xtc q = pd0.q(i2, av8Var, wnn.A(bkh.d(utcVar, 1.0f), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)));
            int i6 = ((i4 << 3) & 7168) | 384;
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
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
            tc3Var.invoke(x23.a, av8Var, Integer.valueOf(((i6 >> 6) & 112) | 6));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vo(i2, i3, tc3Var);
        }
    }

    public static i4k h0(int i2, int i3, ig5 ig5Var, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            ig5Var = jg5.a;
        }
        return new i4k(i2, i3, ig5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final do7 do7Var, final ho7 ho7Var, gv9 gv9Var, of3 of3Var, int i2) {
        a99 a99Var;
        int i3;
        ku3 ku3Var;
        Object obj;
        boolean i4;
        Object O;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-960997937);
        int i5 = i2 | (av8Var.g(do7Var) ? 4 : 2) | (av8Var.g(ho7Var) ? 32 : 16) | (av8Var.g(gv9Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            final Context context = (Context) av8Var.k(nz.b);
            n29 a2 = r29.a(av8Var);
            Object O2 = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (O2 == a99Var2) {
                O2 = hz8.G(g.a, av8Var);
                av8Var.n0(O2);
            }
            final ku3 ku3Var2 = (ku3) O2;
            Object O3 = av8Var.O();
            if (O3 == a99Var2) {
                O3 = e.f(null);
                av8Var.n0(O3);
            }
            final e1d e1dVar = (e1d) O3;
            Unit unit = Unit.a;
            Object O4 = av8Var.O();
            if (O4 == a99Var2) {
                O4 = new fw6(9, e1dVar);
                av8Var.n0(O4);
            }
            hz8.d(unit, (Function1) O4, av8Var);
            boolean i6 = av8Var.i(a2) | av8Var.i(ku3Var2);
            Object O5 = av8Var.O();
            if (i6 || O5 == a99Var2) {
                O5 = new dr6(12, a2, ku3Var2, e1dVar);
                av8Var.n0(O5);
            }
            utc utcVar = utc.a;
            xtc Z = td4.Z(utcVar, (Function1) O5);
            int i7 = i5 & 14;
            int i8 = i7 | 24576;
            int i9 = i5 & 112;
            k(do7Var, ho7Var, gv9Var, Z, true, av8Var, i8 | i9 | (i5 & 896), 0);
            p4h p4hVar = ww9.d;
            u23 a3 = t23.a(p4hVar, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kv1 kv1Var = uxf.p;
            xtc u0 = hkg.u0(fn0.e(1.0f, bkh.d(utcVar, 1.0f), false), hkg.o0(av8Var), false, 14);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, u0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.fantasy_share_your_team, av8Var);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, l98.d0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var, 48, 24960, 110584);
            k(do7Var, ho7Var, gv9Var, null, false, av8Var, i5 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, 24);
            av8Var.s(true);
            uxf uxfVar = ww9.c;
            xtc c0 = l98.c0(n9e.q(d2a.E(fz8.Y(bkh.d(utcVar, 1.0f), n9a.b), 16.0f, null, false, 0L, 30), lz.D(R.color.surface_P, av8Var), oyn.e), 16.0f, 6.0f);
            l8g a5 = k8g.a(uxfVar, uxf.l, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            ImageVector N = s6a.N(R.drawable.ic_download, 6, av8Var);
            long D2 = lz.D(R.color.primary_default, av8Var);
            xtc o = yso.o(wnn.A(qx9.p(bkh.c(utcVar, 1.0f), 1.0f), o7g.a(4.0f)), 1.5f, lz.D(R.color.primary_default, av8Var), o7g.a(4.0f));
            boolean i10 = av8Var.i(ku3Var2) | (i9 == 32) | (i7 == 4) | av8Var.i(context);
            Object O6 = av8Var.O();
            if (i10) {
                a99Var = a99Var2;
            } else {
                a99Var = a99Var2;
                if (O6 != a99Var) {
                    i3 = i7;
                    obj = O6;
                    ku3Var = ku3Var2;
                    a99 a99Var3 = a99Var;
                    kq9.b(N, null, l98.b0(tol.y(o, false, false, false, 0L, null, (Function0) obj, av8Var, 31), 6.0f), D2, av8Var, 48, 0);
                    String f2 = fc6.f(16.0f, R.string.share_image, av8Var, av8Var, utcVar);
                    bqh bqhVar = new bqh(s6a.N(R.drawable.ic_menu_list_share, 6, av8Var), uxf.q);
                    xtc c2 = bkh.c(utcVar, 1.0f);
                    boolean z = ((Bitmap) e1dVar.getValue()) == null;
                    i4 = av8Var.i(ku3Var) | (i9 != 32) | (i3 == 4) | av8Var.i(context);
                    O = av8Var.O();
                    if (!i4 || O == a99Var3) {
                        final ku3 ku3Var3 = ku3Var;
                        final int i11 = 1;
                        O = new Function0() { // from class: jk7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i12 = i11;
                                ku3 ku3Var4 = ku3Var3;
                                e1d e1dVar2 = e1dVar;
                                switch (i12) {
                                    case 0:
                                        Bitmap bitmap = (Bitmap) e1dVar2.getValue();
                                        if (bitmap != null) {
                                            xw3.L(ku3Var4, null, null, new kk7(ho7Var, do7Var, context, bitmap, null, 0), 3);
                                        }
                                        break;
                                    default:
                                        Bitmap bitmap2 = (Bitmap) e1dVar2.getValue();
                                        if (bitmap2 != null) {
                                            xw3.L(ku3Var4, null, null, new kk7(ho7Var, do7Var, context, bitmap2, null, 1), 3);
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O);
                    }
                    mha.h(f2, (Function0) O, c2, null, bqhVar, z, false, false, 0L, 0, 0, av8Var, 384, 0, 1992);
                    av8Var = av8Var;
                    av8Var.s(true);
                    av8Var.s(true);
                }
            }
            final int i12 = 0;
            i3 = i7;
            obj = new Function0() { // from class: jk7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i122 = i12;
                    ku3 ku3Var4 = ku3Var2;
                    e1d e1dVar2 = e1dVar;
                    switch (i122) {
                        case 0:
                            Bitmap bitmap = (Bitmap) e1dVar2.getValue();
                            if (bitmap != null) {
                                xw3.L(ku3Var4, null, null, new kk7(ho7Var, do7Var, context, bitmap, null, 0), 3);
                            }
                            break;
                        default:
                            Bitmap bitmap2 = (Bitmap) e1dVar2.getValue();
                            if (bitmap2 != null) {
                                xw3.L(ku3Var4, null, null, new kk7(ho7Var, do7Var, context, bitmap2, null, 1), 3);
                            }
                            break;
                    }
                    return Unit.a;
                }
            };
            ku3Var = ku3Var2;
            av8Var.n0(obj);
            a99 a99Var32 = a99Var;
            kq9.b(N, null, l98.b0(tol.y(o, false, false, false, 0L, null, (Function0) obj, av8Var, 31), 6.0f), D2, av8Var, 48, 0);
            String f22 = fc6.f(16.0f, R.string.share_image, av8Var, av8Var, utcVar);
            bqh bqhVar2 = new bqh(s6a.N(R.drawable.ic_menu_list_share, 6, av8Var), uxf.q);
            xtc c22 = bkh.c(utcVar, 1.0f);
            if (((Bitmap) e1dVar.getValue()) == null) {
            }
            i4 = av8Var.i(ku3Var) | (i9 != 32) | (i3 == 4) | av8Var.i(context);
            O = av8Var.O();
            if (!i4) {
            }
            final ku3 ku3Var32 = ku3Var;
            final int i112 = 1;
            O = new Function0() { // from class: jk7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i122 = i112;
                    ku3 ku3Var4 = ku3Var32;
                    e1d e1dVar2 = e1dVar;
                    switch (i122) {
                        case 0:
                            Bitmap bitmap = (Bitmap) e1dVar2.getValue();
                            if (bitmap != null) {
                                xw3.L(ku3Var4, null, null, new kk7(ho7Var, do7Var, context, bitmap, null, 0), 3);
                            }
                            break;
                        default:
                            Bitmap bitmap2 = (Bitmap) e1dVar2.getValue();
                            if (bitmap2 != null) {
                                xw3.L(ku3Var4, null, null, new kk7(ho7Var, do7Var, context, bitmap2, null, 1), 3);
                            }
                            break;
                    }
                    return Unit.a;
                }
            };
            av8Var.n0(O);
            mha.h(f22, (Function0) O, c22, null, bqhVar2, z, false, false, 0L, 0, 0, av8Var, 384, 0, 1992);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(do7Var, ho7Var, gv9Var, i2, 16);
        }
    }

    public static void i0() {
        l4a.k(null, Looper.myLooper() == Looper.getMainLooper());
    }

    public static final void j(do7 do7Var, ho7 ho7Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        zg3 zg3Var;
        ff3 ff3Var;
        f50 f50Var;
        f50 f50Var2;
        f50 f50Var3;
        ry ryVar;
        mj7 mj7Var;
        int i4;
        zg3 zg3Var2;
        p8g p8gVar;
        int i5;
        Context context;
        String str;
        String str2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(276380079);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(do7Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(ho7Var) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if (av8Var.T(i6 & 1, (i6 & 147) != 146)) {
            Context context2 = (Context) av8Var.k(nz.b);
            kv1 kv1Var = uxf.p;
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc A = wnn.A(utcVar, a2);
            ev6 ev6Var = do7Var.c;
            xtc c0 = l98.c0(bkh.d(pd0.q(ev6Var.f, av8Var, A), 1.0f), 16.0f, 8.0f);
            u23 a3 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var3 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a3, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            lv1 lv1Var = uxf.m;
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 7);
            wxf wxfVar = ww9.b;
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var4);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C2, f50Var6);
            td4.q(ev6Var.g, ev6Var.a, ev6Var.y, bkh.l(utcVar, 16.0f), av8Var, 3072);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            String str3 = ev6Var.e;
            yf8 yf8Var = xth.a;
            dfj k = xth.k();
            long D = lz.D(R.color.on_color_primary, av8Var);
            p8g p8gVar2 = p8g.a;
            udj.c(str3, p8gVar2.a(1.0f, utcVar, true), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, k, av8Var, 0, 24960, 110584);
            kq9.b(s6a.N(R.drawable.ic_sofascore_logomark, 6, av8Var), null, ljg.i(utcVar, 16.0f, av8Var, utcVar, 16.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            udj.c(do7Var.b, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 48, 24960, 110584);
            ng0 ng0Var = new ng0(16.0f, true, new l1(kv1Var, 5));
            xtc d0 = l98.d0(l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a5 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var3;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var3;
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var4);
            waa.K(av8Var, m3, ff3Var2);
            bf3.s(hashCode3, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C3, f50Var6);
            mj7 mj7Var2 = ho7Var.a;
            int i7 = ho7Var.d;
            if (mj7Var2.h()) {
                av8Var.d0(1369795348);
                String v = oea.v(R.string.average, av8Var);
                Float f2 = mj7Var2.g;
                mj7Var = mj7Var2;
                f50Var = f50Var6;
                zg3Var2 = zg3Var;
                i4 = i7;
                ff3Var = ff3Var2;
                f50Var3 = f50Var4;
                f50Var2 = f50Var5;
                ryVar = ryVar2;
                fkf.t(v, f2 != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2.floatValue())}, 1)) : "-", ljg.h(8.0f, p8gVar2.a(1.0f, utcVar, true), lz.D(R.color.surface_1, av8Var), 8.0f), xth.e(), lz.D(R.color.n_lv_1, av8Var), lz.D(R.color.n_lv_3, av8Var), av8Var, 0, 0);
                String v2 = oea.v(R.string.points, av8Var);
                Integer num = ho7Var.b;
                if (num == null || (str = String.valueOf(num.intValue())) == null) {
                    str = "-";
                }
                fkf.t(v2, str, ljg.h(8.0f, p8gVar2.a(1.33f, utcVar, true), lz.D(R.color.surface_1, av8Var), 8.0f), xth.i(), lz.D(R.color.n_lv_1, av8Var), lz.D(R.color.n_lv_3, av8Var), av8Var, 0, 0);
                String v3 = oea.v(R.string.highest_points_scored, av8Var);
                Integer num2 = mj7Var.i;
                if (num2 == null || (str2 = String.valueOf(num2.intValue())) == null) {
                    str2 = "-";
                }
                fkf.t(v3, str2, ljg.h(8.0f, p8gVar2.a(1.0f, utcVar, true), lz.D(R.color.surface_1, av8Var), 8.0f), xth.e(), lz.D(R.color.n_lv_1, av8Var), lz.D(R.color.n_lv_3, av8Var), av8Var, 0, 0);
                av8Var.s(false);
                i5 = 0;
                p8gVar = p8gVar2;
                context = context2;
            } else {
                ff3Var = ff3Var2;
                f50Var = f50Var6;
                f50Var2 = f50Var5;
                f50Var3 = f50Var4;
                ryVar = ryVar2;
                mj7Var = mj7Var2;
                i4 = i7;
                zg3Var2 = zg3Var;
                av8Var.d0(1371542663);
                String v4 = oea.v(R.string.deadline, av8Var);
                String j = rik.j(context2, mj7Var.d, bi4.PATTERN_DMM, ", ");
                dfj i8 = xth.i();
                long D2 = lz.D(R.color.n_lv_1, av8Var);
                long D3 = lz.D(R.color.n_lv_3, av8Var);
                xtc c02 = l98.c0(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var), o7g.a(8.0f)), 16.0f, 8.0f);
                p8gVar = p8gVar2;
                i5 = 0;
                context = context2;
                fkf.t(v4, j, c02, i8, D2, D3, av8Var, 0, 0);
                av8Var.s(false);
            }
            av8Var.s(true);
            lg0 lg0Var = mj7Var.h() ? wxfVar : ww9.f;
            xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a6 = k8g.a(lg0Var, uxf.l, av8Var, i5);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var3);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var);
            Context context3 = context;
            p8g p8gVar3 = p8gVar;
            mj7 mj7Var3 = mj7Var;
            udj.c(f5p.B(context, mj7Var.c, mj7Var.b), null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            if (i4 == 0 || !mj7Var3.h()) {
                av8Var.d0(-502435551);
                av8Var.s(false);
            } else {
                av8Var.d0(-503108251);
                int abs = Math.abs(i4 / 5);
                String valueOf2 = String.valueOf(i4);
                valueOf2.getClass();
                String string = context3.getString(R.string.n_points, valueOf2);
                string.getClass();
                nq8.h(av8Var, bkh.p(utcVar, 16.0f));
                udj.c(dmi.r(oea.w(R.string.additional_transfers_count, new Object[]{Integer.valueOf(abs)}, av8Var), " (-", string, ")"), p8gVar3.a(1.0f, utcVar, true), lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 109560);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(do7Var, ho7Var, xtcVar2, i2, 28);
        }
    }

    public static final xtc j0() {
        return new fwk();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(do7 do7Var, ho7 ho7Var, gv9 gv9Var, xtc xtcVar, boolean z, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        boolean z2;
        xtc xtcVar3;
        boolean z3;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-427828887);
        int i5 = (av8Var.g(do7Var) ? 4 : 2) | i2 | (av8Var.g(ho7Var) ? 32 : 16) | (av8Var.g(gv9Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i5 | (av8Var.g(xtcVar2) ? a.o : 1024);
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            i4 |= av8Var.h(z2) ? 16384 : 8192;
            if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
                z3 = z2;
            } else {
                utc utcVar = utc.a;
                if (i6 != 0) {
                    xtcVar2 = utcVar;
                }
                boolean z4 = i7 != 0 ? false : z2;
                kv1 kv1Var = uxf.p;
                xtc b0 = l98.b0(bkh.q(n9e.q(z4 ? xtcVar2.z(bkh.p(utcVar, 360.0f)) : xtcVar2, lz.D(R.color.surface_P, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 384.0f, 1), 8.0f);
                u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, b0);
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
                j(do7Var, ho7Var, null, av8Var, i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                dy0.b(ljg.h(16.0f, bkh.d(utcVar, 1.0f), lz.D(R.color.surface_2, av8Var), 8.0f), uxf.g, yqo.H(1350947613, av8Var, new d67(24, gv9Var, ho7Var, do7Var)), av8Var, 3120, 4);
                nq8.h(av8Var, bkh.e(utcVar, 16.0f));
                kq9.b(s6a.N(R.drawable.ic_logomark_sofascore_fantasy, 6, av8Var), null, bkh.e(bkh.p(utcVar, 148.0f), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var = av8Var;
                w1l.s(utcVar, 8.0f, av8Var, true);
                xtc xtcVar4 = xtcVar2;
                z3 = z4;
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new ci(do7Var, ho7Var, gv9Var, xtcVar3, z3, i2, i3);
                return;
            }
            return;
        }
        z2 = z;
        if (av8Var.T(i4 & 1, (i4 & 9363) == 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void l(xtc xtcVar, pg0 pg0Var, lg0 lg0Var, fo foVar, int i2, int i3, tc3 tc3Var, of3 of3Var, int i4) {
        int i5;
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1371845627);
        if ((i4 & 6) == 0) {
            i5 = (av8Var.g(xtcVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.g(pg0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= av8Var.g(lg0Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i5 | 224256;
        if ((i4 & 1572864) == 0) {
            i7 |= av8Var.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (av8Var.T(i7 & 1, (599187 & i7) != 599186)) {
            foVar = uxf.o;
            m(xtcVar, pg0Var, lg0Var, c98.t, tc3Var, av8Var, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | ((i7 << 3) & 29360128));
            i2 = Integer.MAX_VALUE;
            i6 = Integer.MAX_VALUE;
        } else {
            av8Var.W();
            i6 = i3;
        }
        fo foVar2 = foVar;
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x75(xtcVar, pg0Var, lg0Var, foVar2, i2, i6, tc3Var, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    public static final void m(xtc xtcVar, pg0 pg0Var, lg0 lg0Var, c98 c98Var, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        c98 c98Var2;
        ?? r7;
        Object obj;
        kv1 kv1Var = uxf.o;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1944405121);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(pg0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(lg0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(kv1Var) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.e(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var.e(Integer.MAX_VALUE) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            c98Var2 = c98Var;
            i3 |= av8Var.g(c98Var2) ? 1048576 : 524288;
        } else {
            c98Var2 = c98Var;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= av8Var.i(tc3Var) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z = i5 == 1048576;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                c98Var2.getClass();
                db8 db8Var = db8.a;
                O = new fb8();
                av8Var.n0(O);
            }
            fb8 fb8Var = (fb8) O;
            int i6 = i4 >> 3;
            boolean g2 = ((((57344 & i6) ^ 24576) > 16384 && av8Var.e(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | ((((i6 & 14) ^ 6) > 4 && av8Var.g(pg0Var)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && av8Var.g(lg0Var)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && av8Var.g(kv1Var)) || (i6 & 384) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && av8Var.e(Integer.MAX_VALUE)) || (i6 & 3072) == 2048) | av8Var.g(fb8Var);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                hb8 hb8Var = new hb8(false, lg0Var, pg0Var, pg0Var.e(), new x14(kv1Var), lg0Var.e(), Integer.MAX_VALUE, fb8Var);
                av8Var.n0(hb8Var);
                O2 = hb8Var;
            }
            hb8 hb8Var2 = (hb8) O2;
            boolean z2 = (i5 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & 458752) == 131072);
            Object O3 = av8Var.O();
            if (z2 || O3 == a99Var) {
                ArrayList arrayList = new ArrayList();
                r7 = 1;
                arrayList.add(new tc3(-1720407857, new b25(tc3Var, 2), true));
                c98Var.getClass();
                db8 db8Var2 = db8.a;
                av8Var.n0(arrayList);
                obj = arrayList;
            } else {
                r7 = 1;
                obj = O3;
            }
            tc3 tc3Var2 = new tc3(1271844412, new wd0((List) obj, r7), r7);
            boolean g3 = av8Var.g(hb8Var2);
            Object O4 = av8Var.O();
            if (g3 || O4 == a99Var) {
                O4 = new qxc(hb8Var2);
                av8Var.n0(O4);
            }
            k1c k1cVar = (k1c) O4;
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
            waa.K(av8Var, k1cVar, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            fc6.v(0, tc3Var2, av8Var, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(xtcVar, pg0Var, lg0Var, c98Var, tc3Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(final xtc xtcVar, lg0 lg0Var, pg0 pg0Var, lv1 lv1Var, int i2, int i3, final tc3 tc3Var, of3 of3Var, final int i4, final int i5) {
        int i6;
        lg0 lg0Var2;
        int i7;
        pg0 pg0Var2;
        int i8;
        lv1 lv1Var2;
        int i9;
        int i10;
        av8 av8Var;
        final int i11;
        final lg0 lg0Var3;
        final pg0 pg0Var3;
        final lv1 lv1Var3;
        final int i12;
        eqf u;
        int i13;
        lg0 lg0Var4;
        int i14;
        lv1 lv1Var4;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1303174015);
        if ((i4 & 6) == 0) {
            i6 = (av8Var2.g(xtcVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            lg0Var2 = lg0Var;
            i6 |= av8Var2.g(lg0Var2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                pg0Var2 = pg0Var;
                i6 |= av8Var2.g(pg0Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    lv1Var2 = lv1Var;
                    i6 |= av8Var2.g(lv1Var2) ? a.o : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i6 |= av8Var2.e(i2) ? 16384 : 8192;
                        i10 = i6 | 196608;
                        if ((i4 & 1572864) == 0) {
                            i10 |= av8Var2.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                        }
                        if (av8Var2.T(i10 & 1, (599187 & i10) != 599186)) {
                            if (i15 != 0) {
                                lg0Var4 = ww9.b;
                                i13 = i9;
                            } else {
                                i13 = i9;
                                lg0Var4 = lg0Var2;
                            }
                            pg0 pg0Var4 = i7 != 0 ? ww9.d : pg0Var2;
                            if (i8 != 0) {
                                lv1Var4 = uxf.l;
                                i14 = 1572864;
                            } else {
                                i14 = 1572864;
                                lv1Var4 = lv1Var2;
                            }
                            int i16 = i13 != 0 ? Integer.MAX_VALUE : i2;
                            av8Var = av8Var2;
                            o(xtcVar, lg0Var4, pg0Var4, lv1Var4, i16, jb8.t, tc3Var, av8Var, (i10 & 14) | i14 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | ((i10 << 3) & 29360128));
                            i11 = Integer.MAX_VALUE;
                            lg0Var3 = lg0Var4;
                            pg0Var3 = pg0Var4;
                            lv1Var3 = lv1Var4;
                            i12 = i16;
                        } else {
                            av8Var = av8Var2;
                            av8Var.W();
                            i11 = i3;
                            lg0Var3 = lg0Var2;
                            pg0Var3 = pg0Var2;
                            lv1Var3 = lv1Var2;
                            i12 = i2;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new Function2() { // from class: cb8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    s02.n(xtc.this, lg0Var3, pg0Var3, lv1Var3, i12, i11, tc3Var, (of3) obj, aba.K(i4 | 1), i5);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i10 = i6 | 196608;
                    if ((i4 & 1572864) == 0) {
                    }
                    if (av8Var2.T(i10 & 1, (599187 & i10) != 599186)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                lv1Var2 = lv1Var;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i6 | 196608;
                if ((i4 & 1572864) == 0) {
                }
                if (av8Var2.T(i10 & 1, (599187 & i10) != 599186)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            pg0Var2 = pg0Var;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            lv1Var2 = lv1Var;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i6 | 196608;
            if ((i4 & 1572864) == 0) {
            }
            if (av8Var2.T(i10 & 1, (599187 & i10) != 599186)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        lg0Var2 = lg0Var;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        pg0Var2 = pg0Var;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        lv1Var2 = lv1Var;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i6 | 196608;
        if ((i4 & 1572864) == 0) {
        }
        if (av8Var2.T(i10 & 1, (599187 & i10) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void o(xtc xtcVar, lg0 lg0Var, pg0 pg0Var, lv1 lv1Var, int i2, jb8 jb8Var, tc3 tc3Var, of3 of3Var, int i3) {
        int i4;
        jb8 jb8Var2;
        ?? r0;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1956591841);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.g(xtcVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.g(lg0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.g(pg0Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= av8Var.g(lv1Var) ? a.o : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= av8Var.e(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= av8Var.e(Integer.MAX_VALUE) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i3) == 0) {
            jb8Var2 = jb8Var;
            i4 |= av8Var.g(jb8Var2) ? 1048576 : 524288;
        } else {
            jb8Var2 = jb8Var;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= av8Var.i(tc3Var) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (av8Var.T(i5 & 1, (i5 & 4793491) != 4793490)) {
            int i6 = i5 & 3670016;
            boolean z = i6 == 1048576;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                jb8Var2.getClass();
                db8 db8Var = db8.a;
                O = new fb8();
                av8Var.n0(O);
            }
            fb8 fb8Var = (fb8) O;
            int i7 = i5 >> 3;
            boolean g2 = ((((57344 & i7) ^ 24576) > 16384 && av8Var.e(Integer.MAX_VALUE)) || (i7 & 24576) == 16384) | ((((i7 & 14) ^ 6) > 4 && av8Var.g(lg0Var)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && av8Var.g(pg0Var)) || (i7 & 48) == 32) | ((((i7 & 896) ^ 384) > 256 && av8Var.g(lv1Var)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && av8Var.e(i2)) || (i7 & 3072) == 2048) | av8Var.g(fb8Var);
            Object O2 = av8Var.O();
            if (g2 || O2 == a99Var) {
                r0 = 1;
                hb8 hb8Var = new hb8(true, lg0Var, pg0Var, lg0Var.e(), new y14(lv1Var), pg0Var.e(), i2, fb8Var);
                av8Var.n0(hb8Var);
                O2 = hb8Var;
            } else {
                r0 = 1;
            }
            hb8 hb8Var2 = (hb8) O2;
            boolean z2 = ((i5 & 29360128) == 8388608 ? r0 : false) | (i6 == 1048576 ? r0 : false) | ((i5 & 458752) == 131072 ? r0 : false);
            Object O3 = av8Var.O();
            Object obj = O3;
            if (z2 || O3 == a99Var) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new tc3(-1192950673, new b25(tc3Var, 3), r0));
                jb8Var.getClass();
                db8 db8Var2 = db8.a;
                av8Var.n0(arrayList);
                obj = arrayList;
            }
            tc3 tc3Var2 = new tc3(1271844412, new wd0((List) obj, r0), r0);
            boolean g3 = av8Var.g(hb8Var2);
            Object O4 = av8Var.O();
            if (g3 || O4 == a99Var) {
                O4 = new qxc(hb8Var2);
                av8Var.n0(O4);
            }
            k1c k1cVar = (k1c) O4;
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
            waa.K(av8Var, k1cVar, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            fc6.v(0, tc3Var2, av8Var, r0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hk2(xtcVar, lg0Var, pg0Var, lv1Var, i2, jb8Var, tc3Var, i3);
        }
    }

    public static final void p(gv9 gv9Var, il8 il8Var, boolean z, Function1 function1, boolean z2, xtc xtcVar, boolean z3, of3 of3Var, int i2) {
        int i3;
        boolean z4;
        Function1 function12;
        boolean z5;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2033936407);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.e(il8Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z;
            i3 |= av8Var.h(z4) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            z4 = z;
        }
        if ((i2 & 3072) == 0) {
            function12 = function1;
            i3 |= av8Var.i(function12) ? a.o : 1024;
        } else {
            function12 = function1;
        }
        if ((i2 & 24576) == 0) {
            z5 = z2;
            i3 |= av8Var.h(z5) ? 16384 : 8192;
        } else {
            z5 = z2;
        }
        int i4 = i3 | 196608;
        boolean z6 = z3;
        if ((1572864 & i2) == 0) {
            i4 |= av8Var.h(z6) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
            float doubleValue = (float) (((Number) av8Var.k(thb.a)).doubleValue() * 8.0d);
            kg0 kg0Var = ww9.h;
            lv1 lv1Var = uxf.m;
            long D = lz.D(R.color.fantasy_pitch_line_light, av8Var);
            jf9 jf9Var = oyn.e;
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(bkh.d(l98.b0(n9e.q(utcVar, D, jf9Var), 8.0f), 1.0f), lz.D(R.color.fantasy_bench, av8Var), o7g.a(doubleValue)), 16.0f, 8.0f);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p = ljg.p(av8Var, C, hf3.d, 2071038085, gv9Var);
            while (p.hasNext()) {
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) p.next();
                u23 a3 = t23.a(ww9.d, uxf.p, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, utcVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                String str = fantasyRoundPlayerUiModel.b.a;
                yf8 yf8Var = xth.a;
                utc utcVar2 = utcVar;
                av8 av8Var2 = av8Var;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131066);
                int i5 = i4 << 3;
                dy0.g(fantasyRoundPlayerUiModel, il8Var, false, z4, function12, z5, null, z6, av8Var2, (i4 & 112) | 384 | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 29360128), 64);
                av8Var = av8Var2;
                av8Var.s(true);
                z4 = z;
                function12 = function1;
                z5 = z2;
                z6 = z3;
                utcVar = utcVar2;
            }
            av8Var.s(false);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vy6(gv9Var, il8Var, z, function1, z2, xtcVar2, z3, i2);
        }
    }

    public static final void q(do7 do7Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1047841128);
        int i3 = i2 | (av8Var.g(do7Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            lv1 lv1Var = uxf.m;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            long D = lz.D(R.color.on_color_primary, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = b74.B;
                av8Var.n0(O2);
            }
            gm gmVar = new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 21);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(tol.y(utcVar, true, true, true, D, wzcVar, gmVar, av8Var, 0), 16.0f, 8.0f);
            l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
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
            goa g2 = ljg.g(av8Var, C, f50Var3, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, g2);
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
            String str = do7Var.b;
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, 0, 24960, 110586);
            udj.c(do7Var.g, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            kq9.b(s6a.N(R.drawable.ic_chevron_right_small_16, 6, av8Var), null, bkh.l(l98.b0(utcVar, 8.0f), 24.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ar6(do7Var, function0, xtcVar2, i2, 1);
        }
    }

    public static final void r(final String str, xtc xtcVar, final boolean z, final long j, final long j2, of3 of3Var, final int i2) {
        int i3;
        final xtc xtcVar2;
        xtc xtcVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1014388997);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.f(j) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.f(j2) ? 16384 : 8192;
        }
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            av8Var.Y();
            int i5 = i2 & 1;
            utc utcVar = utc.a;
            if (i5 == 0 || av8Var.B()) {
                xtcVar3 = utcVar;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
            }
            av8Var.t();
            int i6 = i4 >> 3;
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar3);
            if3.k7.getClass();
            int i7 = i4;
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            xtc xtcVar4 = xtcVar3;
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            goa g2 = ljg.g(av8Var, C, hf3.d, 1.0f, false);
            long j3 = z ? j2 : j;
            yf8 yf8Var = xth.a;
            udj.c(str, g2, j3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var, i7 & 14, 24960, 110584);
            av8Var = av8Var;
            if (z) {
                ljg.r(4.0f, 1471453494, av8Var, av8Var, utcVar);
                kq9.b(s6a.N(R.drawable.ic_arrow_back, 6, av8Var), null, haa.v(bkh.l(utcVar, 12.0f), 180.0f), j2, av8Var, (i6 & 7168) | 432, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(1471804259);
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = xtcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: zq6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s02.r(str, xtcVar2, z, j, j2, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void s(ho7 ho7Var, int i2, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i3) {
        xtc xtcVar2;
        long f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1665023260);
        int i4 = i3 | (av8Var.g(ho7Var) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function02) ? a.o : 1024) | 24576;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            utc utcVar = utc.a;
            xtc b0 = l98.b0(fz8.Y(bkh.d(utcVar, 1.0f), n9a.b), 8.0f);
            l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            String upperCase = oea.v(R.string.players, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Iterator<E> it = rz6.m.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                i5 += ((rz6) it.next()).f;
            }
            context.getClass();
            String g2 = fc6.g(i2, i5, hkg.c0(context) ? "\\" : "/");
            p8g p8gVar = p8g.a;
            t(g2, upperCase, bkh.c(p8gVar.a(1.0f, utcVar, true), 1.0f), null, 0L, null, null, av8Var, 0, 120);
            xtc a3 = p8gVar.a(1.28f, utcVar, true);
            String v = oea.v(R.string.points, av8Var);
            Locale locale = Locale.ROOT;
            String upperCase2 = v.toUpperCase(locale);
            upperCase2.getClass();
            Integer num = ho7Var.b;
            String i6 = num != null ? dla.i(num) : null;
            Regex regex = yid.a;
            if (i6 == null) {
                i6 = "-";
            }
            long D = lz.D(R.color.on_color_highlight_2, av8Var);
            if (ho7Var.h) {
                av8Var.d0(-191580727);
                av8Var.s(false);
                f2 = vrh.c;
            } else {
                f2 = ljg.f(av8Var, -191579994, R.color.on_color_primary, av8Var, false);
            }
            yf8 yf8Var = xth.a;
            t(i6, upperCase2, a3, new r13(D), f2, dfj.a(xth.h(), 0L, v8a.v(48), null, null, 0L, null, 0, 0, v8a.v(56), null, null, 0, 16646141), function0, av8Var, (i4 << 12) & 3670016, 0);
            String upperCase3 = oea.v(R.string.highest_points_scored, av8Var).toUpperCase(locale);
            upperCase3.getClass();
            Integer num2 = ho7Var.a.i;
            String i7 = num2 != null ? dla.i(num2) : null;
            t(i7 == null ? "-" : i7, upperCase3, bkh.c(p8gVar.a(1.0f, utcVar, true), 1.0f), null, 0L, null, function02, av8Var, (i4 << 9) & 3670016, 56);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(ho7Var, i2, function0, function02, xtcVar2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final String str, final String str2, final xtc xtcVar, r13 r13Var, long j, dfj dfjVar, Function0 function0, of3 of3Var, final int i2, final int i3) {
        int i4;
        r13 r13Var2;
        long j2;
        dfj dfjVar2;
        int i5;
        av8 av8Var;
        final r13 r13Var3;
        final long j3;
        final dfj dfjVar3;
        final Function0 function02;
        eqf u;
        dfj dfjVar4;
        dfj dfjVar5;
        int i6;
        Function0 function03;
        Object O;
        a99 a99Var;
        Object O2;
        int i7;
        int i8;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-145649791);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            r13Var2 = r13Var;
            i4 |= av8Var2.g(r13Var2) ? a.o : 1024;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j2 = j;
                    if (av8Var2.f(j2)) {
                        i8 = 16384;
                        i4 |= i8;
                    }
                } else {
                    j2 = j;
                }
                i8 = 8192;
                i4 |= i8;
            } else {
                j2 = j;
            }
            if ((196608 & i2) != 0) {
                if ((i3 & 32) == 0) {
                    dfjVar2 = dfjVar;
                    if (av8Var2.g(dfjVar2)) {
                        i7 = 131072;
                        i4 |= i7;
                    }
                } else {
                    dfjVar2 = dfjVar;
                }
                i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i4 |= i7;
            } else {
                dfjVar2 = dfjVar;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                i4 |= av8Var2.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                if (av8Var2.T(i4 & 1, (599187 & i4) != 599186)) {
                    av8Var2.Y();
                    if ((i2 & 1) == 0 || av8Var2.B()) {
                        if (i9 != 0) {
                            r13Var2 = null;
                        }
                        if ((i3 & 16) != 0) {
                            j2 = lz.D(R.color.on_color_primary, av8Var2);
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            yf8 yf8Var = xth.a;
                            dfjVar4 = xth.h();
                            i4 &= -458753;
                        } else {
                            dfjVar4 = dfjVar2;
                        }
                        dfjVar5 = dfjVar4;
                        i6 = i4;
                        if (i5 != 0) {
                            function03 = null;
                            av8Var2.t();
                            kg0 kg0Var = ww9.f;
                            kv1 kv1Var = uxf.p;
                            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), r13Var2 == null ? r13Var2.a : r13.h, oyn.e);
                            boolean z = function03 == null;
                            long D = lz.D(R.color.on_color_primary, av8Var2);
                            O = av8Var2.O();
                            a99Var = nf3.a;
                            if (O == a99Var) {
                                O = mz1.e(av8Var2);
                            }
                            wzc wzcVar = (wzc) O;
                            Object[] objArr = new Object[0];
                            O2 = av8Var2.O();
                            if (O2 == a99Var) {
                                O2 = b74.C;
                                av8Var2.n0(O2);
                            }
                            xtc b0 = l98.b0(tol.y(q, z, true, true, D, wzcVar, new gm((boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), function03, 22), av8Var2, 0), 8.0f);
                            u23 a2 = t23.a(kg0Var, kv1Var, av8Var2, 54);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m = av8Var2.m();
                            xtc C = fqj.C(av8Var2, b0);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.q0();
                            } else {
                                av8Var2.l(zg3Var);
                            }
                            waa.K(av8Var2, a2, hf3.g);
                            waa.K(av8Var2, m, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C, hf3.d);
                            udj.c(str, null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, dfjVar5, av8Var2, (i6 & 14) | ((i6 >> 6) & 896), (29360128 & (i6 << 6)) | 24960, 110586);
                            nq8.h(av8Var2, bkh.e(utc.a, 8.0f));
                            r(str2, null, function03 == null, lz.D(R.color.on_color_secondary, av8Var2), lz.D(R.color.on_color_primary, av8Var2), av8Var2, (i6 >> 3) & 14);
                            av8Var = av8Var2;
                            av8Var.s(true);
                            r13Var3 = r13Var2;
                            j3 = j2;
                            dfjVar3 = dfjVar5;
                            function02 = function03;
                        }
                    } else {
                        av8Var2.W();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        i6 = i4;
                        dfjVar5 = dfjVar2;
                    }
                    function03 = function0;
                    av8Var2.t();
                    kg0 kg0Var2 = ww9.f;
                    kv1 kv1Var2 = uxf.p;
                    xtc q2 = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), r13Var2 == null ? r13Var2.a : r13.h, oyn.e);
                    if (function03 == null) {
                    }
                    long D2 = lz.D(R.color.on_color_primary, av8Var2);
                    O = av8Var2.O();
                    a99Var = nf3.a;
                    if (O == a99Var) {
                    }
                    wzc wzcVar2 = (wzc) O;
                    Object[] objArr2 = new Object[0];
                    O2 = av8Var2.O();
                    if (O2 == a99Var) {
                    }
                    xtc b02 = l98.b0(tol.y(q2, z, true, true, D2, wzcVar2, new gm((boh) o3a.N(objArr2, (Function0) O2, av8Var2, 48), function03, 22), av8Var2, 0), 8.0f);
                    u23 a22 = t23.a(kg0Var2, kv1Var2, av8Var2, 54);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b02);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                    }
                    waa.K(av8Var2, a22, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C2, hf3.d);
                    udj.c(str, null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, dfjVar5, av8Var2, (i6 & 14) | ((i6 >> 6) & 896), (29360128 & (i6 << 6)) | 24960, 110586);
                    nq8.h(av8Var2, bkh.e(utc.a, 8.0f));
                    r(str2, null, function03 == null, lz.D(R.color.on_color_secondary, av8Var2), lz.D(R.color.on_color_primary, av8Var2), av8Var2, (i6 >> 3) & 14);
                    av8Var = av8Var2;
                    av8Var.s(true);
                    r13Var3 = r13Var2;
                    j3 = j2;
                    dfjVar3 = dfjVar5;
                    function02 = function03;
                } else {
                    av8Var = av8Var2;
                    av8Var.W();
                    r13Var3 = r13Var2;
                    j3 = j2;
                    dfjVar3 = dfjVar2;
                    function02 = function0;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: yq6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            s02.t(str, str2, xtcVar, r13Var3, j3, dfjVar3, function02, (of3) obj, aba.K(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (av8Var2.T(i4 & 1, (599187 & i4) != 599186)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        r13Var2 = r13Var;
        if ((i2 & 24576) != 0) {
        }
        if ((196608 & i2) != 0) {
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        if (av8Var2.T(i4 & 1, (599187 & i4) != 599186)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(String str, int i2, xtc xtcVar, Boolean bool, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        int i5;
        Boolean bool2;
        Boolean bool3;
        eqf u;
        boolean z;
        long f2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(989204737);
        int i6 = (av8Var.e(i2) ? 32 : 16) | i3;
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 = i6 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i6 | (av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            bool2 = bool;
            i5 |= av8Var.g(bool2) ? a.o : 1024;
            if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
                av8Var.W();
                bool3 = bool2;
            } else {
                utc utcVar = utc.a;
                if (i7 != 0) {
                    xtcVar2 = utcVar;
                }
                Boolean bool4 = i8 != 0 ? null : bool2;
                xtc d0 = l98.d0(xtcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
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
                xtc d02 = l98.d0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                yf8 yf8Var = xth.a;
                udj.c(str, d02, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 54, 0, 131064);
                udj.c(oea.v(i2, av8Var), l98.d0(new goa(1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var, 0, 0, 131064);
                av8Var = av8Var;
                if (bool4 != null) {
                    av8Var.d0(-1243118282);
                    xtc l = bkh.l(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f);
                    ImageVector N = s6a.N(bool4.booleanValue() ? R.drawable.ic_tv_channel_checkmark_16 : R.drawable.ic_hour, 6, av8Var);
                    if (bool4.booleanValue()) {
                        z = false;
                        f2 = ljg.f(av8Var, 1899571569, R.color.success, av8Var, false);
                    } else {
                        z = false;
                        f2 = ljg.f(av8Var, 1899572152, R.color.neutral_default, av8Var, false);
                    }
                    kq9.b(N, null, l, f2, av8Var, 432, 0);
                    av8Var.s(z);
                } else {
                    av8Var.d0(-1242763363);
                    av8Var.s(false);
                }
                av8Var.s(true);
                bool3 = bool4;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new gt5(str, i2, xtcVar2, bool3, i3, i4);
                return;
            }
            return;
        }
        bool2 = bool;
        if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void v(Function0 function0, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(469729309);
        int i3 = (av8Var.i(function0) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            un0.a(bkh.d(l98.b0(utc.a, 8.0f), 1.0f), o7g.a(16.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, yqo.H(-733679253, av8Var, new r64(3, function0)), av8Var, 196614, 24);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f91(i2, 5, function0);
        }
    }

    public static final void w(mj7 mj7Var, boolean z, boolean z2, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        int i3;
        int i4;
        String str;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1018908294);
        int i5 = i2 | (av8Var2.g(mj7Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= av8Var2.h(z) ? 32 : 16;
        }
        int i6 = i5 | 3072;
        if (av8Var2.T(i6 & 1, (i6 & 1171) != 1170)) {
            Context context = (Context) av8Var2.k(nz.b);
            if (z2) {
                av8Var2.d0(1763325545);
                long j = mj7Var.d;
                bi4 bi4Var = bi4.PATTERN_DMMHHSS;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                str = oea.w(R.string.deadline_time, new Object[]{fc6.i(j, hk4.a(bi4Var.d()))}, av8Var2);
                av8Var2.s(false);
            } else {
                av8Var2.d0(1763484544);
                if (z) {
                    i3 = -81659406;
                    i4 = R.string.standings_live;
                } else if (!mj7Var.h()) {
                    i3 = -81656980;
                    i4 = R.string.upcoming;
                } else if (mj7Var.d()) {
                    i3 = -81654708;
                    i4 = R.string.finished;
                } else {
                    i3 = -81652817;
                    i4 = R.string.in_progress;
                }
                String k = ljg.k(av8Var2, i3, i4, av8Var2, false);
                str = oea.v(R.string.status_colon, av8Var2) + " " + k;
                av8Var2.s(false);
            }
            String str2 = str;
            kv1 kv1Var = uxf.p;
            utc utcVar = utc.a;
            xtc d0 = l98.d0(l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            String B = f5p.B(context, mj7Var.c, mj7Var.b);
            yf8 yf8Var = xth.a;
            udj.c(B, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 0, 24960, 110586);
            udj.c(str2, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
            av8Var = av8Var2;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bl1(mj7Var, z, z2, xtcVar2, i2, 2);
        }
    }

    public static final void x(String str, String str2, String str3, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1874980308);
        int i3 = i2 | (av8Var2.g(str) ? 4 : 2) | (av8Var2.g(str2) ? 32 : 16) | (av8Var2.g(str3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            kv1 kv1Var = uxf.p;
            xtc c0 = l98.c0(xtcVar, 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, i3 & 14, 24960, 110586);
            av8Var = av8Var2;
            nq8.h(av8Var, bkh.e(utc.a, 4.0f));
            udj.c(str2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.h(), av8Var2, (i3 >> 3) & 14, 24960, 110586);
            udj.c(str3, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, (i3 >> 6) & 14, 24960, 110586);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ace(i2, 18, str, str2, str3, xtcVar);
        }
    }

    public static final void y(int i2, int i3, of3 of3Var, gv9 gv9Var, Function1 function1) {
        Function1 function12;
        int i4;
        Function1 function13;
        Function1 function14;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1578687843);
        int i5 = i2 | (av8Var.g(gv9Var) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
            function12 = function1;
        } else {
            function12 = function1;
            i4 = i5 | (av8Var.i(function12) ? 32 : 16);
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            if (i6 != 0) {
                Object O = av8Var.O();
                if (O == nf3.a) {
                    O = new z1h(12);
                    av8Var.n0(O);
                }
                function14 = (Function1) O;
            } else {
                function14 = function12;
            }
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var, 48);
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
            int i7 = 6;
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(i7)), uxf.o, av8Var, 54);
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
            Iterator p = ljg.p(av8Var, C2, f50Var3, -453115427, gv9Var);
            int i8 = 0;
            while (p.hasNext()) {
                Object next = p.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    b.q();
                    throw null;
                }
                lmi lmiVar = (lmi) next;
                int i10 = lmiVar.b;
                vv3 vv3Var = lmiVar.a;
                int i11 = i10 < 0 ? vv3Var.a : vv3Var.b;
                int i12 = i10 < 0 ? vv3Var.c : vv3Var.d;
                lv1 lv1Var = uxf.m;
                xtc xtcVar = (xtc) function14.invoke(Integer.valueOf(i8));
                l8g a4 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, xtcVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, hf3.g);
                waa.K(av8Var, m3, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode3), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C3, hf3.d);
                kq9.b(s6a.N(i11, i7, av8Var), null, bkh.l(utcVar, 14.0f), lz.D(R.color.on_color_secondary, av8Var), av8Var, 432, 0);
                String upperCase = fc6.f(8.0f, i12, av8Var, av8Var, utcVar).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(upperCase, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                av8Var.s(true);
                i8 = i9;
                function14 = function14;
                i7 = i7;
                utcVar = utcVar;
            }
            ljg.t(av8Var, false, true, true);
            function13 = function14;
        } else {
            av8Var.W();
            function13 = function12;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gzg(gv9Var, function13, i2, i3, 1);
        }
    }

    public static final void z(e9i e9iVar, tkh tkhVar, of3 of3Var, int i2) {
        int i3;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(762878816);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(tkhVar) ? 32 : 16;
        }
        int i4 = i3;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
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
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String a3 = tkhVar.a.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj i5 = xth.i();
            long D = lz.D(R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            udj.c(a3, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, i5, av8Var, 48, 0, 130040);
            nq8.h(av8Var, bkh.e(utcVar, 48.0f));
            float a4 = e9iVar.a(1000, 500);
            float f2 = (0.1f * a4) + 0.9f;
            xtc c2 = bkh.c(bkh.d(utcVar, 1.0f), 0.6f);
            boolean d2 = av8Var.d(a4) | av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d2 || O == a99Var) {
                O = new n28(13, a4, f2);
                av8Var.n0(O);
            }
            B(tkhVar, M(c2, (Function1) O), 0L, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i4 >> 3) & 14);
            nq8.h(av8Var, bkh.e(utcVar, 24.0f));
            gv9 gv9Var = tkhVar.b;
            boolean z2 = (i4 & 14) == 4;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                z = true;
                O2 = new hzg(e9iVar, 1 == true ? 1 : 0);
                av8Var.n0(O2);
            } else {
                z = true;
            }
            y(0, 0, av8Var, gv9Var, (Function1) O2);
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p8b(e9iVar, tkhVar, i2, 24);
        }
    }

    public abstract InputFilter[] J(InputFilter[] inputFilterArr);

    public abstract boolean Q();

    public abstract void a0(boolean z);

    public abstract void b0(boolean z);

    public abstract TransformationMethod k0(TransformationMethod transformationMethod);
}
