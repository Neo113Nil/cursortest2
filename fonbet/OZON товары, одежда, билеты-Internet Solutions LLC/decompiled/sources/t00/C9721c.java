package t00;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: t00.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9721c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f98959a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f98960b;

    public C9721c(@NotNull List<? extends AbstractC9720b> items, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f98959a = items;
        this.f98960b = z11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<t00.b>] */
    @NotNull
    public final List<AbstractC9720b> a() {
        return this.f98959a;
    }

    public final boolean b() {
        return this.f98960b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9721c)) {
            return false;
        }
        C9721c c9721c = (C9721c) obj;
        return Intrinsics.d(this.f98959a, c9721c.f98959a) && this.f98960b == c9721c.f98960b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98960b) + (this.f98959a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DebugMenuScreenFlagsListState(items=");
        sb2.append(this.f98959a);
        sb2.append(", shouldReloadApp=");
        return Pk0.a.a(")", sb2, this.f98960b);
    }
}
