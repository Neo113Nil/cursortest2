package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.mvvm.model.ActiveTimeout;
import com.sofascore.model.mvvm.model.BasketballEvent;
import com.sofascore.model.mvvm.model.BonusInfo;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.FootballEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamSeasonForm;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.TimeoutType;
import com.sofascore.model.mvvm.model.TimeoutsInfo;
import com.sofascore.model.mvvm.model.VarInProgress;
import com.sofascore.results.R;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.sofascore.results.view.header.TeamLogoView;
import com.sofascore.results.view.header.TimeoutsView;
import com.sofascore.results.view.header.widget.RollingTextView;
import com.sofascore.results.view.header.widget.TimerGoalAnimatedView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class e21 extends s21 implements ua0 {
    public static final /* synthetic */ int E = 0;
    public final FollowActionButton A;
    public final TeamLogoView B;
    public final TeamLogoView C;
    public final mqi D;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final Rect o;
    public TimerGoalAnimatedView p;
    public TextView q;
    public nsk r;
    public final int s;
    public float t;
    public float u;
    public float v;
    public int w;
    public final xnh x;
    public final zla y;
    public final FollowActionButton z;

    public e21(Context context) {
        super(context);
        this.j = context.getColor(R.color.on_color_primary);
        this.k = context.getColor(R.color.on_color_secondary);
        this.l = context.getColor(R.color.stayDarkLive);
        this.m = context.getColor(R.color.crowdsourcing_live);
        boolean c0 = hkg.c0(context);
        this.n = c0;
        this.o = new Rect();
        this.x = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_collapsible_event_header, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.additional_info_container;
        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.additional_info_container, inflate);
        if (frameLayout != null) {
            i = R.id.bell_button_first_team;
            FollowActionButton followActionButton = (FollowActionButton) nq8.B(R.id.bell_button_first_team, inflate);
            if (followActionButton != null) {
                i = R.id.bell_button_second_team;
                FollowActionButton followActionButton2 = (FollowActionButton) nq8.B(R.id.bell_button_second_team, inflate);
                if (followActionButton2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    i = R.id.event_date;
                    TextView textView = (TextView) nq8.B(R.id.event_date, inflate);
                    if (textView != null) {
                        i = R.id.first_bonus_indicator;
                        TextView textView2 = (TextView) nq8.B(R.id.first_bonus_indicator, inflate);
                        if (textView2 != null) {
                            i = R.id.first_sub_team_name;
                            TextView textView3 = (TextView) nq8.B(R.id.first_sub_team_name, inflate);
                            if (textView3 != null) {
                                i = R.id.first_team_logo;
                                TeamLogoView teamLogoView = (TeamLogoView) nq8.B(R.id.first_team_logo, inflate);
                                if (teamLogoView != null) {
                                    i = R.id.first_team_name;
                                    TextView textView4 = (TextView) nq8.B(R.id.first_team_name, inflate);
                                    if (textView4 != null) {
                                        i = R.id.first_timeouts;
                                        TimeoutsView timeoutsView = (TimeoutsView) nq8.B(R.id.first_timeouts, inflate);
                                        if (timeoutsView != null) {
                                            i = R.id.first_to_label;
                                            TextView textView5 = (TextView) nq8.B(R.id.first_to_label, inflate);
                                            if (textView5 != null) {
                                                i = R.id.info_container_barrier;
                                                if (((Barrier) nq8.B(R.id.info_container_barrier, inflate)) != null) {
                                                    i = R.id.names_bottom_barrier;
                                                    if (((Barrier) nq8.B(R.id.names_bottom_barrier, inflate)) != null) {
                                                        i = R.id.result;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.result, inflate);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.second_bonus_indicator;
                                                            TextView textView6 = (TextView) nq8.B(R.id.second_bonus_indicator, inflate);
                                                            if (textView6 != null) {
                                                                i = R.id.second_sub_team_name;
                                                                TextView textView7 = (TextView) nq8.B(R.id.second_sub_team_name, inflate);
                                                                if (textView7 != null) {
                                                                    i = R.id.second_team_logo;
                                                                    TeamLogoView teamLogoView2 = (TeamLogoView) nq8.B(R.id.second_team_logo, inflate);
                                                                    if (teamLogoView2 != null) {
                                                                        i = R.id.second_team_name;
                                                                        TextView textView8 = (TextView) nq8.B(R.id.second_team_name, inflate);
                                                                        if (textView8 != null) {
                                                                            i = R.id.second_timeouts;
                                                                            TimeoutsView timeoutsView2 = (TimeoutsView) nq8.B(R.id.second_timeouts, inflate);
                                                                            if (timeoutsView2 != null) {
                                                                                i = R.id.second_to_label;
                                                                                TextView textView9 = (TextView) nq8.B(R.id.second_to_label, inflate);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.timeouts_group;
                                                                                    Group group = (Group) nq8.B(R.id.timeouts_group, inflate);
                                                                                    if (group != null) {
                                                                                        i = R.id.timeouts_text;
                                                                                        TextView textView10 = (TextView) nq8.B(R.id.timeouts_text, inflate);
                                                                                        if (textView10 != null) {
                                                                                            i = R.id.toolbar_barrier;
                                                                                            Guideline guideline = (Guideline) nq8.B(R.id.toolbar_barrier, inflate);
                                                                                            if (guideline != null) {
                                                                                                this.y = new zla(constraintLayout, frameLayout, followActionButton, followActionButton2, textView, textView2, textView3, teamLogoView, textView4, timeoutsView, textView5, constraintLayout2, textView6, textView7, teamLogoView2, textView8, timeoutsView2, textView9, group, textView10, guideline);
                                                                                                this.z = followActionButton;
                                                                                                this.A = followActionButton2;
                                                                                                this.B = teamLogoView;
                                                                                                this.C = teamLogoView2;
                                                                                                this.D = ypa.b(new z0(this, 18));
                                                                                                TypedValue typedValue = new TypedValue();
                                                                                                int i2 = 1;
                                                                                                this.s = context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics()) : ao2.s(48, context);
                                                                                                aba.y(teamLogoView, 0, 1);
                                                                                                aba.y(teamLogoView2, 0, 1);
                                                                                                if (!followActionButton.isLaidOut() || followActionButton.isLayoutRequested()) {
                                                                                                    followActionButton.addOnLayoutChangeListener(new a21(this, i2));
                                                                                                    return;
                                                                                                } else {
                                                                                                    this.t = (-getFollowButtonFirstTeam().getX()) + (c0 ? getWidth() : -getFollowButtonFirstTeam().getWidth());
                                                                                                    return;
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    private final int getAdditionalInfoContainerHeight() {
        return this.y.b.getHeight();
    }

    private final AppBarLayout getAppBarLayout() {
        return (AppBarLayout) this.D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getResultCenterY() {
        return r1.l.getBottom() - this.y.l.getPivotY();
    }

    public static String k(Context context, String str, String str2, boolean z) {
        context.getClass();
        String str3 = z ? " - " : "-";
        return hkg.c0(context) ? wv8.i(str2, str3, str) : wv8.i(str, str3, str2);
    }

    public static void p(TextView textView, ActiveTimeout activeTimeout, Event event) {
        int i;
        textView.setVisibility(activeTimeout == null ? 4 : 0);
        if (textView.getVisibility() == 0) {
            int m = yid.m(activeTimeout != null ? activeTimeout.getTeamId() : null);
            Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
            if (homeTeam$default.getId() != m) {
                homeTeam$default = null;
            }
            if (homeTeam$default == null) {
                homeTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                if (homeTeam$default.getId() != m) {
                    homeTeam$default = null;
                }
            }
            String nameCode = homeTeam$default != null ? homeTeam$default.getNameCode() : null;
            TimeoutType type = activeTimeout != null ? activeTimeout.getType() : null;
            int i2 = type == null ? -1 : z11.a[type.ordinal()];
            if (i2 == 1) {
                textView.setText(nameCode != null ? lnb.o(nameCode, " ", textView.getContext().getString(R.string.basketball_status_timeout_short)) : textView.getContext().getString(R.string.basketball_status_timeout_long));
            } else if (i2 == 2) {
                textView.setText(R.string.basketball_status_tv_timeout);
            } else if (i2 == 3) {
                textView.setText(R.string.basketball_status_coaches_challenge_short);
            } else if (i2 != 4) {
                textView.setText(R.string.basketball_status_timeout_long);
            } else {
                textView.setText(R.string.basketball_status_referee_timeout);
            }
            Team homeTeam$default2 = Event.getHomeTeam$default(event, null, 1, null);
            int i3 = R.drawable.ic_advantage_arrow_left_8;
            if (homeTeam$default != homeTeam$default2) {
                i = 0;
            } else {
                Context context = textView.getContext();
                context.getClass();
                i = hkg.c0(context) ? R.drawable.ic_advantage_arrow_right_8 : R.drawable.ic_advantage_arrow_left_8;
            }
            if (homeTeam$default != Event.getAwayTeam$default(event, null, 1, null)) {
                i3 = 0;
            } else {
                Context context2 = textView.getContext();
                context2.getClass();
                if (!hkg.c0(context2)) {
                    i3 = R.drawable.ic_advantage_arrow_right_8;
                }
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, i3, 0);
        }
    }

    @Override // defpackage.ua0
    public void a(AppBarLayout appBarLayout, int i) {
        if (appBarLayout.getTotalScrollRange() < 0.001d) {
            return;
        }
        setProgress((-i) / appBarLayout.getTotalScrollRange());
        if (Float.isNaN(getProgress()) || Float.isInfinite(getProgress())) {
            return;
        }
        s();
        zla zlaVar = this.y;
        t(this.B, zlaVar.i, zlaVar.g, this.z, zlaVar.k, zlaVar.j, zlaVar.f, 8388611);
        t(this.C, zlaVar.p, zlaVar.n, this.A, zlaVar.r, zlaVar.q, zlaVar.m, 8388613);
        r();
        float progress = ((1.0f - getProgress()) * getAdditionalInfoContainerHeight()) + (getProgress() * ((getHeight() - this.v) - (this.s / 2.0f)));
        TextView textView = zlaVar.t;
        textView.setTranslationY(progress);
        textView.setAlpha(1.0f - (getProgress() * 5.0f));
    }

    @Override // defpackage.s21
    public final Pair b() {
        krk j = j(b21.b, R.layout.view_event_result_date, r21.f);
        j.getClass();
        nsk nskVar = (nsk) j;
        this.r = nskVar;
        return new Pair(nskVar.c, nskVar.d);
    }

    @Override // defpackage.s21
    public /* bridge */ /* synthetic */ krk getBinding() {
        return this.y;
    }

    @NotNull
    public final TeamLogoView getFirstTeamLogo() {
        return this.B;
    }

    @Override // defpackage.s21
    @NotNull
    public final FollowActionButton getFollowButtonFirstTeam() {
        return this.z;
    }

    @Override // defpackage.s21
    @NotNull
    public final FollowActionButton getFollowButtonSecondTeam() {
        return this.A;
    }

    public final float getProgress() {
        return this.x.h();
    }

    @NotNull
    public final TeamLogoView getSecondTeamLogo() {
        return this.C;
    }

    @Nullable
    public final TimerGoalAnimatedView getTimerTextView() {
        return this.p;
    }

    public final void i() {
        if (this.e) {
            int i = 0;
            setLayoutChanged(false);
            ConstraintLayout constraintLayout = this.y.l;
            if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                constraintLayout.addOnLayoutChangeListener(new a21(this, i));
                return;
            }
            this.v = getFirstTeamLogo().getBottom() - getFirstTeamLogo().getPivotY();
            this.u = getResultCenterY();
            if (isAttachedToWindow()) {
                ConstraintLayout constraintLayout2 = getBinding().l;
                Rect rect = this.o;
                constraintLayout2.getGlobalVisibleRect(rect);
                boolean z = this.n;
                int i2 = z ? rect.right : rect.left;
                getFirstTeamLogo().getGlobalVisibleRect(rect);
                this.w = i2 - (z ? rect.left : rect.right);
            }
        }
    }

    public final krk j(Function1 function1, int i, r21 r21Var) {
        r21 viewStatus = getViewStatus();
        zla zlaVar = this.y;
        if (viewStatus != r21Var) {
            zlaVar.l.removeAllViews();
            setViewStatus(r21Var);
            setResultView(null);
            this.r = null;
            this.q = null;
            setLayoutChanged(true);
        }
        if (r21Var != r21.b && r21Var != r21.d) {
            ConstraintLayout constraintLayout = zlaVar.l;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return null;
            }
            tl3 tl3Var = (tl3) layoutParams;
            Context context = getContext();
            context.getClass();
            ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = ao2.s(8, context);
            constraintLayout.setLayoutParams(tl3Var);
        }
        ViewGroup resultView = getResultView();
        if (resultView == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(i, zlaVar.l);
            inflate.getClass();
            resultView = (ConstraintLayout) inflate;
        }
        if (getResultView() == null) {
            setResultView(resultView);
        }
        return (krk) function1.invoke(resultView);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x04f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0521 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0508  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lsk l(Event event) {
        int i;
        TimerGoalAnimatedView timerGoalAnimatedView;
        Boolean bool;
        Long l;
        String m;
        RollingTextView rollingTextView;
        Object obj;
        int i2;
        VarInProgress varInProgress;
        int i3;
        String B;
        jfj C;
        ConstraintLayout constraintLayout;
        int i4;
        BonusInfo bonusInfo;
        boolean z;
        String str;
        String valueOf;
        int i5;
        boolean z2;
        String u;
        String point;
        Event event2 = event;
        if (m(event)) {
            return null;
        }
        boolean contains = getInProgressOrInterruptedStatuses().contains(event2.getStatus().getType());
        krk j = j(d21.b, R.layout.view_event_result, r21.e);
        j.getClass();
        lsk lskVar = (lsk) j;
        RollingTextView rollingTextView2 = lskVar.i;
        RollingTextView rollingTextView3 = lskVar.h;
        TimerGoalAnimatedView timerGoalAnimatedView2 = lskVar.l;
        TextView textView = lskVar.e;
        TextView textView2 = lskVar.b;
        TextView textView3 = lskVar.f;
        TextView textView4 = lskVar.j;
        u(rollingTextView3, rollingTextView2, Event.getHomeScore$default(event2, null, 1, null).getDisplay(), Event.getAwayScore$default(event2, null, 1, null).getDisplay(), me4.t(StatusKt.STATUS_IN_PROGRESS, event2));
        textView4.setText(" - ");
        ImageView imageView = lskVar.g;
        Integer aggregatedWinnerCode$default = Event.getAggregatedWinnerCode$default(event2, null, 1, null);
        imageView.setVisibility((aggregatedWinnerCode$default != null && aggregatedWinnerCode$default.intValue() == 1) ? 0 : 8);
        ImageView imageView2 = lskVar.k;
        Integer aggregatedWinnerCode$default2 = Event.getAggregatedWinnerCode$default(event2, null, 1, null);
        imageView2.setVisibility((aggregatedWinnerCode$default2 != null && aggregatedWinnerCode$default2.intValue() == 2) ? 0 : 8);
        String point2 = Event.getHomeScore$default(event2, null, 1, null).getPoint();
        boolean z3 = (point2 == null || point2.length() == 0 || (point = Event.getAwayScore$default(event2, null, 1, null).getPoint()) == null || point.length() == 0) ? false : true;
        if (contains && z3) {
            i = 0;
            timerGoalAnimatedView2.setVisibility(0);
            timerGoalAnimatedView2.d(String.format("%s - %s", Arrays.copyOf(new Object[]{Event.getHomeScore$default(event2, null, 1, null).getPoint(), Event.getAwayScore$default(event2, null, 1, null).getPoint()}, 2)), false, true);
        } else {
            i = 0;
            timerGoalAnimatedView2.setVisibility(8);
        }
        if (event2.isCrowdsourcingLive()) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_crowdsourcing, i, i, i);
            haa.z(textView);
            textView.setText(textView.getContext().getString(R.string.menu_live));
            textView.setVisibility(i);
            int i6 = this.m;
            rollingTextView3.setTextColor(i6);
            haa.z(textView4);
            rollingTextView2.setTextColor(i6);
            timerGoalAnimatedView2.setTextColor(i6);
            return lskVar;
        }
        boolean isCrowdsourcingAwaitingResults = event2.isCrowdsourcingAwaitingResults();
        int i7 = this.k;
        if (isCrowdsourcingAwaitingResults) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i, i, i);
            haa.E(textView);
            textView.setText(textView.getContext().getString(R.string.crowdsourcing_awaiting_confirmation));
            textView.setVisibility(i);
            rollingTextView3.setTextColor(i7);
            haa.F(textView4);
            rollingTextView2.setTextColor(i7);
            timerGoalAnimatedView2.setTextColor(i7);
            return lskVar;
        }
        String type = event2.getStatus().getType();
        int hashCode = type.hashCode();
        zla zlaVar = this.y;
        if (hashCode == -1411655086) {
            timerGoalAnimatedView = null;
            if (type.equals(StatusKt.STATUS_IN_PROGRESS)) {
                timerGoalAnimatedView2.setVisibility(0);
                this.p = timerGoalAnimatedView2;
                int i8 = this.l;
                rollingTextView3.setTextColor(i8);
                textView4.setTextColor(i8);
                rollingTextView2.setTextColor(i8);
                timerGoalAnimatedView2.setTextColor(i8);
                FootballEvent footballEvent = event2 instanceof FootballEvent ? (FootballEvent) event2 : null;
                if (footballEvent == null || (varInProgress = footballEvent.getVarInProgress()) == null) {
                    bool = null;
                } else {
                    Boolean homeTeam = varInProgress.getHomeTeam();
                    Boolean bool2 = Boolean.TRUE;
                    bool = Boolean.valueOf(Intrinsics.c(homeTeam, bool2) || Intrinsics.c(varInProgress.getAwayTeam(), bool2));
                }
                if (Intrinsics.c(bool, Boolean.TRUE)) {
                    m = getContext().getString(R.string.football_var);
                } else {
                    Time time = event2.getTime();
                    if (time == null || (l = time.getInjuryTime(event2.getLastPeriod())) == null || l.longValue() <= 0) {
                        l = null;
                    }
                    m = l != null ? vxd.m("+", l.longValue(), "'") : null;
                }
                textView3.setText(m);
                textView3.setTextColor(i8);
                textView3.setVisibility(m != null ? 0 : 8);
                rollingTextView = rollingTextView2;
                int alpha = Color.alpha(i8);
                obj = StatusKt.STATUS_IN_PROGRESS;
                int argb = Color.argb((int) ((Color.alpha(-1) * 0.5d) + (alpha * 0.5d)), (int) ((Color.red(-1) * 0.5d) + (Color.red(i8) * 0.5d)), (int) ((Color.green(-1) * 0.5d) + (Color.green(i8) * 0.5d)), (int) ((Color.blue(-1) * 0.5d) + (Color.blue(i8) * 0.5d)));
                textView3.setBackgroundTintList(ColorStateList.valueOf(Color.argb(25, Color.red(argb), Color.green(argb), Color.blue(argb))));
                event2 = event;
                n(lskVar, event2);
                TimeoutsInfo timeouts = event2.getTimeouts();
                int m2 = yid.m(timeouts != null ? Integer.valueOf(timeouts.getTotalTimeouts()) : null);
                int m3 = yid.m(timeouts != null ? Integer.valueOf(timeouts.getHomeTimeoutsRemaining(event2.shouldReverseTeams())) : null);
                int m4 = yid.m(timeouts != null ? Integer.valueOf(timeouts.getAwayTimeoutsRemaining(event2.shouldReverseTeams())) : null);
                ActiveTimeout activeTimeout = timeouts != null ? timeouts.getActiveTimeout() : null;
                if (m2 > 7) {
                    Group group = zlaVar.s;
                    TextView textView5 = zlaVar.n;
                    TextView textView6 = zlaVar.g;
                    group.setVisibility(8);
                    textView6.setVisibility(0);
                    textView5.setVisibility(0);
                    textView6.setText(getContext().getString(R.string.basketball_status_timeout_short) + ": " + m3 + "/" + m2);
                    textView5.setText(getContext().getString(R.string.basketball_status_timeout_short) + ": " + m4 + "/" + m2);
                    textView6.setTextColor(getContext().getColor(R.color.on_color_secondary));
                    textView5.setTextColor(getContext().getColor(R.color.on_color_secondary));
                    p(zlaVar.t, activeTimeout, event2);
                } else {
                    if (1 > m2) {
                        i2 = 8;
                    } else if (m2 < 8) {
                        zlaVar.s.setVisibility(0);
                        TimeoutsView timeoutsView = zlaVar.j;
                        timeoutsView.f = m2;
                        timeoutsView.g = m3;
                        timeoutsView.invalidate();
                        TimeoutsView timeoutsView2 = zlaVar.q;
                        timeoutsView2.f = m2;
                        timeoutsView2.g = m4;
                        timeoutsView2.invalidate();
                        p(zlaVar.t, activeTimeout, event2);
                        zlaVar.g.setVisibility(8);
                        zlaVar.n.setVisibility(8);
                    } else {
                        i2 = 8;
                    }
                    zlaVar.s.setVisibility(i2);
                }
                Unit unit = Unit.a;
                Context context = getContext();
                context.getClass();
                B = oyn.B(context, event2);
                Context context2 = getContext();
                context2.getClass();
                C = oyn.C(context2, event2);
                if (B == null) {
                }
                textView2.setVisibility(0);
                textView2.setText(B != null ? B : C != null ? C.a : null);
                if (Intrinsics.c(event2.getStatus().getType(), obj)) {
                }
                haa.F(textView2);
                this.q = textView2;
                constraintLayout = lskVar.a;
                if (constraintLayout.isLaidOut()) {
                }
                i4 = 0;
                bonusInfo = null;
                constraintLayout.addOnLayoutChangeListener(new c21(lskVar, this, lskVar));
                lskVar.c.setVisibility(8);
                lskVar.d.setVisibility(8);
                if (event2 instanceof BasketballEvent) {
                }
                return lskVar;
            }
            i3 = 8;
        } else {
            if (hashCode == -673660814 ? type.equals(StatusKt.STATUS_FINISHED) : hashCode == 527231609 && type.equals(StatusKt.STATUS_WILL_CONTINUE)) {
                textView3.setVisibility(8);
                Integer winnerCode$default = Event.getWinnerCode$default(event2, null, 1, null);
                int i9 = this.j;
                if (winnerCode$default != null && winnerCode$default.intValue() == 1) {
                    rollingTextView3.setTextColor(i9);
                    haa.F(textView4);
                    rollingTextView2.setTextColor(i7);
                } else if (winnerCode$default != null && winnerCode$default.intValue() == 2) {
                    rollingTextView3.setTextColor(i7);
                    haa.F(textView4);
                    rollingTextView2.setTextColor(i9);
                } else {
                    rollingTextView3.setTextColor(i7);
                    haa.F(textView4);
                    rollingTextView2.setTextColor(i7);
                }
                if (afi.e(event2.getStatus().getCode()) || Intrinsics.c(event2.getStatus().getDescription(), StatusKt.STATUS_COVERAGE_CANCELED)) {
                    if (event2.getStatus().getCode() != 91 || Event.getWinnerCode$default(event2, null, 1, null) == null) {
                        z = false;
                    } else {
                        Integer display = Event.getHomeScore$default(event2, null, 1, null).getDisplay();
                        String str2 = "W";
                        if (display == null || (str = String.valueOf(display.intValue())) == null) {
                            Integer winnerCode$default2 = Event.getWinnerCode$default(event2, null, 1, null);
                            String str3 = (winnerCode$default2 != null && winnerCode$default2.intValue() == 1) ? "W" : null;
                            str = str3 == null ? "L" : str3;
                        }
                        rollingTextView3.d(str, false, true);
                        Integer display2 = Event.getAwayScore$default(event2, null, 1, null).getDisplay();
                        if (display2 == null || (valueOf = String.valueOf(display2.intValue())) == null) {
                            Integer winnerCode$default3 = Event.getWinnerCode$default(event2, null, 1, null);
                            String str4 = (winnerCode$default3 == null || winnerCode$default3.intValue() != 1) ? null : "L";
                            if (str4 != null) {
                                str2 = str4;
                            }
                        } else {
                            str2 = valueOf;
                        }
                        z = false;
                        rollingTextView2.d(str2, false, true);
                    }
                    Context context3 = getContext();
                    context3.getClass();
                    timerGoalAnimatedView2.d(pd0.u(context3, event2), z, true);
                    i5 = z;
                } else {
                    int code = event2.getStatus().getCode();
                    if (code == 110 || code == 120) {
                        z2 = false;
                        u = z8e.u(getContext(), event2.getStatusDescription(), ok3.s(event2), false);
                    } else {
                        u = getContext().getString(R.string.reason_awarded);
                        if (!event2.isAwarded()) {
                            u = null;
                        }
                        if (u == null) {
                            Context context4 = getContext();
                            context4.getClass();
                            z2 = false;
                            u = afi.c(context4, "ft", ok3.s(event2), false);
                        } else {
                            z2 = false;
                        }
                    }
                    timerGoalAnimatedView2.d(u, z2, true);
                    i5 = z2;
                }
                n(lskVar, event2);
                timerGoalAnimatedView2.setVisibility(i5);
                timerGoalAnimatedView2.setTextColor(i9);
                this.p = null;
                Unit unit2 = Unit.a;
                rollingTextView = rollingTextView2;
                obj = StatusKt.STATUS_IN_PROGRESS;
                Context context5 = getContext();
                context5.getClass();
                B = oyn.B(context5, event2);
                Context context22 = getContext();
                context22.getClass();
                C = oyn.C(context22, event2);
                if (B == null || C != null) {
                    textView2.setVisibility(0);
                    textView2.setText(B != null ? B : C != null ? C.a : null);
                    if (Intrinsics.c(event2.getStatus().getType(), obj) || B == null) {
                        haa.F(textView2);
                    } else {
                        haa.B(textView2);
                    }
                    this.q = textView2;
                } else {
                    textView2.setVisibility(8);
                    this.q = null;
                }
                constraintLayout = lskVar.a;
                if (constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                    i4 = 0;
                    bonusInfo = null;
                    constraintLayout.addOnLayoutChangeListener(new c21(lskVar, this, lskVar));
                } else {
                    float measuredWidth = (constraintLayout.getMeasuredWidth() / 2.0f) / ((textView4.getMeasuredWidth() / 2.0f) + Math.max(rollingTextView3.getMeasuredWidth(), rollingTextView.getMeasuredWidth()));
                    if (measuredWidth < 1.0f) {
                        float textSize = textView4.getTextSize() * measuredWidth;
                        rollingTextView3.setTextSize(textSize);
                        i4 = 0;
                        textView4.setTextSize(0, textSize);
                        rollingTextView.setTextSize(textSize);
                    } else {
                        i4 = 0;
                    }
                    TextView textView7 = this.q;
                    if (textView7 != null) {
                        int measuredHeight = textView7.getMeasuredHeight();
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        if (layoutParams == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return null;
                        }
                        tl3 tl3Var = (tl3) layoutParams;
                        ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = -measuredHeight;
                        textView2.setLayoutParams(tl3Var);
                    }
                    bonusInfo = null;
                }
                lskVar.c.setVisibility(8);
                lskVar.d.setVisibility(8);
                if (event2 instanceof BasketballEvent) {
                    TextView textView8 = zlaVar.f;
                    BasketballEvent basketballEvent = (BasketballEvent) event2;
                    BonusInfo bonusInfo2 = basketballEvent.getBonusInfo();
                    if (!ok3.D(event2)) {
                        bonusInfo2 = bonusInfo;
                    }
                    Object valueOf2 = bonusInfo2 != null ? Boolean.valueOf(bonusInfo2.hasHomeBonus(event2.shouldReverseTeams())) : bonusInfo;
                    Boolean bool3 = Boolean.TRUE;
                    textView8.setVisibility(Intrinsics.c(valueOf2, bool3) ? i4 : 8);
                    TextView textView9 = zlaVar.m;
                    BonusInfo bonusInfo3 = basketballEvent.getBonusInfo();
                    if (!ok3.D(event2)) {
                        bonusInfo3 = bonusInfo;
                    }
                    textView9.setVisibility(Intrinsics.c(bonusInfo3 != null ? Boolean.valueOf(bonusInfo3.hasAwayBonus(event2.shouldReverseTeams())) : bonusInfo, bool3) ? i4 : 8);
                }
                return lskVar;
            }
            i3 = 8;
            timerGoalAnimatedView = null;
        }
        textView3.setVisibility(i3);
        timerGoalAnimatedView2.setVisibility(i3);
        lskVar.m.setVisibility(i3);
        this.p = timerGoalAnimatedView;
        Unit unit3 = Unit.a;
        rollingTextView = rollingTextView2;
        obj = StatusKt.STATUS_IN_PROGRESS;
        Context context52 = getContext();
        context52.getClass();
        B = oyn.B(context52, event2);
        Context context222 = getContext();
        context222.getClass();
        C = oyn.C(context222, event2);
        if (B == null) {
        }
        textView2.setVisibility(0);
        textView2.setText(B != null ? B : C != null ? C.a : null);
        if (Intrinsics.c(event2.getStatus().getType(), obj)) {
        }
        haa.F(textView2);
        this.q = textView2;
        constraintLayout = lskVar.a;
        if (constraintLayout.isLaidOut()) {
        }
        i4 = 0;
        bonusInfo = null;
        constraintLayout.addOnLayoutChangeListener(new c21(lskVar, this, lskVar));
        lskVar.c.setVisibility(8);
        lskVar.d.setVisibility(8);
        if (event2 instanceof BasketballEvent) {
        }
        return lskVar;
    }

    public final boolean m(Event event) {
        String type = event.getStatus().getType();
        if (!getNotStartedStatuses().contains(type)) {
            if (!getStoppedStatuses().contains(type)) {
                return false;
            }
            e(event);
            return true;
        }
        f(event.getTimestamp());
        nsk nskVar = this.r;
        if (nskVar == null) {
            return true;
        }
        Context context = getContext();
        context.getClass();
        jfj C = oyn.C(context, event);
        TextView textView = nskVar.b;
        if (C == null) {
            textView.setVisibility(8);
            this.q = null;
            return true;
        }
        textView.setVisibility(0);
        textView.setText(C.a);
        haa.F(textView);
        this.q = textView;
        if (!textView.isLaidOut() || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new b2(textView, 2));
            return true;
        }
        int measuredHeight = textView.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return false;
        }
        tl3 tl3Var = (tl3) layoutParams;
        ((ViewGroup.MarginLayoutParams) tl3Var).topMargin = -measuredHeight;
        textView.setLayoutParams(tl3Var);
        return true;
    }

    public final void n(lsk lskVar, Event event) {
        TimerGoalAnimatedView timerGoalAnimatedView = lskVar.m;
        if (!ok3.z(event)) {
            timerGoalAnimatedView.setVisibility(8);
            return;
        }
        TimerGoalAnimatedView timerGoalAnimatedView2 = lskVar.l;
        Context context = getContext();
        context.getClass();
        timerGoalAnimatedView2.d(k(context, String.valueOf(yid.m(Event.getHomeScore$default(event, null, 1, null).getPenalties())), String.valueOf(yid.m(Event.getAwayScore$default(event, null, 1, null).getPenalties())), true), false, true);
        timerGoalAnimatedView.setVisibility(0);
        timerGoalAnimatedView.d(getContext().getString(R.string.penalties_short), false, false);
        if (ok3.D(event)) {
            timerGoalAnimatedView.setTextColor(this.l);
        } else {
            timerGoalAnimatedView.setTextColor(this.j);
        }
    }

    public abstract void o(Event event);

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.a(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutChanged(true);
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.g(true, false, true);
        }
        AppBarLayout appBarLayout2 = getAppBarLayout();
        if (appBarLayout2 != null) {
            appBarLayout2.post(new y2(this, 21));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.f(this);
        }
    }

    public final void q(Event event) {
        String u;
        Long injuryTime;
        Time time = event.getTime();
        Long l = null;
        StatusTime statusTime = time != null ? time.getStatusTime() : null;
        if (ok3.z(event)) {
            Context context = getContext();
            context.getClass();
            u = k(context, String.valueOf(yid.m(Event.getHomeScore$default(event, null, 1, null).getPenalties())), String.valueOf(yid.m(Event.getAwayScore$default(event, null, 1, null).getPenalties())), true);
        } else if (statusTime != null) {
            Time time2 = event.getTime();
            if (time2 != null && (injuryTime = time2.getInjuryTime(event.getLastPeriod())) != null && injuryTime.longValue() > 0) {
                l = injuryTime;
            }
            u = z8e.t(statusTime, xe6.c().b, l != null);
        } else {
            Context context2 = getContext();
            context2.getClass();
            u = pd0.u(context2, event);
        }
        TimerGoalAnimatedView timerGoalAnimatedView = this.p;
        if (timerGoalAnimatedView != null) {
            timerGoalAnimatedView.d(u, false, true);
        }
    }

    public final void r() {
        float progress = ((1.0f - getProgress()) * getAdditionalInfoContainerHeight()) + (getProgress() * ((getHeight() - this.u) - (this.s / 2)));
        TextView textView = this.y.e;
        textView.setAlpha(1.0f - (getProgress() * 5.0f));
        textView.setTranslationY(progress);
    }

    public final void s() {
        float progress = ((1.0f - getProgress()) * getAdditionalInfoContainerHeight()) + (getProgress() * ((getHeight() - this.u) - (this.s / 2)));
        ConstraintLayout constraintLayout = this.y.l;
        constraintLayout.setTranslationY(progress);
        float progress2 = 1.0f - (getProgress() * 0.25f);
        constraintLayout.setScaleX(progress2);
        constraintLayout.setScaleY(progress2);
        TextView textView = this.q;
        if (textView != null) {
            textView.setAlpha(1.0f - (getProgress() * 5.0f));
        }
    }

    @Override // defpackage.s21
    public void setEvent(@NotNull Event event) {
        event.getClass();
        c(event, null);
        TeamLogoView.g(this.B, Event.getHomeTeam$default(event, null, 1, null), Event.getHomeTeamSeed$default(event, null, 1, null), 12);
        TeamLogoView.g(this.C, Event.getAwayTeam$default(event, null, 1, null), Event.getAwayTeamSeed$default(event, null, 1, null), 8);
        boolean isDoublesMatch = event.isDoublesMatch();
        zla zlaVar = this.y;
        if (isDoublesMatch) {
            TextView textView = zlaVar.i;
            TextView textView2 = zlaVar.n;
            TextView textView3 = zlaVar.g;
            SubTeam subTeam1 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam1();
            Context context = getContext();
            context.getClass();
            textView.setText(tba.v(subTeam1, context));
            SubTeam subTeam2 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam2();
            Context context2 = getContext();
            context2.getClass();
            textView3.setText(tba.v(subTeam2, context2));
            textView3.setVisibility(0);
            TextView textView4 = zlaVar.p;
            SubTeam subTeam12 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam1();
            Context context3 = getContext();
            context3.getClass();
            textView4.setText(tba.v(subTeam12, context3));
            SubTeam subTeam22 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam2();
            Context context4 = getContext();
            context4.getClass();
            textView2.setText(tba.v(subTeam22, context4));
            textView2.setVisibility(0);
        } else {
            Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
            Context context5 = getContext();
            context5.getClass();
            String A = tba.A(context5, homeTeam$default);
            Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
            Context context6 = getContext();
            context6.getClass();
            String K = qea.K(tba.A(context6, awayTeam$default), event.shouldReverseTeams());
            Integer F = o3a.F(event.getTournament());
            if (F != null && F.intValue() == 132) {
                TextView textView5 = zlaVar.i;
                String homeTeamSeed$default = Event.getHomeTeamSeed$default(event, null, 1, null);
                if (homeTeamSeed$default != null) {
                    A = dmi.r(A, " (", homeTeamSeed$default, ")");
                }
                textView5.setText(A);
                TextView textView6 = zlaVar.p;
                String awayTeamSeed$default = Event.getAwayTeamSeed$default(event, null, 1, null);
                if (awayTeamSeed$default != null) {
                    K = dmi.r(K, " (", awayTeamSeed$default, ")");
                }
                textView6.setText(K);
            } else {
                zlaVar.i.setText(A);
                zlaVar.p.setText(K);
            }
        }
        TeamSeasonForm homeSeasonForm$default = Event.getHomeSeasonForm$default(event, null, 1, null);
        TeamSeasonForm awaySeasonForm$default = Event.getAwaySeasonForm$default(event, null, 1, null);
        if (homeSeasonForm$default != null && awaySeasonForm$default != null) {
            TextView textView7 = zlaVar.g;
            TextView textView8 = zlaVar.n;
            Context context7 = getContext();
            context7.getClass();
            textView7.setText(v8a.r(homeSeasonForm$default, context7));
            Context context8 = getContext();
            context8.getClass();
            textView8.setText(v8a.r(awaySeasonForm$default, context8));
            textView7.setVisibility(0);
            textView8.setVisibility(0);
            textView7.setTextColor(getContext().getColor(R.color.on_color_primary));
            textView8.setTextColor(getContext().getColor(R.color.on_color_primary));
            zlaVar.s.setVisibility(8);
        }
        o(event);
        g(zlaVar.e, event.getStartTimestamp(), ok3.C(event));
        if (!this.e) {
            i();
            return;
        }
        setLayoutChanged(true);
        AppBarLayout appBarLayout = getAppBarLayout();
        if (appBarLayout != null) {
            appBarLayout.g(true, false, true);
        }
        AppBarLayout appBarLayout2 = getAppBarLayout();
        if (appBarLayout2 != null) {
            appBarLayout2.post(new y2(this, 21));
        }
    }

    public final void setProgress(float f) {
        this.x.i(f);
    }

    public final void setTimerTextView(@Nullable TimerGoalAnimatedView timerGoalAnimatedView) {
        this.p = timerGoalAnimatedView;
    }

    public final void t(View view, View view2, View view3, View view4, View view5, View view6, View view7, int i) {
        view.getClass();
        view4.getClass();
        float f = i == 8388611 ? 1.0f : -1.0f;
        Integer valueOf = Integer.valueOf(this.y.l.getWidth());
        if (this.n) {
            valueOf = null;
        }
        float progress = getProgress() * ((((valueOf != null ? valueOf.intValue() : -r0.l.getWidth()) * 0.25f) / 3.0f) + this.w) * f;
        float progress2 = ((1.0f - getProgress()) * getAdditionalInfoContainerHeight()) + (getProgress() * ((getHeight() - this.v) - (this.s / 2.0f)));
        view.setTranslationX(progress);
        view.setTranslationY(progress2);
        float progress3 = 1.0f - (getProgress() * 0.25f);
        view.setScaleX(progress3);
        view.setScaleY(progress3);
        view2.setTranslationX(progress);
        view2.setTranslationY(progress2);
        view2.setAlpha(1.0f - (getProgress() * 5.0f));
        view3.setTranslationX(progress);
        view3.setTranslationY(progress2);
        view3.setAlpha(1.0f - (getProgress() * 5.0f));
        view5.setTranslationX(progress);
        view5.setTranslationY(progress2);
        view5.setAlpha(1.0f - (getProgress() * 5.0f));
        view6.setTranslationX(progress);
        view6.setTranslationY(progress2);
        view6.setAlpha(1.0f - (getProgress() * 5.0f));
        view4.setTranslationX(getProgress() * this.t * f);
        view4.setTranslationY(progress2);
        view4.setAlpha(1.0f - getProgress());
        view7.setTranslationX(progress);
        view7.setTranslationY(progress2);
        view7.setAlpha(1.0f - (getProgress() * 5.0f));
    }

    public void u(RollingTextView rollingTextView, RollingTextView rollingTextView2, Integer num, Integer num2, boolean z) {
        rollingTextView.d(num != null ? String.valueOf(num.intValue()) : null, false, true);
        rollingTextView2.d(num2 != null ? String.valueOf(num2.intValue()) : null, false, true);
    }

    @Override // defpackage.s21
    @NotNull
    public final zla getBinding() {
        return this.y;
    }
}
