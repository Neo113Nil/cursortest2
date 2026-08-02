package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.ttk0;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {46, 47}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$2$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$2$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, spj<? super AndroidEmbeddableWebViewAdPlayer$show$2$1> spjVar) {
        super(2, spjVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$2$1(this.this$0, this.$showOptions, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r5.requestShow(r1, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LifecycleDataSource lifecycleDataSource;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
            Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                throw new KotlinNothingValueException();
            }
            a.a(obj);
        }
        lifecycleDataSource = this.this$0.lifecycleDataSource;
        ttk0<Boolean> appActive = lifecycleDataSource.getAppActive();
        final AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this.this$0;
        lsr<? super Boolean> lsrVar = new lsr() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2$1.1
            @Override // xsna.lsr
            public /* bridge */ /* synthetic */ Object emit(Object obj2, spj spjVar) {
                return emit(((Boolean) obj2).booleanValue(), (spj<? super s3q0>) spjVar);
            }

            public final Object emit(boolean z, spj<? super s3q0> spjVar) {
                Object sendFocusChange = AndroidEmbeddableWebViewAdPlayer.this.webViewAdPlayer.sendFocusChange(z, spjVar);
                return sendFocusChange == CoroutineSingletons.COROUTINE_SUSPENDED ? sendFocusChange : s3q0.a;
            }
        };
        this.label = 2;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$2$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
