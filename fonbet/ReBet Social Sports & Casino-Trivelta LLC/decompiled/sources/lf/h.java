package lf;

import kf.InterfaceC5253a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5253a f55858a;

    public h(InterfaceC5253a articlesRepository) {
        Intrinsics.checkNotNullParameter(articlesRepository, "articlesRepository");
        this.f55858a = articlesRepository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.f55858a.q(str, continuation);
    }

    public final Object b(String str, Continuation continuation) {
        return this.f55858a.x(str, continuation);
    }
}
