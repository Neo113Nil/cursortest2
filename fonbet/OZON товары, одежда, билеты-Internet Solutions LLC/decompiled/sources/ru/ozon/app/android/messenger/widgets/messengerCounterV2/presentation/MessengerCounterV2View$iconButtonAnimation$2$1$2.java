package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MessengerCounterV2View$iconButtonAnimation$2$1$2 extends AbstractC7737t implements Function1<Animator, Unit> {
    final /* synthetic */ LottieAnimationView $this_apply;
    final /* synthetic */ MessengerCounterV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerCounterV2View$iconButtonAnimation$2$1$2(LottieAnimationView lottieAnimationView, MessengerCounterV2View messengerCounterV2View) {
        super(1);
        this.$this_apply = lottieAnimationView;
        this.this$0 = messengerCounterV2View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewExtKt.invisible(this.$this_apply);
        ViewExtKt.show(this.this$0.getIconButtonView());
    }
}
