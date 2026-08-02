package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public double[] f23668a;

    /* renamed from: b, reason: collision with root package name */
    public int f23669b;

    @Override // sg.v0
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f23668a, this.f23669b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // sg.v0
    public final void b(int i5) {
        double[] dArr = this.f23668a;
        if (dArr.length < i5) {
            int length = dArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23668a = copyOf;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23669b;
    }
}
