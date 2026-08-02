package y8;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f25719a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25720b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f25719a = str;
        this.f25720b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25719a.equals(aVar.f25719a) && this.f25720b.equals(aVar.f25720b);
    }

    public final int hashCode() {
        return ((this.f25719a.hashCode() ^ 1000003) * 1000003) ^ this.f25720b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f25719a + ", usedDates=" + this.f25720b + "}";
    }
}
