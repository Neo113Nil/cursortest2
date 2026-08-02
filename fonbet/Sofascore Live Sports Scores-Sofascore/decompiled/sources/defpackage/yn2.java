package defpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yn2 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public yn2(b98 b98Var, od7 od7Var, List list, Map map) {
        this.a = 4;
        this.e = b98Var;
        this.b = od7Var;
        this.c = list;
        this.d = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int[] iArr, rq3 rq3Var) {
        c1k c1kVar;
        int i;
        String[] strArr = (String[]) this.c;
        b98 b98Var = (b98) this.e;
        fsf fsfVar = (fsf) this.b;
        if (rq3Var instanceof c1k) {
            c1kVar = (c1k) rq3Var;
            int i2 = c1kVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1kVar.u = i2 - Integer.MIN_VALUE;
                Object obj = c1kVar.s;
                lu3 lu3Var = lu3.a;
                i = c1kVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    if (fsfVar.a == null) {
                        Set a0 = ph0.a0(strArr);
                        c1kVar.r = iArr;
                        c1kVar.u = 1;
                    } else {
                        int[] iArr2 = (int[]) this.d;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj2 = fsfVar.a;
                            if (obj2 == null) {
                                a70.r("Required value was null.");
                                return null;
                            }
                            int i6 = iArr2[i4];
                            if (((int[]) obj2)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set W0 = CollectionsKt.W0(arrayList);
                            c1kVar.r = iArr;
                            c1kVar.u = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = c1kVar.r;
                    y6a.M(obj);
                }
                fsfVar.a = iArr;
                return Unit.a;
            }
        }
        c1kVar = new c1k(this, rq3Var);
        Object obj3 = c1kVar.s;
        lu3 lu3Var2 = lu3.a;
        i = c1kVar.u;
        if (i != 0) {
        }
        fsfVar.a = iArr;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0184  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        xn2 xn2Var;
        int i;
        ld7 ld7Var;
        int i2;
        Object obj2 = obj;
        int i3 = this.a;
        boolean z = true;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        Object obj6 = this.e;
        switch (i3) {
            case 0:
                fsf fsfVar = (fsf) obj5;
                if (rq3Var instanceof xn2) {
                    xn2Var = (xn2) rq3Var;
                    int i4 = xn2Var.u;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        xn2Var.u = i4 - Integer.MIN_VALUE;
                        Object obj7 = xn2Var.s;
                        lu3 lu3Var = lu3.a;
                        i = xn2Var.u;
                        if (i != 0) {
                            y6a.M(obj7);
                            yda ydaVar = (yda) fsfVar.a;
                            if (ydaVar != null) {
                                ydaVar.e(new ht2("Child of the scoped flow was cancelled"));
                                xn2Var.r = obj2;
                                xn2Var.u = 1;
                                if (ydaVar.Z(xn2Var) == lu3Var) {
                                    return lu3Var;
                                }
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj2 = xn2Var.r;
                            y6a.M(obj7);
                        }
                        fsfVar.a = xw3.L((ku3) obj4, null, nu3.d, new wn2((zn2) obj3, (b98) obj6, obj2, null), 1);
                        return Unit.a;
                    }
                }
                xn2Var = new xn2(this, rq3Var);
                Object obj72 = xn2Var.s;
                lu3 lu3Var2 = lu3.a;
                i = xn2Var.u;
                if (i != 0) {
                }
                fsfVar.a = xw3.L((ku3) obj4, null, nu3.d, new wn2((zn2) obj3, (b98) obj6, obj2, null), 1);
                return Unit.a;
            case 1:
                tbj tbjVar = (tbj) obj3;
                q5b q5bVar = (q5b) obj5;
                if (((Boolean) obj2).booleanValue() && q5bVar.b()) {
                    l98.i0((gdj) obj4, q5bVar, tbjVar.l(), (qu9) obj6, tbjVar.b);
                } else {
                    l98.O(q5bVar);
                }
                return Unit.a;
            case 2:
                ((Number) obj2).intValue();
                ksa ksaVar = (ksa) obj5;
                int h = ksaVar.h() / 12;
                int h2 = (ksaVar.h() % 12) + 1;
                kg2 kg2Var = (kg2) obj3;
                int i5 = ((IntRange) obj6).a + h;
                kg2Var.getClass();
                ((Function1) obj4).invoke(new Long(kg2Var.c(LocalDate.of(i5, h2, 1)).e));
                return Unit.a;
            case 3:
                i7a i7aVar = (i7a) obj2;
                dsf dsfVar = (dsf) obj3;
                dsf dsfVar2 = (dsf) obj4;
                dsf dsfVar3 = (dsf) obj5;
                if (i7aVar instanceof l6f) {
                    dsfVar3.a++;
                } else if (i7aVar instanceof m6f) {
                    dsfVar3.a--;
                } else if (i7aVar instanceof k6f) {
                    dsfVar3.a--;
                } else if (i7aVar instanceof sf9) {
                    dsfVar2.a++;
                } else if (i7aVar instanceof tf9) {
                    dsfVar2.a--;
                } else if (i7aVar instanceof rd8) {
                    dsfVar.a++;
                } else if (i7aVar instanceof sd8) {
                    dsfVar.a--;
                }
                boolean z2 = false;
                boolean z3 = dsfVar3.a > 0;
                boolean z4 = dsfVar2.a > 0;
                boolean z5 = dsfVar.a > 0;
                jo4 jo4Var = (jo4) obj6;
                if (jo4Var.p != z3) {
                    jo4Var.p = z3;
                    z2 = true;
                }
                if (jo4Var.q != z4) {
                    jo4Var.q = z4;
                    z2 = true;
                }
                if (jo4Var.r != z5) {
                    jo4Var.r = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    n9e.E(jo4Var);
                }
                return Unit.a;
            case 4:
                if (rq3Var instanceof ld7) {
                    ld7Var = (ld7) rq3Var;
                    int i6 = ld7Var.s;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ld7Var.s = i6 - Integer.MIN_VALUE;
                        Object obj8 = ld7Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = ld7Var.s;
                        if (i2 != 0) {
                            y6a.M(obj8);
                            f6e z6 = g7a.z((f6e) obj2, new t53((od7) obj5, (List) obj4, (Map) obj3, (rq3) null, 4));
                            ld7Var.s = 1;
                            if (((b98) obj6).emit(z6, ld7Var) == lu3Var3) {
                                return lu3Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj8);
                        }
                        return Unit.a;
                    }
                }
                ld7Var = new ld7(this, rq3Var);
                Object obj82 = ld7Var.r;
                lu3 lu3Var32 = lu3.a;
                i2 = ld7Var.s;
                if (i2 != 0) {
                }
                return Unit.a;
            default:
                return a((int[]) obj2, rq3Var);
        }
    }

    public yn2(fsf fsfVar, b98 b98Var, String[] strArr, int[] iArr) {
        this.a = 5;
        this.b = fsfVar;
        this.e = b98Var;
        this.c = strArr;
        this.d = iArr;
    }

    public /* synthetic */ yn2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
