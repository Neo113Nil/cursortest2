package ru.ozon.app.android.storefront.stories.playstoriesv3.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/ViewedStoryModel;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/ViewedStoryModel;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StoryV3UpdateStore$subscribeOnStoryViewed$1 extends AbstractC7737t implements Function1<ViewedStoryModel, Boolean> {
    public static final StoryV3UpdateStore$subscribeOnStoryViewed$1 INSTANCE = new StoryV3UpdateStore$subscribeOnStoryViewed$1();

    StoryV3UpdateStore$subscribeOnStoryViewed$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ViewedStoryModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getCurrentStoryId() != Long.MIN_VALUE);
    }
}
