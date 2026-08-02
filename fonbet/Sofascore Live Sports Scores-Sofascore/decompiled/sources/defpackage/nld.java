package defpackage;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Colors;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class nld {
    public static final mqi a;

    static {
        ypa.b(new ivc(29));
        a = ypa.b(new ild(0));
        new Colors("#017b5b", null, "#ffffff");
    }

    public static final void a(final long j, final long j2, final String str, final int i, final boolean z, final boolean z2, final Function0 function0, final boolean z3, final xtc xtcVar, ct8 ct8Var, of3 of3Var, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        av8 av8Var;
        final ct8 ct8Var2;
        av8 av8Var2;
        boolean z5;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1159474378);
        if ((i2 & 6) == 0) {
            i4 = (av8Var3.f(j) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var3.f(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var3.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var3.e(i) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            z4 = z;
            i4 |= av8Var3.h(z4) ? 16384 : 8192;
        } else {
            z4 = z;
        }
        if ((196608 & i2) == 0) {
            i4 |= av8Var3.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i4 |= av8Var3.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= av8Var3.h(z3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= av8Var3.g(xtcVar) ? 67108864 : 33554432;
        }
        int i7 = i3 & 512;
        if (i7 != 0) {
            i6 = i4 | 805306368;
        } else {
            if ((i2 & 805306368) == 0) {
                i5 = i4 | (av8Var3.i(ct8Var) ? 536870912 : 268435456);
            } else {
                i5 = i4;
            }
            i6 = i5;
        }
        if (av8Var3.T(i6 & 1, (i6 & 306783379) != 306783378)) {
            ct8 ct8Var3 = i7 != 0 ? null : ct8Var;
            n7g a2 = o7g.a(4.0f);
            av8Var3.d0(-1858326227);
            xtc g = bkh.g(yso.o(n9e.q(wnn.A(bkh.d(xtcVar, 1.0f), a2), j, oyn.e), 1.0f, j2, a2), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            if (z3) {
                long D = lz.D(R.color.n_lv_4, av8Var3);
                Object O = av8Var3.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = mz1.e(av8Var3);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var3.O();
                if (O2 == a99Var) {
                    O2 = jxa.p;
                    av8Var3.n0(O2);
                }
                p28 p28Var = new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var3, 48), 18);
                z5 = false;
                av8Var2 = av8Var3;
                g = g.z(tol.y(utc.a, true, true, true, D, wzcVar, p28Var, av8Var3, 0));
            } else {
                av8Var2 = av8Var3;
                z5 = false;
            }
            av8Var2.s(z5);
            xtc c0 = l98.c0(g, 8.0f, 4.0f);
            l8g a3 = k8g.a(ww9.f, uxf.m, av8Var2, 54);
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
            waa.K(av8Var2, a3, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            if (ct8Var3 == null) {
                av8Var2.d0(637374403);
            } else {
                av8Var2.d0(1544581118);
                ct8Var3.invoke(p8g.a, av8Var2, Integer.valueOf(((i6 >> 24) & 112) | 6));
            }
            av8Var2.s(false);
            av8 av8Var4 = av8Var2;
            e(i, (i6 >> 6) & 8190, av8Var4, str, z4, z2);
            av8Var = av8Var4;
            av8Var.s(true);
            ct8Var2 = ct8Var3;
        } else {
            av8Var = av8Var3;
            av8Var.W();
            ct8Var2 = ct8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: hld
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i2 | 1);
                    nld.a(j, j2, str, i, z, z2, function0, z3, xtcVar, ct8Var2, (of3) obj, K, i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final fgf fgfVar, final long j, final boolean z, final boolean z2, final Function1 function1, xtc xtcVar, final old oldVar, String str3, boolean z3, of3 of3Var, final int i, final int i2, final int i3) {
        int i4;
        String str4;
        boolean z4;
        xtc xtcVar2;
        int i5;
        int i6;
        av8 av8Var;
        final String str5;
        final boolean z5;
        final xtc xtcVar3;
        int i7;
        xtc xtcVar4;
        final boolean z6;
        fgfVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(492794906);
        if ((i & 6) == 0) {
            i4 = (av8Var2.g(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i4 |= av8Var2.g(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            i4 |= av8Var2.g(fgfVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= av8Var2.f(j) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            z4 = z;
            i4 |= av8Var2.h(z4) ? 16384 : 8192;
        } else {
            z4 = z;
        }
        if ((i & 196608) == 0) {
            i4 |= av8Var2.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i & 1572864) == 0) {
            i4 |= av8Var2.i(function1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i8 = i3 & 128;
        if (i8 != 0) {
            i4 |= 12582912;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            if ((i & 12582912) == 0) {
                i4 |= av8Var2.g(xtcVar2) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            i4 |= av8Var2.g(oldVar) ? 67108864 : 33554432;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= av8Var2.g(str3) ? 536870912 : 268435456;
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i6 = i2 | 6;
            i5 = i10;
        } else if ((i2 & 6) == 0) {
            i5 = i10;
            i6 = i2 | (av8Var2.h(z3) ? 4 : 2);
        } else {
            i5 = i10;
            i6 = i2;
        }
        if (av8Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            xtc xtcVar5 = i8 != 0 ? utc.a : xtcVar2;
            final String str6 = i9 != 0 ? null : str3;
            boolean z7 = i5 != 0 ? false : z3;
            final Context context = (Context) av8Var2.k(nz.b);
            xtc xtcVar6 = xtcVar5;
            final gv9 gv9Var = fgfVar.e;
            boolean g = ((i4 & 112) == 32) | av8Var2.g(gv9Var) | ((i4 & 1879048192) == 536870912) | av8Var2.i(context) | ((234881024 & i4) == 67108864) | ((i6 & 14) == 4) | ((57344 & i4) == 16384) | ((i4 & 896) == 256) | ((458752 & i4) == 131072) | ((i4 & 14) == 4) | ((i4 & 7168) == 2048) | ((3670016 & i4) == 1048576);
            Object O = av8Var2.O();
            if (g || O == nf3.a) {
                i7 = i4;
                xtcVar4 = xtcVar6;
                av8Var = av8Var2;
                z6 = z7;
                final String str7 = str4;
                final boolean z8 = z4;
                Function2 function2 = new Function2() { // from class: lld
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
                    
                        if (r5 == null) goto L27;
                     */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj, Object obj2) {
                        String str8;
                        float f;
                        String d;
                        yji yjiVar = (yji) obj;
                        an3 an3Var = (an3) obj2;
                        yjiVar.getClass();
                        final asf asfVar = new asf();
                        int e0 = yjiVar.e0(16.0f);
                        int e02 = yjiVar.e0(4.0f);
                        gv9 gv9Var2 = gv9.this;
                        int size = gv9Var2.size();
                        String str9 = str6;
                        int i11 = size + (str9 != null ? 1 : 0);
                        float h = i11 > 0 ? (an3.h(an3Var.a) - ((i11 - 1) * e02)) / i11 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        final ArrayList arrayList = new ArrayList();
                        final ArrayList arrayList2 = new ArrayList();
                        Iterator<E> it = gv9Var2.iterator();
                        int i12 = 0;
                        while (true) {
                            boolean hasNext = it.hasNext();
                            final old oldVar2 = oldVar;
                            final boolean z9 = z8;
                            final fgf fgfVar2 = fgfVar;
                            if (!hasNext) {
                                final gv9 gv9Var3 = gv9Var2;
                                final String str10 = str9;
                                final boolean z10 = z2;
                                final String str11 = str;
                                final long j2 = j;
                                final Function1 function12 = function1;
                                qhe J = ((g1c) CollectionsKt.Y(yjiVar.t("row", new tc3(-914739049, new Function2() { // from class: gld
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        av8 av8Var3;
                                        int i13;
                                        utc utcVar;
                                        dld dldVar;
                                        ArrayList arrayList3;
                                        int i14;
                                        int i15;
                                        boolean z11;
                                        int i16;
                                        int i17;
                                        boolean g2;
                                        Object O2;
                                        of3 of3Var2 = (of3) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        boolean z12 = true;
                                        boolean z13 = false;
                                        av8 av8Var4 = (av8) of3Var2;
                                        if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                            utc utcVar2 = utc.a;
                                            float f2 = 1.0f;
                                            xtc d2 = bkh.d(utcVar2, 1.0f);
                                            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var4, 54);
                                            int hashCode = Long.hashCode(av8Var4.T);
                                            aee m = av8Var4.m();
                                            xtc C = fqj.C(av8Var4, d2);
                                            if3.k7.getClass();
                                            zg3 zg3Var = hf3.b;
                                            av8Var4.h0();
                                            if (av8Var4.S) {
                                                av8Var4.l(zg3Var);
                                            } else {
                                                av8Var4.q0();
                                            }
                                            waa.K(av8Var4, a2, hf3.g);
                                            waa.K(av8Var4, m, hf3.f);
                                            waa.K(av8Var4, Integer.valueOf(hashCode), hf3.j);
                                            waa.J(av8Var4, hf3.k);
                                            waa.K(av8Var4, C, hf3.d);
                                            float f3 = Float.MAX_VALUE;
                                            String str12 = str10;
                                            if (str12 != null) {
                                                av8Var4.d0(-109785726);
                                                if (1.0f <= 0.0d) {
                                                    p3a.a("invalid weight; must be greater than zero");
                                                }
                                                xtc O3 = kda.O(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "choice", av8Var4);
                                                yf8 yf8Var = xth.a;
                                                dfj b = xth.b();
                                                long D = lz.D(R.color.n_lv_3, av8Var4);
                                                p7j p7jVar = new p7j(3);
                                                i13 = R.color.n_lv_3;
                                                udj.c(str12, O3, D, null, 0L, null, 0L, null, p7jVar, 0L, 2, false, 3, 0, null, b, av8Var4, 0, 24960, 109560);
                                                av8Var3 = av8Var4;
                                                av8Var3.s(false);
                                            } else {
                                                av8Var3 = av8Var4;
                                                i13 = R.color.n_lv_3;
                                                av8Var3.d0(-109324849);
                                                av8Var3.s(false);
                                            }
                                            av8Var3.d0(-973354428);
                                            int i18 = 0;
                                            for (Object obj5 : gv9Var3) {
                                                int i19 = i18 + 1;
                                                if (i18 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                dld dldVar2 = (dld) obj5;
                                                if (f2 <= 0.0d) {
                                                    p3a.a("invalid weight; must be greater than zero");
                                                }
                                                goa goaVar = new goa(f2 > f3 ? f3 : f2, z12);
                                                u23 a3 = t23.a(ww9.d, uxf.p, av8Var3, 48);
                                                int hashCode2 = Long.hashCode(av8Var3.T);
                                                aee m2 = av8Var3.m();
                                                xtc C2 = fqj.C(av8Var3, goaVar);
                                                if3.k7.getClass();
                                                zg3 zg3Var2 = hf3.b;
                                                av8Var3.h0();
                                                if (av8Var3.S) {
                                                    av8Var3.l(zg3Var2);
                                                } else {
                                                    av8Var3.q0();
                                                }
                                                waa.K(av8Var3, a3, hf3.g);
                                                waa.K(av8Var3, m2, hf3.f);
                                                waa.K(av8Var3, Integer.valueOf(hashCode2), hf3.j);
                                                waa.J(av8Var3, hf3.k);
                                                waa.K(av8Var3, C2, hf3.d);
                                                asf asfVar2 = asfVar;
                                                boolean z14 = asfVar2.a;
                                                ArrayList arrayList4 = arrayList;
                                                if (z14) {
                                                    av8Var3.d0(-1021834621);
                                                    String str13 = (String) arrayList4.get(i18);
                                                    if (str13 == null) {
                                                        av8Var3.d0(-1612102178);
                                                        av8Var3.s(z13);
                                                        utcVar = utcVar2;
                                                        dldVar = dldVar2;
                                                        arrayList3 = arrayList4;
                                                        i14 = i18;
                                                        i15 = i19;
                                                    } else {
                                                        av8Var3.d0(-1612102177);
                                                        utc utcVar3 = utcVar2;
                                                        dldVar = dldVar2;
                                                        arrayList3 = arrayList4;
                                                        xtc f0 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 7);
                                                        yf8 yf8Var2 = xth.a;
                                                        dfj b2 = xth.b();
                                                        long D2 = lz.D(i13, av8Var3);
                                                        av8 av8Var5 = av8Var3;
                                                        i15 = i19;
                                                        i14 = i18;
                                                        utcVar = utcVar3;
                                                        udj.c(str13, f0, D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var5, 48, 24960, 110584);
                                                        av8Var3 = av8Var5;
                                                        Unit unit = Unit.a;
                                                        av8Var3.s(z13);
                                                    }
                                                    av8Var3.s(z13);
                                                } else {
                                                    utcVar = utcVar2;
                                                    dldVar = dldVar2;
                                                    arrayList3 = arrayList4;
                                                    i14 = i18;
                                                    i15 = i19;
                                                    av8Var3.d0(-1611598768);
                                                    av8Var3.s(z13);
                                                }
                                                utc utcVar4 = utcVar;
                                                xtc O4 = kda.O(utcVar4, "odds_" + i15, av8Var3);
                                                if (z10 && dldVar.d != null) {
                                                    old oldVar3 = oldVar2;
                                                    if (Intrinsics.c(oldVar3 != null ? Boolean.valueOf(oldVar3.c) : null, Boolean.TRUE)) {
                                                        z11 = true;
                                                        if (Intrinsics.c(str11, StatusKt.STATUS_FINISHED) || !dldVar.a) {
                                                            i16 = -1021799877;
                                                            i17 = R.color.n_lv_5;
                                                        } else {
                                                            i16 = -1021800667;
                                                            i17 = R.color.primary_default;
                                                        }
                                                        long f4 = ljg.f(av8Var3, i16, i17, av8Var3, z13);
                                                        String str14 = (String) arrayList2.get(i14);
                                                        int i20 = dldVar.c;
                                                        boolean z15 = fgfVar2.d;
                                                        Function1 function13 = function12;
                                                        g2 = av8Var3.g(function13) | av8Var3.g(dldVar);
                                                        O2 = av8Var3.O();
                                                        if (!g2 || O2 == nf3.a) {
                                                            O2 = new fld(function13, dldVar, 1);
                                                            av8Var3.n0(O2);
                                                        }
                                                        av8 av8Var6 = av8Var3;
                                                        nld.a(j2, f4, str14, i20, z9, z15, (Function0) O2, z11, O4, yqo.H(342800633, av8Var3, new w54(asfVar2, arrayList3, i14)), av8Var6, 805306368, 0);
                                                        av8Var3 = av8Var6;
                                                        av8Var3.s(true);
                                                        i18 = i15;
                                                        z12 = true;
                                                        utcVar2 = utcVar4;
                                                        i13 = R.color.n_lv_3;
                                                        f2 = 1.0f;
                                                        f3 = Float.MAX_VALUE;
                                                        z13 = false;
                                                    }
                                                }
                                                z11 = z13;
                                                if (Intrinsics.c(str11, StatusKt.STATUS_FINISHED)) {
                                                }
                                                i16 = -1021799877;
                                                i17 = R.color.n_lv_5;
                                                long f42 = ljg.f(av8Var3, i16, i17, av8Var3, z13);
                                                String str142 = (String) arrayList2.get(i14);
                                                int i202 = dldVar.c;
                                                boolean z152 = fgfVar2.d;
                                                Function1 function132 = function12;
                                                g2 = av8Var3.g(function132) | av8Var3.g(dldVar);
                                                O2 = av8Var3.O();
                                                if (!g2) {
                                                }
                                                O2 = new fld(function132, dldVar, 1);
                                                av8Var3.n0(O2);
                                                av8 av8Var62 = av8Var3;
                                                nld.a(j2, f42, str142, i202, z9, z152, (Function0) O2, z11, O4, yqo.H(342800633, av8Var3, new w54(asfVar2, arrayList3, i14)), av8Var62, 805306368, 0);
                                                av8Var3 = av8Var62;
                                                av8Var3.s(true);
                                                i18 = i15;
                                                z12 = true;
                                                utcVar2 = utcVar4;
                                                i13 = R.color.n_lv_3;
                                                f2 = 1.0f;
                                                f3 = Float.MAX_VALUE;
                                                z13 = false;
                                            }
                                            av8Var3.s(z13);
                                            av8Var3.s(z12);
                                        } else {
                                            av8Var4.W();
                                        }
                                        return Unit.a;
                                    }
                                }, true)))).J(an3Var.a);
                                return m1c.G0(yjiVar, J.a, J.b, new b3(J, 12));
                            }
                            Object next = it.next();
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                b.q();
                                throw null;
                            }
                            dld dldVar = (dld) next;
                            gv9 gv9Var4 = gv9Var2;
                            r9k r9kVar = dldVar.b;
                            String str12 = str9;
                            Context context2 = context;
                            arrayList.add(rld.n(context2, r9kVar != null ? r9kVar.b(context2) : null, str7));
                            String str13 = dldVar.d;
                            if (str13 != null) {
                                if (oldVar2 != null && (d = rld.d(str13, oldVar2.d)) != null) {
                                    str13 = d;
                                }
                                str8 = rld.m(context2, str13);
                            }
                            str8 = "-";
                            arrayList2.add(str8);
                            if (z6) {
                                asfVar.a = true;
                                f = h;
                            } else {
                                g1c g1cVar = (g1c) CollectionsKt.Y(yjiVar.t(ljg.j(i12, "oddsValue_"), new tc3(333696229, new s73(arrayList2, i12, dldVar, z9, fgfVar2), true)));
                                f = h;
                                qhe J2 = g1cVar.J(cn3.b(0, 0, 0, 0, 15));
                                if (wt3.B(((String) arrayList.get(i12)) != null ? ((g1c) CollectionsKt.Y(yjiVar.t(ljg.j(i12, "oddsLabel_"), new tc3(-1169723875, new tk1(r9, 9), true)))).J(cn3.b(0, 0, 0, 0, 15)).a : 0, J2.a, e0, e02) > f) {
                                    asfVar.a = true;
                                }
                            }
                            h = f;
                            i12 = i13;
                            gv9Var2 = gv9Var4;
                            str9 = str12;
                        }
                    }
                };
                av8Var.n0(function2);
                O = function2;
            } else {
                i7 = i4;
                xtcVar4 = xtcVar6;
                av8Var = av8Var2;
                z6 = z7;
            }
            rz8.r(xtcVar4, (Function2) O, av8Var, (i7 >> 21) & 14, 0);
            str5 = str6;
            z5 = z6;
            xtcVar3 = xtcVar4;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            str5 = str3;
            z5 = z3;
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: mld
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i | 1);
                    int K2 = aba.K(i2);
                    nld.b(str, str2, fgfVar, j, z, z2, function1, xtcVar3, oldVar, str5, z5, (of3) obj, K, K2, i3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        if (r14 == null) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, fgf fgfVar, long j, Function1 function1, xtc xtcVar, old oldVar, of3 of3Var, int i) {
        av8 av8Var;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean g;
        Object O;
        boolean z3;
        String str4 = str;
        fgfVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-2030897854);
        long j2 = j;
        int i4 = i | (av8Var2.g(str4) ? 4 : 2) | (av8Var2.g(fgfVar) ? 32 : 16) | (av8Var2.f(j2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(oldVar) ? 8388608 : 4194304);
        if (av8Var2.T(i4 & 1, (4793491 & i4) != 4793490)) {
            Context context = (Context) av8Var2.k(nz.b);
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar);
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
            av8Var2.d0(1895798452);
            int i5 = 0;
            for (Object obj : fgfVar.e) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                dld dldVar = (dld) obj;
                String str5 = dldVar.d;
                boolean g2 = av8Var2.g(oldVar != null ? oldVar.d : null) | av8Var2.g(str5);
                Object O2 = av8Var2.O();
                a99 a99Var = nf3.a;
                if (g2 || O2 == a99Var) {
                    if (str5 != null) {
                        if (oldVar == null || (str3 = rld.d(str5, oldVar.d)) == null) {
                            str3 = str5;
                        }
                        str2 = rld.m(context, str3);
                    }
                    str2 = "-";
                    O2 = str2;
                    av8Var2.n0(O2);
                }
                String str6 = (String) O2;
                int i7 = i4;
                Context context2 = context;
                xtc O3 = kda.O(new goa(1.0f, true), "odds_" + i6, av8Var2);
                if (str5 != null) {
                    if (Intrinsics.c(oldVar != null ? Boolean.valueOf(oldVar.c) : null, Boolean.TRUE)) {
                        z = true;
                        if (Intrinsics.c(str4, StatusKt.STATUS_FINISHED) || !dldVar.a) {
                            z2 = false;
                            i2 = 1824662278;
                            i3 = R.color.n_lv_5;
                        } else {
                            i2 = 1824661488;
                            i3 = R.color.primary_default;
                            z2 = false;
                        }
                        long f = ljg.f(av8Var2, i2, i3, av8Var2, z2);
                        int i8 = dldVar.c;
                        boolean z4 = fgfVar.d;
                        g = ((i7 & 458752) != 131072) | av8Var2.g(dldVar);
                        O = av8Var2.O();
                        if (!g || O == a99Var) {
                            z3 = false;
                            O = new fld(function1, dldVar, 0);
                            av8Var2.n0(O);
                        } else {
                            z3 = false;
                        }
                        av8 av8Var3 = av8Var2;
                        a(j2, f, str6, i8, false, z4, (Function0) O, z, O3, null, av8Var3, ((i7 >> 6) & 14) | 24576, 512);
                        str4 = str;
                        j2 = j;
                        i5 = i6;
                        av8Var2 = av8Var3;
                        i4 = i7;
                        context = context2;
                    }
                }
                z = false;
                if (Intrinsics.c(str4, StatusKt.STATUS_FINISHED)) {
                }
                z2 = false;
                i2 = 1824662278;
                i3 = R.color.n_lv_5;
                long f2 = ljg.f(av8Var2, i2, i3, av8Var2, z2);
                int i82 = dldVar.c;
                boolean z42 = fgfVar.d;
                g = ((i7 & 458752) != 131072) | av8Var2.g(dldVar);
                O = av8Var2.O();
                if (g) {
                }
                z3 = false;
                O = new fld(function1, dldVar, 0);
                av8Var2.n0(O);
                av8 av8Var32 = av8Var2;
                a(j2, f2, str6, i82, false, z42, (Function0) O, z, O3, null, av8Var32, ((i7 >> 6) & 14) | 24576, 512);
                str4 = str;
                j2 = j;
                i5 = i6;
                av8Var2 = av8Var32;
                i4 = i7;
                context = context2;
            }
            av8Var = av8Var2;
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vka(str, fgfVar, j, function1, xtcVar, oldVar, i);
        }
    }

    public static final void d(final int i, final String str, final String str2, final old oldVar, final fgf fgfVar, final vmd vmdVar, final String str3, xtc xtcVar, long j, boolean z, cgf cgfVar, boolean z2, boolean z3, String str4, String str5, of3 of3Var, final int i2, final int i3, final int i4) {
        int i5;
        String str6;
        xtc xtcVar2;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final long j2;
        final boolean z5;
        final boolean z6;
        final String str7;
        final boolean z7;
        final xtc xtcVar3;
        av8 av8Var;
        final cgf cgfVar2;
        final String str8;
        int i11;
        String str9;
        String str10;
        cgf cgfVar3;
        boolean z8;
        long j3;
        boolean z9;
        boolean z10;
        String str11;
        oldVar.getClass();
        fgfVar.getClass();
        vmdVar.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-679075585);
        if ((i2 & 6) == 0) {
            i5 = (av8Var2.e(i) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str6 = str2;
            i5 |= av8Var2.g(str6) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            str6 = str2;
        }
        if ((i2 & 3072) == 0) {
            i5 |= av8Var2.g(oldVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= av8Var2.g(fgfVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= av8Var2.e(vmdVar.ordinal()) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i5 |= av8Var2.g(str3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i12 = i4 & 128;
        if (i12 != 0) {
            i5 |= 12582912;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            if ((i2 & 12582912) == 0) {
                i5 |= av8Var2.g(xtcVar2) ? 8388608 : 4194304;
            }
        }
        if ((i2 & 100663296) == 0) {
            i5 |= 33554432;
        }
        int i13 = i4 & 512;
        if (i13 != 0) {
            i5 |= 805306368;
            z4 = z;
        } else {
            z4 = z;
            if ((i2 & 805306368) == 0) {
                i5 |= av8Var2.h(z4) ? 536870912 : 268435456;
            }
        }
        int i14 = i4 & 1024;
        if (i14 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (av8Var2.e(cgfVar == null ? -1 : cgfVar.ordinal()) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i15 = i4 & a.o;
        if (i15 != 0) {
            i6 |= 48;
            i7 = i15;
        } else if ((i3 & 48) == 0) {
            i7 = i15;
            i6 |= av8Var2.h(z2) ? 32 : 16;
        } else {
            i7 = i15;
        }
        int i16 = i6;
        int i17 = i4 & 4096;
        if (i17 != 0) {
            i8 = i16 | 384;
        } else {
            int i18 = i16;
            if ((i3 & 384) == 0) {
                i18 |= av8Var2.h(z3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            i8 = i18;
        }
        int i19 = i4 & 8192;
        if (i19 != 0) {
            i9 = i8 | 3072;
        } else {
            int i20 = i8;
            if ((i3 & 3072) == 0) {
                i20 |= av8Var2.g(str4) ? a.o : 1024;
            }
            i9 = i20;
        }
        int i21 = i4 & 16384;
        if (i21 != 0) {
            i10 = i9 | 24576;
        } else {
            int i22 = i9;
            if ((i3 & 24576) == 0) {
                i10 = i22 | (av8Var2.g(str5) ? 16384 : 8192);
            } else {
                i10 = i22;
            }
        }
        if (av8Var2.T(i5 & 1, ((i5 & 306783379) == 306783378 && (i10 & 9363) == 9362) ? false : true)) {
            av8Var2.Y();
            int i23 = i2 & 1;
            utc utcVar = utc.a;
            if (i23 == 0 || av8Var2.B()) {
                if (i12 != 0) {
                    xtcVar2 = utcVar;
                }
                long D = lz.D(R.color.surface_1, av8Var2);
                i11 = i5 & (-234881025);
                if (i13 != 0) {
                    z4 = true;
                }
                cgf cgfVar4 = i14 != 0 ? cgf.b : cgfVar;
                boolean z11 = i7 != 0 ? true : z2;
                boolean z12 = i17 != 0 ? false : z3;
                str9 = i19 != 0 ? null : str4;
                if (i21 != 0) {
                    cgfVar3 = cgfVar4;
                    z8 = z11;
                    z6 = z12;
                    str10 = null;
                } else {
                    str10 = str5;
                    cgfVar3 = cgfVar4;
                    z8 = z11;
                    z6 = z12;
                }
                j3 = D;
            } else {
                av8Var2.W();
                i11 = i5 & (-234881025);
                j3 = j;
                cgfVar3 = cgfVar;
                z8 = z2;
                z6 = z3;
                str9 = str4;
                str10 = str5;
            }
            int i24 = i11;
            xtc xtcVar4 = xtcVar2;
            av8Var2.t();
            final Context context = (Context) av8Var2.k(nz.b);
            xtc O = kda.O(l98.d0(bkh.d(xtcVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), "odds_container", av8Var2);
            l8g a2 = k8g.a(ww9.b, uxf.n, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, O);
            if3.k7.getClass();
            long j4 = j3;
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
            int ordinal = cgfVar3.ordinal();
            if (ordinal != 0) {
                z9 = true;
                if (ordinal == 1) {
                    av8Var2.d0(-652960545);
                    av8Var2.s(false);
                    Unit unit = Unit.a;
                    z10 = false;
                } else {
                    if (ordinal != 2) {
                        throw dmi.h(av8Var2, -652982421, false);
                    }
                    ljg.r(56.0f, 1232943647, av8Var2, av8Var2, utcVar);
                    z10 = false;
                    av8Var2.s(false);
                    Unit unit2 = Unit.a;
                }
            } else {
                z9 = true;
                av8Var2.d0(1232444950);
                f(oldVar, vmdVar, str9, str3, Integer.valueOf(i), null, false, av8Var2, ((i24 >> 9) & 14) | 384 | ((i24 >> 12) & 112) | (i10 & 7168) | ((i24 >> 6) & 57344) | ((i24 << 15) & 458752), PsExtractor.AUDIO_STREAM);
                z10 = false;
                bf3.u(utcVar, 8.0f, av8Var2, false);
                Unit unit3 = Unit.a;
            }
            boolean i25 = ((i24 & 57344) == 16384 ? z9 : false) | av8Var2.i(context) | ((i10 & 7168) == 2048 ? z9 : z10) | ((i24 & 7168) == 2048 ? z9 : false) | ((3670016 & i24) == 1048576 ? z9 : false) | ((i24 & 14) == 4 ? z9 : false) | ((i24 & 458752) == 131072 ? z9 : false);
            Object O2 = av8Var2.O();
            if (i25 || O2 == nf3.a) {
                final String str12 = str9;
                O2 = new Function1() { // from class: jld
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str13 = (String) obj;
                        Context context2 = context;
                        String str14 = str12;
                        if (str14 == null) {
                            r9k r9kVar = fgfVar.b;
                            str14 = r9kVar != null ? r9kVar.b(context2) : null;
                        }
                        old oldVar2 = oldVar;
                        nv.b0(context2, str14, oldVar2.a.c, str3, Integer.valueOf(i), vmdVar, "odds_value", oldVar2.f);
                        bea.G(context2, str13);
                        return Unit.a;
                    }
                };
                str11 = str12;
                av8Var2.n0(O2);
            } else {
                str11 = str9;
            }
            b(str, str6, fgfVar, j4, z4, z8, (Function1) O2, null, oldVar, str10, z6, av8Var2, (458752 & (i10 << 12)) | ((i24 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i24 >> 6) & 896) | (57344 & (i24 >> 15)) | ((i24 << 15) & 234881024) | ((i10 << 15) & 1879048192), (i10 >> 6) & 14, 128);
            av8Var2.s(z9);
            z7 = z4;
            str7 = str10;
            av8Var = av8Var2;
            cgfVar2 = cgfVar3;
            xtcVar3 = xtcVar4;
            str8 = str11;
            z5 = z8;
            j2 = j4;
        } else {
            av8Var2.W();
            j2 = j;
            z5 = z2;
            z6 = z3;
            str7 = str5;
            z7 = z4;
            xtcVar3 = xtcVar2;
            av8Var = av8Var2;
            cgfVar2 = cgfVar;
            str8 = str4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: kld
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i2 | 1);
                    int K2 = aba.K(i3);
                    nld.d(i, str, str2, oldVar, fgfVar, vmdVar, str3, xtcVar3, j2, z7, cgfVar2, z5, z6, str8, str7, (of3) obj, K, K2, i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i, int i2, of3 of3Var, String str, boolean z, boolean z2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-952401716);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.h(z2) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc O = kda.O(utcVar, "odds_item_value", av8Var);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, O);
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
            yf8 yf8Var = xth.a;
            udj.c(str, null, z2 ? ljg.f(av8Var, 416161298, R.color.value, av8Var, false) : ljg.f(av8Var, 416161809, R.color.n_lv_1, av8Var, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, i3 & 14, 0, 131066);
            av8Var = av8Var;
            if (!z || i == 0) {
                av8Var.d0(16630746);
                av8Var.s(false);
            } else {
                av8Var.d0(16237387);
                wkn.l(s6a.N(R.drawable.ic_position_arrow_up_8, 6, av8Var), haa.v(l98.f0(utcVar, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), i > 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 180.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(i > 0 ? ljg.f(av8Var, 416175444, R.color.success, av8Var, false) : ljg.f(av8Var, 416176017, R.color.live, av8Var, false), 5), av8Var, 48, 56);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s94(str, i, z, z2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(old oldVar, vmd vmdVar, String str, String str2, Integer num, xtc xtcVar, boolean z, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        av8 av8Var;
        boolean z2;
        xtc xtcVar3;
        eqf u;
        utc utcVar;
        r13 r13Var;
        Object f;
        long j;
        av8 av8Var2;
        xtc xtcVar4;
        boolean z3;
        xtc xtcVar5;
        oldVar.getClass();
        yld yldVar = oldVar.a;
        vmdVar.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-804702596);
        if ((i & 6) == 0) {
            i3 = (av8Var3.g(oldVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var3.e(vmdVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var3.g("provider_logo") ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var3.g(str) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var3.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= av8Var3.g(num) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var3.g(xtcVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                i3 |= av8Var3.h(z) ? 8388608 : 4194304;
                if (av8Var3.T(i3 & 1, (4793491 & i3) != 4793490)) {
                    utc utcVar2 = utc.a;
                    xtc xtcVar6 = i5 != 0 ? utcVar2 : xtcVar2;
                    boolean z4 = i4 != 0 ? true : z;
                    Context context = (Context) av8Var3.k(nz.b);
                    Colors colors = yldVar.b;
                    String primary = colors != null ? colors.getPrimary() : null;
                    boolean g = av8Var3.g(primary);
                    Object O = av8Var3.O();
                    a99 a99Var = nf3.a;
                    if (g || O == a99Var) {
                        if (primary != null) {
                            utcVar = utcVar2;
                            r13Var = new r13(hkg.b(Color.parseColor(primary)));
                        } else {
                            utcVar = utcVar2;
                            r13Var = null;
                        }
                        f = e.f(r13Var);
                        av8Var3.n0(f);
                    } else {
                        f = O;
                        utcVar = utcVar2;
                    }
                    n7g a2 = o7g.a(4.0f);
                    av8Var3.d0(-225055154);
                    xtc e = bkh.e(bkh.p(xtcVar6, 48.0f), 24.0f);
                    r13 r13Var2 = (r13) ((e1d) f).getValue();
                    if (r13Var2 == null) {
                        j = ljg.f(av8Var3, -225059127, R.color.surface_1, av8Var3, false);
                    } else {
                        av8Var3.d0(-225059623);
                        av8Var3.s(false);
                        j = r13Var2.a;
                    }
                    xtc O2 = kda.O(wnn.A(n9e.q(e, j, a2), a2), "odds_logo", av8Var3);
                    if (z4) {
                        long D = lz.D(R.color.n_lv_4, av8Var3);
                        Object O3 = av8Var3.O();
                        if (O3 == a99Var) {
                            O3 = mz1.e(av8Var3);
                        }
                        wzc wzcVar = (wzc) O3;
                        Object[] objArr = new Object[0];
                        Object O4 = av8Var3.O();
                        if (O4 == a99Var) {
                            O4 = jxa.q;
                            av8Var3.n0(O4);
                        }
                        z3 = false;
                        xtcVar4 = xtcVar6;
                        av8Var2 = av8Var3;
                        xtcVar5 = O2.z(tol.y(utcVar, true, true, true, D, wzcVar, new kd7((boh) o3a.N(objArr, (Function0) O4, av8Var3, 48), context, str, oldVar, str2, num, vmdVar), av8Var3, 0));
                    } else {
                        av8Var2 = av8Var3;
                        xtcVar4 = xtcVar6;
                        z3 = false;
                        xtcVar5 = O2;
                    }
                    av8Var2.s(z3);
                    haa.a(vxd.j(yldVar.a, pco.F(), "odds/provider/", "/logo"), null, xtcVar5, null, null, av8Var2, 48, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                    av8Var = av8Var2;
                    z2 = z4;
                    xtcVar3 = xtcVar4;
                } else {
                    av8Var = av8Var3;
                    av8Var.W();
                    z2 = z;
                    xtcVar3 = xtcVar2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new x72(oldVar, vmdVar, str, str2, num, xtcVar3, z2, i, i2);
                    return;
                }
                return;
            }
            if (av8Var3.T(i3 & 1, (4793491 & i3) != 4793490)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        if (av8Var3.T(i3 & 1, (4793491 & i3) != 4793490)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }
}
