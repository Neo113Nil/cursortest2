package ru.ozon.mapsdk;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ve0.AbstractC10313a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.OzonMapView$prepareMap$2", f = "OzonMapView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ OzonMapView f97579d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC10313a f97580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(OzonMapView ozonMapView, AbstractC10313a abstractC10313a, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f97579d = ozonMapView;
        this.f97580e = abstractC10313a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f97579d, this.f97580e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        OzonMapView.a(this.f97579d, this.f97580e);
        return Unit.f71690a;
    }
}
