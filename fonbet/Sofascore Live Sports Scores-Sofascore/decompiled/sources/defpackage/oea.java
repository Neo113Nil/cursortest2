package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.facebook.AccessToken;
import com.facebook.d0;
import com.facebook.w;
import com.ironsource.L6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.internal.publisher.h0;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class oea {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static int f = 2;

    public static final void A(yk5 yk5Var) {
        s84 s84Var = s84.D;
        Iterator it = yk5Var.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            mk5 mk5Var = (mk5) s84Var.invoke((mk5) next);
            yk5Var.c.set(i, mk5Var);
            if (mk5Var instanceof yk5) {
                A((yk5) mk5Var);
            }
            i = i2;
        }
    }

    public static final LinkedHashMap B(yk5 yk5Var) {
        ArrayList arrayList = yk5Var.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            mk5 mk5Var = (mk5) next;
            vy8 b2 = mk5Var.b();
            Pair pair = b2.c(s84.B) ? (Pair) b2.a(new Pair(null, ty8.a), ff3.F) : new Pair(null, b2);
            ic icVar = (ic) pair.a;
            vy8 vy8Var = (vy8) pair.b;
            za zaVar = icVar != null ? icVar.a : null;
            Pair pair2 = zaVar instanceof yka ? new Pair(zaVar, vy8Var) : new Pair(null, vy8Var);
            if (mk5Var instanceof yk5) {
                for (Map.Entry entry : B((yk5) mk5Var).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = wv8.n(linkedHashMap, str);
                    }
                    ((List) obj).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    public static final int C(csa csaVar) {
        List list = csaVar.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((dsa) list.get(i2)).p;
        }
        return (i / list.size()) + csaVar.q;
    }

    public static int D(int i) {
        if (i < 3) {
            kda.Z(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static final void a(xtc xtcVar, mea meaVar, int i, int i2, boolean z, Function0 function0, Function1 function1, of3 of3Var, int i3) {
        av8 av8Var;
        int i4;
        boolean z2;
        function0.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-232856521);
        int i5 = i3 | (av8Var2.g(xtcVar) ? 4 : 2) | (av8Var2.e(meaVar == null ? -1 : meaVar.ordinal()) ? 32 : 16) | (av8Var2.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.e(i2) ? a.o : 1024) | (av8Var2.h(z) ? 16384 : 8192) | (av8Var2.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i6 = 0;
        if (av8Var2.T(i5 & 1, (599187 & i5) != 599186)) {
            mea meaVar2 = mea.a;
            a99 a99Var = nf3.a;
            rq3 rq3Var = null;
            if (meaVar == meaVar2) {
                av8Var2.d0(-656053513);
                av8Var2.s(false);
                i4 = i5;
                z2 = true;
            } else {
                av8Var2.d0(-656024404);
                boolean z3 = (458752 & i5) == 131072;
                Object O = av8Var2.O();
                if (z3 || O == a99Var) {
                    O = new nea(function0, rq3Var, i6);
                    av8Var2.n0(O);
                }
                hz8.o(av8Var2, meaVar, (Function2) O);
                av8Var2.s(false);
                i4 = i5;
                z2 = z;
            }
            xtc c0 = l98.c0(n9e.q(bkh.d(l98.b0(xtcVar, 16.0f), 1.0f), lz.D(R.color.surface_P, av8Var2), o7g.a(8.0f)), 16.0f, 24.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
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
            String v = v(i, av8Var2);
            yf8 yf8Var = xth.a;
            boolean z4 = false;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 0, 0, 131066);
            utc utcVar = utc.a;
            udj.c(v(i2, av8Var2), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var2, 48, 0, 131064);
            av8Var = av8Var2;
            qea.c(0, 1, av8Var, null);
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            boolean z5 = (3670016 & i4) == 1048576;
            if ((i4 & 112) == 32) {
                z4 = true;
            }
            boolean z6 = z4 | z5;
            Object O2 = av8Var.O();
            if (z6 || O2 == a99Var) {
                O2 = new ij8(19, function1, meaVar);
                av8Var.n0(O2);
            }
            pea.e(f0, z2, meaVar, (Function0) O2, av8Var, ((i4 << 3) & 896) | 6);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ci(xtcVar, meaVar, i, i2, z, function0, function1, i3);
        }
    }

    public static final void b(final String str, final d7e d7eVar, final Function0 function0, final xtc xtcVar, float f2, final long j, of3 of3Var, final int i) {
        final float f3;
        float f4;
        str.getClass();
        d7eVar.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1084255816);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.i(d7eVar) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128) | 24576 | (av8Var.f(j) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                f4 = 16.0f;
            } else {
                av8Var.W();
                f4 = f2;
            }
            av8Var.t();
            lv1 lv1Var = uxf.m;
            xtc d2 = bkh.d(xtcVar, 1.0f);
            boolean z = (i2 & 896) == 256;
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new ve7(21, function0);
                av8Var.n0(O);
            }
            float f5 = f4;
            xtc d0 = l98.d0(l98.d0(tol.y(d2, false, false, false, 0L, null, (Function0) O, av8Var, 31), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1), f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            utc utcVar = utc.a;
            kq9.a(d7eVar, null, bkh.l(utcVar, 24.0f), j, av8Var, ((i2 >> 3) & 14) | 440 | ((i2 >> 6) & 7168), 0);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, null, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, (i2 & 14) | ((i2 >> 9) & 896), 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            f3 = f5;
        } else {
            av8Var.W();
            f3 = f2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(str, d7eVar, function0, xtcVar, f3, j, i) { // from class: ffc
                public final /* synthetic */ String a;
                public final /* synthetic */ d7e b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ xtc d;
                public final /* synthetic */ float e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(3137);
                    oea.b(this.a, this.b, this.c, this.d, this.e, this.f, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(String str, boolean z, boolean z2, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-5396081);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            cdi b2 = a60.b(z2 ? 180.0f : 0.0f, null, "arrow_rotation_animation", av8Var, 3072, 22);
            utc utcVar = utc.a;
            xtc g = bkh.g(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a2 = k8g.a(ww9.h, uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g);
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
            long f2 = z ? ljg.f(av8Var, -39735500, R.color.live, av8Var, false) : ljg.f(av8Var, -39735020, R.color.n_lv_1, av8Var, false);
            yf8 yf8Var = xth.a;
            udj.c(str, null, f2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, i2 & 14, 0, 131066);
            kq9.b(s6a.N(R.drawable.ic_chevron_down, 6, av8Var), null, haa.v(bkh.l(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 24.0f), ((Number) b2.getValue()).floatValue()), lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xt6(str, z, z2, xtcVar2, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if ((r48 & 32) != 0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, Function1 function1, xtc xtcVar, boolean z, int i, long j, of3 of3Var, int i2, int i3) {
        xtc xtcVar2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        long j2;
        int i7;
        int i8;
        av8 av8Var;
        xtc xtcVar3;
        boolean z3;
        int i9;
        long j3;
        eqf u;
        long j4;
        boolean z4;
        long f2;
        str.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-900657960);
        int i10 = (av8Var2.g(str) ? 4 : 2) | i2 | (av8Var2.i(function1) ? 32 : 16);
        int i11 = i3 & 4;
        if (i11 != 0) {
            i10 |= 384;
        } else if ((i2 & 384) == 0) {
            xtcVar2 = xtcVar;
            i10 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            i4 = i3 & 8;
            if (i4 == 0) {
                i10 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i10 |= av8Var2.h(z2) ? a.o : 1024;
                if ((i3 & 16) == 0) {
                    i5 = i;
                    if (av8Var2.e(i5)) {
                        i6 = 16384;
                        int i12 = i10 | i6;
                        if ((i3 & 32) != 0) {
                            j2 = j;
                            if (av8Var2.f(j2)) {
                                i7 = 131072;
                                i8 = i12 | i7;
                                if (av8Var2.T(i8 & 1, (74899 & i8) != 74898)) {
                                    av8Var2.Y();
                                    int i13 = i2 & 1;
                                    utc utcVar = utc.a;
                                    if (i13 == 0 || av8Var2.B()) {
                                        if (i11 != 0) {
                                            xtcVar2 = utcVar;
                                        }
                                        if (i4 != 0) {
                                            z2 = true;
                                        }
                                        if ((i3 & 16) != 0) {
                                            i8 &= -57345;
                                            i5 = R.string.search;
                                        }
                                        if ((i3 & 32) != 0) {
                                            j2 = lz.D(R.color.surface_1, av8Var2);
                                            i8 &= -458753;
                                        }
                                        boolean z5 = z2;
                                        int i14 = i5;
                                        int i15 = i8;
                                        xtc xtcVar4 = xtcVar2;
                                        long j5 = j2;
                                        av8Var2.t();
                                        Object O = av8Var2.O();
                                        a99 a99Var = nf3.a;
                                        if (O == a99Var) {
                                            O = e.f(Boolean.FALSE);
                                            av8Var2.n0(O);
                                        }
                                        e1d e1dVar = (e1d) O;
                                        wd8 wd8Var = (wd8) av8Var2.k(dh3.i);
                                        kja kjaVar = kja.g;
                                        kja a2 = kja.a();
                                        boolean i16 = av8Var2.i(wd8Var);
                                        Object O2 = av8Var2.O();
                                        if (i16 || O2 == a99Var) {
                                            O2 = new wz4(wd8Var, 1);
                                            av8Var2.n0(O2);
                                        }
                                        ija ijaVar = new ija((Function1) O2, null, 62);
                                        yf8 yf8Var = xth.a;
                                        dfj a3 = dfj.a(xth.d(), lz.D(R.color.n_lv_1, av8Var2), 0L, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
                                        pvh pvhVar = new pvh(lz.D(R.color.primary_default, av8Var2));
                                        av8Var2.d0(2051126191);
                                        xtc A = wnn.A(bkh.d(xtcVar4, 1.0f), o7g.a(8.0f));
                                        Object O3 = av8Var2.O();
                                        if (O3 == a99Var) {
                                            O3 = new eqh(9, e1dVar);
                                            av8Var2.n0(O3);
                                        }
                                        xtc q = n9e.q(kik.L(A, (Function1) O3), j5, oyn.e);
                                        if (z5) {
                                            n7g a4 = o7g.a(8.0f);
                                            if (((Boolean) e1dVar.getValue()).booleanValue()) {
                                                z4 = false;
                                                f2 = ljg.f(av8Var2, -306858549, R.color.primary_default, av8Var2, false);
                                            } else {
                                                z4 = false;
                                                f2 = ljg.f(av8Var2, -306857759, R.color.n_lv_4, av8Var2, false);
                                            }
                                            j4 = j5;
                                            q = q.z(yso.o(utcVar, 1.0f, f2, a4));
                                        } else {
                                            j4 = j5;
                                            z4 = false;
                                        }
                                        av8Var2.s(z4);
                                        av8Var = av8Var2;
                                        yo1.d(str, function1, q, false, false, a3, a2, ijaVar, true, 0, 0, null, null, null, pvhVar, yqo.H(2017398651, av8Var2, new w54(str, i14, function1, 5)), av8Var, (i15 & 14) | 100663296 | (i15 & 112), 196608, 15896);
                                        z3 = z5;
                                        xtcVar3 = xtcVar4;
                                        j3 = j4;
                                        i9 = i14;
                                    } else {
                                        av8Var2.W();
                                        if ((i3 & 16) != 0) {
                                            i8 &= -57345;
                                        }
                                    }
                                } else {
                                    av8Var = av8Var2;
                                    av8Var.W();
                                    xtcVar3 = xtcVar2;
                                    z3 = z2;
                                    i9 = i5;
                                    j3 = j2;
                                }
                                u = av8Var.u();
                                if (u != null) {
                                    u.d = new x73(str, function1, xtcVar3, z3, i9, j3, i2, i3);
                                    return;
                                }
                                return;
                            }
                        } else {
                            j2 = j;
                        }
                        i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        i8 = i12 | i7;
                        if (av8Var2.T(i8 & 1, (74899 & i8) != 74898)) {
                        }
                        u = av8Var.u();
                        if (u != null) {
                        }
                    }
                } else {
                    i5 = i;
                }
                i6 = 8192;
                int i122 = i10 | i6;
                if ((i3 & 32) != 0) {
                }
                i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                i8 = i122 | i7;
                if (av8Var2.T(i8 & 1, (74899 & i8) != 74898)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            z2 = z;
            if ((i3 & 16) == 0) {
            }
            i6 = 8192;
            int i1222 = i10 | i6;
            if ((i3 & 32) != 0) {
            }
            i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i8 = i1222 | i7;
            if (av8Var2.T(i8 & 1, (74899 & i8) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        i4 = i3 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i3 & 16) == 0) {
        }
        i6 = 8192;
        int i12222 = i10 | i6;
        if ((i3 & 32) != 0) {
        }
        i7 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        i8 = i12222 | i7;
        if (av8Var2.T(i8 & 1, (74899 & i8) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void e(String str, Function1 function1, Function0 function0, xtc xtcVar, w8l w8lVar, ImageVector imageVector, of3 of3Var, int i) {
        xtc xtcVar2;
        w8l w8lVar2;
        w8l a2;
        xtc xtcVar3;
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1822462171);
        int i2 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 11264 | (av8Var.g(imageVector) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                a2 = alj.a(av8Var);
                xtcVar3 = utc.a;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
                a2 = w8lVar;
            }
            av8Var.t();
            uni.a(xtcVar3, null, lz.D(R.color.primary_variant, av8Var), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(1662062528, av8Var, new ere(a2, function0, imageVector, str, function1)), av8Var, 12582918, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            xtcVar2 = xtcVar3;
            w8lVar2 = a2;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            w8lVar2 = w8lVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(str, function1, function0, xtcVar2, w8lVar2, imageVector, i);
        }
    }

    public static final void f(dx5 dx5Var, waf wafVar) {
        dx5Var.getClass();
        LinearLayout linearLayout = dx5Var.a;
        LocalDate localDate = wafVar.a;
        String string = fc6.B(localDate) ? linearLayout.getContext().getString(R.string.today) : localDate.isEqual(LocalDate.now(ZoneId.systemDefault()).plusDays(1L)) ? linearLayout.getContext().getString(R.string.tomorrow) : localDate.isEqual(LocalDate.now(ZoneId.systemDefault()).minusDays(1L)) ? linearLayout.getContext().getString(R.string.yesterday) : null;
        TextView textView = dx5Var.b;
        if (string != null) {
            bi4 bi4Var = bi4.PATTERN_DAY_DM;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            String format = localDate.format(hk4.a(bi4Var.d()));
            format.getClass();
            textView.setText(String.format("%s, %s", Arrays.copyOf(new Object[]{string, format}, 2)));
            return;
        }
        bi4 bi4Var2 = bi4.PATTERN_DAY_DM;
        ConcurrentHashMap concurrentHashMap2 = hk4.a;
        String format2 = localDate.format(hk4.a(bi4Var2.d()));
        format2.getClass();
        textView.setText(format2);
    }

    public static d0 g(String str, AccessToken accessToken, String str2) {
        String str3;
        if (str == null) {
            return null;
        }
        String str4 = d0.j;
        int i = 1;
        d0 C = h0.C(accessToken, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1)), null, null);
        Bundle bundle = C.d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context a2 = w.a();
        try {
            str3 = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).versionName;
            str3.getClass();
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        bundle.putString("app_version", str3);
        bundle.putString(L6.H, "android");
        bundle.putString("request_type", "app_indexing");
        bundle.putString("device_session_id", m03.a());
        C.d = bundle;
        C.j(new qd0(i));
        return C;
    }

    public static final SerialDescriptor h(SerialDescriptor serialDescriptor, p5c p5cVar) {
        SerialDescriptor h;
        KSerializer g;
        serialDescriptor.getClass();
        p5cVar.getClass();
        if (!Intrinsics.c(serialDescriptor.getKind(), o5h.f)) {
            return serialDescriptor.isInline() ? h(serialDescriptor.g(0), p5cVar) : serialDescriptor;
        }
        KClass i0 = k53.i0(serialDescriptor);
        SerialDescriptor serialDescriptor2 = null;
        if (i0 != null && (g = p5cVar.g(i0, km5.a)) != null) {
            serialDescriptor2 = g.getDescriptor();
        }
        return (serialDescriptor2 == null || (h = h(serialDescriptor2, p5cVar)) == null) ? serialDescriptor : h;
    }

    public static final void j(int i) {
        if (i >= 1) {
            return;
        }
        ogj.h(ljg.j(i, "Expected positive parallelism level, but got "));
    }

    public static wbg k(jag jagVar) {
        jagVar.getClass();
        rag ragVar = jagVar.b;
        rag ragVar2 = rag.BANNER;
        if (ragVar != ragVar2) {
            pvd.n(ragVar2, ragVar);
            return null;
        }
        y9f y9fVar = vbg.a;
        Integer num = jagVar.c;
        y9fVar.getClass();
        return new wbg((num != null && num.intValue() == 1) ? vbg.c : vbg.b, jagVar.o, jagVar.p);
    }

    public static final ArrayList l(int i, List list) {
        list.getClass();
        ArrayList l = zu3.k.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.ICE_HOCKEY, Sports.BASEBALL, Sports.BASKETBALL, Sports.TENNIS, Sports.CRICKET) : zu3.a(i) ? b.l(Sports.FOOTBALL, Sports.AMERICAN_FOOTBALL, Sports.BASKETBALL, Sports.BASEBALL, Sports.ICE_HOCKEY, Sports.MOTORSPORT, Sports.TENNIS) : zu3.u0.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.RUGBY, Sports.CRICKET, Sports.TENNIS, Sports.MMA, Sports.MOTORSPORT, Sports.DARTS, Sports.SNOOKER, Sports.CYCLING, Sports.BASKETBALL) : zu3.r0.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.BASKETBALL, Sports.TENNIS) : zu3.p0.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.BASKETBALL, Sports.TENNIS, Sports.VOLLEYBALL, Sports.FUTSAL, Sports.BADMINTON, Sports.AMERICAN_FOOTBALL) : zu3.F.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.BADMINTON, Sports.BASKETBALL, Sports.VOLLEYBALL, Sports.FUTSAL, Sports.E_SPORTS, Sports.MOTORSPORT, Sports.MMA, Sports.CYCLING, Sports.CRICKET) : zu3.y.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.TENNIS, Sports.BASKETBALL, Sports.ICE_HOCKEY, Sports.RUGBY) : zu3.h.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.BASKETBALL, Sports.VOLLEYBALL, Sports.MINI_FOOTBALL, Sports.MMA, Sports.FUTSAL, Sports.TENNIS, Sports.MOTORSPORT, Sports.TABLE_TENNIS, Sports.BEACH_VOLLEY, Sports.WATERPOLO) : zu3.J.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.BASKETBALL, Sports.VOLLEYBALL, Sports.TENNIS, Sports.RUGBY, Sports.ICE_HOCKEY, Sports.MOTORSPORT, Sports.WATERPOLO, Sports.FUTSAL, Sports.CYCLING) : (zu3.E.hasMcc(Integer.valueOf(i)) || zu3.Z.hasMcc(Integer.valueOf(i))) ? b.l(Sports.FOOTBALL, Sports.CRICKET, Sports.BADMINTON, Sports.TENNIS, Sports.RUGBY, Sports.MMA, Sports.MOTORSPORT, Sports.BASKETBALL, Sports.VOLLEYBALL, Sports.SNOOKER) : zu3.X.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.BASKETBALL, Sports.MMA, Sports.TENNIS, Sports.VOLLEYBALL, Sports.HANDBALL, Sports.MOTORSPORT, Sports.TABLE_TENNIS, Sports.BADMINTON, Sports.CRICKET) : zu3.U.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.BASKETBALL, Sports.TENNIS, Sports.HANDBALL, Sports.FUTSAL, Sports.VOLLEYBALL, Sports.MMA, Sports.MOTORSPORT, Sports.RUGBY, Sports.CRICKET) : zu3.S.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.BASEBALL, Sports.MMA, Sports.BASKETBALL, Sports.TENNIS, Sports.AMERICAN_FOOTBALL, Sports.CYCLING, Sports.VOLLEYBALL, Sports.MOTORSPORT, Sports.RUGBY) : zu3.A.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.MMA, Sports.BASKETBALL, Sports.BADMINTON, Sports.TENNIS, Sports.VOLLEYBALL, Sports.TABLE_TENNIS, Sports.RUGBY, Sports.HANDBALL, Sports.CRICKET) : zu3.L.hasMcc(Integer.valueOf(i)) ? b.l(Sports.FOOTBALL, Sports.RUGBY, Sports.CRICKET, Sports.MOTORSPORT, Sports.MMA, Sports.BASKETBALL, Sports.VOLLEYBALL, Sports.CYCLING, Sports.BASEBALL, Sports.HANDBALL) : new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!l.contains(str)) {
                l.add(str);
            }
        }
        return l;
    }

    public static final yih m(aej aejVar, int i, int i2, int i3, long j, boolean z, boolean z2) {
        w2h w2hVar;
        if (z) {
            w2hVar = null;
        } else {
            int i4 = pej.c;
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            w2hVar = new w2h(new v2h(bea.z(aejVar, i5), i5, 1L), new v2h(bea.z(aejVar, i6), i6, 1L), pej.h(j));
        }
        return new yih(z2, w2hVar, new zz0(i, i2, i3, aejVar));
    }

    public static final boolean n(q80 q80Var) {
        int length = q80Var.b.length();
        List list = q80Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                p80 p80Var = (p80) list.get(i);
                if ((p80Var.a instanceof gbb) && r80.b(0, length, p80Var.b, p80Var.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int o(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        a70.p(ljg.j(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static gv9 p(Context context, List list, List list2, Manager manager, boolean z, String str, Gender gender) {
        list.getClass();
        str.getClass();
        Set set = d9b.a;
        return d9b.a(list, list2, null, manager, null, z, new i9b(new n9k(R.string.starting_players, gender)), new i9b(new q9k(str.equals(Sports.RUGBY) ? R.string.rugby_replacements : str.equals(Sports.AUSSIE_RULES) ? R.string.aussie_rules_interchange : R.string.substitutions)), null, new op9(21, context, str), null, null, 3348);
    }

    public static final void q(eyf eyfVar) {
        ArrayList arrayList = eyfVar.c;
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((mk5) it.next()) instanceof vk5)) {
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                mk5 mk5Var = (mk5) it2.next();
                mk5Var.getClass();
                ArrayList arrayList2 = ((vk5) mk5Var).c;
                if (arrayList2.size() != 1) {
                    nk5 nk5Var = new nk5();
                    o13.v(arrayList2, nk5Var.c);
                    arrayList2.clear();
                    arrayList2.add(nk5Var);
                }
            }
            r(eyfVar);
            A(eyfVar);
        }
        if (arrayList.size() != 1) {
            nk5 nk5Var2 = new nk5();
            o13.v(arrayList, nk5Var2.c);
            arrayList.clear();
            arrayList.add(nk5Var2);
        }
        r(eyfVar);
        A(eyfVar);
    }

    public static final void r(yk5 yk5Var) {
        ArrayList arrayList = yk5Var.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mk5 mk5Var = (mk5) it.next();
            if (mk5Var instanceof yk5) {
                r((yk5) mk5Var);
            }
        }
        q99 q99Var = (q99) yk5Var.b().a(null, ff3.H);
        z25 z25Var = x25.a;
        if (((q99Var != null ? q99Var.a : z25Var) instanceof x25) && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                q99 q99Var2 = (q99) ((mk5) it2.next()).b().a(null, ff3.J);
                if ((q99Var2 != null ? q99Var2.a : null) instanceof s25) {
                    yk5Var.a(nq8.y(yk5Var.b()));
                    break;
                }
            }
        }
        a8l a8lVar = (a8l) yk5Var.b().a(null, ff3.I);
        if (a8lVar != null) {
            z25Var = a8lVar.a;
        }
        if (!(z25Var instanceof x25) || arrayList.isEmpty()) {
            return;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            a8l a8lVar2 = (a8l) ((mk5) it3.next()).b().a(null, ff3.K);
            if ((a8lVar2 != null ? a8lVar2.a : null) instanceof s25) {
                yk5Var.a(nq8.A(yk5Var.b()));
                return;
            }
        }
    }

    public static boolean s() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static final String t(int i, int i2, Object[] objArr, of3 of3Var) {
        return ((Resources) ((av8) of3Var).k(nz.c)).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static Executor u(Executor executor, gd8 gd8Var) {
        executor.getClass();
        return executor == f35.a ? executor : new irb(executor, gd8Var, 1);
    }

    public static final String v(int i, of3 of3Var) {
        return ((Resources) ((av8) of3Var).k(nz.c)).getString(i);
    }

    public static final String w(int i, Object[] objArr, of3 of3Var) {
        return ((Resources) ((av8) of3Var).k(nz.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final eml x(yea yeaVar, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        mha kind = serialDescriptor.getKind();
        if (kind instanceof zze) {
            return eml.f;
        }
        if (Intrinsics.c(kind, nii.g)) {
            return eml.d;
        }
        if (!Intrinsics.c(kind, nii.h)) {
            return eml.c;
        }
        SerialDescriptor h = h(serialDescriptor.g(0), yeaVar.b);
        mha kind2 = h.getKind();
        if ((kind2 instanceof d7f) || Intrinsics.c(kind2, p5h.f)) {
            return eml.e;
        }
        if (yeaVar.a.d) {
            return eml.d;
        }
        throw yfa.b(h);
    }

    public static final void y(int[] iArr, int[] iArr2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(serialDescriptor.e((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new rkc(serialDescriptor.h(), arrayList);
    }

    public static final void z(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.e(i4));
            }
            i3 >>>= 1;
        }
        throw new rkc(serialDescriptor.h(), arrayList);
    }

    public abstract void i();
}
