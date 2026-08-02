package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class obi extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ rbi t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ rv8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ obi(rbi rbiVar, int i, int i2, rv8 rv8Var, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.t = rbiVar;
        this.u = i;
        this.v = i2;
        this.w = rv8Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new obi(this.t, this.u, this.v, this.w, rq3Var, 0);
            case 1:
                return new obi(this.t, this.u, this.v, this.w, rq3Var, 1);
            case 2:
                return new obi(this.t, this.u, this.v, this.w, rq3Var, 2);
            default:
                return new obi(this.t, this.u, this.v, this.w, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((obi) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        rv8 rv8Var = this.w;
        int i2 = this.v;
        int i3 = this.u;
        rbi rbiVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
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
                w3b w3bVar = rbiVar.e;
                String str = rv8Var.a;
                this.s = 1;
                Object s = w3bVar.s(i3, i2, this, str);
                return s == lu3Var ? lu3Var : s;
            case 1:
                lu3 lu3Var2 = lu3.a;
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
                w3b w3bVar2 = rbiVar.e;
                String str2 = rv8Var.a;
                this.s = 1;
                Object r = w3bVar2.r(i3, i2, this, str2);
                return r == lu3Var2 ? lu3Var2 : r;
            case 2:
                lu3 lu3Var3 = lu3.a;
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
                w3b w3bVar3 = rbiVar.e;
                String str3 = rv8Var.a;
                this.s = 1;
                Object x = w3bVar3.x(i3, i2, this, str3);
                return x == lu3Var3 ? lu3Var3 : x;
            default:
                lu3 lu3Var4 = lu3.a;
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
                w3b w3bVar4 = rbiVar.e;
                String str4 = rv8Var.a;
                this.s = 1;
                Object w = w3bVar4.w(i3, i2, this, str4);
                return w == lu3Var4 ? lu3Var4 : w;
        }
    }
}
