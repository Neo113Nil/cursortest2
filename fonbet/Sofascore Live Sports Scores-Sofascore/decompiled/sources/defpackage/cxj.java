package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cxj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ axj b;

    public /* synthetic */ cxj(axj axjVar, int i) {
        this.a = i;
        this.b = axjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        axj axjVar = this.b;
        switch (i) {
            case 0:
                return new dxj(axjVar, 1);
            default:
                return new dxj(axjVar, 0);
        }
    }
}
