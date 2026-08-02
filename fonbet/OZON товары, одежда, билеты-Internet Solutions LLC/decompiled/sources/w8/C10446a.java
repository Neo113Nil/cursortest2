package w8;

import Ve.Om;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w8.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10446a extends k {

    /* renamed from: a, reason: collision with root package name */
    private final String f103616a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f103617b;

    C10446a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f103616a = str;
        this.f103617b = arrayList;
    }

    @Override // w8.k
    public final List<String> b() {
        return this.f103617b;
    }

    @Override // w8.k
    public final String c() {
        return this.f103616a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f103616a.equals(kVar.c()) && this.f103617b.equals(kVar.b());
    }

    public final int hashCode() {
        return ((this.f103616a.hashCode() ^ 1000003) * 1000003) ^ this.f103617b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeartBeatResult{userAgent=");
        sb2.append(this.f103616a);
        sb2.append(", usedDates=");
        return Om.a("}", sb2, this.f103617b);
    }
}
