package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ zs1(int i, String str, xtc xtcVar, boolean z, long j, float f, int i2, int i3) {
        this.c = i;
        this.i = str;
        this.b = xtcVar;
        this.d = z;
        this.e = j;
        this.f = f;
        this.g = i2;
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.g;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                int i3 = this.c;
                l6g.n(i3, (String) obj3, this.b, this.d, this.e, this.f, (of3) obj, K, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                tgj.i((Function0) obj3, this.b, this.c, this.d, this.e, this.f, (of3) obj, aba.K(i2 | 1), this.h);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zs1(Function0 function0, xtc xtcVar, int i, boolean z, long j, float f, int i2, int i3) {
        this.i = function0;
        this.b = xtcVar;
        this.c = i;
        this.d = z;
        this.e = j;
        this.f = f;
        this.g = i2;
        this.h = i3;
    }
}
