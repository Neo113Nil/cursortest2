package ve;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f24736a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f24737b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24738c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24739d;

    public j0(RectF ovalIcon, Path okIcon, float f6, float f10) {
        Intrinsics.checkNotNullParameter(ovalIcon, "ovalIcon");
        Intrinsics.checkNotNullParameter(okIcon, "okIcon");
        this.f24736a = ovalIcon;
        this.f24737b = okIcon;
        this.f24738c = f6;
        this.f24739d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.areEqual(this.f24736a, j0Var.f24736a) && Intrinsics.areEqual(this.f24737b, j0Var.f24737b) && Float.compare(this.f24738c, j0Var.f24738c) == 0 && Float.compare(this.f24739d, j0Var.f24739d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24739d) + ((Float.floatToIntBits(this.f24738c) + ((this.f24737b.hashCode() + (this.f24736a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ItemIcon(ovalIcon=" + this.f24736a + ", okIcon=" + this.f24737b + ", left=" + this.f24738c + ", top=" + this.f24739d + ')';
    }
}
