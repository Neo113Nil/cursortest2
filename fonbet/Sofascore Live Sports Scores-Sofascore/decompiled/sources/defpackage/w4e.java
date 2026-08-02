package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w4e extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public y4e s;
    public j2d t;
    public x4e u;
    public int v;
    public final /* synthetic */ x4e w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4e(x4e x4eVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.w = x4eVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        x4e x4eVar = this.w;
        switch (i) {
            case 0:
                return new w4e(x4eVar, rq3Var, 0);
            default:
                return new w4e(x4eVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((w4e) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1.a(r9, r2, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r1.a(r9, r2, r8) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r2.e(r8) == r0) goto L37;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y4e y4eVar;
        j2d j2dVar;
        j2d j2dVar2;
        y4e y4eVar2;
        int i = this.r;
        x4e x4eVar = this.w;
        int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        y6a.M(obj);
                        y4eVar = x4eVar.i;
                        j2dVar = y4eVar.a;
                        this.s = y4eVar;
                        this.t = j2dVar;
                        this.u = x4eVar;
                        this.v = 1;
                        break;
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        x4eVar = this.u;
                        j2dVar = this.t;
                        y4eVar = this.s;
                        y6a.M(obj);
                    }
                    a5e a5eVar = y4eVar.b;
                    v98 v98Var = new v98(new z4e(a5eVar, rq3Var, i2), f5p.x(a5eVar.f));
                    j2dVar2.f(null);
                    sfb sfbVar = sfb.b;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.v = 2;
                    break;
                } finally {
                }
            default:
                lu3 lu3Var2 = lu3.a;
                int i4 = this.v;
                try {
                    if (i4 == 0) {
                        y6a.M(obj);
                        y4e y4eVar3 = x4eVar.i;
                        j2dVar2 = y4eVar3.a;
                        this.s = y4eVar3;
                        this.t = j2dVar2;
                        this.u = x4eVar;
                        this.v = 1;
                        if (j2dVar2.e(this) != lu3Var2) {
                            y4eVar2 = y4eVar3;
                        }
                        return lu3Var2;
                    }
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x4eVar = this.u;
                    j2dVar2 = this.t;
                    y4eVar2 = this.s;
                    y6a.M(obj);
                    a5e a5eVar2 = y4eVar2.b;
                    v98 v98Var2 = new v98(new z4e(a5eVar2, rq3Var, 0), f5p.x(a5eVar2.g));
                    j2dVar2.f(null);
                    sfb sfbVar2 = sfb.c;
                    this.s = null;
                    this.t = null;
                    this.u = null;
                    this.v = 2;
                    break;
                } finally {
                }
        }
    }
}
