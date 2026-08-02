package xd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.r0;
import td.s0;

/* renamed from: xd.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10705a extends s0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C10705a f105369c = new C10705a("package", false);

    @Override // td.s0
    public final Integer a(@NotNull s0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        int i11 = r0.f99417b;
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return visibility == r0.e.f99422c || visibility == r0.f.f99423c ? 1 : -1;
    }

    @Override // td.s0
    @NotNull
    public final String b() {
        return "public/*package*/";
    }

    @Override // td.s0
    @NotNull
    public final s0 d() {
        return r0.g.f99424c;
    }
}
