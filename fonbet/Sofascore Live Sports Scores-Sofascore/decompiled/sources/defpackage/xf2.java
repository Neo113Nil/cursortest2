package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xf2 extends hoi implements ct8 {
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf2(int i, rq3 rq3Var, int i2) {
        super(i, rq3Var);
        this.r = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.r) {
            case 0:
                return new xf2(i, (rq3) obj3, 0).invokeSuspend(Unit.a);
            case 1:
                long j = ((dnd) obj2).a;
                return new xf2(i, (rq3) obj3, 1).invokeSuspend(Unit.a);
            case 2:
                ((Number) obj2).floatValue();
                return new xf2(i, (rq3) obj3, 2).invokeSuspend(Unit.a);
            case 3:
                ((Number) obj).intValue();
                new xf2(i, (rq3) obj3, i).invokeSuspend(Unit.a);
                return Boolean.FALSE;
            default:
                long j2 = ((dnd) obj2).a;
                return new xf2(i, (rq3) obj3, 4).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                return Boolean.FALSE;
            default:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                return Unit.a;
        }
    }
}
