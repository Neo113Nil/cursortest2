package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.animation;

import F5.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ConfettiLottieKt$LottieConfetti$2$1 extends AbstractC7737t implements Function0<Float> {
    final /* synthetic */ m $progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfettiLottieKt$LottieConfetti$2$1(m mVar) {
        super(0);
        this.$progress$delegate = mVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float LottieConfetti$lambda$1;
        LottieConfetti$lambda$1 = ConfettiLottieKt.LottieConfetti$lambda$1(this.$progress$delegate);
        return Float.valueOf(LottieConfetti$lambda$1);
    }
}
