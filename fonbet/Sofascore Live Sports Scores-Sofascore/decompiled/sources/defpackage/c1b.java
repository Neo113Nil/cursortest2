package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c1b extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ w3b t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1b(w3b w3bVar, int i, int i2, rq3 rq3Var, int i3) {
        super(2, rq3Var);
        this.r = i3;
        this.t = w3bVar;
        this.u = i;
        this.v = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new c1b(this.t, this.u, this.v, rq3Var, 0);
            case 1:
                return new c1b(this.t, this.u, this.v, rq3Var, 1);
            default:
                return new c1b(this.t, this.u, this.v, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((c1b) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    zza zzaVar = new zza(this.t, this.u, this.v, null, 3);
                    this.s = 1;
                    obj = yaa.P(zzaVar, this);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    zza zzaVar2 = new zza(this.t, this.u, this.v, null, 4);
                    this.s = 1;
                    obj = yaa.P(zzaVar2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar2 = (x2g) obj;
                x2gVar2.getClass();
                return Boolean.valueOf(x2gVar2 instanceof v2g);
            default:
                lu3 lu3Var3 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    zza zzaVar3 = new zza(this.t, this.u, this.v, null, 5);
                    this.s = 1;
                    obj = yaa.P(zzaVar3, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar3 = (x2g) obj;
                x2gVar3.getClass();
                return Boolean.valueOf(x2gVar3 instanceof v2g);
        }
    }
}
