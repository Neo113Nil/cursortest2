package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wzh implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List d;
    public final /* synthetic */ z69 e;
    public final /* synthetic */ ksa f;
    public final /* synthetic */ e1d g;
    public final /* synthetic */ xnh h;
    public final /* synthetic */ e1d i;
    public final /* synthetic */ float j;
    public final /* synthetic */ Function2 k;

    public wzh(boolean z, float f, boolean z2, List list, z69 z69Var, ksa ksaVar, e1d e1dVar, xnh xnhVar, e1d e1dVar2, float f2, Function2 function2) {
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = list;
        this.e = z69Var;
        this.f = ksaVar;
        this.g = e1dVar;
        this.h = xnhVar;
        this.i = e1dVar2;
        this.j = f2;
        this.k = function2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        Object s = oyn.s(qzeVar, new vzh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null), rq3Var);
        return s == lu3.a ? s : Unit.a;
    }
}
