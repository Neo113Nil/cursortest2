package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pe3 extends t6d {
    public final oe3 g;
    public final tc3 h;
    public Function1 i;
    public Function1 j;
    public Function1 k;
    public Function1 l;

    public pe3(oe3 oe3Var, KClass kClass, Map map, tc3 tc3Var) {
        super(oe3Var, kClass, map);
        this.g = oe3Var;
        this.h = tc3Var;
    }

    @Override // defpackage.t6d
    public final s6d a() {
        ne3 ne3Var = (ne3) super.a();
        ne3Var.h = this.i;
        ne3Var.i = this.j;
        ne3Var.j = this.k;
        ne3Var.k = this.l;
        return ne3Var;
    }

    @Override // defpackage.t6d
    public final s6d b() {
        return new ne3(this.g, this.h);
    }
}
