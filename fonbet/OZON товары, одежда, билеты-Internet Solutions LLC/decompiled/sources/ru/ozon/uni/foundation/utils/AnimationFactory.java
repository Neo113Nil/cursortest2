package ru.ozon.uni.foundation.utils;

import Z1.h;
import androidx.compose.animation.b;
import androidx.compose.animation.q;
import androidx.compose.animation.s;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import l1.C7807Z;
import m0.C8004n;
import m0.F;
import m0.T0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u0007J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0007J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0007J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0000¢\u0006\u0004\b\u001f\u0010\u0007¨\u0006!"}, d2 = {"Lru/ozon/uni/foundation/utils/AnimationFactory;", "", "<init>", "()V", "Lm0/T0;", "Ll1/Z;", "easeInCircColor$uni_release", "()Lm0/T0;", "easeInCircColor", "easeOutCircColor$uni_release", "easeOutCircColor", "", "easeInCircFloat$uni_release", "easeInCircFloat", "easeInOutCircFloat$uni_release", "easeInOutCircFloat", "easeInOutCircColor$uni_release", "easeInOutCircColor", "LZ1/h;", "easeInCircDp$uni_release", "easeInCircDp", "easeOutCircDp$uni_release", "easeOutCircDp", "Landroidx/compose/animation/q;", "animShowIcon$uni_release", "()Landroidx/compose/animation/q;", "animShowIcon", "Landroidx/compose/animation/s;", "animHideIcon$uni_release", "()Landroidx/compose/animation/s;", "animHideIcon", "animNotificationBarSwipe$uni_release", "animNotificationBarSwipe", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnimationFactory {

    @NotNull
    public static final AnimationFactory INSTANCE = new AnimationFactory();

    private AnimationFactory() {
    }

    @NotNull
    public final s animHideIcon$uni_release() {
        return b.i(C8004n.d(100, 0, F.f(), 2), 2).c(b.k(C8004n.d(100, 0, F.f(), 2)));
    }

    @NotNull
    public final T0<Float> animNotificationBarSwipe$uni_release() {
        return C8004n.d(380, 0, F.c(), 2);
    }

    @NotNull
    public final q animShowIcon$uni_release() {
        return b.h(C8004n.d(100, 0, F.b(), 2), 2).c(b.j(C8004n.d(100, 0, F.b(), 2), 0.5f));
    }

    @NotNull
    public final T0<C7807Z> easeInCircColor$uni_release() {
        return C8004n.d(100, 0, F.b(), 2);
    }

    @NotNull
    public final T0<h> easeInCircDp$uni_release() {
        return C8004n.d(100, 0, F.b(), 2);
    }

    @NotNull
    public final T0<Float> easeInCircFloat$uni_release() {
        return C8004n.d(100, 0, F.b(), 2);
    }

    @NotNull
    public final T0<C7807Z> easeInOutCircColor$uni_release() {
        return C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, F.d(), 2);
    }

    @NotNull
    public final T0<Float> easeInOutCircFloat$uni_release() {
        return C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, F.d(), 2);
    }

    @NotNull
    public final T0<C7807Z> easeOutCircColor$uni_release() {
        return C8004n.d(100, 0, F.f(), 2);
    }

    @NotNull
    public final T0<h> easeOutCircDp$uni_release() {
        return C8004n.d(100, 0, F.f(), 2);
    }
}
