package ru.ozon.app.android.common.productselectormobile.util;

import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.common.internal.ImagesContract;
import i10.h;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.common.productselectormobile.PresentationUtils;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/util/AutopickerResultConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutopickerResultConfigurator extends ComposerScreenConfig.PageConfigurator {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        String str;
        ConfiguratorReferences references;
        ComposerNavigator navigator;
        InterfaceC7851b controller;
        if (resultCode != -1 || requestCode != 9489) {
            return;
        }
        String stringExtra = data != null ? data.getStringExtra(ImagesContract.URL) : null;
        ComponentCallbacksC5392m c11 = getContainer().c();
        ComposerFragment composerFragment = c11 instanceof ComposerFragment ? (ComposerFragment) c11 : null;
        if (composerFragment != null) {
            h.c pageRef = composerFragment.getConfig().getPageRef();
            h.c.a aVar = pageRef instanceof h.c.a ? (h.c.a) pageRef : null;
            if (aVar != null) {
                str = aVar.f();
                if (PresentationUtils.INSTANCE.shouldRefreshPage(str, stringExtra)) {
                    if (stringExtra == null || (references = getReferences()) == null || (navigator = references.getNavigator()) == null) {
                        return;
                    }
                    ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, stringExtra, null, 2, null);
                    return;
                }
                ConfiguratorReferences references2 = getReferences();
                if (references2 == null || (controller = references2.getController()) == null) {
                    return;
                }
                InterfaceC7851b.a.a(controller, stringExtra, null, null, null, 14);
                return;
            }
        }
        str = null;
        if (PresentationUtils.INSTANCE.shouldRefreshPage(str, stringExtra)) {
        }
    }
}
