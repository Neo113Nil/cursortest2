package defpackage;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns9 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ op3 c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ ns9(String str, op3 op3Var, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = op3Var;
        this.d = xtcVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        xtc xtcVar = this.d;
        op3 op3Var = this.c;
        String str = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                td4.f(str, op3Var, xtcVar, of3Var, aba.K(i2 | 1));
                break;
            default:
                o.b(str, op3Var, xtcVar, of3Var, i2 | 1);
                break;
        }
        return Unit.a;
    }
}
