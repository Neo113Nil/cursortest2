package k5;

import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final n5.a f18809a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18810b;

    public a(n5.a aVar, HashMap hashMap) {
        this.f18809a = aVar;
        this.f18810b = hashMap;
    }

    public final long a(b5.d dVar, long j, int i5) {
        long time = j - this.f18809a.getTime();
        b bVar = (b) this.f18810b.get(dVar);
        long j6 = bVar.f18811a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i5 - 1) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * r12))), time), bVar.f18812b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18809a.equals(aVar.f18809a) && this.f18810b.equals(aVar.f18810b);
    }

    public final int hashCode() {
        return ((this.f18809a.hashCode() ^ 1000003) * 1000003) ^ this.f18810b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f18809a + ", values=" + this.f18810b + "}";
    }
}
