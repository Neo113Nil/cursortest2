package ru.ozon.app.android.composer.configurators;

import a00.C4911f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.Metadata;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.newrouter.ui.fragment.FullScreenFragmentObserver;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/composer/configurators/FullScreenConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "", "isInDialogFragment", "(Landroidx/fragment/app/m;)Z", "", "onComposerInitialized", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FullScreenConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final boolean isInDialogFragment(ComponentCallbacksC5392m fragment) {
        while (fragment != null) {
            if (fragment instanceof DialogInterfaceOnCancelListenerC5390k) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C4911f ownerContainer;
        ConfiguratorReferences references = getReferences();
        ComponentCallbacksC5392m c11 = (references == null || (ownerContainer = references.getOwnerContainer()) == null) ? null : ownerContainer.c();
        if (c11 == null || isInDialogFragment(c11)) {
            return;
        }
        FullScreenFragmentObserver.Companion.showFullScreen$default(FullScreenFragmentObserver.INSTANCE, c11, false, 0L, 6, null);
    }
}
