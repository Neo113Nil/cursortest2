package ru.ozon.app.android.yandexsearchsheet;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetResultConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "processResultForForm", "processResultForMap", "updateByLink", "searchData", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "deeplink", "", "Companion", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexSearchSheetResultConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetResultConfigurator$Companion;", "", "<init>", "()V", "ONE_TIME_POST_PARAM_MAP", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void processResultForForm(Intent data) {
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        String updateLink;
        YandexSearchSheetFragment.Data data2 = (YandexSearchSheetFragment.Data) data.getParcelableExtra("EXTRA_DATA");
        if (data2 == null || (references = getReferences()) == null || (controller = references.getController()) == null) {
            return;
        }
        String fieldName = data2.getFieldName();
        SuggestVO.Suggest.SuggestInfo selectedSuggest = data2.getSelectedSuggest();
        String str = null;
        String displayFullAddress = selectedSuggest != null ? selectedSuggest.getDisplayFullAddress() : null;
        if (displayFullAddress == null) {
            displayFullAddress = "";
        }
        SuggestVO.Suggest.SuggestInfo selectedSuggest2 = data2.getSelectedSuggest();
        if (selectedSuggest2 != null && (updateLink = selectedSuggest2.getUpdateLink()) != null) {
            updateByLink(data2, updateLink);
            Unit unit = Unit.f71690a;
            str = updateLink;
        }
        controller.update(new FormBuilderFieldUpdate.FormBuilderYandexSearchFieldUpdate(fieldName, displayFullAddress, str != null ? str : ""));
    }

    private final void processResultForMap(Intent data) {
        SuggestVO.Suggest.SuggestInfo selectedSuggest;
        String updateLink;
        YandexSearchSheetFragment.Data data2 = (YandexSearchSheetFragment.Data) data.getParcelableExtra("EXTRA_DATA");
        if (data2 == null || (selectedSuggest = data2.getSelectedSuggest()) == null || (updateLink = selectedSuggest.getUpdateLink()) == null) {
            return;
        }
        updateByLink(data2, updateLink);
    }

    private final void updateByLink(YandexSearchSheetFragment.Data searchData, String deeplink) {
        ComposerNavigator navigator;
        Unit unit;
        InterfaceC7851b controller;
        YandexSearchSheetFragment.Data.MapInfoRequest mapInfoRequest = searchData.getMapInfoRequest();
        if (mapInfoRequest != null) {
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller = references.getController()) == null) {
                unit = null;
            } else {
                InterfaceC7851b.a.e(controller, deeplink, U.f(new Pair("map", mapInfoRequest)), null, 4);
                unit = Unit.f71690a;
            }
            if (unit != null) {
                return;
            }
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (navigator = references2.getNavigator()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, deeplink, null, 2, null);
        Unit unit2 = Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode != -1) {
            return;
        }
        if (requestCode == 1000) {
            if (data != null) {
                processResultForForm(data);
            }
        } else if (requestCode == 1001 && data != null) {
            processResultForMap(data);
        }
    }
}
