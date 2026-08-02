package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PushNotificationsBanner.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$PushNotificationsBannerKt {
    public static final ComposableSingletons$PushNotificationsBannerKt INSTANCE = new ComposableSingletons$PushNotificationsBannerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f170lambda1 = ComposableLambdaKt.composableLambdaInstance(772935366, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$PushNotificationsBannerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_close, composer, 0), StringResources_androidKt.stringResource(io.intercom.android.sdk.R.string.intercom_close, composer, 0), SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13118getReminderTextColor0d7_KjU(), composer, 392, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f171lambda2 = ComposableLambdaKt.composableLambdaInstance(-353143684, false, ComposableSingletons$PushNotificationsBannerKt$lambda2$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12207getLambda1$intercom_sdk_base_release() {
        return f170lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12208getLambda2$intercom_sdk_base_release() {
        return f171lambda2;
    }
}
