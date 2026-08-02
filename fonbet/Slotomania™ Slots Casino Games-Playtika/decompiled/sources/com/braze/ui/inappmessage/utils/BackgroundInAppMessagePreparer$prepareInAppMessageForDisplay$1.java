package com.braze.ui.inappmessage.utils;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BackgroundInAppMessagePreparer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", f = "BackgroundInAppMessagePreparer.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(IInAppMessage iInAppMessage, Continuation<? super BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1> continuation) {
        super(2, continuation);
        this.$inAppMessageToPrepare = iInAppMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 = new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(this.$inAppMessageToPrepare, continuation);
        backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.L$0 = obj;
        return backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        CoroutineScope coroutineScope;
        IInAppMessage prepareInAppMessage;
        Object displayPreparedInAppMessage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                prepareInAppMessage = BackgroundInAppMessagePreparer.INSTANCE.prepareInAppMessage(this.$inAppMessageToPrepare);
                if (prepareInAppMessage != null) {
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    displayPreparedInAppMessage = BackgroundInAppMessagePreparer.INSTANCE.displayPreparedInAppMessage(prepareInAppMessage, this);
                    if (displayPreparedInAppMessage == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, coroutineScope2, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Cannot display the in-app message because the in-app message was null.";
                        }
                    }, 2, (Object) null);
                }
            } catch (Exception e) {
                exc = e;
                coroutineScope = coroutineScope2;
                BrazeLogger.INSTANCE.brazelog(coroutineScope, BrazeLogger.Priority.E, exc, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Caught error while preparing in app message in background";
                    }
                });
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                exc = e2;
                BrazeLogger.INSTANCE.brazelog(coroutineScope, BrazeLogger.Priority.E, exc, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Caught error while preparing in app message in background";
                    }
                });
                return Unit.INSTANCE;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
