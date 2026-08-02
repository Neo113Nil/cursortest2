package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b1 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f23610a;

    /* renamed from: b, reason: collision with root package name */
    public int f23611b;

    @Override // sg.v0
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f23610a, this.f23611b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // sg.v0
    public final void b(int i5) {
        short[] sArr = this.f23610a;
        if (sArr.length < i5) {
            int length = sArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23610a = copyOf;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23611b;
    }
}
