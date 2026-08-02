package defpackage;

import androidx.compose.ui.tooling.PreviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class v54 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ v54(String str, String str2) {
        this.a = 2;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.c;
        String str2 = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                fcp.G(str2, str, of3Var, aba.K(1));
                break;
            case 1:
                num.getClass();
                w1a.a(str2, str, of3Var, aba.K(1));
                break;
            case 2:
                int intValue = num.intValue();
                int i2 = PreviewActivity.b;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    gvd.D(str2, str, av8Var, new Object[0]);
                } else {
                    av8Var.W();
                }
                break;
            default:
                num.getClass();
                d7a.e(str2, str, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ v54(String str, String str2, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
    }
}
