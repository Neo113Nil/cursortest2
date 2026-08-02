package s3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.PixelUtil;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6313b extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f64648a;

    /* renamed from: b, reason: collision with root package name */
    public Path f64649b;

    /* renamed from: c, reason: collision with root package name */
    public RectF f64650c;

    /* renamed from: d, reason: collision with root package name */
    public LinearGradient f64651d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f64652e;

    /* renamed from: f, reason: collision with root package name */
    public float f64653f;
    private float[] mAngleCenter;
    private float[] mBorderRadii;
    private int[] mColors;
    private float[] mEndPoint;
    private float[] mLocations;
    private int[] mSize;
    private float[] mStartPoint;

    public C6313b(Context context) {
        super(context);
        this.f64648a = new Paint(1);
        this.mStartPoint = new float[]{0.0f, 0.0f};
        this.mEndPoint = new float[]{0.0f, 1.0f};
        this.f64652e = false;
        this.mAngleCenter = new float[]{0.5f, 0.5f};
        this.f64653f = 45.0f;
        this.mSize = new int[]{0, 0};
        this.mBorderRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static float[] b(float f10, int[] iArr) {
        float f11 = f10 % 360.0f;
        if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        if (f11 % 90.0f == 0.0f) {
            return c(f11, iArr);
        }
        float tan = (float) Math.tan((f11 * 3.141592653589793d) / 180.0d);
        float f12 = (-1.0f) / tan;
        float[] d10 = d(f11, iArr);
        float f13 = (d10[1] - (d10[0] * f12)) / (tan - f12);
        return new float[]{f13, tan * f13};
    }

    public static float[] c(float f10, int[] iArr) {
        float f11 = iArr[0] / 2.0f;
        float f12 = iArr[1] / 2.0f;
        return f10 == 0.0f ? new float[]{-f11, 0.0f} : f10 == 90.0f ? new float[]{0.0f, -f12} : f10 == 180.0f ? new float[]{f11, 0.0f} : new float[]{0.0f, f12};
    }

    public static float[] d(float f10, int[] iArr) {
        float f11 = iArr[0] / 2.0f;
        float f12 = iArr[1] / 2.0f;
        return f10 < 90.0f ? new float[]{-f11, -f12} : f10 < 180.0f ? new float[]{f11, -f12} : f10 < 270.0f ? new float[]{f11, f12} : new float[]{-f11, f12};
    }

    public final void a() {
        float[] fArr;
        float[] fArr2;
        int[] iArr = this.mColors;
        if (iArr != null) {
            float[] fArr3 = this.mLocations;
            if (fArr3 == null || iArr.length == fArr3.length) {
                if (!this.f64652e || this.mAngleCenter == null) {
                    float[] fArr4 = this.mStartPoint;
                    float f10 = fArr4[0];
                    int[] iArr2 = this.mSize;
                    int i10 = iArr2[0];
                    float f11 = fArr4[1];
                    int i11 = iArr2[1];
                    fArr = new float[]{f10 * i10, f11 * i11};
                    float[] fArr5 = this.mEndPoint;
                    fArr2 = new float[]{fArr5[0] * i10, fArr5[1] * i11};
                } else {
                    float[] b10 = b(90.0f - this.f64653f, this.mSize);
                    float[] fArr6 = this.mAngleCenter;
                    float f12 = fArr6[0];
                    int[] iArr3 = this.mSize;
                    float[] fArr7 = {f12 * iArr3[0], fArr6[1] * iArr3[1]};
                    fArr = new float[]{fArr7[0] + b10[0], fArr7[1] - b10[1]};
                    fArr2 = new float[]{fArr7[0] - b10[0], fArr7[1] + b10[1]};
                }
                LinearGradient linearGradient = new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.mColors, this.mLocations, Shader.TileMode.CLAMP);
                this.f64651d = linearGradient;
                this.f64648a.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public final void e() {
        if (this.f64649b == null) {
            this.f64649b = new Path();
            this.f64650c = new RectF();
        }
        this.f64649b.reset();
        RectF rectF = this.f64650c;
        int[] iArr = this.mSize;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f64649b.addRoundRect(this.f64650c, this.mBorderRadii, Path.Direction.CW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f64649b;
        if (path == null) {
            canvas.drawPaint(this.f64648a);
        } else {
            canvas.drawPath(path, this.f64648a);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.mSize = new int[]{i10, i11};
        e();
        a();
    }

    public void setAngle(float f10) {
        this.f64653f = f10;
        a();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.mAngleCenter = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i10));
        }
        this.mBorderRadii = fArr;
        e();
        a();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = readableArray.getType(i10) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(i10), getContext()).intValue() : readableArray.getInt(i10);
        }
        this.mColors = iArr;
        a();
    }

    public void setEndPoint(ReadableArray readableArray) {
        this.mEndPoint = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = (float) readableArray.getDouble(i10);
        }
        this.mLocations = fArr;
        a();
    }

    public void setStartPoint(ReadableArray readableArray) {
        this.mStartPoint = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setUseAngle(boolean z10) {
        this.f64652e = z10;
        a();
    }
}
