package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ble implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hle b;

    public /* synthetic */ ble(hle hleVar, int i, int i2) {
        this.a = i2;
        this.b = hleVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hle hleVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                w1a.d(hleVar, of3Var, aba.K(1));
                break;
            default:
                w1a.b(hleVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}
