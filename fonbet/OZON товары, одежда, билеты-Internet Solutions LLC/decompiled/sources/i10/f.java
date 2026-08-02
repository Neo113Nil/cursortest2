package i10;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f65717a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f65718b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f65719c;

    public f(String str, @NotNull String origin, @NotNull String location) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f65717a = str;
        this.f65718b = origin;
        this.f65719c = location;
    }

    public final String a() {
        return this.f65717a;
    }

    @NotNull
    public final String b() {
        return this.f65719c;
    }

    @NotNull
    public final String c() {
        return this.f65718b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.state.ComposerRedirect");
        f fVar = (f) obj;
        return Intrinsics.d(this.f65717a, fVar.f65717a) && Intrinsics.d(this.f65718b, fVar.f65718b) && Intrinsics.d(this.f65719c, fVar.f65719c);
    }

    public final int hashCode() {
        String str = this.f65717a;
        return this.f65719c.hashCode() + G.g.a((str != null ? str.hashCode() : 0) * 31, 31, this.f65718b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposerRedirect(key=");
        sb2.append(this.f65717a);
        sb2.append(", origin='");
        sb2.append(this.f65718b);
        sb2.append("', location='");
        return o0.c(sb2, this.f65719c, "')");
    }
}
