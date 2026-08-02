package defpackage;

import com.sofascore.model.newNetwork.statistics.BaseballPitch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class n81 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseballPitch b;

    public /* synthetic */ n81(BaseballPitch baseballPitch, int i, int i2) {
        this.a = i2;
        this.b = baseballPitch;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                u6h.e(this.b, of3Var, aba.K(1));
                break;
            default:
                u6h.o(this.b, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
