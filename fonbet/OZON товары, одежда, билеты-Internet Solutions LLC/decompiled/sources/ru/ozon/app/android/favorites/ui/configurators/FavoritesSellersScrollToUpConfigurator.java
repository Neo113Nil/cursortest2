package ru.ozon.app.android.favorites.ui.configurators;

import androidx.lifecycle.C5423j;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/favorites/ui/configurators/FavoritesSellersScrollToUpConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "scrollToUp", "", "onComposerInitialized", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FavoritesSellersScrollToUpConfigurator extends ComposerScreenConfig.PageConfigurator {
    private boolean scrollToUp;

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        InterfaceC7851b controller;
        C5423j events;
        super.onComposerInitialized();
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null || (events = controller.getEvents()) == null) {
            return;
        }
        events.observe(getContainer().g(), new FavoritesSellersScrollToUpConfigurator$sam$androidx_lifecycle_Observer$0(new FavoritesSellersScrollToUpConfigurator$onComposerInitialized$1(this)));
    }
}
