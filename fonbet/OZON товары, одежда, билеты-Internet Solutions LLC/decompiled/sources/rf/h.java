package rf;

import T7.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f83398a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f83399b;

    public h(@NotNull String type, Object obj) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f83398a = type;
        this.f83399b = obj;
    }

    @NotNull
    public final String a() {
        return this.f83398a;
    }

    public final Object b() {
        return this.f83399b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f83398a, hVar.f83398a) && Intrinsics.d(this.f83399b, hVar.f83399b);
    }

    public final int hashCode() {
        String str = this.f83398a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Object obj = this.f83399b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttributeTypeAndValue(type=");
        sb2.append(this.f83398a);
        sb2.append(", value=");
        return E.c(this.f83399b, ")", sb2);
    }
}
