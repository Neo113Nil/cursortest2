package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import m0.C7980b;
import m0.C8008p;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$MatchShoppingCardsView$1$2$1 extends AbstractC7737t implements Function0<Float> {
    final /* synthetic */ C7980b<Float, C8008p> $bottomLightFraction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewKt$MatchShoppingCardsView$1$2$1(C7980b<Float, C8008p> c7980b) {
        super(0);
        this.$bottomLightFraction = c7980b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        float abs = Math.abs(this.$bottomLightFraction.k().floatValue());
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        return Float.valueOf(abs);
    }
}
