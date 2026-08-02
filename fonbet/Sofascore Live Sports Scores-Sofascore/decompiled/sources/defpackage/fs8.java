package defpackage;

import com.sofascore.results.event.media.FullScreenVideoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fs8 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullScreenVideoActivity b;

    public /* synthetic */ fs8(FullScreenVideoActivity fullScreenVideoActivity, int i) {
        this.a = i;
        this.b = fullScreenVideoActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FullScreenVideoActivity fullScreenVideoActivity = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = FullScreenVideoActivity.O;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-797474770, av8Var, new fs8(fullScreenVideoActivity, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int i4 = FullScreenVideoActivity.O;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc f0 = ml4.f0(utc.a);
                    String str = (String) fullScreenVideoActivity.K.getValue();
                    String str2 = (String) fullScreenVideoActivity.L.getValue();
                    qqk qqkVar = qqk.b;
                    boolean i5 = av8Var2.i(fullScreenVideoActivity);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i5 || O == a99Var) {
                        O = new s16(fullScreenVideoActivity, 25);
                        av8Var2.n0(O);
                    }
                    ct8 ct8Var = (ct8) O;
                    boolean i6 = av8Var2.i(fullScreenVideoActivity);
                    Object O2 = av8Var2.O();
                    if (i6 || O2 == a99Var) {
                        O2 = new yx7(fullScreenVideoActivity, 16);
                        av8Var2.n0(O2);
                    }
                    rd0.q(str, str2, f0, ct8Var, false, (Function1) O2, null, qqkVar, av8Var2, 805306368, 368);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
