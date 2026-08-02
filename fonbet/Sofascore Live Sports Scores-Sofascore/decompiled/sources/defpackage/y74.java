package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.dialog.CupTreeDialog;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.league.view.cuptree.CupTreeExtendedView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class y74 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CupTreeExtendedView b;

    public /* synthetic */ y74(CupTreeExtendedView cupTreeExtendedView, int i) {
        this.a = i;
        this.b = cupTreeExtendedView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        CupTreeExtendedView cupTreeExtendedView = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                nr1 nr1Var = cupTreeExtendedView.d;
                ((LinearLayout) nr1Var.g).setVisibility(booleanValue ? 0 : 8);
                ((LinearLayout) nr1Var.d).setVisibility(booleanValue ? 0 : 8);
                break;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                nr1 nr1Var2 = cupTreeExtendedView.d;
                ((LinearLayout) nr1Var2.g).setVisibility(booleanValue2 ? 0 : 8);
                ((LinearLayout) nr1Var2.f).setVisibility(booleanValue2 ? 0 : 8);
                break;
            default:
                List list = (List) obj;
                int i2 = CupTreeExtendedView.p;
                list.getClass();
                rq3 rq3Var = null;
                Integer num = cupTreeExtendedView.h ? cupTreeExtendedView.g : null;
                if (list.size() == 1) {
                    wxf wxfVar = EventActivity.h0;
                    Context context = cupTreeExtendedView.getContext();
                    context.getClass();
                    wxf.B(context, ((Number) list.get(0)).intValue(), null, null, null, num, 60);
                } else if (list.size() > 1) {
                    ArrayList<Integer> arrayList = new ArrayList<>(list);
                    Context context2 = cupTreeExtendedView.getContext();
                    context2.getClass();
                    CupTreeDialog cupTreeDialog = new CupTreeDialog();
                    Bundle bundle = new Bundle();
                    bundle.putIntegerArrayList("ID_LIST", arrayList);
                    if (num != null) {
                        bundle.putInt("FROM_UNIQUE_TOURNAMENT_ID", num.intValue());
                    }
                    cupTreeDialog.setArguments(bundle);
                    if (context2 instanceof csk) {
                        context2 = ((csk) context2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(cupTreeDialog, appCompatActivity, rq3Var, 3));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
