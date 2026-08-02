package c;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D0 extends Dc.c {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f26401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(Throwable underlying) {
        super(null);
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f26401a = underlying;
        this.f26402b = "Network error: " + underlying.getMessage();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D0) && Intrinsics.areEqual(this.f26401a, ((D0) obj).f26401a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f26402b;
    }

    public final int hashCode() {
        return this.f26401a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NetworkError(underlying=" + this.f26401a + ')';
    }
}
