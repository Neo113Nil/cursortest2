package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s1e extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ v1e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1e(v1e v1eVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = v1eVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        v1e v1eVar = this.t;
        switch (i) {
            case 0:
                return new s1e(v1eVar, rq3Var, 0);
            default:
                return new s1e(v1eVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((s1e) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        if (r8.q(r7, r1) == r0) goto L19;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        v1e v1eVar = this.t;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    lue lueVar = v1eVar.l;
                    this.s = 1;
                    obj = lueVar.a(this);
                    if (obj == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                List list = (List) obj;
                if (list == null) {
                    list = km5.a;
                }
                v1eVar.n(new q1e(rlh.b, n1e.a, new e1e(null, null, null, null)), new r41(v1eVar, list));
                break;
            default:
                Object obj2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    g62 g62Var = v1eVar.m;
                    Unit unit = Unit.a;
                    this.s = 1;
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
                this.s = 2;
                Object r = s9a.r(new s1e(v1eVar, rq3Var, 0), this);
                if (r != obj2) {
                    r = Unit.a;
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
