package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HelpCenterEmptyScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$HelpCenterEmptyScreenKt {
    public static final ComposableSingletons$HelpCenterEmptyScreenKt INSTANCE = new ComposableSingletons$HelpCenterEmptyScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f241lambda1 = ComposableLambdaKt.composableLambdaInstance(-1732760450, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterEmptyScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                HelpCenterEmptyScreenKt.HelpCenterEmptyScreen(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), composer, 0, 0);
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12419getLambda1$intercom_sdk_base_release() {
        return f241lambda1;
    }
}
