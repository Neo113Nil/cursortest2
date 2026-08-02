package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class y31 extends View {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public int j;
    public final Drawable k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public List o;
    public x31 p;
    public final Rect q;

    public y31(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = ao2.v(16, context);
        this.b = ao2.v(8, context);
        this.c = ao2.w(context, 7.5f);
        this.d = ao2.v(2, context);
        float v = ao2.v(1, context);
        this.e = v;
        this.f = ao2.v(4, context);
        this.g = context.getColor(R.color.error);
        int color = context.getColor(R.color.home_primary);
        this.h = color;
        this.i = context.getColor(R.color.away_primary);
        this.j = color;
        this.k = context.getDrawable(R.drawable.ic_ball_football_16_no_padding);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(context.getColor(R.color.on_color_secondary));
        paint.setAlpha(255);
        this.l = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(v);
        this.m = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.n = paint3;
        this.q = new Rect();
        setWillNotDraw(false);
    }

    public abstract void a(Canvas canvas);

    public void b(Canvas canvas, Point2D point2D, int i) {
        canvas.getClass();
        point2D.getClass();
        canvas.drawCircle(point2D.getX(), point2D.getY(), this.b, this.l);
        int i2 = this.a;
        Rect rect = this.q;
        b6a.D(point2D, rect, i2);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void c(Canvas canvas, Point2D point2D, boolean z, int i) {
        canvas.getClass();
        point2D.getClass();
        canvas.drawCircle(point2D.getX(), point2D.getY(), this.b, this.l);
        canvas.drawCircle(point2D.getX(), point2D.getY(), this.c, this.m);
        if (z) {
            canvas.drawCircle(point2D.getX(), point2D.getY(), this.d, this.n);
        }
    }

    public final void d(Canvas canvas, x31 x31Var) {
        boolean z = x31Var.c;
        int i = x31Var.a;
        v9g.K(this.k, z ? this.g : this.j);
        this.m.setColor(this.j);
        this.n.setColor(this.j);
        String str = x31Var.b;
        if (Intrinsics.c(str, "goal")) {
            b(canvas, x31Var.e, i);
            return;
        }
        boolean c = Intrinsics.c(str, FootballShotmapItem.SHOT_TYPE_SAVE);
        Point2D point2D = x31Var.e;
        if (c) {
            c(canvas, point2D, true, i);
        } else {
            c(canvas, point2D, false, i);
        }
    }

    public abstract void e(x31 x31Var);

    public final void f(List list, vk8 vk8Var) {
        Boolean bool;
        vk8Var.getClass();
        this.o = list;
        this.j = vk8Var == vk8.a ? this.h : this.i;
        x31 x31Var = null;
        boolean z = true;
        if (yid.m(list != null ? Integer.valueOf(list.size()) : null) > 1) {
            if (list != null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        x31 x31Var2 = (x31) it.next();
                        x31 x31Var3 = this.p;
                        if (x31Var3 != null && x31Var2.a == x31Var3.a) {
                            break;
                        }
                    }
                }
                z = false;
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            if (Intrinsics.c(bool, Boolean.TRUE)) {
                x31Var = this.p;
            } else if (list != null) {
                x31Var = (x31) CollectionsKt.j0(list);
            }
        } else if (list != null) {
            x31Var = (x31) CollectionsKt.firstOrNull(list);
        }
        this.p = x31Var;
        if (getWidth() > 0 && getHeight() > 0 && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                e((x31) it2.next());
            }
        }
        invalidate();
    }

    public abstract void g(int i, int i2);

    @Nullable
    public final List<x31> getAllShots() {
        return this.o;
    }

    public final int getAwaySelectedColor() {
        return this.i;
    }

    @Nullable
    public final Drawable getBallIcon() {
        return this.k;
    }

    @NotNull
    public final Rect getBallIconRect() {
        return this.q;
    }

    public final int getColorError() {
        return this.g;
    }

    public final float getDpToPx1() {
        return this.e;
    }

    public final int getDpToPx16() {
        return this.a;
    }

    public final float getDpToPx2() {
        return this.d;
    }

    public final float getDpToPx8() {
        return this.b;
    }

    public final float getFieldPadding() {
        return this.f;
    }

    public final int getHomeSelectedColor() {
        return this.h;
    }

    public final int getSelectedColor() {
        return this.j;
    }

    @Nullable
    public final x31 getSelectedShot() {
        return this.p;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        a(canvas);
        List<x31> list = this.o;
        if (list != null) {
            for (x31 x31Var : list) {
                x31 x31Var2 = this.p;
                if (x31Var2 == null || x31Var.a != x31Var2.a) {
                    d(canvas, x31Var);
                }
            }
        }
        x31 x31Var3 = this.p;
        if (x31Var3 != null) {
            d(canvas, x31Var3);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        g(i, i2);
        List list = this.o;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e((x31) it.next());
            }
        }
    }

    public final void setAllShots(@Nullable List<x31> list) {
        this.o = list;
    }

    public final void setSelectedColor(int i) {
        this.j = i;
    }

    public final void setSelectedShot(@Nullable x31 x31Var) {
        this.p = x31Var;
    }
}
