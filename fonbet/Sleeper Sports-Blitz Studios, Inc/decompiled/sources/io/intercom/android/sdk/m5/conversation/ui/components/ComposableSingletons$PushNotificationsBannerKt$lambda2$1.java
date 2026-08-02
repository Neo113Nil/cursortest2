package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: PushNotificationsBanner.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$PushNotificationsBannerKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$PushNotificationsBannerKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PushNotificationsBannerKt$lambda2$1 INSTANCE = new ComposableSingletons$PushNotificationsBannerKt$lambda2$1();

    ComposableSingletons$PushNotificationsBannerKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            PushNotificationsBannerKt.PushNotificationsBanner(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$PushNotificationsBannerKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$PushNotificationsBannerKt$lambda-2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 54);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
