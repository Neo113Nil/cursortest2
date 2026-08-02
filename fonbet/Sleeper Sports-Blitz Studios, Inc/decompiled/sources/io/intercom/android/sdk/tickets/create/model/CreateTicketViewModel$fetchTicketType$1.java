package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: CreateTicketViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1", f = "CreateTicketViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class CreateTicketViewModel$fetchTicketType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<TicketAttributeRequest> $attributes;
    Object L$0;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$fetchTicketType$1(CreateTicketViewModel createTicketViewModel, List<TicketAttributeRequest> list, Continuation<? super CreateTicketViewModel$fetchTicketType$1> continuation) {
        super(2, continuation);
        this.this$0 = createTicketViewModel;
        this.$attributes = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTicketViewModel$fetchTicketType$1(this.this$0, this.$attributes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTicketViewModel$fetchTicketType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TicketRepository ticketRepository;
        int i;
        MutableStateFlow mutableStateFlow;
        Object obj2;
        UserIdentity userIdentity;
        AppConfig appConfig;
        CreateTicketViewModel.CreateTicketFormUiState lastKnownContent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0._uiState;
            ticketRepository = this.this$0.ticketRepository;
            i = this.this$0.ticketTypeId;
            this.L$0 = mutableStateFlow2;
            this.label = 1;
            Object fetchTicketType = ticketRepository.fetchTicketType(i, this.$attributes, this);
            if (fetchTicketType == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow = mutableStateFlow2;
            obj = fetchTicketType;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.Success) {
            TicketTypeV2 ticketTypeV2 = (TicketTypeV2) ((NetworkResponse.Success) networkResponse).getBody();
            this.this$0.currentTicketType = ticketTypeV2;
            userIdentity = this.this$0.userIdentity;
            appConfig = this.this$0.config;
            lastKnownContent = this.this$0.getLastKnownContent();
            obj2 = CreateTicketReducerKt.convertToTicketFormUiState(ticketTypeV2, userIdentity, appConfig, lastKnownContent);
        } else if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            obj2 = (CreateTicketViewModel.CreateTicketFormUiState) new CreateTicketViewModel.CreateTicketFormUiState.Error(new ErrorState.WithoutCTA(0, 0, Boxing.boxInt(R.string.intercom_error_loading_ticket), 3, null));
        } else {
            if (!(networkResponse instanceof NetworkResponse.NetworkError)) {
                throw new NoWhenBranchMatchedException();
            }
            Integer boxInt = Boxing.boxInt(R.string.intercom_error_loading_ticket);
            final CreateTicketViewModel createTicketViewModel = this.this$0;
            final List<TicketAttributeRequest> list = this.$attributes;
            obj2 = (CreateTicketViewModel.CreateTicketFormUiState) new CreateTicketViewModel.CreateTicketFormUiState.Error(new ErrorState.WithCTA(0, 0, boxInt, 0, new Function0() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$fetchTicketType$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = CreateTicketViewModel$fetchTicketType$1.invokeSuspend$lambda$0(CreateTicketViewModel.this, list);
                    return invokeSuspend$lambda$0;
                }
            }, 11, null));
        }
        mutableStateFlow.setValue(obj2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CreateTicketViewModel createTicketViewModel, List list) {
        createTicketViewModel.fetchTicketType(list);
        return Unit.INSTANCE;
    }
}
