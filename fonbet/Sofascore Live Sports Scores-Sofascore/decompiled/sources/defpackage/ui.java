package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ui implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vnb b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ui(vnb vnbVar, boolean z, Function1 function1, int i) {
        this.b = vnbVar;
        this.c = z;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                ml4.a(this.c, this.e, this.b, this.d, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                zm2.b(aba.K(this.e | 1), (of3) obj, this.b, this.d, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ui(boolean z, int i, vnb vnbVar, Function1 function1, int i2) {
        this.c = z;
        this.e = i;
        this.b = vnbVar;
        this.d = function1;
    }
}
