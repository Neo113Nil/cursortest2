package X6;

import Y6.b;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.r;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class a extends Drawable implements b {

    /* renamed from: a, reason: collision with root package name */
    public String f13592a;

    /* renamed from: b, reason: collision with root package name */
    public String f13593b;

    /* renamed from: c, reason: collision with root package name */
    public int f13594c;

    /* renamed from: d, reason: collision with root package name */
    public int f13595d;

    /* renamed from: e, reason: collision with root package name */
    public int f13596e;

    /* renamed from: f, reason: collision with root package name */
    public String f13597f;

    /* renamed from: g, reason: collision with root package name */
    public r f13598g;

    /* renamed from: i, reason: collision with root package name */
    public int f13600i;

    /* renamed from: j, reason: collision with root package name */
    public int f13601j;

    /* renamed from: p, reason: collision with root package name */
    public int f13607p;

    /* renamed from: q, reason: collision with root package name */
    public int f13608q;

    /* renamed from: r, reason: collision with root package name */
    public int f13609r;

    /* renamed from: s, reason: collision with root package name */
    public int f13610s;

    /* renamed from: t, reason: collision with root package name */
    public int f13611t;

    /* renamed from: u, reason: collision with root package name */
    public long f13612u;

    /* renamed from: v, reason: collision with root package name */
    public String f13613v;

    /* renamed from: h, reason: collision with root package name */
    public HashMap f13599h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public int f13602k = 80;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f13603l = new Paint(1);

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f13604m = new Matrix();

    /* renamed from: n, reason: collision with root package name */
    public final Rect f13605n = new Rect();

    /* renamed from: o, reason: collision with root package name */
    public final RectF f13606o = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public int f13614w = -1;

    /* renamed from: x, reason: collision with root package name */
    public int f13615x = 0;

    public a() {
        i();
    }

    public static String g(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    @Override // Y6.b
    public void a(long j10) {
        this.f13612u = j10;
        invalidateSelf();
    }

    public void b(String str, String str2) {
        this.f13599h.put(str, str2);
    }

    public final void c(Canvas canvas, String str, Object obj) {
        e(canvas, str, String.valueOf(obj), -1);
    }

    public final void d(Canvas canvas, String str, String str2) {
        e(canvas, str, str2, -1);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f13603l.setStyle(Paint.Style.STROKE);
        this.f13603l.setStrokeWidth(2.0f);
        this.f13603l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f13603l);
        Paint paint = this.f13603l;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f13603l.setColor(this.f13615x);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f13603l);
        this.f13603l.setStyle(style);
        this.f13603l.setStrokeWidth(0.0f);
        this.f13603l.setColor(-1);
        this.f13610s = this.f13607p;
        this.f13611t = this.f13608q;
        String str = this.f13593b;
        if (str != null) {
            d(canvas, "IDs", g("%s, %s", this.f13592a, str));
        } else {
            d(canvas, "ID", this.f13592a);
        }
        d(canvas, "D", g("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            c(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        e(canvas, "I", g("%dx%d", Integer.valueOf(this.f13594c), Integer.valueOf(this.f13595d)), f(this.f13594c, this.f13595d, this.f13598g));
        int i10 = this.f13595d;
        if (i10 > 0) {
            c(canvas, "IAR", Float.valueOf(this.f13594c / i10));
        }
        d(canvas, "I", g("%d KiB", Integer.valueOf(this.f13596e / 1024)));
        String str2 = this.f13597f;
        if (str2 != null) {
            d(canvas, "i format", str2);
        }
        int i11 = this.f13600i;
        if (i11 > 0) {
            d(canvas, "anim", g("f %d, l %d", Integer.valueOf(i11), Integer.valueOf(this.f13601j)));
        }
        r rVar = this.f13598g;
        if (rVar != null) {
            c(canvas, "scale", rVar);
        }
        long j10 = this.f13612u;
        if (j10 >= 0) {
            d(canvas, "t", g("%d ms", Long.valueOf(j10)));
        }
        String str3 = this.f13613v;
        if (str3 != null) {
            e(canvas, "origin", str3, this.f13614w);
        }
        for (Map.Entry entry : this.f13599h.entrySet()) {
            d(canvas, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void e(Canvas canvas, String str, String str2, int i10) {
        String str3 = str + ": ";
        float measureText = this.f13603l.measureText(str3);
        float measureText2 = this.f13603l.measureText(str2);
        this.f13603l.setColor(1711276032);
        int i11 = this.f13610s;
        int i12 = this.f13611t;
        canvas.drawRect(i11 - 4, i12 + 8, i11 + measureText + measureText2 + 4.0f, i12 + this.f13609r + 8, this.f13603l);
        this.f13603l.setColor(-1);
        canvas.drawText(str3, this.f13610s, this.f13611t, this.f13603l);
        this.f13603l.setColor(i10);
        canvas.drawText(str2, this.f13610s + measureText, this.f13611t, this.f13603l);
        this.f13611t += this.f13609r;
    }

    public int f(int i10, int i11, r rVar) {
        int i12;
        int i13;
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i10 > 0 && i11 > 0) {
            if (rVar != null) {
                Rect rect = this.f13605n;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f13604m.reset();
                i12 = i10;
                i13 = i11;
                rVar.getTransform(this.f13604m, this.f13605n, i12, i13, 0.0f, 0.0f);
                RectF rectF = this.f13606o;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i12;
                rectF.bottom = i13;
                this.f13604m.mapRect(rectF);
                int width2 = (int) this.f13606o.width();
                int height2 = (int) this.f13606o.height();
                width = Math.min(width, width2);
                height = Math.min(height, height2);
            } else {
                i12 = i10;
                i13 = i11;
            }
            float f10 = width;
            float f11 = f10 * 0.1f;
            float f12 = f10 * 0.5f;
            float f13 = height;
            float f14 = 0.1f * f13;
            float f15 = f13 * 0.5f;
            int abs = Math.abs(i12 - width);
            int abs2 = Math.abs(i13 - height);
            float f16 = abs;
            if (f16 < f11 && abs2 < f14) {
                return -16711936;
            }
            if (f16 < f12 && abs2 < f15) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(Rect rect, int i10, int i11) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i11, rect.height() / i10)));
        this.f13603l.setTextSize(min);
        int i12 = min + 8;
        this.f13609r = i12;
        int i13 = this.f13602k;
        if (i13 == 80) {
            this.f13609r = i12 * (-1);
        }
        this.f13607p = rect.left + 10;
        this.f13608q = i13 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    public void i() {
        this.f13594c = -1;
        this.f13595d = -1;
        this.f13596e = -1;
        this.f13599h = new HashMap();
        this.f13600i = -1;
        this.f13601j = -1;
        this.f13597f = null;
        j(null);
        this.f13612u = -1L;
        this.f13613v = null;
        this.f13614w = -1;
        invalidateSelf();
    }

    public void j(String str) {
        if (str == null) {
            str = ViewProps.NONE;
        }
        this.f13592a = str;
        invalidateSelf();
    }

    public void k(int i10, int i11) {
        this.f13594c = i10;
        this.f13595d = i11;
        invalidateSelf();
    }

    public void l(int i10) {
        this.f13596e = i10;
    }

    public void m(r rVar) {
        this.f13598g = rVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
