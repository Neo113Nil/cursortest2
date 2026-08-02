package G1;

import android.opengl.Matrix;
import e1.AbstractC4151s;
import e1.P;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3789b;
    private final float[] recenterMatrix = new float[16];
    private final float[] rotationMatrix = new float[16];

    /* renamed from: a, reason: collision with root package name */
    public final P f3788a = new P();

    public static void a(float[] fArr, float[] fArr2) {
        AbstractC4151s.T(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    public static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            AbstractC4151s.T(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArr2 = (float[]) this.f3788a.j(j10);
        if (fArr2 == null) {
            return false;
        }
        b(this.rotationMatrix, fArr2);
        if (!this.f3789b) {
            a(this.recenterMatrix, this.rotationMatrix);
            this.f3789b = true;
        }
        Matrix.multiplyMM(fArr, 0, this.recenterMatrix, 0, this.rotationMatrix, 0);
        return true;
    }

    public void d() {
        this.f3788a.c();
        this.f3789b = false;
    }

    public void e(long j10, float[] fArr) {
        this.f3788a.a(j10, fArr);
    }
}
