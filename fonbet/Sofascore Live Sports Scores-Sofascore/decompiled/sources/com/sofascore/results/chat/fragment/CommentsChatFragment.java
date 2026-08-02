package com.sofascore.results.chat.fragment;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.model.Sports;
import com.sofascore.model.chat.TeamOfTheRoundChatInterface;
import com.sofascore.model.chat.TournamentSeasonPair;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.chat.addcountry.ChatCountryFlagBottomSheet;
import com.sofascore.results.chat.fragment.CommentsChatFragment;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.chat.view.ScoreUpdateView;
import defpackage.a5f;
import defpackage.as9;
import defpackage.b0a;
import defpackage.dr2;
import defpackage.duf;
import defpackage.elc;
import defpackage.f6;
import defpackage.fcp;
import defpackage.fhc;
import defpackage.fn0;
import defpackage.g2;
import defpackage.gh5;
import defpackage.h6;
import defpackage.hr2;
import defpackage.ip1;
import defpackage.j58;
import defpackage.joa;
import defpackage.jqc;
import defpackage.js2;
import defpackage.krk;
import defpackage.mqi;
import defpackage.ok3;
import defpackage.oq2;
import defpackage.otk;
import defpackage.pq2;
import defpackage.r1;
import defpackage.rq3;
import defpackage.u6b;
import defpackage.uic;
import defpackage.un0;
import defpackage.us2;
import defpackage.v98;
import defpackage.w1;
import defpackage.wca;
import defpackage.wl2;
import defpackage.x1;
import defpackage.xw3;
import defpackage.y1;
import defpackage.yea;
import defpackage.yn8;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/chat/fragment/CommentsChatFragment;", "Lcom/sofascore/results/chat/fragment/AbstractChatFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommentsChatFragment extends Hilt_CommentsChatFragment {
    public final otk R;
    public elc S;
    public boolean T;
    public boolean U;
    public Event V;
    public final mqi W;
    public int X;
    public int Y;
    public boolean Z;
    public final joa a0;
    public final mqi b0;

    public CommentsChatFragment() {
        w1 w1Var = new w1(this, 26);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new w1(w1Var, 27));
        this.R = new otk(duf.a.getOrCreateKotlinClass(jqc.class), new x1(a, 21), new y1(17, this, a), new x1(a, 22));
        this.W = ypa.b(new wl2(28));
        final int i = 0;
        this.a0 = ypa.a(ysaVar, new Function0(this) { // from class: q43
            public final /* synthetic */ CommentsChatFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2;
                Category category;
                Sport sport;
                int i3 = i;
                CommentsChatFragment commentsChatFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = commentsChatFragment.requireContext();
                        requireContext.getClass();
                        return new hlc(requireContext, new kr1(commentsChatFragment, 21));
                    default:
                        if (commentsChatFragment.D().j instanceof TournamentSeasonPair) {
                            i2 = R.string.empty_state_chat_competition;
                        } else {
                            ChatInterface chatInterface = commentsChatFragment.D().j;
                            Tournament tournament = chatInterface instanceof Tournament ? (Tournament) chatInterface : null;
                            i2 = Intrinsics.c((tournament == null || (category = tournament.getCategory()) == null || (sport = category.getSport()) == null) ? null : sport.getSlug(), Sports.MMA) ? R.string.empty_chat_comments_fight : R.string.comments_empty_view;
                        }
                        commentsChatFragment.D();
                        yea yeaVar = j58.a;
                        return new dr2(i2, 3854, null, fn0.B("chat_comments_upload_enabled_android") || commentsChatFragment.K().isAdmin());
                }
            }
        });
        final int i2 = 1;
        this.b0 = ypa.b(new Function0(this) { // from class: q43
            public final /* synthetic */ CommentsChatFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                Category category;
                Sport sport;
                int i3 = i2;
                CommentsChatFragment commentsChatFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = commentsChatFragment.requireContext();
                        requireContext.getClass();
                        return new hlc(requireContext, new kr1(commentsChatFragment, 21));
                    default:
                        if (commentsChatFragment.D().j instanceof TournamentSeasonPair) {
                            i22 = R.string.empty_state_chat_competition;
                        } else {
                            ChatInterface chatInterface = commentsChatFragment.D().j;
                            Tournament tournament = chatInterface instanceof Tournament ? (Tournament) chatInterface : null;
                            i22 = Intrinsics.c((tournament == null || (category = tournament.getCategory()) == null || (sport = category.getSport()) == null) ? null : sport.getSlug(), Sports.MMA) ? R.string.empty_chat_comments_fight : R.string.comments_empty_view;
                        }
                        commentsChatFragment.D();
                        yea yeaVar = j58.a;
                        return new dr2(i22, 3854, null, fn0.B("chat_comments_upload_enabled_android") || commentsChatFragment.K().isAdmin());
                }
            }
        });
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    public final void C() {
        yea yeaVar = j58.a;
        getR().d = fn0.B("chat_comments_upload_enabled_android") || K().isAdmin();
        if (this.Z) {
            krk krkVar = this.l;
            krkVar.getClass();
            ((yn8) krkVar).f.setChatFlag((String) L().v.a.getValue());
        }
        super.C();
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    /* renamed from: E */
    public final dr2 getR() {
        return (dr2) this.b0.getValue();
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment
    public final void N() {
        R();
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        ChatCountryFlagBottomSheet chatCountryFlagBottomSheet = new ChatCountryFlagBottomSheet();
        AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(chatCountryFlagBottomSheet, appCompatActivity, null, 3));
        }
    }

    public final void R() {
        krk krkVar = this.l;
        krkVar.getClass();
        LinearLayout linearLayout = ((yn8) krkVar).c.b;
        linearLayout.getClass();
        linearLayout.setVisibility(8);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((yn8) krkVar2).g.setVisibility(8);
        SharedPreferences.Editor edit = H().edit();
        edit.getClass();
        edit.putBoolean("PREF_FLAGS_INFO_BUBBLE_DISMISSED", true);
        edit.apply();
    }

    public final void S(Integer num, Integer num2) {
        SharedPreferences d;
        if (this.Z) {
            return;
        }
        yea yeaVar = j58.a;
        if (fn0.B("is_chat_country_flag_active") && num != null && num.intValue() == 16 && num2 != null && num2.intValue() == 58210) {
            int i = 1;
            this.Z = true;
            fhc F = F();
            F.s = true;
            F.notifyDataSetChanged();
            krk krkVar = this.l;
            krkVar.getClass();
            ChatMessageInputView chatMessageInputView = ((yn8) krkVar).f;
            js2 js2Var = chatMessageInputView.d;
            ((ImageView) js2Var.b).setVisibility(0);
            chatMessageInputView.j((ImageView) js2Var.b);
            v98 v98Var = new v98(L().v, new r1(this, null, 8), 3);
            u6b viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            fcp.m0(v98Var, wca.x(viewLifecycleOwner.getLifecycle()));
            v98 v98Var2 = new v98(L().x, new ip1(this, null, 4), 3);
            u6b viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            fcp.m0(v98Var2, wca.x(viewLifecycleOwner2.getLifecycle()));
            Context requireContext = requireContext();
            requireContext.getClass();
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = requireContext.getApplicationContext();
                synchronized (uic.i) {
                    d = a5f.d(applicationContext);
                    uic.j = d;
                }
                d.getClass();
                sharedPreferences = d;
            }
            if (sharedPreferences.getBoolean("PREF_FLAGS_INFO_BUBBLE_DISMISSED", false) || b0a.k != null) {
                return;
            }
            krk krkVar2 = this.l;
            krkVar2.getClass();
            gh5 gh5Var = ((yn8) krkVar2).c;
            gh5Var.b.setBackgroundTintList(ColorStateList.valueOf(requireContext().getColor(R.color.primary_default)));
            gh5Var.d.setText(getString(R.string.chat_flag_info_bubble));
            as9.q(gh5Var.c, num, num.intValue(), null);
            gh5Var.b.setOnTouchListener(new f6(this, 2));
            krk krkVar3 = this.l;
            krkVar3.getClass();
            ChatMessageInputView chatMessageInputView2 = ((yn8) krkVar3).f;
            krk krkVar4 = this.l;
            krkVar4.getClass();
            ImageView imageView = ((yn8) krkVar4).g;
            krk krkVar5 = this.l;
            krkVar5.getClass();
            LinearLayout linearLayout = ((yn8) krkVar5).c.b;
            linearLayout.getClass();
            u6b viewLifecycleOwner3 = getViewLifecycleOwner();
            viewLifecycleOwner3.getClass();
            hr2 hr2Var = new hr2(chatMessageInputView2, imageView, linearLayout, 0);
            ((ImageView) chatMessageInputView2.d.b).getViewTreeObserver().addOnGlobalLayoutListener(hr2Var);
            viewLifecycleOwner3.getLifecycle().a(new h6(i, chatMessageInputView2, hr2Var));
            krk krkVar6 = this.l;
            krkVar6.getClass();
            ((yn8) krkVar6).g.setVisibility(0);
            krk krkVar7 = this.l;
            krkVar7.getClass();
            LinearLayout linearLayout2 = ((yn8) krkVar7).c.b;
            linearLayout2.getClass();
            linearLayout2.setVisibility(0);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        elc elcVar = this.S;
        if (elcVar != null) {
            elcVar.e();
        }
        krk krkVar = this.l;
        krkVar.getClass();
        ScoreUpdateView scoreUpdateView = ((yn8) krkVar).m;
        scoreUpdateView.g.cancel();
        ObjectAnimator objectAnimator = scoreUpdateView.h;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = scoreUpdateView.h;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        scoreUpdateView.h = null;
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment, com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        elc elcVar = this.S;
        if (elcVar != null) {
            elcVar.d();
        }
        krk krkVar = this.l;
        krkVar.getClass();
        ((yn8) krkVar).m.l();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "CommentsTab";
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        ChatInterface chatInterface = L().y;
        Event event = chatInterface instanceof Event ? (Event) chatInterface : null;
        final int i = 0;
        final int i2 = 1;
        if (event != null) {
            Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            this.X = display != null ? display.intValue() : 0;
            Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
            this.Y = display2 != null ? display2.intValue() : 0;
        }
        ChatInterface chatInterface2 = L().y;
        TeamOfTheRoundChatInterface teamOfTheRoundChatInterface = chatInterface2 instanceof TeamOfTheRoundChatInterface ? (TeamOfTheRoundChatInterface) chatInterface2 : null;
        if (teamOfTheRoundChatInterface != null) {
            S(Integer.valueOf(teamOfTheRoundChatInterface.getUniqueTournamentId()), Integer.valueOf(teamOfTheRoundChatInterface.getSeasonId()));
        }
        D().m.e(getViewLifecycleOwner(), new z1(3, new Function1(this) { // from class: r43
            public final /* synthetic */ CommentsChatFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                CommentsChatFragment commentsChatFragment = this.b;
                switch (i3) {
                    case 0:
                        Event event2 = (Event) obj;
                        if (!commentsChatFragment.T) {
                            commentsChatFragment.T = true;
                            commentsChatFragment.V = event2;
                            event2.getClass();
                            Integer display3 = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                            commentsChatFragment.X = display3 != null ? display3.intValue() : 0;
                            Integer display4 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                            commentsChatFragment.Y = display4 != null ? display4.intValue() : 0;
                            UniqueTournament uniqueTournament = event2.getTournament().getUniqueTournament();
                            Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                            Season season = event2.getSeason();
                            commentsChatFragment.S(valueOf, season != null ? Integer.valueOf(season.getId()) : null);
                        }
                        event2.getClass();
                        if (Intrinsics.c(ok3.s(event2), Sports.FOOTBALL)) {
                            Integer display5 = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                            int intValue = display5 != null ? display5.intValue() : 0;
                            Integer display6 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                            int intValue2 = display6 != null ? display6.intValue() : 0;
                            int i4 = commentsChatFragment.X;
                            if (intValue > i4 || intValue2 > commentsChatFragment.Y) {
                                Team homeTeam$default = intValue > i4 ? Event.getHomeTeam$default(event2, null, 1, null) : Event.getAwayTeam$default(event2, null, 1, null);
                                commentsChatFragment.X = intValue;
                                commentsChatFragment.Y = intValue2;
                                krk krkVar = commentsChatFragment.l;
                                krkVar.getClass();
                                ScoreUpdateView scoreUpdateView = ((yn8) krkVar).m;
                                Context requireContext = commentsChatFragment.requireContext();
                                requireContext.getClass();
                                String p = tba.p(requireContext, homeTeam$default);
                                String string = commentsChatFragment.requireContext().getString(R.string.chat_goal_message);
                                string.getClass();
                                scoreUpdateView.n(p, string, null, Integer.valueOf(homeTeam$default.getId()), R.drawable.ic_ball_football);
                            }
                        }
                        break;
                    case 1:
                        mqi mqiVar = commentsChatFragment.W;
                        List list = (List) obj;
                        if (commentsChatFragment.U) {
                            ArrayList k = me4.k(list);
                            for (Object obj2 : list) {
                                if (obj2 instanceof Incident.VarDecisionIncident) {
                                    k.add(obj2);
                                }
                            }
                            for (Incident.VarDecisionIncident varDecisionIncident : CollectionsKt.t0(k, CollectionsKt.W0((List) mqiVar.getValue()))) {
                                ((List) mqiVar.getValue()).add(varDecisionIncident);
                                String incidentClass = varDecisionIncident.getIncidentClass();
                                if (Intrinsics.c(incidentClass, Incident.VarDecisionIncident.GOAL_NOT_AWARDED)) {
                                    if (varDecisionIncident.getConfirmed()) {
                                        krk krkVar2 = commentsChatFragment.l;
                                        krkVar2.getClass();
                                        ScoreUpdateView scoreUpdateView2 = ((yn8) krkVar2).m;
                                        String format = String.format(dla.d(), "%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(commentsChatFragment.X), Integer.valueOf(commentsChatFragment.Y)}, 2));
                                        String string2 = commentsChatFragment.getString(R.string.football_var_goal_cancelled);
                                        string2.getClass();
                                        Map map = qz9.a;
                                        Context requireContext2 = commentsChatFragment.requireContext();
                                        requireContext2.getClass();
                                        scoreUpdateView2.n(format, string2, qz9.a(requireContext2, varDecisionIncident), null, R.drawable.ic_var);
                                    }
                                } else if (Intrinsics.c(incidentClass, Incident.VarDecisionIncident.GOAL_AWARDED) && !varDecisionIncident.getConfirmed()) {
                                    krk krkVar3 = commentsChatFragment.l;
                                    krkVar3.getClass();
                                    ScoreUpdateView scoreUpdateView3 = ((yn8) krkVar3).m;
                                    String format2 = String.format(dla.d(), "%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(commentsChatFragment.X), Integer.valueOf(commentsChatFragment.Y)}, 2));
                                    String string3 = commentsChatFragment.getString(R.string.football_var_goal_cancelled);
                                    string3.getClass();
                                    Map map2 = qz9.a;
                                    Context requireContext3 = commentsChatFragment.requireContext();
                                    requireContext3.getClass();
                                    scoreUpdateView3.n(format2, string3, qz9.a(requireContext3, varDecisionIncident), null, R.drawable.ic_var);
                                }
                            }
                        } else {
                            commentsChatFragment.U = true;
                            List list2 = (List) mqiVar.getValue();
                            ArrayList k2 = me4.k(list);
                            for (Object obj3 : list) {
                                if (obj3 instanceof Incident.VarDecisionIncident) {
                                    k2.add(obj3);
                                }
                            }
                            list2.addAll(k2);
                        }
                        break;
                    default:
                        joa joaVar = commentsChatFragment.a0;
                        List list3 = (List) obj;
                        list3.getClass();
                        if (!list3.isEmpty() && commentsChatFragment.D().k == mf.c) {
                            commentsChatFragment.D().k = mf.d;
                            krk krkVar4 = commentsChatFragment.l;
                            krkVar4.getClass();
                            RecyclerView recyclerView = ((yn8) krkVar4).j;
                            Context requireContext4 = commentsChatFragment.requireContext();
                            requireContext4.getClass();
                            z8e.b0(recyclerView, requireContext4, false, false, null, 28);
                            commentsChatFragment.S = new elc(recyclerView);
                            recyclerView.setAdapter((hlc) joaVar.getValue());
                            recyclerView.setVisibility(0);
                        }
                        if (commentsChatFragment.D().k == mf.d) {
                            elc elcVar = commentsChatFragment.S;
                            if (elcVar != null) {
                                elcVar.e();
                            }
                            ((hlc) joaVar.getValue()).F(list3);
                            elc elcVar2 = commentsChatFragment.S;
                            if (elcVar2 != null) {
                                elcVar2.d();
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        L().D.e(getViewLifecycleOwner(), new z1(3, new Function1(this) { // from class: r43
            public final /* synthetic */ CommentsChatFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                CommentsChatFragment commentsChatFragment = this.b;
                switch (i3) {
                    case 0:
                        Event event2 = (Event) obj;
                        if (!commentsChatFragment.T) {
                            commentsChatFragment.T = true;
                            commentsChatFragment.V = event2;
                            event2.getClass();
                            Integer display3 = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                            commentsChatFragment.X = display3 != null ? display3.intValue() : 0;
                            Integer display4 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                            commentsChatFragment.Y = display4 != null ? display4.intValue() : 0;
                            UniqueTournament uniqueTournament = event2.getTournament().getUniqueTournament();
                            Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                            Season season = event2.getSeason();
                            commentsChatFragment.S(valueOf, season != null ? Integer.valueOf(season.getId()) : null);
                        }
                        event2.getClass();
                        if (Intrinsics.c(ok3.s(event2), Sports.FOOTBALL)) {
                            Integer display5 = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                            int intValue = display5 != null ? display5.intValue() : 0;
                            Integer display6 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                            int intValue2 = display6 != null ? display6.intValue() : 0;
                            int i4 = commentsChatFragment.X;
                            if (intValue > i4 || intValue2 > commentsChatFragment.Y) {
                                Team homeTeam$default = intValue > i4 ? Event.getHomeTeam$default(event2, null, 1, null) : Event.getAwayTeam$default(event2, null, 1, null);
                                commentsChatFragment.X = intValue;
                                commentsChatFragment.Y = intValue2;
                                krk krkVar = commentsChatFragment.l;
                                krkVar.getClass();
                                ScoreUpdateView scoreUpdateView = ((yn8) krkVar).m;
                                Context requireContext = commentsChatFragment.requireContext();
                                requireContext.getClass();
                                String p = tba.p(requireContext, homeTeam$default);
                                String string = commentsChatFragment.requireContext().getString(R.string.chat_goal_message);
                                string.getClass();
                                scoreUpdateView.n(p, string, null, Integer.valueOf(homeTeam$default.getId()), R.drawable.ic_ball_football);
                            }
                        }
                        break;
                    case 1:
                        mqi mqiVar = commentsChatFragment.W;
                        List list = (List) obj;
                        if (commentsChatFragment.U) {
                            ArrayList k = me4.k(list);
                            for (Object obj2 : list) {
                                if (obj2 instanceof Incident.VarDecisionIncident) {
                                    k.add(obj2);
                                }
                            }
                            for (Incident.VarDecisionIncident varDecisionIncident : CollectionsKt.t0(k, CollectionsKt.W0((List) mqiVar.getValue()))) {
                                ((List) mqiVar.getValue()).add(varDecisionIncident);
                                String incidentClass = varDecisionIncident.getIncidentClass();
                                if (Intrinsics.c(incidentClass, Incident.VarDecisionIncident.GOAL_NOT_AWARDED)) {
                                    if (varDecisionIncident.getConfirmed()) {
                                        krk krkVar2 = commentsChatFragment.l;
                                        krkVar2.getClass();
                                        ScoreUpdateView scoreUpdateView2 = ((yn8) krkVar2).m;
                                        String format = String.format(dla.d(), "%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(commentsChatFragment.X), Integer.valueOf(commentsChatFragment.Y)}, 2));
                                        String string2 = commentsChatFragment.getString(R.string.football_var_goal_cancelled);
                                        string2.getClass();
                                        Map map = qz9.a;
                                        Context requireContext2 = commentsChatFragment.requireContext();
                                        requireContext2.getClass();
                                        scoreUpdateView2.n(format, string2, qz9.a(requireContext2, varDecisionIncident), null, R.drawable.ic_var);
                                    }
                                } else if (Intrinsics.c(incidentClass, Incident.VarDecisionIncident.GOAL_AWARDED) && !varDecisionIncident.getConfirmed()) {
                                    krk krkVar3 = commentsChatFragment.l;
                                    krkVar3.getClass();
                                    ScoreUpdateView scoreUpdateView3 = ((yn8) krkVar3).m;
                                    String format2 = String.format(dla.d(), "%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(commentsChatFragment.X), Integer.valueOf(commentsChatFragment.Y)}, 2));
                                    String string3 = commentsChatFragment.getString(R.string.football_var_goal_cancelled);
                                    string3.getClass();
                                    Map map2 = qz9.a;
                                    Context requireContext3 = commentsChatFragment.requireContext();
                                    requireContext3.getClass();
                                    scoreUpdateView3.n(format2, string3, qz9.a(requireContext3, varDecisionIncident), null, R.drawable.ic_var);
                                }
                            }
                        } else {
                            commentsChatFragment.U = true;
                            List list2 = (List) mqiVar.getValue();
                            ArrayList k2 = me4.k(list);
                            for (Object obj3 : list) {
                                if (obj3 instanceof Incident.VarDecisionIncident) {
                                    k2.add(obj3);
                                }
                            }
                            list2.addAll(k2);
                        }
                        break;
                    default:
                        joa joaVar = commentsChatFragment.a0;
                        List list3 = (List) obj;
                        list3.getClass();
                        if (!list3.isEmpty() && commentsChatFragment.D().k == mf.c) {
                            commentsChatFragment.D().k = mf.d;
                            krk krkVar4 = commentsChatFragment.l;
                            krkVar4.getClass();
                            RecyclerView recyclerView = ((yn8) krkVar4).j;
                            Context requireContext4 = commentsChatFragment.requireContext();
                            requireContext4.getClass();
                            z8e.b0(recyclerView, requireContext4, false, false, null, 28);
                            commentsChatFragment.S = new elc(recyclerView);
                            recyclerView.setAdapter((hlc) joaVar.getValue());
                            recyclerView.setVisibility(0);
                        }
                        if (commentsChatFragment.D().k == mf.d) {
                            elc elcVar = commentsChatFragment.S;
                            if (elcVar != null) {
                                elcVar.e();
                            }
                            ((hlc) joaVar.getValue()).F(list3);
                            elc elcVar2 = commentsChatFragment.S;
                            if (elcVar2 != null) {
                                elcVar2.d();
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        final int i3 = 2;
        D().o.e(this, new z1(3, new Function1(this) { // from class: r43
            public final /* synthetic */ CommentsChatFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                CommentsChatFragment commentsChatFragment = this.b;
                switch (i32) {
                    case 0:
                        Event event2 = (Event) obj;
                        if (!commentsChatFragment.T) {
                            commentsChatFragment.T = true;
                            commentsChatFragment.V = event2;
                            event2.getClass();
                            Integer display3 = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                            commentsChatFragment.X = display3 != null ? display3.intValue() : 0;
                            Integer display4 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                            commentsChatFragment.Y = display4 != null ? display4.intValue() : 0;
                            UniqueTournament uniqueTournament = event2.getTournament().getUniqueTournament();
                            Integer valueOf = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                            Season season = event2.getSeason();
                            commentsChatFragment.S(valueOf, season != null ? Integer.valueOf(season.getId()) : null);
                        }
                        event2.getClass();
                        if (Intrinsics.c(ok3.s(event2), Sports.FOOTBALL)) {
                            Integer display5 = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                            int intValue = display5 != null ? display5.intValue() : 0;
                            Integer display6 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                            int intValue2 = display6 != null ? display6.intValue() : 0;
                            int i4 = commentsChatFragment.X;
                            if (intValue > i4 || intValue2 > commentsChatFragment.Y) {
                                Team homeTeam$default = intValue > i4 ? Event.getHomeTeam$default(event2, null, 1, null) : Event.getAwayTeam$default(event2, null, 1, null);
                                commentsChatFragment.X = intValue;
                                commentsChatFragment.Y = intValue2;
                                krk krkVar = commentsChatFragment.l;
                                krkVar.getClass();
                                ScoreUpdateView scoreUpdateView = ((yn8) krkVar).m;
                                Context requireContext = commentsChatFragment.requireContext();
                                requireContext.getClass();
                                String p = tba.p(requireContext, homeTeam$default);
                                String string = commentsChatFragment.requireContext().getString(R.string.chat_goal_message);
                                string.getClass();
                                scoreUpdateView.n(p, string, null, Integer.valueOf(homeTeam$default.getId()), R.drawable.ic_ball_football);
                            }
                        }
                        break;
                    case 1:
                        mqi mqiVar = commentsChatFragment.W;
                        List list = (List) obj;
                        if (commentsChatFragment.U) {
                            ArrayList k = me4.k(list);
                            for (Object obj2 : list) {
                                if (obj2 instanceof Incident.VarDecisionIncident) {
                                    k.add(obj2);
                                }
                            }
                            for (Incident.VarDecisionIncident varDecisionIncident : CollectionsKt.t0(k, CollectionsKt.W0((List) mqiVar.getValue()))) {
                                ((List) mqiVar.getValue()).add(varDecisionIncident);
                                String incidentClass = varDecisionIncident.getIncidentClass();
                                if (Intrinsics.c(incidentClass, Incident.VarDecisionIncident.GOAL_NOT_AWARDED)) {
                                    if (varDecisionIncident.getConfirmed()) {
                                        krk krkVar2 = commentsChatFragment.l;
                                        krkVar2.getClass();
                                        ScoreUpdateView scoreUpdateView2 = ((yn8) krkVar2).m;
                                        String format = String.format(dla.d(), "%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(commentsChatFragment.X), Integer.valueOf(commentsChatFragment.Y)}, 2));
                                        String string2 = commentsChatFragment.getString(R.string.football_var_goal_cancelled);
                                        string2.getClass();
                                        Map map = qz9.a;
                                        Context requireContext2 = commentsChatFragment.requireContext();
                                        requireContext2.getClass();
                                        scoreUpdateView2.n(format, string2, qz9.a(requireContext2, varDecisionIncident), null, R.drawable.ic_var);
                                    }
                                } else if (Intrinsics.c(incidentClass, Incident.VarDecisionIncident.GOAL_AWARDED) && !varDecisionIncident.getConfirmed()) {
                                    krk krkVar3 = commentsChatFragment.l;
                                    krkVar3.getClass();
                                    ScoreUpdateView scoreUpdateView3 = ((yn8) krkVar3).m;
                                    String format2 = String.format(dla.d(), "%d - %d", Arrays.copyOf(new Object[]{Integer.valueOf(commentsChatFragment.X), Integer.valueOf(commentsChatFragment.Y)}, 2));
                                    String string3 = commentsChatFragment.getString(R.string.football_var_goal_cancelled);
                                    string3.getClass();
                                    Map map2 = qz9.a;
                                    Context requireContext3 = commentsChatFragment.requireContext();
                                    requireContext3.getClass();
                                    scoreUpdateView3.n(format2, string3, qz9.a(requireContext3, varDecisionIncident), null, R.drawable.ic_var);
                                }
                            }
                        } else {
                            commentsChatFragment.U = true;
                            List list2 = (List) mqiVar.getValue();
                            ArrayList k2 = me4.k(list);
                            for (Object obj3 : list) {
                                if (obj3 instanceof Incident.VarDecisionIncident) {
                                    k2.add(obj3);
                                }
                            }
                            list2.addAll(k2);
                        }
                        break;
                    default:
                        joa joaVar = commentsChatFragment.a0;
                        List list3 = (List) obj;
                        list3.getClass();
                        if (!list3.isEmpty() && commentsChatFragment.D().k == mf.c) {
                            commentsChatFragment.D().k = mf.d;
                            krk krkVar4 = commentsChatFragment.l;
                            krkVar4.getClass();
                            RecyclerView recyclerView = ((yn8) krkVar4).j;
                            Context requireContext4 = commentsChatFragment.requireContext();
                            requireContext4.getClass();
                            z8e.b0(recyclerView, requireContext4, false, false, null, 28);
                            commentsChatFragment.S = new elc(recyclerView);
                            recyclerView.setAdapter((hlc) joaVar.getValue());
                            recyclerView.setVisibility(0);
                        }
                        if (commentsChatFragment.D().k == mf.d) {
                            elc elcVar = commentsChatFragment.S;
                            if (elcVar != null) {
                                elcVar.e();
                            }
                            ((hlc) joaVar.getValue()).F(list3);
                            elc elcVar2 = commentsChatFragment.S;
                            if (elcVar2 != null) {
                                elcVar2.d();
                            }
                        }
                        break;
                }
                return Unit.a;
            }
        }));
    }

    @Override // com.sofascore.results.chat.fragment.AbstractChatFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        Event event;
        Event event2 = this.V;
        rq3 rq3Var = null;
        if (event2 != null && Intrinsics.c(event2.getSportSlug(), Sports.FOOTBALL) && (event = this.V) != null && ok3.D(event)) {
            us2 L = L();
            Event event3 = this.V;
            event3.getClass();
            xw3.L(un0.z(L), null, null, new g2(L, event3, rq3Var, 21), 3);
        }
        ChatInterface chatInterface = D().j;
        Tournament tournament = chatInterface instanceof Tournament ? (Tournament) chatInterface : null;
        if (tournament != null) {
            if (!Intrinsics.c(tournament.getCategory().getSport().getSlug(), Sports.MMA)) {
                tournament = null;
            }
            if (tournament != null) {
                pq2 D = D();
                UniqueTournament uniqueTournament = tournament.getUniqueTournament();
                xw3.L(un0.z(D), null, null, new oq2(D, uniqueTournament != null ? uniqueTournament.getId() : -1, tournament.getId(), null), 3);
            }
        }
    }
}
