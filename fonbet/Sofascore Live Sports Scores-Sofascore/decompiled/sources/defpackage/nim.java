package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nim implements b98 {
    public final /* synthetic */ Function1 a;

    public nim(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        v4m v4mVar = (v4m) obj;
        yda ydaVar = bmm.a;
        bmm.a(v4mVar, new fhm(this.a, v4mVar, 0));
        return Unit.a;
    }
}
