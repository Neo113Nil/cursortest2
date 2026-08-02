package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class oz5 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xtc e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Number h;

    public /* synthetic */ oz5(long j, boolean z, Function0 function0, Long l, xtc xtcVar, boolean z2, int i) {
        this.b = j;
        this.c = z;
        this.g = function0;
        this.h = l;
        this.e = xtcVar;
        this.d = z2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                xw3.e(this.b, this.c, (Function0) this.g, (Long) this.h, this.e, this.d, (of3) obj, aba.K(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                oyn.d((Integer) this.g, (Integer) this.h, this.b, this.c, this.d, this.e, (of3) obj, aba.K(this.f | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oz5(Integer num, Integer num2, long j, boolean z, boolean z2, xtc xtcVar, int i) {
        this.g = num;
        this.h = num2;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = xtcVar;
        this.f = i;
    }
}
