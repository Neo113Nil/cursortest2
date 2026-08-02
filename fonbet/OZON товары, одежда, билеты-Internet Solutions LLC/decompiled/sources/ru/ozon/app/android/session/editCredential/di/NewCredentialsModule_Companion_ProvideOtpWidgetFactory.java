package ru.ozon.app.android.session.editCredential.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.editCredential.otp.core.OTPWidgetConfig;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewMapper;

/* loaded from: classes7.dex */
public final class NewCredentialsModule_Companion_ProvideOtpWidgetFactory implements e<Widget> {
    public static Widget provideOtpWidget(OTPWidgetConfig oTPWidgetConfig, OTPWidgetViewMapper oTPWidgetViewMapper) {
        Widget provideOtpWidget = NewCredentialsModule.INSTANCE.provideOtpWidget(oTPWidgetConfig, oTPWidgetViewMapper);
        j.d(provideOtpWidget);
        return provideOtpWidget;
    }
}
