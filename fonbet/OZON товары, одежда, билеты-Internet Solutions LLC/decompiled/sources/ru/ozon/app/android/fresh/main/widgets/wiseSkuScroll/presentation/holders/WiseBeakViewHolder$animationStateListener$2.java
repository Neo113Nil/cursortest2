package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseBeakViewHolder$animationStateListener$2$1", "invoke", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseBeakViewHolder$animationStateListener$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseBeakViewHolder$animationStateListener$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ WiseBeakViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseBeakViewHolder$animationStateListener$2(WiseBeakViewHolder wiseBeakViewHolder) {
        super(0);
        this.this$0 = wiseBeakViewHolder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseBeakViewHolder$animationStateListener$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final WiseBeakViewHolder wiseBeakViewHolder = this.this$0;
        return new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseBeakViewHolder$animationStateListener$2.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                WiseBeakViewHolder.this.resetBeak();
            }
        };
    }
}
