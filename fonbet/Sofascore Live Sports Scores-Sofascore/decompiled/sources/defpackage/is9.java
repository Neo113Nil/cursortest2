package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class is9 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ is9(int i, xtc xtcVar, Integer num, boolean z, int i2, int i3) {
        this.c = i;
        this.d = xtcVar;
        this.e = num;
        this.b = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.f | 1);
                td4.y(this.c, K, this.g, (of3) obj, this.d, this.e, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.f | 1);
                v8a.f(this.c, K2, this.g, (of3) obj, this.d, this.e, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ is9(boolean z, int i, xtc xtcVar, Integer num, int i2, int i3) {
        this.b = z;
        this.c = i;
        this.d = xtcVar;
        this.e = num;
        this.f = i2;
        this.g = i3;
    }
}
