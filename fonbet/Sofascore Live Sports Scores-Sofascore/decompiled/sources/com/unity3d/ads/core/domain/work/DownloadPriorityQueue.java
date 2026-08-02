package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.w2g;
import defpackage.y6a;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Lkotlin/Function1;", "Lrq3;", "", "downloadAction", "invoke", "(ILkotlin/jvm/functions/Function1;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lh2d;", "mutex", "Lh2d;", "Lf1d;", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "nextTurn", "Lf1d;", "Ljava/util/PriorityQueue;", "queue", "Ljava/util/PriorityQueue;", "PriorityItem", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DownloadPriorityQueue {

    @NotNull
    private final h2d mutex;

    @NotNull
    private final f1d nextTurn;

    @NotNull
    private final PriorityQueue<PriorityItem> queue;

    @NotNull
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue$PriorityItem;", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "<init>", "(I)V", "getPriority", "()I", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadPriorityQueue(@NotNull SessionRepository sessionRepository) {
        sessionRepository.getClass();
        this.sessionRepository = sessionRepository;
        this.mutex = new j2d();
        this.nextTurn = gdi.a(null);
        this.queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t).getPriority()).compareTo(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t2).getPriority()));
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|17)(2:23|24))(8:25|26|27|28|(1:30)|31|(5:34|14|15|16|17)|33))(9:36|37|(2:39|33)|27|28|(0)|31|(0)|33))(1:40))(3:50|(1:52)|33)|41|42|43|(8:45|37|(0)|27|28|(0)|31|(0))|33))|57|6|7|(0)(0)|41|42|43|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0110, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0049, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c7, code lost:
    
        r12 = defpackage.w2g.b;
        r11 = new defpackage.u2g(r11);
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17, types: [com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(int i, @NotNull Function1<? super rq3<? super Unit>, ? extends Object> function1, @NotNull rq3<? super Unit> rq3Var) {
        DownloadPriorityQueue$invoke$1 downloadPriorityQueue$invoke$1;
        lu3 lu3Var;
        int i2;
        h2d h2dVar;
        PriorityItem priorityItem;
        h2d h2dVar2;
        h2d h2dVar3;
        Function1<? super rq3<? super Unit>, ? extends Object> function12;
        PriorityItem priorityItem2;
        f1d f1dVar;
        DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3;
        ?? r10;
        Function1<? super rq3<? super Unit>, ? extends Object> function13;
        try {
            if (rq3Var instanceof DownloadPriorityQueue$invoke$1) {
                downloadPriorityQueue$invoke$1 = (DownloadPriorityQueue$invoke$1) rq3Var;
                int i3 = downloadPriorityQueue$invoke$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    downloadPriorityQueue$invoke$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = downloadPriorityQueue$invoke$1.result;
                    lu3Var = lu3.a;
                    i2 = downloadPriorityQueue$invoke$1.label;
                    if (i2 != 0) {
                        y6a.M(obj);
                        PriorityItem priorityItem3 = new PriorityItem(i);
                        h2dVar3 = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = function1;
                        downloadPriorityQueue$invoke$1.L$1 = priorityItem3;
                        downloadPriorityQueue$invoke$1.L$2 = h2dVar3;
                        downloadPriorityQueue$invoke$1.label = 1;
                        if (h2dVar3.e(downloadPriorityQueue$invoke$1) != lu3Var) {
                            function12 = function1;
                            priorityItem2 = priorityItem3;
                        }
                        return lu3Var;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            PriorityItem priorityItem4 = (PriorityItem) downloadPriorityQueue$invoke$1.L$1;
                            function13 = (Function1) downloadPriorityQueue$invoke$1.L$0;
                            y6a.M(obj);
                            r10 = priorityItem4;
                            p2g p2gVar = w2g.b;
                            downloadPriorityQueue$invoke$1.L$0 = r10;
                            downloadPriorityQueue$invoke$1.L$1 = null;
                            downloadPriorityQueue$invoke$1.label = 3;
                            i = r10;
                            if (function13.invoke(downloadPriorityQueue$invoke$1) == lu3Var) {
                                return lu3Var;
                            }
                            Object u2gVar = Unit.a;
                            p2g p2gVar2 = w2g.b;
                            ?? r102 = i;
                            if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                            }
                            h2dVar = this.mutex;
                            downloadPriorityQueue$invoke$1.L$0 = r102;
                            downloadPriorityQueue$invoke$1.L$1 = h2dVar;
                            downloadPriorityQueue$invoke$1.label = 4;
                            if (h2dVar.e(downloadPriorityQueue$invoke$1) != lu3Var) {
                            }
                            return lu3Var;
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar2 = (h2d) downloadPriorityQueue$invoke$1.L$1;
                            priorityItem = (PriorityItem) downloadPriorityQueue$invoke$1.L$0;
                            y6a.M(obj);
                            try {
                                this.queue.remove(priorityItem);
                                ((fdi) this.nextTurn).l(this.queue.peek());
                                Unit unit = Unit.a;
                                h2dVar2.f(null);
                                return Unit.a;
                            } finally {
                            }
                        }
                        ?? r103 = (PriorityItem) downloadPriorityQueue$invoke$1.L$0;
                        y6a.M(obj);
                        i = r103;
                        Object u2gVar2 = Unit.a;
                        p2g p2gVar22 = w2g.b;
                        ?? r1022 = i;
                        if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                            y6a.M(u2gVar2);
                        }
                        h2dVar = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = r1022;
                        downloadPriorityQueue$invoke$1.L$1 = h2dVar;
                        downloadPriorityQueue$invoke$1.label = 4;
                        if (h2dVar.e(downloadPriorityQueue$invoke$1) != lu3Var) {
                            priorityItem = r1022;
                            h2dVar2 = h2dVar;
                            this.queue.remove(priorityItem);
                            ((fdi) this.nextTurn).l(this.queue.peek());
                            Unit unit2 = Unit.a;
                            h2dVar2.f(null);
                            return Unit.a;
                        }
                        return lu3Var;
                    }
                    h2dVar3 = (h2d) downloadPriorityQueue$invoke$1.L$2;
                    priorityItem2 = (PriorityItem) downloadPriorityQueue$invoke$1.L$1;
                    function12 = (Function1) downloadPriorityQueue$invoke$1.L$0;
                    y6a.M(obj);
                    this.queue.offer(priorityItem2);
                    ((fdi) this.nextTurn).l(this.queue.peek());
                    Unit unit3 = Unit.a;
                    h2dVar3.f(null);
                    f1dVar = this.nextTurn;
                    downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(priorityItem2, null);
                    downloadPriorityQueue$invoke$1.L$0 = function12;
                    downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
                    downloadPriorityQueue$invoke$1.L$2 = null;
                    downloadPriorityQueue$invoke$1.label = 2;
                    if (rd0.z(f1dVar, downloadPriorityQueue$invoke$3, downloadPriorityQueue$invoke$1) != lu3Var) {
                        r10 = priorityItem2;
                        function13 = function12;
                        p2g p2gVar3 = w2g.b;
                        downloadPriorityQueue$invoke$1.L$0 = r10;
                        downloadPriorityQueue$invoke$1.L$1 = null;
                        downloadPriorityQueue$invoke$1.label = 3;
                        i = r10;
                        if (function13.invoke(downloadPriorityQueue$invoke$1) == lu3Var) {
                        }
                        Object u2gVar22 = Unit.a;
                        p2g p2gVar222 = w2g.b;
                        ?? r10222 = i;
                        if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                        }
                        h2dVar = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = r10222;
                        downloadPriorityQueue$invoke$1.L$1 = h2dVar;
                        downloadPriorityQueue$invoke$1.label = 4;
                        if (h2dVar.e(downloadPriorityQueue$invoke$1) != lu3Var) {
                        }
                    }
                    return lu3Var;
                }
            }
            this.queue.offer(priorityItem2);
            ((fdi) this.nextTurn).l(this.queue.peek());
            Unit unit32 = Unit.a;
            h2dVar3.f(null);
            f1dVar = this.nextTurn;
            downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(priorityItem2, null);
            downloadPriorityQueue$invoke$1.L$0 = function12;
            downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
            downloadPriorityQueue$invoke$1.L$2 = null;
            downloadPriorityQueue$invoke$1.label = 2;
            if (rd0.z(f1dVar, downloadPriorityQueue$invoke$3, downloadPriorityQueue$invoke$1) != lu3Var) {
            }
            return lu3Var;
        } finally {
        }
        downloadPriorityQueue$invoke$1 = new DownloadPriorityQueue$invoke$1(this, rq3Var);
        Object obj2 = downloadPriorityQueue$invoke$1.result;
        lu3Var = lu3.a;
        i2 = downloadPriorityQueue$invoke$1.label;
        if (i2 != 0) {
        }
    }
}
