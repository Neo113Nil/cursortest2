package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tf2 implements b98 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ b98 b;
    public final /* synthetic */ dsf c;

    public tf2(b98 b98Var, dsf dsfVar) {
        this.b = b98Var;
        this.c = dsfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(IndexedValue indexedValue, rq3 rq3Var) {
        sf2 sf2Var;
        int i;
        if (rq3Var instanceof sf2) {
            sf2Var = (sf2) rq3Var;
            int i2 = sf2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sf2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = sf2Var.s;
                lu3 lu3Var = lu3.a;
                i = sf2Var.u;
                dsf dsfVar = this.c;
                if (i != 0) {
                    y6a.M(obj);
                    indexedValue.getClass();
                    if (indexedValue.a > dsfVar.a) {
                        Object obj2 = indexedValue.b;
                        sf2Var.r = indexedValue;
                        sf2Var.u = 1;
                        if (this.b.emit(obj2, sf2Var) == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                indexedValue = sf2Var.r;
                y6a.M(obj);
                dsfVar.a = indexedValue.a;
                return Unit.a;
            }
        }
        sf2Var = new sf2(this, rq3Var);
        Object obj3 = sf2Var.s;
        lu3 lu3Var2 = lu3.a;
        i = sf2Var.u;
        dsf dsfVar2 = this.c;
        if (i != 0) {
        }
        dsfVar2.a = indexedValue.a;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        za8 za8Var;
        int i;
        switch (this.a) {
            case 0:
                return a((IndexedValue) obj, rq3Var);
            default:
                if (rq3Var instanceof za8) {
                    za8Var = (za8) rq3Var;
                    int i2 = za8Var.t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        za8Var.t = i2 - Integer.MIN_VALUE;
                        Object obj2 = za8Var.r;
                        lu3 lu3Var = lu3.a;
                        i = za8Var.t;
                        if (i != 0) {
                            y6a.M(obj2);
                            dsf dsfVar = this.c;
                            int i3 = dsfVar.a;
                            dsfVar.a = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened");
                            }
                            IndexedValue indexedValue = new IndexedValue(i3, obj);
                            za8Var.t = 1;
                            if (this.b.emit(indexedValue, za8Var) == lu3Var) {
                                return lu3Var;
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj2);
                        }
                        return Unit.a;
                    }
                }
                za8Var = new za8(this, rq3Var);
                Object obj22 = za8Var.r;
                lu3 lu3Var2 = lu3.a;
                i = za8Var.t;
                if (i != 0) {
                }
                return Unit.a;
        }
    }

    public tf2(dsf dsfVar, b98 b98Var) {
        this.c = dsfVar;
        this.b = b98Var;
    }
}
