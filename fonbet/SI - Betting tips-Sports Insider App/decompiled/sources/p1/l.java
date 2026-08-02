package p1;

import android.graphics.Matrix;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends c {
    public final void g(io.sentry.util.network.b bVar, int i5) {
        float[] fArr = this.f21410a;
        float f6 = fArr[i5];
        int i10 = i5 + 1;
        float f10 = fArr[i10];
        float[] fArr2 = (float[]) bVar.f17176b;
        fArr2[0] = f6;
        fArr2[1] = f10;
        ((Matrix) bVar.f17177c).mapPoints(fArr2);
        long a7 = s.g.a(fArr2[0], fArr2[1]);
        fArr[i5] = Float.intBitsToFloat((int) (a7 >> 32));
        fArr[i10] = Float.intBitsToFloat((int) (4294967295L & a7));
    }
}
