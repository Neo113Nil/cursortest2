package zg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class b<T> implements Pc.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f109055a;

    public b(String str) {
        this.f109055a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f109055a, ((b) obj).f109055a);
    }

    @Override // Pc.a
    public final T get() {
        return (T) this.f109055a;
    }

    public final int hashCode() {
        String str = this.f109055a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public final String toString() {
        return "SimpleProvider(value=" + ((Object) this.f109055a) + ')';
    }
}
