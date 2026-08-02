package ru.ozon.app.android.partpayment.landing.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitConfig;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitNoUiViewMapper;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitUiViewMapper;

/* loaded from: classes6.dex */
public final class LandingModule_Companion_ProvideFormPageLandingLimitWidgetFactory implements e<Widget> {
    public static Widget provideFormPageLandingLimitWidget(FormPageLandingLimitConfig formPageLandingLimitConfig, FormPageLandingLimitUiViewMapper formPageLandingLimitUiViewMapper, FormPageLandingLimitNoUiViewMapper formPageLandingLimitNoUiViewMapper) {
        Widget provideFormPageLandingLimitWidget = LandingModule.INSTANCE.provideFormPageLandingLimitWidget(formPageLandingLimitConfig, formPageLandingLimitUiViewMapper, formPageLandingLimitNoUiViewMapper);
        j.d(provideFormPageLandingLimitWidget);
        return provideFormPageLandingLimitWidget;
    }
}
