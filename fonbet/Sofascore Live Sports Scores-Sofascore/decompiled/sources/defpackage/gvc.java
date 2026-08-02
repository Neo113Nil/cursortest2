package defpackage;

import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class gvc implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ b7 b;
    public final /* synthetic */ yp2 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TextPaint e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gv9 g;
    public final /* synthetic */ TextPaint h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ TextPaint j;
    public final /* synthetic */ long k;
    public final /* synthetic */ b7 l;
    public final /* synthetic */ lmk m;

    public /* synthetic */ gvc(b7 b7Var, yp2 yp2Var, long j, TextPaint textPaint, boolean z, gv9 gv9Var, TextPaint textPaint2, ArrayList arrayList, TextPaint textPaint3, long j2, b7 b7Var2, lmk lmkVar) {
        this.b = b7Var;
        this.c = yp2Var;
        this.d = j;
        this.e = textPaint;
        this.f = z;
        this.g = gv9Var;
        this.h = textPaint2;
        this.i = arrayList;
        this.j = textPaint3;
        this.k = j2;
        this.l = b7Var2;
        this.m = lmkVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int i;
        ArrayList arrayList;
        long j;
        int i2;
        yz0 yz0Var;
        Iterator it;
        boolean z;
        String str;
        switch (this.a) {
            case 0:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                b7 b7Var = this.b;
                yp2 yp2Var = this.c;
                long j2 = this.d;
                TextPaint textPaint = this.e;
                boolean z2 = this.f;
                cga.I(ha5Var, z2, new gvc(b7Var, yp2Var, j2, textPaint, z2, this.g, this.h, this.i, this.j, this.k, this.l, this.m));
                return Unit.a;
            default:
                yp2 yp2Var2 = this.c;
                gv9 gv9Var = yp2Var2.a;
                lmk lmkVar = this.m;
                ha5 ha5Var2 = (ha5) obj;
                ha5Var2.getClass();
                float H0 = ha5Var2.H0(4.0f);
                float f3 = 2.0f;
                float H02 = ha5Var2.H0(2.0f);
                float H03 = ha5Var2.H0(30.0f);
                float H04 = ha5Var2.H0(20.0f);
                float H05 = ha5Var2.H0(20.0f);
                float H06 = ha5Var2.H0(8.0f);
                float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) - H05;
                float intBitsToFloat2 = (((Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) - H03) - H0) - H02) - ha5Var2.H0(8.0f);
                float f4 = intBitsToFloat2 - H06;
                float f5 = intBitsToFloat2 + H02;
                b7 b7Var2 = this.b;
                float size = (intBitsToFloat - H04) / b7Var2.size();
                uj2 t = ha5Var2.L0().t();
                ListIterator<Object> listIterator = b7Var2.listIterator(0);
                int i3 = 0;
                while (true) {
                    boolean hasNext = listIterator.hasNext();
                    boolean z3 = this.f;
                    if (hasNext) {
                        Object next = listIterator.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            b.q();
                            throw null;
                        }
                        Pair pair = (Pair) next;
                        double doubleValue = ((Number) pair.a).doubleValue();
                        long j3 = ((r13) pair.b).a;
                        float f6 = (i3 * size) + H04;
                        lmk lmkVar2 = lmkVar;
                        float f7 = H04;
                        ha5Var2 = ha5Var2;
                        yp2 yp2Var3 = yp2Var2;
                        gv9 gv9Var2 = gv9Var;
                        ha5.o0(ha5Var2, j3, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(size) & 4294967295L) | (Float.floatToRawIntBits(H0) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                        int s0 = hkg.s0(j3);
                        TextPaint textPaint2 = this.e;
                        textPaint2.setColor(s0);
                        yqo.z(xx.b(t), String.format(dla.d(), doubleValue == 10.0d ? "%1d" : "%.1f", Arrays.copyOf(new Object[]{doubleValue == 10.0d ? Integer.valueOf((int) doubleValue) : Double.valueOf(doubleValue)}, 1)), ha5Var2.H0(4.0f) + f5 + H0, (textPaint2.getTextSize() / 3.0f) + (size / 2.0f) + f6, textPaint2, z3);
                        f3 = 2.0f;
                        i3 = i4;
                        lmkVar = lmkVar2;
                        H04 = f7;
                        yp2Var2 = yp2Var3;
                        gv9Var = gv9Var2;
                    } else {
                        yp2 yp2Var4 = yp2Var2;
                        gv9 gv9Var3 = gv9Var;
                        lmk lmkVar3 = lmkVar;
                        float f8 = f3;
                        float f9 = H04;
                        float f10 = f4 / 11.0f;
                        float f11 = f10 * 0.8f;
                        float f12 = f10 * 0.2f;
                        uj2 t2 = ha5Var2.L0().t();
                        Iterator it2 = this.g.iterator();
                        int i5 = 0;
                        while (true) {
                            boolean hasNext2 = it2.hasNext();
                            ArrayList arrayList2 = this.i;
                            long j4 = this.k;
                            if (!hasNext2) {
                                float f13 = f8;
                                float f14 = 0.1f;
                                float f15 = size * 0.1f;
                                int i6 = yp2Var4.b;
                                float f16 = 0.0f;
                                int i7 = 0;
                                for (Object obj2 : gv9Var3) {
                                    int i8 = i7 + 1;
                                    if (i7 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    yz0 yz0Var2 = (yz0) obj2;
                                    float f17 = (f12 / f13) + (i7 * f10) + H06;
                                    if (yz0Var2 != null) {
                                        f = f14;
                                        f2 = f10;
                                        double d = yz0Var2.a;
                                        b7 b7Var3 = this.l;
                                        ListIterator listIterator2 = b7Var3.listIterator(b7Var3.size());
                                        while (true) {
                                            if (!listIterator2.hasPrevious()) {
                                                i2 = -1;
                                            } else if (((Number) listIterator2.previous()).doubleValue() <= d) {
                                                i2 = listIterator2.nextIndex();
                                            }
                                        }
                                        double doubleValue2 = ((Number) ((i2 < 0 || i2 >= b7Var3.size()) ? Double.valueOf(3.5d) : b7Var3.get(i2))).doubleValue();
                                        int i9 = i2 + 1;
                                        double doubleValue3 = ((Number) ((i9 < 0 || i9 >= b7Var3.size()) ? Double.valueOf(10.0d) : b7Var3.get(i9))).doubleValue() - doubleValue2;
                                        float f18 = ((i9 * size) - size) + ((doubleValue3 > 0.0d ? (float) ((d - doubleValue2) / doubleValue3) : 0.0f) * size);
                                        if (f18 < f15) {
                                            f18 = f15;
                                        }
                                        float f19 = intBitsToFloat - f18;
                                        r13 r13Var = (r13) arrayList2.get(i7);
                                        if (i7 == i6) {
                                            f16 = (f11 * f) + f17;
                                        }
                                        if (r13Var != null) {
                                            long floatToRawIntBits = (Float.floatToRawIntBits(f19) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32);
                                            long floatToRawIntBits2 = (Float.floatToRawIntBits(f18) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
                                            j = j4;
                                            arrayList = arrayList2;
                                            i = i6;
                                            ha5.o0(ha5Var2, r13Var.a, floatToRawIntBits, floatToRawIntBits2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                                        } else {
                                            i = i6;
                                            arrayList = arrayList2;
                                            j = j4;
                                        }
                                    } else {
                                        f = f14;
                                        f2 = f10;
                                        i = i6;
                                        arrayList = arrayList2;
                                        j = j4;
                                        float H07 = ha5Var2.H0(1.0f);
                                        ha5.o0(ha5Var2, j, (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(intBitsToFloat - H07) & 4294967295L), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(H07) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                                    }
                                    i6 = i;
                                    arrayList2 = arrayList;
                                    i7 = i8;
                                    f14 = f;
                                    j4 = j;
                                    f10 = f2;
                                }
                                if (i6 != 0) {
                                    float H08 = ha5Var2.H0(20.0f);
                                    float f20 = f16 - (H08 / f13);
                                    float H09 = ha5Var2.H0(2.0f);
                                    long j5 = this.d;
                                    ha5.W0(ha5Var2, j5, (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(ha5Var2.H0(f13) + f9 + H08) & 4294967295L), (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), H09, 0, null, 496);
                                    ((hpo) ha5Var2.L0().a).I(f20, f9);
                                    try {
                                        try {
                                            sx2 L0 = ha5Var2.L0();
                                            long D = L0.D();
                                            L0.t().o();
                                            try {
                                                hpo hpoVar = (hpo) L0.a;
                                                if (z3) {
                                                    hpoVar.G(-1.0f, 1.0f, (Float.floatToRawIntBits(r2) << 32) | (Float.floatToRawIntBits(r2) & 4294967295L));
                                                }
                                                try {
                                                    d7e.h(lmkVar3, ha5Var2, (Float.floatToRawIntBits(H08) & 4294967295L) | (Float.floatToRawIntBits(H08) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new ay1(j5, 5), 2);
                                                    Unit unit = Unit.a;
                                                    L0.t().h();
                                                    L0.N(D);
                                                    ((hpo) ha5Var2.L0().a).I(-f20, -f9);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    L0.t().h();
                                                    L0.N(D);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            H08 = f9;
                                            ((hpo) ha5Var2.L0().a).I(-f20, -H08);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        ((hpo) ha5Var2.L0().a).I(-f20, -H08);
                                        throw th;
                                    }
                                }
                                return Unit.a;
                            }
                            Object next2 = it2.next();
                            int i10 = i5 + 1;
                            if (i5 < 0) {
                                b.q();
                                throw null;
                            }
                            float f21 = (f10 / f8) + (i5 * f10) + H06;
                            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                            float f22 = f8;
                            TextPaint textPaint3 = this.h;
                            uj2 uj2Var = t2;
                            xx.b(t2).drawText(TextUtils.ellipsize((String) next2, textPaint3, f10, truncateAt).toString(), f21, textPaint3.getTextSize(), textPaint3);
                            gv9 gv9Var4 = gv9Var3;
                            yz0 yz0Var3 = (yz0) CollectionsKt.a0(i5, gv9Var4);
                            if (yz0Var3 != null) {
                                it = it2;
                                double floor = Math.floor(yz0Var3.a * 10.0d) / 10.0d;
                                gv9Var3 = gv9Var4;
                                yz0Var = yz0Var3;
                                z = true;
                                str = String.format(dla.d(), floor == 10.0d ? "%1d" : "%.1f", Arrays.copyOf(new Object[]{floor == 10.0d ? Integer.valueOf((int) floor) : Double.valueOf(floor)}, 1));
                            } else {
                                gv9Var3 = gv9Var4;
                                yz0Var = yz0Var3;
                                it = it2;
                                z = true;
                                str = "-";
                            }
                            r13 r13Var2 = (r13) CollectionsKt.a0(i5, arrayList2);
                            TextPaint textPaint4 = this.j;
                            if (yz0Var == null || r13Var2 == null) {
                                textPaint4.setColor(hkg.s0(j4));
                            } else {
                                textPaint4.setColor(hkg.s0(r13Var2.a));
                            }
                            yqo.z(((wx) uj2Var).a, TextUtils.ellipsize(str, textPaint4, f10, truncateAt).toString(), f21, Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) - ha5Var2.H0(5.0f), textPaint4, z3);
                            it2 = it;
                            i5 = i10;
                            t2 = uj2Var;
                            f8 = f22;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ gvc(boolean z, b7 b7Var, yp2 yp2Var, long j, TextPaint textPaint, gv9 gv9Var, TextPaint textPaint2, ArrayList arrayList, TextPaint textPaint3, long j2, b7 b7Var2, lmk lmkVar) {
        this.f = z;
        this.b = b7Var;
        this.c = yp2Var;
        this.d = j;
        this.e = textPaint;
        this.g = gv9Var;
        this.h = textPaint2;
        this.i = arrayList;
        this.j = textPaint3;
        this.k = j2;
        this.l = b7Var2;
        this.m = lmkVar;
    }
}
