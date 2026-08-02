package ru.ozon.uni.android.notificationbar;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationBar$animateSlideIn$1$1$1 extends AbstractC7737t implements Function1<Animator, Unit> {
    final /* synthetic */ Function0<Unit> $onAnimationEnd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationBar$animateSlideIn$1$1$1(Function0<Unit> function0) {
        super(1);
        this.$onAnimationEnd = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onAnimationEnd.invoke();
    }
}
