package io.intercom.android.sdk.ui.common;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: Transitions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"floatingButtonEnterTransition", "Landroidx/compose/animation/EnterTransition;", "slideOffset", "", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransitionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int floatingButtonEnterTransition$lambda$0(int i, int i2) {
        return i2 + i;
    }

    public static final EnterTransition floatingButtonEnterTransition(final int i) {
        return EnterExitTransitionKt.m411scaleInL8ZKhE$default(null, 0.8f, 0L, 5, null).plus(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.spring$default(0.75f, 500.0f, null, 4, null), new Function1() { // from class: io.intercom.android.sdk.ui.common.TransitionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int floatingButtonEnterTransition$lambda$0;
                floatingButtonEnterTransition$lambda$0 = TransitionsKt.floatingButtonEnterTransition$lambda$0(i, ((Integer) obj).intValue());
                return Integer.valueOf(floatingButtonEnterTransition$lambda$0);
            }
        }));
    }
}
