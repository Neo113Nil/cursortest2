package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: WrapReportingText.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$WrapReportingTextKt {
    public static final ComposableSingletons$WrapReportingTextKt INSTANCE = new ComposableSingletons$WrapReportingTextKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f275lambda1 = ComposableLambdaKt.composableLambdaInstance(136624489, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$WrapReportingTextKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                WrapReportingTextKt.m12504WrapReportingTextT042LqI(null, "Hello there", Color.INSTANCE.m6077getYellow0d7_KjU(), IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType01(), null, composer, 432, 17);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12495getLambda1$intercom_sdk_base_release() {
        return f275lambda1;
    }
}
