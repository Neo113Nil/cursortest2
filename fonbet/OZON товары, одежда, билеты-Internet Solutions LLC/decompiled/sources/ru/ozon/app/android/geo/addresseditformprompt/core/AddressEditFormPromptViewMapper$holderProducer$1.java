package ru.ozon.app.android.geo.addresseditformprompt.core;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditformprompt.OpenSearchActionHandler;
import ru.ozon.app.android.geo.addresseditformprompt.di.AddressEditFormPromptWidgetComponent;
import ru.ozon.app.android.geo.addresseditformprompt.presentation.AddressEditFormPromptVH;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditFormPromptBinding;
import ru.ozon.app.android.geo.mapupdater.MapUpdateProducer;
import ru.ozon.app.android.geo.pvzSearcher.PvzSearcherViewModelImpl;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addresseditformprompt/presentation/AddressEditFormPromptVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditFormPromptViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddressEditFormPromptVH> {
    final /* synthetic */ AddressEditFormPromptViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditFormPromptViewMapper$holderProducer$1(AddressEditFormPromptViewMapper addressEditFormPromptViewMapper) {
        super(2);
        this.this$0 = addressEditFormPromptViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddressEditFormPromptVH invoke(View view, ComposerReferences ref) {
        AddressEditFormPromptWidgetComponent addressEditFormPromptWidgetComponent;
        AddressEditFormPromptWidgetComponent addressEditFormPromptWidgetComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetAddressEditFormPromptBinding bind = WidgetAddressEditFormPromptBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        OpenSearchActionHandler openSearchActionHandler = new OpenSearchActionHandler();
        addressEditFormPromptWidgetComponent = this.this$0.component;
        MapUpdateProducer mapUpdateProducer = new MapUpdateProducer(addressEditFormPromptWidgetComponent.getMapUpdateManager());
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final AddressEditFormPromptViewMapper addressEditFormPromptViewMapper = this.this$0;
        PvzSearcherViewModelImpl pvzSearcherViewModelImpl = (PvzSearcherViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.geo.addresseditformprompt.core.AddressEditFormPromptViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddressEditFormPromptWidgetComponent addressEditFormPromptWidgetComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addressEditFormPromptWidgetComponent3 = AddressEditFormPromptViewMapper.this.component;
                PvzSearcherViewModelImpl pvzSearcherViewModel = addressEditFormPromptWidgetComponent3.getPvzSearcherViewModel();
                Intrinsics.g(pvzSearcherViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pvzSearcherViewModel;
            }
        }).a(PvzSearcherViewModelImpl.class);
        B0 a12 = ref.getViewModelOwnerProvider().a();
        final AddressEditFormPromptViewMapper addressEditFormPromptViewMapper2 = this.this$0;
        YandexSearchSheetSharedViewModelImpl yandexSearchSheetSharedViewModelImpl = (YandexSearchSheetSharedViewModelImpl) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.geo.addresseditformprompt.core.AddressEditFormPromptViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                AddressEditFormPromptWidgetComponent addressEditFormPromptWidgetComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                addressEditFormPromptWidgetComponent3 = AddressEditFormPromptViewMapper.this.component;
                YandexSearchSheetSharedViewModelImpl yandexSearchSheetSharedViewModel = addressEditFormPromptWidgetComponent3.getYandexSearchSheetSharedViewModel();
                Intrinsics.g(yandexSearchSheetSharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return yandexSearchSheetSharedViewModel;
            }
        }).a(YandexSearchSheetSharedViewModelImpl.class);
        addressEditFormPromptWidgetComponent2 = this.this$0.component;
        return new AddressEditFormPromptVH(bind, ref, openSearchActionHandler, pvzSearcherViewModelImpl, yandexSearchSheetSharedViewModelImpl, addressEditFormPromptWidgetComponent2.getCustomActionHandlersStoreFactory(), mapUpdateProducer);
    }
}
