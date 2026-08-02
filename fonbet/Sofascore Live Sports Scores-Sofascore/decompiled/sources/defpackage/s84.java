package defpackage;

import android.webkit.WebResourceResponse;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s84 extends xka implements Function1 {
    public static final s84 A;
    public static final s84 B;
    public static final s84 C;
    public static final s84 D;
    public static final s84 E;
    public static final s84 F;
    public static final s84 G;
    public static final s84 H;
    public static final s84 I;
    public static final s84 J;
    public static final s84 K;
    public static final s84 L;
    public static final s84 M;
    public static final s84 j;
    public static final s84 k;
    public static final s84 l;
    public static final s84 m;
    public static final s84 n;
    public static final s84 o;
    public static final s84 p;
    public static final s84 q;
    public static final s84 r;
    public static final s84 s;
    public static final s84 t;
    public static final s84 u;
    public static final s84 v;
    public static final s84 w;
    public static final s84 x;
    public static final s84 y;
    public static final s84 z;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new s84(i, 0);
        k = new s84(i, 1);
        l = new s84(i, 2);
        m = new s84(i, 3);
        n = new s84(i, 4);
        o = new s84(i, 5);
        p = new s84(i, 6);
        q = new s84(i, 7);
        r = new s84(i, 8);
        s = new s84(i, 9);
        t = new s84(i, 10);
        u = new s84(i, 11);
        v = new s84(i, 12);
        w = new s84(i, 13);
        x = new s84(i, 14);
        y = new s84(i, 15);
        z = new s84(i, 16);
        A = new s84(i, 17);
        B = new s84(i, 18);
        C = new s84(i, 19);
        D = new s84(i, 20);
        E = new s84(i, 21);
        F = new s84(i, 22);
        G = new s84(i, 23);
        H = new s84(i, 24);
        I = new s84(i, 25);
        J = new s84(i, 26);
        K = new s84(i, 27);
        L = new s84(i, 28);
        M = new s84(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s84(int i, int i2) {
        super(i);
        this.i = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d8  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        rk5 rk5Var;
        ic icVar;
        rk5 rk5Var2;
        Iterator it;
        Iterator it2;
        vy8 d;
        vy8 d2;
        boolean z2 = true;
        z2 = true;
        z2 = true;
        switch (this.i) {
            case 0:
                float[] fArr = ((xzb) obj).a;
                return Unit.a;
            case 1:
                float[] fArr2 = ((xzb) obj).a;
                return Unit.a;
            case 2:
                return Boolean.valueOf(ao2.m(obj));
            case 3:
                long j2 = ((xvj) obj).a;
                return new g80(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 4:
                g80 g80Var = (g80) obj;
                return new xvj(uaa.h(g80Var.a, g80Var.b));
            case 5:
                return s02.e0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
            case 6:
                long j3 = ((c7a) obj).a;
                return new c7a(0L);
            case 7:
                long j4 = ((c7a) obj).a;
                return new c7a(0L);
            case 8:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 9:
                return uo5.c;
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return Unit.a;
            case 13:
                ha5.o0((ha5) obj, r13.h, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return Unit.a;
            case 14:
                she sheVar = (she) obj;
                if (sheVar.u0()) {
                    tkb tkbVar = sheVar.b;
                    if (!tkbVar.k) {
                        Function1 c = sheVar.a.c();
                        x0d x0dVar = tkbVar.n;
                        if (c != null) {
                            tkbVar.q0(sheVar, 9223372034707292159L, 0L);
                            tkbVar.g = c;
                        } else if (x0dVar != null) {
                            Object[] objArr = x0dVar.c;
                            long[] jArr = x0dVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j5 = jArr[i];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = 8 - ((~(i - length)) >>> 31);
                                        for (int i3 = 0; i3 < i2; i3++) {
                                            if ((255 & j5) < 128) {
                                                tkbVar.K0((y0d) objArr[(i << 3) + i3]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i2 != 8) {
                                        }
                                    }
                                    if (i != length) {
                                        i++;
                                    }
                                }
                            }
                            x0dVar.a();
                        }
                    }
                }
                return Unit.a;
            case 15:
                ((String) obj).getClass();
                Charset charset = Charsets.UTF_8;
                byte[] bytes = "".getBytes(charset);
                bytes.getClass();
                return new WebResourceResponse("text/javascript", charset.name(), new ByteArrayInputStream(bytes));
            case 16:
                qyd qydVar = ((wdd) obj).L;
                if (qydVar != null) {
                    ((q29) qydVar).c();
                }
                return Unit.a;
            case 17:
                wdd wddVar = (wdd) obj;
                wma wmaVar = wddVar.o;
                try {
                    if (wddVar.u0()) {
                        wddVar.E1(true);
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    wmaVar.Y(th);
                    throw null;
                }
            case 18:
                return Boolean.valueOf(((uy8) obj) instanceof ic);
            case 19:
                uy8 uy8Var = (uy8) obj;
                if (!(uy8Var instanceof a8l) && !(uy8Var instanceof q99) && !(uy8Var instanceof tt3)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 20:
                mk5 mk5Var = (mk5) obj;
                boolean z3 = mk5Var instanceof tk5;
                if (z3) {
                    tk5 tk5Var = (tk5) mk5Var;
                    ArrayList arrayList = tk5Var.c;
                    nk5 nk5Var = new nk5();
                    o13.v(arrayList, nk5Var.c);
                    nk5Var.e = tk5Var.d;
                    nk5Var.d = tk5Var.e;
                    arrayList.clear();
                    arrayList.add(nk5Var);
                    tk5Var.d = ho.d;
                }
                if (z3 || (mk5Var instanceof vk5)) {
                    return mk5Var;
                }
                if (!mk5Var.b().c(new tyd(true ? 1 : 0, 19))) {
                    return mk5Var;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                vy8 b = mk5Var.b();
                boolean c2 = b.c(E);
                vy8 vy8Var = ty8.a;
                Pair pair = c2 ? (Pair) b.a(new Pair(null, vy8Var), ff3.L) : new Pair(null, b);
                gy0 gy0Var = (gy0) pair.a;
                vy8 vy8Var2 = (vy8) pair.b;
                if (gy0Var != null) {
                    if (gy0Var instanceof fy0) {
                        rk5Var = new rk5();
                        rk5Var.a = nq8.z(vy8Var);
                        rk5Var.b = ((fy0) gy0Var).a;
                        rk5Var.d = 2;
                        rk5Var.c = null;
                        ((Number) vy8Var2.a(0, ned.j)).intValue();
                        Pair pair2 = !vy8Var2.c(F) ? (Pair) vy8Var2.a(new Pair(null, vy8Var), ff3.M) : new Pair(null, vy8Var2);
                        icVar = (ic) pair2.a;
                        vy8 vy8Var3 = (vy8) pair2.b;
                        arrayList2.add(icVar);
                        if (icVar == null) {
                            v20 v20Var = new v20(R.drawable.glance_ripple);
                            rk5Var2 = new rk5();
                            rk5Var2.a = nq8.z(vy8Var);
                            rk5Var2.b = v20Var;
                        } else {
                            rk5Var2 = null;
                        }
                        jl6 jl6Var = !vy8Var3.c(C) ? (jl6) vy8Var3.a(new jl6((vy8) null, 3), ff3.G) : new jl6(vy8Var3, 1);
                        vy8 vy8Var4 = jl6Var.a;
                        vy8 vy8Var5 = jl6Var.b;
                        arrayList2.add(vy8Var4);
                        arrayList3.add(nq8.z(vy8Var5));
                        nk5 nk5Var2 = new nk5();
                        it = arrayList2.iterator();
                        vy8 vy8Var6 = vy8Var;
                        while (it.hasNext()) {
                            vy8 vy8Var7 = (vy8) it.next();
                            if (vy8Var7 != null && (d2 = vy8Var6.d(vy8Var7)) != null) {
                                vy8Var6 = d2;
                            }
                        }
                        nk5Var2.d = vy8Var6;
                        it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            vy8 vy8Var8 = (vy8) it2.next();
                            if (vy8Var8 != null && (d = vy8Var.d(vy8Var8)) != null) {
                                vy8Var = d;
                            }
                        }
                        mk5Var.a(vy8Var);
                        ArrayList arrayList4 = nk5Var2.c;
                        if (rk5Var != null) {
                            arrayList4.add(rk5Var);
                        }
                        arrayList4.add(mk5Var);
                        if (rk5Var2 != null) {
                            arrayList4.add(rk5Var2);
                        }
                        return nk5Var2;
                    }
                    if (gy0Var instanceof ey0) {
                        arrayList3.add(gy0Var);
                    }
                }
                rk5Var = null;
                ((Number) vy8Var2.a(0, ned.j)).intValue();
                if (!vy8Var2.c(F)) {
                }
                icVar = (ic) pair2.a;
                vy8 vy8Var32 = (vy8) pair2.b;
                arrayList2.add(icVar);
                if (icVar == null) {
                }
                if (!vy8Var32.c(C)) {
                }
                vy8 vy8Var42 = jl6Var.a;
                vy8 vy8Var52 = jl6Var.b;
                arrayList2.add(vy8Var42);
                arrayList3.add(nq8.z(vy8Var52));
                nk5 nk5Var22 = new nk5();
                it = arrayList2.iterator();
                vy8 vy8Var62 = vy8Var;
                while (it.hasNext()) {
                }
                nk5Var22.d = vy8Var62;
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                }
                mk5Var.a(vy8Var);
                ArrayList arrayList42 = nk5Var22.c;
                if (rk5Var != null) {
                }
                arrayList42.add(mk5Var);
                if (rk5Var2 != null) {
                }
                return nk5Var22;
            case 21:
                return Boolean.valueOf(((uy8) obj) instanceof gy0);
            case 22:
                return Boolean.valueOf(((uy8) obj) instanceof ic);
            case 23:
                ukd ukdVar = (ukd) obj;
                if (ukdVar.u0()) {
                    ukdVar.a.Z();
                }
                return Unit.a;
            case 24:
                wma wmaVar2 = (wma) obj;
                if (wmaVar2.H()) {
                    wmaVar2.U(false);
                }
                return Unit.a;
            case 25:
                wma wmaVar3 = (wma) obj;
                if (wmaVar3.H()) {
                    wmaVar3.U(false);
                }
                return Unit.a;
            case 26:
                wma wmaVar4 = (wma) obj;
                if (wmaVar4.H()) {
                    wmaVar4.S(false);
                }
                return Unit.a;
            case 27:
                wma wmaVar5 = (wma) obj;
                if (wmaVar5.H()) {
                    wmaVar5.S(false);
                }
                return Unit.a;
            case 28:
                wma wmaVar6 = (wma) obj;
                if (wmaVar6.H()) {
                    wma.T(wmaVar6, false, 7);
                }
                return Unit.a;
            default:
                wma wmaVar7 = (wma) obj;
                if (wmaVar7.H()) {
                    wma.V(wmaVar7, false, 7);
                }
                return Unit.a;
        }
    }
}
