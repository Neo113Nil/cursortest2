package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class m65 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ m65(float f, int i, int i2, int i3, long j, xtc xtcVar) {
        this.a = i3;
        this.b = xtcVar;
        this.c = f;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                td4.N(this.b, this.c, this.d, (of3) obj, aba.K(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                td4.w(this.b, this.c, this.d, (of3) obj, aba.K(this.e | 1), this.f);
                break;
        }
        return Unit.a;
    }
}
