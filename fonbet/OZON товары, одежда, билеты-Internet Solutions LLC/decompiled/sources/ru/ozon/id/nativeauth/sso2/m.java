package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainsAuthMobileInteractor", f = "Sso2DomainsAuthMobileInteractor.kt", l = {95, 100}, m = "removeFromSsoMobileConfig")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    r f97437d;

    /* renamed from: e, reason: collision with root package name */
    List f97438e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f97439f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f97440g;

    /* renamed from: h, reason: collision with root package name */
    int f97441h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97440g = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object k11;
        this.f97439f = obj;
        this.f97441h |= LinearLayoutManager.INVALID_OFFSET;
        k11 = this.f97440g.k(null, this);
        return k11;
    }
}
