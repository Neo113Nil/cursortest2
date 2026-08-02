package ob0;

import C.o0;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f77905a;

    private /* synthetic */ D(String str) {
        this.f77905a = str;
    }

    public static final /* synthetic */ D a(String str) {
        return new D(str);
    }

    @NotNull
    public static void b(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
    }

    public final /* synthetic */ String c() {
        return this.f77905a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            return Intrinsics.d(this.f77905a, ((D) obj).f77905a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f77905a.hashCode();
    }

    public final String toString() {
        return o0.c(new StringBuilder("TagId(id="), this.f77905a, ")");
    }
}
