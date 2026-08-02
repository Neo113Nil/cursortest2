package ru.ozon.app.android.ads.widgets.advInfo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.ads.widgets.advInfo.data.AdvInfoConfig;
import ru.ozon.app.android.ads.widgets.advInfo.presentation.AdvInfoViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class AdvInfoDiModule_ProvideAdvInfoFactory implements e<Widget2> {
    public static Widget2 provideAdvInfo(AdvInfoConfig advInfoConfig, AdvInfoViewMapper advInfoViewMapper) {
        Widget2 provideAdvInfo = AdvInfoDiModule.INSTANCE.provideAdvInfo(advInfoConfig, advInfoViewMapper);
        j.d(provideAdvInfo);
        return provideAdvInfo;
    }
}
