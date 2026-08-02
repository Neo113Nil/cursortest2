package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class et4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ et4(int i, int i2, int i3, long j) {
        this.a = 2;
        this.b = i;
        this.c = j;
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.d | 1);
                ft4.b(this.b, this.c, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(this.d | 1);
                ft4.b(this.b, this.c, (of3) obj, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                fz8.m(this.b, this.c, (of3) obj, K3, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ et4(int i, long j, int i2, int i3, byte b) {
        this.a = i3;
        this.b = i;
        this.c = j;
        this.d = i2;
    }
}
