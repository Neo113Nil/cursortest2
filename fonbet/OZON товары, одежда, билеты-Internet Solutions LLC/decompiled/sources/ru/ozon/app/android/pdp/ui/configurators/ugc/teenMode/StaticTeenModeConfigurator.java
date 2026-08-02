package ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/teenMode/StaticTeenModeConfigurator;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/teenMode/BaseTeenModeConfigurator;", "<init>", "()V", "applyTeenModeSettings", "", "restoreSettings", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StaticTeenModeConfigurator extends BaseTeenModeConfigurator {
    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.BaseTeenModeConfigurator
    protected void applyTeenModeSettings() {
        applyTransparentNavBar();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.teenMode.BaseTeenModeConfigurator
    protected void restoreSettings() {
        restoreDefaultSettings();
    }
}
