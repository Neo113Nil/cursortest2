package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uqb extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ zqb t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uqb(zqb zqbVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = zqbVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        zqb zqbVar = this.t;
        switch (i) {
            case 0:
                return new uqb(zqbVar, rq3Var, 0);
            case 1:
                return new uqb(zqbVar, rq3Var, 1);
            default:
                return new uqb(zqbVar, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((uqb) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r8 == r1) goto L41;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                zqb zqbVar = this.t;
                ith ithVar = zqbVar.j;
                lu3 lu3Var = lu3.a;
                int i = this.s;
                if (i == 0) {
                    y6a.M(obj);
                    if (!ithVar.b.getBoolean("SOFA_SEASON_SHOWN_2025", false)) {
                        this.s = 1;
                        obj = ithVar.b(this);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                if (((Boolean) obj).booleanValue()) {
                    r4a.M(zqbVar.e0);
                }
                return Unit.a;
            case 1:
                zqb zqbVar2 = this.t;
                lu3 lu3Var2 = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    f5j f5jVar = f5j.a;
                    Context i3 = zqbVar2.i();
                    cg4 cg4Var = zqbVar2.k;
                    this.s = 1;
                    obj = f5jVar.a(i3, cg4Var, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        AiAnalystDemoEvent aiAnalystDemoEvent = (AiAnalystDemoEvent) obj;
                        if (aiAnalystDemoEvent != null) {
                            zqbVar2.l0.a(new Integer(aiAnalystDemoEvent.getId()));
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    s96 s96Var = zqbVar2.h;
                    this.s = 2;
                    obj = s96Var.w(Sports.TENNIS, this);
                    break;
                }
                return Unit.a;
            default:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Context i5 = this.t.i();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = i5.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    if (!sharedPreferences.getBoolean("PRIMARY_TAB_PROMPT_DISMISSED", false)) {
                        n9e.u(i5, new vt(i5, 7));
                    }
                    aeh aehVar = this.t.F;
                    Unit unit = Unit.a;
                    this.s = 1;
                    if (aehVar.emit(unit, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
        }
    }
}
