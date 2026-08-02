package com.braze;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BrazeActivityLifecycleCallbackListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$2", f = "BrazeActivityLifecycleCallbackListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class BrazeActivityLifecycleCallbackListener$onActivityCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BrazeActivityLifecycleCallbackListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrazeActivityLifecycleCallbackListener$onActivityCreated$2(Context context, BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener, Continuation<? super BrazeActivityLifecycleCallbackListener$onActivityCreated$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.this$0 = brazeActivityLifecycleCallbackListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BrazeActivityLifecycleCallbackListener$onActivityCreated$2 brazeActivityLifecycleCallbackListener$onActivityCreated$2 = new BrazeActivityLifecycleCallbackListener$onActivityCreated$2(this.$context, this.this$0, continuation);
        brazeActivityLifecycleCallbackListener$onActivityCreated$2.L$0 = obj;
        return brazeActivityLifecycleCallbackListener$onActivityCreated$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BrazeActivityLifecycleCallbackListener$onActivityCreated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        try {
            Context context = this.$context;
            Intrinsics.checkNotNull(context);
            this.this$0.setShouldPersistWebView(Boxing.boxBoolean(new BrazeConfigurationProvider(context).getShouldPersistWebViewWhenBackgroundingApp()));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = BrazeActivityLifecycleCallbackListener$onActivityCreated$2.invokeSuspend$lambda$0();
                    return invokeSuspend$lambda$0;
                }
            }, 4, (Object) null);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        final BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener = this.this$0;
        BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, priority, (Throwable) null, false, new Function0() { // from class: com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String invokeSuspend$lambda$1;
                invokeSuspend$lambda$1 = BrazeActivityLifecycleCallbackListener$onActivityCreated$2.invokeSuspend$lambda$1(BrazeActivityLifecycleCallbackListener.this);
                return invokeSuspend$lambda$1;
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0() {
        return "Error while reading shouldPersistWebViewWhenBackgroundingApp from BrazeConfigurationProvider";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "Async load of shouldPersistWebView completed: " + brazeActivityLifecycleCallbackListener.getShouldPersistWebView();
    }
}
