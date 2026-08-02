package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.Event;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storefront/stories/playstoriesv3/presentation/fragments/Event;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StoryV3MediaFragment$observeStoryEvents$1 extends AbstractC7737t implements Function1<Event, Unit> {
    final /* synthetic */ StoryV3MediaFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryV3MediaFragment$observeStoryEvents$1(StoryV3MediaFragment storyV3MediaFragment) {
        super(1);
        this.this$0 = storyV3MediaFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Event event) {
        invoke2(event);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Event event) {
        if (event instanceof Event.OnNextFrame) {
            this.this$0.onNextFrame(((Event.OnNextFrame) event).getItem());
            return;
        }
        if (event instanceof Event.OnStoryCompleted) {
            this.this$0.getPlayStoriesV3ViewModel().onStoryCompleted();
            return;
        }
        if (event instanceof Event.OnPreviousFrame) {
            this.this$0.onPreviousFrame(((Event.OnPreviousFrame) event).getItem());
            return;
        }
        if (event instanceof Event.OnPreviousStory) {
            this.this$0.getPlayStoriesV3ViewModel().onPreviousClicked();
            return;
        }
        if (event instanceof Event.OnPreloadImage) {
            this.this$0.preloadImage(((Event.OnPreloadImage) event).getAsset());
        } else if (event instanceof Event.OnAction) {
            this.this$0.getPlayStoriesV3ViewModel().onAction(((Event.OnAction) event).getAction());
        } else {
            if (!(event instanceof Event.OnCloseStory)) {
                throw new o();
            }
            this.this$0.onCloseStory();
        }
    }
}
