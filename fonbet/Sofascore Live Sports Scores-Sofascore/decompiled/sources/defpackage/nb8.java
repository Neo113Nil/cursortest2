package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nb8 implements z88 {
    public final /* synthetic */ z88 a;
    public final /* synthetic */ k6g b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public nb8(z88 z88Var, k6g k6gVar, boolean z, Function1 function1) {
        this.a = z88Var;
        this.b = k6gVar;
        this.c = z;
        this.d = function1;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        Object collect = this.a.collect(new mb8(b98Var, this.b, this.c, this.d), rq3Var);
        return collect == lu3.a ? collect : Unit.a;
    }
}
