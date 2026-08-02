package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class dk {
    static {
        ypa.b(new c0(18));
    }

    public static final void a(int i, of3 of3Var, vnb vnbVar, Function1 function1, boolean z, boolean z2) {
        vmd vmdVar = vmd.EVENT_DETAILS;
        vnbVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-35409094);
        int i2 = i | (av8Var.h(z) ? 4 : 2) | (av8Var.h(z2) ? 32 : 16) | (av8Var.g(vnbVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? 16384 : 8192);
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) av8Var.k(nz.b);
            int i3 = ke0.c;
            boolean z3 = (57344 & i2) == 16384;
            Object O = av8Var.O();
            if (z3 || O == nf3.a) {
                O = new ri(1, function1);
                av8Var.n0(O);
            }
            ktm.s(vnbVar, (Function0) O, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, yqo.H(-1801285736, av8Var, new ak(i3, context, z2, function1)), av8Var, ((i2 >> 6) & 14) | 100663296 | ((i2 << 6) & 896), 248);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk(z, z2, vnbVar, function1, i);
        }
    }
}
