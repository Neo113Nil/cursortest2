package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xq3 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ tr3 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xq3(tr3 tr3Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = tr3Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        tr3 tr3Var = this.t;
        switch (i) {
            case 0:
                return new xq3(tr3Var, rq3Var, 0);
            case 1:
                return new xq3(tr3Var, rq3Var, 1);
            case 2:
                return new xq3(tr3Var, rq3Var, 2);
            case 3:
                return new xq3(tr3Var, rq3Var, 3);
            case 4:
                return new xq3(tr3Var, rq3Var, 4);
            case 5:
                return new xq3(tr3Var, rq3Var, 5);
            case 6:
                return new xq3(tr3Var, rq3Var, 6);
            default:
                return new xq3(tr3Var, rq3Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
            case 1:
                ((xq3) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
                break;
        }
        return ((xq3) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r2.t(r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r2.u(r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r9 == r0) goto L26;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        tr3 tr3Var = this.t;
        int i2 = 1;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    z88 z88Var = tr3Var.x;
                    wq3 wq3Var = new wq3(tr3Var, 0);
                    this.s = 1;
                    if (z88Var.collect(wq3Var, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.s;
                if (i4 != 0) {
                    if (i4 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                aeh aehVar = tr3Var.k;
                wq3 wq3Var2 = new wq3(tr3Var, i2);
                this.s = 1;
                aehVar.collect(wq3Var2, this);
                return lu3Var2;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    aeh aehVar2 = tr3Var.i;
                    mmh mmhVar = mmh.e;
                    this.s = 1;
                    if (aehVar2.emit(mmhVar, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    aeh aehVar3 = tr3Var.i;
                    lmh lmhVar = lmh.e;
                    this.s = 1;
                    if (aehVar3.emit(lmhVar, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    aeh aehVar4 = tr3Var.g;
                    this.s = 1;
                    if (aehVar4.emit(d34.a, this) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    aeh aehVar5 = tr3Var.i;
                    nmh nmhVar = nmh.e;
                    this.s = 1;
                    if (aehVar5.emit(nmhVar, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    aeh aehVar6 = tr3Var.i;
                    pmh pmhVar = pmh.e;
                    this.s = 1;
                    if (aehVar6.emit(pmhVar, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    z88 z88Var2 = tr3Var.x;
                    this.s = 1;
                    obj = rd0.y(z88Var2, this);
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2 || i10 == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                int ordinal = ((l64) obj).ordinal();
                if (ordinal == 0) {
                    this.s = 2;
                    break;
                } else {
                    if (ordinal == 1) {
                        this.s = 3;
                        break;
                    } else if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    return Unit.a;
                }
        }
    }
}
