package g20;

import P4.f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b implements l20.c {

    /* renamed from: a, reason: collision with root package name */
    private final long f63719a;

    public b(long j11) {
        this.f63719a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f63719a == ((b) obj).f63719a;
    }

    @Override // l20.c
    public final long getId() {
        return this.f63719a;
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
        return Long.hashCode(this.f63719a);
    }

    @NotNull
    public final String toString() {
        return f.a(this.f63719a, ")", new StringBuilder("PageBottomLoaderItem(id="));
    }
}
