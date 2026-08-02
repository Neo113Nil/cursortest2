package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.ESportsEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.network.response.bettingtips.EventStreak;
import com.sofascore.model.newNetwork.CareerHistory;
import com.sofascore.model.newNetwork.ManagerPerformance;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.EventListScoreTextView;
import com.sofascore.results.view.InformationView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class wh extends p8 {
    public final /* synthetic */ int c = 9;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(View view) {
        super(view);
        view.getClass();
        int i = R.id.card_container;
        if (((LinearLayout) nq8.B(R.id.card_container, view)) != null) {
            i = R.id.check_box_first;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) nq8.B(R.id.check_box_first, view);
            if (materialCheckBox != null) {
                i = R.id.check_box_second;
                MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) nq8.B(R.id.check_box_second, view);
                if (materialCheckBox2 != null) {
                    this.d = new dd((FrameLayout) view, materialCheckBox, materialCheckBox2, 5);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3;
        boolean z;
        TextView textView;
        String string;
        int i4 = this.c;
        Context context = this.b;
        Object obj2 = this.d;
        switch (i4) {
            case 0:
                r9k r9kVar = (r9k) obj;
                r9kVar.getClass();
                TextView textView2 = ((u22) obj2).b;
                textView2.setText(r9kVar.b(context));
                sea.v(textView2, true, false, 0, 8, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                break;
            case 1:
                iei ieiVar = (iei) obj;
                ieiVar.getClass();
                dk2 dk2Var = (dk2) obj2;
                LinearLayout linearLayout = dk2Var.b;
                linearLayout.getClass();
                aba.G(linearLayout);
                dk2Var.c.setText(ieiVar.a);
                linearLayout.getClass();
                sea.v(linearLayout, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 2:
                ds1 ds1Var = (ds1) obj;
                ds1Var.getClass();
                InformationView informationView = (InformationView) ((ed) obj2).c;
                InformationView.o(informationView, context.getString(ds1Var.a));
                informationView.setBackgroundColor(context.getColor(R.color.surface_1));
                informationView.p(true, false);
                break;
            case 3:
                it1 it1Var = (it1) obj;
                it1Var.getClass();
                nr1 nr1Var = (nr1) obj2;
                ((TextView) nr1Var.e).setText("Extra: " + it1Var.a);
                ((TextView) nr1Var.i).setText("W: " + it1Var.b);
                ((TextView) nr1Var.g).setText("N: " + it1Var.c);
                nr1Var.b.setText("B: " + it1Var.d);
                ((TextView) nr1Var.f).setText("LB: " + it1Var.e);
                ((TextView) nr1Var.h).setText("P: " + it1Var.f);
                View view = this.itemView;
                view.getClass();
                sea.v(view, false, it1Var.g, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                LinearLayout linearLayout2 = (LinearLayout) nr1Var.d;
                linearLayout2.getClass();
                if (it1Var.g) {
                    Context context2 = linearLayout2.getContext();
                    context2.getClass();
                    i3 = ao2.s(8, context2);
                } else {
                    i3 = 0;
                }
                linearLayout2.setPaddingRelative(linearLayout2.getPaddingStart(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingEnd(), i3);
                break;
            case 4:
                pt1 pt1Var = (pt1) obj;
                pt1Var.getClass();
                int i5 = pt1Var.a;
                int i6 = pt1Var.b;
                double d = pt1Var.c;
                StringBuilder s = lnb.s(i5, i6, "Total: ", "/", " (");
                s.append(d);
                s.append(")");
                String sb = s.toString();
                TextView textView3 = ((mt1) obj2).c;
                textView3.setText(sb);
                View view2 = this.itemView;
                view2.getClass();
                sea.v(view2, false, pt1Var.d, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                if (!pt1Var.d) {
                    textView3.setPaddingRelative(textView3.getPaddingStart(), textView3.getPaddingTop(), textView3.getPaddingEnd(), 0);
                    textView3.setMinimumHeight(ao2.s(32, context));
                    break;
                } else {
                    textView3.setPaddingRelative(textView3.getPaddingStart(), textView3.getPaddingTop(), textView3.getPaddingEnd(), ao2.s(8, context));
                    textView3.setMinimumHeight(ao2.s(40, context));
                    break;
                }
            case 5:
                b22 b22Var = (b22) obj;
                b22Var.getClass();
                t22 t22Var = (t22) obj2;
                t22Var.d.setText(b22Var.a.b(context));
                t22Var.c.setText(b22Var.b.b(context));
                break;
            case 6:
                c22 c22Var = (c22) obj;
                c22Var.getClass();
                ((u22) obj2).b.setText(c22Var.a);
                break;
            case 7:
                obj.getClass();
                boolean d2 = d(i, i2, obj);
                FrameLayout frameLayout = (FrameLayout) ((ed) obj2).b;
                frameLayout.getClass();
                sea.v(frameLayout, false, d2, 8, 4, 0, null, 112);
                break;
            case 8:
                CareerHistory careerHistory = (CareerHistory) obj;
                careerHistory.getClass();
                bu1 bu1Var = (bu1) obj2;
                TextView textView4 = (TextView) bu1Var.i;
                TextView textView5 = (TextView) bu1Var.j;
                Team team = careerHistory.getTeam();
                ImageView imageView = (ImageView) bu1Var.d;
                if (team != null) {
                    as9.o(imageView, team.getId());
                    textView5.setText(tba.p(context, team));
                } else {
                    String R = pco.R(0);
                    apf a = ajh.a(imageView.getContext());
                    ht9 ht9Var = new ht9(imageView.getContext());
                    ht9Var.c = R;
                    vt9.f(ht9Var, imageView);
                    a.a(ht9Var.a());
                    textView5.setText(context.getString(R.string.transfer_no_team));
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) bu1Var.b;
                TextView textView6 = (TextView) bu1Var.h;
                TextView textView7 = (TextView) bu1Var.g;
                TextView textView8 = (TextView) bu1Var.k;
                TextView textView9 = (TextView) bu1Var.f;
                TextView textView10 = (TextView) bu1Var.e;
                textView4.setText("");
                textView9.setText("");
                textView8.setText("");
                textView7.setText("");
                textView6.setText("");
                ManagerPerformance performance = careerHistory.getPerformance();
                if (performance == null || performance.getTotal() <= 0) {
                    z = true;
                    textView = textView10;
                } else {
                    z = true;
                    textView = textView10;
                    textView4.setText(rei.b(2, Double.valueOf((performance.getDraws() + (performance.getWins() * 3)) / performance.getTotal())));
                    textView9.setText(String.valueOf(performance.getTotal()));
                    textView8.setText(String.valueOf(performance.getWins()));
                    textView7.setText(String.valueOf(performance.getDraws()));
                    textView6.setText(String.valueOf(performance.getLosses()));
                }
                Integer startTimestamp = careerHistory.getStartTimestamp();
                int intValue = startTimestamp != null ? startTimestamp.intValue() : 0;
                Integer endTimestamp = careerHistory.getEndTimestamp();
                int intValue2 = endTimestamp != null ? endTimestamp.intValue() : 0;
                if (intValue > 0) {
                    long j = intValue2;
                    if (1000 * j > System.currentTimeMillis()) {
                        bi4 bi4Var = bi4.PATTERN_MY_SEPARATOR;
                        ConcurrentHashMap concurrentHashMap = hk4.a;
                        fn0.u(intValue, hk4.a(bi4Var.d()), textView);
                    } else {
                        TextView textView11 = textView;
                        if (intValue2 > 0) {
                            long j2 = intValue;
                            bi4 bi4Var2 = bi4.PATTERN_MY_SEPARATOR;
                            ConcurrentHashMap concurrentHashMap2 = hk4.a;
                            textView11.setText(fc6.i(j2, hk4.a(bi4Var2.d())) + " - " + fc6.i(j, hk4.a(bi4Var2.d())));
                        } else {
                            bi4 bi4Var3 = bi4.PATTERN_MY_SEPARATOR;
                            ConcurrentHashMap concurrentHashMap3 = hk4.a;
                            fn0.u(intValue, hk4.a(bi4Var3.d()), textView11);
                        }
                    }
                } else {
                    textView.setText("");
                }
                boolean z2 = i == i2 + (-1) ? z : false;
                SofaDivider sofaDivider = (SofaDivider) bu1Var.c;
                constraintLayout.getClass();
                sea.v(constraintLayout, false, z2, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), z2 ? ao2.s(8, context) : 0);
                sofaDivider.setDividerVisibility(!z2);
                sofaDivider.setVisibility(!z2 ? 0 : 8);
                break;
            case 9:
                xs2 xs2Var = (xs2) obj;
                xs2Var.getClass();
                dd ddVar = (dd) obj2;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) ddVar.c;
                materialCheckBox.setVisibility(0);
                materialCheckBox.setChecked(xs2Var.f);
                materialCheckBox.setText(xs2Var.a);
                materialCheckBox.setOnClickListener(xs2Var.b);
                View.OnClickListener onClickListener = xs2Var.d;
                MaterialCheckBox materialCheckBox2 = (MaterialCheckBox) ddVar.d;
                if (onClickListener != null) {
                    materialCheckBox2.setVisibility(0);
                    materialCheckBox2.setChecked(xs2Var.g);
                    materialCheckBox2.setText(xs2Var.c);
                    materialCheckBox2.setOnClickListener(onClickListener);
                } else {
                    materialCheckBox2.setVisibility(8);
                }
                sea.v((FrameLayout) ddVar.b, false, false, 16, 0, 0, null, 120);
                break;
            case 10:
                d43 d43Var = (d43) obj;
                d43Var.getClass();
                TextView textView12 = ((u22) obj2).b;
                textView12.setText(d43Var.a);
                textView12.setPadding(textView12.getPaddingLeft(), d43Var.b, textView12.getPaddingRight(), textView12.getPaddingBottom());
                break;
            case 11:
                c43 c43Var = (c43) obj;
                c43Var.getClass();
                TextView textView13 = ((u22) obj2).b;
                textView13.setText(c43Var.b);
                textView13.setCompoundDrawablesRelativeWithIntrinsicBounds(c43Var.a, 0, 0, 0);
                break;
            case 12:
                i04 i04Var = (i04) obj;
                i04Var.getClass();
                h04 h04Var = (h04) obj2;
                TextView textView14 = h04Var.d;
                boolean z3 = i04Var.d;
                int i7 = i04Var.b;
                textView14.setText(z3 ? context.getString(R.string.cricket_super_over_ball_number, String.valueOf(i7)) : String.format(Locale.US, "%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(i04Var.a), Integer.valueOf(i7)}, 2)));
                h04Var.c.setText(i04Var.c);
                break;
            case 13:
                f14 f14Var = (f14) obj;
                f14Var.getClass();
                js2 js2Var = (js2) obj2;
                View view3 = this.itemView;
                view3.getClass();
                sea.v(view3, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                LinearLayout linearLayout3 = (LinearLayout) js2Var.k;
                ImageView imageView2 = (ImageView) js2Var.g;
                TextView textView15 = (TextView) js2Var.o;
                linearLayout3.getClass();
                linearLayout3.setPaddingRelative(linearLayout3.getPaddingStart(), ao2.s(16, context), linearLayout3.getPaddingEnd(), linearLayout3.getPaddingBottom());
                linearLayout3.setMinimumHeight(ao2.s(64, context));
                Team team2 = f14Var.a;
                boolean z4 = f14Var.c;
                if (!team2.getDisabled()) {
                    aba.y(linearLayout3, 0, 3);
                    linearLayout3.setOnClickListener(new cn(20, this, f14Var));
                }
                int color = context.getColor(R.color.success);
                int i8 = f14Var.d ? R.string.super_over : f14Var.b == 1 ? R.string.first_inning : R.string.second_inning;
                ((TextView) js2Var.l).setText(tba.p(context, team2));
                ((TextView) js2Var.m).setText(context.getString(i8));
                as9.o((ImageView) js2Var.c, team2.getId());
                ((ImageView) js2Var.e).setVisibility(8);
                ((ImageView) js2Var.b).setVisibility(8);
                ((ImageView) js2Var.f).setVisibility(z4 ? 0 : 8);
                textView15.setVisibility(z4 ? 0 : 8);
                imageView2.setVisibility(z4 ? 0 : 8);
                if (z4) {
                    textView15.setText(textView15.getContext().getString(R.string.cricket_batting));
                    textView15.setTextColor(textView15.getContext().getColor(R.color.success));
                    imageView2.setImageDrawable(imageView2.getContext().getDrawable(R.drawable.ic_cricket_bat));
                    imageView2.setImageTintList(ColorStateList.valueOf(color));
                    break;
                }
                break;
            case 14:
                dyd dydVar = (dyd) obj;
                dydVar.getClass();
                z82 z82Var = (z82) obj2;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) z82Var.b;
                constraintLayout2.setTag("CRICKET_SUMMARY_TAG");
                constraintLayout2.getBackground().setTint(context.getColor(R.color.surface_2));
                Resources resources = context.getResources();
                int i9 = dydVar.b;
                String quantityString = resources.getQuantityString(R.plurals.cricket_runs, i9, Integer.valueOf(i9));
                quantityString.getClass();
                Resources resources2 = context.getResources();
                int i10 = dydVar.c;
                String quantityString2 = resources2.getQuantityString(R.plurals.cricket_wickets, i10, Integer.valueOf(i10));
                quantityString2.getClass();
                ((TextView) z82Var.d).setText(context.getString(dydVar.g ? R.string.cricket_super_over_number : R.string.cricket_over_number, String.valueOf(dydVar.a)));
                me4.s(new Object[]{quantityString, quantityString2}, 2, Locale.getDefault(), "%s • %s", (TextView) z82Var.c);
                as9.o((ImageView) z82Var.e, dydVar.e);
                me4.s(new Object[]{dydVar.f, dydVar.d}, 2, Locale.getDefault(), "%s: %s", (TextView) z82Var.g);
                break;
            case 15:
                c14 c14Var = (c14) obj;
                c14Var.getClass();
                tol.l((p12) obj2, context, c14Var);
                View view4 = this.itemView;
                view4.getClass();
                sea.v(view4, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 16:
                zy9 zy9Var = (zy9) obj;
                zy9Var.getClass();
                FrameLayout frameLayout2 = ((t54) obj2).b;
                boolean z5 = zy9Var.c;
                frameLayout2.setBackground(context.getDrawable(z5 ? R.drawable.rounded_surface_level_1 : R.drawable.rectangle_16dp_corners_top));
                if (z5) {
                    frameLayout2.getClass();
                    ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                    if (layoutParams == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = ao2.s(4, context);
                        frameLayout2.setLayoutParams(marginLayoutParams);
                        break;
                    }
                }
                break;
            case 17:
                CustomizableDivider customizableDivider = (CustomizableDivider) obj;
                customizableDivider.getClass();
                SofaDivider sofaDivider2 = (SofaDivider) obj2;
                sofaDivider2.setDividerVisibility(customizableDivider.getDividerVisible());
                sofaDivider2.setLayoutParams(new hrf(-1, ao2.v(customizableDivider.getHeightDp(), context)));
                Integer tint = customizableDivider.getTint();
                if (!customizableDivider.isTransparent()) {
                    if (tint == null) {
                        aba.G(sofaDivider2);
                        break;
                    } else {
                        sofaDivider2.setBackgroundColor(tint.intValue());
                        break;
                    }
                } else {
                    sofaDivider2.setBackgroundColor(0);
                    break;
                }
            case 18:
                String str = (String) obj;
                str.getClass();
                ed edVar = (ed) obj2;
                ((kqb) edVar.c).d.setText(str);
                FrameLayout frameLayout3 = (FrameLayout) edVar.b;
                frameLayout3.getClass();
                sea.v(frameLayout3, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 19:
                String str2 = (String) obj;
                str2.getClass();
                kqb kqbVar = (kqb) obj2;
                ConstraintLayout constraintLayout3 = kqbVar.b;
                constraintLayout3.getClass();
                aba.G(constraintLayout3);
                kqbVar.d.setText(str2);
                View view5 = this.itemView;
                view5.getClass();
                sea.v(view5, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 20:
                ESportsEvent eSportsEvent = (ESportsEvent) obj;
                eSportsEvent.getClass();
                int m = yid.m(eSportsEvent.getBestOf());
                js2 js2Var2 = (js2) obj2;
                TextView textView16 = js2Var2.d;
                ImageView imageView3 = (ImageView) js2Var2.h;
                ImageView imageView4 = (ImageView) js2Var2.g;
                ImageView imageView5 = (ImageView) js2Var2.f;
                ImageView imageView6 = (ImageView) js2Var2.e;
                ImageView imageView7 = (ImageView) js2Var2.c;
                ImageView imageView8 = (ImageView) js2Var2.b;
                if (m > 0) {
                    Integer bestOf = eSportsEvent.getBestOf();
                    string = context.getString(R.string.best_of, Integer.valueOf(bestOf != null ? bestOf.intValue() : 0));
                } else {
                    string = context.getString(R.string.e_sport_games);
                }
                textView16.setText(string);
                ((FrameLayout) js2Var2.i).setVisibility(m >= 1 ? 0 : 8);
                ((FrameLayout) js2Var2.m).setVisibility(m >= 1 ? 0 : 8);
                ((FrameLayout) js2Var2.j).setVisibility(m >= 2 ? 0 : 8);
                ((FrameLayout) js2Var2.n).setVisibility(m >= 2 ? 0 : 8);
                ((FrameLayout) js2Var2.k).setVisibility(m >= 4 ? 0 : 8);
                ((FrameLayout) js2Var2.o).setVisibility(m >= 4 ? 0 : 8);
                Integer display = Event.getHomeScore$default(eSportsEvent, null, 1, null).getDisplay();
                int intValue3 = display != null ? display.intValue() : 0;
                Integer display2 = Event.getAwayScore$default(eSportsEvent, null, 1, null).getDisplay();
                int intValue4 = display2 != null ? display2.intValue() : 0;
                Iterator it = CollectionsKt.L0(b.j(imageView8, imageView7, imageView6), intValue3).iterator();
                while (it.hasNext()) {
                    ((ImageView) it.next()).setEnabled(true);
                }
                Iterator it2 = CollectionsKt.S(b.j(imageView8, imageView7, imageView6), intValue3).iterator();
                while (it2.hasNext()) {
                    ((ImageView) it2.next()).setEnabled(false);
                }
                Iterator it3 = CollectionsKt.L0(b.j(imageView5, imageView4, imageView3), intValue4).iterator();
                while (it3.hasNext()) {
                    ((ImageView) it3.next()).setEnabled(true);
                }
                Iterator it4 = CollectionsKt.S(b.j(imageView5, imageView4, imageView3), intValue4).iterator();
                while (it4.hasNext()) {
                    ((ImageView) it4.next()).setEnabled(false);
                }
                ConstraintLayout constraintLayout4 = (ConstraintLayout) js2Var2.l;
                constraintLayout4.getClass();
                sea.v(constraintLayout4, true, true, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 21:
                Round round = (Round) obj;
                round.getClass();
                o16 o16Var = (o16) obj2;
                FrameLayout frameLayout4 = o16Var.b;
                frameLayout4.getClass();
                sea.v(frameLayout4, true, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                TextView textView17 = o16Var.c;
                String name = round.getName();
                String str3 = name != null ? name : "";
                Integer round2 = round.getRound();
                textView17.setText(f5p.B(context, round2 != null ? round2.intValue() : 0, str3));
                break;
            case 22:
                ((pzh) obj).getClass();
                GraphicLarge graphicLarge = ((tm5) obj2).c;
                graphicLarge.setPaddingRelative(ao2.s(16, context), graphicLarge.getPaddingTop(), graphicLarge.getPaddingEnd(), graphicLarge.getPaddingBottom());
                break;
            case 23:
                m5i m5iVar = (m5i) obj;
                m5iVar.getClass();
                v82 v82Var = (v82) obj2;
                f6a.g((TextView) v82Var.d, m5iVar.b);
                f6a.h((EventListScoreTextView) v82Var.g, m5iVar.c, false, Boolean.FALSE);
                f6a.g((TextView) v82Var.e, m5iVar.d);
                f6a.g((TextView) v82Var.f, m5iVar.e);
                BellButton bellButton = (BellButton) ((nr1) v82Var.h).d;
                bellButton.setVisibility(0);
                Stage stage = m5iVar.a;
                wu wuVar = m5iVar.f;
                if (wuVar == null) {
                    wuVar = wu.MAIN_FAVORITES;
                }
                bellButton.e(stage, wuVar);
                ConstraintLayout constraintLayout5 = (ConstraintLayout) v82Var.b;
                constraintLayout5.getClass();
                sea.v(constraintLayout5, false, m5iVar.h, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 24:
                nak nakVar = (nak) obj;
                nakVar.getClass();
                zl zlVar = (zl) obj2;
                as9.b((ImageView) zlVar.d, Integer.valueOf(nakVar.a.getCategory().getId()), null);
                TextView textView18 = (TextView) zlVar.k;
                f6a.g(textView18, nakVar.b);
                ((ImageView) zlVar.c).setVisibility(textView18.getVisibility());
                TextView textView19 = (TextView) zlVar.b;
                f6a.g(textView19, nakVar.c);
                textView19.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                f6a.g(zlVar.g, null);
                int color2 = context.getColor(R.color.n_lv_1);
                int color3 = context.getColor(R.color.n_lv_3);
                textView18.setTextColor(nakVar.b != null ? color2 : color3);
                if (nakVar.b != null) {
                    color2 = color3;
                }
                textView19.setTextColor(color2);
                ((View) zlVar.l).setVisibility(nakVar.e ? 8 : 0);
                LinearLayout linearLayout4 = (LinearLayout) zlVar.f;
                linearLayout4.getClass();
                sea.v(linearLayout4, nakVar.e, false, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 25:
                String str4 = (String) obj;
                str4.getClass();
                lqb lqbVar = (lqb) obj2;
                TextView textView20 = lqbVar.c;
                textView20.setText(str4);
                lqbVar.a.setBackground(null);
                lqbVar.b.setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = textView20.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int s2 = ao2.s(12, context);
                    int s3 = ao2.s(18, context);
                    int s4 = ao2.s(12, context);
                    int s5 = ao2.s(10, context);
                    marginLayoutParams2.setMarginStart(s2);
                    marginLayoutParams2.topMargin = s3;
                    marginLayoutParams2.setMarginEnd(s4);
                    marginLayoutParams2.bottomMargin = s5;
                    textView20.setLayoutParams(marginLayoutParams2);
                    break;
                }
            case 26:
                xlf xlfVar = (xlf) obj;
                xlfVar.getClass();
                RankingRow rankingRow = xlfVar.a;
                zxd zxdVar = (zxd) obj2;
                zxdVar.f.setText(String.valueOf(rankingRow.getPosition()));
                haa.n(rankingRow, zxdVar.g);
                ImageView imageView9 = zxdVar.e;
                Team team3 = rankingRow.getTeam();
                as9.o(imageView9, team3 != null ? team3.getId() : 0);
                TextView textView21 = zxdVar.d;
                Team team4 = rankingRow.getTeam();
                textView21.setText(team4 != null ? tba.p(context, team4) : null);
                zxdVar.c.setVisibility(8);
                zxdVar.i.setVisibility(8);
                Double points = rankingRow.getPoints();
                haa.N(zxdVar.j, points != null ? String.format(dla.d(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(wzb.a(points.doubleValue()))}, 1)) : null);
                break;
            case 27:
                j29 j29Var = (j29) obj;
                v82 v82Var2 = (v82) obj2;
                MaterialButton materialButton = (MaterialButton) v82Var2.h;
                j29Var.getClass();
                Integer num = j29Var.a;
                if (num != null) {
                    iz8.E(v82Var2, context.getDrawable(num.intValue()));
                }
                Integer num2 = j29Var.b;
                if (num2 != null) {
                    String string2 = context.getString(num2.intValue());
                    string2.getClass();
                    iz8.G(v82Var2, string2);
                }
                Integer num3 = j29Var.c;
                if (num3 != null) {
                    String string3 = context.getString(num3.intValue());
                    string3.getClass();
                    iz8.F(v82Var2, string3);
                }
                Integer num4 = j29Var.d;
                if (num4 != null) {
                    String string4 = context.getString(num4.intValue());
                    string4.getClass();
                    materialButton.setText(string4);
                    materialButton.setVisibility(0);
                } else {
                    materialButton.setVisibility(8);
                }
                ixa ixaVar = j29Var.f;
                if (ixaVar != null) {
                    materialButton.setOnClickListener(new s61(4, ixaVar));
                } else {
                    materialButton.setOnClickListener(null);
                }
                Integer num5 = j29Var.e;
                if (num5 != null) {
                    int intValue5 = num5.intValue();
                    ConstraintLayout constraintLayout6 = (ConstraintLayout) v82Var2.b;
                    constraintLayout6.getClass();
                    constraintLayout6.setPadding(constraintLayout6.getPaddingLeft(), ao2.s(intValue5, context), constraintLayout6.getPaddingRight(), constraintLayout6.getPaddingBottom());
                    break;
                }
                break;
            case 28:
                h43 h43Var = (h43) obj;
                h43Var.getClass();
                ((eoh) ((e1d) obj2)).setValue(h43Var);
                break;
            default:
                EventStreak eventStreak = (EventStreak) obj;
                eventStreak.getClass();
                nr1 nr1Var2 = (nr1) obj2;
                ConstraintLayout constraintLayout7 = (ConstraintLayout) nr1Var2.c;
                ImageView imageView10 = (ImageView) nr1Var2.g;
                constraintLayout7.getClass();
                sea.v(constraintLayout7, i == 0, i == i2 + (-1), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                as9.o((ImageView) nr1Var2.e, Event.getHomeTeam$default(eventStreak.getEvent(), null, 1, null).getId());
                as9.o((ImageView) nr1Var2.f, Event.getAwayTeam$default(eventStreak.getEvent(), null, 1, null).getId());
                ((TextView) nr1Var2.i).setText(rik.s(eventStreak.getEvent().getStartTimestamp(), context));
                nr1Var2.b.setText(v8a.z(context, eventStreak.getStreak().getName()));
                ((TextView) nr1Var2.h).setText(eventStreak.getStreak().getValue());
                String team5 = eventStreak.getStreak().getTeam();
                ggi[] ggiVarArr = ggi.a;
                Integer valueOf = Intrinsics.c(team5, "home") ? Integer.valueOf(eventStreak.getEvent().getHomeTeam(TeamSides.ORIGINAL).getId()) : Intrinsics.c(team5, "away") ? Integer.valueOf(eventStreak.getEvent().getAwayTeam(TeamSides.ORIGINAL).getId()) : null;
                ImageView imageView11 = (ImageView) nr1Var2.d;
                if (valueOf != null) {
                    as9.o(imageView11, valueOf.intValue());
                    imageView10.setVisibility(8);
                    break;
                } else {
                    as9.o(imageView11, Event.getHomeTeam$default(eventStreak.getEvent(), null, 1, null).getId());
                    imageView10.setVisibility(0);
                    as9.o(imageView10, Event.getAwayTeam$default(eventStreak.getEvent(), null, 1, null).getId());
                    break;
                }
        }
    }

    public boolean d(int i, int i2, Object obj) {
        obj.getClass();
        return i == i2 - 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        constraintLayout.getClass();
        this.d = v82.d(constraintLayout);
    }

    public wh(SofaDivider sofaDivider) {
        super(sofaDivider);
        this.d = sofaDivider;
    }

    public wh(u22 u22Var) {
        super(u22Var.b);
        this.d = u22Var;
    }

    public wh(u22 u22Var, byte b) {
        super(u22Var.b);
        this.d = u22Var;
    }

    public wh(u22 u22Var, char c) {
        super(u22Var.b);
        this.d = u22Var;
    }

    public wh(u22 u22Var, int i) {
        super(u22Var.b);
        this.d = u22Var;
    }

    public wh(mt1 mt1Var) {
        super(mt1Var.b);
        this.d = mt1Var;
    }

    public wh(esk eskVar) {
        super(eskVar.a);
        this.d = e.f(null);
        eskVar.b.setContent(new tc3(409921818, new a69(this, 0), true));
    }

    public wh(ed edVar) {
        super((InformationView) edVar.b);
        this.d = edVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(ed edVar, byte b) {
        super(r2);
        FrameLayout frameLayout = (FrameLayout) edVar.b;
        frameLayout.getClass();
        this.d = edVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(ed edVar, char c) {
        super(r2);
        FrameLayout frameLayout = (FrameLayout) edVar.b;
        frameLayout.getClass();
        this.d = edVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(o16 o16Var) {
        super(r0);
        FrameLayout frameLayout = o16Var.b;
        frameLayout.getClass();
        this.d = o16Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(dk2 dk2Var) {
        super(r0);
        LinearLayout linearLayout = dk2Var.b;
        linearLayout.getClass();
        this.d = dk2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(tm5 tm5Var) {
        super(r0);
        FrameLayout frameLayout = tm5Var.b;
        frameLayout.getClass();
        this.d = tm5Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(t22 t22Var) {
        super(r0);
        LinearLayout linearLayout = t22Var.b;
        linearLayout.getClass();
        this.d = t22Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(h04 h04Var) {
        super(r0);
        ConstraintLayout constraintLayout = h04Var.b;
        constraintLayout.getClass();
        this.d = h04Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(kqb kqbVar) {
        super(r0);
        ConstraintLayout constraintLayout = kqbVar.b;
        constraintLayout.getClass();
        this.d = kqbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(lqb lqbVar) {
        super(r0);
        ConstraintLayout constraintLayout = lqbVar.a;
        constraintLayout.getClass();
        this.d = lqbVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(t54 t54Var) {
        super(r0);
        FrameLayout frameLayout = t54Var.b;
        frameLayout.getClass();
        this.d = t54Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(z82 z82Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        constraintLayout.getClass();
        this.d = z82Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(nr1 nr1Var) {
        super(r0);
        LinearLayout linearLayout = (LinearLayout) nr1Var.c;
        linearLayout.getClass();
        this.d = nr1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(zxd zxdVar) {
        super(r0);
        ConstraintLayout constraintLayout = zxdVar.b;
        constraintLayout.getClass();
        this.d = zxdVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(nr1 nr1Var, byte b) {
        super(r2);
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        constraintLayout.getClass();
        this.d = nr1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(bu1 bu1Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) bu1Var.b;
        constraintLayout.getClass();
        this.d = bu1Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(p12 p12Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) p12Var.b;
        constraintLayout.getClass();
        this.d = p12Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(v82 v82Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) v82Var.b;
        constraintLayout.getClass();
        this.d = v82Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(zl zlVar) {
        super(r0);
        LinearLayout linearLayout = (LinearLayout) zlVar.f;
        linearLayout.getClass();
        this.d = zlVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(js2 js2Var, byte b) {
        super(r2);
        ConstraintLayout constraintLayout = (ConstraintLayout) js2Var.l;
        constraintLayout.getClass();
        this.d = js2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wh(js2 js2Var) {
        super(r0);
        LinearLayout linearLayout = (LinearLayout) js2Var.i;
        linearLayout.getClass();
        this.d = js2Var;
    }
}
