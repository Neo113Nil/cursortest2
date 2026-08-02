package lf;

import kf.InterfaceC5253a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5253a f55857a;

    public g(InterfaceC5253a articlesRepository) {
        Intrinsics.checkNotNullParameter(articlesRepository, "articlesRepository");
        this.f55857a = articlesRepository;
    }

    public static /* synthetic */ Object b(g gVar, String str, String str2, String str3, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return gVar.a(str, str2, str3, z10, continuation);
    }

    public final Object a(String str, String str2, String str3, boolean z10, Continuation continuation) {
        return InterfaceC5253a.g(this.f55857a, str, str2, str3, z10, null, continuation, 16, null);
    }

    public final Object c(String str, Continuation continuation) {
        return this.f55857a.h(str, continuation);
    }
}
