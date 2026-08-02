package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class aka implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg2 b;

    public /* synthetic */ aka(zg2 zg2Var, int i) {
        this.a = i;
        this.b = zg2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zg2 zg2Var = this.b;
        switch (i) {
            case 0:
                zg2Var.cancel();
                break;
            case 1:
                zg2Var.cancel();
                break;
            default:
                zg2Var.cancel();
                break;
        }
        return Unit.a;
    }
}
