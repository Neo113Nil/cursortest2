package si;

import C.o0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi.c;

/* renamed from: si.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9698a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<c> f98784a;

    /* renamed from: b, reason: collision with root package name */
    private final String f98785b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9698a(@NotNull List<? extends c> albums, String str) {
        Intrinsics.checkNotNullParameter(albums, "albums");
        this.f98784a = albums;
        this.f98785b = str;
    }

    public static C9698a a(C9698a c9698a, List albums, String str, int i11) {
        if ((i11 & 1) != 0) {
            albums = c9698a.f98784a;
        }
        if ((i11 & 2) != 0) {
            str = c9698a.f98785b;
        }
        c9698a.getClass();
        Intrinsics.checkNotNullParameter(albums, "albums");
        return new C9698a(albums, str);
    }

    @NotNull
    public final List<c> b() {
        return this.f98784a;
    }

    public final String c() {
        return this.f98785b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9698a)) {
            return false;
        }
        C9698a c9698a = (C9698a) obj;
        return Intrinsics.d(this.f98784a, c9698a.f98784a) && Intrinsics.d(this.f98785b, c9698a.f98785b);
    }

    public final int hashCode() {
        int hashCode = this.f98784a.hashCode() * 31;
        String str = this.f98785b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AlbumFragmentViewState(albums=");
        sb2.append(this.f98784a);
        sb2.append(", errorMessage=");
        return o0.c(sb2, this.f98785b, ")");
    }
}
