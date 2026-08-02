package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class oa8 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ fsf c;

    public /* synthetic */ oa8(Function2 function2, fsf fsfVar, int i) {
        this.a = i;
        this.b = function2;
        this.c = fsfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        na8 na8Var;
        Object obj2;
        int i;
        ra8 ra8Var;
        Object obj3;
        int i2;
        int i3 = this.a;
        fsf fsfVar = this.c;
        Function2 function2 = this.b;
        switch (i3) {
            case 0:
                if (rq3Var instanceof na8) {
                    na8Var = (na8) rq3Var;
                    int i4 = na8Var.s;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        na8Var.s = i4 - Integer.MIN_VALUE;
                        obj2 = na8Var.r;
                        lu3 lu3Var = lu3.a;
                        i = na8Var.s;
                        if (i != 0) {
                            y6a.M(obj2);
                            na8Var.u = obj;
                            na8Var.s = 1;
                            obj2 = function2.invoke(obj, na8Var);
                            if (obj2 == lu3Var) {
                                return lu3Var;
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = na8Var.u;
                            y6a.M(obj2);
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return Unit.a;
                        }
                        fsfVar.a = obj;
                        throw new f0(this);
                    }
                }
                na8Var = new na8(this, rq3Var);
                obj2 = na8Var.r;
                lu3 lu3Var2 = lu3.a;
                i = na8Var.s;
                if (i != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            default:
                if (rq3Var instanceof ra8) {
                    ra8Var = (ra8) rq3Var;
                    int i5 = ra8Var.s;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ra8Var.s = i5 - Integer.MIN_VALUE;
                        obj3 = ra8Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = ra8Var.s;
                        if (i2 != 0) {
                            y6a.M(obj3);
                            ra8Var.u = obj;
                            ra8Var.s = 1;
                            obj3 = function2.invoke(obj, ra8Var);
                            if (obj3 == lu3Var3) {
                                return lu3Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = ra8Var.u;
                            y6a.M(obj3);
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return Unit.a;
                        }
                        fsfVar.a = obj;
                        throw new f0(this);
                    }
                }
                ra8Var = new ra8(this, rq3Var);
                obj3 = ra8Var.r;
                lu3 lu3Var32 = lu3.a;
                i2 = ra8Var.s;
                if (i2 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
        }
    }
}
