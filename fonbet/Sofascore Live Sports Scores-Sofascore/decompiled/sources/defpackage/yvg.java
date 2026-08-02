package defpackage;

import com.ironsource.U3;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yvg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zvg b;

    public /* synthetic */ yvg(zvg zvgVar, int i) {
        this.a = i;
        this.b = zvgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zvg zvgVar = this.b;
        vv2 vv2Var = (vv2) obj;
        switch (i) {
            case 0:
                vv2Var.getClass();
                l98.h0(phi.a);
                g7f g7fVar = uhi.b;
                km5 km5Var = km5.a;
                vv2Var.a("type", g7fVar, km5Var, false);
                vv2Var.a(U3.i.X, aik.w("kotlinx.serialization.Sealed<" + zvgVar.a.getSimpleName() + '>', o5h.f, new SerialDescriptor[0], new yvg(zvgVar, 1)), km5Var, false);
                List list = zvgVar.b;
                list.getClass();
                vv2Var.b = list;
                break;
            default:
                vv2Var.getClass();
                for (Map.Entry entry : zvgVar.e.entrySet()) {
                    vv2Var.a((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor(), km5.a, false);
                }
                break;
        }
        return Unit.a;
    }
}
