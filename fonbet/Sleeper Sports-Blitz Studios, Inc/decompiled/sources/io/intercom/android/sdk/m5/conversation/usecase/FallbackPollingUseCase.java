package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: FallbackPollingUseCase.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0086B¢\u0006\u0002\u0010\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/FallbackPollingUseCase;", "", "appConfig", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "timeProvider", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "refreshConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "<init>", "(Lkotlin/jvm/functions/Function0;Lio/intercom/android/sdk/utilities/commons/TimeProvider;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;)V", "getAppConfig", "()Lkotlin/jvm/functions/Function0;", "getTimeProvider", "()Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "getRefreshConversationUseCase", "()Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FallbackPollingUseCase {
    public static final int $stable = 8;
    private final Function0<AppConfig> appConfig;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final TimeProvider timeProvider;

    public FallbackPollingUseCase(Function0<AppConfig> appConfig, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase) {
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
        this.refreshConversationUseCase = refreshConversationUseCase;
    }

    public /* synthetic */ FallbackPollingUseCase(Function0 function0, TimeProvider timeProvider, RefreshConversationUseCase refreshConversationUseCase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AppConfig _init_$lambda$0;
                _init_$lambda$0 = FallbackPollingUseCase._init_$lambda$0();
                return _init_$lambda$0;
            }
        } : function0, (i & 2) != 0 ? Injector.get().getTimeProvider() : timeProvider, refreshConversationUseCase);
    }

    public final Function0<AppConfig> getAppConfig() {
        return this.appConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return Injector.get().getDataLayer().getConfig().getValue();
    }

    public final TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    public final RefreshConversationUseCase getRefreshConversationUseCase() {
        return this.refreshConversationUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14.invoke(r13, r5, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r0) != r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e3 -> B:11:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, Continuation<? super Unit> continuation) {
        FallbackPollingUseCase$invoke$1 fallbackPollingUseCase$invoke$1;
        int i;
        FallbackPollingUseCase fallbackPollingUseCase;
        List<Part> parts;
        if (continuation instanceof FallbackPollingUseCase$invoke$1) {
            fallbackPollingUseCase$invoke$1 = (FallbackPollingUseCase$invoke$1) continuation;
            if ((fallbackPollingUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                fallbackPollingUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = fallbackPollingUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fallbackPollingUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    fallbackPollingUseCase = this;
                } else if (i == 1) {
                    mutableStateFlow = (MutableStateFlow) fallbackPollingUseCase$invoke$1.L$1;
                    fallbackPollingUseCase = (FallbackPollingUseCase) fallbackPollingUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    long syncInterval = fallbackPollingUseCase.appConfig.invoke().getConversationStateSyncSettings().getSyncInterval();
                    fallbackPollingUseCase$invoke$1.L$0 = fallbackPollingUseCase;
                    fallbackPollingUseCase$invoke$1.L$1 = mutableStateFlow;
                    fallbackPollingUseCase$invoke$1.label = 2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableStateFlow = (MutableStateFlow) fallbackPollingUseCase$invoke$1.L$1;
                    fallbackPollingUseCase = (FallbackPollingUseCase) fallbackPollingUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!fallbackPollingUseCase.appConfig.invoke().getConversationStateSyncSettings().getEnabled()) {
                    Conversation conversation = mutableStateFlow.getValue().getConversation();
                    Part part = null;
                    if (conversation != null && (parts = conversation.parts()) != null) {
                        ListIterator<Part> listIterator = parts.listIterator(parts.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            Part previous = listIterator.previous();
                            if (previous.isAdmin()) {
                                part = previous;
                                break;
                            }
                        }
                        part = part;
                    }
                    if (part != null) {
                        if (fallbackPollingUseCase.timeProvider.currentTimeMillis() - (part.getCreatedAt() * 1000) > fallbackPollingUseCase.appConfig.invoke().getConversationStateSyncSettings().getStartTimeout()) {
                            RefreshConversationUseCase refreshConversationUseCase = fallbackPollingUseCase.refreshConversationUseCase;
                            GetConversationReason getConversationReason = GetConversationReason.POLLING;
                            fallbackPollingUseCase$invoke$1.L$0 = fallbackPollingUseCase;
                            fallbackPollingUseCase$invoke$1.L$1 = mutableStateFlow;
                            fallbackPollingUseCase$invoke$1.label = 1;
                        }
                    }
                    long syncInterval2 = fallbackPollingUseCase.appConfig.invoke().getConversationStateSyncSettings().getSyncInterval();
                    fallbackPollingUseCase$invoke$1.L$0 = fallbackPollingUseCase;
                    fallbackPollingUseCase$invoke$1.L$1 = mutableStateFlow;
                    fallbackPollingUseCase$invoke$1.label = 2;
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
        fallbackPollingUseCase$invoke$1 = new FallbackPollingUseCase$invoke$1(this, continuation);
        Object obj2 = fallbackPollingUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fallbackPollingUseCase$invoke$1.label;
        if (i != 0) {
        }
        if (!fallbackPollingUseCase.appConfig.invoke().getConversationStateSyncSettings().getEnabled()) {
        }
    }
}
