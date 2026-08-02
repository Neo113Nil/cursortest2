package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import Ae.C0;
import Sc.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$handleJsCallSync$3", f = "NativeBridgeConfigurator.kt", l = {1616}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f95639d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ NativeBridgeConfigurator f95640e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f95641f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f95642g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f95643h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(NativeBridgeConfigurator nativeBridgeConfigurator, String str, String str2, String str3, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f95640e = nativeBridgeConfigurator;
        this.f95641f = str;
        this.f95642g = str2;
        this.f95643h = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f95640e, this.f95641f, this.f95642g, this.f95643h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f95639d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f95640e.f95566n0;
            v vVar = new v(this.f95641f, this.f95642g, this.f95643h);
            this.f95639d = 1;
            if (c02.emit(vVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
