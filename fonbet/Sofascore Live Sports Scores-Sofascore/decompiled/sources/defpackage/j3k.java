package defpackage;

import com.sofascore.results.event.details.view.tv.model.TvChannelData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j3k implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3k b;

    public /* synthetic */ j3k(k3k k3kVar) {
        this.a = 2;
        this.b = k3kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        k3k k3kVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                k3kVar.a(aba.K(1), (of3) obj);
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                k3kVar.a(aba.K(1), (of3) obj);
                return Unit.a;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                o3k o3kVar = (o3k) obj2;
                o3kVar.getClass();
                ct8 ct8Var = k3kVar.r;
                if (ct8Var != null) {
                    TvChannelData tvChannelData = k3kVar.m;
                    if (tvChannelData == null) {
                        Intrinsics.i("tvChannelData");
                        throw null;
                    }
                    ct8Var.invoke(num, tvChannelData, o3kVar);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ j3k(k3k k3kVar, int i, int i2) {
        this.a = i2;
        this.b = k3kVar;
    }
}
