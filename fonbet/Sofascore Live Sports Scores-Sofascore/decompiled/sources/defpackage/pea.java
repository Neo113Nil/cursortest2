package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.database.DbSportOrder;
import com.sofascore.model.newNetwork.SportItem;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class pea {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static volatile boolean f = true;

    public static hzh F(DbSportOrder dbSportOrder, HashMap hashMap, int i) {
        Set set = wyh.a;
        if ((i & 1) != 0) {
            hashMap = null;
        }
        boolean z = (i & 2) == 0;
        dbSportOrder.getClass();
        SportItem sportItem = hashMap != null ? (SportItem) hashMap.get(dbSportOrder.getSportName()) : null;
        Integer b2 = z ? wyh.b(dbSportOrder.getSportName()) : wyh.d(dbSportOrder.getSportName());
        return new hzh(new lzh(dbSportOrder.getSportName()), dbSportOrder.isSelected(), b2 != null ? new q9k(b2.intValue()) : null, wyh.a(dbSportOrder.getSportName()), sportItem != null ? Integer.valueOf(sportItem.getLive()) : null, sportItem != null ? Integer.valueOf(sportItem.getTotal()) : null, Intrinsics.c(dbSportOrder.getSportName(), Sports.MOTORSPORT) ? new q9k(R.string.motorsport_picker_text) : null);
    }

    public static final String G(SerialDescriptor serialDescriptor) {
        return CollectionsKt.f0(llf.j(0, serialDescriptor.d()), ", ", serialDescriptor.h() + '(', ")", new mme(serialDescriptor, 5), 24);
    }

    public static final oqf H(dma dmaVar) {
        oqf m = o6a.m(dmaVar, true);
        long g = dmaVar.g(m.f());
        float f2 = m.c;
        float f3 = m.d;
        return jca.q(g, dmaVar.g((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)));
    }

    public static void I(int i, Object obj) {
        if (obj != null) {
            return;
        }
        yhk.s(me4.g(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
    }

    public static void J(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a70.p(str);
    }

    public static final void a(int i, of3 of3Var, xtc xtcVar, Function0 function0) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1078899621);
        int i2 = i | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_2, av8Var), o7g.a(16.0f)), 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var, 6);
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
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            xtc l = bkh.l(utcVar, 24.0f);
            lv1 lv1Var = uxf.m;
            kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var), null, l.z(new nok(lv1Var)), lz.D(R.color.n_lv_3, av8Var), av8Var, 48, 0);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc z = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).z(new nok(lv1Var));
            String v = oea.v(R.string.football_career_stats_data_info, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, z, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131064);
            xtc l2 = bkh.l(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f);
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
                O2 = mce.c;
                av8Var.n0(O2);
            }
            xtc y = tol.y(l2, true, false, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 24), av8Var, 0);
            av8Var = av8Var;
            kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var), null, y, lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fm(xtcVar, function0, i, 9);
        }
    }

    public static final void b(final xtc xtcVar, final h1d h1dVar, final e1d e1dVar, final qug qugVar, final uah uahVar, final long j, final float f2, final tc3 tc3Var, of3 of3Var, final int i) {
        float f3;
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(848986741);
        int i3 = i | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.g(h1dVar) ? 32 : 16) | (av8Var.g(qugVar) ? a.o : 1024) | (av8Var.g(uahVar) ? 16384 : 8192) | (av8Var.f(j) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.d(f2) ? 8388608 : 4194304) | (av8Var.g(null) ? 67108864 : 33554432) | (av8Var.i(tc3Var) ? 536870912 : 268435456);
        if (av8Var.T(i3 & 1, (i3 & 306783379) != 306783378)) {
            axj H = yso.H(h1dVar, "DropDownMenu", av8Var, (((i3 >> 3) & 14) | 48) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            g0i I = ufa.I(bwc.b, av8Var);
            g0i I2 = ufa.I(bwc.d, av8Var);
            q4k q4kVar = lz.f;
            t01 t01Var = H.a;
            e1d e1dVar2 = H.d;
            boolean booleanValue = ((Boolean) t01Var.w()).booleanValue();
            av8Var.d0(143964305);
            float f4 = booleanValue ? 1.0f : 0.8f;
            av8Var.s(false);
            Float valueOf = Float.valueOf(f4);
            eoh eohVar = (eoh) e1dVar2;
            boolean booleanValue2 = ((Boolean) eohVar.getValue()).booleanValue();
            av8Var.d0(143964305);
            float f5 = booleanValue2 ? 1.0f : 0.8f;
            av8Var.s(false);
            Float valueOf2 = Float.valueOf(f5);
            H.f();
            av8Var.d0(-745957716);
            av8Var.s(false);
            boolean z = true;
            vwj x = yso.x(H, valueOf, valueOf2, I, q4kVar, av8Var, 0);
            boolean booleanValue3 = ((Boolean) H.a.w()).booleanValue();
            av8Var.d0(892761509);
            float f6 = booleanValue3 ? 1.0f : 0.0f;
            av8Var.s(false);
            Float valueOf3 = Float.valueOf(f6);
            boolean booleanValue4 = ((Boolean) eohVar.getValue()).booleanValue();
            av8Var.d0(892761509);
            float f7 = booleanValue4 ? 1.0f : 0.0f;
            av8Var.s(false);
            Float valueOf4 = Float.valueOf(f7);
            H.f();
            av8Var.d0(2839488);
            av8Var.s(false);
            vwj x2 = yso.x(H, valueOf3, valueOf4, I2, q4kVar, av8Var, 0);
            boolean booleanValue5 = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            boolean h = av8Var.h(booleanValue5) | av8Var.g(x);
            if ((i3 & 112) != 32) {
                z = false;
            }
            boolean g = z | h | av8Var.g(x2);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                i2 = 0;
                b05 b05Var = new b05(booleanValue5, h1dVar, e1dVar, x, x2);
                av8Var.n0(b05Var);
                O = b05Var;
            } else {
                i2 = 0;
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            uni.a(s02.M(utc.a, (Function1) O), uahVar, j, 0L, f3, f2, null, yqo.H(-1463404422, av8Var, new lfc(i2, xtcVar, qugVar, tc3Var)), av8Var, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
            av8Var = av8Var;
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(h1dVar, e1dVar, qugVar, uahVar, j, f2, tc3Var, i) { // from class: kfc
                public final /* synthetic */ h1d b;
                public final /* synthetic */ e1d c;
                public final /* synthetic */ qug d;
                public final /* synthetic */ uah e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;
                public final /* synthetic */ tc3 h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(385);
                    pea.b(xtc.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(tc3 tc3Var, Function0 function0, xtc xtcVar, Function2 function2, boolean z, cfc cfcVar, p3e p3eVar, wzc wzcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        wzc wzcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (av8Var.i(tc3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i2 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            xtcVar2 = xtcVar;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.i(function2) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var.g(cfcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= av8Var.g(p3eVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            wzcVar2 = wzcVar;
            i2 |= av8Var.g(wzcVar2) ? 67108864 : 33554432;
        } else {
            wzcVar2 = wzcVar;
        }
        if (av8Var.T(i2 & 1, (38347923 & i2) != 38347922)) {
            xtc a0 = l98.a0(bkh.o(bkh.d(oyn.u(xtcVar2, wzcVar2, n5g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true), z, null, null, function0, 24), 1.0f), 112.0f, 48.0f, 280.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), p3eVar);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a0);
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
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            udj.a(((a7k) av8Var.k(d7k.a)).m, yqo.H(865999929, av8Var, new mfc(function2, cfcVar, z, tc3Var)), av8Var, 48);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b87(tc3Var, function0, xtcVar, function2, z, cfcVar, p3eVar, wzcVar, i);
        }
    }

    public static final void d(final int i, xtc xtcVar, final long j, final long j2, of3 of3Var, final int i2) {
        final xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1815737431);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | 48 | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.f(j2) ? 2048 : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            final long D = lz.D(R.color.neutral_highlight, av8Var);
            final long j3 = r13.d;
            d7e t = haa.t(i, i3 & 14, av8Var);
            utc utcVar = utc.a;
            xtc b0 = l98.b0(bkh.l(utcVar, 16.0f), 2.0f);
            boolean f2 = av8Var.f(D) | ((i3 & 7168) == 2048);
            Object O = av8Var.O();
            if (f2 || O == nf3.a) {
                Function1 function1 = new Function1() { // from class: l8b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        pea.n(ha5Var, true, j3, new r13(D), new r13(j2));
                        return Unit.a;
                    }
                };
                av8Var.n0(function1);
                O = function1;
            }
            kq9.a(t, null, td4.X(b0, (Function1) O), j, av8Var, 56 | ((i3 << 3) & 7168), 0);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i, xtcVar2, j, j2, i2) { // from class: m8b
                public final /* synthetic */ int a;
                public final /* synthetic */ xtc b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    pea.d(this.a, this.b, this.c, this.d, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(xtc xtcVar, boolean z, mea meaVar, Function0 function0, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1277913462);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(xtcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.e(meaVar == null ? -1 : meaVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var2.i(function0) ? 2048 : 1024;
        }
        int i3 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            n7g a2 = o7g.a(4.0f);
            t3e t3eVar = new t3e(16.0f, 10.0f, 16.0f, 10.0f);
            p72 p72Var = new p72(lz.D(R.color.primary_default, av8Var2), lz.D(R.color.surface_1, av8Var2), lz.D(R.color.neutral_default, av8Var2), lz.D(R.color.surface_1, av8Var2));
            boolean z2 = (i2 & 7168) == 2048;
            Object O = av8Var2.O();
            if (z2 || O == nf3.a) {
                O = new ve7(13, function0);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            iz8.e((Function0) O, d2, z, a2, p72Var, null, null, t3eVar, null, yqo.H(1084222074, av8Var2, new bba(meaVar, i3)), av8Var, ((i2 << 3) & 896) | 805306368, 352);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s73(xtcVar, z, meaVar, function0, i);
        }
    }

    public static final void f(tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-709502251);
        int i2 = 2;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            ff5 ff5Var = upg.a;
            spg spgVar = (spg) av8Var.k(ff5Var);
            ppg I = i2a.I(av8Var);
            Object[] objArr = {spgVar};
            y3g y3gVar = new y3g(9, new mpa(i2), new uf8(19, spgVar, I));
            boolean i3 = av8Var.i(spgVar) | av8Var.i(I);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new ij8(24, spgVar, I);
                av8Var.n0(O);
            }
            ssa ssaVar = (ssa) o3a.M(objArr, y3gVar, (Function0) O, av8Var, 0);
            tol.b(ff5Var.a(ssaVar), yqo.H(-412824043, av8Var, new op9(10, tc3Var, ssaVar)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b25(i, 4, tc3Var);
        }
    }

    public static final void g(x6f x6fVar, xtc xtcVar, jzg jzgVar, of3 of3Var, int i, int i2) {
        jzg jzgVar2;
        int i3;
        jzg jzgVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-132547245);
        int i4 = i | (av8Var.g(x6fVar) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            jzgVar2 = jzgVar;
        } else {
            jzgVar2 = jzgVar;
            i3 = i4 | (av8Var.g(jzgVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            jzg jzgVar4 = i5 != 0 ? null : jzgVar2;
            k1c c2 = e12.c(uxf.c, false);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(1071905566);
            if (x6fVar instanceof v6f) {
                av8Var.d0(-102055678);
                v6f v6fVar = (v6f) x6fVar;
                d(v6fVar.a, null, v6fVar.b, v6fVar.c, av8Var, 0);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                if (!(x6fVar instanceof w6f)) {
                    throw dmi.h(av8Var, -1388766911, false);
                }
                av8Var.d0(-101781700);
                w6f w6fVar = (w6f) x6fVar;
                j(384, 8, w6fVar.b, av8Var, null, w6fVar.a, true);
                av8Var.s(false);
            }
            av8Var.s(false);
            if (jzgVar4 == null) {
                av8Var.d0(-1130072791);
                av8Var.s(false);
            } else {
                av8Var.d0(-1130072790);
                j(3456, 0, jzgVar4.b, av8Var, rd0.O(utc.a, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), jzgVar4.a, false);
                av8Var.s(false);
            }
            av8Var.s(true);
            jzgVar3 = jzgVar4;
        } else {
            av8Var.W();
            jzgVar3 = jzgVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(i, i2, 15, x6fVar, xtcVar, jzgVar3);
        }
    }

    public static final void h(final mvc mvcVar, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        av8 av8Var;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1396640444);
        if ((i & 6) == 0) {
            i2 = (av8Var2.g(mvcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        final int i4 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            tc3 H = yqo.H(-1701305509, av8Var2, new ct8() { // from class: nvc
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = r2;
                    mvc mvcVar2 = mvcVar;
                    switch (i5) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                u23 a2 = t23.a(ww9.d, uxf.p, av8Var3, 48);
                                int hashCode = Long.hashCode(av8Var3.T);
                                aee m = av8Var3.m();
                                utc utcVar = utc.a;
                                xtc C = fqj.C(av8Var3, utcVar);
                                if3.k7.getClass();
                                zg3 zg3Var = hf3.b;
                                av8Var3.h0();
                                if (av8Var3.S) {
                                    av8Var3.l(zg3Var);
                                } else {
                                    av8Var3.q0();
                                }
                                waa.K(av8Var3, a2, hf3.g);
                                waa.K(av8Var3, m, hf3.f);
                                waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                                waa.J(av8Var3, hf3.k);
                                waa.K(av8Var3, C, hf3.d);
                                wkn.l(s6a.N(R.drawable.performance_chart, 6, av8Var3), bkh.l(utcVar, 96.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var3, 432, 120);
                                xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                String str = mvcVar2.g;
                                String str2 = str == null ? "" : str;
                                yf8 yf8Var = xth.a;
                                udj.c(str2, f0, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var3, 48, 0, 130040);
                                xtc f02 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                String str3 = mvcVar2.h;
                                udj.c(str3 == null ? "" : str3, f02, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var3, 48, 0, 130040);
                                av8Var3.s(true);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                fz8.m(mvcVar2.l, 0L, av8Var4, 0, 2);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            tc3 H2 = yqo.H(-542768235, av8Var2, new ct8() { // from class: nvc
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    mvc mvcVar2 = mvcVar;
                    switch (i5) {
                        case 0:
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((m12) obj).getClass();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                                u23 a2 = t23.a(ww9.d, uxf.p, av8Var3, 48);
                                int hashCode = Long.hashCode(av8Var3.T);
                                aee m = av8Var3.m();
                                utc utcVar = utc.a;
                                xtc C = fqj.C(av8Var3, utcVar);
                                if3.k7.getClass();
                                zg3 zg3Var = hf3.b;
                                av8Var3.h0();
                                if (av8Var3.S) {
                                    av8Var3.l(zg3Var);
                                } else {
                                    av8Var3.q0();
                                }
                                waa.K(av8Var3, a2, hf3.g);
                                waa.K(av8Var3, m, hf3.f);
                                waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                                waa.J(av8Var3, hf3.k);
                                waa.K(av8Var3, C, hf3.d);
                                wkn.l(s6a.N(R.drawable.performance_chart, 6, av8Var3), bkh.l(utcVar, 96.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var3, 432, 120);
                                xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                String str = mvcVar2.g;
                                String str2 = str == null ? "" : str;
                                yf8 yf8Var = xth.a;
                                udj.c(str2, f0, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.l(), av8Var3, 48, 0, 130040);
                                xtc f02 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                                String str3 = mvcVar2.h;
                                udj.c(str3 == null ? "" : str3, f02, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.g(), av8Var3, 48, 0, 130040);
                                av8Var3.s(true);
                            } else {
                                av8Var3.W();
                            }
                            break;
                        default:
                            of3 of3Var3 = (of3) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((v23) obj).getClass();
                            av8 av8Var4 = (av8) of3Var3;
                            if (av8Var4.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                                fz8.m(mvcVar2.l, 0L, av8Var4, 0, 2);
                            } else {
                                av8Var4.W();
                            }
                            break;
                    }
                    return Unit.a;
                }
            });
            int i5 = ((i2 & 112) == 32 ? 1 : 0) | ((i2 & 14) == 4 ? 1 : 0);
            Object O = av8Var2.O();
            if (i5 != 0 || O == nf3.a) {
                O = new ixa(i3, function1, mvcVar);
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            v9g.c(xtcVar, null, H, H2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, null, (Function0) O, av8Var, ((i2 >> 6) & 14) | 3456, 2034);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new zt7(mvcVar, function1, xtcVar, i, 20);
        }
    }

    public static final void i(xce xceVar, Function0 function0, of3 of3Var, int i) {
        xce xceVar2;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1015494540);
        int i2 = 4;
        int i3 = (av8Var.i(xceVar) ? 4 : 2) | i | (av8Var.i(function0) ? 32 : 16);
        int i4 = 28;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            boolean i5 = av8Var.i(xceVar);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new mnc(xceVar, i4);
                av8Var.n0(O);
            }
            xceVar2 = xceVar;
            wkn.a(xceVar2, null, null, (Function1) O, yqo.H(-670260299, av8Var, new r64(i2, function0)), av8Var, (i3 & 14) | 24576, 6);
        } else {
            xceVar2 = xceVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(xceVar2, function0, i, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(int i, int i2, final long j, of3 of3Var, xtc xtcVar, final String str, final boolean z) {
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(859469250);
        int i4 = (av8Var.g(str) ? 4 : 2) | i | (av8Var.f(j) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var.g(xtcVar2) ? a.o : 1024;
            if (av8Var.T(i4 & 1, (i4 & 1171) == 1170)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                xtc xtcVar4 = i5 != 0 ? utc.a : xtcVar2;
                final long D = lz.D(R.color.neutral_highlight, av8Var);
                final long j2 = r13.d;
                final jej Q = h5a.Q(0, 0, 1, av8Var);
                yf8 yf8Var = xth.a;
                final dfj a2 = dfj.a(xth.k(), lz.D(R.color.on_color_primary, av8Var), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                int i6 = i4 & 14;
                boolean g = (i6 == 4) | av8Var.g(a2);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (g || O == a99Var) {
                    O = jej.a(Q, str, a2, 1020);
                    av8Var.n0(O);
                }
                final aej aejVar = (aej) O;
                xtc b0 = l98.b0(bkh.l(xtcVar4, 16.0f), 2.0f);
                xtc xtcVar5 = xtcVar4;
                boolean f2 = ((i4 & 112) == 32) | av8Var.f(D) | av8Var.i(aejVar) | av8Var.g(Q) | (i6 == 4) | av8Var.g(a2);
                Object O2 = av8Var.O();
                if (f2 || O2 == a99Var) {
                    i3 = 0;
                    Function1 function1 = new Function1() { // from class: k8b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ha5 ha5Var = (ha5) obj;
                            ha5Var.getClass();
                            pea.n(ha5Var, z, j2, new r13(D), new r13(j));
                            float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.O0() >> 32));
                            aej aejVar2 = aejVar;
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.O0() & 4294967295L)) - (((int) (aejVar2.c & 4294967295L)) / 2);
                            o6a.v(ha5Var, Q, str, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat - (((int) (aejVar2.c >> 32)) / 2)) << 32), a2, 496);
                            return Unit.a;
                        }
                    };
                    av8Var.n0(function1);
                    O2 = function1;
                } else {
                    i3 = 0;
                }
                lz.d(i3, av8Var, b0, (Function1) O2);
                xtcVar3 = xtcVar5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new r93(str, j, z, xtcVar3, i, i2);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var.T(i4 & 1, (i4 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(String str, Function0 function0, xtc xtcVar, long j, long j2, ImageVector imageVector, ct8 ct8Var, float f2, w8l w8lVar, of3 of3Var, int i, int i2) {
        int i3;
        long j3;
        long j4;
        int i4;
        ImageVector imageVector2;
        int i5;
        int i6;
        ct8 ct8Var2;
        int i7;
        float f3;
        int i8;
        av8 av8Var;
        xtc xtcVar2;
        w8l w8lVar2;
        ct8 ct8Var3;
        float f4;
        eqf u;
        w8l a2;
        int i9;
        xtc xtcVar3;
        int i10;
        str.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(265572366);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i3 | (av8Var2.i(function0) ? 32 : 16) | 384;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j3 = j;
                if (av8Var2.f(j3)) {
                    i10 = a.o;
                    i11 |= i10;
                }
            } else {
                j3 = j;
            }
            i10 = 1024;
            i11 |= i10;
        } else {
            j3 = j;
        }
        if ((i2 & 16) == 0) {
            j4 = j2;
            if (av8Var2.f(j4)) {
                i4 = 16384;
                int i12 = i11 | i4;
                if ((i2 & 32) != 0) {
                    imageVector2 = imageVector;
                    if (av8Var2.g(imageVector2)) {
                        i5 = 131072;
                        int i13 = i12 | i5;
                        i6 = i2 & 64;
                        if (i6 != 0) {
                            i13 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            ct8Var2 = ct8Var;
                            i13 |= av8Var2.i(ct8Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                            i7 = i2 & 128;
                            if (i7 == 0) {
                                i13 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                f3 = f2;
                                i13 |= av8Var2.d(f3) ? 8388608 : 4194304;
                                i8 = i13 | 33554432;
                                if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
                                    av8Var2.Y();
                                    if ((i & 1) == 0 || av8Var2.B()) {
                                        if ((i2 & 8) != 0) {
                                            j3 = lz.D(R.color.primary_variant, av8Var2);
                                            i8 &= -7169;
                                        }
                                        if ((i2 & 16) != 0) {
                                            j4 = lz.D(R.color.on_color_primary, av8Var2);
                                            i8 &= -57345;
                                        }
                                        if ((i2 & 32) != 0) {
                                            i8 &= -458753;
                                            imageVector2 = s6a.N(R.drawable.ic_arrow_back, 6, av8Var2);
                                        }
                                        if (i6 != 0) {
                                            ct8Var2 = null;
                                        }
                                        if (i7 != 0) {
                                            f3 = 4.0f;
                                        }
                                        a2 = alj.a(av8Var2);
                                        i9 = i8 & (-234881025);
                                        xtcVar3 = utc.a;
                                    } else {
                                        av8Var2.W();
                                        if ((i2 & 8) != 0) {
                                            i8 &= -7169;
                                        }
                                        if ((i2 & 16) != 0) {
                                            i8 &= -57345;
                                        }
                                        if ((i2 & 32) != 0) {
                                            i8 &= -458753;
                                        }
                                        xtcVar3 = xtcVar;
                                        i9 = i8 & (-234881025);
                                        a2 = w8lVar;
                                    }
                                    long j5 = j3;
                                    av8Var2.t();
                                    float f5 = f3;
                                    av8Var = av8Var2;
                                    uni.a(d2a.E(xtcVar3, f5, null, false, 0L, 30), null, j5, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(-1220529901, av8Var2, new vka(a2, function0, imageVector2, j4, str, ct8Var2)), av8Var, ((i9 >> 3) & 896) | 12582912, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                                    w8lVar2 = a2;
                                    xtcVar2 = xtcVar3;
                                    ct8Var3 = ct8Var2;
                                    f4 = f5;
                                    j3 = j5;
                                } else {
                                    av8Var = av8Var2;
                                    av8Var.W();
                                    xtcVar2 = xtcVar;
                                    w8lVar2 = w8lVar;
                                    ct8Var3 = ct8Var2;
                                    f4 = f3;
                                }
                                u = av8Var.u();
                                if (u != null) {
                                    u.d = new s88(str, function0, xtcVar2, j3, j4, imageVector2, ct8Var3, f4, w8lVar2, i, i2);
                                    return;
                                }
                                return;
                            }
                            f3 = f2;
                            i8 = i13 | 33554432;
                            if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
                            }
                            u = av8Var.u();
                            if (u != null) {
                            }
                        }
                        ct8Var2 = ct8Var;
                        i7 = i2 & 128;
                        if (i7 == 0) {
                        }
                        f3 = f2;
                        i8 = i13 | 33554432;
                        if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                } else {
                    imageVector2 = imageVector;
                }
                i5 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                int i132 = i12 | i5;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                ct8Var2 = ct8Var;
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                f3 = f2;
                i8 = i132 | 33554432;
                if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
        } else {
            j4 = j2;
        }
        i4 = 8192;
        int i122 = i11 | i4;
        if ((i2 & 32) != 0) {
        }
        i5 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i1322 = i122 | i5;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        ct8Var2 = ct8Var;
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        f3 = f2;
        i8 = i1322 | 33554432;
        if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void l(xtc xtcVar, boolean z, slf slfVar, boolean z2, boolean z3, boolean z4, of3 of3Var, int i) {
        slf slfVar2;
        Integer num;
        ry ryVar;
        boolean z5;
        int i2;
        int i3;
        zg3 zg3Var;
        ff3 ff3Var;
        f50 f50Var;
        f50 f50Var2;
        f50 f50Var3;
        ry ryVar2;
        utc utcVar;
        char c2;
        boolean z6;
        int i4;
        int i5;
        float f2;
        int i6;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2034975621);
        int i7 = i | (av8Var.g(xtcVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(slfVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.h(z2) ? a.o : 1024) | (av8Var.h(z3) ? 16384 : 8192) | (av8Var.h(z4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i7 & 1, (74899 & i7) != 74898)) {
            ff5 ff5Var = nz.b;
            Context context = (Context) av8Var.k(ff5Var);
            UserBadge userBadge = slfVar.h;
            boolean z7 = slfVar.g;
            Integer num2 = null;
            if (userBadge != null) {
                int i8 = u9f.a[userBadge.ordinal()];
                num = Integer.valueOf(i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? 0 : R.drawable.ic_top_predictors_badge : R.drawable.ic_top_contributor_badge : R.drawable.ic_top_editor_badge : R.drawable.ic_moderator_badge);
            } else {
                num = null;
            }
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f4 = z2 ? 16.0f : 0.0f;
            if (z3) {
                f3 = 16.0f;
            }
            n7g b2 = o7g.b(f4, f4, f3, f3);
            utc utcVar2 = utc.a;
            xtc A = wnn.A(utcVar2, b2);
            long D = lz.D(R.color.surface_1, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(A, D, jf9Var);
            mv1 mv1Var = uxf.c;
            k1c c3 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, c3, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar3 = hf3.k;
            waa.J(av8Var, ryVar3);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            xtc d2 = bkh.d(xtcVar, 1.0f);
            if (z4 && z7) {
                ryVar = ryVar3;
                z5 = false;
            } else {
                ryVar = ryVar3;
                z5 = true;
            }
            boolean i9 = ((i7 & 896) == 256) | av8Var.i(context);
            Object O = av8Var.O();
            if (i9 || O == nf3.a) {
                O = new fej(14, slfVar, context);
                av8Var.n0(O);
            }
            ry ryVar4 = ryVar;
            xtc Y = fz8.Y(tol.y(d2, z5, false, false, 0L, null, (Function0) O, av8Var, 30), n9a.a);
            if (z7) {
                i2 = -187871724;
                i3 = R.color.primary_highlight;
            } else {
                i2 = -187870868;
                i3 = R.color.surface_1;
            }
            xtc f0 = l98.f0(n9e.q(Y, ljg.f(av8Var, i2, i3, av8Var, false), jf9Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var4);
            waa.K(av8Var, m2, ff3Var2);
            bf3.s(hashCode2, av8Var, f50Var5, av8Var, ryVar4);
            waa.K(av8Var, C2, f50Var6);
            if (z7) {
                av8Var.d0(-1876976122);
                utcVar = utcVar2;
                ff3Var = ff3Var2;
                ryVar2 = ryVar4;
                f50Var = f50Var6;
                f50Var2 = f50Var5;
                f50Var3 = f50Var4;
                c2 = 0;
                td4.N(n9e.q(bkh.c(utcVar, 1.0f), r13.e, jf9Var), 4.0f, lz.D(R.color.primary_default, av8Var), av8Var, 54, 0);
                av8Var.s(false);
            } else {
                ff3Var = ff3Var2;
                f50Var = f50Var6;
                f50Var2 = f50Var5;
                f50Var3 = f50Var4;
                ryVar2 = ryVar4;
                utcVar = utcVar2;
                c2 = 0;
                av8Var.d0(-1876698393);
                av8Var.s(false);
            }
            utc utcVar3 = utcVar;
            xtc p = bkh.p(l98.f0(utcVar3, z7 ? 12.0f : 18.0f, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 4), 32.0f);
            String valueOf2 = String.valueOf(slfVar.d);
            yf8 yf8Var = xth.a;
            dfj dfjVar = (dfj) xth.o.getValue();
            if (slfVar.e) {
                i4 = 909305799;
                i5 = R.color.success;
                z6 = false;
            } else {
                z6 = false;
                if (slfVar.f) {
                    i4 = 909307397;
                    i5 = R.color.error;
                } else {
                    i4 = 909308644;
                    i5 = R.color.n_lv_3;
                }
            }
            ff3 ff3Var3 = ff3Var;
            ry ryVar5 = ryVar2;
            zg3 zg3Var3 = zg3Var;
            f50 f50Var7 = f50Var2;
            udj.c(valueOf2, p, ljg.f(av8Var, i4, i5, av8Var, z6), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, dfjVar, av8Var, 0, 0, 130040);
            xtc l = bkh.l(l98.c0(utcVar3, 8.0f, 12.0f), 32.0f);
            k1c c4 = e12.c(mv1Var, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, l);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var3);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c4, f50Var3);
            waa.K(av8Var, m3, ff3Var3);
            bf3.s(hashCode3, av8Var, f50Var7, av8Var, ryVar5);
            waa.K(av8Var, C3, f50Var);
            mv1 mv1Var2 = uxf.f;
            n12 n12Var = n12.a;
            xtc l2 = bkh.l(n12Var.a(utcVar3, mv1Var2), 32.0f);
            n7g n7gVar = o7g.a;
            xtc A2 = wnn.A(l2, n7gVar);
            ht9 ht9Var = new ht9((Context) av8Var.k(ff5Var));
            vt9.e(ht9Var, R.drawable.player_photo_placeholder);
            vt9.a(ht9Var, R.drawable.player_photo_placeholder);
            st9.a(ht9Var, true);
            slfVar2 = slfVar;
            ht9Var.c = pco.z(slfVar2.a);
            wkn.k(uaa.w(ht9Var.a(), av8Var, 30), null, A2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 48, 120);
            if (num != null) {
                av8Var.d0(1397175615);
                xtc A3 = wnn.A(bkh.l(n12Var.a(utcVar3, uxf.k), 16.0f), n7gVar);
                f2 = 16.0f;
                wkn.k(haa.t(num.intValue(), 0, av8Var), null, A3, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 56, 120);
                av8Var.s(false);
            } else {
                f2 = 16.0f;
                av8Var.d0(1397514445);
                av8Var.s(false);
            }
            av8Var.s(true);
            udj.c(slfVar2.b, l98.c0(new goa(1.0f, true), 8.0f, 12.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, xth.m(), av8Var, 0, 24960, 110584);
            av8 av8Var2 = av8Var;
            Integer num3 = slfVar2.i;
            if (z) {
                if ((num3 != null ? num3.intValue() : 0) >= 3) {
                    num2 = num3;
                }
            }
            if (num2 == null) {
                av8Var2.d0(-1874394474);
                av8Var2.s(false);
                i6 = 6;
            } else {
                av8Var2.d0(-1874394473);
                int intValue = num2.intValue();
                xtc l3 = bkh.l(utcVar3, f2);
                i6 = 6;
                wkn.l(s6a.N(R.drawable.ic_weekly_streak, 6, av8Var2), l3, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 432, 120);
                udj.c(String.valueOf(intValue), l98.f0(utcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, xth.m(), av8Var2, 48, 24576, 114680);
                av8Var2 = av8Var2;
                Unit unit = Unit.a;
                av8Var2.s(false);
            }
            av8 av8Var3 = av8Var2;
            udj.c(yid.d("%.2f", Float.valueOf(slfVar2.c)), l98.f0(bkh.p(utcVar3, 72.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 8.0f, 12.0f, 1), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(i6), 0L, 0, false, 0, 0, null, xth.m(), av8Var3, 0, 0, 130040);
            av8Var = av8Var3;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            slfVar2 = slfVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nki(xtcVar, z, slfVar2, z2, z3, z4, i);
        }
    }

    public static final void m(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
        }
    }

    public static final void n(ha5 ha5Var, boolean z, long j, r13 r13Var, r13 r13Var2) {
        if (z) {
            ha5.U(ha5Var, r13Var.a, (njh.e(ha5Var.n()) / 2.0f) + ha5Var.H0(2.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        }
        ha5.U(ha5Var, j, ha5Var.H0(1.0f) + (njh.e(ha5Var.n()) / 2.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        ha5.U(ha5Var, r13Var2.a, njh.e(ha5Var.n()) / 2.0f, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    public static final int o(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long p(x6a x6aVar, x6a x6aVar2) {
        float min;
        int i = x6aVar2.a;
        int i2 = x6aVar2.d;
        int i3 = x6aVar2.a;
        int i4 = x6aVar2.c;
        int i5 = x6aVar2.b;
        int i6 = x6aVar.c;
        int i7 = x6aVar.b;
        int i8 = x6aVar.d;
        int i9 = x6aVar.a;
        float f2 = 1.0f;
        if (i < i6) {
            if (i4 <= i9) {
                min = 1.0f;
            } else if (x6aVar2.d() != 0) {
                min = (((Math.min(x6aVar.c, i4) + Math.max(i9, i3)) / 2) - i3) / x6aVar2.d();
            }
            if (i5 < i8) {
                if (i2 > i7) {
                    if (x6aVar2.b() != 0) {
                        f2 = (((Math.min(i8, i2) + Math.max(i7, i5)) / 2) - i5) / x6aVar2.b();
                    }
                }
                return uaa.h(min, f2);
            }
            f2 = 0.0f;
            return uaa.h(min, f2);
        }
        min = 0.0f;
        if (i5 < i8) {
        }
        f2 = 0.0f;
        return uaa.h(min, f2);
    }

    public static final boolean q(long j, oqf oqfVar) {
        float f2 = oqfVar.a;
        float f3 = oqfVar.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f2 > intBitsToFloat || intBitsToFloat > f3) {
            return false;
        }
        float f4 = oqfVar.b;
        float f5 = oqfVar.d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f4 <= intBitsToFloat2 && intBitsToFloat2 <= f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:11:0x0074). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0066 -> B:10:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(db2 db2Var, OutputStream outputStream, long j, sq3 sq3Var) {
        lml lmlVar;
        int i;
        db2 db2Var2;
        OutputStream outputStream2;
        lml lmlVar2;
        long j2;
        if (sq3Var instanceof lml) {
            lmlVar = (lml) sq3Var;
            int i2 = lmlVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lmlVar.v = i2 - Integer.MIN_VALUE;
                Object obj = lmlVar.u;
                lu3 lu3Var = lu3.a;
                i = lmlVar.v;
                Object obj2 = null;
                long j3 = 0;
                if (i != 0) {
                    y6a.M(obj);
                    if (j < 0) {
                        ogj.h(vxd.l(j, "Limit shouldn't be negative: "));
                        return null;
                    }
                    db2Var2 = db2Var;
                    outputStream2 = outputStream;
                    lmlVar2 = lmlVar;
                    j2 = 0;
                    if (db2Var2.h()) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j4 = lmlVar.t;
                    OutputStream outputStream3 = lmlVar.s;
                    db2 db2Var3 = lmlVar.r;
                    y6a.M(obj);
                    OutputStream outputStream4 = outputStream3;
                    lmlVar2 = lmlVar;
                    j2 = j4;
                    outputStream2 = outputStream4;
                    db2Var2 = db2Var3;
                    w52 f2 = db2Var2.f();
                    f2.getClass();
                    j2 += f2.c;
                    w52 f3 = db2Var2.f();
                    f3.getClass();
                    long j5 = f3.c;
                    outputStream2.getClass();
                    ww9.w(f3.c, j5);
                    while (j5 > j3) {
                        if (f3.w()) {
                            Object obj3 = obj2;
                            a70.p("Buffer is empty");
                            return obj3;
                        }
                        a1h a1hVar = f3.a;
                        a1hVar.getClass();
                        byte[] bArr = a1hVar.a;
                        int i3 = a1hVar.b;
                        Object obj4 = obj2;
                        int min = (int) Math.min(j5, a1hVar.c - i3);
                        outputStream2.write(bArr, i3, min);
                        long j6 = min;
                        j5 -= j6;
                        if (min != 0) {
                            if (min < 0) {
                                a70.r("Returned negative read bytes count");
                                return obj4;
                            }
                            if (min > a1hVar.a()) {
                                a70.r("Returned too many bytes");
                                return obj4;
                            }
                            f3.skip(j6);
                        }
                        obj2 = obj4;
                        j3 = 0;
                    }
                    if (db2Var2.h()) {
                        return new Long(j2);
                    }
                    if (db2Var2.f().w()) {
                        lmlVar2.r = db2Var2;
                        lmlVar2.s = outputStream2;
                        lmlVar2.t = j2;
                        lmlVar2.v = 1;
                        if (db2Var2.g(1, lmlVar2) == lu3Var) {
                            return lu3Var;
                        }
                        db2Var3 = db2Var2;
                        lml lmlVar3 = lmlVar2;
                        outputStream3 = outputStream2;
                        j4 = j2;
                        lmlVar = lmlVar3;
                        OutputStream outputStream42 = outputStream3;
                        lmlVar2 = lmlVar;
                        j2 = j4;
                        outputStream2 = outputStream42;
                        db2Var2 = db2Var3;
                    }
                    w52 f22 = db2Var2.f();
                    f22.getClass();
                    j2 += f22.c;
                    w52 f32 = db2Var2.f();
                    f32.getClass();
                    long j52 = f32.c;
                    outputStream2.getClass();
                    ww9.w(f32.c, j52);
                    while (j52 > j3) {
                    }
                    if (db2Var2.h()) {
                    }
                }
            }
        }
        lmlVar = new lml(sq3Var);
        Object obj5 = lmlVar.u;
        lu3 lu3Var2 = lu3.a;
        i = lmlVar.v;
        Object obj22 = null;
        long j32 = 0;
        if (i != 0) {
        }
    }

    public static udg s(jag jagVar) {
        boolean z;
        boolean z2;
        boolean z3;
        jagVar.getClass();
        rag ragVar = jagVar.b;
        rag ragVar2 = rag.INTERSTITIAL;
        if (ragVar != ragVar2) {
            pvd.n(ragVar2, ragVar);
            return null;
        }
        Integer num = jagVar.s;
        int intValue = num != null ? num.intValue() : -1;
        Integer num2 = jagVar.u;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        if (1 <= intValue && intValue < intValue2) {
            intValue2 = intValue;
        }
        Boolean bool = jagVar.t;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = jagVar.B;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Integer num3 = jagVar.C;
        if (num3 != null && num3.intValue() == 1) {
            boolean z4 = booleanValue2;
            z3 = false;
            z = booleanValue;
            z2 = z4;
        } else {
            z = booleanValue;
            z2 = booleanValue2;
            z3 = true;
        }
        return new udg(intValue, intValue2, z, z2, z3);
    }

    public static sxf[] t(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        sxf[] sxfVarArr = new sxf[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            Bundle bundle = bundleArr[i];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            sxfVarArr[i] = new sxf(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS), hashSet);
        }
        return sxfVarArr;
    }

    public static final oh0 u(View view) {
        view.getClass();
        return new oh0(new ftk(view, null), 3);
    }

    public static final int w(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int hashCode = (serialDescriptor.h().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int d2 = serialDescriptor.d();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(d2 > 0)) {
                break;
            }
            int i3 = d2 - 1;
            int i4 = i * 31;
            String h = serialDescriptor.g(serialDescriptor.d() - d2).h();
            if (h != null) {
                i2 = h.hashCode();
            }
            i = i4 + i2;
            d2 = i3;
        }
        int d3 = serialDescriptor.d();
        int i5 = 1;
        while (true) {
            if (!(d3 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = d3 - 1;
            int i7 = i5 * 31;
            mha kind = serialDescriptor.g(serialDescriptor.d() - d3).getKind();
            i5 = i7 + (kind != null ? kind.hashCode() : 0);
            d3 = i6;
        }
    }

    public abstract void A(Typeface typeface, boolean z);

    public abstract void B(boolean z);

    public abstract void C(boolean z);

    public abstract void D();

    public abstract void E(int i);

    public abstract oqf v();

    public abstract void x(int i);

    public abstract boolean y();

    public abstract void z(int i);
}
