package androidx.compose.runtime;

import androidx.compose.runtime.f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.fd3;
import xsna.hc30;
import xsna.hqj;
import xsna.ic30;
import xsna.ivi;
import xsna.j5g;
import xsna.ph50;
import xsna.qh50;
import xsna.qp80;
import xsna.s101;
import xsna.s3q0;
import xsna.sdi;
import xsna.v2k0;
import xsna.vvi;
import xsna.wef0;
import xsna.y2k0;
import xsna.yy1;
import xsna.zr;

/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class b {
    public static vvi a;
    public static final qp80 b = new qp80(IronSourceConstants.EVENTS_PROVIDER);
    public static final qp80 c = new qp80(IronSourceConstants.EVENTS_PROVIDER);
    public static final qp80 d = new qp80("compositionLocalMap");
    public static final qp80 e = new qp80("providers");
    public static final qp80 f = new qp80("reference");

    public static final void a(String str) {
        throw new ComposeRuntimeError(zr.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new ComposeRuntimeError(zr.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    public static final hc30 c(hqj hqjVar, ic30 ic30Var, y2k0 y2k0Var, fd3<?> fd3Var) {
        ic30 ic30Var2;
        v2k0 v2k0Var;
        ph50 ph50Var;
        ?? r8;
        ph50 ph50Var2;
        yy1 yy1Var;
        long[] jArr;
        yy1 yy1Var2;
        v2k0 v2k0Var2;
        int i;
        long[] jArr2;
        long j;
        int i2;
        boolean z;
        Object obj;
        int i3;
        v2k0 v2k0Var3;
        long j2;
        Object obj2;
        v2k0 v2k0Var4 = new v2k0();
        if (y2k0Var.q()) {
            v2k0Var4.c0();
        }
        if (y2k0Var.p()) {
            v2k0Var4.b0();
        }
        int r = y2k0Var.r();
        if (fd3Var != null && y2k0Var.K(r) > 0) {
            int s = y2k0Var.s();
            while (s > 0 && !y2k0Var.D(s)) {
                s = y2k0Var.L(s);
            }
            if (s >= 0 && y2k0Var.D(s)) {
                Object J = y2k0Var.J(s);
                int i4 = s + 1;
                int y = y2k0Var.y(s) + s;
                int i5 = 0;
                while (i4 < y) {
                    int y2 = y2k0Var.y(i4) + i4;
                    if (y2 > r) {
                        break;
                    }
                    i5 += y2k0Var.D(i4) ? 1 : y2k0Var.K(i4);
                    i4 = y2;
                }
                int K = y2k0Var.D(r) ? 1 : y2k0Var.K(r);
                fd3Var.f(J);
                fd3Var.g(i5, K);
                fd3Var.j();
            }
        }
        yy1 a2 = ic30Var.a();
        if (a2.a()) {
            ivi iviVar = (ivi) hqjVar;
            ph50Var = iviVar.o;
            if (s101.p(ph50Var) > 0) {
                r8 = new ArrayList();
                ph50Var2 = iviVar.o;
                long[] jArr3 = ph50Var2.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr3[i6];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j3 & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    int i11 = i7;
                                    Object obj3 = ph50Var2.b[i10];
                                    yy1Var2 = a2;
                                    Object obj4 = ph50Var2.c[i10];
                                    i = i9;
                                    if (obj4 instanceof qh50) {
                                        qh50 qh50Var = (qh50) obj4;
                                        Object[] objArr = qh50Var.b;
                                        long[] jArr4 = qh50Var.a;
                                        jArr2 = jArr3;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j = j3;
                                            int i12 = 0;
                                            while (true) {
                                                long j4 = jArr4[i12];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    int i14 = 0;
                                                    while (i14 < i13) {
                                                        if ((j4 & 255) < 128) {
                                                            i3 = i14;
                                                            int i15 = (i12 << 3) + i3;
                                                            j2 = j4;
                                                            Object obj5 = objArr[i15];
                                                            f fVar = (f) obj3;
                                                            yy1 a3 = fVar.a();
                                                            if (a3 != null) {
                                                                obj2 = obj3;
                                                                v2k0Var3 = v2k0Var4;
                                                                if (y2k0Var.z(sdi.d(yy1Var2), sdi.d(a3))) {
                                                                    r8.add(new Pair(fVar, obj5));
                                                                    qh50Var.n(i15);
                                                                }
                                                                j4 = j2 >> i11;
                                                                i14 = i3 + 1;
                                                                obj3 = obj2;
                                                                v2k0Var4 = v2k0Var3;
                                                            } else {
                                                                v2k0Var3 = v2k0Var4;
                                                            }
                                                        } else {
                                                            i3 = i14;
                                                            v2k0Var3 = v2k0Var4;
                                                            j2 = j4;
                                                        }
                                                        obj2 = obj3;
                                                        j4 = j2 >> i11;
                                                        i14 = i3 + 1;
                                                        obj3 = obj2;
                                                        v2k0Var4 = v2k0Var3;
                                                    }
                                                    v2k0Var2 = v2k0Var4;
                                                    obj = obj3;
                                                    if (i13 != i11) {
                                                        break;
                                                    }
                                                } else {
                                                    v2k0Var2 = v2k0Var4;
                                                    obj = obj3;
                                                }
                                                if (i12 == length2) {
                                                    break;
                                                }
                                                i12++;
                                                obj3 = obj;
                                                v2k0Var4 = v2k0Var2;
                                                i11 = 8;
                                            }
                                        } else {
                                            v2k0Var2 = v2k0Var4;
                                            j = j3;
                                        }
                                        z = qh50Var.c();
                                    } else {
                                        v2k0Var2 = v2k0Var4;
                                        jArr2 = jArr3;
                                        j = j3;
                                        f fVar2 = (f) obj3;
                                        yy1 a4 = fVar2.a();
                                        if (a4 == null || !y2k0Var.z(sdi.d(yy1Var2), sdi.d(a4))) {
                                            z = false;
                                        } else {
                                            r8.add(new Pair(fVar2, obj4));
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        ph50Var2.o(i10);
                                    }
                                    i2 = 8;
                                } else {
                                    yy1Var2 = a2;
                                    v2k0Var2 = v2k0Var4;
                                    i = i9;
                                    jArr2 = jArr3;
                                    j = j3;
                                    i2 = i7;
                                }
                                j3 = j >> i2;
                                i9 = i + 1;
                                i7 = i2;
                                a2 = yy1Var2;
                                jArr3 = jArr2;
                                v2k0Var4 = v2k0Var2;
                            }
                            yy1Var = a2;
                            v2k0Var = v2k0Var4;
                            jArr = jArr3;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            yy1Var = a2;
                            v2k0Var = v2k0Var4;
                            jArr = jArr3;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        a2 = yy1Var;
                        jArr3 = jArr;
                        v2k0Var4 = v2k0Var;
                    }
                } else {
                    v2k0Var = v2k0Var4;
                }
            } else {
                v2k0Var = v2k0Var4;
                r8 = EmptyList.b;
            }
            ic30Var2 = ic30Var;
            ic30Var2.e(j5g.u0((Iterable) r8, ic30Var.c()));
        } else {
            ic30Var2 = ic30Var;
            v2k0Var = v2k0Var4;
        }
        y2k0 f0 = v2k0Var.f0();
        try {
            f0.d();
            f0.Y(126665345, ic30Var2.b());
            y2k0.E(f0);
            f0.b0(ic30Var2.d());
            List I = y2k0Var.I(sdi.d(ic30Var2.a()), f0);
            f0.T();
            f0.j();
            f0.k();
            f0.e(true);
            v2k0 v2k0Var5 = v2k0Var;
            hc30 hc30Var = new hc30(v2k0Var5);
            if (!f.a.b(v2k0Var5, I)) {
                return hc30Var;
            }
            a aVar = new a(hqjVar, ic30Var2);
            f0 = v2k0Var5.f0();
            try {
                f.a.a(f0, I, aVar);
                s3q0 s3q0Var = s3q0.a;
                f0.e(true);
                return hc30Var;
            } finally {
            }
        } finally {
        }
    }

    public static final boolean d() {
        vvi vviVar = a;
        return vviVar != null && vviVar.a();
    }

    public static final void e() {
        vvi vviVar = a;
        if (vviVar != null) {
            vviVar.c();
        }
    }

    public static final void f(int i, int i2, int i3, String str) {
        vvi vviVar = a;
        if (vviVar != null) {
            vviVar.b(i, i2, i3, str);
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes11.dex */
    public static final class a implements wef0 {
        public final /* synthetic */ hqj b;
        public final /* synthetic */ ic30 c;

        public a(hqj hqjVar, ic30 ic30Var) {
            this.b = hqjVar;
            this.c = ic30Var;
        }

        @Override // xsna.wef0
        public final InvalidationResult m(f fVar, Object obj) {
            InvalidationResult invalidationResult;
            hqj hqjVar = this.b;
            wef0 wef0Var = hqjVar instanceof wef0 ? (wef0) hqjVar : null;
            if (wef0Var == null || (invalidationResult = wef0Var.m(fVar, obj)) == null) {
                invalidationResult = InvalidationResult.IGNORED;
            }
            if (invalidationResult != InvalidationResult.IGNORED) {
                return invalidationResult;
            }
            ic30 ic30Var = this.c;
            ic30Var.f = j5g.v0(new Pair(fVar, obj), ic30Var.f);
            return InvalidationResult.SCHEDULED;
        }

        @Override // xsna.wef0
        public final void i() {
        }

        @Override // xsna.wef0
        public final void a(Object obj) {
        }
    }
}
