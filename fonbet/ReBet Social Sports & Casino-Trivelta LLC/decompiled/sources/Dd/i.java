package Dd;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Cd.a f2672a;

    public i(Cd.a authenticationRepository) {
        Intrinsics.checkNotNullParameter(authenticationRepository, "authenticationRepository");
        this.f2672a = authenticationRepository;
    }

    public final Object a(Continuation continuation) {
        return this.f2672a.i(continuation);
    }
}
