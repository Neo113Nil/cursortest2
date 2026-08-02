package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FreshTileDelegate$onAttach$1 extends C7719a implements Function1<ProductActionBarVO, Unit> {
    FreshTileDelegate$onAttach$1(Object obj) {
        super(1, obj, FreshTileDelegate.class, "updateActionBar", "updateActionBar(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProductActionBarVO productActionBarVO) {
        invoke2(productActionBarVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductActionBarVO p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        FreshTileDelegate.updateActionBar$default((FreshTileDelegate) this.receiver, p02, null, null, 6, null);
    }
}
