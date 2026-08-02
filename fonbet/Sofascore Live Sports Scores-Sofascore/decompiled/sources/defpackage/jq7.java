package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class jq7 {
    public static final void a(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var;
        Object u2gVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1210035768);
        int i2 = i | 6;
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) av8Var2.k(nz.b);
            f2a q = i2a.q(i2a.F(null, av8Var2, 1), -1.0f, 1.0f, s02.P(s02.h0(20000, 0, jg5.d, 2), bzf.b, 0L, 4), "image-pan-animation", av8Var2, 29064, 0);
            Object O = av8Var2.O();
            if (O == nf3.a) {
                try {
                    p2g p2gVar = w2g.b;
                    Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131231479);
                    u2gVar = decodeResource != null ? new a10(decodeResource) : null;
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                O = (a10) (u2gVar instanceof u2g ? null : u2gVar);
                av8Var2.n0(O);
            }
            dy0.b(bkh.c, null, yqo.H(1399911458, av8Var2, new hl6(5, (a10) O, q)), av8Var2, 3072, 6);
            av8Var = av8Var2;
            xtcVar = utc.a;
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar, i, 14);
        }
    }

    public static final void b(boolean z, boolean z2, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        Function1 function12 = function1;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-952324334);
        if ((i & 6) == 0) {
            i2 = (av8Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        int i4 = 1;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            Activity activity = (Activity) av8Var.k(ngb.a);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Unit unit = Unit.a;
            Object O2 = av8Var.O();
            rq3 rq3Var = null;
            if (O2 == a99Var) {
                O2 = new nj5(e1dVar, rq3Var, i4);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, unit, (Function2) O2);
            k1c c = e12.c(uxf.c, false);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, c, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            a(0, av8Var, null);
            g28 g28Var = bkh.c;
            xtc f0 = ml4.f0(hkg.u0(xtcVar.z(g28Var), hkg.o0(av8Var), false, 14));
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a = t23.a(p4hVar, kv1Var, av8Var, 0);
            int i5 = i2;
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.fantasy, av8Var);
            ImageVector N = s6a.N(R.drawable.ic_arrow_back, 6, av8Var);
            long D = lz.D(R.color.darken_overlay_3, av8Var);
            boolean i6 = av8Var.i(activity);
            Object O3 = av8Var.O();
            if (i6 || O3 == a99Var) {
                i3 = 0;
                O3 = new iq7(activity, i3);
                av8Var.n0(O3);
            } else {
                i3 = 0;
            }
            pea.k(v, (Function0) O3, null, D, 0L, N, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 12582912, 340);
            av8Var = av8Var;
            utc utcVar = utc.a;
            x23 x23Var = x23.a;
            if (z2) {
                av8Var.d0(1335078227);
                boolean z5 = (i5 & 896) == 256;
                Object O4 = av8Var.O();
                if (z5 || O4 == a99Var) {
                    O4 = new l77(19, function12);
                    av8Var.n0(O4);
                }
                wnn.n((Function0) O4, l98.b0(bkh.r(x23Var.a(1.0f, utcVar, true), null, 3), 16.0f), 0L, av8Var, 0, 4);
                av8Var.s(false);
                z4 = true;
                z3 = z;
            } else {
                av8Var.d0(1335539538);
                kv1 kv1Var2 = uxf.p;
                xtc d0 = l98.d0(l98.f0(x23Var.a(1.0f, utcVar, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                u23 a2 = t23.a(p4hVar, kv1Var2, av8Var, 48);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, d0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                String v2 = oea.v(R.string.fantasy_welcome_screen_title, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v2, bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.h(), av8Var, 48, 24960, 110584);
                udj.c(bf3.g(32.0f, R.string.fantasy_welcome_screen_body, av8Var, av8Var, utcVar), bkh.d(utcVar, 1.0f), lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.i(), av8Var, 48, 384, 126968);
                xtc a3 = x23Var.a(1.0f, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), true);
                u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
                int hashCode4 = Long.hashCode(av8Var.T);
                aee m4 = av8Var.m();
                xtc C4 = fqj.C(av8Var, a3);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m4, ff3Var);
                bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C4, f50Var3);
                nq8.h(av8Var, x23Var.a(1.0f, utcVar, true));
                kq9.b(s6a.N(R.drawable.ic_main_fantasy, 6, av8Var), null, bkh.k(g28Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 160.0f, 160.0f, 3), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                nq8.h(av8Var, x23Var.a(1.0f, utcVar, true));
                av8Var.s(true);
                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
                i4k h0 = s02.h0(500, 0, null, 6);
                Object O5 = av8Var.O();
                if (O5 == a99Var) {
                    O5 = new yt6(12);
                    av8Var.n0(O5);
                }
                z3 = z;
                function12 = function1;
                fz8.b(x23Var, booleanValue, null, uo5.n(h0, (Function1) O5), null, null, yqo.H(-1854584576, av8Var, new hs5(function12, z3, 5)), av8Var, 1572870, 26);
                av8Var = av8Var;
                z4 = true;
                av8Var.s(true);
                av8Var.s(false);
            }
            av8Var.s(z4);
            av8Var.s(z4);
        } else {
            z3 = z;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bl1(z3, z2, function12, xtcVar, i);
        }
    }

    public static final void c(boolean z, Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        Function0 function02;
        int i2;
        xtc r;
        Object l50Var;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1745233138);
        int i3 = (av8Var2.h(z) ? 4 : 2) | i | (av8Var2.i(function0) ? 32 : 16);
        int i4 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 19) != 18)) {
            Activity activity = (Activity) av8Var2.k(ngb.a);
            Context context = (Context) av8Var2.k(nz.b);
            ce ceVar = new ce(3);
            boolean i5 = av8Var2.i(activity) | av8Var2.i(context);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i5 || O == a99Var) {
                O = new w47(19, context, (Object) activity);
                av8Var2.n0(O);
            }
            crb O2 = xw3.O(ceVar, (Function1) O, av8Var2);
            Object[] objArr = new Object[0];
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = new go7(8);
                av8Var2.n0(O3);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O3, av8Var2, 48);
            qug o0 = hkg.o0(av8Var2);
            Object O4 = av8Var2.O();
            if (O4 == a99Var) {
                ia0 ia0Var = ia0.q;
                O4 = e.f(Boolean.valueOf(ok3.p().e().getIsLoggedIn()));
                av8Var2.n0(O4);
            }
            e1d e1dVar2 = (e1d) O4;
            d6b d6bVar = d6b.ON_RESUME;
            Object O5 = av8Var2.O();
            if (O5 == a99Var) {
                O5 = new v30(22, e1dVar2);
                av8Var2.n0(O5);
            }
            jca.b(d6bVar, null, (Function0) O5, av8Var2, 390);
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            String a = FantasySectionedInfoType.WhatIsFantasy.a.getTitle().a(av8Var2);
            boolean g = av8Var2.g(e1dVar);
            Object O6 = av8Var2.O();
            if (g || O6 == a99Var) {
                O6 = new v30(23, e1dVar);
                av8Var2.n0(O6);
            }
            tz9.k(booleanValue, (Function0) O6, null, o0, null, a, null, null, yqo.H(502616239, av8Var2, new r97(o0, i4)), av8Var2, 100663296, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);
            r = m6k.r(utc.a, "NoTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
            boolean booleanValue2 = ((Boolean) e1dVar2.getValue()).booleanValue();
            boolean i6 = av8Var2.i(context) | av8Var2.i(O2) | av8Var2.g(e1dVar) | ((i3 & 112) == 32);
            Object O7 = av8Var2.O();
            if (i6 || O7 == a99Var) {
                i2 = 1;
                l50Var = new l50(context, O2, function0, e1dVar, 24);
                function02 = function0;
                av8Var2.n0(l50Var);
            } else {
                function02 = function0;
                l50Var = O7;
                i2 = 1;
            }
            b(booleanValue2, z, (Function1) l50Var, r, av8Var2, (i3 << 3) & 112);
            av8Var = av8Var2;
        } else {
            av8Var = av8Var2;
            function02 = function0;
            i2 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new n34(z, function02, i, i2);
        }
    }
}
