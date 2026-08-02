package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class mb5 {
    public final l51 a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public mb5(l51 l51Var) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = l51Var;
        this.e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public abstract void b(int i, int i2, Canvas canvas, Paint paint);

    public abstract void c(Canvas canvas, Paint paint, kb5 kb5Var, int i);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public abstract int e();

    public abstract int f();

    public abstract void g();
}
