package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Money;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.SeasonInfo;
import com.sofascore.results.R;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oq5 extends o8 {
    public final vy1 d;
    public final LayoutInflater e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq5(Context context) {
        super(context, null, 0);
        context.getClass();
        vy1 a = vy1.a(getRoot());
        this.d = a;
        this.e = LayoutInflater.from(context);
        setVisibility(8);
        a.b.setClipToOutline(true);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.summary_info_layout;
    }

    public final void j(SeasonInfo seasonInfo) {
        String str;
        seasonInfo.getClass();
        if (getVisibility() == 0) {
            return;
        }
        setVisibility((seasonInfo.getTotalPrizeMoneyRaw() == null && seasonInfo.getWinner() == null && seasonInfo.getNumberOfCompetitors() == null && seasonInfo.getTier() == null) ? 8 : 0);
        vy1 vy1Var = this.d;
        LinearLayout linearLayout = vy1Var.b;
        LinearLayout linearLayout2 = vy1Var.b;
        LayoutInflater layoutInflater = this.e;
        kqb d = kqb.d(layoutInflater, linearLayout, true);
        d.c.setVisibility(8);
        d.d.setText(getContext().getString(R.string.tournament_info));
        Team winner = seasonInfo.getWinner();
        if (winner != null) {
            cv1 e = cv1.e(layoutInflater, linearLayout2);
            TextView textView = e.f;
            Context context = getContext();
            context.getClass();
            textView.setText(tba.p(context, winner));
            e.d.setText(R.string.winner);
            e.e.setVisibility(8);
            e.c.setVisibility(8);
        }
        Integer numberOfCompetitors = seasonInfo.getNumberOfCompetitors();
        if (numberOfCompetitors != null) {
            int intValue = numberOfCompetitors.intValue();
            cv1 e2 = cv1.e(layoutInflater, linearLayout2);
            e2.f.setText(String.valueOf(intValue));
            e2.d.setText(R.string.number_of_competitors);
            e2.e.setVisibility(8);
            e2.c.setVisibility(8);
        }
        String tier = seasonInfo.getTier();
        if (tier != null) {
            cv1 e3 = cv1.e(layoutInflater, linearLayout2);
            e3.f.setText(tier);
            e3.d.setText(R.string.tier);
            e3.e.setVisibility(8);
            e3.c.setVisibility(8);
        }
        Money totalPrizeMoneyRaw = seasonInfo.getTotalPrizeMoneyRaw();
        if (totalPrizeMoneyRaw != null) {
            Set set = o84.a;
            Context context2 = getContext();
            context2.getClass();
            str = o84.a(context2, totalPrizeMoneyRaw, 0L, 12);
        } else {
            str = null;
        }
        if (str != null) {
            cv1 e4 = cv1.e(layoutInflater, linearLayout2);
            e4.f.setText(str);
            e4.d.setText(R.string.total_prize_money);
            e4.e.setVisibility(8);
            e4.c.setVisibility(8);
        }
    }
}
