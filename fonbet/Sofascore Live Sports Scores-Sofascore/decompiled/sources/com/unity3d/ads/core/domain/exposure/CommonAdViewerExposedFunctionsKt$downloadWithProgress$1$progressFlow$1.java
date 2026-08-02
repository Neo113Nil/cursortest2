package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.domain.CacheFile;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.k8f;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk8f;", "Lcom/unity3d/ads/adplayer/model/OnDownloadProgressEvent;", "", "<anonymous>", "(Lk8f;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1", f = "CommonAdViewerExposedFunctions.kt", l = {368, 376, 380}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 extends hoi implements Function2<k8f, rq3<? super Unit>, Object> {
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
    public CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(CacheFile cacheFile, String str, AdObject adObject, JSONArray jSONArray, int i, int i2, String str2, rq3<? super CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1> rq3Var) {
        super(2, rq3Var);
        this.$cacheFile = cacheFile;
        this.$url = str;
        this.$adObject = adObject;
        this.$headers = jSONArray;
        this.$priority = i;
        this.$intervalMs = i2;
        this.$downloadId = str2;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1(this.$cacheFile, this.$url, this.$adObject, this.$headers, this.$priority, this.$intervalMs, this.$downloadId, rq3Var);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1.L$0 = obj;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k8f k8fVar, rq3<? super Unit> rq3Var) {
        return ((CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1) create(k8fVar, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (((defpackage.j8f) r12).e.q(r22, r13) == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f3, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
    
        if (((defpackage.j8f) r12).e.q(r22, r13) == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r0 == r8) goto L29;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k8f k8fVar;
        Object invoke;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            k8fVar = (k8f) this.L$0;
            CacheFile cacheFile = this.$cacheFile;
            String str = this.$url;
            str.getClass();
            AdObject adObject = this.$adObject;
            JSONArray jSONArray = this.$headers;
            int i2 = this.$priority;
            int i3 = this.$intervalMs;
            CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(k8fVar, this.$downloadId, null);
            this.L$0 = k8fVar;
            this.label = 1;
            invoke = cacheFile.invoke(str, adObject, jSONArray, i2, i3, commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1, this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k8f k8fVar2 = (k8f) this.L$0;
            y6a.M(obj);
            k8fVar = k8fVar2;
            invoke = obj;
        }
        CacheResult cacheResult = (CacheResult) invoke;
        if (cacheResult instanceof CacheResult.Success) {
            CacheResult.Success success = (CacheResult.Success) cacheResult;
            String lowerCase = success.getSource().name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            OnDownloadProgressEvent onDownloadProgressEvent = new OnDownloadProgressEvent(this.$downloadId, new Integer(100), success.getSource() == CacheSource.LOCAL ? 0L : success.getCachedFile().getContentLength(), new Long(success.getCachedFile().getContentLength()), true, null, lowerCase);
            this.L$0 = null;
            this.label = 2;
        } else {
            if (!(cacheResult instanceof CacheResult.Failure)) {
                zzl.b();
                return null;
            }
            CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
            String lowerCase2 = failure.getSource().name().toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            OnDownloadProgressEvent onDownloadProgressEvent2 = new OnDownloadProgressEvent(this.$downloadId, null, 0L, null, true, failure.getError().name(), lowerCase2);
            this.L$0 = null;
            this.label = 3;
        }
    }
}
