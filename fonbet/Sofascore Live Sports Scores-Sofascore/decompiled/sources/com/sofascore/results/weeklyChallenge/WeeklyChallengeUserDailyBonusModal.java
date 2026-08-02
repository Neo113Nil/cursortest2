package com.sofascore.results.weeklyChallenge;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.view.header.TeamLogoView;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import defpackage.bmj;
import defpackage.c6o;
import defpackage.d3k;
import defpackage.duf;
import defpackage.ilj;
import defpackage.joa;
import defpackage.nq8;
import defpackage.otk;
import defpackage.p3l;
import defpackage.pdk;
import defpackage.qdj;
import defpackage.qea;
import defpackage.rq3;
import defpackage.s21;
import defpackage.s2j;
import defpackage.tba;
import defpackage.tc3;
import defpackage.xz0;
import defpackage.ygi;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/WeeklyChallengeUserDailyBonusModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "Lw3f;", "predictionState", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyChallengeUserDailyBonusModal extends Hilt_WeeklyChallengeUserDailyBonusModal {
    public final otk B;
    public xz0 C;
    public final boolean D;
    public final joa E;
    public final joa F;

    public WeeklyChallengeUserDailyBonusModal() {
        s2j s2jVar = new s2j(this, 22);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(s2jVar, 23));
        this.B = new otk(duf.a.getOrCreateKotlinClass(p3l.class), new d3k(a, 7), new ilj(11, this, a), new d3k(a, 8));
        final int i = 1;
        this.D = true;
        final int i2 = 0;
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: m3l
            public final /* synthetic */ WeeklyChallengeUserDailyBonusModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = weeklyChallengeUserDailyBonusModal.requireContext();
                        requireContext.getClass();
                        tc4 tc4Var = new tc4(requireContext, null, 0);
                        tc4Var.q = vmd.WEEKLY_CHALLENGE;
                        return tc4Var;
                    default:
                        g6b lifecycle = weeklyChallengeUserDailyBonusModal.getLifecycle();
                        lifecycle.getClass();
                        return new zsk(lifecycle, 30);
                }
            }
        });
        this.F = ypa.a(ysaVar, new Function0(this) { // from class: m3l
            public final /* synthetic */ WeeklyChallengeUserDailyBonusModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = weeklyChallengeUserDailyBonusModal.requireContext();
                        requireContext.getClass();
                        tc4 tc4Var = new tc4(requireContext, null, 0);
                        tc4Var.q = vmd.WEEKLY_CHALLENGE;
                        return tc4Var;
                    default:
                        g6b lifecycle = weeklyChallengeUserDailyBonusModal.getLifecycle();
                        lifecycle.getClass();
                        return new zsk(lifecycle, 30);
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.modal_weekly_challenge_user_daily_bonus, (ViewGroup) v().l, false);
        int i = R.id.compose_view;
        ComposeView composeView = (ComposeView) nq8.B(R.id.compose_view, inflate);
        if (composeView != null) {
            i = R.id.disclaimer_text;
            TextView textView = (TextView) nq8.B(R.id.disclaimer_text, inflate);
            if (textView != null) {
                i = R.id.event_date_container;
                if (((LinearLayout) nq8.B(R.id.event_date_container, inflate)) != null) {
                    i = R.id.first_team_logo;
                    TeamLogoView teamLogoView = (TeamLogoView) nq8.B(R.id.first_team_logo, inflate);
                    if (teamLogoView != null) {
                        i = R.id.first_team_name;
                        TextView textView2 = (TextView) nq8.B(R.id.first_team_name, inflate);
                        if (textView2 != null) {
                            i = R.id.info;
                            if (((TextView) nq8.B(R.id.info, inflate)) != null) {
                                i = R.id.odds_container;
                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.odds_container, inflate);
                                if (frameLayout != null) {
                                    i = R.id.odds_logo;
                                    ImageView imageView = (ImageView) nq8.B(R.id.odds_logo, inflate);
                                    if (imageView != null) {
                                        i = R.id.primary_label;
                                        TextView textView3 = (TextView) nq8.B(R.id.primary_label, inflate);
                                        if (textView3 != null) {
                                            i = R.id.second_team_logo;
                                            TeamLogoView teamLogoView2 = (TeamLogoView) nq8.B(R.id.second_team_logo, inflate);
                                            if (teamLogoView2 != null) {
                                                i = R.id.second_team_name;
                                                TextView textView4 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                                if (textView4 != null) {
                                                    i = R.id.secondary_label;
                                                    TextView textView5 = (TextView) nq8.B(R.id.secondary_label, inflate);
                                                    if (textView5 != null) {
                                                        i = R.id.title;
                                                        if (((TextView) nq8.B(R.id.title, inflate)) != null) {
                                                            i = R.id.title_container;
                                                            if (((LinearLayout) nq8.B(R.id.title_container, inflate)) != null) {
                                                                i = R.id.www_container;
                                                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.www_container, inflate);
                                                                if (linearLayout != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                    this.C = new xz0(constraintLayout, composeView, textView, teamLogoView, textView2, frameLayout, imageView, textView3, teamLogoView2, textView4, textView5, linearLayout);
                                                                    constraintLayout.getClass();
                                                                    return constraintLayout;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        otk otkVar = this.B;
        Event event = ((p3l) otkVar.getValue()).j;
        rq3 rq3Var = null;
        if (event != null) {
            int i = s21.i;
            Context requireContext = requireContext();
            requireContext.getClass();
            long startTimestamp = event.getStartTimestamp();
            xz0 xz0Var = this.C;
            if (xz0Var == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            TextView textView = xz0Var.e;
            if (xz0Var == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            c6o.L(requireContext, startTimestamp, textView, (TextView) xz0Var.h);
            xz0 xz0Var2 = this.C;
            if (xz0Var2 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            TeamLogoView teamLogoView = (TeamLogoView) xz0Var2.k;
            TeamLogoView.g(teamLogoView, Event.getHomeTeam$default(event, null, 1, null), Event.getHomeTeamSeed$default(event, null, 1, null), 12);
            teamLogoView.setEnabled(false);
            xz0 xz0Var3 = this.C;
            if (xz0Var3 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            TextView textView2 = xz0Var3.d;
            Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            textView2.setText(tba.A(requireContext2, homeTeam$default));
            xz0 xz0Var4 = this.C;
            if (xz0Var4 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            TeamLogoView teamLogoView2 = (TeamLogoView) xz0Var4.l;
            TeamLogoView.g(teamLogoView2, Event.getAwayTeam$default(event, null, 1, null), Event.getAwayTeamSeed$default(event, null, 1, null), 12);
            teamLogoView2.setEnabled(false);
            xz0 xz0Var5 = this.C;
            if (xz0Var5 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            TextView textView3 = (TextView) xz0Var5.g;
            Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
            Context requireContext3 = requireContext();
            requireContext3.getClass();
            textView3.setText(qea.K(tba.A(requireContext3, awayTeam$default), event.shouldReverseTeams()));
            ((p3l) otkVar.getValue()).p.e(getViewLifecycleOwner(), new ygi(14, new qdj(this, 17)));
            xz0 xz0Var6 = this.C;
            if (xz0Var6 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            ((ComposeView) xz0Var6.i).setContent(new tc3(1324545402, new bmj(14, this, event), true));
        }
        xz0 xz0Var7 = this.C;
        if (xz0Var7 == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        ((FrameLayout) xz0Var7.j).addView((FeaturedOddsView) this.E.getValue());
        z8e.y(this, ((p3l) otkVar.getValue()).l, new pdk(this, rq3Var, 7));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "Daily10xModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
