package ru.ozon.id.nativeauth.sso2;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainsAuthMobileInteractor", f = "Sso2DomainsAuthMobileInteractor.kt", l = {103}, m = "isLogsEnabled")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f97434d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f97435e;

    /* renamed from: f, reason: collision with root package name */
    int f97436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(r rVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97435e = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object j11;
        this.f97434d = obj;
        this.f97436f |= LinearLayoutManager.INVALID_OFFSET;
        j11 = this.f97435e.j(this);
        return j11;
    }
}
