package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class AndroidFullscreenWebViewAdPlayer$show$9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $defaultIntentFlags;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ CompletableDeferred<Unit> $listenerStarted;
    final /* synthetic */ int $selectedIntentFlags;
    final /* synthetic */ ShowOptions $showOptions;
    final /* synthetic */ Context $startContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFullscreenWebViewAdPlayer$show$9(CompletableDeferred<Unit> completableDeferred, Context context, Intent intent, int i, int i2, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, Continuation<? super AndroidFullscreenWebViewAdPlayer$show$9> continuation) {
        super(2, continuation);
        this.$listenerStarted = completableDeferred;
        this.$startContext = context;
        this.$intent = intent;
        this.$selectedIntentFlags = i;
        this.$defaultIntentFlags = i2;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.unity3d.ads");
        p0.startActivity(p1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidFullscreenWebViewAdPlayer$show$9 androidFullscreenWebViewAdPlayer$show$9 = new AndroidFullscreenWebViewAdPlayer$show$9(this.$listenerStarted, this.$startContext, this.$intent, this.$selectedIntentFlags, this.$defaultIntentFlags, this.this$0, this.$showOptions, continuation);
        androidFullscreenWebViewAdPlayer$show$9.L$0 = obj;
        return androidFullscreenWebViewAdPlayer$show$9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidFullscreenWebViewAdPlayer$show$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m11180constructorimpl;
        Intent intent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = (CoroutineScope) this.L$0;
            this.label = 1;
            if (this.$listenerStarted.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Context context = this.$startContext;
        Intent intent2 = this.$intent;
        try {
            Result.Companion companion = Result.INSTANCE;
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent2);
            m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        int i2 = this.$selectedIntentFlags;
        int i3 = this.$defaultIntentFlags;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        Context context2 = this.$startContext;
        ShowOptions showOptions = this.$showOptions;
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            if (i2 != i3) {
                intent = androidFullscreenWebViewAdPlayer.getIntent(context2, (AndroidShowOptions) showOptions, i3);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context2, intent);
            } else {
                throw m11183exceptionOrNullimpl;
            }
        }
        return Unit.INSTANCE;
    }
}
