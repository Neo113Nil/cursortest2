package si0;

import ij0.InterfaceC7088c;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Jb.e<kj0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC7088c> f98801a;

    public c(C9700a c9700a, Pc.a<InterfaceC7088c> aVar) {
        this.f98801a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        InterfaceC7088c useCase = this.f98801a.get();
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        return new Ji0.c(useCase);
    }
}
