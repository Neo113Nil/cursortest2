package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.results.event.overs.EventOversFragment;
import com.sofascore.results.event.overs.view.CricketOverDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class t46 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventOversFragment b;

    public /* synthetic */ t46(EventOversFragment eventOversFragment, int i) {
        this.a = i;
        this.b = eventOversFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        EventOversFragment eventOversFragment = this.b;
        switch (i) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                Integer num2 = (Integer) obj2;
                num2.getClass();
                Context requireContext = eventOversFragment.requireContext();
                requireContext.getClass();
                CricketEvent C = eventOversFragment.C();
                CricketOverDialog cricketOverDialog = new CricketOverDialog();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ARG_INNING", num);
                bundle.putSerializable("ARG_OVER", num2);
                bundle.putSerializable("ARG_EVENT", C);
                cricketOverDialog.setArguments(bundle);
                if (requireContext instanceof csk) {
                    requireContext = ((csk) requireContext).getBaseContext();
                }
                AppCompatActivity appCompatActivity = requireContext instanceof AppCompatActivity ? (AppCompatActivity) requireContext : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(cricketOverDialog, appCompatActivity, null, 3));
                }
                break;
            default:
                mqi mqiVar = eventOversFragment.t;
                String str = (String) obj;
                ((Integer) obj2).getClass();
                str.getClass();
                List list = (List) ((y46) eventOversFragment.r.getValue()).g.d();
                if (list != null) {
                    ((r46) mqiVar.getValue()).s();
                    ((r46) mqiVar.getValue()).G(eventOversFragment.C(), list, TeamSelection.valueOf(str));
                }
                break;
        }
        return Unit.a;
    }
}
