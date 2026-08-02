package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mv3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ mv3(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                uv3 uv3Var = (uv3) obj;
                uv3Var.getClass();
                e1dVar.setValue(uv3Var);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                e1dVar.setValue(bool);
                break;
            default:
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                e1dVar.setValue(new dnd(dmaVar.w(0L)));
                break;
        }
        return Unit.a;
    }
}
