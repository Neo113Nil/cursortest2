package i10;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final z00.f f65736a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f65737b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f65738c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f65739d;

    /* renamed from: e, reason: collision with root package name */
    private final e f65740e;

    public j(z00.f fVar, @NotNull l loader, boolean z11, boolean z12, e eVar) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f65736a = fVar;
        this.f65737b = loader;
        this.f65738c = z11;
        this.f65739d = z12;
        this.f65740e = eVar;
    }

    public static j a(j jVar, z00.f fVar, l lVar, boolean z11, boolean z12, e eVar, int i11) {
        if ((i11 & 1) != 0) {
            fVar = jVar.f65736a;
        }
        z00.f fVar2 = fVar;
        if ((i11 & 2) != 0) {
            lVar = jVar.f65737b;
        }
        l loader = lVar;
        if ((i11 & 4) != 0) {
            z11 = jVar.f65738c;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = jVar.f65739d;
        }
        boolean z14 = z12;
        if ((i11 & 16) != 0) {
            eVar = jVar.f65740e;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(loader, "loader");
        return new j(fVar2, loader, z13, z14, eVar);
    }

    @NotNull
    public final l b() {
        return this.f65737b;
    }

    public final z00.f c() {
        return this.f65736a;
    }

    public final e d() {
        return this.f65740e;
    }

    public final boolean e() {
        return this.f65738c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f65736a, jVar.f65736a) && Intrinsics.d(this.f65737b, jVar.f65737b) && this.f65738c == jVar.f65738c && this.f65739d == jVar.f65739d && Intrinsics.d(this.f65740e, jVar.f65740e);
    }

    public final boolean f() {
        return this.f65739d;
    }

    public final int hashCode() {
        z00.f fVar = this.f65736a;
        int a11 = C3532b.a(C3532b.a((this.f65737b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31, 31, this.f65738c), 31, this.f65739d);
        e eVar = this.f65740e;
        return a11 + (eVar != null ? eVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ComposerUiState(pageIssue=" + this.f65736a + ", loader=" + this.f65737b + ", swipeRefreshLoader=" + this.f65738c + ", isPartialPageReloadingInProgress=" + this.f65739d + ", pageView=" + this.f65740e + ")";
    }
}
