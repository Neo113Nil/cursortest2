package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class tff implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ dfj c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ tff(long j, dfj dfjVar, Function2 function2, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = dfjVar;
        this.d = function2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                w1a.f(this.b, this.c, this.d, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                qha.b(this.b, this.c, this.d, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}
