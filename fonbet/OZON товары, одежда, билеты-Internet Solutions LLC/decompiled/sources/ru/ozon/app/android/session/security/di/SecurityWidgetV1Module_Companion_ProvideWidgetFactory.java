package ru.ozon.app.android.session.security.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.security.UserAuthBiometrySettingsViewMapper;
import ru.ozon.app.android.session.security.data.UserAuthBiometrySettingsConfig;

/* loaded from: classes7.dex */
public final class SecurityWidgetV1Module_Companion_ProvideWidgetFactory implements e<Set<Widget>> {
    public static Set<Widget> provideWidget(UserAuthBiometrySettingsConfig userAuthBiometrySettingsConfig, UserAuthBiometrySettingsViewMapper userAuthBiometrySettingsViewMapper) {
        Set<Widget> provideWidget = SecurityWidgetV1Module.INSTANCE.provideWidget(userAuthBiometrySettingsConfig, userAuthBiometrySettingsViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
