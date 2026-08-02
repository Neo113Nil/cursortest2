package fe;

import Nd.a;
import ge.C6718a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9819J;
import td.InterfaceC9815F;
import ud.C10026d;
import ud.InterfaceC10025c;

/* renamed from: fe.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6527f extends AbstractC6522a<InterfaceC10025c> implements InterfaceC6526e<InterfaceC10025c, Xd.g<?>> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6528g f63207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6527f(@NotNull InterfaceC9815F module, @NotNull C9819J notFoundClasses, @NotNull C6718a protocol) {
        super(protocol);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f63207b = new C6528g(module, notFoundClasses);
    }

    @Override // fe.InterfaceC6526e
    public final Xd.g<?> c(N container, Nd.m proto, je.N expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        a.b.c cVar = (a.b.c) Pd.e.a(proto, l().b());
        if (cVar == null) {
            return null;
        }
        return this.f63207b.c(expectedType, cVar, container.b());
    }

    @Override // fe.InterfaceC6526e
    public final Xd.g<?> d(N container, Nd.m proto, je.N expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    public final C10026d m(Nd.a proto, Pd.c nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        return this.f63207b.a(proto, nameResolver);
    }
}
