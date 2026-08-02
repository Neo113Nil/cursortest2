package ru.ozon.mapsdk;

import Ae.x0;
import Sc.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ve0.AbstractC10313a;
import xe.C10737n;

/* loaded from: classes3.dex */
final class l extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10737n f97584b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Throwable, Unit> f97585c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ OzonMapView f97586d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC10313a f97587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(C10737n c10737n, Function1 function1, OzonMapView ozonMapView, AbstractC10313a abstractC10313a) {
        super(0);
        this.f97584b = c10737n;
        this.f97585c = function1;
        this.f97586d = ozonMapView;
        this.f97587e = abstractC10313a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        x0 x0Var;
        C10737n c10737n = this.f97584b;
        c10737n.q(this.f97585c);
        OzonMapView ozonMapView = this.f97586d;
        x0Var = ozonMapView.f97541g;
        AbstractC10313a abstractC10313a = this.f97587e;
        x0Var.setValue(abstractC10313a);
        OzonMapView.a(ozonMapView, abstractC10313a);
        r.Companion companion = r.INSTANCE;
        Unit unit = Unit.f71690a;
        c10737n.resumeWith(unit);
        return unit;
    }
}
