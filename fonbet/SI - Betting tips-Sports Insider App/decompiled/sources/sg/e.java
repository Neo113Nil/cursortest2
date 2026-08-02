package sg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f23620a;

    /* renamed from: b, reason: collision with root package name */
    public int f23621b;

    @Override // sg.v0
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f23620a, this.f23621b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // sg.v0
    public final void b(int i5) {
        boolean[] zArr = this.f23620a;
        if (zArr.length < i5) {
            int length = zArr.length * 2;
            if (i5 < length) {
                i5 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i5);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23620a = copyOf;
        }
    }

    @Override // sg.v0
    public final int d() {
        return this.f23621b;
    }
}
