package ru.ozon.id.logout.data;

import B0.A0;
import Ic0.i;
import Sc.InterfaceC4008j;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.id.logout.data.api.LogoutComposerApi;
import ru.ozon.id.logout.data.api.LogoutResponse;
import xe.M;

@e(c = "ru.ozon.id.logout.data.LogoutRepository$logout$2", f = "LogoutRepository.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super LogoutResponse>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97158d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f97159e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f97160f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f97161g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Boolean f97162h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Yb0.a f97163i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, boolean z11, boolean z12, Boolean bool, Yb0.a aVar, kotlin.coroutines.d<? super c> dVar2) {
        super(2, dVar2);
        this.f97159e = dVar;
        this.f97160f = z11;
        this.f97161g = z12;
        this.f97162h = bool;
        this.f97163i = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f97159e, this.f97160f, this.f97161g, this.f97162h, this.f97163i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super LogoutResponse> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97158d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        d dVar = this.f97159e;
        interfaceC4008j = dVar.f97167d;
        ((i) interfaceC4008j.getValue()).b(this.f97160f);
        Tc.d builder = new Tc.d();
        builder.putAll(d.d(dVar));
        Yb0.a aVar2 = this.f97163i;
        if (aVar2 != null) {
            builder.put("reason", aVar2.a());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.d u11 = builder.u();
        String b11 = A0.b("composer-api.bx/_action/", d.a(dVar), "?isSdk=true");
        LogoutComposerApi logoutComposerApi = (LogoutComposerApi) dVar.f97165b.getValue();
        this.f97158d = 1;
        Object logout = logoutComposerApi.logout(b11, this.f97161g, this.f97162h, u11, this);
        return logout == aVar ? aVar : logout;
    }
}
