package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hb8 implements g8g {
    public final boolean a;
    public final lg0 b;
    public final pg0 c;
    public final float d;
    public final c5n e;
    public final float f;
    public final int g;
    public final fb8 h;

    public hb8(boolean z, lg0 lg0Var, pg0 pg0Var, float f, c5n c5nVar, float f2, int i, fb8 fb8Var) {
        this.a = z;
        this.b = lg0Var;
        this.c = pg0Var;
        this.d = f;
        this.e = c5nVar;
        this.f = f2;
        this.g = i;
        this.h = fb8Var;
    }

    public final int a(List list, int i, int i2, int i3, int i4, fb8 fb8Var) {
        boolean z;
        int i5;
        boolean z2;
        long a = k6a.a(0, 0);
        if (!list.isEmpty()) {
            int i6 = Integer.MAX_VALUE;
            bb8 bb8Var = new bb8(i4, fb8Var, cn3.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            g1c g1cVar = (g1c) CollectionsKt.a0(0, list);
            boolean z3 = this.a;
            int s = g1cVar != null ? z3 ? g1cVar.s(i) : g1cVar.B(i) : 0;
            int B = g1cVar != null ? z3 ? g1cVar.B(s) : g1cVar.s(s) : 0;
            boolean z4 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            int i7 = 0;
            if (bb8Var.b(z4, 0, k6a.a(i, Integer.MAX_VALUE), g1cVar == null ? null : new k6a(k6a.a(B, s)), 0, 0, 0, false, false).b) {
                fb8Var.getClass();
                db8 db8Var = db8.a;
                a = a;
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    int i14 = i8 - B;
                    int i15 = i11 + 1;
                    int max = Math.max(i10, s);
                    g1c g1cVar2 = (g1c) CollectionsKt.a0(i15, list);
                    s = g1cVar2 != null ? z3 ? g1cVar2.s(i) : g1cVar2.B(i) : 0;
                    if (g1cVar2 != null) {
                        i5 = (z3 ? g1cVar2.B(s) : g1cVar2.s(s)) + i2;
                    } else {
                        i5 = 0;
                    }
                    if (i11 + 2 < list.size()) {
                        i11 = i15;
                        z2 = z;
                    } else {
                        i11 = i15;
                        z2 = false;
                    }
                    int i16 = i11 - i13;
                    int i17 = i9;
                    int i18 = i5;
                    ab8 b = bb8Var.b(z2, i16, k6a.a(i14, i6), g1cVar2 == null ? null : new k6a(k6a.a(i5, s)), i17, i7, max, false, false);
                    if (b.a) {
                        int i19 = max + i3 + i7;
                        bb8Var.a(b, g1cVar2 != null, i17, i19, i14, i16);
                        int i20 = i18 - i2;
                        i9 = i17 + 1;
                        if (b.b) {
                            i12 = i11;
                            i7 = i19;
                            break;
                        }
                        i8 = i;
                        i13 = i11;
                        B = i20;
                        i7 = i19;
                        i10 = 0;
                    } else {
                        B = i18;
                        i8 = i14;
                        i9 = i17;
                        i10 = max;
                    }
                    i12 = i11;
                    i6 = Integer.MAX_VALUE;
                    z = true;
                }
                a = k6a.a(i7 - i3, i12);
            }
        }
        return (int) (a >> 32);
    }

    @Override // defpackage.g8g
    public final void b(int i, int[] iArr, int[] iArr2, m1c m1cVar) {
        if (this.a) {
            this.b.j(m1cVar, i, iArr, m1cVar.getLayoutDirection(), iArr2);
        } else {
            this.c.b(m1cVar, i, iArr, iArr2);
        }
    }

    @Override // defpackage.g8g
    public final l1c c(final qhe[] qheVarArr, m1c m1cVar, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        boolean z = this.a;
        if (z) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
        }
        final ema layoutDirection = z ? ema.a : m1cVar.getLayoutDirection();
        return m1c.G0(m1cVar, i8, i7, new Function1() { // from class: gb8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                c5n c5nVar;
                phe pheVar = (phe) obj;
                int[] iArr3 = iArr2;
                int i9 = iArr3 != null ? iArr3[i4] : 0;
                int i10 = i5;
                for (int i11 = i10; i11 < i6; i11++) {
                    qhe qheVar = qheVarArr[i11];
                    qheVar.getClass();
                    Object h = qheVar.h();
                    h8g h8gVar = h instanceof h8g ? (h8g) h : null;
                    hb8 hb8Var = this;
                    if (h8gVar == null || (c5nVar = h8gVar.c) == null) {
                        c5nVar = hb8Var.e;
                    }
                    int s = c5nVar.s(i3, hb8Var.e(qheVar), layoutDirection, qheVar, i) + i9;
                    boolean z2 = hb8Var.a;
                    int[] iArr4 = iArr;
                    if (z2) {
                        pheVar.e(qheVar, iArr4[i11 - i10], s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else {
                        pheVar.e(qheVar, s, iArr4[i11 - i10], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                return Unit.a;
            }
        });
    }

    public final int d(int i, int i2, List list) {
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < size) {
            g1c g1cVar = (g1c) list.get(i3);
            int G = (this.a ? g1cVar.G(i) : g1cVar.b(i)) + i2;
            int i7 = i3 + 1;
            if (i7 - i5 == this.g || i7 == list.size()) {
                i4 = Math.max(i4, (i6 + G) - i2);
                i6 = 0;
                i5 = i3;
            } else {
                i6 += G;
            }
            i3 = i7;
        }
        return i4;
    }

    @Override // defpackage.g8g
    public final int e(qhe qheVar) {
        return this.a ? qheVar.S() : qheVar.V();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb8)) {
            return false;
        }
        hb8 hb8Var = (hb8) obj;
        return this.a == hb8Var.a && this.b.equals(hb8Var.b) && this.c.equals(hb8Var.c) && p75.b(this.d, hb8Var.d) && this.e.equals(hb8Var.e) && p75.b(this.f, hb8Var.f) && this.g == hb8Var.g && Intrinsics.c(this.h, hb8Var.h);
    }

    @Override // defpackage.g8g
    public final int f(qhe qheVar) {
        return this.a ? qheVar.V() : qheVar.S();
    }

    @Override // defpackage.g8g
    public final long g(int i, int i2, int i3, boolean z) {
        if (this.a) {
            l8g l8gVar = k8g.a;
            return !z ? cn3.a(i, i2, 0, i3) : pco.E(i, i2, 0, i3);
        }
        u23 u23Var = t23.a;
        return !z ? cn3.a(0, i3, i, i2) : pco.D(0, i3, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(List list, int i, int i2, int i3, int i4, fb8 fb8Var) {
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        long a;
        k6a k6aVar;
        List list2 = list;
        int i9 = 0;
        long a2 = k6a.a(0, 0);
        if (list2.isEmpty()) {
            return 0;
        }
        int size = list2.size();
        int[] iArr = new int[size];
        int size2 = list2.size();
        int[] iArr2 = new int[size2];
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            g1c g1cVar = (g1c) list2.get(i10);
            boolean z = this.a;
            int B = z ? g1cVar.B(i) : g1cVar.s(i);
            iArr[i10] = B;
            iArr2[i10] = z ? g1cVar.s(B) : g1cVar.B(B);
        }
        int i11 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE < list2.size()) {
            fb8Var.getClass();
            db8 db8Var = db8.a;
            db8 db8Var2 = db8.a;
            db8 db8Var3 = db8.a;
        }
        if (Integer.MAX_VALUE >= list2.size()) {
            fb8Var.getClass();
            db8 db8Var4 = db8.a;
            db8 db8Var5 = db8.a;
        }
        int min = Math.min(Integer.MAX_VALUE, list2.size());
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += iArr[i13];
        }
        int i14 = 1;
        int size4 = ((list2.size() - 1) * i2) + i12;
        if (size2 == 0) {
            yhk.d();
            return 0;
        }
        int i15 = iArr2[0];
        int i16 = size2 - 1;
        if (1 <= i16) {
            int i17 = 1;
            while (true) {
                int i18 = iArr2[i17];
                if (i15 < i18) {
                    i15 = i18;
                }
                if (i17 == i16) {
                    break;
                }
                i17++;
            }
        }
        if (size == 0) {
            yhk.d();
            return 0;
        }
        int i19 = iArr[0];
        int i20 = size - 1;
        if (1 <= i20) {
            int i21 = 1;
            while (true) {
                int i22 = iArr[i21];
                if (i19 < i22) {
                    i19 = i22;
                }
                if (i21 == i20) {
                    break;
                }
                i21++;
            }
        }
        int i23 = size4;
        while (i19 <= size4 && i15 != i) {
            int i24 = (i19 + size4) / 2;
            if (list2.isEmpty()) {
                i6 = i9;
                j = a2;
            } else {
                bb8 bb8Var = new bb8(i4, fb8Var, cn3.a(i9, i24, i9, i11), i2, i3);
                g1c g1cVar2 = (g1c) CollectionsKt.a0(i9, list2);
                int i25 = g1cVar2 != null ? iArr2[i9] : i9;
                if (g1cVar2 != null) {
                    i5 = iArr[i9];
                    i6 = i9;
                } else {
                    i5 = i9;
                    i6 = i5;
                }
                j = a2;
                int i26 = 0;
                int i27 = 0;
                if (bb8Var.b(list2.size() > i14 ? i14 : i6, 0, k6a.a(i24, i11), g1cVar2 == null ? null : new k6a(k6a.a(i5, i25)), 0, 0, 0, false, false).b) {
                    fb8Var.getClass();
                    db8 db8Var6 = db8.a;
                } else {
                    int size5 = list2.size();
                    int i28 = i24;
                    int i29 = i6;
                    int i30 = i29;
                    int i31 = i30;
                    int i32 = 0;
                    while (true) {
                        if (i29 >= size5) {
                            i7 = i24;
                            i8 = i30;
                            break;
                        }
                        i28 -= i5;
                        i8 = i29 + 1;
                        int max = Math.max(i32, i25);
                        g1c g1cVar3 = (g1c) CollectionsKt.a0(i8, list2);
                        i25 = g1cVar3 != null ? iArr2[i8] : i6;
                        int i33 = g1cVar3 != null ? iArr[i8] + i2 : i6;
                        boolean z2 = i29 + 2 < list2.size() ? 1 : i6;
                        int i34 = i8 - i31;
                        long a3 = k6a.a(i28, Integer.MAX_VALUE);
                        if (g1cVar3 == null) {
                            i7 = i24;
                            k6aVar = null;
                        } else {
                            i7 = i24;
                            k6aVar = new k6a(k6a.a(i33, i25));
                        }
                        ab8 b = bb8Var.b(z2, i34, a3, k6aVar, i26, i27, max, false, false);
                        if (b.a) {
                            int i35 = max + i3 + i27;
                            int i36 = i26;
                            bb8Var.a(b, g1cVar3 != null ? 1 : i6, i36, i35, i28, i34);
                            i33 -= i2;
                            i26 = i36 + 1;
                            if (b.b) {
                                i27 = i35;
                                break;
                            }
                            i28 = i7;
                            i31 = i8;
                            i32 = i6;
                            i27 = i35;
                        } else {
                            i32 = max;
                        }
                        list2 = list;
                        i24 = i7;
                        i29 = i8;
                        i30 = i29;
                        i5 = i33;
                    }
                    a = k6a.a(i27 - i3, i8);
                    i15 = (int) (a >> 32);
                    int i37 = (int) (a & 4294967295L);
                    if (i15 <= i || i37 < min) {
                        i19 = i7 + 1;
                        if (i19 <= size4) {
                            return i19;
                        }
                    } else {
                        if (i15 >= i) {
                            return i7;
                        }
                        size4 = i7 - 1;
                    }
                    list2 = list;
                    i23 = i7;
                    i9 = i6;
                    a2 = j;
                    i11 = Integer.MAX_VALUE;
                    i14 = 1;
                }
            }
            i7 = i24;
            a = j;
            i15 = (int) (a >> 32);
            int i372 = (int) (a & 4294967295L);
            if (i15 <= i) {
            }
            i19 = i7 + 1;
            if (i19 <= size4) {
            }
        }
        return i23;
    }

    public final int hashCode() {
        return this.h.hashCode() + wv8.a(Integer.MAX_VALUE, wv8.a(this.g, fc6.a(this.f, (this.e.hashCode() + fc6.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.a + ", horizontalArrangement=" + this.b + ", verticalArrangement=" + this.c + ", mainAxisSpacing=" + ((Object) p75.c(this.d)) + ", crossAxisAlignment=" + this.e + ", crossAxisArrangementSpacing=" + ((Object) p75.c(this.f)) + ", maxItemsInMainAxis=" + this.g + ", maxLines=2147483647, overflow=" + this.h + ')';
    }
}
