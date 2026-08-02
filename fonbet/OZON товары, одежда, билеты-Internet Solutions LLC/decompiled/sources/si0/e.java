package si0;

import kotlin.jvm.internal.Intrinsics;
import tj0.InterfaceC9882b;
import vj0.C10326a;

/* loaded from: classes3.dex */
public final class e implements Jb.e<InterfaceC9882b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10326a> f98803a;

    public e(Pc.a<C10326a> aVar) {
        this.f98803a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        C10326a serviceLocator = this.f98803a.get();
        Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
        return serviceLocator.b();
    }
}
