package ru.ozon.app.android.checkoutcomposer.addressPartsInput.core;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.databinding.WidgetPostAddressChangerBinding;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.di.AddressPartsInputComponent;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputVH;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputViewModel;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressPartsInputViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddressPartsInputVH> {
    final /* synthetic */ AddressPartsInputViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressPartsInputViewMapper$holderProducer$1(AddressPartsInputViewMapper addressPartsInputViewMapper) {
        super(2);
        this.this$0 = addressPartsInputViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddressPartsInputVH invoke(View view, ComposerReferences ref) {
        AddressPartsInputComponent addressPartsInputComponent;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetPostAddressChangerBinding bind = WidgetPostAddressChangerBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = ref.getContainer().a();
        if (a11 == null) {
            a11 = ref.getViewModelOwnerProvider().a();
        }
        final AddressPartsInputViewMapper addressPartsInputViewMapper = this.this$0;
        AddressPartsInputViewModel addressPartsInputViewModel = (AddressPartsInputViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.addressPartsInput.core.AddressPartsInputViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddressPartsInputComponent addressPartsInputComponent2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addressPartsInputComponent2 = AddressPartsInputViewMapper.this.component;
                AddressPartsInputViewModel viewModel = addressPartsInputComponent2.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(AddressPartsInputViewModel.class);
        addressPartsInputComponent = this.this$0.component;
        return new AddressPartsInputVH(ref, bind, addressPartsInputViewModel, addressPartsInputComponent.getCustomActionHandlersStoreFactory());
    }
}
