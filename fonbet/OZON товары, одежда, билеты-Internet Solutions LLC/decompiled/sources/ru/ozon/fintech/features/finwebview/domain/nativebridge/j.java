package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import Ae.C0;
import Sc.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$handleJsCallSync$1", f = "NativeBridgeConfigurator.kt", l = {1599}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f95629d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ NativeBridgeConfigurator f95630e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f95631f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f95632g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f95633h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(NativeBridgeConfigurator nativeBridgeConfigurator, String str, String str2, String str3, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f95630e = nativeBridgeConfigurator;
        this.f95631f = str;
        this.f95632g = str2;
        this.f95633h = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f95630e, this.f95631f, this.f95632g, this.f95633h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f95629d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f95630e.f95566n0;
            v vVar = new v(this.f95631f, this.f95632g, this.f95633h);
            this.f95629d = 1;
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
