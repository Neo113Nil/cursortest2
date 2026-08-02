package defpackage;

import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import com.sofascore.results.settings.about.AboutActivity;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsActivity;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import com.vungle.ads.internal.presenter.w;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class j0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        mig migVar;
        int i = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((AboutActivity) obj).M = 0;
                break;
            case 1:
                ((ate) obj).invoke();
                break;
            case 2:
                wxf wxfVar = EventActivity.h0;
                ((u4g) ((EventActivity) obj).P.getValue()).k();
                break;
            case 3:
                ((ProfilePredictionsFragment) obj).D().k();
                break;
            case 4:
                qig qigVar = (qig) obj;
                cqa cqaVar = qigVar.a;
                if (cqaVar != null) {
                    yig yigVar = qigVar.b;
                    pig pigVar = (pig) cqaVar.a;
                    if (yigVar != null) {
                        sig sigVar = pigVar.j;
                        if (sigVar != null) {
                            int i2 = yigVar.a;
                            String str = yigVar.b;
                            str.getClass();
                            meg megVar = new meg(3);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("id", Integer.valueOf(i2));
                            linkedHashMap.put(PglCryptUtils.KEY_MESSAGE, str);
                            try {
                                JSONObject f0 = hkg.f0(linkedHashMap);
                                if (f0.length() > 0) {
                                    megVar.b = f0;
                                }
                            } catch (JSONException unused) {
                                fjg.c().f(1);
                            }
                            xig xigVar = new xig(sigVar.a, sigVar.b, sigVar.c, sigVar.d, sigVar.e, sigVar.f, sigVar.g);
                            String str2 = (String) pigVar.d.b;
                            fig figVar = pigVar.e;
                            String str3 = (String) figVar.b;
                            String str4 = (String) figVar.c;
                            String str5 = (String) figVar.d;
                            String str6 = Build.MODEL;
                            String str7 = Build.VERSION.RELEASE;
                            b10 b10Var = sigVar.h;
                            int i3 = b10Var.b;
                            Boolean valueOf = Boolean.valueOf(b10Var.t());
                            bjg bjgVar = bjg.GPP_V_UNKNOWN;
                            Boolean bool = Boolean.FALSE;
                            int i4 = qha.B().a;
                            pigVar.f.getClass();
                            if (hkg.c) {
                                zig zigVar = zig.DEVICE_TYPE_UNKNOWN;
                            } else {
                                zig zigVar2 = zig.DEVICE_TYPE_UNKNOWN;
                            }
                            meg megVar2 = new meg(str2, str3, str4, str5, i3, valueOf, "", "", bjgVar, bool, "", bool, 3, "", bool, 2, i4, 1, zig.DEVICE_TYPE_UNKNOWN, 4);
                            yia yiaVar = pigVar.b;
                            List j = b.j(megVar, xigVar, megVar2);
                            yiaVar.getClass();
                            j.getClass();
                            dkg dkgVar = (dkg) yiaVar.b;
                            ckg a = dkgVar.a(str, bkg.INFO, "adFeedback", null, j);
                            if (a != null) {
                                dkgVar.b(a, null);
                            }
                        }
                        z = true;
                    }
                    mig migVar2 = pigVar.o;
                    if (migVar2 != null) {
                        migVar2.onCustomerFeedbackDialogDismissed(z);
                        break;
                    }
                }
                break;
            case 5:
                hcc hccVar = ((uig) obj).a;
                if (hccVar != null && (migVar = ((pig) hccVar.b).o) != null) {
                    migVar.onCustomerFeedbackDialogDismissed(false);
                    break;
                }
                break;
            case 6:
                int i5 = UserProfileActivity.S;
                ((u4g) ((UserProfileActivity) obj).M.getValue()).k();
                break;
            case 7:
                int i6 = WeeklyPredictionsActivity.O;
                ((u4g) ((WeeklyPredictionsActivity) obj).L.getValue()).k();
                break;
            case 8:
                ((WeeklyPredictionsFragment) obj).D().k();
                break;
            default:
                w.a((w) obj, dialogInterface);
                break;
        }
    }
}
