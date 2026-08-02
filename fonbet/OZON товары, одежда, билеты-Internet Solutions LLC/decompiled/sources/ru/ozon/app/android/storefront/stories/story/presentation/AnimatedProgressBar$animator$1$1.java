package ru.ozon.app.android.storefront.stories.story.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AnimatedProgressBar$animator$1$1 extends AbstractC7737t implements Function1<Float, Unit> {
    final /* synthetic */ AnimatedProgressBar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedProgressBar$animator$1$1(AnimatedProgressBar animatedProgressBar) {
        super(1);
        this.this$0 = animatedProgressBar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        float f11;
        Function0<Unit> onAnimationEnd;
        this.this$0.setProgress(Math.min(f7, 1.0f));
        f11 = this.this$0.progress;
        if (f11 < 1.0f || (onAnimationEnd = this.this$0.getOnAnimationEnd()) == null) {
            return;
        }
        onAnimationEnd.invoke();
    }
}
