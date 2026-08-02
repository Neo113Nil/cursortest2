package ru.ozon.app.android.storefront.stories.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.stories.playstoriesv3.core.PlayStoriesV3Config;
import ru.ozon.app.android.storefront.stories.playstoriesv3.core.PlayStoriesV3ViewMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/stories/di/PlayStoriesV3WidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "playStoriesV3Config", "Lru/ozon/app/android/storefront/stories/playstoriesv3/core/PlayStoriesV3Config;", "playStoriesV3ViewMapper", "Lru/ozon/app/android/storefront/stories/playstoriesv3/core/PlayStoriesV3ViewMapper;", "provideWidget$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayStoriesV3WidgetModule {
    @NotNull
    public final Widget2 provideWidget$storefront_prodGoogleAllVendorsRelease(@NotNull PlayStoriesV3Config playStoriesV3Config, @NotNull PlayStoriesV3ViewMapper playStoriesV3ViewMapper) {
        Intrinsics.checkNotNullParameter(playStoriesV3Config, "playStoriesV3Config");
        Intrinsics.checkNotNullParameter(playStoriesV3ViewMapper, "playStoriesV3ViewMapper");
        return new Widget2("cms", "playStories", playStoriesV3Config, new ViewMapper2[]{playStoriesV3ViewMapper});
    }
}
