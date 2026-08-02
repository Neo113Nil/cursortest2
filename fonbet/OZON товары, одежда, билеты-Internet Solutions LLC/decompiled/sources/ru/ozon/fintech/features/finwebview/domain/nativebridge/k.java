package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import Ae.C0;
import Sc.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator$handleJsCallSync$2", f = "NativeBridgeConfigurator.kt", l = {1606}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f95634d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ NativeBridgeConfigurator f95635e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ NativeResult.Success f95636f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f95637g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f95638h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(NativeBridgeConfigurator nativeBridgeConfigurator, NativeResult.Success success, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f95635e = nativeBridgeConfigurator;
        this.f95636f = success;
        this.f95637g = str;
        this.f95638h = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f95635e, this.f95636f, this.f95637g, this.f95638h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f95634d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f95635e.f95566n0;
            v vVar = new v(this.f95636f.getResult(), this.f95637g, this.f95638h);
            this.f95634d = 1;
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
