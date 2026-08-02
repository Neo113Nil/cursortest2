package ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.core;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerHeaderViewModel;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyV3/presentation/SellerTransparencyV3ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SellerTransparencyV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SellerTransparencyV3ViewHolder> {
    final /* synthetic */ SellerTransparencyV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerTransparencyV3ViewMapper$holderProducer$1(SellerTransparencyV3ViewMapper sellerTransparencyV3ViewMapper) {
        super(2);
        this.this$0 = sellerTransparencyV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SellerTransparencyV3ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final SellerTransparencyV3ViewMapper sellerTransparencyV3ViewMapper = this.this$0;
        SellerHeaderViewModel sellerHeaderViewModel = (SellerHeaderViewModel) new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.core.SellerTransparencyV3ViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SellerHeaderViewModel sellerHeaderViewModel2 = SellerTransparencyV3ViewMapper.this.component().getSellerHeaderViewModel();
                Intrinsics.g(sellerHeaderViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sellerHeaderViewModel2;
            }
        }).a(SellerHeaderViewModel.class);
        h viewModelOwnerProvider2 = refs.getViewModelOwnerProvider();
        final SellerTransparencyV3ViewMapper sellerTransparencyV3ViewMapper2 = this.this$0;
        return new SellerTransparencyV3ViewHolder(view, refs, sellerHeaderViewModel, (SharedSellerViewModel) new z0(viewModelOwnerProvider2.b(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.core.SellerTransparencyV3ViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SharedSellerViewModel sharedSellerViewModel = SellerTransparencyV3ViewMapper.this.component().getSharedSellerViewModel();
                Intrinsics.g(sharedSellerViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sharedSellerViewModel;
            }
        }).a(SharedSellerViewModel.class), this.this$0.component().getCustomActionHandlersStoreFactory(), this.this$0.component().getSisBrandFavoriteButtonDelegateFactory());
    }
}
