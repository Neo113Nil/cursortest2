package io.intercom.android.sdk.tickets.create.data;

import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: TicketApi.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/create/data/TicketApi;", "", "createTicket", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Ticket;", "options", "Lokhttp3/RequestBody;", "(Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTickets", "Lio/intercom/android/sdk/tickets/list/data/TicketsResponse;", "fetchTicketDetail", "ticketId", "", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "", "fetchTicketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface TicketApi {
    @POST("tickets/create")
    Object createTicket(@Body RequestBody requestBody, Continuation<? super NetworkResponse<Ticket>> continuation);

    @POST("tickets/{ticketId}")
    Object fetchTicketDetail(@Path("ticketId") String str, @Body RequestBody requestBody, Continuation<? super NetworkResponse<Ticket>> continuation);

    @POST("tickets/ticket_form")
    Object fetchTicketType(@Body RequestBody requestBody, Continuation<? super NetworkResponse<TicketTypeV2>> continuation);

    @POST("tickets")
    Object fetchTickets(@Body RequestBody requestBody, Continuation<? super NetworkResponse<TicketsResponse>> continuation);

    @POST("tickets/{ticketId}/read")
    Object markAsRead(@Path("ticketId") String str, @Body RequestBody requestBody, Continuation<? super NetworkResponse<Unit>> continuation);
}
