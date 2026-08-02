package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class kdg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tdg b;

    public /* synthetic */ kdg(tdg tdgVar, int i) {
        this.a = i;
        this.b = tdgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        tdg tdgVar = this.b;
        switch (i) {
            case 0:
                xag xagVar = tdgVar.q;
                if (xagVar != null) {
                    ((zag) xagVar).h();
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                return Boolean.valueOf(tdgVar.v == ndg.b);
        }
    }
}
