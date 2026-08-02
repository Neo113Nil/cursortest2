package defpackage;

import android.database.SQLException;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e1k extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ i1k u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1k(i1k i1kVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = i1kVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        i1k i1kVar = this.u;
        switch (i) {
            case 0:
                e1k e1kVar = new e1k(i1kVar, rq3Var, 0);
                e1kVar.t = obj;
                return e1kVar;
            default:
                e1k e1kVar2 = new e1k(i1kVar, rq3Var, 1);
                e1kVar2.t = obj;
                return e1kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((e1k) create((mae) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((e1k) create((avj) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r8 == r0) goto L20;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        avj avjVar;
        int i = this.r;
        i1k i1kVar = this.u;
        rq3 rq3Var = null;
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
                mae maeVar = (mae) this.t;
                this.s = 1;
                Object a = i1kVar.a(maeVar, this);
                return a == lu3Var ? lu3Var : a;
            default:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                try {
                    if (i3 == 0) {
                        y6a.M(obj);
                        avjVar = (avj) this.t;
                        this.t = avjVar;
                        this.s = 1;
                        obj = avjVar.b(this);
                        break;
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                y6a.M(obj);
                                return (Set) obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        avjVar = (avj) this.t;
                        y6a.M(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        zuj zujVar = zuj.b;
                        e1k e1kVar = new e1k(i1kVar, rq3Var, 0);
                        this.t = null;
                        this.s = 2;
                        obj = avjVar.a(zujVar, e1kVar, this);
                        break;
                    } else {
                        return rm5.a;
                    }
                } catch (SQLException unused) {
                    return rm5.a;
                }
        }
    }
}
