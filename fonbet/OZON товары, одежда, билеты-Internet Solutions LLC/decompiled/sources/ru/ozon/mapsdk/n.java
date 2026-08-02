package ru.ozon.mapsdk;

import Sc.s;
import ie0.C7064a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.OzonMapView$subscribeOnChangeAnalytics$1", f = "OzonMapView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ boolean f97605d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ OzonMapView f97606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(OzonMapView ozonMapView, kotlin.coroutines.d<? super n> dVar) {
        super(2, dVar);
        this.f97606e = ozonMapView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        n nVar = new n(this.f97606e, dVar);
        nVar.f97605d = ((Boolean) obj).booleanValue();
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((n) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        if (this.f97605d) {
            C7064a.f66281a.getClass();
            if (C7064a.h() != null) {
                this.f97606e.q();
            }
        }
        return Unit.f71690a;
    }
}
