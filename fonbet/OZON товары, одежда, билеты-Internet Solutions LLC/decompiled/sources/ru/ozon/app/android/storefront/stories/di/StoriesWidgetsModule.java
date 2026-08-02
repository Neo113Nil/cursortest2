package ru.ozon.app.android.storefront.stories.di;

import I00.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.storefront.stories.playstories.core.PlayStoriesConfig;
import ru.ozon.app.android.storefront.stories.playstories.core.PlayStoriesViewMapper;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerConfig;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerStoriesV3UpdateViewMapper;
import ru.ozon.app.android.storefront.stories.setContainer.SetContainerViewMapper;
import ru.ozon.app.android.storefront.stories.setOfPreviews.SetOfPreviewsConfig;
import ru.ozon.app.android.storefront.stories.setOfPreviews.SetOfPreviewsViewMapper;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/stories/di/StoriesWidgetsModule;", "", "<init>", "()V", "provideStorefrontWidgets", "", "Lru/ozon/app/android/composer/di/Widget;", "playStoriesConfig", "Lru/ozon/app/android/storefront/stories/playstories/core/PlayStoriesConfig;", "storiesV3UpdateViewMapper", "Lru/ozon/app/android/storefront/stories/setContainer/SetContainerStoriesV3UpdateViewMapper;", "playStoriesViewMapper", "Lru/ozon/app/android/storefront/stories/playstories/core/PlayStoriesViewMapper;", "setOfPreviewsConfig", "Lru/ozon/app/android/storefront/stories/setOfPreviews/SetOfPreviewsConfig;", "setOfPreviewsViewMapper", "Lru/ozon/app/android/storefront/stories/setOfPreviews/SetOfPreviewsViewMapper;", "setContainerConfig", "Lru/ozon/app/android/storefront/stories/setContainer/SetContainerConfig;", "setContainerViewMapper", "Lru/ozon/app/android/storefront/stories/setContainer/SetContainerViewMapper;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoriesWidgetsModule {

    @NotNull
    public static final StoriesWidgetsModule INSTANCE = new StoriesWidgetsModule();

    private StoriesWidgetsModule() {
    }

    @NotNull
    public static final Set<Widget> provideStorefrontWidgets(@NotNull PlayStoriesConfig playStoriesConfig, @NotNull SetContainerStoriesV3UpdateViewMapper storiesV3UpdateViewMapper, @NotNull PlayStoriesViewMapper playStoriesViewMapper, @NotNull SetOfPreviewsConfig setOfPreviewsConfig, @NotNull SetOfPreviewsViewMapper setOfPreviewsViewMapper, @NotNull SetContainerConfig setContainerConfig, @NotNull SetContainerViewMapper setContainerViewMapper) {
        Intrinsics.checkNotNullParameter(playStoriesConfig, "playStoriesConfig");
        Intrinsics.checkNotNullParameter(storiesV3UpdateViewMapper, "storiesV3UpdateViewMapper");
        Intrinsics.checkNotNullParameter(playStoriesViewMapper, "playStoriesViewMapper");
        Intrinsics.checkNotNullParameter(setOfPreviewsConfig, "setOfPreviewsConfig");
        Intrinsics.checkNotNullParameter(setOfPreviewsViewMapper, "setOfPreviewsViewMapper");
        Intrinsics.checkNotNullParameter(setContainerConfig, "setContainerConfig");
        Intrinsics.checkNotNullParameter(setContainerViewMapper, "setContainerViewMapper");
        Widget[] elements = {new Widget("cms", "playStories", playStoriesConfig, new PlayStoriesViewMapper[]{playStoriesViewMapper}), new Widget("cms", "setContainer", setContainerConfig, new d[]{setContainerViewMapper, storiesV3UpdateViewMapper}), new Widget("cms", "setOfPreviews", setOfPreviewsConfig, new SetOfPreviewsViewMapper[]{setOfPreviewsViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
