package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w43 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ lcj t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w43(lcj lcjVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = lcjVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                w43 w43Var = new w43(this.t, rq3Var, 0);
                long j = ((dnd) obj).a;
                return w43Var;
            case 1:
                return new w43(this.t, rq3Var, 1);
            case 2:
                return new w43(this.t, rq3Var, 2);
            default:
                return new w43(this.t, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                long j = ((dnd) obj).a;
                break;
        }
        return ((w43) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
    
        if (r7 == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        if (r2.z() == r0) goto L57;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        lcj lcjVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else if (i2 == 1) {
                    y6a.M(obj);
                } else if (i2 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                eje ejeVar = lcjVar.g;
                jwj jwjVar = lcjVar.a;
                if (ejeVar != null) {
                    CharSequence charSequence = jwjVar.d().c;
                    long j = jwjVar.d().d;
                    this.s = 2;
                    Object d = ((kje) ejeVar).d(charSequence, j, this);
                    if (d != lu3Var) {
                        d = Unit.a;
                        break;
                    }
                }
                break;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (lcjVar.y(this) == lu3Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    lcjVar.getClass();
                    pog y = sea.y(new mo1(lcjVar, 5));
                    fcj fcjVar = fcj.b;
                    gfg gfgVar = hkg.p;
                    i5k.e(2, fcjVar);
                    Object collect = pd0.n(hkg.I(y, gfgVar, fcjVar), 1).collect(new gcj(lcjVar, 0), this);
                    if (collect != lu3Var3) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    lcjVar.getClass();
                    Object collect2 = hkg.I(sea.y(new mo1(lcjVar, 4)), new qaj(3), hkg.q).collect(new gcj(lcjVar, 1), this);
                    if (collect2 != lu3Var4) {
                        collect2 = Unit.a;
                    }
                    if (collect2 == lu3Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
