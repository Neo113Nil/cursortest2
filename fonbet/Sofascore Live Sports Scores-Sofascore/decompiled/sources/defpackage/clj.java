package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class clj implements k1c {
    public final a88 a;
    public final float b;

    public clj(a88 a88Var, float f) {
        this.a = a88Var;
        this.b = f;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((g1c) list.get(i3)).G(i);
        }
        return i2;
    }

    @Override // defpackage.k1c
    public final l1c d(final m1c m1cVar, List list, final long j) {
        int h;
        final clj cljVar = this;
        int size = list.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            g1c g1cVar = (g1c) list.get(i2);
            if (Intrinsics.c(ww9.A(g1cVar), "navigationIcon")) {
                final qhe J = g1cVar.J(an3.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    g1c g1cVar2 = (g1c) list.get(i3);
                    if (Intrinsics.c(ww9.A(g1cVar2), "actionIcons")) {
                        final qhe J2 = g1cVar2.J(an3.a(j, 0, 0, 0, 0, 14));
                        if (an3.h(j) == Integer.MAX_VALUE) {
                            h = an3.h(j);
                        } else {
                            h = (an3.h(j) - J.a) - J2.a;
                            if (h < 0) {
                                h = 0;
                            }
                        }
                        int i4 = h;
                        int size3 = list.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            g1c g1cVar3 = (g1c) list.get(i5);
                            if (Intrinsics.c(ww9.A(g1cVar3), "title")) {
                                final qhe J3 = g1cVar3.J(an3.a(j, 0, i4, 0, 0, 12));
                                ye9 ye9Var = mo.b;
                                int R = J3.R(ye9Var) != Integer.MIN_VALUE ? J3.R(ye9Var) : 0;
                                float invoke = cljVar.a.invoke();
                                int b = Float.isNaN(invoke) ? 0 : wzb.b(invoke);
                                final int max = Math.max(m1cVar.e0(cljVar.b), J3.b);
                                if (an3.g(j) == Integer.MAX_VALUE) {
                                    i = max;
                                } else {
                                    int i6 = b + max;
                                    if (i6 >= 0) {
                                        i = i6;
                                    }
                                }
                                final int i7 = R;
                                return m1c.G0(m1cVar, an3.h(j), i, new Function1(i, J3, J2, j, m1cVar, cljVar, i7, max) { // from class: blj
                                    public final /* synthetic */ int b;
                                    public final /* synthetic */ qhe c;
                                    public final /* synthetic */ qhe d;
                                    public final /* synthetic */ long e;
                                    public final /* synthetic */ m1c f;

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int h2;
                                        phe pheVar = (phe) obj;
                                        qhe qheVar = qhe.this;
                                        int i8 = qheVar.b;
                                        int i9 = this.b;
                                        phe.h(pheVar, qheVar, 0, (i9 - i8) / 2);
                                        int max2 = Math.max(this.f.e0(oa0.c), qheVar.a);
                                        qhe qheVar2 = this.d;
                                        int i10 = qheVar2.a;
                                        qhe qheVar3 = this.c;
                                        int i11 = qheVar3.a;
                                        long j2 = this.e;
                                        int h3 = an3.h(j2);
                                        ema emaVar = ema.a;
                                        float f = (h3 - i11) / 2.0f;
                                        ema emaVar2 = ema.a;
                                        int round = Math.round((1.0f - 1.0f) * f);
                                        if (round >= max2) {
                                            if (qheVar3.a + round > an3.h(j2) - i10) {
                                                h2 = (an3.h(j2) - i10) - (qheVar3.a + round);
                                            }
                                            phe.h(pheVar, qheVar3, round, (i9 - qheVar3.b) / 2);
                                            phe.h(pheVar, qheVar2, an3.h(j2) - qheVar2.a, (i9 - qheVar2.b) / 2);
                                            return Unit.a;
                                        }
                                        h2 = max2 - round;
                                        round += h2;
                                        phe.h(pheVar, qheVar3, round, (i9 - qheVar3.b) / 2);
                                        phe.h(pheVar, qheVar2, an3.h(j2) - qheVar2.a, (i9 - qheVar2.b) / 2);
                                        return Unit.a;
                                    }
                                });
                            }
                            i5++;
                            cljVar = this;
                        }
                        ycb.b("Collection contains no element matching the predicate.");
                        pvd.x();
                        return null;
                    }
                    i3++;
                    cljVar = this;
                }
                ycb.b("Collection contains no element matching the predicate.");
                pvd.x();
                return null;
            }
            i2++;
            cljVar = this;
        }
        ycb.b("Collection contains no element matching the predicate.");
        pvd.x();
        return null;
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((g1c) list.get(i3)).B(i);
        }
        return i2;
    }

    @Override // defpackage.k1c
    public final int i(l9a l9aVar, List list, int i) {
        Integer valueOf;
        int e0 = l9aVar.e0(this.b);
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((g1c) list.get(0)).b(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((g1c) list.get(i2)).b(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Math.max(e0, valueOf != null ? valueOf.intValue() : 0);
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
        Integer valueOf;
        int e0 = l9aVar.e0(this.b);
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((g1c) list.get(0)).s(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((g1c) list.get(i2)).s(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Math.max(e0, valueOf != null ? valueOf.intValue() : 0);
    }
}
