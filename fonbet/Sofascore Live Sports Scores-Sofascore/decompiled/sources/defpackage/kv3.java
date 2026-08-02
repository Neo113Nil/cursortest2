package defpackage;

import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class kv3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ kv3(long j) {
        this.a = 0;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        long j = this.b;
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    kq9.b(s6a.N(R.drawable.ic_search, 6, av8Var), null, bkh.l(utc.a, 20.0f), this.b, av8Var, 432, 0);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                num.getClass();
                n9e.n(j, of3Var, aba.K(1));
                break;
            case 2:
                num.getClass();
                b0a.m(j, of3Var, aba.K(1));
                break;
            default:
                num.getClass();
                f5p.m(j, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kv3(long j, int i, int i2) {
        this.a = i2;
        this.b = j;
    }
}
