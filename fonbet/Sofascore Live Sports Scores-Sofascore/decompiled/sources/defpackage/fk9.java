package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fk9 extends hoi implements ct8 {
    public /* synthetic */ k4h A;
    public /* synthetic */ yj9 B;
    public final /* synthetic */ ct8 C;
    public final /* synthetic */ ct8 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ rx2 H;
    public final /* synthetic */ Function2 I;
    public ct8 r;
    public ct8 s;
    public Function2 t;
    public Function2 u;
    public Object v;
    public yj9 w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk9(ct8 ct8Var, ct8 ct8Var2, int i, Function2 function2, Function2 function22, rx2 rx2Var, Function2 function23, rq3 rq3Var) {
        super(3, rq3Var);
        this.C = ct8Var;
        this.D = ct8Var2;
        this.E = i;
        this.F = function2;
        this.G = function22;
        this.H = rx2Var;
        this.I = function23;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rx2 rx2Var = this.H;
        Function2 function2 = this.I;
        fk9 fk9Var = new fk9(this.C, this.D, this.E, this.F, this.G, rx2Var, function2, (rq3) obj3);
        fk9Var.A = (k4h) obj;
        fk9Var.B = (yj9) obj2;
        return fk9Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01c2: INVOKE (r3 I:java.lang.Object) = (r12 I:ct8), (r3 I:java.lang.Object), (r9 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: ct8.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object A[MD:(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object (m)] (LINE:451), block:B:61:0x01bd */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01bb: IF  (r8v0 ?? I:??[int, byte, short, char]) >= (r7 I:??[int, byte, short, char])  -> B:64:0x0249 (LINE:444), block:B:60:0x01bb */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x01bb: IF  (r8 I:??[int, byte, short, char]) >= (r7 I:??[int, byte, short, char])  -> B:64:0x0249 (LINE:444), block:B:60:0x01bb */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01c2: INVOKE (r3 I:java.lang.Object) = (r12v0 ?? I:ct8), (r3v2 ?? I:java.lang.Object), (r9 I:java.lang.Object), (r0 I:java.lang.Object) INTERFACE call: ct8.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object A[MD:(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object (m)] (LINE:451), block:B:61:0x01bd */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fe A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x00fe, B:13:0x0108, B:18:0x0132, B:20:0x0138, B:22:0x0151, B:27:0x0167, B:29:0x01aa, B:32:0x01b3, B:36:0x0063, B:39:0x008b), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0220 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0138 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x00fe, B:13:0x0108, B:18:0x0132, B:20:0x0138, B:22:0x0151, B:27:0x0167, B:29:0x01aa, B:32:0x01b3, B:36:0x0063, B:39:0x008b), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01aa A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x00fe, B:13:0x0108, B:18:0x0132, B:20:0x0138, B:22:0x0151, B:27:0x0167, B:29:0x01aa, B:32:0x01b3, B:36:0x0063, B:39:0x008b), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b3 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:12:0x00fe, B:13:0x0108, B:18:0x0132, B:20:0x0138, B:22:0x0151, B:27:0x0167, B:29:0x01aa, B:32:0x01b3, B:36:0x0063, B:39:0x008b), top: B:2:0x000a }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [ct8] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, yj9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0221 -> B:8:0x0037). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        ?? invoke;
        ?? invoke2;
        nk9 nk9Var;
        int i3;
        ct8 ct8Var;
        nk9 nk9Var2;
        int i4;
        k4h k4hVar;
        yj9 yj9Var;
        ct8 ct8Var2;
        ct8 ct8Var3;
        Function2 function2;
        Function2 function22;
        yj9 yj9Var2;
        Object obj2;
        xh9 xh9Var;
        ct8 ct8Var4;
        lu3 lu3Var = lu3.a;
        int i5 = this.z;
        try {
        } catch (Throwable th) {
            bjb bjbVar = gk9.a;
            if (i >= i2 || !((Boolean) invoke.invoke(new pk9(), invoke2, th)).booleanValue()) {
                throw th;
            }
            i3 = i + 1;
            nk9Var = new nk9(invoke2, i3, null, th);
            ct8Var = invoke;
        }
        if (i5 == 0) {
            y6a.M(obj);
            k4h k4hVar2 = this.A;
            yj9 yj9Var3 = this.B;
            xh3 xh3Var = yj9Var3.f;
            ct8 ct8Var5 = (ct8) xh3Var.d(gk9.e);
            if (ct8Var5 == null) {
                ct8Var5 = this.C;
            }
            ct8 ct8Var6 = (ct8) xh3Var.d(gk9.f);
            if (ct8Var6 == null) {
                ct8Var6 = this.D;
            }
            Integer num = (Integer) xh3Var.d(gk9.d);
            int intValue = num != null ? num.intValue() : this.E;
            Function2 function23 = (Function2) xh3Var.d(gk9.h);
            if (function23 == null) {
                function23 = this.F;
            }
            Function2 function24 = (Function2) xh3Var.d(gk9.g);
            if (function24 == null) {
                function24 = this.G;
            }
            k4hVar = k4hVar2;
            nk9Var2 = null;
            yj9Var = yj9Var3;
            i2 = intValue;
            function2 = function23;
            ct8Var4 = ct8Var6;
            function22 = function24;
            i4 = 0;
            ct8Var2 = ct8Var5;
            bjb bjbVar2 = gk9.a;
            yj9Var2 = new yj9();
            yj9Var2.e(yj9Var);
            yj9Var.e.n(new yx7(yj9Var2, 26));
            if (nk9Var2 != null) {
            }
            this.A = k4hVar;
            this.B = yj9Var;
            this.r = ct8Var2;
            this.s = ct8Var4;
            this.t = function2;
            this.u = function22;
            this.v = yj9Var2;
            this.x = i4;
            this.y = i2;
            this.z = 1;
            obj2 = k4hVar.a.a(yj9Var2, this);
            ct8Var3 = ct8Var4;
            if (obj2 == lu3Var) {
            }
            xh9Var = (xh9) obj2;
            bjb bjbVar3 = gk9.a;
            if (i4 < i2) {
            }
            aq4 d = xh9Var.d();
            this.A = k4hVar;
            this.B = yj9Var;
            this.r = ct8Var2;
            this.s = ct8Var3;
            this.t = function2;
            this.u = function22;
            this.v = xh9Var;
            this.w = yj9Var2;
            this.x = i4;
            this.y = i2;
            this.z = 2;
            pm0 pm0Var = g75.a;
            xh3 attributes = d.b().getAttributes();
            pm0 pm0Var2 = g75.b;
            attributes.getClass();
            pm0Var2.getClass();
            if ((!attributes.c().containsKey(pm0Var2) ? d.c().g(1, this) : Boolean.FALSE) != lu3Var) {
            }
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = this.y;
                    int i7 = this.x;
                    yj9 yj9Var4 = this.w;
                    xh9 xh9Var2 = (xh9) this.v;
                    Function2 function25 = this.u;
                    Function2 function26 = this.t;
                    ct8 ct8Var7 = this.s;
                    ct8 ct8Var8 = this.r;
                    yj9 yj9Var5 = this.B;
                    k4h k4hVar3 = this.A;
                    y6a.M(obj);
                    return xh9Var2;
                }
                if (i5 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i8 = this.y;
                int i9 = this.x;
                nk9 nk9Var3 = (nk9) this.v;
                Function2 function27 = this.u;
                Function2 function28 = this.t;
                ct8 ct8Var9 = this.s;
                ct8 ct8Var10 = this.r;
                yj9 yj9Var6 = this.B;
                k4h k4hVar4 = this.A;
                y6a.M(obj);
                i2 = i8;
                nk9Var2 = nk9Var3;
                i4 = i9;
                char c = 3;
                k4hVar = k4hVar4;
                yj9Var = yj9Var6;
                ct8Var2 = ct8Var10;
                ct8Var4 = ct8Var9;
                function2 = function28;
                function22 = function27;
                gk9.a.l("Retrying request " + yj9Var.a + " attempt: " + i4);
                bjb bjbVar22 = gk9.a;
                yj9Var2 = new yj9();
                yj9Var2.e(yj9Var);
                yj9Var.e.n(new yx7(yj9Var2, 26));
                if (nk9Var2 != null) {
                    function22.invoke(new ok9(yj9Var, nk9Var2.b), yj9Var2);
                }
                this.A = k4hVar;
                this.B = yj9Var;
                this.r = ct8Var2;
                this.s = ct8Var4;
                this.t = function2;
                this.u = function22;
                this.v = yj9Var2;
                this.x = i4;
                this.y = i2;
                this.z = 1;
                obj2 = k4hVar.a.a(yj9Var2, this);
                ct8Var3 = ct8Var4;
                if (obj2 == lu3Var) {
                }
                xh9Var = (xh9) obj2;
                bjb bjbVar32 = gk9.a;
                if (i4 < i2 || !((Boolean) ct8Var2.invoke(new pk9(), xh9Var.c(), xh9Var.d())).booleanValue()) {
                    aq4 d2 = xh9Var.d();
                    this.A = k4hVar;
                    this.B = yj9Var;
                    this.r = ct8Var2;
                    this.s = ct8Var3;
                    this.t = function2;
                    this.u = function22;
                    this.v = xh9Var;
                    this.w = yj9Var2;
                    this.x = i4;
                    this.y = i2;
                    this.z = 2;
                    pm0 pm0Var3 = g75.a;
                    xh3 attributes2 = d2.b().getAttributes();
                    pm0 pm0Var22 = g75.b;
                    attributes2.getClass();
                    pm0Var22.getClass();
                    return (!attributes2.c().containsKey(pm0Var22) ? d2.c().g(1, this) : Boolean.FALSE) != lu3Var ? lu3Var : xh9Var;
                }
                i3 = i4 + 1;
                nk9Var = new nk9(yj9Var2, i3, xh9Var.d(), null);
                ct8Var = ct8Var3;
                int i10 = i2;
                int i11 = i3;
                function27 = function22;
                function28 = function2;
                ct8Var9 = ct8Var;
                ct8Var10 = ct8Var2;
                yj9Var6 = yj9Var;
                k4hVar4 = k4hVar;
                nk9 nk9Var4 = nk9Var;
                this.H.a.j.B(gk9.b);
                Object invoke3 = function28.invoke(new mk9(nk9Var4.a, nk9Var4.c), new Integer(i11));
                this.A = k4hVar4;
                this.B = yj9Var6;
                this.r = ct8Var10;
                this.s = ct8Var9;
                this.t = function28;
                this.u = function27;
                this.v = nk9Var4;
                this.w = null;
                this.x = i11;
                this.y = i10;
                c = 3;
                this.z = 3;
                if (this.I.invoke(invoke3, this) != lu3Var) {
                    i2 = i10;
                    nk9Var2 = nk9Var4;
                    i4 = i11;
                    k4hVar = k4hVar4;
                    yj9Var = yj9Var6;
                    ct8Var2 = ct8Var10;
                    ct8Var4 = ct8Var9;
                    function2 = function28;
                    function22 = function27;
                    gk9.a.l("Retrying request " + yj9Var.a + " attempt: " + i4);
                    bjb bjbVar222 = gk9.a;
                    yj9Var2 = new yj9();
                    yj9Var2.e(yj9Var);
                    yj9Var.e.n(new yx7(yj9Var2, 26));
                    if (nk9Var2 != null) {
                    }
                    this.A = k4hVar;
                    this.B = yj9Var;
                    this.r = ct8Var2;
                    this.s = ct8Var4;
                    this.t = function2;
                    this.u = function22;
                    this.v = yj9Var2;
                    this.x = i4;
                    this.y = i2;
                    this.z = 1;
                    obj2 = k4hVar.a.a(yj9Var2, this);
                    ct8Var3 = ct8Var4;
                    if (obj2 == lu3Var) {
                    }
                    xh9Var = (xh9) obj2;
                    bjb bjbVar322 = gk9.a;
                    if (i4 < i2) {
                    }
                    aq4 d22 = xh9Var.d();
                    this.A = k4hVar;
                    this.B = yj9Var;
                    this.r = ct8Var2;
                    this.s = ct8Var3;
                    this.t = function2;
                    this.u = function22;
                    this.v = xh9Var;
                    this.w = yj9Var2;
                    this.x = i4;
                    this.y = i2;
                    this.z = 2;
                    pm0 pm0Var32 = g75.a;
                    xh3 attributes22 = d22.b().getAttributes();
                    pm0 pm0Var222 = g75.b;
                    attributes22.getClass();
                    pm0Var222.getClass();
                    if ((!attributes22.c().containsKey(pm0Var222) ? d22.c().g(1, this) : Boolean.FALSE) != lu3Var) {
                    }
                }
            }
            i2 = this.y;
            i4 = this.x;
            yj9Var2 = (yj9) this.v;
            function22 = this.u;
            function2 = this.t;
            ct8 ct8Var11 = this.s;
            ct8Var2 = this.r;
            yj9Var = this.B;
            k4hVar = this.A;
            y6a.M(obj);
            obj2 = obj;
            ct8Var3 = ct8Var11;
            xh9Var = (xh9) obj2;
            bjb bjbVar3222 = gk9.a;
            if (i4 < i2) {
            }
            aq4 d222 = xh9Var.d();
            this.A = k4hVar;
            this.B = yj9Var;
            this.r = ct8Var2;
            this.s = ct8Var3;
            this.t = function2;
            this.u = function22;
            this.v = xh9Var;
            this.w = yj9Var2;
            this.x = i4;
            this.y = i2;
            this.z = 2;
            pm0 pm0Var322 = g75.a;
            xh3 attributes222 = d222.b().getAttributes();
            pm0 pm0Var2222 = g75.b;
            attributes222.getClass();
            pm0Var2222.getClass();
            if ((!attributes222.c().containsKey(pm0Var2222) ? d222.c().g(1, this) : Boolean.FALSE) != lu3Var) {
            }
        }
    }
}
