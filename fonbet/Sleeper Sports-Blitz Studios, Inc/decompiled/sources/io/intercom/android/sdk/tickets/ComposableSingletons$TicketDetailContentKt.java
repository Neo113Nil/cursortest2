package io.intercom.android.sdk.tickets;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TicketDetailContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$TicketDetailContentKt {
    public static final ComposableSingletons$TicketDetailContentKt INSTANCE = new ComposableSingletons$TicketDetailContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f363lambda1 = ComposableLambdaKt.composableLambdaInstance(1736217426, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketDetailContentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TicketDetailContentKt.TicketSubmissionCard(null, composer, 0, 1);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f364lambda2 = ComposableLambdaKt.composableLambdaInstance(534743373, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketDetailContentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m12814getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f365lambda3 = ComposableLambdaKt.composableLambdaInstance(-312754839, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketDetailContentKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TicketDetailContentKt.TicketDetailContent(null, TicketDetailContentKt.getSampleTicketDetailState(), null, false, composer, 64, 13);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f366lambda4 = ComposableLambdaKt.composableLambdaInstance(-599541844, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketDetailContentKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TicketDetailContentKt.TicketDetailContent(null, TicketDetailContentKt.getSampleTicketDetailState(), null, true, composer, 3136, 5);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12814getLambda1$intercom_sdk_base_release() {
        return f363lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12815getLambda2$intercom_sdk_base_release() {
        return f364lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12816getLambda3$intercom_sdk_base_release() {
        return f365lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12817getLambda4$intercom_sdk_base_release() {
        return f366lambda4;
    }
}
