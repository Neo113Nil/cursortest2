package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatisticsRowData;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mb4 extends c8 {
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0238, code lost:
    
        if (r1 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x025c, code lost:
    
        if (r4 == null) goto L100;
     */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        String str;
        ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Unit unit;
        String valueOf;
        String valueOf2;
        ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData2 = (ESportsGamePlayerStatisticsRowData) obj;
        eSportsGamePlayerStatisticsRowData2.getClass();
        super.e(eSportsGamePlayerStatisticsRowData2);
        tq5 tq5Var = (tq5) this.c;
        TextView textView = tq5Var.e;
        sq5 sq5Var = tq5Var.q;
        sq5 sq5Var2 = tq5Var.p;
        sq5 sq5Var3 = tq5Var.o;
        sq5 sq5Var4 = tq5Var.r;
        TextView textView2 = sq5Var4.f;
        TextView textView3 = sq5Var4.d;
        ImageView imageView = sq5Var4.e;
        ImageView imageView2 = sq5Var4.c;
        textView.setVisibility(8);
        tq5Var.j.setVisibility(8);
        sq5 sq5Var5 = tq5Var.n;
        sq5Var5.g.setText("K/D/A");
        TextView textView4 = sq5Var5.d;
        Integer kills = eSportsGamePlayerStatisticsRowData2.getFirstTeamData().getKills();
        if (kills == null || (str = String.valueOf(kills.intValue())) == null) {
            str = "-";
        }
        Integer deaths = eSportsGamePlayerStatisticsRowData2.getFirstTeamData().getDeaths();
        String str14 = (deaths == null || (valueOf2 = String.valueOf(deaths.intValue())) == null) ? "-" : valueOf2;
        Integer assists = eSportsGamePlayerStatisticsRowData2.getFirstTeamData().getAssists();
        if (assists == null || (valueOf = String.valueOf(assists.intValue())) == null) {
            eSportsGamePlayerStatisticsRowData = eSportsGamePlayerStatisticsRowData2;
            str2 = "-";
        } else {
            eSportsGamePlayerStatisticsRowData = eSportsGamePlayerStatisticsRowData2;
            str2 = valueOf;
        }
        textView4.setText(bf3.k(str, " / ", str14, " / ", str2));
        TextView textView5 = sq5Var5.f;
        Integer kills2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getKills();
        if (kills2 == null || (str3 = String.valueOf(kills2.intValue())) == null) {
            str3 = "-";
        }
        Integer deaths2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getDeaths();
        if (deaths2 == null || (str4 = String.valueOf(deaths2.intValue())) == null) {
            str4 = "-";
        }
        Integer assists2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getAssists();
        if (assists2 == null || (str5 = String.valueOf(assists2.intValue())) == null) {
            str5 = "-";
        }
        textView5.setText(bf3.k(str3, " / ", str4, " / ", str5));
        sq5Var3.g.setText("LH/DN");
        TextView textView6 = sq5Var3.d;
        Integer lastHits = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getLastHits();
        if (lastHits == null || (str6 = String.valueOf(lastHits.intValue())) == null) {
            str6 = "-";
        }
        Integer denies = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getDenies();
        if (denies == null || (str7 = String.valueOf(denies.intValue())) == null) {
            str7 = "-";
        }
        textView6.setText(str6 + " / " + str7);
        TextView textView7 = sq5Var3.f;
        Integer lastHits2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getLastHits();
        if (lastHits2 == null || (str8 = String.valueOf(lastHits2.intValue())) == null) {
            str8 = "-";
        }
        Integer denies2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getDenies();
        if (denies2 == null || (str9 = String.valueOf(denies2.intValue())) == null) {
            str9 = "-";
        }
        textView7.setText(str8 + " / " + str9);
        sq5Var2.g.setText("G/Min");
        TextView textView8 = sq5Var2.d;
        Integer goldPerMin = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getGoldPerMin();
        if (goldPerMin == null || (str10 = String.valueOf(goldPerMin.intValue())) == null) {
            str10 = "-";
        }
        textView8.setText(str10);
        TextView textView9 = sq5Var2.f;
        Integer goldPerMin2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getGoldPerMin();
        if (goldPerMin2 == null || (str11 = String.valueOf(goldPerMin2.intValue())) == null) {
            str11 = "-";
        }
        textView9.setText(str11);
        sq5Var.g.setText("XP/Min");
        TextView textView10 = sq5Var.d;
        Integer xpPerMin = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getXpPerMin();
        if (xpPerMin == null || (str12 = String.valueOf(xpPerMin.intValue())) == null) {
            str12 = "-";
        }
        textView10.setText(str12);
        TextView textView11 = sq5Var.f;
        Integer xpPerMin2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getXpPerMin();
        if (xpPerMin2 == null || (str13 = String.valueOf(xpPerMin2.intValue())) == null) {
            str13 = "-";
        }
        textView11.setText(str13);
        String role = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getRole();
        if (role == null) {
            role = eSportsGamePlayerStatisticsRowData.getFirstTeamData().getPlayer().getPosition();
        }
        String role2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getRole();
        if (role2 == null) {
            role2 = eSportsGamePlayerStatisticsRowData.getSecondTeamData().getPlayer().getPosition();
        }
        TextView textView12 = sq5Var4.g;
        Context context = this.b;
        textView12.setText(context.getString(R.string.position));
        int color = context.getColor(R.color.n_lv_1);
        Unit unit2 = null;
        if (role != null) {
            Drawable a = gg5.a(context, 1570, role);
            if (a != null) {
                textView3.setText("");
                imageView2.setVisibility(0);
                imageView2.setImageTintList(ColorStateList.valueOf(color));
                imageView2.setImageDrawable(a);
                unit = Unit.a;
            } else {
                unit = null;
            }
        }
        textView3.setText("-");
        imageView2.setVisibility(8);
        if (role2 != null) {
            Drawable a2 = gg5.a(context, 1570, role2);
            if (a2 != null) {
                textView2.setText("");
                imageView.setVisibility(0);
                imageView.setImageTintList(ColorStateList.valueOf(color));
                imageView.setImageDrawable(a2);
                unit2 = Unit.a;
            }
        }
        textView2.setText("-");
        imageView.setVisibility(8);
        View view = this.itemView;
        view.getClass();
        sea.v(view, false, eSportsGamePlayerStatisticsRowData.getHideDivider(), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        ConstraintLayout constraintLayout = tq5Var.c;
        constraintLayout.getClass();
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), eSportsGamePlayerStatisticsRowData.getHideDivider() ? ao2.s(12, context) : 0);
    }
}
