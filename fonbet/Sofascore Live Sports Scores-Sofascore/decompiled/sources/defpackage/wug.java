package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wug implements myd {
    public static final wug a = new wug();

    @Override // defpackage.myd
    public final xv4 a() {
        return new qdd(1);
    }

    @Override // defpackage.myd
    public final boolean b() {
        return false;
    }

    @Override // defpackage.myd
    public final Object c(long j, Function2 function2, rq3 rq3Var) {
        Object invoke = function2.invoke(new vmk(j), rq3Var);
        return invoke == lu3.a ? invoke : Unit.a;
    }

    @Override // defpackage.myd
    public final long d(int i, long j, Function1 function1) {
        return ((dnd) function1.invoke(new dnd(j))).a;
    }
}
