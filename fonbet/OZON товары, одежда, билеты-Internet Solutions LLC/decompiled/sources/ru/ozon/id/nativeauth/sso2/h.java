package ru.ozon.id.nativeauth.sso2;

import java.net.URI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2DomainsAuthMobileInteractor$auth$listOfDeferred$1$1", f = "Sso2DomainsAuthMobileInteractor.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super u>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97414d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f97415e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f97416f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ t f97417g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Sso2DomainsAuthMobileResponse f97418h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(String str, r rVar, t tVar, Sso2DomainsAuthMobileResponse sso2DomainsAuthMobileResponse, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f97415e = str;
        this.f97416f = rVar;
        this.f97417g = tVar;
        this.f97418h = sso2DomainsAuthMobileResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f97415e, this.f97416f, this.f97417g, this.f97418h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super u> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97414d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        String host = URI.create(this.f97415e).getHost();
        Intrinsics.f(host);
        this.f97414d = 1;
        Object a11 = r.a(this.f97416f, this.f97417g, this.f97415e, host, this.f97418h, this);
        return a11 == aVar ? aVar : a11;
    }
}
