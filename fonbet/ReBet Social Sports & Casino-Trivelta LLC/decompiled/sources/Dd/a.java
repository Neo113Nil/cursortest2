package Dd;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Cd.a f2664a;

    public a(Cd.a authenticationRepository) {
        Intrinsics.checkNotNullParameter(authenticationRepository, "authenticationRepository");
        this.f2664a = authenticationRepository;
    }

    public final Object a(Bd.b bVar, Bd.a aVar, Continuation continuation) {
        return this.f2664a.c(bVar, aVar, continuation);
    }
}
