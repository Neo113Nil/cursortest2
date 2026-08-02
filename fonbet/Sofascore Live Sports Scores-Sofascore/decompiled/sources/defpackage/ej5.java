package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ej5 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ej5(pj5 pj5Var, boolean z, boolean z2, int i) {
        this.d = pj5Var;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((pj5) obj3).G(aba.K(1), (of3) obj, z2, z);
                break;
            default:
                ((Integer) obj2).getClass();
                int K = aba.K(433);
                i56.a(K, (of3) obj, (xtc) obj3, z2, z);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ej5(boolean z, boolean z2, xtc xtcVar, int i) {
        this.b = z;
        this.c = z2;
        this.d = xtcVar;
    }
}
