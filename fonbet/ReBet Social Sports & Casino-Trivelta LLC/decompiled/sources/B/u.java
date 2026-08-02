package B;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f519a;

    public u(String str) {
        this.f519a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.areEqual(this.f519a, ((u) obj).f519a);
    }

    public int hashCode() {
        return this.f519a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f519a + ')';
    }
}
