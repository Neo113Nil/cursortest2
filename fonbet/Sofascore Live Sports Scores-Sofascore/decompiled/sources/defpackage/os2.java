package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class os2 implements b98 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    public os2(int i, e1d e1dVar) {
        this.a = 2;
        this.b = i;
        this.c = e1dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        if (defpackage.cga.U(r0) != r2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        if (((defpackage.g62) r4).q(r0, r10) == r2) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        Object emit;
        y23 y23Var;
        int i;
        n4e n4eVar;
        int i2;
        int i3 = this.a;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                us2 us2Var = (us2) obj2;
                int i4 = this.b;
                this.b = i4 + 1;
                if (i4 < 0) {
                    throw new ArithmeticException("Index overflow has happened");
                }
                String str = (String) obj;
                us2Var.u.l(str.length() > 0 ? str : null);
                return (i4 <= 0 || (emit = us2Var.w.emit(Unit.a, rq3Var)) != lu3.a) ? Unit.a : emit;
            case 1:
                if (rq3Var instanceof y23) {
                    y23Var = (y23) rq3Var;
                    int i5 = y23Var.t;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        y23Var.t = i5 - Integer.MIN_VALUE;
                        Object obj3 = y23Var.r;
                        lu3 lu3Var = lu3.a;
                        i = y23Var.t;
                        if (i != 0) {
                            y6a.M(obj3);
                            IndexedValue indexedValue = new IndexedValue(this.b, obj);
                            y23Var.t = 1;
                            break;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    y6a.M(obj3);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj3);
                        }
                        y23Var.t = 2;
                        break;
                    }
                }
                y23Var = new y23(this, rq3Var);
                Object obj32 = y23Var.r;
                lu3 lu3Var2 = lu3.a;
                i = y23Var.t;
                if (i != 0) {
                }
                y23Var.t = 2;
            case 2:
                if (!(((j52) obj) instanceof z42)) {
                    return Unit.a;
                }
                e1d e1dVar = (e1d) obj2;
                ia0 ia0Var = ia0.q;
                udl h = ok3.p().h();
                Set set = h.l;
                if (set == null) {
                    set = (Set) td4.t0(g.a, new ndl(h, r5, 0));
                }
                e1dVar.setValue(Boolean.valueOf(set.contains(new Integer(this.b))));
                return Unit.a;
            default:
                if (rq3Var instanceof n4e) {
                    n4eVar = (n4e) rq3Var;
                    int i6 = n4eVar.s;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        n4eVar.s = i6 - Integer.MIN_VALUE;
                        Object obj4 = n4eVar.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = n4eVar.s;
                        if (i2 != 0) {
                            y6a.M(obj4);
                            jw8 jw8Var = new jw8(this.b, (vvk) obj);
                            n4eVar.s = 1;
                            if (((b98) obj2).emit(jw8Var, n4eVar) == lu3Var3) {
                                return lu3Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj4);
                        }
                        return Unit.a;
                    }
                }
                n4eVar = new n4e(this, rq3Var);
                Object obj42 = n4eVar.r;
                lu3 lu3Var32 = lu3.a;
                i2 = n4eVar.s;
                if (i2 != 0) {
                }
                return Unit.a;
        }
    }

    public /* synthetic */ os2(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public os2(us2 us2Var) {
        this.a = 0;
        this.c = us2Var;
    }
}
