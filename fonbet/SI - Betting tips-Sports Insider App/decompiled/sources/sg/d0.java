package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d0 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f23616a;

    /* renamed from: b, reason: collision with root package name */
    public int f23617b;

    @Override // sg.v0
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f23616a, this.f23617b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // sg.v0
    public final void b(int i5) {
        int[] iArr = this.f23616a;
        if (iArr.length < i5) {
            int length = iArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23616a = copyOf;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23617b;
    }
}
