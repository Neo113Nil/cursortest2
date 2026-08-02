package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n5d implements z88 {
    public final /* synthetic */ th2 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;

    public n5d(th2 th2Var, Function0 function0, boolean z) {
        this.a = th2Var;
        this.b = function0;
        this.c = z;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new m5d(b98Var, this.b, this.c), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
