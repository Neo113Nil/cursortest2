package ru.ozon.app.android.geo.addresseditcarousel.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addresseditcarousel.di.AddressEditCarouselWidgetComponent;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditCarouselBinding;
import ru.ozon.app.android.geo.map.DetailsSheetManager;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditCarouselViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddressEditCarouselWidgetViewHolder> {
    final /* synthetic */ AddressEditCarouselViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditCarouselViewMapper$holderProducer$1(AddressEditCarouselViewMapper addressEditCarouselViewMapper) {
        super(2);
        this.this$0 = addressEditCarouselViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddressEditCarouselWidgetViewHolder invoke(View view, ComposerReferences ref) {
        AddressEditCarouselWidgetComponent addressEditCarouselWidgetComponent;
        AddressEditCarouselWidgetComponent addressEditCarouselWidgetComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        WidgetAddressEditCarouselBinding bind = WidgetAddressEditCarouselBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        addressEditCarouselWidgetComponent = this.this$0.component;
        DetailsSheetManager detailsSheetManager = addressEditCarouselWidgetComponent.getDetailsSheetManager();
        addressEditCarouselWidgetComponent2 = this.this$0.component;
        return new AddressEditCarouselWidgetViewHolder(bind, ref, detailsSheetManager, addressEditCarouselWidgetComponent2.getCustomActionHandlersStoreFactory());
    }
}
