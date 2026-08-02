package defpackage;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class eo6 {
    public static final void a(ppb ppbVar, Function1 function1, ksa ksaVar, float f, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        function1.getClass();
        ksaVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-54048822);
        int i2 = i | (av8Var.g(ppbVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.g(ksaVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.d(f) ? a.o : 1024) | 24576;
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            g28 g28Var = bkh.c;
            t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hkg.u(48.0f, av8Var, 0), 5);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object O = av8Var.O();
            if (z || O == nf3.a) {
                O = new wn6(ppbVar, function1, 1);
                av8Var.n0(O);
            }
            v8a.a(g28Var, ksaVar, C, null, null, null, false, null, (Function1) O, av8Var, (i2 >> 3) & 112, PglCryptUtils.BASE64_FAILED);
            xtcVar2 = utc.a;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xn6(ppbVar, function1, ksaVar, f, xtcVar2, i, 1);
        }
    }
}
