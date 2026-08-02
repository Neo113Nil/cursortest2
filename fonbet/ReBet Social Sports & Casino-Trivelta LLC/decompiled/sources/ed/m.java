package ed;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final l f45958a;

    /* renamed from: b, reason: collision with root package name */
    public final l f45959b;

    /* renamed from: c, reason: collision with root package name */
    public final l f45960c;

    /* renamed from: d, reason: collision with root package name */
    public final l f45961d;

    public m(l top, l right, l bottom, l left) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        this.f45958a = top;
        this.f45959b = right;
        this.f45960c = bottom;
        this.f45961d = left;
    }

    public final l a() {
        return this.f45960c;
    }

    public final l b() {
        return this.f45961d;
    }

    public final l c() {
        return this.f45959b;
    }

    public final l d() {
        return this.f45958a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f45958a == mVar.f45958a && this.f45959b == mVar.f45959b && this.f45960c == mVar.f45960c && this.f45961d == mVar.f45961d;
    }

    public int hashCode() {
        return (((((this.f45958a.hashCode() * 31) + this.f45959b.hashCode()) * 31) + this.f45960c.hashCode()) * 31) + this.f45961d.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.f45958a + ", right=" + this.f45959b + ", bottom=" + this.f45960c + ", left=" + this.f45961d + ")";
    }
}
