package defpackage;

import com.sofascore.model.fantasy.BasicTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dv6(int i, BasicTeam basicTeam, BasicTeam basicTeam2, long j, xtc xtcVar, int i2) {
        this.b = i;
        this.e = basicTeam;
        this.f = basicTeam2;
        this.c = j;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(385);
                n9e.f((mp6) obj4, (Function1) obj3, this.d, this.c, (of3) obj, K, this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int K2 = aba.K(24577);
                yqo.i(this.b, (BasicTeam) obj4, (BasicTeam) obj3, this.c, this.d, (of3) obj, K2);
                break;
            default:
                ((Integer) obj2).getClass();
                int K3 = aba.K(3073);
                td4.F(this.b, (String) obj4, (Integer) obj3, this.d, this.c, (of3) obj, K3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dv6(int i, String str, Integer num, xtc xtcVar, long j, int i2) {
        this.b = i;
        this.e = str;
        this.f = num;
        this.d = xtcVar;
        this.c = j;
    }

    public /* synthetic */ dv6(mp6 mp6Var, Function1 function1, xtc xtcVar, long j, int i, int i2) {
        this.e = mp6Var;
        this.f = function1;
        this.d = xtcVar;
        this.c = j;
        this.b = i2;
    }
}
