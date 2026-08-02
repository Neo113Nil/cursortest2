package rf;

import T7.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f83466a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f83467b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f83468c;

    public s(Object obj, @NotNull String id2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f83466a = id2;
        this.f83467b = z11;
        this.f83468c = obj;
    }

    public final boolean a() {
        return this.f83467b;
    }

    @NotNull
    public final String b() {
        return this.f83466a;
    }

    public final Object c() {
        return this.f83468c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f83466a, sVar.f83466a) && this.f83467b == sVar.f83467b && Intrinsics.d(this.f83468c, sVar.f83468c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f83466a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z11 = this.f83467b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        Object obj = this.f83468c;
        return i12 + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Extension(id=");
        sb2.append(this.f83466a);
        sb2.append(", critical=");
        sb2.append(this.f83467b);
        sb2.append(", value=");
        return E.c(this.f83468c, ")", sb2);
    }
}
