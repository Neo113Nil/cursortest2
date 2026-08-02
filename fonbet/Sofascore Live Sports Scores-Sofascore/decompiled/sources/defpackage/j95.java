package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j95 extends hoi implements Function2 {
    public final /* synthetic */ int r = 0;
    public fsf s;
    public fsf t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ k95 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j95(fsf fsfVar, k95 k95Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = fsfVar;
        this.w = k95Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        k95 k95Var = this.w;
        switch (i) {
            case 0:
                j95 j95Var = new j95(this.t, k95Var, rq3Var);
                j95Var.v = obj;
                return j95Var;
            default:
                j95 j95Var2 = new j95(k95Var, rq3Var);
                j95Var2.v = obj;
                return j95Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((j95) create((Function1) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                return ((j95) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (r3.o1(r8, r7) != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r3.v1(r7) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        if (r3.v1(r7) != r0) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:32:0x00c7, B:29:0x00b5], limit reached: 88 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c2 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c9 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e4 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0134 -> B:61:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0138 -> B:62:0x013a). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Object obj2;
        ku3 ku3Var;
        fsf fsfVar;
        fsf fsfVar2;
        fsf fsfVar3;
        ku3 ku3Var2;
        ku3 ku3Var3;
        t85 t85Var;
        Object obj3;
        int i = this.r;
        k95 k95Var = this.w;
        switch (i) {
            case 0:
                fsf fsfVar4 = this.t;
                lu3 lu3Var = lu3.a;
                int i2 = this.u;
                if (i2 == 0) {
                    y6a.M(obj);
                    function1 = (Function1) this.v;
                    obj2 = fsfVar4.a;
                    if (obj2 instanceof s85) {
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fsf fsfVar5 = this.s;
                    function1 = (Function1) this.v;
                    y6a.M(obj);
                    t85 t85Var2 = (t85) obj;
                    fsfVar5.a = t85Var2;
                    obj2 = fsfVar4.a;
                    if (!(obj2 instanceof s85) || (obj2 instanceof p85)) {
                        break;
                    } else {
                        q85 q85Var = obj2 instanceof q85 ? (q85) obj2 : null;
                        if (q85Var != null) {
                            function1.invoke(q85Var);
                        }
                        g62 g62Var = k95Var.v;
                        if (g62Var != null) {
                            this.v = function1;
                            this.s = fsfVar4;
                            this.u = 1;
                            obj = g62Var.f(this);
                            if (obj == lu3Var) {
                                break;
                            } else {
                                fsfVar5 = fsfVar4;
                                t85 t85Var22 = (t85) obj;
                                fsfVar5.a = t85Var22;
                                obj2 = fsfVar4.a;
                                if (obj2 instanceof s85) {
                                }
                            }
                        } else {
                            fsfVar5 = fsfVar4;
                            t85Var22 = null;
                            fsfVar5.a = t85Var22;
                            obj2 = fsfVar4.a;
                            if (obj2 instanceof s85) {
                            }
                        }
                    }
                }
            default:
                lu3 lu3Var2 = lu3.a;
                switch (this.u) {
                    case 0:
                        y6a.M(obj);
                        ku3Var = (ku3) this.v;
                        if (s9a.w(ku3Var)) {
                            fsfVar = new fsf();
                            g62 g62Var2 = k95Var.v;
                            if (g62Var2 != null) {
                                this.v = ku3Var;
                                this.s = fsfVar;
                                this.t = fsfVar;
                                this.u = 1;
                                obj = g62Var2.f(this);
                                if (obj != lu3Var2) {
                                    fsfVar2 = fsfVar;
                                    t85Var = (t85) obj;
                                    fsfVar.a = t85Var;
                                    obj3 = fsfVar2.a;
                                    if (obj3 instanceof r85) {
                                        this.v = ku3Var;
                                        this.s = fsfVar2;
                                        this.t = null;
                                        this.u = 2;
                                        if (k95Var.w1((r85) obj3, this) != lu3Var2) {
                                            fsfVar3 = fsfVar2;
                                            ku3Var2 = ku3Var;
                                            j95 j95Var = new j95(fsfVar3, k95Var, null);
                                            this.v = ku3Var2;
                                            this.s = fsfVar3;
                                            this.u = 3;
                                            break;
                                        }
                                    }
                                    if (s9a.w(ku3Var)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                fsfVar2 = fsfVar;
                                t85Var = null;
                                fsfVar.a = t85Var;
                                obj3 = fsfVar2.a;
                                if (obj3 instanceof r85) {
                                }
                                if (s9a.w(ku3Var)) {
                                }
                            }
                        }
                    case 1:
                        fsfVar = this.t;
                        fsfVar2 = this.s;
                        ku3Var = (ku3) this.v;
                        y6a.M(obj);
                        t85Var = (t85) obj;
                        fsfVar.a = t85Var;
                        obj3 = fsfVar2.a;
                        if (obj3 instanceof r85) {
                        }
                        if (s9a.w(ku3Var)) {
                        }
                        break;
                    case 2:
                        fsfVar3 = this.s;
                        ku3Var2 = (ku3) this.v;
                        y6a.M(obj);
                        j95 j95Var2 = new j95(fsfVar3, k95Var, null);
                        this.v = ku3Var2;
                        this.s = fsfVar3;
                        this.u = 3;
                        break;
                    case 3:
                        fsfVar3 = this.s;
                        ku3Var2 = (ku3) this.v;
                        try {
                            y6a.M(obj);
                        } catch (CancellationException unused) {
                            ku3Var3 = ku3Var2;
                            this.v = ku3Var3;
                            this.s = null;
                            this.u = 6;
                            break;
                        }
                        ku3Var = ku3Var2;
                        try {
                        } catch (CancellationException unused2) {
                            ku3Var3 = ku3Var;
                            this.v = ku3Var3;
                            this.s = null;
                            this.u = 6;
                        }
                        Object obj4 = fsfVar3.a;
                        if (obj4 instanceof s85) {
                            this.v = ku3Var;
                            this.s = null;
                            this.u = 4;
                            if (k95Var.x1((s85) obj4, this) == lu3Var2) {
                                break;
                            }
                            if (s9a.w(ku3Var)) {
                            }
                        } else {
                            if (obj4 instanceof p85) {
                                this.v = ku3Var;
                                this.s = null;
                                this.u = 5;
                                break;
                            }
                            if (s9a.w(ku3Var)) {
                            }
                        }
                        break;
                    case 4:
                        ku3Var3 = (ku3) this.v;
                        try {
                            y6a.M(obj);
                        } catch (CancellationException unused3) {
                            this.v = ku3Var3;
                            this.s = null;
                            this.u = 6;
                            break;
                        }
                        ku3Var = ku3Var3;
                        if (s9a.w(ku3Var)) {
                        }
                        break;
                    case 5:
                        ku3Var3 = (ku3) this.v;
                        y6a.M(obj);
                        ku3Var = ku3Var3;
                        if (s9a.w(ku3Var)) {
                        }
                        break;
                    case 6:
                        ku3Var3 = (ku3) this.v;
                        y6a.M(obj);
                        ku3Var = ku3Var3;
                        if (s9a.w(ku3Var)) {
                        }
                        break;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j95(k95 k95Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = k95Var;
    }
}
