package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qz0 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ xtc f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qz0(int i, int i2, o68 o68Var, xtc xtcVar, boolean z, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.h = o68Var;
        this.f = xtcVar;
        this.e = z;
        this.d = i3;
        this.g = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rz0.a((sz0) obj3, this.f, this.b, this.c, this.e, (of3) obj, aba.K(i2 | 1), this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                gvd.h((String) obj3, this.b, this.c, this.d, this.e, this.f, (of3) obj, K, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                int i3 = this.b;
                int i4 = this.c;
                c5n.l(i3, i4, (o68) obj3, this.f, this.e, (of3) obj, K2, this.g);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qz0(sz0 sz0Var, xtc xtcVar, int i, int i2, boolean z, int i3, int i4) {
        this.h = sz0Var;
        this.f = xtcVar;
        this.b = i;
        this.c = i2;
        this.e = z;
        this.d = i3;
        this.g = i4;
    }

    public /* synthetic */ qz0(String str, int i, int i2, int i3, boolean z, xtc xtcVar, int i4, int i5) {
        this.h = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = xtcVar;
        this.g = i5;
    }
}
