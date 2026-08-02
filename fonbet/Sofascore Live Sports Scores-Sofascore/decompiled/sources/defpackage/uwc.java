package defpackage;

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
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uwc extends Drawable implements Animatable {
    public final Movie a;
    public final Bitmap.Config b;
    public final jrg c;
    public Canvas h;
    public Bitmap i;
    public float l;
    public float m;
    public boolean n;
    public long o;
    public long p;
    public Picture r;
    public boolean t;
    public final Paint d = new Paint(3);
    public final ArrayList e = new ArrayList();
    public final Rect f = new Rect();
    public final Rect g = new Rect();
    public float j = 1.0f;
    public float k = 1.0f;
    public int q = -1;
    public ohe s = ohe.a;

    public uwc(Movie movie, Bitmap.Config config, jrg jrgVar) {
        this.a = movie;
        this.b = config;
        this.c = jrgVar;
        if (pco.H(config)) {
            a70.p("Bitmap config must not be hardware.");
            throw null;
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.d;
        Canvas canvas2 = this.h;
        Bitmap bitmap = this.i;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int save = canvas2.save();
        try {
            float f = this.j;
            canvas2.scale(f, f);
            this.a.draw(canvas2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            Picture picture = this.r;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(save);
            int save2 = canvas.save();
            try {
                canvas.translate(this.l, this.m);
                float f2 = this.k;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
            } finally {
                canvas.restoreToCount(save2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(save);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
        int width = rect.width();
        int height = rect.height();
        Movie movie = this.a;
        int width2 = movie.width();
        int height2 = movie.height();
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        kjh kjhVar = kjh.c;
        double r = tol.r(width2, height2, width, height, this.c, kjhVar);
        if (!this.t && r > 1.0d) {
            r = 1.0d;
        }
        float f = (float) r;
        this.j = f;
        int i = (int) (width2 * f);
        int i2 = (int) (f * height2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, this.b);
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.i = createBitmap;
        this.h = new Canvas(createBitmap);
        if (this.t) {
            this.k = 1.0f;
            this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            float r2 = (float) tol.r(i, i2, width, height, this.c, kjhVar);
            this.k = r2;
            this.l = ((width - (i * r2)) / 2.0f) + rect.left;
            this.m = ((height - (r2 * i2)) / 2.0f) + rect.top;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.a;
        int duration = movie.duration();
        if (duration == 0) {
            duration = 0;
            z = false;
        } else {
            if (this.n) {
                this.p = SystemClock.uptimeMillis();
            }
            int i = (int) (this.p - this.o);
            int i2 = i / duration;
            int i3 = this.q;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                duration = i - (i2 * duration);
            }
        }
        movie.setTime(duration);
        if (this.t) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.g;
            rect.set(0, 0, width, height);
            b(rect);
            int save = canvas.save();
            try {
                float f = 1.0f / this.j;
                canvas.scale(f, f);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.n && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.d.getAlpha() != 255) {
            return -3;
        }
        ohe oheVar = this.s;
        if (oheVar != ohe.b) {
            return (oheVar == ohe.a && this.a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            ogj.h(ljg.j(i, "Invalid alpha: "));
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = SystemClock.uptimeMillis();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((p50) arrayList.get(i)).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.n) {
            this.n = false;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((p50) arrayList.get(i)).a(this);
            }
        }
    }
}
