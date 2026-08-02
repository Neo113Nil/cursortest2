package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i07 extends hoi implements Function2 {
    public final /* synthetic */ j07 A;
    public av4 r;
    public zu4 s;
    public zu4 t;
    public j07 u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i07(j07 j07Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = j07Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        i07 i07Var = new i07(this.A, rq3Var);
        i07Var.z = obj;
        return i07Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i07) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0123, code lost:
    
        if (r14.q(r13, defpackage.q17.a) != r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Type inference failed for: r2v10, types: [zu4] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        av4 t;
        av4 t2;
        zu4 zu4Var;
        j07 j07Var;
        boolean z;
        zu4 zu4Var2;
        Object T;
        boolean z2;
        j07 j07Var2;
        Object T2;
        boolean z3;
        boolean z4;
        ku3 ku3Var = (ku3) this.z;
        lu3 lu3Var = lu3.a;
        int i = this.y;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        j07 j07Var3 = this.A;
        rq3 rq3Var = null;
        if (i == 0) {
            y6a.M(obj);
            av4 t3 = xw3.t(ku3Var, null, new h07(j07Var3, rq3Var, i4), 3);
            t = xw3.t(ku3Var, null, new h07(j07Var3, rq3Var, i2), 3);
            av4 t4 = xw3.t(ku3Var, null, new h07(j07Var3, rq3Var, 0), 3);
            t2 = xw3.t(ku3Var, null, new h07(j07Var3, rq3Var, i3), 3);
            this.z = null;
            this.r = t;
            this.s = t4;
            this.t = t2;
            this.u = j07Var3;
            this.y = 1;
            obj = t3.w(this);
            if (obj != lu3Var) {
                zu4Var = t4;
                j07Var = j07Var3;
            }
            return lu3Var;
        }
        if (i == 1) {
            j07 j07Var4 = this.u;
            ?? r2 = this.t;
            zu4Var = this.s;
            t = this.r;
            y6a.M(obj);
            j07Var = j07Var4;
            t2 = r2;
        } else {
            if (i == 2) {
                z = this.v;
                j07Var = this.u;
                zu4Var2 = this.t;
                zu4Var = this.s;
                y6a.M(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                this.z = null;
                this.r = null;
                this.s = null;
                this.t = zu4Var2;
                this.u = j07Var;
                this.v = z;
                this.w = booleanValue;
                this.y = 3;
                T = zu4Var.T(this);
                if (T != lu3Var) {
                    j07 j07Var5 = j07Var;
                    z2 = booleanValue;
                    obj = T;
                    j07Var2 = j07Var5;
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    this.z = null;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = j07Var2;
                    this.v = z;
                    this.w = z2;
                    this.x = booleanValue2;
                    this.y = 4;
                    T2 = zu4Var2.T(this);
                    if (T2 != lu3Var) {
                    }
                }
                return lu3Var;
            }
            if (i == 3) {
                boolean z5 = this.w;
                boolean z6 = this.v;
                j07Var2 = this.u;
                zu4Var2 = this.t;
                y6a.M(obj);
                z2 = z5;
                z = z6;
                boolean booleanValue22 = ((Boolean) obj).booleanValue();
                this.z = null;
                this.r = null;
                this.s = null;
                this.t = null;
                this.u = j07Var2;
                this.v = z;
                this.w = z2;
                this.x = booleanValue22;
                this.y = 4;
                T2 = zu4Var2.T(this);
                if (T2 != lu3Var) {
                    boolean z7 = z;
                    z3 = booleanValue22;
                    obj = T2;
                    z4 = z7;
                    j07Var2.i = new s17(z4, z2, z3, ((Boolean) obj).booleanValue());
                    g62 g62Var = j07Var3.g;
                    this.z = null;
                    this.r = null;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.y = 5;
                }
                return lu3Var;
            }
            if (i != 4) {
                if (i == 5) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = this.x;
            z2 = this.w;
            z4 = this.v;
            j07Var2 = this.u;
            y6a.M(obj);
            j07Var2.i = new s17(z4, z2, z3, ((Boolean) obj).booleanValue());
            g62 g62Var2 = j07Var3.g;
            this.z = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.y = 5;
        }
        boolean booleanValue3 = ((Boolean) obj).booleanValue();
        this.z = null;
        this.r = null;
        this.s = zu4Var;
        this.t = t2;
        this.u = j07Var;
        this.v = booleanValue3;
        this.y = 2;
        Object T3 = t.T(this);
        if (T3 != lu3Var) {
            av4 av4Var = t2;
            z = booleanValue3;
            obj = T3;
            zu4Var2 = av4Var;
            boolean booleanValue4 = ((Boolean) obj).booleanValue();
            this.z = null;
            this.r = null;
            this.s = null;
            this.t = zu4Var2;
            this.u = j07Var;
            this.v = z;
            this.w = booleanValue4;
            this.y = 3;
            T = zu4Var.T(this);
            if (T != lu3Var) {
            }
        }
        return lu3Var;
    }
}
