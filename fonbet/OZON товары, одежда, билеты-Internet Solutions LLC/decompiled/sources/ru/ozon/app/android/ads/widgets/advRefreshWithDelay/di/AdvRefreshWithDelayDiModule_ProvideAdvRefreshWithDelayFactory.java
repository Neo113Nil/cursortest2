package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.data.AdvRefreshWithDelayConfig;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class AdvRefreshWithDelayDiModule_ProvideAdvRefreshWithDelayFactory implements e<Widget2> {
    public static Widget2 provideAdvRefreshWithDelay(AdvRefreshWithDelayConfig advRefreshWithDelayConfig, AdvRefreshWithDelayViewMapper advRefreshWithDelayViewMapper) {
        Widget2 provideAdvRefreshWithDelay = AdvRefreshWithDelayDiModule.INSTANCE.provideAdvRefreshWithDelay(advRefreshWithDelayConfig, advRefreshWithDelayViewMapper);
        j.d(provideAdvRefreshWithDelay);
        return provideAdvRefreshWithDelay;
    }
}
