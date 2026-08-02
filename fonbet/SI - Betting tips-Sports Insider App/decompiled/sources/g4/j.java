package g4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.appcompat.widget.c1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends Drawable implements Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f9770a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f9771b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.g f9772c;

    /* renamed from: h, reason: collision with root package name */
    public Canvas f9777h;

    /* renamed from: i, reason: collision with root package name */
    public Bitmap f9778i;

    /* renamed from: l, reason: collision with root package name */
    public float f9780l;

    /* renamed from: m, reason: collision with root package name */
    public float f9781m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9782n;

    /* renamed from: o, reason: collision with root package name */
    public long f9783o;

    /* renamed from: p, reason: collision with root package name */
    public long f9784p;

    /* renamed from: r, reason: collision with root package name */
    public Picture f9785r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9787t;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f9773d = new Paint(3);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9774e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f9775f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final Rect f9776g = new Rect();
    public float j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f9779k = 1.0f;
    public int q = -1;

    /* renamed from: s, reason: collision with root package name */
    public k f9786s = k.f9788a;

    public j(Movie movie, Bitmap.Config config, r4.g gVar) {
        this.f9770a = movie;
        this.f9771b = config;
        this.f9772c = gVar;
        if (s6.a.o(config)) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.");
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.f9773d;
        Canvas canvas2 = this.f9777h;
        Bitmap bitmap = this.f9778i;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int save = canvas2.save();
        try {
            float f6 = this.j;
            canvas2.scale(f6, f6);
            this.f9770a.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.f9785r;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(save);
            int save2 = canvas.save();
            try {
                canvas.translate(this.f9780l, this.f9781m);
                float f10 = this.f9779k;
                canvas.scale(f10, f10);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(save2);
            }
        } catch (Throwable th2) {
            canvas2.restoreToCount(save);
            throw th2;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f9775f;
        if (Intrinsics.areEqual(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int width = rect.width();
        int height = rect.height();
        Movie movie = this.f9770a;
        int width2 = movie.width();
        int height2 = movie.height();
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        r4.g gVar = this.f9772c;
        double k6 = y4.a.k(width2, height2, width, height, gVar);
        if (!this.f9787t && k6 > 1.0d) {
            k6 = 1.0d;
        }
        float f6 = (float) k6;
        this.j = f6;
        int i5 = (int) (width2 * f6);
        int i10 = (int) (f6 * height2);
        Bitmap createBitmap = Bitmap.createBitmap(i5, i10, this.f9771b);
        Bitmap bitmap = this.f9778i;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f9778i = createBitmap;
        this.f9777h = new Canvas(createBitmap);
        if (this.f9787t) {
            this.f9779k = 1.0f;
            this.f9780l = 0.0f;
            this.f9781m = 0.0f;
            return;
        }
        float k9 = (float) y4.a.k(i5, i10, width, height, gVar);
        this.f9779k = k9;
        float f10 = width - (i5 * k9);
        float f11 = 2;
        this.f9780l = (f10 / f11) + rect.left;
        this.f9781m = ((height - (k9 * i10)) / f11) + rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z5;
        Movie movie = this.f9770a;
        int duration = movie.duration();
        if (duration == 0) {
            duration = 0;
            z5 = false;
        } else {
            if (this.f9782n) {
                this.f9784p = SystemClock.uptimeMillis();
            }
            int i5 = (int) (this.f9784p - this.f9783o);
            int i10 = i5 / duration;
            int i11 = this.q;
            z5 = i11 == -1 || i10 <= i11;
            if (z5) {
                duration = i5 - (i10 * duration);
            }
        }
        movie.setTime(duration);
        if (this.f9787t) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.f9776g;
            rect.set(0, 0, width, height);
            b(rect);
            int save = canvas.save();
            try {
                float f6 = 1 / this.j;
                canvas.scale(f6, f6);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.f9782n && z5) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9770a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9770a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f9773d.getAlpha() != 255) {
            return -3;
        }
        k kVar = this.f9786s;
        if (kVar != k.f9789b) {
            return (kVar == k.f9788a && this.f9770a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9782n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        if (i5 < 0 || i5 >= 256) {
            throw new IllegalArgumentException(c1.i(i5, "Invalid alpha: ").toString());
        }
        this.f9773d.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9773d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.f9782n) {
            return;
        }
        this.f9782n = true;
        this.f9783o = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f9774e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i5)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.f9782n) {
            this.f9782n = false;
            ArrayList arrayList = this.f9774e;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((androidx.vectordrawable.graphics.drawable.c) arrayList.get(i5)).onAnimationEnd(this);
            }
        }
    }
}
