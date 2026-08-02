package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class FreshTileViewModel$observeActionBarState$2 extends C7735q implements Function2<ProductActionBarVO, d<? super Unit>, Object> {
    FreshTileViewModel$observeActionBarState$2(Object obj) {
        super(2, obj, Intrinsics.a.class, "suspendConversion0", "observeActionBarState$suspendConversion0(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProductActionBarVO productActionBarVO, d<? super Unit> dVar) {
        Object observeActionBarState$suspendConversion0;
        observeActionBarState$suspendConversion0 = FreshTileViewModel.observeActionBarState$suspendConversion0((Function1) this.receiver, productActionBarVO, dVar);
        return observeActionBarState$suspendConversion0;
    }
}
