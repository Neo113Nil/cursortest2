package ru.ozon.app.android.autopicker.view.productpickersearch.presentation.configurator;

import android.content.Intent;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/configurator/ProductPickerSearchParamsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductPickerSearchParamsConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        Serializable serializableExtra = data != null ? data.getSerializableExtra("params_extra") : null;
        HashMap hashMap = serializableExtra instanceof HashMap ? (HashMap) serializableExtra : null;
        if (hashMap != null && (references = getReferences()) != null && (controller = references.getController()) != null) {
            InterfaceC7851b.a.a(controller, null, hashMap, null, null, 13);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
