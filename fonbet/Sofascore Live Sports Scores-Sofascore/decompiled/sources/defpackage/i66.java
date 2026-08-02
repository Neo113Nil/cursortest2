package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class i66 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vnb b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ i66(boolean z, vnb vnbVar, Function1 function1, int i) {
        vmd vmdVar = vmd.EVENT_DETAILS;
        this.c = z;
        this.b = vnbVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function1 function1 = this.d;
        boolean z = this.c;
        vnb vnbVar = this.b;
        switch (i) {
            case 0:
                vmd vmdVar = vmd.EVENT_DETAILS;
                ((Integer) obj2).getClass();
                pco.e(aba.K(385), (of3) obj, vnbVar, function1, z);
                break;
            default:
                ((Integer) obj2).getClass();
                rha.f(aba.K(1), (of3) obj, vnbVar, function1, z);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i66(vnb vnbVar, boolean z, Function1 function1, int i) {
        this.b = vnbVar;
        this.c = z;
        this.d = function1;
    }
}
