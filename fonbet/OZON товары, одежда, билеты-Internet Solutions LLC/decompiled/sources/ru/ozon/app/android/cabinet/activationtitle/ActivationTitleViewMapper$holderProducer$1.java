package ru.ozon.app.android.cabinet.activationtitle;

import Pc.a;
import a00.C4911f;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.cabinet.activationtitle.presentation.DiscountCodeViewModel;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cabinet/activationtitle/ActivationTitleWidgetViewHolder;", "v", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ActivationTitleViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ActivationTitleWidgetViewHolder> {
    final /* synthetic */ CheckoutPrefetchController $checkoutPrefetchController;
    final /* synthetic */ a<DiscountCodeViewModel> $pViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivationTitleViewMapper$holderProducer$1(CheckoutPrefetchController checkoutPrefetchController, a<DiscountCodeViewModel> aVar) {
        super(2);
        this.$checkoutPrefetchController = checkoutPrefetchController;
        this.$pViewModel = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ActivationTitleWidgetViewHolder invoke(View v11, final ComposerReferences references) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(references, "references");
        C4911f container = references.getContainer();
        InterfaceC7851b controller = references.getController();
        B0 a11 = references.getViewModelOwnerProvider().a();
        final a<DiscountCodeViewModel> aVar = this.$pViewModel;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.cabinet.activationtitle.ActivationTitleViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DiscountCodeViewModel discountCodeViewModel = (DiscountCodeViewModel) a.this.get();
                discountCodeViewModel.initCodeAnalytics(references.getAnalyticsScreenStorage());
                Intrinsics.g(discountCodeViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return discountCodeViewModel;
            }
        }).a(DiscountCodeViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        return new ActivationTitleWidgetViewHolder(v11, container, controller, (DiscountCodeViewModel) a12, this.$checkoutPrefetchController);
    }
}
