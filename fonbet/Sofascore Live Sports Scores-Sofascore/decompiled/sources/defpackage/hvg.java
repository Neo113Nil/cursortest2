package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hvg extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ ivg s;
    public final /* synthetic */ float t;
    public final /* synthetic */ float u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvg(ivg ivgVar, float f, float f2, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ivgVar;
        this.t = f;
        this.u = f2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new hvg(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hvg) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            svg svgVar = this.s.N;
            long floatToRawIntBits = (Float.floatToRawIntBits(this.t) << 32) | (Float.floatToRawIntBits(this.u) & 4294967295L);
            this.r = 1;
            if (bvg.b(svgVar, floatToRawIntBits, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
