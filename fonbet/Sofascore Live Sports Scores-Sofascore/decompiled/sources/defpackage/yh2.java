package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yh2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pof b;

    public /* synthetic */ yh2(pof pofVar, int i) {
        this.a = i;
        this.b = pofVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        pof pofVar = this.b;
        switch (i) {
            case 0:
                pofVar.cancel();
                break;
            default:
                pofVar.cancel();
                break;
        }
        return Unit.a;
    }
}
