package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.models.EmptyState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TicketsEmptyScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$TicketsEmptyScreenKt {
    public static final ComposableSingletons$TicketsEmptyScreenKt INSTANCE = new ComposableSingletons$TicketsEmptyScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f386lambda1 = ComposableLambdaKt.composableLambdaInstance(222286787, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsEmptyScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TicketsEmptyScreenKt.TicketsEmptyScreen(new EmptyState("No Tickets", "Your tickets will be shown here", null, 4, null), null, composer, 0, 2);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f387lambda2 = ComposableLambdaKt.composableLambdaInstance(1347292286, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsEmptyScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TicketsEmptyScreenKt.INSTANCE.m12868getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12868getLambda1$intercom_sdk_base_release() {
        return f386lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12869getLambda2$intercom_sdk_base_release() {
        return f387lambda2;
    }
}
