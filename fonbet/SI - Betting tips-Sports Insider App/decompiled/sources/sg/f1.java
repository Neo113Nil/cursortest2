package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f1 extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f23628a;

    /* renamed from: b, reason: collision with root package name */
    public int f23629b;

    @Override // sg.v0
    public final Object a() {
        byte[] storage = Arrays.copyOf(this.f23628a, this.f23629b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new gf.y(storage);
    }

    @Override // sg.v0
    public final void b(int i5) {
        byte[] bArr = this.f23628a;
        if (bArr.length < i5) {
            int length = bArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            byte[] storage = Arrays.copyOf(bArr, i5);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f23628a = storage;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23629b;
    }
}
