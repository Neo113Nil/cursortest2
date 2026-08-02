package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ew implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zw b;
    public final /* synthetic */ csf c;

    public /* synthetic */ ew(zw zwVar, csf csfVar, int i) {
        this.a = i;
        this.b = zwVar;
        this.c = csfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        csf csfVar = this.c;
        zw zwVar = this.b;
        float floatValue = ((Float) obj).floatValue();
        float floatValue2 = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                dx dxVar = zwVar.a;
                ((xnh) dxVar.f).i(floatValue);
                ((xnh) dxVar.g).i(floatValue2);
                csfVar.a = floatValue;
                break;
            default:
                dx dxVar2 = zwVar.a;
                ((xnh) dxVar2.f).i(floatValue);
                ((xnh) dxVar2.g).i(floatValue2);
                csfVar.a = floatValue;
                break;
        }
        return Unit.a;
    }
}
