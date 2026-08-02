package io.intercom.android.sdk.m5.home.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HomeErrorContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$HomeErrorContentKt {
    public static final ComposableSingletons$HomeErrorContentKt INSTANCE = new ComposableSingletons$HomeErrorContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f264lambda1 = ComposableLambdaKt.composableLambdaInstance(146373455, false, ComposableSingletons$HomeErrorContentKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f265lambda2 = ComposableLambdaKt.composableLambdaInstance(-394516799, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.ComposableSingletons$HomeErrorContentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                HomeErrorContentKt.HomeErrorContent(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, composer, 0, 2);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12479getLambda1$intercom_sdk_base_release() {
        return f264lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12480getLambda2$intercom_sdk_base_release() {
        return f265lambda2;
    }
}
