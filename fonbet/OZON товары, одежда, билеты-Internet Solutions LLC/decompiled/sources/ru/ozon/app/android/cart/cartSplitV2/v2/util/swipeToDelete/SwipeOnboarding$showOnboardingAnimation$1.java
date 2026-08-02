package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeOnboarding", f = "SwipeOnboarding.kt", l = {58}, m = "showOnboardingAnimation")
/* loaded from: classes11.dex */
final class SwipeOnboarding$showOnboardingAnimation$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeOnboarding this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeOnboarding$showOnboardingAnimation$1(SwipeOnboarding swipeOnboarding, d<? super SwipeOnboarding$showOnboardingAnimation$1> dVar) {
        super(dVar);
        this.this$0 = swipeOnboarding;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object showOnboardingAnimation;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        showOnboardingAnimation = this.this$0.showOnboardingAnimation(this);
        return showOnboardingAnimation;
    }
}
