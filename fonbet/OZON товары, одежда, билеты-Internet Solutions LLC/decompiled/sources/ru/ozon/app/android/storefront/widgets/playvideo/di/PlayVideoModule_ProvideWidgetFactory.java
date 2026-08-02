package ru.ozon.app.android.storefront.widgets.playvideo.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.playvideo.data.PlayVideoConfig;
import ru.ozon.app.android.storefront.widgets.playvideo.presentation.PlayVideoNoUiViewMapper;

/* loaded from: classes7.dex */
public final class PlayVideoModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(PlayVideoConfig playVideoConfig, PlayVideoNoUiViewMapper playVideoNoUiViewMapper) {
        Widget2 provideWidget = PlayVideoModule.provideWidget(playVideoConfig, playVideoNoUiViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
