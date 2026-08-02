package defpackage;

import com.facebook.appevents.j;
import com.moloco.sdk.internal.ortb.model.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ds6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ds6(int i, xtc xtcVar, dfj dfjVar, int i2, int i3) {
        this.b = i;
        this.e = xtcVar;
        this.f = dfjVar;
        this.c = i2;
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(this.c | 1);
                int i2 = this.b;
                td4.o(i2, (xtc) obj4, (dfj) obj3, (of3) obj, K, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int i3 = this.d | 1;
                int i4 = this.b;
                int i5 = this.c;
                j.k((h0) obj4, i4, i5, (Function0) obj3, (of3) obj, i3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ds6(h0 h0Var, int i, int i2, Function0 function0, int i3) {
        this.e = h0Var;
        this.b = i;
        this.c = i2;
        this.f = function0;
        this.d = i3;
    }
}
