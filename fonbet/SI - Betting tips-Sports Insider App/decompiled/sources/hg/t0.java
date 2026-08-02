package hg;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class t0 extends ig.b implements m0, g, ig.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f10767e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10768f;

    /* renamed from: g, reason: collision with root package name */
    public final gg.a f10769g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f10770h;

    /* renamed from: i, reason: collision with root package name */
    public long f10771i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f10772k;

    /* renamed from: l, reason: collision with root package name */
    public int f10773l;

    public t0(int i5, int i10, gg.a aVar) {
        this.f10767e = i5;
        this.f10768f = i10;
        this.f10769g = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0079, B:20:0x0081, B:29:0x0094, B:32:0x009b, B:33:0x009f, B:35:0x00a0, B:41:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ig.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [hg.t0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [hg.h] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ig.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [hg.v0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [hg.v0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ae -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(t0 t0Var, h hVar, Continuation continuation) {
        s0 s0Var;
        lf.a aVar;
        int i5;
        ?? r5;
        h hVar2;
        eg.e1 e1Var;
        eg.e1 e1Var2;
        h hVar3;
        Object t3;
        v0 v0Var;
        try {
            try {
                if (continuation instanceof s0) {
                    s0Var = (s0) continuation;
                    int i10 = s0Var.f10761g;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        s0Var.f10761g = i10 - Integer.MIN_VALUE;
                        Object obj = s0Var.f10759e;
                        aVar = lf.a.f20034a;
                        i5 = s0Var.f10761g;
                        if (i5 != 0) {
                            h8.b.B(obj);
                            hVar2 = hVar;
                            hVar = (v0) t0Var.e();
                        } else {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    e1Var2 = s0Var.f10758d;
                                    v0 v0Var2 = s0Var.f10757c;
                                    hVar3 = s0Var.f10756b;
                                    t0 t0Var2 = s0Var.f10755a;
                                    h8.b.B(obj);
                                    r5 = t0Var2;
                                    hVar = v0Var2;
                                    do {
                                        t3 = r5.t(hVar);
                                        if (t3 == u0.f10777a) {
                                        }
                                    } while (r5.j(hVar, s0Var) != aVar);
                                    return;
                                }
                                if (i5 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                e1Var2 = s0Var.f10758d;
                                v0 v0Var3 = s0Var.f10757c;
                                hVar3 = s0Var.f10756b;
                                t0 t0Var3 = s0Var.f10755a;
                                h8.b.B(obj);
                                t0 t0Var4 = t0Var3;
                                v0 v0Var4 = v0Var3;
                                hVar2 = hVar3;
                                e1Var = e1Var2;
                                t0Var = t0Var4;
                                v0Var = v0Var4;
                                r5 = t0Var;
                                e1Var2 = e1Var;
                                hVar3 = hVar2;
                                hVar = v0Var;
                                do {
                                    t3 = r5.t(hVar);
                                    if (t3 == u0.f10777a) {
                                        if (e1Var2 != null && !e1Var2.c()) {
                                            throw e1Var2.y();
                                        }
                                        s0Var.f10755a = r5;
                                        s0Var.f10756b = hVar3;
                                        s0Var.f10757c = hVar;
                                        s0Var.f10758d = e1Var2;
                                        s0Var.f10761g = 3;
                                        t0Var4 = r5;
                                        v0Var4 = hVar;
                                        if (hVar3.d(t3, s0Var) == aVar) {
                                            return;
                                        }
                                        hVar2 = hVar3;
                                        e1Var = e1Var2;
                                        t0Var = t0Var4;
                                        v0Var = v0Var4;
                                        r5 = t0Var;
                                        e1Var2 = e1Var;
                                        hVar3 = hVar2;
                                        hVar = v0Var;
                                        t3 = r5.t(hVar);
                                        if (t3 == u0.f10777a) {
                                            s0Var.f10755a = r5;
                                            s0Var.f10756b = hVar3;
                                            s0Var.f10757c = hVar;
                                            s0Var.f10758d = e1Var2;
                                            s0Var.f10761g = 2;
                                        }
                                    }
                                } while (r5.j(hVar, s0Var) != aVar);
                                return;
                            }
                            hVar = s0Var.f10757c;
                            h hVar4 = s0Var.f10756b;
                            t0 t0Var5 = s0Var.f10755a;
                            try {
                                h8.b.B(obj);
                                hVar2 = hVar4;
                                t0Var = t0Var5;
                                hVar = hVar;
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = t0Var5;
                                r5.h(hVar);
                                throw th;
                            }
                        }
                        e1Var = (eg.e1) s0Var.getContext().r(eg.x.f9237b);
                        v0Var = hVar;
                        r5 = t0Var;
                        e1Var2 = e1Var;
                        hVar3 = hVar2;
                        hVar = v0Var;
                        do {
                            t3 = r5.t(hVar);
                            if (t3 == u0.f10777a) {
                            }
                        } while (r5.j(hVar, s0Var) != aVar);
                        return;
                    }
                }
                e1Var = (eg.e1) s0Var.getContext().r(eg.x.f9237b);
                v0Var = hVar;
                r5 = t0Var;
                e1Var2 = e1Var;
                hVar3 = hVar2;
                hVar = v0Var;
                do {
                    t3 = r5.t(hVar);
                    if (t3 == u0.f10777a) {
                    }
                } while (r5.j(hVar, s0Var) != aVar);
                return;
            } catch (Throwable th3) {
                r5 = t0Var;
                th = th3;
                r5.h(hVar);
                throw th;
            }
            if (i5 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        s0Var = new s0(t0Var, continuation);
        Object obj2 = s0Var.f10759e;
        aVar = lf.a.f20034a;
        i5 = s0Var.f10761g;
    }

    @Override // hg.g
    public final Object a(h hVar, Continuation continuation) {
        l(this, hVar, continuation);
        return lf.a.f20034a;
    }

    @Override // hg.m0
    public final boolean b(Object obj) {
        int i5;
        boolean z5;
        Continuation[] continuationArr = ig.c.f11244a;
        synchronized (this) {
            if (r(obj)) {
                continuationArr = o(continuationArr);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                gf.o oVar = gf.q.f10031a;
                continuation.resumeWith(Unit.f19194a);
            }
        }
        return z5;
    }

    @Override // ig.r
    public final g c(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        return u0.o(this, coroutineContext, i5, aVar);
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation frame) {
        Throwable th2;
        Continuation[] o3;
        r0 r0Var;
        if (b(obj)) {
            return Unit.f19194a;
        }
        eg.l lVar = new eg.l(1, lf.d.b(frame));
        lVar.s();
        Continuation[] continuationArr = ig.c.f11244a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        gf.o oVar = gf.q.f10031a;
                        lVar.resumeWith(Unit.f19194a);
                        o3 = o(continuationArr);
                        r0Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        r0Var = new r0(this, p() + this.f10772k + this.f10773l, obj, lVar);
                        n(r0Var);
                        this.f10773l++;
                        if (this.f10768f == 0) {
                            continuationArr = o(continuationArr);
                        }
                        o3 = continuationArr;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (r0Var != null) {
                    lVar.v(new eg.h(2, r0Var));
                }
                for (Continuation continuation : o3) {
                    if (continuation != null) {
                        gf.o oVar2 = gf.q.f10031a;
                        continuation.resumeWith(Unit.f19194a);
                    }
                }
                Object r5 = lVar.r();
                lf.a aVar = lf.a.f20034a;
                if (r5 == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (r5 != aVar) {
                    r5 = Unit.f19194a;
                }
                return r5 == aVar ? r5 : Unit.f19194a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // ig.b
    public final ig.d f() {
        v0 v0Var = new v0();
        v0Var.f10783a = -1L;
        return v0Var;
    }

    @Override // ig.b
    public final ig.d[] g() {
        return new v0[2];
    }

    public final Object j(v0 v0Var, s0 frame) {
        eg.l lVar = new eg.l(1, lf.d.b(frame));
        lVar.s();
        synchronized (this) {
            try {
                if (s(v0Var) < 0) {
                    v0Var.f10784b = lVar;
                } else {
                    gf.o oVar = gf.q.f10031a;
                    lVar.resumeWith(Unit.f19194a);
                }
                Unit unit = Unit.f19194a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object r5 = lVar.r();
        lf.a aVar = lf.a.f20034a;
        if (r5 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5 == aVar ? r5 : Unit.f19194a;
    }

    public final void k() {
        if (this.f10768f != 0 || this.f10773l > 1) {
            Object[] objArr = this.f10770h;
            Intrinsics.checkNotNull(objArr);
            while (this.f10773l > 0 && u0.c(objArr, (p() + (this.f10772k + this.f10773l)) - 1) == u0.f10777a) {
                this.f10773l--;
                u0.d(objArr, p() + this.f10772k + this.f10773l, null);
            }
        }
    }

    public final void m() {
        ig.d[] dVarArr;
        Object[] objArr = this.f10770h;
        Intrinsics.checkNotNull(objArr);
        u0.d(objArr, p(), null);
        this.f10772k--;
        long p10 = p() + 1;
        if (this.f10771i < p10) {
            this.f10771i = p10;
        }
        if (this.j < p10) {
            if (this.f11241b != 0 && (dVarArr = this.f11240a) != null) {
                for (ig.d dVar : dVarArr) {
                    if (dVar != null) {
                        v0 v0Var = (v0) dVar;
                        long j = v0Var.f10783a;
                        if (j >= 0 && j < p10) {
                            v0Var.f10783a = p10;
                        }
                    }
                }
            }
            this.j = p10;
        }
    }

    public final void n(Object obj) {
        int i5 = this.f10772k + this.f10773l;
        Object[] objArr = this.f10770h;
        if (objArr == null) {
            objArr = q(0, 2, null);
        } else if (i5 >= objArr.length) {
            objArr = q(i5, objArr.length * 2, objArr);
        }
        u0.d(objArr, p() + i5, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final Continuation[] o(Continuation[] continuationArr) {
        ig.d[] dVarArr;
        v0 v0Var;
        eg.l lVar;
        int length = continuationArr.length;
        if (this.f11241b != 0 && (dVarArr = this.f11240a) != null) {
            int length2 = dVarArr.length;
            int i5 = 0;
            continuationArr = continuationArr;
            while (i5 < length2) {
                ig.d dVar = dVarArr[i5];
                if (dVar != null && (lVar = (v0Var = (v0) dVar).f10784b) != null && s(v0Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = lVar;
                    v0Var.f10784b = null;
                    length++;
                }
                i5++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long p() {
        return Math.min(this.j, this.f10771i);
    }

    public final Object[] q(int i5, int i10, Object[] objArr) {
        if (i10 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i10];
        this.f10770h = objArr2;
        if (objArr != null) {
            long p10 = p();
            for (int i11 = 0; i11 < i5; i11++) {
                long j = i11 + p10;
                u0.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean r(Object obj) {
        int i5 = this.f11241b;
        int i10 = this.f10767e;
        if (i5 != 0) {
            int i11 = this.f10772k;
            int i12 = this.f10768f;
            if (i11 >= i12 && this.j <= this.f10771i) {
                int ordinal = this.f10769g.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new gf.m();
                    }
                }
            }
            n(obj);
            int i13 = this.f10772k + 1;
            this.f10772k = i13;
            if (i13 > i12) {
                m();
            }
            long p10 = p() + this.f10772k;
            long j = this.f10771i;
            if (((int) (p10 - j)) > i10) {
                u(1 + j, this.j, p() + this.f10772k, p() + this.f10772k + this.f10773l);
            }
        } else if (i10 != 0) {
            n(obj);
            int i14 = this.f10772k + 1;
            this.f10772k = i14;
            if (i14 > i10) {
                m();
            }
            this.j = p() + this.f10772k;
            return true;
        }
        return true;
    }

    public final long s(v0 v0Var) {
        long j = v0Var.f10783a;
        if (j < p() + this.f10772k) {
            return j;
        }
        if (this.f10768f <= 0 && j <= p() && this.f10773l != 0) {
            return j;
        }
        return -1L;
    }

    public final Object t(v0 v0Var) {
        Object obj;
        Continuation[] continuationArr = ig.c.f11244a;
        synchronized (this) {
            try {
                long s8 = s(v0Var);
                if (s8 < 0) {
                    obj = u0.f10777a;
                } else {
                    long j = v0Var.f10783a;
                    Object[] objArr = this.f10770h;
                    Intrinsics.checkNotNull(objArr);
                    Object c2 = u0.c(objArr, s8);
                    if (c2 instanceof r0) {
                        c2 = ((r0) c2).f10753c;
                    }
                    v0Var.f10783a = s8 + 1;
                    Object obj2 = c2;
                    continuationArr = v(j);
                    obj = obj2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : continuationArr) {
            if (continuation != null) {
                gf.o oVar = gf.q.f10031a;
                continuation.resumeWith(Unit.f19194a);
            }
        }
        return obj;
    }

    public final void u(long j, long j6, long j10, long j11) {
        long min = Math.min(j6, j);
        for (long p10 = p(); p10 < min; p10++) {
            Object[] objArr = this.f10770h;
            Intrinsics.checkNotNull(objArr);
            u0.d(objArr, p10, null);
        }
        this.f10771i = j;
        this.j = j6;
        this.f10772k = (int) (j10 - min);
        this.f10773l = (int) (j11 - j10);
    }

    public final Continuation[] v(long j) {
        long j6;
        long j10;
        long j11;
        Continuation[] continuationArr;
        Continuation[] continuationArr2;
        ig.d[] dVarArr;
        com.android.billingclient.api.a aVar = u0.f10777a;
        Continuation[] continuationArr3 = ig.c.f11244a;
        if (j <= this.j) {
            long p10 = p();
            long j12 = this.f10772k + p10;
            int i5 = this.f10768f;
            if (i5 == 0 && this.f10773l > 0) {
                j12++;
            }
            int i10 = 0;
            if (this.f11241b != 0 && (dVarArr = this.f11240a) != null) {
                for (ig.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j13 = ((v0) dVar).f10783a;
                        if (j13 >= 0 && j13 < j12) {
                            j12 = j13;
                        }
                    }
                }
            }
            if (j12 > this.j) {
                long p11 = p() + this.f10772k;
                int min = this.f11241b > 0 ? Math.min(this.f10773l, i5 - ((int) (p11 - j12))) : this.f10773l;
                long j14 = this.f10773l + p11;
                if (min > 0) {
                    j11 = 1;
                    Object[] objArr = this.f10770h;
                    Intrinsics.checkNotNull(objArr);
                    j6 = p10;
                    Continuation[] continuationArr4 = new Continuation[min];
                    long j15 = p11;
                    while (true) {
                        if (p11 >= j14) {
                            continuationArr2 = continuationArr4;
                            j10 = j12;
                            break;
                        }
                        Object c2 = u0.c(objArr, p11);
                        continuationArr2 = continuationArr4;
                        if (c2 != aVar) {
                            Intrinsics.checkNotNull(c2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            r0 r0Var = (r0) c2;
                            int i11 = i10 + 1;
                            j10 = j12;
                            continuationArr2[i10] = r0Var.f10754d;
                            u0.d(objArr, p11, aVar);
                            u0.d(objArr, j15, r0Var.f10753c);
                            j15++;
                            if (i11 >= min) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            j10 = j12;
                        }
                        p11++;
                        continuationArr4 = continuationArr2;
                        j12 = j10;
                    }
                    p11 = j15;
                    continuationArr = continuationArr2;
                } else {
                    j6 = p10;
                    j10 = j12;
                    j11 = 1;
                    continuationArr = continuationArr3;
                }
                int i12 = (int) (p11 - j6);
                long j16 = this.f11241b == 0 ? p11 : j10;
                long max = Math.max(this.f10771i, p11 - Math.min(this.f10767e, i12));
                if (i5 == 0 && max < j14) {
                    Object[] objArr2 = this.f10770h;
                    Intrinsics.checkNotNull(objArr2);
                    if (Intrinsics.areEqual(u0.c(objArr2, max), aVar)) {
                        p11 += j11;
                        max += j11;
                    }
                }
                u(max, j16, p11, j14);
                k();
                return continuationArr.length == 0 ? continuationArr : o(continuationArr);
            }
        }
        return continuationArr3;
    }
}
