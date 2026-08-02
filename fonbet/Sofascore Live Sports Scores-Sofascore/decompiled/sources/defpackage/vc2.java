package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vc2 extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ ln2 s;
    public final /* synthetic */ AtomicBoolean t;
    public final /* synthetic */ za4 u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Function1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc2(ln2 ln2Var, AtomicBoolean atomicBoolean, za4 za4Var, String str, Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = ln2Var;
        this.t = atomicBoolean;
        this.u = za4Var;
        this.v = str;
        this.w = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new vc2(this.s, this.t, this.u, this.v, this.w, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vc2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r4.s.f(r4) == r0) goto L16;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            this.r = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        this.t.set(false);
        this.r = 2;
        Object a = this.u.a(this.v, this.w, this);
        return a == lu3Var ? lu3Var : a;
    }
}
