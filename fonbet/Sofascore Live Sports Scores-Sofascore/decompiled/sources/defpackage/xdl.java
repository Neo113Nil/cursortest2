package defpackage;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xdl extends oah {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public xdl(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.oah
    public final Shader b(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        RadialGradient radialGradient = new RadialGradient(Float.intBitsToFloat(i) / 2.0f, Float.intBitsToFloat(i2) / 2.0f, Float.intBitsToFloat(i2) / 2.0f, new int[]{this.c, this.d}, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setScale(Float.intBitsToFloat(i) / Float.intBitsToFloat(i2), 1.0f, Float.intBitsToFloat(i) / 2.0f, Float.intBitsToFloat(i2) / 2.0f);
        radialGradient.setLocalMatrix(matrix);
        return radialGradient;
    }
}
