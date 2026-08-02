package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m4e extends hoi implements ct8 {
    public int r;
    public /* synthetic */ b98 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ x4e u;
    public final /* synthetic */ sfb v;
    public j2d w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4e(rq3 rq3Var, x4e x4eVar, sfb sfbVar) {
        super(3, rq3Var);
        this.u = x4eVar;
        this.v = sfbVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m4e m4eVar = new m4e((rq3) obj3, this.u, this.v);
        m4eVar.s = (b98) obj;
        m4eVar.t = obj2;
        return m4eVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (defpackage.fcp.g0(r9, r0, r11) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r7.e(r11) == r1) goto L32;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b98 b98Var;
        int intValue;
        y4e y4eVar;
        j2d j2dVar;
        aeh aehVar;
        z88 aa8Var;
        sfb sfbVar = this.v;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        x4e x4eVar = this.u;
        try {
            if (i == 0) {
                y6a.M(obj);
                b98Var = this.s;
                intValue = ((Number) this.t).intValue();
                y4eVar = x4eVar.i;
                j2dVar = y4eVar.a;
                this.s = b98Var;
                this.t = y4eVar;
                this.w = j2dVar;
                this.x = intValue;
                this.r = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                intValue = this.x;
                j2dVar = this.w;
                y4eVar = (y4e) this.t;
                b98Var = this.s;
                y6a.M(obj);
            }
            ejg ejgVar = y4eVar.b.i;
            if (ejgVar.h(sfbVar).equals(pfb.b)) {
                aa8Var = new wf2(new jw8[0], 5);
            } else {
                ejgVar.h(sfbVar);
                ejgVar.C(sfbVar, pfb.c);
                Unit unit = Unit.a;
                j2dVar.f(null);
                g7h g7hVar = (g7h) x4eVar.f.b;
                int ordinal = sfbVar.ordinal();
                if (ordinal == 1) {
                    aehVar = ((eb9) g7hVar.b).b;
                } else if (ordinal == 2) {
                    aehVar = ((eb9) g7hVar.c).b;
                } else {
                    a70.p("invalid load type for hints");
                    aehVar = null;
                }
                aa8Var = new aa8(pd0.n(aehVar, intValue != 0 ? 1 : 0), intValue, 1);
            }
            this.s = null;
            this.t = null;
            this.w = null;
            this.r = 2;
        } finally {
            j2dVar.f(null);
        }
    }
}
