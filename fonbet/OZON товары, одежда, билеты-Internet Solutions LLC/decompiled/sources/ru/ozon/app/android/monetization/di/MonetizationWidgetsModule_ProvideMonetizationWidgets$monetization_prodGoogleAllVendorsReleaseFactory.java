package ru.ozon.app.android.monetization.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.monetization.widgets.inputSubmit.core.InputSubmitConfig;
import ru.ozon.app.android.monetization.widgets.inputSubmit.core.InputSubmitViewMapper;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.core.UnreadMessageIndicatorConfig;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.core.UnreadMessageIndicatorViewMapper;

/* loaded from: classes6.dex */
public final class MonetizationWidgetsModule_ProvideMonetizationWidgets$monetization_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease(InputSubmitConfig inputSubmitConfig, InputSubmitViewMapper inputSubmitViewMapper, UnreadMessageIndicatorConfig unreadMessageIndicatorConfig, UnreadMessageIndicatorViewMapper unreadMessageIndicatorViewMapper) {
        Set<Widget2> provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease = MonetizationWidgetsModule.provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease(inputSubmitConfig, inputSubmitViewMapper, unreadMessageIndicatorConfig, unreadMessageIndicatorViewMapper);
        j.d(provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease);
        return provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease;
    }
}
