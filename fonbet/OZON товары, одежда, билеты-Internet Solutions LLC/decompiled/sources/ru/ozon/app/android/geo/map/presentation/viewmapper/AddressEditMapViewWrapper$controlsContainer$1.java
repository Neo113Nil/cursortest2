package ru.ozon.app.android.geo.map.presentation.viewmapper;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWZ/t;", "it", "", "invoke", "(LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$controlsContainer$1 extends AbstractC7737t implements Function1<t, Unit> {
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$controlsContainer$1(AddressEditMapViewWrapper addressEditMapViewWrapper) {
        super(1);
        this.this$0 = addressEditMapViewWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar) {
        this.this$0.canShowLocationDisabledRestriction = true;
        AddressEditMapViewListener mapListener = this.this$0.getMapListener();
        if (mapListener != null) {
            mapListener.onCurrentLocationAction(tVar, true);
        }
    }
}
