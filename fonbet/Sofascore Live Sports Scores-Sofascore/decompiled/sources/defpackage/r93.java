package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class r93 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xtc e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ r93(String str, long j, boolean z, xtc xtcVar, int i, int i2) {
        this.a = 1;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = xtcVar;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.g | 1);
                hz8.a(this.f, K, this.c, (of3) obj, this.e, this.b, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                pea.j(aba.K(this.f | 1), this.g, this.c, (of3) obj, this.e, this.b, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.g | 1);
                uaa.g(this.f, K2, this.c, (of3) obj, this.e, this.b, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ r93(int i, String str, boolean z, xtc xtcVar, long j, int i2, int i3) {
        this.a = i3;
        this.f = i;
        this.b = str;
        this.d = z;
        this.e = xtcVar;
        this.c = j;
        this.g = i2;
    }
}
