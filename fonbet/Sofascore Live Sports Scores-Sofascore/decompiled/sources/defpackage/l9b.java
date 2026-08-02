package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class l9b implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l9b(int i, boolean z, Double d, int i2) {
        this.a = 0;
        this.c = i;
        this.b = z;
        this.d = d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.d;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m9b.e(i2, z, (Double) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                h5a.r(z, (Function2) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ufi.a(z, i2, (tc3) obj3, (of3) obj, aba.K(385));
                break;
            default:
                ((Integer) obj2).getClass();
                g7a.n(z, (String) obj3, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l9b(int i, int i2, Object obj, boolean z) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ l9b(boolean z, int i, tc3 tc3Var, int i2) {
        this.a = 2;
        this.b = z;
        this.c = i;
        this.d = tc3Var;
    }
}
