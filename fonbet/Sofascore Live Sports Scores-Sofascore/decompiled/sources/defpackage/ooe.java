package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.newNetwork.NationalTeamStatisticsData;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ooe extends g7 {
    public final mqi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooe(Context context) {
        super(context);
        context.getClass();
        this.l = ypa.b(new nzd(context, 5));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        if (!(obj instanceof Transfer)) {
            return (obj instanceof NationalTeamStatisticsData) && !((NationalTeamStatisticsData) obj).getTeam().getDisabled();
        }
        Team transferTo = ((Transfer) obj).getTransferTo();
        return (transferTo == null || transferTo.getDisabled()) ? false : true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 1);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof nvj) {
            return 0;
        }
        if (obj instanceof Transfer) {
            return 1;
        }
        if (obj instanceof NationalTeamStatisticsData) {
            return 2;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        mqi mqiVar = this.l;
        if (i != 0) {
            if (i == 1) {
                return new noe(this, xz0.a(((LayoutInflater) mqiVar.getValue()).inflate(R.layout.player_details_team_item, viewGroup, false)), 1);
            }
            if (i == 2) {
                return new noe(this, xz0.a(((LayoutInflater) mqiVar.getValue()).inflate(R.layout.player_details_team_item, viewGroup, false)), 0);
            }
            ilg.c();
            return null;
        }
        View inflate = ((LayoutInflater) mqiVar.getValue()).inflate(R.layout.player_details_section_title, viewGroup, false);
        int i2 = R.id.national_team_header;
        TextView textView = (TextView) nq8.B(R.id.national_team_header, inflate);
        if (textView != null) {
            i2 = R.id.team_section;
            View B = nq8.B(R.id.team_section, inflate);
            if (B != null) {
                return new ja9(new dd((ConstraintLayout) inflate, textView, kqb.a(B), 28));
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
