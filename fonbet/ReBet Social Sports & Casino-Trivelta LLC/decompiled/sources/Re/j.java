package Re;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10218a;

    public j(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10218a = conversationsRepository;
    }

    public final Object a(String str, Continuation continuation) {
        return this.f10218a.i(str, continuation);
    }
}
