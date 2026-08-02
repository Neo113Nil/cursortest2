package ru.ozon.app.android.checkoutcomposer.common.formbuilder.configurator;

import android.content.Intent;
import kotlin.Metadata;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetFragment;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SuggestVO;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/configurator/SearchSheetResultConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchSheetResultConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        SearchSheetFragment.Data data2;
        SuggestVO selectedSuggest;
        ConfiguratorReferences references;
        ComposerNavigator navigator;
        if (requestCode != 9300 || resultCode != -1 || data == null || (data2 = (SearchSheetFragment.Data) data.getParcelableExtra("EXTRA_DATA")) == null || (selectedSuggest = data2.getSelectedSuggest()) == null || (references = getReferences()) == null || (navigator = references.getNavigator()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, selectedSuggest.getLink(), null, 2, null);
    }
}
