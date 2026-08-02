package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.izs;
import xsna.jw5;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.ui50;
import xsna.vtk0;
import xsna.wi50;
import xsna.xh50;

/* compiled from: DownloadPriorityQueue.kt */
/* loaded from: classes14.dex */
public final class DownloadPriorityQueue {
    private final ui50 mutex = new wi50(false);
    private final xh50<PriorityItem> nextTurn = vtk0.a(null);
    private final PriorityQueue<PriorityItem> queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t2).getPriority()));
        }
    });
    private final SessionRepository sessionRepository;

    /* compiled from: DownloadPriorityQueue.kt */
    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public DownloadPriorityQueue(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|17)(2:23|24))(8:25|26|27|28|(1:30)|31|(5:34|14|15|16|17)|33))(9:36|37|(2:39|33)|27|28|(0)|31|(0)|33))(1:40))(3:50|(1:52)|33)|41|42|43|(8:45|37|(0)|27|28|(0)|31|(0))|33))|57|6|7|(0)(0)|41|42|43|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004b, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
    
        r11 = new kotlin.Result.Failure(r11);
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(int i, izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super s3q0> spjVar) {
        DownloadPriorityQueue$invoke$1 downloadPriorityQueue$invoke$1;
        CoroutineSingletons coroutineSingletons;
        int i2;
        ui50 ui50Var;
        PriorityItem priorityItem;
        ui50 ui50Var2;
        ui50 ui50Var3;
        izs<? super spj<? super s3q0>, ? extends Object> izsVar2;
        PriorityItem priorityItem2;
        xh50<PriorityItem> xh50Var;
        DownloadPriorityQueue$invoke$3 downloadPriorityQueue$invoke$3;
        ?? r10;
        izs<? super spj<? super s3q0>, ? extends Object> izsVar3;
        try {
            if (spjVar instanceof DownloadPriorityQueue$invoke$1) {
                downloadPriorityQueue$invoke$1 = (DownloadPriorityQueue$invoke$1) spjVar;
                int i3 = downloadPriorityQueue$invoke$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    downloadPriorityQueue$invoke$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = downloadPriorityQueue$invoke$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = downloadPriorityQueue$invoke$1.label;
                    if (i2 != 0) {
                        a.a(obj);
                        PriorityItem priorityItem3 = new PriorityItem(i);
                        ui50Var3 = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = izsVar;
                        downloadPriorityQueue$invoke$1.L$1 = priorityItem3;
                        downloadPriorityQueue$invoke$1.L$2 = ui50Var3;
                        downloadPriorityQueue$invoke$1.label = 1;
                        if (ui50Var3.b(downloadPriorityQueue$invoke$1) != coroutineSingletons) {
                            izsVar2 = izsVar;
                            priorityItem2 = priorityItem3;
                        }
                        return coroutineSingletons;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            PriorityItem priorityItem4 = (PriorityItem) downloadPriorityQueue$invoke$1.L$1;
                            izsVar3 = (izs) downloadPriorityQueue$invoke$1.L$0;
                            a.a(obj);
                            r10 = priorityItem4;
                            downloadPriorityQueue$invoke$1.L$0 = r10;
                            downloadPriorityQueue$invoke$1.L$1 = null;
                            downloadPriorityQueue$invoke$1.label = 3;
                            i = r10;
                            if (izsVar3.invoke(downloadPriorityQueue$invoke$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            Object failure = s3q0.a;
                            ?? r102 = i;
                            if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                            }
                            ui50Var = this.mutex;
                            downloadPriorityQueue$invoke$1.L$0 = r102;
                            downloadPriorityQueue$invoke$1.L$1 = ui50Var;
                            downloadPriorityQueue$invoke$1.label = 4;
                            if (ui50Var.b(downloadPriorityQueue$invoke$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ui50Var2 = (ui50) downloadPriorityQueue$invoke$1.L$1;
                            priorityItem = (PriorityItem) downloadPriorityQueue$invoke$1.L$0;
                            a.a(obj);
                            try {
                                this.queue.remove(priorityItem);
                                this.nextTurn.setValue(this.queue.peek());
                                s3q0 s3q0Var = s3q0.a;
                                ui50Var2.c(null);
                                return s3q0.a;
                            } finally {
                            }
                        }
                        ?? r103 = (PriorityItem) downloadPriorityQueue$invoke$1.L$0;
                        a.a(obj);
                        i = r103;
                        Object failure2 = s3q0.a;
                        ?? r1022 = i;
                        if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                            a.a(failure2);
                        }
                        ui50Var = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = r1022;
                        downloadPriorityQueue$invoke$1.L$1 = ui50Var;
                        downloadPriorityQueue$invoke$1.label = 4;
                        if (ui50Var.b(downloadPriorityQueue$invoke$1) != coroutineSingletons) {
                            priorityItem = r1022;
                            ui50Var2 = ui50Var;
                            this.queue.remove(priorityItem);
                            this.nextTurn.setValue(this.queue.peek());
                            s3q0 s3q0Var2 = s3q0.a;
                            ui50Var2.c(null);
                            return s3q0.a;
                        }
                        return coroutineSingletons;
                    }
                    ui50Var3 = (ui50) downloadPriorityQueue$invoke$1.L$2;
                    priorityItem2 = (PriorityItem) downloadPriorityQueue$invoke$1.L$1;
                    izsVar2 = (izs) downloadPriorityQueue$invoke$1.L$0;
                    a.a(obj);
                    this.queue.offer(priorityItem2);
                    this.nextTurn.setValue(this.queue.peek());
                    s3q0 s3q0Var3 = s3q0.a;
                    ui50Var3.c(null);
                    xh50Var = this.nextTurn;
                    downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(priorityItem2, null);
                    downloadPriorityQueue$invoke$1.L$0 = izsVar2;
                    downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
                    downloadPriorityQueue$invoke$1.L$2 = null;
                    downloadPriorityQueue$invoke$1.label = 2;
                    if (rsr.o(xh50Var, downloadPriorityQueue$invoke$3, downloadPriorityQueue$invoke$1) != coroutineSingletons) {
                        r10 = priorityItem2;
                        izsVar3 = izsVar2;
                        downloadPriorityQueue$invoke$1.L$0 = r10;
                        downloadPriorityQueue$invoke$1.L$1 = null;
                        downloadPriorityQueue$invoke$1.label = 3;
                        i = r10;
                        if (izsVar3.invoke(downloadPriorityQueue$invoke$1) == coroutineSingletons) {
                        }
                        Object failure22 = s3q0.a;
                        ?? r10222 = i;
                        if (!this.sessionRepository.getFeatureFlags().getUseTryCatchInDownloadQueue()) {
                        }
                        ui50Var = this.mutex;
                        downloadPriorityQueue$invoke$1.L$0 = r10222;
                        downloadPriorityQueue$invoke$1.L$1 = ui50Var;
                        downloadPriorityQueue$invoke$1.label = 4;
                        if (ui50Var.b(downloadPriorityQueue$invoke$1) != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            this.queue.offer(priorityItem2);
            this.nextTurn.setValue(this.queue.peek());
            s3q0 s3q0Var32 = s3q0.a;
            ui50Var3.c(null);
            xh50Var = this.nextTurn;
            downloadPriorityQueue$invoke$3 = new DownloadPriorityQueue$invoke$3(priorityItem2, null);
            downloadPriorityQueue$invoke$1.L$0 = izsVar2;
            downloadPriorityQueue$invoke$1.L$1 = priorityItem2;
            downloadPriorityQueue$invoke$1.L$2 = null;
            downloadPriorityQueue$invoke$1.label = 2;
            if (rsr.o(xh50Var, downloadPriorityQueue$invoke$3, downloadPriorityQueue$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } finally {
        }
        downloadPriorityQueue$invoke$1 = new DownloadPriorityQueue$invoke$1(this, spjVar);
        Object obj2 = downloadPriorityQueue$invoke$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = downloadPriorityQueue$invoke$1.label;
        if (i2 != 0) {
        }
    }
}
