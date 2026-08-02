package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates;

import androidx.compose.animation.b;
import androidx.compose.animation.q;
import androidx.compose.animation.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.C7770n;
import l0.N;
import l0.r;
import m0.C8004n;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationUIState;
import ru.ozon.fintech.ui.input.CounterView;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/r;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationUIState;", "Ll0/N;", "invoke", "(Ll0/r;)Ll0/N;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$1$1 extends AbstractC7737t implements Function1<r<TopAuthorAnimationUIState>, N> {
    public static final TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$1$1 INSTANCE = new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$1$1();

    TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3$2$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final N invoke(r<TopAuthorAnimationUIState> AnimatedContent) {
        q qVar;
        s sVar;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (Intrinsics.d(AnimatedContent.c(), TopAuthorAnimationUIState.Animating.INSTANCE) && Intrinsics.d(AnimatedContent.b(), TopAuthorAnimationUIState.Final.INSTANCE)) {
            return C7770n.c(b.h(C8004n.d(CounterView.COUNTER_MAX_DEFAULT, 0, null, 6), 2), b.i(C8004n.d(CounterView.COUNTER_MAX_DEFAULT, 0, null, 6), 2));
        }
        qVar = q.f38814a;
        sVar = s.f38816a;
        return C7770n.c(qVar, sVar);
    }
}
