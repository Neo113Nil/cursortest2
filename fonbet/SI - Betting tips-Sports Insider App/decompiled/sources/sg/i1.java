package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i1 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f23642a;

    /* renamed from: b, reason: collision with root package name */
    public int f23643b;

    @Override // sg.v0
    public final Object a() {
        int[] storage = Arrays.copyOf(this.f23642a, this.f23643b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new gf.b0(storage);
    }

    @Override // sg.v0
    public final void b(int i5) {
        int[] iArr = this.f23642a;
        if (iArr.length < i5) {
            int length = iArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            int[] storage = Arrays.copyOf(iArr, i5);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f23642a = storage;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23643b;
    }
}
