package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainsAuthMobileInteractor", f = "Sso2DomainsAuthMobileInteractor.kt", l = {87}, m = "handleDomainsWithNoAuthActions")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    r f97428d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f97429e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f97430f;

    /* renamed from: g, reason: collision with root package name */
    int f97431g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97430f = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object i11;
        this.f97429e = obj;
        this.f97431g |= LinearLayoutManager.INVALID_OFFSET;
        i11 = this.f97430f.i(null, this);
        return i11;
    }
}
