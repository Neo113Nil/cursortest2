package ru.ozon.app.android.common.taglist.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.common.taglist.taglistv2.data.TagListConfig;
import ru.ozon.app.android.common.taglist.taglistv2.presentation.flexboxtaglist.FlexboxTagListWidgetViewMapper;
import ru.ozon.app.android.common.taglist.taglistv2.presentation.scrollingtaglist.ScrollingTagListWidgetViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.data.TagListV3Config;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox.FlexboxTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.flexbox.StickyFlexboxTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.HidingStickyScrollingTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3ViewMapper;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.StickyScrollingTagListV3ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/taglist/di/TagListModule;", "", "<init>", "()V", "provideTagList", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "tagListConfig", "Lru/ozon/app/android/common/taglist/taglistv2/data/TagListConfig;", "scrollingTagListViewMapper", "Lru/ozon/app/android/common/taglist/taglistv2/presentation/scrollingtaglist/ScrollingTagListWidgetViewMapper;", "tagListV3Config", "Lru/ozon/app/android/common/taglist/taglistv3/data/TagListV3Config;", "scrollingTagListV3ViewMapper", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/ScrollingTagListV3ViewMapper;", "stickyScrollingTagListV3ViewMapper", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/StickyScrollingTagListV3ViewMapper;", "hidingStickyScrollingTagListV3ViewMapper", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/HidingStickyScrollingTagListV3ViewMapper;", "flexboxTagListV3ViewMapper", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/FlexboxTagListV3ViewMapper;", "stickyFlexboxTagListV3ViewMapper", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/flexbox/StickyFlexboxTagListV3ViewMapper;", "flexboxTagListViewMapper", "Lru/ozon/app/android/common/taglist/taglistv2/presentation/flexboxtaglist/FlexboxTagListWidgetViewMapper;", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagListModule {

    @NotNull
    public static final TagListModule INSTANCE = new TagListModule();

    private TagListModule() {
    }

    @NotNull
    public final Set<Widget2> provideTagList(@NotNull TagListConfig tagListConfig, @NotNull ScrollingTagListWidgetViewMapper scrollingTagListViewMapper, @NotNull TagListV3Config tagListV3Config, @NotNull ScrollingTagListV3ViewMapper scrollingTagListV3ViewMapper, @NotNull StickyScrollingTagListV3ViewMapper stickyScrollingTagListV3ViewMapper, @NotNull HidingStickyScrollingTagListV3ViewMapper hidingStickyScrollingTagListV3ViewMapper, @NotNull FlexboxTagListV3ViewMapper flexboxTagListV3ViewMapper, @NotNull StickyFlexboxTagListV3ViewMapper stickyFlexboxTagListV3ViewMapper, @NotNull FlexboxTagListWidgetViewMapper flexboxTagListViewMapper) {
        Intrinsics.checkNotNullParameter(tagListConfig, "tagListConfig");
        Intrinsics.checkNotNullParameter(scrollingTagListViewMapper, "scrollingTagListViewMapper");
        Intrinsics.checkNotNullParameter(tagListV3Config, "tagListV3Config");
        Intrinsics.checkNotNullParameter(scrollingTagListV3ViewMapper, "scrollingTagListV3ViewMapper");
        Intrinsics.checkNotNullParameter(stickyScrollingTagListV3ViewMapper, "stickyScrollingTagListV3ViewMapper");
        Intrinsics.checkNotNullParameter(hidingStickyScrollingTagListV3ViewMapper, "hidingStickyScrollingTagListV3ViewMapper");
        Intrinsics.checkNotNullParameter(flexboxTagListV3ViewMapper, "flexboxTagListV3ViewMapper");
        Intrinsics.checkNotNullParameter(stickyFlexboxTagListV3ViewMapper, "stickyFlexboxTagListV3ViewMapper");
        Intrinsics.checkNotNullParameter(flexboxTagListViewMapper, "flexboxTagListViewMapper");
        Widget2[] elements = {new Widget2("common", DynamicElementDTO.TAG_LIST, tagListConfig, new ViewMapper2[]{scrollingTagListViewMapper, flexboxTagListViewMapper}), new Widget2("common", DynamicElementDTO.TAG_LIST, tagListV3Config, new ViewMapper2[]{scrollingTagListV3ViewMapper, stickyScrollingTagListV3ViewMapper, hidingStickyScrollingTagListV3ViewMapper, flexboxTagListV3ViewMapper, stickyFlexboxTagListV3ViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
