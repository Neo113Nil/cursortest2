package com.sofascore.results.event.details.view.cricket.runsperover;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.sofascore.model.mvvm.model.CricketEvent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ScoreCricketInning;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.RunsPerOverGraphPoint;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.j6;
import defpackage.k13;
import defpackage.km5;
import defpackage.m4j;
import defpackage.s2;
import defpackage.xbb;
import defpackage.yhk;
import defpackage.z1g;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/sofascore/results/event/details/view/cricket/runsperover/CricketRunsPerOverGraphView;", "Landroid/view/View;", "", "getGraphWidth", "()F", "graphWidth", "getGraphHeight", "graphHeight", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CricketRunsPerOverGraphView extends View {
    public static final /* synthetic */ int J = 0;
    public m4j A;
    public Float B;
    public List C;
    public List D;
    public Path E;
    public Path F;
    public ValueAnimator G;
    public final ArrayList H;
    public boolean I;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final Paint m;
    public final Paint n;
    public final Paint o;
    public final Paint p;
    public final Paint q;
    public Pair r;
    public Pair s;
    public float t;
    public float u;
    public float v;
    public float w;
    public final LinkedHashMap x;
    public final LinkedHashMap y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CricketRunsPerOverGraphView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        context.getClass();
        int color = context.getColor(R.color.live);
        this.a = color;
        this.b = context.getColor(R.color.surface_1);
        this.c = context.getColor(R.color.n_lv_3);
        this.d = context.getColor(R.color.home_primary);
        this.e = context.getColor(R.color.away_primary);
        float s = ao2.s(1, context);
        float s2 = ao2.s(2, context);
        this.f = s2;
        float s3 = ao2.s(4, context);
        this.g = s3;
        float s4 = ao2.s(8, context);
        this.h = ao2.s(10, context);
        this.i = ao2.s(12, context);
        this.j = ao2.s(14, context);
        this.k = ao2.s(24, context);
        this.l = ao2.s(36, context);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(s2);
        this.m = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(s);
        paint2.setPathEffect(new DashPathEffect(new float[]{s3, s4}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        paint2.setColor(context.getColor(R.color.n_lv_4));
        this.n = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(ao2.t(context, 1.5f));
        paint3.setColor(color);
        this.o = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.FILL);
        this.p = paint4;
        Paint paint5 = new Paint(1);
        try {
            typeface = z1g.a(R.font.sofascore_sans_regular, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        paint5.setTypeface(typeface);
        paint5.setLetterSpacing(-0.03f);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setTextSize(ao2.s(10, context));
        this.q = paint5;
        this.x = new LinkedHashMap();
        this.y = new LinkedHashMap();
        km5 km5Var = km5.a;
        this.C = km5Var;
        this.D = km5Var;
        this.H = new ArrayList();
        this.I = true;
        setWillNotDraw(false);
    }

    private final float getGraphHeight() {
        return (getHeight() - this.k) - this.l;
    }

    private final float getGraphWidth() {
        return (getWidth() - this.j) - this.l;
    }

    public final void a() {
        Pair pair = this.r;
        if (pair != null) {
            List list = (List) pair.a;
            List list2 = (List) pair.b;
            this.E = list != null ? b(list) : null;
            this.F = list2 != null ? b(list2) : null;
        }
    }

    public final Path b(List list) {
        float height = getHeight();
        float f = this.l;
        float f2 = height - f;
        Path path = new Path();
        path.moveTo(f, f2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RunsPerOverGraphPoint runsPerOverGraphPoint = (RunsPerOverGraphPoint) it.next();
            path.lineTo((runsPerOverGraphPoint.getOver() * getGraphWidth()) + f, f2 - (runsPerOverGraphPoint.getRuns() * getGraphHeight()));
        }
        return path;
    }

    public final void c() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.G;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ArrayList arrayList = this.H;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).removeAllUpdateListeners();
        }
        arrayList.clear();
    }

    public final void d(Canvas canvas, String str, float f, float f2) {
        canvas.save();
        canvas.scale(getScaleX(), getScaleY(), f, f2);
        canvas.drawText(str, f, f2, this.q);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, RunsPerOverGraphPoint runsPerOverGraphPoint, List list) {
        float f;
        Object obj;
        float height = getHeight();
        float f2 = this.l;
        float f3 = height - f2;
        float over = (runsPerOverGraphPoint.getOver() * getGraphWidth()) + f2;
        float runs = f3 - (runsPerOverGraphPoint.getRuns() * getGraphHeight());
        Paint paint = this.q;
        float ascent = (paint.ascent() + paint.descent()) / 2.0f;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((RunsPerOverGraphPoint) obj).getOver() == runsPerOverGraphPoint.getOver()) {
                        break;
                    }
                }
            }
            RunsPerOverGraphPoint runsPerOverGraphPoint2 = (RunsPerOverGraphPoint) obj;
            if (runsPerOverGraphPoint2 != null) {
                f = runsPerOverGraphPoint2.getRuns();
                int i = runsPerOverGraphPoint.getRuns() <= f ? -1 : 1;
                float f4 = this.h;
                d(canvas, String.valueOf(runsPerOverGraphPoint.getWickets()), over, (((i * ((((float) i) * f4) + runs > f3 ? -1 : 1)) * f4) + runs) - ascent);
            }
        }
        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (runsPerOverGraphPoint.getRuns() <= f) {
        }
        float f42 = this.h;
        d(canvas, String.valueOf(runsPerOverGraphPoint.getWickets()), over, (((i * ((((float) i) * f42) + runs > f3 ? -1 : 1)) * f42) + runs) - ascent);
    }

    public final void f(CricketEvent cricketEvent, Pair pair, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList;
        ArrayList arrayList2;
        float f5;
        float f6;
        ArrayList arrayList3;
        m4j m4jVar;
        ArrayList arrayList4;
        Float f7;
        Collection<ScoreCricketInning> values;
        ScoreCricketInning scoreCricketInning;
        Double overs;
        Collection<ScoreCricketInning> values2;
        ScoreCricketInning scoreCricketInning2;
        Double overs2;
        pair.getClass();
        Object obj = pair.a;
        if (z2) {
            this.I = true;
            this.v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.x.clear();
            this.y.clear();
            c();
        }
        boolean z3 = Intrinsics.c(cricketEvent.getStatus().getType(), StatusKt.STATUS_IN_PROGRESS) && z;
        this.z = z3;
        ArrayList arrayList5 = null;
        if (z3) {
            Integer currentBattingTeamId = cricketEvent.getCurrentBattingTeamId();
            m4j m4jVar2 = (currentBattingTeamId != null && currentBattingTeamId.intValue() == Event.getHomeTeam$default(cricketEvent, null, 1, null).getId()) ? m4j.HOME : (currentBattingTeamId != null && currentBattingTeamId.intValue() == Event.getAwayTeam$default(cricketEvent, null, 1, null).getId()) ? m4j.AWAY : null;
            this.A = m4jVar2;
            if (m4jVar2 != null) {
                int ordinal = m4jVar2.ordinal();
                if (ordinal == 0) {
                    Map<String, ScoreCricketInning> innings = Event.getHomeScore$default(cricketEvent, null, 1, null).getInnings();
                    if (innings != null && (values = innings.values()) != null && (scoreCricketInning = (ScoreCricketInning) CollectionsKt.i0(values)) != null && (overs = scoreCricketInning.getOvers()) != null) {
                        f7 = Float.valueOf((float) overs.doubleValue());
                        this.B = f7;
                    }
                } else {
                    if (ordinal != 1) {
                        zzl.b();
                        return;
                    }
                    Map<String, ScoreCricketInning> innings2 = Event.getAwayScore$default(cricketEvent, null, 1, null).getInnings();
                    if (innings2 != null && (values2 = innings2.values()) != null && (scoreCricketInning2 = (ScoreCricketInning) CollectionsKt.i0(values2)) != null && (overs2 = scoreCricketInning2.getOvers()) != null) {
                        f7 = Float.valueOf((float) overs2.doubleValue());
                        this.B = f7;
                    }
                }
            }
            f7 = null;
            this.B = f7;
        }
        List list = (List) obj;
        List<RunsPerOverGraphPoint> list2 = (List) pair.b;
        if (list != null) {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                yhk.d();
                return;
            } else {
                f = ((RunsPerOverGraphPoint) it.next()).getRuns();
                while (it.hasNext()) {
                    f = Math.max(f, ((RunsPerOverGraphPoint) it.next()).getRuns());
                }
            }
        } else {
            f = 0.0f;
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            if (!it2.hasNext()) {
                yhk.d();
                return;
            } else {
                f2 = ((RunsPerOverGraphPoint) it2.next()).getRuns();
                while (it2.hasNext()) {
                    f2 = Math.max(f2, ((RunsPerOverGraphPoint) it2.next()).getRuns());
                }
            }
        } else {
            f2 = 0.0f;
        }
        float max = Math.max(f, f2);
        if (list != null) {
            Iterator it3 = list.iterator();
            if (!it3.hasNext()) {
                yhk.d();
                return;
            } else {
                f3 = ((RunsPerOverGraphPoint) it3.next()).getOver();
                while (it3.hasNext()) {
                    f3 = Math.max(f3, ((RunsPerOverGraphPoint) it3.next()).getOver());
                }
            }
        } else {
            f3 = 0.0f;
        }
        if (list2 != null) {
            Iterator it4 = list2.iterator();
            if (!it4.hasNext()) {
                yhk.d();
                return;
            } else {
                f4 = ((RunsPerOverGraphPoint) it4.next()).getOver();
                while (it4.hasNext()) {
                    f4 = Math.max(f4, ((RunsPerOverGraphPoint) it4.next()).getOver());
                }
            }
        } else {
            f4 = 0.0f;
        }
        float max2 = Math.max(f3, f4);
        int ceil = (int) Math.ceil(max);
        int ceil2 = (int) Math.ceil(max2);
        int i = 40;
        int i2 = 20;
        if (ceil2 <= 20) {
            i2 = 4;
        } else if (ceil2 <= 50) {
            i2 = 5;
        } else if (ceil2 <= 100) {
            i2 = 10;
        } else if (ceil2 > 200) {
            i2 = 40;
        }
        if (ceil <= 150) {
            i = 30;
        } else if (ceil > 350) {
            i = ceil <= 450 ? 50 : ceil <= 750 ? 75 : 100;
        }
        int ceil3 = (int) Math.ceil(Math.max(ceil2, i2 * 5) / i2);
        int ceil4 = (int) Math.ceil(Math.max(ceil, i * 5) / i);
        xbb b = a.b();
        for (int i3 = 0; i3 < ceil3; i3++) {
            b.add(Integer.valueOf(i2 * i3));
        }
        b.add(Integer.valueOf(ceil3 * i2));
        this.C = a.a(b);
        xbb b2 = a.b();
        for (int i4 = 0; i4 < ceil4; i4++) {
            b2.add(Integer.valueOf(i * i4));
        }
        b2.add(Integer.valueOf(ceil4 * i));
        xbb a = a.a(b2);
        this.D = a;
        int intValue = ((Number) CollectionsKt.o0(a)).intValue();
        int intValue2 = ((Number) CollectionsKt.o0(this.C)).intValue();
        List<RunsPerOverGraphPoint> list3 = (List) obj;
        if (list3 != null) {
            ArrayList arrayList6 = new ArrayList(k13.r(list3, 10));
            for (RunsPerOverGraphPoint runsPerOverGraphPoint : list3) {
                arrayList6.add(new RunsPerOverGraphPoint(runsPerOverGraphPoint.getOver() / intValue2, runsPerOverGraphPoint.getRuns() / intValue, runsPerOverGraphPoint.getWickets()));
            }
            arrayList = new ArrayList(arrayList6);
        } else {
            arrayList = null;
        }
        if (list2 != null) {
            ArrayList arrayList7 = new ArrayList(k13.r(list2, 10));
            for (RunsPerOverGraphPoint runsPerOverGraphPoint2 : list2) {
                arrayList7.add(new RunsPerOverGraphPoint(runsPerOverGraphPoint2.getOver() / intValue2, runsPerOverGraphPoint2.getRuns() / intValue, runsPerOverGraphPoint2.getWickets()));
            }
            arrayList2 = new ArrayList(arrayList7);
        } else {
            arrayList2 = null;
        }
        if (this.z && (m4jVar = this.A) != null) {
            int ordinal2 = m4jVar.ordinal();
            if (ordinal2 == 0) {
                arrayList4 = arrayList;
            } else {
                if (ordinal2 != 1) {
                    zzl.b();
                    return;
                }
                arrayList4 = arrayList2;
            }
            if (arrayList4 != null) {
                RunsPerOverGraphPoint runsPerOverGraphPoint3 = (RunsPerOverGraphPoint) CollectionsKt.h0(arrayList4);
                Float f8 = this.B;
                float max3 = Math.max((f8 != null ? f8.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / intValue2, runsPerOverGraphPoint3.getOver());
                if (max3 > 1.0f) {
                    max3 = 1.0f;
                }
                this.t = max3;
                arrayList4.add(new RunsPerOverGraphPoint(this.t, runsPerOverGraphPoint3.getRuns(), null));
            }
        }
        if (arrayList != null) {
            Iterator it5 = arrayList.iterator();
            if (!it5.hasNext()) {
                yhk.d();
                return;
            } else {
                f5 = ((RunsPerOverGraphPoint) it5.next()).getOver();
                while (it5.hasNext()) {
                    f5 = Math.max(f5, ((RunsPerOverGraphPoint) it5.next()).getOver());
                }
            }
        } else {
            f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (arrayList2 != null) {
            Iterator it6 = arrayList2.iterator();
            if (!it6.hasNext()) {
                yhk.d();
                return;
            } else {
                f6 = ((RunsPerOverGraphPoint) it6.next()).getOver();
                while (it6.hasNext()) {
                    f6 = Math.max(f6, ((RunsPerOverGraphPoint) it6.next()).getOver());
                }
            }
        } else {
            f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.u = Math.max(f5, f6);
        this.r = new Pair(arrayList, arrayList2);
        if (arrayList != null) {
            arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((RunsPerOverGraphPoint) obj2).getWickets() != null) {
                    arrayList3.add(obj2);
                }
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList2 != null) {
            arrayList5 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (((RunsPerOverGraphPoint) obj3).getWickets() != null) {
                    arrayList5.add(obj3);
                }
            }
        }
        this.s = new Pair(arrayList3, arrayList5);
        a();
        boolean z4 = this.I;
        float f9 = z4 ? this.v : this.w;
        float f10 = z4 ? this.u : this.t;
        long j = z4 ? 750L : 250L;
        c();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new s2(this, 5));
        ofFloat.addListener(new j6(this, 2));
        ofFloat.start();
        this.G = ofFloat;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        Paint paint;
        float f2;
        float f3;
        canvas.getClass();
        super.onDraw(canvas);
        int i = this.c;
        Paint paint2 = this.q;
        paint2.setColor(i);
        float width = getWidth() - this.j;
        float height = getHeight();
        float f4 = this.l;
        float f5 = height - f4;
        float ascent = (paint2.ascent() + paint2.descent()) / 2.0f;
        int size = this.C.size();
        int size2 = this.D.size();
        float graphWidth = getGraphWidth() / (size - 1);
        int i2 = size2 - 1;
        float graphHeight = getGraphHeight() / i2;
        int i3 = 0;
        while (true) {
            f = this.i;
            paint = this.n;
            f2 = this.l;
            f3 = this.k;
            if (i3 >= size) {
                break;
            }
            float f6 = (i3 * graphWidth) + f2;
            float f7 = width;
            int i4 = i3;
            canvas.drawLine(f6, f5, f6, f3, paint);
            Integer num = (Integer) CollectionsKt.a0(i4, this.C);
            if (num != null) {
                d(canvas, String.valueOf(num.intValue()), f6, (f5 + f) - ascent);
            }
            i3 = i4 + 1;
            width = f7;
        }
        float f8 = width;
        for (int i5 = 0; i5 < size2; i5++) {
            float f9 = (i5 * graphHeight) + f3;
            canvas.drawLine(f2, f9, f8, f9, paint);
            Integer num2 = (Integer) CollectionsKt.a0(i2 - i5, this.D);
            if (num2 != null) {
                d(canvas, String.valueOf(num2.intValue()), f2 - f, f9 - ascent);
            }
        }
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float height2 = getHeight() - f4;
        float graphWidth2 = (this.v * getGraphWidth()) + f4;
        canvas.save();
        if (this.I || this.A == m4j.HOME) {
            canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, graphWidth2, getHeight());
        }
        Path path = this.E;
        int i6 = this.d;
        Paint paint3 = this.m;
        if (path != null) {
            paint3.setColor(i6);
            canvas.drawPath(path, paint3);
        }
        canvas.restore();
        canvas.save();
        if (this.I || this.A == m4j.AWAY) {
            canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, graphWidth2, getHeight());
        }
        Path path2 = this.F;
        int i7 = this.e;
        if (path2 != null) {
            paint3.setColor(i7);
            canvas.drawPath(path2, paint3);
        }
        canvas.restore();
        Pair pair = this.r;
        if (pair == null) {
            pair = new Pair(null, null);
        }
        List list = (List) pair.a;
        List list2 = (List) pair.b;
        Pair pair2 = this.s;
        if (pair2 == null) {
            pair2 = new Pair(null, null);
        }
        List list3 = (List) pair2.a;
        List list4 = (List) pair2.b;
        Paint paint4 = this.p;
        float f10 = this.g;
        int i8 = this.b;
        float f11 = this.f;
        if (list3 != null) {
            paint2.setColor(i6);
            Iterator it = list3.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i10 = i9 + 1;
                if (i9 < 0) {
                    b.q();
                    throw null;
                }
                RunsPerOverGraphPoint runsPerOverGraphPoint = (RunsPerOverGraphPoint) next;
                float f12 = height2;
                List list5 = list4;
                float floatValue = ((Number) this.x.getOrDefault(Integer.valueOf(i9), valueOf)).floatValue();
                float over = (runsPerOverGraphPoint.getOver() * getGraphWidth()) + f4;
                Iterator it2 = it;
                float runs = f12 - (runsPerOverGraphPoint.getRuns() * getGraphHeight());
                paint4.setColor(i6);
                int i11 = i6;
                canvas.drawCircle(over, runs, f10 * floatValue, paint4);
                paint4.setColor(i8);
                canvas.drawCircle(over, runs, f11 * floatValue, paint4);
                if (floatValue >= 0.99d) {
                    Integer wickets = runsPerOverGraphPoint.getWickets();
                    if ((wickets != null ? wickets.intValue() : 0) > 1) {
                        e(canvas, runsPerOverGraphPoint, list2);
                    }
                }
                i6 = i11;
                height2 = f12;
                i9 = i10;
                list4 = list5;
                it = it2;
            }
        }
        float f13 = height2;
        List list6 = list4;
        if (list6 != null) {
            paint2.setColor(i7);
            int i12 = 0;
            for (Object obj : list6) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    b.q();
                    throw null;
                }
                RunsPerOverGraphPoint runsPerOverGraphPoint2 = (RunsPerOverGraphPoint) obj;
                float floatValue2 = ((Number) this.y.getOrDefault(Integer.valueOf(i12), valueOf)).floatValue();
                float over2 = (runsPerOverGraphPoint2.getOver() * getGraphWidth()) + f4;
                float runs2 = f13 - (runsPerOverGraphPoint2.getRuns() * getGraphHeight());
                float f14 = f10 * floatValue2;
                canvas.drawCircle(over2, runs2, f14, paint4);
                paint4.setColor(i7);
                canvas.drawCircle(over2, runs2, f14, paint4);
                paint4.setColor(i8);
                canvas.drawCircle(over2, runs2, f11 * floatValue2, paint4);
                if (floatValue2 >= 0.99d) {
                    Integer wickets2 = runsPerOverGraphPoint2.getWickets();
                    if ((wickets2 != null ? wickets2.intValue() : 0) > 1) {
                        e(canvas, runsPerOverGraphPoint2, list);
                    }
                }
                i12 = i13;
            }
        }
        if (this.z) {
            if (!this.I || this.v >= this.t) {
                float min = (Math.min(this.t, this.v) * getGraphWidth()) + f4;
                Paint paint5 = this.o;
                float f15 = this.k;
                canvas.drawLine(min, f15, min, getHeight() - f4, paint5);
                paint4.setColor(this.a);
                canvas.drawCircle(min, f15, f10, paint4);
                paint4.setColor(i8);
                canvas.drawCircle(min, f15, f11, paint4);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }
}
