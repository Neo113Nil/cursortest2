package g6;

import T5.m;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import g6.g;
import java.nio.ByteBuffer;
import p6.k;

/* loaded from: classes.dex */
public final class c extends Drawable implements g.b, Animatable {

    /* renamed from: a, reason: collision with root package name */
    private final a f63886a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f63887b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f63888c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f63889d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f63890e;

    /* renamed from: f, reason: collision with root package name */
    private int f63891f;

    /* renamed from: g, reason: collision with root package name */
    private int f63892g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f63893h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f63894i;

    /* renamed from: j, reason: collision with root package name */
    private Rect f63895j;

    /* loaded from: classes8.dex */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        final g f63896a;

        a(g gVar) {
            this.f63896a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    c(a aVar) {
        this.f63890e = true;
        this.f63892g = -1;
        this.f63886a = aVar;
    }

    private void g() {
        k.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f63889d);
        a aVar = this.f63886a;
        if (aVar.f63896a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f63887b) {
                return;
            }
            this.f63887b = true;
            aVar.f63896a.m(this);
            invalidateSelf();
        }
    }

    @Override // g6.g.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (this.f63886a.f63896a.d() == r0.f63896a.f() - 1) {
            this.f63891f++;
        }
        int i11 = this.f63892g;
        if (i11 == -1 || this.f63891f < i11) {
            return;
        }
        stop();
    }

    public final ByteBuffer b() {
        return this.f63886a.f63896a.b();
    }

    public final Bitmap c() {
        return this.f63886a.f63896a.e();
    }

    public final int d() {
        return this.f63886a.f63896a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.f63889d) {
            return;
        }
        if (this.f63893h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f63895j == null) {
                this.f63895j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f63895j);
            this.f63893h = false;
        }
        Bitmap c11 = this.f63886a.f63896a.c();
        if (this.f63895j == null) {
            this.f63895j = new Rect();
        }
        Rect rect = this.f63895j;
        if (this.f63894i == null) {
            this.f63894i = new Paint(2);
        }
        canvas.drawBitmap(c11, (Rect) null, rect, this.f63894i);
    }

    public final void e() {
        this.f63889d = true;
        this.f63886a.f63896a.a();
    }

    public final void f(m<Bitmap> mVar, Bitmap bitmap) {
        this.f63886a.f63896a.l(mVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f63886a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f63886a.f63896a.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f63886a.f63896a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f63887b;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f63893h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        if (this.f63894i == null) {
            this.f63894i = new Paint(2);
        }
        this.f63894i.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f63894i == null) {
            this.f63894i = new Paint(2);
        }
        this.f63894i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        k.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f63889d);
        this.f63890e = z11;
        if (!z11) {
            this.f63887b = false;
            this.f63886a.f63896a.n(this);
        } else if (this.f63888c) {
            g();
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f63888c = true;
        this.f63891f = 0;
        if (this.f63890e) {
            g();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f63888c = false;
        this.f63887b = false;
        this.f63886a.f63896a.n(this);
    }
}
