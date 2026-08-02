package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.C4427z5;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.comparison.FantasyPlayerComparisonActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ml4 {
    public static final f80 a = new f80(Float.POSITIVE_INFINITY);
    public static final g80 b = new g80(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final h80 c = new h80(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final i80 d = new i80(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final f80 e = new f80(Float.NEGATIVE_INFINITY);
    public static final g80 f = new g80(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final h80 g = new h80(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final i80 h = new i80(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final tc3 i = new tc3(-671240746, new ed3(4), false);
    public static final tc3 j = new tc3(-612039772, new qd3(24), false);
    public static final za5 k = new za5(17);
    public static final int[] l = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] m = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] n = {3, 6};
    public static final int[] o = {1, 2, 4, 5, 7, 8};
    public static final nxk p = new nxk(18);
    public static final nxk q = new nxk(19);
    public static final nxk r = new nxk(20);
    public static final nxk s = new nxk(21);
    public static final nxk t = new nxk(22);
    public static final /* synthetic */ int u = 0;
    public static final /* synthetic */ int v = 0;

    public static final void A(c3e c3eVar, Function1 function1, of3 of3Var, int i2) {
        int i3;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(855223054);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? av8Var.g(c3eVar) : av8Var.i(c3eVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc J = lz.J(bkh.c, jaa.L(av8Var), null);
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 5);
            boolean z = ((i3 & 14) == 4 || ((i3 & 8) != 0 && av8Var.i(c3eVar))) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new ord(6, c3eVar, function1);
                av8Var.n0(O);
            }
            v8a.a(J, null, C, null, null, null, false, null, (Function1) O, av8Var, 100663680, 250);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new p8b(c3eVar, function1, i2, 15);
        }
    }

    public static final void B(h83 h83Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1202536586);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(h83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        boolean z = false;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            if (Intrinsics.c(h83Var.c, Sports.FOOTBALL) && h83Var.b == gvh.e && (h83Var.d || h83Var.e)) {
                z = true;
            }
            boolean i5 = av8Var.i(context);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i5 || O == a99Var) {
                O = new c6(context, 12);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            tee teeVar = h83Var.a;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new q73(3);
                av8Var.n0(O2);
            }
            Function1 function1 = (Function1) O2;
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new q73(i4);
                av8Var.n0(O3);
            }
            l98.b(teeVar, null, function1, null, "RatingRowMorph", (Function1) O3, yqo.H(738506121, av8Var, new r73(z, function0, xtcVar)), av8Var, 1794432, 10);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lj(h83Var, xtcVar, i2, 11);
        }
    }

    public static final void C(hth hthVar, final vfi vfiVar, float f2, final float f3, of3 of3Var, final int i2) {
        float f4;
        boolean z;
        boolean z2;
        final hth hthVar2 = hthVar;
        gv9 gv9Var = hthVar2.a;
        vfiVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(366909826);
        int i3 = i2 | (av8Var.g(hthVar2) ? 4 : 2) | (av8Var.g(vfiVar) ? 32 : 16) | (av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.d(f3) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = hthVar2.b;
            tfi tfiVar = (tfi) gv9Var.get(i4);
            tfi tfiVar2 = (tfi) CollectionsKt.a0(i4 - 1, gv9Var);
            g28 g28Var = bkh.c;
            mv1 mv1Var = uxf.c;
            k1c c2 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            if ((tfiVar instanceof eaa) || ((z2 = hthVar2.f) && (tfiVar instanceof hvc))) {
                f4 = f2;
                int i5 = 0;
                av8Var.d0(-220416816);
                hthVar2 = hthVar;
                eth.b(hthVar2.e, ((Number) vfiVar.a.d()).floatValue(), yqo.H(-1717848259, av8Var, new rsh(i5, hthVar2, vfiVar)), av8Var, 384);
                av8Var.s(false);
                z = true;
            } else {
                a99 a99Var = nf3.a;
                if (i4 >= 1 && z2 && (tfiVar instanceof n2k) && (tfiVar2 instanceof n2k)) {
                    n2k n2kVar = (n2k) tfiVar;
                    n2k n2kVar2 = (n2k) tfiVar2;
                    if (!Intrinsics.c(n2kVar.f(), n2kVar2.f())) {
                        av8Var.d0(-218727316);
                        k1c c3 = e12.c(mv1Var, false);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, g28Var);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c3, f50Var);
                        waa.K(av8Var, m3, ff3Var);
                        bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C2, f50Var3);
                        int i6 = i3 & 112;
                        boolean z3 = (i6 == 32) | ((i3 & 14) == 4);
                        Object O = av8Var.O();
                        if (z3 || O == a99Var) {
                            O = new aaf(19, vfiVar, hthVar2);
                            av8Var.n0(O);
                        }
                        xtc M = s02.M(g28Var, (Function1) O);
                        k1c c4 = e12.c(mv1Var, false);
                        int hashCode3 = Long.hashCode(av8Var.T);
                        aee m4 = av8Var.m();
                        xtc C3 = fqj.C(av8Var, M);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c4, f50Var);
                        waa.K(av8Var, m4, ff3Var);
                        bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C3, f50Var3);
                        t2k.c(n2kVar2.f(), n2kVar2.c(), n2kVar2.b(), Math.max(((Number) vfiVar.e.d()).floatValue(), ((Number) vfiVar.f.d()).floatValue()), null, av8Var, 0);
                        av8Var.s(true);
                        boolean z4 = i6 == 32;
                        Object O2 = av8Var.O();
                        if (z4 || O2 == a99Var) {
                            O2 = new qfg(vfiVar, 24);
                            av8Var.n0(O2);
                        }
                        xtc M2 = s02.M(g28Var, (Function1) O2);
                        k1c c5 = e12.c(mv1Var, false);
                        int hashCode4 = Long.hashCode(av8Var.T);
                        aee m5 = av8Var.m();
                        xtc C4 = fqj.C(av8Var, M2);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, c5, f50Var);
                        waa.K(av8Var, m5, ff3Var);
                        bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C4, f50Var3);
                        t2k.c(n2kVar.f(), n2kVar.c(), n2kVar.b(), Math.max(((Number) vfiVar.h.d()).floatValue(), ((Number) vfiVar.i.d()).floatValue()), null, av8Var, 0);
                        z = true;
                        ljg.t(av8Var, true, true, false);
                        hthVar2 = hthVar;
                        f4 = f2;
                    }
                }
                av8Var.d0(-216977831);
                if (!(tfiVar instanceof n2k)) {
                    throw dmi.h(av8Var, 2071210697, false);
                }
                av8Var.d0(-216921566);
                boolean z5 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
                Object O3 = av8Var.O();
                if (z5 || O3 == a99Var) {
                    f4 = f2;
                    O3 = new n28(15, f4, f3);
                    av8Var.n0(O3);
                } else {
                    f4 = f2;
                }
                xtc M3 = s02.M(g28Var, (Function1) O3);
                k1c c6 = e12.c(mv1Var, false);
                int hashCode5 = Long.hashCode(av8Var.T);
                aee m6 = av8Var.m();
                xtc C5 = fqj.C(av8Var, M3);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c6, f50Var);
                waa.K(av8Var, m6, ff3Var);
                bf3.s(hashCode5, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C5, f50Var3);
                n2k n2kVar3 = (n2k) tfiVar;
                t2k.c(n2kVar3.f(), n2kVar3.c(), n2kVar3.b(), Math.max(f2, f3), null, av8Var, 0);
                z = true;
                ljg.t(av8Var, true, false, false);
                hthVar2 = hthVar;
            }
            av8Var.s(z);
        } else {
            f4 = f2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            final float f5 = f4;
            u2.d = new Function2(vfiVar, f5, f3, i2) { // from class: ssh
                public final /* synthetic */ vfi b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    ml4.C(hth.this, this.b, this.c, this.d, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void D(b83 b83Var, List list, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(549461209);
        int i3 = i2 | (av8Var.i(b83Var) ? 4 : 2) | (av8Var.i(list) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        boolean z2 = true;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.d0(-248746524);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            if (z) {
                d2 = d2.z(f5p.s(lz.D(R.color.n_lv_4, av8Var)));
            }
            av8Var.s(false);
            xtc f0 = l98.f0(d2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String a3 = b83Var.a.a(av8Var);
            boolean z3 = b83Var.d != null;
            utc utcVar = utc.a;
            i(384, av8Var, l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), a3, z3);
            xtc g2 = bkh.g(bkh.d(utcVar, 1.0f), 22.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, g2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            av8Var.d0(820157379);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                e93 e93Var = (e93) entry.getKey();
                String str = (String) entry.getValue();
                Regex regex = yid.a;
                if (str == null) {
                    str = "-";
                }
                l(str, b83Var.c.contains(e93Var), uxf.g, new goa(1.0f, z2), 2, 0L, av8Var, 24960, 32);
                z2 = z2;
            }
            boolean z4 = z2;
            ljg.t(av8Var, false, z4, z4);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new t73(b83Var, list, z, xtcVar, i2, 0);
        }
    }

    public static final void E(gv9 gv9Var, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        gv9 gv9Var2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1375383914);
        int i3 = i2 | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc c0 = l98.c0(bkh.d(xtcVar, 1.0f), 16.0f, 12.0f);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, c0);
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
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            String v2 = oea.v(R.string.average_sofascore_rating, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.g(), av8Var2, 0, 24960, 109562);
            av8Var = av8Var2;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a3 = k8g.a(ww9.g, uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            gv9Var2 = gv9Var;
            Iterator p2 = ljg.p(av8Var, C2, f50Var3, -117488597, gv9Var2);
            while (p2.hasNext()) {
                j((Double) p2.next(), bkh.p(utcVar, 64.0f), av8Var, 48, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
            if (z) {
                av8Var.d0(1000954946);
                x2a.e(oea.v(R.string.hint_new_team_rating, av8Var), function0, wnn.A(l98.b0(utcVar, 8.0f), o7g.a(8.0f)), null, 0L, lz.D(R.color.surface_2, av8Var), null, R.drawable.ic_chevron_right_large_16, uxf.l, 8, 8, 12, av8Var, ((i3 >> 3) & 112) | 805309440, 438, 336);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(1001549154);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            gv9Var2 = gv9Var;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new v73(gv9Var2, z, function0, xtcVar, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r10v4, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r10v6, types: [av8] */
    /* JADX WARN: Type inference failed for: r10v7, types: [av8] */
    /* JADX WARN: Type inference failed for: r10v9, types: [av8] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v8 */
    public static final void F(int i2, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1, boolean z) {
        av8 av8Var;
        k83 k83Var;
        int i3;
        ?? r15;
        utc utcVar;
        ?? r10;
        ?? r0;
        boolean z2;
        ?? r102;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1696948752);
        int i4 = i2 | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        boolean z3 = true;
        int i5 = 0;
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            av8Var2.d0(1319830683);
            float f2 = 1.0f;
            xtc d2 = bkh.d(xtcVar, 1.0f);
            int i6 = R.color.n_lv_4;
            if (z) {
                d2 = d2.z(f5p.s(lz.D(R.color.n_lv_4, av8Var2)));
            }
            av8Var2.s(false);
            xtc c0 = l98.c0(d2, 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
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
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            Iterator p2 = ljg.p(av8Var2, C, hf3.d, -1389299963, gv9Var);
            ?? r103 = av8Var2;
            while (p2.hasNext()) {
                k83 k83Var2 = (k83) p2.next();
                r103.d0(-1389296998);
                xtc goaVar = new goa(f2, z3);
                utc utcVar2 = utc.a;
                if (k83Var2 != null) {
                    long D = lz.D(i6, r103);
                    Object O = r103.O();
                    Object obj = nf3.a;
                    if (O == obj) {
                        O = mz1.e(r103);
                    }
                    wzc wzcVar = (wzc) O;
                    Object[] objArr = new Object[i5];
                    Object O2 = r103.O();
                    if (O2 == obj) {
                        O2 = fi.v;
                        r103.n0(O2);
                    }
                    z73 z73Var = new z73((boh) o3a.N(objArr, (Function0) O2, r103, 48), k83Var2, function1, i5);
                    utcVar = utcVar2;
                    of3 of3Var2 = r103;
                    k83Var = k83Var2;
                    r15 = i5;
                    i3 = R.color.n_lv_4;
                    r10 = of3Var2;
                    goaVar = goaVar.z(tol.y(utcVar, true, true, true, D, wzcVar, z73Var, of3Var2, 0));
                } else {
                    k83Var = k83Var2;
                    i3 = i6;
                    r15 = i5;
                    utcVar = utcVar2;
                    r10 = r103;
                }
                r10.s(r15);
                u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, r10, 54);
                int hashCode2 = Long.hashCode(r10.T);
                aee m3 = r10.m();
                xtc C2 = fqj.C(r10, goaVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                r10.h0();
                if (r10.S) {
                    r10.l(zg3Var2);
                } else {
                    r10.q0();
                }
                waa.K(r10, a3, hf3.g);
                waa.K(r10, m3, hf3.f);
                waa.K(r10, Integer.valueOf(hashCode2), hf3.j);
                waa.J(r10, hf3.k);
                waa.K(r10, C2, hf3.d);
                k83 k83Var3 = k83Var;
                if (k83Var3 != null) {
                    r10.d0(-1563349830);
                    td4.G(k83Var3.a, bkh.l(utcVar, 32.0f), false, 0L, r10, 48, 12);
                    String str = k83Var3.c;
                    yf8 yf8Var = xth.a;
                    of3 of3Var3 = r10;
                    r0 = r15;
                    udj.c(str, null, lz.D(R.color.n_lv_1, r10), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.e(), of3Var3, 0, 24960, 109562);
                    r102 = of3Var3;
                    r102.s(r0);
                    z2 = true;
                } else {
                    r0 = r15;
                    r10.d0(-1562906561);
                    H(32.0f, 6, r10, null);
                    yf8 yf8Var2 = xth.a;
                    av8 av8Var3 = r10;
                    z2 = true;
                    udj.c("-", null, lz.D(R.color.n_lv_1, r10), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var3, 6, 0, 130042);
                    r102 = av8Var3;
                    r102.s(r0);
                }
                r102.s(z2);
                i5 = r0;
                z3 = z2;
                i6 = i3;
                f2 = 1.0f;
                r103 = r102;
            }
            r103.s(i5);
            r103.s(z3);
            av8Var = r103;
        } else {
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new u73(gv9Var, function1, z, xtcVar, i2, 1);
        }
    }

    public static final void G(k83 k83Var, boolean z, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        utc utcVar;
        float f2;
        boolean z2;
        boolean z3;
        utc utcVar2;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-612452142);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(k83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        int i5 = 1;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.d0(-155980312);
            xtc b2 = bkh.b(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 1);
            utc utcVar3 = utc.a;
            if (k83Var != null) {
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
                    O2 = fi.w;
                    av8Var.n0(O2);
                }
                z73 z73Var = new z73((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), k83Var, function1, i5);
                z2 = false;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                xtc y = tol.y(utcVar3, true, true, true, D, wzcVar, z73Var, av8Var, 0);
                av8Var = av8Var;
                utcVar = utcVar3;
                b2 = b2.z(y);
            } else {
                utcVar = utcVar3;
                f2 = 0.0f;
                z2 = false;
            }
            xtc xtcVar2 = b2;
            av8Var.s(z2);
            xtc f0 = l98.f0(xtcVar2, z ? f2 : 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? 16.0f : f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a2 = k8g.a(new ng0(8.0f, true, new l1(z ? uxf.q : uxf.o, 5)), uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (k83Var != null) {
                av8Var.d0(1127279002);
                if (z) {
                    utcVar2 = utcVar;
                    i4 = 6;
                    av8Var.d0(1127381612);
                    av8Var.s(z2);
                } else {
                    av8Var.d0(1127294161);
                    int i6 = k83Var.a;
                    xtc l2 = bkh.l(utcVar, 24.0f);
                    utcVar2 = utcVar;
                    i4 = 6;
                    td4.G(i6, l2, false, 0L, av8Var, 48, 12);
                    av8Var.s(z2);
                }
                String str = k83Var.b;
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                utc utcVar4 = utcVar2;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(z ? i4 : 5), 0L, 2, false, 1, 0, null, xth.e(), av8Var2, 0, 24960, 109562);
                av8Var = av8Var2;
                if (z) {
                    av8Var.d0(1127721713);
                    td4.G(k83Var.a, bkh.l(utcVar4, 24.0f), false, 0L, av8Var, 48, 12);
                    av8Var.s(z2);
                } else {
                    av8Var.d0(1127809164);
                    av8Var.s(z2);
                }
                av8Var.s(z2);
            } else {
                av8Var.d0(1127838180);
                if (z) {
                    av8Var.d0(1127919276);
                    av8Var.s(z2);
                } else {
                    av8Var.d0(1127856811);
                    H(24.0f, 6, av8Var, null);
                    av8Var.s(z2);
                }
                yf8 yf8Var2 = xth.a;
                av8 av8Var3 = av8Var;
                udj.c("-", null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(z ? 6 : 5), 0L, 0, false, 0, 0, null, xth.e(), av8Var3, 6, 0, 130042);
                av8Var = av8Var3;
                if (z) {
                    av8Var.d0(1128173259);
                    H(24.0f, 6, av8Var, null);
                    z3 = false;
                    av8Var.s(false);
                } else {
                    z3 = false;
                    av8Var.d0(1128235724);
                    av8Var.s(false);
                }
                av8Var.s(z3);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new s73(k83Var, z, function1, xtcVar, i2, 1);
        }
    }

    public static final void H(float f2, int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2037654313);
        int i3 = i2 | 48;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            ImageVector N = s6a.N(R.drawable.team_logo_placeholder, 6, av8Var);
            long D = lz.D(R.color.n_lv_4, av8Var);
            xtcVar = utc.a;
            kq9.b(N, null, bkh.l(xtcVar, f2), D, av8Var, 48, 0);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new w73(f2, i2, i4, xtcVar);
        }
    }

    public static final void I(j83 j83Var, Function1 function1, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1329419650);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(j83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            tee teeVar = j83Var.a;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new b42(29);
                av8Var.n0(O);
            }
            Function1 function12 = (Function1) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new q73(i4);
                av8Var.n0(O2);
            }
            l98.b(teeVar, null, function12, null, "TeamsRowMorph", (Function1) O2, yqo.H(-864807153, av8Var, new r73(function1, z, xtcVar, i4)), av8Var, 1794432, 10);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new s73(j83Var, function1, z, xtcVar, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(aq4 aq4Var, sq3 sq3Var) {
        kk9 kk9Var;
        Object obj;
        int i2;
        KType kType;
        if (sq3Var instanceof kk9) {
            kk9Var = (kk9) sq3Var;
            int i3 = kk9Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kk9Var.s = i3 - Integer.MIN_VALUE;
                obj = kk9Var.r;
                lu3 lu3Var = lu3.a;
                i2 = kk9Var.s;
                if (i2 != 0) {
                    y6a.M(obj);
                    xh9 b2 = aq4Var.b();
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(db2.class);
                    try {
                        kType = duf.b(db2.class);
                    } catch (Throwable unused) {
                        kType = null;
                    }
                    h5k h5kVar = new h5k(orCreateKotlinClass, kType);
                    kk9Var.s = 1;
                    obj = b2.a(h5kVar, kk9Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (obj == null) {
                    return (db2) obj;
                }
                yhk.s("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
                return null;
            }
        }
        kk9Var = new kk9(sq3Var);
        obj = kk9Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = kk9Var.s;
        if (i2 != 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(aq4 aq4Var, Charset charset, sq3 sq3Var) {
        lk9 lk9Var;
        Object obj;
        int i2;
        KType kType;
        CharsetDecoder charsetDecoder;
        if (sq3Var instanceof lk9) {
            lk9Var = (lk9) sq3Var;
            int i3 = lk9Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lk9Var.t = i3 - Integer.MIN_VALUE;
                obj = lk9Var.s;
                lu3 lu3Var = lu3.a;
                i2 = lk9Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    Charset v2 = xw3.v(aq4Var);
                    if (v2 != null) {
                        charset = v2;
                    }
                    CharsetDecoder newDecoder = charset.newDecoder();
                    xh9 b2 = aq4Var.b();
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(bwh.class);
                    try {
                        kType = duf.b(bwh.class);
                    } catch (Throwable unused) {
                        kType = null;
                    }
                    h5k h5kVar = new h5k(orCreateKotlinClass, kType);
                    lk9Var.r = newDecoder;
                    lk9Var.t = 1;
                    obj = b2.a(h5kVar, lk9Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    charsetDecoder = newDecoder;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charsetDecoder = lk9Var.r;
                    y6a.M(obj);
                }
                if (obj == null) {
                    charsetDecoder.getClass();
                    return ao2.r(charsetDecoder, (bwh) obj);
                }
                yhk.s("null cannot be cast to non-null type kotlinx.io.Source");
                return null;
            }
        }
        lk9Var = new lk9(sq3Var);
        obj = lk9Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = lk9Var.t;
        if (i2 != 0) {
        }
        if (obj == null) {
        }
    }

    public static final boolean M(ne8 ne8Var, boolean z) {
        int ordinal = ne8Var.p1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ne8 V = l98.V(ne8Var);
                if (!(V != null ? M(V, z) : true)) {
                    return false;
                }
                ne8Var.l1(ie8.b, ie8.d);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                zzl.b();
                return false;
            }
        }
        return true;
    }

    public static ex1 N(dx1 dx1Var, Drawable drawable, int i2, int i3) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i2 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i3 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i2 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i3 = current.getIntrinsicHeight();
                    }
                    Lock lock = ewj.a;
                    lock.lock();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap f2 = dx1Var.f(i2, i3);
                    try {
                        Canvas canvas = new Canvas(f2);
                        current.setBounds(0, 0, i2, i3);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = f2;
                        z = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    current.toString();
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                current.toString();
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            dx1Var = k;
        }
        if (bitmap == null) {
            return null;
        }
        return new ex1(dx1Var, bitmap);
    }

    public static int P(int i2, int i3, String str, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static final String Q(String str, Decoder decoder) {
        decoder.getClass();
        return "Cannot deserialize " + str + " with '" + duf.a.getOrCreateKotlinClass(decoder.getClass()).getSimpleName() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final xtc R(xtc xtcVar) {
        return xtcVar.z(new cri(q));
    }

    public static final String S(String str, Encoder encoder) {
        encoder.getClass();
        return "Cannot serialize " + str + " with '" + duf.a.getOrCreateKotlinClass(encoder.getClass()).getSimpleName() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static String T(Context context, float f2) {
        context.getClass();
        int compare = Double.compare(yid.s(f2, 1), 0.0d);
        String o2 = lnb.o("%s", compare < 0 ? "-" : compare > 0 ? "+" : "", "%.1fM");
        Locale d2 = dla.d();
        Set set = o84.a;
        return String.format(d2, o2, Arrays.copyOf(new Object[]{o84.e(context), Float.valueOf(Math.abs(f2))}, 2));
    }

    public static final void U(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final boolean V(ne8 ne8Var) {
        int ordinal = ne8Var.p1().ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                ((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).getClass();
                ne8Var.l1(ie8.c, ie8.a);
                return true;
            }
            if (ordinal != 3) {
                zzl.b();
                return false;
            }
        }
        return false;
    }

    public static String W(Context context, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1455972495:
                if (str.equals("pacific-division")) {
                    return context.getString(R.string.hockey_nhl_pacific_division);
                }
                return null;
            case -601286139:
                if (str.equals("central-division")) {
                    return context.getString(R.string.hockey_nhl_central_division);
                }
                return null;
            case -321626478:
                if (str.equals("atlantic-division")) {
                    return context.getString(R.string.hockey_nhl_atlantic_division);
                }
                return null;
            case 580867653:
                if (str.equals("eastern-conference")) {
                    return context.getString(R.string.any_sport_eastern_conference);
                }
                return null;
            case 931705975:
                if (str.equals("western-conference")) {
                    return context.getString(R.string.any_sport_western_conference);
                }
                return null;
            case 998847022:
                if (str.equals("metropolitan-division")) {
                    return context.getString(R.string.hockey_nhl_metropolitan_division);
                }
                return null;
            default:
                return null;
        }
    }

    public static final String X(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final xtc Y(xtc xtcVar) {
        return xtcVar.z(new cri(s));
    }

    public static final void a(boolean z, int i2, vnb vnbVar, Function1 function1, of3 of3Var, int i3) {
        vnbVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-417230458);
        int i4 = i3 | (av8Var.h(z) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(vnbVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? 2048 : 1024);
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            boolean z2 = (i4 & 7168) == 2048;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new ri(i5, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(296113617, av8Var, new ti(function1, a2, i2, context)), av8Var, ((i4 >> 6) & 14) | 100663296 | ((i4 << 6) & 896), 248);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ui(z, i2, vnbVar, function1, i3);
        }
    }

    public static q50 b(float f2) {
        return new q50(Float.valueOf(f2), lz.f, Float.valueOf(0.01f), 8);
    }

    public static final void c(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-893249544);
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            kq9.b(s6a.N(R.drawable.ic_referee, 6, av8Var), null, null, lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 4);
            goa d2 = bf3.d(utcVar, 8.0f, av8Var, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v2 = oea.v(R.string.baseball_umpires, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v2, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.d0(1990404762);
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                dn1 dn1Var = (dn1) it.next();
                String i4 = wv8.i(dn1Var.a.a(av8Var), ": ", dn1Var.b);
                yf8 yf8Var2 = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(i4, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
            }
            ljg.t(av8Var, false, true, true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new y81(gv9Var, xtcVar2, i2, 2);
        }
    }

    public static final void d(a83 a83Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1825050516);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(a83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            ok3.a(a83Var.a, a83Var.b, xtcVar, av8Var, (i3 << 3) & 896);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lj(a83Var, xtcVar, i2, 9);
        }
    }

    public static final CancellationException e(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static boolean e0() {
        qv7 qv7Var = rv7.c;
        LocalDate localDate = qv7Var.b;
        LocalDate localDate2 = qv7Var.a;
        LocalDate now = LocalDate.now();
        now.getClass();
        if (now.compareTo((Object) localDate) < 0 || now.compareTo((Object) localDate2) > 0) {
            return false;
        }
        yea yeaVar = j58.a;
        return fn0.B("featured_tournament_afcon_tab_enabled");
    }

    public static final g62 f(int i2, a62 a62Var, Function1 function1) {
        if (i2 == -2) {
            if (a62Var != a62.a) {
                return new qj3(1, a62Var, function1);
            }
            ln2.j7.getClass();
            return new g62(kn2.b, function1);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? a62Var == a62.a ? new g62(i2, function1) : new qj3(i2, a62Var, function1) : new g62(Integer.MAX_VALUE, function1) : a62Var == a62.a ? new g62(0, function1) : new qj3(1, a62Var, function1);
        }
        if (a62Var == a62.a) {
            return new qj3(1, a62.b, function1);
        }
        a70.p("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final xtc f0(xtc xtcVar) {
        return xtcVar.z(new cri(t));
    }

    public static /* synthetic */ g62 g(int i2, int i3, a62 a62Var) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            a62Var = a62.a;
        }
        return f(i2, a62Var, null);
    }

    public static rs3 g0(jl9 jl9Var, String str) {
        jl9 jl9Var2;
        long j2;
        String str2;
        jl9Var.getClass();
        str.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = wol.a;
        char c2 = ';';
        int f2 = wol.f(str, 0, str.length(), ';');
        char c3 = C4427z5.U;
        int f3 = wol.f(str, 0, f2, C4427z5.U);
        String str3 = null;
        if (f3 != f2) {
            String p2 = wol.p(0, f3, str);
            if (p2.length() != 0 && wol.h(p2) == -1) {
                String p3 = wol.p(f3 + 1, f2, str);
                if (wol.h(p3) == -1) {
                    int i2 = f2 + 1;
                    int length = str.length();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    String str4 = null;
                    boolean z4 = true;
                    long j3 = 253402300799999L;
                    long j4 = -1;
                    String str5 = null;
                    while (true) {
                        if (i2 >= length) {
                            if (j4 == Long.MIN_VALUE) {
                                jl9Var2 = jl9Var;
                                j2 = Long.MIN_VALUE;
                            } else if (j4 != -1) {
                                long j5 = currentTimeMillis + (j4 <= 9223372036854775L ? j4 * 1000 : Long.MAX_VALUE);
                                if (j5 < currentTimeMillis || j5 > 253402300799999L) {
                                    jl9Var2 = jl9Var;
                                    j2 = 253402300799999L;
                                } else {
                                    jl9Var2 = jl9Var;
                                    j2 = j5;
                                }
                            } else {
                                jl9Var2 = jl9Var;
                                j2 = j3;
                            }
                            String str6 = jl9Var2.d;
                            if (str3 != null) {
                                if (Intrinsics.c(str6, str3) || (c.n(str6, str3, false) && str6.charAt((str6.length() - str3.length()) - 1) == '.' && !uol.a.f(str6))) {
                                    str2 = str3;
                                }
                                return null;
                            }
                            str2 = str6;
                            if (str6.length() == str2.length() || tgf.d.a(str2) != null) {
                                if (str5 == null || !c.v(str5, "/", false)) {
                                    String b2 = jl9Var2.b();
                                    int S = StringsKt.S(b2, '/', 0, 6);
                                    str5 = S != 0 ? b2.substring(0, S) : "/";
                                }
                                return new rs3(p2, p3, j2, str2, str5, z3, z, z2, z4, str4);
                            }
                            return null;
                        }
                        int f4 = wol.f(str, i2, length, c2);
                        int f5 = wol.f(str, i2, f4, c3);
                        String p4 = wol.p(i2, f5, str);
                        String p5 = f5 < f4 ? wol.p(f5 + 1, f4, str) : "";
                        if (p4.equalsIgnoreCase("expires")) {
                            try {
                                j3 = h0(p5.length(), p5);
                                z2 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                            i2 = f4 + 1;
                            c2 = ';';
                            c3 = C4427z5.U;
                        } else if (p4.equalsIgnoreCase("max-age")) {
                            try {
                                j4 = Long.parseLong(p5);
                                if (j4 <= 0) {
                                    j4 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e2) {
                                if (!new Regex("-?\\d+").f(p5)) {
                                    throw e2;
                                }
                                j4 = c.v(p5, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            z2 = true;
                            i2 = f4 + 1;
                            c2 = ';';
                            c3 = C4427z5.U;
                        } else {
                            if (p4.equalsIgnoreCase(U3.j.D)) {
                                if (c.n(p5, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String b3 = uol.b(StringsKt.V(p5, "."));
                                if (b3 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str3 = b3;
                                z4 = false;
                            } else if (p4.equalsIgnoreCase("path")) {
                                str5 = p5;
                            } else if (p4.equalsIgnoreCase("secure")) {
                                z3 = true;
                            } else if (p4.equalsIgnoreCase("httponly")) {
                                z = true;
                            } else if (p4.equalsIgnoreCase("samesite")) {
                                str4 = p5;
                            }
                            i2 = f4 + 1;
                            c2 = ';';
                            c3 = C4427z5.U;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final void h(b83 b83Var, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        a99 a99Var;
        boolean z2;
        av8 av8Var2;
        xtc xtcVar2;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(489864920);
        if ((i2 & 6) == 0) {
            i3 = (av8Var3.i(b83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var3.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var3.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var3.k(nz.b);
            av8Var3.d0(-1686207790);
            i83 i83Var = b83Var.d;
            a99 a99Var2 = nf3.a;
            if (i83Var != null) {
                long D = lz.D(R.color.n_lv_4, av8Var3);
                Object O = av8Var3.O();
                if (O == a99Var2) {
                    O = mz1.e(av8Var3);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var3.O();
                if (O2 == a99Var2) {
                    O2 = fi.u;
                    av8Var3.n0(O2);
                }
                boh bohVar = (boh) o3a.N(objArr, (Function0) O2, av8Var3, 48);
                av8Var2 = av8Var3;
                gi giVar = new gi(3, bohVar, b83Var, context);
                a99Var = a99Var2;
                z2 = false;
                xtcVar2 = xtcVar.z(tol.y(utc.a, true, true, true, D, wzcVar, giVar, av8Var2, 0));
            } else {
                a99Var = a99Var2;
                z2 = false;
                av8Var2 = av8Var3;
                xtcVar2 = xtcVar;
            }
            av8Var2.s(z2);
            tee teeVar = b83Var.b;
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = new q73(1);
                av8Var2.n0(O3);
            }
            Function1 function1 = (Function1) O3;
            Object O4 = av8Var2.O();
            if (O4 == a99Var) {
                O4 = new q73(2);
                av8Var2.n0(O4);
            }
            av8 av8Var4 = av8Var2;
            l98.b(teeVar, null, function1, null, "ComparableRowMorph", (Function1) O4, yqo.H(1188310763, av8Var2, new r73(b83Var, z, xtcVar2, 1)), av8Var4, 1794432, 10);
            av8Var = av8Var4;
        } else {
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new di(b83Var, z, xtcVar, i2, 4);
        }
    }

    public static long h0(int i2, String str) {
        int P = P(0, i2, str, false);
        Matcher matcher = rs3.n.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (P < i2) {
            int P2 = P(P + 1, i2, str, true);
            matcher.region(P, P2);
            if (i4 == -1 && matcher.usePattern(rs3.n).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(rs3.m).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = rs3.l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        String k2 = i.k(locale, group5, locale);
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = StringsKt.P(pattern2, k2, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(rs3.k).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            P = P(P2 + 1, i2, str, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            a70.p("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            a70.p("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            a70.p("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            a70.p("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            a70.p("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            a70.p("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(yol.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final void i(int i2, of3 of3Var, xtc xtcVar, String str, boolean z) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-63519862);
        int i3 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.h(z) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            l8g a2 = k8g.a(ww9.f, uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            yf8 yf8Var = xth.a;
            udj.c(str, new goa(1.0f, false), z ? ljg.f(av8Var, 1026328281, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 1026329071, R.color.n_lv_1, av8Var, false), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.g(), av8Var, i3 & 14, 24960, 109560);
            av8Var = av8Var;
            if (z) {
                av8Var.d0(1751669327);
                kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var), null, bkh.l(l98.f0(utc.a, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(1751968508);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new p73(str, z, xtcVar, i2, 0);
        }
    }

    public static final tm0 i0(String str, int i2, String str2, Function1 function1) {
        char charAt = str.charAt(i2);
        if (((Boolean) function1.invoke(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return j0(str, "Expected " + str2 + ", but got '" + charAt + "' at position " + i2);
    }

    public static final void j(Double d2, xtc xtcVar, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1525717783);
        int i4 = (av8Var.g(d2) ? 4 : 2) | i2;
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        boolean z = false;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtcVar2 = i5 != 0 ? utc.a : xtcVar;
            if (d2 != null && d2.doubleValue() > 0.0d) {
                z = true;
            }
            i9a.i(d2, z, xtcVar2, null, null, null, true, av8Var, (i4 & 14) | 100663344 | ((i4 << 6) & 7168), 240);
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new wx1(d2, xtcVar2, i2, i3, 2);
        }
    }

    public static final tm0 j0(String str, String str2) {
        StringBuilder r2 = mz1.r(str2, " when parsing an Instant from \"");
        r2.append(t0(64, str));
        r2.append('\"');
        return new tm0(r2.toString(), str, 2, (byte) 0);
    }

    public static final void k(l83 l83Var, Function1 function1, xtc xtcVar, boolean z, of3 of3Var, int i2) {
        l83Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1094534987);
        int i3 = (av8Var.g(l83Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z) ? a.o : 1024);
        if (!av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.W();
        } else if (l83Var instanceof e83) {
            av8Var.d0(418872544);
            u((e83) l83Var, xtcVar, av8Var, ((i3 >> 3) & 112) | (i3 & 14));
            av8Var.s(false);
        } else if (l83Var instanceof b83) {
            av8Var.d0(418875455);
            h((b83) l83Var, z, xtcVar, av8Var, (i3 & 896) | (i3 & 14) | ((i3 >> 6) & 112));
            av8Var.s(false);
        } else if (l83Var instanceof j83) {
            av8Var.d0(418879151);
            I((j83) l83Var, function1, z, xtcVar, av8Var, (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168));
            av8Var.s(false);
        } else if (l83Var instanceof h83) {
            av8Var.d0(418883360);
            B((h83) l83Var, xtcVar, av8Var, ((i3 >> 3) & 112) | (i3 & 14));
            av8Var.s(false);
        } else if (l83Var instanceof f83) {
            av8Var.d0(418886145);
            v((f83) l83Var, xtcVar, av8Var, ((i3 >> 3) & 112) | (i3 & 14));
            av8Var.s(false);
        } else if (l83Var instanceof g83) {
            av8Var.d0(418888928);
            z((g83) l83Var, xtcVar, av8Var, ((i3 >> 3) & 112) | (i3 & 14));
            av8Var.s(false);
        } else if (l83Var.equals(c83.a)) {
            av8Var.d0(418891703);
            p((i3 >> 6) & 14, av8Var, xtcVar);
            av8Var.s(false);
        } else if (l83Var instanceof d83) {
            av8Var.d0(418894473);
            t((d83) l83Var, xtcVar, av8Var, ((i3 >> 3) & 112) | (i3 & 14));
            av8Var.s(false);
        } else {
            if (!(l83Var instanceof a83)) {
                throw dmi.h(av8Var, 418871616, false);
            }
            av8Var.d0(418897867);
            d((a83) l83Var, xtcVar, av8Var, ((i3 >> 3) & 112) | (i3 & 14));
            av8Var.s(false);
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new p81(l83Var, function1, xtcVar, z, i2, 3);
        }
    }

    public static final int k0(int i2, String str) {
        return (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if ((r42 & 32) != 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(String str, boolean z, mv1 mv1Var, xtc xtcVar, int i2, long j2, of3 of3Var, int i3, int i4) {
        int i5;
        long j3;
        int i6;
        int i7;
        mv1 mv1Var2;
        av8 av8Var;
        eqf u2;
        int i8;
        int i9;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(791484701);
        int i10 = (av8Var2.g(str) ? 4 : 2) | i3 | (av8Var2.h(z) ? 32 : 16) | (av8Var2.g(xtcVar) ? a.o : 1024);
        int i11 = i4 & 16;
        if (i11 != 0) {
            i10 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 = i2;
            i10 |= av8Var2.e(i5) ? 16384 : 8192;
            if ((i4 & 32) != 0) {
                j3 = j2;
                if (av8Var2.f(j3)) {
                    i6 = 131072;
                    i7 = i10 | i6;
                    if (av8Var2.T(i7 & 1, (74899 & i7) != 74898)) {
                        av8Var2.Y();
                        if ((i3 & 1) == 0 || av8Var2.B()) {
                            if (i11 != 0) {
                                i5 = 1;
                            }
                            if ((i4 & 32) != 0) {
                                j3 = r13.c(lz.D(R.color.primary_highlight, av8Var2), 0.1f);
                                i7 &= -458753;
                            }
                            int i12 = i5;
                            av8Var2.t();
                            mv1Var2 = mv1Var;
                            k1c c2 = e12.c(mv1Var2, false);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C = fqj.C(av8Var2, xtcVar);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(zg3Var);
                            } else {
                                av8Var2.q0();
                            }
                            waa.K(av8Var2, c2, hf3.g);
                            waa.K(av8Var2, m2, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C, hf3.d);
                            yf8 yf8Var = xth.a;
                            dfj k2 = xth.k();
                            if (z) {
                                i8 = -1181752790;
                                i9 = R.color.primary_default;
                            } else {
                                i8 = -1181752000;
                                i9 = R.color.n_lv_1;
                            }
                            long f2 = ljg.f(av8Var2, i8, i9, av8Var2, false);
                            xtc xtcVar2 = utc.a;
                            if (z) {
                                xtcVar2 = n9e.q(xtcVar2, j3, o7g.a(16.0f));
                            }
                            udj.c(str, l98.c0(xtcVar2, 12.0f, 4.0f), f2, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, i12, 0, null, k2, av8Var2, i7 & 14, (i7 & 57344) | 384, 109560);
                            av8Var = av8Var2;
                            av8Var.s(true);
                            i5 = i12;
                        } else {
                            av8Var2.W();
                        }
                    } else {
                        mv1Var2 = mv1Var;
                        av8Var = av8Var2;
                        av8Var.W();
                    }
                    u2 = av8Var.u();
                    if (u2 != null) {
                        u2.d = new x73(str, z, mv1Var2, xtcVar, i5, j3, i3, i4);
                        return;
                    }
                    return;
                }
            } else {
                j3 = j2;
            }
            i6 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i7 = i10 | i6;
            if (av8Var2.T(i7 & 1, (74899 & i7) != 74898)) {
            }
            u2 = av8Var.u();
            if (u2 != null) {
            }
        }
        i5 = i2;
        if ((i4 & 32) != 0) {
        }
        i6 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        i7 = i10 | i6;
        if (av8Var2.T(i7 & 1, (74899 & i7) != 74898)) {
        }
        u2 = av8Var.u();
        if (u2 != null) {
        }
    }

    public static final y84 l0(ne8 ne8Var, int i2) {
        int ordinal = ne8Var.p1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ne8 V = l98.V(ne8Var);
                if (V == null) {
                    a70.p("ActiveParent with no focused child");
                    return null;
                }
                y84 l0 = l0(V, i2);
                y84 y84Var = y84.a;
                y84 y84Var2 = l0 != y84Var ? l0 : null;
                if (y84Var2 != null) {
                    return y84Var2;
                }
                if (ne8Var.q) {
                    return y84Var;
                }
                ne8Var.q = true;
                try {
                    ae8 m1 = ne8Var.m1();
                    fj2 fj2Var = new fj2(i2);
                    yd8 yd8Var = (yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner();
                    ne8 g2 = yd8Var.g();
                    m1.k.invoke(fj2Var);
                    ne8 g3 = yd8Var.g();
                    if (!fj2Var.b) {
                        return (g2 == g3 || g3 == null) ? y84Var : ce8.d == ce8.c ? y84.b : y84.c;
                    }
                    ce8 ce8Var = ce8.b;
                    return y84.b;
                } finally {
                    ne8Var.q = false;
                }
            }
            if (ordinal == 2) {
                return y84.b;
            }
            if (ordinal != 3) {
                zzl.b();
                return null;
            }
        }
        return y84.a;
    }

    public static final void m(final b94 b94Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(672788144);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(b94Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            xtcVar2 = xtcVar;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new p94(b94Var, i4);
                av8Var2.n0(O);
            }
            final pr4 b2 = c6e.b(0, (Function0) O, av8Var2, 6, 2);
            int i7 = b94Var.g;
            x43 x43Var = b94Var.m;
            String str = b94Var.h;
            String str2 = b94Var.i;
            tc3 H = yqo.H(326276752, av8Var2, new ct8() { // from class: q94
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i4;
                    b94 b94Var2 = b94Var;
                    v23 v23Var = (v23) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i8) {
                        case 0:
                            v23Var.getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                ml4.o(0, 2, av8Var3, b94Var2.p, false, b94Var2.q);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            v23Var.getClass();
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 17) != 16)) {
                                ml4.o(48, 0, av8Var4, b94Var2.p, true, b94Var2.q);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H2 = yqo.H(-1776176751, av8Var2, new ct8() { // from class: q94
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8 = i5;
                    b94 b94Var2 = b94Var;
                    v23 v23Var = (v23) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i8) {
                        case 0:
                            v23Var.getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                ml4.o(0, 2, av8Var3, b94Var2.p, false, b94Var2.q);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            v23Var.getClass();
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 17) != 16)) {
                                ml4.o(48, 0, av8Var4, b94Var2.p, true, b94Var2.q);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            final int i8 = 0;
            tc3 H3 = yqo.H(416337042, av8Var2, new ct8() { // from class: r94
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i9 = i8;
                    v23 v23Var = (v23) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i9) {
                        case 0:
                            v23Var.getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                ml4.n(b94Var, b2, false, av8Var3, 0, 4);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            v23Var.getClass();
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 17) != 16)) {
                                ml4.n(b94Var, b2, true, av8Var4, 384, 0);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            final int i9 = 1;
            tc3 H4 = yqo.H(-1686116461, av8Var2, new ct8() { // from class: r94
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i92 = i9;
                    v23 v23Var = (v23) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i92) {
                        case 0:
                            v23Var.getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                ml4.n(b94Var, b2, false, av8Var3, 0, 4);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            v23Var.getClass();
                            av8 av8Var4 = (av8) of3Var2;
                            if (av8Var4.T(intValue & 1, (intValue & 17) != 16)) {
                                ml4.n(b94Var, b2, true, av8Var4, 384, 0);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            boolean z2 = (i6 == 4) | ((i3 & 112) == 32);
            Object O2 = av8Var2.O();
            if (z2 || O2 == a99Var) {
                O2 = new h84(1, b94Var, function1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i7, x43Var, xtcVar2, null, H, H2, H3, H4, str, str2, false, false, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, (Function0) O2, null, av8Var, (i3 & 896) | 14376960, ((i3 << 15) & 3670016) | 48, 324616);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new b30(b94Var, function1, xtcVar, i2, 14);
        }
    }

    public static final y84 m0(ne8 ne8Var, int i2) {
        if (!ne8Var.r) {
            ne8Var.r = true;
            try {
                ae8 m1 = ne8Var.m1();
                fj2 fj2Var = new fj2(i2);
                yd8 yd8Var = (yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner();
                ne8 g2 = yd8Var.g();
                m1.j.invoke(fj2Var);
                ne8 g3 = yd8Var.g();
                if (fj2Var.b) {
                    ce8 ce8Var = ce8.b;
                    return y84.b;
                }
                if (g2 != g3 && g3 != null) {
                    return ce8.d == ce8.c ? y84.b : y84.c;
                }
            } finally {
                ne8Var.r = false;
            }
        }
        return y84.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(b94 b94Var, a6e a6eVar, boolean z, of3 of3Var, int i2, int i3) {
        boolean z2;
        av8 av8Var;
        boolean z3;
        eqf u2;
        a6e a6eVar2;
        int i4;
        long f2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(832397455);
        int i5 = 4;
        int i6 = (av8Var2.g(b94Var) ? 4 : 2) | i2 | (av8Var2.g(a6eVar) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i2 & 384) == 0) {
            z2 = z;
            i6 |= av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            int i8 = 1;
            if (av8Var2.T(i6 & 1, (i6 & 147) == 146)) {
                av8Var = av8Var2;
                av8Var.W();
                z3 = z2;
            } else {
                boolean z4 = i7 != 0 ? false : z2;
                if (z4) {
                    av8Var2.d0(-1188431933);
                    int k2 = a6eVar.k();
                    boolean z5 = (i6 & 14) == 4;
                    Object O = av8Var2.O();
                    if (z5 || O == nf3.a) {
                        O = new p94(b94Var, i8);
                        av8Var2.n0(O);
                    }
                    a6eVar2 = c6e.b(k2, (Function0) O, av8Var2, 0, 2);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(-1188286791);
                    av8Var2.s(false);
                    a6eVar2 = a6eVar;
                }
                u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                int hashCode = Long.hashCode(av8Var2.T);
                aee m2 = av8Var2.m();
                utc utcVar = utc.a;
                xtc C = fqj.C(av8Var2, utcVar);
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
                waa.K(av8Var2, m2, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var2, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var2, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var2, C, f50Var3);
                f6a.a(a6eVar2, qx9.p(bkh.d(utcVar, 1.0f), 0.8f), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, yqo.H(-1888929736, av8Var2, new jw5(b94Var, i5)), av8Var2, 48, 27648, 8188);
                av8Var = av8Var2;
                if (b94Var.o.size() <= 1 || z4) {
                    av8Var.d0(-414345239);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-415004485);
                    xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    l8g a3 = k8g.a(ww9.f, uxf.l, av8Var, 6);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, f0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    av8Var.d0(2002039099);
                    int n2 = a6eVar.n();
                    for (int i9 = 0; i9 < n2; i9++) {
                        if (a6eVar.k() == i9) {
                            i4 = 0;
                            f2 = ljg.f(av8Var, 143436957, R.color.primary_default, av8Var, false);
                        } else {
                            i4 = 0;
                            f2 = ljg.f(av8Var, 143437759, R.color.primary_default_40, av8Var, false);
                        }
                        e12.a(i4, av8Var, bkh.l(n9e.q(wnn.A(l98.b0(utcVar, 4.0f), o7g.a), f2, oyn.e), 8.0f));
                    }
                    ljg.t(av8Var, false, true, false);
                }
                av8Var.s(true);
                z3 = z4;
            }
            u2 = av8Var.u();
            if (u2 == null) {
                u2.d = new x80(i2, i3, 4, b94Var, a6eVar, z3);
                return;
            }
            return;
        }
        z2 = z;
        int i82 = 1;
        if (av8Var2.T(i6 & 1, (i6 & 147) == 146)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final y84 n0(ne8 ne8Var, int i2) {
        wtc wtcVar;
        c40 c40Var;
        int ordinal = ne8Var.p1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ne8 V = l98.V(ne8Var);
                if (V != null) {
                    return l0(V, i2);
                }
                a70.p("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    zzl.b();
                    return null;
                }
                if (!ne8Var.a.n) {
                    r3a.b("visitAncestors called on an unattached node");
                }
                wtc wtcVar2 = ne8Var.a.e;
                wma c0 = c6o.c0(ne8Var);
                loop0: while (true) {
                    if (c0 == null) {
                        wtcVar = null;
                        break;
                    }
                    if ((((wtc) c0.F.g).d & 1024) != 0) {
                        while (wtcVar2 != null) {
                            if ((wtcVar2.c & 1024) != 0) {
                                wtcVar = wtcVar2;
                                i1d i1dVar = null;
                                while (wtcVar != null) {
                                    if (wtcVar instanceof ne8) {
                                        break loop0;
                                    }
                                    if ((wtcVar.c & 1024) != 0 && (wtcVar instanceof bw4)) {
                                        int i3 = 0;
                                        for (wtc wtcVar3 = ((bw4) wtcVar).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                            if ((wtcVar3.c & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    wtcVar = wtcVar3;
                                                } else {
                                                    if (i1dVar == null) {
                                                        i1dVar = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar != null) {
                                                        i1dVar.b(wtcVar);
                                                        wtcVar = null;
                                                    }
                                                    i1dVar.b(wtcVar3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    wtcVar = c6o.X(i1dVar);
                                }
                            }
                            wtcVar2 = wtcVar2.e;
                        }
                    }
                    c0 = c0.v();
                    wtcVar2 = (c0 == null || (c40Var = c0.F) == null) ? null : (hti) c40Var.f;
                }
                ne8 ne8Var2 = (ne8) wtcVar;
                if (ne8Var2 == null) {
                    return y84.a;
                }
                int ordinal2 = ne8Var2.p1().ordinal();
                if (ordinal2 == 0) {
                    return m0(ne8Var2, i2);
                }
                if (ordinal2 == 1) {
                    return n0(ne8Var2, i2);
                }
                if (ordinal2 == 2) {
                    return y84.b;
                }
                if (ordinal2 != 3) {
                    zzl.b();
                    return null;
                }
                y84 n0 = n0(ne8Var2, i2);
                y84 y84Var = n0 != y84.a ? n0 : null;
                return y84Var == null ? m0(ne8Var2, i2) : y84Var;
            }
        }
        return y84.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(int i2, int i3, of3 of3Var, String str, boolean z, boolean z2) {
        boolean z3;
        int i4;
        boolean z4;
        eqf u2;
        int i5;
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1974453168);
        int i7 = i2 | (av8Var.g(str) ? 4 : 2);
        int i8 = i3 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            z3 = z;
            i7 |= av8Var.h(z3) ? 32 : 16;
            i4 = i7 | (!av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
            if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
                av8Var.W();
                z4 = z3;
            } else {
                boolean z5 = i8 != 0 ? false : z3;
                utc utcVar = utc.a;
                xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
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
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                kq9.b(s6a.N(R.drawable.ic_sofascore_2, 6, av8Var), null, l98.b0(n9e.q(wnn.A(bkh.l(utcVar, 24.0f), o7g.a), lz.D(R.color.rating_90, av8Var), oyn.e), 4.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                xtc f02 = l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                if (z2) {
                    i5 = -1967652126;
                    i6 = R.string.feed_on_this_day;
                } else {
                    i5 = -1967650449;
                    i6 = R.string.feed_card_sofascore_spotlight;
                }
                String k2 = ljg.k(av8Var, i5, i6, av8Var, false);
                yf8 yf8Var = xth.a;
                boolean z6 = z5;
                udj.c(k2, f02, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 48, 24960, 110584);
                av8Var = av8Var;
                w1l.o(1.0f, true, av8Var);
                if (str == null || str.length() == 0 || z6) {
                    av8Var.d0(-867073042);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-867288306);
                    kq9.b(s6a.N(R.drawable.ic_external_link_16, 6, av8Var), null, null, lz.D(R.color.primary_default, av8Var), av8Var, 48, 4);
                    av8Var.s(false);
                }
                av8Var.s(true);
                z4 = z6;
            }
            u2 = av8Var.u();
            if (u2 == null) {
                u2.d = new s94(str, z4, z2, i2, i3);
                return;
            }
            return;
        }
        z3 = z;
        i4 = i7 | (!av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) == 146)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v9, types: [wtc] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [i1d] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [wtc] */
    /* JADX WARN: Type inference failed for: r6v17, types: [wtc] */
    /* JADX WARN: Type inference failed for: r6v9, types: [wtc] */
    public static final boolean o0(ne8 ne8Var) {
        i1d i1dVar;
        c40 c40Var;
        yd8 yd8Var;
        boolean z;
        ?? X;
        int i2;
        ?? r5;
        int i3;
        int i4;
        c40 c40Var2;
        yd8 yd8Var2 = (yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner();
        ne8 g2 = yd8Var2.g();
        ie8 p1 = ne8Var.p1();
        if (g2 == ne8Var) {
            ne8Var.l1(p1, p1);
            return true;
        }
        if ((g2 == null || g2.o) && !ne8Var.o && !((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).a.J()) {
            return false;
        }
        if (g2 != null) {
            i1dVar = new i1d(new ne8[16], 0);
            if (!g2.a.n) {
                r3a.b("visitAncestors called on an unattached node");
            }
            wtc wtcVar = g2.a.e;
            wma c0 = c6o.c0(g2);
            while (c0 != null) {
                if ((((wtc) c0.F.g).d & 1024) != 0) {
                    while (wtcVar != null) {
                        if ((wtcVar.c & 1024) != 0) {
                            wtc wtcVar2 = wtcVar;
                            i1d i1dVar2 = null;
                            while (wtcVar2 != null) {
                                if (wtcVar2 instanceof ne8) {
                                    i1dVar.b((ne8) wtcVar2);
                                } else if ((wtcVar2.c & 1024) != 0 && (wtcVar2 instanceof bw4)) {
                                    int i5 = 0;
                                    for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                                        if ((wtcVar3.c & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                Unit unit = Unit.a;
                                                wtcVar2 = wtcVar3;
                                            } else {
                                                if (i1dVar2 == null) {
                                                    i1dVar2 = new i1d(new wtc[16], 0);
                                                }
                                                if (wtcVar2 != null) {
                                                    i1dVar2.b(wtcVar2);
                                                    wtcVar2 = null;
                                                }
                                                i1dVar2.b(wtcVar3);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                wtcVar2 = c6o.X(i1dVar2);
                            }
                        }
                        wtcVar = wtcVar.e;
                    }
                }
                c0 = c0.v();
                wtcVar = (c0 == null || (c40Var2 = c0.F) == null) ? null : (hti) c40Var2.f;
            }
        } else {
            i1dVar = null;
        }
        ne8[] ne8VarArr = new ne8[16];
        ne8[] ne8VarArr2 = new ne8[16];
        if (!ne8Var.a.n) {
            r3a.b("visitAncestors called on an unattached node");
        }
        ?? r6 = ne8Var.a.e;
        wma c02 = c6o.c0(ne8Var);
        boolean z2 = true;
        int i6 = 0;
        int i7 = 0;
        while (c02 != null) {
            if ((((wtc) c02.F.g).d & 1024) != 0) {
                while (r6 != null) {
                    if ((r6.c & 1024) != 0) {
                        ne8 ne8Var2 = r6;
                        i1d i1dVar3 = null;
                        while (ne8Var2 != null) {
                            if (ne8Var2 instanceof ne8) {
                                ne8 ne8Var3 = ne8Var2;
                                if (Intrinsics.c(i1dVar != null ? Boolean.valueOf(i1dVar.q(ne8Var3)) : null, Boolean.TRUE)) {
                                    int i8 = i6 + 1;
                                    if (ne8VarArr.length < i8) {
                                        int length = ne8VarArr.length;
                                        yd8Var = yd8Var2;
                                        ?? r1 = new Object[Math.max(i8, length * 2)];
                                        i4 = i8;
                                        System.arraycopy(ne8VarArr, 0, r1, 0, length);
                                        ne8VarArr = r1;
                                    } else {
                                        yd8Var = yd8Var2;
                                        i4 = i8;
                                    }
                                    ne8VarArr[i6] = ne8Var3;
                                    i6 = i4;
                                } else {
                                    yd8Var = yd8Var2;
                                    int i9 = i7 + 1;
                                    if (ne8VarArr2.length < i9) {
                                        int length2 = ne8VarArr2.length;
                                        ?? r52 = new Object[Math.max(i9, length2 * 2)];
                                        i3 = i9;
                                        System.arraycopy(ne8VarArr2, 0, r52, 0, length2);
                                        ne8VarArr2 = r52;
                                    } else {
                                        i3 = i9;
                                    }
                                    ne8VarArr2[i7] = ne8Var3;
                                    i7 = i3;
                                }
                                if (ne8Var3 == g2) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                yd8Var = yd8Var2;
                                z = true;
                            }
                            if (z && (ne8Var2.c & 1024) != 0 && (ne8Var2 instanceof bw4)) {
                                wtc wtcVar4 = ((bw4) ne8Var2).p;
                                int i10 = 0;
                                X = ne8Var2;
                                while (wtcVar4 != null) {
                                    if ((wtcVar4.c & 1024) != 0) {
                                        int i11 = i10 + 1;
                                        if (i11 == 1) {
                                            Unit unit2 = Unit.a;
                                            X = wtcVar4;
                                            i2 = i11;
                                        } else {
                                            if (i1dVar3 == null) {
                                                i2 = i11;
                                                r5 = new i1d(new wtc[16], 0);
                                            } else {
                                                i2 = i11;
                                                r5 = i1dVar3;
                                            }
                                            if (X != 0) {
                                                r5.b(X);
                                                X = 0;
                                            }
                                            r5.b(wtcVar4);
                                            i1dVar3 = r5;
                                            X = X;
                                        }
                                        i10 = i2;
                                    }
                                    wtcVar4 = wtcVar4.f;
                                    X = X;
                                }
                                if (i10 == 1) {
                                    yd8Var2 = yd8Var;
                                    ne8Var2 = X;
                                }
                            }
                            X = c6o.X(i1dVar3);
                            yd8Var2 = yd8Var;
                            ne8Var2 = X;
                        }
                    }
                    r6 = r6.e;
                    yd8Var2 = yd8Var2;
                }
            }
            yd8 yd8Var3 = yd8Var2;
            c02 = c02.v();
            r6 = (c02 == null || (c40Var = c02.F) == null) ? null : (hti) c40Var.f;
            yd8Var2 = yd8Var3;
        }
        yd8 yd8Var4 = yd8Var2;
        if (!z2 || g2 == null || M(g2, false)) {
            z1a.R(ne8Var, new hv7(ne8Var, 2));
            int ordinal = ne8Var.p1().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            zzl.b();
                            return false;
                        }
                    }
                }
                ((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).j(ne8Var);
            }
            if (z2 && g2 != null) {
                g2.l1(ie8.a, ie8.d);
                Unit unit3 = Unit.a;
            }
            if (i1dVar != null) {
                int i12 = i1dVar.c - 1;
                Object[] objArr = i1dVar.a;
                if (i12 < objArr.length) {
                    while (i12 >= 0) {
                        ne8 ne8Var4 = (ne8) objArr[i12];
                        if (yd8Var4.g() != ne8Var) {
                            break;
                        }
                        ne8Var4.l1(ie8.b, ie8.d);
                        i12--;
                    }
                }
                Unit unit4 = Unit.a;
            }
            int i13 = i7 - 1;
            if (i13 < ne8VarArr2.length) {
                while (i13 >= 0) {
                    ne8 ne8Var5 = ne8VarArr2[i13];
                    if (yd8Var4.g() != ne8Var) {
                        break;
                    }
                    ne8Var5.l1(ne8Var5 == g2 ? ie8.a : ie8.d, ie8.b);
                    i13--;
                }
            }
            if (yd8Var4.g() == ne8Var) {
                ne8Var.l1(p1, ie8.a);
                if (yd8Var4.g() != ne8Var) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static final void p(int i2, of3 of3Var, xtc xtcVar) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1883184382);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            float f2 = fyg.a;
            xtc c0 = l98.c0(d2, 8.0f, 8.0f);
            k1c c2 = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            t62.h(null, oea.v(R.string.no_statistics, av8Var), oea.v(R.string.no_statistics_text, av8Var), s6a.N(R.drawable.no_statistics, 6, av8Var), null, false, 0L, av8Var, 0, 113);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new xz(xtcVar, i2, i4);
        }
    }

    public static void p0(Context context, int i2, int i3, Integer num, boolean z) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasyPlayerComparisonActivity.class);
        intent.putExtra("competitionId", i2);
        intent.putExtra("roundId", i3);
        intent.putExtra("assetsRestricted", z);
        if (num != null) {
            intent.putExtra("COMPARISON_PLAYER_ID_EXTRA", num.intValue());
        }
        context.startActivity(intent);
    }

    public static final void q(gs6 gs6Var, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(879627874);
        int i3 = (av8Var.g(gs6Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            wkn.a(Boolean.valueOf(gs6Var.a), null, null, null, yqo.H(840860257, av8Var, new fs6(gs6Var, function1, i4)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ns4(gs6Var, function1, i2, 22);
        }
    }

    public static final xtc q0(xtc xtcVar) {
        return xtcVar.z(new cri(r));
    }

    public static final void r(is6 is6Var, hp6 hp6Var, of3 of3Var, int i2) {
        is6Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(412503630);
        int i3 = (av8Var.i(is6Var) ? 4 : 2) | i2 | (av8Var.i(hp6Var) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            ce ceVar = new ce(3);
            boolean i4 = av8Var.i(is6Var) | av8Var.i(hp6Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i4 || O == a99Var) {
                O = new xw5(25, is6Var, hp6Var);
                av8Var.n0(O);
            }
            crb O2 = xw3.O(ceVar, (Function1) O, av8Var);
            nn2 nn2Var = is6Var.i;
            boolean i5 = av8Var.i(O2) | av8Var.i(context) | av8Var.i(is6Var);
            Object O3 = av8Var.O();
            if (i5 || O3 == a99Var) {
                O3 = new es6(O2, context, is6Var);
                av8Var.n0(O3);
            }
            w1a.c(nn2Var, null, (Function1) O3, av8Var, 0, 14);
            gs6 l2 = is6Var.l();
            boolean i6 = av8Var.i(context) | av8Var.i(is6Var) | av8Var.i(O2);
            Object O4 = av8Var.O();
            if (i6 || O4 == a99Var) {
                O4 = new es6(context, is6Var, O2);
                av8Var.n0(O4);
            }
            q(l2, (Function1) O4, av8Var, 0);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ns4(is6Var, hp6Var, i2, 21);
        }
    }

    public static final xtc r0(xtc xtcVar) {
        return xtcVar.z(new cri(p));
    }

    public static final void s(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1716497841);
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc q2 = n9e.q(bkh.g(bkh.d(utcVar, 1.0f), 36.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), oyn.e);
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
            if3.k7.getClass();
            Context context2 = context;
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            xtc f0 = l98.f0(ljg.g(av8Var, C, f50Var3, 1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v2 = oea.v(R.string.team, av8Var);
            yf8 yf8Var = xth.a;
            boolean z = true;
            udj.c(v2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            bf3.u(utcVar, 4.0f, av8Var, true);
            ng0 ng0Var = new ng0(4.0f, true, new l1(uxf.q, 5));
            utc utcVar2 = utcVar;
            xtc d0 = l98.d0(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
            l8g a4 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            Iterator p2 = ljg.p(av8Var, C3, f50Var3, 1357014865, gv9Var);
            while (p2.hasNext()) {
                fo1 fo1Var = (fo1) p2.next();
                xtc p3 = bkh.p(utcVar2, 72.0f);
                u23 a5 = t23.a(ww9.d, uxf.p, av8Var, 48);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m5 = av8Var.m();
                xtc C4 = fqj.C(av8Var, p3);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a5, hf3.g);
                waa.K(av8Var, m5, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode4), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C4, hf3.d);
                Context context3 = context2;
                String C5 = f5p.C(context3, fo1Var.d, fo1Var.b);
                yf8 yf8Var2 = xth.a;
                utc utcVar3 = utcVar2;
                av8 av8Var2 = av8Var;
                udj.c(C5, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, 0, 24960, 110586);
                long j2 = fo1Var.c;
                bi4 bi4Var = bi4.PATTERN_DMM;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                udj.c(fc6.i(j2, hk4.a(bi4Var.d())), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var2, 0, 24960, 110586);
                av8Var = av8Var2;
                z = true;
                av8Var.s(true);
                context2 = context3;
                utcVar2 = utcVar3;
            }
            ljg.t(av8Var, false, z, z);
            xtcVar2 = utcVar2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new y81(gv9Var, xtcVar2, i2, 11);
        }
    }

    public static final String s0(rq3 rq3Var) {
        Object u2gVar;
        if (rq3Var instanceof s45) {
            return ((s45) rq3Var).toString();
        }
        try {
            p2g p2gVar = w2g.b;
            u2gVar = rq3Var + '@' + X(rq3Var);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (w2g.a(u2gVar) != null) {
            u2gVar = rq3Var.getClass().getName() + '@' + X(rq3Var);
        }
        return (String) u2gVar;
    }

    public static final void t(d83 d83Var, xtc xtcVar, of3 of3Var, int i2) {
        d83 d83Var2;
        p4h p4hVar;
        kv1 kv1Var;
        utc utcVar;
        lv1 lv1Var;
        int i3;
        mv1 mv1Var;
        boolean z;
        float f2;
        mv1 mv1Var2 = uxf.g;
        p4h p4hVar2 = ww9.d;
        kv1 kv1Var2 = uxf.p;
        wxf wxfVar = ww9.b;
        lv1 lv1Var2 = uxf.m;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1052239660);
        int i4 = (i2 & 6) == 0 ? i2 | (av8Var.i(d83Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i5 = 1;
        int i6 = 0;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            tee teeVar = d83Var.a;
            Set set = d83Var.c;
            List<Map.Entry> H0 = CollectionsKt.H0(teeVar.entrySet(), new y73(i6));
            List H02 = CollectionsKt.H0(d83Var.b.entrySet(), new y73(i5));
            xtc f0 = l98.f0(n9e.q(l98.b0(bkh.d(xtcVar, 1.0f), 8.0f), lz.D(R.color.sentiment_negative_highlight, av8Var), o7g.a(8.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u23 a2 = t23.a(p4hVar2, kv1Var2, av8Var, 48);
            Set set2 = set;
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            int size = H0.size();
            utc utcVar2 = utc.a;
            if (size == 2) {
                av8Var.d0(699859605);
                xtc c0 = l98.c0(bkh.d(utcVar2, 1.0f), 8.0f, 4.0f);
                l8g a3 = k8g.a(wxfVar, lv1Var2, av8Var, 48);
                p4hVar = p4hVar2;
                kv1Var = kv1Var2;
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, c0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                Map.Entry entry = (Map.Entry) CollectionsKt.a0(0, H0);
                String str = entry != null ? (String) entry.getValue() : null;
                Regex regex = yid.a;
                String str2 = str == null ? "-" : str;
                Set set3 = set2;
                Map.Entry entry2 = (Map.Entry) CollectionsKt.a0(0, H0);
                boolean R = CollectionsKt.R(set3, entry2 != null ? (e93) entry2.getKey() : null);
                mv1 mv1Var3 = uxf.f;
                long D = lz.D(R.color.surface_1, av8Var);
                p8g p8gVar = p8g.a;
                l(str2, R, mv1Var3, p8gVar.a(1.0f, utcVar2, true), 0, D, av8Var, 384, 16);
                String v2 = oea.v(R.string.football_shots_off_target, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v2, p8gVar.a(1.5f, utcVar2, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.g(), av8Var, 0, 24960, 109560);
                Map.Entry entry3 = (Map.Entry) CollectionsKt.a0(1, H0);
                String str3 = entry3 != null ? (String) entry3.getValue() : null;
                String str4 = str3 == null ? "-" : str3;
                Map.Entry entry4 = (Map.Entry) CollectionsKt.a0(1, H0);
                l(str4, CollectionsKt.R(set3, entry4 != null ? (e93) entry4.getKey() : null), uxf.h, p8gVar.a(1.0f, utcVar2, true), 0, lz.D(R.color.surface_1, av8Var), av8Var, 384, 16);
                av8Var.s(true);
                av8Var.s(false);
                utcVar = utcVar2;
                lv1Var = lv1Var2;
                mv1Var = mv1Var2;
                i3 = 48;
                f2 = 8.0f;
                z = false;
            } else {
                p4hVar = p4hVar2;
                kv1Var = kv1Var2;
                av8Var.d0(701257426);
                String v3 = oea.v(R.string.football_shots_off_target, av8Var);
                yf8 yf8Var2 = xth.a;
                udj.c(v3, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 130042);
                xtc d0 = l98.d0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                int i7 = 48;
                l8g a4 = k8g.a(wxfVar, lv1Var2, av8Var, 48);
                utcVar = utcVar2;
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C3 = fqj.C(av8Var, d0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m4, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                av8Var.d0(947215733);
                for (Map.Entry entry5 : H0) {
                    e93 e93Var = (e93) entry5.getKey();
                    String str5 = (String) entry5.getValue();
                    Regex regex2 = yid.a;
                    if (str5 == null) {
                        str5 = "-";
                    }
                    Set set4 = set2;
                    set2 = set4;
                    l(str5, set4.contains(e93Var), mv1Var2, new goa(1.0f, true), 0, lz.D(R.color.surface_1, av8Var), av8Var, 384, 16);
                    lv1Var2 = lv1Var2;
                    i7 = i7;
                }
                lv1Var = lv1Var2;
                i3 = i7;
                mv1Var = mv1Var2;
                z = false;
                f2 = 8.0f;
                ljg.t(av8Var, false, true, false);
            }
            long B = hkg.B(lz.D(R.color.sentiment_positive_highlight, av8Var), lz.D(R.color.surface_1, av8Var));
            utc utcVar3 = utcVar;
            xtc m5 = bkh.m(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 196.0f, 70.0f);
            boolean f3 = av8Var.f(B);
            Object O = av8Var.O();
            if (f3 || O == nf3.a) {
                O = new yz(B, 9);
                av8Var.n0(O);
            }
            xtc X = td4.X(m5, (Function1) O);
            k1c c2 = e12.c(uxf.c, z);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m6 = av8Var.m();
            xtc C4 = fqj.C(av8Var, X);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, c2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m6, ff3Var2);
            Integer valueOf2 = Integer.valueOf(hashCode4);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C4, f50Var6);
            ImageVector N = s6a.N(R.drawable.football_goalmap_goal_only, 6, av8Var);
            long D2 = lz.D(R.color.n_lv_1, av8Var);
            n12 n12Var = n12.a;
            kq9.b(N, null, n12Var.b(utcVar3), D2, av8Var, 48, 0);
            xtc f02 = l98.f0(n12Var.b(utcVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5);
            u23 a5 = t23.a(p4hVar, kv1Var, av8Var, i3);
            int hashCode5 = Long.hashCode(av8Var.T);
            aee m7 = av8Var.m();
            xtc C5 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var4);
            waa.K(av8Var, m7, ff3Var2);
            bf3.s(hashCode5, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C5, f50Var6);
            String v4 = oea.v(R.string.football_shots_on_goal, av8Var);
            yf8 yf8Var3 = xth.a;
            udj.c(v4, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
            nq8.h(av8Var, new goa(1.0f, true));
            xtc d02 = l98.d0(bkh.d(utcVar3, 1.0f), 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a6 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode6 = Long.hashCode(av8Var.T);
            aee m8 = av8Var.m();
            xtc C6 = fqj.C(av8Var, d02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var4);
            waa.K(av8Var, m8, ff3Var2);
            bf3.s(hashCode6, av8Var, f50Var5, av8Var, ryVar2);
            waa.K(av8Var, C6, f50Var6);
            av8Var.d0(2094092040);
            int i8 = 0;
            for (Object obj : H02) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    b.q();
                    throw null;
                }
                Map.Entry entry6 = (Map.Entry) obj;
                e93 e93Var2 = (e93) entry6.getKey();
                String str6 = (String) entry6.getValue();
                if (H02.size() != 2 || i8 <= 0) {
                    av8Var.d0(468256075);
                    av8Var.s(false);
                } else {
                    av8Var.d0(468154209);
                    tz9.r(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var, bkh.e(utcVar3, 16.0f));
                    av8Var.s(false);
                }
                Regex regex3 = yid.a;
                if (str6 == null) {
                    str6 = "-";
                }
                l(str6, d83Var.d.contains(e93Var2), mv1Var, new goa(1.0f, true), 0, lz.D(R.color.surface_1, av8Var), av8Var, 384, 16);
                i8 = i9;
                utcVar3 = utcVar3;
            }
            d83Var2 = d83Var;
            i.p(av8Var, false, true, true, true);
            av8Var.s(true);
        } else {
            d83Var2 = d83Var;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lj(d83Var2, xtcVar, i2, 7);
        }
    }

    public static final String t0(int i2, String str) {
        if (str.length() <= i2) {
            return str.toString();
        }
        return str.subSequence(0, i2).toString() + "...";
    }

    public static final void u(e83 e83Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1928189334);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(e83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            String a2 = e83Var.a.a(av8Var2);
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(a2, l98.e0(bkh.b(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, 1), 16.0f, 16.0f, 16.0f, 8.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 130040);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lj(e83Var, xtcVar, i2, 6);
        }
    }

    public static final Object u0(Context context, re0 re0Var, Function2 function2, sq3 sq3Var) {
        doa doaVar = doa.d;
        if (re0Var != null) {
            return dz8.a.d(context, doaVar, l98.M(re0Var.a), function2, sq3Var);
        }
        a70.p("The glance ID is not the one of an App Widget");
        return null;
    }

    public static final void v(f83 f83Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        tee teeVar = f83Var.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1125555572);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(f83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        int i5 = 10;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            boolean g2 = av8Var.g(teeVar);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                List H0 = CollectionsKt.H0(teeVar.entrySet(), new y73(i4));
                ArrayList arrayList = new ArrayList(k13.r(H0, 10));
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    arrayList.add((v0i) ((Map.Entry) it.next()).getValue());
                }
                O = l6g.W(arrayList);
                av8Var.n0(O);
            }
            xw3.b((gv9) O, xtcVar, av8Var, i3 & 112);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lj(f83Var, xtcVar, i2, i5);
        }
    }

    public static final void w(b83 b83Var, List list, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        Set set = b83Var.c;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(283983207);
        int i3 = i2 | (av8Var.i(b83Var) ? 4 : 2) | (av8Var.i(list) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.d0(-1970034606);
            xtc b2 = bkh.b(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 36.0f, 1);
            if (z) {
                b2 = b2.z(f5p.s(lz.D(R.color.n_lv_4, av8Var)));
            }
            av8Var.s(false);
            xtc c0 = l98.c0(b2, 8.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            Map.Entry entry = (Map.Entry) CollectionsKt.a0(0, list);
            String str = entry != null ? (String) entry.getValue() : null;
            Regex regex = yid.a;
            if (str == null) {
                str = "-";
            }
            Set set2 = set;
            Map.Entry entry2 = (Map.Entry) CollectionsKt.a0(0, list);
            boolean R = CollectionsKt.R(set2, entry2 != null ? (e93) entry2.getKey() : null);
            mv1 mv1Var = uxf.f;
            p8g p8gVar = p8g.a;
            utc utcVar = utc.a;
            l(str, R, mv1Var, p8gVar.a(1.0f, utcVar, true), 0, 0L, av8Var, 384, 48);
            i(0, av8Var, p8gVar.a(1.5f, utcVar, true), b83Var.a.a(av8Var), b83Var.d != null);
            Map.Entry entry3 = (Map.Entry) CollectionsKt.a0(1, list);
            String str2 = entry3 != null ? (String) entry3.getValue() : null;
            if (str2 == null) {
                str2 = "-";
            }
            Set set3 = set;
            Map.Entry entry4 = (Map.Entry) CollectionsKt.a0(1, list);
            l(str2, CollectionsKt.R(set3, entry4 != null ? (e93) entry4.getKey() : null), uxf.h, p8gVar.a(1.0f, utcVar, true), 0, 0L, av8Var, 384, 48);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new t73(b83Var, list, z, xtcVar, i2, 1);
        }
    }

    public static final void x(gv9 gv9Var, boolean z, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1015267384);
        int i3 = i2 | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d2);
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
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(bkh.b(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 36.0f, 1), 16.0f, 12.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, c0);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, goaVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            j((Double) CollectionsKt.firstOrNull(gv9Var), bkh.q(utcVar, 64.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var2, 48, 0);
            av8Var2.s(true);
            String v2 = oea.v(R.string.average_sofascore_rating, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 2, 0, null, xth.g(), av8Var2, 0, 24960, 109562);
            av8Var = av8Var2;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            k1c c3 = e12.c(uxf.h, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, goaVar2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            j((Double) CollectionsKt.a0(1, gv9Var), null, av8Var, 0, 2);
            av8Var.s(true);
            av8Var.s(true);
            if (z) {
                av8Var.d0(1304547812);
                x2a.e(oea.v(R.string.hint_new_team_rating, av8Var), function0, wnn.A(l98.b0(utcVar, 8.0f), o7g.a(8.0f)), null, 0L, lz.D(R.color.surface_2, av8Var), null, R.drawable.ic_chevron_right_large_16, uxf.l, 8, 8, 12, av8Var, ((i3 >> 3) & 112) | 805309440, 438, 336);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                av8Var.d0(1305142020);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new v73(gv9Var, z, function0, xtcVar, i2, 1);
        }
    }

    public static final void y(int i2, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1, boolean z) {
        k83 k83Var;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1962426754);
        Function1 function12 = function1;
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.i(function12) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.d0(-401458807);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            if (z) {
                d2 = d2.z(f5p.s(lz.D(R.color.n_lv_4, av8Var)));
            }
            av8Var.s(false);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            Iterator p2 = ljg.p(av8Var, C, hf3.d, -73215808, gv9Var);
            int i4 = 0;
            while (p2.hasNext()) {
                Object next = p2.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                k83 k83Var2 = (k83) next;
                if (i4 > 0) {
                    k83Var = k83Var2;
                    z2 = true;
                } else {
                    k83Var = k83Var2;
                    z2 = false;
                }
                G(k83Var, z2, function12, new goa(1.0f, true), av8Var, (i3 << 3) & 896);
                function12 = function1;
                i4 = i5;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new u73(gv9Var, function1, z, xtcVar, i2, 0);
        }
    }

    public static final void z(g83 g83Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1363520874);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(g83Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc c0 = l98.c0(bkh.d(xtcVar, 1.0f), 16.0f, 12.0f);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var), null, bkh.l(utc.a, 24.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 432, 0);
            String a3 = g83Var.a.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new lj(g83Var, xtcVar, i2, 8);
        }
    }

    public abstract void J(nlg nlgVar, Object obj);

    public abstract String O();

    public void Z(glg glgVar, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        nlg V0 = glgVar.V0(O());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    J(V0, obj);
                    V0.U0();
                    V0.reset();
                }
            }
            Unit unit = Unit.a;
            o1j.t(V0, null);
        } finally {
        }
    }

    public void a0(glg glgVar, Object obj) {
        glgVar.getClass();
        if (obj == null) {
            return;
        }
        nlg V0 = glgVar.V0(O());
        try {
            J(V0, obj);
            V0.U0();
            o1j.t(V0, null);
        } finally {
        }
    }

    public long b0(glg glgVar, Object obj) {
        glgVar.getClass();
        if (obj == null) {
            return -1L;
        }
        nlg V0 = glgVar.V0(O());
        try {
            J(V0, obj);
            V0.U0();
            o1j.t(V0, null);
            return u0a.x(glgVar);
        } finally {
        }
    }

    public long[] c0(glg glgVar, ArrayList arrayList) {
        long j2;
        nlg V0 = glgVar.V0(O());
        try {
            int size = arrayList.size();
            long[] jArr = new long[size];
            for (int i2 = 0; i2 < size; i2++) {
                Object U = CollectionsKt.U(i2, arrayList);
                if (U != null) {
                    J(V0, U);
                    V0.U0();
                    V0.reset();
                    j2 = u0a.x(glgVar);
                } else {
                    j2 = -1;
                }
                jArr[i2] = j2;
            }
            o1j.t(V0, null);
            return jArr;
        } finally {
        }
    }

    public List d0(glg glgVar, Collection collection) {
        if (collection == null) {
            return km5.a;
        }
        xbb b2 = kotlin.collections.a.b();
        nlg V0 = glgVar.V0(O());
        try {
            for (Object obj : collection) {
                if (obj != null) {
                    J(V0, obj);
                    V0.U0();
                    V0.reset();
                    b2.add(Long.valueOf(u0a.x(glgVar)));
                } else {
                    b2.add(-1L);
                }
            }
            Unit unit = Unit.a;
            o1j.t(V0, null);
            return kotlin.collections.a.a(b2);
        } finally {
        }
    }
}
