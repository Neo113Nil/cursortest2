package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HelpCenterErrorScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$HelpCenterErrorScreenKt {
    public static final ComposableSingletons$HelpCenterErrorScreenKt INSTANCE = new ComposableSingletons$HelpCenterErrorScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f242lambda1 = ComposableLambdaKt.composableLambdaInstance(1440524092, false, ComposableSingletons$HelpCenterErrorScreenKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f243lambda2 = ComposableLambdaKt.composableLambdaInstance(1546364742, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterErrorScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                HelpCenterErrorScreenKt.HelpCenterErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, composer, 0, 2);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12420getLambda1$intercom_sdk_base_release() {
        return f242lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12421getLambda2$intercom_sdk_base_release() {
        return f243lambda2;
    }
}
