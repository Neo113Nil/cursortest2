package lf;

import kf.InterfaceC5253a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5253a f55853a;

    public c(InterfaceC5253a articlesRepository) {
        Intrinsics.checkNotNullParameter(articlesRepository, "articlesRepository");
        this.f55853a = articlesRepository;
    }

    public final Object a(String str, String str2, boolean z10, Continuation continuation) {
        return this.f55853a.f(str2, str, z10, continuation);
    }

    public final C5582a b(String str, String str2, String str3) {
        return this.f55853a.z(str, str2, str3);
    }
}
