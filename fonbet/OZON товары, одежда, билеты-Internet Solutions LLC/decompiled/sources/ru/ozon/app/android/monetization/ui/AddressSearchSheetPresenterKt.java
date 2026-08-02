package ru.ozon.app.android.monetization.ui;

import S0.InterfaceC3967k;
import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import b00.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.monetization.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.yandexsearchsheet.ShowYandexSearchSheetAction;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "fieldName", "Lru/ozon/app/android/monetization/ui/AddressSearchSheetPresenter;", "rememberAddressSearchSheetPresenter", "(Ljava/lang/String;LS0/k;I)Lru/ozon/app/android/monetization/ui/AddressSearchSheetPresenter;", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSearchSheetPresenterKt {
    @NotNull
    public static final AddressSearchSheetPresenter rememberAddressSearchSheetPresenter(@NotNull final String fieldName, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        interfaceC3967k.o(278903363);
        final C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
        interfaceC3967k.o(1053396339);
        boolean n11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(fieldName)) || (i11 & 6) == 4) | interfaceC3967k.n(c4911f);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new AddressSearchSheetPresenter() { // from class: ru.ozon.app.android.monetization.ui.AddressSearchSheetPresenterKt$rememberAddressSearchSheetPresenter$1$1
                @Override // ru.ozon.app.android.monetization.ui.AddressSearchSheetPresenter
                public void show() {
                    G d11;
                    YandexSearchSheetFragment.Companion companion = YandexSearchSheetFragment.INSTANCE;
                    ShowYandexSearchSheetAction showYandexSearchSheetAction = new ShowYandexSearchSheetAction(new YandexSearchSheetFragment.Data(fieldName, StringProvider.getString(R$string.monetization_address_search_sheet_title), StringProvider.getString(R$string.monetization_address_search_sheet_input_hint), "", new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions("validateCourierAddressV2?fl=1&pv=2&q={q}", null, 1, null, null, null, null, 112, null), null, null, null, null, null, 992, null), 1000, null);
                    ComponentCallbacksC5392m c11 = c4911f.c();
                    if (c11 == null || (d11 = c4911f.d()) == null) {
                        return;
                    }
                    companion.show(showYandexSearchSheetAction, c11, d11);
                }
            };
            interfaceC3967k.x(C11);
        }
        AddressSearchSheetPresenterKt$rememberAddressSearchSheetPresenter$1$1 addressSearchSheetPresenterKt$rememberAddressSearchSheetPresenter$1$1 = (AddressSearchSheetPresenterKt$rememberAddressSearchSheetPresenter$1$1) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return addressSearchSheetPresenterKt$rememberAddressSearchSheetPresenter$1$1;
    }
}
