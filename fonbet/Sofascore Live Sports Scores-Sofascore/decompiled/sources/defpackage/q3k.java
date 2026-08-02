package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class q3k implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3k b;
    public final /* synthetic */ List c;

    public /* synthetic */ q3k(r3k r3kVar, List list, int i) {
        this.a = i;
        this.b = r3kVar;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        List list = this.c;
        r3k r3kVar = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                return r3kVar.d.M(glgVar, list);
            default:
                glgVar.getClass();
                return Integer.valueOf(r3kVar.c.f0(glgVar, list));
        }
    }
}
