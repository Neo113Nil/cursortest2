package ru.ozon.app.android.commonwidgets.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.core.CurtainHeaderConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.core.CurtainHeaderViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.core.CurtainSettingsConfig;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.core.CurtainSettingsViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class CurtainSettingsWidgetsModule_ProvideWidget$widgets_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidget$widgets_prodGoogleAllVendorsRelease(CurtainSettingsConfig curtainSettingsConfig, CurtainSettingsViewMapper curtainSettingsViewMapper, CurtainHeaderConfig curtainHeaderConfig, CurtainHeaderViewMapper curtainHeaderViewMapper) {
        Set<Widget2> provideWidget$widgets_prodGoogleAllVendorsRelease = CurtainSettingsWidgetsModule.INSTANCE.provideWidget$widgets_prodGoogleAllVendorsRelease(curtainSettingsConfig, curtainSettingsViewMapper, curtainHeaderConfig, curtainHeaderViewMapper);
        j.d(provideWidget$widgets_prodGoogleAllVendorsRelease);
        return provideWidget$widgets_prodGoogleAllVendorsRelease;
    }
}
