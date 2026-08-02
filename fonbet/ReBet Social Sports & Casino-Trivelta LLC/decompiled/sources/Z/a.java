package Z;

import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14353a;

    /* renamed from: b, reason: collision with root package name */
    public final Function f14354b;

    public a(String str, Function function) {
        this.f14353a = str;
        this.f14354b = function;
    }

    public final Function a() {
        return this.f14354b;
    }

    public final String b() {
        return this.f14353a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f14353a, aVar.f14353a) && Intrinsics.areEqual(this.f14354b, aVar.f14354b);
    }

    public int hashCode() {
        String str = this.f14353a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Function function = this.f14354b;
        return hashCode + (function != null ? function.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f14353a + ", action=" + this.f14354b + ')';
    }
}
