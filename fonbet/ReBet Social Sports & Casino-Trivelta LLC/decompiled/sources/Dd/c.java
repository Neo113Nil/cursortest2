package Dd;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Cd.a f2666a;

    public c(Cd.a authenticationRepository) {
        Intrinsics.checkNotNullParameter(authenticationRepository, "authenticationRepository");
        this.f2666a = authenticationRepository;
    }

    public final Object a(Continuation continuation) {
        return this.f2666a.a(continuation);
    }
}
