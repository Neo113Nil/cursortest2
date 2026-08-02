package pf0;

import We.E;
import We.G;
import We.InterfaceC4865g;
import eg0.C6364b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class k extends E {

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final E f80513G;

    public k(@NotNull E delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f80513G = delegate;
    }

    @Override // We.E, We.InterfaceC4865g.a
    @NotNull
    public final InterfaceC4865g a(@NotNull G request) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.getClass();
        G.a aVar = new G.a(request);
        aVar.i(uf0.b.class, new C6364b());
        return this.f80513G.a(aVar.b());
    }
}
