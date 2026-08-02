package defpackage;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class sf3 {
    public static final otd a = new otd(IronSourceConstants.EVENTS_PROVIDER);
    public static final otd b = new otd(IronSourceConstants.EVENTS_PROVIDER);
    public static final otd c = new otd("compositionLocalMap");
    public static final otd d = new otd("providers");
    public static final otd e = new otd("reference");

    public static final void a(@NotNull String str) {
        throw new ue3(lnb.o("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void b(@NotNull String str) {
        throw new ue3(lnb.o("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [km5] */
    public static final swc c(sg3 sg3Var, twc twcVar, mlh mlhVar, qf0 qf0Var) {
        a99 a99Var;
        jlh jlhVar;
        ?? r6;
        vu8 vu8Var;
        long[] jArr;
        vu8 vu8Var2;
        a99 a99Var2;
        jlh jlhVar2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        long[] jArr3;
        int i4;
        long j2;
        long[] jArr4;
        int i5;
        int i6;
        twc twcVar2 = twcVar;
        a99 a99Var3 = nf3.a;
        jlh jlhVar3 = new jlh();
        if (mlhVar.e != null) {
            jlhVar3.c();
        }
        if (mlhVar.f != null) {
            jlhVar3.k = new uzc();
        }
        int i7 = mlhVar.t;
        if (qf0Var != null && mlhVar.E(i7) > 0) {
            int i8 = mlhVar.v;
            while (i8 > 0 && !mlhVar.x(i8)) {
                i8 = mlhVar.F(i8, mlhVar.b);
            }
            if (i8 >= 0 && mlhVar.x(i8)) {
                Object D = mlhVar.D(i8);
                int i9 = i8 + 1;
                int t = mlhVar.t(i8) + i8;
                int i10 = 0;
                while (i9 < t) {
                    int t2 = mlhVar.t(i9) + i9;
                    if (t2 > i7) {
                        break;
                    }
                    i10 += mlhVar.x(i9) ? 1 : mlhVar.E(i9);
                    i9 = t2;
                }
                int E = mlhVar.x(i7) ? 1 : mlhVar.E(i7);
                qf0Var.x(D);
                qf0Var.p(i10, E);
                qf0Var.A();
            }
        }
        vu8 vu8Var3 = twcVar2.e;
        if (vu8Var3.a()) {
            sg3Var.getClass();
            if (sg3Var.n.e > 0) {
                r6 = new ArrayList();
                x0d x0dVar = sg3Var.n;
                long[] jArr5 = x0dVar.a;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j3 = jArr5[i11];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j3 & 255) < 128) {
                                    int i15 = i12;
                                    int i16 = (i11 << 3) + i14;
                                    vu8Var2 = vu8Var3;
                                    Object obj = x0dVar.b[i16];
                                    Object obj2 = x0dVar.c[i16];
                                    obj.getClass();
                                    jArr2 = jArr5;
                                    if (obj2 instanceof y0d) {
                                        y0d y0dVar = (y0d) obj2;
                                        Object[] objArr = y0dVar.b;
                                        long[] jArr6 = y0dVar.a;
                                        j = j3;
                                        int length2 = jArr6.length - 2;
                                        a99Var2 = a99Var3;
                                        jlhVar2 = jlhVar3;
                                        if (length2 >= 0) {
                                            int i17 = 0;
                                            while (true) {
                                                long j4 = jArr6[i17];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                                    int i19 = 0;
                                                    while (i19 < i18) {
                                                        if ((j4 & 255) < 128) {
                                                            i4 = i19;
                                                            int i20 = (i17 << 3) + i4;
                                                            j2 = j4;
                                                            Object obj3 = objArr[i20];
                                                            eqf eqfVar = (eqf) obj;
                                                            jArr4 = jArr6;
                                                            vu8 vu8Var4 = eqfVar.c;
                                                            if (vu8Var4 != null) {
                                                                vu8 J = o02.J(vu8Var2);
                                                                i6 = i14;
                                                                vu8 J2 = o02.J(vu8Var4);
                                                                int c2 = mlhVar.c(J);
                                                                i5 = length;
                                                                int i21 = mlhVar.b[(c2 * 5) + 3] + c2;
                                                                int i22 = J2.a;
                                                                if (c2 <= i22 && i22 < i21) {
                                                                    r6.add(new Pair(eqfVar, obj3));
                                                                    y0dVar.m(i20);
                                                                }
                                                                j4 = j2 >> i15;
                                                                i19 = i4 + 1;
                                                                jArr6 = jArr4;
                                                                length = i5;
                                                                i14 = i6;
                                                            }
                                                        } else {
                                                            i4 = i19;
                                                            j2 = j4;
                                                            jArr4 = jArr6;
                                                        }
                                                        i5 = length;
                                                        i6 = i14;
                                                        j4 = j2 >> i15;
                                                        i19 = i4 + 1;
                                                        jArr6 = jArr4;
                                                        length = i5;
                                                        i14 = i6;
                                                    }
                                                    jArr3 = jArr6;
                                                    i = length;
                                                    i2 = i14;
                                                    if (i18 != i15) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr6;
                                                    i = length;
                                                    i2 = i14;
                                                }
                                                if (i17 == length2) {
                                                    break;
                                                }
                                                i17++;
                                                jArr6 = jArr3;
                                                length = i;
                                                i14 = i2;
                                                i15 = 8;
                                            }
                                        } else {
                                            i = length;
                                            i2 = i14;
                                        }
                                        z2 = y0dVar.g();
                                    } else {
                                        a99Var2 = a99Var3;
                                        jlhVar2 = jlhVar3;
                                        i = length;
                                        j = j3;
                                        i2 = i14;
                                        obj2.getClass();
                                        eqf eqfVar2 = (eqf) obj;
                                        vu8 vu8Var5 = eqfVar2.c;
                                        if (vu8Var5 != null) {
                                            vu8 J3 = o02.J(vu8Var2);
                                            vu8 J4 = o02.J(vu8Var5);
                                            int c3 = mlhVar.c(J3);
                                            int i23 = mlhVar.b[(c3 * 5) + 3] + c3;
                                            int i24 = J4.a;
                                            if (c3 <= i24 && i24 < i23) {
                                                r6.add(new Pair(eqfVar2, obj2));
                                                z = true;
                                                z2 = z;
                                            }
                                        }
                                        z = false;
                                        z2 = z;
                                    }
                                    if (z2) {
                                        x0dVar.l(i16);
                                    }
                                    i3 = 8;
                                } else {
                                    vu8Var2 = vu8Var3;
                                    a99Var2 = a99Var3;
                                    jlhVar2 = jlhVar3;
                                    jArr2 = jArr5;
                                    i = length;
                                    j = j3;
                                    i2 = i14;
                                    i3 = i12;
                                }
                                j3 = j >> i3;
                                i14 = i2 + 1;
                                i12 = i3;
                                vu8Var3 = vu8Var2;
                                jArr5 = jArr2;
                                a99Var3 = a99Var2;
                                jlhVar3 = jlhVar2;
                                length = i;
                            }
                            vu8Var = vu8Var3;
                            a99Var = a99Var3;
                            jlhVar = jlhVar3;
                            jArr = jArr5;
                            int i25 = length;
                            if (i13 != i12) {
                                break;
                            }
                            length = i25;
                        } else {
                            vu8Var = vu8Var3;
                            a99Var = a99Var3;
                            jlhVar = jlhVar3;
                            jArr = jArr5;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        vu8Var3 = vu8Var;
                        jArr5 = jArr;
                        a99Var3 = a99Var;
                        jlhVar3 = jlhVar;
                    }
                } else {
                    a99Var = a99Var3;
                    jlhVar = jlhVar3;
                }
            } else {
                a99Var = a99Var3;
                jlhVar = jlhVar3;
                r6 = km5.a;
            }
            twcVar2 = twcVar;
            twcVar2.f = CollectionsKt.w0(r6, twcVar2.f);
        } else {
            a99Var = a99Var3;
            jlhVar = jlhVar3;
        }
        mlh n = jlhVar.n();
        try {
            n.d();
            a99 a99Var4 = a99Var;
            n.R(twcVar2.a, a99Var4, false, 126665345);
            mlh.y(n);
            n.T(twcVar2.b);
            List C = mlhVar.C(o02.J(twcVar2.e), n);
            n.M();
            n.i();
            n.j();
            n.e(true);
            jlh jlhVar4 = jlhVar;
            swc swcVar = new swc(jlhVar4);
            if (!C.isEmpty()) {
                int size = C.size();
                for (int i26 = 0; i26 < size; i26++) {
                    vu8 vu8Var6 = (vu8) C.get(i26);
                    if (jlhVar4.o(vu8Var6)) {
                        int a2 = jlhVar4.a(vu8Var6);
                        int d2 = llh.d(a2, jlhVar4.a);
                        int i27 = a2 + 1;
                        if (((i27 < jlhVar4.b ? jlhVar4.a[(i27 * 5) + 4] : jlhVar4.c.length) - d2 > 0 ? jlhVar4.c[d2] : a99Var4) instanceof eqf) {
                            z41 z41Var = new z41(10, sg3Var, twcVar2);
                            n = jlhVar4.n();
                            try {
                                yaa.l(n, C, z41Var);
                                Unit unit = Unit.a;
                                n.e(true);
                                return swcVar;
                            } finally {
                            }
                        }
                    }
                }
            }
            return swcVar;
        } finally {
        }
    }
}
