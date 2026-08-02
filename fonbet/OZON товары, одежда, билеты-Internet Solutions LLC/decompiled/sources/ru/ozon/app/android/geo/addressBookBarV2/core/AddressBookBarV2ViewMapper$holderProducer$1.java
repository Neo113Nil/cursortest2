package ru.ozon.app.android.geo.addressBookBarV2.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.addressBookBarV2.di.AddressBookBarV2Component;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.RightLeftTitlesCellV2View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addressBookBarV2/presentation/AddressBookBarWidgetV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AddressBookBarV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddressBookBarWidgetV2ViewHolder> {
    final /* synthetic */ AddressBookBarV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressBookBarV2ViewMapper$holderProducer$1(AddressBookBarV2ViewMapper addressBookBarV2ViewMapper) {
        super(2);
        this.this$0 = addressBookBarV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddressBookBarWidgetV2ViewHolder invoke(View view, ComposerReferences refs) {
        AddressBookBarV2Component addressBookBarV2Component;
        AddressBookBarV2Component addressBookBarV2Component2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        addressBookBarV2Component = this.this$0.component;
        AddressUiInfoViewModel addressInfoViewModel = addressBookBarV2Component.getAddressInfoViewModel();
        addressBookBarV2Component2 = this.this$0.component;
        return new AddressBookBarWidgetV2ViewHolder((RightLeftTitlesCellV2View) view, refs, addressInfoViewModel, addressBookBarV2Component2.getViewedPond());
    }
}
