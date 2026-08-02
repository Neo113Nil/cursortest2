package lf;

import java.util.List;
import kf.InterfaceC5253a;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5253a f55854a;

    public d(InterfaceC5253a articlesRepository) {
        Intrinsics.checkNotNullParameter(articlesRepository, "articlesRepository");
        this.f55854a = articlesRepository;
    }

    public static /* synthetic */ C5582a d(d dVar, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.c(str, str2, z10);
    }

    public final Object a(String str, String str2, String str3, int i10, int i11, boolean z10, Continuation continuation) {
        return this.f55854a.r(str, str2, str3, i10, i11, z10, continuation);
    }

    public final Object b(String str, String str2, String str3, int i10, int i11, Continuation continuation) {
        return this.f55854a.p(str, str2, str3, i10, i11, continuation);
    }

    public final C5582a c(String str, String str2, boolean z10) {
        return this.f55854a.s(str, str2, z10);
    }

    public final C5582a e() {
        return this.f55854a.y();
    }

    public final C5582a f(List exceptionalIds, String str) {
        Intrinsics.checkNotNullParameter(exceptionalIds, "exceptionalIds");
        return this.f55854a.o(exceptionalIds, str);
    }

    public final C5582a g(String str, String str2, String str3, boolean z10, boolean z11) {
        return this.f55854a.v(str2, str, str3, z10, z11);
    }

    public final Object h(String str, boolean z10, Continuation continuation) {
        return this.f55854a.i(str, z10, continuation);
    }

    public final C5582a i(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        return this.f55854a.a(articleId);
    }

    public final C5582a j(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        return this.f55854a.m(articleId);
    }

    public final Object k(String str, boolean z10, Continuation continuation) {
        return this.f55854a.B(str, z10, continuation);
    }
}
