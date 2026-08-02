package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c02 implements Function2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public c02(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            e12.a(0, av8Var, bkh.m(utc.a, this.a, this.b));
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
