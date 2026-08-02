package ru.ozon.mapsdk;

import Ae.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class m extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ve0.b f97603b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ OzonMapView f97604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(OzonMapView ozonMapView, ve0.b bVar) {
        super(1);
        this.f97603b = bVar;
        this.f97604c = ozonMapView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        x0 x0Var;
        ve0.b bVar = this.f97603b;
        if (bVar != null) {
            bVar.clear();
        }
        OzonMapView ozonMapView = this.f97604c;
        x0Var = ozonMapView.f97541g;
        ve0.b bVar2 = (ve0.b) x0Var.getValue();
        if (bVar2 != null) {
            bVar2.clear();
        }
        ozonMapView.removeAllViews();
        return Unit.f71690a;
    }
}
