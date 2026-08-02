package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatisticsRowData;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class md2 extends c8 {
    public final int d;
    public final int e;
    public final int f;

    public md2(tq5 tq5Var) {
        super(tq5Var);
        this.d = this.b.getColor(R.color.live);
        this.e = this.b.getColor(R.color.secondary_default);
        this.f = this.b.getColor(R.color.n_lv_1);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i3;
        String str9;
        String valueOf;
        ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData = (ESportsGamePlayerStatisticsRowData) obj;
        eSportsGamePlayerStatisticsRowData.getClass();
        super.e(eSportsGamePlayerStatisticsRowData);
        tq5 tq5Var = (tq5) this.c;
        sq5 sq5Var = tq5Var.q;
        sq5 sq5Var2 = tq5Var.p;
        sq5 sq5Var3 = tq5Var.n;
        sq5 sq5Var4 = tq5Var.o;
        TextView textView = sq5Var4.f;
        TextView textView2 = sq5Var4.d;
        sq5Var.a.setVisibility(8);
        tq5Var.r.a.setVisibility(8);
        tq5Var.e.setVisibility(8);
        tq5Var.j.setVisibility(8);
        ImageView imageView = tq5Var.d;
        Boolean alive = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getAlive();
        Boolean bool = Boolean.FALSE;
        imageView.setVisibility(Intrinsics.c(alive, bool) ? 0 : 8);
        tq5Var.i.setVisibility(Intrinsics.c(eSportsGamePlayerStatisticsRowData.getSecondTeamData().getAlive(), bool) ? 0 : 8);
        sq5Var3.g.setText("K/A/D");
        TextView textView3 = sq5Var3.d;
        Integer kills = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getKills();
        String str10 = "-";
        if (kills == null || (str = String.valueOf(kills.intValue())) == null) {
            str = "-";
        }
        Integer assists = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getAssists();
        if (assists == null || (str2 = String.valueOf(assists.intValue())) == null) {
            str2 = "-";
        }
        Integer deaths = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getDeaths();
        if (deaths == null || (str3 = String.valueOf(deaths.intValue())) == null) {
            str3 = "-";
        }
        textView3.setText(bf3.k(str, " / ", str2, " / ", str3));
        TextView textView4 = sq5Var3.f;
        Integer kills2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getKills();
        if (kills2 == null || (str4 = String.valueOf(kills2.intValue())) == null) {
            str4 = "-";
        }
        Integer assists2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getAssists();
        if (assists2 == null || (str5 = String.valueOf(assists2.intValue())) == null) {
            str5 = "-";
        }
        Integer deaths2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getDeaths();
        if (deaths2 == null || (str6 = String.valueOf(deaths2.intValue())) == null) {
            str6 = "-";
        }
        textView4.setText(bf3.k(str4, " / ", str5, " / ", str6));
        sq5Var4.g.setText("K - D");
        Integer kdDiff = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getKdDiff();
        String str11 = (kdDiff != null ? kdDiff.intValue() : 0) > 0 ? "+" : null;
        if (str11 == null) {
            str11 = "";
        }
        Integer kdDiff2 = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getKdDiff();
        if (kdDiff2 == null || (str7 = String.valueOf(kdDiff2.intValue())) == null) {
            str7 = "-";
        }
        textView2.setText(str11.concat(str7));
        Integer kdDiff3 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getKdDiff();
        String str12 = (kdDiff3 != null ? kdDiff3.intValue() : 0) > 0 ? "+" : null;
        String str13 = str12 != null ? str12 : "";
        Integer kdDiff4 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getKdDiff();
        if (kdDiff4 == null || (str8 = String.valueOf(kdDiff4.intValue())) == null) {
            str8 = "-";
        }
        textView.setText(str13.concat(str8));
        Integer kdDiff5 = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getKdDiff();
        int intValue = kdDiff5 != null ? kdDiff5.intValue() : 0;
        int i4 = this.f;
        int i5 = this.d;
        int i6 = this.e;
        if (intValue > 0) {
            i3 = i6;
        } else {
            Integer kdDiff6 = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getKdDiff();
            i3 = (kdDiff6 != null ? kdDiff6.intValue() : 0) < 0 ? i5 : i4;
        }
        textView2.setTextColor(i3);
        Integer kdDiff7 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getKdDiff();
        if ((kdDiff7 != null ? kdDiff7.intValue() : 0) > 0) {
            i4 = i6;
        } else {
            Integer kdDiff8 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getKdDiff();
            if ((kdDiff8 != null ? kdDiff8.intValue() : 0) < 0) {
                i4 = i5;
            }
        }
        textView.setTextColor(i4);
        sq5Var2.g.setText("ADR");
        TextView textView5 = sq5Var2.d;
        Double adr = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getAdr();
        if (adr == null || (str9 = String.valueOf(adr.doubleValue())) == null) {
            str9 = "-";
        }
        textView5.setText(str9);
        TextView textView6 = sq5Var2.f;
        Double adr2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getAdr();
        if (adr2 != null && (valueOf = String.valueOf(adr2.doubleValue())) != null) {
            str10 = valueOf;
        }
        textView6.setText(str10);
        View view = this.itemView;
        view.getClass();
        sea.v(view, false, eSportsGamePlayerStatisticsRowData.getHideDivider(), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        ConstraintLayout constraintLayout = tq5Var.c;
        constraintLayout.getClass();
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), eSportsGamePlayerStatisticsRowData.getHideDivider() ? ao2.s(12, this.b) : 0);
    }
}
