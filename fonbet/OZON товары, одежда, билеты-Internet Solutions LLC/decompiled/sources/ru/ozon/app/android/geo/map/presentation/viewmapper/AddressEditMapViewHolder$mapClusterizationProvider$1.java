package ru.ozon.app.android.geo.map.presentation.viewmapper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddressEditMapViewHolder$mapClusterizationProvider$1 extends C7735q implements Function1<String, Unit> {
    AddressEditMapViewHolder$mapClusterizationProvider$1(Object obj) {
        super(1, obj, AddressEditMapViewHolder.class, "handleClusterPinClick", "handleClusterPinClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AddressEditMapViewHolder) this.receiver).handleClusterPinClick(p02);
    }
}
