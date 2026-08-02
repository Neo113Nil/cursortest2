package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation;

import Vg.d;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.di.AddressEditPickupDetailWidgetComponent;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditPickupDetailV2Binding;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailWidgetVH;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditPickUpDetailViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddressEditPickUpDetailWidgetVH> {
    final /* synthetic */ AddressEditPickUpDetailViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditPickUpDetailViewMapper$holderProducer$1(AddressEditPickUpDetailViewMapper addressEditPickUpDetailViewMapper) {
        super(2);
        this.this$0 = addressEditPickUpDetailViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddressEditPickUpDetailWidgetVH invoke(View view, ComposerReferences ref) {
        AddressEditPickupDetailWidgetComponent addressEditPickupDetailWidgetComponent;
        AddressEditPickupDetailWidgetComponent addressEditPickupDetailWidgetComponent2;
        AddressEditPickupDetailWidgetComponent addressEditPickupDetailWidgetComponent3;
        AddressEditPickupDetailWidgetComponent addressEditPickupDetailWidgetComponent4;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetAddressEditPickupDetailV2Binding bind = WidgetAddressEditPickupDetailV2Binding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        AddressEditPickUpDetailRouter addressEditPickUpDetailRouter = new AddressEditPickUpDetailRouter();
        addressEditPickupDetailWidgetComponent = this.this$0.component;
        d customActionHandlersStoreFactory = addressEditPickupDetailWidgetComponent.getCustomActionHandlersStoreFactory();
        addressEditPickupDetailWidgetComponent2 = this.this$0.component;
        AddressEditPickupDetailOnBoardingViewModel onBoardingViewModel = addressEditPickupDetailWidgetComponent2.getOnBoardingViewModel();
        addressEditPickupDetailWidgetComponent3 = this.this$0.component;
        boolean z11 = addressEditPickupDetailWidgetComponent3.getAppType() == AppType.SELECT;
        addressEditPickupDetailWidgetComponent4 = this.this$0.component;
        return new AddressEditPickUpDetailWidgetVH(bind, ref, addressEditPickUpDetailRouter, customActionHandlersStoreFactory, onBoardingViewModel, z11, addressEditPickupDetailWidgetComponent4.getTokenizedAnalytics());
    }
}
