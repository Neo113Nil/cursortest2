package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class nra implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ora b;

    public /* synthetic */ nra(ora oraVar, int i) {
        this.a = i;
        this.b = oraVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ora oraVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(oraVar.p.e());
            case 1:
                return Float.valueOf(oraVar.p.b());
            default:
                return Float.valueOf(oraVar.p.d() - oraVar.p.a());
        }
    }
}
