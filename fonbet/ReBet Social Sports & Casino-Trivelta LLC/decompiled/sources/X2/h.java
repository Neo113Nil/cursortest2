package X2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f13431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13432b;

    public h(String workSpecId, int i10) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f13431a = workSpecId;
        this.f13432b = i10;
    }

    public final int a() {
        return this.f13432b;
    }

    public final String b() {
        return this.f13431a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f13431a, hVar.f13431a) && this.f13432b == hVar.f13432b;
    }

    public int hashCode() {
        return (this.f13431a.hashCode() * 31) + Integer.hashCode(this.f13432b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f13431a + ", generation=" + this.f13432b + ')';
    }
}
