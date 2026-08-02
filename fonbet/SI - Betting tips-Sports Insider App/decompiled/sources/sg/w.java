package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f23712a;

    /* renamed from: b, reason: collision with root package name */
    public int f23713b;

    @Override // sg.v0
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f23712a, this.f23713b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // sg.v0
    public final void b(int i5) {
        float[] fArr = this.f23712a;
        if (fArr.length < i5) {
            int length = fArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23712a = copyOf;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23713b;
    }
}
