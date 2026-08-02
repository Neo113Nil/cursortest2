package ru.ozon.mapsdk.libre.placemark.view;

import Sc.s;
import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import we0.h;

@e(c = "ru.ozon.mapsdk.libre.placemark.view.LibreMarker$startObserveUpdateCameraPos$1", f = "LibreMarker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<h, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f97601d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b<View> f97602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b<View> bVar, d<? super c> dVar) {
        super(2, dVar);
        this.f97602e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f97602e, dVar);
        cVar.f97601d = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h hVar, d<? super Unit> dVar) {
        return ((c) create(hVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        h hVar = (h) this.f97601d;
        b<View> bVar = this.f97602e;
        bVar.o();
        ((b) bVar).f97599i = hVar;
        bVar.p(hVar.a().b());
        return Unit.f71690a;
    }
}
