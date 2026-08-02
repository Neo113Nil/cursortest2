package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.mvvm.model.StatisticSection;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsItem;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nb6 extends g7 {
    public final String l;
    public final boolean m;
    public List n;
    public int o;
    public boolean p;
    public gc6 q;
    public ml8 r;
    public be9 s;
    public b56 t;
    public final Set u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb6(Context context, String str, boolean z) {
        super(context);
        context.getClass();
        str.getClass();
        this.l = str;
        this.m = z;
        this.p = true;
        this.u = ph0.a0(new String[]{Sports.FOOTBALL, Sports.AMERICAN_FOOTBALL, Sports.BASEBALL, Sports.TENNIS, Sports.ICE_HOCKEY});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [g7, nb6] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    @Override // defpackage.g7
    public final void A() {
        EventStatisticsItem eventStatisticsItem;
        be9 be9Var;
        SharedPreferences d;
        SharedPreferences d2;
        b56 b56Var;
        ml8 ml8Var;
        gc6 gc6Var;
        be9 be9Var2;
        List list = this.n;
        if (list == null) {
            Intrinsics.i("statisticsList");
            throw null;
        }
        EventStatisticsPeriod eventStatisticsPeriod = (EventStatisticsPeriod) CollectionsKt.a0(this.o, list);
        if (eventStatisticsPeriod != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new CustomizableDivider(false, 0, true, null, 10, null));
            int size = eventStatisticsPeriod.getGroups().size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                EventStatisticsGroup eventStatisticsGroup = eventStatisticsPeriod.getGroups().get(i);
                boolean z2 = Intrinsics.c(eventStatisticsGroup.getGroupName(), "Shots") && (be9Var2 = this.s) != null && be9Var2.getVisibility() == 0;
                if (z2) {
                    arrayList.add(new ie9(false));
                    z = true;
                }
                if (this.u.contains(this.l)) {
                    arrayList.add(new StatisticSection(eventStatisticsGroup.getGroupName(), 0, !z2));
                } else {
                    ((EventStatisticsItem) CollectionsKt.Y(eventStatisticsGroup.getStatisticsItems())).setRoundTop(true);
                }
                if (Intrinsics.c(eventStatisticsGroup.getGroupName(), "Passes") && (gc6Var = this.q) != null) {
                    arrayList.add(gc6Var);
                }
                if (Intrinsics.c(eventStatisticsGroup.getGroupName(), "Shots") && (ml8Var = this.r) != null) {
                    arrayList.add(ml8Var);
                }
                if (Intrinsics.c(eventStatisticsGroup.getGroupName(), "Attack") && (b56Var = this.t) != null) {
                    arrayList.add(b56Var);
                }
                for (EventStatisticsItem eventStatisticsItem2 : eventStatisticsGroup.getStatisticsItems()) {
                    arrayList.add(eventStatisticsItem2);
                    if (eventStatisticsItem2.getSpecialStatisticType() == EventStatisticsItem.SpecialEventStatisticType.DistanceCovered) {
                        Context context = this.b;
                        context.getClass();
                        SharedPreferences sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext = context.getApplicationContext();
                            synchronized (uic.i) {
                                d2 = a5f.d(applicationContext);
                                uic.j = d2;
                            }
                            d2.getClass();
                            sharedPreferences = d2;
                        }
                        int i2 = sharedPreferences.getInt("DISTANCE_COVERED_SEEN_COUNTER", 0);
                        if (i2 == 3) {
                            continue;
                        } else {
                            Context context2 = this.b;
                            context2.getClass();
                            SharedPreferences sharedPreferences2 = uic.j;
                            if (sharedPreferences2 == null) {
                                Context applicationContext2 = context2.getApplicationContext();
                                synchronized (uic.i) {
                                    d = a5f.d(applicationContext2);
                                    uic.j = d;
                                }
                                d.getClass();
                                sharedPreferences2 = d;
                            }
                            SharedPreferences.Editor edit = sharedPreferences2.edit();
                            edit.getClass();
                            edit.putInt("DISTANCE_COVERED_SEEN_COUNTER", i2 + 1);
                            edit.apply();
                            String string = this.b.getString(R.string.football_running_see_team_distance_info);
                            string.getClass();
                            arrayList.add(new db6(string));
                        }
                    }
                }
                ((EventStatisticsItem) CollectionsKt.h0(eventStatisticsGroup.getStatisticsItems())).setRoundBottom(true);
            }
            if (!z && (be9Var = this.s) != null && be9Var.getVisibility() == 0) {
                arrayList.add(new ie9(true));
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    eventStatisticsItem = listIterator.previous();
                    if (eventStatisticsItem instanceof EventStatisticsItem) {
                        break;
                    }
                } else {
                    eventStatisticsItem = 0;
                    break;
                }
            }
            EventStatisticsItem eventStatisticsItem3 = eventStatisticsItem instanceof EventStatisticsItem ? eventStatisticsItem : null;
            if (eventStatisticsItem3 != null) {
                eventStatisticsItem3.setHideDivider(true);
            }
            F(arrayList);
        }
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 16);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof EventStatisticsItem) {
            Integer renderType = ((EventStatisticsItem) obj).getRenderType();
            if (renderType != null && renderType.intValue() == 2) {
                return 1;
            }
            if (renderType != null && renderType.intValue() == 3) {
                return 3;
            }
            return (renderType != null && renderType.intValue() == 4) ? 4 : 2;
        }
        if (obj instanceof StatisticSection) {
            return 5;
        }
        if (obj instanceof db6) {
            return 10;
        }
        if (obj instanceof CustomizableDivider) {
            return 6;
        }
        if (obj instanceof gc6) {
            return 7;
        }
        if (obj instanceof b56) {
            return 8;
        }
        if (obj instanceof ml8) {
            return 9;
        }
        if (obj instanceof ie9) {
            return 11;
        }
        a70.p(obj.getClass().getSimpleName());
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = R.id.progress_home;
        String str = this.l;
        Context context = this.b;
        switch (i) {
            case 1:
                View inflate = LayoutInflater.from(context).inflate(R.layout.statistics_single_progress, viewGroup, false);
                int i3 = R.id.guideline_end;
                Guideline guideline = (Guideline) nq8.B(R.id.guideline_end, inflate);
                if (guideline != null) {
                    i3 = R.id.guideline_start;
                    Guideline guideline2 = (Guideline) nq8.B(R.id.guideline_start, inflate);
                    if (guideline2 != null) {
                        i3 = R.id.progress_bar;
                        ProgressBar progressBar = (ProgressBar) nq8.B(R.id.progress_bar, inflate);
                        if (progressBar != null) {
                            i3 = R.id.stat_away;
                            TextView textView = (TextView) nq8.B(R.id.stat_away, inflate);
                            if (textView != null) {
                                i3 = R.id.stat_home;
                                TextView textView2 = (TextView) nq8.B(R.id.stat_home, inflate);
                                if (textView2 != null) {
                                    i3 = R.id.title;
                                    TextView textView3 = (TextView) nq8.B(R.id.title, inflate);
                                    if (textView3 != null) {
                                        return new mb6(this, new v82((ConstraintLayout) inflate, guideline, guideline2, progressBar, textView, textView2, textView3), str, new bb6(this, 0));
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 2:
                return new kb6(this, nr1.d(LayoutInflater.from(context).inflate(R.layout.statistics_linear_progress_comparison_view, viewGroup, false)), str, new bb6(this, 1));
            case 3:
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.statistics_circular_progress_comparison_view, viewGroup, false);
                TextView textView4 = (TextView) nq8.B(R.id.label, inflate2);
                if (textView4 != null) {
                    View B = nq8.B(R.id.progress_away, inflate2);
                    if (B != null) {
                        z3f a = z3f.a(B);
                        View B2 = nq8.B(R.id.progress_home, inflate2);
                        if (B2 != null) {
                            z3f a2 = z3f.a(B2);
                            i2 = R.id.value_away;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) nq8.B(R.id.value_away, inflate2);
                            if (appCompatTextView != null) {
                                i2 = R.id.value_home;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) nq8.B(R.id.value_home, inflate2);
                                if (appCompatTextView2 != null) {
                                    return new ib6(this, new djf((ViewGroup) inflate2, textView4, (Object) a, (Object) a2, (View) appCompatTextView, (View) appCompatTextView2, 6), str, new bb6(this, 2));
                                }
                            }
                        }
                    } else {
                        i2 = R.id.progress_away;
                    }
                } else {
                    i2 = R.id.label;
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                return null;
            case 4:
                View inflate3 = LayoutInflater.from(context).inflate(R.layout.statistics_circular_progress_comparison_big, viewGroup, false);
                TextView textView5 = (TextView) nq8.B(R.id.label, inflate3);
                if (textView5 != null) {
                    int i4 = R.id.percentage_away;
                    TextView textView6 = (TextView) nq8.B(R.id.percentage_away, inflate3);
                    if (textView6 != null) {
                        i4 = R.id.percentage_home;
                        TextView textView7 = (TextView) nq8.B(R.id.percentage_home, inflate3);
                        if (textView7 != null) {
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) nq8.B(R.id.progress_away, inflate3);
                            if (circularProgressIndicator != null) {
                                CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) nq8.B(R.id.progress_home, inflate3);
                                if (circularProgressIndicator2 != null) {
                                    return new eb6(this, new djf((ViewGroup) inflate3, textView5, (Object) textView6, (Object) textView7, (View) circularProgressIndicator, (View) circularProgressIndicator2, 5), str, new bb6(this, 3));
                                }
                            } else {
                                i2 = R.id.progress_away;
                            }
                        }
                    }
                    i2 = i4;
                } else {
                    i2 = R.id.label;
                }
                yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i2)));
                return null;
            case 5:
                return new z02(this, u22.d(LayoutInflater.from(context), viewGroup), str);
            case 6:
                return new wh(new SofaDivider(context, null, 6));
            case 7:
                return new vh(this, ez0.b(LayoutInflater.from(context).inflate(R.layout.football_play_areas, viewGroup, false)));
            case 8:
                return new cb6(this, t54.a(LayoutInflater.from(context), viewGroup), 2);
            case 9:
                return new cb6(this, t54.a(LayoutInflater.from(context), viewGroup), 1);
            case 10:
                View inflate4 = LayoutInflater.from(context).inflate(R.layout.statistics_tooltip, viewGroup, false);
                View B3 = nq8.B(R.id.tooltip, inflate4);
                if (B3 != null) {
                    return new vh(this, new ed((FrameLayout) inflate4, 23, z3f.c(B3)));
                }
                yhk.s("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(R.id.tooltip)));
                return null;
            case 11:
                return new cb6(this, t54.a(LayoutInflater.from(context), viewGroup), 0);
            default:
                ilg.c();
                return null;
        }
    }
}
