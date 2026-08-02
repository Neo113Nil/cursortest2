package ru.ozon.app.android.travel.pageconfigurator.hideAppbar;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/hideAppbar/TravelHideAppbarConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onComposerInitialized", "", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelHideAppbarConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        View view;
        AppBarLayout composerAppbar;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerAppbar = ComposerViewExtensionKt.composerAppbar(view)) == null) {
            return;
        }
        composerAppbar.setVisibility(8);
    }
}
