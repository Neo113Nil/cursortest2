package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zc3 implements it8 {
    @Override // defpackage.it8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        xtc xtcVar = (xtc) obj;
        String str = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        gq3 gq3Var = (gq3) obj4;
        ct8 ct8Var = (ct8) obj5;
        Function0 function0 = (Function0) obj6;
        of3 of3Var = (of3) obj7;
        int intValue = ((Integer) obj8).intValue();
        if ((intValue & 6) == 0) {
            i = (((av8) of3Var).g(xtcVar) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((av8) of3Var).g(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= ((av8) of3Var).h(booleanValue) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= ((av8) of3Var).g(gq3Var) ? a.o : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= ((av8) of3Var).i(ct8Var) ? 16384 : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= ((av8) of3Var).i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (599187 & i) != 599186)) {
            kq3.c(str, booleanValue, gq3Var, xtcVar, ct8Var, function0, av8Var, ((i >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
