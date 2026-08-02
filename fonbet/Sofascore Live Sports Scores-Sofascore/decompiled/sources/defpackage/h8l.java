package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.google.android.material.imageview.ShapeableImageView;
import com.ironsource.Ua;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.newNetwork.EventGraphData;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h8l extends h4 {
    public final js2 d;
    public Event e;
    public Map f;
    public d8l g;
    public g8l h;
    public final mqi i;
    public final ArrayList j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public y1h o;
    public final int p;
    public final int q;
    public final mqi r;
    public final mqi s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8l(Context context) {
        super(context, null, 0);
        context.getClass();
        int i = 0;
        View root = getRoot();
        int i2 = R.id.current_time_dot;
        ImageView imageView = (ImageView) nq8.B(R.id.current_time_dot, root);
        if (imageView != null) {
            i2 = R.id.current_time_guideline;
            Guideline guideline = (Guideline) nq8.B(R.id.current_time_guideline, root);
            if (guideline != null) {
                i2 = R.id.first_team_incidents_container;
                RelativeLayout relativeLayout = (RelativeLayout) nq8.B(R.id.first_team_incidents_container, root);
                if (relativeLayout != null) {
                    i2 = R.id.first_team_logo;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.first_team_logo, root);
                    if (imageView2 != null) {
                        i2 = R.id.gradient_layer;
                        View B = nq8.B(R.id.gradient_layer, root);
                        if (B != null) {
                            i2 = R.id.graph_background;
                            if (((ShapeableImageView) nq8.B(R.id.graph_background, root)) != null) {
                                i2 = R.id.graph_container;
                                FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.graph_container, root);
                                if (frameLayout != null) {
                                    i2 = R.id.info_icon;
                                    ImageView imageView3 = (ImageView) nq8.B(R.id.info_icon, root);
                                    if (imageView3 != null) {
                                        i2 = R.id.logos_group;
                                        Group group = (Group) nq8.B(R.id.logos_group, root);
                                        if (group != null) {
                                            i2 = R.id.percentage_sign;
                                            TextView textView = (TextView) nq8.B(R.id.percentage_sign, root);
                                            if (textView != null) {
                                                i2 = R.id.quarter_tabs;
                                                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.quarter_tabs, root);
                                                if (segmentedButtonsView != null) {
                                                    i2 = R.id.score_graph_bottom_difference_text;
                                                    TextView textView2 = (TextView) nq8.B(R.id.score_graph_bottom_difference_text, root);
                                                    if (textView2 != null) {
                                                        i2 = R.id.score_graph_middle_difference_text;
                                                        TextView textView3 = (TextView) nq8.B(R.id.score_graph_middle_difference_text, root);
                                                        if (textView3 != null) {
                                                            i2 = R.id.score_graph_top_difference_text;
                                                            TextView textView4 = (TextView) nq8.B(R.id.score_graph_top_difference_text, root);
                                                            if (textView4 != null) {
                                                                i2 = R.id.second_team_incidents_container;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) nq8.B(R.id.second_team_incidents_container, root);
                                                                if (relativeLayout2 != null) {
                                                                    i2 = R.id.second_team_logo;
                                                                    ImageView imageView4 = (ImageView) nq8.B(R.id.second_team_logo, root);
                                                                    if (imageView4 != null) {
                                                                        i2 = R.id.start_dot;
                                                                        ImageView imageView5 = (ImageView) nq8.B(R.id.start_dot, root);
                                                                        if (imageView5 != null) {
                                                                            i2 = R.id.view_incidents_tooltip;
                                                                            TextView textView5 = (TextView) nq8.B(R.id.view_incidents_tooltip, root);
                                                                            if (textView5 != null) {
                                                                                this.d = new js2((ConstraintLayout) root, imageView, guideline, relativeLayout, imageView2, B, frameLayout, imageView3, group, textView, segmentedButtonsView, textView2, textView3, textView4, relativeLayout2, imageView4, imageView5, textView5);
                                                                                this.i = ypa.b(new k9f(context, 17));
                                                                                this.j = new ArrayList();
                                                                                this.m = true;
                                                                                this.o = v1h.f;
                                                                                this.p = ao2.s(8, context);
                                                                                this.q = ao2.s(16, context);
                                                                                this.r = ypa.b(new g0l(16));
                                                                                this.s = ypa.b(new b8l(this, i));
                                                                                setVisibility(8);
                                                                                frameLayout.setClipToOutline(true);
                                                                                textView.setText(String.format(Locale.getDefault(), "%%", Arrays.copyOf(new Object[0], 0)));
                                                                                textView4.setText(String.format(Locale.getDefault(), StatisticData.ERROR_CODE_NOT_FOUND, Arrays.copyOf(new Object[0], 0)));
                                                                                textView3.setText(String.format(Locale.getDefault(), "50", Arrays.copyOf(new Object[0], 0)));
                                                                                me4.s(new Object[0], 0, Locale.getDefault(), StatisticData.ERROR_CODE_NOT_FOUND, textView2);
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    private final int getGraphContainerWidth() {
        js2 js2Var = this.d;
        int width = ((FrameLayout) js2Var.i).getWidth();
        FrameLayout frameLayout = (FrameLayout) js2Var.i;
        if (width > 0) {
            return frameLayout.getWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((ConstraintLayout) js2Var.j).getWidth(), Integer.MIN_VALUE);
        Context context = getContext();
        context.getClass();
        frameLayout.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(ao2.s(80, context), 1073741824));
        return frameLayout.getMeasuredWidth();
    }

    private final List<vde> getPeriodDividerData() {
        xbb b = a.b();
        d8l d8lVar = this.g;
        if (d8lVar == null) {
            Intrinsics.i("graphData");
            throw null;
        }
        List list = d8lVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((int) ((EventGraphData) obj).getMinute()) != 0) {
                arrayList.add(obj);
            }
        }
        d8l d8lVar2 = this.g;
        if (d8lVar2 == null) {
            Intrinsics.i("graphData");
            throw null;
        }
        Integer num = d8lVar2.c;
        if (num != null) {
            int intValue = num.intValue();
            d8l d8lVar3 = this.g;
            if (d8lVar3 == null) {
                Intrinsics.i("graphData");
                throw null;
            }
            Integer num2 = d8lVar3.d;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                int i = intValue * intValue2;
                boolean z = arrayList.size() > i;
                float f = (i / this.l) / intValue2;
                b.addAll(b.j(new vde(1.0f * f), new vde(2.0f * f), new vde(3.0f * f)));
                if (z) {
                    b.add(new vde(f * 4.0f));
                }
            }
        }
        return a.a(b);
    }

    private final htg getScoreGraphView() {
        return (htg) this.i.getValue();
    }

    private final boolean getShouldShowStartDot() {
        Event event = this.e;
        if (event == null) {
            Intrinsics.i("event");
            throw null;
        }
        if (!Intrinsics.c(event.getStatusType(), StatusKt.STATUS_IN_PROGRESS)) {
            return false;
        }
        g8l g8lVar = this.h;
        if (g8lVar == null) {
            Intrinsics.i("selectedTab");
            throw null;
        }
        if (g8lVar == g8l.f) {
            return true;
        }
        if (g8lVar != null) {
            return g8lVar == g8l.g;
        }
        Intrinsics.i("selectedTab");
        throw null;
    }

    private final Handler getTeamLogoOverlayHandler() {
        return (Handler) this.r.getValue();
    }

    private final Runnable getTeamLogoOverlayRunnable() {
        return (Runnable) this.s.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [int] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r16v12, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit r(h8l h8lVar, boolean z, String str, int i) {
        boolean z2;
        Event event;
        boolean booleanValue;
        etg etgVar;
        d8l d8lVar;
        double d;
        Object obj;
        float f;
        double d2;
        Integer overtimeLength;
        Integer overtimeLength2;
        str.getClass();
        g8l.e.getClass();
        g8l j = jle.j(str);
        Map map = h8lVar.f;
        js2 js2Var = h8lVar.d;
        if (map == null) {
            Intrinsics.i("groupedData");
            throw null;
        }
        d8l d8lVar2 = (d8l) map.get(j);
        if (d8lVar2 != null) {
            h8lVar.h = j;
            h8lVar.g = d8lVar2;
            SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) js2Var.n;
            FrameLayout frameLayout = (FrameLayout) js2Var.i;
            ConstraintLayout constraintLayout = (ConstraintLayout) js2Var.j;
            TextView textView = js2Var.d;
            boolean z3 = true;
            boolean z4 = segmentedButtonsView.getSelectedIndex() != i || h8lVar.m;
            ArrayList arrayList = h8lVar.j;
            d8l d8lVar3 = h8lVar.g;
            if (d8lVar3 == null) {
                Intrinsics.i("graphData");
                throw null;
            }
            Integer num = d8lVar3.d;
            int intValue = num != null ? num.intValue() : 4;
            d8l d8lVar4 = h8lVar.g;
            if (d8lVar4 == null) {
                Intrinsics.i("graphData");
                throw null;
            }
            Integer num2 = d8lVar4.c;
            int intValue2 = intValue * (num2 != null ? num2.intValue() : 15);
            d8l d8lVar5 = h8lVar.g;
            if (d8lVar5 == null) {
                Intrinsics.i("graphData");
                throw null;
            }
            int i2 = 60;
            if (((EventGraphData) CollectionsKt.h0(d8lVar5.a)).getMinute() > intValue2) {
                Event event2 = h8lVar.e;
                if (event2 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                Time time = event2.getTime();
                intValue2 += ((time == null || (overtimeLength2 = time.getOvertimeLength()) == null) ? 900 : overtimeLength2.intValue()) / 60;
            }
            h8lVar.l = intValue2;
            g8l g8lVar = h8lVar.h;
            if (g8lVar == null) {
                Intrinsics.i("selectedTab");
                throw null;
            }
            int ordinal = g8lVar.ordinal();
            if (ordinal == 0) {
                int i3 = h8lVar.l;
                Integer valueOf = Integer.valueOf(i3);
                if (i3 <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i2 = valueOf.intValue();
                }
            } else if (ordinal != 5) {
                d8l d8lVar6 = h8lVar.g;
                if (d8lVar6 == null) {
                    Intrinsics.i("graphData");
                    throw null;
                }
                Integer num3 = d8lVar6.c;
                i2 = num3 != null ? num3.intValue() : 15;
            } else {
                Event event3 = h8lVar.e;
                if (event3 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                Time time2 = event3.getTime();
                i2 = ((time2 == null || (overtimeLength = time2.getOvertimeLength()) == null) ? 900 : overtimeLength.intValue()) / 60;
            }
            h8lVar.k = i2;
            d8l d8lVar7 = h8lVar.g;
            if (d8lVar7 == null) {
                Intrinsics.i("graphData");
                throw null;
            }
            float minute = ((float) ((EventGraphData) CollectionsKt.h0(d8lVar7.a)).getMinute()) / h8lVar.k;
            g8l g8lVar2 = h8lVar.h;
            if (g8lVar2 == null) {
                Intrinsics.i("selectedTab");
                throw null;
            }
            if (g8lVar2 != g8l.f) {
                Event event4 = h8lVar.e;
                if (event4 == null) {
                    Intrinsics.i("event");
                    throw null;
                }
                if (g8lVar2 != jle.k(event4.getLastPeriod())) {
                    z2 = false;
                    event = h8lVar.e;
                    if (event != null) {
                        Intrinsics.i("event");
                        throw null;
                    }
                    boolean z5 = Intrinsics.c(event.getStatusType(), StatusKt.STATUS_IN_PROGRESS) && z2;
                    List<vde> periodDividerData = h8lVar.getPeriodDividerData();
                    Handler teamLogoOverlayHandler = h8lVar.getTeamLogoOverlayHandler();
                    Runnable teamLogoOverlayRunnable = h8lVar.getTeamLogoOverlayRunnable();
                    if (Build.VERSION.SDK_INT >= 29) {
                        booleanValue = eq3.B(teamLogoOverlayHandler, teamLogoOverlayRunnable);
                    } else {
                        try {
                            booleanValue = ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(teamLogoOverlayHandler, teamLogoOverlayRunnable)).booleanValue();
                        } catch (IllegalAccessException e) {
                            e = e;
                            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
                        } catch (NullPointerException e3) {
                            e = e3;
                            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
                        } catch (InvocationTargetException e4) {
                            Throwable cause = e4.getCause();
                            if (cause instanceof RuntimeException) {
                                throw ((RuntimeException) cause);
                            }
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            is8.h(cause);
                            return null;
                        }
                    }
                    if (!booleanValue) {
                        ((ImageView) js2Var.g).setVisibility(h8lVar.getShouldShowStartDot() ? 0 : 8);
                    }
                    if (periodDividerData.size() != arrayList.size()) {
                        Context context = h8lVar.getContext();
                        context.getClass();
                        int s = ao2.s(1, context);
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                constraintLayout.removeView((ImageView) it.next());
                            }
                            arrayList.clear();
                        }
                        for (vde vdeVar : periodDividerData) {
                            View imageView = new ImageView(h8lVar.getContext());
                            aba.G(imageView);
                            tl3 tl3Var = new tl3(s, 0);
                            tl3Var.i = frameLayout.getId();
                            tl3Var.l = frameLayout.getId();
                            tl3Var.t = frameLayout.getId();
                            tl3Var.v = frameLayout.getId();
                            tl3Var.E = vdeVar.a;
                            imageView.setLayoutParams(tl3Var);
                            arrayList.add(imageView);
                            constraintLayout.addView(imageView);
                        }
                    }
                    if (h8lVar.m) {
                        h8lVar.m = false;
                        frameLayout.addView(h8lVar.getScoreGraphView());
                    }
                    g8l g8lVar3 = h8lVar.h;
                    if (g8lVar3 == null) {
                        Intrinsics.i("selectedTab");
                        throw null;
                    }
                    if (g8lVar3 == g8l.f) {
                        h8lVar.q();
                        if (textView.getVisibility() != 0) {
                            tgj.p(textView, 0L, 3);
                        }
                    } else {
                        h8lVar.p();
                        if (textView.getVisibility() == 0) {
                            etgVar = null;
                            tgj.q(textView, null, 15);
                            if (z4) {
                                htg scoreGraphView = h8lVar.getScoreGraphView();
                                scoreGraphView.k = etgVar;
                                scoreGraphView.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                etgVar = null;
                            }
                            htg scoreGraphView2 = h8lVar.getScoreGraphView();
                            ArrayList arrayList2 = new ArrayList();
                            float f2 = 0.5f;
                            ArrayList l = b.l(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f));
                            d8lVar = h8lVar.g;
                            if (d8lVar != null) {
                                ?? r16 = etgVar;
                                Intrinsics.i("graphData");
                                throw r16;
                            }
                            Iterator it2 = d8lVar.a.iterator();
                            while (true) {
                                d = 0.0d;
                                if (!it2.hasNext()) {
                                    obj = etgVar;
                                    break;
                                }
                                obj = it2.next();
                                if (((EventGraphData) obj).getValue() != 0.0d) {
                                    break;
                                }
                            }
                            EventGraphData eventGraphData = (EventGraphData) obj;
                            boolean z6 = (eventGraphData != null ? eventGraphData.getValue() : 1.0d) > 0.0d;
                            d8l d8lVar8 = h8lVar.g;
                            if (d8lVar8 == null) {
                                Intrinsics.i("graphData");
                                throw null;
                            }
                            boolean z7 = z6;
                            int i4 = 0;
                            for (Object obj2 : d8lVar8.a) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    b.q();
                                    throw null;
                                }
                                EventGraphData eventGraphData2 = (EventGraphData) obj2;
                                if (i4 > 0) {
                                    boolean z8 = (eventGraphData2.getValue() > d || (eventGraphData2.getValue() == d && z7)) ? z3 : false;
                                    if (z7 != z8) {
                                        PointF pointF = (PointF) CollectionsKt.h0(l);
                                        d2 = d;
                                        float minute2 = ((float) eventGraphData2.getMinute()) / h8lVar.k;
                                        double value = eventGraphData2.getValue();
                                        f = f2;
                                        float abs = ((((float) Math.abs(value)) / 50.0f) * f * ((float) (value > d2 ? -1 : z3))) + f;
                                        float f3 = minute2 - pointF.x;
                                        float f4 = pointF.y;
                                        EventGraphData eventGraphData3 = new EventGraphData(((z7 ? (f - f4) / (abs - f4) : (f4 - f) / (f4 - abs)) * f3) + pointF.x, 0.5d);
                                        l.addAll(h8lVar.n(true, eventGraphData3));
                                        arrayList2.add(new l6h(CollectionsKt.S0(l), z7));
                                        l.clear();
                                        l.addAll(h8lVar.n(true, eventGraphData3));
                                        z7 = z8;
                                        l.addAll(h8lVar.n(false, eventGraphData2));
                                        f2 = f;
                                        i4 = i5;
                                        d = d2;
                                        z3 = true;
                                    }
                                }
                                f = f2;
                                d2 = d;
                                l.addAll(h8lVar.n(false, eventGraphData2));
                                f2 = f;
                                i4 = i5;
                                d = d2;
                                z3 = true;
                            }
                            if (((PointF) CollectionsKt.j0(l)) != null) {
                                l.addAll(h8lVar.n(true, new EventGraphData(2.0d, 0.5d)));
                            }
                            arrayList2.add(new l6h(l, z7));
                            scoreGraphView2.b(minute, new etg(arrayList2), z5, (Guideline) js2Var.k, (ImageView) js2Var.b, z);
                        }
                    }
                    etgVar = null;
                    if (z4) {
                    }
                    htg scoreGraphView22 = h8lVar.getScoreGraphView();
                    ArrayList arrayList22 = new ArrayList();
                    float f22 = 0.5f;
                    ArrayList l2 = b.l(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f));
                    d8lVar = h8lVar.g;
                    if (d8lVar != null) {
                    }
                }
            }
            z2 = true;
            event = h8lVar.e;
            if (event != null) {
            }
        }
        return Unit.a;
    }

    private final void setupOnGraphClickListener(boolean z) {
        js2 js2Var = this.d;
        ImageView imageView = (ImageView) js2Var.c;
        Event event = this.e;
        if (event == null) {
            Intrinsics.i("event");
            throw null;
        }
        as9.o(imageView, Event.getHomeTeam$default(event, null, 1, null).getId());
        ImageView imageView2 = (ImageView) js2Var.f;
        Event event2 = this.e;
        if (event2 == null) {
            Intrinsics.i("event");
            throw null;
        }
        as9.o(imageView2, Event.getAwayTeam$default(event2, null, 1, null).getId());
        if (z) {
            ((Group) js2Var.m).setVisibility(0);
        } else {
            ((FrameLayout) js2Var.i).setOnClickListener(new ivj(6, this, js2Var));
        }
    }

    public static final void t(h8l h8lVar, js2 js2Var) {
        js2 js2Var2 = h8lVar.d;
        int[] referencedIds = ((Group) js2Var2.m).getReferencedIds();
        referencedIds.getClass();
        for (int i : referencedIds) {
            View findViewById = h8lVar.findViewById(i);
            if (findViewById != null) {
                findViewById.clearAnimation();
                Unit unit = Unit.a;
            }
        }
        h8lVar.getTeamLogoOverlayHandler().removeCallbacks(h8lVar.getTeamLogoOverlayRunnable());
        Group group = (Group) js2Var2.m;
        Group group2 = (Group) js2Var2.m;
        if (group.getVisibility() == 0) {
            h8lVar.getTeamLogoOverlayHandler().post(h8lVar.getTeamLogoOverlayRunnable());
            return;
        }
        group2.setVisibility(0);
        int[] referencedIds2 = group2.getReferencedIds();
        referencedIds2.getClass();
        for (int i2 : referencedIds2) {
            View findViewById2 = h8lVar.findViewById(i2);
            if (findViewById2 != null) {
                tgj.p(findViewById2, 300L, 2);
                Unit unit2 = Unit.a;
            }
        }
        tgj.q((ImageView) js2Var.g, null, 14);
        h8lVar.getTeamLogoOverlayHandler().postDelayed(h8lVar.getTeamLogoOverlayRunnable(), Ua.C);
    }

    public static final void u(h8l h8lVar) {
        js2 js2Var = h8lVar.d;
        ((Group) js2Var.m).setVisibility(8);
        int[] referencedIds = ((Group) js2Var.m).getReferencedIds();
        referencedIds.getClass();
        for (int i : referencedIds) {
            View findViewById = h8lVar.findViewById(i);
            if (findViewById != null) {
                tgj.q(findViewById, null, 14);
                Unit unit = Unit.a;
            }
        }
        if (h8lVar.getShouldShowStartDot()) {
            tgj.p((ImageView) js2Var.g, 300L, 2);
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.win_probability_graph;
    }

    @Override // defpackage.h4
    public final void j(Event event, EventGraphResponse eventGraphResponse, List list, boolean z, boolean z2) {
        int i;
        int i2;
        ArrayList arrayList;
        js2 js2Var;
        event.getClass();
        eventGraphResponse.getClass();
        js2 js2Var2 = this.d;
        ((ImageView) js2Var2.e).setVisibility(!z2 ? 0 : 8);
        this.n = z2;
        if (eventGraphResponse.getGraphPoints().isEmpty()) {
            setVisibility(8);
            return;
        }
        this.e = event;
        List list2 = list == null ? km5.a : list;
        kp5 kp5Var = g8l.m;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : kp5Var) {
            if (((g8l) obj) != g8l.f) {
                arrayList2.add(obj);
            }
        }
        int i3 = 10;
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            g8l g8lVar = (g8l) it.next();
            List<EventGraphData> graphPoints = eventGraphResponse.getGraphPoints();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : graphPoints) {
                ArrayList arrayList5 = arrayList2;
                if (((Boolean) g8lVar.a.invoke(Integer.valueOf((int) ((EventGraphData) obj2).getMinute()))).booleanValue()) {
                    arrayList4.add(obj2);
                }
                arrayList2 = arrayList5;
            }
            ArrayList arrayList6 = arrayList2;
            ArrayList arrayList7 = new ArrayList(k13.r(arrayList4, i3));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                EventGraphData eventGraphData = (EventGraphData) it2.next();
                arrayList7.add(new EventGraphData(eventGraphData.getMinute() - g8lVar.c, eventGraphData.getValue()));
                it = it;
            }
            arrayList3.add(arrayList7);
            arrayList2 = arrayList6;
            i3 = 10;
        }
        ArrayList arrayList8 = arrayList2;
        List list3 = (List) arrayList3.get(0);
        int i4 = 1;
        List list4 = (List) arrayList3.get(1);
        List list5 = (List) arrayList3.get(2);
        List list6 = (List) arrayList3.get(3);
        List list7 = (List) arrayList3.get(4);
        ArrayList arrayList9 = new ArrayList(k13.r(arrayList8, 10));
        Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            g8l g8lVar2 = (g8l) it3.next();
            ArrayList arrayList10 = new ArrayList();
            for (Object obj3 : list2) {
                int i5 = i4;
                Function1 function1 = g8lVar2.b;
                Integer time = ((Incident) obj3).getTime();
                if (((Boolean) function1.invoke(Integer.valueOf(time != null ? time.intValue() : -1))).booleanValue()) {
                    arrayList10.add(obj3);
                }
                i4 = i5;
            }
            int i6 = i4;
            ArrayList arrayList11 = new ArrayList();
            List j = b.j(Incident.GoalIncident.TYPE_TOUCHDOWN, Incident.GoalIncident.TYPE_EXTRA_POINT);
            List j2 = b.j(Incident.GoalIncident.TYPE_TOUCHDOWN, Incident.GoalIncident.TYPE_TWO_POINT_CONV);
            int size = arrayList10.size() - 1;
            Iterator it4 = it3;
            int i7 = 0;
            boolean z3 = false;
            while (i7 < size) {
                if (z3) {
                    js2Var = js2Var2;
                    arrayList = arrayList10;
                    i = i7;
                    i2 = size;
                    z3 = false;
                } else {
                    i = i7;
                    Incident incident = (Incident) arrayList10.get(i7);
                    i2 = size;
                    Incident incident2 = (Incident) arrayList10.get(i + 1);
                    arrayList = arrayList10;
                    if ((incident instanceof Incident.GoalIncident) && (incident2 instanceof Incident.GoalIncident)) {
                        js2Var = js2Var2;
                        int i8 = i6;
                        if (Intrinsics.c(Incident.isHome$default(incident, null, i8, null), Incident.isHome$default(incident2, null, i8, null))) {
                            Incident.GoalIncident goalIncident = (Incident.GoalIncident) incident;
                            Incident.GoalIncident goalIncident2 = (Incident.GoalIncident) incident2;
                            if (Intrinsics.c(goalIncident.getTime(), goalIncident2.getTime())) {
                                List j3 = b.j(goalIncident.getIncidentClass(), goalIncident2.getIncidentClass());
                                if (j3.containsAll(j)) {
                                    arrayList11.add(new Incident.GoalIncident(goalIncident.getIncidentType(), Incident.isHome$default(incident, null, 1, null), goalIncident.getTime(), "touchdownExtraPoint"));
                                } else if (j3.containsAll(j2)) {
                                    arrayList11.add(new Incident.GoalIncident(goalIncident.getIncidentType(), Incident.isHome$default(incident, null, 1, null), goalIncident.getTime(), "touchdown2PtConversion"));
                                } else {
                                    arrayList11.add(incident);
                                }
                                z3 = true;
                            }
                        }
                    } else {
                        js2Var = js2Var2;
                    }
                    arrayList11.add(incident);
                }
                i7 = i + 1;
                i6 = 1;
                size = i2;
                arrayList10 = arrayList;
                js2Var2 = js2Var;
            }
            js2 js2Var3 = js2Var2;
            ArrayList arrayList12 = arrayList10;
            if (!z3 && !arrayList12.isEmpty()) {
                arrayList11.add(CollectionsKt.h0(arrayList12));
            }
            arrayList9.add(arrayList11);
            i4 = 1;
            it3 = it4;
            js2Var2 = js2Var3;
        }
        js2 js2Var4 = js2Var2;
        this.f = tub.h(new Pair(g8l.f, new d8l(eventGraphResponse.getGraphPoints(), list2, eventGraphResponse.getPeriodTime(), eventGraphResponse.getPeriodCount())), new Pair(g8l.g, new d8l(list3, (List) arrayList9.get(0), eventGraphResponse.getPeriodTime(), null)), new Pair(g8l.h, new d8l(list4, (List) arrayList9.get(1), eventGraphResponse.getPeriodTime(), null)), new Pair(g8l.i, new d8l(list5, (List) arrayList9.get(2), eventGraphResponse.getPeriodTime(), null)), new Pair(g8l.j, new d8l(list6, (List) arrayList9.get(3), eventGraphResponse.getPeriodTime(), null)), new Pair(g8l.k, new d8l(list7, (List) arrayList9.get(4), eventGraphResponse.getPeriodTime(), null)));
        setVisibility(0);
        if (this.m) {
            SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) js2Var4.n;
            Boolean bool = Boolean.FALSE;
            Pair pair = new Pair(bool, bool);
            vqg vqgVar = new vqg(29);
            y1h y1hVar = this.o;
            y1hVar.getClass();
            segmentedButtonsView.k = new m81(this, z, 15);
            segmentedButtonsView.g = false;
            segmentedButtonsView.h = pair;
            segmentedButtonsView.j = y1hVar;
            segmentedButtonsView.i = vqgVar;
            rlh rlhVar = rlh.b;
            if (!rlhVar.isEmpty()) {
                SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
            }
            setupOnGraphClickListener(z2);
            z8e.a0((ImageView) js2Var4.e, 1000L, new b8l(this, 1));
        }
        post(new c8l(this, 0));
    }

    public final List n(boolean z, EventGraphData eventGraphData) {
        float abs;
        double minute = eventGraphData.getMinute();
        float f = z ? (float) minute : ((float) minute) / this.k;
        if (z) {
            abs = (float) eventGraphData.getValue();
        } else {
            double value = eventGraphData.getValue();
            abs = ((((float) Math.abs(value)) / 50.0f) * 0.5f * (value > 0.0d ? -1 : 1)) + 0.5f;
        }
        return a.c(new PointF(f, abs));
    }

    public final void o() {
        js2 js2Var = this.d;
        tsk tskVar = new tsk((RelativeLayout) js2Var.h);
        RelativeLayout relativeLayout = (RelativeLayout) js2Var.o;
        c38 c38Var = new c38(e5h.c(ph0.r(new Sequence[]{tskVar, new tsk(relativeLayout)})));
        while (c38Var.hasNext()) {
            View view = (View) c38Var.next();
            view.clearAnimation();
            view.setVisibility(8);
        }
        ((RelativeLayout) js2Var.h).removeAllViews();
        relativeLayout.removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        js2 js2Var = this.d;
        if (((Group) js2Var.m).getVisibility() != 0 || this.n) {
            return;
        }
        ((Group) js2Var.m).setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getTeamLogoOverlayHandler().removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.m) {
            return;
        }
        post(new c8l(this, 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        Drawable drawable;
        Boolean isHome$default;
        String incidentClass;
        Drawable mutate;
        Integer valueOf = Integer.valueOf(R.color.n_lv_1);
        int graphContainerWidth = getGraphContainerWidth();
        int i = this.q;
        int i2 = graphContainerWidth - i;
        if (i2 < 0) {
            i2 = 0;
        }
        o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d8l d8lVar = this.g;
        if (d8lVar == null) {
            Intrinsics.i("graphData");
            throw null;
        }
        for (Incident incident : d8lVar.b) {
            Integer time = incident.getTime();
            if (time != null) {
                if (time.intValue() <= 0) {
                    time = null;
                }
                if (time != null) {
                    int intValue = time.intValue();
                    if ((incident instanceof Incident.GoalIncident) && (incidentClass = ((Incident.GoalIncident) incident).getIncidentClass()) != null) {
                        int hashCode = incidentClass.hashCode();
                        qa5 qa5Var = qa5.a;
                        switch (hashCode) {
                            case -1684373569:
                                if (incidentClass.equals(Incident.GoalIncident.TYPE_DEF_TWO_POINT_CONV)) {
                                    Context context = getContext();
                                    context.getClass();
                                    drawable = qa5Var.d(context);
                                    break;
                                }
                                break;
                            case -909893934:
                                if (incidentClass.equals(Incident.GoalIncident.TYPE_SAFETY)) {
                                    Context context2 = getContext();
                                    context2.getClass();
                                    drawable = qa5.f(qa5Var, context2, R.drawable.ic_safety_16, Integer.valueOf(R.color.secondary_default), 4);
                                    break;
                                }
                                break;
                            case -595673439:
                                if (incidentClass.equals("touchdownExtraPoint")) {
                                    Context context3 = getContext();
                                    context3.getClass();
                                    Drawable drawable2 = context3.getDrawable(R.drawable.ic_touchdown_extra_point);
                                    if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
                                        mutate.setTint(context3.getColor(valueOf.intValue()));
                                        drawable = mutate;
                                        break;
                                    }
                                }
                                break;
                            case -312846630:
                                if (incidentClass.equals(Incident.GoalIncident.TYPE_TWO_POINT_CONV)) {
                                    Context context4 = getContext();
                                    context4.getClass();
                                    drawable = qa5Var.d(context4);
                                    break;
                                }
                                break;
                            case 108703926:
                                if (incidentClass.equals(Incident.GoalIncident.TYPE_ROUGE)) {
                                    Context context5 = getContext();
                                    context5.getClass();
                                    Drawable drawable3 = context5.getDrawable(R.drawable.ic_rogue_16);
                                    if (drawable3 != null && (mutate = drawable3.mutate()) != null) {
                                        mutate.setTint(context5.getColor(valueOf.intValue()));
                                        drawable = mutate;
                                        break;
                                    }
                                }
                                break;
                            case 364268641:
                                if (incidentClass.equals(Incident.GoalIncident.TYPE_TOUCHDOWN)) {
                                    Context context6 = getContext();
                                    context6.getClass();
                                    drawable = qa5Var.c(context6);
                                    break;
                                }
                                break;
                            case 733862752:
                                if (incidentClass.equals(Incident.GoalIncident.TYPE_EXTRA_POINT)) {
                                    Context context7 = getContext();
                                    context7.getClass();
                                    drawable = qa5Var.a(context7);
                                    break;
                                }
                                break;
                            case 876981451:
                                if (incidentClass.equals("touchdown2PtConversion")) {
                                    Context context8 = getContext();
                                    context8.getClass();
                                    Drawable drawable4 = context8.getDrawable(R.drawable.ic_touchdown_2pt_conversion);
                                    if (drawable4 != null && (mutate = drawable4.mutate()) != null) {
                                        mutate.setTint(context8.getColor(valueOf.intValue()));
                                        drawable = mutate;
                                        break;
                                    }
                                }
                                break;
                            case 1264813869:
                                if (incidentClass.equals(Incident.GoalIncident.TYPE_FIELD_GOAL)) {
                                    Context context9 = getContext();
                                    context9.getClass();
                                    drawable = qa5Var.b(context9);
                                    break;
                                }
                                break;
                        }
                        if (drawable != null && (isHome$default = Incident.isHome$default(incident, null, 1, null)) != null) {
                            boolean booleanValue = isHome$default.booleanValue();
                            float f = intValue;
                            if (this.h != null) {
                                Intrinsics.i("selectedTab");
                                throw null;
                            }
                            e8l e8lVar = new e8l(drawable, llf.c(((int) (((f - r10.c) / this.k) * graphContainerWidth)) - this.p, 0, i2));
                            if (booleanValue) {
                                arrayList.add(e8lVar);
                            } else {
                                arrayList2.add(e8lVar);
                            }
                        }
                    }
                    drawable = null;
                    if (drawable != null) {
                        boolean booleanValue2 = isHome$default.booleanValue();
                        float f2 = intValue;
                        if (this.h != null) {
                        }
                    }
                }
            }
        }
        int i3 = 0;
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        s(arrayList);
        s(arrayList2);
        js2 js2Var = this.d;
        Pair[] pairArr = {new Pair((RelativeLayout) js2Var.h, arrayList), new Pair((RelativeLayout) js2Var.o, arrayList2)};
        int i4 = 0;
        while (i4 < 2) {
            Pair pair = pairArr[i4];
            int i5 = i3 + 1;
            Object obj = pair.a;
            obj.getClass();
            RelativeLayout relativeLayout = (RelativeLayout) obj;
            for (e8l e8lVar2 : (List) pair.b) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageDrawable(e8lVar2.a);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
                layoutParams.setMarginStart(e8lVar2.b);
                imageView.setLayoutParams(layoutParams);
                imageView.setImageTintList(i3 == 1 ? ColorStateList.valueOf(imageView.getContext().getColor(R.color.away_primary)) : ColorStateList.valueOf(imageView.getContext().getColor(R.color.home_primary)));
                relativeLayout.addView(imageView);
            }
            i4++;
            i3 = i5;
        }
    }

    public final void q() {
        int graphContainerWidth = getGraphContainerWidth();
        int i = graphContainerWidth - this.q;
        if (i < 0) {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        o();
        Map map = this.f;
        if (map == null) {
            Intrinsics.i("groupedData");
            throw null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != g8l.f && (entry.getKey() != g8l.k || ((d8l) entry.getValue()).a.size() > 1)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((g8l) ((Map.Entry) it.next()).getKey());
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            g8l g8lVar = (g8l) it2.next();
            int c = llf.c(((int) (((g8lVar.c + 7.5f) / this.k) * graphContainerWidth)) - this.p, 0, i);
            jle jleVar = g8l.e;
            Event event = this.e;
            if (event == null) {
                Intrinsics.i("event");
                throw null;
            }
            String lastPeriod = event.getLastPeriod();
            jleVar.getClass();
            boolean z = g8lVar == jle.k(lastPeriod);
            String string = getContext().getString(g8lVar.d);
            string.getClass();
            arrayList.add(new f8l(c, string, z));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            f8l f8lVar = (f8l) it3.next();
            TextView textView = new TextView(getContext());
            textView.setTextAppearance(R.style.BodyMedium);
            textView.setText(f8lVar.a);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(f8lVar.c);
            textView.setLayoutParams(layoutParams);
            if (f8lVar.b) {
                haa.B(textView);
            } else {
                haa.D(textView);
            }
            ((RelativeLayout) this.d.o).addView(textView);
        }
    }

    public final void s(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (1 > size) {
            return;
        }
        int i = 1;
        while (true) {
            e8l e8lVar = (e8l) arrayList.get(i);
            int i2 = ((e8l) arrayList.get(i - 1)).b;
            int i3 = i2 - e8lVar.b;
            int i4 = this.q;
            if (i3 < i4) {
                int i5 = i2 - i4;
                if (i5 < 0) {
                    for (int size2 = arrayList.size() - 1; size2 > 0; size2--) {
                        e8l e8lVar2 = (e8l) arrayList.get(size2);
                        e8l e8lVar3 = (e8l) arrayList.get(size2 - 1);
                        int i6 = e8lVar3.b;
                        int i7 = e8lVar2.b;
                        if (i6 - i7 >= i4) {
                            return;
                        }
                        e8lVar3.b = i7 + i4;
                    }
                    return;
                }
                e8lVar.b = i5;
            }
            if (i == size) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void setTabButtonStyle(@NotNull y1h y1hVar) {
        y1hVar.getClass();
        this.o = y1hVar;
    }
}
