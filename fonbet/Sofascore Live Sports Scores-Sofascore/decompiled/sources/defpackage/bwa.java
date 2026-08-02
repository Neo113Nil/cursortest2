package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bwa extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ fwa t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bwa(fwa fwaVar, String str, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = fwaVar;
        this.u = str;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        String str = this.u;
        fwa fwaVar = this.t;
        switch (i) {
            case 0:
                return new bwa(fwaVar, str, rq3Var, 0);
            case 1:
                return new bwa(fwaVar, str, rq3Var, 1);
            default:
                return new bwa(fwaVar, str, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((bwa) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        String str = this.u;
        fwa fwaVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar = fwaVar.l;
                int i3 = fwaVar.n;
                this.s = 1;
                Object f = w3bVar.f(i3, str, this);
                return f == lu3Var ? lu3Var : f;
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
                w3b w3bVar2 = fwaVar.l;
                int i5 = fwaVar.n;
                xva xvaVar = (xva) ((vnb) fwaVar.f.a.getValue()).a();
                int i6 = xvaVar != null ? xvaVar.n : 1;
                this.s = 1;
                Object d = w3bVar2.d(i5, i6, this, str);
                return d == lu3Var2 ? lu3Var2 : d;
            default:
                lu3 lu3Var3 = lu3.a;
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
                w3b w3bVar3 = fwaVar.l;
                int i8 = fwaVar.n;
                xva xvaVar2 = (xva) ((vnb) fwaVar.f.a.getValue()).a();
                int i9 = xvaVar2 != null ? xvaVar2.n : 1;
                this.s = 1;
                Object d2 = w3bVar3.d(i8, i9, this, str);
                return d2 == lu3Var3 ? lu3Var3 : d2;
        }
    }
}
