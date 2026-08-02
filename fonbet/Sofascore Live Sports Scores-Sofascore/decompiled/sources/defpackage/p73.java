package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class p73 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ p73(int i, String str, boolean z, xtc xtcVar, int i2) {
        this.a = 2;
        this.e = i;
        this.b = str;
        this.c = z;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        xtc xtcVar = this.d;
        boolean z = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ml4.i(aba.K(i2 | 1), (of3) obj, xtcVar, str, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                td4.K(aba.K(i2 | 1), (of3) obj, xtcVar, str, z);
                break;
            default:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                l4a.b(this.e, this.b, this.c, this.d, (of3) obj, K);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p73(String str, boolean z, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = z;
        this.d = xtcVar;
        this.e = i;
    }
}
