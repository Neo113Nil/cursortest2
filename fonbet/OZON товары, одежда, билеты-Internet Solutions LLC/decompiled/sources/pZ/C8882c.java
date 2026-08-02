package pZ;

import De.C2862e;
import EZ.i;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.N;

/* renamed from: pZ.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8882c extends f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f80361a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends EZ.a<?>> f80362b;

    /* renamed from: pZ.c$a */
    public static final class a extends i<C8882c> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Je.d f80363a = Je.e.a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C2862e f80364b = N.a(C10720e0.a().w(1));

        @Override // EZ.a
        public final void navigate(@NotNull EZ.g navigator, @NotNull EZ.e<C8882c> response) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            C10727i.c(this.f80364b, null, null, new C8881b(this, response, 0, null), 3);
        }

        @Override // EZ.a
        public final void navigateForResult(@NotNull EZ.g navigator, @NotNull EZ.e<C8882c> response, int i11) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(response, "response");
            C10727i.c(this.f80364b, null, null, new C8881b(this, response, i11, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8882c(@NotNull Function1<? super kotlin.coroutines.d<? super f>, ? extends Object> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f80361a = (j) provider;
        this.f80362b = kotlin.jvm.internal.N.b(a.class);
    }

    @Override // pZ.f
    @NotNull
    public final kotlin.reflect.d<? extends EZ.a<?>> getNavigator() {
        return this.f80362b;
    }

    @NotNull
    public final String toString() {
        return "AsyncRedirectDestination(provider=" + this.f80361a + ")";
    }
}
