package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class bk implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnb b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ bk(boolean z, boolean z2, vnb vnbVar, Function1 function1, int i) {
        this.a = 0;
        vmd vmdVar = vmd.EVENT_DETAILS;
        this.c = z;
        this.d = z2;
        this.b = vnbVar;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                vmd vmdVar = vmd.EVENT_DETAILS;
                ((Integer) obj2).getClass();
                dk.a(aba.K(3073), (of3) obj, this.b, this.e, this.c, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                u6h.g(aba.K(385), (of3) obj, this.b, this.e, this.c, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                m77.c(aba.K(1), (of3) obj, this.b, this.e, this.c, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bk(vnb vnbVar, boolean z, boolean z2, Function1 function1, int i, int i2) {
        this.a = i2;
        this.b = vnbVar;
        this.c = z;
        this.d = z2;
        this.e = function1;
    }
}
