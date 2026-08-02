package lf;

import kf.InterfaceC5253a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5253a f55856a;

    public f(InterfaceC5253a articlesRepository) {
        Intrinsics.checkNotNullParameter(articlesRepository, "articlesRepository");
        this.f55856a = articlesRepository;
    }

    public final Object a(String str, String str2, boolean z10, Continuation continuation) {
        return this.f55856a.b(str, str2, z10, continuation);
    }
}
