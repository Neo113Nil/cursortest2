package ru.ozon.app.android.ads.widgets.advPageStay.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.ads.widgets.advPageStay.data.AdvPageStayConfig;
import ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class AdvPageStayDiModule_ProvideAdvRefreshWithDelayFactory implements e<Widget2> {
    public static Widget2 provideAdvRefreshWithDelay(AdvPageStayDiModule advPageStayDiModule, AdvPageStayConfig advPageStayConfig, AdvPageStayViewMapper advPageStayViewMapper) {
        Widget2 provideAdvRefreshWithDelay = advPageStayDiModule.provideAdvRefreshWithDelay(advPageStayConfig, advPageStayViewMapper);
        j.d(provideAdvRefreshWithDelay);
        return provideAdvRefreshWithDelay;
    }
}
