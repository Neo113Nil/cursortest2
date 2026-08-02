package x7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;

/* renamed from: x7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10673a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f105073i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f105074j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f105075k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f105076l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Paint f105077a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Paint f105078b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final Paint f105079c;

    /* renamed from: d, reason: collision with root package name */
    private int f105080d;

    /* renamed from: e, reason: collision with root package name */
    private int f105081e;

    /* renamed from: f, reason: collision with root package name */
    private int f105082f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f105083g = new Path();

    /* renamed from: h, reason: collision with root package name */
    private Paint f105084h;

    public C10673a() {
        Paint paint = new Paint();
        this.f105084h = paint;
        this.f105077a = new Paint();
        d(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f105078b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f105079c = new Paint(paint2);
    }

    public final void a(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i11, float f7, float f11) {
        boolean z11 = f11 < 0.0f;
        Path path = this.f105083g;
        int[] iArr = f105075k;
        if (z11) {
            iArr[0] = 0;
            iArr[1] = this.f105082f;
            iArr[2] = this.f105081e;
            iArr[3] = this.f105080d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f7, f11);
            path.close();
            float f12 = -i11;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = this.f105080d;
            iArr[2] = this.f105081e;
            iArr[3] = this.f105082f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i11 / width);
        float[] fArr = f105076l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        boolean z12 = z11;
        Paint paint = this.f105078b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z12) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f105084h);
        }
        canvas.drawArc(rectF, f7, f11, true, paint);
        canvas.restore();
    }

    public final void b(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i11) {
        rectF.bottom += i11;
        rectF.offset(0.0f, -i11);
        int[] iArr = f105073i;
        iArr[0] = this.f105082f;
        iArr[1] = this.f105081e;
        iArr[2] = this.f105080d;
        Paint paint = this.f105079c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, f105074j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    @NonNull
    public final Paint c() {
        return this.f105077a;
    }

    public final void d(int i11) {
        this.f105080d = c.f(i11, 68);
        this.f105081e = c.f(i11, 20);
        this.f105082f = c.f(i11, 0);
        this.f105077a.setColor(this.f105080d);
    }
}
