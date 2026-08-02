package ru.ozon.app.android.common.promobanner.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.common.promobanner.core.PromoBannerV2Config;
import ru.ozon.app.android.common.promobanner.core.PromoBannerV2ViewMapper;
import ru.ozon.app.android.composer.di.Widget;

/* loaded from: classes6.dex */
public final class PromoBannerV2WidgetModule_Companion_ProvidePromoBannerV2WidgetFactory implements e<Widget> {
    public static Widget providePromoBannerV2Widget(PromoBannerV2Config promoBannerV2Config, PromoBannerV2ViewMapper promoBannerV2ViewMapper) {
        Widget providePromoBannerV2Widget = PromoBannerV2WidgetModule.INSTANCE.providePromoBannerV2Widget(promoBannerV2Config, promoBannerV2ViewMapper);
        j.d(providePromoBannerV2Widget);
        return providePromoBannerV2Widget;
    }
}
