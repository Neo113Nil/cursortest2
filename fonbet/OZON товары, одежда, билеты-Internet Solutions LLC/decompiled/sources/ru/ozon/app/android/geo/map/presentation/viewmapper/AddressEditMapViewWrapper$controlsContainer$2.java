package ru.ozon.app.android.geo.map.presentation.viewmapper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$SearchIcon$SearchDialogOptions;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$controlsContainer$2 extends AbstractC7737t implements Function1<AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions, Unit> {
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$controlsContainer$2(AddressEditMapViewWrapper addressEditMapViewWrapper) {
        super(1);
        this.this$0 = addressEditMapViewWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions searchDialogOptions) {
        invoke2(searchDialogOptions);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressEditMapVO.MapIcon.SearchIcon.SearchDialogOptions it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AddressEditMapViewListener mapListener = this.this$0.getMapListener();
        if (mapListener != null) {
            l invoke = this.this$0.getViewObjectProvider().invoke();
            mapListener.onSearchAction(it, invoke != null ? invoke.n() : null);
        }
    }
}
