package rf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C9684j f83412a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83413b;

    public k(int i11, @NotNull C9684j byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        this.f83412a = byteString;
        this.f83413b = i11;
    }

    @NotNull
    public final C9684j a() {
        return this.f83412a;
    }

    public final int b() {
        return this.f83413b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f83412a, kVar.f83412a) && this.f83413b == kVar.f83413b;
    }

    public final int hashCode() {
        return (this.f83412a.hashCode() * 31) + this.f83413b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitString(byteString=");
        sb2.append(this.f83412a);
        sb2.append(", unusedBitsCount=");
        return K00.b.e(this.f83413b, ")", sb2);
    }
}
