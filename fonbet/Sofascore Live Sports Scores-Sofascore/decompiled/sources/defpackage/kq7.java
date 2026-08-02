package defpackage;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kq7 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq7(int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.s = i;
        this.u = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                kq7 kq7Var = new kq7(this.u, rq3Var, 0);
                kq7Var.t = obj;
                return kq7Var;
            case 1:
                kq7 kq7Var2 = new kq7(this.u, rq3Var, 1);
                kq7Var2.t = obj;
                return kq7Var2;
            case 2:
                kq7 kq7Var3 = new kq7(this.u, rq3Var, 2);
                kq7Var3.t = obj;
                return kq7Var3;
            default:
                kq7 kq7Var4 = new kq7(this.s, this.u, rq3Var);
                kq7Var4.t = obj;
                return kq7Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((kq7) create((udl) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((kq7) create((udl) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((kq7) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((kq7) create((p0d) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        int i2 = this.u;
        switch (i) {
            case 0:
                udl udlVar = (udl) this.t;
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (udlVar.a(i2, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                udl udlVar2 = (udl) this.t;
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.t = null;
                    this.s = 1;
                    if (udlVar2.j(i2, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                Application application = (Application) this.t;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    qa6 qa6Var = su8.a;
                    this.t = application;
                    this.s = 1;
                    obj = qa6Var.z(i2, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    su8.e(application);
                    su8.c(application);
                }
                return Unit.a;
            default:
                p0d p0dVar = (p0d) this.t;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                p0d g = p0dVar.g();
                int i6 = this.s;
                n6l n6lVar = n6l.a;
                g.e(n6l.g, new Integer(i6));
                g.e(n6l.h, new Integer(i2));
                return g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq7(int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = i;
    }
}
