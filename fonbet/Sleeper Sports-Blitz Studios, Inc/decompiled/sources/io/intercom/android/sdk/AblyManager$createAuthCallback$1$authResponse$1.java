package io.intercom.android.sdk;

import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.AblyAuthResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AblyManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/AblyAuthResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.AblyManager$createAuthCallback$1$authResponse$1", f = "AblyManager.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class AblyManager$createAuthCallback$1$authResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResponse<? extends AblyAuthResponse>>, Object> {
    int label;
    final /* synthetic */ AblyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AblyManager$createAuthCallback$1$authResponse$1(AblyManager ablyManager, Continuation<? super AblyManager$createAuthCallback$1$authResponse$1> continuation) {
        super(2, continuation);
        this.this$0 = ablyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AblyManager$createAuthCallback$1$authResponse$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResponse<? extends AblyAuthResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super NetworkResponse<AblyAuthResponse>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super NetworkResponse<AblyAuthResponse>> continuation) {
        return ((AblyManager$createAuthCallback$1$authResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MessengerApi messengerApi;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        messengerApi = this.this$0.messengerApi;
        this.label = 1;
        Object ablyAuthTokenSuspend$default = MessengerApi.DefaultImpls.getAblyAuthTokenSuspend$default(messengerApi, null, this, 1, null);
        return ablyAuthTokenSuspend$default == coroutine_suspended ? coroutine_suspended : ablyAuthTokenSuspend$default;
    }
}
