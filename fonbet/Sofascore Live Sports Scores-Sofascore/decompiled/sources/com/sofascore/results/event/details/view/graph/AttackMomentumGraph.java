package com.sofascore.results.event.details.view.graph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.newNetwork.EventGraphData;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.graph.AttackMomentumGraph;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.hc9;
import defpackage.hkg;
import defpackage.ht9;
import defpackage.im0;
import defpackage.j6;
import defpackage.jm0;
import defpackage.jrg;
import defpackage.k13;
import defpackage.km0;
import defpackage.km5;
import defpackage.l2a;
import defpackage.llf;
import defpackage.nt9;
import defpackage.pco;
import defpackage.qa5;
import defpackage.rfo;
import defpackage.wt9;
import defpackage.wzb;
import defpackage.xbb;
import defpackage.z8e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/sofascore/results/event/details/view/graph/AttackMomentumGraph;", "Landroid/view/View;", "Lcom/sofascore/model/mvvm/model/Event;", "a", "Lcom/sofascore/model/mvvm/model/Event;", "getEvent", "()Lcom/sofascore/model/mvvm/model/Event;", "setEvent", "(Lcom/sofascore/model/mvvm/model/Event;)V", "event", "Lwt9;", "getResult", "()Lwt9;", "result", "im0", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AttackMomentumGraph extends View {
    public static final /* synthetic */ int E = 0;
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final Paint D;

    /* renamed from: a, reason: from kotlin metadata */
    public Event event;
    public List b;
    public String c;
    public km0 d;
    public Bitmap e;
    public Bitmap f;
    public double g;
    public float h;
    public float i;
    public float j;
    public final RectF k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;
    public final float o;
    public final int p;
    public final int q;
    public final int r;
    public final float s;
    public final float t;
    public final float u;
    public final int v;
    public final Paint w;
    public final Paint x;
    public final Paint y;
    public final Paint z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttackMomentumGraph(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.b = km5.a;
        this.d = km0.f;
        this.k = new RectF();
        this.l = new ArrayList();
        this.m = new ArrayList();
        boolean c0 = hkg.c0(context);
        this.n = c0;
        this.o = c0 ? -1.0f : 1.0f;
        int color = context.getColor(R.color.home_primary);
        this.p = color;
        this.q = context.getColor(R.color.away_primary);
        int color2 = context.getColor(R.color.live);
        this.r = color2;
        this.s = ao2.u(1, context);
        this.t = ao2.u(3, context);
        this.u = ao2.u(8, context);
        this.v = ao2.s(16, context);
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.surface_1));
        this.w = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(context.getColor(R.color.n_lv_5));
        this.x = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(color);
        this.y = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(context.getColor(R.color.home_primary_highlight));
        this.z = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(color2);
        paint5.setStrokeWidth(ao2.u(1, context));
        this.A = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(context.getColor(R.color.primary_default));
        this.B = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(context.getColor(R.color.away_primary_highlight));
        this.C = paint7;
        Paint paint8 = new Paint(1);
        paint8.setStyle(Paint.Style.STROKE);
        paint8.setStrokeWidth(ao2.u(2, context));
        this.D = paint8;
        setWillNotDraw(false);
    }

    private final wt9 getResult() {
        return rfo.I(this);
    }

    public final void a(Canvas canvas, ArrayList arrayList, float f, boolean z) {
        d(arrayList);
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        int save = canvas.save();
        try {
            Iterator it = arrayList.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                im0 im0Var = (im0) it.next();
                float measuredWidth = this.n ? getMeasuredWidth() - im0Var.d : im0Var.d;
                canvas.translate(measuredWidth - f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                boolean z2 = im0Var.a;
                Drawable drawable = im0Var.b;
                if (z2) {
                    drawable.setTint(z ? this.q : this.p);
                }
                drawable.draw(canvas);
                f2 = measuredWidth;
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final void b(Integer num, Function1 function1) {
        nt9 a;
        Context context = getContext();
        context.getClass();
        ht9 ht9Var = new ht9(context);
        ht9Var.c = pco.R(num.intValue());
        ht9Var.q = jrg.b;
        ht9Var.f = pco.R(num.intValue());
        ht9Var.c(pco.R(num.intValue()));
        Context context2 = getContext();
        context2.getClass();
        wt9 result = getResult();
        z8e.Q(ht9Var, context2, R.drawable.team_logo_placeholder, (result == null || (a = result.a()) == null) ? null : a.e, Integer.valueOf(R.color.neutral_default));
        ht9Var.d = new l2a(3, function1, this, function1);
        Context context3 = getContext();
        context3.getClass();
        ajh.a(context3).a(ht9Var.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03c8, code lost:
    
        if (r7 != null) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x03e9, code lost:
    
        if (r7 != null) goto L213;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x017d A[LOOP:2: B:162:0x017b->B:163:0x017d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0194 A[LOOP:3: B:166:0x0192->B:167:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0497 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Event event, EventGraphResponse eventGraphResponse, List list, String str, boolean z) {
        double d;
        int i;
        int i2;
        TeamSides teamSides;
        km0 km0Var;
        int minute;
        int a;
        int intValue;
        int i3;
        int i4;
        xbb a2;
        boolean equals;
        ArrayList arrayList;
        ListIterator listIterator;
        int i5;
        hc9 hc9Var;
        int i6;
        Drawable l;
        Drawable drawable;
        event.getClass();
        eventGraphResponse.getClass();
        str.getClass();
        this.event = event;
        this.c = str;
        this.b = list == null ? km5.a : list;
        km0 km0Var2 = km0.f;
        List<EventGraphData> graphPoints = eventGraphResponse.getGraphPoints();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : graphPoints) {
            if (((EventGraphData) obj).getMinute() > 0.0d) {
                arrayList2.add(obj);
            }
        }
        int i7 = 2;
        if (arrayList2.isEmpty()) {
            km0Var = km0.f;
            d = 0.0d;
            i = 2;
            i2 = 1;
            teamSides = null;
        } else {
            Integer periodTime = eventGraphResponse.getPeriodTime();
            Integer periodTime2 = (periodTime != null ? periodTime.intValue() : 0) > 0 ? eventGraphResponse.getPeriodTime() : str.equals(Sports.FOOTBALL) ? 45 : str.equals(Sports.ICE_HOCKEY) ? 20 : null;
            Integer periodCount = eventGraphResponse.getPeriodCount();
            Integer periodCount2 = (periodCount != null ? periodCount.intValue() : 0) > 0 ? eventGraphResponse.getPeriodCount() : str.equals(Sports.FOOTBALL) ? 2 : str.equals(Sports.ICE_HOCKEY) ? 3 : null;
            if (periodTime2 == null || periodCount2 == null) {
                d = 0.0d;
                i = 2;
                i2 = 1;
                teamSides = null;
                EventGraphData eventGraphData = (EventGraphData) CollectionsKt.j0(arrayList2);
                Double valueOf = eventGraphData != null ? Double.valueOf(eventGraphData.getMinute()) : null;
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Float.valueOf((float) ((EventGraphData) it.next()).getValue()));
                }
                km0Var = new km0(a.c(new jm0(arrayList3, arrayList2.size())), valueOf);
            } else {
                d = 0.0d;
                int intValue2 = periodCount2.intValue() * periodTime2.intValue();
                i2 = 1;
                teamSides = null;
                Object[] objArr = ((EventGraphData) CollectionsKt.h0(arrayList2)).getMinute() >= ((double) (intValue2 + 1));
                if (objArr != false) {
                    Integer overtimeLength = eventGraphResponse.getOvertimeLength();
                    if ((overtimeLength != null ? overtimeLength.intValue() : 0) > 0) {
                        Integer overtimeLength2 = eventGraphResponse.getOvertimeLength();
                        if (overtimeLength2 != null) {
                            minute = overtimeLength2.intValue();
                        }
                    } else if (str.equals(Sports.FOOTBALL)) {
                        minute = 15;
                    } else {
                        minute = str.equals(Sports.ICE_HOCKEY) ? 20 : ((int) ((EventGraphData) CollectionsKt.h0(arrayList2)).getMinute()) - intValue2;
                    }
                    if (objArr != false) {
                        Integer overtimeCount = eventGraphResponse.getOvertimeCount();
                        if ((overtimeCount != null ? overtimeCount.intValue() : 0) > 0) {
                            Integer overtimeCount2 = eventGraphResponse.getOvertimeCount();
                            if (overtimeCount2 != null) {
                                a = overtimeCount2.intValue();
                            }
                        } else {
                            a = str.equals(Sports.FOOTBALL) ? 2 : str.equals(Sports.ICE_HOCKEY) ? wzb.a(Math.ceil((((EventGraphData) CollectionsKt.h0(arrayList2)).getMinute() - intValue2) / 20.0d)) : 1;
                        }
                        intValue = periodCount2.intValue();
                        int intValue3 = periodTime2.intValue();
                        int i8 = intValue * intValue3;
                        xbb b = a.b();
                        i3 = 0;
                        while (i3 < intValue) {
                            i3++;
                            b.add(Integer.valueOf((i3 * intValue3) + 1));
                            i7 = i7;
                        }
                        i = i7;
                        i4 = 0;
                        while (i4 < a) {
                            i4++;
                            b.add(Integer.valueOf((i4 * minute) + i8 + 1));
                        }
                        a2 = a.a(b);
                        EventGraphData eventGraphData2 = (EventGraphData) CollectionsKt.j0(arrayList2);
                        Double valueOf2 = eventGraphData2 != null ? Double.valueOf(eventGraphData2.getMinute()) : null;
                        equals = str.equals(Sports.FOOTBALL);
                        arrayList = new ArrayList(k13.r(a2, 10));
                        listIterator = a2.listIterator(0);
                        i5 = 0;
                        while (true) {
                            hc9Var = (hc9) listIterator;
                            if (!hc9Var.hasNext()) {
                                km0Var = new km0(arrayList, valueOf2);
                                break;
                            }
                            Object next = hc9Var.next();
                            i6 = i5 + 1;
                            if (i5 < 0) {
                                b.q();
                                throw null;
                            }
                            int intValue4 = ((Number) next).intValue();
                            int intValue5 = i5 == 0 ? 1 : ((Number) a2.get(i5 - 1)).intValue();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                EventGraphData eventGraphData3 = (EventGraphData) next2;
                                boolean z2 = equals;
                                xbb xbbVar = a2;
                                if (eventGraphData3.getMinute() >= intValue5 && eventGraphData3.getMinute() < intValue4) {
                                    arrayList4.add(next2);
                                }
                                a2 = xbbVar;
                                equals = z2;
                            }
                            boolean z3 = equals;
                            xbb xbbVar2 = a2;
                            ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                            Iterator it3 = arrayList4.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(Float.valueOf((float) ((EventGraphData) it3.next()).getValue()));
                            }
                            arrayList.add(new jm0(arrayList5, (intValue4 - intValue5) + (z3 ? 1 : 0)));
                            a2 = xbbVar2;
                            equals = z3 ? 1 : 0;
                            i5 = i6;
                        }
                    }
                    a = 0;
                    intValue = periodCount2.intValue();
                    int intValue32 = periodTime2.intValue();
                    int i82 = intValue * intValue32;
                    xbb b2 = a.b();
                    i3 = 0;
                    while (i3 < intValue) {
                    }
                    i = i7;
                    i4 = 0;
                    while (i4 < a) {
                    }
                    a2 = a.a(b2);
                    EventGraphData eventGraphData22 = (EventGraphData) CollectionsKt.j0(arrayList2);
                    if (eventGraphData22 != null) {
                    }
                    equals = str.equals(Sports.FOOTBALL);
                    arrayList = new ArrayList(k13.r(a2, 10));
                    listIterator = a2.listIterator(0);
                    i5 = 0;
                    while (true) {
                        hc9Var = (hc9) listIterator;
                        if (!hc9Var.hasNext()) {
                        }
                        arrayList.add(new jm0(arrayList5, (intValue4 - intValue5) + (z3 ? 1 : 0)));
                        a2 = xbbVar2;
                        equals = z3 ? 1 : 0;
                        i5 = i6;
                    }
                }
                minute = 0;
                if (objArr != false) {
                }
                a = 0;
                intValue = periodCount2.intValue();
                int intValue322 = periodTime2.intValue();
                int i822 = intValue * intValue322;
                xbb b22 = a.b();
                i3 = 0;
                while (i3 < intValue) {
                }
                i = i7;
                i4 = 0;
                while (i4 < a) {
                }
                a2 = a.a(b22);
                EventGraphData eventGraphData222 = (EventGraphData) CollectionsKt.j0(arrayList2);
                if (eventGraphData222 != null) {
                }
                equals = str.equals(Sports.FOOTBALL);
                arrayList = new ArrayList(k13.r(a2, 10));
                listIterator = a2.listIterator(0);
                i5 = 0;
                while (true) {
                    hc9Var = (hc9) listIterator;
                    if (!hc9Var.hasNext()) {
                    }
                    arrayList.add(new jm0(arrayList5, (intValue4 - intValue5) + (z3 ? 1 : 0)));
                    a2 = xbbVar2;
                    equals = z3 ? 1 : 0;
                    i5 = i6;
                }
            }
        }
        this.d = km0Var;
        if (Intrinsics.c(km0Var, km0.f)) {
            return;
        }
        final int i9 = i2;
        TeamSides teamSides2 = teamSides;
        final int i10 = 0;
        b(Integer.valueOf(Event.getHomeTeam$default(event, teamSides2, i9, teamSides2).getId()), new Function1(this) { // from class: gm0
            public final /* synthetic */ AttackMomentumGraph b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i11 = i10;
                AttackMomentumGraph attackMomentumGraph = this.b;
                Bitmap bitmap = (Bitmap) obj2;
                switch (i11) {
                    case 0:
                        attackMomentumGraph.e = bitmap;
                        break;
                    default:
                        attackMomentumGraph.f = bitmap;
                        break;
                }
                return Unit.a;
            }
        });
        b(Integer.valueOf(Event.getAwayTeam$default(event, teamSides2, i9, teamSides2).getId()), new Function1(this) { // from class: gm0
            public final /* synthetic */ AttackMomentumGraph b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i11 = i9;
                AttackMomentumGraph attackMomentumGraph = this.b;
                Bitmap bitmap = (Bitmap) obj2;
                switch (i11) {
                    case 0:
                        attackMomentumGraph.e = bitmap;
                        break;
                    default:
                        attackMomentumGraph.f = bitmap;
                        break;
                }
                return Unit.a;
            }
        });
        ArrayList arrayList6 = this.l;
        arrayList6.clear();
        ArrayList arrayList7 = this.m;
        arrayList7.clear();
        for (Incident incident : this.b) {
            Integer time = incident.getTime();
            if (time != null) {
                if (time.intValue() <= 0) {
                    time = null;
                }
                if (time != null) {
                    int intValue6 = time.intValue();
                    boolean z4 = incident instanceof Incident.GoalIncident;
                    boolean z5 = z4 && !Intrinsics.c(((Incident.GoalIncident) incident).getIncidentClass(), Incident.GoalIncident.TYPE_OWN_GOAL);
                    boolean z6 = incident instanceof Incident.CardIncident;
                    if (!z6 || !Intrinsics.c(this.c, Sports.ICE_HOCKEY)) {
                        qa5 qa5Var = qa5.a;
                        if (z6) {
                            String incidentClass = ((Incident.CardIncident) incident).getIncidentClass();
                            if (Intrinsics.c(incidentClass, Incident.CardIncident.CARD_RED)) {
                                Context context = getContext();
                                context.getClass();
                                l = qa5.f(qa5Var, context, R.drawable.ic_card_red_16, null, 6);
                            } else if (Intrinsics.c(incidentClass, Incident.CardIncident.CARD_YELLOW_RED)) {
                                Context context2 = getContext();
                                context2.getClass();
                                l = qa5.f(qa5Var, context2, R.drawable.ic_yellow_double_16, null, 6);
                            }
                            if (l == null) {
                                l.setBounds((-l.getIntrinsicWidth()) / 2, (-l.getIntrinsicHeight()) / 2, l.getIntrinsicWidth() / 2, l.getIntrinsicHeight() / 2);
                                Boolean isHome$default = Incident.isHome$default(incident, null, 1, null);
                                if (isHome$default != null) {
                                    boolean booleanValue = isHome$default.booleanValue();
                                    im0 im0Var = new im0(intValue6, l, z5);
                                    if (booleanValue) {
                                        arrayList6.add(im0Var);
                                    } else {
                                        arrayList7.add(im0Var);
                                    }
                                }
                            }
                        } else if (z4) {
                            Incident.GoalIncident goalIncident = (Incident.GoalIncident) incident;
                            if (Intrinsics.c(this.c, Sports.ICE_HOCKEY)) {
                                String incidentClass2 = goalIncident.getIncidentClass();
                                if (incidentClass2 != null) {
                                    switch (incidentClass2.hashCode()) {
                                        case -1055625287:
                                            if (incidentClass2.equals(Incident.GoalIncident.TYPE_OWN_GOAL)) {
                                                Context context3 = getContext();
                                                context3.getClass();
                                                Drawable drawable2 = context3.getDrawable(R.drawable.ic_pak_autogoal_16);
                                                if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                                                    drawable = null;
                                                } else {
                                                    drawable.setTint(context3.getColor(R.color.error));
                                                }
                                                l = drawable;
                                                break;
                                            }
                                            break;
                                        case -682674039:
                                            if (incidentClass2.equals("penalty")) {
                                                Context context4 = getContext();
                                                context4.getClass();
                                                l = qa5.f(qa5Var, context4, R.drawable.ic_hockey_penalty_goal, Integer.valueOf(R.color.n_lv_1), 4);
                                                break;
                                            }
                                            break;
                                        case 846006713:
                                            if (incidentClass2.equals(Incident.GoalIncident.TYPE_POWER_PLAY)) {
                                                Context context5 = getContext();
                                                context5.getClass();
                                                Drawable drawable3 = context5.getDrawable(R.drawable.ic_ice_hockey_powerplay_goal_16);
                                                if (drawable3 != null) {
                                                    l = drawable3.mutate();
                                                    break;
                                                }
                                            }
                                            break;
                                        case 1540990154:
                                            if (incidentClass2.equals(Incident.GoalIncident.TYPE_SHORT_HANDED)) {
                                                Context context6 = getContext();
                                                context6.getClass();
                                                Drawable drawable4 = context6.getDrawable(R.drawable.ic_ice_hockey_shorthand_goal_16);
                                                if (drawable4 != null) {
                                                    l = drawable4.mutate();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                Context context7 = getContext();
                                context7.getClass();
                                l = qa5Var.k(context7);
                            } else {
                                String incidentClass3 = goalIncident.getIncidentClass();
                                if (Intrinsics.c(incidentClass3, "penalty")) {
                                    Context context8 = getContext();
                                    context8.getClass();
                                    l = qa5Var.j(context8);
                                } else if (Intrinsics.c(incidentClass3, Incident.GoalIncident.TYPE_OWN_GOAL)) {
                                    Context context9 = getContext();
                                    context9.getClass();
                                    l = qa5Var.e(context9);
                                } else {
                                    Context context10 = getContext();
                                    context10.getClass();
                                    l = qa5Var.h(context10);
                                }
                            }
                            if (l == null) {
                            }
                        } else if ((incident instanceof Incident.PenaltyShotIncident) && Intrinsics.c(((Incident.PenaltyShotIncident) incident).getIncidentClass(), Incident.PenaltyShotIncident.PENALTY_SHOT_MISSED)) {
                            Context context11 = getContext();
                            context11.getClass();
                            l = qa5Var.l(context11);
                            if (l == null) {
                            }
                        }
                    }
                    l = null;
                    if (l == null) {
                    }
                }
            }
        }
        if (!arrayList6.isEmpty() || !arrayList7.isEmpty()) {
            d(arrayList6);
            d(arrayList7);
        }
        Double d2 = this.d.b;
        boolean z7 = this.g == d;
        if (d2 != null && d2.doubleValue() > this.g) {
            this.g = d2.doubleValue();
            if (z) {
                float[] fArr = new float[i];
                // fill-array-data instruction
                fArr[0] = 0.0f;
                fArr[1] = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setDuration(z7 ? 500L : 0L);
                ofFloat.setInterpolator(new LinearInterpolator());
                final int i11 = 0;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hm0
                    public final /* synthetic */ AttackMomentumGraph b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i12 = i11;
                        AttackMomentumGraph attackMomentumGraph = this.b;
                        switch (i12) {
                            case 0:
                                int i13 = AttackMomentumGraph.E;
                                attackMomentumGraph.i = ((Float) fn0.i(valueAnimator)).floatValue();
                                attackMomentumGraph.invalidate();
                                break;
                            default:
                                int i14 = AttackMomentumGraph.E;
                                attackMomentumGraph.h = ((Float) fn0.i(valueAnimator)).floatValue();
                                attackMomentumGraph.invalidate();
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat2.setDuration(z7 ? 500L : 300L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                final int i12 = 1;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: hm0
                    public final /* synthetic */ AttackMomentumGraph b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i122 = i12;
                        AttackMomentumGraph attackMomentumGraph = this.b;
                        switch (i122) {
                            case 0:
                                int i13 = AttackMomentumGraph.E;
                                attackMomentumGraph.i = ((Float) fn0.i(valueAnimator)).floatValue();
                                attackMomentumGraph.invalidate();
                                break;
                            default:
                                int i14 = AttackMomentumGraph.E;
                                attackMomentumGraph.h = ((Float) fn0.i(valueAnimator)).floatValue();
                                attackMomentumGraph.invalidate();
                                break;
                        }
                    }
                });
                ofFloat2.addListener(new j6(ofFloat, i12));
                ofFloat2.start();
            } else {
                this.i = 1.0f;
                this.h = 1.0f;
                invalidate();
            }
        }
        invalidate();
    }

    public final void d(List list) {
        RectF rectF = this.k;
        float width = rectF.width() - getPaddingEnd();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!hasNext) {
                break;
            }
            im0 im0Var = (im0) it.next();
            float width2 = (im0Var.c / this.d.d) * rectF.width();
            if (width2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = width2 > width ? width : width2;
            }
            im0Var.d = f;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                im0 im0Var2 = (im0) list.get(i);
                im0 im0Var3 = (im0) list.get(i - 1);
                float f2 = im0Var3.d;
                float f3 = im0Var2.d;
                Drawable drawable = im0Var2.b;
                if (f2 - f3 >= drawable.getIntrinsicWidth()) {
                    continue;
                } else {
                    if (im0Var3.d - drawable.getIntrinsicWidth() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        for (int size2 = list.size() - 1; size2 > 0; size2--) {
                            im0 im0Var4 = (im0) list.get(size2);
                            im0 im0Var5 = (im0) list.get(size2 - 1);
                            float f4 = im0Var5.d;
                            float f5 = im0Var4.d;
                            Drawable drawable2 = im0Var4.b;
                            if (f4 - f5 >= drawable2.getIntrinsicWidth()) {
                                return;
                            }
                            im0Var5.d = im0Var4.d + drawable2.getIntrinsicWidth();
                        }
                        return;
                    }
                    im0Var2.d = im0Var3.d - drawable.getIntrinsicWidth();
                }
            }
        }
    }

    @Nullable
    public final Event getEvent() {
        return this.event;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Throwable th;
        int i;
        int i2;
        Iterator it;
        float f3;
        float f4;
        float f5;
        int i3;
        jm0 jm0Var;
        float f6;
        Canvas canvas2 = canvas;
        float f7 = this.o;
        canvas2.getClass();
        if (Intrinsics.c(this.d, km0.f)) {
            return;
        }
        float f8 = this.u;
        float f9 = this.t;
        Paint paint = this.D;
        float f10 = this.s;
        RectF rectF = this.k;
        int save = canvas2.save();
        try {
            float measuredWidth = getMeasuredWidth();
            float width = rectF.width();
            float height = rectF.height();
            float f11 = height / 2.0f;
            float f12 = f10 / 2.0f;
            km0 km0Var = this.d;
            float f13 = (width / km0Var.d) * km0Var.c;
            float f14 = this.j;
            float f15 = ((f13 - f14) * this.h) + f14;
            int size = km0Var.a.size() - 1;
            km0 km0Var2 = this.d;
            float size2 = ((width - (size * f10)) - ((km0Var2.d - km0Var2.a.size()) * f12)) / this.d.d;
            if (this.h == 1.0f) {
                this.j = f13;
            }
            canvas2.translate(f8 * f7, rectF.top);
            Bitmap bitmap = this.e;
            boolean z = this.n;
            if (bitmap != null) {
                if (z) {
                    f = 1.0f;
                    f6 = measuredWidth - bitmap.getWidth();
                } else {
                    f = 1.0f;
                    f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                f2 = width;
                canvas2.drawBitmap(bitmap, f6, ((height * f) / 4.0f) - (bitmap.getHeight() / 2.0f), (Paint) null);
            } else {
                f = 1.0f;
                f2 = width;
            }
            Bitmap bitmap2 = this.f;
            if (bitmap2 != null) {
                th = null;
                canvas2.drawBitmap(bitmap2, z ? measuredWidth - bitmap2.getWidth() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((3.0f * height) / 4.0f) - (bitmap2.getHeight() / 2.0f), (Paint) null);
            } else {
                th = null;
            }
            if (z) {
                canvas2.scale(-1.0f, f, measuredWidth / 2.0f, getMeasuredHeight() / 2.0f);
            }
            canvas2.translate(getPaddingStart() - f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Throwable th2 = th;
            float f16 = f2;
            canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f16, height, this.x);
            int save2 = canvas2.save();
            try {
                canvas2.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f15, height);
                i = save2;
                try {
                    canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f16, f11, this.z);
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    canvas2 = canvas;
                    float f17 = height;
                    canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, f16, f17, this.C);
                    float f18 = f11;
                    canvas2.restoreToCount(i);
                    Iterator it2 = this.d.e.iterator();
                    int i4 = 0;
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        Paint paint2 = this.w;
                        if (!hasNext) {
                            float f19 = f17;
                            float f20 = f18;
                            int i5 = 0;
                            int save3 = canvas2.save();
                            try {
                                canvas2.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -rectF.top, this.i * f16, f19);
                                it = this.d.a.iterator();
                                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            } catch (Throwable th4) {
                                th = th4;
                                i2 = save3;
                            }
                            while (it.hasNext()) {
                                jm0 jm0Var2 = (jm0) it.next();
                                Iterator it3 = jm0Var2.a.iterator();
                                float f21 = f19;
                                float f22 = f3;
                                int i6 = i5;
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        i2 = save3;
                                        b.q();
                                        throw th2;
                                    }
                                    float floatValue = ((Number) next).floatValue();
                                    int i8 = i6;
                                    float f23 = f22 + size2;
                                    float f24 = f10;
                                    Iterator it4 = it;
                                    float b = llf.b(floatValue / 100.0f, -1.0f, 1.0f);
                                    if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        float f25 = f20 - (b * f20);
                                        f4 = f21;
                                        try {
                                            i2 = save3;
                                            i3 = i8;
                                            jm0Var = jm0Var2;
                                            float f26 = f20;
                                            try {
                                                canvas2.drawRect(f22, f25, f23, f26, this.y);
                                                f5 = f26;
                                                canvas2 = canvas;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                canvas2 = canvas;
                                                canvas2.restoreToCount(i2);
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            i2 = save3;
                                        }
                                    } else {
                                        int i9 = save3;
                                        f4 = f21;
                                        f5 = f20;
                                        i3 = i8;
                                        jm0Var = jm0Var2;
                                        float f27 = f5 - (f5 * b);
                                        try {
                                            i2 = i9;
                                            canvas2 = canvas;
                                            canvas2.drawRect(f22, f5, f23, f27, this.B);
                                        } catch (Throwable th7) {
                                            th = th7;
                                            i2 = i9;
                                            canvas2 = canvas;
                                            canvas2.restoreToCount(i2);
                                            throw th;
                                        }
                                    }
                                    if (i3 != jm0Var.a.size() - 1) {
                                        try {
                                            f23 += f12;
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    }
                                    f22 = f23;
                                    f20 = f5;
                                    save3 = i2;
                                    jm0Var2 = jm0Var;
                                    f21 = f4;
                                    i6 = i7;
                                    f10 = f24;
                                    it = it4;
                                    th = th8;
                                    canvas2.restoreToCount(i2);
                                    throw th;
                                }
                                f3 = f22 + f10;
                                save3 = save3;
                                f19 = f21;
                                i5 = 0;
                            }
                            float f28 = f19;
                            canvas2.restoreToCount(save3);
                            Event event = this.event;
                            if (Intrinsics.c(event != null ? event.getStatusType() : th2, StatusKt.STATUS_IN_PROGRESS)) {
                                paint.setColor(this.r);
                                canvas2.drawCircle(f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9, paint2);
                                canvas2.drawCircle(f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9, paint);
                                canvas2.drawLine(f15, this.t, f15, f28, this.A);
                                paint.setColor(this.p);
                                canvas2.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f28, f9, paint2);
                                canvas2.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f28, f9, paint);
                            }
                            canvas2.restoreToCount(save);
                            if (this.i < 1.0f) {
                                return;
                            }
                            canvas2.translate(getPaddingStart() * f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            a(canvas2, this.l, getPaddingTop() / 2.0f, false);
                            a(canvas2, this.m, getMeasuredHeight() - getPaddingBottom(), true);
                            return;
                        }
                        Object next2 = it2.next();
                        int i10 = i4 + 1;
                        if (i4 < 0) {
                            b.q();
                            throw th2;
                        }
                        float intValue = (i4 * f10) + (((r4 - i4) - 1) * f12) + (((Number) next2).intValue() * size2);
                        canvas2.drawRect(intValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue + f10, f17, paint2);
                        f17 = f17;
                        i4 = i10;
                        f18 = f18;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    canvas2 = canvas;
                    canvas2.restoreToCount(i);
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                i = save2;
            }
        } finally {
            canvas2.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            this.k.set(getPaddingStart(), getPaddingTop(), getMeasuredWidth() - getPaddingEnd(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final void setEvent(@Nullable Event event) {
        this.event = event;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttackMomentumGraph(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
