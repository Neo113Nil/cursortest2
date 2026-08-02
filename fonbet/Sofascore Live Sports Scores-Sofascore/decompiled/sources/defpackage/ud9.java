package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyFaceOffZone;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncidentType;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeySuspension;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ud9 extends sd9 {
    public final /* synthetic */ int h = 1;
    public final Function2 i;
    public final krk j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ud9(js2 js2Var, g16 g16Var, Event event, sl6 sl6Var) {
        super(r0, event, sl6Var);
        g16Var.getClass();
        event.getClass();
        sl6Var.getClass();
        LinearLayout linearLayout = (LinearLayout) js2Var.i;
        linearLayout.getClass();
        this.j = js2Var;
        this.i = g16Var;
        ((TextView) js2Var.m).setVisibility(8);
        ((ImageView) js2Var.f).setVisibility(8);
        ((ImageView) js2Var.h).setVisibility(0);
        js2Var.d.setTextColor(this.b.getColor(R.color.n_lv_1));
        ((TextView) js2Var.j).setTextColor(this.b.getColor(R.color.n_lv_1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0228, code lost:
    
        if (r4 == null) goto L115;
     */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        List j;
        String str;
        Unit unit;
        Object obj2;
        String str2;
        int i3 = this.h;
        krk krkVar = this.j;
        Context context = this.b;
        switch (i3) {
            case 0:
                String str3 = null;
                HockeyIncident hockeyIncident = (HockeyIncident) obj;
                hockeyIncident.getClass();
                super.g(hockeyIncident);
                v82 v82Var = (v82) krkVar;
                TextView textView = (TextView) v82Var.e;
                ImageView imageView = (ImageView) v82Var.f;
                TextView textView2 = (TextView) v82Var.c;
                textView.setText(hockeyIncident.getText());
                ((TextView) v82Var.g).setText(e(hockeyIncident));
                ((ImageView) v82Var.d).setVisibility(8);
                MaterialCardView materialCardView = (MaterialCardView) v82Var.h;
                materialCardView.setEnabled(hockeyIncident.getPlayer() != null);
                if (hockeyIncident.getPlayer() != null && hockeyIncident.getType() != HockeyIncidentType.STOPPAGE) {
                    int i4 = td9.a[hockeyIncident.getType().ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        j = b.j(new ge9(hockeyIncident.getPlayer(), hockeyIncident.getIsHome()), new ge9(hockeyIncident.getPlayerIn(), hockeyIncident.getIsHome() != null ? Boolean.valueOf(!r14.booleanValue()) : null));
                    } else if (i4 != 3) {
                        j = a.c(new ge9(hockeyIncident.getPlayer(), hockeyIncident.getIsHome()));
                    } else {
                        j = b.j(new ge9(hockeyIncident.getPlayer(), hockeyIncident.getIsHome()), new ge9(hockeyIncident.getGoalkeeper(), hockeyIncident.getIsHome() != null ? Boolean.valueOf(!r14.booleanValue()) : null));
                    }
                    materialCardView.setOnClickListener(new au7(9, this, j));
                }
                Team team = this.e;
                imageView.setVisibility((team != null ? Integer.valueOf(team.getId()) : null) != null ? 0 : 8);
                Team team2 = this.e;
                if ((team2 != null ? Integer.valueOf(team2.getId()) : null) != null) {
                    Team team3 = this.e;
                    as9.o(imageView, team3 != null ? team3.getId() : 0);
                }
                textView2.setVisibility((hockeyIncident.getType() != HockeyIncidentType.FACEOFF || hockeyIncident.getFaceoffZone() == null) ? 8 : 0);
                if (textView2.getVisibility() == 0) {
                    HockeyFaceOffZone faceoffZone = hockeyIncident.getFaceoffZone();
                    int i5 = faceoffZone == null ? -1 : td9.b[faceoffZone.ordinal()];
                    if (i5 == 1) {
                        str3 = context.getString(R.string.hockey_pbp_zone_offensive);
                    } else if (i5 == 2) {
                        str3 = context.getString(R.string.hockey_pbp_zone_defensive);
                    } else if (i5 == 3) {
                        str3 = context.getString(R.string.hockey_pbp_zone_neutral);
                    }
                    textView2.setText(str3);
                    break;
                }
                break;
            default:
                HockeyIncident hockeyIncident2 = (HockeyIncident) obj;
                hockeyIncident2.getClass();
                super.g(hockeyIncident2);
                js2 js2Var = (js2) krkVar;
                ImageView imageView2 = (ImageView) js2Var.h;
                MaterialCardView materialCardView2 = (MaterialCardView) js2Var.l;
                TextView textView3 = (TextView) js2Var.k;
                TextView textView4 = js2Var.d;
                ImageView imageView3 = (ImageView) js2Var.c;
                TextView textView5 = (TextView) js2Var.j;
                ImageView imageView4 = (ImageView) js2Var.b;
                Team team4 = this.e;
                as9.o(imageView2, team4 != null ? team4.getId() : 0);
                TextView textView6 = (TextView) js2Var.o;
                HockeySuspension suspensionInfo = hockeyIncident2.getSuspensionInfo();
                if (suspensionInfo != null) {
                    Integer penaltyDuration = hockeyIncident2.getPenaltyDuration();
                    q1f q1fVar = tp9.c;
                    String severity = suspensionInfo.getSeverity();
                    q1fVar.getClass();
                    severity.getClass();
                    Iterator<E> it = tp9.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((tp9) obj2).a.equals(severity)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    tp9 tp9Var = (tp9) obj2;
                    Integer num = tp9Var != null ? tp9Var.b : null;
                    if (num != null) {
                        int intValue = num.intValue();
                        context.getClass();
                        str2 = context.getString(intValue);
                        str2.getClass();
                    } else {
                        str2 = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (str2 != null) {
                        if ((!Intrinsics.c(suspensionInfo.getKey(), "misconduct_10min") ? str2 : null) != null) {
                            sb.append(str2);
                            sb.append(": ");
                        }
                    }
                    sb.append(suspensionInfo.getDescription());
                    if (penaltyDuration != null) {
                        if (penaltyDuration.intValue() <= 0) {
                            penaltyDuration = null;
                        }
                        if (penaltyDuration != null) {
                            int intValue2 = penaltyDuration.intValue();
                            sb.append(" | ");
                            sb.append(intValue2 + "'");
                        }
                    }
                    str = sb.toString();
                } else {
                    str = "Suspension";
                }
                textView6.setText(str);
                ((ImageView) js2Var.e).setImageDrawable(context.getDrawable(R.drawable.ic_hockey_penalty_box));
                ((TextView) js2Var.n).setText(e(hockeyIncident2));
                textView5.setVisibility(hockeyIncident2.getPenalizedPlayer() != null ? 0 : 8);
                imageView3.setVisibility(hockeyIncident2.getPenalizedPlayer() != null ? 0 : 8);
                materialCardView2.setEnabled((hockeyIncident2.getPenalizedPlayer() == null && hockeyIncident2.getPenaltyServedByPlayer() == null && hockeyIncident2.getPenaltyDrawnByPlayer() == null) ? false : true);
                if (hockeyIncident2.getPenalizedPlayer() != null || hockeyIncident2.getPenaltyServedByPlayer() != null || hockeyIncident2.getPenaltyDrawnByPlayer() != null) {
                    materialCardView2.setOnClickListener(new qh(21, this, js2Var, hockeyIncident2));
                }
                textView4.setVisibility((hockeyIncident2.getPenalizedPlayer() == null && hockeyIncident2.getPenaltyServedByPlayer() == null) ? 8 : 0);
                imageView4.setVisibility((hockeyIncident2.getPenalizedPlayer() == null && hockeyIncident2.getPenaltyServedByPlayer() == null) ? 8 : 0);
                textView5.setVisibility((hockeyIncident2.getPenalizedPlayer() == null || hockeyIncident2.getPenaltyServedByPlayer() == null) ? 8 : 0);
                imageView3.setVisibility((hockeyIncident2.getPenalizedPlayer() == null || hockeyIncident2.getPenaltyServedByPlayer() == null) ? 8 : 0);
                ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (hockeyIncident2.getPenalizedPlayer() == null || hockeyIncident2.getPenaltyServedByPlayer() == null) ? ao2.s(4, context) : ao2.s(12, context);
                    textView3.setLayoutParams(marginLayoutParams);
                    ViewGroup.LayoutParams layoutParams2 = imageView4.getLayoutParams();
                    if (layoutParams2 == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = (hockeyIncident2.getPenalizedPlayer() == null || hockeyIncident2.getPenaltyServedByPlayer() == null) ? ao2.s(4, context) : ao2.s(8, context);
                        imageView4.setLayoutParams(marginLayoutParams2);
                        Player penalizedPlayer = hockeyIncident2.getPenalizedPlayer();
                        if (penalizedPlayer != null) {
                            textView4.setText(sd9.d(penalizedPlayer, false));
                            as9.l(imageView4, penalizedPlayer.getId(), null);
                            Player penaltyServedByPlayer = hockeyIncident2.getPenaltyServedByPlayer();
                            if (penaltyServedByPlayer == null) {
                                unit = null;
                                break;
                            } else {
                                textView5.setText(context.getString(R.string.penalty_served_by, sd9.d(penaltyServedByPlayer, false)));
                                as9.l(imageView3, penaltyServedByPlayer.getId(), null);
                                unit = Unit.a;
                                break;
                            }
                        }
                        Player penaltyServedByPlayer2 = hockeyIncident2.getPenaltyServedByPlayer();
                        if (penaltyServedByPlayer2 != null) {
                            textView4.setText(context.getString(R.string.penalty_served_by, sd9.d(penaltyServedByPlayer2, false)));
                            as9.l(imageView4, penaltyServedByPlayer2.getId(), null);
                            Unit unit2 = Unit.a;
                        }
                        Player penaltyDrawnByPlayer = hockeyIncident2.getPenaltyDrawnByPlayer();
                        if (penaltyDrawnByPlayer == null) {
                            textView3.setVisibility(8);
                            break;
                        } else {
                            textView3.setVisibility(0);
                            textView3.setText(context.getString(R.string.penalty_against, sd9.d(penaltyDrawnByPlayer, false)));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.sd9
    public final MaterialCardView f() {
        int i = this.h;
        krk krkVar = this.j;
        switch (i) {
            case 0:
                return (MaterialCardView) ((v82) krkVar).h;
            default:
                return (MaterialCardView) ((js2) krkVar).l;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ud9(v82 v82Var, g16 g16Var, Event event, sl6 sl6Var) {
        super(r0, event, sl6Var);
        g16Var.getClass();
        event.getClass();
        sl6Var.getClass();
        LinearLayout linearLayout = (LinearLayout) v82Var.b;
        linearLayout.getClass();
        this.j = v82Var;
        this.i = g16Var;
    }
}
