package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ox7 extends hoi implements Function2 {
    public final /* synthetic */ y6e A;
    public final /* synthetic */ qx7 B;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public Object w;
    public Set x;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox7(y6e y6eVar, qx7 qx7Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = y6eVar;
        this.B = qx7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ox7(this.A, this.B, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ox7) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        if (r1.e(r5, r17) == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long b;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        Object b2;
        Set set;
        int i5;
        Object r;
        qx7 qx7Var;
        int i6;
        int i7;
        int i8;
        int intValue;
        Object d;
        int i9;
        dij dijVar;
        long j2;
        long j3;
        dij dijVar2;
        int i10;
        qx7 qx7Var2 = this.B;
        a38 a38Var = qx7Var2.d;
        lu3 lu3Var = lu3.a;
        int i11 = this.z;
        rq3 rq3Var = null;
        if (i11 == 0) {
            y6a.M(obj);
            yea yeaVar = j58.a;
            if (fn0.B("is_feed_under_maintenance")) {
                return new z6e(km5.a, null);
            }
            Integer num = (Integer) this.A.a();
            int intValue2 = num != null ? num.intValue() : 0;
            xhj.a.getClass();
            xuc.a.getClass();
            b = xuc.b();
            if (intValue2 != 0) {
                j = b;
                i = 0;
                i2 = 0;
                i3 = intValue2;
                i4 = 0;
                this.w = qx7Var2;
                this.r = i3;
                this.s = i2;
                this.t = i;
                this.y = j;
                this.u = i4;
                this.z = 3;
                qx7Var2.getClass();
                r = s9a.r(new xy5(qx7Var2, i3, rq3Var, 3), this);
                if (r != lu3Var) {
                }
                return lu3Var;
            }
            Set set2 = a38Var.a.f;
            u8c u8cVar = qx7Var2.b;
            this.w = qx7Var2;
            this.x = set2;
            this.r = intValue2;
            this.s = 0;
            this.t = 0;
            this.y = b;
            this.u = 0;
            this.z = 1;
            b2 = u8cVar.b.b(this);
            if (b2 != lu3Var) {
                i = 0;
                i2 = 0;
                set = set2;
                i5 = intValue2;
                i4 = 0;
            }
            return lu3Var;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                int i12 = this.u;
                long j4 = this.y;
                int i13 = this.t;
                int i14 = this.s;
                int i15 = this.r;
                qx7 qx7Var3 = (qx7) this.w;
                y6a.M(obj);
                i5 = i15;
                i4 = i12;
                qx7Var2 = qx7Var3;
                i2 = i14;
                b = j4;
                i = i13;
                j = b;
                i3 = i5;
                this.w = qx7Var2;
                this.r = i3;
                this.s = i2;
                this.t = i;
                this.y = j;
                this.u = i4;
                this.z = 3;
                qx7Var2.getClass();
                r = s9a.r(new xy5(qx7Var2, i3, rq3Var, 3), this);
                if (r != lu3Var) {
                    qx7Var = qx7Var2;
                    i6 = i4;
                    i7 = i;
                    i8 = i2;
                    Pair pair = (Pair) r;
                    List list = (List) pair.a;
                    intValue = ((Number) pair.b).intValue();
                    this.w = qx7Var;
                    this.x = null;
                    this.r = i3;
                    this.s = i8;
                    this.t = i7;
                    this.y = j;
                    this.u = i6;
                    this.v = intValue;
                    this.z = 4;
                    d = qx7Var.d(list, this);
                    if (d != lu3Var) {
                    }
                }
                return lu3Var;
            }
            if (i11 == 3) {
                i6 = this.u;
                long j5 = this.y;
                i7 = this.t;
                i8 = this.s;
                i3 = this.r;
                qx7Var = (qx7) this.w;
                y6a.M(obj);
                j = j5;
                r = obj;
                Pair pair2 = (Pair) r;
                List list2 = (List) pair2.a;
                intValue = ((Number) pair2.b).intValue();
                this.w = qx7Var;
                this.x = null;
                this.r = i3;
                this.s = i8;
                this.t = i7;
                this.y = j;
                this.u = i6;
                this.v = intValue;
                this.z = 4;
                d = qx7Var.d(list2, this);
                if (d != lu3Var) {
                    i9 = i3;
                    dijVar = new dij(new Pair((List) d, intValue < qx7Var.d.a.a.size() ? null : new Integer(intValue)), whj.b(j), null);
                    if (a38Var.b.e) {
                        j2 = rx7.a;
                        j3 = dijVar.b;
                        if (xd5.c(j3, j2) < 0) {
                        }
                    }
                    if (i9 == 0) {
                    }
                    Pair pair3 = (Pair) dijVar.a;
                    return new z6e((List) pair3.a, (Integer) pair3.b);
                }
                return lu3Var;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i10 = this.r;
                dijVar2 = (dij) this.w;
                y6a.M(obj);
                i9 = i10;
                dijVar = dijVar2;
                if (i9 == 0) {
                    a38Var.b.e = false;
                }
                Pair pair32 = (Pair) dijVar.a;
                return new z6e((List) pair32.a, (Integer) pair32.b);
            }
            int i16 = this.v;
            j = this.y;
            i9 = this.r;
            qx7 qx7Var4 = (qx7) this.w;
            y6a.M(obj);
            qx7Var = qx7Var4;
            intValue = i16;
            d = obj;
            dijVar = new dij(new Pair((List) d, intValue < qx7Var.d.a.a.size() ? null : new Integer(intValue)), whj.b(j), null);
            if (a38Var.b.e && i9 == 0) {
                j2 = rx7.a;
                j3 = dijVar.b;
                if (xd5.c(j3, j2) < 0) {
                    long h = xd5.h(j2, j3);
                    this.w = dijVar;
                    this.x = null;
                    this.r = i9;
                    this.z = 5;
                    if (n4o.z(h, this) != lu3Var) {
                        dijVar2 = dijVar;
                        i10 = i9;
                        i9 = i10;
                        dijVar = dijVar2;
                    }
                    return lu3Var;
                }
            }
            if (i9 == 0) {
            }
            Pair pair322 = (Pair) dijVar.a;
            return new z6e((List) pair322.a, (Integer) pair322.b);
        }
        int i17 = this.u;
        b = this.y;
        int i18 = this.t;
        int i19 = this.s;
        int i20 = this.r;
        Set set3 = this.x;
        qx7 qx7Var5 = (qx7) this.w;
        y6a.M(obj);
        set = set3;
        i5 = i20;
        i2 = i19;
        i = i18;
        i4 = i17;
        qx7Var2 = qx7Var5;
        b2 = obj;
        set.addAll((Collection) b2);
        Set W0 = CollectionsKt.W0(qx7Var2.d.a.f);
        this.w = qx7Var2;
        this.x = null;
        this.r = i5;
        this.s = i2;
        this.t = i;
        this.y = b;
        this.u = i4;
        this.z = 2;
    }
}
