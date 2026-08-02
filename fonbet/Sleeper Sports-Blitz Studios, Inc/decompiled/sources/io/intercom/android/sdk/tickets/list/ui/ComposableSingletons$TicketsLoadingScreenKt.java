package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TicketsLoadingScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$TicketsLoadingScreenKt {
    public static final ComposableSingletons$TicketsLoadingScreenKt INSTANCE = new ComposableSingletons$TicketsLoadingScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f390lambda1 = ComposableLambdaKt.composableLambdaInstance(1055505090, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsLoadingScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TicketsLoadingScreenKt.TicketsLoadingScreen(null, composer, 0, 1);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f391lambda2 = ComposableLambdaKt.composableLambdaInstance(-1576251609, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsLoadingScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TicketsLoadingScreenKt.INSTANCE.m12872getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12872getLambda1$intercom_sdk_base_release() {
        return f390lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12873getLambda2$intercom_sdk_base_release() {
        return f391lambda2;
    }
}
