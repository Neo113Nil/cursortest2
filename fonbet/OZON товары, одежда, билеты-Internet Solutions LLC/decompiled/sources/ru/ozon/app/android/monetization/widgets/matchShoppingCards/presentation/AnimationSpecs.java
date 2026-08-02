package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import kotlin.Metadata;
import m0.C8004n;
import m0.F;
import m0.T0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/AnimationSpecs;", "", "<init>", "()V", "Lm0/T0;", "", "cardSwipeOut", "Lm0/T0;", "getCardSwipeOut", "()Lm0/T0;", "bottomLightReturn", "getBottomLightReturn", "reactionButtonPress", "getReactionButtonPress", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnimationSpecs {

    @NotNull
    public static final AnimationSpecs INSTANCE = new AnimationSpecs();

    @NotNull
    private static final T0<Float> cardSwipeOut = C8004n.d(400, 0, F.c(), 2);

    @NotNull
    private static final T0<Float> bottomLightReturn = C8004n.d(100, 0, F.c(), 2);

    @NotNull
    private static final T0<Float> reactionButtonPress = C8004n.d(100, 0, F.c(), 2);

    private AnimationSpecs() {
    }

    @NotNull
    public final T0<Float> getBottomLightReturn() {
        return bottomLightReturn;
    }

    @NotNull
    public final T0<Float> getCardSwipeOut() {
        return cardSwipeOut;
    }

    @NotNull
    public final T0<Float> getReactionButtonPress() {
        return reactionButtonPress;
    }
}
