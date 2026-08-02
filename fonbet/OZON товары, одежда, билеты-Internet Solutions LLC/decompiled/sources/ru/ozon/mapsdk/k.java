package ru.ozon.mapsdk;

import Ae.x0;
import Sc.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10737n;

/* loaded from: classes3.dex */
final class k extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OzonMapView f97581b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ve0.b f97582c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10737n f97583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(OzonMapView ozonMapView, ve0.b bVar, C10737n c10737n) {
        super(0);
        this.f97581b = ozonMapView;
        this.f97582c = bVar;
        this.f97583d = c10737n;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        x0 x0Var;
        x0Var = this.f97581b.f97541g;
        x0Var.setValue(this.f97582c);
        r.Companion companion = r.INSTANCE;
        Unit unit = Unit.f71690a;
        this.f97583d.resumeWith(unit);
        return unit;
    }
}
