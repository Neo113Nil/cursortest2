package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nki implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nki(xtc xtcVar, boolean z, slf slfVar, boolean z2, boolean z3, boolean z4, int i) {
        this.b = xtcVar;
        this.c = z;
        this.g = slfVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                aik.n((lki) obj3, this.c, this.d, this.e, this.b, this.f, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                pea.l(this.b, this.c, (slf) obj3, this.d, this.e, this.f, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nki(lki lkiVar, boolean z, boolean z2, boolean z3, xtc xtcVar, boolean z4, int i) {
        this.g = lkiVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.b = xtcVar;
        this.f = z4;
    }
}
