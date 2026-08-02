package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import com.sofascore.results.view.header.widget.RollingTextView;
import com.sofascore.results.view.header.widget.TimerGoalAnimatedView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kj8 extends e21 {
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public LinkedHashMap J;
    public LinkedHashMap K;
    public final mqi L;

    public kj8(Context context) {
        super(context);
        this.F = -1;
        this.J = new LinkedHashMap();
        this.K = new LinkedHashMap();
        this.L = ypa.b(new ij8(0, context, this));
    }

    private final ksk getGoalsContainerBinding() {
        return (ksk) this.L.getValue();
    }

    @Override // defpackage.e21, defpackage.ua0
    public final void a(AppBarLayout appBarLayout, int i) {
        int height = getGoalsContainerBinding().c.getHeight();
        boolean z = i > this.I;
        this.I = i;
        int i2 = -i;
        if (i2 > height || this.F <= 0) {
            if (!this.G) {
                this.G = true;
                ksk goalsContainerBinding = getGoalsContainerBinding();
                Iterator it = new tsk(goalsContainerBinding.d).iterator();
                while (true) {
                    usk uskVar = (usk) it;
                    if (!uskVar.hasNext()) {
                        break;
                    } else {
                        ((View) uskVar.next()).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                Iterator it2 = new tsk(goalsContainerBinding.b).iterator();
                while (true) {
                    usk uskVar2 = (usk) it2;
                    if (!uskVar2.hasNext()) {
                        break;
                    } else {
                        ((View) uskVar2.next()).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                goalsContainerBinding.e.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.H = false;
            setProgress((i2 - height) / (appBarLayout.getTotalScrollRange() - height));
            if (Float.isNaN(getProgress()) || Float.isInfinite(getProgress())) {
                return;
            }
            x();
            return;
        }
        if (!this.H) {
            this.H = true;
            setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            x();
        }
        int dpToPx8 = height - getDpToPx8();
        int i3 = this.F;
        int i4 = dpToPx8 / i3;
        if (i4 <= 0) {
            return;
        }
        int i5 = i2 / i4;
        int i6 = i2 % i4;
        int i7 = i6 + ((((i6 ^ i4) & ((-i6) | i6)) >> 31) & i4);
        this.G = false;
        float f = -i;
        boolean z2 = i5 != i3 - 1;
        getBinding().l.setTranslationY(f);
        getFirstTeamLogo().setTranslationY(f);
        getBinding().i.setTranslationY(f);
        getBinding().g.setTranslationY(f);
        getFollowButtonFirstTeam().setTranslationY(f);
        getSecondTeamLogo().setTranslationY(f);
        getBinding().p.setTranslationY(f);
        getBinding().n.setTranslationY(f);
        getFollowButtonSecondTeam().setTranslationY(f);
        getBinding().e.setTranslationY(f);
        if (z2) {
            getGoalsContainerBinding().e.setTranslationY(f);
        }
        if (i5 == this.F - 1 && z) {
            getGoalsContainerBinding().e.setTranslationY(i2 - i7);
        }
        float f2 = i7 / i4;
        v(new tsk(getGoalsContainerBinding().d), i5, f2, 8388611);
        v(new tsk(getGoalsContainerBinding().b), i5, f2, 8388613);
    }

    @Override // defpackage.e21
    public final void o(Event event) {
        l(event);
    }

    public final void setFootballGoals(@NotNull List<Incident.GoalIncident> list) {
        String str;
        String t;
        String str2;
        int hashCode;
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        getBinding().b.setVisibility(0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean z = false;
        for (Incident.GoalIncident goalIncident : list) {
            boolean c = Intrinsics.c(Incident.isHome$default(goalIncident, null, 1, null), Boolean.TRUE);
            if (goalIncident.getTime() != null) {
                Map map = qz9.a;
                Context context = getContext();
                context.getClass();
                str = lnb.o("\u200e", qz9.a(context, goalIncident), "\u200e");
            } else {
                str = "-";
            }
            Player player = goalIncident.getPlayer();
            if (player == null || (t = tba.C(player)) == null) {
                Player player2 = goalIncident.getPlayer();
                t = player2 != null ? tba.t(player2) : goalIncident.getPlayerName();
            }
            boolean z2 = t == null;
            if (t == null) {
                str2 = getContext().getString(R.string.football_goal);
                str2.getClass();
            } else {
                str2 = t;
            }
            if (!z) {
                z = !(t == null || t.length() == 0);
            }
            LinkedHashMap linkedHashMap3 = c ? linkedHashMap : linkedHashMap2;
            Player player3 = goalIncident.getPlayer();
            if (player3 != null) {
                hashCode = player3.getId();
            } else {
                String playerName = goalIncident.getPlayerName();
                hashCode = playerName != null ? playerName.hashCode() : 0;
            }
            String obj = StringsKt.l0(str2).toString();
            String incidentClass = goalIncident.getIncidentClass();
            if (Intrinsics.c(incidentClass, "penalty")) {
                str = String.format("%s %s", Arrays.copyOf(new Object[]{str, getContext().getString(R.string.header_football_goal_penalty)}, 2));
            } else if (Intrinsics.c(incidentClass, Incident.GoalIncident.TYPE_OWN_GOAL)) {
                str = String.format("%s %s", Arrays.copyOf(new Object[]{str, getContext().getString(R.string.header_football_goal_own)}, 2));
            }
            Object orDefault = linkedHashMap3.getOrDefault(Integer.valueOf(hashCode), new t09(obj, new ArrayList()));
            orDefault.getClass();
            t09 t09Var = (t09) orDefault;
            ArrayList arrayList = t09Var.b;
            Integer valueOf = Integer.valueOf(hashCode);
            arrayList.add(str);
            if (z2 && arrayList.size() > 1) {
                String string = getContext().getString(R.string.goals);
                string.getClass();
                t09Var.a = string;
            }
            linkedHashMap3.put(valueOf, t09Var);
        }
        if (z) {
            if (Intrinsics.c(this.J, linkedHashMap) && Intrinsics.c(this.K, linkedHashMap2)) {
                return;
            }
            this.J = linkedHashMap;
            this.K = linkedHashMap2;
            ksk goalsContainerBinding = getGoalsContainerBinding();
            LinearLayout linearLayout = goalsContainerBinding.d;
            LinearLayout linearLayout2 = goalsContainerBinding.b;
            linearLayout.removeAllViews();
            linearLayout2.removeAllViews();
            getGoalsContainerBinding().c.setVisibility(0);
            LinearLayout linearLayout3 = getGoalsContainerBinding().c;
            linearLayout3.getClass();
            if (!linearLayout3.isLaidOut() || linearLayout3.isLayoutRequested()) {
                linearLayout3.addOnLayoutChangeListener(new jj8(this, linkedHashMap, goalsContainerBinding, linkedHashMap2));
            } else {
                w(linkedHashMap, goalsContainerBinding.d, true);
                w(linkedHashMap2, linearLayout2, false);
            }
        }
    }

    @Override // defpackage.e21
    public final void u(RollingTextView rollingTextView, RollingTextView rollingTextView2, Integer num, Integer num2, boolean z) {
        TimerGoalAnimatedView timerTextView;
        if (!z) {
            super.u(rollingTextView, rollingTextView2, num, num2, z);
            return;
        }
        if (num == null || num2 == null) {
            return;
        }
        String f = rollingTextView.getF();
        String str = null;
        if (f == null || f.length() == 0) {
            f = null;
        }
        int parseInt = f != null ? Integer.parseInt(f.toString()) : num.intValue();
        String f2 = rollingTextView2.getF();
        if (f2 != null && f2.length() != 0) {
            str = f2;
        }
        int parseInt2 = str != null ? Integer.parseInt(str.toString()) : num2.intValue();
        boolean z2 = parseInt < num.intValue();
        boolean z3 = parseInt2 < num2.intValue();
        rollingTextView.d(String.valueOf(num.intValue()), z2, true);
        rollingTextView2.d(String.valueOf(num2.intValue()), z3, true);
        if ((z2 || z3) && (timerTextView = getTimerTextView()) != null) {
            if (!timerTextView.getWasActivityStopped()) {
                String string = timerTextView.getContext().getString(R.string.football_goal);
                string.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                String upperCase = string.toUpperCase(locale);
                upperCase.getClass();
                timerTextView.d(upperCase.concat("!"), true, true);
                timerTextView.n = true;
            }
            timerTextView.setWasActivityStopped(false);
        }
    }

    public final void v(tsk tskVar, int i, float f, int i2) {
        float f2 = i2 == 8388611 ? -1.0f : 1.0f;
        ImageView imageView = getGoalsContainerBinding().e;
        int i3 = this.F - 1;
        imageView.setAlpha(i == i3 ? 1.0f - f : i < i3 ? 1.0f : 0.0f);
        Iterator it = tskVar.iterator();
        int i4 = 0;
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                return;
            }
            Object next = uskVar.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                b.q();
                throw null;
            }
            View view = (View) next;
            if (i4 == i) {
                view.setAlpha(1.0f - f);
                view.setTranslationX(f * f2 * 20.0f * (this.n ? -1 : 1));
            } else if (i4 < i) {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationX(Float.MAX_VALUE);
            } else {
                view.setAlpha(1.0f);
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            i4 = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.view.View, android.view.ViewGroup] */
    public final void w(LinkedHashMap linkedHashMap, ViewGroup viewGroup, boolean z) {
        boolean z2;
        int i;
        ?? r13;
        CharSequence charSequence;
        boolean z3;
        boolean z4 = false;
        boolean z5 = linkedHashMap.size() <= 4;
        Collection values = linkedHashMap.values();
        values.getClass();
        int i2 = 0;
        boolean z6 = false;
        boolean z7 = z5;
        for (Object obj : values) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            t09 t09Var = (t09) obj;
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_event_result_incident, (ViewGroup) viewGroup, z4);
            inflate.getClass();
            TextView textView = (TextView) inflate;
            textView.setSelected(true);
            textView.setTextAlignment(z ? 6 : 5);
            ?? sb = new StringBuilder();
            if (z7 || i2 < 3) {
                String str = t09Var.a;
                ArrayList arrayList = t09Var.b;
                sb.append(str);
                String sb2 = sb.toString();
                Iterator it = arrayList.iterator();
                int i4 = z4 ? 1 : 0;
                z7 = z7;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    String str2 = (String) next;
                    z2 = z7;
                    if (i4 == 0 && arrayList.size() > 1) {
                        sb.append(" " + str2 + ", ");
                    } else if (i4 == 0) {
                        sb.append(" " + str2);
                    } else if (i4 < arrayList.size() - 1) {
                        sb.append(str2 + ", ");
                    } else {
                        sb.append(str2);
                    }
                    if (textView.getPaint().measureText(sb.toString()) > viewGroup.getWidth()) {
                        View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.view_event_result_incident, (ViewGroup) viewGroup, false);
                        inflate2.getClass();
                        TextView textView2 = (TextView) inflate2;
                        int length = sb2.length() - 1;
                        if (length >= 0) {
                            while (true) {
                                int i6 = length - 1;
                                if (!CharsKt.b(sb2.charAt(length))) {
                                    r13 = 0;
                                    charSequence = sb2.subSequence(0, length + 1);
                                    break;
                                } else {
                                    i = 0;
                                    if (i6 < 0) {
                                        break;
                                    } else {
                                        length = i6;
                                    }
                                }
                            }
                        } else {
                            i = 0;
                        }
                        charSequence = "";
                        r13 = i;
                        textView.setText(charSequence.toString());
                        viewGroup.addView(textView);
                        sb.setLength(r13);
                        int i7 = r13;
                        for (Object obj2 : CollectionsKt.S(arrayList, i4)) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                b.q();
                                throw null;
                            }
                            String str3 = (String) obj2;
                            if (i7 != 0) {
                                str3 = dmi.q(", ", str3);
                            }
                            sb.append(str3);
                            i7 = i8;
                        }
                        textView2.setSelected(true);
                        textView2.setTextAlignment(z ? 6 : 5);
                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                        textView2.setText(sb.toString());
                        if (this.G) {
                            textView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        viewGroup.addView(textView2);
                        z3 = r13;
                        i2 = i3;
                        z4 = z3;
                        z7 = z2;
                        z6 = z6;
                    } else {
                        sb2 = sb.toString();
                        z4 = false;
                        i4 = i5;
                        z7 = z2;
                    }
                }
            } else {
                Collection values2 = linkedHashMap.values();
                values2.getClass();
                Iterator it2 = CollectionsKt.S(values2, i2).iterator();
                int i9 = z4 ? 1 : 0;
                while (it2.hasNext()) {
                    i9 += ((t09) it2.next()).b.size();
                }
                sb.append(getContext().getResources().getQuantityString(R.plurals.header_football_additional_goals, i9, Integer.valueOf(i9)));
                z6 = true;
            }
            z2 = z7;
            z3 = z4;
            textView.setText(sb.toString());
            if (this.G) {
                textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            viewGroup.addView(textView);
            if (z6) {
                ksk goalsContainerBinding = getGoalsContainerBinding();
                this.F = Math.max(goalsContainerBinding.d.getChildCount(), goalsContainerBinding.b.getChildCount());
                return;
            } else {
                i2 = i3;
                z4 = z3;
                z7 = z2;
                z6 = z6;
            }
        }
        ksk goalsContainerBinding2 = getGoalsContainerBinding();
        this.F = Math.max(goalsContainerBinding2.d.getChildCount(), goalsContainerBinding2.b.getChildCount());
    }

    public final void x() {
        s();
        t(getFirstTeamLogo(), getBinding().i, getBinding().g, getFollowButtonFirstTeam(), getBinding().k, getBinding().j, getBinding().f, 8388611);
        t(getSecondTeamLogo(), getBinding().p, getBinding().n, getFollowButtonSecondTeam(), getBinding().r, getBinding().q, getBinding().m, 8388613);
        r();
    }
}
