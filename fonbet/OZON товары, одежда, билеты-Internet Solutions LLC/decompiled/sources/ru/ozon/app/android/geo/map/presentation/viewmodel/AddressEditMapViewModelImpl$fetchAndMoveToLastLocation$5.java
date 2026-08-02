package ru.ozon.app.android.geo.map.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$5 extends C7735q implements Function1<Throwable, Unit> {
    AddressEditMapViewModelImpl$fetchAndMoveToLastLocation$5(Object obj) {
        super(1, obj, AddressEditMapViewModelImpl.class, "onErrorUserLocation", "onErrorUserLocation(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AddressEditMapViewModelImpl) this.receiver).onErrorUserLocation(p02);
    }
}
