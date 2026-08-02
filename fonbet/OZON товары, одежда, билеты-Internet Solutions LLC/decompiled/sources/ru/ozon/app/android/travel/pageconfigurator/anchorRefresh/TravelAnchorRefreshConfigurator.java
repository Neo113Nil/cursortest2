package ru.ozon.app.android.travel.pageconfigurator.anchorRefresh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/anchorRefresh/TravelAnchorRefreshConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LoZ/a;", "<init>", "()V", "", "deeplink", "", "refresh", "", "onAnchorReturn", "(Ljava/lang/String;Z)V", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelAnchorRefreshConfigurator extends ComposerScreenConfig.PageConfigurator implements InterfaceC8677a {
    @Override // oZ.InterfaceC8677a
    public void onAnchorReturn(@NotNull String deeplink, boolean refresh) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, deeplink, null, null, null, 14);
    }
}
