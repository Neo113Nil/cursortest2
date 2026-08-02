package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qbh extends pbh {
    public float b;
    public float c;
    public float d;
    public float e;

    @Override // defpackage.pbh
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.quadTo(this.b, this.c, this.d, this.e);
        path.transform(matrix);
    }
}
