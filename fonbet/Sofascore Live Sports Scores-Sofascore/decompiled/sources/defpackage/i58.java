package defpackage;

import android.app.Activity;
import android.app.Application;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzj;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i58 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i58(rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 0;
        nxf[] nxfVarArr = nxf.a;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = 2;
        switch (this.r) {
            case 0:
                nxf[] nxfVarArr = nxf.a;
                i58 i58Var = new i58(rq3Var);
                i58Var.t = obj;
                return i58Var;
            case 1:
                i58 i58Var2 = new i58(i, rq3Var, 1);
                i58Var2.t = obj;
                return i58Var2;
            case 2:
                i58 i58Var3 = new i58(i, rq3Var, i);
                i58Var3.t = obj;
                return i58Var3;
            case 3:
                i58 i58Var4 = new i58(i, rq3Var, 3);
                i58Var4.t = obj;
                return i58Var4;
            case 4:
                i58 i58Var5 = new i58(i, rq3Var, 4);
                i58Var5.t = obj;
                return i58Var5;
            case 5:
                i58 i58Var6 = new i58(i, rq3Var, 5);
                i58Var6.t = obj;
                return i58Var6;
            case 6:
                i58 i58Var7 = new i58(i, rq3Var, 6);
                i58Var7.t = obj;
                return i58Var7;
            case 7:
                i58 i58Var8 = new i58(i, rq3Var, 7);
                i58Var8.t = obj;
                return i58Var8;
            default:
                i58 i58Var9 = new i58(i, rq3Var, 8);
                i58Var9.t = obj;
                return i58Var9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((i58) create((k8f) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((i58) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((i58) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((i58) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((i58) create((Activity) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((i58) create((String) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((i58) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((i58) create((Application) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((i58) create((b98) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        z41 z41Var;
        ku3 ku3Var;
        b98 b98Var;
        txf txfVar;
        switch (this.r) {
            case 0:
                k8f k8fVar = (k8f) this.t;
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    e58 f = e58.f();
                    f.getClass();
                    nxf[] nxfVarArr = nxf.a;
                    mi3 mi3Var = new mi3(k8fVar);
                    g7h g7hVar = f.j;
                    synchronized (g7hVar) {
                        ((LinkedHashSet) g7hVar.b).add(mi3Var);
                        g7hVar.g();
                        z41Var = new z41(g7hVar, mi3Var, r1, 13);
                    }
                    qo6 qo6Var = new qo6(z41Var, 27);
                    this.t = null;
                    this.s = 1;
                    if (v7a.i(k8fVar, qo6Var, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                Application application = (Application) this.t;
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                try {
                    if (i2 == 0) {
                        y6a.M(obj);
                        m19 m19Var = new m19(application);
                        this.t = null;
                        this.s = 1;
                        if (m19Var.c(this) == lu3Var2) {
                            return lu3Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    s38.a().c(e2);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    ku3Var = (ku3) this.t;
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ku3Var = (ku3) this.t;
                    y6a.M(obj);
                }
                while (bea.B(ku3Var.getCoroutineContext())) {
                    a7d a7dVar = new a7d(12);
                    this.t = ku3Var;
                    this.s = 1;
                    if (bea.y(getContext()).p(a7dVar, this) == lu3Var3) {
                        return lu3Var3;
                    }
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    b98Var = (b98) this.t;
                    txfVar = null;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b98Var = (b98) this.t;
                    y6a.M(obj);
                    txfVar = (txf) obj;
                }
                g4e g4eVar = new g4e(txfVar == txf.a, h4e.i);
                this.t = null;
                this.s = 2;
                if (b98Var.emit(g4eVar, this) == lu3Var4) {
                    return lu3Var4;
                }
                return Unit.a;
            case 4:
                Activity activity = (Activity) this.t;
                lu3 lu3Var5 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    it7 it7Var = new it7(19);
                    zzj b = zza.a(activity).b();
                    if (!b.a()) {
                        if (b.c.c.get() != null) {
                            r1 = true;
                        } else {
                            this.t = null;
                            this.s = 1;
                            lj2 lj2Var = new lj2(1, z9a.b(this));
                            lj2Var.t();
                            b.b(activity, it7Var, new k1d(14, lj2Var, b), new cka(lj2Var));
                            obj = lj2Var.q();
                            if (obj == lu3Var5) {
                                return lu3Var5;
                            }
                        }
                    }
                    return Boolean.valueOf(r1);
                }
                if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                r1 = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(r1);
            case 5:
                lu3 lu3Var6 = lu3.a;
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
                String str = (String) this.t;
                jod n = ufa.n(false);
                pzf pzfVar = new pzf();
                pzfVar.f(str);
                pof pofVar = new pof(n, new qzf(pzfVar));
                this.s = 1;
                Object n2 = b6a.n(pofVar, this);
                return n2 == lu3Var6 ? lu3Var6 : n2;
            case 6:
                Application application2 = (Application) this.t;
                lu3 lu3Var7 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    jgd jgdVar = jgd.a;
                    this.t = null;
                    this.s = 1;
                    if (jgdVar.c(application2, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 7:
                Application application3 = (Application) this.t;
                lu3 lu3Var8 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    jgd jgdVar2 = jgd.a;
                    this.t = null;
                    this.s = 1;
                    Object a = ((yhd) jgd.b.getValue()).a(application3, ir4.a(), this);
                    if (a != lu3Var8) {
                        a = Unit.a;
                    }
                    if (a == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var9 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    b98 b98Var2 = (b98) this.t;
                    this.s = 1;
                    if (b98Var2.emit(null, this) == lu3Var9) {
                        return lu3Var9;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i58(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }
}
