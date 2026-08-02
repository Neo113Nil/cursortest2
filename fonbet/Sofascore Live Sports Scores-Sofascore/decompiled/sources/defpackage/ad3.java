package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ad3 implements ft8 {
    public final /* synthetic */ int a;

    public /* synthetic */ ad3(int i) {
        this.a = i;
    }

    @Override // defpackage.ft8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                r8j r8jVar = (r8j) obj;
                g8j g8jVar = (g8j) obj2;
                Function0 function0 = (Function0) obj3;
                of3 of3Var = (of3) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    i = intValue | ((intValue & 8) == 0 ? ((av8) of3Var).g(r8jVar) : ((av8) of3Var).i(r8jVar) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= (intValue & 64) == 0 ? ((av8) of3Var).g(g8jVar) : ((av8) of3Var).i(g8jVar) ? 32 : 16;
                }
                if ((intValue & 384) == 0) {
                    i |= ((av8) of3Var).i(function0) ? 256 : 128;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(i & 1, (i & 1171) != 1170)) {
                    ft4.c(r8jVar, g8jVar, function0, av8Var, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                r8j r8jVar2 = (r8j) obj;
                g8j g8jVar2 = (g8j) obj2;
                Function0 function02 = (Function0) obj3;
                of3 of3Var2 = (of3) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | ((intValue2 & 8) == 0 ? ((av8) of3Var2).g(r8jVar2) : ((av8) of3Var2).i(r8jVar2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= (intValue2 & 64) == 0 ? ((av8) of3Var2).g(g8jVar2) : ((av8) of3Var2).i(g8jVar2) ? 32 : 16;
                }
                if ((intValue2 & 384) == 0) {
                    i2 |= ((av8) of3Var2).i(function02) ? 256 : 128;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i2 & 1, (i2 & 1171) != 1170)) {
                    ft4.c(r8jVar2, g8jVar2, function02, av8Var2, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((pej) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(pej.g(j), pej.f(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                break;
        }
        return Unit.a;
    }
}
