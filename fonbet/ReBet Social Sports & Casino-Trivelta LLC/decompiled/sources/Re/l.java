package Re;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Qe.a f10220a;

    public l(Qe.a conversationsRepository) {
        Intrinsics.checkNotNullParameter(conversationsRepository, "conversationsRepository");
        this.f10220a = conversationsRepository;
    }

    public final Object a(String str, String str2, Continuation continuation) {
        return this.f10220a.c(str, str2, continuation);
    }
}
