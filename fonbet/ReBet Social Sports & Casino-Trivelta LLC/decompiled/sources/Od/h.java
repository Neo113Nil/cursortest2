package Od;

import ie.EnumC4544a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Nd.a f8628a;

    public h(Nd.a brandRepository) {
        Intrinsics.checkNotNullParameter(brandRepository, "brandRepository");
        this.f8628a = brandRepository;
    }

    public final Object a(boolean z10, String str, EnumC4544a enumC4544a, Continuation continuation) {
        return this.f8628a.c(z10, str, enumC4544a, continuation);
    }
}
