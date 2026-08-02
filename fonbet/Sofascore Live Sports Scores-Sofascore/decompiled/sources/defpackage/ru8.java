package defpackage;

import android.app.Application;
import com.sofascore.results.service.StageWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ru8 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public int s;
    public final /* synthetic */ int t;
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru8(StageWorker stageWorker, int i, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = stageWorker;
        this.t = i;
        this.u = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        int i2 = this.t;
        switch (i) {
            case 0:
                ru8 ru8Var = new ru8(i2, rq3Var);
                ru8Var.v = obj;
                return ru8Var;
            default:
                return new ru8((StageWorker) this.v, i2, this.u, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((ru8) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ru8) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.r;
        int i2 = this.t;
        rq3 rq3Var = null;
        int i3 = 1;
        switch (i) {
            case 0:
                Application application = (Application) this.v;
                lu3 lu3Var = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    qa6 qa6Var = su8.a;
                    this.v = application;
                    this.s = 1;
                    obj = qa6Var.s(i2, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = this.u;
                        y6a.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                            su8.d(application);
                            if (z) {
                                su8.e(application);
                            }
                            su8.c(application);
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                qa6 qa6Var2 = su8.a;
                this.v = application;
                this.u = booleanValue;
                this.s = 2;
                v76 v76Var = qa6Var2.a;
                Object T = gz8.T(this, v76Var.a, new xr2(v76Var, i2, rq3Var, i3));
                if (T != lu3Var) {
                    obj = T;
                    z = booleanValue;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    return Unit.a;
                }
                return lu3Var;
            default:
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
                StageWorker stageWorker = (StageWorker) this.v;
                boolean z2 = this.u;
                this.s = 1;
                Object f = stageWorker.f(i2, z2, this);
                return f == lu3Var2 ? lu3Var2 : f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru8(int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = i;
    }
}
