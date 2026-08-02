package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.chat.view.ScoreUpdateView;
import com.sofascore.results.event.standings.EventStandingsFragment;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.header.CollapsibleSmallHeaderView;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        zsk zskVar;
        View headerView;
        View followersContainer;
        View mainContainer;
        Sequence labelViews;
        int i9 = this.a;
        int i10 = 1;
        int i11 = 0;
        Object obj = this.b;
        switch (i9) {
            case 0:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                mr2 mr2Var = (mr2) obj;
                View view2 = mr2Var.c;
                if (mr2Var.d().getIsAirCashMessage()) {
                    zsk zskVar2 = mr2Var.f;
                    if (zskVar2 == null) {
                        g6b t = qea.t(view2);
                        zskVar = t != null ? new zsk(t, 45) : null;
                        mr2Var.f = zskVar;
                        zskVar2 = zskVar;
                    }
                    if (zskVar2 != null) {
                        zskVar2.b(view2, new c2(mr2Var, i11), new c2(mr2Var, i10));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                nr2 nr2Var = (nr2) obj;
                zl zlVar = nr2Var.o;
                zsk zskVar3 = nr2Var.f;
                if (zskVar3 == null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) zlVar.b;
                    constraintLayout.getClass();
                    g6b t2 = qea.t(constraintLayout);
                    zskVar = t2 != null ? new zsk(t2, 45) : null;
                    nr2Var.f = zskVar;
                    zskVar3 = zskVar;
                }
                if (zskVar3 != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) zlVar.b;
                    constraintLayout2.getClass();
                    zskVar3.b(constraintLayout2, new v5(nr2Var, i11), new v5(nr2Var, i10));
                    return;
                }
                return;
            case 2:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                TextView textView = (TextView) obj;
                int measuredHeight = textView.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return;
                }
                tl3 tl3Var = (tl3) layoutParams;
                ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = -measuredHeight;
                textView.setLayoutParams(tl3Var);
                return;
            case 3:
                throw null;
            case 4:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                CollapsibleSmallHeaderView collapsibleSmallHeaderView = (CollapsibleSmallHeaderView) obj;
                View view3 = collapsibleSmallHeaderView.b;
                Rect rect = collapsibleSmallHeaderView.g;
                view3.getGlobalVisibleRect(rect);
                Context context = collapsibleSmallHeaderView.getContext();
                context.getClass();
                if (hkg.c0(context)) {
                    collapsibleSmallHeaderView.getMeasuredWidth();
                    int i12 = rect.right;
                } else {
                    int i13 = rect.left;
                }
                headerView = collapsibleSmallHeaderView.getHeaderView();
                double measuredWidth = headerView.getMeasuredWidth();
                Context context2 = collapsibleSmallHeaderView.getContext();
                context2.getClass();
                double measuredWidth2 = hkg.c0(context2) ? collapsibleSmallHeaderView.getMeasuredWidth() - (rect.right * 1.5d) : rect.left * 1.5d;
                followersContainer = collapsibleSmallHeaderView.getFollowersContainer();
                double max = measuredWidth - Math.max(measuredWidth2, followersContainer != null ? followersContainer.getMeasuredWidth() : 0.0d);
                int min = Math.min((int) max, (int) (r5 * (((0.20000000298023224d * max) / r5) + 1.0d)));
                mainContainer = collapsibleSmallHeaderView.getMainContainer();
                if (mainContainer != null) {
                    ViewGroup.LayoutParams layoutParams2 = mainContainer.getLayoutParams();
                    if (layoutParams2 == null) {
                        yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        return;
                    }
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    layoutParams3.width = min;
                    mainContainer.setLayoutParams(layoutParams3);
                    return;
                }
                return;
            case 5:
                int abs = Math.abs(i3 - i);
                if (abs != Math.abs(i7 - i5)) {
                    ((EventStandingsFragment) obj).C().I(abs);
                    return;
                }
                return;
            case 6:
                int abs2 = Math.abs(i3 - i);
                if (abs2 != Math.abs(i7 - i5)) {
                    ((LeagueStandingsFragment) obj).D().I(abs2);
                    return;
                }
                return;
            case 7:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((geb) obj).l();
                return;
            case 8:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                xre xreVar = (xre) obj;
                labelViews = xreVar.getLabelViews();
                Iterator it = labelViews.iterator();
                if (!it.hasNext()) {
                    yhk.d();
                    return;
                }
                int height = ((View) it.next()).getHeight();
                while (it.hasNext()) {
                    int height2 = ((View) it.next()).getHeight();
                    if (height < height2) {
                        height = height2;
                    }
                }
                xreVar.n(height);
                return;
            case 9:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                hse hseVar = (hse) obj;
                g6b t3 = qea.t(hseVar);
                if (t3 != null) {
                    if (t3.b().compareTo(e6b.e) < 0) {
                        t3.a(new gse(t3, hseVar, hseVar, 0));
                        return;
                    }
                    hseVar.l();
                    AnimatorSet animatorSet = hseVar.g;
                    if (animatorSet != null) {
                        animatorSet.start();
                    }
                    ValueAnimator valueAnimator = hseVar.f;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                    hseVar.h = true;
                    return;
                }
                return;
            case 10:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                pye pyeVar = (pye) obj;
                pyeVar.post(new kac(pyeVar, 7));
                return;
            case 11:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ScoreUpdateView scoreUpdateView = (ScoreUpdateView) obj;
                scoreUpdateView.j = ((ConstraintLayout) scoreUpdateView.d.b).getMeasuredWidth();
                scoreUpdateView.j();
                return;
            case 12:
                ((SearchView) obj).adjustDropDownSizeAndPosition();
                return;
            case 13:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                SofascoreRatingView sofascoreRatingView = (SofascoreRatingView) obj;
                g6b t4 = qea.t(sofascoreRatingView);
                if (t4 != null) {
                    if (t4.b().compareTo(e6b.e) < 0) {
                        t4.a(new gse(t4, sofascoreRatingView, sofascoreRatingView, 1));
                        return;
                    }
                    if (sofascoreRatingView.getShouldAnimate()) {
                        if (sofascoreRatingView.i != 0.0d || sofascoreRatingView.getAllowZeroRating()) {
                            sofascoreRatingView.g(sofascoreRatingView.i);
                            sofascoreRatingView.setShouldAnimate(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 14:
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) obj;
                g6b t5 = qea.t(sofascoreSmallRatingView);
                if (t5 != null) {
                    if (t5.b().compareTo(e6b.e) < 0) {
                        t5.a(new gse(t5, sofascoreSmallRatingView, sofascoreSmallRatingView, 2));
                        return;
                    }
                    Double valueOf = Double.valueOf(sofascoreSmallRatingView.h);
                    AnimatorSet animatorSet2 = sofascoreSmallRatingView.v;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(sofascoreSmallRatingView.i(valueOf, true));
                    animatorSet3.start();
                    AnimatorSet animatorSet4 = sofascoreSmallRatingView.v;
                    if (animatorSet4 != null) {
                        animatorSet4.cancel();
                    }
                    sofascoreSmallRatingView.v = animatorSet3;
                    sofascoreSmallRatingView.setShouldAnimate(false);
                    return;
                }
                return;
            case 15:
                int abs3 = Math.abs(i3 - i);
                if (abs3 != Math.abs(i7 - i5)) {
                    ((TeamStandingsFragment) obj).C().I(abs3);
                    return;
                }
                return;
            case 16:
                skj skjVar = (skj) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                skjVar.T = iArr[0];
                view.getWindowVisibleDisplayFrame(skjVar.M);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ((x40) obj).invoke(view);
                return;
        }
    }
}
