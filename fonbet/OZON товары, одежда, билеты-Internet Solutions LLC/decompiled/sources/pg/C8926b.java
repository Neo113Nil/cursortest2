package pg;

import G.g;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: pg.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8926b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f80518a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f80519b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final URI f80520c;

    public C8926b(String appStoreId, String appStoreName, URI link) {
        Intrinsics.checkNotNullParameter(appStoreId, "appStoreId");
        Intrinsics.checkNotNullParameter(appStoreName, "appStoreName");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f80518a = appStoreId;
        this.f80519b = appStoreName;
        this.f80520c = link;
    }

    @NotNull
    public final String a() {
        return this.f80519b;
    }

    @NotNull
    public final URI b() {
        return this.f80520c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8926b)) {
            return false;
        }
        C8926b c8926b = (C8926b) obj;
        return Intrinsics.d(this.f80518a, c8926b.f80518a) && Intrinsics.d(this.f80519b, c8926b.f80519b) && Intrinsics.d(this.f80520c, c8926b.f80520c);
    }

    public final int hashCode() {
        return this.f80520c.hashCode() + g.a(this.f80518a.hashCode() * 31, 31, this.f80519b);
    }

    @NotNull
    public final String toString() {
        return "AppStoreModel(appStoreId=" + this.f80518a + ", appStoreName=" + this.f80519b + ", link=" + this.f80520c + ")";
    }
}
