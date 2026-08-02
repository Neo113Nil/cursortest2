package lf;

import jf.EnumC5132a;
import kf.InterfaceC5253a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5463a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5253a f55851a;

    public C5463a(InterfaceC5253a articlesRepository) {
        Intrinsics.checkNotNullParameter(articlesRepository, "articlesRepository");
        this.f55851a = articlesRepository;
    }

    public final Object a(String str, String str2, EnumC5132a enumC5132a, Continuation continuation) {
        return this.f55851a.n(str, str2, enumC5132a, continuation);
    }
}
