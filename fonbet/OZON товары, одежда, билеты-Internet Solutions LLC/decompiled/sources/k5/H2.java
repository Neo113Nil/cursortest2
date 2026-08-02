package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* loaded from: classes8.dex */
final class H2<T extends Serializable> {

    /* renamed from: a, reason: collision with root package name */
    private final T f70572a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70573b;

    H2(@NonNull T t2) {
        this.f70572a = t2;
        this.f70573b = System.currentTimeMillis();
    }

    @NonNull
    final T a() {
        return this.f70572a;
    }

    final long b() {
        return this.f70573b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H2.class != obj.getClass()) {
            return false;
        }
        return this.f70572a.equals(((H2) obj).f70572a);
    }

    public final int hashCode() {
        return this.f70572a.hashCode();
    }

    H2(@NonNull T t2, long j11) {
        this.f70572a = t2;
        this.f70573b = j11;
    }
}
