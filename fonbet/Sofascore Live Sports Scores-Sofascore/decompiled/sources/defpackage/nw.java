package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nw implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fsf b;
    public final /* synthetic */ ku3 c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ nw(fsf fsfVar, ku3 ku3Var, Function2 function2, int i) {
        this.a = i;
        this.b = fsfVar;
        this.c = ku3Var;
        this.d = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        lw lwVar;
        int i;
        mw mwVar;
        int i2;
        int i3 = this.a;
        fsf fsfVar = this.b;
        switch (i3) {
            case 0:
                if (rq3Var instanceof lw) {
                    lwVar = (lw) rq3Var;
                    int i4 = lwVar.u;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        lwVar.u = i4 - Integer.MIN_VALUE;
                        Object obj2 = lwVar.s;
                        lu3 lu3Var = lu3.a;
                        i = lwVar.u;
                        if (i != 0) {
                            y6a.M(obj2);
                            yda ydaVar = (yda) fsfVar.a;
                            if (ydaVar != null) {
                                ydaVar.e(new yv());
                                lwVar.r = obj;
                                lwVar.u = 1;
                                if (ydaVar.Z(lwVar) == lu3Var) {
                                    break;
                                }
                            }
                        } else if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = lwVar.r;
                            y6a.M(obj2);
                        }
                        Object obj3 = obj;
                        nu3 nu3Var = nu3.d;
                        ku3 ku3Var = this.c;
                        fsfVar.a = xw3.L(ku3Var, null, nu3Var, new kw(this.d, obj3, ku3Var, null, 0), 1);
                        break;
                    }
                }
                lwVar = new lw(this, rq3Var);
                Object obj22 = lwVar.s;
                lu3 lu3Var2 = lu3.a;
                i = lwVar.u;
                if (i != 0) {
                }
                Object obj32 = obj;
                nu3 nu3Var2 = nu3.d;
                ku3 ku3Var2 = this.c;
                fsfVar.a = xw3.L(ku3Var2, null, nu3Var2, new kw(this.d, obj32, ku3Var2, null, 0), 1);
            default:
                if (rq3Var instanceof mw) {
                    mwVar = (mw) rq3Var;
                    int i5 = mwVar.u;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mwVar.u = i5 - Integer.MIN_VALUE;
                        Object obj4 = mwVar.s;
                        lu3 lu3Var3 = lu3.a;
                        i2 = mwVar.u;
                        if (i2 != 0) {
                            y6a.M(obj4);
                            yda ydaVar2 = (yda) fsfVar.a;
                            if (ydaVar2 != null) {
                                ydaVar2.e(new zv());
                                mwVar.r = obj;
                                mwVar.u = 1;
                                if (ydaVar2.Z(mwVar) == lu3Var3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            obj = mwVar.r;
                            y6a.M(obj4);
                        }
                        Object obj5 = obj;
                        nu3 nu3Var3 = nu3.d;
                        ku3 ku3Var3 = this.c;
                        fsfVar.a = xw3.L(ku3Var3, null, nu3Var3, new kw(this.d, obj5, ku3Var3, null, 1), 1);
                        break;
                    }
                }
                mwVar = new mw(this, rq3Var);
                Object obj42 = mwVar.s;
                lu3 lu3Var32 = lu3.a;
                i2 = mwVar.u;
                if (i2 != 0) {
                }
                Object obj52 = obj;
                nu3 nu3Var32 = nu3.d;
                ku3 ku3Var32 = this.c;
                fsfVar.a = xw3.L(ku3Var32, null, nu3Var32, new kw(this.d, obj52, ku3Var32, null, 1), 1);
        }
        return Unit.a;
    }
}
