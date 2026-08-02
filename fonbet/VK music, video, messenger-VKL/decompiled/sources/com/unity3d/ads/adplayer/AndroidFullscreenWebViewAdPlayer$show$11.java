package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.n7i;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$11 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $defaultIntentFlags;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ n7i<s3q0> $listenerStarted;
    final /* synthetic */ int $selectedIntentFlags;
    final /* synthetic */ ShowOptions $showOptions;
    final /* synthetic */ Context $startContext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$11(n7i<s3q0> n7iVar, Context context, Intent intent, int i, int i2, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, spj<? super AndroidFullscreenWebViewAdPlayer$show$11> spjVar) {
        super(2, spjVar);
        this.$listenerStarted = n7iVar;
        this.$startContext = context;
        this.$intent = intent;
        this.$selectedIntentFlags = i;
        this.$defaultIntentFlags = i2;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidFullscreenWebViewAdPlayer$show$11 androidFullscreenWebViewAdPlayer$show$11 = new AndroidFullscreenWebViewAdPlayer$show$11(this.$listenerStarted, this.$startContext, this.$intent, this.$selectedIntentFlags, this.$defaultIntentFlags, this.this$0, this.$showOptions, spjVar);
        androidFullscreenWebViewAdPlayer$show$11.L$0 = obj;
        return androidFullscreenWebViewAdPlayer$show$11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Intent intent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            n7i<s3q0> n7iVar = this.$listenerStarted;
            this.L$0 = yvjVar;
            this.label = 1;
            if (n7iVar.H(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        try {
            this.$startContext.startActivity(this.$intent);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        int i2 = this.$selectedIntentFlags;
        int i3 = this.$defaultIntentFlags;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        Context context = this.$startContext;
        ShowOptions showOptions = this.$showOptions;
        Throwable a = Result.a(failure);
        if (a != null) {
            if (i2 == i3) {
                throw a;
            }
            intent = androidFullscreenWebViewAdPlayer.getIntent(context, (AndroidShowOptions) showOptions, i3);
            context.startActivity(intent);
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$11) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
