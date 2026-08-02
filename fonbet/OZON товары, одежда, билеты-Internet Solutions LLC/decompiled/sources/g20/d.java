package g20;

import T00.m;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n20.j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d implements InterfaceC7243a<C6615a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m f63721a = new m(1, "internal_composer", "loading_component", "1-internal_composer.loading_component");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f63722b = 0;

    public static final class a {
        @NotNull
        public static c a(@NotNull InterfaceC8046a... viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
            return new c(j.b(), viewMapper);
        }
    }

    @Override // j20.InterfaceC7243a
    public final boolean canParse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public final Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public final long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    public final C6615a parse(C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return C6615a.f63718a;
    }
}
