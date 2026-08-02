package com.braze.push;

import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: NotificationTrampolineActivity.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "com.braze.push.NotificationTrampolineActivity$onResume$7", f = "NotificationTrampolineActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class NotificationTrampolineActivity$onResume$7 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ NotificationTrampolineActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationTrampolineActivity$onResume$7(NotificationTrampolineActivity notificationTrampolineActivity, Continuation<? super NotificationTrampolineActivity$onResume$7> continuation) {
        super(1, continuation);
        this.this$0 = notificationTrampolineActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NotificationTrampolineActivity$onResume$7(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((NotificationTrampolineActivity$onResume$7) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.this$0, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.push.NotificationTrampolineActivity$onResume$7.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Delay complete. Finishing Notification trampoline activity now";
            }
        }, 2, (Object) null);
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
