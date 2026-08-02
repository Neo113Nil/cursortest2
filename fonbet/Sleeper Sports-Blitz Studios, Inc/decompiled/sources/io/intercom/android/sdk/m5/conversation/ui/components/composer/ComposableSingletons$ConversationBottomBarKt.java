package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ConversationBottomBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$ConversationBottomBarKt {
    public static final ComposableSingletons$ConversationBottomBarKt INSTANCE = new ComposableSingletons$ConversationBottomBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f182lambda1 = ComposableLambdaKt.composableLambdaInstance(-2128348862, false, ComposableSingletons$ConversationBottomBarKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f183lambda2 = ComposableLambdaKt.composableLambdaInstance(-1450542915, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$ConversationBottomBarKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(Modifier.INSTANCE, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m12261getLambda1$intercom_sdk_base_release(), composer, 12582918, 126);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f184lambda3 = ComposableLambdaKt.composableLambdaInstance(1085707115, false, ComposableSingletons$ConversationBottomBarKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f185lambda4 = ComposableLambdaKt.composableLambdaInstance(-753965082, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$ConversationBottomBarKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(500)), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m12263getLambda3$intercom_sdk_base_release(), composer, 12582918, 126);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12261getLambda1$intercom_sdk_base_release() {
        return f182lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12262getLambda2$intercom_sdk_base_release() {
        return f183lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12263getLambda3$intercom_sdk_base_release() {
        return f184lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12264getLambda4$intercom_sdk_base_release() {
        return f185lambda4;
    }
}
