package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rtj implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zp2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ c20 f;
    public final /* synthetic */ TextPaint g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ gv9 j;
    public final /* synthetic */ gv9 k;
    public final /* synthetic */ List l;
    public final /* synthetic */ float m;
    public final /* synthetic */ lmk n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Integer p;
    public final /* synthetic */ long q;
    public final /* synthetic */ long r;

    public /* synthetic */ rtj(int i, boolean z, zp2 zp2Var, int i2, long j, c20 c20Var, TextPaint textPaint, int i3, gv9 gv9Var, gv9 gv9Var2, List list, float f, lmk lmkVar, long j2, Integer num, long j3, long j4) {
        this.c = i;
        this.h = z;
        this.b = zp2Var;
        this.d = i2;
        this.e = j;
        this.f = c20Var;
        this.g = textPaint;
        this.i = i3;
        this.j = gv9Var;
        this.k = gv9Var2;
        this.l = list;
        this.m = f;
        this.n = lmkVar;
        this.o = j2;
        this.p = num;
        this.q = j3;
        this.r = j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v38, types: [km5] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sx2 sx2Var;
        long j;
        int intValue;
        int i;
        ha5 ha5Var;
        Iterator it;
        float f;
        List list;
        aq2 aq2Var;
        zp2 zp2Var;
        long j2;
        ha5 ha5Var2;
        int i2;
        tui tuiVar;
        long j3;
        ?? arrayList;
        sx2 sx2Var2;
        int i3;
        long floatToRawIntBits;
        long j4;
        int i4;
        int i5;
        switch (this.a) {
            case 0:
                ha5 ha5Var3 = (ha5) obj;
                ha5Var3.getClass();
                int i6 = this.c;
                if (i6 <= 1) {
                    return Unit.a;
                }
                zp2 zp2Var2 = this.b;
                int i7 = this.d;
                long j5 = this.e;
                c20 c20Var = this.f;
                TextPaint textPaint = this.g;
                boolean z = this.h;
                cga.I(ha5Var3, z, new rtj(zp2Var2, i7, i6, j5, c20Var, textPaint, z, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r));
                return Unit.a;
            default:
                gv9 gv9Var = this.k;
                List list2 = this.l;
                lmk lmkVar = this.n;
                long j6 = this.o;
                ha5 ha5Var4 = (ha5) obj;
                ha5Var4.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var4.n() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var4.n() & 4294967295L));
                zp2 zp2Var3 = this.b;
                int i8 = this.c;
                int i9 = this.d;
                aq2 aq2Var2 = new aq2(zp2Var3, intBitsToFloat, intBitsToFloat2, i8, i9);
                int i10 = i8;
                float f2 = zp2Var3.j;
                int i11 = 0;
                while (true) {
                    TextPaint textPaint2 = this.g;
                    boolean z2 = this.h;
                    float f3 = f2;
                    float f4 = aq2Var2.e;
                    float f5 = aq2Var2.c;
                    if (i11 < i9) {
                        int i12 = i11 + 1;
                        boolean z3 = i11 == 0;
                        lmk lmkVar2 = lmkVar;
                        int i13 = aq2Var2.b;
                        boolean z4 = i12 == i13;
                        int i14 = this.i;
                        boolean z5 = i12 % i14 == 0;
                        boolean z6 = i13 - i12 < i14 / 2;
                        if (z3 || z4 || (z5 && !z6)) {
                            float a = aq2Var2.a(i12);
                            i5 = i12;
                            ha5.W0(ha5Var4, this.e, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(a) & 4294967295L), (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(a) & 4294967295L), zp2Var3.f, 0, this.f, 464);
                            String valueOf = String.valueOf(i5);
                            textPaint2.getTextBounds(valueOf, 0, valueOf.length(), new Rect());
                            b6a.m(xx.b(ha5Var4.L0().t()), valueOf, zp2Var3.a - zp2Var3.g, (r8.height() / 2.0f) + a, textPaint2, z2);
                        } else {
                            i5 = i12;
                        }
                        f2 = f3;
                        lmkVar = lmkVar2;
                        i11 = i5;
                    } else {
                        lmk lmkVar3 = lmkVar;
                        int i15 = 0;
                        while (i15 < i10) {
                            if (i15 != 0 && (i4 = i15 + 1) != i10) {
                                int i16 = i10 <= 10 ? 1 : i10 < 20 ? 2 : 5;
                                boolean z7 = i10 < 20 ? i15 % i16 == 0 : i4 % i16 == 0;
                                boolean z8 = i10 > 10 && i15 + 2 == i10;
                                boolean z9 = i10 >= 20 && i15 + 3 == i10;
                                if (z7) {
                                    if (!z8) {
                                        if (z9) {
                                        }
                                    }
                                }
                                i15++;
                            }
                            String str = (String) CollectionsKt.a0(i15, this.j);
                            if (str == null) {
                                str = String.valueOf(i15 + 1);
                            }
                            float f6 = aq2Var2.j;
                            if (f6 < 1.0f) {
                                f6 = 1.0f;
                            }
                            String obj2 = TextUtils.ellipsize(str, textPaint2, f6, TextUtils.TruncateAt.END).toString();
                            Paint.Align textAlign = textPaint2.getTextAlign();
                            textPaint2.setTextAlign(i15 == 0 ? Paint.Align.LEFT : i15 + 1 == i10 ? Paint.Align.RIGHT : Paint.Align.CENTER);
                            b6a.m(xx.b(ha5Var4.L0().t()), obj2, aq2Var2.b(i15), aq2Var2.f + zp2Var3.h, textPaint2, z2);
                            textPaint2.setTextAlign(textAlign);
                            i15++;
                        }
                        float f7 = (aq2Var2.i * this.m) + f5;
                        float f8 = zp2Var3.e;
                        float f9 = (f5 - f3) - f8;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var4.n() & 4294967295L));
                        sx2 L0 = ha5Var4.L0();
                        long D = L0.D();
                        L0.t().o();
                        try {
                            ((hpo) L0.a).q(f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7, intBitsToFloat3, 1);
                            Iterator it2 = CollectionsKt.L0(gv9Var, 4).iterator();
                            int i17 = 0;
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                int i18 = i17 + 1;
                                if (i17 < 0) {
                                    b.q();
                                    throw null;
                                }
                                tui tuiVar2 = (tui) next;
                                gv9 gv9Var2 = tuiVar2.a;
                                if (gv9Var2.isEmpty()) {
                                    it = it2;
                                    f = f8;
                                    list = list2;
                                    sx2Var = L0;
                                    aq2Var = aq2Var2;
                                    zp2Var = zp2Var3;
                                    j2 = j6;
                                    ha5Var2 = ha5Var4;
                                    i2 = i10;
                                } else {
                                    it = it2;
                                    f = f8;
                                    long j7 = ((r13) list2.get(i17)).a;
                                    if (gv9Var2.size() == 1) {
                                        tuiVar = tuiVar2;
                                        j3 = j7;
                                        ha5.U(ha5Var4, j3, f * 2.0f, (Float.floatToRawIntBits(aq2Var2.b(0)) << 32) | (Float.floatToRawIntBits(aq2Var2.a(((Number) gv9Var2.get(0)).intValue())) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                        list = list2;
                                        sx2Var2 = L0;
                                        i3 = i10;
                                    } else {
                                        tuiVar = tuiVar2;
                                        j3 = j7;
                                        Iterator it3 = gv9Var2.iterator();
                                        if (it3.hasNext()) {
                                            arrayList = new ArrayList();
                                            list = list2;
                                            Object next2 = it3.next();
                                            while (it3.hasNext()) {
                                                sx2 sx2Var3 = L0;
                                                try {
                                                    Object next3 = it3.next();
                                                    int i19 = i10;
                                                    arrayList.add(new Pair(next2, next3));
                                                    next2 = next3;
                                                    L0 = sx2Var3;
                                                    i10 = i19;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    sx2Var = sx2Var3;
                                                    j = D;
                                                    mz1.v(sx2Var, j);
                                                    throw th;
                                                }
                                            }
                                        } else {
                                            arrayList = km5.a;
                                            list = list2;
                                        }
                                        sx2Var2 = L0;
                                        i3 = i10;
                                        Iterator it4 = arrayList.iterator();
                                        int i20 = 0;
                                        while (true) {
                                            if (it4.hasNext()) {
                                                Object next4 = it4.next();
                                                int i21 = i20 + 1;
                                                if (i20 < 0) {
                                                    b.q();
                                                    throw null;
                                                }
                                                Pair pair = (Pair) next4;
                                                ha5.W0(ha5Var4, j3, (Float.floatToRawIntBits(aq2Var2.b(i20)) << 32) | (Float.floatToRawIntBits(aq2Var2.a(((Number) pair.a).intValue())) & 4294967295L), (Float.floatToRawIntBits(aq2Var2.b(i21)) << 32) | (Float.floatToRawIntBits(aq2Var2.a(((Number) pair.b).intValue())) & 4294967295L), zp2Var3.e, 1, null, 480);
                                                i20 = i21;
                                                it4 = it4;
                                            }
                                        }
                                    }
                                    try {
                                        if (tuiVar.b) {
                                            float b = aq2Var2.b(gv9Var2.size() - 1);
                                            float a2 = aq2Var2.a(((Number) CollectionsKt.h0(gv9Var2)).intValue());
                                            ha5.U(ha5Var4, j3, zp2Var3.j, (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(a2) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 120);
                                            float f10 = (f3 * 1.5f) / 2.0f;
                                            float f11 = b - f10;
                                            float f12 = a2 - f10;
                                            ((hpo) ha5Var4.L0().a).I(f11, f12);
                                            try {
                                                floatToRawIntBits = (Float.floatToRawIntBits(r8) << 32) | (Float.floatToRawIntBits(r8) & 4294967295L);
                                                j4 = D;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            try {
                                                ay1 ay1Var = new ay1(j6, 5);
                                                j2 = j6;
                                                j = j4;
                                                zp2Var = zp2Var3;
                                                sx2Var = sx2Var2;
                                                aq2Var = aq2Var2;
                                                ha5Var2 = ha5Var4;
                                                i2 = i3;
                                                try {
                                                    d7e.h(lmkVar3, ha5Var2, floatToRawIntBits, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var, 2);
                                                    try {
                                                        ((hpo) ha5Var2.L0().a).I(-f11, -f12);
                                                        D = j;
                                                        i10 = i2;
                                                        L0 = sx2Var;
                                                        j6 = j2;
                                                        i17 = i18;
                                                        f8 = f;
                                                        it2 = it;
                                                        zp2Var3 = zp2Var;
                                                        ha5Var4 = ha5Var2;
                                                        aq2Var2 = aq2Var;
                                                        list2 = list;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        mz1.v(sx2Var, j);
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    ((hpo) ha5Var2.L0().a).I(-f11, -f12);
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                ha5Var2 = ha5Var4;
                                                ((hpo) ha5Var2.L0().a).I(-f11, -f12);
                                                throw th;
                                            }
                                        } else {
                                            aq2Var = aq2Var2;
                                            zp2Var = zp2Var3;
                                            j2 = j6;
                                            ha5Var2 = ha5Var4;
                                            sx2Var = sx2Var2;
                                            i2 = i3;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        j = D;
                                        sx2Var = sx2Var2;
                                    }
                                }
                                j = D;
                                D = j;
                                i10 = i2;
                                L0 = sx2Var;
                                j6 = j2;
                                i17 = i18;
                                f8 = f;
                                it2 = it;
                                zp2Var3 = zp2Var;
                                ha5Var4 = ha5Var2;
                                aq2Var2 = aq2Var;
                                list2 = list;
                            }
                            aq2 aq2Var3 = aq2Var2;
                            zp2 zp2Var4 = zp2Var3;
                            ha5 ha5Var5 = ha5Var4;
                            int i22 = i10;
                            mz1.v(L0, D);
                            Integer num = this.p;
                            if (num != null && 1 <= (intValue = num.intValue()) && intValue <= i22) {
                                float b2 = aq2Var3.b(num.intValue() - 1);
                                float f13 = aq2Var3.h;
                                float f14 = aq2Var3.g;
                                if (b2 < f4) {
                                    i = i22;
                                    ha5Var = ha5Var5;
                                    ha5.o0(ha5Var, this.q, (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(f4 - b2) << 32) | (Float.floatToRawIntBits(f13 - f14) & 4294967295L), 0.65f, null, null, 112);
                                } else {
                                    i = i22;
                                    ha5Var = ha5Var5;
                                }
                                if (num.intValue() < i) {
                                    ha5.W0(ha5Var, this.r, (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), zp2Var4.k, 0, null, 496);
                                }
                            }
                            return Unit.a;
                        } catch (Throwable th7) {
                            th = th7;
                            sx2Var = L0;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ rtj(zp2 zp2Var, int i, int i2, long j, c20 c20Var, TextPaint textPaint, boolean z, int i3, gv9 gv9Var, gv9 gv9Var2, List list, float f, lmk lmkVar, long j2, Integer num, long j3, long j4) {
        this.b = zp2Var;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = c20Var;
        this.g = textPaint;
        this.h = z;
        this.i = i3;
        this.j = gv9Var;
        this.k = gv9Var2;
        this.l = list;
        this.m = f;
        this.n = lmkVar;
        this.o = j2;
        this.p = num;
        this.q = j3;
        this.r = j4;
    }
}
