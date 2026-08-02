package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gvg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ ivg t;
    public /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvg(ivg ivgVar, long j, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = ivgVar;
        this.u = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new gvg(this.t, this.u, rq3Var, 0);
            case 1:
                return new gvg(this.t, this.u, rq3Var, 1);
            case 2:
                return new gvg(this.t, this.u, rq3Var, 2);
            default:
                gvg gvgVar = new gvg(this.t, rq3Var);
                gvgVar.u = ((dnd) obj).a;
                return gvgVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                return ((gvg) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((gvg) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((gvg) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
            default:
                long j = ((dnd) obj).a;
                gvg gvgVar = new gvg(this.t, (rq3) obj2);
                gvgVar.u = j;
                return gvgVar.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        ivg ivgVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    svg svgVar = ivgVar.N;
                    m1d m1dVar = m1d.b;
                    hgg hggVar = new hgg(this.u, null);
                    this.s = 1;
                    if (svgVar.f(m1dVar, hggVar, this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    svg svgVar2 = ivgVar.N;
                    long j = this.u;
                    this.s = 1;
                    if (svgVar2.b(j, false, this) == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    svg svgVar3 = ivgVar.N;
                    long j2 = this.u;
                    this.s = 1;
                    if (svgVar3.b(j2, true, this) == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                long j3 = this.u;
                svg svgVar4 = ivgVar.N;
                this.s = 1;
                Object b = bvg.b(svgVar4, j3, this);
                return b == lu3Var4 ? lu3Var4 : b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvg(ivg ivgVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 3;
        this.t = ivgVar;
    }
}
