package Ea;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.AbstractC2074d;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3019a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3020b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f3021c;

    /* renamed from: d, reason: collision with root package name */
    public int f3022d;

    /* renamed from: e, reason: collision with root package name */
    public int f3023e;

    /* renamed from: f, reason: collision with root package name */
    public int f3024f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f3025g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f3026h;
    private static final int[] edgeColors = new int[3];
    private static final float[] edgePositions = {0.0f, 0.5f, 1.0f};
    private static final int[] cornerColors = new int[4];
    private static final float[] cornerPositions = {0.0f, 0.0f, 0.5f, 1.0f};

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f3025g;
        if (z10) {
            int[] iArr = cornerColors;
            iArr[0] = 0;
            iArr[1] = this.f3024f;
            iArr[2] = this.f3023e;
            iArr[3] = this.f3022d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = cornerColors;
            iArr2[0] = 0;
            iArr2[1] = this.f3022d;
            iArr2[2] = this.f3023e;
            iArr2[3] = this.f3024f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / width);
        float[] fArr = cornerPositions;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f3020b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, cornerColors, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f3026h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f3020b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = edgeColors;
        iArr[0] = this.f3024f;
        iArr[1] = this.f3023e;
        iArr[2] = this.f3022d;
        Paint paint = this.f3021c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, edgePositions, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f3021c);
        canvas.restore();
    }

    public Paint c() {
        return this.f3019a;
    }

    public void d(int i10) {
        this.f3022d = AbstractC2074d.k(i10, 68);
        this.f3023e = AbstractC2074d.k(i10, 20);
        this.f3024f = AbstractC2074d.k(i10, 0);
        this.f3019a.setColor(this.f3022d);
    }

    public a(int i10) {
        this.f3025g = new Path();
        Paint paint = new Paint();
        this.f3026h = paint;
        this.f3019a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f3020b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f3021c = new Paint(paint2);
    }
}
