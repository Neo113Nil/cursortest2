package ru.ozon.app.android.geo.map.presentation.viewmapper;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.databinding.MapDetailsBottomSheetBinding;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.PageIconsAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$detailsPageSheet$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$detailsPageSheet$2(AddressEditMapViewWrapper addressEditMapViewWrapper) {
        super(0);
        this.this$0 = addressEditMapViewWrapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MapDetailsBottomSheetBinding mapDetailsBottomSheetBinding;
        View.OnLayoutChangeListener onLayoutChangeListener;
        PageIconsAdapter pageIconsAdapter;
        mapDetailsBottomSheetBinding = this.this$0.mapDetailsBottomSheetBinding;
        FrameLayout frameLayout = mapDetailsBottomSheetBinding.addressEditMapDetailsBottomSheetContainerContent;
        onLayoutChangeListener = this.this$0.bottomSheetComposerLayoutChangeListener;
        frameLayout.addOnLayoutChangeListener(onLayoutChangeListener);
        pageIconsAdapter = this.this$0.pageIconsAdapter;
        pageIconsAdapter.changeAnchor(this.this$0.getContainer().Z(), this.this$0.getContainer().Z().findViewById(R$id.addressEditMapDetailsBottomSheetContainerContent));
    }
}
