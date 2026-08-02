package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MessageList.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$MessageListKt {
    public static final ComposableSingletons$MessageListKt INSTANCE = new ComposableSingletons$MessageListKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f162lambda1 = ComposableLambdaKt.composableLambdaInstance(-1700750122, false, ComposableSingletons$MessageListKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f163lambda2 = ComposableLambdaKt.composableLambdaInstance(-1893782597, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageListKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$MessageListKt.INSTANCE.m12199getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f164lambda3 = ComposableLambdaKt.composableLambdaInstance(-1994026371, false, ComposableSingletons$MessageListKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f165lambda4 = ComposableLambdaKt.composableLambdaInstance(-1974105416, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MessageListKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$MessageListKt.INSTANCE.m12201getLambda3$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12199getLambda1$intercom_sdk_base_release() {
        return f162lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12200getLambda2$intercom_sdk_base_release() {
        return f163lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12201getLambda3$intercom_sdk_base_release() {
        return f164lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12202getLambda4$intercom_sdk_base_release() {
        return f165lambda4;
    }
}
