package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.icu.text.DateTimePatternGenerator;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.imageview.ShapeableImageView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.EventGraphData;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class q7 extends h4 {
    public final jy4 d;
    public Event e;
    public EventGraphResponse f;
    public int g;
    public boolean h;
    public final mqi i;
    public final int j;
    public final ArrayList k;
    public Integer l;
    public final y2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(Context context) {
        super(context, null, 0);
        Throwable th;
        context.getClass();
        View root = getRoot();
        int i = R.id.current_time_barrier;
        View B = nq8.B(R.id.current_time_barrier, root);
        if (B != null) {
            i = R.id.current_time_guideline;
            Guideline guideline = (Guideline) nq8.B(R.id.current_time_guideline, root);
            if (guideline != null) {
                i = R.id.current_time_position_barrier;
                if (((Barrier) nq8.B(R.id.current_time_position_barrier, root)) != null) {
                    i = R.id.fake_current_time;
                    TextView textView = (TextView) nq8.B(R.id.fake_current_time, root);
                    if (textView != null) {
                        i = R.id.fake_max_time;
                        TextView textView2 = (TextView) nq8.B(R.id.fake_max_time, root);
                        if (textView2 != null) {
                            i = R.id.fake_min_time;
                            TextView textView3 = (TextView) nq8.B(R.id.fake_min_time, root);
                            if (textView3 != null) {
                                i = R.id.graph_background;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.graph_background, root);
                                if (shapeableImageView != null) {
                                    i = R.id.graph_container;
                                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.graph_container, root);
                                    if (frameLayout != null) {
                                        i = R.id.max_time_barrier;
                                        View B2 = nq8.B(R.id.max_time_barrier, root);
                                        if (B2 != null) {
                                            i = R.id.min_time_barrier;
                                            View B3 = nq8.B(R.id.min_time_barrier, root);
                                            if (B3 != null) {
                                                i = R.id.score_graph_bottom_difference_text;
                                                TextView textView4 = (TextView) nq8.B(R.id.score_graph_bottom_difference_text, root);
                                                if (textView4 != null) {
                                                    i = R.id.score_graph_current_time_dot;
                                                    ImageView imageView = (ImageView) nq8.B(R.id.score_graph_current_time_dot, root);
                                                    if (imageView != null) {
                                                        i = R.id.score_graph_full_time_text;
                                                        TextView textView5 = (TextView) nq8.B(R.id.score_graph_full_time_text, root);
                                                        if (textView5 != null) {
                                                            i = R.id.score_graph_middle_difference_text;
                                                            if (((TextView) nq8.B(R.id.score_graph_middle_difference_text, root)) != null) {
                                                                i = R.id.score_graph_start_dot;
                                                                ImageView imageView2 = (ImageView) nq8.B(R.id.score_graph_start_dot, root);
                                                                if (imageView2 != null) {
                                                                    i = R.id.score_graph_start_time_text;
                                                                    TextView textView6 = (TextView) nq8.B(R.id.score_graph_start_time_text, root);
                                                                    if (textView6 != null) {
                                                                        i = R.id.score_graph_time_left_minutes;
                                                                        TextView textView7 = (TextView) nq8.B(R.id.score_graph_time_left_minutes, root);
                                                                        if (textView7 != null) {
                                                                            i = R.id.score_graph_time_left_text;
                                                                            TextView textView8 = (TextView) nq8.B(R.id.score_graph_time_left_text, root);
                                                                            if (textView8 != null) {
                                                                                i = R.id.score_graph_top_difference_text;
                                                                                TextView textView9 = (TextView) nq8.B(R.id.score_graph_top_difference_text, root);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.time_text_barrier_start;
                                                                                    if (((Barrier) nq8.B(R.id.time_text_barrier_start, root)) != null) {
                                                                                        i = R.id.what_is_this_view;
                                                                                        View B4 = nq8.B(R.id.what_is_this_view, root);
                                                                                        if (B4 != null) {
                                                                                            int i2 = R.id.info_icon;
                                                                                            if (((ImageView) nq8.B(R.id.info_icon, B4)) != null) {
                                                                                                i2 = R.id.info_text;
                                                                                                if (((TextView) nq8.B(R.id.info_text, B4)) != null) {
                                                                                                    i2 = R.id.tennis_power_logo_first;
                                                                                                    th = null;
                                                                                                    ImageView imageView3 = (ImageView) nq8.B(R.id.tennis_power_logo_first, B4);
                                                                                                    if (imageView3 != null) {
                                                                                                        ImageView imageView4 = (ImageView) nq8.B(R.id.tennis_power_logo_second, B4);
                                                                                                        if (imageView4 != null) {
                                                                                                            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.what_is_this_header, B4);
                                                                                                            if (linearLayout != null) {
                                                                                                                this.d = new jy4((ConstraintLayout) root, B, guideline, textView, textView2, textView3, shapeableImageView, frameLayout, B2, B3, textView4, imageView, textView5, imageView2, textView6, textView7, textView8, textView9, new drc((ConstraintLayout) B4, imageView3, imageView4, linearLayout));
                                                                                                                this.i = ypa.b(new c6(context, 3));
                                                                                                                this.j = ao2.s(1, context);
                                                                                                                this.k = new ArrayList();
                                                                                                                es1 es1Var = (es1) this;
                                                                                                                int i3 = 2;
                                                                                                                this.m = new y2(es1Var, i3);
                                                                                                                linearLayout.setVisibility(8);
                                                                                                                setVisibility(8);
                                                                                                                frameLayout.setOnClickListener(new s0(es1Var, i3));
                                                                                                                return;
                                                                                                            }
                                                                                                            i2 = R.id.what_is_this_header;
                                                                                                        } else {
                                                                                                            i2 = R.id.tennis_power_logo_second;
                                                                                                        }
                                                                                                    }
                                                                                                    yhk.s("Missing required view with ID: ".concat(B4.getResources().getResourceName(i2)));
                                                                                                    throw th;
                                                                                                }
                                                                                            }
                                                                                            th = null;
                                                                                            yhk.s("Missing required view with ID: ".concat(B4.getResources().getResourceName(i2)));
                                                                                            throw th;
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final int getMaxDifference() {
        int i;
        List<EventGraphData> graphPoints;
        Object obj;
        int defaultDiffValue = getDefaultDiffValue();
        EventGraphResponse eventGraphResponse = this.f;
        if (eventGraphResponse != null && (graphPoints = eventGraphResponse.getGraphPoints()) != null) {
            Iterator<T> it = graphPoints.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    double abs = Math.abs(((EventGraphData) next).getValue());
                    do {
                        Object next2 = it.next();
                        double abs2 = Math.abs(((EventGraphData) next2).getValue());
                        if (Double.compare(abs, abs2) < 0) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            EventGraphData eventGraphData = (EventGraphData) obj;
            if (eventGraphData != null) {
                i = (int) eventGraphData.getValue();
                return Math.max(defaultDiffValue, Math.abs(i));
            }
        }
        i = 0;
        return Math.max(defaultDiffValue, Math.abs(i));
    }

    private final htg getScoreGraphView() {
        return (htg) this.i.getValue();
    }

    @NotNull
    public final jy4 getBinding() {
        return this.d;
    }

    @NotNull
    public abstract String getCurrentTimeText();

    public abstract float getCurrentWidth();

    public abstract int getDefaultDiffValue();

    @Nullable
    public final Event getEvent() {
        return this.e;
    }

    @Nullable
    public final EventGraphResponse getEventGraphResponse() {
        return this.f;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.details_score_graph;
    }

    @NotNull
    public abstract List<vde> getPeriodDividerData();

    @NotNull
    public abstract String getSport();

    /* JADX WARN: Removed duplicated region for block: B:47:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02dc  */
    @Override // defpackage.h4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Event event, EventGraphResponse eventGraphResponse, List list, boolean z, boolean z2) {
        Throwable th;
        boolean z3;
        double d;
        EventGraphResponse eventGraphResponse2;
        float f;
        List<EventGraphData> graphPoints;
        float f2;
        float f3;
        double d2;
        List<EventGraphData> graphPoints2;
        Object obj;
        Event event2;
        String format;
        event.getClass();
        eventGraphResponse.getClass();
        this.e = event;
        this.f = eventGraphResponse;
        this.g = getMaxDifference();
        boolean D = ok3.D(event);
        jy4 jy4Var = this.d;
        if (z2) {
            FrameLayout frameLayout = jy4Var.h;
            drc drcVar = jy4Var.s;
            frameLayout.setClickable(false);
            as9.o(drcVar.c, Event.getHomeTeam$default(event, null, 1, null).getId());
            as9.o(drcVar.d, Event.getAwayTeam$default(event, null, 1, null).getId());
            drcVar.b.setVisibility(0);
        }
        setVisibility(0);
        Event event3 = this.e;
        if (event3 != null) {
            TextView textView = jy4Var.o;
            TextView textView2 = jy4Var.m;
            ImageView imageView = jy4Var.n;
            TextView textView3 = jy4Var.q;
            TextView textView4 = jy4Var.p;
            th = null;
            if (fc6.B(fc6.t(Instant.ofEpochSecond(event3.getStartTimestamp())))) {
                if (me4.t(StatusKt.STATUS_IN_PROGRESS, event3)) {
                    Context context = getContext();
                    context.getClass();
                    long startTimestamp = event3.getStartTimestamp();
                    DateTimePatternGenerator b = hk4.b();
                    String bestPattern = DateFormat.is24HourFormat(context) ? b.getBestPattern("Hm") : b.getBestPattern("hm");
                    bestPattern.getClass();
                    format = fc6.i(startTimestamp, hk4.a(bestPattern));
                    event2 = event3;
                } else {
                    String string = getResources().getString(R.string.today);
                    Context context2 = getContext();
                    context2.getClass();
                    long startTimestamp2 = event3.getStartTimestamp();
                    event2 = event3;
                    DateTimePatternGenerator b2 = hk4.b();
                    String bestPattern2 = DateFormat.is24HourFormat(context2) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
                    bestPattern2.getClass();
                    format = String.format("%s %s", Arrays.copyOf(new Object[]{string, fc6.i(startTimestamp2, hk4.a(bestPattern2))}, 2));
                }
                z3 = D;
            } else {
                event2 = event3;
                long startTimestamp3 = event2.getStartTimestamp();
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                String i = fc6.i(startTimestamp3, hk4.a(bi4Var.d()));
                Context context3 = getContext();
                context3.getClass();
                long startTimestamp4 = event2.getStartTimestamp();
                z3 = D;
                DateTimePatternGenerator b3 = hk4.b();
                String bestPattern3 = DateFormat.is24HourFormat(context3) ? b3.getBestPattern("Hm") : b3.getBestPattern("hm");
                bestPattern3.getClass();
                format = String.format("%s %s", Arrays.copyOf(new Object[]{i, fc6.i(startTimestamp4, hk4.a(bestPattern3))}, 2));
            }
            textView.setText(format);
            int i2 = 8;
            if (Intrinsics.c(event2.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS)) {
                textView4.setVisibility(0);
                if (!Intrinsics.c(getSport(), Sports.HANDBALL) && event2.getStatus().getCode() != 30 && event2.getStatus().getCode() != 32) {
                    i2 = 0;
                }
                textView3.setVisibility(i2);
                imageView.setVisibility(0);
                haa.H(textView);
                textView2.setText(getContext().getString(R.string.status_full_time_short));
                String currentTimeText = getCurrentTimeText();
                l4a.K(textView4, currentTimeText);
                jy4Var.f.setText(currentTimeText);
                jy4Var.d.setText(currentTimeText);
                jy4Var.e.setText(currentTimeText);
            } else {
                textView3.setVisibility(8);
                textView4.setVisibility(8);
                imageView.setVisibility(8);
                haa.D(textView);
                textView2.setText(z8e.u(getContext(), event2.getStatusDescription(), ok3.s(event2), true));
            }
        } else {
            th = null;
            z3 = D;
        }
        TextView textView5 = jy4Var.r;
        FrameLayout frameLayout2 = jy4Var.h;
        ConstraintLayout constraintLayout = jy4Var.a;
        textView5.setText(String.valueOf(this.g));
        jy4Var.k.setText(String.valueOf(this.g));
        int size = getPeriodDividerData().size();
        Integer num = this.l;
        if (num == null || size != num.intValue()) {
            this.l = Integer.valueOf(getPeriodDividerData().size());
            ArrayList arrayList = this.k;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    constraintLayout.removeView((ImageView) it.next());
                }
                arrayList.clear();
            }
            for (vde vdeVar : getPeriodDividerData()) {
                View imageView2 = new ImageView(getContext());
                tl3 tl3Var = new tl3(this.j, 0);
                ShapeableImageView shapeableImageView = jy4Var.g;
                tl3Var.i = shapeableImageView.getId();
                tl3Var.l = shapeableImageView.getId();
                tl3Var.t = shapeableImageView.getId();
                tl3Var.v = shapeableImageView.getId();
                tl3Var.E = vdeVar.a;
                imageView2.setLayoutParams(tl3Var);
                aba.G(imageView2);
                arrayList.add(imageView2);
                constraintLayout.addView(imageView2);
            }
        }
        if (!this.h) {
            this.h = true;
            frameLayout2.setClipToOutline(true);
            frameLayout2.addView(getScoreGraphView());
        }
        float currentWidth = getCurrentWidth();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        float f4 = 0.5f;
        arrayList3.add(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f));
        EventGraphResponse eventGraphResponse3 = this.f;
        double d3 = 0.0d;
        if (eventGraphResponse3 != null && (graphPoints2 = eventGraphResponse3.getGraphPoints()) != null) {
            Iterator<T> it2 = graphPoints2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((EventGraphData) obj).getValue() != 0.0d) {
                        break;
                    }
                } else {
                    obj = th;
                    break;
                }
            }
            EventGraphData eventGraphData = (EventGraphData) obj;
            if (eventGraphData != null) {
                d = eventGraphData.getValue();
                boolean z4 = d <= 0.0d;
                eventGraphResponse2 = this.f;
                if (eventGraphResponse2 != null || (graphPoints = eventGraphResponse2.getGraphPoints()) == null) {
                    f = currentWidth;
                } else {
                    boolean z5 = z4;
                    int i3 = 0;
                    for (Object obj2 : graphPoints) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            b.q();
                            throw th;
                        }
                        EventGraphData eventGraphData2 = (EventGraphData) obj2;
                        if (i3 > 0) {
                            boolean z6 = eventGraphData2.getValue() > d3 || (eventGraphData2.getValue() == d3 && z5);
                            if (z5 != z6) {
                                PointF pointF = (PointF) CollectionsKt.h0(arrayList3);
                                f3 = f4;
                                d2 = d3;
                                float minute = ((float) eventGraphData2.getMinute()) / ((es1) this).p;
                                double value = eventGraphData2.getValue();
                                float abs = (((float) Math.abs(value)) / this.g) * f3;
                                float f5 = value > d2 ? f3 - abs : abs + f3;
                                float f6 = minute - pointF.x;
                                float f7 = pointF.y;
                                float f8 = (z5 ? (f3 - f7) / (f5 - f7) : (f7 - f3) / (f7 - f5)) * f6;
                                boolean z7 = z6;
                                f2 = currentWidth;
                                EventGraphData eventGraphData3 = new EventGraphData(f8 + pointF.x, 0.5d);
                                arrayList3.addAll(n(true, eventGraphData3));
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.addAll(arrayList3);
                                arrayList2.add(new l6h(arrayList4, z5));
                                arrayList3.clear();
                                arrayList3.addAll(n(true, eventGraphData3));
                                z5 = z7;
                                arrayList3.addAll(n(false, eventGraphData2));
                                f4 = f3;
                                currentWidth = f2;
                                i3 = i4;
                                d3 = d2;
                            }
                        }
                        f2 = currentWidth;
                        f3 = f4;
                        d2 = d3;
                        arrayList3.addAll(n(false, eventGraphData2));
                        f4 = f3;
                        currentWidth = f2;
                        i3 = i4;
                        d3 = d2;
                    }
                    f = currentWidth;
                    z4 = z5;
                }
                if (((PointF) CollectionsKt.j0(arrayList3)) != null) {
                    arrayList3.addAll(n(true, new EventGraphData(2.0d, 0.5d)));
                }
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList3);
                arrayList2.add(new l6h(arrayList5, z4));
                getScoreGraphView().b(f, new etg(arrayList2), z3, jy4Var.c, jy4Var.l, z);
            }
        }
        d = 1.0d;
        if (d <= 0.0d) {
        }
        eventGraphResponse2 = this.f;
        if (eventGraphResponse2 != null) {
        }
        f = currentWidth;
        if (((PointF) CollectionsKt.j0(arrayList3)) != null) {
        }
        ArrayList arrayList52 = new ArrayList();
        arrayList52.addAll(arrayList3);
        arrayList2.add(new l6h(arrayList52, z4));
        getScoreGraphView().b(f, new etg(arrayList2), z3, jy4Var.c, jy4Var.l, z);
    }

    public abstract ArrayList n(boolean z, EventGraphData eventGraphData);

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getHandler().removeCallbacks(this.m);
    }

    public final void setEvent(@Nullable Event event) {
        this.e = event;
    }

    public final void setEventGraphResponse(@Nullable EventGraphResponse eventGraphResponse) {
        this.f = eventGraphResponse;
    }
}
