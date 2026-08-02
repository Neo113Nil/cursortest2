package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s94 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    public /* synthetic */ s94(String str, int i, boolean z, boolean z2, int i2) {
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ml4.o(aba.K(this.c | 1), this.f, (of3) obj, this.b, this.d, this.e);
                break;
            default:
                ((Integer) obj2).intValue();
                int K = aba.K(this.f | 1);
                nld.e(this.c, K, (of3) obj, this.b, this.d, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s94(String str, boolean z, boolean z2, int i, int i2) {
        this.b = str;
        this.d = z;
        this.e = z2;
        this.c = i;
        this.f = i2;
    }
}
