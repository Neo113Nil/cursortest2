package io.intercom.android.sdk.tickets.list.ui;

import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.reducers.TicketRowReducerKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: TicketsScreenViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class TicketsScreenViewModel$pagerFlow$1$1 extends AdaptedFunctionReference implements Function2<Ticket, Continuation<? super TicketRowData>, Object>, SuspendFunction {
    public static final TicketsScreenViewModel$pagerFlow$1$1 INSTANCE = new TicketsScreenViewModel$pagerFlow$1$1();

    TicketsScreenViewModel$pagerFlow$1$1() {
        super(2, TicketRowReducerKt.class, "reduceTicketRowData", "reduceTicketRowData(Lio/intercom/android/sdk/models/Ticket;)Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", 5);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ticket ticket, Continuation<? super TicketRowData> continuation) {
        Object pagerFlow$lambda$1$reduceTicketRowData;
        pagerFlow$lambda$1$reduceTicketRowData = TicketsScreenViewModel.pagerFlow$lambda$1$reduceTicketRowData(ticket, continuation);
        return pagerFlow$lambda$1$reduceTicketRowData;
    }
}
