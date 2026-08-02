package xe;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L extends kotlin.coroutines.a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f105409b = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f105410a;

    public static final class a implements CoroutineContext.a<L> {
    }

    public L(@NotNull String str) {
        super(f105409b);
        this.f105410a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && Intrinsics.d(this.f105410a, ((L) obj).f105410a);
    }

    public final int hashCode() {
        return this.f105410a.hashCode();
    }

    @NotNull
    public final String q() {
        return this.f105410a;
    }

    @NotNull
    public final String toString() {
        return B3.D.c(new StringBuilder("CoroutineName("), this.f105410a, ')');
    }
}
