package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.model.OnDownloadProgressEvent;
import defpackage.a70;
import defpackage.ct8;
import defpackage.hoi;
import defpackage.il4;
import defpackage.j8f;
import defpackage.k8f;
import defpackage.llf;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "bytesDownloaded", "", "totalBytes"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1", f = "CommonAdViewerExposedFunctions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 extends hoi implements ct8 {
    final /* synthetic */ k8f $$this$channelFlow;
    final /* synthetic */ String $downloadId;
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(k8f k8fVar, String str, rq3<? super CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1> rq3Var) {
        super(3, rq3Var);
        this.$$this$channelFlow = k8fVar;
        this.$downloadId = str;
    }

    @Override // defpackage.ct8
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (rq3<? super Unit>) obj3);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        long j = this.J$0;
        long j2 = this.J$1;
        Integer num = j2 > 0 ? new Integer(llf.c((int) ((100 * j) / j2), 0, 100)) : null;
        k8f k8fVar = this.$$this$channelFlow;
        String str = this.$downloadId;
        Long l = new Long(j2);
        String lowerCase = "REMOTE".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ((j8f) k8fVar).d(new OnDownloadProgressEvent(str, num, j, l, false, null, lowerCase));
        return Unit.a;
    }

    public final Object invoke(long j, long j2, rq3<? super Unit> rq3Var) {
        CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1 = new CommonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1(this.$$this$channelFlow, this.$downloadId, rq3Var);
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$0 = j;
        commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.J$1 = j2;
        return commonAdViewerExposedFunctionsKt$downloadWithProgress$1$progressFlow$1$result$1.invokeSuspend(Unit.a);
    }
}
