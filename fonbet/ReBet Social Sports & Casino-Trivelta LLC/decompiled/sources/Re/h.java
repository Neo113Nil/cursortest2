package Re;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10216a;

    public h(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10216a = conversationsRepository;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        return this.f10216a.h(str, str2, continuation);
    }
}
