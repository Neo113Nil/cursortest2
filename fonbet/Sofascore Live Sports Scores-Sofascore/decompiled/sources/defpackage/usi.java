package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class usi extends o8 implements go1 {
    public final dd d;
    public final int e;
    public final int f;
    public final int g;
    public final ArrayList h;
    public final LinkedHashMap i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usi(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.sport_table;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.sport_table, root);
        if (linearLayout != null) {
            i = R.id.tennis_live_table;
            View B = nq8.B(R.id.tennis_live_table, root);
            if (B != null) {
                int i2 = R.id.bottom_divider;
                View B2 = nq8.B(R.id.bottom_divider, B);
                if (B2 != null) {
                    i2 = R.id.bottom_guideline;
                    if (((Guideline) nq8.B(R.id.bottom_guideline, B)) != null) {
                        i2 = R.id.bottom_padding;
                        View B3 = nq8.B(R.id.bottom_padding, B);
                        if (B3 != null) {
                            i2 = R.id.center_guideline;
                            if (((Guideline) nq8.B(R.id.center_guideline, B)) != null) {
                                i2 = R.id.tennis_first_name;
                                TextView textView = (TextView) nq8.B(R.id.tennis_first_name, B);
                                if (textView != null) {
                                    i2 = R.id.tennis_second_name;
                                    TextView textView2 = (TextView) nq8.B(R.id.tennis_second_name, B);
                                    if (textView2 != null) {
                                        i2 = R.id.top_divider;
                                        View B4 = nq8.B(R.id.top_divider, B);
                                        if (B4 != null) {
                                            i2 = R.id.top_guideline;
                                            if (((Guideline) nq8.B(R.id.top_guideline, B)) != null) {
                                                this.d = new dd((FrameLayout) root, linearLayout, new djf((ConstraintLayout) B, B2, B3, textView, textView2, B4), 8);
                                                this.e = context.getColor(R.color.n_lv_1);
                                                this.f = context.getColor(R.color.n_lv_3);
                                                this.g = context.getColor(R.color.live);
                                                IntRange intRange = new IntRange(1, 7, 1);
                                                ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
                                                v6a it = intRange.iterator();
                                                while (it.c) {
                                                    arrayList.add("period" + it.nextInt());
                                                }
                                                this.h = CollectionsKt.w0(b.j("overtime", "penalties"), arrayList);
                                                this.i = new LinkedHashMap();
                                                o8.d(this, 0, 7);
                                                setVisibility(8);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i2)));
                throw null;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final void setTextColors(Event event) {
        String lastPeriod;
        for (Map.Entry entry : this.i.entrySet()) {
            if (me4.t(StatusKt.STATUS_IN_PROGRESS, event) && (lastPeriod = event.getLastPeriod()) != null && StringsKt.J(lastPeriod, (CharSequence) entry.getKey(), false)) {
                TextView textView = ((ky4) entry.getValue()).b;
                int i = this.g;
                textView.setTextColor(i);
                ((ky4) entry.getValue()).c.setTextColor(i);
                ((ky4) entry.getValue()).d.setTextColor(i);
                ((ky4) entry.getValue()).e.setTextColor(i);
                ((ky4) entry.getValue()).f.setTextColor(i);
            } else {
                Integer scoreByPeriodName = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName((String) entry.getKey());
                int intValue = scoreByPeriodName != null ? scoreByPeriodName.intValue() : 0;
                Integer scoreByPeriodName2 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName((String) entry.getKey());
                int intValue2 = scoreByPeriodName2 != null ? scoreByPeriodName2.intValue() : 0;
                Integer tieBreakByPeriodName = Event.getHomeScore$default(event, null, 1, null).getTieBreakByPeriodName((String) entry.getKey());
                int intValue3 = tieBreakByPeriodName != null ? tieBreakByPeriodName.intValue() : 0;
                Integer tieBreakByPeriodName2 = Event.getAwayScore$default(event, null, 1, null).getTieBreakByPeriodName((String) entry.getKey());
                int intValue4 = tieBreakByPeriodName2 != null ? tieBreakByPeriodName2.intValue() : 0;
                TextView textView2 = ((ky4) entry.getValue()).b;
                int i2 = this.e;
                Integer valueOf = Integer.valueOf(i2);
                if (intValue <= intValue2) {
                    valueOf = null;
                }
                int i3 = this.f;
                textView2.setTextColor(valueOf != null ? valueOf.intValue() : i3);
                TextView textView3 = ((ky4) entry.getValue()).c;
                Integer valueOf2 = Integer.valueOf(i2);
                if (intValue >= intValue2) {
                    valueOf2 = null;
                }
                textView3.setTextColor(valueOf2 != null ? valueOf2.intValue() : i3);
                TextView textView4 = ((ky4) entry.getValue()).d;
                Integer valueOf3 = Integer.valueOf(i2);
                if (intValue3 <= intValue4) {
                    valueOf3 = null;
                }
                textView4.setTextColor(valueOf3 != null ? valueOf3.intValue() : i3);
                TextView textView5 = ((ky4) entry.getValue()).e;
                Integer valueOf4 = intValue3 < intValue4 ? Integer.valueOf(i2) : null;
                textView5.setTextColor(valueOf4 != null ? valueOf4.intValue() : i3);
                ((ky4) entry.getValue()).f.setTextColor(i3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x023f, code lost:
    
        if (r4.containsKey(r12.getKey()) != true) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0241, code lost:
    
        r13 = ((defpackage.ky4) r12.getValue()).f;
        r12 = r4.get(r12.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0253, code lost:
    
        if (r12 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0255, code lost:
    
        r12 = defpackage.ug5.C(r12.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025f, code lost:
    
        r13.setText(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x025e, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fd  */
    @Override // defpackage.go1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Event event) {
        Integer num;
        int indexOfChild;
        Integer defaultPeriodCount;
        String lastPeriod;
        Map<String, String> periods = event.getPeriods();
        if (periods == null || periods.isEmpty() || me4.t(StatusKt.STATUS_NOT_STARTED, event)) {
            return;
        }
        setVisibility(0);
        LinkedHashMap linkedHashMap = this.i;
        ArrayList<String> arrayList = linkedHashMap.isEmpty() ? this.h : null;
        dd ddVar = this.d;
        if (arrayList != null) {
            for (String str : arrayList) {
                String str2 = periods.get(str);
                if (str2 != null) {
                    View inflate = LayoutInflater.from(getContext()).inflate(R.layout.details_table_column, (ViewGroup) ddVar.c, false);
                    int i = R.id.bottom_guideline;
                    if (((Guideline) nq8.B(R.id.bottom_guideline, inflate)) != null) {
                        i = R.id.center_guideline;
                        if (((Guideline) nq8.B(R.id.center_guideline, inflate)) != null) {
                            i = R.id.score_first;
                            TextView textView = (TextView) nq8.B(R.id.score_first, inflate);
                            if (textView != null) {
                                i = R.id.score_second;
                                TextView textView2 = (TextView) nq8.B(R.id.score_second, inflate);
                                if (textView2 != null) {
                                    i = R.id.score_tie_first;
                                    TextView textView3 = (TextView) nq8.B(R.id.score_tie_first, inflate);
                                    if (textView3 != null) {
                                        i = R.id.score_tie_second;
                                        TextView textView4 = (TextView) nq8.B(R.id.score_tie_second, inflate);
                                        if (textView4 != null) {
                                            i = R.id.time;
                                            TextView textView5 = (TextView) nq8.B(R.id.time, inflate);
                                            if (textView5 != null) {
                                                i = R.id.title;
                                                TextView textView6 = (TextView) nq8.B(R.id.title, inflate);
                                                if (textView6 != null) {
                                                    i = R.id.top_divider;
                                                    View B = nq8.B(R.id.top_divider, inflate);
                                                    if (B != null) {
                                                        i = R.id.top_guideline;
                                                        if (((Guideline) nq8.B(R.id.top_guideline, inflate)) != null) {
                                                            i = R.id.vertical_divider_time;
                                                            View B2 = nq8.B(R.id.vertical_divider_time, inflate);
                                                            if (B2 != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                ky4 ky4Var = new ky4(constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, B, B2);
                                                                Context context = getContext();
                                                                context.getClass();
                                                                textView6.setText(t6a.w(context, str2));
                                                                ((LinearLayout) ddVar.c).addView(constraintLayout);
                                                                linkedHashMap.put(str, ky4Var);
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
                    return;
                }
            }
        }
        LinearLayout linearLayout = (LinearLayout) ddVar.c;
        djf djfVar = (djf) ddVar.d;
        linearLayout.setVisibility(0);
        if (Intrinsics.c(event.getTournament().getCategory().getSport().getSlug(), Sports.TENNIS)) {
            ((ConstraintLayout) djfVar.b).setVisibility(0);
            TextView textView7 = (TextView) djfVar.g;
            Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
            Context context2 = getContext();
            context2.getClass();
            textView7.setText(tba.p(context2, homeTeam$default));
            TextView textView8 = (TextView) djfVar.e;
            Team awayTeam$default = Event.getAwayTeam$default(event, null, 1, null);
            Context context3 = getContext();
            context3.getClass();
            textView8.setText(tba.p(context3, awayTeam$default));
            Time time = event.getTime();
            Map<String, Long> timeMap = time != null ? time.getTimeMap() : null;
            boolean z = false;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                TextView textView9 = ((ky4) entry.getValue()).d;
                Integer tieBreakByPeriodName = Event.getHomeScore$default(event, null, 1, null).getTieBreakByPeriodName((String) entry.getKey());
                textView9.setText(tieBreakByPeriodName != null ? String.valueOf(tieBreakByPeriodName.intValue()) : null);
                TextView textView10 = ((ky4) entry.getValue()).e;
                Integer tieBreakByPeriodName2 = Event.getAwayScore$default(event, null, 1, null).getTieBreakByPeriodName((String) entry.getKey());
                textView10.setText(tieBreakByPeriodName2 != null ? String.valueOf(tieBreakByPeriodName2.intValue()) : null);
                if (Intrinsics.c(event.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS) && (lastPeriod = event.getLastPeriod()) != null && StringsKt.J(lastPeriod, (CharSequence) entry.getKey(), false)) {
                    Long currentPeriodStartTimestamp = event.getCurrentPeriodStartTimestamp();
                    if ((currentPeriodStartTimestamp != null ? currentPeriodStartTimestamp.longValue() : 0L) > 0) {
                        TextView textView11 = ((ky4) entry.getValue()).f;
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Long currentPeriodStartTimestamp2 = event.getCurrentPeriodStartTimestamp();
                        textView11.setText(ug5.C(currentTimeMillis - (currentPeriodStartTimestamp2 != null ? currentPeriodStartTimestamp2.longValue() : 0L)));
                        z = true;
                    }
                }
            }
            String slug = event.getTournament().getCategory().getSport().getSlug();
            Integer num2 = ((timeMap == null || timeMap.isEmpty()) && !z) ? null : 0;
            j(num2 != null ? num2.intValue() : 8, slug);
        } else {
            ((ConstraintLayout) djfVar.b).setVisibility(8);
            j(8, event.getTournament().getCategory().getSport().getSlug());
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            ConstraintLayout constraintLayout2 = ((ky4) entry2.getValue()).a;
            if (ph0.a0(new String[]{"overtime", "penalties"}).contains(entry2.getKey())) {
                String str3 = (String) entry2.getKey();
                if (Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(str3) != null && Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(str3) != null) {
                    num = 0;
                    constraintLayout2.setVisibility(num == null ? num.intValue() : 8);
                    indexOfChild = ((LinearLayout) ddVar.c).indexOfChild(((ky4) entry2.getValue()).a);
                    defaultPeriodCount = event.getDefaultPeriodCount();
                    if (indexOfChild >= (defaultPeriodCount == null ? defaultPeriodCount.intValue() : 0)) {
                        String str4 = (String) entry2.getKey();
                        if (Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName(str4) == null || Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName(str4) == null) {
                            ((ky4) entry2.getValue()).a.setVisibility(8);
                            TextView textView12 = ((ky4) entry2.getValue()).b;
                            Integer scoreByPeriodName = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName((String) entry2.getKey());
                            textView12.setText(scoreByPeriodName != null ? String.valueOf(scoreByPeriodName.intValue()) : null);
                            TextView textView13 = ((ky4) entry2.getValue()).c;
                            Integer scoreByPeriodName2 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName((String) entry2.getKey());
                            textView13.setText(scoreByPeriodName2 != null ? String.valueOf(scoreByPeriodName2.intValue()) : null);
                        }
                    }
                    ((ky4) entry2.getValue()).a.setVisibility(0);
                    TextView textView122 = ((ky4) entry2.getValue()).b;
                    Integer scoreByPeriodName3 = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName((String) entry2.getKey());
                    textView122.setText(scoreByPeriodName3 != null ? String.valueOf(scoreByPeriodName3.intValue()) : null);
                    TextView textView132 = ((ky4) entry2.getValue()).c;
                    Integer scoreByPeriodName22 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName((String) entry2.getKey());
                    textView132.setText(scoreByPeriodName22 != null ? String.valueOf(scoreByPeriodName22.intValue()) : null);
                }
            }
            num = null;
            constraintLayout2.setVisibility(num == null ? num.intValue() : 8);
            indexOfChild = ((LinearLayout) ddVar.c).indexOfChild(((ky4) entry2.getValue()).a);
            defaultPeriodCount = event.getDefaultPeriodCount();
            if (indexOfChild >= (defaultPeriodCount == null ? defaultPeriodCount.intValue() : 0)) {
            }
            ((ky4) entry2.getValue()).a.setVisibility(0);
            TextView textView1222 = ((ky4) entry2.getValue()).b;
            Integer scoreByPeriodName32 = Event.getHomeScore$default(event, null, 1, null).getScoreByPeriodName((String) entry2.getKey());
            textView1222.setText(scoreByPeriodName32 != null ? String.valueOf(scoreByPeriodName32.intValue()) : null);
            TextView textView1322 = ((ky4) entry2.getValue()).c;
            Integer scoreByPeriodName222 = Event.getAwayScore$default(event, null, 1, null).getScoreByPeriodName((String) entry2.getKey());
            textView1322.setText(scoreByPeriodName222 != null ? String.valueOf(scoreByPeriodName222.intValue()) : null);
        }
        setTextColors(event);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.details_table;
    }

    public final void j(int i, String str) {
        if (Intrinsics.c(str, Sports.TENNIS)) {
            dd ddVar = this.d;
            ((View) ((djf) ddVar.d).c).setVisibility(i);
            ((View) ((djf) ddVar.d).d).setVisibility(i);
        }
        Collection<ky4> values = this.i.values();
        values.getClass();
        for (ky4 ky4Var : values) {
            ky4Var.f.setVisibility(i);
            ky4Var.h.setVisibility(i);
        }
    }
}
