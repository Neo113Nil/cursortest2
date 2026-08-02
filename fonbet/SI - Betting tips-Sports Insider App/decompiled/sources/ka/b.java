package ka;

import d9.e;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f18956a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18957b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f18958c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f18959d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f18960e;

    /* renamed from: f, reason: collision with root package name */
    public String f18961f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18956a == bVar.f18956a && Intrinsics.areEqual(this.f18957b, bVar.f18957b) && Intrinsics.areEqual(this.f18958c, bVar.f18958c) && Intrinsics.areEqual(this.f18959d, bVar.f18959d) && Intrinsics.areEqual(this.f18960e, bVar.f18960e) && Intrinsics.areEqual(this.f18961f, bVar.f18961f);
    }

    public final int hashCode() {
        int i5 = this.f18956a * 31;
        Object obj = this.f18957b;
        int hashCode = (this.f18958c.hashCode() + ((i5 + (obj == null ? 0 : obj.hashCode())) * 31)) * 31;
        ArrayList arrayList = this.f18959d;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f18960e;
        int hashCode3 = (hashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        String str = this.f18961f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SupportDataResult(httpCode=");
        sb2.append(this.f18956a);
        sb2.append(", messages=");
        sb2.append(this.f18957b);
        sb2.append(", activeChat=");
        sb2.append(this.f18958c);
        sb2.append(", idsPurchaseAttached=");
        sb2.append(this.f18959d);
        sb2.append(", idsFiles=");
        sb2.append(this.f18960e);
        sb2.append(", msgError=");
        return e.k(sb2, this.f18961f, ')');
    }
}
