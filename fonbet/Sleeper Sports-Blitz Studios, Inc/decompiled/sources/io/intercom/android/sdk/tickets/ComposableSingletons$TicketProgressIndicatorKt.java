package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TicketProgressIndicator.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$TicketProgressIndicatorKt {
    public static final ComposableSingletons$TicketProgressIndicatorKt INSTANCE = new ComposableSingletons$TicketProgressIndicatorKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f372lambda1 = ComposableLambdaKt.composableLambdaInstance(1410192629, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketProgressIndicatorKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TicketProgressIndicatorKt.m12838TicketProgressIndicator3IgeMak(TicketDetailContentKt.getSampleTicketDetailState().getTicketTimelineCardState().getProgressSections(), TicketDetailContentKt.getSampleTicketDetailState().getTicketTimelineCardState().m12843getProgressColor0d7_KjU(), null, composer, 8, 4);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12823getLambda1$intercom_sdk_base_release() {
        return f372lambda1;
    }
}
