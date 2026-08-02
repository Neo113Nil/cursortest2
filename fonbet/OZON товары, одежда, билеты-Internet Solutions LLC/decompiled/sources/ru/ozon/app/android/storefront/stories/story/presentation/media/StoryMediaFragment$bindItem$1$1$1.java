package ru.ozon.app.android.storefront.stories.story.presentation.media;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryCallback;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StoryMediaFragment$bindItem$1$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ StoryMediaFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryMediaFragment$bindItem$1$1$1(StoryMediaFragment storyMediaFragment) {
        super(1);
        this.this$0 = storyMediaFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        StoryCallback storyCallback;
        Intrinsics.checkNotNullParameter(action, "action");
        storyCallback = this.this$0.getStoryCallback();
        if (storyCallback != null) {
            storyCallback.onAction(action);
        }
    }
}
