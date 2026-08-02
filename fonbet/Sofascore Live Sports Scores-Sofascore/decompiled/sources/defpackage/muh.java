package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class muh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ muh(int i, int i2, Function2 function2) {
        this.a = i2;
        this.b = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                dma dmaVar = (dma) obj;
                dmaVar.getClass();
                function2.invoke(Integer.valueOf(i2), o6a.m(dmaVar, true));
                break;
            default:
                huj hujVar = (huj) obj;
                hujVar.getClass();
                function2.invoke(hujVar, Integer.valueOf(i2));
                break;
        }
        return Unit.a;
    }
}
