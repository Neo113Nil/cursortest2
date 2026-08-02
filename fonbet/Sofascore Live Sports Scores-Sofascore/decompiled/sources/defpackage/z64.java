package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z64 implements b98 {
    public final /* synthetic */ long a;
    public final /* synthetic */ Function1 b;

    public z64(long j, Function1 function1) {
        this.a = j;
        this.b = function1;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        Long l = (Long) obj;
        if (l != null) {
            if (l.longValue() != this.a) {
                this.b.invoke(l);
            }
        }
        return Unit.a;
    }
}
