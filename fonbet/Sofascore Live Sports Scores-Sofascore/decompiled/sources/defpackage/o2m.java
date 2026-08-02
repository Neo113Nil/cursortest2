package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class o2m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3m b;

    public /* synthetic */ o2m(w3m w3mVar, int i) {
        this.a = i;
        this.b = w3mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        w3m w3mVar = this.b;
        switch (i) {
            case 0:
                w3mVar.v0 = 0L;
                break;
            case 1:
                w3mVar.u0 = 0L;
                break;
            case 2:
                break;
            case 3:
                w3mVar.B(true);
                break;
            default:
                w3mVar.B(false);
                break;
        }
        return Unit.a;
    }
}
