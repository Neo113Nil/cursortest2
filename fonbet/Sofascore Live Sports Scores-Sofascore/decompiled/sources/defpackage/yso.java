package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.appsflyer.internal.i;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.newNetwork.WscStoriesResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.components.FantasyLeaderboardStatistic;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yso {
    public static final tc3 a;
    public static final hz7 d;
    public static final wkf l;
    public static final omf m;
    public static final anf n;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;
    public static final tc3 b = new tc3(1889361206, new ed3(29), false);
    public static final tc3 c = new tc3(1103746621, new ud3(22), false);
    public static final String[] e = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    public static final int[] f = {44100, 48000, 32000};
    public static final int[] g = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] i = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] j = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] k = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final crj o = new crj(8);

    static {
        int i2 = 1;
        a = new tc3(2122303620, new pr1(i2), false);
        d = new hz7(i2);
        l = new wkf(i2);
        m = new omf(i2);
        n = new anf(i2);
    }

    public static final String[] A(vp3 vp3Var) {
        vp3Var.getClass();
        return (String[]) ((vz) vp3Var).b.toArray(new String[0]);
    }

    public static int B(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? g[i5 - 1] : h[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? i[i5 - 1] : j[i5 - 1] : k[i5 - 1];
        if (i3 == 3) {
            return vxd.c(i9, 144, i7, i8);
        }
        return vxd.c(i4 == 1 ? 72 : 144, i9, i7, i8);
    }

    public static final boolean C(dfj dfjVar) {
        aje ajeVar;
        tje tjeVar = dfjVar.c;
        rl5 rl5Var = (tjeVar == null || (ajeVar = tjeVar.b) == null) ? null : new rl5(ajeVar.b);
        boolean z = false;
        if (rl5Var != null && rl5Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final nm1 D(Context context, mm1 mm1Var, PlayerData playerData, String str, Double d2) {
        int id = playerData.getPlayer().getId();
        String C = tba.C(playerData.getPlayer());
        Regex regex = yid.a;
        if (C == null) {
            C = "-";
        }
        return new nm1(new lm1(id, mm1Var, C, str == null ? "-" : str, lnb.o(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(yid.k(d2))}, 1)), " ", context.getString(R.string.baseball_earned_run_average_short))), playerData.getTeamId(), playerData.getPlayer());
    }

    public static final kqg E(ttk ttkVar) {
        iqg iqgVar = new iqg();
        ly3 r2 = ufa.r(ttkVar);
        r2.getClass();
        stk viewModelStore = ttkVar.getViewModelStore();
        viewModelStore.getClass();
        g7h g7hVar = new g7h(viewModelStore, iqgVar, r2);
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(kqg.class);
        orCreateKotlinClass.getClass();
        return (kqg) g7hVar.u("androidx.lifecycle.internal.SavedStateHandlesVM", orCreateKotlinClass);
    }

    public static final ArrayList F(int i2, String str, List list) {
        list.getClass();
        List L0 = CollectionsKt.L0(list, i2);
        int size = i2 - list.size();
        if (size < 0) {
            size = 0;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(str);
        }
        return CollectionsKt.w0(arrayList, L0);
    }

    public static int G(int i2) {
        int i3;
        int i4;
        if ((i2 & (-2097152)) == -2097152 && (i3 = (i2 >>> 19) & 3) != 1 && (i4 = (i2 >>> 17) & 3) != 0) {
            int i5 = (i2 >>> 12) & 15;
            int i6 = (i2 >>> 10) & 3;
            if (i5 != 0 && i5 != 15 && i6 != 3) {
                if (i4 == 1) {
                    return i3 == 3 ? 1152 : 576;
                }
                if (i4 == 2) {
                    return 1152;
                }
                if (i4 == 3) {
                    return 384;
                }
                ilg.c();
                return 0;
            }
        }
        return -1;
    }

    public static final axj H(t01 t01Var, String str, of3 of3Var, int i2) {
        int i3 = (i2 & 14) ^ 6;
        int i4 = 1;
        int i5 = 4;
        boolean z = false;
        boolean z2 = (i3 > 4 && ((av8) of3Var).g(t01Var)) || (i2 & 6) == 4;
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        Object obj = nf3.a;
        rq3 rq3Var = null;
        if (z2 || O == obj) {
            nnh w = bea.w();
            Function1 e2 = w != null ? w.e() : null;
            nnh C = bea.C(w);
            try {
                Object axjVar = new axj(t01Var, null, str);
                bea.K(w, C, e2);
                av8Var.n0(axjVar);
                O = axjVar;
            } catch (Throwable th) {
                bea.K(w, C, e2);
                throw th;
            }
        }
        axj axjVar2 = (axj) O;
        if (t01Var instanceof o0h) {
            av8Var.d0(-1357590553);
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = hz8.G(g.a, av8Var);
                av8Var.n0(O2);
            }
            Object obj2 = (ku3) O2;
            boolean i6 = av8Var.i(obj2) | ((i3 > 4 && av8Var.g(t01Var)) || (i2 & 6) == 4);
            Object O3 = av8Var.O();
            if (i6 || O3 == obj) {
                O3 = new mwj(t01Var, obj2, z, i5);
                av8Var.n0(O3);
            }
            hz8.d(obj2, (Function1) O3, av8Var);
            o0h o0hVar = (o0h) t01Var;
            Object value = ((eoh) o0hVar.d).getValue();
            Object value2 = ((eoh) o0hVar.c).getValue();
            boolean z3 = (i3 > 4 && av8Var.g(t01Var)) || (i2 & 6) == 4;
            Object O4 = av8Var.O();
            if (z3 || O4 == obj) {
                O4 = new h4i(t01Var, rq3Var, 22);
                av8Var.n0(O4);
            }
            hz8.q(value, value2, (Function2) O4, av8Var);
            av8Var.s(false);
        } else {
            av8Var.d0(-1356604288);
            axjVar2.a(t01Var.A(), av8Var, 0);
            av8Var.s(false);
        }
        boolean g2 = av8Var.g(axjVar2);
        Object O5 = av8Var.O();
        if (g2 || O5 == obj) {
            O5 = new cxj(axjVar2, i4);
            av8Var.n0(O5);
        }
        hz8.d(axjVar2, (Function1) O5, av8Var);
        return axjVar2;
    }

    public static final long I(long j2, float f2) {
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final zad J(d2g d2gVar) {
        l62 source;
        int i2 = d2gVar.d;
        long j2 = d2gVar.l;
        long j3 = d2gVar.m;
        q89 q89Var = d2gVar.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = q89Var.iterator();
        while (true) {
            r4 r4Var = (r4) it;
            if (!r4Var.hasNext()) {
                break;
            }
            Pair pair = (Pair) r4Var.next();
            String str = (String) pair.a;
            String str2 = (String) pair.b;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object obj = linkedHashMap.get(lowerCase);
            if (obj == null) {
                obj = wv8.n(linkedHashMap, lowerCase);
            }
            ((List) obj).add(str2);
        }
        fad fadVar = new fad(tub.p(linkedHashMap));
        i2g i2gVar = d2gVar.g;
        return new zad(i2, j2, j3, fadVar, (i2gVar == null || (source = i2gVar.source()) == null) ? null : new mwh(source), d2gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qzf K(mad madVar, sq3 sq3Var) {
        hh2 hh2Var;
        int i2;
        pzf pzfVar;
        String str;
        pzf pzfVar2;
        mad madVar2;
        uzf uzfVar;
        if (sq3Var instanceof hh2) {
            hh2Var = (hh2) sq3Var;
            int i3 = hh2Var.s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hh2Var.s = i3 - Integer.MIN_VALUE;
                Object obj = hh2Var.r;
                lu3 lu3Var = lu3.a;
                i2 = hh2Var.s;
                pzf pzfVar3 = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    pzfVar = new pzf();
                    pzfVar.f(madVar.a);
                    str = madVar.b;
                    pzfVar2 = pzfVar;
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    gc2 gc2Var = (gc2) obj;
                    if (gc2Var != null) {
                        yzf.Companion.getClass();
                        uzfVar = new uzf(gc2Var, null);
                        madVar2 = null;
                        pzfVar2 = null;
                        str = null;
                        pzfVar3.e(str, uzfVar);
                        fad fadVar = madVar2.c;
                        ef0 ef0Var = new ef0(1);
                        for (Map.Entry entry : fadVar.a.entrySet()) {
                            String str2 = (String) entry.getKey();
                            Iterator it = ((List) entry.getValue()).iterator();
                            while (it.hasNext()) {
                                ef0Var.d(str2, (String) it.next());
                            }
                        }
                        q89 i4 = vha.i(ef0Var);
                        pzfVar2.getClass();
                        pzfVar2.c = vha.k(i4);
                        return new qzf(pzfVar2);
                    }
                    madVar = null;
                    pzfVar = null;
                    pzfVar2 = null;
                    str = null;
                }
                pzf pzfVar4 = pzfVar;
                madVar2 = madVar;
                uzfVar = null;
                pzfVar3 = pzfVar4;
                pzfVar3.e(str, uzfVar);
                fad fadVar2 = madVar2.c;
                ef0 ef0Var2 = new ef0(1);
                while (r5.hasNext()) {
                }
                q89 i42 = vha.i(ef0Var2);
                pzfVar2.getClass();
                pzfVar2.c = vha.k(i42);
                return new qzf(pzfVar2);
            }
        }
        hh2Var = new hh2(sq3Var);
        Object obj2 = hh2Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = hh2Var.s;
        pzf pzfVar32 = null;
        if (i2 != 0) {
        }
        pzf pzfVar42 = pzfVar;
        madVar2 = madVar;
        uzfVar = null;
        pzfVar32 = pzfVar42;
        pzfVar32.e(str, uzfVar);
        fad fadVar22 = madVar2.c;
        ef0 ef0Var22 = new ef0(1);
        while (r5.hasNext()) {
        }
        q89 i422 = vha.i(ef0Var22);
        pzfVar2.getClass();
        pzfVar2.c = vha.k(i422);
        return new qzf(pzfVar2);
    }

    public static final axj L(Object obj, String str, of3 of3Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = new axj(new h1d(obj), null, str);
            av8Var.n0(O);
        }
        axj axjVar = (axj) O;
        axjVar.a(obj, av8Var, (i2 & 8) | 48 | (i2 & 14));
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = new cxj(axjVar, 0);
            av8Var.n0(O2);
        }
        hz8.d(axjVar, (Function1) O2, av8Var);
        return axjVar;
    }

    public static final xbb M(List list, List list2) {
        list.getClass();
        list2.getClass();
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        xbb b2 = a.b();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return a.a(b2);
            }
            Object obj = null;
            Object next = it.hasNext() ? it.next() : null;
            it2.getClass();
            if (it2.hasNext()) {
                obj = it2.next();
            }
            b2.add(new Pair(next, obj));
        }
    }

    public static final vz a(String str) {
        return new vz(w9h.b(str));
    }

    public static final void b(String str, String str2, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        str.getClass();
        str2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-631395683);
        int i3 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.g(str2) ? 32 : 16) | 384;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            tc3 H = yqo.H(1060959751, av8Var, new qm4(i4, str, str2));
            utc utcVar = utc.a;
            dy0.b(utcVar, null, H, av8Var, 3078, 6);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new cv3(str, str2, xtcVar2, i2, 1);
        }
    }

    public static final void c(final qug qugVar, final xtc xtcVar, final long j2, final long j3, float f2, float f3, float f4, of3 of3Var, final int i2) {
        int i3;
        final float f5;
        final float f6;
        final float f7;
        qugVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(872585324);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(qugVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.f(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.f(j3) ? 2048 : 1024;
        }
        int i4 = i3 | 1794048;
        if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
            final boolean z = av8Var.k(dh3.n) == ema.b;
            xtc e2 = bkh.e(bkh.d(xtcVar, 1.0f), 2.0f);
            boolean h2 = ((i4 & 14) == 4) | av8Var.h(z) | ((3670016 & i4) == 1048576) | ((458752 & i4) == 131072) | ((i4 & 7168) == 2048) | ((i4 & 896) == 256);
            Object O = av8Var.O();
            final float f8 = 24.0f;
            final float f9 = 16.0f;
            if (h2 || O == nf3.a) {
                Function1 function1 = new Function1() { // from class: wu5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        final qug qugVar2 = qugVar;
                        final float f10 = f9;
                        final float f11 = f8;
                        final long j4 = j3;
                        final long j5 = j2;
                        cga.I(ha5Var, z, new Function1() { // from class: yu5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                float f12;
                                ha5 ha5Var2 = (ha5) obj2;
                                ha5Var2.getClass();
                                float H0 = ha5Var2.H0(2.0f);
                                qug qugVar3 = qug.this;
                                float h3 = qugVar3.e.h();
                                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - ha5Var2.H0(f10);
                                if (intBitsToFloat <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    return Unit.a;
                                }
                                float h4 = qugVar3.b.h();
                                float f13 = h4 + h3;
                                if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    float f14 = (h4 * intBitsToFloat) / f13;
                                    float H02 = ha5Var2.H0(f11);
                                    if (f14 < H02) {
                                        f14 = H02;
                                    }
                                    if (f14 > intBitsToFloat) {
                                        f14 = intBitsToFloat;
                                    }
                                    f12 = f14;
                                } else {
                                    f12 = intBitsToFloat;
                                }
                                float h5 = (h3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? qugVar3.a.h() / h3 : 0.0f) * (intBitsToFloat - f12);
                                ha5.f0(ha5Var2, j4, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(H0) & 4294967295L) | (Float.floatToRawIntBits(H0) << 32), null, 240);
                                ha5.f0(ha5Var2, j5, (Float.floatToRawIntBits(h5) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(H0) << 32) | (Float.floatToRawIntBits(H0) & 4294967295L), null, 240);
                                return Unit.a;
                            }
                        });
                        return Unit.a;
                    }
                };
                av8Var.n0(function1);
                O = function1;
            }
            lz.d(0, av8Var, e2, (Function1) O);
            f7 = 16.0f;
            f6 = 24.0f;
            f5 = 2.0f;
        } else {
            av8Var.W();
            f5 = f2;
            f6 = f3;
            f7 = f4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: xu5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yso.c(qug.this, xtcVar, j2, j3, f5, f6, f7, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1964527324);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtcVar2 = xtcVar;
            un0.a(xtcVar2, o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), null, null, ao2.g, av8Var, 196614, 24);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l63(xtcVar2, i2, 5);
        }
    }

    public static final void e(wn1 wn1Var, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        wn1Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-408326855);
        int i3 = i2 | (av8Var.g(wn1Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | 384;
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            long j2 = wn1Var.p;
            bi4 bi4Var = bi4.PATTERN_DMMHHSS;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            String i5 = fc6.i(j2, hk4.a(bi4Var.d()));
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc q2 = n9e.q(wnn.A(bkh.d(utcVar, 1.0f), o7g.a(8.0f)), lz.D(R.color.surface_2, av8Var), oyn.e);
            boolean i6 = ((i3 & 14) == 4) | av8Var.i(context);
            Object O = av8Var.O();
            if (i6 || O == nf3.a) {
                O = new px6(context, wn1Var, i4);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q2, false, false, false, 0L, null, (Function0) O, av8Var, 31), 8.0f, 16.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            goa g2 = ljg.g(av8Var, C, f50Var3, 1.0f, true);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, g2);
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
            String str = wn1Var.e;
            if (str == null) {
                str = wn1Var.d;
            }
            String str2 = wn1Var.h;
            if (str2 == null) {
                str2 = wn1Var.g;
            }
            String i7 = wv8.i(str, " - ", str2);
            yf8 yf8Var = xth.a;
            udj.c(i7, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            udj.c(i5, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            if (z) {
                av8Var.d0(-1834643219);
                av8Var.s(false);
            } else {
                ljg.r(16.0f, -1834997828, av8Var, av8Var, utcVar);
                lz.o(wn1Var.b, wn1Var.c, wn1Var.j, wn1Var.k, wn1Var.c(), null, 0L, 0L, false, av8Var, 0, 480);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60((Object) wn1Var, z, xtcVar2, i2, 6);
        }
    }

    public static final void f(z97 z97Var, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var;
        xtc xtcVar2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-504818589);
        int i3 = i2 | (av8Var2.g(z97Var) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        int i4 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc d0 = l98.d0(tol.o(bkh.d(gz8.x(utcVar, null, null, 3), 1.0f)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
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
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            xtc d02 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String v = oea.v(R.string.fantasy_league_join_text, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v, d02, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 48, 0, 131064);
            xtc d03 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String str = z97Var.a;
            String v2 = oea.v(R.string.fantasy_league_code, av8Var2);
            String v3 = oea.v(R.string.fantasy_league_join_code_error, av8Var2);
            boolean z = z97Var.b;
            t28 t28Var = new t28(r4a.C(5), new t28(p4a.b, new so(pie.a.P().c())));
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new m27(i4);
                av8Var2.n0(O);
            }
            q5a.r(str, d03, null, function12, null, null, null, v2, null, null, v3, z, new t28(t28Var, (q4a) O), 0L, 0, 0, null, 0L, 0L, 0, false, false, false, av8Var2, ((i3 << 3) & 7168) | 48, 0, 0, 16769908);
            String g2 = bf3.g(48.0f, R.string.fantasy_join_button, av8Var2, av8Var2, utcVar);
            boolean z2 = z97Var.d;
            boolean z3 = z97Var.c;
            xtc d04 = l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object O2 = av8Var2.O();
            if (z4 || O2 == a99Var) {
                O2 = new n37(6, (Object) z97Var, function1);
                av8Var2.n0(O2);
            }
            mha.h(g2, (Function0) O2, d04, null, null, z2, z3, false, 0L, 0, 0, av8Var2, 384, 0, 1944);
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
            u.d = new ace(i2, 24, z97Var, function1, function12, xtcVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final eo7 eo7Var, final gv9 gv9Var, final boolean z, final boolean z2, final xtc xtcVar, long j2, long j3, final Function1 function1, boolean z3, boolean z4, boolean z5, of3 of3Var, final int i2, final int i3, final int i4) {
        Function1 function12;
        Integer num;
        int i5;
        int i6;
        int i7;
        av8 av8Var;
        final boolean z6;
        final long j4;
        final boolean z7;
        final boolean z8;
        eqf u;
        boolean z9;
        boolean z10;
        int i8;
        boolean z11;
        boolean z12;
        boolean z13;
        xtc d2;
        utc utcVar;
        boolean z14;
        boolean z15;
        Object O;
        xtc y;
        int i9;
        utc utcVar2;
        int i10;
        int i11;
        Iterator<E> it;
        String valueOf;
        eo7Var.getClass();
        Integer num2 = eo7Var.c;
        Integer num3 = eo7Var.a;
        gv9Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1810736659);
        int i12 = (av8Var2.g(eo7Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i12 |= av8Var2.g(gv9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i12 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i12 |= av8Var2.h(z2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        long j5 = j2;
        long j6 = j3;
        int i13 = i12 | (av8Var2.g(xtcVar) ? 16384 : 8192) | (((i4 & 32) == 0 && av8Var2.f(j5)) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (((i4 & 64) == 0 && av8Var2.f(j6)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((12582912 & i2) == 0) {
            function12 = function1;
            i13 |= av8Var2.i(function12) ? 8388608 : 4194304;
        } else {
            function12 = function1;
        }
        int i14 = i4 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i14 != 0) {
            i13 |= 100663296;
            num = num2;
        } else {
            num = num2;
            if ((i2 & 100663296) == 0) {
                i13 |= av8Var2.h(z3) ? 67108864 : 33554432;
            }
        }
        int i15 = i4 & 512;
        if (i15 != 0) {
            i13 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 = i15;
            i13 |= av8Var2.h(z4) ? 536870912 : 268435456;
            i6 = i4 & 1024;
            if (i6 == 0) {
                i7 = 6;
            } else if ((i3 & 6) == 0) {
                i7 = i3 | (av8Var2.h(z5) ? 4 : 2);
            } else {
                i7 = i3;
            }
            if (av8Var2.T(i13 & 1, (i13 & 306783379) == 306783378 || (i7 & 3) != 2)) {
                av8Var = av8Var2;
                av8Var.W();
                z6 = z5;
                j4 = j5;
                z7 = z3;
                z8 = z4;
            } else {
                av8Var2.Y();
                if ((i2 & 1) == 0 || av8Var2.B()) {
                    if ((i4 & 32) != 0) {
                        j5 = lz.D(R.color.n_lv_1, av8Var2);
                        i13 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        j6 = lz.D(R.color.n_lv_3, av8Var2);
                        i13 &= -3670017;
                    }
                    z9 = i14 != 0 ? false : z3;
                    z10 = i5 != 0 ? false : z4;
                    i8 = i13;
                    if (i6 != 0) {
                        z11 = false;
                        av8Var2.t();
                        z12 = z9;
                        boolean z16 = z11;
                        long j7 = j6;
                        long D = lz.D(R.color.primary_default, av8Var2);
                        z13 = z16 && function12 != null && num3 != null && (!eo7Var.i || z2) && !eo7Var.j;
                        av8Var2.d0(656202388);
                        av8Var2.d0(656198859);
                        d2 = bkh.d(xtcVar, 1.0f);
                        utcVar = utc.a;
                        if (!z12 || z10) {
                            z14 = z10;
                            d2 = d2.z(n9e.q(utcVar, lz.D(R.color.primary_highlight, av8Var2), oyn.e));
                        } else {
                            z14 = z10;
                        }
                        av8Var2.s(false);
                        a99 a99Var = nf3.a;
                        if (z12) {
                            boolean f2 = av8Var2.f(D);
                            Object O2 = av8Var2.O();
                            if (f2 || O2 == a99Var) {
                                O2 = new yz(D, 24);
                                av8Var2.n0(O2);
                            }
                            d2 = d2.z(td4.X(utcVar, (Function1) O2));
                        }
                        av8Var2.s(false);
                        z15 = ((29360128 & i8) != 8388608) | ((i8 & 14) != 4);
                        O = av8Var2.O();
                        if (!z15 || O == a99Var) {
                            O = new h84(29, function12, eo7Var);
                            av8Var2.n0(O);
                        }
                        y = tol.y(d2, z13, false, false, 0L, null, (Function0) O, av8Var2, 30);
                        av8Var = av8Var2;
                        if (!z13 && !z12 && !z16) {
                            y = y.z(u6h.C(utcVar, 0.5f));
                        }
                        p4h p4hVar = ww9.d;
                        kv1 kv1Var = uxf.o;
                        u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 0);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C = fqj.C(av8Var, y);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        f50 f50Var = hf3.g;
                        waa.K(av8Var, a2, f50Var);
                        ff3 ff3Var = hf3.f;
                        waa.K(av8Var, m2, ff3Var);
                        Integer valueOf2 = Integer.valueOf(hashCode);
                        f50 f50Var2 = hf3.j;
                        waa.K(av8Var, valueOf2, f50Var2);
                        ry ryVar = hf3.k;
                        waa.J(av8Var, ryVar);
                        long j8 = j5;
                        f50 f50Var3 = hf3.d;
                        waa.K(av8Var, C, f50Var3);
                        if (z14) {
                            i9 = i8;
                            utcVar2 = utcVar;
                            i10 = 48;
                            av8Var.d0(-972251815);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-972432483);
                            utcVar2 = utcVar;
                            i10 = 48;
                            i9 = i8;
                            j(z, l98.f0(utcVar, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), av8Var, ((i8 >> 6) & 14) | 48);
                            av8Var.s(false);
                        }
                        lv1 lv1Var = uxf.m;
                        xtc c0 = l98.c0(bkh.d(utcVar2, 1.0f), 16.0f, 12.0f);
                        l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, i10);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, c0);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a3, f50Var);
                        waa.K(av8Var, m3, ff3Var);
                        bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C2, f50Var3);
                        xtc p2 = bkh.p(utcVar2, 32.0f);
                        u23 a4 = t23.a(ww9.f, uxf.p, av8Var, 54);
                        int hashCode3 = Long.hashCode(av8Var.T);
                        aee m4 = av8Var.m();
                        xtc C3 = fqj.C(av8Var, p2);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a4, f50Var);
                        waa.K(av8Var, m4, ff3Var);
                        bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C3, f50Var3);
                        String p3 = num3 == null ? yid.p(num3.intValue()) : "-";
                        yf8 yf8Var = xth.a;
                        int i16 = (i9 >> 9) & 896;
                        fqj.a(p3, xth.g(), j8, null, null, av8Var, i16, 24);
                        if (eo7Var.d() == 0) {
                            av8Var.d0(-1746700075);
                            i11 = 0;
                            yqo.g(eo7Var.d(), 0, av8Var, null);
                            av8Var.s(false);
                        } else {
                            i11 = 0;
                            av8Var.d0(-1746598209);
                            av8Var.s(false);
                        }
                        av8Var.s(true);
                        nq8.h(av8Var, bkh.p(utcVar2, 16.0f));
                        goa goaVar = new goa(1.0f, true);
                        u23 a5 = t23.a(p4hVar, kv1Var, av8Var, i11);
                        int hashCode4 = Long.hashCode(av8Var.T);
                        aee m5 = av8Var.m();
                        xtc C4 = fqj.C(av8Var, goaVar);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a5, f50Var);
                        waa.K(av8Var, m5, ff3Var);
                        bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C4, f50Var3);
                        udj.c(eo7Var.h, null, j8, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, i16, 24960, 110586);
                        nq8.h(av8Var, bkh.e(utcVar2, 4.0f));
                        udj.c(eo7Var.f, null, j7, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, (i9 >> 12) & 896, 24960, 110586);
                        j6 = j7;
                        i.o(av8Var, true, utcVar2, 16.0f, av8Var);
                        av8Var.d0(1410723069);
                        it = gv9Var.iterator();
                        while (it.hasNext()) {
                            FantasyLeaderboardStatistic fantasyLeaderboardStatistic = (FantasyLeaderboardStatistic) it.next();
                            fantasyLeaderboardStatistic.getClass();
                            switch (fantasyLeaderboardStatistic.ordinal()) {
                                case 0:
                                    Integer num4 = eo7Var.d;
                                    if (num4 != null) {
                                        valueOf = String.valueOf(num4.intValue());
                                        String str = valueOf != null ? "-" : valueOf;
                                        xtc p4 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                        yf8 yf8Var2 = xth.a;
                                        udj.c(str, p4, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    xtc p42 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                    yf8 yf8Var22 = xth.a;
                                    udj.c(str, p42, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                case 1:
                                    if (num != null) {
                                        valueOf = String.valueOf(num.intValue());
                                        if (valueOf != null) {
                                        }
                                        xtc p422 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                        yf8 yf8Var222 = xth.a;
                                        udj.c(str, p422, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    xtc p4222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                    yf8 yf8Var2222 = xth.a;
                                    udj.c(str, p4222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    break;
                                case 2:
                                    Integer num5 = eo7Var.m;
                                    if (num5 != null) {
                                        valueOf = String.valueOf(num5.intValue());
                                        if (valueOf != null) {
                                        }
                                        xtc p42222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                        yf8 yf8Var22222 = xth.a;
                                        udj.c(str, p42222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    xtc p422222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                    yf8 yf8Var222222 = xth.a;
                                    udj.c(str, p422222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    break;
                                case 3:
                                    Integer num6 = eo7Var.n;
                                    if (num6 != null) {
                                        valueOf = String.valueOf(num6.intValue());
                                        if (valueOf != null) {
                                        }
                                        xtc p4222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                        yf8 yf8Var2222222 = xth.a;
                                        udj.c(str, p4222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    xtc p42222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                    yf8 yf8Var22222222 = xth.a;
                                    udj.c(str, p42222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    break;
                                case 4:
                                    Integer num7 = eo7Var.o;
                                    if (num7 != null) {
                                        valueOf = String.valueOf(num7.intValue());
                                        if (valueOf != null) {
                                        }
                                        xtc p422222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                        yf8 yf8Var222222222 = xth.a;
                                        udj.c(str, p422222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    xtc p4222222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                    yf8 yf8Var2222222222 = xth.a;
                                    udj.c(str, p4222222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    break;
                                case 5:
                                    if (num != null) {
                                        valueOf = String.valueOf(num.intValue());
                                        if (valueOf != null) {
                                        }
                                        xtc p42222222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                        yf8 yf8Var22222222222 = xth.a;
                                        udj.c(str, p42222222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    xtc p422222222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                    yf8 yf8Var222222222222 = xth.a;
                                    udj.c(str, p422222222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    break;
                                case 6:
                                    Float f3 = eo7Var.q;
                                    if (f3 != null) {
                                        valueOf = String.valueOf((int) f3.floatValue());
                                        if (valueOf != null) {
                                        }
                                        xtc p4222222222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                        yf8 yf8Var2222222222222 = xth.a;
                                        udj.c(str, p4222222222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    xtc p42222222222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                    yf8 yf8Var22222222222222 = xth.a;
                                    udj.c(str, p42222222222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    break;
                                case 7:
                                    Integer num8 = eo7Var.p;
                                    if (num8 != null) {
                                        valueOf = String.valueOf(num8.intValue());
                                        if (valueOf != null) {
                                        }
                                        xtc p422222222222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                        yf8 yf8Var222222222222222 = xth.a;
                                        udj.c(str, p422222222222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    xtc p4222222222222222 = bkh.p(utcVar2, fantasyLeaderboardStatistic.c);
                                    yf8 yf8Var2222222222222222 = xth.a;
                                    udj.c(str, p4222222222222222, j8, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.m(), av8Var, i16, 24960, 109560);
                                    break;
                                default:
                                    zzl.b();
                                    break;
                            }
                            return;
                        }
                        ljg.t(av8Var, false, true, true);
                        z7 = z12;
                        z6 = z16;
                        z8 = z14;
                        j4 = j8;
                    }
                } else {
                    av8Var2.W();
                    if ((i4 & 32) != 0) {
                        i13 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        i13 &= -3670017;
                    }
                    z9 = z3;
                    z10 = z4;
                    i8 = i13;
                }
                z11 = z5;
                av8Var2.t();
                z12 = z9;
                boolean z162 = z11;
                long j72 = j6;
                long D2 = lz.D(R.color.primary_default, av8Var2);
                if (z162) {
                }
                av8Var2.d0(656202388);
                av8Var2.d0(656198859);
                d2 = bkh.d(xtcVar, 1.0f);
                utcVar = utc.a;
                if (z12) {
                }
                z14 = z10;
                d2 = d2.z(n9e.q(utcVar, lz.D(R.color.primary_highlight, av8Var2), oyn.e));
                av8Var2.s(false);
                a99 a99Var2 = nf3.a;
                if (z12) {
                }
                av8Var2.s(false);
                z15 = ((29360128 & i8) != 8388608) | ((i8 & 14) != 4);
                O = av8Var2.O();
                if (!z15) {
                }
                O = new h84(29, function12, eo7Var);
                av8Var2.n0(O);
                y = tol.y(d2, z13, false, false, 0L, null, (Function0) O, av8Var2, 30);
                av8Var = av8Var2;
                if (!z13) {
                    y = y.z(u6h.C(utcVar, 0.5f));
                }
                p4h p4hVar2 = ww9.d;
                kv1 kv1Var2 = uxf.o;
                u23 a22 = t23.a(p4hVar2, kv1Var2, av8Var, 0);
                int hashCode5 = Long.hashCode(av8Var.T);
                aee m22 = av8Var.m();
                xtc C5 = fqj.C(av8Var, y);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                f50 f50Var4 = hf3.g;
                waa.K(av8Var, a22, f50Var4);
                ff3 ff3Var2 = hf3.f;
                waa.K(av8Var, m22, ff3Var2);
                Integer valueOf22 = Integer.valueOf(hashCode5);
                f50 f50Var22 = hf3.j;
                waa.K(av8Var, valueOf22, f50Var22);
                ry ryVar2 = hf3.k;
                waa.J(av8Var, ryVar2);
                long j82 = j5;
                f50 f50Var32 = hf3.d;
                waa.K(av8Var, C5, f50Var32);
                if (z14) {
                }
                lv1 lv1Var2 = uxf.m;
                xtc c02 = l98.c0(bkh.d(utcVar2, 1.0f), 16.0f, 12.0f);
                l8g a32 = k8g.a(ww9.b, lv1Var2, av8Var, i10);
                int hashCode22 = Long.hashCode(av8Var.T);
                aee m32 = av8Var.m();
                xtc C22 = fqj.C(av8Var, c02);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a32, f50Var4);
                waa.K(av8Var, m32, ff3Var2);
                bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                waa.K(av8Var, C22, f50Var32);
                xtc p22 = bkh.p(utcVar2, 32.0f);
                u23 a42 = t23.a(ww9.f, uxf.p, av8Var, 54);
                int hashCode32 = Long.hashCode(av8Var.T);
                aee m42 = av8Var.m();
                xtc C32 = fqj.C(av8Var, p22);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a42, f50Var4);
                waa.K(av8Var, m42, ff3Var2);
                bf3.s(hashCode32, av8Var, f50Var22, av8Var, ryVar2);
                waa.K(av8Var, C32, f50Var32);
                if (num3 == null) {
                }
                yf8 yf8Var3 = xth.a;
                int i162 = (i9 >> 9) & 896;
                fqj.a(p3, xth.g(), j82, null, null, av8Var, i162, 24);
                if (eo7Var.d() == 0) {
                }
                av8Var.s(true);
                nq8.h(av8Var, bkh.p(utcVar2, 16.0f));
                goa goaVar2 = new goa(1.0f, true);
                u23 a52 = t23.a(p4hVar2, kv1Var2, av8Var, i11);
                int hashCode42 = Long.hashCode(av8Var.T);
                aee m52 = av8Var.m();
                xtc C42 = fqj.C(av8Var, goaVar2);
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a52, f50Var4);
                waa.K(av8Var, m52, ff3Var2);
                bf3.s(hashCode42, av8Var, f50Var22, av8Var, ryVar2);
                waa.K(av8Var, C42, f50Var32);
                udj.c(eo7Var.h, null, j82, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, i162, 24960, 110586);
                nq8.h(av8Var, bkh.e(utcVar2, 4.0f));
                udj.c(eo7Var.f, null, j72, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, (i9 >> 12) & 896, 24960, 110586);
                j6 = j72;
                i.o(av8Var, true, utcVar2, 16.0f, av8Var);
                av8Var.d0(1410723069);
                it = gv9Var.iterator();
                while (it.hasNext()) {
                }
                ljg.t(av8Var, false, true, true);
                z7 = z12;
                z6 = z162;
                z8 = z14;
                j4 = j82;
            }
            final long j9 = j6;
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: t27
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int K = aba.K(i2 | 1);
                        int K2 = aba.K(i3);
                        yso.g(eo7.this, gv9Var, z, z2, xtcVar, j4, j9, function1, z7, z8, z6, (of3) obj, K, K2, i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i5 = i15;
        i6 = i4 & 1024;
        if (i6 == 0) {
        }
        if (av8Var2.T(i13 & 1, (i13 & 306783379) == 306783378 || (i7 & 3) != 2)) {
        }
        final long j92 = j6;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void h(z97 z97Var, Function1 function1, Function1 function12, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        function1.getClass();
        function12.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-898691795);
        int i3 = i2 | (av8Var.g(z97Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function0) ? 16384 : 8192) | (av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i4 = 1;
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = hz8.G(g.a, av8Var);
                av8Var.n0(O);
            }
            ku3 ku3Var = (ku3) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new e87(5);
                av8Var.n0(O2);
            }
            dfh g2 = ctc.g((Function1) O2, av8Var, 54, 0);
            int i5 = i3 >> 9;
            tz9.l(true, function0, xtcVar, false, g2, null, null, yqo.H(-2138470325, av8Var, new s87(ku3Var, g2, function0, i4)), yqo.H(283283434, av8Var, new d67(23, (Object) z97Var, (Object) function12, function1)), av8Var, (i5 & 112) | 113246214 | (i5 & 896), 104);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere((Object) z97Var, function1, (Object) function12, (Object) function0, (Object) xtcVar, i2, 6);
        }
    }

    public static final void i(int i2, int i3, of3 of3Var, xtc xtcVar, String str) {
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-595878986);
        int i4 = (av8Var.g(str) ? 4 : 2) | i3 | (av8Var.e(i2) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            kg0 kg0Var = ww9.f;
            lv1 lv1Var = uxf.m;
            xtc f0 = l98.f0(l98.d0(bkh.d(xtcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 5);
            l8g a2 = k8g.a(kg0Var, lv1Var, av8Var, 54);
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
            Integer valueOf = Integer.valueOf(i2);
            utc utcVar = utc.a;
            td4.i(valueOf, bkh.l(utcVar, 24.0f), av8Var, ((i4 >> 3) & 14) | 48);
            nq8.h(av8Var, bkh.p(utcVar, 16.0f));
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var, i4 & 14, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new yi7(str, i2, xtcVar, i3);
        }
    }

    public static final void j(boolean z, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1769028877);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            xtc c0 = l98.c0(n9e.q(xtcVar, lz.D(R.color.primary_default, av8Var), o7g.a(16.0f)), 8.0f, 4.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
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
            ImageVector N = s6a.N(R.drawable.ic_star_filled_16, 6, av8Var);
            long D = lz.D(R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            xtc l2 = bkh.l(utcVar, 16.0f);
            n7g n7gVar = o7g.a;
            kq9.b(N, null, l98.b0(o(wnn.A(l2, n7gVar), 0.75f, lz.D(R.color.on_color_primary, av8Var), n7gVar), 3.0f), D, av8Var, 48, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            yf8 yf8Var = xth.a;
            i4 = 1;
            udj.c(oea.v(z ? R.string.fantasy_manager_of_the_round : R.string.fantasy_top_manager, av8Var), null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            i4 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gs5(z, xtcVar, i2, i4);
        }
    }

    public static final void k(qp7 qp7Var, Function1 function1, of3 of3Var, int i2) {
        qp7Var.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-274026365);
        int i3 = (av8Var.i(qp7Var) ? 4 : 2) | i2 | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = qp7Var.a;
                av8Var.n0(O);
            }
            wkn.a(Boolean.valueOf(qp7Var.c), null, null, null, yqo.H(1124999362, av8Var, new hp7(qp7Var, function1, (ev6) O)), av8Var, 24576, 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ip7(qp7Var, function1, i2);
        }
    }

    public static final void l(vp7 vp7Var, Function2 function2, Function1 function1, Function1 function12, Function0 function0, Function0 function02, of3 of3Var, int i2) {
        int i3;
        vp7Var.getClass();
        function2.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1547681317);
        int i4 = i2 | (av8Var.i(vp7Var) ? 4 : 2) | (av8Var.i(function2) ? 32 : 16) | (av8Var.i(function1) ? 256 : 128) | (av8Var.i(function12) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.i(function0) ? 16384 : 8192) | (av8Var.i(function02) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            Context context = (Context) av8Var.k(nz.b);
            nn2 nn2Var = vp7Var.k;
            boolean i5 = ((i4 & 112) == 32) | ((i4 & 458752) == 131072) | av8Var.i(vp7Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i5 || O == a99Var) {
                O = new dr6(13, function02, vp7Var, function2);
                av8Var.n0(O);
            }
            w1a.c(nn2Var, null, (Function1) O, av8Var, 0, 14);
            qp7 k2 = vp7Var.k();
            boolean i6 = av8Var.i(vp7Var) | ((57344 & i4) == 16384) | av8Var.i(context) | ((i4 & 896) == 256) | ((i4 & 7168) == 2048);
            Object O2 = av8Var.O();
            if (i6 || O2 == a99Var) {
                i3 = 0;
                ke keVar = new ke(vp7Var, function0, context, function1, function12, 8);
                av8Var.n0(keVar);
                O2 = keVar;
            } else {
                i3 = 0;
            }
            k(k2, (Function1) O2, av8Var, i3);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e44(vp7Var, function2, function1, function12, function0, function02, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(boolean z, String str, String str2, boolean z2, xtc xtcVar, Function1 function1, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        Integer num;
        boolean z3;
        float f2;
        lv1 lv1Var;
        boolean z4;
        str2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(732278314);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.h(z2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.i(function1) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i4 = i3;
        if (av8Var2.T(i4 & 1, (i4 & 74899) != 74898)) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1341265700) {
                    if (hashCode != 1892536218) {
                        if (hashCode == 1956395263 && str.equals(WscStoriesResponseKt.TYPE_POST_GAME)) {
                            num = Integer.valueOf(wyh.x.contains(str2) ? R.string.tennis_post_match : R.string.postgame);
                            z3 = z && num != null;
                            xtc O = kda.O(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.darken_overlay_1, av8Var2), oyn.e), "highlight_cta_label", av8Var2);
                            lv1 lv1Var2 = uxf.m;
                            l8g a2 = k8g.a(!z3 ? ww9.b : ww9.f, lv1Var2, av8Var2, 48);
                            int hashCode2 = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C = fqj.C(av8Var2, O);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.q0();
                            } else {
                                av8Var2.l(zg3Var);
                            }
                            waa.K(av8Var2, a2, hf3.g);
                            waa.K(av8Var2, m2, hf3.f);
                            waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                            waa.J(av8Var2, hf3.k);
                            waa.K(av8Var2, C, hf3.d);
                            if (z3) {
                                av8Var = av8Var2;
                                f2 = 16.0f;
                                lv1Var = lv1Var2;
                                z4 = false;
                                av8Var.d0(900764732);
                                av8Var.s(false);
                            } else {
                                av8Var2.d0(900426150);
                                long D = lz.D(R.color.on_color_primary, av8Var2);
                                xtc O2 = kda.O(l98.c0(new goa(1.0f, true), 16.0f, 10.0f), "wsc_type", av8Var2);
                                String v = oea.v(num.intValue(), av8Var2);
                                yf8 yf8Var = xth.a;
                                f2 = 16.0f;
                                z4 = false;
                                lv1Var = lv1Var2;
                                udj.c(v, O2, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var2, 0, 0, 131064);
                                av8Var = av8Var2;
                                av8Var.s(false);
                            }
                            if (z2) {
                                av8Var.d0(901450204);
                                av8Var.s(z4);
                            } else {
                                av8Var.d0(900826205);
                                xtc O3 = kda.O(l98.c0(new nok(lv1Var), f2, 10.0f), "see_more_cta", av8Var);
                                String v2 = oea.v(R.string.see_more, av8Var);
                                bqh bqhVar = new bqh(s6a.N(R.drawable.ic_more_media, 6, av8Var), uxf.q);
                                boolean z5 = (i4 & 458752) == 131072 ? true : z4;
                                Object O4 = av8Var.O();
                                if (z5 || O4 == nf3.a) {
                                    O4 = new l77(20, function1);
                                    av8Var.n0(O4);
                                }
                                av8 av8Var3 = av8Var;
                                mha.h(v2, (Function0) O4, O3, uqh.a, bqhVar, false, false, false, 0L, 0, 0, av8Var3, 3072, 0, 2016);
                                av8Var = av8Var3;
                                av8Var.s(z4);
                            }
                            av8Var.s(true);
                        }
                    } else if (str.equals(WscStoriesResponseKt.TYPE_IN_GAME)) {
                        num = Integer.valueOf(R.string.ingame);
                        if (z) {
                        }
                        xtc O5 = kda.O(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.darken_overlay_1, av8Var2), oyn.e), "highlight_cta_label", av8Var2);
                        lv1 lv1Var22 = uxf.m;
                        l8g a22 = k8g.a(!z3 ? ww9.b : ww9.f, lv1Var22, av8Var2, 48);
                        int hashCode22 = Long.hashCode(av8Var2.T);
                        aee m22 = av8Var2.m();
                        xtc C2 = fqj.C(av8Var2, O5);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                        }
                        waa.K(av8Var2, a22, hf3.g);
                        waa.K(av8Var2, m22, hf3.f);
                        waa.K(av8Var2, Integer.valueOf(hashCode22), hf3.j);
                        waa.J(av8Var2, hf3.k);
                        waa.K(av8Var2, C2, hf3.d);
                        if (z3) {
                        }
                        if (z2) {
                        }
                        av8Var.s(true);
                    }
                } else if (str.equals(WscStoriesResponseKt.TYPE_PRE_GAME)) {
                    num = Integer.valueOf(R.string.pregame);
                    if (z) {
                    }
                    xtc O52 = kda.O(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.darken_overlay_1, av8Var2), oyn.e), "highlight_cta_label", av8Var2);
                    lv1 lv1Var222 = uxf.m;
                    l8g a222 = k8g.a(!z3 ? ww9.b : ww9.f, lv1Var222, av8Var2, 48);
                    int hashCode222 = Long.hashCode(av8Var2.T);
                    aee m222 = av8Var2.m();
                    xtc C22 = fqj.C(av8Var2, O52);
                    if3.k7.getClass();
                    zg3 zg3Var22 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                    }
                    waa.K(av8Var2, a222, hf3.g);
                    waa.K(av8Var2, m222, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode222), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C22, hf3.d);
                    if (z3) {
                    }
                    if (z2) {
                    }
                    av8Var.s(true);
                }
            }
            num = null;
            if (z) {
            }
            xtc O522 = kda.O(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.darken_overlay_1, av8Var2), oyn.e), "highlight_cta_label", av8Var2);
            lv1 lv1Var2222 = uxf.m;
            l8g a2222 = k8g.a(!z3 ? ww9.b : ww9.f, lv1Var2222, av8Var2, 48);
            int hashCode2222 = Long.hashCode(av8Var2.T);
            aee m2222 = av8Var2.m();
            xtc C222 = fqj.C(av8Var2, O522);
            if3.k7.getClass();
            zg3 zg3Var222 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
            }
            waa.K(av8Var2, a2222, hf3.g);
            waa.K(av8Var2, m2222, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode2222), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C222, hf3.d);
            if (z3) {
            }
            if (z2) {
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new i44(z, str, str2, z2, xtcVar, function1, i2);
        }
    }

    public static final void n(axj axjVar, vwj vwjVar, Object obj, Object obj2, j38 j38Var, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(867041821);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(axjVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(vwjVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? av8Var.g(obj) : av8Var.i(obj) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? av8Var.g(obj2) : av8Var.i(obj2) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? av8Var.g(j38Var) : av8Var.i(j38Var) ? 16384 : 8192;
        }
        if (!av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            av8Var.W();
        } else if (axjVar.i()) {
            vwjVar.g(obj, obj2, j38Var);
        } else {
            vwjVar.h(obj2, j38Var);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(axjVar, vwjVar, obj, obj2, j38Var, i2, 19);
        }
    }

    public static final xtc o(xtc xtcVar, float f2, long j2, uah uahVar) {
        return p(xtcVar, f2, new pvh(j2), uahVar);
    }

    public static final xtc p(xtc xtcVar, float f2, n52 n52Var, uah uahVar) {
        return xtcVar.z(new oz1(f2, n52Var, uahVar));
    }

    public static final th2 q(Function2 function2) {
        return new th2(function2, g.a, -2, a62.a);
    }

    public static final sn2 r(Function2 function2) {
        return new sn2(function2, g.a, -2, a62.a, 0);
    }

    public static final ComposeView s(Fragment fragment, tc3 tc3Var) {
        ComposeView composeView = new ComposeView(fragment.requireContext(), null, 6);
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(tc3Var);
        return composeView;
    }

    public static final ArrayList t(List list, int i2, w3f w3fVar) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            if (i3 == i2) {
                obj = w3fVar;
            }
            arrayList.add(obj);
            i3 = i4;
        }
        return arrayList;
    }

    public static AdError u(int i2, String str) {
        return new AdError(i2, str, "com.google.ads.mediation.inmobi");
    }

    public static final pwj v(axj axjVar, q4k q4kVar, String str, of3 of3Var, int i2, int i3) {
        owj owjVar;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean g2 = ((av8) of3Var).g(axjVar);
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (g2 || O == a99Var) {
            O = new pwj(axjVar, q4kVar, str);
            av8Var.n0(O);
        }
        pwj pwjVar = (pwj) O;
        boolean g3 = av8Var.g(axjVar) | av8Var.i(pwjVar);
        Object O2 = av8Var.O();
        if (g3 || O2 == a99Var) {
            O2 = new mwj(axjVar, pwjVar, false, 3);
            av8Var.n0(O2);
        }
        hz8.d(pwjVar, (Function1) O2, av8Var);
        if (axjVar.i() && (owjVar = (owj) ((eoh) pwjVar.b).getValue()) != null) {
            axj axjVar2 = pwjVar.c;
            owjVar.a.g(owjVar.c.invoke(axjVar2.f().b()), owjVar.c.invoke(axjVar2.f().a()), (j38) owjVar.b.invoke(axjVar2.f()));
        }
        return pwjVar;
    }

    public static final fqg w(ly3 ly3Var) {
        fqg fqgVar;
        ly3Var.getClass();
        qqg qqgVar = (qqg) ly3Var.a(l);
        Bundle bundle = null;
        if (qqgVar == null) {
            a70.p("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        ttk ttkVar = (ttk) ly3Var.a(m);
        if (ttkVar == null) {
            a70.p("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) ly3Var.a(n);
        String str = (String) ly3Var.a(dy0.m);
        if (str == null) {
            a70.p("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        mqg b2 = qqgVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        jqg jqgVar = b2 instanceof jqg ? (jqg) b2 : null;
        if (jqgVar == null) {
            a70.r("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = E(ttkVar).b;
        fqg fqgVar2 = (fqg) linkedHashMap.get(str);
        if (fqgVar2 != null) {
            return fqgVar2;
        }
        jqgVar.b();
        Bundle bundle3 = jqgVar.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                lm5.a.getClass();
                bundle4 = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                jqgVar.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            fqgVar = new fqg();
        } else {
            ClassLoader classLoader = fqg.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            fqgVar = new fqg(o3a.P(bundle2));
        }
        linkedHashMap.put(str, fqgVar);
        return fqgVar;
    }

    public static final vwj x(axj axjVar, Object obj, Object obj2, j38 j38Var, q4k q4kVar, of3 of3Var, int i2) {
        Object obj3;
        Object obj4;
        int i3 = i2 & 14;
        int i4 = i3 ^ 6;
        int i5 = 1;
        boolean z = false;
        boolean z2 = (i4 > 4 && ((av8) of3Var).g(axjVar)) || (i2 & 6) == 4;
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (z2 || O == a99Var) {
            nnh w = bea.w();
            Function1 e2 = w != null ? w.e() : null;
            nnh C = bea.C(w);
            try {
                obj3 = obj2;
                j80 j80Var = (j80) q4kVar.a.invoke(obj3);
                j80Var.d();
                obj4 = obj;
                vwj vwjVar = new vwj(axjVar, obj4, j80Var, q4kVar);
                bea.K(w, C, e2);
                av8Var.n0(vwjVar);
                O = vwjVar;
            } catch (Throwable th) {
                bea.K(w, C, e2);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        vwj vwjVar2 = (vwj) O;
        int i6 = (i2 >> 3) & 8;
        int i7 = i2 << 3;
        n(axjVar, vwjVar2, obj4, obj3, j38Var, av8Var, i3 | (i6 << 6) | (i7 & 896) | (i6 << 9) | (i7 & 7168) | (57344 & i7));
        boolean g2 = ((i4 > 4 && av8Var.g(axjVar)) || (i2 & 6) == 4) | av8Var.g(vwjVar2);
        Object O2 = av8Var.O();
        if (g2 || O2 == a99Var) {
            O2 = new mwj(axjVar, vwjVar2, z, i5);
            av8Var.n0(O2);
        }
        hz8.d(vwjVar2, (Function1) O2, av8Var);
        return vwjVar2;
    }

    public static final void y(qqg qqgVar) {
        e6b b2 = qqgVar.getLifecycle().b();
        if (b2 != e6b.b && b2 != e6b.c) {
            pvd.t("Failed to enable `SavedStateHandle` for `", qqgVar, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", b2, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (qqgVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            jqg jqgVar = new jqg(qqgVar.getSavedStateRegistry(), (ttk) qqgVar);
            qqgVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", jqgVar);
            qqgVar.getLifecycle().a(new nqf(jqgVar, 5));
        }
    }

    public static final Integer z(APIBuzzerTile aPIBuzzerTile) {
        String actionValue;
        List split$default;
        int action = aPIBuzzerTile.getAction();
        j82[] j82VarArr = j82.a;
        if (action == 5 || action == 7 || action == 24 || action == 8 || action == 13) {
            String actionValue2 = aPIBuzzerTile.getActionValue();
            if (actionValue2 != null) {
                return Integer.valueOf(Integer.parseInt(actionValue2));
            }
        } else if (action == 12 && (actionValue = aPIBuzzerTile.getActionValue()) != null) {
            if (!StringsKt.J(actionValue, "-", false)) {
                actionValue = null;
            }
            if (actionValue != null) {
                split$default = StringsKt__StringsKt.split$default(actionValue, new String[]{"-"}, false, 0, 6, null);
                String str = (String) ph0.A(split$default.toArray(new String[0]));
                if (str != null) {
                    return Integer.valueOf(Integer.parseInt(str));
                }
            }
        }
        return null;
    }
}
