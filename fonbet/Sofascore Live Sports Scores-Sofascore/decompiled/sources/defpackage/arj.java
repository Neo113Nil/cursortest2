package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class arj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ irj b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ arj(irj irjVar, ArrayList arrayList, int i) {
        this.a = i;
        this.b = irjVar;
        this.c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.c;
        irj irjVar = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                return irjVar.c.c0(glgVar, arrayList);
            default:
                glgVar.getClass();
                return irjVar.b.c0(glgVar, arrayList);
        }
    }
}
