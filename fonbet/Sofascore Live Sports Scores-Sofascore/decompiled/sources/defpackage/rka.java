package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatisticsRowData;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rka extends c8 {
    public final Drawable d;
    public final Drawable e;

    public rka(tq5 tq5Var) {
        super(tq5Var);
        Drawable drawable;
        Drawable drawable2 = this.b.getDrawable(R.drawable.ic_advantage_arrow_left_8);
        Drawable drawable3 = null;
        if (drawable2 != null) {
            drawable = drawable2.mutate();
            drawable.setAutoMirrored(true);
        } else {
            drawable = null;
        }
        this.d = drawable;
        Drawable drawable4 = this.b.getDrawable(R.drawable.ic_advantage_arrow_right_8);
        if (drawable4 != null) {
            drawable3 = drawable4.mutate();
            drawable3.setAutoMirrored(true);
        }
        this.e = drawable3;
    }

    public static String g(Integer num) {
        return uxf.E(yid.k(Double.valueOf(num.intValue())), 30, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x025c, code lost:
    
        if (r1 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027f, code lost:
    
        if (r1 == null) goto L83;
     */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        String str;
        tq5 tq5Var;
        String str2;
        TextView textView;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ImageView imageView;
        int i3;
        Unit unit;
        Unit unit2;
        String valueOf;
        String valueOf2;
        ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData = (ESportsGamePlayerStatisticsRowData) obj;
        Integer valueOf3 = Integer.valueOf(R.drawable.ic_gold_16);
        Integer valueOf4 = Integer.valueOf(R.drawable.ic_cs_16);
        Integer valueOf5 = Integer.valueOf(R.drawable.ic_kda_16);
        eSportsGamePlayerStatisticsRowData.getClass();
        super.e(eSportsGamePlayerStatisticsRowData);
        tq5 tq5Var2 = (tq5) this.c;
        tq5Var2.r.a.setVisibility(8);
        sq5 sq5Var = tq5Var2.n;
        sq5 sq5Var2 = tq5Var2.o;
        sq5 sq5Var3 = tq5Var2.p;
        TextView textView2 = sq5Var3.b;
        sq5 sq5Var4 = tq5Var2.q;
        TextView textView3 = sq5Var4.f;
        TextView textView4 = sq5Var4.d;
        ImageView imageView2 = sq5Var4.e;
        ImageView imageView3 = sq5Var4.c;
        for (Iterator it = b.j(sq5Var, sq5Var2, sq5Var3, sq5Var4).iterator(); it.hasNext(); it = it) {
            ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData2 = eSportsGamePlayerStatisticsRowData;
            sq5 sq5Var5 = (sq5) it.next();
            sq5Var5.e.setVisibility(0);
            sq5Var5.c.setVisibility(0);
            eSportsGamePlayerStatisticsRowData = eSportsGamePlayerStatisticsRowData2;
        }
        ESportsGamePlayerStatisticsRowData eSportsGamePlayerStatisticsRowData3 = eSportsGamePlayerStatisticsRowData;
        TextView textView5 = sq5Var.d;
        Integer kills = eSportsGamePlayerStatisticsRowData3.getFirstTeamData().getKills();
        if (kills == null || (str = String.valueOf(kills.intValue())) == null) {
            str = "-";
        }
        Integer deaths = eSportsGamePlayerStatisticsRowData3.getFirstTeamData().getDeaths();
        if (deaths == null || (valueOf2 = String.valueOf(deaths.intValue())) == null) {
            tq5Var = tq5Var2;
            str2 = "-";
        } else {
            tq5Var = tq5Var2;
            str2 = valueOf2;
        }
        Integer assists = eSportsGamePlayerStatisticsRowData3.getFirstTeamData().getAssists();
        if (assists == null || (valueOf = String.valueOf(assists.intValue())) == null) {
            textView = textView2;
            str3 = "-";
        } else {
            textView = textView2;
            str3 = valueOf;
        }
        textView5.setText(bf3.k(str, " / ", str2, " / ", str3));
        TextView textView6 = sq5Var.f;
        Integer kills2 = eSportsGamePlayerStatisticsRowData3.getSecondTeamData().getKills();
        if (kills2 == null || (str4 = String.valueOf(kills2.intValue())) == null) {
            str4 = "-";
        }
        Integer deaths2 = eSportsGamePlayerStatisticsRowData3.getSecondTeamData().getDeaths();
        if (deaths2 == null || (str5 = String.valueOf(deaths2.intValue())) == null) {
            str5 = "-";
        }
        Integer assists2 = eSportsGamePlayerStatisticsRowData3.getSecondTeamData().getAssists();
        if (assists2 == null || (str6 = String.valueOf(assists2.intValue())) == null) {
            str6 = "-";
        }
        textView6.setText(bf3.k(str4, " / ", str5, " / ", str6));
        ImageView imageView4 = sq5Var.c;
        apf a = ajh.a(imageView4.getContext());
        ht9 ht9Var = new ht9(imageView4.getContext());
        ht9Var.c = valueOf5;
        fc6.w(ht9Var, imageView4, a);
        ImageView imageView5 = sq5Var.e;
        apf a2 = ajh.a(imageView5.getContext());
        ht9 ht9Var2 = new ht9(imageView5.getContext());
        ht9Var2.c = valueOf5;
        fc6.w(ht9Var2, imageView5, a2);
        TextView textView7 = sq5Var2.d;
        Integer minionsKilled = eSportsGamePlayerStatisticsRowData3.getFirstTeamData().getMinionsKilled();
        if (minionsKilled == null || (str7 = String.valueOf(minionsKilled.intValue())) == null) {
            str7 = "-";
        }
        textView7.setText(str7);
        TextView textView8 = sq5Var2.f;
        Integer minionsKilled2 = eSportsGamePlayerStatisticsRowData3.getSecondTeamData().getMinionsKilled();
        if (minionsKilled2 == null || (str8 = String.valueOf(minionsKilled2.intValue())) == null) {
            str8 = "-";
        }
        textView8.setText(str8);
        ImageView imageView6 = sq5Var2.c;
        apf a3 = ajh.a(imageView6.getContext());
        ht9 ht9Var3 = new ht9(imageView6.getContext());
        ht9Var3.c = valueOf4;
        fc6.w(ht9Var3, imageView6, a3);
        ImageView imageView7 = sq5Var2.e;
        apf a4 = ajh.a(imageView7.getContext());
        ht9 ht9Var4 = new ht9(imageView7.getContext());
        ht9Var4.c = valueOf4;
        fc6.w(ht9Var4, imageView7, a4);
        TextView textView9 = sq5Var3.d;
        Integer goldEarned = eSportsGamePlayerStatisticsRowData3.getFirstTeamData().getGoldEarned();
        textView9.setText(goldEarned != null ? g(goldEarned) : "-");
        TextView textView10 = sq5Var3.f;
        Integer goldEarned2 = eSportsGamePlayerStatisticsRowData3.getSecondTeamData().getGoldEarned();
        textView10.setText(goldEarned2 != null ? g(goldEarned2) : "-");
        ImageView imageView8 = sq5Var3.c;
        apf a5 = ajh.a(imageView8.getContext());
        ht9 ht9Var5 = new ht9(imageView8.getContext());
        ht9Var5.c = valueOf3;
        fc6.w(ht9Var5, imageView8, a5);
        ImageView imageView9 = sq5Var3.e;
        apf a6 = ajh.a(imageView9.getContext());
        ht9 ht9Var6 = new ht9(imageView9.getContext());
        ht9Var6.c = valueOf3;
        vt9.f(ht9Var6, imageView9);
        a6.a(ht9Var6.a());
        String role = eSportsGamePlayerStatisticsRowData3.getFirstTeamData().getRole();
        if (role == null) {
            role = eSportsGamePlayerStatisticsRowData3.getFirstTeamData().getPlayer().getPosition();
        }
        String role2 = eSportsGamePlayerStatisticsRowData3.getSecondTeamData().getRole();
        if (role2 == null) {
            role2 = eSportsGamePlayerStatisticsRowData3.getSecondTeamData().getPlayer().getPosition();
        }
        Context context = this.b;
        if (role != null) {
            Drawable a7 = gg5.a(context, 1571, role);
            if (a7 != null) {
                textView4.setText("");
                imageView3.setImageTintList(null);
                imageView3.setImageDrawable(a7);
                unit2 = Unit.a;
            } else {
                unit2 = null;
            }
        }
        textView4.setText("-");
        imageView3.setVisibility(8);
        if (role2 != null) {
            Drawable a8 = gg5.a(context, 1571, role2);
            if (a8 != null) {
                textView3.setText("");
                imageView = imageView2;
                imageView.setImageTintList(null);
                imageView.setImageDrawable(a8);
                unit = Unit.a;
            } else {
                imageView = imageView2;
                unit = null;
            }
        } else {
            imageView = imageView2;
        }
        textView3.setText("-");
        imageView.setVisibility(8);
        Integer goldEarned3 = eSportsGamePlayerStatisticsRowData3.getFirstTeamData().getGoldEarned();
        int intValue = goldEarned3 != null ? goldEarned3.intValue() : 0;
        Integer goldEarned4 = eSportsGamePlayerStatisticsRowData3.getSecondTeamData().getGoldEarned();
        int intValue2 = intValue - (goldEarned4 != null ? goldEarned4.intValue() : 0);
        if (!eSportsGamePlayerStatisticsRowData3.getAreRolesMatched() || intValue2 == 0) {
            i3 = 0;
            textView.setVisibility(8);
        } else {
            Integer firstTeamColor = intValue2 > 0 ? eSportsGamePlayerStatisticsRowData3.getFirstTeamColor() : eSportsGamePlayerStatisticsRowData3.getSecondTeamColor();
            int intValue3 = firstTeamColor != null ? firstTeamColor.intValue() : context.getColor(R.color.n_lv_1);
            TextView textView11 = textView;
            i3 = 0;
            textView11.setVisibility(0);
            textView11.setText(g(Integer.valueOf(Math.abs(intValue2))));
            textView11.getBackground().mutate().setTint(intValue3);
            textView11.setTextColor(intValue3);
            if (intValue2 > 0) {
                Drawable drawable = this.d;
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                v9g.K(mutate, intValue3);
                textView11.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                Drawable drawable2 = this.e;
                Drawable mutate2 = drawable2 != null ? drawable2.mutate() : null;
                v9g.K(mutate2, intValue3);
                Unit unit3 = Unit.a;
                textView11.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate2, (Drawable) null);
            }
        }
        View view = this.itemView;
        view.getClass();
        sea.v(view, false, eSportsGamePlayerStatisticsRowData3.getHideDivider(), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        ConstraintLayout constraintLayout = tq5Var.c;
        constraintLayout.getClass();
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), eSportsGamePlayerStatisticsRowData3.getHideDivider() ? ao2.s(12, context) : i3);
    }
}
