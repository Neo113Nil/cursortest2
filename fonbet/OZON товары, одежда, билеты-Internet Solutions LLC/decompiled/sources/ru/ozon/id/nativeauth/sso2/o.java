package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainsAuthMobileInteractor", f = "Sso2DomainsAuthMobileInteractor.kt", l = {119, 120}, m = "saveSsoMobileConfig")
/* loaded from: classes3.dex */
final class o extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    r f97443d;

    /* renamed from: e, reason: collision with root package name */
    Sso2DomainsAuthMobileResponse f97444e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f97445f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f97446g;

    /* renamed from: h, reason: collision with root package name */
    int f97447h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97446g = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object l11;
        this.f97445f = obj;
        this.f97447h |= LinearLayoutManager.INVALID_OFFSET;
        l11 = this.f97446g.l(null, this);
        return l11;
    }
}
