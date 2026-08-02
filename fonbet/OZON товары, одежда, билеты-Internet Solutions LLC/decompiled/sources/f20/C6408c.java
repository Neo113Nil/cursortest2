package f20;

import T00.m;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n20.j;
import org.jetbrains.annotations.NotNull;
import z00.f;

/* renamed from: f20.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6408c implements InterfaceC7243a<f> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m f62493a = new m(1, "internal_composer", "error_component", "1-internal_composer.error_component");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f62494b = 0;

    /* renamed from: f20.c$a */
    public static final class a {
        @NotNull
        public static C6407b a(@NotNull InterfaceC8046a... viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
            return new C6407b(j.b(), viewMapper);
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
    public final f parse(C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return f.b.f106885a;
    }
}
