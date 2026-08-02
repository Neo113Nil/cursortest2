package y1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f25578a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25579b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25580c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f25581d;

    public k(q0 type, boolean z5, Object obj, boolean z7) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.f25623a && z5) {
            throw new IllegalArgumentException(type.b().concat(" does not allow nullable values").toString());
        }
        if (!z5 && z7 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f25578a = type;
        this.f25579b = z5;
        this.f25581d = obj;
        this.f25580c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            Object obj2 = kVar.f25581d;
            if (this.f25579b != kVar.f25579b || this.f25580c != kVar.f25580c || !Intrinsics.areEqual(this.f25578a, kVar.f25578a)) {
                return false;
            }
            Object obj3 = this.f25581d;
            if (obj3 != null) {
                return Intrinsics.areEqual(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f25578a.hashCode() * 31) + (this.f25579b ? 1 : 0)) * 31) + (this.f25580c ? 1 : 0)) * 31;
        Object obj = this.f25581d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Reflection.getOrCreateKotlinClass(k.class).getSimpleName());
        sb2.append(" Type: " + this.f25578a);
        sb2.append(" Nullable: " + this.f25579b);
        if (this.f25580c) {
            sb2.append(" DefaultValue: " + this.f25581d);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
