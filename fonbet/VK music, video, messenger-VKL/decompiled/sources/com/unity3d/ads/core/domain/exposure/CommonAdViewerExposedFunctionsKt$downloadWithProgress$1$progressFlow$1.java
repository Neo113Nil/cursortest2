package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.domain.CacheFile;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zhd0;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@b6l(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1", f = "CommonAdViewerExposedFunctions.kt", l = {368, 376, 380}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 extends SuspendLambda implements wzs<zhd0<? super OnDownloadProgressEvent>, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;
    final /* synthetic */ String $downloadId;
    final /* synthetic */ JSONArray $headers;
    final /* synthetic */ int $intervalMs;
    final /* synthetic */ int $priority;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(CacheFile cacheFile, String str, AdObject adObject, JSONArray jSONArray, int i, int i2, String str2, spj<? super CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1> spjVar) {
        super(2, spjVar);
        this.$cacheFile = cacheFile;
        this.$url = str;
        this.$adObject = adObject;
        this.$headers = jSONArray;
        this.$priority = i;
        this.$intervalMs = i2;
        this.$downloadId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(this.$cacheFile, this.$url, this.$adObject, this.$headers, this.$priority, this.$intervalMs, this.$downloadId, spjVar);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1.L$0 = obj;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        if (r12.t(r13, r22) == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e4, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        if (r12.t(r13, r22) == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r0 == r8) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var;
        Object invoke;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            zhd0Var = (zhd0) this.L$0;
            CacheFile cacheFile = this.$cacheFile;
            String str = this.$url;
            AdObject adObject = this.$adObject;
            JSONArray jSONArray = this.$headers;
            int i2 = this.$priority;
            int i3 = this.$intervalMs;
            CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(zhd0Var, this.$downloadId, null);
            this.L$0 = zhd0Var;
            this.label = 1;
            invoke = cacheFile.invoke(str, adObject, jSONArray, i2, i3, commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                return s3q0.a;
            }
            zhd0 zhd0Var2 = (zhd0) this.L$0;
            a.a(obj);
            zhd0Var = zhd0Var2;
            invoke = obj;
        }
        CacheResult cacheResult = (CacheResult) invoke;
        if (cacheResult instanceof CacheResult.Success) {
            CacheResult.Success success = (CacheResult.Success) cacheResult;
            OnDownloadProgressEvent onDownloadProgressEvent = new OnDownloadProgressEvent(this.$downloadId, new Integer(100), success.getSource() == CacheSource.LOCAL ? 0L : success.getCachedFile().getContentLength(), new Long(success.getCachedFile().getContentLength()), true, null, success.getSource().name().toLowerCase(Locale.ROOT));
            this.L$0 = null;
            this.label = 2;
        } else {
            if (!(cacheResult instanceof CacheResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
            OnDownloadProgressEvent onDownloadProgressEvent2 = new OnDownloadProgressEvent(this.$downloadId, null, 0L, null, true, failure.getError().name(), failure.getSource().name().toLowerCase(Locale.ROOT));
            this.L$0 = null;
            this.label = 3;
        }
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super OnDownloadProgressEvent> zhd0Var, spj<? super s3q0> spjVar) {
        return ((CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }
}
