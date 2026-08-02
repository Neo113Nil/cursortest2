package ru.ozon.app.android.geo.addressEditDetailV2.mapper;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addressEditDetailV2.di.AddressEditDetailV2WidgetComponent;
import ru.ozon.app.android.geo.addressEditDetailV2.presentation.AddressEditDetailV2WidgetVH;
import ru.ozon.app.android.geo.addresseditformprompt.OpenSearchActionHandler;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditDetailV2Binding;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModel;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModelImpl;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addressEditDetailV2/presentation/AddressEditDetailV2WidgetVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditDetailV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddressEditDetailV2WidgetVH> {
    final /* synthetic */ AddressEditDetailV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditDetailV2ViewMapper$holderProducer$1(AddressEditDetailV2ViewMapper addressEditDetailV2ViewMapper) {
        super(2);
        this.this$0 = addressEditDetailV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddressEditDetailV2WidgetVH invoke(View view, ComposerReferences ref) {
        AddressEditDetailV2WidgetComponent addressEditDetailV2WidgetComponent;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetAddressEditDetailV2Binding bind = WidgetAddressEditDetailV2Binding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final AddressEditDetailV2ViewMapper addressEditDetailV2ViewMapper = this.this$0;
        PvzSearcherViewModel pvzSearcherViewModel = (PvzSearcherViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.geo.addressEditDetailV2.mapper.AddressEditDetailV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddressEditDetailV2WidgetComponent addressEditDetailV2WidgetComponent2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addressEditDetailV2WidgetComponent2 = AddressEditDetailV2ViewMapper.this.component;
                PvzSearcherViewModelImpl pvzSearcherViewModel2 = addressEditDetailV2WidgetComponent2.getPvzSearcherViewModel();
                Intrinsics.g(pvzSearcherViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pvzSearcherViewModel2;
            }
        }).a(PvzSearcherViewModelImpl.class);
        OpenSearchActionHandler openSearchActionHandler = new OpenSearchActionHandler();
        B0 a12 = ref.getViewModelOwnerProvider().a();
        final AddressEditDetailV2ViewMapper addressEditDetailV2ViewMapper2 = this.this$0;
        YandexSearchSheetSharedViewModel yandexSearchSheetSharedViewModel = (YandexSearchSheetSharedViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.geo.addressEditDetailV2.mapper.AddressEditDetailV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddressEditDetailV2WidgetComponent addressEditDetailV2WidgetComponent2;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addressEditDetailV2WidgetComponent2 = AddressEditDetailV2ViewMapper.this.component;
                YandexSearchSheetSharedViewModelImpl yandexSearchSheetSharedViewModel2 = addressEditDetailV2WidgetComponent2.getYandexSearchSheetSharedViewModel();
                Intrinsics.g(yandexSearchSheetSharedViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return yandexSearchSheetSharedViewModel2;
            }
        }).a(YandexSearchSheetSharedViewModelImpl.class);
        addressEditDetailV2WidgetComponent = this.this$0.component;
        return new AddressEditDetailV2WidgetVH(bind, ref, pvzSearcherViewModel, openSearchActionHandler, yandexSearchSheetSharedViewModel, addressEditDetailV2WidgetComponent.getCustomActionHandlersStoreFactory());
    }
}
