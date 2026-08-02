package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.ServableEvent;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.results.R;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.view.follownotification.FollowActionButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hs2 extends s21 {
    public final Set j;
    public final is2 k;
    public final ArrayList l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public boolean s;

    public hs2(ChatActivity chatActivity) {
        super(chatActivity);
        this.j = ph0.a0(new String[]{StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED, StatusKt.STATUS_SUSPENDED, StatusKt.STATUS_DELAYED});
        View inflate = LayoutInflater.from(chatActivity).inflate(R.layout.chat_tennis_header, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.container_match_details;
        FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.container_match_details, inflate);
        if (frameLayout != null) {
            i = R.id.first_player_name_collapsed;
            TextView textView = (TextView) nq8.B(R.id.first_player_name_collapsed, inflate);
            if (textView != null) {
                i = R.id.players_collapsed;
                if (((LinearLayout) nq8.B(R.id.players_collapsed, inflate)) != null) {
                    i = R.id.second_player_name_collapsed;
                    TextView textView2 = (TextView) nq8.B(R.id.second_player_name_collapsed, inflate);
                    if (textView2 != null) {
                        this.k = new is2((ConstraintLayout) inflate, frameLayout, textView, textView2);
                        IntRange intRange = new IntRange(1, 5, 1);
                        ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
                        v6a it = intRange.iterator();
                        while (it.c) {
                            arrayList.add("period" + it.nextInt());
                        }
                        this.l = arrayList;
                        this.m = ao2.s(1, chatActivity);
                        this.n = ao2.s(2, chatActivity);
                        this.o = ao2.s(4, chatActivity);
                        this.p = ao2.s(12, chatActivity);
                        this.q = ao2.s(14, chatActivity);
                        this.r = ao2.s(16, chatActivity);
                        this.s = true;
                        return;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.s21
    public final Pair b() {
        krk j = j(ds2.b, R.layout.view_event_tennis_header_prematch, r21.f);
        j.getClass();
        psk pskVar = (psk) j;
        return new Pair(pskVar.b, pskVar.c);
    }

    @Override // defpackage.s21
    public final boolean d() {
        return this.s;
    }

    @Override // defpackage.s21
    public /* bridge */ /* synthetic */ FollowActionButton getFollowButtonFirstTeam() {
        return (FollowActionButton) m872getFollowButtonFirstTeam();
    }

    @Override // defpackage.s21
    public /* bridge */ /* synthetic */ FollowActionButton getFollowButtonSecondTeam() {
        return (FollowActionButton) m873getFollowButtonSecondTeam();
    }

    @Override // defpackage.s21
    @NotNull
    public Set<String> getStoppedStatuses() {
        return this.j;
    }

    public final TextView h(String str) {
        TextView m = m(str, Boolean.FALSE, false);
        ViewGroup.LayoutParams layoutParams = m.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(this.r);
        m.setLayoutParams(marginLayoutParams);
        haa.H(m);
        return m;
    }

    public final TextView i(String str, boolean z, boolean z2) {
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(R.style.DisplaySmall);
        Context context = textView.getContext();
        context.getClass();
        textView.setTypeface(hkg.Y(R.font.sofascore_sans_bold, context));
        textView.setLetterSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i = this.r;
        marginLayoutParams.setMarginEnd(i);
        textView.setLayoutParams(marginLayoutParams);
        textView.setMinWidth(i);
        textView.setTextAlignment(4);
        if (z) {
            haa.E(textView);
        } else {
            haa.F(textView);
        }
        if (z2) {
            str = z ? "W" : "L";
        }
        textView.setText(str);
        return textView;
    }

    public final krk j(Function1 function1, int i, r21 r21Var) {
        if (getViewStatus() != r21Var) {
            getBinding().b.removeAllViews();
            setViewStatus(r21Var);
            setResultView(null);
            setLayoutChanged(true);
        }
        ViewGroup resultView = getResultView();
        if (resultView == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) getBinding().b, false);
            inflate.getClass();
            resultView = (ViewGroup) inflate;
        }
        if (getResultView() == null) {
            setResultView(resultView);
            getBinding().b.addView(resultView);
        }
        return (krk) function1.invoke(resultView);
    }

    public final View k() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.m, this.r);
        layoutParams.gravity = 16;
        view.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginStart(getDpToPx8());
        marginLayoutParams.setMarginEnd(getDpToPx8());
        view.setLayoutParams(marginLayoutParams);
        view.setBackgroundColor(view.getContext().getColor(R.color.on_color_secondary));
        return view;
    }

    public final ImageView l(boolean z) {
        ImageView imageView = new ImageView(getContext());
        int i = this.p;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ball_tennis));
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMarginEnd(getDpToPx8());
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setVisibility(z ? 4 : 0);
        return imageView;
    }

    public final TextView m(String str, Boolean bool, boolean z) {
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(R.style.DisplaySmall);
        Context context = textView.getContext();
        context.getClass();
        textView.setTypeface(hkg.Y(R.font.sofascore_sans_bold, context));
        textView.setLetterSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        textView.setMinWidth(this.r);
        textView.setMinHeight(this.q);
        textView.setTextAlignment(4);
        if (z) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.setMarginStart(this.n);
            textView.setLayoutParams(marginLayoutParams);
            textView.setIncludeFontPadding(false);
            textView.setBackgroundColor(textView.getContext().getColor(R.color.live));
            haa.E(textView);
        } else if (Intrinsics.c(bool, Boolean.TRUE)) {
            haa.E(textView);
        } else {
            haa.F(textView);
        }
        textView.setText(str);
        return textView;
    }

    public final void n(boolean z, boolean z2) {
        is2 binding = getBinding();
        if (z) {
            haa.E(binding.c);
            haa.F(binding.d);
        } else if (z2) {
            haa.F(binding.c);
            haa.E(binding.d);
        }
    }

    public final void o(ViewGroup viewGroup, Event event, boolean z) {
        Typeface typeface;
        if (event.getStatus().getCode() == 91) {
            String string = viewGroup.getContext().getString(R.string.walkover);
            string.getClass();
            TextView textView = new TextView(getContext());
            textView.setTextAppearance(R.style.BodyMedium);
            Context context = textView.getContext();
            context.getClass();
            try {
                typeface = z1g.a(R.font.sofascore_sans_regular, context);
            } catch (Exception unused) {
                typeface = Typeface.DEFAULT;
            }
            textView.setTypeface(typeface);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            textView.setLayoutParams(layoutParams);
            textView.setTextAlignment(4);
            textView.setText(string);
            haa.E(textView);
            textView.setVisibility(z ? 0 : 4);
            viewGroup.addView(textView);
        }
        viewGroup.addView(k());
        viewGroup.addView(i(null, z, true));
    }

    @Override // defpackage.s21
    public void setChatHeader(boolean z) {
        this.s = z;
    }

    @Override // defpackage.s21
    public void setEvent(@NotNull Event event) {
        String str;
        String str2;
        String alpha2;
        String str3;
        String alpha22;
        String str4;
        String valueOf;
        String i;
        event.getClass();
        is2 binding = getBinding();
        if (event.isDoublesMatch()) {
            SubTeam subTeam1 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam1();
            Context context = getContext();
            context.getClass();
            String v = tba.v(subTeam1, context);
            SubTeam subTeam2 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam2();
            Context context2 = getContext();
            context2.getClass();
            String v2 = tba.v(subTeam2, context2);
            binding.c.setText(v + " / " + v2);
            SubTeam subTeam12 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam1();
            Context context3 = getContext();
            context3.getClass();
            String v3 = tba.v(subTeam12, context3);
            SubTeam subTeam22 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam2();
            Context context4 = getContext();
            context4.getClass();
            String v4 = tba.v(subTeam22, context4);
            binding.d.setText(v3 + " / " + v4);
        } else {
            Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
            Context context5 = getContext();
            context5.getClass();
            String A = tba.A(context5, homeTeam$default);
            Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
            Context context6 = getContext();
            context6.getClass();
            String K = qea.K(tba.A(context6, awayTeam$default), event.shouldReverseTeams());
            TextView textView = binding.c;
            textView.setText(A);
            boolean national = Event.getHomeTeam$default(event, null, 1, null).getNational();
            int i2 = this.o;
            if (national) {
                str = "";
            } else {
                Country country = Event.getHomeTeam$default(event, null, 1, null).getCountry();
                if (country == null || (alpha22 = country.getAlpha2()) == null) {
                    str3 = "";
                } else {
                    str3 = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha22, "/flag");
                }
                ua5 ua5Var = ua5.a;
                Context context7 = textView.getContext();
                context7.getClass();
                str = "";
                int s = ao2.s(12, context7);
                t25.a(s);
                haa.q(textView, str3, ua5Var, new t25(s));
                textView.setCompoundDrawablePadding(i2);
            }
            TextView textView2 = binding.d;
            textView2.setText(K);
            if (!Event.getAwayTeam$default(event, null, 1, null).getNational()) {
                Country country2 = Event.getAwayTeam$default(event, null, 1, null).getCountry();
                if (country2 == null || (alpha2 = country2.getAlpha2()) == null) {
                    str2 = str;
                } else {
                    str2 = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
                }
                ua5 ua5Var2 = ua5.a;
                Context context8 = textView2.getContext();
                context8.getClass();
                int s2 = ao2.s(12, context8);
                t25.a(s2);
                haa.q(textView2, str2, ua5Var2, new t25(s2));
                textView2.setCompoundDrawablePadding(i2);
            }
        }
        String type = event.getStatus().getType();
        if (getNotStartedStatuses().contains(type)) {
            f(event.getStartTimestamp());
            return;
        }
        if (getStoppedStatuses().contains(type)) {
            e(event);
            return;
        }
        boolean c = Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS);
        ArrayList arrayList = this.l;
        if (c) {
            ArrayList arrayList2 = new ArrayList();
            Score homeScore$default = Event.getHomeScore$default(event, null, 1, null);
            Score awayScore$default = Event.getAwayScore$default(event, null, 1, null);
            boolean z = (Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod()) == null || Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(event.getLastPeriod()) == null) ? false : true;
            qsk qskVar = (qsk) j(es2.b, R.layout.view_event_tennis_header_result, r21.a);
            LinearLayout linearLayout = qskVar.b;
            LinearLayout linearLayout2 = qskVar.c;
            linearLayout.removeAllViews();
            linearLayout2.removeAllViews();
            if (event instanceof TennisEvent) {
                ServableEvent servableEvent = (ServableEvent) event;
                Integer firstToServe$default = ServableEvent.getFirstToServe$default(servableEvent, null, 1, null);
                if (firstToServe$default != null && firstToServe$default.intValue() == 1) {
                    linearLayout.addView(l(false));
                    linearLayout2.addView(l(true));
                } else {
                    Integer firstToServe$default2 = ServableEvent.getFirstToServe$default(servableEvent, null, 1, null);
                    if (firstToServe$default2 != null && firstToServe$default2.intValue() == 2) {
                        linearLayout.addView(l(true));
                        linearLayout2.addView(l(false));
                    }
                }
            }
            if (z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str5 = (String) it.next();
                    Integer scoreByPeriodName = homeScore$default.getScoreByPeriodName(str5);
                    if (scoreByPeriodName != null) {
                        int intValue = scoreByPeriodName.intValue();
                        Integer scoreByPeriodName2 = awayScore$default.getScoreByPeriodName(str5);
                        if (scoreByPeriodName2 != null) {
                            arrayList2.add(new Pair(Integer.valueOf(intValue), Integer.valueOf(scoreByPeriodName2.intValue())));
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    Pair pair = (Pair) next;
                    int intValue2 = ((Number) pair.a).intValue();
                    int intValue3 = ((Number) pair.b).intValue();
                    boolean z2 = arrayList.indexOf(event.getLastPeriod()) == i3;
                    linearLayout.addView(m(String.valueOf(intValue2), Boolean.valueOf(intValue2 > intValue3), z2));
                    linearLayout2.addView(m(String.valueOf(intValue3), Boolean.valueOf(intValue3 > intValue2), z2));
                    i3 = i4;
                }
            } else {
                linearLayout.addView(m("-", null, true));
                linearLayout2.addView(m("-", null, true));
            }
            linearLayout.addView(k());
            linearLayout2.addView(k());
            String point = homeScore$default.getPoint();
            if (point == null) {
                point = "-";
            }
            linearLayout.addView(h(point));
            String point2 = awayScore$default.getPoint();
            linearLayout2.addView(h(point2 != null ? point2 : "-"));
            return;
        }
        Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
        boolean z3 = winnerCode$default != null && winnerCode$default.intValue() == 1;
        Integer winnerCode$default2 = Event.getWinnerCode$default(event, null, 1, null);
        boolean z4 = winnerCode$default2 != null && winnerCode$default2.intValue() == 2;
        boolean t = me4.t(StatusKt.STATUS_INTERRUPTED, event);
        if (!z3 && !z4 && !t) {
            Pair b = b();
            TextView textView3 = (TextView) b.a;
            TextView textView4 = (TextView) b.b;
            if (ug5.u(event.getStartTimestamp())) {
                i = textView4.getContext().getString(R.string.today);
            } else if (ug5.w(event.getStartTimestamp())) {
                i = textView4.getContext().getString(R.string.yesterday);
            } else {
                textView4.setTextDirection(3);
                long startTimestamp = event.getStartTimestamp();
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                i = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
            }
            textView4.setText(i);
            Context context9 = getContext();
            context9.getClass();
            textView3.setText(pd0.u(context9, event));
            return;
        }
        if (event.getStatus().getCode() == 91) {
            qsk qskVar2 = (qsk) j(fs2.b, R.layout.view_event_tennis_header_result, r21.a);
            LinearLayout linearLayout3 = qskVar2.b;
            LinearLayout linearLayout4 = qskVar2.c;
            linearLayout3.removeAllViews();
            linearLayout4.removeAllViews();
            o(qskVar2.b, event, z3);
            o(linearLayout4, event, z4);
            n(z3, z4);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            String str6 = (String) it3.next();
            Integer scoreByPeriodName3 = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(str6);
            if (scoreByPeriodName3 != null) {
                int intValue4 = scoreByPeriodName3.intValue();
                Integer scoreByPeriodName4 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(str6);
                if (scoreByPeriodName4 != null) {
                    arrayList3.add(new Pair(Integer.valueOf(intValue4), Integer.valueOf(scoreByPeriodName4.intValue())));
                }
            }
        }
        qsk qskVar3 = (qsk) j(gs2.b, R.layout.view_event_tennis_header_result, r21.a);
        LinearLayout linearLayout5 = qskVar3.b;
        LinearLayout linearLayout6 = qskVar3.c;
        linearLayout5.removeAllViews();
        linearLayout6.removeAllViews();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Pair pair2 = (Pair) it4.next();
            int intValue5 = ((Number) pair2.a).intValue();
            int intValue6 = ((Number) pair2.b).intValue();
            linearLayout5.addView(m(String.valueOf(intValue5), Boolean.valueOf(intValue5 > intValue6), false));
            linearLayout6.addView(m(String.valueOf(intValue6), Boolean.valueOf(intValue6 > intValue5), false));
        }
        boolean e = afi.e(event.getStatus().getCode());
        linearLayout5.addView(k());
        linearLayout6.addView(k());
        String str7 = "L";
        if (t) {
            str4 = Event.getHomeScore$default(event, null, 1, null).getPoint();
        } else {
            Integer display = Event.getHomeScore$default(event, null, 1, null).getDisplay();
            if (display == null || (str4 = String.valueOf(display.intValue())) == null) {
                str4 = z3 ? "W" : "L";
            }
        }
        linearLayout5.addView(i(str4, z3, e));
        if (t) {
            str7 = Event.getAwayScore$default(event, null, 1, null).getPoint();
        } else {
            Integer display2 = Event.getAwayScore$default(event, null, 1, null).getDisplay();
            if (display2 != null && (valueOf = String.valueOf(display2.intValue())) != null) {
                str7 = valueOf;
            } else if (z4) {
                str7 = "W";
            }
        }
        linearLayout6.addView(i(str7, z4, e));
        n(z3, z4);
    }

    @Override // defpackage.s21
    @NotNull
    public is2 getBinding() {
        return this.k;
    }

    @Nullable
    /* renamed from: getFollowButtonFirstTeam, reason: collision with other method in class */
    public Void m872getFollowButtonFirstTeam() {
        return null;
    }

    @Nullable
    /* renamed from: getFollowButtonSecondTeam, reason: collision with other method in class */
    public Void m873getFollowButtonSecondTeam() {
        return null;
    }
}
