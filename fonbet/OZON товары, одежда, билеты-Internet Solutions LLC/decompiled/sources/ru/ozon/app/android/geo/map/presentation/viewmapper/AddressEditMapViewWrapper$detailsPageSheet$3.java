package ru.ozon.app.android.geo.map.presentation.viewmapper;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.databinding.MapDetailsBottomSheetBinding;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.PageIconsAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$detailsPageSheet$3 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$detailsPageSheet$3(AddressEditMapViewWrapper addressEditMapViewWrapper) {
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
        RecyclerView recyclerView;
        mapDetailsBottomSheetBinding = this.this$0.mapDetailsBottomSheetBinding;
        FrameLayout frameLayout = mapDetailsBottomSheetBinding.addressEditMapDetailsBottomSheetContainerContent;
        onLayoutChangeListener = this.this$0.bottomSheetComposerLayoutChangeListener;
        frameLayout.removeOnLayoutChangeListener(onLayoutChangeListener);
        pageIconsAdapter = this.this$0.pageIconsAdapter;
        ViewGroup Z11 = this.this$0.getContainer().Z();
        recyclerView = this.this$0.composerRecyclerView;
        pageIconsAdapter.changeAnchor(Z11, recyclerView);
        this.this$0.slideUp();
    }
}
