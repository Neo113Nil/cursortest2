package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nj4 implements ct8 {
    public final /* synthetic */ tc3 a;
    public final /* synthetic */ boolean b;

    public nj4(tc3 tc3Var, boolean z) {
        this.a = tc3Var;
        this.b = z;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String B;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            this.a.invoke(av8Var, 0);
            float f = q72.e;
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.l(utcVar, f));
            ImageVector I = u6h.I();
            boolean z = this.b;
            if (z) {
                av8Var.d0(1509384391);
                B = cga.B(R.string.m3c_date_picker_switch_to_day_selection, av8Var);
                av8Var.s(false);
            } else {
                av8Var.d0(1509478662);
                B = cga.B(R.string.m3c_date_picker_switch_to_year_selection, av8Var);
                av8Var.s(false);
            }
            kq9.b(I, B, haa.v(utcVar, z ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0L, av8Var, 0, 8);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
