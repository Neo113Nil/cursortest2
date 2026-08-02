package ru.ozon.app.android.storefront.stories.story.presentation.media;

import Sc.o;
import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.databinding.MoleculeStoryItemMediaBinding;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemEvent;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storefront/stories/story/presentation/StoryItemEvent;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StoryMediaFragment$observeStateEvents$1 extends AbstractC7737t implements Function1<StoryItemEvent, Unit> {
    final /* synthetic */ StoryMediaFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryMediaFragment$observeStateEvents$1(StoryMediaFragment storyMediaFragment) {
        super(1);
        this.this$0 = storyMediaFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StoryItemEvent storyItemEvent) {
        invoke2(storyItemEvent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoryItemEvent storyItemEvent) {
        MoleculeStoryItemMediaBinding binding;
        if (storyItemEvent instanceof StoryItemEvent.Buffering) {
            this.this$0.contentWasLoaded = false;
            binding = this.this$0.getBinding();
            ProgressBar loadingPB = binding.loadingPB;
            Intrinsics.checkNotNullExpressionValue(loadingPB, "loadingPB");
            ViewExtKt.show(loadingPB);
            binding.timeLine.pause();
            return;
        }
        if (storyItemEvent instanceof StoryItemEvent.Error) {
            this.this$0.onError(((StoryItemEvent.Error) storyItemEvent).getErrorString());
        } else {
            if (!(storyItemEvent instanceof StoryItemEvent.ItemLoaded)) {
                throw new o();
            }
            this.this$0.onItemLoaded();
        }
    }
}
