package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w7c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ u8c t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7c(u8c u8cVar, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.t = u8cVar;
        this.u = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.u;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                return new w7c(u8cVar, i2, rq3Var, 0);
            case 1:
                return new w7c(u8cVar, i2, rq3Var, 1);
            case 2:
                return new w7c(u8cVar, i2, rq3Var, 2);
            case 3:
                return new w7c(u8cVar, i2, rq3Var, 3);
            case 4:
                return new w7c(u8cVar, i2, rq3Var, 4);
            case 5:
                return new w7c(u8cVar, i2, rq3Var, 5);
            case 6:
                return new w7c(u8cVar, i2, rq3Var, 6);
            case 7:
                return new w7c(u8cVar, i2, rq3Var, 7);
            case 8:
                return new w7c(u8cVar, i2, rq3Var, 8);
            case 9:
                return new w7c(u8cVar, i2, rq3Var, 9);
            case 10:
                return new w7c(u8cVar, i2, rq3Var, 10);
            case 11:
                return new w7c(u8cVar, i2, rq3Var, 11);
            case 12:
                return new w7c(u8cVar, i2, rq3Var, 12);
            default:
                return new w7c(u8cVar, i2, rq3Var, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((w7c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        u8c u8cVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var = u8cVar.c;
                this.s = 1;
                Object d = s96Var.d(i2, this);
                return d == lu3Var ? lu3Var : d;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var2 = u8cVar.c;
                this.s = 1;
                Object d2 = s96Var2.d(i2, this);
                return d2 == lu3Var2 ? lu3Var2 : d2;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar = u8cVar.d;
                this.s = 1;
                Object q0 = w3bVar.q0(i2, this);
                return q0 == lu3Var3 ? lu3Var3 : q0;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 != 0) {
                    if (i6 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var3 = u8cVar.c;
                this.s = 1;
                Object d3 = s96Var3.d(i2, this);
                return d3 == lu3Var4 ? lu3Var4 : d3;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 != 0) {
                    if (i7 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var4 = u8cVar.c;
                this.s = 1;
                Object o = s96Var4.o(i2, null, this);
                return o == lu3Var5 ? lu3Var5 : o;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 != 0) {
                    if (i8 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var5 = u8cVar.c;
                this.s = 1;
                Object d4 = s96Var5.d(i2, this);
                return d4 == lu3Var6 ? lu3Var6 : d4;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar = u8cVar.g;
                this.s = 1;
                Object i10 = wveVar.i(i2, this);
                return i10 == lu3Var7 ? lu3Var7 : i10;
            case 7:
                lu3 lu3Var8 = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar = u8cVar.e;
                this.s = 1;
                Object k = j0jVar.k(i2, this);
                return k == lu3Var8 ? lu3Var8 : k;
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object a = u8cVar.a(i2, this);
                    return a == lu3Var9 ? lu3Var9 : a;
                }
                if (i12 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar2 = u8cVar.g;
                this.s = 1;
                wveVar2.getClass();
                Object P = yaa.P(new ive(wveVar2, i2, null, 8), this);
                return P == lu3Var10 ? lu3Var10 : P;
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var6 = u8cVar.c;
                this.s = 1;
                Object d5 = s96Var6.d(i2, this);
                return d5 == lu3Var11 ? lu3Var11 : d5;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j0j j0jVar2 = u8cVar.e;
                this.s = 1;
                Object k2 = j0jVar2.k(i2, this);
                return k2 == lu3Var12 ? lu3Var12 : k2;
            case 12:
                lu3 lu3Var13 = lu3.a;
                int i16 = this.s;
                if (i16 != 0) {
                    if (i16 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                s96 s96Var7 = u8cVar.c;
                this.s = 1;
                Object d6 = s96Var7.d(i2, this);
                return d6 == lu3Var13 ? lu3Var13 : d6;
            default:
                lu3 lu3Var14 = lu3.a;
                int i17 = this.s;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                t9c t9cVar = u8cVar.h;
                String str = u8cVar.l;
                this.s = 1;
                Serializable c = t9cVar.c(i2, str, true, this);
                return c == lu3Var14 ? lu3Var14 : c;
        }
    }
}
