package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class aeh extends u7 implements b1d, nj2, pt8 {
    public final int e;
    public final int f;
    public final a62 g;
    public Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public aeh(int i, int i2, a62 a62Var) {
        this.e = i;
        this.f = i2;
        this.g = a62Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:47|48))(1:49)|12|13|14|15|(3:16|(3:38|39|(3:41|42|43)(1:44))(4:18|(1:23)|32|(2:34|35)(1:36))|37))(4:50|51|52|53)|29|30)(5:59|60|61|(2:63|(1:65))|67)|54|55|15|(3:16|(0)(0)|37)))|70|6|(0)(0)|54|55|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        throw r2.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(aeh aehVar, b98 b98Var, rq3 rq3Var) {
        zdh zdhVar;
        int i;
        aeh aehVar2;
        Throwable th;
        ceh cehVar;
        b98 b98Var2;
        yda ydaVar;
        Object u;
        yda ydaVar2;
        b98 b98Var3;
        if (rq3Var instanceof zdh) {
            zdhVar = (zdh) rq3Var;
            int i2 = zdhVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zdhVar.x = i2 - Integer.MIN_VALUE;
                Object obj = zdhVar.v;
                lu3 lu3Var = lu3.a;
                i = zdhVar.x;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ydaVar2 = zdhVar.u;
                            cehVar = zdhVar.t;
                            b98Var3 = zdhVar.s;
                            aehVar2 = zdhVar.r;
                        } else {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return;
                            }
                            ydaVar2 = zdhVar.u;
                            cehVar = zdhVar.t;
                            b98Var3 = zdhVar.s;
                            aehVar2 = zdhVar.r;
                        }
                        try {
                            y6a.M(obj);
                            b98Var2 = b98Var3;
                            ydaVar = ydaVar2;
                            aehVar = aehVar2;
                            while (true) {
                                u = aehVar.u(cehVar);
                                if (u == beh.a) {
                                    zdhVar.r = aehVar;
                                    zdhVar.s = b98Var2;
                                    zdhVar.t = cehVar;
                                    zdhVar.u = ydaVar;
                                    zdhVar.x = 2;
                                    if (aehVar.k(cehVar, zdhVar) == lu3Var) {
                                        return;
                                    }
                                } else {
                                    if (ydaVar != null && !ydaVar.isActive()) {
                                        break;
                                    }
                                    zdhVar.r = aehVar;
                                    zdhVar.s = b98Var2;
                                    zdhVar.t = cehVar;
                                    zdhVar.u = ydaVar;
                                    zdhVar.x = 3;
                                    if (b98Var2.emit(u, zdhVar) == lu3Var) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        cehVar = zdhVar.t;
                        b98 b98Var4 = zdhVar.s;
                        aeh aehVar3 = zdhVar.r;
                        try {
                            y6a.M(obj);
                            b98Var2 = b98Var4;
                            aehVar = aehVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            aehVar2 = aehVar3;
                        }
                    }
                    aehVar2.i(cehVar);
                    throw th;
                }
                y6a.M(obj);
                ceh cehVar2 = (ceh) aehVar.f();
                try {
                    if (b98Var instanceof eki) {
                        zdhVar.r = aehVar;
                        zdhVar.s = b98Var;
                        zdhVar.t = cehVar2;
                        zdhVar.x = 1;
                        if (((eki) b98Var).a(zdhVar) == lu3Var) {
                            return;
                        }
                    }
                    b98Var2 = b98Var;
                    cehVar = cehVar2;
                } catch (Throwable th4) {
                    aehVar2 = aehVar;
                    th = th4;
                    cehVar = cehVar2;
                }
                ydaVar = (yda) zdhVar.getContext().get(uic.g);
                while (true) {
                    u = aehVar.u(cehVar);
                    if (u == beh.a) {
                    }
                }
            }
        }
        zdhVar = new zdh(aehVar, rq3Var);
        Object obj2 = zdhVar.v;
        lu3 lu3Var2 = lu3.a;
        i = zdhVar.x;
        if (i == 0) {
        }
        ydaVar = (yda) zdhVar.getContext().get(uic.g);
        while (true) {
            u = aehVar.u(cehVar);
            if (u == beh.a) {
            }
        }
    }

    @Override // defpackage.xdh
    public final List a() {
        synchronized (this) {
            int q = (int) ((q() + this.k) - this.i);
            if (q == 0) {
                return km5.a;
            }
            ArrayList arrayList = new ArrayList(q);
            Object[] objArr = this.h;
            objArr.getClass();
            for (int i = 0; i < q; i++) {
                arrayList.add(objArr[((int) (this.i + i)) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // defpackage.b1d
    public final boolean b(Object obj) {
        int i;
        boolean z;
        rq3[] rq3VarArr = rd0.b;
        synchronized (this) {
            if (s(obj)) {
                rq3VarArr = p(rq3VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (rq3 rq3Var : rq3VarArr) {
            if (rq3Var != null) {
                p2g p2gVar = w2g.b;
                rq3Var.resumeWith(Unit.a);
            }
        }
        return z;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        m(this, b98Var, rq3Var);
        return lu3.a;
    }

    @Override // defpackage.b1d
    public final void d() {
        aeh aehVar;
        synchronized (this) {
            try {
                aehVar = this;
                try {
                    aehVar.v(q() + this.k, this.j, q() + this.k, q() + this.k + this.l);
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                aehVar = this;
            }
        }
    }

    @Override // defpackage.pt8
    public final z88 e(CoroutineContext coroutineContext, int i, a62 a62Var) {
        return beh.c(this, coroutineContext, i, a62Var);
    }

    @Override // defpackage.b1d, defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        aeh aehVar;
        Throwable th;
        rq3[] p;
        ydh ydhVar;
        if (b(obj)) {
            return Unit.a;
        }
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        rq3[] rq3VarArr = rd0.b;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        p2g p2gVar = w2g.b;
                        lj2Var.resumeWith(Unit.a);
                        p = p(rq3VarArr);
                        ydhVar = null;
                        aehVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        aehVar = this;
                        throw th;
                    }
                } else {
                    try {
                        aehVar = this;
                        try {
                            ydh ydhVar2 = new ydh(aehVar, q() + this.k + this.l, obj, lj2Var);
                            aehVar.o(ydhVar2);
                            aehVar.l++;
                            if (aehVar.f == 0) {
                                rq3VarArr = aehVar.p(rq3VarArr);
                            }
                            p = rq3VarArr;
                            ydhVar = ydhVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        aehVar = this;
                        th = th4;
                        throw th;
                    }
                }
                if (ydhVar != null) {
                    lj2Var.w(new dj2(ydhVar, 2));
                }
                for (rq3 rq3Var2 : p) {
                    if (rq3Var2 != null) {
                        p2g p2gVar2 = w2g.b;
                        rq3Var2.resumeWith(Unit.a);
                    }
                }
                Object q = lj2Var.q();
                lu3 lu3Var = lu3.a;
                if (q != lu3Var) {
                    q = Unit.a;
                }
                return q == lu3Var ? q : Unit.a;
            } catch (Throwable th5) {
                th = th5;
                aehVar = this;
            }
        }
    }

    @Override // defpackage.u7
    public final v7 g() {
        ceh cehVar = new ceh();
        cehVar.a = -1L;
        return cehVar;
    }

    @Override // defpackage.u7
    public final v7[] h() {
        return new ceh[2];
    }

    public final Object k(ceh cehVar, zdh zdhVar) {
        lj2 lj2Var = new lj2(1, z9a.b(zdhVar));
        lj2Var.t();
        synchronized (this) {
            try {
                if (t(cehVar) < 0) {
                    cehVar.b = lj2Var;
                } else {
                    p2g p2gVar = w2g.b;
                    lj2Var.resumeWith(Unit.a);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object q = lj2Var.q();
        return q == lu3.a ? q : Unit.a;
    }

    public final void l() {
        if (this.f != 0 || this.l > 1) {
            Object[] objArr = this.h;
            objArr.getClass();
            while (this.l > 0) {
                long q = q();
                int i = this.k;
                int i2 = this.l;
                if (objArr[((int) ((q + (i + i2)) - 1)) & (objArr.length - 1)] != beh.a) {
                    return;
                }
                this.l = i2 - 1;
                beh.d(objArr, q() + this.k + this.l, null);
            }
        }
    }

    public final void n() {
        v7[] v7VarArr;
        Object[] objArr = this.h;
        objArr.getClass();
        beh.d(objArr, q(), null);
        this.k--;
        long q = q() + 1;
        if (this.i < q) {
            this.i = q;
        }
        if (this.j < q) {
            if (this.b != 0 && (v7VarArr = this.a) != null) {
                for (v7 v7Var : v7VarArr) {
                    if (v7Var != null) {
                        ceh cehVar = (ceh) v7Var;
                        long j = cehVar.a;
                        if (0 <= j && j < q) {
                            cehVar.a = q;
                        }
                    }
                }
            }
            this.j = q;
        }
    }

    public final void o(Object obj) {
        int i = this.k + this.l;
        Object[] objArr = this.h;
        if (objArr == null) {
            objArr = r(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = r(i, objArr.length * 2, objArr);
        }
        beh.d(objArr, q() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rq3[] p(rq3[] rq3VarArr) {
        v7[] v7VarArr;
        ceh cehVar;
        lj2 lj2Var;
        int length = rq3VarArr.length;
        if (this.b != 0 && (v7VarArr = this.a) != null) {
            int length2 = v7VarArr.length;
            int i = 0;
            rq3VarArr = rq3VarArr;
            while (i < length2) {
                v7 v7Var = v7VarArr[i];
                if (v7Var != null && (lj2Var = (cehVar = (ceh) v7Var).b) != null && t(cehVar) >= 0) {
                    int length3 = rq3VarArr.length;
                    rq3VarArr = rq3VarArr;
                    if (length >= length3) {
                        rq3VarArr = Arrays.copyOf(rq3VarArr, Math.max(2, rq3VarArr.length * 2));
                    }
                    rq3VarArr[length] = lj2Var;
                    cehVar.b = null;
                    length++;
                }
                i++;
                rq3VarArr = rq3VarArr;
            }
        }
        return rq3VarArr;
    }

    public final long q() {
        return Math.min(this.j, this.i);
    }

    public final Object[] r(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            a70.r("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.h = objArr2;
        if (objArr != null) {
            long q = q();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + q;
                beh.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i = this.b;
        int i2 = this.e;
        if (i != 0) {
            int i3 = this.k;
            int i4 = this.f;
            if (i3 >= i4 && this.j <= this.i) {
                int ordinal = this.g.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        zzl.b();
                        return false;
                    }
                }
            }
            o(obj);
            int i5 = this.k + 1;
            this.k = i5;
            if (i5 > i4) {
                n();
            }
            long q = q() + this.k;
            long j = this.i;
            if (((int) (q - j)) > i2) {
                v(1 + j, this.j, q() + this.k, q() + this.k + this.l);
            }
        } else if (i2 != 0) {
            o(obj);
            int i6 = this.k + 1;
            this.k = i6;
            if (i6 > i2) {
                n();
            }
            this.j = q() + this.k;
            return true;
        }
        return true;
    }

    public final long t(ceh cehVar) {
        long j = cehVar.a;
        if (j >= q() + this.k && (this.f > 0 || j > q() || this.l == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object u(ceh cehVar) {
        Object obj;
        rq3[] rq3VarArr = rd0.b;
        synchronized (this) {
            try {
                long t = t(cehVar);
                if (t < 0) {
                    obj = beh.a;
                } else {
                    long j = cehVar.a;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    Object obj2 = objArr[((int) t) & (objArr.length - 1)];
                    if (obj2 instanceof ydh) {
                        obj2 = ((ydh) obj2).c;
                    }
                    cehVar.a = t + 1;
                    Object obj3 = obj2;
                    rq3VarArr = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (rq3 rq3Var : rq3VarArr) {
            if (rq3Var != null) {
                p2g p2gVar = w2g.b;
                rq3Var.resumeWith(Unit.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long q = q(); q < min; q++) {
            Object[] objArr = this.h;
            objArr.getClass();
            beh.d(objArr, q, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - min);
        this.l = (int) (j4 - j3);
    }

    public final rq3[] w(long j) {
        long j2;
        int i;
        long j3;
        rq3[] rq3VarArr;
        rq3[] rq3VarArr2;
        v7[] v7VarArr;
        rq3[] rq3VarArr3 = rd0.b;
        if (j <= this.j) {
            long q = q();
            long j4 = this.k + q;
            int i2 = this.f;
            if (i2 == 0 && this.l > 0) {
                j4++;
            }
            int i3 = 0;
            if (this.b != 0 && (v7VarArr = this.a) != null) {
                for (v7 v7Var : v7VarArr) {
                    if (v7Var != null) {
                        long j5 = ((ceh) v7Var).a;
                        if (0 <= j5 && j5 < j4) {
                            j4 = j5;
                        }
                    }
                }
            }
            if (j4 > this.j) {
                long q2 = q() + this.k;
                int i4 = this.b;
                int i5 = this.l;
                if (i4 > 0) {
                    i5 = Math.min(i5, i2 - ((int) (q2 - j4)));
                }
                long j6 = this.l + q2;
                ih2 ih2Var = beh.a;
                if (i5 > 0) {
                    rq3[] rq3VarArr4 = new rq3[i5];
                    j3 = 1;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    j2 = j4;
                    long j7 = q2;
                    while (true) {
                        if (q2 >= j6) {
                            rq3VarArr2 = rq3VarArr4;
                            i = i2;
                            break;
                        }
                        rq3VarArr2 = rq3VarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) q2)];
                        if (obj != ih2Var) {
                            obj.getClass();
                            ydh ydhVar = (ydh) obj;
                            int i6 = i3 + 1;
                            i = i2;
                            rq3VarArr2[i3] = ydhVar.d;
                            beh.d(objArr, q2, ih2Var);
                            beh.d(objArr, j7, ydhVar.c);
                            j7++;
                            if (i6 >= i5) {
                                break;
                            }
                            i3 = i6;
                        } else {
                            i = i2;
                        }
                        q2++;
                        rq3VarArr4 = rq3VarArr2;
                        i2 = i;
                    }
                    q2 = j7;
                    rq3VarArr = rq3VarArr2;
                } else {
                    j2 = j4;
                    i = i2;
                    j3 = 1;
                    rq3VarArr = rq3VarArr3;
                }
                long max = Math.max(this.i, Math.max(q, q2 - this.e));
                if (i == 0 && max < j6) {
                    Object[] objArr2 = this.h;
                    objArr2.getClass();
                    if (Intrinsics.c(objArr2[((int) max) & (objArr2.length - 1)], ih2Var)) {
                        q2 += j3;
                        max += j3;
                    }
                }
                long j8 = q2;
                v(max, this.b == 0 ? j8 : j2, j8, j6);
                l();
                return rq3VarArr.length == 0 ? rq3VarArr : p(rq3VarArr);
            }
        }
        return rq3VarArr3;
    }
}
