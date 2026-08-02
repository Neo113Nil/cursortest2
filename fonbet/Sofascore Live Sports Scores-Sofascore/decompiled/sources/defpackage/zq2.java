package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zq2 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ zq2(int i, boolean z, Function0 function0, Function0 function02, int i2) {
        this.b = i;
        this.c = z;
        this.d = function0;
        this.e = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                int K = aba.K(this.b | 1);
                rz8.c(this.c, this.d, this.e, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                fsd.c(this.b, K2, (of3) obj, this.d, this.e, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zq2(boolean z, Function0 function0, Function0 function02, int i) {
        this.c = z;
        this.d = function0;
        this.e = function02;
        this.b = i;
    }
}
