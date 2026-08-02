package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class i82 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ xtc e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i82(String str, String str2, long j, long j2, xtc xtcVar, int i) {
        this.b = str;
        this.f = str2;
        this.c = j;
        this.d = j2;
        this.e = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(196609);
                qx9.j(this.b, (Function0) obj3, this.e, this.c, this.d, (of3) obj, K);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(24577);
                bea.d(this.b, (String) obj3, this.c, this.d, this.e, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i82(String str, Function0 function0, xtc xtcVar, long j, long j2, int i) {
        this.b = str;
        this.f = function0;
        this.e = xtcVar;
        this.c = j;
        this.d = j2;
    }
}
