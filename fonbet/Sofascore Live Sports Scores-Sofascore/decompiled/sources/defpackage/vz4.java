package defpackage;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vz4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ j05 c;

    public /* synthetic */ vz4(j05 j05Var, Function1 function1) {
        this.a = 2;
        this.c = j05Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        j05 j05Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new uy4(j05Var.c, "PUSH ID"));
                break;
            case 1:
                function1.invoke(new uy4(j05Var.d, "Firebase ID"));
                break;
            case 2:
                if (j05Var.A) {
                    function1.invoke(new dz4(false));
                } else {
                    function1.invoke(ty4.a);
                }
                break;
            case 3:
                function1.invoke(new uy4(j05Var.e, "APP VERSION"));
                break;
            case 4:
                function1.invoke(new uy4(j05Var.f, "DEV MOD"));
                break;
            case 5:
                function1.invoke(new uy4(j05Var.b, "USER ID"));
                break;
            default:
                function1.invoke(new uy4(j05Var.a, IronSourceConstants.TYPE_UUID));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vz4(int i, j05 j05Var, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = j05Var;
    }
}
