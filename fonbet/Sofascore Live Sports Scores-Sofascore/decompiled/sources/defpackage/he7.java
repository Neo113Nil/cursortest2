package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.ui.ManageSubscriptionsBottomSheet;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.team.details.modal.TennisGrandSlamPerformanceBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class he7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Context c;

    public /* synthetic */ he7(boh bohVar, Context context, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Context context = this.c;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    String string = context.getString(R.string.fantasy_combined_predictions);
                    string.getClass();
                    String string2 = context.getString(R.string.fantasy_combined_predictions_info);
                    string2.getClass();
                    String string3 = context.getString(R.string.got_it_button);
                    string3.getClass();
                    AlertDialog h = lnb.h(R.style.RedesignDialog, context);
                    h04 b = h04.b(LayoutInflater.from(context));
                    TextView textView = b.d;
                    mqi mqiVar = qhi.a;
                    textView.setText(qhi.a(string));
                    b.c.setText(qhi.a(string2));
                    h.setView(b.b);
                    h.setButton(-2, string3, new i0(h, 5));
                    h.show();
                }
                break;
            case 1:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    nv.z0(context, kv.CLICK, TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "user_profile");
                    int i3 = SofaSeasonActivity.L;
                    context.startActivity(new Intent(context, (Class<?>) SofaSeasonActivity.class));
                }
                break;
            case 2:
                long currentTimeMillis3 = System.currentTimeMillis();
                if (currentTimeMillis3 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis3);
                    ManageSubscriptionsBottomSheet manageSubscriptionsBottomSheet = new ManageSubscriptionsBottomSheet();
                    context.getClass();
                    if (context instanceof csk) {
                        context = ((csk) context).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(manageSubscriptionsBottomSheet, appCompatActivity, rq3Var, i2));
                    }
                }
                break;
            case 3:
                long currentTimeMillis4 = System.currentTimeMillis();
                if (currentTimeMillis4 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis4);
                    vjk[] vjkVarArr = vjk.a;
                    bea.G(context, "https://www.sofascore.com/terms-and-conditions");
                }
                break;
            case 4:
                long currentTimeMillis5 = System.currentTimeMillis();
                if (currentTimeMillis5 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis5);
                    vjk[] vjkVarArr2 = vjk.a;
                    bea.G(context, "https://www.sofascore.com/privacy-policy");
                }
                break;
            default:
                long currentTimeMillis6 = System.currentTimeMillis();
                if (currentTimeMillis6 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis6);
                    TennisGrandSlamPerformanceBottomSheet tennisGrandSlamPerformanceBottomSheet = new TennisGrandSlamPerformanceBottomSheet();
                    context.getClass();
                    if (context instanceof csk) {
                        context = ((csk) context).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(tennisGrandSlamPerformanceBottomSheet, appCompatActivity2, rq3Var, i2));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
