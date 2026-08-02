package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class f56 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ f56(float f, int i, int i2, int i3, long j, long j2, xtc xtcVar) {
        this.a = i3;
        this.b = xtcVar;
        this.c = j;
        this.d = f;
        this.e = j2;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.f | 1);
                c5n.a(this.d, K, this.g, this.c, this.e, (of3) obj, this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.f | 1);
                tz9.d(this.d, K2, this.g, this.c, this.e, (of3) obj, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(this.f | 1);
                tz9.r(this.d, K3, this.g, this.c, this.e, (of3) obj, this.b);
                break;
        }
        return Unit.a;
    }
}
