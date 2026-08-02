package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.databinding.WidgetLargeOrdersLiftingV2Binding;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di.LargeOrdersLiftingV2Component;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.util.KeyboardVisibilityHelper;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.viewmodel.LargeOrdersLiftingV2ViewModel;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/LargeOrdersLiftingV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class LargeOrdersLiftingV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, LargeOrdersLiftingV2ViewHolder> {
    final /* synthetic */ LargeOrdersLiftingV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LargeOrdersLiftingV2ViewMapper$holderProducer$1(LargeOrdersLiftingV2ViewMapper largeOrdersLiftingV2ViewMapper) {
        super(2);
        this.this$0 = largeOrdersLiftingV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LargeOrdersLiftingV2ViewHolder invoke(View view, ComposerReferences refs) {
        LargeOrdersLiftingV2Component largeOrdersLiftingV2Component;
        LargeOrdersLiftingV2Component largeOrdersLiftingV2Component2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetLargeOrdersLiftingV2Binding bind = WidgetLargeOrdersLiftingV2Binding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final LargeOrdersLiftingV2ViewMapper largeOrdersLiftingV2ViewMapper = this.this$0;
        LargeOrdersLiftingV2ViewModel largeOrdersLiftingV2ViewModel = (LargeOrdersLiftingV2ViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.LargeOrdersLiftingV2ViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                LargeOrdersLiftingV2Component largeOrdersLiftingV2Component3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                largeOrdersLiftingV2Component3 = LargeOrdersLiftingV2ViewMapper.this.component;
                LargeOrdersLiftingV2ViewModel viewModel = largeOrdersLiftingV2Component3.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(LargeOrdersLiftingV2ViewModel.class);
        largeOrdersLiftingV2Component = this.this$0.component;
        KeyboardVisibilityHelper keyboardVisibilityHelper = largeOrdersLiftingV2Component.getKeyboardVisibilityHelper();
        largeOrdersLiftingV2Component2 = this.this$0.component;
        return new LargeOrdersLiftingV2ViewHolder(bind, largeOrdersLiftingV2ViewModel, keyboardVisibilityHelper, largeOrdersLiftingV2Component2.getFloorInputFilter(), refs);
    }
}
