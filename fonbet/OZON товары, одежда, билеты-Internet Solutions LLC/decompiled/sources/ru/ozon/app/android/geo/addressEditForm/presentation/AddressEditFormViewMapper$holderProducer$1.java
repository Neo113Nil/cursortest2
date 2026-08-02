package ru.ozon.app.android.geo.addressEditForm.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.geo.addressEditForm.di.AddressEditFormWidgetComponent;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditFormBinding;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addressEditForm/presentation/AddressEditFormVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditFormViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddressEditFormVH> {
    final /* synthetic */ AddressEditFormViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditFormViewMapper$holderProducer$1(AddressEditFormViewMapper addressEditFormViewMapper) {
        super(2);
        this.this$0 = addressEditFormViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddressEditFormVH invoke(View view, ComposerReferences ref) {
        AddressEditFormWidgetComponent addressEditFormWidgetComponent;
        AddressEditFormWidgetComponent addressEditFormWidgetComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetAddressEditFormBinding bind = WidgetAddressEditFormBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        addressEditFormWidgetComponent = this.this$0.component;
        HandlersInhibitor handlersInhibitor = addressEditFormWidgetComponent.getHandlersInhibitor();
        addressEditFormWidgetComponent2 = this.this$0.component;
        AddressEditFormOnBoardingViewModel onBoardingViewModel = addressEditFormWidgetComponent2.getOnBoardingViewModel();
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final AddressEditFormViewMapper addressEditFormViewMapper = this.this$0;
        return new AddressEditFormVH(ref, onBoardingViewModel, bind, handlersInhibitor, (YandexSearchSheetSharedViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.geo.addressEditForm.presentation.AddressEditFormViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddressEditFormWidgetComponent addressEditFormWidgetComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addressEditFormWidgetComponent3 = AddressEditFormViewMapper.this.component;
                YandexSearchSheetSharedViewModelImpl showYandexSearchSheetViewModel = addressEditFormWidgetComponent3.getShowYandexSearchSheetViewModel();
                Intrinsics.g(showYandexSearchSheetViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return showYandexSearchSheetViewModel;
            }
        }).a(YandexSearchSheetSharedViewModelImpl.class));
    }
}
