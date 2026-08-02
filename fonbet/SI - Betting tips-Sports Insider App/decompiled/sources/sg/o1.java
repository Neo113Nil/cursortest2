package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o1 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public short[] f23666a;

    /* renamed from: b, reason: collision with root package name */
    public int f23667b;

    @Override // sg.v0
    public final Object a() {
        short[] storage = Arrays.copyOf(this.f23666a, this.f23667b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new gf.i0(storage);
    }

    @Override // sg.v0
    public final void b(int i5) {
        short[] sArr = this.f23666a;
        if (sArr.length < i5) {
            int length = sArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            short[] storage = Arrays.copyOf(sArr, i5);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f23666a = storage;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23667b;
    }
}
