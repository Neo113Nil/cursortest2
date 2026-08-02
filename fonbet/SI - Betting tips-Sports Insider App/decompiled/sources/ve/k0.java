package ve;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f24740a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24741b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24742c;

    public k0(Layout layout, float f6, float f10) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f24740a = layout;
        this.f24741b = f6;
        this.f24742c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.areEqual(this.f24740a, k0Var.f24740a) && Float.compare(this.f24741b, k0Var.f24741b) == 0 && Float.compare(this.f24742c, k0Var.f24742c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24742c) + ((Float.floatToIntBits(this.f24741b) + (this.f24740a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ItemText(layout=" + this.f24740a + ", left=" + this.f24741b + ", top=" + this.f24742c + ')';
    }
}
