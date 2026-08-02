package bo.app;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f25583a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f25584b;

    public j0() {
        this.f25583a = null;
        this.f25584b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.areEqual(this.f25583a, j0Var.f25583a) && Intrinsics.areEqual(this.f25584b, j0Var.f25584b);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f25583a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Map map = this.f25584b;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BitmapAndHeaders(bitmap=" + this.f25583a + ", headers=" + this.f25584b + ")";
    }

    public j0(Bitmap bitmap, Map map) {
        this.f25583a = bitmap;
        this.f25584b = map;
    }
}
