package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.RaceDriverResults;
import com.sofascore.results.R;
import java.time.DayOfWeek;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nn3 extends c8 {
    public final /* synthetic */ int d;
    public final bv1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn3(bv1 bv1Var, int i) {
        super(bv1Var);
        this.d = i;
        this.e = bv1Var;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        Stage stage;
        TextView textView;
        RaceDriverResults raceDriverResults;
        RaceDriverResults raceDriverResults2;
        int i3 = this.d;
        bv1 bv1Var = this.e;
        Context context = this.b;
        switch (i3) {
            case 0:
                q7i q7iVar = (q7i) obj;
                q7iVar.getClass();
                ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
                ImageView imageView = (ImageView) bv1Var.e;
                ImageView imageView2 = (ImageView) bv1Var.i;
                TextView textView2 = (TextView) bv1Var.c;
                TextView textView3 = (TextView) bv1Var.h;
                constraintLayout.getClass();
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = i == 0 ? ao2.s(8, context) : ao2.s(4, context);
                    constraintLayout.setLayoutParams(marginLayoutParams);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) bv1Var.j;
                    constraintLayout2.getClass();
                    aba.y(constraintLayout2, 0, 3);
                    Stage stage2 = q7iVar.a;
                    List list = q7iVar.b;
                    f(stage2);
                    textView2.setVisibility(8);
                    imageView2.setVisibility(8);
                    imageView.setVisibility(8);
                    DayOfWeek dayOfWeek = hwc.a;
                    if (!Intrinsics.c(stage2.getStatusType(), StatusKt.STATUS_CANCELED)) {
                        if (hwc.f(stage2)) {
                            if (list != null && !list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (((RaceDriverResults) it.next()).getPosition() != null) {
                                    }
                                }
                            }
                            haa.B(textView3);
                            textView3.setText(context.getString(R.string.in_progress));
                            break;
                        }
                        if (list == null || (raceDriverResults2 = (RaceDriverResults) CollectionsKt.a0(0, list)) == null) {
                            stage = stage2;
                            textView = textView3;
                        } else {
                            textView2.setVisibility(0);
                            stage = stage2;
                            textView = textView3;
                            h(stage, raceDriverResults2.getTeam(), raceDriverResults2.getPosition(), textView2, imageView2);
                        }
                        if (list != null && (raceDriverResults = (RaceDriverResults) CollectionsKt.a0(1, list)) != null) {
                            textView.setVisibility(0);
                            h(stage, raceDriverResults.getTeam(), raceDriverResults.getPosition(), textView, imageView);
                            break;
                        }
                    } else {
                        haa.A(textView3);
                        textView3.setText(R.string.canceled);
                        break;
                    }
                }
                break;
            default:
                r7i r7iVar = (r7i) obj;
                r7iVar.getClass();
                ConstraintLayout constraintLayout3 = (ConstraintLayout) bv1Var.b;
                ImageView imageView3 = (ImageView) bv1Var.e;
                TextView textView4 = (TextView) bv1Var.h;
                constraintLayout3.getClass();
                ViewGroup.LayoutParams layoutParams2 = constraintLayout3.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = i == 0 ? ao2.s(8, context) : ao2.s(4, context);
                    constraintLayout3.setLayoutParams(marginLayoutParams2);
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) bv1Var.j;
                    constraintLayout4.getClass();
                    aba.y(constraintLayout4, 0, 3);
                    Stage stage3 = r7iVar.a;
                    ub5 ub5Var = r7iVar.b;
                    f(stage3);
                    textView4.setVisibility(0);
                    imageView3.setVisibility(8);
                    DayOfWeek dayOfWeek2 = hwc.a;
                    if (!Intrinsics.c(stage3.getStatusType(), StatusKt.STATUS_CANCELED)) {
                        if (!(ub5Var instanceof rb5)) {
                            if (!(ub5Var instanceof pb5)) {
                                if (!(ub5Var instanceof qb5)) {
                                    if (!hwc.f(stage3)) {
                                        if (!(ub5Var instanceof sb5)) {
                                            textView4.setText("");
                                            break;
                                        } else {
                                            int i4 = ((sb5) ub5Var).a;
                                            if (i4 != 1) {
                                                haa.C(textView4);
                                                textView4.setText(context.getString(R.string.motorsport_driver_final_placement, String.valueOf(i4)));
                                                break;
                                            } else {
                                                imageView3.setVisibility(0);
                                                textView4.setTextColor(textView4.getContext().getColor(R.color.value));
                                                textView4.setText(context.getString(R.string.winner));
                                                break;
                                            }
                                        }
                                    } else if (!(ub5Var instanceof sb5)) {
                                        haa.B(textView4);
                                        textView4.setText(context.getString(R.string.in_progress));
                                        break;
                                    } else {
                                        haa.B(textView4);
                                        textView4.setText(context.getString(R.string.live_position_template, Integer.valueOf(((sb5) ub5Var).a)));
                                        break;
                                    }
                                } else {
                                    g(R.string.dns);
                                    break;
                                }
                            } else {
                                g(R.string.dnf);
                                break;
                            }
                        } else {
                            g(R.string.motorsport_disqualification_short);
                            break;
                        }
                    } else {
                        haa.A(textView4);
                        textView4.setText(R.string.canceled);
                        break;
                    }
                }
        }
    }

    public void g(int i) {
        TextView textView = (TextView) this.e.h;
        haa.C(textView);
        textView.setText(this.b.getString(i));
    }

    public void h(Stage stage, Team team, Integer num, TextView textView, ImageView imageView) {
        DayOfWeek dayOfWeek = hwc.a;
        boolean f = hwc.f(stage);
        Context context = this.b;
        if (f) {
            if (num != null) {
                if ((num.intValue() != 0 ? num : null) != null) {
                    haa.B(textView);
                    textView.setText(team.getNameCode() + ": " + num);
                    return;
                }
            }
            haa.D(textView);
            textView.setText(team.getNameCode() + ": " + context.getString(R.string.dnf));
            return;
        }
        textView.setText(team.getNameCode() + ": " + (num == null ? "-" : num));
        if (num == null) {
            haa.D(textView);
            return;
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            z8e.V(context.getColor(R.color.value), imageView);
            textView.setTextColor(textView.getContext().getColor(R.color.value));
            imageView.setVisibility(0);
            return;
        }
        if (2 <= intValue && intValue < 4) {
            z8e.V(context.getColor(R.color.n_lv_3), imageView);
            haa.D(textView);
            imageView.setVisibility(0);
            return;
        }
        haa.D(textView);
        if (intValue == 0) {
            textView.setText(team.getNameCode() + ": " + context.getString(R.string.dnf));
        }
    }
}
