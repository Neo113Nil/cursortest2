package Re;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10219a;

    public k(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10219a = conversationsRepository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.f10219a.d(str, continuation);
    }
}
