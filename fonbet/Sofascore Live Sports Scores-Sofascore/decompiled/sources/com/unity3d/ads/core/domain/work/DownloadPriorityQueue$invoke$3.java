package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", f = "DownloadPriorityQueue.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class DownloadPriorityQueue$invoke$3 extends hoi implements Function2<DownloadPriorityQueue.PriorityItem, rq3<? super Boolean>, Object> {
    final /* synthetic */ DownloadPriorityQueue.PriorityItem $priorityItem;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPriorityQueue$invoke$3(DownloadPriorityQueue.PriorityItem priorityItem, rq3<? super DownloadPriorityQueue$invoke$3> rq3Var) {
        super(2, rq3Var);
        this.$priorityItem = priorityItem;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(this.$priorityItem, rq3Var);
        downloadPriorityQueue$invoke$3.L$0 = obj;
        return downloadPriorityQueue$invoke$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DownloadPriorityQueue.PriorityItem priorityItem, rq3<? super Boolean> rq3Var) {
        return ((DownloadPriorityQueue$invoke$3) create(priorityItem, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label == 0) {
            y6a.M(obj);
            return Boolean.valueOf(((DownloadPriorityQueue.PriorityItem) this.L$0) == this.$priorityItem);
        }
        a70.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
