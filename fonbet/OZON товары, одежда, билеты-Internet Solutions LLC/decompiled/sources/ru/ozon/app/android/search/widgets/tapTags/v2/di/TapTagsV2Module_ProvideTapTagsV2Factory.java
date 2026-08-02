package ru.ozon.app.android.search.widgets.tapTags.v2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2Config;
import ru.ozon.app.android.search.widgets.tapTags.v2.core.TapTagsV2ViewMapper;

/* loaded from: classes7.dex */
public final class TapTagsV2Module_ProvideTapTagsV2Factory implements e<Widget2> {
    public static Widget2 provideTapTagsV2(TapTagsV2Config tapTagsV2Config, TapTagsV2ViewMapper tapTagsV2ViewMapper) {
        Widget2 provideTapTagsV2 = TapTagsV2Module.INSTANCE.provideTapTagsV2(tapTagsV2Config, tapTagsV2ViewMapper);
        j.d(provideTapTagsV2);
        return provideTapTagsV2;
    }
}
