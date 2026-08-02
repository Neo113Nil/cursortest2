package ed;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C4201a f45962a;

    /* renamed from: b, reason: collision with root package name */
    public final o f45963b;

    /* renamed from: c, reason: collision with root package name */
    public final m f45964c;

    public n(C4201a insets, o mode, m edges) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f45962a = insets;
        this.f45963b = mode;
        this.f45964c = edges;
    }

    public final m a() {
        return this.f45964c;
    }

    public final C4201a b() {
        return this.f45962a;
    }

    public final o c() {
        return this.f45963b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f45962a, nVar.f45962a) && this.f45963b == nVar.f45963b && Intrinsics.areEqual(this.f45964c, nVar.f45964c);
    }

    public int hashCode() {
        return (((this.f45962a.hashCode() * 31) + this.f45963b.hashCode()) * 31) + this.f45964c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f45962a + ", mode=" + this.f45963b + ", edges=" + this.f45964c + ")";
    }
}
