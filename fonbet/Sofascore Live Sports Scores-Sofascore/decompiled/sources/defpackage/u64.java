package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class u64 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u64(long j, long j2, int i, Function1 function1, Function0 function0, int i2) {
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = function1;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                o02.k(this.b, this.c, this.d, (Function1) this.e, (Function0) this.f, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).intValue();
                aba.p((mhj) this.e, this.b, (dfj) this.f, this.c, (of3) obj, aba.K(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ u64(mhj mhjVar, long j, dfj dfjVar, long j2, int i) {
        this.e = mhjVar;
        this.b = j;
        this.f = dfjVar;
        this.c = j2;
        this.d = i;
    }
}
