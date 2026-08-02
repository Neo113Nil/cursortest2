package ru.ozon.app.android.monetization.configurators;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lru/ozon/app/android/monetization/configurators/AddressSearchSheetResultConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "handleSearchData", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressSearchSheetResultConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final void handleSearchData(YandexSearchSheetFragment.Data data) {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        String fieldName = data.getFieldName();
        SuggestVO.Suggest.SuggestInfo selectedSuggest = data.getSelectedSuggest();
        String displayFullAddress = selectedSuggest != null ? selectedSuggest.getDisplayFullAddress() : null;
        if (displayFullAddress == null) {
            displayFullAddress = "";
        }
        controller.update(new FormBuilderFieldUpdate.FormBuilderTextFieldUpdate(fieldName, displayFullAddress));
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        if (resultCode == -1 && requestCode == 1000 && data != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra2 = data.getParcelableExtra("EXTRA_DATA", YandexSearchSheetFragment.Data.class);
                parcelableExtra = (Parcelable) parcelableExtra2;
            } else {
                parcelableExtra = data.getParcelableExtra("EXTRA_DATA");
            }
            YandexSearchSheetFragment.Data data2 = (YandexSearchSheetFragment.Data) parcelableExtra;
            if (data2 != null) {
                handleSearchData(data2);
            }
        }
    }
}
