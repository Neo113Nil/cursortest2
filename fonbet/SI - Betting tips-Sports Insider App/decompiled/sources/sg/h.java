package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f23635a;

    /* renamed from: b, reason: collision with root package name */
    public int f23636b;

    @Override // sg.v0
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f23635a, this.f23636b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // sg.v0
    public final void b(int i5) {
        byte[] bArr = this.f23635a;
        if (bArr.length < i5) {
            int length = bArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23635a = copyOf;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23636b;
    }
}
