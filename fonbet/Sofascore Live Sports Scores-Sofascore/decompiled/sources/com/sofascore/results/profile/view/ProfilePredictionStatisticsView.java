package com.sofascore.results.profile.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.profile.VoteStatistics;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a5f;
import defpackage.ate;
import defpackage.bga;
import defpackage.ccd;
import defpackage.cne;
import defpackage.dla;
import defpackage.dmi;
import defpackage.ez0;
import defpackage.hc9;
import defpackage.ke0;
import defpackage.l2d;
import defpackage.l97;
import defpackage.nq8;
import defpackage.rld;
import defpackage.uic;
import defpackage.vl;
import defpackage.xbb;
import defpackage.xld;
import defpackage.yhk;
import defpackage.z82;
import defpackage.z8e;
import defpackage.zu3;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/profile/view/ProfilePredictionStatisticsView;", "Landroid/widget/FrameLayout;", "", "titleResId", "", "setTitle", "(I)V", "Landroid/view/View$OnClickListener;", "l", "setOnViewMoreClickListener", "(Landroid/view/View$OnClickListener;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProfilePredictionStatisticsView extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final ez0 a;
    public final DecimalFormat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePredictionStatisticsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.layout_profile_statistics, this);
        int i = R.id.button_view_more;
        TextView textView = (TextView) nq8.B(R.id.button_view_more, this);
        if (textView != null) {
            i = R.id.overview_rows;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.overview_rows, this);
            if (linearLayout != null) {
                i = R.id.title;
                TextView textView2 = (TextView) nq8.B(R.id.title, this);
                if (textView2 != null) {
                    this.a = new ez0(this, textView, linearLayout, textView2, 19);
                    this.b = new DecimalFormat("0.00", new DecimalFormatSymbols(dla.d()));
                    setClipToPadding(false);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r12.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0227 A[LOOP:0: B:48:0x021e->B:50:0x0227, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023a A[EDGE_INSN: B:51:0x023a->B:52:0x023a BREAK  A[LOOP:0: B:48:0x021e->B:50:0x0227], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ProfilePredictionStatisticsView profilePredictionStatisticsView, VoteStatistics voteStatistics, String str, String str2, int i) {
        boolean z;
        l2d l2dVar;
        ListIterator listIterator;
        hc9 hc9Var;
        SharedPreferences d;
        boolean z2 = (i & 4) == 0;
        String str3 = (i & 8) != 0 ? null : str2;
        ez0 ez0Var = profilePredictionStatisticsView.a;
        if (voteStatistics != null) {
            int color = profilePredictionStatisticsView.getContext().getColor(R.color.primary_default);
            xbb b = a.b();
            Context context = profilePredictionStatisticsView.getContext();
            context.getClass();
            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                ccd ccdVar = vl.b;
            }
            bga bgaVar = xld.a;
            Context context2 = profilePredictionStatisticsView.getContext();
            context2.getClass();
            if (xld.g(context2)) {
                z = true;
                Context context3 = profilePredictionStatisticsView.getContext();
                context3.getClass();
                l2dVar = new l2d(context3);
                String string = l2dVar.getContext().getString(R.string.correct_predictions);
                string.getClass();
                ((TextView) l2dVar.d.d).setText(string);
                l2dVar.j(voteStatistics.getCorrect() + "/" + voteStatistics.getTotal() + " (" + voteStatistics.getPercentage() + ")", false);
                if (str.equals("CURRENT") && z) {
                    ((TextView) l2dVar.d.d).setTextColor(color);
                    ((ImageView) l2dVar.d.e).setVisibility(0);
                    ((ImageView) l2dVar.d.e).setImageTintList(ColorStateList.valueOf(color));
                    l97 l97Var = new l97(21, l2dVar, voteStatistics, str3);
                    z82 z82Var = l2dVar.d;
                    z8e.a0((TextView) z82Var.d, 1000L, l97Var);
                    z8e.a0((ImageView) z82Var.e, 1000L, l97Var);
                }
                b.add(l2dVar);
                if (z) {
                    Context context4 = profilePredictionStatisticsView.getContext();
                    context4.getClass();
                    l2d l2dVar2 = new l2d(context4);
                    String string2 = l2dVar2.getContext().getString(R.string.average_correct_odds);
                    string2.getClass();
                    ((TextView) l2dVar2.d.d).setText(string2);
                    Context context5 = l2dVar2.getContext();
                    context5.getClass();
                    OddsChoice avgCorrectOdds = voteStatistics.getAvgCorrectOdds();
                    l2dVar2.j(rld.m(context5, avgCorrectOdds != null ? avgCorrectOdds.getFractionalValue() : null), true);
                    b.add(l2dVar2);
                }
                String string3 = !z ? profilePredictionStatisticsView.getContext().getString(R.string.return_on_investment) : profilePredictionStatisticsView.getContext().getString(R.string.points);
                string3.getClass();
                Context context6 = profilePredictionStatisticsView.getContext();
                context6.getClass();
                l2d l2dVar3 = new l2d(context6);
                String q = dmi.q(voteStatistics.getRoi() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "+" : "", profilePredictionStatisticsView.b.format(Float.valueOf(voteStatistics.getRoi())));
                ((TextView) l2dVar3.d.d).setText(string3);
                l2dVar3.j(q, true);
                if (!z2) {
                    ((TextView) l2dVar3.d.d).setTextColor(color);
                    ((ImageView) l2dVar3.d.e).setVisibility(0);
                    ((ImageView) l2dVar3.d.e).setImageTintList(ColorStateList.valueOf(color));
                    ate ateVar = new ate(l2dVar3, 14);
                    z82 z82Var2 = l2dVar3.d;
                    z8e.a0((TextView) z82Var2.d, 1000L, ateVar);
                    z8e.a0((ImageView) z82Var2.e, 1000L, ateVar);
                }
                b.add(l2dVar3);
                if (!z2) {
                    Context context7 = profilePredictionStatisticsView.getContext();
                    context7.getClass();
                    l2d l2dVar4 = new l2d(context7);
                    String string4 = l2dVar4.getContext().getString(R.string.profile_predictor_rank);
                    string4.getClass();
                    ((TextView) l2dVar4.d.d).setText(string4);
                    l2dVar4.j(voteStatistics.getRanking(), false);
                    b.add(l2dVar4);
                }
                listIterator = a.a(b).listIterator(0);
                while (true) {
                    hc9Var = (hc9) listIterator;
                    if (hc9Var.hasNext()) {
                        break;
                    }
                    l2d l2dVar5 = (l2d) hc9Var.next();
                    LinearLayout linearLayout = (LinearLayout) ez0Var.d;
                    linearLayout.addView(l2dVar5, linearLayout.getChildCount() - 1);
                }
                ((TextView) ez0Var.c).setVisibility(z2 ? 0 : 8);
                ((TextView) ez0Var.c).setOnClickListener(new cne(profilePredictionStatisticsView, 10));
            }
            z = false;
            Context context32 = profilePredictionStatisticsView.getContext();
            context32.getClass();
            l2dVar = new l2d(context32);
            String string5 = l2dVar.getContext().getString(R.string.correct_predictions);
            string5.getClass();
            ((TextView) l2dVar.d.d).setText(string5);
            l2dVar.j(voteStatistics.getCorrect() + "/" + voteStatistics.getTotal() + " (" + voteStatistics.getPercentage() + ")", false);
            if (str.equals("CURRENT")) {
                ((TextView) l2dVar.d.d).setTextColor(color);
                ((ImageView) l2dVar.d.e).setVisibility(0);
                ((ImageView) l2dVar.d.e).setImageTintList(ColorStateList.valueOf(color));
                l97 l97Var2 = new l97(21, l2dVar, voteStatistics, str3);
                z82 z82Var3 = l2dVar.d;
                z8e.a0((TextView) z82Var3.d, 1000L, l97Var2);
                z8e.a0((ImageView) z82Var3.e, 1000L, l97Var2);
            }
            b.add(l2dVar);
            if (z) {
            }
            if (!z) {
            }
            string3.getClass();
            Context context62 = profilePredictionStatisticsView.getContext();
            context62.getClass();
            l2d l2dVar32 = new l2d(context62);
            String q2 = dmi.q(voteStatistics.getRoi() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "+" : "", profilePredictionStatisticsView.b.format(Float.valueOf(voteStatistics.getRoi())));
            ((TextView) l2dVar32.d.d).setText(string3);
            l2dVar32.j(q2, true);
            if (!z2) {
            }
            b.add(l2dVar32);
            if (!z2) {
            }
            listIterator = a.a(b).listIterator(0);
            while (true) {
                hc9Var = (hc9) listIterator;
                if (hc9Var.hasNext()) {
                }
                l2d l2dVar52 = (l2d) hc9Var.next();
                LinearLayout linearLayout2 = (LinearLayout) ez0Var.d;
                linearLayout2.addView(l2dVar52, linearLayout2.getChildCount() - 1);
            }
            ((TextView) ez0Var.c).setVisibility(z2 ? 0 : 8);
            ((TextView) ez0Var.c).setOnClickListener(new cne(profilePredictionStatisticsView, 10));
        }
    }

    public final void setOnViewMoreClickListener(@NotNull View.OnClickListener l) {
        l.getClass();
        ((TextView) this.a.c).setOnClickListener(l);
    }

    public final void setTitle(int titleResId) {
        ((TextView) this.a.e).setText(titleResId);
    }
}
