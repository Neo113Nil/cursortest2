package o0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8621a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C8621a f77450b = new C8621a("text/*");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C8621a f77451c = new C8621a("*/*");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f77452a;

    public C8621a(@NotNull String str) {
        this.f77452a = str;
    }

    @NotNull
    public final String c() {
        return this.f77452a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8621a)) {
            return false;
        }
        return Intrinsics.d(this.f77452a, ((C8621a) obj).f77452a);
    }

    public final int hashCode() {
        return this.f77452a.hashCode();
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("MediaType(representation='"), this.f77452a, "')");
    }
}
