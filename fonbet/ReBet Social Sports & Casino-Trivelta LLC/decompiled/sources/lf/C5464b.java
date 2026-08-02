package lf;

import kf.InterfaceC5253a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lf.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5464b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5253a f55852a;

    public C5464b(InterfaceC5253a articlesRepository) {
        Intrinsics.checkNotNullParameter(articlesRepository, "articlesRepository");
        this.f55852a = articlesRepository;
    }

    public final Object a(Continuation continuation) {
        return this.f55852a.k(continuation);
    }
}
