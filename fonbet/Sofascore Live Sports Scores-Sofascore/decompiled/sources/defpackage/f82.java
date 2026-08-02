package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class f82 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ f82(String str, Object obj, xtc xtcVar, long j, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.b = str;
        this.h = obj;
        this.c = xtcVar;
        this.d = j;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                qx9.o(this.b, (Function0) this.h, this.c, this.d, this.e, (of3) obj, aba.K(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                nq8.i(this.b, (d7e) this.h, this.c, this.d, this.e, (of3) obj, aba.K(this.f | 1), this.g);
                break;
        }
        return Unit.a;
    }
}
