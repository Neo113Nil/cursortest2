package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yf4 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z88 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yf4(z88 z88Var, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z88Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        z88 z88Var = this.b;
        switch (i) {
            case 0:
                Object collect = z88Var.collect(new m70(i2, b98Var, (e5f) obj2, obj), rq3Var);
                if (collect != lu3.a) {
                    break;
                }
                break;
            case 1:
                Object v = un0.v(rq3Var, b98Var, new c37((ct8) obj, (rq3) null, 5), o67.m, new z88[]{z88Var, (z88) obj2});
                if (v != lu3.a) {
                    break;
                }
                break;
            default:
                Object collect2 = z88Var.collect(new m70(10, b98Var, (uwg) obj2, (String) obj), rq3Var);
                if (collect2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
