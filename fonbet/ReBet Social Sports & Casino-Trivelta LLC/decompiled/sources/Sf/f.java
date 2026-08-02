package Sf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Pf.a f10755a;

    public f(Pf.a triggersRepository) {
        Intrinsics.checkNotNullParameter(triggersRepository, "triggersRepository");
        this.f10755a = triggersRepository;
    }

    public final Object a(String str, String str2, boolean z10, boolean z11, Continuation continuation) {
        return this.f10755a.g(str, str2, z10, z11, continuation);
    }
}
