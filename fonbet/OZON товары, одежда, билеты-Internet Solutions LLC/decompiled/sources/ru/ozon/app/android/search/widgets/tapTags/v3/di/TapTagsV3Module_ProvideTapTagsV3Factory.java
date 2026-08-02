package ru.ozon.app.android.search.widgets.tapTags.v3.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3Config;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3ViewMapper;

/* loaded from: classes7.dex */
public final class TapTagsV3Module_ProvideTapTagsV3Factory implements e<Widget2> {
    public static Widget2 provideTapTagsV3(TapTagsV3Config tapTagsV3Config, TapTagsV3ViewMapper tapTagsV3ViewMapper) {
        Widget2 provideTapTagsV3 = TapTagsV3Module.INSTANCE.provideTapTagsV3(tapTagsV3Config, tapTagsV3ViewMapper);
        j.d(provideTapTagsV3);
        return provideTapTagsV3;
    }
}
