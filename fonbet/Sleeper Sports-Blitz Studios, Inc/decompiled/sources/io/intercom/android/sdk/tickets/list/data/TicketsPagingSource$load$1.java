package io.intercom.android.sdk.tickets.list.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.mp4parser.boxes.apple.TrackLoadSettingsAtom;

/* compiled from: TicketsPagingSource.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.list.data.TicketsPagingSource", f = "TicketsPagingSource.kt", i = {0}, l = {14}, m = TrackLoadSettingsAtom.TYPE, n = {"params"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class TicketsPagingSource$load$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TicketsPagingSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TicketsPagingSource$load$1(TicketsPagingSource ticketsPagingSource, Continuation<? super TicketsPagingSource$load$1> continuation) {
        super(continuation);
        this.this$0 = ticketsPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(null, this);
    }
}
