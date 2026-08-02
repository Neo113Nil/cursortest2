package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data.ImageBadgeListConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.ImageBadgeListViewMapper;

/* loaded from: classes6.dex */
public final class ImageBadgeListWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(ImageBadgeListWidgetModule imageBadgeListWidgetModule, ImageBadgeListConfig imageBadgeListConfig, ImageBadgeListViewMapper imageBadgeListViewMapper) {
        Widget2 provideWidget = imageBadgeListWidgetModule.provideWidget(imageBadgeListConfig, imageBadgeListViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
