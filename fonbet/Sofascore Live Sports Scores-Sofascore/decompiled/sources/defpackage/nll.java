package defpackage;

import android.graphics.Bitmap;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class nll implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oll b;

    public /* synthetic */ nll(oll ollVar, int i) {
        this.a = i;
        this.b = ollVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        oll ollVar = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    lz.c(null, ho.h, yqo.H(1392731613, av8Var, new nll(ollVar, i2)), av8Var, 384, 1);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    Bitmap bitmap = ollVar.b;
                    dt9 bx1Var = bitmap != null ? new bx1(bitmap) : null;
                    c5n.n(bx1Var == null ? new v20(R.drawable.player_photo_placeholder) : bx1Var, gz8.E(nq8.K(48.0f), 24.0f), 0, bx1Var == null ? new t13(new fjj(new h1g(R.color.on_color_secondary))) : null, av8Var2, 32816, 8);
                    jfj jfjVar = ollVar.c;
                    if (jfjVar == null) {
                        av8Var2.d0(1484004924);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1484004925);
                        vy8 F = nq8.F(nq8.N(ty8.a, 28.0f), 16.0f);
                        Integer num = jfjVar.b;
                        lz.c(c5n.t(F, new h1g(num != null ? num.intValue() : R.color.rating_00)), ho.e, yqo.H(-1712626972, av8Var2, new lqj(jfjVar, 23)), av8Var2, 384, 0);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
