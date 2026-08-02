package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xx8 extends Drawable implements Animatable {
    public final i70 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int f;
    public boolean h;
    public Paint i;
    public Rect j;
    public boolean e = true;
    public final int g = -1;

    public xx8(i70 i70Var) {
        this.a = i70Var;
    }

    public final void a() {
        w1a.k("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        dy8 dy8Var = (dy8) this.a.b;
        if (dy8Var.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.b) {
            return;
        }
        this.b = true;
        ArrayList arrayList = dy8Var.c;
        if (dy8Var.k) {
            a70.r("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            a70.r("Cannot subscribe twice in a row");
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !dy8Var.f) {
            dy8Var.f = true;
            dy8Var.k = false;
            dy8Var.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            Rect rect = this.j;
            if (rect == null) {
                rect = new Rect();
                this.j = rect;
            }
            Gravity.apply(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, intrinsicWidth, intrinsicHeight, bounds, rect);
            this.h = false;
        }
        dy8 dy8Var = (dy8) this.a.b;
        by8 by8Var = dy8Var.j;
        Bitmap bitmap = by8Var != null ? by8Var.e : dy8Var.m;
        Rect rect2 = this.j;
        if (rect2 == null) {
            rect2 = new Rect();
            this.j = rect2;
        }
        Paint paint = this.i;
        if (paint == null) {
            paint = new Paint(2);
            this.i = paint;
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((dy8) this.a.b).q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((dy8) this.a.b).p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.i;
        if (paint == null) {
            paint = new Paint(2);
            this.i = paint;
        }
        paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.i;
        if (paint == null) {
            paint = new Paint(2);
            this.i = paint;
        }
        paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        w1a.k("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.e = z;
        if (!z) {
            this.b = false;
            dy8 dy8Var = (dy8) this.a.b;
            ArrayList arrayList = dy8Var.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                dy8Var.f = false;
            }
        } else if (this.c) {
            a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.b = false;
        dy8 dy8Var = (dy8) this.a.b;
        ArrayList arrayList = dy8Var.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            dy8Var.f = false;
        }
    }
}
