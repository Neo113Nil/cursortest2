package ru.ozon.app.android.partpayment.smssign.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.partpayment.smssign.SmsSignConfig;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignNoUiViewMapper;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewMapper;

/* loaded from: classes6.dex */
public final class SmsSignModule_Companion_ProvideSmsSignWidgetFactory implements e<Widget> {
    public static Widget provideSmsSignWidget(SmsSignConfig smsSignConfig, SmsSignViewMapper smsSignViewMapper, SmsSignNoUiViewMapper smsSignNoUiViewMapper) {
        Widget provideSmsSignWidget = SmsSignModule.INSTANCE.provideSmsSignWidget(smsSignConfig, smsSignViewMapper, smsSignNoUiViewMapper);
        j.d(provideSmsSignWidget);
        return provideSmsSignWidget;
    }
}
