package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class shd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ thd b;
    public final /* synthetic */ List c;

    public /* synthetic */ shd(thd thdVar, List list, int i) {
        this.a = i;
        this.b = thdVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        thd thdVar = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                return Integer.valueOf(thdVar.e.f0(glgVar, list));
            case 1:
                glgVar.getClass();
                return thdVar.c.d0(glgVar, list);
            default:
                glgVar.getClass();
                thdVar.b.Z(glgVar, list);
                return Unit.a;
        }
    }
}
