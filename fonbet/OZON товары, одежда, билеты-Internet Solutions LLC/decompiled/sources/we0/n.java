package we0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f104446a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f104447b;

    public n(@NotNull m southWest, @NotNull m northEast) {
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        this.f104446a = southWest;
        this.f104447b = northEast;
    }

    @NotNull
    public final m a() {
        return this.f104447b;
    }

    @NotNull
    public final m b() {
        return this.f104446a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f104446a, nVar.f104446a) && Intrinsics.d(this.f104447b, nVar.f104447b);
    }

    public final int hashCode() {
        return this.f104447b.hashCode() + (this.f104446a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "LatLngBounds(southWest=" + this.f104446a + ", northEast=" + this.f104447b + ")";
    }
}
