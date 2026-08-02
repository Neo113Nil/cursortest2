package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Elevation.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u0001*\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080@¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"animateElevation", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", TypedValues.AttributesType.S_TARGET, "from", "Landroidx/compose/foundation/interaction/Interaction;", "to", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DefaultIncomingSpec", "Landroidx/compose/animation/core/TweenSpec;", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ElevationKt {
    private static final TweenSpec<Dp> DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final TweenSpec<Dp> DefaultOutgoingSpec = new TweenSpec<>(150, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);
    private static final TweenSpec<Dp> HoveredOutgoingSpec = new TweenSpec<>(120, 0, new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m2334animateElevationrAjV9yQ$default(Animatable animatable, float f, Interaction interaction, Interaction interaction2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m2333animateElevationrAjV9yQ(animatable, f, interaction, interaction2, continuation);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m2333animateElevationrAjV9yQ(Animatable<Dp, ?> animatable, float f, Interaction interaction, Interaction interaction2, Continuation<? super Unit> continuation) {
        AnimationSpec<Dp> outgoingAnimationSpecForInteraction;
        if (interaction2 != null) {
            outgoingAnimationSpecForInteraction = ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2);
        } else {
            outgoingAnimationSpecForInteraction = interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        }
        AnimationSpec<Dp> animationSpec = outgoingAnimationSpecForInteraction;
        if (animationSpec != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, Dp.m8796boximpl(f), animationSpec, null, null, continuation, 12, null);
            return animateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : Unit.INSTANCE;
        }
        Object snapTo = animatable.snapTo(Dp.m8796boximpl(f), continuation);
        return snapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : Unit.INSTANCE;
    }
}
