package ru.ozon.app.android.geo.addressbook.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookOnBoardingViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookOnBoardingViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressBookWidgetComponent$Companion$create$1$1$addressBookOnBoardingViewModel$2 extends AbstractC7737t implements Function0<AddressBookOnBoardingViewModel> {
    final /* synthetic */ AddressBookWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressBookWidgetComponent$Companion$create$1$1$addressBookOnBoardingViewModel$2(AddressBookWidgetComponent$Companion$create$1$1 addressBookWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = addressBookWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddressBookOnBoardingViewModel invoke() {
        OnBoardingComponentApi onBoardingComponentApi;
        OnBoardingComponentApi onBoardingComponentApi2;
        OnBoardingComponentApi onBoardingComponentApi3;
        onBoardingComponentApi = this.this$0.onBoardingComponentApi;
        OnBoardingDisplayRepository emptyOnBoardingDisplayRepository = onBoardingComponentApi.getEmptyOnBoardingDisplayRepository();
        onBoardingComponentApi2 = this.this$0.onBoardingComponentApi;
        OnBoardingDisplayOnPageRepository emptyOnBoardingDisplayOnPageRepository = onBoardingComponentApi2.getEmptyOnBoardingDisplayOnPageRepository();
        onBoardingComponentApi3 = this.this$0.onBoardingComponentApi;
        return new AddressBookOnBoardingViewModel(emptyOnBoardingDisplayRepository, emptyOnBoardingDisplayOnPageRepository, onBoardingComponentApi3.getDefaultOnBoardingDisplayDisableRepository());
    }
}
