package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ca8 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public ca8(b98 b98Var, int i, List list) {
        this.a = 2;
        this.d = b98Var;
        this.c = i;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        ba8 ba8Var;
        int i;
        thj thjVar;
        int i2;
        int i3 = this.a;
        int i4 = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                if (rq3Var instanceof ba8) {
                    ba8Var = (ba8) rq3Var;
                    int i5 = ba8Var.t;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ba8Var.t = i5 - Integer.MIN_VALUE;
                        Object obj4 = ba8Var.r;
                        lu3 lu3Var = lu3.a;
                        i = ba8Var.t;
                        if (i != 0) {
                            y6a.M(obj4);
                            dsf dsfVar = (dsf) obj2;
                            int i6 = dsfVar.a;
                            if (i6 >= i4) {
                                ba8Var.t = 1;
                                if (((b98) obj3).emit(obj, ba8Var) == lu3Var) {
                                    break;
                                }
                            } else {
                                dsfVar.a = i6 + 1;
                            }
                        } else if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj4);
                        }
                        break;
                    }
                }
                ba8Var = new ba8(this, rq3Var);
                Object obj42 = ba8Var.r;
                lu3 lu3Var2 = lu3.a;
                i = ba8Var.t;
                if (i != 0) {
                }
            case 1:
                int intValue = ((Number) obj).intValue();
                dsf dsfVar2 = (dsf) obj2;
                int i7 = dsfVar2.a;
                if (intValue > i7) {
                    dsfVar2.a = intValue;
                } else if (i7 > 0 && intValue <= i7 - i4) {
                    ((Function0) ((e1d) obj3).getValue()).invoke();
                    dsfVar2.a = 0;
                }
                break;
            default:
                if (rq3Var instanceof thj) {
                    thjVar = (thj) rq3Var;
                    int i8 = thjVar.s;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        thjVar.s = i8 - Integer.MIN_VALUE;
                        Object obj5 = thjVar.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = thjVar.s;
                        if (i2 != 0) {
                            y6a.M(obj5);
                            List list = (List) obj2;
                            String str = (String) list.get((((Number) obj).intValue() + i4) % list.size());
                            thjVar.s = 1;
                            if (((b98) obj3).emit(str, thjVar) == lu3Var3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            y6a.M(obj5);
                        }
                        break;
                    }
                }
                thjVar = new thj(this, rq3Var);
                Object obj52 = thjVar.r;
                lu3 lu3Var32 = lu3.a;
                i2 = thjVar.s;
                if (i2 != 0) {
                }
        }
        return Unit.a;
    }

    public /* synthetic */ ca8(dsf dsfVar, int i, Object obj, int i2) {
        this.a = i2;
        this.b = dsfVar;
        this.c = i;
        this.d = obj;
    }
}
