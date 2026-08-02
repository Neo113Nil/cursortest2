package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.sofascore.model.profile.ReferralResponse;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xtf {
    public static final joa a;

    static {
        wtf wtfVar = new wtf(2);
        ysa ysaVar = ysa.c;
        a = ypa.a(ysaVar, wtfVar);
        ypa.a(ysaVar, new wtf(3));
    }

    public static final void a(ReferralResponse referralResponse, vnb vnbVar, Function1 function1, of3 of3Var, int i) {
        vnbVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1518740537);
        int i2 = i | (av8Var.i(referralResponse) ? 4 : 2) | (av8Var.g(vnbVar) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = e.f(null);
                av8Var.n0(O);
            }
            ktm.t(vnbVar, null, false, null, null, yqo.H(-1468981015, av8Var, new er6(referralResponse, function1, (Context) av8Var.k(nz.b), (e1d) O, 9)), av8Var, ((i2 >> 3) & 14) | 196608, 30);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wbc(referralResponse, vnbVar, function1, i, 19);
        }
    }
}
