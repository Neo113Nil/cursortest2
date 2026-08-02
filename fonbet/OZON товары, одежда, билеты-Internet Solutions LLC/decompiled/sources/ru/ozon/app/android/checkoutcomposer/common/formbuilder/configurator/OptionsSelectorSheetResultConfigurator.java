package ru.ozon.app.android.checkoutcomposer.common.formbuilder.configurator;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import l10.InterfaceC7851b;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.selectorsheet.OptionsSelectorSheetFragment;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/configurator/OptionsSelectorSheetResultConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OptionsSelectorSheetResultConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        OptionsSelectorSheetFragment.Config config;
        InterfaceC7851b controller;
        String deepLink;
        InterfaceC7851b controller2;
        if (requestCode != 9200 || resultCode != -1 || data == null || (config = (OptionsSelectorSheetFragment.Config) data.getParcelableExtra("EXTRA_OPTION_SELECTOR_CONFIG")) == null) {
            return;
        }
        FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option selectedOption = config.getSelectedOption();
        if (selectedOption != null && (deepLink = selectedOption.getDeepLink()) != null) {
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller2 = references.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller2, deepLink, null, null, null, 14);
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (controller = references2.getController()) == null) {
            return;
        }
        controller.update(new FormBuilderFieldUpdate.FormBuilderSelectorFieldUpdate(config.getFieldName(), config.getSelectedOption()));
        Unit unit = Unit.f71690a;
    }
}
