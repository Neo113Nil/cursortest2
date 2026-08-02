package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import S0.A1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ReactionButtonKt$ReactionButton$5$1$1 extends AbstractC7737t implements Function0<Float> {
    final /* synthetic */ A1<Float> $animatedPressedStrokeAlpha$delegate;
    final /* synthetic */ Function0<Float> $preferredPressedStrokeAlpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactionButtonKt$ReactionButton$5$1$1(Function0<Float> function0, A1<Float> a12) {
        super(0);
        this.$preferredPressedStrokeAlpha = function0;
        this.$animatedPressedStrokeAlpha$delegate = a12;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float ReactionButton$lambda$4;
        ReactionButton$lambda$4 = ReactionButtonKt.ReactionButton$lambda$4(this.$animatedPressedStrokeAlpha$delegate);
        return Float.valueOf(Math.max(ReactionButton$lambda$4, this.$preferredPressedStrokeAlpha.invoke().floatValue()));
    }
}
