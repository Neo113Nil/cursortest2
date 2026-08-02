package ru.ozon.app.android.storefront.stories.playstoriesv3.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.BaseStoryV3Fragment;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/core/StoryV3FragmentFactory;", "", "<init>", "()V", "create", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/BaseStoryV3Fragment;", "story", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;", "span", "", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/vo/StoryV3;Ljava/lang/Integer;)Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/BaseStoryV3Fragment;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryV3FragmentFactory {
    @NotNull
    public final BaseStoryV3Fragment<?> create(@NotNull StoryV3 story, Integer span) {
        Intrinsics.checkNotNullParameter(story, "story");
        return StoryV3MediaFragment.INSTANCE.newInstance(story, span);
    }
}
