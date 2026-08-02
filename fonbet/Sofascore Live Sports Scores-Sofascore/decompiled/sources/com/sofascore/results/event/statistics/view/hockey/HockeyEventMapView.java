package com.sofascore.results.event.statistics.view.hockey;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.model.TeamSelection;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.BaseHockeyShotmapItem;
import com.sofascore.model.newNetwork.HockeyShotmapItem;
import com.sofascore.results.R;
import defpackage.ao2;
import defpackage.hkg;
import defpackage.k13;
import defpackage.km5;
import defpackage.se7;
import defpackage.wd9;
import defpackage.wzb;
import defpackage.xd9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/sofascore/results/event/statistics/view/hockey/HockeyEventMapView;", "Landroid/view/View;", "wd9", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HockeyEventMapView extends View {
    public List A;
    public TeamSelection B;
    public wd9 C;
    public TeamSelection D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public final Drawable s;
    public final int t;
    public final int u;
    public final int v;
    public final Paint w;
    public final Paint x;
    public final Paint y;
    public final Paint z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HockeyEventMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Drawable drawable = null;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        this.a = ao2.v(404, context);
        this.b = ao2.v(328, context);
        this.c = ao2.v(15, context);
        this.d = ao2.v(12, context);
        this.e = ao2.v(8, context);
        this.f = ao2.w(context, 7.5f);
        this.g = ao2.v(7, context);
        this.h = ao2.v(6, context);
        this.i = ao2.w(context, 5.5f);
        this.j = ao2.v(4, context);
        this.k = ao2.w(context, 3.5f);
        this.l = ao2.v(3, context);
        this.m = ao2.w(context, 2.5f);
        this.n = ao2.v(2, context);
        float v = ao2.v(1, context);
        this.o = v;
        this.p = context.getDrawable(R.drawable.ice_rink_background);
        this.q = context.getDrawable(R.drawable.hockey_rink_full);
        this.r = context.getDrawable(R.drawable.ic_hockey_pbp_hit);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_sofascore_logomark);
        if (drawable2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.n_lv_5), PorterDuff.Mode.SRC_IN));
            drawable = drawable2;
        }
        this.s = drawable;
        this.t = context.getColor(R.color.home_primary);
        this.u = context.getColor(R.color.away_primary);
        int color = context.getColor(R.color.neutral_default);
        this.v = color;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        this.w = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(context.getColor(R.color.shotmap_shot_background));
        this.x = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setColor(color);
        this.y = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setColor(color);
        paint4.setStrokeWidth(v);
        this.z = paint4;
        this.A = km5.a;
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, float f, float f2, boolean z) {
        int i = z ? this.g : this.h;
        Integer valueOf = Integer.valueOf(wzb.b(f));
        Integer valueOf2 = Integer.valueOf(wzb.b(f2));
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        if (z) {
            canvas.drawCircle(intValue, intValue2, this.e, this.w);
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setTint(this.y.getColor());
        }
        if (drawable != null) {
            drawable.setBounds(intValue - i, intValue2 - i, intValue + i, intValue2 + i);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final void b(Canvas canvas, float f, float f2, boolean z) {
        canvas.save();
        canvas.rotate(45.0f, f, f2);
        float f3 = (z ? this.c : this.d) / 2.0f;
        float f4 = (z ? this.k : this.m) / 2.0f;
        Paint paint = this.y;
        canvas.drawRect(f - f3, f2 - f4, f + f3, f2 + f4, paint);
        canvas.drawRect(f - f4, f2 - f3, f + f4, f2 + f3, paint);
        canvas.restore();
    }

    public final Point2D c(Point2D point2D) {
        Rect bounds;
        Rect bounds2;
        int i = 0;
        Drawable drawable = this.q;
        int width = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? 0 : bounds2.width();
        if (drawable != null && (bounds = drawable.getBounds()) != null) {
            i = bounds.height();
        }
        float x = width * (point2D.getX() / 240.0f);
        float y = i * (point2D.getY() / 102.0f);
        int i2 = this.e;
        return new Point2D(i2 + x, i2 + y);
    }

    public final void d(List list, TeamSelection teamSelection) {
        list.getClass();
        this.B = teamSelection;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseHockeyShotmapItem baseHockeyShotmapItem = (BaseHockeyShotmapItem) it.next();
            Context context = getContext();
            context.getClass();
            BaseHockeyShotmapItem baseHockeyShotmapItem2 = !hkg.c0(context) ? baseHockeyShotmapItem : null;
            if (baseHockeyShotmapItem2 == null) {
                HockeyShotmapItem hockeyShotmapItem = new HockeyShotmapItem(baseHockeyShotmapItem.getId(), baseHockeyShotmapItem.getPoint().getX(), baseHockeyShotmapItem.getPoint().getY(), baseHockeyShotmapItem.getType(), baseHockeyShotmapItem.getPeriod());
                hockeyShotmapItem.mirror();
                baseHockeyShotmapItem2 = hockeyShotmapItem;
            }
            arrayList.add(new wd9(baseHockeyShotmapItem2, c(baseHockeyShotmapItem2.getPoint())));
        }
        this.A = CollectionsKt.H0(arrayList, new se7(15));
        invalidate();
    }

    public final void e(int i, Integer num) {
        Paint paint = this.z;
        paint.setColor(i);
        Paint paint2 = this.y;
        paint2.setColor(i);
        paint2.setAlpha(num != null ? num.intValue() : 255);
        paint.setAlpha(num != null ? num.intValue() : 255);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Paint paint;
        int i;
        Paint paint2;
        float f3;
        float f4;
        int i2;
        canvas.getClass();
        super.onDraw(canvas);
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.s;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = this.q;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
        TeamSelection teamSelection = this.B;
        int i3 = teamSelection == null ? -1 : xd9.a[teamSelection.ordinal()];
        int i4 = this.t;
        int i5 = this.u;
        int i6 = this.v;
        e(i3 != 1 ? i3 != 2 ? i6 : i5 : i4, Integer.valueOf(this.B != null ? 255 : wzb.a(153.0d)));
        List list = this.A;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            wd9 wd9Var = (wd9) obj;
            wd9 wd9Var2 = this.C;
            if (wd9Var2 != null) {
                if (wd9Var.a.getId() == wd9Var2.a.getId()) {
                }
            }
            arrayList.add(obj);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            f = this.j;
            f2 = this.n;
            paint = this.z;
            i = this.h;
            paint2 = this.y;
            f3 = this.l;
            f4 = this.o;
            if (!hasNext) {
                break;
            }
            wd9 wd9Var3 = (wd9) it.next();
            Point2D point2D = wd9Var3.b;
            int type = wd9Var3.a.getType();
            int i7 = i4;
            if (type == BaseHockeyShotmapItem.ShotmapItemType.SUSPENSION.getId()) {
                b(canvas, point2D.getX(), point2D.getY(), false);
            } else if (type == BaseHockeyShotmapItem.ShotmapItemType.HIT.getId()) {
                a(canvas, point2D.getX(), point2D.getY(), false);
            } else {
                i2 = i5;
                canvas.drawCircle(point2D.getX(), point2D.getY(), i, this.x);
                canvas.drawCircle(point2D.getX(), point2D.getY(), this.i, paint);
                if (type == BaseHockeyShotmapItem.ShotmapItemType.SAVED_SHOT.getId()) {
                    canvas.drawCircle(point2D.getX(), point2D.getY(), f2, paint2);
                } else if (type == BaseHockeyShotmapItem.ShotmapItemType.GOAL.getId()) {
                    canvas.drawCircle(point2D.getX(), point2D.getY(), f, paint2);
                } else if (type == BaseHockeyShotmapItem.ShotmapItemType.BLOCKED_SHOT.getId()) {
                    canvas.drawRect(point2D.getX() - f3, point2D.getY() - f4, point2D.getX() + f3, point2D.getY() + f4, paint2);
                }
                i4 = i7;
                i5 = i2;
            }
            i2 = i5;
            i4 = i7;
            i5 = i2;
        }
        int i8 = i4;
        int i9 = i5;
        wd9 wd9Var4 = this.C;
        if (wd9Var4 != null) {
            TeamSelection teamSelection2 = this.D;
            int i10 = teamSelection2 == null ? -1 : xd9.a[teamSelection2.ordinal()];
            if (i10 == 1) {
                i6 = i8;
            } else if (i10 == 2) {
                i6 = i9;
            }
            e(i6, null);
            Point2D point2D2 = wd9Var4.b;
            int type2 = wd9Var4.a.getType();
            int id = BaseHockeyShotmapItem.ShotmapItemType.FACEOFF.getId();
            Paint paint3 = this.w;
            int i11 = this.e;
            if (type2 == id) {
                float x = point2D2.getX();
                float y = point2D2.getY();
                paint2.setAlpha(wzb.b(38.25f));
                canvas.drawCircle(x, y, i11, paint2);
                paint2.setAlpha(255);
                canvas.drawCircle(x, y, f3, paint2);
                canvas.drawCircle(x, y, f2, paint3);
                return;
            }
            if (type2 == BaseHockeyShotmapItem.ShotmapItemType.SUSPENSION.getId()) {
                b(canvas, point2D2.getX(), point2D2.getY(), true);
                return;
            }
            if (type2 == BaseHockeyShotmapItem.ShotmapItemType.HIT.getId()) {
                a(canvas, point2D2.getX(), point2D2.getY(), true);
                return;
            }
            canvas.drawCircle(point2D2.getX(), point2D2.getY(), i11, paint3);
            canvas.drawCircle(point2D2.getX(), point2D2.getY(), this.f, paint);
            if (type2 == BaseHockeyShotmapItem.ShotmapItemType.SAVED_SHOT.getId()) {
                canvas.drawCircle(point2D2.getX(), point2D2.getY(), f3, paint2);
            } else if (type2 == BaseHockeyShotmapItem.ShotmapItemType.GOAL.getId()) {
                canvas.drawCircle(point2D2.getX(), point2D2.getY(), i, paint2);
            } else if (type2 == BaseHockeyShotmapItem.ShotmapItemType.BLOCKED_SHOT.getId()) {
                canvas.drawRect(point2D2.getX() - f, point2D2.getY() - f4, f + point2D2.getX(), point2D2.getY() + f4, paint2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int resolveSizeAndState = View.resolveSizeAndState(getSuggestedMinimumWidth(), i, 0);
        int i3 = this.d;
        int i4 = resolveSizeAndState - i3;
        int i5 = this.a;
        if (i4 > i5) {
            i4 = i5;
        }
        setMeasuredDimension(i4 + i3, wzb.b(i4 / 2.359f) + i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int b = wzb.b(this.d * (this.b / getWidth()));
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setBounds(width - b, height - b, width + b, height + b);
        }
        int i5 = this.e;
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            drawable2.setBounds(i5, i5, getWidth() - i5, getHeight() - i5);
        }
        Drawable drawable3 = this.p;
        if (drawable3 != null) {
            drawable3.setBounds(i5, i5, getWidth() - i5, getHeight() - i5);
        }
        for (wd9 wd9Var : this.A) {
            wd9Var.b = c(wd9Var.a.getPoint());
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HockeyEventMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
