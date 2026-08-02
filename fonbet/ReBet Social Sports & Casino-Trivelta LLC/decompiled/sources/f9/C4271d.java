package f9;

import java.util.List;

/* renamed from: f9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4271d extends j {

    /* renamed from: a, reason: collision with root package name */
    public final List f46508a;

    public C4271d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f46508a = list;
    }

    @Override // f9.j
    public List c() {
        return this.f46508a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f46508a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f46508a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f46508a + "}";
    }
}
