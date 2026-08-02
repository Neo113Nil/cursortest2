package U7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f12114a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12115b;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f12114a = name;
        this.f12115b = z10;
    }

    public final String a() {
        return this.f12114a;
    }

    public final boolean b() {
        return this.f12115b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f12114a, aVar.f12114a) && this.f12115b == aVar.f12115b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f12114a.hashCode() * 31;
        boolean z10 = this.f12115b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f12114a + ", value=" + this.f12115b + ')';
    }
}
