package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class br6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj7 b;
    public final /* synthetic */ cdi c;

    public /* synthetic */ br6(mj7 mj7Var, cdi cdiVar, int i) {
        this.a = i;
        this.b = mj7Var;
        this.c = cdiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        cdi cdiVar = this.c;
        mj7 mj7Var = this.b;
        switch (i) {
            case 0:
                long S = wkn.S(mj7Var.d - ((Number) cdiVar.getValue()).longValue(), be5.SECONDS);
                wd5 wd5Var = xd5.b;
                return Boolean.valueOf(xd5.k(S, be5.HOURS) < 1);
            case 1:
                return Boolean.valueOf(((Number) cdiVar.getValue()).longValue() >= mj7Var.d);
            case 2:
                long j = ((js8) cdiVar.getValue()).b;
                wd5 wd5Var2 = xd5.b;
                return Boolean.valueOf(xd5.k(wkn.R(1, be5.HOURS), be5.SECONDS) + j < mj7Var.d);
            default:
                return Boolean.valueOf(((js8) cdiVar.getValue()).b >= mj7Var.d);
        }
    }
}
