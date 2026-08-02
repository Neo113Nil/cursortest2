package com.sofascore.results.event.matches.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.Odds;
import com.sofascore.model.network.response.WinningOddsResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.matches.view.WinningOddsView;
import defpackage.as9;
import defpackage.cv1;
import defpackage.li6;
import defpackage.nq8;
import defpackage.o8;
import defpackage.rfe;
import defpackage.sal;
import defpackage.v8a;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR$\u0010\u0006\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sofascore/results/event/matches/view/WinningOddsView;", "Lo8;", "", "getLayoutId", "()I", "Landroid/view/View$OnClickListener;", "listener", "", "setTeamsRowClickListener", "(Landroid/view/View$OnClickListener;)V", "Lli6;", "e", "Lli6;", "getListener", "()Lli6;", "setListener", "(Lli6;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WinningOddsView extends o8 {
    public final rfe d;

    /* renamed from: e, reason: from kotlin metadata */
    public li6 listener;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinningOddsView(Context context, AttributeSet attributeSet, int i) {
        super(context, r1, 0);
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        View root = getRoot();
        int i2 = R.id.dropping_odds_two_teams_row;
        View B = nq8.B(R.id.dropping_odds_two_teams_row, root);
        if (B != null) {
            int i3 = R.id.first_team_logo;
            ImageView imageView = (ImageView) nq8.B(R.id.first_team_logo, B);
            if (imageView != null) {
                i3 = R.id.first_team_name;
                TextView textView = (TextView) nq8.B(R.id.first_team_name, B);
                if (textView != null) {
                    i3 = R.id.second_team_logo;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.second_team_logo, B);
                    if (imageView2 != null) {
                        i3 = R.id.second_team_name;
                        TextView textView2 = (TextView) nq8.B(R.id.second_team_name, B);
                        if (textView2 != null) {
                            cv1 cv1Var = new cv1((ConstraintLayout) B, imageView, textView, imageView2, textView2, 0);
                            i2 = R.id.title;
                            TextView textView3 = (TextView) nq8.B(R.id.title, root);
                            if (textView3 != null) {
                                i2 = R.id.winning_odds_rows_container;
                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.winning_odds_rows_container, root);
                                if (linearLayout != null) {
                                    this.d = new rfe((LinearLayout) root, cv1Var, textView3, linearLayout, 12);
                                    setVisibility(8);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i3)));
            throw null;
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.winning_odds_view;
    }

    @Nullable
    public final li6 getListener() {
        return this.listener;
    }

    public final void j(WinningOddsResponse winningOddsResponse, Event event, boolean z, boolean z2) {
        winningOddsResponse.getClass();
        final int i = 0;
        setVisibility(0);
        rfe rfeVar = this.d;
        LinearLayout linearLayout = (LinearLayout) rfeVar.d;
        LinearLayout linearLayout2 = (LinearLayout) rfeVar.d;
        cv1 cv1Var = (cv1) rfeVar.c;
        if (linearLayout.getChildCount() != 0) {
            linearLayout2.removeAllViews();
        }
        final int i2 = 1;
        Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
        Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
        Odds home$default = WinningOddsResponse.getHome$default(winningOddsResponse, null, 1, null);
        if (home$default != null) {
            Context context = getContext();
            context.getClass();
            sal salVar = new sal(context);
            salVar.j(home$default, homeTeam$default, z);
            salVar.setExpandedViewListener(new li6(this) { // from class: tal
                public final /* synthetic */ WinningOddsView b;

                {
                    this.b = this;
                }

                @Override // defpackage.li6
                public final void f(boolean z3) {
                    int i3 = i;
                    WinningOddsView winningOddsView = this.b;
                    switch (i3) {
                        case 0:
                            li6 li6Var = winningOddsView.listener;
                            if (li6Var != null) {
                                li6Var.f(z3);
                                break;
                            }
                            break;
                        default:
                            li6 li6Var2 = winningOddsView.listener;
                            if (li6Var2 != null) {
                                li6Var2.f(z3);
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout2.addView(salVar);
        }
        Odds away$default = WinningOddsResponse.getAway$default(winningOddsResponse, null, 1, null);
        if (away$default != null) {
            Context context2 = getContext();
            context2.getClass();
            sal salVar2 = new sal(context2);
            salVar2.j(away$default, awayTeam$default, z);
            salVar2.setExpandedViewListener(new li6(this) { // from class: tal
                public final /* synthetic */ WinningOddsView b;

                {
                    this.b = this;
                }

                @Override // defpackage.li6
                public final void f(boolean z3) {
                    int i3 = i2;
                    WinningOddsView winningOddsView = this.b;
                    switch (i3) {
                        case 0:
                            li6 li6Var = winningOddsView.listener;
                            if (li6Var != null) {
                                li6Var.f(z3);
                                break;
                            }
                            break;
                        default:
                            li6 li6Var2 = winningOddsView.listener;
                            if (li6Var2 != null) {
                                li6Var2.f(z3);
                                break;
                            }
                            break;
                    }
                }
            });
            linearLayout2.addView(salVar2);
        }
        if (z2) {
            ((TextView) rfeVar.e).setVisibility(8);
            cv1Var.b.setVisibility(0);
            as9.o(cv1Var.c, homeTeam$default.getId());
            as9.o(cv1Var.e, awayTeam$default.getId());
            TextView textView = cv1Var.d;
            Context context3 = getContext();
            context3.getClass();
            textView.setText(v8a.x(context3, homeTeam$default));
            TextView textView2 = cv1Var.f;
            Context context4 = getContext();
            context4.getClass();
            textView2.setText(v8a.x(context4, awayTeam$default));
        }
    }

    public final void setListener(@Nullable li6 li6Var) {
        this.listener = li6Var;
    }

    public final void setTeamsRowClickListener(@NotNull View.OnClickListener listener) {
        listener.getClass();
        ((cv1) this.d.c).b.setOnClickListener(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WinningOddsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
