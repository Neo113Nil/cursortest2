package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TeamIntro.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$TeamIntroKt {
    public static final ComposableSingletons$TeamIntroKt INSTANCE = new ComposableSingletons$TeamIntroKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f228lambda1 = ComposableLambdaKt.composableLambdaInstance(-1269548050, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TeamIntroKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TeamIntroKt.TeamIntro("Our response times are slower than usual. We’re working hard to get to your <a href=\"https://google.com\">message</a>", null, composer, 6, 2);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f229lambda2 = ComposableLambdaKt.composableLambdaInstance(-1462580525, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TeamIntroKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TeamIntroKt.INSTANCE.m12363getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12363getLambda1$intercom_sdk_base_release() {
        return f228lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12364getLambda2$intercom_sdk_base_release() {
        return f229lambda2;
    }
}
