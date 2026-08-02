package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import java.util.Locale;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.swe0;
import xsna.yzs;
import xsna.zhd0;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@b6l(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1", f = "CommonAdViewerExposedFunctions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 extends SuspendLambda implements yzs<Long, Long, spj<? super s3q0>, Object> {
    final /* synthetic */ zhd0<OnDownloadProgressEvent> $$this$channelFlow;
    final /* synthetic */ String $downloadId;
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(zhd0<? super OnDownloadProgressEvent> zhd0Var, String str, spj<? super CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1> spjVar) {
        super(3, spjVar);
        this.$$this$channelFlow = zhd0Var;
        this.$downloadId = str;
    }

    public final Object invoke(long j, long j2, spj<? super s3q0> spjVar) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(this.$$this$channelFlow, this.$downloadId, spjVar);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$0 = j;
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$1 = j2;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        long j = this.J$0;
        long j2 = this.J$1;
        this.$$this$channelFlow.f(new OnDownloadProgressEvent(this.$downloadId, j2 > 0 ? new Integer(swe0.g((int) ((100 * j) / j2), 0, 100)) : null, j, new Long(j2), false, null, "REMOTE".toLowerCase(Locale.ROOT)));
        return s3q0.a;
    }

    @Override // xsna.yzs
    public /* bridge */ /* synthetic */ Object invoke(Long l, Long l2, spj<? super s3q0> spjVar) {
        return invoke(l.longValue(), l2.longValue(), spjVar);
    }
}
