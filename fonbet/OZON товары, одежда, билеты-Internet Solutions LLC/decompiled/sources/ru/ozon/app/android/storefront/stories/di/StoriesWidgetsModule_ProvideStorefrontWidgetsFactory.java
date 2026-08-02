package ru.ozon.app.android.storefront.stories.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.storefront.stories.playstories.core.PlayStoriesConfig;
import ru.ozon.app.android.storefront.stories.playstories.core.PlayStoriesViewMapper;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerConfig;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerStoriesV3UpdateViewMapper;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerViewMapper;
import ru.ozon.app.android.storefront.stories.setOfPreviews.SetOfPreviewsConfig;
import ru.ozon.app.android.storefront.stories.setOfPreviews.SetOfPreviewsViewMapper;

/* loaded from: classes7.dex */
public final class StoriesWidgetsModule_ProvideStorefrontWidgetsFactory implements e<Set<Widget>> {
    public static Set<Widget> provideStorefrontWidgets(PlayStoriesConfig playStoriesConfig, SetContainerStoriesV3UpdateViewMapper setContainerStoriesV3UpdateViewMapper, PlayStoriesViewMapper playStoriesViewMapper, SetOfPreviewsConfig setOfPreviewsConfig, SetOfPreviewsViewMapper setOfPreviewsViewMapper, SetContainerConfig setContainerConfig, SetContainerViewMapper setContainerViewMapper) {
        Set<Widget> provideStorefrontWidgets = StoriesWidgetsModule.provideStorefrontWidgets(playStoriesConfig, setContainerStoriesV3UpdateViewMapper, playStoriesViewMapper, setOfPreviewsConfig, setOfPreviewsViewMapper, setContainerConfig, setContainerViewMapper);
        j.d(provideStorefrontWidgets);
        return provideStorefrontWidgets;
    }
}
