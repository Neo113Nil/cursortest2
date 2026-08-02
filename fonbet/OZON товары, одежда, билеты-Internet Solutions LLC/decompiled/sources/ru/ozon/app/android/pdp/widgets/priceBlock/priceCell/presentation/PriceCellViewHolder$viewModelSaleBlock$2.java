package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import a00.h;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.view.animationsaleblock.ObjectAnimation;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceCellViewHolder$viewModelSaleBlock$2 extends AbstractC7737t implements Function0<SaleBlockViewModel> {
    final /* synthetic */ SaleBlockViewModel $saleBlockViewModel;
    final /* synthetic */ PriceCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCellViewHolder$viewModelSaleBlock$2(PriceCellViewHolder priceCellViewHolder, SaleBlockViewModel saleBlockViewModel) {
        super(0);
        this.this$0 = priceCellViewHolder;
        this.$saleBlockViewModel = saleBlockViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SaleBlockViewModel invoke() {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        composerReferences = this.this$0.refs;
        h viewModelOwnerProvider = composerReferences.getViewModelOwnerProvider();
        final SaleBlockViewModel saleBlockViewModel = this.$saleBlockViewModel;
        w0 a11 = new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCellViewHolder$viewModelSaleBlock$2$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SaleBlockViewModel saleBlockViewModel2 = SaleBlockViewModel.this;
                Intrinsics.g(saleBlockViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return saleBlockViewModel2;
            }
        }).a(SaleBlockViewModel.class);
        PriceCellViewHolder priceCellViewHolder = this.this$0;
        SaleBlockViewModel saleBlockViewModel2 = (SaleBlockViewModel) a11;
        P<ObjectAnimation> events = saleBlockViewModel2.getEvents();
        composerReferences2 = priceCellViewHolder.refs;
        events.observe(composerReferences2.getContainer().g(), new PriceCellViewHolder$sam$androidx_lifecycle_Observer$0(new PriceCellViewHolder$viewModelSaleBlock$2$2$1(priceCellViewHolder)));
        return saleBlockViewModel2;
    }
}
