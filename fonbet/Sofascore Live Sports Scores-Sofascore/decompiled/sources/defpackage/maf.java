package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.FirstTeamToScoreOptions;
import com.sofascore.model.newNetwork.PredictedEvent;
import com.sofascore.model.newNetwork.Vote;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.model.newNetwork.WillBothTeamsScoreOptions;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class maf extends p8 {
    public final /* synthetic */ int c = 1;
    public final boolean d;
    public final boolean e;
    public final krk f;
    public final Object g;
    public final Object h;
    public final Object i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public maf(n9i n9iVar, iai iaiVar, boolean z, boolean z2) {
        super(r0);
        iaiVar.getClass();
        ConstraintLayout constraintLayout = n9iVar.a;
        constraintLayout.getClass();
        this.f = n9iVar;
        this.g = iaiVar;
        this.d = z;
        this.e = z2;
        this.h = b.j(n9iVar.b, n9iVar.c, n9iVar.d, n9iVar.e, n9iVar.f, n9iVar.g, n9iVar.h, n9iVar.i, n9iVar.j);
        this.i = tub.h(new Pair(n9iVar.w, n9iVar.l), new Pair(n9iVar.x, n9iVar.m), new Pair(n9iVar.y, n9iVar.n), new Pair(n9iVar.z, n9iVar.o), new Pair(n9iVar.A, n9iVar.p), new Pair(n9iVar.B, n9iVar.q));
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0640, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r17 != null ? r17.getFractionalValue() : null, "-") == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0345, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r3.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0702  */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        Iterator it;
        float f;
        int i3;
        String upperCase;
        int i4;
        String upperCase2;
        String str;
        maf mafVar = this;
        int i5 = 8;
        int i6 = 0;
        switch (mafVar.c) {
            case 0:
                xaf xafVar = (xaf) obj;
                boolean z = mafVar.d;
                boolean z2 = mafVar.e;
                xafVar.getClass();
                PredictedEvent predictedEvent = xafVar.a;
                boolean shouldReverseTeams = predictedEvent.shouldReverseTeams();
                p12 p12Var = (p12) mafVar.f;
                sea.v((ConstraintLayout) p12Var.b, true, true, 12, 0, 0, null, 120);
                aba.y((ConstraintLayout) p12Var.b, 0, 3);
                z8e.a0((ConstraintLayout) p12Var.b, 1000L, new zbe(16, mafVar, predictedEvent));
                TextView textView = (TextView) p12Var.g;
                Context context = mafVar.b;
                long startDateTimestamp = predictedEvent.getStartDateTimestamp();
                context.getClass();
                String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
                bestPattern.getClass();
                fn0.u(startDateTimestamp, hk4.a(bestPattern), textView);
                Team awayTeam = shouldReverseTeams ? predictedEvent.getAwayTeam() : predictedEvent.getHomeTeam();
                Team homeTeam = shouldReverseTeams ? predictedEvent.getHomeTeam() : predictedEvent.getAwayTeam();
                ((TextView) p12Var.c).setText(tba.p(context, awayTeam));
                ((TextView) p12Var.k).setText(qea.K(tba.p(context, homeTeam), shouldReverseTeams));
                int i7 = 1;
                as9.p((ImageView) p12Var.f, awayTeam, true);
                as9.p((ImageView) p12Var.j, homeTeam, true);
                List<m8g> j = b.j((m8g) p12Var.e, (m8g) p12Var.i, (m8g) p12Var.l);
                Iterator it2 = j.iterator();
                while (it2.hasNext()) {
                    ((m8g) it2.next()).a.setVisibility(8);
                }
                if (z) {
                    boolean z3 = predictedEvent.getStartDateTimestamp() - xe6.c().b().longValue() > 0 && Intrinsics.c(predictedEvent.getStatus().getType(), StatusKt.STATUS_NOT_STARTED);
                    for (m8g m8gVar : j) {
                        View view = m8gVar.b;
                        if (z3) {
                            i5 = 0;
                        }
                        view.setVisibility(i5);
                        m8gVar.c.setVisibility(z3 ? 0 : 8);
                        i5 = 8;
                    }
                }
                List<Vote> votes = predictedEvent.getVotes();
                if (votes != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : votes) {
                        if (((Vote) obj2).getVoteType() != VoteType.MMA_POST_MATCH_VOTING) {
                            arrayList.add(obj2);
                        }
                    }
                    List H0 = CollectionsKt.H0(arrayList, new laf(i6));
                    if (H0 != null) {
                        Iterator it3 = H0.iterator();
                        int i8 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                b.q();
                                throw null;
                            }
                            Vote vote = (Vote) next;
                            if (i8 <= 2) {
                                ((m8g) j.get(i8)).a.setVisibility(i6);
                                VoteType voteType = vote.getVoteType();
                                int i10 = voteType == null ? -1 : kaf.a[voteType.ordinal()];
                                if (i10 == i7) {
                                    ((m8g) j.get(i8)).d.setText(context.getString(R.string.who_will_win));
                                    Unit unit = Unit.a;
                                } else if (i10 == 2) {
                                    ((m8g) j.get(i8)).d.setText(context.getString(R.string.will_both_teams_score_title));
                                    Unit unit2 = Unit.a;
                                } else if (i10 != 3) {
                                    Unit unit3 = Unit.a;
                                } else {
                                    ((m8g) j.get(i8)).d.setText(context.getString(R.string.who_will_score_first_title));
                                    Unit unit4 = Unit.a;
                                }
                                Float score = vote.getScore();
                                if (z2) {
                                    Object obj3 = j.get(i8);
                                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    ((m8g) obj3).f.setVisibility(i6);
                                    if (score != null) {
                                        TextView textView2 = ((m8g) j.get(i8)).f;
                                        String str2 = score.floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? "+" : "";
                                        Float score2 = vote.getScore();
                                        if (score2 != null) {
                                            it = it3;
                                            str = yid.d("%.2f", score2);
                                        } else {
                                            it = it3;
                                            Regex regex = yid.a;
                                            str = null;
                                        }
                                        l4a.K(textView2, str2 + str);
                                    } else {
                                        it = it3;
                                        ((m8g) j.get(i8)).f.setText((CharSequence) null);
                                    }
                                    TextView textView3 = ((m8g) j.get(i8)).d;
                                    Drawable drawable = (Drawable) ((joa) mafVar.i).getValue();
                                    if (!z || vote.getVoteType() != VoteType.WHO_WILL_WIN || vote.getWeeklyChallengeBonusDateTimestamp() == null) {
                                        drawable = null;
                                    }
                                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                                } else {
                                    it = it3;
                                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    TextView textView4 = ((m8g) j.get(i8)).f;
                                    OddsChoice odds = vote.getOdds();
                                    textView4.setText(rld.m(context, odds != null ? odds.getFractionalValue() : null));
                                    TextView textView5 = ((m8g) j.get(i8)).f;
                                    if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                                        SharedPreferences sharedPreferences = uic.j;
                                        if (sharedPreferences == null) {
                                            Context applicationContext = context.getApplicationContext();
                                            synchronized (uic.i) {
                                                sharedPreferences = a5f.d(applicationContext);
                                                uic.j = sharedPreferences;
                                            }
                                            sharedPreferences.getClass();
                                        }
                                        ccd ccdVar = vl.b;
                                        break;
                                    }
                                    if (xld.g(context)) {
                                        i3 = 0;
                                        textView5.setVisibility(i3);
                                    }
                                    i3 = 8;
                                    textView5.setVisibility(i3);
                                }
                                TextView textView6 = ((m8g) j.get(i8)).e;
                                ViewGroup.LayoutParams layoutParams = textView6.getLayoutParams();
                                if (layoutParams == null) {
                                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    return;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMarginEnd(ao2.s(((m8g) j.get(i8)).f.getVisibility() == 0 ? 8 : 12, context));
                                textView6.setLayoutParams(marginLayoutParams);
                                z8e.a0(((m8g) j.get(i8)).c, 1000L, new l97(22, vote, mafVar, predictedEvent));
                                aba.y(((m8g) j.get(i8)).c, 0, 3);
                                int s = ao2.s(8, context);
                                if (shouldReverseTeams) {
                                    TextView textView7 = ((m8g) j.get(i8)).e;
                                    ViewGroup.LayoutParams layoutParams2 = textView7.getLayoutParams();
                                    if (layoutParams2 == null) {
                                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        return;
                                    }
                                    layoutParams2.width = ao2.s(48, context);
                                    textView7.setLayoutParams(layoutParams2);
                                    ((m8g) j.get(i8)).e.setPadding(0, 0, 0, 0);
                                    VoteType voteType2 = vote.getVoteType();
                                    int i11 = voteType2 != null ? kaf.a[voteType2.ordinal()] : -1;
                                    if (i11 == 1) {
                                        TextView textView8 = ((m8g) j.get(i8)).e;
                                        String choice = WhoWillWinOptions.DRAW.getChoice();
                                        String upperCase3 = vote.getVote().toUpperCase(Locale.ROOT);
                                        upperCase3.getClass();
                                        textView8.setText(Intrinsics.c(choice, upperCase3) ? "Tie" : Intrinsics.c(WhoWillWinOptions.HOME_TEAM_WIN.getChoice(), vote.getVote()) ? predictedEvent.getHomeNameCode() : predictedEvent.getAwayNameCode());
                                    } else if (i11 == 2) {
                                        TextView textView9 = ((m8g) j.get(i8)).e;
                                        ViewGroup.LayoutParams layoutParams3 = textView9.getLayoutParams();
                                        if (layoutParams3 == null) {
                                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                            return;
                                        }
                                        layoutParams3.width = -2;
                                        textView9.setLayoutParams(layoutParams3);
                                        ((m8g) j.get(i8)).e.setPadding(s, 0, s, 0);
                                        TextView textView10 = ((m8g) j.get(i8)).e;
                                        if (Intrinsics.c(WillBothTeamsScoreOptions.NO.getChoice(), vote.getVote())) {
                                            String string = context.getString(R.string.no);
                                            string.getClass();
                                            upperCase2 = string.toUpperCase(Locale.ROOT);
                                            upperCase2.getClass();
                                        } else if (Intrinsics.c(WillBothTeamsScoreOptions.YES.getChoice(), vote.getVote())) {
                                            String string2 = context.getString(R.string.yes);
                                            string2.getClass();
                                            upperCase2 = string2.toUpperCase(Locale.ROOT);
                                            upperCase2.getClass();
                                        } else {
                                            upperCase2 = vote.getVote().toUpperCase(Locale.ROOT);
                                            upperCase2.getClass();
                                        }
                                        textView10.setText(upperCase2);
                                    } else if (i11 == 3) {
                                        if (Intrinsics.c(FirstTeamToScoreOptions.HOME_TEAM_SCORE_FIRST.getChoice(), vote.getVote())) {
                                            ((m8g) j.get(i8)).e.setText(predictedEvent.getHomeNameCode());
                                        } else if (Intrinsics.c(FirstTeamToScoreOptions.AWAY_TEAM_SCORE_FIRST.getChoice(), vote.getVote())) {
                                            ((m8g) j.get(i8)).e.setText(predictedEvent.getAwayNameCode());
                                        } else {
                                            TextView textView11 = ((m8g) j.get(i8)).e;
                                            ViewGroup.LayoutParams layoutParams4 = textView11.getLayoutParams();
                                            if (layoutParams4 == null) {
                                                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                                return;
                                            }
                                            layoutParams4.width = -2;
                                            textView11.setLayoutParams(layoutParams4);
                                            ((m8g) j.get(i8)).e.setPadding(s, 0, s, 0);
                                            TextView textView12 = ((m8g) j.get(i8)).e;
                                            String string3 = context.getString(R.string.no_goal);
                                            string3.getClass();
                                            String upperCase4 = string3.toUpperCase(Locale.ROOT);
                                            upperCase4.getClass();
                                            textView12.setText(upperCase4);
                                        }
                                    }
                                } else {
                                    TextView textView13 = ((m8g) j.get(i8)).e;
                                    ViewGroup.LayoutParams layoutParams5 = textView13.getLayoutParams();
                                    if (layoutParams5 == null) {
                                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                        return;
                                    }
                                    layoutParams5.width = -2;
                                    textView13.setLayoutParams(layoutParams5);
                                    TextView textView14 = ((m8g) j.get(i8)).e;
                                    if (vote.getVoteType() == VoteType.FIRST_TEAM_TO_SCORE && Intrinsics.c(vote.getVote(), "noGoal")) {
                                        String string4 = context.getString(R.string.no_goal);
                                        string4.getClass();
                                        upperCase = string4.toUpperCase(Locale.ROOT);
                                        upperCase.getClass();
                                    } else {
                                        VoteType voteType3 = vote.getVoteType();
                                        VoteType voteType4 = VoteType.WILL_BOTH_TEAMS_SCORE;
                                        if (voteType3 == voteType4 && Intrinsics.c(vote.getVote(), WillBothTeamsScoreOptions.NO.getChoice())) {
                                            String string5 = context.getString(R.string.no);
                                            string5.getClass();
                                            upperCase = string5.toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                        } else if (vote.getVoteType() == voteType4 && Intrinsics.c(vote.getVote(), WillBothTeamsScoreOptions.YES.getChoice())) {
                                            String string6 = context.getString(R.string.yes);
                                            string6.getClass();
                                            upperCase = string6.toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                        } else {
                                            upperCase = vote.getVote().toUpperCase(Locale.ROOT);
                                            upperCase.getClass();
                                        }
                                    }
                                    textView14.setText(upperCase);
                                    if (vote.getVote().length() > 1) {
                                        ((m8g) j.get(i8)).e.setPadding(s, 0, s, 0);
                                    } else {
                                        ((m8g) j.get(i8)).e.setPadding(0, 0, 0, 0);
                                    }
                                }
                                if (!z2) {
                                    OddsChoice odds2 = vote.getOdds();
                                    if ((odds2 != null ? odds2.getFractionalValue() : null) != null) {
                                        OddsChoice odds3 = vote.getOdds();
                                        break;
                                    }
                                    ((m8g) j.get(i8)).f.setTextColor(context.getColor(R.color.n_lv_3));
                                    ((m8g) j.get(i8)).e.setBackgroundTintList(eq3.q(R.color.surface_2, context));
                                    ((m8g) j.get(i8)).e.setTextColor(context.getColor(R.color.n_lv_1));
                                    i4 = kaf.b[vote.getCorrect().ordinal()];
                                    i7 = 1;
                                    if (i4 != 1) {
                                        TextView textView15 = ((m8g) j.get(i8)).e;
                                        textView15.setTextColor(textView15.getContext().getColor(R.color.surface_1));
                                        textView15.setBackgroundTintList(eq3.q(R.color.success, textView15.getContext()));
                                    } else if (i4 != 2) {
                                        TextView textView16 = ((m8g) j.get(i8)).e;
                                        textView16.setTextColor(textView16.getContext().getColor(R.color.n_lv_1));
                                        textView16.setBackgroundTintList(eq3.q(R.color.surface_2, textView16.getContext()));
                                    } else {
                                        TextView textView17 = ((m8g) j.get(i8)).e;
                                        textView17.setTextColor(textView17.getContext().getColor(R.color.surface_1));
                                        textView17.setBackgroundTintList(eq3.q(R.color.error, textView17.getContext()));
                                    }
                                }
                                ((m8g) j.get(i8)).f.setTextColor(z2 ? (score == null || score.floatValue() <= f) ? (score == null || score.floatValue() != f) ? context.getColor(R.color.error) : context.getColor(R.color.n_lv_3) : context.getColor(R.color.secondary_default) : context.getColor(R.color.secondary_default));
                                i4 = kaf.b[vote.getCorrect().ordinal()];
                                i7 = 1;
                                if (i4 != 1) {
                                }
                            } else {
                                it = it3;
                            }
                            mafVar = this;
                            i8 = i9;
                            it3 = it;
                            i6 = 0;
                        }
                        Unit unit5 = Unit.a;
                        return;
                    }
                    return;
                }
                return;
            default:
                bbi bbiVar = (bbi) obj;
                bbiVar.getClass();
                n9i n9iVar = (n9i) mafVar.f;
                y6a.u(n9iVar, bbiVar, (iai) mafVar.g, (List) mafVar.h, (Map) mafVar.i, mafVar.e);
                ConstraintLayout constraintLayout = n9iVar.a;
                constraintLayout.getClass();
                sea.v(constraintLayout, false, bbiVar.k, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                ConstraintLayout constraintLayout2 = n9iVar.t;
                constraintLayout2.getClass();
                constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingEnd(), bbiVar.k ? ao2.s(8, mafVar.b) : 0);
                if (mafVar.d) {
                    constraintLayout.getClass();
                    ViewGroup.LayoutParams layoutParams6 = constraintLayout.getLayoutParams();
                    if (layoutParams6 == null) {
                        yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    int i12 = marginLayoutParams2.topMargin;
                    int i13 = marginLayoutParams2.bottomMargin;
                    marginLayoutParams2.setMarginStart(0);
                    marginLayoutParams2.topMargin = i12;
                    marginLayoutParams2.setMarginEnd(0);
                    marginLayoutParams2.bottomMargin = i13;
                    constraintLayout.setLayoutParams(marginLayoutParams2);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public maf(p12 p12Var, boolean z, boolean z2, Function2 function2, Function1 function1) {
        super(r0);
        function2.getClass();
        function1.getClass();
        FrameLayout frameLayout = (FrameLayout) p12Var.h;
        frameLayout.getClass();
        this.f = p12Var;
        this.d = z;
        this.e = z2;
        this.g = function2;
        this.h = function1;
        this.i = ypa.a(ysa.c, new ate(this, 15));
    }
}
