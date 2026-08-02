package gf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10039a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10040b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10041c;

    public u(Object obj, Object obj2, Object obj3) {
        this.f10039a = obj;
        this.f10040b = obj2;
        this.f10041c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f10039a, uVar.f10039a) && Intrinsics.areEqual(this.f10040b, uVar.f10040b) && Intrinsics.areEqual(this.f10041c, uVar.f10041c);
    }

    public final int hashCode() {
        Object obj = this.f10039a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f10040b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f10041c;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f10039a + ", " + this.f10040b + ", " + this.f10041c + ')';
    }
}
