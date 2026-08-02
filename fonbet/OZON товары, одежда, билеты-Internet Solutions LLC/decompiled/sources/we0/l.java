package we0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104441a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f104442b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f104443c;

    public l(@NotNull String uid, @NotNull String nameRu, @NotNull String nameEn) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(nameRu, "nameRu");
        Intrinsics.checkNotNullParameter(nameEn, "nameEn");
        this.f104441a = uid;
        this.f104442b = nameRu;
        this.f104443c = nameEn;
    }

    @NotNull
    public final String a() {
        return this.f104443c;
    }

    @NotNull
    public final String b() {
        return this.f104442b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f104441a, lVar.f104441a) && Intrinsics.d(this.f104442b, lVar.f104442b) && Intrinsics.d(this.f104443c, lVar.f104443c);
    }

    public final int hashCode() {
        return this.f104443c.hashCode() + G.g.a(this.f104441a.hashCode() * 31, 31, this.f104442b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country(uid=");
        sb2.append(this.f104441a);
        sb2.append(", nameRu=");
        sb2.append(this.f104442b);
        sb2.append(", nameEn=");
        return o0.c(sb2, this.f104443c, ")");
    }
}
