package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pw2 implements PointerInputEventHandler {
    public final /* synthetic */ long a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ e1d c;
    public final /* synthetic */ boh d;

    public pw2(long j, Function0 function0, e1d e1dVar, boh bohVar) {
        this.a = j;
        this.b = function0;
        this.c = e1dVar;
        this.d = bohVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        Object k1 = ((ooi) qzeVar).k1(new ow2(this.a, this.b, this.c, this.d, null), rq3Var);
        return k1 == lu3.a ? k1 : Unit.a;
    }
}
