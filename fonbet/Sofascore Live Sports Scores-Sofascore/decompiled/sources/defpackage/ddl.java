package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ddl extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ gdl t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ddl(gdl gdlVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = gdlVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        gdl gdlVar = this.t;
        switch (i) {
            case 0:
                return new ddl(gdlVar, rq3Var, 0);
            default:
                return new ddl(gdlVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ddl) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object zclVar;
        int i = this.r;
        gdl gdlVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object c = gdlVar.c(this);
                    return c == lu3Var ? lu3Var : c;
                }
                if (i2 == 1) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                try {
                    if (i3 == 0) {
                        y6a.M(obj);
                        aea aeaVar = gdlVar.l;
                        ddl ddlVar = new ddl(gdlVar, rq3Var, 0);
                        this.s = 1;
                        obj = xw3.R(aeaVar, ddlVar, this);
                        if (obj == lu3Var2) {
                            return lu3Var2;
                        }
                    } else {
                        if (i3 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    zclVar = (cdl) obj;
                } catch (wcl e) {
                    zclVar = new bdl(e.a);
                } catch (CancellationException unused) {
                    zclVar = new zcl();
                } catch (Throwable unused2) {
                    int i4 = hdl.a;
                    rik.o().getClass();
                    zclVar = new zcl();
                }
                Object runInTransaction = gdlVar.h.runInTransaction(new c00(7, zclVar, gdlVar));
                runInTransaction.getClass();
                return runInTransaction;
        }
    }
}
