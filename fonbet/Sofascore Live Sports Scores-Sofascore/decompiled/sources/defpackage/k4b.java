package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class k4b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnb b;

    public /* synthetic */ k4b(vnb vnbVar, int i) {
        this.a = i;
        this.b = vnbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        vnb vnbVar = this.b;
        vnb vnbVar2 = (vnb) obj;
        switch (i) {
            case 0:
                vnbVar2.getClass();
                break;
            case 1:
                vnbVar2.getClass();
                break;
            default:
                vnbVar2.getClass();
                break;
        }
        return vnbVar.getClass().getSimpleName();
    }
}
