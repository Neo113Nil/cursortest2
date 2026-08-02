package O8;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public f f8377a;

    /* renamed from: b, reason: collision with root package name */
    public String f8378b;

    public g(f type, String term) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(term, "term");
        this.f8377a = type;
        this.f8378b = term;
    }

    public final String a() {
        return this.f8378b;
    }

    public final f b() {
        return this.f8377a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f8377a == gVar.f8377a && Intrinsics.areEqual(this.f8378b, gVar.f8378b);
    }

    public int hashCode() {
        return (this.f8377a.hashCode() * 31) + this.f8378b.hashCode();
    }

    public String toString() {
        return "GPHSuggestion(type=" + this.f8377a + ", term=" + this.f8378b + ')';
    }
}
