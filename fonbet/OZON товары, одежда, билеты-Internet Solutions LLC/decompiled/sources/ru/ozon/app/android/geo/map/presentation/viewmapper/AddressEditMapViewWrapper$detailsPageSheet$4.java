package ru.ozon.app.android.geo.map.presentation.viewmapper;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.databinding.MapDetailsBottomSheetBinding;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.PageIconsAdapter;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$detailsPageSheet$4 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$detailsPageSheet$4(AddressEditMapViewWrapper addressEditMapViewWrapper) {
        super(1);
        this.this$0 = addressEditMapViewWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        MapDetailsBottomSheetBinding mapDetailsBottomSheetBinding;
        PageIconsAdapter pageIconsAdapter;
        mapDetailsBottomSheetBinding = this.this$0.mapDetailsBottomSheetBinding;
        FrameLayout frameLayout = mapDetailsBottomSheetBinding.addressEditMapDetailsBottomSheetContainerContent;
        pageIconsAdapter = this.this$0.pageIconsAdapter;
        Intrinsics.f(frameLayout);
        pageIconsAdapter.onSlide(frameLayout);
    }
}
