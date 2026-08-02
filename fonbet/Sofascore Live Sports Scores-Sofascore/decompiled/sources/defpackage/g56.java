package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class g56 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ xtc g;
    public final /* synthetic */ int h;

    public /* synthetic */ g56(int i, long j, long j2, float f, float f2, xtc xtcVar, int i2) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = f2;
        this.g = xtcVar;
        this.h = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.b | 1);
                c5n.c(this.e, this.f, K, this.h, this.c, this.d, (of3) obj, this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.h | 1);
                c5n.b(this.e, this.f, this.b, K2, this.c, this.d, (of3) obj, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(this.b | 1);
                s6a.f(this.e, this.f, K3, this.h, this.c, this.d, (of3) obj, this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g56(long j, xtc xtcVar, float f, long j2, float f2, int i, int i2) {
        this.c = j;
        this.g = xtcVar;
        this.e = f;
        this.d = j2;
        this.f = f2;
        this.b = i;
        this.h = i2;
    }

    public /* synthetic */ g56(xtc xtcVar, float f, float f2, long j, long j2, int i, int i2) {
        this.g = xtcVar;
        this.e = f;
        this.f = f2;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.h = i2;
    }
}
