package ru.ozon.app.android.fresh.unsorted.widgets.tagList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.data.TagListConfig;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.presentation.TagListViewMapper;

/* loaded from: classes6.dex */
public final class TagListWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(TagListConfig tagListConfig, TagListViewMapper tagListViewMapper) {
        Widget2 provideWidget = TagListWidgetModule.INSTANCE.provideWidget(tagListConfig, tagListViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
