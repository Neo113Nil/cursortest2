package defpackage;

import com.sofascore.model.newNetwork.TrendingGridTile;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class oc7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oc7(float f, List list, xtc xtcVar, int i) {
        this.a = 1;
        this.b = f;
        this.d = list;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(49);
                l98.i((Function0) this.d, this.c, this.b, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                u6h.y(this.b, (List) this.d, this.c, (of3) obj, K2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int K3 = aba.K(49);
                xzj.a((TrendingGridTile) this.d, this.b, this.c, (of3) obj, K3);
                break;
            default:
                ((Integer) obj2).getClass();
                int K4 = aba.K(1);
                h5a.c((zdl) this.d, this.c, this.b, (of3) obj, K4);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oc7(TrendingGridTile trendingGridTile, float f, xtc xtcVar, int i) {
        this.a = 2;
        this.d = trendingGridTile;
        this.b = f;
        this.c = xtcVar;
    }

    public /* synthetic */ oc7(Object obj, xtc xtcVar, float f, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.c = xtcVar;
        this.b = f;
    }
}
