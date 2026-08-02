package f20;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z00.f;

/* renamed from: f20.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6406a implements l20.c {

    /* renamed from: a, reason: collision with root package name */
    private final long f62490a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f62491b;

    public C6406a(long j11, @NotNull f issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        this.f62490a = j11;
        this.f62491b = issue;
    }

    @NotNull
    public final f a() {
        return this.f62491b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6406a)) {
            return false;
        }
        C6406a c6406a = (C6406a) obj;
        return this.f62490a == c6406a.f62490a && Intrinsics.d(this.f62491b, c6406a.f62491b);
    }

    @Override // l20.c
    public final long getId() {
        return this.f62490a;
    }

    @Override // l20.c
    public final Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public final int getViewItemKey() {
        return hashCode();
    }

    public final int hashCode() {
        return this.f62491b.hashCode() + (Long.hashCode(this.f62490a) * 31);
    }

    @NotNull
    public final String toString() {
        return "PageBottomErrorItem(id=" + this.f62490a + ", issue=" + this.f62491b + ")";
    }
}
