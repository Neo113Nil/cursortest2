package ru.ozon.app.android.geo.map.presentation.viewmapper;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$handlePinClick$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ t $event;
    final /* synthetic */ String $link;
    final /* synthetic */ AddressEditMapVO.ViewPort $viewPort;
    final /* synthetic */ float $zoom;
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$handlePinClick$1(AddressEditMapViewWrapper addressEditMapViewWrapper, String str, float f7, AddressEditMapVO.ViewPort viewPort, t tVar) {
        super(0);
        this.this$0 = addressEditMapViewWrapper;
        this.$link = str;
        this.$zoom = f7;
        this.$viewPort = viewPort;
        this.$event = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AddressEditMapViewListener mapListener = this.this$0.getMapListener();
        if (mapListener != null) {
            mapListener.onPinClickedAction(this.$link, this.$zoom, this.$viewPort, this.$event);
        }
    }
}
