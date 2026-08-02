package s;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends h {
    public m(int i5) {
        this.f22557a = i5 == 0 ? i.f22559a : new float[i5];
    }

    public final void c(float f6) {
        int i5 = this.f22558b + 1;
        float[] fArr = this.f22557a;
        if (fArr.length < i5) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(i5, (fArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f22557a = copyOf;
        }
        float[] fArr2 = this.f22557a;
        int i10 = this.f22558b;
        fArr2[i10] = f6;
        this.f22558b = i10 + 1;
    }
}
