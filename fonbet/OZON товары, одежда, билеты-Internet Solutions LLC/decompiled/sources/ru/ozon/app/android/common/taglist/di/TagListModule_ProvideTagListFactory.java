package ru.ozon.app.android.common.taglist.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.common.taglist.taglistv2.data.TagListConfig;
import ru.ozon.app.android.common.taglist.taglistv2.presentation.flexboxtaglist.FlexboxTagListWidgetViewMapper;
import ru.ozon.app.android.common.taglist.taglistv2.presentation.scrollingtaglist.ScrollingTagListWidgetViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3Config;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox.FlexboxTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox.StickyFlexboxTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.HidingStickyScrollingTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.StickyScrollingTagListV3ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class TagListModule_ProvideTagListFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideTagList(TagListConfig tagListConfig, ScrollingTagListWidgetViewMapper scrollingTagListWidgetViewMapper, TagListV3Config tagListV3Config, ScrollingTagListV3ViewMapper scrollingTagListV3ViewMapper, StickyScrollingTagListV3ViewMapper stickyScrollingTagListV3ViewMapper, HidingStickyScrollingTagListV3ViewMapper hidingStickyScrollingTagListV3ViewMapper, FlexboxTagListV3ViewMapper flexboxTagListV3ViewMapper, StickyFlexboxTagListV3ViewMapper stickyFlexboxTagListV3ViewMapper, FlexboxTagListWidgetViewMapper flexboxTagListWidgetViewMapper) {
        Set<Widget2> provideTagList = TagListModule.INSTANCE.provideTagList(tagListConfig, scrollingTagListWidgetViewMapper, tagListV3Config, scrollingTagListV3ViewMapper, stickyScrollingTagListV3ViewMapper, hidingStickyScrollingTagListV3ViewMapper, flexboxTagListV3ViewMapper, stickyFlexboxTagListV3ViewMapper, flexboxTagListWidgetViewMapper);
        j.d(provideTagList);
        return provideTagList;
    }
}
