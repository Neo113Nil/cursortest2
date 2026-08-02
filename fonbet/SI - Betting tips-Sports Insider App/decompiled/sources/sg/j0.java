package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j0 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f23646a;

    /* renamed from: b, reason: collision with root package name */
    public int f23647b;

    @Override // sg.v0
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f23646a, this.f23647b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // sg.v0
    public final void b(int i5) {
        long[] jArr = this.f23646a;
        if (jArr.length < i5) {
            int length = jArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23646a = copyOf;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23647b;
    }
}
