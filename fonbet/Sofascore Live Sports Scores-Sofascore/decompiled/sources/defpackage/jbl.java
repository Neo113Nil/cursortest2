package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jbl implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z88[] b;

    public /* synthetic */ jbl(z88[] z88VarArr, int i) {
        this.a = i;
        this.b = z88VarArr;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var2 = null;
        z88[] z88VarArr = this.b;
        switch (i) {
            case 0:
                Object v = un0.v(rq3Var, b98Var, new ibl(i2, rq3Var2, 0), new ps4(z88VarArr, 13), z88VarArr);
                if (v != lu3.a) {
                    break;
                }
                break;
            default:
                Object v2 = un0.v(rq3Var, b98Var, new ibl(i2, rq3Var2, 1), new wzj(z88VarArr, 26), z88VarArr);
                if (v2 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
