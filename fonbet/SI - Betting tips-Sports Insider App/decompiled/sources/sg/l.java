package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public char[] f23652a;

    /* renamed from: b, reason: collision with root package name */
    public int f23653b;

    @Override // sg.v0
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f23652a, this.f23653b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // sg.v0
    public final void b(int i5) {
        char[] cArr = this.f23652a;
        if (cArr.length < i5) {
            int length = cArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23652a = copyOf;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23653b;
    }
}
