package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s2f implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ s2f(xel xelVar, boolean z, float f, int i, int i2) {
        this.f = xelVar;
        this.b = z;
        this.c = f;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                tz9.b(this.b, (xtc) this.f, this.c, (of3) obj, aba.K(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                i2a.b((xel) this.f, this.b, this.c, (of3) obj, aba.K(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s2f(boolean z, xtc xtcVar, float f, int i, int i2) {
        this.b = z;
        this.f = xtcVar;
        this.c = f;
        this.d = i;
        this.e = i2;
    }
}
