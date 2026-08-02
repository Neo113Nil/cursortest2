package ru.ozon.app.android.storefront.stories.setContainer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.domain.events.UpdateStoryViewed;
import ru.ozon.app.android.storefront.stories.playstoriesv3.PlayStoriesV3ViewModel;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.ViewedStoryModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/ViewedStoryModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/data/ViewedStoryModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SetContainerStoriesV3UpdateViewMapper$onContainerInitialized$1 extends AbstractC7737t implements Function1<ViewedStoryModel, Unit> {
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ PlayStoriesV3ViewModel $vm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetContainerStoriesV3UpdateViewMapper$onContainerInitialized$1(ComposerReferences composerReferences, PlayStoriesV3ViewModel playStoriesV3ViewModel) {
        super(1);
        this.$refs = composerReferences;
        this.$vm = playStoriesV3ViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ViewedStoryModel viewedStoryModel) {
        invoke2(viewedStoryModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ViewedStoryModel viewedStoryModel) {
        this.$refs.getController().update(new UpdateStoryViewed(viewedStoryModel.getCurrentStoryId(), viewedStoryModel.getViewedStoriesIds()));
        PlayStoriesV3ViewModel playStoriesV3ViewModel = this.$vm;
        if (playStoriesV3ViewModel != null) {
            playStoriesV3ViewModel.clearStorage();
        }
    }
}
