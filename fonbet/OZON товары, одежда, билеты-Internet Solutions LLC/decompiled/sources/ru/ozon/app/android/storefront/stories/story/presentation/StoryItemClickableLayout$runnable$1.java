package ru.ozon.app.android.storefront.stories.story.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StoryItemClickableLayout$runnable$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ StoryItemClickableLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoryItemClickableLayout$runnable$1(StoryItemClickableLayout storyItemClickableLayout) {
        super(0);
        this.this$0 = storyItemClickableLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z11;
        z11 = this.this$0.wasUpEvent;
        if (z11) {
            this.this$0.onClickUp();
        } else {
            this.this$0.isLongClick = true;
            this.this$0.onLongClickDown();
        }
    }
}
