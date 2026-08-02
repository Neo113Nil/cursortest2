package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.StatusTime;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.results.R;
import java.time.Instant;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d66 extends o8 {
    public final iy4 d;

    public d66(AppCompatActivity appCompatActivity) {
        super(appCompatActivity, null, 0);
        View root = getRoot();
        int i = R.id.current_progress_text;
        TextView textView = (TextView) nq8.B(R.id.current_progress_text, root);
        if (textView != null) {
            i = R.id.end_circle;
            View B = nq8.B(R.id.end_circle, root);
            if (B != null) {
                i = R.id.et1_text;
                TextView textView2 = (TextView) nq8.B(R.id.et1_text, root);
                if (textView2 != null) {
                    i = R.id.et_ft_text;
                    TextView textView3 = (TextView) nq8.B(R.id.et_ft_text, root);
                    if (textView3 != null) {
                        i = R.id.extra_end_circle;
                        View B2 = nq8.B(R.id.extra_end_circle, root);
                        if (B2 != null) {
                            i = R.id.extra_middle_circle;
                            View B3 = nq8.B(R.id.extra_middle_circle, root);
                            if (B3 != null) {
                                i = R.id.extra_time_group;
                                Group group = (Group) nq8.B(R.id.extra_time_group, root);
                                if (group != null) {
                                    i = R.id.extra_time_progress;
                                    ProgressBar progressBar = (ProgressBar) nq8.B(R.id.extra_time_progress, root);
                                    if (progressBar != null) {
                                        i = R.id.ft_time;
                                        TextView textView4 = (TextView) nq8.B(R.id.ft_time, root);
                                        if (textView4 != null) {
                                            i = R.id.header_end_text;
                                            TextView textView5 = (TextView) nq8.B(R.id.header_end_text, root);
                                            if (textView5 != null) {
                                                i = R.id.header_middle_text;
                                                TextView textView6 = (TextView) nq8.B(R.id.header_middle_text, root);
                                                if (textView6 != null) {
                                                    i = R.id.header_start_time;
                                                    TextView textView7 = (TextView) nq8.B(R.id.header_start_time, root);
                                                    if (textView7 != null) {
                                                        i = R.id.ht_time;
                                                        TextView textView8 = (TextView) nq8.B(R.id.ht_time, root);
                                                        if (textView8 != null) {
                                                            i = R.id.middle_circle;
                                                            View B4 = nq8.B(R.id.middle_circle, root);
                                                            if (B4 != null) {
                                                                i = R.id.progress_container;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.progress_container, root);
                                                                if (constraintLayout != null) {
                                                                    i = R.id.progress_view_header;
                                                                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.progress_view_header, root);
                                                                    if (linearLayout != null) {
                                                                        i = R.id.regular_time_progress;
                                                                        ProgressBar progressBar2 = (ProgressBar) nq8.B(R.id.regular_time_progress, root);
                                                                        if (progressBar2 != null) {
                                                                            i = R.id.start_circle;
                                                                            View B5 = nq8.B(R.id.start_circle, root);
                                                                            if (B5 != null) {
                                                                                i = R.id.start_time;
                                                                                TextView textView9 = (TextView) nq8.B(R.id.start_time, root);
                                                                                if (textView9 != null) {
                                                                                    this.d = new iy4((LinearLayout) root, textView, B, textView2, textView3, B2, B3, group, progressBar, textView4, textView5, textView6, textView7, textView8, B4, constraintLayout, linearLayout, progressBar2, B5, textView9);
                                                                                    setVisibility(8);
                                                                                    o8.d(this, 0, 7);
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final void setHeaderEndText(Event event) {
        String str;
        String u = z8e.u(getContext(), event.getStatusDescription(), ok3.s(event), true);
        Time time = event.getTime();
        if (time != null) {
            int code = event.getStatus().getCode();
            str = pd0.t(time, code);
            if (str.length() > 0) {
                str = ", ".concat(pd0.t(time, code));
            }
        } else {
            str = "";
        }
        this.d.k.setText(String.format("%s%s", Arrays.copyOf(new Object[]{u, str}, 2)));
    }

    private final void setHeaderEndTextCountdown(Event event) {
        int y;
        String u = z8e.u(getContext(), event.getStatusDescription(), ok3.s(event), true);
        Time time = event.getTime();
        String str = "";
        if (time != null && (y = pd0.y(time, event.getStatus().getCode())) != -1) {
            str = fc6.n(" • ", getResources().getString(R.string.time_left), " ", rei.k(y, true));
        }
        this.d.k.setText(String.format("%s%s", Arrays.copyOf(new Object[]{u, str}, 2)));
    }

    private final void setHeaderStartTime(Event event) {
        boolean B = fc6.B(fc6.t(Instant.ofEpochSecond(event.getStartTimestamp())));
        TextView textView = this.d.m;
        String string = getContext().getString(R.string.today);
        if (!B) {
            string = null;
        }
        if (string == null) {
            long startTimestamp = event.getStartTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMY;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            string = fc6.i(startTimestamp, hk4.a(bi4Var.d()));
        }
        Context context = getContext();
        context.getClass();
        long startTimestamp2 = event.getStartTimestamp();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
        bestPattern.getClass();
        textView.setText(String.format("%s %s", Arrays.copyOf(new Object[]{string, fc6.i(startTimestamp2, hk4.a(bestPattern))}, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTime$lambda$0(d66 d66Var) {
        d66Var.d.b.setText("");
    }

    @NotNull
    public final iy4 getBinding() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.details_progress_view;
    }

    public int getProgressCircleDrawable() {
        return R.drawable.progress_view_red_circle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.BASKETBALL) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0259, code lost:
    
        r2 = r10.p;
        r3 = r10.q;
        r2.setVisibility(8);
        r3.setVisibility(0);
        r2 = getContext();
        r2.getClass();
        r3.setPaddingRelative(r3.getPaddingStart(), r3.getPaddingTop(), r3.getPaddingEnd(), defpackage.ao2.s(8, r2));
        setVisibility(0);
        setHeaderStartTime(r19);
        setHeaderEndTextCountdown(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.AMERICAN_FOOTBALL) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0229, code lost:
    
        if (r2.equals(com.sofascore.model.Sports.ICE_HOCKEY) == false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Event event, boolean z) {
        String slug = event.getTournament().getCategory().getSport().getSlug();
        String type = event.getStatus().getType();
        if (getVisibility() == 0 && me4.t(StatusKt.STATUS_IN_PROGRESS, event)) {
            Time time = event.getTime();
            if ((time != null ? time.getStatusTime() : null) != null && z) {
                return;
            }
        }
        Integer num = 8;
        if (!Intrinsics.c(type, StatusKt.STATUS_NOT_STARTED) && !Intrinsics.c(type, StatusKt.STATUS_POSTPONED) && !Intrinsics.c(type, StatusKt.STATUS_CANCELED) && z) {
            num = null;
        }
        setVisibility(num != null ? num.intValue() : 0);
        if (getVisibility() == 8) {
            return;
        }
        boolean c = Intrinsics.c(type, StatusKt.STATUS_FINISHED);
        iy4 iy4Var = this.d;
        if (c) {
            haa.D(iy4Var.k);
        } else {
            haa.B(iy4Var.k);
        }
        int i = 2;
        switch (slug.hashCode()) {
            case -2002238939:
                break;
            case -877324069:
                if (slug.equals(Sports.TENNIS)) {
                    ConstraintLayout constraintLayout = iy4Var.p;
                    TextView textView = iy4Var.k;
                    LinearLayout linearLayout = iy4Var.q;
                    constraintLayout.setVisibility(8);
                    linearLayout.setVisibility(0);
                    Context context = getContext();
                    context.getClass();
                    linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), ao2.s(8, context));
                    setVisibility(0);
                    setHeaderStartTime(event);
                    if (event.getTotalPeriodTime() > 0) {
                        if (!Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS)) {
                            if (!Intrinsics.c(type, StatusKt.STATUS_FINISHED)) {
                                setHeaderEndText(event);
                                break;
                            } else {
                                haa.D(textView);
                                textView.setText(String.format("%s - %s", Arrays.copyOf(new Object[]{z8e.u(getContext(), event.getStatusDescription(), ok3.s(event), true), ug5.C(event.getTotalPeriodTime())}, 2)));
                                break;
                            }
                        } else {
                            TextView textView2 = iy4Var.l;
                            String string = getContext().getString(R.string.total);
                            string.getClass();
                            Locale locale = Locale.getDefault();
                            locale.getClass();
                            String lowerCase = string.toLowerCase(locale);
                            lowerCase.getClass();
                            textView2.setText(String.format("(%s: %s)", Arrays.copyOf(new Object[]{lowerCase, ug5.C(event.getTotalPeriodTime())}, 2)));
                            setHeaderEndText(event);
                            break;
                        }
                    }
                }
                ConstraintLayout constraintLayout2 = iy4Var.p;
                LinearLayout linearLayout2 = iy4Var.q;
                constraintLayout2.setVisibility(8);
                linearLayout2.setVisibility(0);
                Context context2 = getContext();
                context2.getClass();
                linearLayout2.setPaddingRelative(linearLayout2.getPaddingStart(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingEnd(), ao2.s(8, context2));
                setVisibility(0);
                setHeaderStartTime(event);
                setHeaderEndText(event);
                break;
            case -83759494:
                break;
            case 394668909:
                if (slug.equals(Sports.FOOTBALL)) {
                    if (!Intrinsics.c(type, StatusKt.STATUS_IN_PROGRESS)) {
                        iy4Var.q.setVisibility(8);
                        iy4Var.p.setVisibility(8);
                        setVisibility(8);
                        setHeaderStartTime(event);
                        setHeaderEndText(event);
                        break;
                    } else {
                        TextView textView3 = iy4Var.t;
                        Context context3 = getContext();
                        context3.getClass();
                        long startTimestamp = event.getStartTimestamp();
                        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context3) ? "Hm" : "hm");
                        bestPattern.getClass();
                        fn0.u(startTimestamp, hk4.a(bestPattern), textView3);
                        iy4Var.q.setVisibility(8);
                        iy4Var.p.setVisibility(0);
                        boolean z2 = (Event.getHomeScore$default(event, null, 1, null).getOvertime() == null && Event.getAwayScore$default(event, null, 1, null).getOvertime() == null && event.getStatus().getCode() != 32) ? false : true;
                        int code = event.getStatus().getCode();
                        if (code != 50 && code != 110 && code != 120) {
                            switch (code) {
                                case 31:
                                    p(45L, 90L);
                                    break;
                                case 32:
                                    p(90L, 90L);
                                    o(0L, 30L);
                                    break;
                                case 33:
                                    p(90L, 90L);
                                    o(15L, 30L);
                                    break;
                            }
                            iy4Var.a.post(new po0(this, z2, i));
                            setTime(event);
                            break;
                        }
                        p(90L, 90L);
                        if (z2) {
                            o(30L, 30L);
                        }
                        iy4Var.a.post(new po0(this, z2, i));
                        setTime(event);
                    }
                }
                ConstraintLayout constraintLayout22 = iy4Var.p;
                LinearLayout linearLayout22 = iy4Var.q;
                constraintLayout22.setVisibility(8);
                linearLayout22.setVisibility(0);
                Context context22 = getContext();
                context22.getClass();
                linearLayout22.setPaddingRelative(linearLayout22.getPaddingStart(), linearLayout22.getPaddingTop(), linearLayout22.getPaddingEnd(), ao2.s(8, context22));
                setVisibility(0);
                setHeaderStartTime(event);
                setHeaderEndText(event);
                break;
            case 727149765:
                break;
            default:
                ConstraintLayout constraintLayout222 = iy4Var.p;
                LinearLayout linearLayout222 = iy4Var.q;
                constraintLayout222.setVisibility(8);
                linearLayout222.setVisibility(0);
                Context context222 = getContext();
                context222.getClass();
                linearLayout222.setPaddingRelative(linearLayout222.getPaddingStart(), linearLayout222.getPaddingTop(), linearLayout222.getPaddingEnd(), ao2.s(8, context222));
                setVisibility(0);
                setHeaderStartTime(event);
                setHeaderEndText(event);
                break;
        }
    }

    public final void n(boolean z) {
        iy4 iy4Var = this.d;
        ProgressBar progressBar = iy4Var.r;
        TextView textView = iy4Var.b;
        int max = progressBar.getMax();
        ProgressBar progressBar2 = iy4Var.i;
        Integer valueOf = Integer.valueOf(progressBar2.getMax());
        if (!z) {
            valueOf = null;
        }
        int intValue = max + (valueOf != null ? valueOf.intValue() : 0);
        int progress = iy4Var.r.getProgress();
        float min = Math.min(1.0f, (progress + ((z ? Integer.valueOf(progressBar2.getProgress()) : null) != null ? r4.intValue() : 0)) / intValue);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.getClass();
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.E = min;
        textView.setLayoutParams(tl3Var);
    }

    public final void o(long j, long j2) {
        long j3 = (j * 100) / j2;
        iy4 iy4Var = this.d;
        iy4Var.h.setVisibility(0);
        mm3 mm3Var = new mm3();
        ConstraintLayout constraintLayout = iy4Var.p;
        mm3Var.e(constraintLayout);
        mm3Var.f(iy4Var.j.getId(), 6, iy4Var.c.getId(), 6);
        mm3Var.a(constraintLayout);
        ProgressBar progressBar = iy4Var.i;
        progressBar.setMax((int) j2);
        progressBar.setProgress((int) j);
        View view = iy4Var.g;
        Integer valueOf = Integer.valueOf(R.drawable.progress_view_empty_circle);
        Integer num = j3 < 50 ? valueOf : null;
        view.setBackgroundResource(num != null ? num.intValue() : getProgressCircleDrawable());
        View view2 = iy4Var.f;
        if (j3 >= 100) {
            valueOf = null;
        }
        view2.setBackgroundResource(valueOf != null ? valueOf.intValue() : getProgressCircleDrawable());
        if (j3 >= 50) {
            setLiveTextColor(iy4Var.d);
        }
        if (j3 >= 100) {
            setLiveTextColor(iy4Var.e);
        }
    }

    public final void p(long j, long j2) {
        long j3 = (j * 100) / j2;
        iy4 iy4Var = this.d;
        iy4Var.r.setMax((int) j2);
        iy4Var.r.setProgress((int) j);
        View view = iy4Var.s;
        Integer valueOf = Integer.valueOf(R.drawable.progress_view_empty_circle);
        Integer num = j3 < 0 ? valueOf : null;
        view.setBackgroundResource(num != null ? num.intValue() : getProgressCircleDrawable());
        View view2 = iy4Var.o;
        Integer num2 = j3 < 50 ? valueOf : null;
        view2.setBackgroundResource(num2 != null ? num2.intValue() : getProgressCircleDrawable());
        View view3 = iy4Var.c;
        if (j3 >= 100) {
            valueOf = null;
        }
        view3.setBackgroundResource(valueOf != null ? valueOf.intValue() : getProgressCircleDrawable());
        if (j3 > 0) {
            setLiveTextColor(iy4Var.t);
        }
        if (j3 >= 50) {
            setLiveTextColor(iy4Var.n);
        }
        if (j3 >= 100) {
            setLiveTextColor(iy4Var.j);
        }
    }

    public void setLiveTextColor(@NotNull TextView textView) {
        textView.getClass();
        haa.B(textView);
    }

    public final void setTime(@NotNull Event event) {
        final StatusTime statusTime;
        event.getClass();
        Time time = event.getTime();
        iy4 iy4Var = this.d;
        if (time == null || event.getStatus().getCode() == 31) {
            iy4Var.a.post(new wb3(this, 19));
            return;
        }
        if (ph0.a0(new Integer[]{32, 33, 34, 50}).contains(Integer.valueOf(event.getStatus().getCode()))) {
            iy4Var.a.post(new yq5(1, this, event));
            return;
        }
        Time time2 = event.getTime();
        if (time2 == null || (statusTime = time2.getStatusTime()) == null) {
            return;
        }
        long initial = ((statusTime.getInitial() + (System.currentTimeMillis() / 1000)) + xe6.c().b) - statusTime.getTimestamp();
        Long valueOf = Long.valueOf(statusTime.getMax() / 60);
        if (initial <= statusTime.getMax()) {
            valueOf = null;
        }
        final long longValue = valueOf != null ? valueOf.longValue() : initial / 60;
        long max = (statusTime.getMax() - statusTime.getInitial()) / 60;
        final long j = 2 * max;
        if (longValue > j) {
            long initial2 = statusTime.getInitial() / 60;
            p(90L, 90L);
            if (event.getStatus().getCode() == 42) {
                o(longValue - (initial2 - max), j);
            } else {
                o(longValue - initial2, j);
            }
        } else {
            p(longValue, j);
        }
        iy4Var.a.post(new Runnable() { // from class: c66
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = longValue > j;
                d66 d66Var = d66.this;
                d66Var.n(z);
                l4a.K(d66Var.d.b, z8e.t(statusTime, xe6.c().b, false));
            }
        });
    }
}
