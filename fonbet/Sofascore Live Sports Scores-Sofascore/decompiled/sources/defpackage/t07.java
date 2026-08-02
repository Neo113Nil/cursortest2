package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class t07 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ znh b;

    public /* synthetic */ t07(znh znhVar, int i) {
        this.a = i;
        this.b = znhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        znh znhVar = this.b;
        switch (i) {
            case 0:
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                znhVar.i((int) (dmaVar.e() >> 32));
                break;
            case 1:
                znhVar.i((int) (((c7a) obj).a & 4294967295L));
                break;
            default:
                znhVar.i((int) (((c7a) obj).a & 4294967295L));
                break;
        }
        return Unit.a;
    }
}
