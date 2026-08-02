package com.sofascore.results.event.statistics.view.football;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.b6a;
import defpackage.bl8;
import defpackage.cl8;
import defpackage.dl8;
import defpackage.el8;
import defpackage.fl8;
import defpackage.i5k;
import defpackage.j6;
import defpackage.k13;
import defpackage.km5;
import defpackage.n6;
import defpackage.uj8;
import defpackage.v9g;
import defpackage.vk8;
import defpackage.yx7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0004 !\"#R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/sofascore/results/event/statistics/view/football/FootballShotmapView;", "Landroid/view/View;", "Lkotlin/Function1;", "Lcom/sofascore/model/newNetwork/FootballShotmapItem;", "", PlayerKt.AMERICAN_FOOTBALL_KICKER, "Lkotlin/jvm/functions/Function1;", "getOnShotSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnShotSelectedCallback", "(Lkotlin/jvm/functions/Function1;)V", "onShotSelectedCallback", "Lkotlin/Function0;", "L", "Lkotlin/jvm/functions/Function0;", "getOnNoShotFoundCallback", "()Lkotlin/jvm/functions/Function0;", "setOnNoShotFoundCallback", "(Lkotlin/jvm/functions/Function0;)V", "onNoShotFoundCallback", PlayerKt.FOOTBALL_MIDFIELDER, "getAnalyticsCallback", "setAnalyticsCallback", "analyticsCallback", "", "N", "Z", "getSelectionAllowed", "()Z", "setSelectionAllowed", "(Z)V", "selectionAllowed", "dl8", "cl8", "el8", "bl8", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FootballShotmapView extends View {
    public static final /* synthetic */ int O = 0;
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public List D;
    public final ArrayList E;
    public dl8 F;
    public cl8 G;
    public el8 H;
    public bl8 I;
    public boolean J;

    /* renamed from: K, reason: from kotlin metadata */
    public Function1 onShotSelectedCallback;

    /* renamed from: L, reason: from kotlin metadata */
    public Function0 onNoShotFoundCallback;

    /* renamed from: M, reason: from kotlin metadata */
    public Function0 analyticsCallback;

    /* renamed from: N, reason: from kotlin metadata */
    public boolean selectionAllowed;
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public int h;
    public int i;
    public float j;
    public final Drawable k;
    public final Drawable l;
    public final Drawable m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public int s;
    public int t;
    public int u;
    public final Rect v;
    public boolean w;
    public final Paint x;
    public final Paint y;
    public final Paint z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FootballShotmapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        int v = ao2.v(16, context);
        this.a = v;
        this.b = ao2.w(context, 11.5f);
        float v2 = ao2.v(10, context);
        this.c = v2;
        this.d = ao2.v(8, context);
        this.e = ao2.w(context, 7.5f);
        this.f = ao2.v(6, context);
        float v3 = ao2.v(2, context);
        this.g = v3;
        float w = ao2.w(context, 1.5f);
        float v4 = ao2.v(1, context);
        this.h = v;
        this.i = v;
        this.j = v2;
        this.k = context.getDrawable(R.drawable.ic_ball_football_16_no_padding);
        this.l = context.getDrawable(R.drawable.football_shotmap_terrain_pattern);
        this.m = context.getDrawable(R.drawable.football_shotmap_lines);
        this.n = context.getColor(R.color.error);
        int color = context.getColor(R.color.home_primary);
        this.o = color;
        int color2 = context.getColor(R.color.home_variant);
        this.p = color2;
        this.q = context.getColor(R.color.away_primary);
        this.r = context.getColor(R.color.away_variant);
        this.s = color;
        this.t = color2;
        this.u = color;
        this.v = new Rect();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(context.getColor(R.color.on_color_secondary));
        this.x = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setColor(this.s);
        paint2.setStrokeWidth(v4);
        this.y = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setColor(this.s);
        this.z = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setColor(context.getColor(R.color.n_lv_1));
        paint4.setStrokeWidth(w);
        this.A = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style);
        paint5.setColor(context.getColor(R.color.n_lv_1));
        paint5.setStrokeWidth(w);
        paint5.setPathEffect(new DashPathEffect(new float[]{v3, v3}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.B = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style);
        paint6.setColor(context.getColor(R.color.n_lv_1));
        paint6.setStrokeWidth(v3);
        this.C = paint6;
        this.D = km5.a;
        this.E = new ArrayList();
        this.selectionAllowed = true;
        setWillNotDraw(false);
    }

    public static ValueAnimator f(FootballShotmapView footballShotmapView, float f, float f2, Function1 function1) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new n6(function1, ofFloat, footballShotmapView, 1));
        return ofFloat;
    }

    public static AnimatorSet j(FootballShotmapView footballShotmapView, Point2D point2D, Point2D point2D2, Function1 function1, Function1 function12, Function0 function0, int i) {
        long j = (i & 16) != 0 ? 300L : 100L;
        if ((i & 32) != 0) {
            function0 = null;
        }
        ValueAnimator f = f(footballShotmapView, point2D.getX(), point2D2.getX(), new uj8(1, function1));
        ValueAnimator f2 = f(footballShotmapView, point2D.getY(), point2D2.getY(), new uj8(2, function12));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(f, f2);
        animatorSet.setDuration(j);
        animatorSet.addListener(new j6(function0, 3));
        animatorSet.start();
        return animatorSet;
    }

    public final void a() {
        Point2D shotEndPoint;
        dl8 dl8Var = this.F;
        if (dl8Var == null || (shotEndPoint = dl8Var.a.getShotEndPoint()) == null) {
            return;
        }
        Point2D g = g(shotEndPoint);
        Point2D point2D = dl8Var.b;
        if (this.H == null) {
            g = b6a.w(point2D, g, this.b);
        }
        Point2D point2D2 = g;
        Pair e = e(point2D2, dl8Var.b);
        Point2D point2D3 = (Point2D) e.a;
        Point2D point2D4 = (Point2D) e.b;
        final bl8 bl8Var = new bl8(point2D2, point2D3, point2D4);
        final int i = 3;
        Function1 function1 = new Function1() { // from class: yk8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                bl8 bl8Var2 = bl8Var;
                float floatValue = ((Float) obj).floatValue();
                switch (i2) {
                    case 0:
                        int i3 = FootballShotmapView.O;
                        bl8Var2.d.setY(floatValue);
                        break;
                    case 1:
                        int i4 = FootballShotmapView.O;
                        bl8Var2.e.setX(floatValue);
                        break;
                    case 2:
                        int i5 = FootballShotmapView.O;
                        bl8Var2.e.setY(floatValue);
                        break;
                    default:
                        int i6 = FootballShotmapView.O;
                        bl8Var2.d.setX(floatValue);
                        break;
                }
                return Unit.a;
            }
        };
        final int i2 = 0;
        Function1 function12 = new Function1() { // from class: yk8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                bl8 bl8Var2 = bl8Var;
                float floatValue = ((Float) obj).floatValue();
                switch (i22) {
                    case 0:
                        int i3 = FootballShotmapView.O;
                        bl8Var2.d.setY(floatValue);
                        break;
                    case 1:
                        int i4 = FootballShotmapView.O;
                        bl8Var2.e.setX(floatValue);
                        break;
                    case 2:
                        int i5 = FootballShotmapView.O;
                        bl8Var2.e.setY(floatValue);
                        break;
                    default:
                        int i6 = FootballShotmapView.O;
                        bl8Var2.d.setX(floatValue);
                        break;
                }
                return Unit.a;
            }
        };
        final int i3 = 1;
        Function1 function13 = new Function1() { // from class: yk8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i3;
                bl8 bl8Var2 = bl8Var;
                float floatValue = ((Float) obj).floatValue();
                switch (i22) {
                    case 0:
                        int i32 = FootballShotmapView.O;
                        bl8Var2.d.setY(floatValue);
                        break;
                    case 1:
                        int i4 = FootballShotmapView.O;
                        bl8Var2.e.setX(floatValue);
                        break;
                    case 2:
                        int i5 = FootballShotmapView.O;
                        bl8Var2.e.setY(floatValue);
                        break;
                    default:
                        int i6 = FootballShotmapView.O;
                        bl8Var2.d.setX(floatValue);
                        break;
                }
                return Unit.a;
            }
        };
        final int i4 = 2;
        Function1 function14 = new Function1() { // from class: yk8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i4;
                bl8 bl8Var2 = bl8Var;
                float floatValue = ((Float) obj).floatValue();
                switch (i22) {
                    case 0:
                        int i32 = FootballShotmapView.O;
                        bl8Var2.d.setY(floatValue);
                        break;
                    case 1:
                        int i42 = FootballShotmapView.O;
                        bl8Var2.e.setX(floatValue);
                        break;
                    case 2:
                        int i5 = FootballShotmapView.O;
                        bl8Var2.e.setY(floatValue);
                        break;
                    default:
                        int i6 = FootballShotmapView.O;
                        bl8Var2.d.setX(floatValue);
                        break;
                }
                return Unit.a;
            }
        };
        AnimatorSet j = j(this, point2D2, point2D3, function1, function12, null, 32);
        AnimatorSet j2 = j(this, point2D2, point2D4, function13, function14, null, 32);
        ArrayList arrayList = this.E;
        arrayList.add(j);
        arrayList.add(j2);
        this.I = bl8Var;
    }

    public final void b() {
        fl8 fl8Var;
        dl8 dl8Var = this.F;
        if (dl8Var == null) {
            return;
        }
        FootballShotmapItem footballShotmapItem = dl8Var.a;
        Point2D point2D = dl8Var.b;
        Point2D shotEndPoint = footballShotmapItem.getShotEndPoint();
        if (shotEndPoint != null) {
            Point2D g = g(shotEndPoint);
            Point2D w = b6a.w(point2D, g, this.c);
            boolean isBlocked = footballShotmapItem.isBlocked();
            if (b6a.l(point2D, g) <= this.b) {
                if (isBlocked) {
                    a();
                    return;
                }
                return;
            }
            final el8 el8Var = new el8(w, g);
            final int i = 0;
            Function1 function1 = new Function1() { // from class: al8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    el8 el8Var2 = el8Var;
                    float floatValue = ((Float) obj).floatValue();
                    switch (i2) {
                        case 0:
                            int i3 = FootballShotmapView.O;
                            el8Var2.c.setX(floatValue);
                            break;
                        default:
                            int i4 = FootballShotmapView.O;
                            el8Var2.c.setY(floatValue);
                            break;
                    }
                    return Unit.a;
                }
            };
            final int i2 = 1;
            Function1 function12 = new Function1() { // from class: al8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i22 = i2;
                    el8 el8Var2 = el8Var;
                    float floatValue = ((Float) obj).floatValue();
                    switch (i22) {
                        case 0:
                            int i3 = FootballShotmapView.O;
                            el8Var2.c.setX(floatValue);
                            break;
                        default:
                            int i4 = FootballShotmapView.O;
                            el8Var2.c.setY(floatValue);
                            break;
                    }
                    return Unit.a;
                }
            };
            if (isBlocked) {
                fl8Var = new fl8(0, this, FootballShotmapView.class, "animateBlockLine", "animateBlockLine()V", 0, 1);
            } else {
                fl8Var = null;
            }
            this.E.add(j(this, w, g, function1, function12, fl8Var, 16));
            this.H = el8Var;
        }
    }

    public final void c(FootballShotmapItem footballShotmapItem) {
        final int i;
        final int i2;
        final cl8 cl8Var;
        footballShotmapItem.getClass();
        if (isEnabled()) {
            Function1 function1 = this.onShotSelectedCallback;
            if (function1 != null) {
                function1.invoke(footballShotmapItem);
            }
            int id = footballShotmapItem.getId();
            Iterator it = this.D.iterator();
            while (true) {
                i = 0;
                i2 = 1;
                if (!it.hasNext()) {
                    break;
                }
                dl8 dl8Var = (dl8) it.next();
                boolean z = dl8Var.c;
                if (dl8Var.a.getId() == id) {
                    dl8Var.c = true;
                    this.F = dl8Var;
                    i = 1;
                } else {
                    dl8Var.c = false;
                }
                if (i != z) {
                    f(this, dl8Var.d, i != 0 ? 255 : 153, new yx7(new yx7(dl8Var, 12), 13)).start();
                }
            }
            this.H = null;
            this.I = null;
            ArrayList arrayList = this.E;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AnimatorSet animatorSet = (AnimatorSet) it2.next();
                animatorSet.removeAllListeners();
                animatorSet.cancel();
            }
            Unit unit = Unit.a;
            arrayList.clear();
            dl8 dl8Var2 = this.F;
            if (dl8Var2 == null || (cl8Var = this.G) == null) {
                return;
            }
            Point2D point2D = cl8Var.b;
            Point2D point2D2 = dl8Var2.b;
            if (point2D.equals(point2D2)) {
                b();
            } else {
                arrayList.add(j(this, point2D, point2D2, new Function1() { // from class: zk8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = i;
                        cl8 cl8Var2 = cl8Var;
                        float floatValue = ((Float) obj).floatValue();
                        switch (i3) {
                            case 0:
                                int i4 = FootballShotmapView.O;
                                cl8Var2.b.setX(floatValue);
                                break;
                            default:
                                int i5 = FootballShotmapView.O;
                                cl8Var2.b.setY(floatValue);
                                break;
                        }
                        return Unit.a;
                    }
                }, new Function1() { // from class: zk8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        cl8 cl8Var2 = cl8Var;
                        float floatValue = ((Float) obj).floatValue();
                        switch (i3) {
                            case 0:
                                int i4 = FootballShotmapView.O;
                                cl8Var2.b.setX(floatValue);
                                break;
                            default:
                                int i5 = FootballShotmapView.O;
                                cl8Var2.b.setY(floatValue);
                                break;
                        }
                        return Unit.a;
                    }
                }, new fl8(0, this, FootballShotmapView.class, "animateShotTrajectory", "animateShotTrajectory()V", 0, 0), 16));
            }
        }
    }

    public final void d(Canvas canvas, Point2D point2D, boolean z) {
        canvas.drawCircle(point2D.getX(), point2D.getY(), this.d, this.x);
        canvas.drawCircle(point2D.getX(), point2D.getY(), this.e, this.y);
        if (z) {
            canvas.drawCircle(point2D.getX(), point2D.getY(), this.g, this.z);
        }
    }

    public final Pair e(Point2D point2D, Point2D point2D2) {
        Pair r = b6a.r(point2D, point2D2);
        double doubleValue = ((Number) r.a).doubleValue();
        Double valueOf = Double.valueOf(((Number) r.b).doubleValue());
        Double valueOf2 = Double.valueOf(-doubleValue);
        double doubleValue2 = valueOf.doubleValue();
        double doubleValue3 = valueOf2.doubleValue();
        double x = point2D.getX();
        double d = this.f;
        double d2 = doubleValue2 * d;
        double d3 = doubleValue3 * d;
        return new Pair(new Point2D(x + d2, point2D.getY() + d3), new Point2D(point2D.getX() - d2, point2D.getY() - d3));
    }

    public final Point2D g(Point2D point2D) {
        Rect bounds;
        Rect bounds2;
        int i = 0;
        Drawable drawable = this.m;
        int width = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? 0 : bounds2.width();
        if (drawable != null && (bounds = drawable.getBounds()) != null) {
            i = bounds.height();
        }
        float x = ((point2D.getX() / 100.0f) * width) + this.i;
        float y = point2D.getY();
        if (y > 50.0f) {
            y = 50.0f;
        }
        float f = i;
        float f2 = ((y / 50.0f) * f) + this.i;
        float f3 = f - this.j;
        if (f2 > f3) {
            f2 = f3;
        }
        return new Point2D(x, f2);
    }

    @Nullable
    public final Function0<Unit> getAnalyticsCallback() {
        return this.analyticsCallback;
    }

    @Nullable
    public final Function0<Unit> getOnNoShotFoundCallback() {
        return this.onNoShotFoundCallback;
    }

    @Nullable
    public final Function1<FootballShotmapItem, Unit> getOnShotSelectedCallback() {
        return this.onShotSelectedCallback;
    }

    public final boolean getSelectionAllowed() {
        return this.selectionAllowed;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(List list, vk8 vk8Var, boolean z, boolean z2, boolean z3) {
        dl8 dl8Var;
        boolean z4;
        dl8 dl8Var2;
        list.getClass();
        vk8Var.getClass();
        this.J = z3;
        setEnabled(z2);
        boolean z5 = this.F == null;
        Object obj = null;
        this.I = null;
        this.H = null;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            int i = 255;
            if (!it.hasNext()) {
                break;
            }
            FootballShotmapItem footballShotmapItem = (FootballShotmapItem) it.next();
            if (!z5 && (dl8Var2 = this.F) != null) {
                if (footballShotmapItem.getId() == dl8Var2.a.getId()) {
                    z4 = true;
                    Point2D g = g(footballShotmapItem.getShotOriginPoint());
                    if (z4) {
                        i = 153;
                    } else {
                        dl8 dl8Var3 = this.F;
                        if (dl8Var3 != null) {
                            i = dl8Var3.d;
                        }
                    }
                    arrayList.add(new dl8(footballShotmapItem, g, z4, i));
                }
            }
            z4 = false;
            Point2D g2 = g(footballShotmapItem.getShotOriginPoint());
            if (z4) {
            }
            arrayList.add(new dl8(footballShotmapItem, g2, z4, i));
        }
        this.D = arrayList;
        if (!z || z5) {
            if (z5) {
                dl8Var = (dl8) CollectionsKt.h0(arrayList);
                if (isEnabled()) {
                    dl8Var.c = true;
                    dl8Var.d = 255;
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((dl8) next).c) {
                        obj = next;
                        break;
                    }
                }
                dl8Var = (dl8) obj;
                if (dl8Var == null) {
                    dl8Var = (dl8) CollectionsKt.Y(this.D);
                }
            }
            this.F = dl8Var;
            ArrayList arrayList2 = this.E;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (((AnimatorSet) it3.next()).isRunning()) {
                        break;
                    }
                }
            }
            k();
            dl8 dl8Var4 = this.F;
            if (dl8Var4 != null) {
                FootballShotmapItem footballShotmapItem2 = dl8Var4.a;
                Function1 function1 = this.onShotSelectedCallback;
                if (function1 != null) {
                    function1.invoke(footballShotmapItem2);
                }
            }
        } else {
            c(((dl8) CollectionsKt.h0(arrayList)).a);
        }
        vk8 vk8Var2 = vk8.a;
        this.s = vk8Var == vk8Var2 ? this.o : this.q;
        this.t = vk8Var == vk8Var2 ? this.p : this.r;
        invalidate();
    }

    public final void k() {
        dl8 dl8Var = this.F;
        if (dl8Var == null) {
            return;
        }
        FootballShotmapItem footballShotmapItem = dl8Var.a;
        this.G = new cl8(dl8Var.b);
        Point2D point2D = dl8Var.b;
        Point2D shotEndPoint = footballShotmapItem.getShotEndPoint();
        if (shotEndPoint != null) {
            Point2D g = g(shotEndPoint);
            Point2D w = b6a.w(point2D, g, this.c);
            double l = b6a.l(point2D, g);
            float f = this.b;
            this.H = l > ((double) f) ? new el8(w, g) : null;
            if (footballShotmapItem.isBlocked()) {
                if (this.H == null) {
                    g = b6a.w(point2D, g, f);
                }
                Pair e = e(g, dl8Var.b);
                this.I = new bl8(g, (Point2D) e.a, (Point2D) e.b);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Drawable drawable;
        canvas.getClass();
        super.onDraw(canvas);
        if (!this.w && (drawable = this.l) != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ArrayList U0 = CollectionsKt.U0(this.D);
        i5k.a(U0).remove(this.F);
        dl8 dl8Var = this.F;
        if (dl8Var != null) {
            U0.add(dl8Var);
        }
        if (this.J) {
            ArrayList arrayList = new ArrayList();
            Iterator it = U0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.c(((dl8) next).a.getShotType(), "goal")) {
                    arrayList.add(next);
                }
            }
            U0.removeAll(arrayList);
            U0.addAll(arrayList);
        }
        Iterator it2 = U0.iterator();
        while (it2.hasNext()) {
            dl8 dl8Var2 = (dl8) it2.next();
            boolean z = dl8Var2.c;
            FootballShotmapItem footballShotmapItem = dl8Var2.a;
            boolean isOwnGoal = footballShotmapItem.isOwnGoal();
            int i = dl8Var2.d;
            int i2 = z ? this.s : this.t;
            this.u = isOwnGoal ? this.n : i2;
            Paint paint = this.x;
            paint.setAlpha(i);
            this.y.setColor(i2);
            this.z.setColor(i2);
            String shotType = footballShotmapItem.getShotType();
            if (Intrinsics.c(shotType, "goal")) {
                Point2D point2D = dl8Var2.b;
                canvas.drawCircle(point2D.getX(), point2D.getY(), this.d, paint);
                Drawable drawable3 = this.k;
                if (drawable3 != null) {
                    int i3 = this.a;
                    Rect rect = this.v;
                    b6a.D(point2D, rect, i3);
                    drawable3.setBounds(rect);
                    v9g.K(drawable3, this.u);
                    drawable3.draw(canvas);
                }
            } else {
                boolean c = Intrinsics.c(shotType, FootballShotmapItem.SHOT_TYPE_SAVE);
                Point2D point2D2 = dl8Var2.b;
                if (c) {
                    d(canvas, point2D2, true);
                } else {
                    d(canvas, point2D2, false);
                }
            }
        }
        if (isEnabled()) {
            cl8 cl8Var = this.G;
            if (cl8Var != null) {
                if (!this.selectionAllowed) {
                    cl8Var = null;
                }
                if (cl8Var != null) {
                    Point2D point2D3 = cl8Var.b;
                    canvas.drawCircle(point2D3.getX(), point2D3.getY(), this.c, this.A);
                }
            }
            el8 el8Var = this.H;
            if (el8Var != null) {
                Point2D point2D4 = el8Var.a;
                Point2D point2D5 = el8Var.c;
                canvas.drawLine(point2D4.getX(), point2D4.getY(), point2D5.getX(), point2D5.getY(), this.B);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            bl8 bl8Var = this.I;
            if (bl8Var != null) {
                Point2D point2D6 = bl8Var.a;
                Point2D point2D7 = bl8Var.d;
                float x = point2D6.getX();
                float y = point2D6.getY();
                float x2 = point2D7.getX();
                float y2 = point2D7.getY();
                Paint paint2 = this.C;
                canvas2.drawLine(x, y, x2, y2, paint2);
                Point2D point2D8 = bl8Var.e;
                canvas2.drawLine(point2D6.getX(), point2D6.getY(), point2D8.getX(), point2D8.getY(), paint2);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = this.i;
        Rect rect = new Rect(i5, i5, getWidth() - this.i, getHeight() - this.h);
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
        for (dl8 dl8Var : this.D) {
            dl8Var.b = g(dl8Var.a.getShotOriginPoint());
        }
        k();
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.selectionAllowed) {
            if (motionEvent != null && motionEvent.getActionMasked() == 1) {
                Point2D point2D = new Point2D(motionEvent.getX(), motionEvent.getY());
                List list = this.D;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    dl8 dl8Var = (dl8) obj;
                    dl8 dl8Var2 = this.F;
                    if (dl8Var2 != null) {
                        if (dl8Var.a.getId() == dl8Var2.a.getId()) {
                        }
                    }
                    arrayList.add(obj);
                }
                Iterator it = arrayList.iterator();
                double d = Double.MAX_VALUE;
                dl8 dl8Var3 = null;
                while (it.hasNext()) {
                    dl8 dl8Var4 = (dl8) it.next();
                    double l = b6a.l(point2D, dl8Var4.b);
                    if (l < d && l < this.a) {
                        dl8Var3 = dl8Var4;
                        d = l;
                    }
                }
                if (dl8Var3 == null) {
                    Function0 function0 = this.onNoShotFoundCallback;
                    if (function0 != null) {
                        function0.invoke();
                        return false;
                    }
                } else {
                    Function0 function02 = this.analyticsCallback;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    c(dl8Var3.a);
                    super.performClick();
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void setAnalyticsCallback(@Nullable Function0<Unit> function0) {
        this.analyticsCallback = function0;
    }

    public final void setOnNoShotFoundCallback(@Nullable Function0<Unit> function0) {
        this.onNoShotFoundCallback = function0;
    }

    public final void setOnShotSelectedCallback(@Nullable Function1<? super FootballShotmapItem, Unit> function1) {
        this.onShotSelectedCallback = function1;
    }

    public final void setSelectionAllowed(boolean z) {
        this.selectionAllowed = z;
    }
}
