package H4;

import H4.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.k;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final a f4757a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4758b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4759c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4760d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4761e;

    /* renamed from: f, reason: collision with root package name */
    public int f4762f;

    /* renamed from: g, reason: collision with root package name */
    public int f4763g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4764h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f4765i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f4766j;

    /* renamed from: k, reason: collision with root package name */
    public List f4767k;

    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final g f4768a;

        public a(g gVar) {
            this.f4768a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, n nVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.d(context), aVar, i10, i11, nVar, bitmap)));
    }

    @Override // H4.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f4762f++;
        }
        int i10 = this.f4763g;
        if (i10 == -1 || this.f4762f < i10) {
            return;
        }
        j();
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    public ByteBuffer c() {
        return this.f4757a.f4768a.b();
    }

    public final Rect d() {
        if (this.f4766j == null) {
            this.f4766j = new Rect();
        }
        return this.f4766j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4760d) {
            return;
        }
        if (this.f4764h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f4764h = false;
        }
        canvas.drawBitmap(this.f4757a.f4768a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f4757a.f4768a.e();
    }

    public int f() {
        return this.f4757a.f4768a.f();
    }

    public int g() {
        return this.f4757a.f4768a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4757a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4757a.f4768a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4757a.f4768a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public final Paint h() {
        if (this.f4765i == null) {
            this.f4765i = new Paint(2);
        }
        return this.f4765i;
    }

    public int i() {
        return this.f4757a.f4768a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4758b;
    }

    public final void j() {
        List list = this.f4767k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f4767k.get(i10)).b(this);
            }
        }
    }

    public void k() {
        this.f4760d = true;
        this.f4757a.f4768a.a();
    }

    public final void l() {
        this.f4762f = 0;
    }

    public void m(n nVar, Bitmap bitmap) {
        this.f4757a.f4768a.o(nVar, bitmap);
    }

    public final void n() {
        k.a(!this.f4760d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f4757a.f4768a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f4758b) {
                return;
            }
            this.f4758b = true;
            this.f4757a.f4768a.r(this);
            invalidateSelf();
        }
    }

    public final void o() {
        this.f4758b = false;
        this.f4757a.f4768a.s(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4764h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.a(!this.f4760d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f4761e = z10;
        if (!z10) {
            o();
        } else if (this.f4759c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f4759c = true;
        l();
        if (this.f4761e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f4759c = false;
        o();
    }

    public c(a aVar) {
        this.f4761e = true;
        this.f4763g = -1;
        this.f4757a = (a) k.d(aVar);
    }
}
