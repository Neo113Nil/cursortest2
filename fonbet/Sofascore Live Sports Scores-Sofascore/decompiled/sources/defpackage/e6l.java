package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class e6l implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7l b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vy8 g;

    public /* synthetic */ e6l(y7l y7lVar, boolean z, String str, String str2, boolean z2, vy8 vy8Var, int i, int i2) {
        this.a = i2;
        this.b = y7lVar;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = z2;
        this.g = vy8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                haa.i(this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                haa.j(this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }
}
