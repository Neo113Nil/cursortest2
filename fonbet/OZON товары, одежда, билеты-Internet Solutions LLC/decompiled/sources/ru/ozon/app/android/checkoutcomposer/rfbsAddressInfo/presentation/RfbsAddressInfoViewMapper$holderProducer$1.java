package ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.di.RfbsAddressInfoWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/presentation/RfbsAddressInfoVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RfbsAddressInfoViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, RfbsAddressInfoVH> {
    final /* synthetic */ RfbsAddressInfoViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RfbsAddressInfoViewMapper$holderProducer$1(RfbsAddressInfoViewMapper rfbsAddressInfoViewMapper) {
        super(2);
        this.this$0 = rfbsAddressInfoViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final RfbsAddressInfoVH invoke(View view, ComposerReferences ref) {
        RfbsAddressInfoWidgetComponent rfbsAddressInfoWidgetComponent;
        RfbsAddressInfoWidgetComponent rfbsAddressInfoWidgetComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        RecyclerView recyclerView = (RecyclerView) view;
        rfbsAddressInfoWidgetComponent = this.this$0.component;
        HandlersInhibitor handlersInhibitor = rfbsAddressInfoWidgetComponent.getHandlersInhibitor();
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final RfbsAddressInfoViewMapper rfbsAddressInfoViewMapper = this.this$0;
        YandexSearchSheetSharedViewModelImpl yandexSearchSheetSharedViewModelImpl = (YandexSearchSheetSharedViewModelImpl) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.presentation.RfbsAddressInfoViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                RfbsAddressInfoWidgetComponent rfbsAddressInfoWidgetComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                rfbsAddressInfoWidgetComponent3 = RfbsAddressInfoViewMapper.this.component;
                YandexSearchSheetSharedViewModelImpl yandexSearchSheetSharedViewModel = rfbsAddressInfoWidgetComponent3.getYandexSearchSheetSharedViewModel();
                Intrinsics.g(yandexSearchSheetSharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return yandexSearchSheetSharedViewModel;
            }
        }).a(YandexSearchSheetSharedViewModelImpl.class);
        rfbsAddressInfoWidgetComponent2 = this.this$0.component;
        return new RfbsAddressInfoVH(recyclerView, ref, handlersInhibitor, rfbsAddressInfoWidgetComponent2.getAppType(), yandexSearchSheetSharedViewModelImpl);
    }
}
